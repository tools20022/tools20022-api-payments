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
import com.tools20022.repository.codeset.InstructionProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Cancellation1
 * InstructionProcessingStatusCode.mmCancellation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Cancellation2
 * InstructionProcessingStatusCode.mmCancellation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Cancellation3
 * InstructionProcessingStatusCode.mmCancellation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Cancelled
 * InstructionProcessingStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#CancelledByAnotherParty
 * InstructionProcessingStatusCode.mmCancelledByAnotherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#PendingCancellation
 * InstructionProcessingStatusCode.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Generated
 * InstructionProcessingStatusCode.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#FullyExecutedConfirmationSent
 * InstructionProcessingStatusCode.mmFullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#CancellationRequested
 * InstructionProcessingStatusCode.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#DefaultAction
 * InstructionProcessingStatusCode.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Done
 * InstructionProcessingStatusCode.mmDone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#PartiallyFilledOrder
 * InstructionProcessingStatusCode.mmPartiallyFilledOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#ReceivedAtStockExchange
 * InstructionProcessingStatusCode.mmReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#FullyExecutedExecutionSent
 * InstructionProcessingStatusCode.mmFullyExecutedExecutionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#ForcedRejection
 * InstructionProcessingStatusCode.mmForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Future
 * InstructionProcessingStatusCode.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#ReceivedAtIntermediary
 * InstructionProcessingStatusCode.mmReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#NoInstruction
 * InstructionProcessingStatusCode.mmNoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#AlreadyMatchedAndAffirmed
 * InstructionProcessingStatusCode.mmAlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#OpenOrder
 * InstructionProcessingStatusCode.mmOpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#OverAllocated
 * InstructionProcessingStatusCode.mmOverAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#AcknowledgedAccepted
 * InstructionProcessingStatusCode.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#PartialFill
 * InstructionProcessingStatusCode.mmPartialFill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#PartialCancel
 * InstructionProcessingStatusCode.mmPartialCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#PendingProcessing
 * InstructionProcessingStatusCode.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Rejected
 * InstructionProcessingStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#InRepair
 * InstructionProcessingStatusCode.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#SettlementInstructionSent
 * InstructionProcessingStatusCode.mmSettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#StandingInstruction
 * InstructionProcessingStatusCode.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#TradingSuspendedByStockExchange
 * InstructionProcessingStatusCode.mmTradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#Treated
 * InstructionProcessingStatusCode.mmTreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#UnderAllocated
 * InstructionProcessingStatusCode.mmUnderAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#ModificationRequested
 * InstructionProcessingStatusCode.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#AcknowledgedAcceptedByAccountOwner
 * InstructionProcessingStatusCode.mmAcknowledgedAcceptedByAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode#RejectedByAccountOwner
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionProcessingStatusCode extends MMCode {

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
	public static final InstructionProcessingStatusCode Cancellation1 = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation1";
			definition = "Pending cancellation; only one side has been input and a cancellation request has been sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Cancellation2 = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2";
			definition = "Pending cancellation; both sides have been input, the trade has not yet been matched, and one side has sent a cancellation request.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Cancellation3 = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3";
			definition = "Pending cancellation; both sides have been input, the trade is matched, and one side has sent a cancellation request.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Cancelled = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode CancelledByAnotherParty = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			definition = "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode PendingCancellation = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request from yourself for this instruction is pending waiting for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Generated = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Account servicer or third party created the transaction. It was not instructed directly by the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode FullyExecutedConfirmationSent = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedConfirmationSent";
			definition = "Order is fully executed and the confirmation was sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode CancellationRequested = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from the counterparty is awaiting for your cancellation request or your concent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode DefaultAction = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Done = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Done";
			definition = "Order is partially filled and no further executions forthcoming for the trading day.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode PartiallyFilledOrder = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilledOrder";
			definition = "Order is partially filled and no further executions will take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode ReceivedAtStockExchange = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Order has been received at the stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode FullyExecutedExecutionSent = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedExecutionSent";
			definition = "Order was fully executed and the execution sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode ForcedRejection = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedRejection";
			definition = "Message has been sent automatically by the service provider to notify that settlement will not take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Future = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "All checks relative to the instruction (except collateral) are successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode ReceivedAtIntermediary = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Order has been received at the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode NoInstruction = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstruction";
			definition = "No/incomplete instruction was received for the corporate action event. No further processing has been carried out.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode AlreadyMatchedAndAffirmed = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyMatchedAndAffirmed";
			definition = "Instruction cannot be cancelled as it has already been matched and affirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode OpenOrder = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOrder";
			definition = "Order is open.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode OverAllocated = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllocated";
			definition = "Quantity of financial instrument of the block trade has been overallocated.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode AcknowledgedAccepted = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged/accepted for further processing by the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode PartialFill = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFill";
			definition = "Order has been partially filled and the remaining quantity is warehoused.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode PartialCancel = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			definition = "Order has been partially cancelled as requested.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode PendingProcessing = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Rejected = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode InRepair = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Instruction is accepted but in repair.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode SettlementInstructionSent = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionSent";
			definition = "Settlement instruction has been sent to your custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode StandingInstruction = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode TradingSuspendedByStockExchange = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedByStockExchange";
			definition = "Trading is suspended by the stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode Treated = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treated";
			definition = "Transaction has been treated (triparty collateral status).";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode UnderAllocated = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderAllocated";
			definition = "Quantity of financial instrument of the block trade has been under allocated.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode ModificationRequested = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from the counterparty is awaiting for your modification request or your concent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode AcknowledgedAcceptedByAccountOwner = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedByAccountOwner";
			definition = "Transaction terms communicated have been acknowledged/accepted for further processing by the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
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
	public static final InstructionProcessingStatusCode RejectedByAccountOwner = new InstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByAccountOwner";
			definition = "Transaction terms communicated have been rejected for further processing by the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatusCode.mmObject();
			codeName = "RJAO";
		}
	};
	final static private LinkedHashMap<String, InstructionProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected InstructionProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAN1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatusCode";
				definition = "Specifies the status of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation1, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation2,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation3, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancelled,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.CancelledByAnotherParty, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Generated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.FullyExecutedConfirmationSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.CancellationRequested, com.tools20022.repository.codeset.InstructionProcessingStatusCode.DefaultAction,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Done, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartiallyFilledOrder,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ReceivedAtStockExchange, com.tools20022.repository.codeset.InstructionProcessingStatusCode.FullyExecutedExecutionSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ForcedRejection, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Future,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.InstructionProcessingStatusCode.NoInstruction,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.AlreadyMatchedAndAffirmed, com.tools20022.repository.codeset.InstructionProcessingStatusCode.OpenOrder,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.OverAllocated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.AcknowledgedAccepted,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartialFill, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartialCancel,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.PendingProcessing, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Rejected,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.InRepair, com.tools20022.repository.codeset.InstructionProcessingStatusCode.SettlementInstructionSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.StandingInstruction, com.tools20022.repository.codeset.InstructionProcessingStatusCode.TradingSuspendedByStockExchange,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Treated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.UnderAllocated,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ModificationRequested, com.tools20022.repository.codeset.InstructionProcessingStatusCode.AcknowledgedAcceptedByAccountOwner,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.RejectedByAccountOwner);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancellation1.getCodeName().get(), Cancellation1);
		codesByName.put(Cancellation2.getCodeName().get(), Cancellation2);
		codesByName.put(Cancellation3.getCodeName().get(), Cancellation3);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(CancelledByAnotherParty.getCodeName().get(), CancelledByAnotherParty);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Generated.getCodeName().get(), Generated);
		codesByName.put(FullyExecutedConfirmationSent.getCodeName().get(), FullyExecutedConfirmationSent);
		codesByName.put(CancellationRequested.getCodeName().get(), CancellationRequested);
		codesByName.put(DefaultAction.getCodeName().get(), DefaultAction);
		codesByName.put(Done.getCodeName().get(), Done);
		codesByName.put(PartiallyFilledOrder.getCodeName().get(), PartiallyFilledOrder);
		codesByName.put(ReceivedAtStockExchange.getCodeName().get(), ReceivedAtStockExchange);
		codesByName.put(FullyExecutedExecutionSent.getCodeName().get(), FullyExecutedExecutionSent);
		codesByName.put(ForcedRejection.getCodeName().get(), ForcedRejection);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(ReceivedAtIntermediary.getCodeName().get(), ReceivedAtIntermediary);
		codesByName.put(NoInstruction.getCodeName().get(), NoInstruction);
		codesByName.put(AlreadyMatchedAndAffirmed.getCodeName().get(), AlreadyMatchedAndAffirmed);
		codesByName.put(OpenOrder.getCodeName().get(), OpenOrder);
		codesByName.put(OverAllocated.getCodeName().get(), OverAllocated);
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(PartialFill.getCodeName().get(), PartialFill);
		codesByName.put(PartialCancel.getCodeName().get(), PartialCancel);
		codesByName.put(PendingProcessing.getCodeName().get(), PendingProcessing);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
		codesByName.put(SettlementInstructionSent.getCodeName().get(), SettlementInstructionSent);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
		codesByName.put(TradingSuspendedByStockExchange.getCodeName().get(), TradingSuspendedByStockExchange);
		codesByName.put(Treated.getCodeName().get(), Treated);
		codesByName.put(UnderAllocated.getCodeName().get(), UnderAllocated);
		codesByName.put(ModificationRequested.getCodeName().get(), ModificationRequested);
		codesByName.put(AcknowledgedAcceptedByAccountOwner.getCodeName().get(), AcknowledgedAcceptedByAccountOwner);
		codesByName.put(RejectedByAccountOwner.getCodeName().get(), RejectedByAccountOwner);
	}

	public static InstructionProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionProcessingStatusCode[] values() {
		InstructionProcessingStatusCode[] values = new InstructionProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionProcessingStatusCode> {
		@Override
		public InstructionProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}