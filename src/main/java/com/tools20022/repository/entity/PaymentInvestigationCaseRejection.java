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
import com.tools20022.repository.choice.CancellationStatusReason3Choice;
import com.tools20022.repository.choice.InvestigationStatus4Choice;
import com.tools20022.repository.choice.ModificationStatusReason1Choice;
import com.tools20022.repository.codeset.CaseAssignmentRejectionCode;
import com.tools20022.repository.codeset.InvestigationRejectionCode;
import com.tools20022.repository.codeset.PaymentCancellationRejectionCode;
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestigationRejectionJustification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Specifies the rejection of an activity linked to a payment. The rejected
 * activity may be the assignment of an investigation case, the cancellation or
 * the modification of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInvestigationCaseRejection"
 * src="doc-files/PaymentInvestigationCaseRejection.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedModification
 * PaymentInvestigationCaseRejection.mmRejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedCancellation
 * PaymentInvestigationCaseRejection.mmRejectedCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectedCancellationReason
 * PaymentInvestigationCaseRejection.mmRejectedCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmAssignmentCancellationConfirmation
 * PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRejectionReason
 * PaymentInvestigationCaseRejection.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRelatedInvestigationCaseResolution
 * PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmInvestigationRejection
 * PaymentInvestigationCaseRejection.mmInvestigationRejection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationCaseRejection
 * PaymentInvestigationCaseResolution.mmInvestigationCaseRejection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1
 * InvestigationRejectionJustification1}</li>
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
 * "PaymentInvestigationCaseRejection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCaseRejection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentModificationRejectionV2Code rejectedModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejectionV2Code
	 * PaymentModificationRejectionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice#mmRejectedModification
	 * InvestigationStatus4Choice.mmRejectedModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejection of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, PaymentModificationRejectionV2Code> mmRejectedModification = new MMBusinessAttribute<PaymentInvestigationCaseRejection, PaymentModificationRejectionV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus4Choice.mmRejectedModification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
		}

		@Override
		public PaymentModificationRejectionV2Code getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getRejectedModification();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, PaymentModificationRejectionV2Code value) {
			obj.setRejectedModification(value);
		}
	};
	protected PaymentCancellationRejectionCode rejectedCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
	 * PaymentCancellationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason3Choice#mmCode
	 * CancellationStatusReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason3Choice#mmProprietary
	 * CancellationStatusReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatusReason1Choice#mmCode
	 * ModificationStatusReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatusReason1Choice#mmProprietary
	 * ModificationStatusReason1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification for the rejection of the cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, PaymentCancellationRejectionCode> mmRejectedCancellation = new MMBusinessAttribute<PaymentInvestigationCaseRejection, PaymentCancellationRejectionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationStatusReason3Choice.mmCode, CancellationStatusReason3Choice.mmProprietary, ModificationStatusReason1Choice.mmCode, ModificationStatusReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellation";
			definition = "Justification for the rejection of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCancellationRejectionCode.mmObject();
		}

		@Override
		public PaymentCancellationRejectionCode getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getRejectedCancellation();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, PaymentCancellationRejectionCode value) {
			obj.setRejectedCancellation(value);
		}
	};
	protected Max140Text rejectedCancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text justification for rejecting a cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, Max140Text> mmRejectedCancellationReason = new MMBusinessAttribute<PaymentInvestigationCaseRejection, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationReason";
			definition = "Free text justification for rejecting a cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getRejectedCancellationReason();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, Max140Text value) {
			obj.setRejectedCancellationReason(value);
		}
	};
	protected YesNoIndicator assignmentCancellationConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice#mmAssignmentCancellationConfirmation
	 * InvestigationStatus4Choice.mmAssignmentCancellationConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, YesNoIndicator> mmAssignmentCancellationConfirmation = new MMBusinessAttribute<PaymentInvestigationCaseRejection, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus4Choice.mmAssignmentCancellationConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getAssignmentCancellationConfirmation();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, YesNoIndicator value) {
			obj.setAssignmentCancellationConfirmation(value);
		}
	};
	protected CaseAssignmentRejectionCode rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the rejection of a case assignment, in a coded form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, CaseAssignmentRejectionCode> mmRejectionReason = new MMBusinessAttribute<PaymentInvestigationCaseRejection, CaseAssignmentRejectionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason for the rejection of a case assignment, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseAssignmentRejectionCode.mmObject();
		}

		@Override
		public CaseAssignmentRejectionCode getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, CaseAssignmentRejectionCode value) {
			obj.setRejectionReason(value);
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationCaseRejection
	 * PaymentInvestigationCaseResolution.mmInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resolution which consists in rejecting the case."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseRejection, PaymentInvestigationCaseResolution> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<PaymentInvestigationCaseRejection, PaymentInvestigationCaseResolution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Resolution which consists in rejecting the case.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationCaseRejection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public PaymentInvestigationCaseResolution getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, PaymentInvestigationCaseResolution value) {
			obj.setRelatedInvestigationCaseResolution(value);
		}
	};
	protected InvestigationRejectionCode investigationRejection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1#mmRejectionReason
	 * InvestigationRejectionJustification1.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejection of a case assignment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCaseRejection, InvestigationRejectionCode> mmInvestigationRejection = new MMBusinessAttribute<PaymentInvestigationCaseRejection, InvestigationRejectionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationRejectionJustification1.mmRejectionReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationRejection";
			definition = "Reason for the rejection of a case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationRejectionCode.mmObject();
		}

		@Override
		public InvestigationRejectionCode getValue(PaymentInvestigationCaseRejection obj) {
			return obj.getInvestigationRejection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseRejection obj, InvestigationRejectionCode value) {
			obj.setInvestigationRejection(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseRejection";
				definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
				associationDomain_lazy = () -> Arrays.asList(PaymentInvestigationCaseResolution.mmInvestigationCaseRejection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRejectedModification, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRejectedCancellation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRejectedCancellationReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmAssignmentCancellationConfirmation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRejectionReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmInvestigationRejection);
				derivationComponent_lazy = () -> Arrays.asList(InvestigationRejectionJustification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInvestigationCaseRejection.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentModificationRejectionV2Code getRejectedModification() {
		return rejectedModification;
	}

	public PaymentInvestigationCaseRejection setRejectedModification(PaymentModificationRejectionV2Code rejectedModification) {
		this.rejectedModification = Objects.requireNonNull(rejectedModification);
		return this;
	}

	public PaymentCancellationRejectionCode getRejectedCancellation() {
		return rejectedCancellation;
	}

	public PaymentInvestigationCaseRejection setRejectedCancellation(PaymentCancellationRejectionCode rejectedCancellation) {
		this.rejectedCancellation = Objects.requireNonNull(rejectedCancellation);
		return this;
	}

	public Max140Text getRejectedCancellationReason() {
		return rejectedCancellationReason;
	}

	public PaymentInvestigationCaseRejection setRejectedCancellationReason(Max140Text rejectedCancellationReason) {
		this.rejectedCancellationReason = Objects.requireNonNull(rejectedCancellationReason);
		return this;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return assignmentCancellationConfirmation;
	}

	public PaymentInvestigationCaseRejection setAssignmentCancellationConfirmation(YesNoIndicator assignmentCancellationConfirmation) {
		this.assignmentCancellationConfirmation = Objects.requireNonNull(assignmentCancellationConfirmation);
		return this;
	}

	public CaseAssignmentRejectionCode getRejectionReason() {
		return rejectionReason;
	}

	public PaymentInvestigationCaseRejection setRejectionReason(CaseAssignmentRejectionCode rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public PaymentInvestigationCaseRejection setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = Objects.requireNonNull(relatedInvestigationCaseResolution);
		return this;
	}

	public InvestigationRejectionCode getInvestigationRejection() {
		return investigationRejection;
	}

	public PaymentInvestigationCaseRejection setInvestigationRejection(InvestigationRejectionCode investigationRejection) {
		this.investigationRejection = Objects.requireNonNull(investigationRejection);
		return this;
	}
}