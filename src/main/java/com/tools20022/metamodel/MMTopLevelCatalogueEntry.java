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

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMRepositoryConcept;
import java.util.function.Supplier;

/**
 * artefact in the BusinessProcessCatalogue that is not owned by another
 * artefact in the Repository
 */
public interface MMTopLevelCatalogueEntry extends MMRepositoryConcept {

	/**
	 * the BusinessProcessCatalogue that contains all ISO 20022
	 * TopLevelCatalogueEntries
	 */
	public final static MetamodelAttribute<MMTopLevelCatalogueEntry, MMBusinessProcessCatalogue> businessProcessCatalogueAttribute = newAttribute();

	public static MetamodelType<MMTopLevelCatalogueEntry> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMTopLevelCatalogueEntry.class);
	}

	/**
	 * the BusinessProcessCatalogue that contains all ISO 20022
	 * TopLevelCatalogueEntries
	 * 
	 * @see MMBusinessProcessCatalogue#getTopLevelCatalogueEntry()
	 */
	@Opposite(bean = MMBusinessProcessCatalogue.class, attribute = "topLevelCatalogueEntry")
	@Container
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue();
}