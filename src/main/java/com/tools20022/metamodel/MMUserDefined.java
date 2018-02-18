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

import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.derived.DeriveMMUserDefined_isTechnical;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A Type which allows referring to a structure defined outside of the ISO20022
 * MessageDefinition.
 */
public class MMUserDefined implements MMMessageComponentType {

	/**
	 * The URN namespace of the referenced external structure definition. The
	 * allowed values are: ##any, ##other or list. When equal to "list", then
	 * the value of the property "namespaceList" must be filled.
	 */
	public final static MetamodelAttribute<MMUserDefined, MMNamespace> namespaceAttribute = newAttribute();
	/**
	 * A list of URN namespaces.
	 */
	public final static MetamodelAttribute<MMUserDefined, Optional<String>> namespaceListAttribute = newAttribute();
	/**
	 * Indicates the kind of validation which must be performed on the external
	 * structure.
	 */
	public final static MetamodelAttribute<MMUserDefined, MMProcessContent> processContentsAttribute = newAttribute();
	protected MMNamespace namespace;
	protected String namespaceList;
	protected MMProcessContent processContents;
	protected Supplier<List<MMMessageBuildingBlock>> messageBuildingBlock_lazy;
	protected Supplier<MMBusinessComponent> trace_lazy;
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
	public MetamodelType<? extends MMUserDefined> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMUserDefined> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMUserDefined.class);
	}

	/**
	 * The URN namespace of the referenced external structure definition. The
	 * allowed values are: ##any, ##other or list. When equal to "list", then
	 * the value of the property "namespaceList" must be filled.
	 */
	public MMNamespace getNamespace() {
		return namespace;
	}

	/**
	 * A list of URN namespaces.
	 */
	public Optional<String> getNamespaceList() {
		return namespaceList == null ? Optional.empty() : Optional.of(namespaceList);
	}

	/**
	 * Indicates the kind of validation which must be performed on the external
	 * structure.
	 */
	public MMProcessContent getProcessContents() {
		return processContents;
	}

	@Override
	public List<MMMessageBuildingBlock> getMessageBuildingBlock() {
		return messageBuildingBlock_lazy == null ? Collections.emptyList() : messageBuildingBlock_lazy.get();
	}

	@Derived
	@Override
	public boolean isIsTechnical() {
		return (new DeriveMMUserDefined_isTechnical()).apply(this);
	}

	@Override
	public Optional<MMBusinessComponent> getTrace() {
		return trace_lazy == null ? Optional.empty() : Optional.of(trace_lazy.get());
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