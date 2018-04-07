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
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import com.tools20022.repository.msg.BillingServicesAmount1;
import com.tools20022.repository.msg.BillingServicesTax1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details for the tax calculation method B.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod2#mmServiceChargeHostAmount
 * BillingMethod2.mmServiceChargeHostAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2#mmServiceTax
 * BillingMethod2.mmServiceTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod2#mmTaxIdentification
 * BillingMethod2.mmTaxIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "BillingMethod2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details for the tax calculation method B."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingMethod2", propOrder = {"serviceChargeHostAmount", "serviceTax", "taxIdentification"})
public class BillingMethod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SvcChrgHstAmt", required = true)
	protected AmountAndDirection34 serviceChargeHostAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcChrgHstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceChargeHostAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the original charge expressed in the host currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingMethod2, AmountAndDirection34> mmServiceChargeHostAmount = new MMMessageAssociationEnd<BillingMethod2, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod2.mmObject();
			isDerived = false;
			xmlTag = "SvcChrgHstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceChargeHostAmount";
			definition = "Amount of the original charge expressed in the host currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingMethod2 obj) {
			return obj.getServiceChargeHostAmount();
		}

		@Override
		public void setValue(BillingMethod2 obj, AmountAndDirection34 value) {
			obj.setServiceChargeHostAmount(value);
		}
	};
	@XmlElement(name = "SvcTax", required = true)
	protected BillingServicesAmount1 serviceTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1
	 * BillingServicesAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides for the regional taxes on the service. Up to three regional taxes may be defined for the same service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingMethod2, BillingServicesAmount1> mmServiceTax = new MMMessageAttribute<BillingMethod2, BillingServicesAmount1>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod2.mmObject();
			isDerived = false;
			xmlTag = "SvcTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTax";
			definition = "Provides for the regional taxes on the service. Up to three regional taxes may be defined for the same service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BillingServicesAmount1.mmObject();
		}

		@Override
		public BillingServicesAmount1 getValue(BillingMethod2 obj) {
			return obj.getServiceTax();
		}

		@Override
		public void setValue(BillingMethod2 obj, BillingServicesAmount1 value) {
			obj.setServiceTax(value);
		}
	};
	@XmlElement(name = "TaxId", required = true)
	protected List<BillingServicesTax1> taxIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1
	 * BillingServicesTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingMethod2, List<BillingServicesTax1>> mmTaxIdentification = new MMMessageAttribute<BillingMethod2, List<BillingServicesTax1>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod2.mmObject();
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service.";
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> BillingServicesTax1.mmObject();
		}

		@Override
		public List<BillingServicesTax1> getValue(BillingMethod2 obj) {
			return obj.getTaxIdentification();
		}

		@Override
		public void setValue(BillingMethod2 obj, List<BillingServicesTax1> value) {
			obj.setTaxIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingMethod2.mmServiceChargeHostAmount, com.tools20022.repository.msg.BillingMethod2.mmServiceTax,
						com.tools20022.repository.msg.BillingMethod2.mmTaxIdentification);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingMethod2";
				definition = "Provides the details for the tax calculation method B.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection34 getServiceChargeHostAmount() {
		return serviceChargeHostAmount;
	}

	public BillingMethod2 setServiceChargeHostAmount(AmountAndDirection34 serviceChargeHostAmount) {
		this.serviceChargeHostAmount = Objects.requireNonNull(serviceChargeHostAmount);
		return this;
	}

	public BillingServicesAmount1 getServiceTax() {
		return serviceTax;
	}

	public BillingMethod2 setServiceTax(BillingServicesAmount1 serviceTax) {
		this.serviceTax = Objects.requireNonNull(serviceTax);
		return this;
	}

	public List<BillingServicesTax1> getTaxIdentification() {
		return taxIdentification == null ? taxIdentification = new ArrayList<>() : taxIdentification;
	}

	public BillingMethod2 setTaxIdentification(List<BillingServicesTax1> taxIdentification) {
		this.taxIdentification = Objects.requireNonNull(taxIdentification);
		return this;
	}
}