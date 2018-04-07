package com.tools20022.core.metamodel;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.ISODoc.Basis;
import com.tools20022.core.metamodel.StaticMemembersBuilder.AttrWrapper;
import com.tools20022.core.metamodel.StaticMemembersBuilder.ConstrWrapper;

public class ReflectionBasedMetamodel implements Metamodel {

	private final LinkedHashMap<String, MMTypeImpl<?>> mmTypesByName = new LinkedHashMap<>();
	private final LinkedHashMap<Class<? extends GeneratedMetamodelBean>, MMTypeImpl<?>> mmTypesByClass = new LinkedHashMap<>();
	private final LinkedHashMap<String, MMEnumImpl<?>> mmEnumsByName = new LinkedHashMap<>();
	private final LinkedHashMap<Class<? extends Enum<?>>, MMEnumImpl<?>> mmEnumsByClass = new LinkedHashMap<>();

	protected ReflectionBasedMetamodel() {
	}

	@Override
	public List<? extends MetamodelType<? extends GeneratedMetamodelBean>> getAllTypes() {
		return new ArrayList<>(mmTypesByName.values());
	}

	@Override
	public List<? extends MMEnumImpl<?>> getAllEnums() {
		return new ArrayList<>(mmEnumsByName.values());
	}

	@Override
	public MMTypeImpl<?> getTypeByName(String name) {
		MMTypeImpl<?> ret = mmTypesByName.get(name);
		if (ret == null)
			throw new NoSuchElementException("No metatype for name " + name);
		return ret;
	}

	private <B extends GeneratedMetamodelBean> MMTypeImpl<B> getTypeImplByClass(Class<B> beanClass) {
		for (Class<?> keyClass = beanClass; keyClass != null; keyClass = keyClass.getSuperclass()) {
			@SuppressWarnings("unchecked")
			MMTypeImpl<B> ret = (MMTypeImpl<B>) mmTypesByClass.get(keyClass);
			if (ret != null)
				return ret;
		}
		throw new NoSuchElementException("No metatype for class " + beanClass);
	}

	@Override
	public <B extends GeneratedMetamodelBean> MetamodelType<B> getTypeByClass(Class<B> beanClass) {
		return getTypeImplByClass(beanClass);
	}

	@Override
	public MetamodelEnum getEnumByName(String name) {
		MMEnumImpl ret = mmEnumsByName.get(name);
		if (ret == null)
			throw new NoSuchElementException("No metaenum for name " + name);
		return ret;
	}

	@Override
	public <E extends Enum<?>> MMEnumImpl<E> getEnumByClass(Class<E> enumClass) {
		MMEnumImpl<?> ret = mmEnumsByClass.get(enumClass);
		if (ret == null)
			throw new NoSuchElementException("No metaenum for class " + enumClass);
		@SuppressWarnings("unchecked")
		MMEnumImpl<E> retCast = (MMEnumImpl<E>) ret;
		return retCast;
	}

	@SafeVarargs
	public final void registerTypesFromClasses(Class<? extends GeneratedMetamodelBean>... beanClasses) {
		try {
			// First phase: register classes
			List<MMTypeImpl<?>> mmTypes = new ArrayList<>();
			for (Class<? extends GeneratedMetamodelBean> beanClass : beanClasses) {
				mmTypes.add(new MMTypeImpl<>(beanClass));
			}
			// Second phase: add inheritance
			for (MMTypeImpl<?> mmType : mmTypes) {
				mmType.initInheritance();
			}
			// Third phase: add attrs
			for (MMTypeImpl<?> mmType : mmTypes) {
				mmType.initMembers();
			}
			// Fourh phase: resolve attr opposites and collect directIncominRefs what used
			// in the next phase
			LinkedHashMap<MMTypeImpl<?>, List<MMAttributeImpl<?, ?>>> directIncominRefs = new LinkedHashMap<>();
			for (MMTypeImpl<?> mmType : mmTypes) {
				for (MMAttributeImpl<?, ?> mmAttr : mmType.attrsByName.values()) {
					Opposite annotOp = mmAttr.getterMethod.getAnnotation(Opposite.class);
					if (annotOp != null) {
						MMTypeImpl<? extends GeneratedMetamodelBean> opType = getTypeImplByClass(annotOp.bean());
						MMAttributeImpl<?, ?> opAttr = opType.attrsByName.get(annotOp.attribute());
						mmAttr.setOpposite((MMAttributeImpl<?, ?>) opAttr);
					}

					MMTypeImpl<?> mmRefType = mmAttr.getReferencedType();
					if (mmRefType != null) {
						directIncominRefs.computeIfAbsent(mmRefType, y -> new ArrayList<>()).add(mmAttr);
					}
				}
			}

			// Fifth phase: calculate incoming refs
			for (MMTypeImpl<?> mmType : mmTypes) {
				Stream<? extends MMTypeImpl<?>> mmSuperTypeStream = mmType.listSuperTypes(true, true);
				mmSuperTypeStream.forEachOrdered(mmST -> {
					List<MMAttributeImpl<?, ?>> directRefs = directIncominRefs.get(mmST);
					if (directRefs != null)
						mmType.incomingAttrs.addAll(directRefs);

				});
			}

			// Sixth phase: bind static Member field imlementations
			for (MMTypeImpl<?> mmType : mmTypes) {
				mmType.initMembersClass();
				;
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SafeVarargs
	public final void registerEnumsFromClasses(Class<? extends Enum<?>>... enumClasses) {
		try {
			for (Class<? extends Enum<?>> enumClass : enumClasses) {
				new MMEnumImpl<>(enumClass);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public <B extends GeneratedMetamodelBean> MetamodelType<B> createTypeFromClass(Class<B> beanClass) {
		try {
			return new MMTypeImpl<>(beanClass);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private abstract class MModelElementImpl implements MetamodelElement {

		MModelElementImpl() {
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + getName();
		}
	}

	protected final static String getMethodSignature(Method m) {
		return m.getName(); // TODO
	}

	private class MMTypeImpl<B extends GeneratedMetamodelBean> extends MModelElementImpl implements MetamodelType<B> {
		private final Class<B> beanClass;
		private final LinkedHashMap<String, MMAttributeImpl<B, ?>> attrsByName = new LinkedHashMap<>();
		private final LinkedHashMap<String, MMConstraintImpl<B>> constraintsByName = new LinkedHashMap<>();
		private final LinkedHashSet<MMTypeImpl<? super B>> directSuperTypes = new LinkedHashSet<>();
		private final LinkedHashSet<MMTypeImpl<? extends B>> directSubTypes = new LinkedHashSet<>();
		private final LinkedHashSet<MMAttributeImpl<?, ?>> incomingAttrs = new LinkedHashSet<>();

		@Override
		public Class<B> getBeanClass() {
			return beanClass;
		}

		@Override
		public B newInstance() {
			if (isAbstract())
				throw new RuntimeException("This is an abstract type");
			try {
				return beanClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		MMTypeImpl(Class<B> beanClass) {
			this.beanClass = beanClass;
			{
				MMTypeImpl<?> prevType = mmTypesByName.putIfAbsent(getName(), this);
				if (prevType != null)
					throw new IllegalStateException("MMtype with name " + getName() + " already added: " + prevType);
				prevType = mmTypesByClass.putIfAbsent(beanClass, this);
				if (prevType != null)
					throw new IllegalStateException(
							"MMtype with bean class " + beanClass + " already added: " + prevType);
			}

			for (Field f : this.beanClass.getDeclaredFields()) {
				f.setAccessible(true);
			}
		}

		private void initInheritance() {
			Stream<Class<?>> superClassStream = beanClass.getSuperclass() == null ? Stream.empty()
					: Stream.of(beanClass.getSuperclass());
			Stream<Class<?>> interfaceStream = Stream.of(beanClass.getInterfaces());
			Stream<Class<?>> filteredClasses = Stream.concat(superClassStream, interfaceStream)
					.filter(c -> GeneratedMetamodelBean.class.isAssignableFrom(c))
					.filter(c -> !c.equals(GeneratedMetamodelBean.class));

			filteredClasses.forEachOrdered(superBean -> {
				@SuppressWarnings("unchecked")
				MMTypeImpl<? super B> superMMType = getTypeImplByClass((Class<B>) superBean);
				directSuperTypes.add(superMMType);
				superMMType.directSubTypes.add(this);
			});
		}

		private void collectMethodsFromSuperTypes(Class<?> baseClass, Map<String, Method> methodsBySignature) {
			List<Class<?>> superTypes = new ArrayList<>();
			if (baseClass.getSuperclass() != null)
				superTypes.add(baseClass.getSuperclass());
			superTypes.addAll(Arrays.asList(baseClass.getInterfaces()));
			for (Class<?> superClass : superTypes) {
				for (Method method : superClass.getDeclaredMethods()) {
					if (Modifier.isPrivate(method.getModifiers()) || Modifier.isStatic(method.getModifiers()))
						continue;
					methodsBySignature.put(getMethodSignature(method), method);
				}
				collectMethodsFromSuperTypes(superClass, methodsBySignature);
			}
		}

		void initMembers() {
			Map<String, Method> methodsBySignature = new HashMap<>();
			collectMethodsFromSuperTypes(beanClass, methodsBySignature);

			for (Method method : beanClass.getDeclaredMethods()) {
				if (Modifier.isPrivate(method.getModifiers()) || Modifier.isStatic(method.getModifiers()))
					continue;
				// Fileter inherited attrs
				if (methodsBySignature.containsKey(getMethodSignature(method)))
					continue;

				String propName = getPropertyName(method);
				if (propName == null)
					continue;

				ParsedType valueType = parseValueType(method.getGenericReturnType());
				if (valueType.baseClass.isEnum()) {
					attrsByName.put(propName, new MMAttributeImpl<>(this, method));
				} else {
					attrsByName.put(propName, new MMAttributeImpl<>(this, method));
				}
			}
		}

		void initMembersClass() throws Exception {
			for (Field f : beanClass.getDeclaredFields()) {
				if (f.isSynthetic() || !Modifier.isStatic(f.getModifiers()) || !Modifier.isFinal(f.getModifiers()))
					continue;
				if (!f.getName().endsWith("Attribute"))
					continue;
				Object wrapper = f.get(null);
				if (wrapper instanceof AttrWrapper) {
					@SuppressWarnings("unchecked")
					AttrWrapper<B, ?> attrWrapper = (AttrWrapper<B, ?>) wrapper;
					MMAttributeImpl<B, ?> mmAttr = attrsByName
							.get(f.getName().substring(0, f.getName().length() - "Attribute".length()));
					attrWrapper.setImpl((MetamodelAttribute<B, ?>) mmAttr);
				} else if (wrapper instanceof ConstrWrapper) {
					// TODO
				} else {
					throw new RuntimeException("Invalid filed value: " + f.toString() + " =" + wrapper);
				}
			}
		}

		@Override
		public boolean isAbstract() {
			return beanClass.isInterface();
		}

		@Override
		public Stream<? extends MMTypeImpl<? super B>> listSuperTypes(boolean includeThis, boolean recursive) {
			Stream<? extends MMTypeImpl<? super B>> superTypeStream;
			if (recursive) {
				superTypeStream = listSuperTypes(false, false).flatMap(c -> c.listSuperTypes(true, true));
			} else {
				superTypeStream = directSuperTypes.stream();
			}

			if (includeThis) {
				superTypeStream = Stream.concat(Stream.of(this), superTypeStream);
			}

			return superTypeStream;
		}

		@Override
		public Stream<? extends MMTypeImpl<? extends B>> listSubTypes(boolean includeThis, boolean recursive) {
			Stream<? extends MMTypeImpl<? extends B>> subTypeStream;
			if (recursive) {
				subTypeStream = listSubTypes(false, false).flatMap(c -> c.listSubTypes(true, true));
			} else {
				subTypeStream = directSubTypes.stream();
			}

			if (includeThis) {
				subTypeStream = Stream.concat(Stream.of(this), subTypeStream);
			}

			return subTypeStream;
		}

		@Override
		public Stream<? extends MetamodelAttribute<B, ?>> listDeclaredAttributes() {
			return attrsByName.values().stream();
		}

		@Override
		public Set<? extends MetamodelAttribute<?, ?>> getIncomingAttributes() {
			return Collections.unmodifiableSet(incomingAttrs);
		}

		@Override
		public Stream<? extends MetamodelConstraint<B>> listDeclaredConstraints() {
			return constraintsByName.values().stream();
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(beanClass);
		}

		@Override
		public String getName() {
			// TODO: Support MetaName annotation
			String name = beanClass.getSimpleName();
			if (name.startsWith("MM"))
				name = name.substring(2);
			return name;
		}

	}

	private static MetamodelDocImpl annotToDoc(AnnotatedElement javaElem) {
		ISODoc docAnnot = javaElem.getAnnotation(ISODoc.class);
		if (docAnnot == null) {
			return new MetamodelDocImpl("", Basis.EMPTY, "");
		} else {
			return new MetamodelDocImpl(docAnnot.value(), docAnnot.basis(), docAnnot.ext());
		}
	}

	private class MMAttributeImpl<B extends GeneratedMetamodelBean, T> extends MModelElementImpl
			implements MetamodelAttribute<B, T> {

		private final MMTypeImpl<B> metaType;
		private final String name;
		private final Method getterMethod;

		final boolean isOptional;
		final boolean isMultiple;
		final boolean isUnique;
		final boolean isContainer;
		final boolean isContainment;
		final Class<?> valueJavaClass;
		final MMEnumImpl<?> enumType;
		final MMTypeImpl<?> referncedType;
		private MMAttributeImpl<?, B> oppositeAttr;

		MMAttributeImpl(MMTypeImpl<B> metaType, Method getterMethod) {
			this.metaType = metaType;
			this.name = getPropertyName(getterMethod);
			this.getterMethod = getterMethod;

			ParsedType pt = parseValueType(getterMethod.getGenericReturnType());
			if (pt.wrapperClass == null) {
				isOptional = false;
				isMultiple = false;
				isUnique = true;
			} else if (Optional.class.isAssignableFrom(pt.wrapperClass)) {
				isOptional = true;
				isMultiple = false;
				isUnique = true;
			} else if (Collection.class.isAssignableFrom(pt.wrapperClass)) {
				isOptional = true;
				isMultiple = true;
				isUnique = true;
			} else {
				throw new RuntimeException("Unsupported wrapper type: " + pt.wrapperClass);
			}

			isContainer = getterMethod.getAnnotation(Container.class) != null;
			isContainment = getterMethod.getAnnotation(Containment.class) != null;

			if (pt.baseClass.isEnum()) {
				@SuppressWarnings("unchecked")
				Class<? extends Enum<?>> enumClass = (Class<? extends Enum<?>>) pt.baseClass;
				enumType = (MMEnumImpl<?>) getEnumByClass(enumClass);
				valueJavaClass = null;
				referncedType = null;
			} else if (GeneratedMetamodelBean.class.isAssignableFrom(pt.baseClass)) {
				@SuppressWarnings("unchecked")
				Class<? extends GeneratedMetamodelBean> refClass = (Class<? extends GeneratedMetamodelBean>) pt.baseClass;
				enumType = null;
				valueJavaClass = null;
				referncedType = getTypeImplByClass(refClass);
			} else {
				enumType = null;
				valueJavaClass = pt.baseClass;
				referncedType = null;
			}
		}

		@Override
		public MMTypeImpl<B> getDeclaringType() {
			return metaType;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Object get(GeneratedMetamodelBean repoObj) {
			try {
				return getterMethod.invoke(repoObj);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public Method getGetterMethod() {
			return getterMethod;
		}

		@Override
		public void set(GeneratedMetamodelBean repoObj, Object value) {
			try {
				Field field = null;
				for (Class<?> declClass = repoObj.getClass(); field == null && declClass != null;) {
					try {
						String fieldName = name + (getReferencedType() != null && !isDerived() ? "_lazy" : "");
						field = declClass.getDeclaredField(fieldName);
					} catch (NoSuchFieldException nsfe) {
						// No problem, continue with superclass
						declClass = declClass.getSuperclass();
					}
				}
				boolean isAccessible = field.isAccessible();
				if (!isAccessible) {
					field.setAccessible(true);
				}
				field.set(repoObj, value);
			} catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(getterMethod);
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + metaType.getName() + "." + getName();
		}

		@Override
		public boolean isDerived() {
			return getterMethod.getAnnotation(Derived.class) != null;
		}

		@Override
		public boolean isOptional() {
			return isOptional;
		}

		@Override
		public boolean isUnique() {
			return isUnique;
		}

		@Override
		public boolean isMultiple() {
			return isMultiple;
		}

		@Override
		public boolean isContainer() {
			return isContainer;
		}

		@Override
		public boolean isContainment() {
			return isContainment;
		}

		@Override
		public Class<?> getValueJavaClass() {
			return valueJavaClass;
		}

		@Override
		public MetamodelEnum<?> getEnumType() {
			return enumType;
		}

		@Override
		public MMTypeImpl<?> getReferencedType() {
			return referncedType;
		}

		@Override
		public MMAttributeImpl<?, B> getOpposite() {
			return oppositeAttr;
		}

		@SuppressWarnings("unchecked")
		private void setOpposite(MMAttributeImpl<?, ?> oppositeAttr) {
			this.oppositeAttr = (MMAttributeImpl<?, B>) oppositeAttr;
		}
	}

	private class MMConstraintImpl<B extends GeneratedMetamodelBean> extends MModelElementImpl
			implements MetamodelConstraint<B> {
		private final MetamodelType<B> metaType;
		private final String name;
		private final Method implMethod;
		private final Consumer<B> checker;

		MMConstraintImpl(MetamodelType<B> metaType, Class<B> beanClass, Method implMethod, Consumer<B> checker) {
			this.metaType = metaType;
			this.implMethod = implMethod;
			this.name = implMethod.getName();
			this.checker = checker;
		}

		@Override
		public MetamodelType getDeclaringType() {
			return metaType;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(implMethod);
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + metaType.getName() + "." + getName();
		}

		@Override
		public Consumer<B> checker() {
			return checker;
		}

	}

	private class MMEnumImpl<E extends Enum<?>> extends MModelElementImpl implements MetamodelEnum<E> {
		final Class<E> enumClass;
		final LinkedHashMap<String, MMEnumLiteralImpl<E>> mmLiteralsByName = new LinkedHashMap<>();

		public MMEnumImpl(Class<E> enumClass) {
			this.enumClass = enumClass;
			MMEnumImpl prevType = mmEnumsByName.putIfAbsent(getName(), this);
			if (prevType != null)
				throw new IllegalStateException("MMEnum with name " + getName() + " already added: " + prevType);
			prevType = mmEnumsByClass.putIfAbsent(enumClass, this);
			if (prevType != null)
				throw new IllegalStateException("MMEnum with bean class " + enumClass + " already added: " + prevType);
			for (E enumValue : enumClass.getEnumConstants()) {
				MMEnumLiteralImpl<E> mmEnumLit = new MMEnumLiteralImpl<E>(enumValue);
				mmLiteralsByName.put(enumValue.name(), mmEnumLit);
			}
		}

		@Override
		public String getName() {
			// TODO: Support MetaName annotation
			String name = enumClass.getSimpleName();
			if (name.startsWith("MM"))
				name = name.substring(2);
			return name;
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(enumClass);
		}

		@Override
		public Stream<? extends MMEnumLiteralImpl<E>> listEnumLiterals() {
			return mmLiteralsByName.values().stream();
		}

		@Override
		public Class<E> getEnumJavaClass() {
			return enumClass;
		}

		@Override
		public MMEnumLiteralImpl<E> getEnumLiteral(String name) {
			return mmLiteralsByName.get(name);
		}

	}

	private class MMEnumLiteralImpl<E extends Enum<?>> extends MModelElementImpl implements MetamodelEnumLiteral<E> {
		private final E enumValue;

		MMEnumLiteralImpl(E enumValue) {
			this.enumValue = enumValue;
		}

		@Override
		public String getName() {
			// TODO: Support MetaName annotation
			return enumValue.name();
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			Field enumValueAsField;
			try {
				enumValueAsField = enumValue.getClass().getField(enumValue.name());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			return annotToDoc(enumValueAsField);
		}

		@Override
		public E getValue() {
			return enumValue;
		}

	}

	private static Set<String> NON_GETTER_METHOD_NAMES = new HashSet<>(
			Arrays.asList("getContainer", "getValidator", "getValueAccessor", "getValueMutator", "getInstanceCreator"));

	/**
	 * @return the property name or <code>null</code> if the method isn't a getter
	 */
	private static String getPropertyName(Method getterMethod) {
		if (!Modifier.isPublic(getterMethod.getModifiers()))
			return null;
		if (Modifier.isStatic(getterMethod.getModifiers()))
			return null;
		if (NON_GETTER_METHOD_NAMES.contains(getterMethod.getName()))
			return null;
		if (getterMethod.getParameterTypes().length > 0)
			return null;
		String propName;
		if (getterMethod.getName().startsWith("get")) {
			propName = getterMethod.getName().substring(3);
		} else if (getterMethod.getName().startsWith("is")) {
			propName = getterMethod.getName().substring(2);
		} else {
			return null;
		}
		propName = propName.substring(0, 1).toLowerCase() + propName.substring(1);
		return propName;
	}

	private static Method getSetterMethod(Method getterMethod) {
		String setterName;
		if (getterMethod.getName().startsWith("get")) {
			setterName = "set" + getterMethod.getName().substring(3);
		} else if (getterMethod.getName().startsWith("is")) {
			setterName = "set" + getterMethod.getName().substring(2);
		} else {
			return null;
		}
		try {
			return getterMethod.getDeclaringClass().getMethod(setterName, new Class[] { getterMethod.getReturnType() });
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}

	private static class ParsedType {
		final Class<?> baseClass;
		final Class<?> wrapperClass;

		public ParsedType(Class<?> baseClass, Class<?> wrapperClass) {
			this.baseClass = baseClass;
			this.wrapperClass = wrapperClass;
		}

	}

	private static ParsedType parseValueType(Type returnType) {
		Class<?> baseClass;
		Class<?> wrapperClass;
		try {
			if (returnType instanceof ParameterizedType) {
				ParameterizedType pt1 = (ParameterizedType) returnType;
				if (pt1.getActualTypeArguments().length != 1)
					throw new RuntimeException("Illegal value type.");

				wrapperClass = (Class<?>) pt1.getRawType();
				Type baseType = pt1.getActualTypeArguments()[0];
				if (baseType instanceof ParameterizedType) {
					ParameterizedType pt2 = (ParameterizedType) baseType;
					baseClass = (Class<?>) pt2.getRawType();
				} else {
					baseClass = (Class<?>) baseType;
				}

			} else {
				wrapperClass = null;
				baseClass = (Class<?>) returnType;
			}
			return new ParsedType(baseClass, wrapperClass);
		} catch (Exception e) {
			throw new RuntimeException( "Can't parse value type: " + returnType, e );
		}
	}
}
