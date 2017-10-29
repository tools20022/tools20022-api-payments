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
import com.tools20022.repository.codeset.CaseAssignmentRejectionCode;
import com.tools20022.repository.codeset.InvestigationRejectionCode;
import com.tools20022.repository.codeset.PaymentCancellationRejectionCode;
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.InvestigationRejectionJustification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RejectedModification
 * PaymentInvestigationCaseRejection.RejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RejectedCancellation
 * PaymentInvestigationCaseRejection.RejectedCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RejectedCancellationReason
 * PaymentInvestigationCaseRejection.RejectedCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#AssignmentCancellationConfirmation
 * PaymentInvestigationCaseRejection.AssignmentCancellationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RejectionReason
 * PaymentInvestigationCaseRejection.RejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RelatedInvestigationCaseResolution
 * PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#InvestigationRejection
 * PaymentInvestigationCaseRejection.InvestigationRejection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#InvestigationCaseRejection
 * PaymentInvestigationCaseResolution.InvestigationCaseRejection}</li>
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
	/**
	 * Reason for the rejection of a modification request.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#RejectedModification
	 * InvestigationStatus3Choice.RejectedModification}</li>
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
	public static final MMBusinessAttribute RejectedModification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus3Choice.RejectedModification);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
		}
	};
	/**
	 * Justification for the rejection of the cancellation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice#Code
	 * CancellationStatusReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice#Proprietary
	 * CancellationStatusReason2Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute RejectedCancellation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationStatusReason2Choice.Code, com.tools20022.repository.choice.CancellationStatusReason2Choice.Proprietary);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellation";
			definition = "Justification for the rejection of the cancellation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentCancellationRejectionCode.mmObject();
		}
	};
	/**
	 * Free text justification for rejecting a cancellation.
	 * <p>
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
	public static final MMBusinessAttribute RejectedCancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationReason";
			definition = "Free text justification for rejecting a cancellation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * If yes, it means the cancellation of the assignment is confirmed. If no,
	 * it means the cancellation of the assignment is rejected and the
	 * investigation process will continue.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#AssignmentCancellationConfirmation
	 * InvestigationStatus3Choice.AssignmentCancellationConfirmation}</li>
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
	public static final MMBusinessAttribute AssignmentCancellationConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus3Choice.AssignmentCancellationConfirmation);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reason for the rejection of a case assignment, in a coded form.
	 * <p>
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
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason for the rejection of a case assignment, in a coded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CaseAssignmentRejectionCode.mmObject();
		}
	};
	/**
	 * Resolution which consists in rejecting the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#InvestigationCaseRejection
	 * PaymentInvestigationCaseResolution.InvestigationCaseRejection}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Resolution which consists in rejecting the case.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for the rejection of a case assignment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1#RejectionReason
	 * InvestigationRejectionJustification1.RejectionReason}</li>
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
	public static final MMBusinessAttribute InvestigationRejection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestigationRejectionJustification1.RejectionReason);
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationRejection";
			definition = "Reason for the rejection of a case assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestigationRejectionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseRejection";
				definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedModification, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedCancellation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedCancellationReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.AssignmentCancellationConfirmation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectionReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.InvestigationRejection);
				derivationComponent_lazy = () -> Arrays.asList(InvestigationRejectionJustification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}