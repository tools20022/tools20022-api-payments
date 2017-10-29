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
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.MMRepositoryType_;
import java.util.List;
import java.util.Optional;

public interface MMMessageDefinition_ extends MMRepositoryType_ {

	/**
	 * the MessageSet to which the MessageDefinition belongs
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMMessageSet>> messageSet = newAttribute();
	/**
	 * Name used in an XML schema for the ComplexType that defines the Message
	 * Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlName = newAttribute();
	/**
	 * Name used in an XML schema for the first element under the root element
	 * of a Message Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, Optional<String>> xmlTag = newAttribute();
	/**
	 * The BusinessArea to which this MessageDefinition belongs
	 */
	MetamodelAttribute<MMMessageDefinition, MMBusinessArea> businessArea = newAttribute();
	/**
	 * XORs applied to a selection of the elements of the Message Definition.
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMXor>> xors = newAttribute();
	/**
	 * a property of MessageDefinition that specifies the top level element of
	 * the MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinition, String> rootElement = newAttribute();
	/**
	 * a MessageBuildingBlock belonging to this MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
	/**
	 * the MessageChoreography to which the MessageDefinition belongs
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMMessageChoreography>> choreography = newAttribute();
	/**
	 * all of the MessageTypeTraces from one MessageDefinition that are traced
	 * to different MessageTransmissions
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMMessageTransmission>> trace = newAttribute();
	/**
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinition, MMMessageDefinitionIdentifier> messageDefinitionIdentifier = newAttribute();
	/**
	 * All of the SyntaxMessageSchemes that are derived from from one
	 * MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinition, List<MMSyntaxMessageScheme>> derivation = newAttribute();
	/**
	 * The businessArea of the messageDefinitionIdentifier of this
	 * MessageDefinition is equal to the code of the BusinessArea that contains
	 * this MessageDefinition businessArea.code =
	 * messageDefinitionIdentifier.businessArea
	 */
	MetamodelConstraint<MMMessageDefinition> checkBusinessAreaNameMatch = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}