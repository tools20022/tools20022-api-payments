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
 * characteristic from the MessageTransport, indicating how receiving
 * MessagingEndpoints may be addressed in a TransportMessage
 */
public enum MMMessageCasting {
	/**
	 * TransportMessages are addressed to a single receiving MessagingEndpoint
	 */
	UNICAST, /**
	 * TransportMessages are addressed to nought to many receiving
	 * MessagingEndpoints
	 */
	MULTICAST, /**
	 * TransportMessages are addressed to a single Broadcast List
	 */
	BROADCAST, /**
	 * TransportMessages may be Multicast or Broadcast
	 */
	ANYCAST
}