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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.CancellationReason33Choice;
import com.tools20022.repository.choice.MandateReason1Choice;
import com.tools20022.repository.choice.MandateSuspensionReason1Choice;
import com.tools20022.repository.choice.ReversalReason4Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the status of a payment at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentStatus" src="doc-files/PaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
 * PaymentStatus.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnmatchedStatusReason
 * PaymentStatus.mmUnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmSuspendedStatusReason
 * PaymentStatus.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingSettlement
 * PaymentStatus.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
 * PaymentStatus.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmTransactionRejectionReason
 * PaymentStatus.mmTransactionRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmRelatedInvestigationCase
 * PaymentStatus.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmNotificationStatus
 * PaymentStatus.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmTransactionStatus
 * PaymentStatus.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCashPaymentStatus
 * PaymentStatus.mmCashPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnsuccessfulStatusReason
 * PaymentStatus.mmUnsuccessfulStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
 * PaymentStatus.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmMandateRejectionReason
 * PaymentStatus.mmMandateRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingFailingSettlement
 * PaymentStatus.mmPendingFailingSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmPaymentStatus
 * PaymentInvestigationCase.mmPaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusReason
 * CurrencyControlGroupStatus1.mmStatusReason}</li>
 * </ul>
 * </li>
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
	protected PaymentStatusCode status;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmGroupStatus
	 * OriginalGroupHeader7.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmPaymentInformationStatus
	 * OriginalPaymentInstruction23.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmPaymentInformationStatus
	 * OriginalPaymentInstruction24.mmPaymentInformationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmGroupStatus
	 * OriginalGroupInformation28.mmGroupStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus}</li>
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
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmGroupStatus, OriginalPaymentInstruction23.mmPaymentInformationStatus, OriginalPaymentInstruction24.mmPaymentInformationStatus,
					OriginalGroupInformation28.mmGroupStatus, OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected UnmatchedStatusReasonCode unmatchedStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmUnmatchedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getUnmatchedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmSuspendedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getSuspendedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmPendingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getPendingSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstructionStatusCode instructionStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmInstructionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getInstructionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionReasonCode transactionRejectionReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#mmCode
	 * ReversalReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversalReason4Choice#mmProprietary
	 * ReversalReason4Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmTransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReversalReason4Choice.mmCode, ReversalReason4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getTransactionRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmPaymentStatus
	 * PaymentInvestigationCase.mmPaymentStatus}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected NotificationToReceiveStatusCode notificationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmNotificationStatus
	 * OriginalNotification9.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmItemStatus
	 * OriginalItemAndStatus5.mmItemStatus}</li>
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
	public static final MMBusinessAttribute mmNotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalNotification9.mmNotificationStatus, OriginalItemAndStatus5.mmItemStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getNotificationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionStatusCode transactionStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTransactionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashPaymentStatusCode cashPaymentStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCashPaymentStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getCashPaymentStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalStatusReason1Code unsuccessfulStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmUnsuccessfulStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getUnsuccessfulStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationReasonCode cancellationReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3#mmReason
	 * PaymentCancellationReason3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmCancellationReason
	 * DebitAuthorisation2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#mmCode
	 * CancellationReason33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice#mmProprietary
	 * CancellationReason33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmCancellationReasonInformation
	 * PaymentTransaction74.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCancellationReasonInformation
	 * OriginalGroupHeader6.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmCancellationReasonInformation
	 * PaymentTransaction75.mmCancellationReasonInformation}</li>
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
	public static final MMBusinessAttribute mmCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCancellationReason3.mmReason, DebitAuthorisation2.mmCancellationReason, CancellationReason33Choice.mmCode, CancellationReason33Choice.mmProprietary,
					PaymentTransaction74.mmCancellationReasonInformation, OriginalGroupHeader6.mmCancellationReasonInformation, PaymentTransaction75.mmCancellationReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MandateReasonCode mandateRejectionReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#mmCode
	 * MandateReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice#mmProprietary
	 * MandateReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1#mmReason
	 * PaymentCancellationReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#mmCode
	 * MandateSuspensionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateSuspensionReason1Choice#mmProprietary
	 * MandateSuspensionReason1Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmMandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateReason1Choice.mmCode, MandateReason1Choice.mmProprietary, PaymentCancellationReason1.mmReason, MandateSuspensionReason1Choice.mmCode, MandateSuspensionReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getMandateRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingFailingSettlementCode pendingFailingSettlement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmPendingFailingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatus.class.getMethod("getPendingFailingSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus);
				derivationElement_lazy = () -> Arrays.asList(CurrencyControlGroupStatus1.mmStatusReason);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentStatus.mmStatus, com.tools20022.repository.entity.PaymentStatus.mmPayment, com.tools20022.repository.entity.PaymentStatus.mmUnmatchedStatusReason,
						com.tools20022.repository.entity.PaymentStatus.mmSuspendedStatusReason, com.tools20022.repository.entity.PaymentStatus.mmPendingSettlement, com.tools20022.repository.entity.PaymentStatus.mmInstructionStatus,
						com.tools20022.repository.entity.PaymentStatus.mmTransactionRejectionReason, com.tools20022.repository.entity.PaymentStatus.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentStatus.mmNotificationStatus, com.tools20022.repository.entity.PaymentStatus.mmTransactionStatus, com.tools20022.repository.entity.PaymentStatus.mmCashPaymentStatus,
						com.tools20022.repository.entity.PaymentStatus.mmUnsuccessfulStatusReason, com.tools20022.repository.entity.PaymentStatus.mmCancellationReason,
						com.tools20022.repository.entity.PaymentStatus.mmMandateRejectionReason, com.tools20022.repository.entity.PaymentStatus.mmPendingFailingSettlement);
				derivationComponent_lazy = () -> Arrays.asList(ReversalReason4Choice.mmObject(), StatusReasonInformation9.mmObject(), MandateReason1Choice.mmObject(), PaymentCancellationReason1.mmObject(),
						PaymentCancellationReason3.mmObject(), CancellationReason33Choice.mmObject(), MandateSuspensionReason1Choice.mmObject(), MandateSuspensionReason1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentStatusCode getStatus() {
		return status;
	}

	public PaymentStatus setStatus(PaymentStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<Payment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public PaymentStatus setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
		return this;
	}

	public UnmatchedStatusReasonCode getUnmatchedStatusReason() {
		return unmatchedStatusReason;
	}

	public PaymentStatus setUnmatchedStatusReason(UnmatchedStatusReasonCode unmatchedStatusReason) {
		this.unmatchedStatusReason = Objects.requireNonNull(unmatchedStatusReason);
		return this;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public PaymentStatus setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = Objects.requireNonNull(suspendedStatusReason);
		return this;
	}

	public PendingSettlementStatusReasonCode getPendingSettlement() {
		return pendingSettlement;
	}

	public PaymentStatus setPendingSettlement(PendingSettlementStatusReasonCode pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public PaymentInstructionStatusCode getInstructionStatus() {
		return instructionStatus;
	}

	public PaymentStatus setInstructionStatus(PaymentInstructionStatusCode instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}

	public TransactionReasonCode getTransactionRejectionReason() {
		return transactionRejectionReason;
	}

	public PaymentStatus setTransactionRejectionReason(TransactionReasonCode transactionRejectionReason) {
		this.transactionRejectionReason = Objects.requireNonNull(transactionRejectionReason);
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public PaymentStatus setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public NotificationToReceiveStatusCode getNotificationStatus() {
		return notificationStatus;
	}

	public PaymentStatus setNotificationStatus(NotificationToReceiveStatusCode notificationStatus) {
		this.notificationStatus = Objects.requireNonNull(notificationStatus);
		return this;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public PaymentStatus setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public CashPaymentStatusCode getCashPaymentStatus() {
		return cashPaymentStatus;
	}

	public PaymentStatus setCashPaymentStatus(CashPaymentStatusCode cashPaymentStatus) {
		this.cashPaymentStatus = Objects.requireNonNull(cashPaymentStatus);
		return this;
	}

	public ExternalStatusReason1Code getUnsuccessfulStatusReason() {
		return unsuccessfulStatusReason;
	}

	public PaymentStatus setUnsuccessfulStatusReason(ExternalStatusReason1Code unsuccessfulStatusReason) {
		this.unsuccessfulStatusReason = Objects.requireNonNull(unsuccessfulStatusReason);
		return this;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public PaymentStatus setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public MandateReasonCode getMandateRejectionReason() {
		return mandateRejectionReason;
	}

	public PaymentStatus setMandateRejectionReason(MandateReasonCode mandateRejectionReason) {
		this.mandateRejectionReason = Objects.requireNonNull(mandateRejectionReason);
		return this;
	}

	public PendingFailingSettlementCode getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public PaymentStatus setPendingFailingSettlement(PendingFailingSettlementCode pendingFailingSettlement) {
		this.pendingFailingSettlement = Objects.requireNonNull(pendingFailingSettlement);
		return this;
	}
}