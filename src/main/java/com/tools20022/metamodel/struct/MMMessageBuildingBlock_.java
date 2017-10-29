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
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.struct.MMMessageConstruct_;
import java.util.Optional;

public interface MMMessageBuildingBlock_ extends MMMessageConstruct_ {

	/**
	 * The simple content model of a MessageBuildingBlock when it is expressed
	 * using a DataType
	 */
	MetamodelAttribute<MMMessageBuildingBlock, Optional<MMDataType>> simpleType = newAttribute();
	/**
	 * the complex content model of a MessageBuildingBlock when it is expressed
	 * using a MessageComponentType
	 */
	MetamodelAttribute<MMMessageBuildingBlock, Optional<MMMessageComponentType>> complexType = newAttribute();
	/**
	 * A MessageBuildingBlock must have exactly one of the following: simpleType
	 * or complexType. complexType-&gt;size() + simpleType-&gt;size() = 1
	 */
	MetamodelConstraint<MMMessageBuildingBlock> checkMessageBuildingBlockHasExactlyOneType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}