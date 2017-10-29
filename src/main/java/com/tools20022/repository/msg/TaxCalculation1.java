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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the details for the tax calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#HostCurrency
 * TaxCalculation1.HostCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TaxableServiceChargeConversion
 * TaxCalculation1.TaxableServiceChargeConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TotalTaxableServiceChargeHostAmount
 * TaxCalculation1.TotalTaxableServiceChargeHostAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TaxIdentification
 * TaxCalculation1.TaxIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#TotalTax
 * TaxCalculation1.TotalTax}</li>
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
public class TaxCalculation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency that all totals for taxable services must be converted to for
	 * calculating taxes owed for this tax region. This also is the currency in
	 * which the payment of tax obligations is usually submitted to the taxing
	 * authority.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Currency Tax.Currency}</li>
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
	 * "Currency that all totals for taxable services must be converted to for calculating taxes owed for this tax region.  This also is the currency in which the payment of tax obligations is usually submitted to the taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute HostCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxCalculation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Currency;
			isDerived = false;
			xmlTag = "HstCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCurrency";
			definition = "Currency that all totals for taxable services must be converted to for calculating taxes owed for this tax region.  This also is the currency in which the payment of tax obligations is usually submitted to the taxing authority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Taxable service charge amount conversions to host currency.
	 * 
	 * Usage: One occurrence must be present for each different service pricing
	 * currency in the statement.
	 * <p>
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
	public static final MMMessageAttribute TaxableServiceChargeConversion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxCalculation1.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "TaxblSvcChrgConvs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableServiceChargeConversion";
			definition = "Taxable service charge amount conversions to host currency. \n\nUsage: One occurrence must be present for each different service pricing currency in the statement.";
			minOccurs = 1;
			complexType_lazy = () -> BillingServicesAmount3.mmObject();
		}
	};
	/**
	 * Total of all services subject to tax for a specific tax region.
	 * 
	 * Usage: This field will equal the sum of all the separate host tax charge
	 * for service equivalent totals for each individual currency. It is
	 * expressed in the tax region’s Host currency. This total is used to
	 * determine the tax due by calculating using each tax identifications rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#Amount
	 * Service.Amount}</li>
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
	 * "Total of all services subject to tax for a specific tax region.  \n\nUsage:\nThis field will equal the sum of all the separate host tax charge for service equivalent totals for each individual currency.  It is expressed in the tax region’s Host currency. This total is used to determine the tax due by calculating using each tax identifications rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalTaxableServiceChargeHostAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TaxCalculation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Amount;
			isDerived = false;
			xmlTag = "TtlTaxblSvcChrgHstAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableServiceChargeHostAmount";
			definition = "Total of all services subject to tax for a specific tax region.  \n\nUsage:\nThis field will equal the sum of all the separate host tax charge for service equivalent totals for each individual currency.  It is expressed in the tax region’s Host currency. This total is used to determine the tax due by calculating using each tax identifications rate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides for the specific tax identification within the same tax region.
	 * 
	 * Usage: A maximum of three specific tax identifications may be provided.
	 * These elements use the total host currency taxable amount as the basis of
	 * the calculation. This element is only valid for method C.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Record Tax.Record}</li>
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
	public static final MMMessageAttribute TaxIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxCalculation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Record;
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \n\nUsage: A maximum of three specific tax identifications may be provided. These elements use the total host currency taxable amount as the basis of the calculation. \nThis element is only valid for method C.";
			minOccurs = 1;
			maxOccurs = 3;
			complexType_lazy = () -> BillingServicesTax3.mmObject();
		}
	};
	/**
	 * Total amount of all taxes for a specific customer within the tax region.
	 * This is a sum of all individual total tax amounts for tax identification
	 * ’s expressed in the tax region’s host currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#Amount Tax.Amount}</li>
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
	 * "Total amount of all taxes for a specific customer within the tax region.  This is a sum of all individual total tax amounts for tax identification ’s expressed in the tax region’s host currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalTax = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TaxCalculation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			isDerived = false;
			xmlTag = "TtlTax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTax";
			definition = "Total amount of all taxes for a specific customer within the tax region.  This is a sum of all individual total tax amounts for tax identification ’s expressed in the tax region’s host currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculation1.HostCurrency, com.tools20022.repository.msg.TaxCalculation1.TaxableServiceChargeConversion,
						com.tools20022.repository.msg.TaxCalculation1.TotalTaxableServiceChargeHostAmount, com.tools20022.repository.msg.TaxCalculation1.TaxIdentification, com.tools20022.repository.msg.TaxCalculation1.TotalTax);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxCalculation1";
				definition = "Specifies the details for the tax calculation.";
			}
		});
		return mmObject_lazy.get();
	}
}