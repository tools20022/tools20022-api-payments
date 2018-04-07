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

package com.tools20022.metamodel.derived;

import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageBuildingBlock;

import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMMessageBuildingBlock#getXmlMemberType()}
 * 
 * @see MMMessageBuildingBlock#checkMessageBuildingBlockHasExactlyOneType
 */
public class DeriveMMMessageBuildingBlock_xmlMemberType implements Function<MMMessageBuildingBlock<?,?>, MMLogicalType> {

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Override
	public MMLogicalType apply(MMMessageBuildingBlock<?,?> mmBean) {
		if (mmBean.getSimpleType().isPresent())
			return mmBean.getSimpleType().get();
		else if (mmBean.getComplexType().isPresent())
			return mmBean.getComplexType().get();
		else
			throw new RuntimeException(
					"A MessageBuildingBlock must have exactly one of the following: simpleType or complexType.");
	}
}