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
 * characteristic from the MessageTransport, indicating whether the
 * MessageTransportSystem safely retains a TransportMessage until it has been
 * received by the destination MessagingEndpoint
 */
public enum MMDurability {
	/**
	 * the TransportMessage is kept available indefinitely until the message is
	 * delivered to the destination MessagingEndpoint. The TransportMessage is
	 * only kept available if it is ready for delivery within the
	 * BoundedCommunicationDelay; otherwise it expires like every other
	 * non-durable message
	 */
	DURABLE, /**
	 * the TransportMessage is kept available until it is delivered to
	 * the receiving MessagingEndpoint or until it is expired because the
	 * BoundedCommunicationDelay is exceeded
	 */
	PERSISTENT, /**
	 * the TransportMessage is not kept available and will not be
	 * delivered if the receiving MessagingEndpoint is not available
	 */
	TRANSIENT
}