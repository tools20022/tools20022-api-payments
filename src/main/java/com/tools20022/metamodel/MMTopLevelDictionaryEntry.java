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
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepositoryConcept;
import java.util.function.Supplier;

/**
 * artefact in the Dictionary that is not owned by another artefact in the
 * Repository
 */
public interface MMTopLevelDictionaryEntry extends MMRepositoryConcept {

	/**
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 */
	public final static MetamodelAttribute<MMTopLevelDictionaryEntry, MMDataDictionary> dataDictionaryAttribute = newAttribute();

	public static MetamodelType<MMTopLevelDictionaryEntry> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMTopLevelDictionaryEntry.class);
	}

	/**
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 * 
	 * @see MMDataDictionary#getTopLevelDictionaryEntry()
	 */
	@Opposite(bean = MMDataDictionary.class, attribute = "topLevelDictionaryEntry")
	@Container
	public MMDataDictionary getDataDictionary();
}