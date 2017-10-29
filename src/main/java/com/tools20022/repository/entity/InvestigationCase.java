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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#AssignmentIdentification
 * InvestigationCase.AssignmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#CreationDateTime
 * InvestigationCase.CreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#Identification
 * InvestigationCase.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCase#Status
 * InvestigationCase.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#InvestigationPartyRole
 * InvestigationCase.InvestigationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#DuplicateCaseResolution
 * InvestigationCase.DuplicateCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#InvestigationResolution
 * InvestigationCase.InvestigationResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#OriginalInvestigationCase
 * InvestigationCase.OriginalInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#LinkedCase
 * InvestigationCase.LinkedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#Reassignment
 * InvestigationCase.Reassignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#InvestigationCase
 * InvestigationPartyRole.InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#OriginalInvestigationCase
 * InvestigationCase.OriginalInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#LinkedCase
 * InvestigationCase.LinkedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#InvestigationCase
 * InvestigationResolution.InvestigationCase}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reassignment#ReassignedCase
 * Reassignment.ReassignedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus#InvestigationCase
 * InvestigationCaseStatus.InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#DuplicatedCase
 * DuplicateCase.DuplicatedCase}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#Identification
	 * CaseAssignment3.Identification}</li>
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
	public static final MMBusinessAttribute AssignmentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CaseAssignment3.Identification);
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssignmentIdentification";
			definition = "Uniquely identifies the case assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#CreationDateTime
	 * CaseAssignment3.CreationDateTime}</li>
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
	public static final MMBusinessAttribute CreationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CaseAssignment3.CreationDateTime);
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Creation date and time of the case.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.Case3#Identification
	 * Case3.Identification}</li>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Case3.Identification);
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the status of the case together with the reason and the date
	 * and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus#InvestigationCase
	 * InvestigationCaseStatus.InvestigationCase}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#CancellationStatusReasonInformation
	 * OriginalGroupHeader5.CancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#CancellationStatusReasonInformation
	 * OriginalPaymentInstruction22.CancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#CancellationStatusReasonInformation
	 * PaymentTransaction78.CancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#Case
	 * OriginalPaymentInstruction20.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#CancellationStatusReasonInformation
	 * PaymentTransaction79.CancellationStatusReasonInformation}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader5.CancellationStatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction22.CancellationStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction78.CancellationStatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction20.Case,
					com.tools20022.repository.msg.PaymentTransaction79.CancellationStatusReasonInformation);
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the case together with the reason and the date and time.";
			minOccurs = 0;
			type_lazy = () -> InvestigationCaseStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCaseStatus.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of an investigation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#InvestigationCase
	 * InvestigationPartyRole.InvestigationCase}</li>
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
	public static final MMBusinessAssociationEnd InvestigationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationPartyRole";
			definition = "Role played by a party in the context of an investigation process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Solution which consists in closing the case as it is a duplicate of an
	 * original one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase#DuplicatedCase
	 * DuplicateCase.DuplicatedCase}</li>
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
	public static final MMBusinessAssociationEnd DuplicateCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateCaseResolution";
			definition = "Solution which consists in closing the case as it is a duplicate of an original one.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DuplicateCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.DuplicatedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the actions taken as a result of an investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#InvestigationCase
	 * InvestigationResolution.InvestigationCase}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#Reason
	 * CancellationStatusReason2.Reason}</li>
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
	public static final MMBusinessAssociationEnd InvestigationResolution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationStatusReason2.Reason);
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationResolution";
			definition = "Specifies the actions taken as a result of an investigation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Original case to which another one is linked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#LinkedCase
	 * InvestigationCase.LinkedCase}</li>
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
	public static final MMBusinessAssociationEnd OriginalInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalInvestigationCase";
			definition = "Original case to which another one is linked.";
			minOccurs = 0;
			type_lazy = () -> InvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.LinkedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Step in the resolution process of an investigation case. The assigned
	 * case is linked to the investigation case in the previous step.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#OriginalInvestigationCase
	 * InvestigationCase.OriginalInvestigationCase}</li>
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
	public static final MMBusinessAssociationEnd LinkedCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkedCase";
			definition = "Step in the resolution process of an investigation case. The assigned case is linked to the investigation case in the previous step.";
			minOccurs = 0;
			type_lazy = () -> InvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Action which is taken to forward the case to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment#ReassignedCase
	 * Reassignment.ReassignedCase}</li>
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
	public static final MMBusinessAssociationEnd Reassignment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reassignment";
			definition = "Action which is taken to forward the case to another party.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reassignment.ReassignedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal transaction flow..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationPartyRole.InvestigationCase, com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase,
						com.tools20022.repository.entity.InvestigationCase.LinkedCase, com.tools20022.repository.entity.InvestigationResolution.InvestigationCase, com.tools20022.repository.entity.Reassignment.ReassignedCase,
						com.tools20022.repository.entity.InvestigationCaseStatus.InvestigationCase, com.tools20022.repository.entity.DuplicateCase.DuplicatedCase);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCase.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.AssignmentIdentification, com.tools20022.repository.entity.InvestigationCase.CreationDateTime,
						com.tools20022.repository.entity.InvestigationCase.Identification, com.tools20022.repository.entity.InvestigationCase.Status, com.tools20022.repository.entity.InvestigationCase.InvestigationPartyRole,
						com.tools20022.repository.entity.InvestigationCase.DuplicateCaseResolution, com.tools20022.repository.entity.InvestigationCase.InvestigationResolution,
						com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase, com.tools20022.repository.entity.InvestigationCase.LinkedCase, com.tools20022.repository.entity.InvestigationCase.Reassignment);
				derivationComponent_lazy = () -> Arrays.asList(CaseAssignment3.mmObject(), Case3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}