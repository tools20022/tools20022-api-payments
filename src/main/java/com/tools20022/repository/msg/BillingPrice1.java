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
import com.tools20022.repository.codeset.BillingChargeMethod1Code;
import com.tools20022.repository.datatype.Max20Text;
import com.tools20022.repository.entity.Price;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the billing price of a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#Currency
 * BillingPrice1.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#UnitPrice
 * BillingPrice1.UnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#Method
 * BillingPrice1.Method}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#Rule
 * BillingPrice1.Rule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
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
 * "BillingPrice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the billing price of a service."</li>
 * </ul>
 */
public class BillingPrice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency code in which the unit price and original charge price are
	 * expressed.
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
	 * {@linkplain com.tools20022.repository.entity.Price#Currency
	 * Price.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency code in which the unit price and original charge price are expressed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Currency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingPrice1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Price.Currency;
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency code in which the unit price and original charge price are expressed.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Price per item or unit used to calculate the charge expressed in the
	 * pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price per item or unit used to calculate the charge expressed in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnitPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingPrice1.mmObject();
			businessComponentTrace_lazy = () -> Price.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Price per item or unit used to calculate the charge expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies how the charge was calculated.
	 * 
	 * Usage: The absence of this code assumes that the charge is calculated as
	 * the product of (volume x unit price).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#BillingChargeMethod
	 * CashAccountService.BillingChargeMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies how the charge was calculated. \n\nUsage: The absence of this code assumes that the charge is calculated as the product of (volume x unit price)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Method = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingPrice1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.BillingChargeMethod;
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Identifies how the charge was calculated. \n\nUsage: The absence of this code assumes that the charge is calculated as the product of (volume x unit price).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * Indicates that the charge calculation is based on a particular rule. The
	 * rule name is carried here and is defined by the trading partners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max20Text
	 * Max20Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the charge calculation is based on a particular rule. The rule name is carried here and is defined by the trading partners."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Rule = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingPrice1.mmObject();
			isDerived = false;
			xmlTag = "Rule";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rule";
			definition = "Indicates that the charge calculation is based on a particular rule. The rule name is carried here and is defined by the trading partners.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max20Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingPrice1.Currency, com.tools20022.repository.msg.BillingPrice1.UnitPrice, com.tools20022.repository.msg.BillingPrice1.Method,
						com.tools20022.repository.msg.BillingPrice1.Rule);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingPrice1";
				definition = "Specifies the billing price of a service.";
			}
		});
		return mmObject_lazy.get();
	}
}