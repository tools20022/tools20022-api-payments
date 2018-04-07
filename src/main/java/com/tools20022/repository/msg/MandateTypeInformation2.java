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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmServiceLevel
 * MandateTypeInformation2.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmLocalInstrument
 * MandateTypeInformation2.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmCategoryPurpose
 * MandateTypeInformation2.mmCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmClassification
 * MandateTypeInformation2.mmClassification}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateTypeInformation2", propOrder = {"serviceLevel", "localInstrument", "categoryPurpose", "classification"})
public class MandateTypeInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SvcLvl")
	protected ServiceLevel8Choice serviceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
	 * ServiceLevel8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
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
	public static final MMMessageAssociationEnd<MandateTypeInformation2, Optional<ServiceLevel8Choice>> mmServiceLevel = new MMMessageAssociationEnd<MandateTypeInformation2, Optional<ServiceLevel8Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmServiceLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the mandate resides.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
		}

		@Override
		public Optional<ServiceLevel8Choice> getValue(MandateTypeInformation2 obj) {
			return obj.getServiceLevel();
		}

		@Override
		public void setValue(MandateTypeInformation2 obj, Optional<ServiceLevel8Choice> value) {
			obj.setServiceLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "LclInstrm")
	protected LocalInstrument2Choice localInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
	 * DirectDebitMandate.mmMandatePaymentType}</li>
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
	public static final MMMessageAssociationEnd<MandateTypeInformation2, Optional<LocalInstrument2Choice>> mmLocalInstrument = new MMMessageAssociationEnd<MandateTypeInformation2, Optional<LocalInstrument2Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmMandatePaymentType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
		}

		@Override
		public Optional<LocalInstrument2Choice> getValue(MandateTypeInformation2 obj) {
			return obj.getLocalInstrument();
		}

		@Override
		public void setValue(MandateTypeInformation2 obj, Optional<LocalInstrument2Choice> value) {
			obj.setLocalInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "CtgyPurp")
	protected CategoryPurpose1Choice categoryPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
	 * CategoryPurpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
	 * PaymentProcessing.mmCategoryPurpose}</li>
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
	public static final MMMessageAssociationEnd<MandateTypeInformation2, Optional<CategoryPurpose1Choice>> mmCategoryPurpose = new MMMessageAssociationEnd<MandateTypeInformation2, Optional<CategoryPurpose1Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmCategoryPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the mandate based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
		}

		@Override
		public Optional<CategoryPurpose1Choice> getValue(MandateTypeInformation2 obj) {
			return obj.getCategoryPurpose();
		}

		@Override
		public void setValue(MandateTypeInformation2 obj, Optional<CategoryPurpose1Choice> value) {
			obj.setCategoryPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "Clssfctn")
	protected MandateClassification1Choice classification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice
	 * MandateClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmClassification
	 * DirectDebitMandate.mmClassification}</li>
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
	public static final MMMessageAssociationEnd<MandateTypeInformation2, Optional<MandateClassification1Choice>> mmClassification = new MMMessageAssociationEnd<MandateTypeInformation2, Optional<MandateClassification1Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateClassification1Choice.mmObject();
		}

		@Override
		public Optional<MandateClassification1Choice> getValue(MandateTypeInformation2 obj) {
			return obj.getClassification();
		}

		@Override
		public void setValue(MandateTypeInformation2 obj, Optional<MandateClassification1Choice> value) {
			obj.setClassification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.mmServiceLevel, com.tools20022.repository.msg.MandateTypeInformation2.mmLocalInstrument,
						com.tools20022.repository.msg.MandateTypeInformation2.mmCategoryPurpose, com.tools20022.repository.msg.MandateTypeInformation2.mmClassification);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateTypeInformation2";
				definition = "Set of elements used to further detail the information related to the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ServiceLevel8Choice> getServiceLevel() {
		return serviceLevel == null ? Optional.empty() : Optional.of(serviceLevel);
	}

	public MandateTypeInformation2 setServiceLevel(ServiceLevel8Choice serviceLevel) {
		this.serviceLevel = serviceLevel;
		return this;
	}

	public Optional<LocalInstrument2Choice> getLocalInstrument() {
		return localInstrument == null ? Optional.empty() : Optional.of(localInstrument);
	}

	public MandateTypeInformation2 setLocalInstrument(LocalInstrument2Choice localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}

	public Optional<CategoryPurpose1Choice> getCategoryPurpose() {
		return categoryPurpose == null ? Optional.empty() : Optional.of(categoryPurpose);
	}

	public MandateTypeInformation2 setCategoryPurpose(CategoryPurpose1Choice categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
		return this;
	}

	public Optional<MandateClassification1Choice> getClassification() {
		return classification == null ? Optional.empty() : Optional.of(classification);
	}

	public MandateTypeInformation2 setClassification(MandateClassification1Choice classification) {
		this.classification = classification;
		return this;
	}
}