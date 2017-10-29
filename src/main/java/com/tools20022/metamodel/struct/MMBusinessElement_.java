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

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.struct.MMBusinessConcept_;
import com.tools20022.metamodel.struct.MMConstruct_;
import java.util.List;

public interface MMBusinessElement_ extends MMConstruct_, MMBusinessConcept_ {

	/**
	 * Specifies whether a BusinessElement can be computed using other
	 * BusinessElements, but that is shown for clarity even though it adds no
	 * semantic information.
	 */
	MetamodelAttribute<MMBusinessElement, Boolean> isDerived = newAttribute();
	/**
	 * All of the MessageElements that derive from one BusinessElement in a
	 * specific BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessElement, List<MMMessageElement>> derivation = newAttribute();
	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	MetamodelAttribute<MMBusinessElement, MMBusinessElementType> businessElementType = newAttribute();
	/**
	 * The business context in which the BusinessElement is used
	 */
	MetamodelAttribute<MMBusinessElement, MMBusinessComponent> elementContext = newAttribute();
}