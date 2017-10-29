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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.ClearingChannel2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.codeset.SequenceType3Code;
import com.tools20022.repository.entity.PaymentProcessing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide further details of the type of payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#InstructionPriority
 * PaymentTypeInformation25.InstructionPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ClearingChannel
 * PaymentTypeInformation25.ClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#ServiceLevel
 * PaymentTypeInformation25.ServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#LocalInstrument
 * PaymentTypeInformation25.LocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#SequenceType
 * PaymentTypeInformation25.SequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25#CategoryPurpose
 * PaymentTypeInformation25.CategoryPurpose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
 * PaymentProcessing}</li>
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
 * "PaymentTypeInformation25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide further details of the type of payment."</li>
 * </ul>
 */
public class PaymentTypeInformation25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#Priority
	 * PaymentProcessing.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionPriority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.Priority;
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Specifies the clearing channel to be used to process the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ClearingChannel
	 * PaymentProcessing.ClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ClearingChannel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ClearingChannel;
			isDerived = false;
			xmlTag = "ClrChanl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
	 * ServiceLevel8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ServiceLevel
	 * PaymentProcessing.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ServiceLevel = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * User community specific instrument.
	 * 
	 * Usage: This element is used to specify a local instrument, local clearing
	 * option and/or further qualify the service or service level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#LocalInstrument
	 * PaymentProcessing.LocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\n\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LocalInstrument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.LocalInstrument;
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\n\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the direct debit sequence, such as first, recurrent, final or
	 * one-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#SequenceType
	 * PaymentProcessing.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the direct debit sequence, such as first, recurrent, final or one-off."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SequenceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.SequenceType;
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the direct debit sequence, such as first, recurrent, final or one-off.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories. Usage: This is used by the initiating party to
	 * provide information concerning the processing of the payment. It is
	 * likely to trigger special processing by any of the agents involved in the
	 * payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
	 * CategoryPurpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#CategoryPurpose
	 * PaymentProcessing.CategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation25
	 * PaymentTypeInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CategoryPurpose = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTypeInformation25.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose;
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation25.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation25.ClearingChannel,
						com.tools20022.repository.msg.PaymentTypeInformation25.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation25.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation25.SequenceType,
						com.tools20022.repository.msg.PaymentTypeInformation25.CategoryPurpose);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeInformation25";
				definition = "Set of elements used to provide further details of the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}
}