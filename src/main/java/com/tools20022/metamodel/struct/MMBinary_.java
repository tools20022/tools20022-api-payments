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
import com.tools20022.metamodel.MMBinary;
import com.tools20022.metamodel.struct.MMDataType_;
import java.util.Optional;

public interface MMBinary_ extends MMDataType_ {

	/**
	 * the minimum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> minLength = newAttribute();
	/**
	 * the maximum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> maxLength = newAttribute();
	/**
	 * the number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> length = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMBinary, Optional<String>> pattern = newAttribute();
}