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
import com.tools20022.metamodel.MMMessageInstance;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.MMTransportMessage;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMTransportMessage_ extends MMModelEntity_ {

	/**
	 * the sending MessagingEndpoint of a TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, MMMessagingEndpoint> sender = newAttribute();
	/**
	 * the MessageInstance that is part of the TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, MMMessageInstance> messageInstance = newAttribute();
	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 */
	MetamodelAttribute<MMTransportMessage, List<MMMessagingEndpoint>> receiver = newAttribute();
	/**
	 * The sender and receiver of a TransportMessage must use the same
	 * MessageTransportSystem receiver-&gt;asBag().transportSystem =
	 * sender.transportSystem-&gt;asBag()
	 */
	MetamodelConstraint<MMTransportMessage> checksameMessageTransportSystem = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}