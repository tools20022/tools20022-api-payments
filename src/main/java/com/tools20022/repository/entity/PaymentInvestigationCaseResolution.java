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
import com.tools20022.repository.choice.InvestigationStatus4Choice;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingCover3;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
 * InvestigationResolution}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice
 * InvestigationStatus4Choice}</li>
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
	protected InvestigationExecutionConfirmationCode investigationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice#mmConfirmation
	 * InvestigationStatus4Choice.mmConfirmation}</li>
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
	public static final MMBusinessAttribute<PaymentInvestigationCaseResolution, InvestigationExecutionConfirmationCode> mmInvestigationStatus = new MMBusinessAttribute<PaymentInvestigationCaseResolution, InvestigationExecutionConfirmationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus4Choice.mmConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationStatus";
			definition = "Status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
		}

		@Override
		public InvestigationExecutionConfirmationCode getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getInvestigationStatus();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, InvestigationExecutionConfirmationCode value) {
			obj.setInvestigationStatus(value);
		}
	};
	protected DebitAuthorisation debitAuthorisationConfirmation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, Optional<DebitAuthorisation>> mmDebitAuthorisationConfirmation = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, Optional<DebitAuthorisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationConfirmation";
			definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DebitAuthorisation.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DebitAuthorisation.mmObject();
		}

		@Override
		public Optional<DebitAuthorisation> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getDebitAuthorisationConfirmation();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, Optional<DebitAuthorisation> value) {
			obj.setDebitAuthorisationConfirmation(value.orElse(null));
		}
	};
	protected CashSettlement coverCorrection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, Optional<CashSettlement>> mmCoverCorrection = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, Optional<CashSettlement>>() {
		{
			derivation_lazy = () -> Arrays.asList(MissingCover3.mmCoverCorrection);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverCorrection";
			definition = "Elements provided to correct the cover instruction for the resolution of the claim non receipt initiated case.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashSettlement.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}

		@Override
		public Optional<CashSettlement> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getCoverCorrection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, Optional<CashSettlement> value) {
			obj.setCoverCorrection(value.orElse(null));
		}
	};
	protected List<CashEntry> entryCorrection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<CashEntry>> mmEntryCorrection = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<CashEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntryCorrection";
			definition = "The case resolution leads to the correction of a cash entry into an account.";
			minOccurs = 0;
			opposite_lazy = () -> CashEntry.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getEntryCorrection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, List<CashEntry> value) {
			obj.setEntryCorrection(value);
		}
	};
	protected List<Payment> paymentCorrection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<Payment>> mmPaymentCorrection = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCorrection";
			definition = "The case resolution leads to the correction of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getPaymentCorrection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, List<Payment> value) {
			obj.setPaymentCorrection(value);
		}
	};
	protected List<PaymentExecution> paymentExecutionCorrection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<PaymentExecution>> mmPaymentExecutionCorrection = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<PaymentExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecutionCorrection";
			definition = "The case resolution leads to the correction of a payment execution.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentExecution.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}

		@Override
		public List<PaymentExecution> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getPaymentExecutionCorrection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, List<PaymentExecution> value) {
			obj.setPaymentExecutionCorrection(value);
		}
	};
	protected PaymentInvestigationCaseRejection investigationCaseRejection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, PaymentInvestigationCaseRejection> mmInvestigationCaseRejection = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, PaymentInvestigationCaseRejection>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseRejection";
			definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
		}

		@Override
		public PaymentInvestigationCaseRejection getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getInvestigationCaseRejection();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, PaymentInvestigationCaseRejection value) {
			obj.setInvestigationCaseRejection(value);
		}
	};
	protected List<com.tools20022.repository.entity.DuplicateCase> duplicateCase;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice#mmDuplicateOf
	 * InvestigationStatus4Choice.mmDuplicateOf}</li>
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
	public static final MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<DuplicateCase>> mmDuplicateCase = new MMBusinessAssociationEnd<PaymentInvestigationCaseResolution, List<DuplicateCase>>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestigationStatus4Choice.mmDuplicateOf);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateCase";
			definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmRelatedCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
		}

		@Override
		public List<DuplicateCase> getValue(PaymentInvestigationCaseResolution obj) {
			return obj.getDuplicateCase();
		}

		@Override
		public void setValue(PaymentInvestigationCaseResolution obj, List<DuplicateCase> value) {
			obj.setDuplicateCase(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseResolution";
				definition = "Specifies the status of an investigation case and the actions taken as a result of this status.";
				associationDomain_lazy = () -> Arrays.asList(Payment.mmRelatedInvestigationCaseResolution, CashEntry.mmRelatedInvestigationCaseResolution, PaymentExecution.mmRelatedInvestigationCaseResolution,
						CashSettlement.mmRelatedInvestigationCase, DebitAuthorisation.mmRelatedInvestigationCaseResolution, PaymentInvestigationCaseRejection.mmRelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.DuplicateCase.mmRelatedCaseResolution);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationStatus,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmEntryCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmInvestigationCaseRejection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDuplicateCase);
				derivationComponent_lazy = () -> Arrays.asList(InvestigationStatus4Choice.mmObject());
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

	public PaymentInvestigationCaseResolution setInvestigationStatus(InvestigationExecutionConfirmationCode investigationStatus) {
		this.investigationStatus = Objects.requireNonNull(investigationStatus);
		return this;
	}

	public Optional<DebitAuthorisation> getDebitAuthorisationConfirmation() {
		return debitAuthorisationConfirmation == null ? Optional.empty() : Optional.of(debitAuthorisationConfirmation);
	}

	public PaymentInvestigationCaseResolution setDebitAuthorisationConfirmation(DebitAuthorisation debitAuthorisationConfirmation) {
		this.debitAuthorisationConfirmation = debitAuthorisationConfirmation;
		return this;
	}

	public Optional<CashSettlement> getCoverCorrection() {
		return coverCorrection == null ? Optional.empty() : Optional.of(coverCorrection);
	}

	public PaymentInvestigationCaseResolution setCoverCorrection(CashSettlement coverCorrection) {
		this.coverCorrection = coverCorrection;
		return this;
	}

	public List<CashEntry> getEntryCorrection() {
		return entryCorrection == null ? entryCorrection = new ArrayList<>() : entryCorrection;
	}

	public PaymentInvestigationCaseResolution setEntryCorrection(List<CashEntry> entryCorrection) {
		this.entryCorrection = Objects.requireNonNull(entryCorrection);
		return this;
	}

	public List<Payment> getPaymentCorrection() {
		return paymentCorrection == null ? paymentCorrection = new ArrayList<>() : paymentCorrection;
	}

	public PaymentInvestigationCaseResolution setPaymentCorrection(List<Payment> paymentCorrection) {
		this.paymentCorrection = Objects.requireNonNull(paymentCorrection);
		return this;
	}

	public List<PaymentExecution> getPaymentExecutionCorrection() {
		return paymentExecutionCorrection == null ? paymentExecutionCorrection = new ArrayList<>() : paymentExecutionCorrection;
	}

	public PaymentInvestigationCaseResolution setPaymentExecutionCorrection(List<PaymentExecution> paymentExecutionCorrection) {
		this.paymentExecutionCorrection = Objects.requireNonNull(paymentExecutionCorrection);
		return this;
	}

	public PaymentInvestigationCaseRejection getInvestigationCaseRejection() {
		return investigationCaseRejection;
	}

	public PaymentInvestigationCaseResolution setInvestigationCaseRejection(PaymentInvestigationCaseRejection investigationCaseRejection) {
		this.investigationCaseRejection = Objects.requireNonNull(investigationCaseRejection);
		return this;
	}

	public List<DuplicateCase> getDuplicateCase() {
		return duplicateCase == null ? duplicateCase = new ArrayList<>() : duplicateCase;
	}

	public PaymentInvestigationCaseResolution setDuplicateCase(List<com.tools20022.repository.entity.DuplicateCase> duplicateCase) {
		this.duplicateCase = Objects.requireNonNull(duplicateCase);
		return this;
	}
}