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
 * Specifies the state of a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Accepted
 * PaymentInstructionStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Validated
 * PaymentInstructionStatusCode.Validated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Authorised
 * PaymentInstructionStatusCode.Authorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Invalid
 * PaymentInstructionStatusCode.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Matched
 * PaymentInstructionStatusCode.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Unmatched
 * PaymentInstructionStatusCode.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Mismatched
 * PaymentInstructionStatusCode.Mismatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#SettlementEligible
 * PaymentInstructionStatusCode.SettlementEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#SettlementMature
 * PaymentInstructionStatusCode.SettlementMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Suspended
 * PaymentInstructionStatusCode.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#PendingCancellation
 * PaymentInstructionStatusCode.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#PendingSettlement
 * PaymentInstructionStatusCode.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#PendingFailingSettlement
 * PaymentInstructionStatusCode.PendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#SenderMultilateralLimitRelated
 * PaymentInstructionStatusCode.SenderMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#ReceiverMultilateralLimitRelated
 * PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#SenderReceiverBilateralLimitRelated
 * PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Settled
 * PaymentInstructionStatusCode.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Rejected
 * PaymentInstructionStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Cancelled
 * PaymentInstructionStatusCode.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#Finalised
 * PaymentInstructionStatusCode.Finalised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#HeldForServiceAvailability
 * PaymentInstructionStatusCode.HeldForServiceAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode#SenderReceiverMultilateralLimitRelated
 * PaymentInstructionStatusCode.SenderReceiverMultilateralLimitRelated}</li>
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
 * <li>"ACPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstructionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the state of a payment."</li>
 * </ul>
 */
public class PaymentInstructionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been accepted by the clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been accepted by the clearing agent."</li>
	 * </ul>
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Transaction has been accepted by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "ACPD";
		}
	};
	/**
	 * Transaction has been validated by the clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been validated by the clearing agent."</li>
	 * </ul>
	 */
	public static final MMCode Validated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Validated";
			definition = "Transaction has been validated by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "VALD";
		}
	};
	/**
	 * Transaction has been authorised by the transaction administrator or
	 * authorised party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been authorised by the transaction administrator or authorised party."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Authorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorised";
			definition = "Transaction has been authorised by the transaction administrator or authorised party.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "AUTD";
		}
	};
	/**
	 * Transaction is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is invalid."</li>
	 * </ul>
	 */
	public static final MMCode Invalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invalid";
			definition = "Transaction is invalid.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "INVD";
		}
	};
	/**
	 * Transaction has been matched with a corresponding transaction by the
	 * clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MATD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been matched with a corresponding transaction by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Matched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Matched";
			definition = "Transaction has been matched with a corresponding transaction by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "MATD";
		}
	};
	/**
	 * Clearing agent attempted to match the transaction with a corresponding
	 * transaction but failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing agent attempted to match the transaction with a corresponding transaction but failed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Unmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unmatched";
			definition = "Clearing agent attempted to match the transaction with a corresponding transaction but failed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "UMAC";
		}
	};
	/**
	 * Clearing agent attempted to match the transaction with a corresponding
	 * transaction, but some non-essential characteristics of both transactions
	 * failed to match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing agent attempted to match the transaction with a corresponding transaction, but some non-essential characteristics of both transactions failed to match."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Mismatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mismatched";
			definition = "Clearing agent attempted to match the transaction with a corresponding transaction, but some non-essential characteristics of both transactions failed to match.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "MMTD";
		}
	};
	/**
	 * Transaction is eligible for future settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is eligible for future settlement."</li>
	 * </ul>
	 */
	public static final MMCode SettlementEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementEligible";
			definition = "Transaction is eligible for future settlement.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLE";
		}
	};
	/**
	 * Transaction is eligible for immediate settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is eligible for immediate settlement."</li>
	 * </ul>
	 */
	public static final MMCode SettlementMature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMature";
			definition = "Transaction is eligible for immediate settlement.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLM";
		}
	};
	/**
	 * Transaction has been suspended by the clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been suspended by the clearing agent."</li>
	 * </ul>
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "Transaction has been suspended by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SSPD";
		}
	};
	/**
	 * Clearing agent has received a cancellation request for the transaction,
	 * and needs either a matching request for cancellation from the
	 * counterparty or a confirmation from an authorised party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing agent has received a cancellation request for the transaction, and needs either a matching request for cancellation from the counterparty or a confirmation from an authorised party."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCancellation";
			definition = "Clearing agent has received a cancellation request for the transaction, and needs either a matching request for cancellation from the counterparty or a confirmation from an authorised party.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PCAN";
		}
	};
	/**
	 * Transaction is eligible for settlement, but is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is eligible for settlement, but is pending."</li>
	 * </ul>
	 */
	public static final MMCode PendingSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Transaction is eligible for settlement, but is pending.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Transaction eligible for immediate settlement, has failed to settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction eligible for immediate settlement, has failed to settle."</li>
	 * </ul>
	 */
	public static final MMCode PendingFailingSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Transaction eligible for immediate settlement, has failed to settle.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PFST";
		}
	};
	/**
	 * Transaction causes the 'Sender multilateral limit' to be exceeded and
	 * cannot currently be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderMultilateralLimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction causes the 'Sender multilateral limit' to be exceeded and cannot currently be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SenderMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SenderMultilateralLimitRelated";
			definition = "Transaction causes the 'Sender multilateral limit' to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SMLR";
		}
	};
	/**
	 * Transaction causes the 'Receiver multilateral limit' to be exceeded and
	 * cannot currently be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverMultilateralLimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction causes the 'Receiver multilateral limit' to be exceeded and cannot currently be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReceiverMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverMultilateralLimitRelated";
			definition = "Transaction causes the 'Receiver multilateral limit' to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "RMLR";
		}
	};
	/**
	 * Transaction causes the bilateral limit fixed between Sender and Receiver
	 * to be exceeded and cannot currently be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverBilateralLimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction causes the bilateral limit fixed between Sender and Receiver to be exceeded and cannot currently be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SenderReceiverBilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverBilateralLimitRelated";
			definition = "Transaction causes the bilateral limit fixed between Sender and Receiver to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SRBL";
		}
	};
	/**
	 * Transaction has been successfully processed by the clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been successfully processed by the clearing agent."</li>
	 * </ul>
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Transaction has been successfully processed by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Transaction has been rejected by the clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been rejected by the clearing agent."</li>
	 * </ul>
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Transaction has been rejected by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "RJTD";
		}
	};
	/**
	 * Transaction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been cancelled."</li>
	 * </ul>
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transaction has been cancelled.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Transaction has been successfully processed by the clearing agent.
	 * Settlement will take place outside of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Finalised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been successfully processed by the clearing agent. Settlement will take place outside of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Finalised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Finalised";
			definition = "Transaction has been successfully processed by the clearing agent. Settlement will take place outside of the system.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "FNLD";
		}
	};
	/**
	 * Specifies that the message is queued to the receiving payment system and
	 * is awaiting processing because the receiving payment system is not
	 * operational (open) at that point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldForServiceAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the message is queued to the receiving payment system and is awaiting processing because the receiving payment system is not operational (open) at that point in time."
	 * </li>
	 * </ul>
	 */
	public static final MMCode HeldForServiceAvailability = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HeldForServiceAvailability";
			definition = "Specifies that the message is queued to the receiving payment system and is awaiting processing because the receiving payment system is not operational (open) at that point in time.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "AVLB";
		}
	};
	/**
	 * Transaction causes the multilateral limits fixed between Sender and
	 * Receiver to be exceeded by the total amount of submitted payments at the
	 * end of the day and cannot currently be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverMultilateralLimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction causes the multilateral limits fixed between Sender and Receiver to be exceeded by the total amount of submitted payments at the end of the day and cannot currently be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SenderReceiverMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverMultilateralLimitRelated";
			definition = "Transaction causes the multilateral limits fixed between Sender and Receiver to be exceeded by the total amount of submitted payments at the end of the day and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SRML";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstructionStatusCode";
				definition = "Specifies the state of a payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentInstructionStatusCode.Accepted, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Validated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Authorised, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Invalid,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Matched, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Unmatched,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Mismatched, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SettlementEligible,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.SettlementMature, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Suspended,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingCancellation, com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingSettlement,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingFailingSettlement, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderMultilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Settled, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Rejected,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Cancelled, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Finalised,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.HeldForServiceAvailability, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderReceiverMultilateralLimitRelated);
			}
		});
		return mmObject_lazy.get();
	}
}