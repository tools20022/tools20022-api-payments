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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BillingCompensationType1Choice;
import com.tools20022.repository.codeset.BillingCurrencyType2Code;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.Service;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the compensation data of an incorrect billing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingCompensation1#mmType
 * BillingCompensation1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingCompensation1#mmValue
 * BillingCompensation1.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCompensation1#mmCurrencyType
 * BillingCompensation1.mmCurrencyType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BillingCompensation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the compensation data of an incorrect billing."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingCompensation1", propOrder = {"type", "value", "currencyType"})
public class BillingCompensation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected BillingCompensationType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice
	 * BillingCompensationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmBillingCompensationType
	 * Invoice.mmBillingCompensationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1
	 * BillingCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of billing compensation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingCompensation1, BillingCompensationType1Choice> mmType = new MMMessageAssociationEnd<BillingCompensation1, BillingCompensationType1Choice>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmBillingCompensationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCompensation1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Defines the type of billing compensation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BillingCompensationType1Choice.mmObject();
		}

		@Override
		public BillingCompensationType1Choice getValue(BillingCompensation1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(BillingCompensation1 obj, BillingCompensationType1Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Val", required = true)
	protected AmountAndDirection34 value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1
	 * BillingCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the value of compensation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingCompensation1, AmountAndDirection34> mmValue = new MMMessageAssociationEnd<BillingCompensation1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCompensation1.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Defines the value of compensation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingCompensation1 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(BillingCompensation1 obj, AmountAndDirection34 value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "CcyTp")
	protected BillingCurrencyType2Code currencyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyType2Code
	 * BillingCurrencyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingCurrency
	 * CashAccountService.mmBillingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1
	 * BillingCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency type used to report the value or total, in a coded form, such as Settlement (STLM)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingCompensation1, Optional<BillingCurrencyType2Code>> mmCurrencyType = new MMMessageAttribute<BillingCompensation1, Optional<BillingCurrencyType2Code>>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmBillingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCompensation1.mmObject();
			isDerived = false;
			xmlTag = "CcyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyType";
			definition = "Identifies the currency type used to report the value or total, in a coded form, such as Settlement (STLM).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BillingCurrencyType2Code.mmObject();
		}

		@Override
		public Optional<BillingCurrencyType2Code> getValue(BillingCompensation1 obj) {
			return obj.getCurrencyType();
		}

		@Override
		public void setValue(BillingCompensation1 obj, Optional<BillingCurrencyType2Code> value) {
			obj.setCurrencyType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingCompensation1.mmType, com.tools20022.repository.msg.BillingCompensation1.mmValue,
						com.tools20022.repository.msg.BillingCompensation1.mmCurrencyType);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingCompensation1";
				definition = "Specifies the compensation data of an incorrect billing.";
			}
		});
		return mmObject_lazy.get();
	}

	public BillingCompensationType1Choice getType() {
		return type;
	}

	public BillingCompensation1 setType(BillingCompensationType1Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public AmountAndDirection34 getValue() {
		return value;
	}

	public BillingCompensation1 setValue(AmountAndDirection34 value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<BillingCurrencyType2Code> getCurrencyType() {
		return currencyType == null ? Optional.empty() : Optional.of(currencyType);
	}

	public BillingCompensation1 setCurrencyType(BillingCurrencyType2Code currencyType) {
		this.currencyType = currencyType;
		return this;
	}
}