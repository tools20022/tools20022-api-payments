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
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how a payment must be processed, for instance through which
 * specific clearing channel.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentProcessing" src="doc-files/PaymentProcessing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
 * PaymentProcessing.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
 * PaymentProcessing.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmClearingChannel
 * PaymentProcessing.mmClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
 * PaymentProcessing.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
 * PaymentProcessing.mmCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
 * PaymentProcessing.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmSequenceType
 * PaymentProcessing.mmSequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
 * PaymentProcessing.mmRelatedMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmBankTransaction
 * PaymentProcessing.mmBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmContactPoint
 * PaymentProcessing.mmContactPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedPayment
 * ContactPoint.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
 * PaymentExecution.mmProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedPayment
 * BankTransaction.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
 * ServiceLevel.mmPaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
 * DirectDebitMandate.mmMandatePaymentType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
 * LocalInstrument2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
 * PaymentTypeInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation24
 * PaymentTypeInformation24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
 * PaymentTypeInformation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTypeInformation21
 * PaymentTypeInformation21}</li>
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
 * "PaymentProcessing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how a payment must be processed, for instance through which specific clearing channel."
 * </li>
 * </ul>
 */
public class PaymentProcessing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmInstructionPriority
	 * PaymentTypeInformation19.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmInstructionPriority
	 * PaymentTypeInformation24.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmInstructionPriority
	 * PaymentTypeInformation25.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmInstructionPriority
	 * PaymentTypeInformation21.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmSettlementPriority
	 * DirectDebitTransactionInformation15.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmSettlementPriority
	 * DirectDebitTransactionInformation21.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmSettlementPriority
	 * PaymentTransaction87.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmSettlementPriority
	 * CreditTransferTransaction31.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmSettlementPriority
	 * PaymentTransaction88.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmSettlementPriority
	 * CreditTransferTransaction30.mmSettlementPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, PriorityCode> mmPriority = new MMBusinessAttribute<PaymentProcessing, PriorityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation19.mmInstructionPriority, PaymentTypeInformation24.mmInstructionPriority, PaymentTypeInformation25.mmInstructionPriority,
					PaymentTypeInformation21.mmInstructionPriority, DirectDebitTransactionInformation15.mmSettlementPriority, DirectDebitTransactionInformation21.mmSettlementPriority, PaymentTransaction87.mmSettlementPriority,
					CreditTransferTransaction31.mmSettlementPriority, PaymentTransaction88.mmSettlementPriority, CreditTransferTransaction30.mmSettlementPriority);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(PaymentProcessing obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentProcessing obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};
	protected ServiceLevel serviceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
	 * ServiceLevel.mmPaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ServiceLevel
	 * ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmServiceLevel
	 * PaymentTypeInformation19.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmServiceLevel
	 * PaymentTypeInformation24.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmServiceLevel
	 * PaymentTypeInformation25.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmServiceLevel
	 * PaymentTypeInformation21.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmServiceLevel
	 * MandateTypeInformation2.mmServiceLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<ServiceLevel>> mmServiceLevel = new MMBusinessAssociationEnd<PaymentProcessing, Optional<ServiceLevel>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation19.mmServiceLevel, PaymentTypeInformation24.mmServiceLevel, PaymentTypeInformation25.mmServiceLevel, PaymentTypeInformation21.mmServiceLevel,
					MandateTypeInformation2.mmServiceLevel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ServiceLevel.mmPaymentProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ServiceLevel.mmObject();
		}

		@Override
		public Optional<ServiceLevel> getValue(PaymentProcessing obj) {
			return obj.getServiceLevel();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<ServiceLevel> value) {
			obj.setServiceLevel(value.orElse(null));
		}
	};
	protected ClearingChannelCode clearingChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmClearingChannel
	 * PaymentTypeInformation25.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmClearingChannel
	 * PaymentTypeInformation21.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation2#mmClearingChannel
	 * ResolutionInformation2.mmClearingChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, ClearingChannelCode> mmClearingChannel = new MMBusinessAttribute<PaymentProcessing, ClearingChannelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation25.mmClearingChannel, PaymentTypeInformation21.mmClearingChannel, ResolutionInformation2.mmClearingChannel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}

		@Override
		public ClearingChannelCode getValue(PaymentProcessing obj) {
			return obj.getClearingChannel();
		}

		@Override
		public void setValue(PaymentProcessing obj, ClearingChannelCode value) {
			obj.setClearingChannel(value);
		}
	};
	protected ExternalCode localInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ExternalCode
	 * ExternalCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#mmCode
	 * LocalInstrument2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#mmProprietary
	 * LocalInstrument2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmLocalInstrument
	 * PaymentTypeInformation19.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmLocalInstrument
	 * PaymentTypeInformation24.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmLocalInstrument
	 * PaymentTypeInformation25.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmLocalInstrument
	 * PaymentTypeInformation21.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmLocalInstrument
	 * EntryTransaction9.mmLocalInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, ExternalCode> mmLocalInstrument = new MMBusinessAttribute<PaymentProcessing, ExternalCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LocalInstrument2Choice.mmCode, LocalInstrument2Choice.mmProprietary, PaymentTypeInformation19.mmLocalInstrument, PaymentTypeInformation24.mmLocalInstrument,
					PaymentTypeInformation25.mmLocalInstrument, PaymentTypeInformation21.mmLocalInstrument, EntryTransaction9.mmLocalInstrument);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}

		@Override
		public ExternalCode getValue(PaymentProcessing obj) {
			return obj.getLocalInstrument();
		}

		@Override
		public void setValue(PaymentProcessing obj, ExternalCode value) {
			obj.setLocalInstrument(value);
		}
	};
	protected PaymentCategoryPurposeCode categoryPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#mmCode
	 * CategoryPurpose1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#mmProprietary
	 * CategoryPurpose1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmCategoryPurpose
	 * PaymentTypeInformation19.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmCategoryPurpose
	 * PaymentTypeInformation24.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmCategoryPurpose
	 * PaymentTypeInformation25.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#mmCategoryPurpose
	 * PaymentTypeInformation21.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPurpose
	 * DirectDebitTransactionInformation21.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmCategoryPurpose
	 * MandateTypeInformation2.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#mmCode
	 * MandateClassification1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#mmProprietary
	 * MandateClassification1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPurpose
	 * DirectDebitTransactionInformation22.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, PaymentCategoryPurposeCode> mmCategoryPurpose = new MMBusinessAttribute<PaymentProcessing, PaymentCategoryPurposeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CategoryPurpose1Choice.mmCode, CategoryPurpose1Choice.mmProprietary, PaymentTypeInformation19.mmCategoryPurpose, PaymentTypeInformation24.mmCategoryPurpose,
					PaymentTypeInformation25.mmCategoryPurpose, PaymentTypeInformation21.mmCategoryPurpose, DirectDebitTransactionInformation21.mmPurpose, MandateTypeInformation2.mmCategoryPurpose, MandateClassification1Choice.mmCode,
					MandateClassification1Choice.mmProprietary, DirectDebitTransactionInformation22.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}

		@Override
		public PaymentCategoryPurposeCode getValue(PaymentProcessing obj) {
			return obj.getCategoryPurpose();
		}

		@Override
		public void setValue(PaymentProcessing obj, PaymentCategoryPurposeCode value) {
			obj.setCategoryPurpose(value);
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which processing parameters are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<PaymentExecution>> mmPaymentExecution = new MMBusinessAssociationEnd<PaymentProcessing, Optional<PaymentExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentExecution.mmProcessingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}

		@Override
		public Optional<PaymentExecution> getValue(PaymentProcessing obj) {
			return obj.getPaymentExecution();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<PaymentExecution> value) {
			obj.setPaymentExecution(value.orElse(null));
		}
	};
	protected SequenceTypeCode sequenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#mmSequenceType
	 * PaymentTypeInformation24.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#mmSequenceType
	 * PaymentTypeInformation25.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmSequenceType
	 * MandateOccurrences4.mmSequenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment sequence where applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentProcessing, SequenceTypeCode> mmSequenceType = new MMBusinessAttribute<PaymentProcessing, SequenceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation24.mmSequenceType, PaymentTypeInformation25.mmSequenceType, MandateOccurrences4.mmSequenceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}

		@Override
		public SequenceTypeCode getValue(PaymentProcessing obj) {
			return obj.getSequenceType();
		}

		@Override
		public void setValue(PaymentProcessing obj, SequenceTypeCode value) {
			obj.setSequenceType(value);
		}
	};
	protected DirectDebitMandate relatedMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
	 * DirectDebitMandate.mmMandatePaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate for which payment processing parametres are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, Optional<DirectDebitMandate>> mmRelatedMandate = new MMBusinessAssociationEnd<PaymentProcessing, Optional<DirectDebitMandate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DirectDebitMandate.mmMandatePaymentType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DirectDebitMandate.mmObject();
		}

		@Override
		public Optional<DirectDebitMandate> getValue(PaymentProcessing obj) {
			return obj.getRelatedMandate();
		}

		@Override
		public void setValue(PaymentProcessing obj, Optional<DirectDebitMandate> value) {
			obj.setRelatedMandate(value.orElse(null));
		}
	};
	protected List<BankTransaction> bankTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedPayment
	 * BankTransaction.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code of the underlying bank transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, List<BankTransaction>> mmBankTransaction = new MMBusinessAssociationEnd<PaymentProcessing, List<BankTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			opposite_lazy = () -> BankTransaction.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}

		@Override
		public List<BankTransaction> getValue(PaymentProcessing obj) {
			return obj.getBankTransaction();
		}

		@Override
		public void setValue(PaymentProcessing obj, List<BankTransaction> value) {
			obj.setBankTransaction(value);
		}
	};
	protected List<ContactPoint> contactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedPayment
	 * ContactPoint.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the notification method to be used to inform the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentProcessing, List<ContactPoint>> mmContactPoint = new MMBusinessAssociationEnd<PaymentProcessing, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(PaymentProcessing obj) {
			return obj.getContactPoint();
		}

		@Override
		public void setValue(PaymentProcessing obj, List<ContactPoint> value) {
			obj.setContactPoint(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(ContactPoint.mmRelatedPayment, PaymentExecution.mmProcessingInstructions, BankTransaction.mmRelatedPayment, ServiceLevel.mmPaymentProcessing,
						DirectDebitMandate.mmMandatePaymentType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.mmPriority, com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel,
						com.tools20022.repository.entity.PaymentProcessing.mmClearingChannel, com.tools20022.repository.entity.PaymentProcessing.mmLocalInstrument, com.tools20022.repository.entity.PaymentProcessing.mmCategoryPurpose,
						com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution, com.tools20022.repository.entity.PaymentProcessing.mmSequenceType, com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate,
						com.tools20022.repository.entity.PaymentProcessing.mmBankTransaction, com.tools20022.repository.entity.PaymentProcessing.mmContactPoint);
				derivationComponent_lazy = () -> Arrays.asList(LocalInstrument2Choice.mmObject(), PaymentTypeInformation19.mmObject(), PaymentTypeInformation24.mmObject(), PaymentTypeInformation25.mmObject(),
						PaymentTypeInformation21.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentProcessing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public PaymentProcessing setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public Optional<ServiceLevel> getServiceLevel() {
		return serviceLevel == null ? Optional.empty() : Optional.of(serviceLevel);
	}

	public PaymentProcessing setServiceLevel(ServiceLevel serviceLevel) {
		this.serviceLevel = serviceLevel;
		return this;
	}

	public ClearingChannelCode getClearingChannel() {
		return clearingChannel;
	}

	public PaymentProcessing setClearingChannel(ClearingChannelCode clearingChannel) {
		this.clearingChannel = Objects.requireNonNull(clearingChannel);
		return this;
	}

	public ExternalCode getLocalInstrument() {
		return localInstrument;
	}

	public PaymentProcessing setLocalInstrument(ExternalCode localInstrument) {
		this.localInstrument = Objects.requireNonNull(localInstrument);
		return this;
	}

	public PaymentCategoryPurposeCode getCategoryPurpose() {
		return categoryPurpose;
	}

	public PaymentProcessing setCategoryPurpose(PaymentCategoryPurposeCode categoryPurpose) {
		this.categoryPurpose = Objects.requireNonNull(categoryPurpose);
		return this;
	}

	public Optional<PaymentExecution> getPaymentExecution() {
		return paymentExecution == null ? Optional.empty() : Optional.of(paymentExecution);
	}

	public PaymentProcessing setPaymentExecution(PaymentExecution paymentExecution) {
		this.paymentExecution = paymentExecution;
		return this;
	}

	public SequenceTypeCode getSequenceType() {
		return sequenceType;
	}

	public PaymentProcessing setSequenceType(SequenceTypeCode sequenceType) {
		this.sequenceType = Objects.requireNonNull(sequenceType);
		return this;
	}

	public Optional<DirectDebitMandate> getRelatedMandate() {
		return relatedMandate == null ? Optional.empty() : Optional.of(relatedMandate);
	}

	public PaymentProcessing setRelatedMandate(DirectDebitMandate relatedMandate) {
		this.relatedMandate = relatedMandate;
		return this;
	}

	public List<BankTransaction> getBankTransaction() {
		return bankTransaction == null ? bankTransaction = new ArrayList<>() : bankTransaction;
	}

	public PaymentProcessing setBankTransaction(List<BankTransaction> bankTransaction) {
		this.bankTransaction = Objects.requireNonNull(bankTransaction);
		return this;
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint == null ? contactPoint = new ArrayList<>() : contactPoint;
	}

	public PaymentProcessing setContactPoint(List<ContactPoint> contactPoint) {
		this.contactPoint = Objects.requireNonNull(contactPoint);
		return this;
	}
}