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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Service;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import com.tools20022.repository.msg.BillingServicesAmount3;
import com.tools20022.repository.msg.BillingServicesTax3;
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
 * Specifies the details for the tax calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#mmHostCurrency
 * TaxCalculation1.mmHostCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTaxableServiceChargeConversion
 * TaxCalculation1.mmTaxableServiceChargeConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTotalTaxableServiceChargeHostAmount
 * TaxCalculation1.mmTotalTaxableServiceChargeHostAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTaxIdentification
 * TaxCalculation1.mmTaxIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTotalTax
 * TaxCalculation1.mmTotalTax}</li>
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
 * "TaxCalculation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the details for the tax calculation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxCalculation1", propOrder = {"hostCurrency", "taxableServiceChargeConversion", "totalTaxableServiceChargeHostAmount", "taxIdentification", "totalTax"})
public class TaxCalculation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HstCcy", required = true)
	protected ActiveOrHistoricCurrencyCode hostCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrency
	 * Tax.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency that all totals for taxable services must be converted to for calculating taxes owed for this tax region. This also is the currency in which the payment of tax obligations is usually submitted to the taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxCalculation1, ActiveOrHistoricCurrencyCode> mmHostCurrency = new MMMessageAttribute<TaxCalculation1, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculation1.mmObject();
			isDerived = false;
			xmlTag = "HstCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCurrency";
			definition = "Currency that all totals for taxable services must be converted to for calculating taxes owed for this tax region. This also is the currency in which the payment of tax obligations is usually submitted to the taxing authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(TaxCalculation1 obj) {
			return obj.getHostCurrency();
		}

		@Override
		public void setValue(TaxCalculation1 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setHostCurrency(value);
		}
	};
	@XmlElement(name = "TaxblSvcChrgConvs", required = true)
	protected List<BillingServicesAmount3> taxableServiceChargeConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount3
	 * BillingServicesAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblSvcChrgConvs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableServiceChargeConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxable service charge amount conversions to host currency. \n\nUsage: One occurrence must be present for each different service pricing currency in the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxCalculation1, List<BillingServicesAmount3>> mmTaxableServiceChargeConversion = new MMMessageAttribute<TaxCalculation1, List<BillingServicesAmount3>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculation1.mmObject();
			isDerived = false;
			xmlTag = "TaxblSvcChrgConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableServiceChargeConversion";
			definition = "Taxable service charge amount conversions to host currency. \n\nUsage: One occurrence must be present for each different service pricing currency in the statement.";
			minOccurs = 1;
			complexType_lazy = () -> BillingServicesAmount3.mmObject();
		}

		@Override
		public List<BillingServicesAmount3> getValue(TaxCalculation1 obj) {
			return obj.getTaxableServiceChargeConversion();
		}

		@Override
		public void setValue(TaxCalculation1 obj, List<BillingServicesAmount3> value) {
			obj.setTaxableServiceChargeConversion(value);
		}
	};
	@XmlElement(name = "TtlTaxblSvcChrgHstAmt", required = true)
	protected AmountAndDirection34 totalTaxableServiceChargeHostAmount;
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxblSvcChrgHstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxableServiceChargeHostAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all services subject to tax for a specific tax region. \n\nUsage: \nThis field will equal the sum of all the separate host tax charge for service equivalent totals for each individual currency. It is expressed in the tax region’s Host currency. This total is used to determine the tax due by calculating using each tax identifications rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxCalculation1, AmountAndDirection34> mmTotalTaxableServiceChargeHostAmount = new MMMessageAssociationEnd<TaxCalculation1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculation1.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxblSvcChrgHstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableServiceChargeHostAmount";
			definition = "Total of all services subject to tax for a specific tax region. \n\nUsage: \nThis field will equal the sum of all the separate host tax charge for service equivalent totals for each individual currency. It is expressed in the tax region’s Host currency. This total is used to determine the tax due by calculating using each tax identifications rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(TaxCalculation1 obj) {
			return obj.getTotalTaxableServiceChargeHostAmount();
		}

		@Override
		public void setValue(TaxCalculation1 obj, AmountAndDirection34 value) {
			obj.setTotalTaxableServiceChargeHostAmount(value);
		}
	};
	@XmlElement(name = "TaxId", required = true)
	protected List<BillingServicesTax3> taxIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax3
	 * BillingServicesTax3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
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
	 * "Provides for the specific tax identification within the same tax region. \n\nUsage: A maximum of three specific tax identifications may be provided. These elements use the total host currency taxable amount as the basis of the calculation. \nThis element is only valid for method C."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxCalculation1, List<BillingServicesTax3>> mmTaxIdentification = new MMMessageAttribute<TaxCalculation1, List<BillingServicesTax3>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculation1.mmObject();
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \n\nUsage: A maximum of three specific tax identifications may be provided. These elements use the total host currency taxable amount as the basis of the calculation. \nThis element is only valid for method C.";
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> BillingServicesTax3.mmObject();
		}

		@Override
		public List<BillingServicesTax3> getValue(TaxCalculation1 obj) {
			return obj.getTaxIdentification();
		}

		@Override
		public void setValue(TaxCalculation1 obj, List<BillingServicesTax3> value) {
			obj.setTaxIdentification(value);
		}
	};
	@XmlElement(name = "TtlTax", required = true)
	protected AmountAndDirection34 totalTax;
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of all taxes for a specific customer within the tax region. This is a sum of all individual total tax amounts for tax identification ’s expressed in the tax region’s host currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxCalculation1, AmountAndDirection34> mmTotalTax = new MMMessageAssociationEnd<TaxCalculation1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculation1.mmObject();
			isDerived = false;
			xmlTag = "TtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTax";
			definition = "Total amount of all taxes for a specific customer within the tax region. This is a sum of all individual total tax amounts for tax identification ’s expressed in the tax region’s host currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(TaxCalculation1 obj) {
			return obj.getTotalTax();
		}

		@Override
		public void setValue(TaxCalculation1 obj, AmountAndDirection34 value) {
			obj.setTotalTax(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculation1.mmHostCurrency, com.tools20022.repository.msg.TaxCalculation1.mmTaxableServiceChargeConversion,
						com.tools20022.repository.msg.TaxCalculation1.mmTotalTaxableServiceChargeHostAmount, com.tools20022.repository.msg.TaxCalculation1.mmTaxIdentification, com.tools20022.repository.msg.TaxCalculation1.mmTotalTax);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxCalculation1";
				definition = "Specifies the details for the tax calculation.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getHostCurrency() {
		return hostCurrency;
	}

	public TaxCalculation1 setHostCurrency(ActiveOrHistoricCurrencyCode hostCurrency) {
		this.hostCurrency = Objects.requireNonNull(hostCurrency);
		return this;
	}

	public List<BillingServicesAmount3> getTaxableServiceChargeConversion() {
		return taxableServiceChargeConversion == null ? taxableServiceChargeConversion = new ArrayList<>() : taxableServiceChargeConversion;
	}

	public TaxCalculation1 setTaxableServiceChargeConversion(List<BillingServicesAmount3> taxableServiceChargeConversion) {
		this.taxableServiceChargeConversion = Objects.requireNonNull(taxableServiceChargeConversion);
		return this;
	}

	public AmountAndDirection34 getTotalTaxableServiceChargeHostAmount() {
		return totalTaxableServiceChargeHostAmount;
	}

	public TaxCalculation1 setTotalTaxableServiceChargeHostAmount(AmountAndDirection34 totalTaxableServiceChargeHostAmount) {
		this.totalTaxableServiceChargeHostAmount = Objects.requireNonNull(totalTaxableServiceChargeHostAmount);
		return this;
	}

	public List<BillingServicesTax3> getTaxIdentification() {
		return taxIdentification == null ? taxIdentification = new ArrayList<>() : taxIdentification;
	}

	public TaxCalculation1 setTaxIdentification(List<BillingServicesTax3> taxIdentification) {
		this.taxIdentification = Objects.requireNonNull(taxIdentification);
		return this;
	}

	public AmountAndDirection34 getTotalTax() {
		return totalTax;
	}

	public TaxCalculation1 setTotalTax(AmountAndDirection34 totalTax) {
		this.totalTax = Objects.requireNonNull(totalTax);
		return this;
	}
}