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
import com.tools20022.repository.choice.ClaimNonReceipt1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of activities performed to handle an exception to a normal transaction
 * flow..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestigationCase" src="doc-files/InvestigationCase.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmAssignmentIdentification
 * InvestigationCase.mmAssignmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmCreationDateTime
 * InvestigationCase.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmIdentification
 * InvestigationCase.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCase#mmStatus
 * InvestigationCase.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmInvestigationPartyRole
 * InvestigationCase.mmInvestigationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmDuplicateCaseResolution
 * InvestigationCase.mmDuplicateCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmInvestigationResolution
 * InvestigationCase.mmInvestigationResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmOriginalInvestigationCase
 * InvestigationCase.mmOriginalInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmLinkedCase
 * InvestigationCase.mmLinkedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmReassignment
 * InvestigationCase.mmReassignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmInvestigationCase
 * InvestigationPartyRole.mmInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmOriginalInvestigationCase
 * InvestigationCase.mmOriginalInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmLinkedCase
 * InvestigationCase.mmLinkedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCase
 * InvestigationResolution.mmInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reassignment#mmReassignedCase
 * Reassignment.mmReassignedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus#mmInvestigationCase
 * InvestigationCaseStatus.mmInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmDuplicatedCase
 * DuplicateCase.mmDuplicatedCase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
 * PaymentInvestigationCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3
 * CaseAssignment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice
 * ClaimNonReceipt1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClaimNonReceipt1
 * ClaimNonReceipt1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case4 Case4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment4
 * CaseAssignment4}</li>
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
 * "InvestigationCase"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of activities performed to handle an exception to a normal transaction flow.."
 * </li>
 * </ul>
 */
public class InvestigationCase {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text assignmentIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#mmIdentification
	 * CaseAssignment3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment4#mmIdentification
	 * CaseAssignment4.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the case assignment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestigationCase, Max35Text> mmAssignmentIdentification = new MMBusinessAttribute<InvestigationCase, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CaseAssignment3.mmIdentification, CaseAssignment4.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentIdentification";
			definition = "Uniquely identifies the case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvestigationCase obj) {
			return obj.getAssignmentIdentification();
		}

		@Override
		public void setValue(InvestigationCase obj, Max35Text value) {
			obj.setAssignmentIdentification(value);
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#mmCreationDateTime
	 * CaseAssignment3.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment4#mmCreationDateTime
	 * CaseAssignment4.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creation date and time of the case."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestigationCase, ISODateTime> mmCreationDateTime = new MMBusinessAttribute<InvestigationCase, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CaseAssignment3.mmCreationDateTime, CaseAssignment4.mmCreationDateTime);
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Creation date and time of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InvestigationCase obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(InvestigationCase obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	protected Max35Text identification;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmIdentification
	 * Case3.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case4#mmIdentification
	 * Case4.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the case."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestigationCase, Max35Text> mmIdentification = new MMBusinessAttribute<InvestigationCase, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Case3.mmIdentification, Case4.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvestigationCase obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(InvestigationCase obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<InvestigationCaseStatus> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus#mmInvestigationCase
	 * InvestigationCaseStatus.mmInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
	 * InvestigationCaseStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmModificationStatusReasonInformation
	 * PaymentTransaction90.mmModificationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmCancellationStatusReasonInformation
	 * PaymentTransaction85.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmCancellationStatusReasonInformation
	 * OriginalPaymentInstruction26.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmCancellationStatusReasonInformation
	 * PaymentTransaction84.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmCancellationStatusReasonInformation
	 * OriginalGroupHeader9.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmCase
	 * OriginalPaymentInstruction29.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the case together with the reason and the date and time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCaseStatus>> mmStatus = new MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCaseStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTransaction90.mmModificationStatusReasonInformation, PaymentTransaction85.mmCancellationStatusReasonInformation, OriginalPaymentInstruction26.mmCancellationStatusReasonInformation,
					PaymentTransaction84.mmCancellationStatusReasonInformation, OriginalGroupHeader9.mmCancellationStatusReasonInformation, OriginalPaymentInstruction29.mmCase);
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the case together with the reason and the date and time.";
			minOccurs = 0;
			opposite_lazy = () -> InvestigationCaseStatus.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationCaseStatus.mmObject();
		}

		@Override
		public List<InvestigationCaseStatus> getValue(InvestigationCase obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(InvestigationCase obj, List<InvestigationCaseStatus> value) {
			obj.setStatus(value);
		}
	};
	protected List<InvestigationPartyRole> investigationPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmInvestigationCase
	 * InvestigationPartyRole.mmInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of an investigation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, List<InvestigationPartyRole>> mmInvestigationPartyRole = new MMBusinessAssociationEnd<InvestigationCase, List<InvestigationPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationPartyRole";
			definition = "Role played by a party in the context of an investigation process.";
			minOccurs = 0;
			opposite_lazy = () -> InvestigationPartyRole.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationPartyRole.mmObject();
		}

		@Override
		public List<InvestigationPartyRole> getValue(InvestigationCase obj) {
			return obj.getInvestigationPartyRole();
		}

		@Override
		public void setValue(InvestigationCase obj, List<InvestigationPartyRole> value) {
			obj.setInvestigationPartyRole(value);
		}
	};
	protected DuplicateCase duplicateCaseResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmDuplicatedCase
	 * DuplicateCase.mmDuplicatedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DuplicateCase
	 * DuplicateCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Solution which consists in closing the case as it is a duplicate of an original one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, Optional<DuplicateCase>> mmDuplicateCaseResolution = new MMBusinessAssociationEnd<InvestigationCase, Optional<DuplicateCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateCaseResolution";
			definition = "Solution which consists in closing the case as it is a duplicate of an original one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DuplicateCase.mmDuplicatedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DuplicateCase.mmObject();
		}

		@Override
		public Optional<DuplicateCase> getValue(InvestigationCase obj) {
			return obj.getDuplicateCaseResolution();
		}

		@Override
		public void setValue(InvestigationCase obj, Optional<DuplicateCase> value) {
			obj.setDuplicateCaseResolution(value.orElse(null));
		}
	};
	protected List<InvestigationResolution> investigationResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCase
	 * InvestigationResolution.mmInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
	 * InvestigationResolution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmReason
	 * CancellationStatusReason3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmReason
	 * ModificationStatusReason1.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the actions taken as a result of an investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, List<InvestigationResolution>> mmInvestigationResolution = new MMBusinessAssociationEnd<InvestigationCase, List<InvestigationResolution>>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationStatusReason3.mmReason, ModificationStatusReason1.mmReason);
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationResolution";
			definition = "Specifies the actions taken as a result of an investigation.";
			minOccurs = 0;
			opposite_lazy = () -> InvestigationResolution.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationResolution.mmObject();
		}

		@Override
		public List<InvestigationResolution> getValue(InvestigationCase obj) {
			return obj.getInvestigationResolution();
		}

		@Override
		public void setValue(InvestigationCase obj, List<InvestigationResolution> value) {
			obj.setInvestigationResolution(value);
		}
	};
	protected List<InvestigationCase> originalInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmLinkedCase
	 * InvestigationCase.mmLinkedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original case to which another one is linked."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCase>> mmOriginalInvestigationCase = new MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalInvestigationCase";
			definition = "Original case to which another one is linked.";
			minOccurs = 0;
			opposite_lazy = () -> InvestigationCase.mmLinkedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationCase.mmObject();
		}

		@Override
		public List<InvestigationCase> getValue(InvestigationCase obj) {
			return obj.getOriginalInvestigationCase();
		}

		@Override
		public void setValue(InvestigationCase obj, List<InvestigationCase> value) {
			obj.setOriginalInvestigationCase(value);
		}
	};
	protected List<InvestigationCase> linkedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmOriginalInvestigationCase
	 * InvestigationCase.mmOriginalInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Step in the resolution process of an investigation case. The assigned case is linked to the investigation case in the previous step."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCase>> mmLinkedCase = new MMBusinessAssociationEnd<InvestigationCase, List<InvestigationCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LinkedCase";
			definition = "Step in the resolution process of an investigation case. The assigned case is linked to the investigation case in the previous step.";
			minOccurs = 0;
			opposite_lazy = () -> InvestigationCase.mmOriginalInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationCase.mmObject();
		}

		@Override
		public List<InvestigationCase> getValue(InvestigationCase obj) {
			return obj.getLinkedCase();
		}

		@Override
		public void setValue(InvestigationCase obj, List<InvestigationCase> value) {
			obj.setLinkedCase(value);
		}
	};
	protected Reassignment reassignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment#mmReassignedCase
	 * Reassignment.mmReassignedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reassignment
	 * Reassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reassignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action which is taken to forward the case to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestigationCase, Optional<Reassignment>> mmReassignment = new MMBusinessAssociationEnd<InvestigationCase, Optional<Reassignment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reassignment";
			definition = "Action which is taken to forward the case to another party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Reassignment.mmReassignedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reassignment.mmObject();
		}

		@Override
		public Optional<Reassignment> getValue(InvestigationCase obj) {
			return obj.getReassignment();
		}

		@Override
		public void setValue(InvestigationCase obj, Optional<Reassignment> value) {
			obj.setReassignment(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal transaction flow..";
				associationDomain_lazy = () -> Arrays.asList(InvestigationPartyRole.mmInvestigationCase, InvestigationCase.mmOriginalInvestigationCase, InvestigationCase.mmLinkedCase, InvestigationResolution.mmInvestigationCase,
						Reassignment.mmReassignedCase, InvestigationCaseStatus.mmInvestigationCase, DuplicateCase.mmDuplicatedCase);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCase.mmObject());
				element_lazy = () -> Arrays.asList(InvestigationCase.mmAssignmentIdentification, InvestigationCase.mmCreationDateTime, InvestigationCase.mmIdentification, InvestigationCase.mmStatus,
						InvestigationCase.mmInvestigationPartyRole, InvestigationCase.mmDuplicateCaseResolution, InvestigationCase.mmInvestigationResolution, InvestigationCase.mmOriginalInvestigationCase, InvestigationCase.mmLinkedCase,
						InvestigationCase.mmReassignment);
				derivationComponent_lazy = () -> Arrays.asList(CaseAssignment3.mmObject(), Case3.mmObject(), ClaimNonReceipt1Choice.mmObject(), ClaimNonReceipt1.mmObject(), Case4.mmObject(), CaseAssignment4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestigationCase.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getAssignmentIdentification() {
		return assignmentIdentification;
	}

	public InvestigationCase setAssignmentIdentification(Max35Text assignmentIdentification) {
		this.assignmentIdentification = Objects.requireNonNull(assignmentIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public InvestigationCase setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public InvestigationCase setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<InvestigationCaseStatus> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public InvestigationCase setStatus(List<InvestigationCaseStatus> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<InvestigationPartyRole> getInvestigationPartyRole() {
		return investigationPartyRole == null ? investigationPartyRole = new ArrayList<>() : investigationPartyRole;
	}

	public InvestigationCase setInvestigationPartyRole(List<InvestigationPartyRole> investigationPartyRole) {
		this.investigationPartyRole = Objects.requireNonNull(investigationPartyRole);
		return this;
	}

	public Optional<DuplicateCase> getDuplicateCaseResolution() {
		return duplicateCaseResolution == null ? Optional.empty() : Optional.of(duplicateCaseResolution);
	}

	public InvestigationCase setDuplicateCaseResolution(DuplicateCase duplicateCaseResolution) {
		this.duplicateCaseResolution = duplicateCaseResolution;
		return this;
	}

	public List<InvestigationResolution> getInvestigationResolution() {
		return investigationResolution == null ? investigationResolution = new ArrayList<>() : investigationResolution;
	}

	public InvestigationCase setInvestigationResolution(List<InvestigationResolution> investigationResolution) {
		this.investigationResolution = Objects.requireNonNull(investigationResolution);
		return this;
	}

	public List<InvestigationCase> getOriginalInvestigationCase() {
		return originalInvestigationCase == null ? originalInvestigationCase = new ArrayList<>() : originalInvestigationCase;
	}

	public InvestigationCase setOriginalInvestigationCase(List<InvestigationCase> originalInvestigationCase) {
		this.originalInvestigationCase = Objects.requireNonNull(originalInvestigationCase);
		return this;
	}

	public List<InvestigationCase> getLinkedCase() {
		return linkedCase == null ? linkedCase = new ArrayList<>() : linkedCase;
	}

	public InvestigationCase setLinkedCase(List<InvestigationCase> linkedCase) {
		this.linkedCase = Objects.requireNonNull(linkedCase);
		return this;
	}

	public Optional<Reassignment> getReassignment() {
		return reassignment == null ? Optional.empty() : Optional.of(reassignment);
	}

	public InvestigationCase setReassignment(Reassignment reassignment) {
		this.reassignment = reassignment;
		return this;
	}
}