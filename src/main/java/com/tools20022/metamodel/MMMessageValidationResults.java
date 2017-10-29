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
/**
 * characteristic from the MessageTransport, specifying the behaviour of the
 * MessageTransportSystem as a result of MessageValidation
 */
public enum MMMessageValidationResults {
	/**
	 * invalid messages cause a rejection TransportMessage to be sent to the
	 * sending MessagingEndpoint, and the invalid MessageInstance is not
	 * delivered to any other MessagingEndpoint. Valid messages are delivered to
	 * their destinations and marked as valid in the TransportMessage
	 */
	REJECT, /**
	 * invalid messages must cause a rejection TransportMessage to be
	 * sent to the sending MessagingEndpoint, and the invalid MessageInstance is
	 * marked as invalid in the TransportMessage and delivered to its
	 * destination MessagingEndpoints. Valid messages are delivered to their
	 * destinations and marked as valid in the TransportMessage
	 */
	REJECT_AND_DELIVER, /**
	 * invalid messages do not cause a rejection
	 * TransportMessage to be sent to the sending MessagingEndpoint. The invalid
	 * MessageInstance is delivered to its destination MessagingEndpoints. Valid
	 * messages are delivered to their destinations and marked as valid in the
	 * TransportMessage
	 */
	DELIVER
}