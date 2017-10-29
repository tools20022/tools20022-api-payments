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
import com.tools20022.repository.choice.InvestigationStatus3Choice;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode;
import com.tools20022.repository.entity.InvestigationResolution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an investigation case and the actions taken as a
 * result of this status.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInvestigationCaseResolution"
 * src="doc-files/PaymentInvestigationCaseResolution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#InvestigationStatus
 * PaymentInvestigationCaseResolution.InvestigationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#DebitAuthorisationConfirmation
 * PaymentInvestigationCaseResolution.DebitAuthorisationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#CoverCorrection
 * PaymentInvestigationCaseResolution.CoverCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#EntryCorrection
 * PaymentInvestigationCaseResolution.EntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentCorrection
 * PaymentInvestigationCaseResolution.PaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.PaymentExecutionCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#InvestigationCaseRejection
 * PaymentInvestigationCaseResolution.InvestigationCaseRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#DuplicateCase
 * PaymentInvestigationCaseResolution.DuplicateCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCaseResolution
 * Payment.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCaseResolution
 * CashEntry.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCaseResolution
 * PaymentExecution.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedInvestigationCase
 * CashSettlement.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#RelatedInvestigationCaseResolution
 * DebitAuthorisation.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RelatedInvestigationCaseResolution
 * PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#RelatedCaseResolution
 * DuplicateCase.RelatedCaseResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
 * InvestigationResolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
 * InvestigationStatus3Choice}</li>
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
 * "PaymentInvestigationCaseResolution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of an investigation case and the actions taken as a result of this status."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCaseResolution extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode
	 * InvestigationExecutionConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#Confirmation
	 * InvestigationStatus3Choice.Confirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestigationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus3Choice.Confirmation);
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationStatus";
			definition = "Status of the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
		}
	};
	/**
	 * Permission given by an account owner to debit its account as the result
	 * of a cancelled payment. The authoriser is the party whose account was
	 * credited as the result of a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#RelatedInvestigationCaseResolution
	 * DebitAuthorisation.RelatedInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAuthorisationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DebitAuthorisationConfirmation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationConfirmation";
			definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DebitAuthorisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Elements provided to correct the cover instruction for the resolution of
	 * the claim non receipt initiated case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedInvestigationCase
	 * CashSettlement.RelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MissingCover3#CoverCorrection
	 * MissingCover3.CoverCorrection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverCorrection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements provided to correct the cover instruction for the resolution of the claim non receipt initiated case."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CoverCorrection = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MissingCover3.CoverCorrection);
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverCorrection";
			definition = "Elements provided to correct the cover instruction for the resolution of the claim non receipt initiated case.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The case resolution leads to the correction of a cash entry into an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCaseResolution
	 * CashEntry.RelatedInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryCorrection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The case resolution leads to the correction of a cash entry into an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EntryCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryCorrection";
			definition = "The case resolution leads to the correction of a cash entry into an account.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The case resolution leads to the correction of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCaseResolution
	 * Payment.RelatedInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCorrection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The case resolution leads to the correction of a payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCorrection";
			definition = "The case resolution leads to the correction of a payment.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The case resolution leads to the correction of a payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCaseResolution
	 * PaymentExecution.RelatedInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutionCorrection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The case resolution leads to the correction of a payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentExecutionCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecutionCorrection";
			definition = "The case resolution leads to the correction of a payment execution.";
			minOccurs = 0;
			type_lazy = () -> PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the rejection of an activity linked to a payment. The rejected
	 * activity may be the assignment of an investigation case, the cancellation
	 * or the modification of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RelatedInvestigationCaseResolution
	 * PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection
	 * PaymentInvestigationCaseRejection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationCaseRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestigationCaseRejection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseRejection";
			definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Outcome that results in closing a case as duplicate because the same
	 * issue has been reported by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase#RelatedCaseResolution
	 * DuplicateCase.RelatedCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DuplicateCase
	 * DuplicateCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#DuplicateOf
	 * InvestigationStatus3Choice.DuplicateOf}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Outcome that results in closing a case as duplicate because the same issue has been reported by another party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DuplicateCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus3Choice.DuplicateOf);
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateCase";
			definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.RelatedCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseResolution";
				definition = "Specifies the status of an investigation case and the actions taken as a result of this status.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase,
						com.tools20022.repository.entity.DebitAuthorisation.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.DuplicateCase.RelatedCaseResolution);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationStatus, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DebitAuthorisationConfirmation,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DuplicateCase);
				derivationComponent_lazy = () -> Arrays.asList(InvestigationStatus3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}