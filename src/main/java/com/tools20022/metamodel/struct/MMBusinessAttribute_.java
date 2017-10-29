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
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.struct.MMBusinessElement_;
import java.util.Optional;

public interface MMBusinessAttribute_ extends MMBusinessElement_ {

	/**
	 * Expresses that the content model of a BusinessAttribute may be specified
	 * by a type from the XSD type library or a derived datatype.
	 */
	MetamodelAttribute<MMBusinessAttribute, Optional<MMDataType>> simpleType = newAttribute();
	/**
	 * The BusinessComponent that describes the complex content model of the
	 * BusinessAttrribute.
	 */
	MetamodelAttribute<MMBusinessAttribute, Optional<MMBusinessComponent>> complexType = newAttribute();
	/**
	 * A BusinessAttribute must have exactly one of the following: simpleType
	 * and complexType. complexType-&gt;size() + simpleType-&gt;size() = 1
	 */
	MetamodelConstraint<MMBusinessAttribute> checkBusinessAttributeHasExactlyOneType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * Deriving Code Sets may only be used to type MessageAttributes. Therefore,
	 * a BusinessAttribute may not be typed by a Deriving CodeSet.
	 * simpleType.oclIsKindOf(CodeSet) implies
	 * simpleType.oclAsType(CodeSet).trace-&gt;isEmpty()
	 */
	MetamodelConstraint<MMBusinessAttribute> checkNoDerivingCodeSetType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}