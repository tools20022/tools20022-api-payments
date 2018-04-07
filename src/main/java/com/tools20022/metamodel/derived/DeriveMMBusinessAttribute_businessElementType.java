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

import java.util.function.Function;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessElementType;

/**
 * Calculate derived attribute
 * {@link MMBusinessAttribute#getBusinessElementType()}
 * 
 * @see MMBusinessAttribute#checkBusinessAttributeHasExactlyOneType
 */
public class DeriveMMBusinessAttribute_businessElementType implements Function<MMBusinessAttribute<?,?>, MMBusinessElementType> {

	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	@Override
	public MMBusinessElementType apply(MMBusinessAttribute<?,?> mmBean) {
		if( mmBean.getSimpleType().isPresent()) {
			return mmBean.getSimpleType().get();
		}
			
		else if ( mmBean.getComplexType().isPresent()) 
			return mmBean.getComplexType().get();
		else
			throw new RuntimeException(
					"A BusinessAttribute must have exactly one of the following: simpleType or complexType.");
	}
}