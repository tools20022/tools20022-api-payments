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
import com.tools20022.repository.choice.ReturnReason5Choice;
import com.tools20022.repository.choice.StatusReason6Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.MandateAmendmentReason1;
import com.tools20022.repository.msg.PaymentReturnReason1;
import com.tools20022.repository.msg.PaymentReturnReason2;
import com.tools20022.repository.msg.PaymentReversalReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for the status of an object.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StatusReason" src="doc-files/StatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Status
 * StatusReason.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Reason
 * StatusReason.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#NoSpecifiedReason
 * StatusReason.NoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
 * StatusReason.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RejectedStatusReason
 * StatusReason.RejectedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#FailingReason
 * StatusReason.FailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#CancellationReason
 * StatusReason.CancellationReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#PendingReason
 * StatusReason.PendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RejectionReason
 * StatusReason.RejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#AcknowledgedAcceptedReason
 * StatusReason.AcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RelatedClosureReason
 * StatusReason.RelatedClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
 * GenericIdentification.RelatedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusReason
 * Status.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
 * RegisteredContract.ClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice#Code
 * ReturnReason5Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason5Choice#Proprietary
 * ReturnReason5Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason7#Reason
 * PaymentReversalReason7.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1#Reason
 * PaymentReturnReason1.Reason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatusReason
 * UndertakingStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice
 * ReturnReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason2
 * PaymentReturnReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason7
 * PaymentReversalReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason6Choice
 * StatusReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendmentReason1
 * MandateAmendmentReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1
 * PaymentReturnReason1}</li>
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
 * "StatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying reason for the status of an object."</li>
 * </ul>
 */
public class StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusReason
	 * Status.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason provided for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#Reason
	 * PaymentReturnReason2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#AdditionalInformation
	 * PaymentReversalReason7.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#Code
	 * StatusReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#Proprietary
	 * StatusReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#AdditionalRejectReasonInformation
	 * AcceptanceResult6.AdditionalRejectReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#Reason
	 * MandateAmendmentReason1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#Reason
	 * CaseStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#AdditionalInformation
	 * CancellationStatusReason2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#AmendmentReason
	 * RegisteredContractAmendment1.AmendmentReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason provided for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReturnReason2.Reason, com.tools20022.repository.msg.PaymentReversalReason7.AdditionalInformation,
					com.tools20022.repository.choice.StatusReason6Choice.Code, com.tools20022.repository.choice.StatusReason6Choice.Proprietary, com.tools20022.repository.msg.AcceptanceResult6.AdditionalRejectReasonInformation,
					com.tools20022.repository.msg.MandateAmendmentReason1.Reason, com.tools20022.repository.msg.CaseStatus2.Reason, com.tools20022.repository.msg.CancellationStatusReason2.AdditionalInformation,
					com.tools20022.repository.msg.RegisteredContractAmendment1.AmendmentReason);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates that there is no reason available or to report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NoSpecifiedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	/**
	 * Proprietary identification of the reason for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
	 * GenericIdentification.RelatedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary identification of the reason for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DataSourceScheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for the rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RejectedStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason why a transaction has a failing status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why a transaction has a failing status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FailingReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the related instruction is cancelled, or the
	 * related cancellation request is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction processing is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction processing is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction/request has a repair or
	 * rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
	 * RejectionReasonV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair or rejection status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AcknowledgedAcceptedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Related reason of closure of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
	 * RegisteredContract.ClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related reason of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedClosureReason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ClosureReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.Status.StatusReason,
						com.tools20022.repository.entity.RegisteredContract.ClosureReason);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReturnReason5Choice.Code, com.tools20022.repository.choice.ReturnReason5Choice.Proprietary,
						com.tools20022.repository.msg.PaymentReversalReason7.Reason, com.tools20022.repository.msg.PaymentReturnReason1.Reason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.StatusReason.Reason, com.tools20022.repository.entity.StatusReason.NoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.StatusReason.RejectedStatusReason, com.tools20022.repository.entity.StatusReason.FailingReason,
						com.tools20022.repository.entity.StatusReason.CancellationReason, com.tools20022.repository.entity.StatusReason.PendingReason, com.tools20022.repository.entity.StatusReason.RejectionReason,
						com.tools20022.repository.entity.StatusReason.AcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.RelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(ReturnReason5Choice.mmObject(), PaymentReturnReason2.mmObject(), PaymentReversalReason7.mmObject(), StatusReason6Choice.mmObject(), MandateAmendmentReason1.mmObject(),
						PaymentReturnReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}