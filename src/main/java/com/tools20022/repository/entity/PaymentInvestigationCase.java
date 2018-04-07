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
import com.tools20022.repository.codeset.CancellationReasonCode;
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode;
import com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingCover3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Set of activities performed to handle an exception to a normal payment
 * transaction flow, such as: - a payment has not been received. - a payment has
 * been received but is incorrect. - a payment must be corrected or cancelled
 * (requested by the party which ordered the payment).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInvestigationCase"
 * src="doc-files/PaymentInvestigationCase.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmPaymentStatus
 * PaymentInvestigationCase.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmCancellationReason
 * PaymentInvestigationCase.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmMissingCoverIndication
 * PaymentInvestigationCase.mmMissingCoverIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingCashEntry
 * PaymentInvestigationCase.mmUnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmIncorrectInformationReason
 * PaymentInvestigationCase.mmIncorrectInformationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmMissingInformationReason
 * PaymentInvestigationCase.mmMissingInformationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmCaseType
 * PaymentInvestigationCase.mmCaseType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
 * Payment.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCase
 * CashEntry.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
 * PaymentExecution.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmRelatedInvestigationCase
 * PaymentStatus.mmRelatedInvestigationCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MissingCover3 MissingCover3}</li>
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
 * "PaymentInvestigationCase"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of activities performed to handle an exception to a normal payment transaction flow, such as: - a payment has not been received. - a payment has been received but is incorrect. - a payment must be corrected or cancelled (requested by the party which ordered the payment)."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCase extends InvestigationCase {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.PaymentStatus> paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmRelatedInvestigationCase
	 * PaymentStatus.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a payment which is the reason or the result of an investigation case."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInvestigationCase, List<PaymentStatus>> mmPaymentStatus = new MMBusinessAssociationEnd<PaymentInvestigationCase, List<PaymentStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of a payment which is the reason or the result of an investigation case.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}

		@Override
		public List<PaymentStatus> getValue(PaymentInvestigationCase obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, List<PaymentStatus> value) {
			obj.setPaymentStatus(value);
		}
	};
	protected CancellationReasonCode cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reason for cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCase, CancellationReasonCode> mmCancellationReason = new MMBusinessAttribute<PaymentInvestigationCase, CancellationReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Indicates the reason for cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}

		@Override
		public CancellationReasonCode getValue(PaymentInvestigationCase obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, CancellationReasonCode value) {
			obj.setCancellationReason(value);
		}
	};
	protected List<Payment> underlyingPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
	 * Payment.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the end to end payment which is the subject of the investigation"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInvestigationCase, List<Payment>> mmUnderlyingPayment = new MMBusinessAssociationEnd<PaymentInvestigationCase, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPayment";
			definition = "Identifies the end to end payment which is the subject of the investigation";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(PaymentInvestigationCase obj) {
			return obj.getUnderlyingPayment();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, List<Payment> value) {
			obj.setUnderlyingPayment(value);
		}
	};
	protected YesNoIndicator missingCoverIndication;
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
	 * {@linkplain com.tools20022.repository.msg.MissingCover3#mmMissingCoverIndicator
	 * MissingCover3.mmMissingCoverIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCoverIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the claim is related to a missing cover."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCase, YesNoIndicator> mmMissingCoverIndication = new MMBusinessAttribute<PaymentInvestigationCase, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(MissingCover3.mmMissingCoverIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCoverIndication";
			definition = "Indicates whether or not the claim is related to a missing cover.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PaymentInvestigationCase obj) {
			return obj.getMissingCoverIndication();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, YesNoIndicator value) {
			obj.setMissingCoverIndication(value);
		}
	};
	protected PaymentExecution underlyingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
	 * PaymentExecution.mmRelatedInvestigationCase}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment instruction under investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInvestigationCase, PaymentExecution> mmUnderlyingInstruction = new MMBusinessAssociationEnd<PaymentInvestigationCase, PaymentExecution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingInstruction";
			definition = "Identifies the payment instruction under investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentExecution.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}

		@Override
		public PaymentExecution getValue(PaymentInvestigationCase obj) {
			return obj.getUnderlyingInstruction();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, PaymentExecution value) {
			obj.setUnderlyingInstruction(value);
		}
	};
	protected List<CashEntry> underlyingCashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCase
	 * CashEntry.mmRelatedInvestigationCase}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the cash entry under investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInvestigationCase, List<CashEntry>> mmUnderlyingCashEntry = new MMBusinessAssociationEnd<PaymentInvestigationCase, List<CashEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingCashEntry";
			definition = "Identifies the cash entry under investigation.";
			minOccurs = 0;
			opposite_lazy = () -> CashEntry.mmRelatedInvestigationCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(PaymentInvestigationCase obj) {
			return obj.getUnderlyingCashEntry();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, List<CashEntry> value) {
			obj.setUnderlyingCashEntry(value);
		}
	};
	protected UnableToApplyIncorrectInfoCode incorrectInformationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInformationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates, in a coded form, the incorrect information."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCase, UnableToApplyIncorrectInfoCode> mmIncorrectInformationReason = new MMBusinessAttribute<PaymentInvestigationCase, UnableToApplyIncorrectInfoCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectInformationReason";
			definition = "Indicates, in a coded form, the incorrect information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnableToApplyIncorrectInfoCode.mmObject();
		}

		@Override
		public UnableToApplyIncorrectInfoCode getValue(PaymentInvestigationCase obj) {
			return obj.getIncorrectInformationReason();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, UnableToApplyIncorrectInfoCode value) {
			obj.setIncorrectInformationReason(value);
		}
	};
	protected UnableToApplyMissingInformationV2Code missingInformationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the missing information."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCase, UnableToApplyMissingInformationV2Code> mmMissingInformationReason = new MMBusinessAttribute<PaymentInvestigationCase, UnableToApplyMissingInformationV2Code>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInformationReason";
			definition = "Indicates the missing information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
		}

		@Override
		public UnableToApplyMissingInformationV2Code getValue(PaymentInvestigationCase obj) {
			return obj.getMissingInformationReason();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, UnableToApplyMissingInformationV2Code value) {
			obj.setMissingInformationReason(value);
		}
	};
	protected Max35Text caseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of investigation case."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInvestigationCase, Max35Text> mmCaseType = new MMBusinessAttribute<PaymentInvestigationCase, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CaseType";
			definition = "Specifies the type of investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentInvestigationCase obj) {
			return obj.getCaseType();
		}

		@Override
		public void setValue(PaymentInvestigationCase obj, Max35Text value) {
			obj.setCaseType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal payment transaction flow, such as: - a payment has not been received. - a payment has been received but is incorrect. - a payment must be corrected or cancelled (requested by the party which ordered the payment).";
				associationDomain_lazy = () -> Arrays.asList(Payment.mmRelatedInvestigationCase, CashEntry.mmRelatedInvestigationCase, PaymentExecution.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentStatus.mmRelatedInvestigationCase);
				superType_lazy = () -> InvestigationCase.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCase.mmPaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.mmCancellationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingPayment, com.tools20022.repository.entity.PaymentInvestigationCase.mmMissingCoverIndication,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingCashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmIncorrectInformationReason, com.tools20022.repository.entity.PaymentInvestigationCase.mmMissingInformationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmCaseType);
				derivationComponent_lazy = () -> Arrays.asList(MissingCover3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInvestigationCase.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<PaymentStatus> getPaymentStatus() {
		return paymentStatus == null ? paymentStatus = new ArrayList<>() : paymentStatus;
	}

	public PaymentInvestigationCase setPaymentStatus(List<com.tools20022.repository.entity.PaymentStatus> paymentStatus) {
		this.paymentStatus = Objects.requireNonNull(paymentStatus);
		return this;
	}

	public CancellationReasonCode getCancellationReason() {
		return cancellationReason;
	}

	public PaymentInvestigationCase setCancellationReason(CancellationReasonCode cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public List<Payment> getUnderlyingPayment() {
		return underlyingPayment == null ? underlyingPayment = new ArrayList<>() : underlyingPayment;
	}

	public PaymentInvestigationCase setUnderlyingPayment(List<Payment> underlyingPayment) {
		this.underlyingPayment = Objects.requireNonNull(underlyingPayment);
		return this;
	}

	public YesNoIndicator getMissingCoverIndication() {
		return missingCoverIndication;
	}

	public PaymentInvestigationCase setMissingCoverIndication(YesNoIndicator missingCoverIndication) {
		this.missingCoverIndication = Objects.requireNonNull(missingCoverIndication);
		return this;
	}

	public PaymentExecution getUnderlyingInstruction() {
		return underlyingInstruction;
	}

	public PaymentInvestigationCase setUnderlyingInstruction(PaymentExecution underlyingInstruction) {
		this.underlyingInstruction = Objects.requireNonNull(underlyingInstruction);
		return this;
	}

	public List<CashEntry> getUnderlyingCashEntry() {
		return underlyingCashEntry == null ? underlyingCashEntry = new ArrayList<>() : underlyingCashEntry;
	}

	public PaymentInvestigationCase setUnderlyingCashEntry(List<CashEntry> underlyingCashEntry) {
		this.underlyingCashEntry = Objects.requireNonNull(underlyingCashEntry);
		return this;
	}

	public UnableToApplyIncorrectInfoCode getIncorrectInformationReason() {
		return incorrectInformationReason;
	}

	public PaymentInvestigationCase setIncorrectInformationReason(UnableToApplyIncorrectInfoCode incorrectInformationReason) {
		this.incorrectInformationReason = Objects.requireNonNull(incorrectInformationReason);
		return this;
	}

	public UnableToApplyMissingInformationV2Code getMissingInformationReason() {
		return missingInformationReason;
	}

	public PaymentInvestigationCase setMissingInformationReason(UnableToApplyMissingInformationV2Code missingInformationReason) {
		this.missingInformationReason = Objects.requireNonNull(missingInformationReason);
		return this;
	}

	public Max35Text getCaseType() {
		return caseType;
	}

	public PaymentInvestigationCase setCaseType(Max35Text caseType) {
		this.caseType = Objects.requireNonNull(caseType);
		return this;
	}
}