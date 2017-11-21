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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current status of the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmNew
 * OrderStatusCode.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmPartialFill
 * OrderStatusCode.mmPartialFill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmFilled
 * OrderStatusCode.mmFilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmDoneForDay
 * OrderStatusCode.mmDoneForDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCancelled
 * OrderStatusCode.mmCancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmReplaced
 * OrderStatusCode.mmReplaced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmPendingCancel
 * OrderStatusCode.mmPendingCancel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmStopped
 * OrderStatusCode.mmStopped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmRejected
 * OrderStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmSuspended
 * OrderStatusCode.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmPendingNew
 * OrderStatusCode.mmPendingNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCalculated
 * OrderStatusCode.mmCalculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmExpired
 * OrderStatusCode.mmExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmAcceptedForBidding
 * OrderStatusCode.mmAcceptedForBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmPendingReplace
 * OrderStatusCode.mmPendingReplace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCompleted
 * OrderStatusCode.mmCompleted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmAccepted
 * OrderStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmAlreadyExecuted
 * OrderStatusCode.mmAlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmSentToNextParty
 * OrderStatusCode.mmSentToNextParty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmReceived
 * OrderStatusCode.mmReceived}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmSettled
 * OrderStatusCode.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCommunicationProblemNextParty
 * OrderStatusCode.mmCommunicationProblemNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmConfirmationAmendment
 * OrderStatusCode.mmConfirmationAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmPartiallyDone
 * OrderStatusCode.mmPartiallyDone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmOpen
 * OrderStatusCode.mmOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmInvalidAgentConfirmation
 * OrderStatusCode.mmInvalidAgentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCashSettledOrderNotExecuted
 * OrderStatusCode.mmCashSettledOrderNotExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmExecuting
 * OrderStatusCode.mmExecuting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmCancelling
 * OrderStatusCode.mmCancelling}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatusCode#mmAlert
 * OrderStatusCode.mmAlert}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMCode mmNew = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPartialFill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmFilled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmDoneForDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmReplaced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPendingCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmStopped = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSuspended = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPendingNew = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCalculated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmExpired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAcceptedForBidding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPendingReplace = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCompleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAlreadyExecuted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSentToNextParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmCommunicationProblemNextParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmConfirmationAmendment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmPartiallyDone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmInvalidAgentConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmCashSettledOrderNotExecuted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmExecuting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmCancelling = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAlert = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alert";
			definition = "Used whenever any of the individual orders have a status that requires something to be done. For instance, an alert would be used when a buy-side firm has submitted a list that has individual stock reject that have not been addressed.";
			owner_lazy = () -> OrderStatusCode.mmObject();
			codeName = "ALER";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NEWW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatusCode";
				definition = "Specifies the current status of the order.";
				code_lazy = () -> Arrays.asList(OrderStatusCode.mmNew, OrderStatusCode.mmPartialFill, OrderStatusCode.mmFilled, OrderStatusCode.mmDoneForDay, OrderStatusCode.mmCancelled, OrderStatusCode.mmReplaced,
						OrderStatusCode.mmPendingCancel, OrderStatusCode.mmStopped, OrderStatusCode.mmRejected, OrderStatusCode.mmSuspended, OrderStatusCode.mmPendingNew, OrderStatusCode.mmCalculated, OrderStatusCode.mmExpired,
						OrderStatusCode.mmAcceptedForBidding, OrderStatusCode.mmPendingReplace, OrderStatusCode.mmCompleted, OrderStatusCode.mmAccepted, OrderStatusCode.mmAlreadyExecuted, OrderStatusCode.mmSentToNextParty,
						OrderStatusCode.mmReceived, OrderStatusCode.mmSettled, OrderStatusCode.mmCommunicationProblemNextParty, OrderStatusCode.mmConfirmationAmendment, OrderStatusCode.mmPartiallyDone, OrderStatusCode.mmOpen,
						OrderStatusCode.mmInvalidAgentConfirmation, OrderStatusCode.mmCashSettledOrderNotExecuted, OrderStatusCode.mmExecuting, OrderStatusCode.mmCancelling, OrderStatusCode.mmAlert);
			}
		});
		return mmObject_lazy.get();
	}
}