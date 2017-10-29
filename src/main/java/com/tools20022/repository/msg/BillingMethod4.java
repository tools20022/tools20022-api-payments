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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details for the tax calculation method C.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#ServiceDetail
 * BillingMethod4.ServiceDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#TaxCalculation
 * BillingMethod4.TaxCalculation}</li>
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
 * "BillingMethod4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details for the tax calculation method C."</li>
 * </ul>
 */
public class BillingMethod4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the details of the taxable services using tax calculation
	 * method C.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2
	 * BillingServiceParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod4 BillingMethod4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the taxable services using tax calculation method C."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ServiceDetail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingMethod4.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "SvcDtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceDetail";
			definition = "Specifies the details of the taxable services using tax calculation method C.";
			minOccurs = 1;
			complexType_lazy = () -> BillingServiceParameters2.mmObject();
		}
	};
	/**
	 * Total amount of service charge to be taxed in the tax region’s host
	 * currency along with the supporting tax calculations.
	 * 
	 * Usage: Used for tax calculation method C only, and only one per tax
	 * region may be specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxCalculation1
	 * TaxCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod4 BillingMethod4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of service charge to be taxed in the tax region’s host currency along with the supporting tax calculations. \n\nUsage: Used for tax calculation method C only, and only one per tax region may be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TaxCalculation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingMethod4.mmObject();
			businessComponentTrace_lazy = () -> Tax.mmObject();
			isDerived = false;
			xmlTag = "TaxClctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculation";
			definition = "Total amount of service charge to be taxed in the tax region’s host currency along with the supporting tax calculations. \n\nUsage: Used for tax calculation method C only, and only one per tax region may be specified.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> TaxCalculation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingMethod4.ServiceDetail, com.tools20022.repository.msg.BillingMethod4.TaxCalculation);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingMethod4";
				definition = "Provides the details for the tax calculation method C.";
			}
		});
		return mmObject_lazy.get();
	}
}