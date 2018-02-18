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
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A Doclet provides a way of adding categorised documentation to an model
 * entity.
 */
public class MMDoclet implements MMModelEntity {

	/**
	 * The type of doclet. The definition of the doclet type is left open so
	 * that new doclet types can be easily added without the need for a change
	 * to the meta-model.
	 */
	public final static MetamodelAttribute<MMDoclet, Optional<String>> typeAttribute = newAttribute();
	/**
	 * The content for the documentation.
	 */
	public final static MetamodelAttribute<MMDoclet, Optional<String>> contentAttribute = newAttribute();
	protected MMRepositoryConcept container;
	protected String type;
	protected String content;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMDoclet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDoclet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMDoclet.class);
	}

	/**
	 * The type of doclet. The definition of the doclet type is left open so
	 * that new doclet types can be easily added without the need for a change
	 * to the meta-model.
	 */
	public Optional<String> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	/**
	 * The content for the documentation.
	 */
	public Optional<String> getContent() {
		return content == null ? Optional.empty() : Optional.of(content);
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