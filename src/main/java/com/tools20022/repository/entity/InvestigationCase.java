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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
	 * Uniquely identifies the case assignment.
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
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#mmIdentification
	 * CaseAssignment3.mmIdentification}</li>
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
	public static final MMBusinessAttribute mmAssignmentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CaseAssignment3.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentIdentification";
			definition = "Uniquely identifies the case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestigationCase.class.getMethod("getAssignmentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Creation date and time of the case.
	 * <p>
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
	public static final MMBusinessAttribute mmCreationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CaseAssignment3.mmCreationDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Creation date and time of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestigationCase.class.getMethod("getCreationDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Uniquely identifies the case.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmIdentification
	 * Case3.mmIdentification}</li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Case3.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestigationCase.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestigationCaseStatus> status;
	/**
	 * Specifies the status of the case together with the reason and the date
	 * and time.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmCancellationStatusReasonInformation
	 * OriginalGroupHeader5.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmCancellationStatusReasonInformation
	 * OriginalPaymentInstruction22.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmCancellationStatusReasonInformation
	 * PaymentTransaction78.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmCase
	 * OriginalPaymentInstruction20.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmCancellationStatusReasonInformation
	 * PaymentTransaction79.mmCancellationStatusReasonInformation}</li>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalGroupHeader5.mmCancellationStatusReasonInformation, OriginalPaymentInstruction22.mmCancellationStatusReasonInformation, PaymentTransaction78.mmCancellationStatusReasonInformation,
					OriginalPaymentInstruction20.mmCase, PaymentTransaction79.mmCancellationStatusReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the case together with the reason and the date and time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCaseStatus.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCaseStatus.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestigationPartyRole> investigationPartyRole;
	/**
	 * Role played by a party in the context of an investigation process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvestigationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationPartyRole";
			definition = "Role played by a party in the context of an investigation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
		}
	};
	protected DuplicateCase duplicateCaseResolution;
	/**
	 * Solution which consists in closing the case as it is a duplicate of an
	 * original one.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDuplicateCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateCaseResolution";
			definition = "Solution which consists in closing the case as it is a duplicate of an original one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmDuplicatedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestigationResolution> investigationResolution;
	/**
	 * Specifies the actions taken as a result of an investigation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmReason
	 * CancellationStatusReason2.mmReason}</li>
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
	public static final MMBusinessAssociationEnd mmInvestigationResolution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationStatusReason2.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationResolution";
			definition = "Specifies the actions taken as a result of an investigation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestigationCase> originalInvestigationCase;
	/**
	 * Original case to which another one is linked.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOriginalInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalInvestigationCase";
			definition = "Original case to which another one is linked.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmLinkedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestigationCase> linkedCase;
	/**
	 * Step in the resolution process of an investigation case. The assigned
	 * case is linked to the investigation case in the previous step.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLinkedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LinkedCase";
			definition = "Step in the resolution process of an investigation case. The assigned case is linked to the investigation case in the previous step.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmOriginalInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	protected Reassignment reassignment;
	/**
	 * Action which is taken to forward the case to another party.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmReassignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reassignment";
			definition = "Action which is taken to forward the case to another party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reassignment.mmReassignedCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal transaction flow..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationPartyRole.mmInvestigationCase, com.tools20022.repository.entity.InvestigationCase.mmOriginalInvestigationCase,
						com.tools20022.repository.entity.InvestigationCase.mmLinkedCase, com.tools20022.repository.entity.InvestigationResolution.mmInvestigationCase, com.tools20022.repository.entity.Reassignment.mmReassignedCase,
						com.tools20022.repository.entity.InvestigationCaseStatus.mmInvestigationCase, com.tools20022.repository.entity.DuplicateCase.mmDuplicatedCase);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCase.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.mmAssignmentIdentification, com.tools20022.repository.entity.InvestigationCase.mmCreationDateTime,
						com.tools20022.repository.entity.InvestigationCase.mmIdentification, com.tools20022.repository.entity.InvestigationCase.mmStatus, com.tools20022.repository.entity.InvestigationCase.mmInvestigationPartyRole,
						com.tools20022.repository.entity.InvestigationCase.mmDuplicateCaseResolution, com.tools20022.repository.entity.InvestigationCase.mmInvestigationResolution,
						com.tools20022.repository.entity.InvestigationCase.mmOriginalInvestigationCase, com.tools20022.repository.entity.InvestigationCase.mmLinkedCase, com.tools20022.repository.entity.InvestigationCase.mmReassignment);
				derivationComponent_lazy = () -> Arrays.asList(CaseAssignment3.mmObject(), Case3.mmObject());
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

	public void setAssignmentIdentification(Max35Text assignmentIdentification) {
		this.assignmentIdentification = assignmentIdentification;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public List<InvestigationCaseStatus> getStatus() {
		return status;
	}

	public void setStatus(List<com.tools20022.repository.entity.InvestigationCaseStatus> status) {
		this.status = status;
	}

	public List<InvestigationPartyRole> getInvestigationPartyRole() {
		return investigationPartyRole;
	}

	public void setInvestigationPartyRole(List<com.tools20022.repository.entity.InvestigationPartyRole> investigationPartyRole) {
		this.investigationPartyRole = investigationPartyRole;
	}

	public DuplicateCase getDuplicateCaseResolution() {
		return duplicateCaseResolution;
	}

	public void setDuplicateCaseResolution(com.tools20022.repository.entity.DuplicateCase duplicateCaseResolution) {
		this.duplicateCaseResolution = duplicateCaseResolution;
	}

	public List<InvestigationResolution> getInvestigationResolution() {
		return investigationResolution;
	}

	public void setInvestigationResolution(List<com.tools20022.repository.entity.InvestigationResolution> investigationResolution) {
		this.investigationResolution = investigationResolution;
	}

	public List<InvestigationCase> getOriginalInvestigationCase() {
		return originalInvestigationCase;
	}

	public void setOriginalInvestigationCase(List<com.tools20022.repository.entity.InvestigationCase> originalInvestigationCase) {
		this.originalInvestigationCase = originalInvestigationCase;
	}

	public List<InvestigationCase> getLinkedCase() {
		return linkedCase;
	}

	public void setLinkedCase(List<com.tools20022.repository.entity.InvestigationCase> linkedCase) {
		this.linkedCase = linkedCase;
	}

	public Reassignment getReassignment() {
		return reassignment;
	}

	public void setReassignment(com.tools20022.repository.entity.Reassignment reassignment) {
		this.reassignment = reassignment;
	}
}