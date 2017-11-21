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
 * Specifies the status of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancellation1
 * InstructionProcessingStatusCode.mmCancellation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancellation2
 * InstructionProcessingStatusCode.mmCancellation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancellation3
 * InstructionProcessingStatusCode.mmCancellation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancelled
 * InstructionProcessingStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancelledByAnotherParty
 * InstructionProcessingStatusCode.mmCancelledByAnotherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmPendingCancellation
 * InstructionProcessingStatusCode.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmGenerated
 * InstructionProcessingStatusCode.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmFullyExecutedConfirmationSent
 * InstructionProcessingStatusCode.mmFullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmCancellationRequested
 * InstructionProcessingStatusCode.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmDefaultAction
 * InstructionProcessingStatusCode.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmDone
 * InstructionProcessingStatusCode.mmDone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmPartiallyFilledOrder
 * InstructionProcessingStatusCode.mmPartiallyFilledOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmReceivedAtStockExchange
 * InstructionProcessingStatusCode.mmReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmFullyExecutedExecutionSent
 * InstructionProcessingStatusCode.mmFullyExecutedExecutionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmForcedRejection
 * InstructionProcessingStatusCode.mmForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmFuture
 * InstructionProcessingStatusCode.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmReceivedAtIntermediary
 * InstructionProcessingStatusCode.mmReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmNoInstruction
 * InstructionProcessingStatusCode.mmNoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmAlreadyMatchedAndAffirmed
 * InstructionProcessingStatusCode.mmAlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmOpenOrder
 * InstructionProcessingStatusCode.mmOpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmOverAllocated
 * InstructionProcessingStatusCode.mmOverAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmAcknowledgedAccepted
 * InstructionProcessingStatusCode.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmPartialFill
 * InstructionProcessingStatusCode.mmPartialFill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmPartialCancel
 * InstructionProcessingStatusCode.mmPartialCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmPendingProcessing
 * InstructionProcessingStatusCode.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmRejected
 * InstructionProcessingStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmInRepair
 * InstructionProcessingStatusCode.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmSettlementInstructionSent
 * InstructionProcessingStatusCode.mmSettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmStandingInstruction
 * InstructionProcessingStatusCode.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmTradingSuspendedByStockExchange
 * InstructionProcessingStatusCode.mmTradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmTreated
 * InstructionProcessingStatusCode.mmTreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmUnderAllocated
 * InstructionProcessingStatusCode.mmUnderAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmModificationRequested
 * InstructionProcessingStatusCode.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmAcknowledgedAcceptedByAccountOwner
 * InstructionProcessingStatusCode.mmAcknowledgedAcceptedByAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#mmRejectedByAccountOwner
 * InstructionProcessingStatusCode.mmRejectedByAccountOwner}</li>
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
 * <li>"CAN1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an instruction."</li>
 * </ul>
 */
public class InstructionProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pending cancellation; only one side has been input and a cancellation
	 * request has been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAN1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pending cancellation; only one side has been input and a cancellation request has been sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellation1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation1";
			definition = "Pending cancellation; only one side has been input and a cancellation request has been sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN1";
		}
	};
	/**
	 * Pending cancellation; both sides have been input, the trade has not yet
	 * been matched, and one side has sent a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAN2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pending cancellation; both sides have been input, the trade has not yet been matched, and one side has sent a cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellation2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2";
			definition = "Pending cancellation; both sides have been input, the trade has not yet been matched, and one side has sent a cancellation request.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN2";
		}
	};
	/**
	 * Pending cancellation; both sides have been input, the trade is matched,
	 * and one side has sent a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAN3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pending cancellation; both sides have been input, the trade is matched, and one side has sent a cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellation3 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3";
			definition = "Pending cancellation; both sides have been input, the trade is matched, and one side has sent a cancellation request.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN3";
		}
	};
	/**
	 * Instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Instruction has been cancelled by another party than the instructing
	 * party, for example, market infrastructure such as a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAnotherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByAnotherParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			definition = "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Cancellation request from yourself for this instruction is pending
	 * waiting for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from yourself for this instruction is pending waiting for further processing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request from yourself for this instruction is pending waiting for further processing.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Account servicer or third party created the transaction. It was not
	 * instructed directly by the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer or third party created the transaction. It was not instructed directly by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGenerated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Account servicer or third party created the transaction. It was not instructed directly by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CGEN";
		}
	};
	/**
	 * Order is fully executed and the confirmation was sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyExecutedConfirmationSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is fully executed and the confirmation was sent."</li>
	 * </ul>
	 */
	public static final MMCode mmFullyExecutedConfirmationSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedConfirmationSent";
			definition = "Order is fully executed and the confirmation was sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Cancellation request from the counterparty is awaiting for your
	 * cancellation request or your concent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from the counterparty is awaiting for your cancellation request or your concent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from the counterparty is awaiting for your cancellation request or your concent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CPRC";
		}
	};
	/**
	 * Default action is taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default action is taken."</li>
	 * </ul>
	 */
	public static final MMCode mmDefaultAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DFLA";
		}
	};
	/**
	 * Order is partially filled and no further executions forthcoming for the
	 * trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Done"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is partially filled and no further executions forthcoming for the trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Done";
			definition = "Order is partially filled and no further executions forthcoming for the trading day.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DONE";
		}
	};
	/**
	 * Order is partially filled and no further executions will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyFilledOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is partially filled and no further executions will take place."</li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyFilledOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilledOrder";
			definition = "Order is partially filled and no further executions will take place.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DONF";
		}
	};
	/**
	 * Order has been received at the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order has been received at the stock exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivedAtStockExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Order has been received at the stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Order was fully executed and the execution sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyExecutedExecutionSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order was fully executed and the execution sent."</li>
	 * </ul>
	 */
	public static final MMCode mmFullyExecutedExecutionSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedExecutionSent";
			definition = "Order was fully executed and the execution sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "EXSE";
		}
	};
	/**
	 * Message has been sent automatically by the service provider to notify
	 * that settlement will not take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForcedRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message has been sent automatically by the service provider to notify that settlement will not take place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForcedRejection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedRejection";
			definition = "Message has been sent automatically by the service provider to notify that settlement will not take place.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * All checks relative to the instruction (except collateral) are
	 * successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All checks relative to the instruction (except collateral) are successful."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "All checks relative to the instruction (except collateral) are successful.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Order has been received at the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order has been received at the intermediary."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivedAtIntermediary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Order has been received at the intermediary.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * No/incomplete instruction was received for the corporate action event. No
	 * further processing has been carried out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No/incomplete instruction was received for the corporate action event. No further processing has been carried out."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstruction";
			definition = "No/incomplete instruction was received for the corporate action event. No further processing has been carried out.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Instruction cannot be cancelled as it has already been matched and
	 * affirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyMatchedAndAffirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction cannot be cancelled as it has already been matched and affirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAlreadyMatchedAndAffirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyMatchedAndAffirmed";
			definition = "Instruction cannot be cancelled as it has already been matched and affirmed.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "NOTC";
		}
	};
	/**
	 * Order is open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is open."</li>
	 * </ul>
	 */
	public static final MMCode mmOpenOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOrder";
			definition = "Order is open.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "OPOD";
		}
	};
	/**
	 * Quantity of financial instrument of the block trade has been
	 * overallocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllocated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument of the block trade has been overallocated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOverAllocated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllocated";
			definition = "Quantity of financial instrument of the block trade has been overallocated.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Instruction has been acknowledged/accepted for further processing by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged/accepted for further processing by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged/accepted for further processing by the account servicer.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order has been partially filled and the remaining quantity is warehoused.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order has been partially filled and the remaining quantity is warehoused."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialFill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFill";
			definition = "Order has been partially filled and the remaining quantity is warehoused.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PAFI";
		}
	};
	/**
	 * Order has been partially cancelled as requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order has been partially cancelled as requested."</li>
	 * </ul>
	 */
	public static final MMCode mmPartialCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			definition = "Order has been partially cancelled as requested.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Processing of the instruction is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the instruction is pending."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction is pending.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PPRC";
		}
	};
	/**
	 * Instruction has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final MMCode mmRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Instruction is accepted but in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is accepted but in repair."</li>
	 * </ul>
	 */
	public static final MMCode mmInRepair = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Instruction is accepted but in repair.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	/**
	 * Settlement instruction has been sent to your custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SESE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instruction has been sent to your custodian."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementInstructionSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionSent";
			definition = "Settlement instruction has been sent to your custodian.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "SESE";
		}
	};
	/**
	 * Standing instruction has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction has been applied."</li>
	 * </ul>
	 */
	public static final MMCode mmStandingInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Trading is suspended by the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedByStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading is suspended by the stock exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmTradingSuspendedByStockExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedByStockExchange";
			definition = "Trading is suspended by the stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Transaction has been treated (triparty collateral status).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been treated (triparty collateral status)."</li>
	 * </ul>
	 */
	public static final MMCode mmTreated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treated";
			definition = "Transaction has been treated (triparty collateral status).";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Quantity of financial instrument of the block trade has been under
	 * allocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderAllocated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument of the block trade has been under allocated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnderAllocated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderAllocated";
			definition = "Quantity of financial instrument of the block trade has been under allocated.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "UNDE";
		}
	};
	/**
	 * Modification request from the counterparty is awaiting for your
	 * modification request or your concent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request from the counterparty is awaiting for your modification request or your concent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmModificationRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from the counterparty is awaiting for your modification request or your concent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "MPRC";
		}
	};
	/**
	 * Transaction terms communicated have been acknowledged/accepted for
	 * further processing by the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedByAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction terms communicated have been acknowledged/accepted for further processing by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcknowledgedAcceptedByAccountOwner = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedByAccountOwner";
			definition = "Transaction terms communicated have been acknowledged/accepted for further processing by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "ACAO";
		}
	};
	/**
	 * Transaction terms communicated have been rejected for further processing
	 * by the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction terms communicated have been rejected for further processing by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejectedByAccountOwner = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByAccountOwner";
			definition = "Transaction terms communicated have been rejected for further processing by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "RJAO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAN1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatusCode";
				definition = "Specifies the status of an instruction.";
				code_lazy = () -> Arrays.asList(InstructionProcessingStatusCode.mmCancellation1, InstructionProcessingStatusCode.mmCancellation2, InstructionProcessingStatusCode.mmCancellation3, InstructionProcessingStatusCode.mmCancelled,
						InstructionProcessingStatusCode.mmCancelledByAnotherParty, InstructionProcessingStatusCode.mmPendingCancellation, InstructionProcessingStatusCode.mmGenerated,
						InstructionProcessingStatusCode.mmFullyExecutedConfirmationSent, InstructionProcessingStatusCode.mmCancellationRequested, InstructionProcessingStatusCode.mmDefaultAction, InstructionProcessingStatusCode.mmDone,
						InstructionProcessingStatusCode.mmPartiallyFilledOrder, InstructionProcessingStatusCode.mmReceivedAtStockExchange, InstructionProcessingStatusCode.mmFullyExecutedExecutionSent,
						InstructionProcessingStatusCode.mmForcedRejection, InstructionProcessingStatusCode.mmFuture, InstructionProcessingStatusCode.mmReceivedAtIntermediary, InstructionProcessingStatusCode.mmNoInstruction,
						InstructionProcessingStatusCode.mmAlreadyMatchedAndAffirmed, InstructionProcessingStatusCode.mmOpenOrder, InstructionProcessingStatusCode.mmOverAllocated, InstructionProcessingStatusCode.mmAcknowledgedAccepted,
						InstructionProcessingStatusCode.mmPartialFill, InstructionProcessingStatusCode.mmPartialCancel, InstructionProcessingStatusCode.mmPendingProcessing, InstructionProcessingStatusCode.mmRejected,
						InstructionProcessingStatusCode.mmInRepair, InstructionProcessingStatusCode.mmSettlementInstructionSent, InstructionProcessingStatusCode.mmStandingInstruction,
						InstructionProcessingStatusCode.mmTradingSuspendedByStockExchange, InstructionProcessingStatusCode.mmTreated, InstructionProcessingStatusCode.mmUnderAllocated,
						InstructionProcessingStatusCode.mmModificationRequested, InstructionProcessingStatusCode.mmAcknowledgedAcceptedByAccountOwner, InstructionProcessingStatusCode.mmRejectedByAccountOwner);
			}
		});
		return mmObject_lazy.get();
	}
}