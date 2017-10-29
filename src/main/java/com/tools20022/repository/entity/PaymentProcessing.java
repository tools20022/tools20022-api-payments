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
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.msg.PaymentTypeInformation19;
import com.tools20022.repository.msg.PaymentTypeInformation21;
import com.tools20022.repository.msg.PaymentTypeInformation24;
import com.tools20022.repository.msg.PaymentTypeInformation25;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.PaymentProcessing#Priority
 * PaymentProcessing.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ServiceLevel
 * PaymentProcessing.ServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ClearingChannel
 * PaymentProcessing.ClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#LocalInstrument
 * PaymentProcessing.LocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#CategoryPurpose
 * PaymentProcessing.CategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
 * PaymentProcessing.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#SequenceType
 * PaymentProcessing.SequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
 * PaymentProcessing.RelatedMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#BankTransaction
 * PaymentProcessing.BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ContactPoint
 * PaymentProcessing.ContactPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedPayment
 * ContactPoint.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
 * PaymentExecution.ProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedPayment
 * BankTransaction.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#PaymentProcessing
 * ServiceLevel.PaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
 * DirectDebitMandate.MandatePaymentType}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#InstructionPriority
	 * PaymentTypeInformation19.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#InstructionPriority
	 * PaymentTypeInformation24.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#InstructionPriority
	 * PaymentTypeInformation25.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#InstructionPriority
	 * PaymentTypeInformation21.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#SettlementPriority
	 * DirectDebitTransactionInformation15.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementPriority
	 * CreditTransferTransaction23.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementPriority
	 * CreditTransferTransaction25.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#SettlementPriority
	 * DirectDebitTransactionInformation21.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#SettlementPriority
	 * PaymentTransaction81.SettlementPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#SettlementPriority
	 * PaymentTransaction76.SettlementPriority}</li>
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
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation19.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation24.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation25.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation21.InstructionPriority,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.SettlementPriority, com.tools20022.repository.msg.CreditTransferTransaction23.SettlementPriority,
					com.tools20022.repository.msg.CreditTransferTransaction25.SettlementPriority, com.tools20022.repository.msg.DirectDebitTransactionInformation21.SettlementPriority,
					com.tools20022.repository.msg.PaymentTransaction81.SettlementPriority, com.tools20022.repository.msg.PaymentTransaction76.SettlementPriority);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#PaymentProcessing
	 * ServiceLevel.PaymentProcessing}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#ServiceLevel
	 * PaymentTypeInformation19.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#ServiceLevel
	 * PaymentTypeInformation24.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ServiceLevel
	 * PaymentTypeInformation25.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#ServiceLevel
	 * PaymentTypeInformation21.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#ServiceLevel
	 * MandateTypeInformation2.ServiceLevel}</li>
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
	public static final MMBusinessAssociationEnd ServiceLevel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation19.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation24.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation25.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation21.ServiceLevel, com.tools20022.repository.msg.MandateTypeInformation2.ServiceLevel);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ServiceLevel.PaymentProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ClearingChannel
	 * PaymentTypeInformation25.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#ClearingChannel
	 * PaymentTypeInformation21.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#ClearingChannel
	 * ResolutionInformation1.ClearingChannel}</li>
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
	public static final MMBusinessAttribute ClearingChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation25.ClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation21.ClearingChannel,
					com.tools20022.repository.msg.ResolutionInformation1.ClearingChannel);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#Code
	 * LocalInstrument2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice#Proprietary
	 * LocalInstrument2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#LocalInstrument
	 * PaymentTypeInformation19.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#LocalInstrument
	 * PaymentTypeInformation24.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#LocalInstrument
	 * PaymentTypeInformation25.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#LocalInstrument
	 * PaymentTypeInformation21.LocalInstrument}</li>
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
	public static final MMBusinessAttribute LocalInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LocalInstrument2Choice.Code, com.tools20022.repository.choice.LocalInstrument2Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation19.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation24.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation25.LocalInstrument,
					com.tools20022.repository.msg.PaymentTypeInformation21.LocalInstrument);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#Code
	 * CategoryPurpose1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice#Proprietary
	 * CategoryPurpose1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#CategoryPurpose
	 * PaymentTypeInformation19.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#CategoryPurpose
	 * PaymentTypeInformation24.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#CategoryPurpose
	 * PaymentTypeInformation25.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation21#CategoryPurpose
	 * PaymentTypeInformation21.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#Purpose
	 * DirectDebitTransactionInformation21.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#CategoryPurpose
	 * MandateTypeInformation2.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#Code
	 * MandateClassification1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice#Proprietary
	 * MandateClassification1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#Purpose
	 * DirectDebitTransactionInformation22.Purpose}</li>
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
	public static final MMBusinessAttribute CategoryPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CategoryPurpose1Choice.Code, com.tools20022.repository.choice.CategoryPurpose1Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation19.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation24.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation25.CategoryPurpose,
					com.tools20022.repository.msg.PaymentTypeInformation21.CategoryPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation21.Purpose, com.tools20022.repository.msg.MandateTypeInformation2.CategoryPurpose,
					com.tools20022.repository.choice.MandateClassification1Choice.Code, com.tools20022.repository.choice.MandateClassification1Choice.Proprietary, com.tools20022.repository.msg.DirectDebitTransactionInformation22.Purpose);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}
	};
	/**
	 * Payment execution process for which processing parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
	 * PaymentExecution.ProcessingInstructions}</li>
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
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24#SequenceType
	 * PaymentTypeInformation24.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#SequenceType
	 * PaymentTypeInformation25.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#SequenceType
	 * MandateOccurrences4.SequenceType}</li>
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
	public static final MMBusinessAttribute SequenceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation24.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation25.SequenceType,
					com.tools20022.repository.msg.MandateOccurrences4.SequenceType);
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}
	};
	/**
	 * Mandate for which payment processing parametres are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
	 * DirectDebitMandate.MandatePaymentType}</li>
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
	public static final MMBusinessAssociationEnd RelatedMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DirectDebitMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Code of the underlying bank transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedPayment
	 * BankTransaction.RelatedPayment}</li>
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
	public static final MMBusinessAssociationEnd BankTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the notification method to be used to inform the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedPayment
	 * ContactPoint.RelatedPayment}</li>
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
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.BankTransaction.RelatedPayment, com.tools20022.repository.entity.ServiceLevel.PaymentProcessing, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.Priority, com.tools20022.repository.entity.PaymentProcessing.ServiceLevel,
						com.tools20022.repository.entity.PaymentProcessing.ClearingChannel, com.tools20022.repository.entity.PaymentProcessing.LocalInstrument, com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.PaymentProcessing.SequenceType, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate,
						com.tools20022.repository.entity.PaymentProcessing.BankTransaction, com.tools20022.repository.entity.PaymentProcessing.ContactPoint);
				derivationComponent_lazy = () -> Arrays.asList(LocalInstrument2Choice.mmObject(), PaymentTypeInformation19.mmObject(), PaymentTypeInformation24.mmObject(), PaymentTypeInformation25.mmObject(),
						PaymentTypeInformation21.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}