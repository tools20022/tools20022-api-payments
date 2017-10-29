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
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.struct.MMDataType_;
import java.util.Optional;

public interface MMDecimal_ extends MMDataType_ {

	/**
	 * the lowest value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> minInclusive = newAttribute();
	/**
	 * the lowest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> minExclusive = newAttribute();
	/**
	 * the highest value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> maxInclusive = newAttribute();
	/**
	 * the highest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> maxExclusive = newAttribute();
	/**
	 * the maximum number of allowed digits in a Decimal number
	 */
	MetamodelAttribute<MMDecimal, Optional<Integer>> totalDigits = newAttribute();
	/**
	 * the fractional part of a Decimal number
	 */
	MetamodelAttribute<MMDecimal, Optional<Integer>> fractionDigits = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> pattern = newAttribute();
}