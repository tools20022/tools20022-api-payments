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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.entity.Mandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to further detail the information related to the type of
 * payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#ServiceLevel
 * MandateTypeInformation2.ServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#LocalInstrument
 * MandateTypeInformation2.LocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#CategoryPurpose
 * MandateTypeInformation2.CategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#Classification
 * MandateTypeInformation2.Classification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
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
 * "MandateTypeInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to further detail the information related to the type of payment."
 * </li>
 * </ul>
 */
public class MandateTypeInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement under which or rules under which the mandate resides.
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
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2
	 * MandateTypeInformation2}</li>
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
	 * "Agreement under which or rules under which the mandate resides."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ServiceLevel = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the mandate resides.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * User community specific instrument. Usage: This element is used to
	 * specify a local instrument, local clearing option and/or further qualify
	 * the service or service level.
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
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
	 * DirectDebitMandate.MandatePaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2
	 * MandateTypeInformation2}</li>
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
	 * "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LocalInstrument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the high level purpose of the mandate based on a set of
	 * pre-defined categories.
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
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2
	 * MandateTypeInformation2}</li>
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
	 * "Specifies the high level purpose of the mandate based on a set of pre-defined categories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CategoryPurpose = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose;
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the mandate based on a set of pre-defined categories.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Type of direct debit instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice
	 * MandateClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Classification
	 * DirectDebitMandate.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2
	 * MandateTypeInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of direct debit instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Classification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Classification;
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateClassification1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.ServiceLevel, com.tools20022.repository.msg.MandateTypeInformation2.LocalInstrument,
						com.tools20022.repository.msg.MandateTypeInformation2.CategoryPurpose, com.tools20022.repository.msg.MandateTypeInformation2.Classification);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateTypeInformation2";
				definition = "Set of elements used to further detail the information related to the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}
}