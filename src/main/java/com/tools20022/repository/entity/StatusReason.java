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
import com.tools20022.repository.choice.ReturnReason5Choice;
import com.tools20022.repository.choice.StatusReason6Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmReason
 * StatusReason.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
 * StatusReason.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
 * StatusReason.mmRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
 * StatusReason.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
 * StatusReason.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
 * StatusReason.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
 * StatusReason.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
 * StatusReason.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRelatedClosureReason
 * StatusReason.mmRelatedClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
 * RegisteredContract.mmClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice#mmCode
 * ReturnReason5Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason5Choice#mmProprietary
 * ReturnReason5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#mmReason
 * PaymentReversalReason7.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1#mmReason
 * PaymentReturnReason1.mmReason}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Status status;
	/**
	 * Status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Status.mmStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
		}
	};
	protected Max35Text reason;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmReason
	 * PaymentReturnReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#mmAdditionalInformation
	 * PaymentReversalReason7.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#mmCode
	 * StatusReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#mmProprietary
	 * StatusReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmAdditionalRejectReasonInformation
	 * AcceptanceResult6.mmAdditionalRejectReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#mmReason
	 * MandateAmendmentReason1.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#mmReason
	 * CaseStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmAdditionalInformation
	 * CancellationStatusReason2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmAmendmentReason
	 * RegisteredContractAmendment1.mmAmendmentReason}</li>
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
	public static final MMBusinessAttribute mmReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentReturnReason2.mmReason, PaymentReversalReason7.mmAdditionalInformation, StatusReason6Choice.mmCode, StatusReason6Choice.mmProprietary,
					AcceptanceResult6.mmAdditionalRejectReasonInformation, MandateAmendmentReason1.mmReason, CaseStatus2.mmReason, CancellationStatusReason2.mmAdditionalInformation, RegisteredContractAmendment1.mmAmendmentReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NoReasonCode noSpecifiedReason;
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
	public static final MMBusinessAttribute mmNoSpecifiedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getNoSpecifiedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> dataSourceScheme;
	/**
	 * Proprietary identification of the reason for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
	 * GenericIdentification.mmRelatedStatusReason}</li>
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
	public static final MMBusinessAssociationEnd mmDataSourceScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected RejectedStatusReasonCode rejectedStatusReason;
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
	public static final MMBusinessAttribute mmRejectedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getRejectedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingFailingReasonCode failingReason;
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
	public static final MMBusinessAttribute mmFailingReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getFailingReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancelledStatusReasonV2Code cancellationReason;
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
	public static final MMBusinessAttribute mmCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingFailingReasonCode pendingReason;
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
	public static final MMBusinessAttribute mmPendingReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getPendingReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RejectionReasonV2Code rejectionReason;
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
	public static final MMBusinessAttribute mmRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AcknowledgementReasonCode acknowledgedAcceptedReason;
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
	public static final MMBusinessAttribute mmAcknowledgedAcceptedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReason.class.getMethod("getAcknowledgedAcceptedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegisteredContract relatedClosureReason;
	/**
	 * Related reason of closure of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
	 * RegisteredContract.mmClosureReason}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedClosureReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason, com.tools20022.repository.entity.Status.mmStatusReason,
						com.tools20022.repository.entity.RegisteredContract.mmClosureReason);
				derivationElement_lazy = () -> Arrays.asList(ReturnReason5Choice.mmCode, ReturnReason5Choice.mmProprietary, PaymentReversalReason7.mmReason, PaymentReturnReason1.mmReason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.StatusReason.mmReason, com.tools20022.repository.entity.StatusReason.mmNoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.StatusReason.mmRejectedStatusReason, com.tools20022.repository.entity.StatusReason.mmFailingReason,
						com.tools20022.repository.entity.StatusReason.mmCancellationReason, com.tools20022.repository.entity.StatusReason.mmPendingReason, com.tools20022.repository.entity.StatusReason.mmRejectionReason,
						com.tools20022.repository.entity.StatusReason.mmAcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(ReturnReason5Choice.mmObject(), PaymentReturnReason2.mmObject(), PaymentReversalReason7.mmObject(), StatusReason6Choice.mmObject(), MandateAmendmentReason1.mmObject(),
						PaymentReturnReason1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.Status status) {
		this.status = status;
	}

	public Max35Text getReason() {
		return reason;
	}

	public void setReason(Max35Text reason) {
		this.reason = reason;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public void setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = noSpecifiedReason;
	}

	public List<GenericIdentification> getDataSourceScheme() {
		return dataSourceScheme;
	}

	public void setDataSourceScheme(List<com.tools20022.repository.entity.GenericIdentification> dataSourceScheme) {
		this.dataSourceScheme = dataSourceScheme;
	}

	public RejectedStatusReasonCode getRejectedStatusReason() {
		return rejectedStatusReason;
	}

	public void setRejectedStatusReason(RejectedStatusReasonCode rejectedStatusReason) {
		this.rejectedStatusReason = rejectedStatusReason;
	}

	public PendingFailingReasonCode getFailingReason() {
		return failingReason;
	}

	public void setFailingReason(PendingFailingReasonCode failingReason) {
		this.failingReason = failingReason;
	}

	public CancelledStatusReasonV2Code getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancelledStatusReasonV2Code cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public PendingFailingReasonCode getPendingReason() {
		return pendingReason;
	}

	public void setPendingReason(PendingFailingReasonCode pendingReason) {
		this.pendingReason = pendingReason;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(RejectionReasonV2Code rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public AcknowledgementReasonCode getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public void setAcknowledgedAcceptedReason(AcknowledgementReasonCode acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
	}

	public RegisteredContract getRelatedClosureReason() {
		return relatedClosureReason;
	}

	public void setRelatedClosureReason(com.tools20022.repository.entity.RegisteredContract relatedClosureReason) {
		this.relatedClosureReason = relatedClosureReason;
	}
}