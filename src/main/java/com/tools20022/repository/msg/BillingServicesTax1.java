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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxRecord;
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
 * Provides for regional taxes on the service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmNumber
 * BillingServicesTax1.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmDescription
 * BillingServicesTax1.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmRate
 * BillingServicesTax1.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmHostAmount
 * BillingServicesTax1.mmHostAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmPricingAmount
 * BillingServicesTax1.mmPricingAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}</li>
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
 * "BillingServicesTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides for regional taxes on the service."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingServicesTax1", propOrder = {"number", "description", "rate", "hostAmount", "pricingAmount"})
public class BillingServicesTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nb", required = true)
	protected Max35Text number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification number of the specific region tax used to calculate the tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServicesTax1, Max35Text> mmNumber = new MMMessageAttribute<BillingServicesTax1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Identification number of the specific region tax used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BillingServicesTax1 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(BillingServicesTax1 obj, Max35Text value) {
			obj.setNumber(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max40Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used to describe the tax (such as the national value added tax)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServicesTax1, Optional<Max40Text>> mmDescription = new MMMessageAttribute<BillingServicesTax1, Optional<Max40Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Name used to describe the tax (such as the national value added tax).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}

		@Override
		public Optional<Max40Text> getValue(BillingServicesTax1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(BillingServicesTax1 obj, Optional<Max40Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate", required = true)
	protected DecimalNumber rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used to calculate the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServicesTax1, DecimalNumber> mmRate = new MMMessageAttribute<BillingServicesTax1, DecimalNumber>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(BillingServicesTax1 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(BillingServicesTax1 obj, DecimalNumber value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "HstAmt", required = true)
	protected AmountAndDirection34 hostAmount;
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
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmAmount
	 * TaxRecord.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the tax obligation expressed in the tax region's host currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingServicesTax1, AmountAndDirection34> mmHostAmount = new MMMessageAssociationEnd<BillingServicesTax1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
			isDerived = false;
			xmlTag = "HstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostAmount";
			definition = "Amount of the tax obligation expressed in the tax region's host currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingServicesTax1 obj) {
			return obj.getHostAmount();
		}

		@Override
		public void setValue(BillingServicesTax1 obj, AmountAndDirection34 value) {
			obj.setHostAmount(value);
		}
	};
	@XmlElement(name = "PricgAmt")
	protected AmountAndDirection34 pricingAmount;
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
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmAmount
	 * TaxRecord.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the tax obligation expressed in the tax region's pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingServicesTax1, Optional<AmountAndDirection34>> mmPricingAmount = new MMMessageAssociationEnd<BillingServicesTax1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
			isDerived = false;
			xmlTag = "PricgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingAmount";
			definition = "Amount of the tax obligation expressed in the tax region's pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServicesTax1 obj) {
			return obj.getPricingAmount();
		}

		@Override
		public void setValue(BillingServicesTax1 obj, Optional<AmountAndDirection34> value) {
			obj.setPricingAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServicesTax1.mmNumber, com.tools20022.repository.msg.BillingServicesTax1.mmDescription,
						com.tools20022.repository.msg.BillingServicesTax1.mmRate, com.tools20022.repository.msg.BillingServicesTax1.mmHostAmount, com.tools20022.repository.msg.BillingServicesTax1.mmPricingAmount);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingServicesTax1";
				definition = "Provides for regional taxes on the service.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getNumber() {
		return number;
	}

	public BillingServicesTax1 setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public Optional<Max40Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public BillingServicesTax1 setDescription(Max40Text description) {
		this.description = description;
		return this;
	}

	public DecimalNumber getRate() {
		return rate;
	}

	public BillingServicesTax1 setRate(DecimalNumber rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public AmountAndDirection34 getHostAmount() {
		return hostAmount;
	}

	public BillingServicesTax1 setHostAmount(AmountAndDirection34 hostAmount) {
		this.hostAmount = Objects.requireNonNull(hostAmount);
		return this;
	}

	public Optional<AmountAndDirection34> getPricingAmount() {
		return pricingAmount == null ? Optional.empty() : Optional.of(pricingAmount);
	}

	public BillingServicesTax1 setPricingAmount(AmountAndDirection34 pricingAmount) {
		this.pricingAmount = pricingAmount;
		return this;
	}
}