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
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;

public interface MMMessageTransportMode_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the maximum duration of time within which a TransportMessage must be
	 * delivered
	 */
	MetamodelAttribute<MMMessageTransportMode, String> boundedCommunicationDelay = newAttribute();
	/**
	 * clocks must maintain a maximum (inclusive) variance from UTC for the
	 * supported MessageTransportMode
	 */
	MetamodelAttribute<MMMessageTransportMode, String> maximumClockVariation = newAttribute();
	/**
	 * the maximum size of a TransportMessage in kilobytes (any positive integer
	 * greater than zero).
	 */
	MetamodelAttribute<MMMessageTransportMode, Integer> maximumMessageSize = newAttribute();
	/**
	 * the MessageDeliveryOrder is relaxed by a rolling window of time in which
	 * the Transport Messages may be delivered out of order whereby for each
	 * TransportMessage delivered it defines the maximum duration of time it may
	 * be out of sequence within
	 */
	MetamodelAttribute<MMMessageTransportMode, String> messageDeliveryWindow = newAttribute();
	/**
	 * the Choreography is relaxed by a rolling window of time in which the
	 * Business Messages may be sent out of order whereby for each Business
	 * Message sent it defines the maximum duration of time it may be out of
	 * sequence with
	 */
	MetamodelAttribute<MMMessageTransportMode, String> messageSendingWindow = newAttribute();
	/**
	 * the degree to which the sending MessagingEndpoint is assured that a
	 * TransportMessage will be delivered
	 */
	MetamodelAttribute<MMMessageTransportMode, MMDeliveryAssurance> deliveryAssurance = newAttribute();
	/**
	 * whether the MessageTransportSystem safely retains a TransportMessage
	 * until it has been received by the destination MessagingEndpoint
	 */
	MetamodelAttribute<MMMessageTransportMode, MMDurability> durability = newAttribute();
	/**
	 * specifies how receiving MessagingEndpoints may be addressed in a
	 * TransportMessage
	 */
	MetamodelAttribute<MMMessageTransportMode, MMMessageCasting> messageCasting = newAttribute();
	/**
	 * indicates to what extent Transport Messages from a sending
	 * MessagingEndpoint arrive in the order in which they were sent at the
	 * receiving MessagingEndpoints
	 */
	MetamodelAttribute<MMMessageTransportMode, MMMessageDeliveryOrder> messageDeliveryOrder = newAttribute();
	/**
	 * the level of validation the MessageTransportSystem has tested the message
	 */
	MetamodelAttribute<MMMessageTransportMode, MMMessageValidationLevel> messageValidationLevel = newAttribute();
	/**
	 * specifies whether the MessageTransportSystem validates the
	 * MessageInstance with respect to SyntaxMessageScheme, Constraints, the
	 * MarketPractices, and the MessageChoreography
	 */
	MetamodelAttribute<MMMessageTransportMode, MMMessageValidationOnOff> messageValidationOnOff = newAttribute();
	/**
	 * specifies how the MessageTransport System acts upon the results of
	 * MessageValidationOnOff
	 */
	MetamodelAttribute<MMMessageTransportMode, MMMessageValidationResults> messageValidationResults = newAttribute();
	/**
	 * indicates whether a receiving MessagingEndpoint blocks the sending and
	 * receipt of other Transport Messages until it sends a response to this
	 * TransportMessage
	 */
	MetamodelAttribute<MMMessageTransportMode, MMReceiverAsynchronicity> receiverAsynchronicity = newAttribute();
	/**
	 * indicates whether a sending MessagingEndpoint blocks after sending a
	 * TransportMessage to the MessageTransportSystem while waiting for a
	 * response from a MessagingEndpoint
	 */
	MetamodelAttribute<MMMessageTransportMode, MMSenderAsynchronicity> senderAsynchronicity = newAttribute();
	/**
	 * specifies the BusinessTransaction for which a set of MessageTransportMode
	 * characteristics apply
	 */
	MetamodelAttribute<MMMessageTransportMode, List<MMBusinessTransaction>> businessTransaction = newAttribute();
}