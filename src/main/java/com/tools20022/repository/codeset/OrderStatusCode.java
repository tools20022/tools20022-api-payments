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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current status of the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#New
 * OrderStatusCode.New}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#PartialFill
 * OrderStatusCode.PartialFill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Filled
 * OrderStatusCode.Filled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#DoneForDay
 * OrderStatusCode.DoneForDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Cancelled
 * OrderStatusCode.Cancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Replaced
 * OrderStatusCode.Replaced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#PendingCancel
 * OrderStatusCode.PendingCancel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Stopped
 * OrderStatusCode.Stopped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Rejected
 * OrderStatusCode.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Suspended
 * OrderStatusCode.Suspended}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#PendingNew
 * OrderStatusCode.PendingNew}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Calculated
 * OrderStatusCode.Calculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Expired
 * OrderStatusCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#AcceptedForBidding
 * OrderStatusCode.AcceptedForBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#PendingReplace
 * OrderStatusCode.PendingReplace}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Completed
 * OrderStatusCode.Completed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Accepted
 * OrderStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#AlreadyExecuted
 * OrderStatusCode.AlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#SentToNextParty
 * OrderStatusCode.SentToNextParty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Received
 * OrderStatusCode.Received}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Settled
 * OrderStatusCode.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#CommunicationProblemNextParty
 * OrderStatusCode.CommunicationProblemNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#ConfirmationAmendment
 * OrderStatusCode.ConfirmationAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#PartiallyDone
 * OrderStatusCode.PartiallyDone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Open
 * OrderStatusCode.Open}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#InvalidAgentConfirmation
 * OrderStatusCode.InvalidAgentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#CashSettledOrderNotExecuted
 * OrderStatusCode.CashSettledOrderNotExecuted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Executing
 * OrderStatusCode.Executing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Cancelling
 * OrderStatusCode.Cancelling}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#Alert
 * OrderStatusCode.Alert}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NEWW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current status of the order."</li>
 * </ul>
 */
public class OrderStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Outstanding order with no executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outstanding order with no executions."</li>
	 * </ul>
	 */
	public static final MMCode New = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "New";
			definition = "Outstanding order with no executions.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "NEWW";
		}
	};
	/**
	 * Outstanding order with executions and remaining quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outstanding order with executions and remaining quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartialFill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialFill";
			definition = "Outstanding order with executions and remaining quantity.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "PARF";
		}
	};
	/**
	 * Order completely filled, no remaining quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FILL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Filled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order completely filled, no remaining quantity."</li>
	 * </ul>
	 */
	public static final MMCode Filled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Filled";
			definition = "Order completely filled, no remaining quantity.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "FILL";
		}
	};
	/**
	 * Order has been partially filled, and is done for the day, ie, no further
	 * executions will take place today.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneForDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been partially filled, and is done for the day, ie, no further executions will take place today."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DoneForDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DoneForDay";
			definition = "Order has been partially filled, and is done for the day, ie, no further executions will take place today.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "DONE";
		}
	};
	/**
	 * Cancelled order with or without executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancelled order with or without executions."</li>
	 * </ul>
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Cancelled order with or without executions.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Order has been replaced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replaced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order has been replaced."</li>
	 * </ul>
	 */
	public static final MMCode Replaced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Replaced";
			definition = "Order has been replaced.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Order with an Order Cancel Request pending, used to confirm receipt of an
	 * Order Cancel Request. Does not indicate that the order has been
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order with an Order Cancel Request pending, used to confirm receipt of an Order Cancel Request.  Does not indicate that the order has been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCancel";
			definition = "Order with an Order Cancel Request pending, used to confirm receipt of an Order Cancel Request.  Does not indicate that the order has been cancelled.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Order has been stopped at the exchange. Used when guaranteeing or
	 * protecting a price and quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stopped"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been stopped at the exchange. Used when guaranteeing or protecting a price and quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Stopped = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Stopped";
			definition = "Order has been stopped at the exchange. Used when guaranteeing or protecting a price and quantity.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "STOP";
		}
	};
	/**
	 * Order has been rejected by sell-side. NOTE: An order can be rejected
	 * subsequent to order acknowledgment, i.e. an order can pass from New to
	 * Rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been rejected by sell-side.  NOTE:  An order can be rejected subsequent to order acknowledgment, i.e. an order can pass from New to Rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Order has been rejected by sell-side.  NOTE:  An order can be rejected subsequent to order acknowledgment, i.e. an order can pass from New to Rejected status.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Order has been placed in suspended state at the request of the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been placed in suspended state at the request of the client."</li>
	 * </ul>
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "Order has been placed in suspended state at the request of the client.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Order has been received by sell-side system but not yet accepted for
	 * execution. An execution message with this status will only be sent in
	 * response to a Status Request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNew"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been received by sell-side system but not yet accepted for execution.  An execution message with this status will only be sent in response to a Status Request message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingNew = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingNew";
			definition = "Order has been received by sell-side system but not yet accepted for execution.  An execution message with this status will only be sent in response to a Status Request message.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "PENN";
		}
	};
	/**
	 * Order has been completed for the day (either filled or done for day).
	 * Commission or currency settlement details have been calculated and
	 * reported in this execution message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been completed for the day (either filled or done for day).  Commission or currency settlement details have been calculated and reported in this execution message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Calculated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Calculated";
			definition = "Order has been completed for the day (either filled or done for day).  Commission or currency settlement details have been calculated and reported in this execution message.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CALC";
		}
	};
	/**
	 * Order has been cancelled in the broker's system due to time in force
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been cancelled in the broker's system due to time in force instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "Order has been cancelled in the broker's system due to time in force instructions.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Order has been received and is being evaluated for pricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACBI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForBidding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been received and is being evaluated for pricing."</li>
	 * </ul>
	 */
	public static final MMCode AcceptedForBidding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedForBidding";
			definition = "Order has been received and is being evaluated for pricing.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "ACBI";
		}
	};
	/**
	 * Order with an Order Cancel/Replace Request pending, used to confirm
	 * receipt of an Order Cancel/Replace Request. Does not indicate that the
	 * order has been replaced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReplace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order with an Order Cancel/Replace Request pending, used to confirm receipt of an Order Cancel/Replace Request. Does not indicate that the order has been replaced."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingReplace = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingReplace";
			definition = "Order with an Order Cancel/Replace Request pending, used to confirm receipt of an Order Cancel/Replace Request. Does not indicate that the order has been replaced.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Request for cancellation instruction for the order has been accepted and
	 * processed; the order has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request for cancellation instruction for the order has been accepted and processed; the order has been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Completed";
			definition = "Request for cancellation instruction for the order has been accepted and processed; the order has been cancelled.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Order is accepted and is ready for execution (execution is the moment
	 * when pricing is applied).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted and is ready for execution (execution is the moment when pricing is applied)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Order is accepted and is ready for execution (execution is the moment when pricing is applied).";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order is already executed and confirmation has been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is already executed and confirmation has been sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AlreadyExecuted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Order is already executed and confirmation has been sent.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Order has been sent to the next party, eg, the next intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been sent to the next party, eg, the next intermediary."</li>
	 * </ul>
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SentToNextParty";
			definition = "Order has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Order has been received, ie, technical validation of the message is ok,
	 * and the message is now at the receiving side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Order is settled. The cash is credited or debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is settled. The cash is credited or debited."</li>
	 * </ul>
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Order is settled. The cash is credited or debited.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Communication problems with the next party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationProblemNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication problems with the next party."</li>
	 * </ul>
	 */
	public static final MMCode CommunicationProblemNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationProblemNextParty";
			definition = "Communication problems with the next party.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CPNP";
		}
	};
	/**
	 * Order confirmation cancellation has been sent and will be followed by a
	 * confirmation amendment, or a confirmation amendment has been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order confirmation cancellation has been sent and will be followed by a confirmation amendment, or a confirmation amendment has been sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConfirmationAmendment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationAmendment";
			definition = "Order confirmation cancellation has been sent and will be followed by a confirmation amendment, or a confirmation amendment has been sent.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CNFC";
		}
	};
	/**
	 * Order has been partially filled and will not be filled further.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyDone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been partially filled and will not be filled further."</li>
	 * </ul>
	 */
	public static final MMCode PartiallyDone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyDone";
			definition = "Order has been partially filled and will not be filled further.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "DONF";
		}
	};
	/**
	 * Order is open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is open."</li>
	 * </ul>
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			definition = "Order is open.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "OPOD";
		}
	};
	/**
	 * Order confirmation received from agent is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IACO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgentConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order confirmation received from agent is invalid."</li>
	 * </ul>
	 */
	public static final MMCode InvalidAgentConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgentConfirmation";
			definition = "Order confirmation received from agent is invalid.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "IACO";
		}
	};
	/**
	 * Order is accepted and is ready for execution (execution is the moment
	 * when pricing is applied). Cash is settled, but the order is not executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettledOrderNotExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted and is ready for execution (execution is the moment when pricing is applied). Cash is settled, but the order is not executed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashSettledOrderNotExecuted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettledOrderNotExecuted";
			definition = "Order is accepted and is ready for execution (execution is the moment when pricing is applied). Cash is settled, but the order is not executed.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CSNE";
		}
	};
	/**
	 * Indicates that a list has been received and the sell side is working it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Executing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a list has been received and the sell side is working it."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Executing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Executing";
			definition = "Indicates that a list has been received and the sell side is working it.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Indicates that a cancellation request has been received and the sell side
	 * is in the process of pulling any orders that were being worked. The
	 * status of individual order can be found out from the detail repeating
	 * group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a cancellation request has been received and the sell side is in the process of pulling any orders that were being worked. The status of individual order can be found out from the detail repeating group."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Cancelling = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelling";
			definition = "Indicates that a cancellation request has been received and the sell side is in the process of pulling any orders that were being worked. The status of individual order can be found out from the detail repeating group.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "CACE";
		}
	};
	/**
	 * Used whenever any of the individual orders have a status that requires
	 * something to be done. For instance, an alert would be used when a
	 * buy-side firm has submitted a list that has individual stock reject that
	 * have not been addressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used whenever any of the individual orders have a status that requires something to be done. For instance, an alert would be used when a buy-side firm has submitted a list that has individual stock reject that have not been addressed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Alert = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alert";
			definition = "Used whenever any of the individual orders have a status that requires something to be done. For instance, an alert would be used when a buy-side firm has submitted a list that has individual stock reject that have not been addressed.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "ALER";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NEWW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderStatusCode";
				definition = "Specifies the current status of the order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderStatusCode.New, com.tools20022.repository.codeset.OrderStatusCode.PartialFill, com.tools20022.repository.codeset.OrderStatusCode.Filled,
						com.tools20022.repository.codeset.OrderStatusCode.DoneForDay, com.tools20022.repository.codeset.OrderStatusCode.Cancelled, com.tools20022.repository.codeset.OrderStatusCode.Replaced,
						com.tools20022.repository.codeset.OrderStatusCode.PendingCancel, com.tools20022.repository.codeset.OrderStatusCode.Stopped, com.tools20022.repository.codeset.OrderStatusCode.Rejected,
						com.tools20022.repository.codeset.OrderStatusCode.Suspended, com.tools20022.repository.codeset.OrderStatusCode.PendingNew, com.tools20022.repository.codeset.OrderStatusCode.Calculated,
						com.tools20022.repository.codeset.OrderStatusCode.Expired, com.tools20022.repository.codeset.OrderStatusCode.AcceptedForBidding, com.tools20022.repository.codeset.OrderStatusCode.PendingReplace,
						com.tools20022.repository.codeset.OrderStatusCode.Completed, com.tools20022.repository.codeset.OrderStatusCode.Accepted, com.tools20022.repository.codeset.OrderStatusCode.AlreadyExecuted,
						com.tools20022.repository.codeset.OrderStatusCode.SentToNextParty, com.tools20022.repository.codeset.OrderStatusCode.Received, com.tools20022.repository.codeset.OrderStatusCode.Settled,
						com.tools20022.repository.codeset.OrderStatusCode.CommunicationProblemNextParty, com.tools20022.repository.codeset.OrderStatusCode.ConfirmationAmendment,
						com.tools20022.repository.codeset.OrderStatusCode.PartiallyDone, com.tools20022.repository.codeset.OrderStatusCode.Open, com.tools20022.repository.codeset.OrderStatusCode.InvalidAgentConfirmation,
						com.tools20022.repository.codeset.OrderStatusCode.CashSettledOrderNotExecuted, com.tools20022.repository.codeset.OrderStatusCode.Executing, com.tools20022.repository.codeset.OrderStatusCode.Cancelling,
						com.tools20022.repository.codeset.OrderStatusCode.Alert);
			}
		});
		return mmObject_lazy.get();
	}
}