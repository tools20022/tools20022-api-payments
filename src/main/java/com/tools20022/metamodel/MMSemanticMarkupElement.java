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

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A semantic mark-up element defines a name + value pair for content. E.g. for
 * synonyms, the name will be either "name" or "context" and the value will be
 * the corresponding synonym name or context.
 */
public class MMSemanticMarkupElement implements MMModelEntity {

	/**
	 * Name of the semantic mark-up element.
	 */
	public final static MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> nameAttribute = newAttribute();
	/**
	 * Value of the semantic mark-up element.
	 */
	public final static MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> valueAttribute = newAttribute();
	protected MMSemanticMarkup container;
	protected String name;
	protected String value;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMSemanticMarkup getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkupElement> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkupElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSemanticMarkupElement.class);
	}

	/**
	 * Name of the semantic mark-up element.
	 */
	public Optional<String> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	/**
	 * Value of the semantic mark-up element.
	 */
	public Optional<String> getValue() {
		return value == null ? Optional.empty() : Optional.of(value);
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