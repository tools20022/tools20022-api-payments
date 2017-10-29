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
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.struct.MMModelEntity_;

public interface MMMessageDefinitionIdentifier_ extends MMModelEntity_ {

	/**
	 * part of a MessageDefinitionIdentifier describing the BusinessArea to
	 * which the MessageDefinition using this MessageDefinitionIdentifier
	 * belongs
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> businessArea = newAttribute();
	/**
	 * function and purpose for which a MessageInstance described by a
	 * MessageDefinition can be used
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> messageFunctionality = newAttribute();
	/**
	 * a variation of a messageFunctionality, whereby MessageDefinitions that
	 * are based on this MessageDefinition are compliant to the
	 * MessageDefinition from which this MessageDefinition is derived.
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> flavour = newAttribute();
	/**
	 * identifies the version of the MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> version = newAttribute();
}