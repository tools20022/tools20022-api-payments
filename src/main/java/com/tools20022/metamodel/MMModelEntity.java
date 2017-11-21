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

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMModelEntity;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Abstract definition of a model entity. The common meta class which is the
 * generalisation of all Meta Classes.
 */
public interface MMModelEntity extends GeneratedMetamodelBean {

	/**
	 * List of next versions of a ModelEntity that stem from this ModelEntity.
	 * Allows version control management.
	 */
	public final static MetamodelAttribute<MMModelEntity, List<MMModelEntity>> nextVersionsAttribute = newAttribute();
	/**
	 * Previous version of a ModelEntity that this ModelEntity stems from.
	 * Allows version control management.
	 */
	public final static MetamodelAttribute<MMModelEntity, Optional<MMModelEntity>> previousVersionAttribute = newAttribute();
	/**
	 * Uniquely identifies the RepositoryConcept
	 */
	public final static MetamodelAttribute<MMModelEntity, Optional<String>> objectIdentifierAttribute = newAttribute();

	public static MetamodelType<MMModelEntity> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMModelEntity.class);
	}

	/**
	 * List of next versions of a ModelEntity that stem from this ModelEntity.
	 * Allows version control management.
	 * 
	 * @see MMModelEntity#getPreviousVersion()
	 */
	@Opposite(bean = MMModelEntity.class, attribute = "previousVersion")
	public List<MMModelEntity> getNextVersions();

	/**
	 * Previous version of a ModelEntity that this ModelEntity stems from.
	 * Allows version control management.
	 * 
	 * @see MMModelEntity#getNextVersions()
	 */
	@Opposite(bean = MMModelEntity.class, attribute = "nextVersions")
	public Optional<MMModelEntity> getPreviousVersion();

	/**
	 * Uniquely identifies the RepositoryConcept
	 */
	public Optional<String> getObjectIdentifier();
}