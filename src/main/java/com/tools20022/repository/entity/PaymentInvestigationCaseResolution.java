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
import com.tools20022.repository.choice.InvestigationStatus3Choice;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode;
import com.tools20022.repository.entity.InvestigationResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingCover3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationStatus
 * PaymentInvestigationCaseResolution.mmInvestigationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDebitAuthorisationConfirmation
 * PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmEntryCorrection
 * PaymentInvestigationCaseResolution.mmEntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationCaseRejection
 * PaymentInvestigationCaseResolution.mmInvestigationCaseRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDuplicateCase
 * PaymentInvestigationCaseResolution.mmDuplicateCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
 * InvestigationStatus3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
 * Payment.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCaseResolution
 * CashEntry.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCaseResolution
 * PaymentExecution.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
 * CashSettlement.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmRelatedInvestigationCaseResolution
 * DebitAuthorisation.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRelatedInvestigationCaseResolution
 * PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmRelatedCaseResolution
 * DuplicateCase.mmRelatedCaseResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
 * InvestigationResolution}</li>
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
 * "PaymentInvestigationCaseResolution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of an investigation case and the actions taken as a result of this status."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCaseResolution extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestigationExecutionConfirmationCode investigationStatus;
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#mmConfirmation
	 * InvestigationStatus3Choice.mmConfirmation}</li>
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
	public static final MMBusinessAttribute mmInvestigationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus3Choice.mmConfirmation);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationStatus";
			definition = "Status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentInvestigationCaseResolution.class.getMethod("getInvestigationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitAuthorisation debitAuthorisationConfirmation;
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
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmRelatedInvestigationCaseResolution
	 * DebitAuthorisation.mmRelatedInvestigationCaseResolution}</li>
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
	public static final MMBusinessAssociationEnd mmDebitAuthorisationConfirmation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationConfirmation";
			definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
		}
	};
	protected CashSettlement coverCorrection;
	/**
	 * Elements provided to correct the cover instruction for the resolution of
	 * the claim non receipt initiated case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
	 * CashSettlement.mmRelatedInvestigationCase}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MissingCover3#mmCoverCorrection
	 * MissingCover3.mmCoverCorrection}</li>
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
	public static final MMBusinessAssociationEnd mmCoverCorrection = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(MissingCover3.mmCoverCorrection);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverCorrection";
			definition = "Elements provided to correct the cover instruction for the resolution of the claim non receipt initiated case.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> entryCorrection;
	/**
	 * The case resolution leads to the correction of a cash entry into an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCaseResolution
	 * CashEntry.mmRelatedInvestigationCaseResolution}</li>
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
	public static final MMBusinessAssociationEnd mmEntryCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntryCorrection";
			definition = "The case resolution leads to the correction of a cash entry into an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> paymentCorrection;
	/**
	 * The case resolution leads to the correction of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
	 * Payment.mmRelatedInvestigationCaseResolution}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCorrection";
			definition = "The case resolution leads to the correction of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentExecution> paymentExecutionCorrection;
	/**
	 * The case resolution leads to the correction of a payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCaseResolution
	 * PaymentExecution.mmRelatedInvestigationCaseResolution}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentExecutionCorrection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecutionCorrection";
			definition = "The case resolution leads to the correction of a payment execution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected PaymentInvestigationCaseRejection investigationCaseRejection;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#mmRelatedInvestigationCaseResolution
	 * PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution}</li>
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
	public static final MMBusinessAssociationEnd mmInvestigationCaseRejection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseRejection";
			definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DuplicateCase> duplicateCase;
	/**
	 * Outcome that results in closing a case as duplicate because the same
	 * issue has been reported by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmRelatedCaseResolution
	 * DuplicateCase.mmRelatedCaseResolution}</li>
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#mmDuplicateOf
	 * InvestigationStatus3Choice.mmDuplicateOf}</li>
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
	public static final MMBusinessAssociationEnd mmDuplicateCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus3Choice.mmDuplicateOf);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateCase";
			definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmRelatedCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseResolution";
				definition = "Specifies the status of an investigation case and the actions taken as a result of this status.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashSettlement.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.DebitAuthorisation.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.DuplicateCase.mmRelatedCaseResolution);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationStatus,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmEntryCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationCaseRejection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDuplicateCase);
				derivationComponent_lazy = () -> Arrays.asList(InvestigationStatus3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInvestigationCaseResolution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InvestigationExecutionConfirmationCode getInvestigationStatus() {
		return investigationStatus;
	}

	public void setInvestigationStatus(InvestigationExecutionConfirmationCode investigationStatus) {
		this.investigationStatus = investigationStatus;
	}

	public DebitAuthorisation getDebitAuthorisationConfirmation() {
		return debitAuthorisationConfirmation;
	}

	public void setDebitAuthorisationConfirmation(com.tools20022.repository.entity.DebitAuthorisation debitAuthorisationConfirmation) {
		this.debitAuthorisationConfirmation = debitAuthorisationConfirmation;
	}

	public CashSettlement getCoverCorrection() {
		return coverCorrection;
	}

	public void setCoverCorrection(com.tools20022.repository.entity.CashSettlement coverCorrection) {
		this.coverCorrection = coverCorrection;
	}

	public List<CashEntry> getEntryCorrection() {
		return entryCorrection;
	}

	public void setEntryCorrection(List<com.tools20022.repository.entity.CashEntry> entryCorrection) {
		this.entryCorrection = entryCorrection;
	}

	public List<Payment> getPaymentCorrection() {
		return paymentCorrection;
	}

	public void setPaymentCorrection(List<com.tools20022.repository.entity.Payment> paymentCorrection) {
		this.paymentCorrection = paymentCorrection;
	}

	public List<PaymentExecution> getPaymentExecutionCorrection() {
		return paymentExecutionCorrection;
	}

	public void setPaymentExecutionCorrection(List<com.tools20022.repository.entity.PaymentExecution> paymentExecutionCorrection) {
		this.paymentExecutionCorrection = paymentExecutionCorrection;
	}

	public PaymentInvestigationCaseRejection getInvestigationCaseRejection() {
		return investigationCaseRejection;
	}

	public void setInvestigationCaseRejection(com.tools20022.repository.entity.PaymentInvestigationCaseRejection investigationCaseRejection) {
		this.investigationCaseRejection = investigationCaseRejection;
	}

	public List<DuplicateCase> getDuplicateCase() {
		return duplicateCase;
	}

	public void setDuplicateCase(List<com.tools20022.repository.entity.DuplicateCase> duplicateCase) {
		this.duplicateCase = duplicateCase;
	}
}