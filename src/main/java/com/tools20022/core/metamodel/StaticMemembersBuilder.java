package com.tools20022.core.metamodel;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelElement;
import com.tools20022.core.metamodel.Metamodel.MetamodelEnum;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

public class StaticMemembersBuilder {

	private final static StaticMemembersBuilder builderInstance = new StaticMemembersBuilder();

	private final LinkedHashSet<AttrWrapper<?, ?>> attrs = new LinkedHashSet<>();
	private final LinkedHashSet<ConstrWrapper<?>> constrs = new LinkedHashSet<>();

	public static <B extends GeneratedMetamodelBean, T> MetamodelAttribute<B, T> newAttribute() {
		AttrWrapper<B, T> wrapper = builderInstance.new AttrWrapper<>();
		builderInstance.attrs.add(wrapper);
		return wrapper;
	}

	public static <B extends GeneratedMetamodelBean> MetamodelConstraint<B> newConstraint(Consumer<B> checker ) {
		ConstrWrapper<B> wrapper = builderInstance.new ConstrWrapper<>( checker );
		builderInstance.constrs.add(wrapper);
		return wrapper;
	}

	/*** Wrapper classes ***/
	private abstract class AbstractWrapper<T extends MetamodelElement> {
		private T impl;

		protected T impl() {
			if (impl == null)
				throw new NullPointerException("Not initilized yet!");
			return impl;
		}

		void setImpl(T impl) {
			if (this.impl != null)
				throw new NullPointerException("Already initilized!");
			this.impl = impl;
		}

		public final int hashCode() {
			return impl == null ? super.hashCode() : impl().hashCode();
		}

		public final String toString() {
			return impl == null ? "Uninitialized wrapper" : impl().toString();
		}

		public final boolean equals(Object obj) {
			return impl == null ? super.equals(obj) : impl().equals(obj);
		}

		public final String getName() {
			return impl().getName();
		}

		public final MetamodelDocImpl getDocumentation() {
			return impl().getDocumentation();
		}

	}

	class AttrWrapper<B extends GeneratedMetamodelBean, T>
			extends AbstractWrapper<MetamodelAttribute<B, T>>
			implements MetamodelAttribute<B, T> {

		@SuppressWarnings("unchecked")
		void setImpl(MetamodelAttribute<B, ?> impl) {
			super.setImpl( (MetamodelAttribute<B, T>) impl);
		}

		public MetamodelType<B> getDeclaringType() {
			return impl().getDeclaringType();
		}

		@Override
		public boolean isDerived() {
			return impl().isDerived();
		}
		
		@Override
		public boolean isOptional() {
			return impl().isOptional();
		}
		
		@Override
		public boolean isMultiple() {
			return impl().isMultiple();
		}

		@Override
		public boolean isUnique() {
			return impl().isUnique();
		}

		@Override
		public boolean isContainer() {
			return impl().isContainer();
		}

		@Override
		public boolean isContainment() {
			return impl().isContainment();
		}

		@Override
		public Class<?> getValueJavaClass() {
			return impl().getValueJavaClass();
		}

		@Override
		public MetamodelEnum<?> getEnumType() {
			return impl().getEnumType();
		}

		@Override
		public MetamodelType<?> getReferencedType() {
			return impl().getReferencedType();
		}
		
		@Override
		public MetamodelAttribute<?, ? extends B> getOpposite() {
			return impl().getOpposite();
		}

		@Override
		public Object get(GeneratedMetamodelBean repoObj) {
			return impl().get(repoObj);
		}

		@Override
		public void set(GeneratedMetamodelBean repoObj, Object value) {
			impl().set(repoObj, value);			
		}
		
		@Override
		public Method getGetterMethod() {
			return impl().getGetterMethod();
		}

	}

	class ConstrWrapper<B extends GeneratedMetamodelBean>
			extends AbstractWrapper<MetamodelConstraint<B>>
			implements MetamodelConstraint<B> {

		private final Consumer<B> checker;

		private ConstrWrapper( Consumer<B> checker ) {
			this.checker = checker;
		}
		
		public MetamodelType<B> getDeclaringType() {
			return impl().getDeclaringType();
		}

		public Consumer<B> checker() {
			return impl().checker();
		}

	}

}
