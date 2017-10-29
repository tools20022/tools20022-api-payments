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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CancellationReason33Choice;
import com.tools20022.repository.choice.MandateReason1Choice;
import com.tools20022.repository.choice.MandateSuspensionReason1Choice;
import com.tools20022.repository.choice.ReversalReason4Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.MandateSuspensionReason1;
import com.tools20022.repository.msg.PaymentCancellationReason1;
import com.tools20022.repository.msg.PaymentCancellationReason3;
import com.tools20022.repository.msg.StatusReasonInformation9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a payment at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentStatus" src="doc-files/PaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Status
 * PaymentStatus.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
 * PaymentStatus.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#UnmatchedStatusReason
 * PaymentStatus.UnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#SuspendedStatusReason
 * PaymentStatus.SuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#PendingSettlement
 * PaymentStatus.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#InstructionStatus
 * PaymentStatus.InstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#TransactionRejectionReason
 * PaymentStatus.TransactionRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#RelatedInvestigationCase
 * PaymentStatus.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#NotificationStatus
 * PaymentStatus.NotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#TransactionStatus
 * PaymentStatus.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#CashPaymentStatus
 * PaymentStatus.CashPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#UnsuccessfulStatusReason
 * PaymentStatus.UnsuccessfulStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#CancellationReason
 * PaymentStatus.CancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#MandateRejectionReason
 * PaymentStatus.MandateRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#PendingFailingSettlement
 * PaymentStatus.PendingFailingSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
 * Payment.PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#PaymentStatus
 * PaymentInvestigationCase.PaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusReason
 * CurrencyControlGroupStatus1.StatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ReversalReason4Choice
 * ReversalReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReasonInformation9
 * StatusReasonInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MandateReason1Choice
 * MandateReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason1
 * PaymentCancellationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCancellationReason3
 * PaymentCancellationReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason33Choice
 * CancellationReason33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice
 * MandateSuspensionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateSuspensionReason1
 * MandateSuspensionReason1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a payment at a specified time."</li>
 * </ul>
 */
public class PaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the status of the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
	 * PaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#GroupStatus
	 * OriginalGroupHeader7.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#PaymentInformationStatus
	 * OriginalPaymentInstruction23.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#PaymentInformationStatus
	 * OriginalPaymentInstruction24.PaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#GroupStatus
	 * OriginalGroupInformation28.GroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#PaymentInformationCancellationStatus
	 * OriginalPaymentInstruction22.PaymentInformationCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader7.GroupStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.PaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupInformation28.GroupStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction22.PaymentInformationCancellationStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}
	};
	/**
	 * Payment for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
	 * Payment.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason the transaction/instruction is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is unmatched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnmatchedStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason the transaction/instruction is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the transaction/instruction is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuspendedStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason the instruction is pending settlement, ie, delivery or receipt of
	 * the financial instrument. Settlement on the instructed settlement date is
	 * still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the state of a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
	 * PaymentInstructionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state of a payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason to reject, return or reverse the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#Code
	 * ReversalReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#Proprietary
	 * ReversalReason4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason to reject, return or reverse the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReversalReason4Choice.Code, com.tools20022.repository.choice.ReversalReason4Choice.Proprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}
	};
	/**
	 * Specifies an investigation case in relation with the payment status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#PaymentStatus
	 * PaymentInvestigationCase.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an investigation case in relation with the payment status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the payment in comparison with the notification
	 * to receive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#NotificationStatus
	 * OriginalNotification9.NotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#ItemStatus
	 * OriginalItemAndStatus5.ItemStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the payment in comparison with the notification to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification9.NotificationStatus, com.tools20022.repository.msg.OriginalItemAndStatus5.ItemStatus);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the processing status of an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
	/**
	 * Specifies a generic status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode
	 * CashPaymentStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a generic status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashPaymentStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}
	};
	/**
	 * Reason provided for the status of a transaction.The reason may be in
	 * coded or free text form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalStatusReason1Code
	 * ExternalStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsuccessfulStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason provided for the status of a transaction.The reason may be in coded or free text form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnsuccessfulStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}
	};
	/**
	 * Reason for the cancellation of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#Reason
	 * PaymentCancellationReason3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#CancellationReason
	 * DebitAuthorisation2.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#Code
	 * CancellationReason33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#Proprietary
	 * CancellationReason33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#CancellationReasonInformation
	 * PaymentTransaction74.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#CancellationReasonInformation
	 * OriginalGroupHeader6.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#CancellationReasonInformation
	 * PaymentTransaction75.CancellationReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the cancellation of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCancellationReason3.Reason, com.tools20022.repository.msg.DebitAuthorisation2.CancellationReason,
					com.tools20022.repository.choice.CancellationReason33Choice.Code, com.tools20022.repository.choice.CancellationReason33Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTransaction74.CancellationReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader6.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction75.CancellationReasonInformation);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Reason for requesting the cancellation or the amendment of a mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#Code
	 * MandateReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#Proprietary
	 * MandateReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#Reason
	 * PaymentCancellationReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#Code
	 * MandateSuspensionReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#Proprietary
	 * MandateSuspensionReason1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for requesting the cancellation or the amendment of a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MandateReason1Choice.Code, com.tools20022.repository.choice.MandateReason1Choice.Proprietary,
					com.tools20022.repository.msg.PaymentCancellationReason1.Reason, com.tools20022.repository.choice.MandateSuspensionReason1Choice.Code, com.tools20022.repository.choice.MandateSuspensionReason1Choice.Proprietary);
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}
	};
	/**
	 * Reason the transaction/instruction is pending due to failing settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason the transaction/instruction is pending due to failing settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingFailingSettlement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusReason);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentStatus.Status, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.PaymentStatus.UnmatchedStatusReason,
						com.tools20022.repository.entity.PaymentStatus.SuspendedStatusReason, com.tools20022.repository.entity.PaymentStatus.PendingSettlement, com.tools20022.repository.entity.PaymentStatus.InstructionStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionRejectionReason, com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase, com.tools20022.repository.entity.PaymentStatus.NotificationStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionStatus, com.tools20022.repository.entity.PaymentStatus.CashPaymentStatus, com.tools20022.repository.entity.PaymentStatus.UnsuccessfulStatusReason,
						com.tools20022.repository.entity.PaymentStatus.CancellationReason, com.tools20022.repository.entity.PaymentStatus.MandateRejectionReason, com.tools20022.repository.entity.PaymentStatus.PendingFailingSettlement);
				derivationComponent_lazy = () -> Arrays.asList(ReversalReason4Choice.mmObject(), StatusReasonInformation9.mmObject(), MandateReason1Choice.mmObject(), PaymentCancellationReason1.mmObject(),
						PaymentCancellationReason3.mmObject(), CancellationReason33Choice.mmObject(), MandateSuspensionReason1Choice.mmObject(), MandateSuspensionReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}