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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmSettlementPriority
	 * CreditTransferTransaction23.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmSettlementPriority
	 * CreditTransferTransaction25.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmSettlementPriority
	 * DirectDebitTransactionInformation21.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmSettlementPriority
	 * PaymentTransaction81.mmSettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmSettlementPriority
	 * PaymentTransaction76.mmSettlementPriority}</li>
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
	public static final MMBusinessAttribute mmPriority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation19.mmInstructionPriority, PaymentTypeInformation24.mmInstructionPriority, PaymentTypeInformation25.mmInstructionPriority,
					PaymentTypeInformation21.mmInstructionPriority, DirectDebitTransactionInformation15.mmSettlementPriority, CreditTransferTransaction23.mmSettlementPriority, CreditTransferTransaction25.mmSettlementPriority,
					DirectDebitTransactionInformation21.mmSettlementPriority, PaymentTransaction81.mmSettlementPriority, PaymentTransaction76.mmSettlementPriority);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentProcessing.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ServiceLevel serviceLevel;
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmServiceLevel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation19.mmServiceLevel, PaymentTypeInformation24.mmServiceLevel, PaymentTypeInformation25.mmServiceLevel, PaymentTypeInformation21.mmServiceLevel,
					MandateTypeInformation2.mmServiceLevel);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmPaymentProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
		}
	};
	protected ClearingChannelCode clearingChannel;
	/**
	 * Specifies the clearing channel to be used to process the payment
	 * instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmClearingChannel
	 * ResolutionInformation1.mmClearingChannel}</li>
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
	public static final MMBusinessAttribute mmClearingChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation25.mmClearingChannel, PaymentTypeInformation21.mmClearingChannel, ResolutionInformation1.mmClearingChannel);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentProcessing.class.getMethod("getClearingChannel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalCode localInstrument;
	/**
	 * User community specific instrument. Usage : When available, codes
	 * provided by local authorities should be used.
	 * <p>
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
	public static final MMBusinessAttribute mmLocalInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LocalInstrument2Choice.mmCode, LocalInstrument2Choice.mmProprietary, PaymentTypeInformation19.mmLocalInstrument, PaymentTypeInformation24.mmLocalInstrument,
					PaymentTypeInformation25.mmLocalInstrument, PaymentTypeInformation21.mmLocalInstrument);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentProcessing.class.getMethod("getLocalInstrument", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentCategoryPurposeCode categoryPurpose;
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories.
	 * <p>
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
	public static final MMBusinessAttribute mmCategoryPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CategoryPurpose1Choice.mmCode, CategoryPurpose1Choice.mmProprietary, PaymentTypeInformation19.mmCategoryPurpose, PaymentTypeInformation24.mmCategoryPurpose,
					PaymentTypeInformation25.mmCategoryPurpose, PaymentTypeInformation21.mmCategoryPurpose, DirectDebitTransactionInformation21.mmPurpose, MandateTypeInformation2.mmCategoryPurpose, MandateClassification1Choice.mmCode,
					MandateClassification1Choice.mmProprietary, DirectDebitTransactionInformation22.mmPurpose);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentProcessing.class.getMethod("getCategoryPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * Payment execution process for which processing parameters are specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected SequenceTypeCode sequenceType;
	/**
	 * Identifies the payment sequence where applicable.
	 * <p>
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
	public static final MMBusinessAttribute mmSequenceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTypeInformation24.mmSequenceType, PaymentTypeInformation25.mmSequenceType, MandateOccurrences4.mmSequenceType);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentProcessing.class.getMethod("getSequenceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DirectDebitMandate relatedMandate;
	/**
	 * Mandate for which payment processing parametres are specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmMandatePaymentType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BankTransaction> bankTransaction;
	/**
	 * Code of the underlying bank transaction.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBankTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * Specifies the notification method to be used to inform the beneficiary.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmContactPoint = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmRelatedPayment, com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions,
						com.tools20022.repository.entity.BankTransaction.mmRelatedPayment, com.tools20022.repository.entity.ServiceLevel.mmPaymentProcessing, com.tools20022.repository.entity.DirectDebitMandate.mmMandatePaymentType);
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

	public void setPriority(PriorityCode priority) {
		this.priority = priority;
	}

	public ServiceLevel getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(com.tools20022.repository.entity.ServiceLevel serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public ClearingChannelCode getClearingChannel() {
		return clearingChannel;
	}

	public void setClearingChannel(ClearingChannelCode clearingChannel) {
		this.clearingChannel = clearingChannel;
	}

	public ExternalCode getLocalInstrument() {
		return localInstrument;
	}

	public void setLocalInstrument(ExternalCode localInstrument) {
		this.localInstrument = localInstrument;
	}

	public PaymentCategoryPurposeCode getCategoryPurpose() {
		return categoryPurpose;
	}

	public void setCategoryPurpose(PaymentCategoryPurposeCode categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
	}

	public PaymentExecution getPaymentExecution() {
		return paymentExecution;
	}

	public void setPaymentExecution(com.tools20022.repository.entity.PaymentExecution paymentExecution) {
		this.paymentExecution = paymentExecution;
	}

	public SequenceTypeCode getSequenceType() {
		return sequenceType;
	}

	public void setSequenceType(SequenceTypeCode sequenceType) {
		this.sequenceType = sequenceType;
	}

	public DirectDebitMandate getRelatedMandate() {
		return relatedMandate;
	}

	public void setRelatedMandate(com.tools20022.repository.entity.DirectDebitMandate relatedMandate) {
		this.relatedMandate = relatedMandate;
	}

	public List<BankTransaction> getBankTransaction() {
		return bankTransaction;
	}

	public void setBankTransaction(List<com.tools20022.repository.entity.BankTransaction> bankTransaction) {
		this.bankTransaction = bankTransaction;
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = contactPoint;
	}
}