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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rights for cash entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionCashEntitlement"
 * src="doc-files/CorporateActionCashEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#GrossCashAmount
 * CorporateActionCashEntitlement.GrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#NetCashAmount
 * CorporateActionCashEntitlement.NetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#CashInLieuOfShare
 * CorporateActionCashEntitlement.CashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#CapitalGain
 * CorporateActionCashEntitlement.CapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#EntitledCashAmount
 * CorporateActionCashEntitlement.EntitledCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
 * CorporateActionCashEntitlement.ExchangeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
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
 * "CorporateActionCashEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights for cash entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionCashEntitlement extends CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money before any deductions and allowances have been made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossCashAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money after deductions and allowances have been made, if any,
	 * ie, the total amount +/- charges/fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money after deductions and allowances have been made, if any, ie, the total amount +/- charges/fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetCashAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, ie, the total amount +/- charges/fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash disbursement in lieu of a fractional quantity of, eg, equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, eg, equity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashInLieuOfShare = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, eg, equity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money distributed as the result of a capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money distributed as the result of a capital gain."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CapitalGain = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount based on terms of corporate action event and balance of
	 * underlying securities, entitled to/from account owner (which may be
	 * positive or negative).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntitledCashAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitledCashAmount";
			definition = "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate used to convert the cash entitlement value in
	 * another currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
	 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate used to convert the cash entitlement value in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the cash entitlement value in another currency.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCashEntitlement";
				definition = "Rights for cash entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionCashEntitlement.GrossCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.NetCashAmount,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.CashInLieuOfShare, com.tools20022.repository.entity.CorporateActionCashEntitlement.CapitalGain,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.EntitledCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate);
			}
		});
		return mmObject_lazy.get();
	}
}