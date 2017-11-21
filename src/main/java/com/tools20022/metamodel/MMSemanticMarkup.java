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
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Enables modelers to markup elements of the Repository with semantic metadata.
 * Each semanticMarkup string is a TupleValue.
 */
public class MMSemanticMarkup implements MMModelEntity {

	/**
	 * The type of semantic mark-up e.g. "synonym".
	 */
	public final static MetamodelAttribute<MMSemanticMarkup, Optional<String>> typeAttribute = newAttribute();
	/**
	 * The elements of semantic markup.
	 */
	public final static MetamodelAttribute<MMSemanticMarkup, List<MMSemanticMarkupElement>> elementsAttribute = newAttribute();
	protected MMRepositoryConcept container;
	protected String type;
	protected Supplier<List<MMSemanticMarkupElement>> elements_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMSemanticMarkup> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSemanticMarkup> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSemanticMarkup.class);
	}

	/**
	 * The type of semantic mark-up e.g. "synonym".
	 */
	public Optional<String> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	/**
	 * The elements of semantic markup.
	 */
	@Containment
	public List<MMSemanticMarkupElement> getElements() {
		return elements_lazy == null ? Collections.emptyList() : elements_lazy.get();
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