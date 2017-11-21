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

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Abstract layer : Abstract meta class for representing the complex type of a
 * BusinessElement, that is : a DataType or a BusinessComponent
 */
public interface MMBusinessElementType extends MMRepositoryType {

	public static MetamodelType<MMBusinessElementType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessElementType.class);
	}
}