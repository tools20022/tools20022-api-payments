/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Set of Codes grouped together to characterize all the values of an attribute.
 */
public class MMCodeSet extends MMString {

	/**
	 * The CodeSet that this CodesSet is derived from.
	 */
	public final static MetamodelAttribute<MMCodeSet, Optional<MMCodeSet>> traceAttribute = newAttribute();
	/**
	 * The CodeSets which are derived from this CodeSet.
	 */
	public final static MetamodelAttribute<MMCodeSet, List<MMCodeSet>> derivationAttribute = newAttribute();
	/**
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier
	 * (URI).
	 */
	public final static MetamodelAttribute<MMCodeSet, Optional<String>> identificationSchemeAttribute = newAttribute();
	/**
	 * A set of Codes belonging to the same CodeSet
	 */
	public final static MetamodelAttribute<MMCodeSet, List<MMCode>> codeAttribute = newAttribute();
	protected Supplier<MMCodeSet> trace_lazy;
	protected Supplier<List<MMCodeSet>> derivation_lazy;
	protected String identificationScheme;
	protected Supplier<List<MMCode>> code_lazy;
	protected Integer minLength;
	protected Integer maxLength;
	protected Integer length;
	protected String pattern;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkup_lazy;
	protected Supplier<List<MMDoclet>> doclet_lazy;
	protected List<String> example;
	protected Supplier<List<MMConstraint>> constraint_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMDataDictionary getContainer() {
		return getDataDictionary();
	}

	@Override
	public MetamodelType<? extends MMCodeSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMCodeSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMCodeSet.class);
	}

	/**
	 * The CodeSet that this CodesSet is derived from.
	 * 
	 * @see MMCodeSet#getDerivation()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "derivation")
	public Optional<MMCodeSet> getTrace() {
		return trace_lazy == null ? Optional.empty() : Optional.of(trace_lazy.get());
	}

	/**
	 * The CodeSets which are derived from this CodeSet.
	 * 
	 * @see MMCodeSet#getTrace()
	 */
	@Opposite(bean = MMCodeSet.class, attribute = "trace")
	public List<MMCodeSet> getDerivation() {
		return derivation_lazy == null ? Collections.emptyList() : derivation_lazy.get();
	}

	/**
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier
	 * (URI).
	 */
	public Optional<String> getIdentificationScheme() {
		return identificationScheme == null ? Optional.empty() : Optional.of(identificationScheme);
	}

	/**
	 * A set of Codes belonging to the same CodeSet
	 * 
	 * @see MMCode#getOwner()
	 */
	@Opposite(bean = MMCode.class, attribute = "owner")
	@Containment
	public List<MMCode> getCode() {
		return code_lazy == null ? Collections.emptyList() : code_lazy.get();
	}

	@Override
	public Optional<Integer> getMinLength() {
		return minLength == null ? Optional.empty() : Optional.of(minLength);
	}

	@Override
	public Optional<Integer> getMaxLength() {
		return maxLength == null ? Optional.empty() : Optional.of(maxLength);
	}

	@Override
	public Optional<Integer> getLength() {
		return length == null ? Optional.empty() : Optional.of(length);
	}

	@Override
	public Optional<String> getPattern() {
		return pattern == null ? Optional.empty() : Optional.of(pattern);
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup_lazy == null ? Collections.emptyList() : semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList() : constraint_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}