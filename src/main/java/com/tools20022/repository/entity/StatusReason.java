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
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason4#mmReason
 * PaymentReturnReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason8#mmReason
 * PaymentReversalReason8.mmReason}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason6Choice
 * StatusReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendmentReason1
 * MandateAmendmentReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason4
 * PaymentReturnReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason8
 * PaymentReversalReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason3
 * PaymentReturnReason3}</li>
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
	protected Status status;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<StatusReason, Optional<Status>> mmStatus = new MMBusinessAssociationEnd<StatusReason, Optional<Status>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Status.mmStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Status.mmObject();
		}

		@Override
		public Optional<Status> getValue(StatusReason obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(StatusReason obj, Optional<Status> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	protected Max35Text reason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmAmendmentReason
	 * RegisteredContractAmendment1.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmAdditionalInformation
	 * CancellationStatusReason3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmAdditionalInformation
	 * ModificationStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason8#mmAdditionalInformation
	 * PaymentReversalReason8.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmReason
	 * PaymentReturnReason3.mmReason}</li>
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
	public static final MMBusinessAttribute<StatusReason, Max35Text> mmReason = new MMBusinessAttribute<StatusReason, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StatusReason6Choice.mmCode, StatusReason6Choice.mmProprietary, AcceptanceResult6.mmAdditionalRejectReasonInformation, MandateAmendmentReason1.mmReason, CaseStatus2.mmReason,
					RegisteredContractAmendment1.mmAmendmentReason, CancellationStatusReason3.mmAdditionalInformation, ModificationStatusReason1.mmAdditionalInformation, PaymentReversalReason8.mmAdditionalInformation,
					PaymentReturnReason3.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StatusReason obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(StatusReason obj, Max35Text value) {
			obj.setReason(value);
		}
	};
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, NoReasonCode> mmNoSpecifiedReason = new MMBusinessAttribute<StatusReason, NoReasonCode>() {
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

		@Override
		public NoReasonCode getValue(StatusReason obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(StatusReason obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	protected List<GenericIdentification> dataSourceScheme;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>> mmDataSourceScheme = new MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmRelatedStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(StatusReason obj) {
			return obj.getDataSourceScheme();
		}

		@Override
		public void setValue(StatusReason obj, List<GenericIdentification> value) {
			obj.setDataSourceScheme(value);
		}
	};
	protected RejectedStatusReasonCode rejectedStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, RejectedStatusReasonCode> mmRejectedStatusReason = new MMBusinessAttribute<StatusReason, RejectedStatusReasonCode>() {
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

		@Override
		public RejectedStatusReasonCode getValue(StatusReason obj) {
			return obj.getRejectedStatusReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectedStatusReasonCode value) {
			obj.setRejectedStatusReason(value);
		}
	};
	protected PendingFailingReasonCode failingReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmFailingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
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

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getFailingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setFailingReason(value);
		}
	};
	protected CancelledStatusReasonV2Code cancellationReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code> mmCancellationReason = new MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code>() {
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

		@Override
		public CancelledStatusReasonV2Code getValue(StatusReason obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(StatusReason obj, CancelledStatusReasonV2Code value) {
			obj.setCancellationReason(value);
		}
	};
	protected PendingFailingReasonCode pendingReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmPendingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
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

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getPendingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setPendingReason(value);
		}
	};
	protected RejectionReasonV2Code rejectionReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, RejectionReasonV2Code> mmRejectionReason = new MMBusinessAttribute<StatusReason, RejectionReasonV2Code>() {
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

		@Override
		public RejectionReasonV2Code getValue(StatusReason obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectionReasonV2Code value) {
			obj.setRejectionReason(value);
		}
	};
	protected AcknowledgementReasonCode acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<StatusReason, AcknowledgementReasonCode> mmAcknowledgedAcceptedReason = new MMBusinessAttribute<StatusReason, AcknowledgementReasonCode>() {
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

		@Override
		public AcknowledgementReasonCode getValue(StatusReason obj) {
			return obj.getAcknowledgedAcceptedReason();
		}

		@Override
		public void setValue(StatusReason obj, AcknowledgementReasonCode value) {
			obj.setAcknowledgedAcceptedReason(value);
		}
	};
	protected RegisteredContract relatedClosureReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<StatusReason, RegisteredContract> mmRelatedClosureReason = new MMBusinessAssociationEnd<StatusReason, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(StatusReason obj) {
			return obj.getRelatedClosureReason();
		}

		@Override
		public void setValue(StatusReason obj, RegisteredContract value) {
			obj.setRelatedClosureReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedStatusReason, Status.mmStatusReason, RegisteredContract.mmClosureReason);
				derivationElement_lazy = () -> Arrays.asList(ReturnReason5Choice.mmCode, ReturnReason5Choice.mmProprietary, PaymentReturnReason4.mmReason, PaymentReversalReason8.mmReason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.StatusReason.mmReason, com.tools20022.repository.entity.StatusReason.mmNoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.StatusReason.mmRejectedStatusReason, com.tools20022.repository.entity.StatusReason.mmFailingReason,
						com.tools20022.repository.entity.StatusReason.mmCancellationReason, com.tools20022.repository.entity.StatusReason.mmPendingReason, com.tools20022.repository.entity.StatusReason.mmRejectionReason,
						com.tools20022.repository.entity.StatusReason.mmAcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(ReturnReason5Choice.mmObject(), StatusReason6Choice.mmObject(), MandateAmendmentReason1.mmObject(), PaymentReturnReason4.mmObject(), PaymentReversalReason8.mmObject(),
						PaymentReturnReason3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Status> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public StatusReason setStatus(Status status) {
		this.status = status;
		return this;
	}

	public Max35Text getReason() {
		return reason;
	}

	public StatusReason setReason(Max35Text reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public StatusReason setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<GenericIdentification> getDataSourceScheme() {
		return dataSourceScheme == null ? dataSourceScheme = new ArrayList<>() : dataSourceScheme;
	}

	public StatusReason setDataSourceScheme(List<GenericIdentification> dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}

	public RejectedStatusReasonCode getRejectedStatusReason() {
		return rejectedStatusReason;
	}

	public StatusReason setRejectedStatusReason(RejectedStatusReasonCode rejectedStatusReason) {
		this.rejectedStatusReason = Objects.requireNonNull(rejectedStatusReason);
		return this;
	}

	public PendingFailingReasonCode getFailingReason() {
		return failingReason;
	}

	public StatusReason setFailingReason(PendingFailingReasonCode failingReason) {
		this.failingReason = Objects.requireNonNull(failingReason);
		return this;
	}

	public CancelledStatusReasonV2Code getCancellationReason() {
		return cancellationReason;
	}

	public StatusReason setCancellationReason(CancelledStatusReasonV2Code cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public PendingFailingReasonCode getPendingReason() {
		return pendingReason;
	}

	public StatusReason setPendingReason(PendingFailingReasonCode pendingReason) {
		this.pendingReason = Objects.requireNonNull(pendingReason);
		return this;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return rejectionReason;
	}

	public StatusReason setRejectionReason(RejectionReasonV2Code rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public AcknowledgementReasonCode getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public StatusReason setAcknowledgedAcceptedReason(AcknowledgementReasonCode acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = Objects.requireNonNull(acknowledgedAcceptedReason);
		return this;
	}

	public RegisteredContract getRelatedClosureReason() {
		return relatedClosureReason;
	}

	public StatusReason setRelatedClosureReason(RegisteredContract relatedClosureReason) {
		this.relatedClosureReason = Objects.requireNonNull(relatedClosureReason);
		return this;
	}
}