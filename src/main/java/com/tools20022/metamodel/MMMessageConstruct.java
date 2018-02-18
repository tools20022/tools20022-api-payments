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

import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMLogicalType;
import java.util.function.Supplier;
import java.util.Optional;

/**
 * Abstract layer : Abstract meta class for representing a MessageElement or a
 * MessageBuildingBlock
 */
public interface MMMessageConstruct extends MMConstruct {

	/**
	 * XML schema tag name for the element.
	 */
	public final static MetamodelAttribute<MMMessageConstruct, Optional<String>> xmlTagAttribute = newAttribute();
	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	public final static MetamodelAttribute<MMMessageConstruct, MMLogicalType> xmlMemberTypeAttribute = newAttribute();

	public static MetamodelType<MMMessageConstruct> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageConstruct.class);
	}

	/**
	 * XML schema tag name for the element.
	 */
	public Optional<String> getXmlTag();

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Derived
	public MMLogicalType getXmlMemberType();
}