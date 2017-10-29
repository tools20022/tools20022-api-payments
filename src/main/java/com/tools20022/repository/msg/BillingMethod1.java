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
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.BillingMethod1#ServiceChargeHostAmount
 * BillingMethod1.ServiceChargeHostAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#ServiceTax
 * BillingMethod1.ServiceTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#TotalCharge
 * BillingMethod1.TotalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod1#TaxIdentification
 * BillingMethod1.TaxIdentification}</li>
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
public class BillingMethod1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of the original charge expressed in the host currency.
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
	public static final MMMessageAssociationEnd ServiceChargeHostAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingMethod1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			isDerived = false;
			xmlTag = "SvcChrgHstAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceChargeHostAmount";
			definition = "Amount of the original charge expressed in the host currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides for the regional taxes on the service. Up to three regional
	 * taxes may be defined for the same service.
	 * <p>
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
	public static final MMMessageAttribute ServiceTax = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingMethod1.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "SvcTax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTax";
			definition = "Provides for the regional taxes on the service. Up to three regional taxes may be defined for the same service.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> BillingServicesAmount1.mmObject();
		}
	};
	/**
	 * Specifies the total charge for a service (including taxes).
	 * <p>
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
	public static final MMMessageAttribute TotalCharge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingMethod1.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "TtlChrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCharge";
			definition = "Specifies the total charge for a service (including taxes).";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> BillingServicesAmount2.mmObject();
		}
	};
	/**
	 * Provides for the specific tax identification within the same tax region. <br>
	 * <br>
	 * Usage: This element allows for a maximum of three regional taxes on the
	 * same service.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Record Tax.Record}</li>
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
	public static final MMMessageAttribute TaxIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingMethod1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Record;
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service.";
			minOccurs = 1;
			maxOccurs = 3;
			complexType_lazy = () -> BillingServicesTax1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingMethod1.ServiceChargeHostAmount, com.tools20022.repository.msg.BillingMethod1.ServiceTax,
						com.tools20022.repository.msg.BillingMethod1.TotalCharge, com.tools20022.repository.msg.BillingMethod1.TaxIdentification);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingMethod1";
				definition = "Provides the details for the tax calculation method A.";
			}
		});
		return mmObject_lazy.get();
	}
}