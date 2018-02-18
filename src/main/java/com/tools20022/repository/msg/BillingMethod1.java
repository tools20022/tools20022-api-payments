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
 * Provides the details for the tax calculation method A.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod1#mmServiceChargeHostAmount
 * BillingMethod1.mmServiceChargeHostAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#mmServiceTax
 * BillingMethod1.mmServiceTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#mmTotalCharge
 * BillingMethod1.mmTotalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod1#mmTaxIdentification
 * BillingMethod1.mmTaxIdentification}</li>
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
 * "BillingMethod1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details for the tax calculation method A."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingMethod1", propOrder = {"serviceChargeHostAmount", "serviceTax", "totalCharge", "taxIdentification"})
public class BillingMethod1 {

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
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
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
	public static final MMMessageAssociationEnd mmServiceChargeHostAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod1.mmObject();
			isDerived = false;
			xmlTag = "SvcChrgHstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceChargeHostAmount";
			definition = "Amount of the original charge expressed in the host currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
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
	public static final MMMessageAttribute mmServiceTax = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod1.mmObject();
			isDerived = false;
			xmlTag = "SvcTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTax";
			definition = "Provides for the regional taxes on the service. Up to three regional taxes may be defined for the same service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingServicesAmount1.mmObject();
		}
	};
	@XmlElement(name = "TtlChrg", required = true)
	protected BillingServicesAmount2 totalCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2
	 * BillingServicesAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total charge for a service (including taxes)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalCharge = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod1.mmObject();
			isDerived = false;
			xmlTag = "TtlChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCharge";
			definition = "Specifies the total charge for a service (including taxes).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingServicesAmount2.mmObject();
		}
	};
	@XmlElement(name = "TaxId", required = true)
	protected List<com.tools20022.repository.msg.BillingServicesTax1> taxIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
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
	public static final MMMessageAttribute mmTaxIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingMethod1.mmObject();
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service.";
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingServicesTax1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingMethod1.mmServiceChargeHostAmount, com.tools20022.repository.msg.BillingMethod1.mmServiceTax,
						com.tools20022.repository.msg.BillingMethod1.mmTotalCharge, com.tools20022.repository.msg.BillingMethod1.mmTaxIdentification);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingMethod1";
				definition = "Provides the details for the tax calculation method A.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection34 getServiceChargeHostAmount() {
		return serviceChargeHostAmount;
	}

	public BillingMethod1 setServiceChargeHostAmount(com.tools20022.repository.msg.AmountAndDirection34 serviceChargeHostAmount) {
		this.serviceChargeHostAmount = Objects.requireNonNull(serviceChargeHostAmount);
		return this;
	}

	public BillingServicesAmount1 getServiceTax() {
		return serviceTax;
	}

	public BillingMethod1 setServiceTax(com.tools20022.repository.msg.BillingServicesAmount1 serviceTax) {
		this.serviceTax = Objects.requireNonNull(serviceTax);
		return this;
	}

	public BillingServicesAmount2 getTotalCharge() {
		return totalCharge;
	}

	public BillingMethod1 setTotalCharge(com.tools20022.repository.msg.BillingServicesAmount2 totalCharge) {
		this.totalCharge = Objects.requireNonNull(totalCharge);
		return this;
	}

	public List<BillingServicesTax1> getTaxIdentification() {
		return taxIdentification == null ? taxIdentification = new ArrayList<>() : taxIdentification;
	}

	public BillingMethod1 setTaxIdentification(List<com.tools20022.repository.msg.BillingServicesTax1> taxIdentification) {
		this.taxIdentification = Objects.requireNonNull(taxIdentification);
		return this;
	}
}