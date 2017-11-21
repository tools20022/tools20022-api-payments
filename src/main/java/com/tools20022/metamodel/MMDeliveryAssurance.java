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
 * characteristic from the MessageTransport, specifying the degree to which the
 * sending MessagingEndpoint is assured that a TransportMessage will be
 * delivered
 */
public enum MMDeliveryAssurance {
	/**
	 * the receiving Messaging Endpoint receives the TransportMessage at least
	 * once
	 */
	AT_LEAST_ONCE, /**
	 * the receiving Messaging Endpoint receives the
	 * TransportMessage exactly once
	 */
	EXACTLY_ONCE, /**
	 * the receiving MessagingEndpoint receives the
	 * TransportMessage at most once. There is no assurance a TransportMessage
	 * will be delivered
	 */
	AT_MOST_ONCE
}