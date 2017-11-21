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
 * characteristic from the MessageTransport, indicating the level of validation
 * that is required by the MessageTransportSystem
 */
public enum MMMessageValidationLevel {
	/**
	 * the MessageInstance is not validated
	 */
	NO_VALIDATION, /**
	 * the MessageInstance has its syntax validated.
	 */
	SYNTAX_VALID, /**
	 * the MessageInstance is Syntax Valid plus validated against
	 * the Syntax Message Scheme.
	 */
	SCHEMA_VALID, /**
	 * the MessageInstance is Schema Valid plus validated against
	 * the MessageRules
	 */
	MESSAGE_VALID, /**
	 * the MessageInstance is Message Valid plus validated
	 * against the BusinessRules
	 */
	RULE_VALID, /**
	 * the MessageInstance is Message Valid plus validated against
	 * the Market Practices
	 */
	MARKET_PRACTICE_VALID, /**
	 * the MessageInstance is Message Valid plus
	 * validated against the MessageChoreography
	 */
	BUSINESS_PROCESS_VALID, /**
	 * the MessageInstance is Message Valid plus
	 * validated against all Rules and MarketPractices
	 */
	COMPLETELY_VALID
}