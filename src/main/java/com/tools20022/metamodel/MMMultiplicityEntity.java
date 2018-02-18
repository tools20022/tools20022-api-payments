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
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;

/**
 * Any model entity where a multiplicity can be defined.
 */
public interface MMMultiplicityEntity extends GeneratedMetamodelBean {

	/**
	 * MaxOccurs is an integer with a value greater than or equal to the lower
	 * limit. If undefined an unlimited upper value is assumed.
	 */
	public final static MetamodelAttribute<MMMultiplicityEntity, Optional<Integer>> maxOccursAttribute = newAttribute();
	/**
	 * MinOccurs is an integer with value greater than or equal to zero. If
	 * undefined a value of zero is assumed.
	 */
	public final static MetamodelAttribute<MMMultiplicityEntity, Optional<Integer>> minOccursAttribute = newAttribute();

	public static MetamodelType<MMMultiplicityEntity> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMultiplicityEntity.class);
	}

	/**
	 * MaxOccurs is an integer with a value greater than or equal to the lower
	 * limit. If undefined an unlimited upper value is assumed.
	 */
	public Optional<Integer> getMaxOccurs();

	/**
	 * MinOccurs is an integer with value greater than or equal to zero. If
	 * undefined a value of zero is assumed.
	 */
	public Optional<Integer> getMinOccurs();
}