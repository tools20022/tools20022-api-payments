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
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.ListTrading;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List trading by which the buy-side details the exact stocks and sizes to be
 * traded and the sell-side offers the buy-side a two-way price, to buy or to
 * sell the indicated stocks. All sell-side firms see all of the stocks and
 * quantities in the portfolio during the bidding phase regardless of whether or
 * not they win the business.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DisclosedListTrading" src="doc-files/DisclosedListTrading.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#DisclosedListTradingAccount
 * DisclosedListTrading.DisclosedListTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#BuyAmount
 * DisclosedListTrading.BuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#SellAmount
 * DisclosedListTrading.SellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#RequestedSettlementDateCode
 * DisclosedListTrading.RequestedSettlementDateCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DisclosedListTrading
 * SecuritiesAccount.DisclosedListTrading}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
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
 * "DisclosedListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business."
 * </li>
 * </ul>
 */
public class DisclosedListTrading extends ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities account used for the trade of a disclosed list of securities,
	 * eg, in basket or program trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DisclosedListTrading
	 * SecuritiesAccount.DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisclosedListTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities account used for the trade of a disclosed list of securities, eg, in basket or program trading."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DisclosedListTradingAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTradingAccount";
			definition = "Securities account used for the trade of a disclosed list of securities, eg, in basket or program trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total trade value for which a party is willing to purchase financial
	 * instruments.
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
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total trade value for which a party is willing to purchase financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuyAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Total trade value for which a party is willing to purchase financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total trade value for which a party is willing to sell financial
	 * instruments.
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
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total trade value for which a party is willing to sell financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SellAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Total trade value for which a party is willing to sell financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Requested date of trade settlement in coded form (eg, trade date +1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested date of trade settlement in coded form (eg, trade date +1)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedSettlementDateCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDateCode";
			definition = "Requested date of trade settlement in coded form (eg, trade date +1).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DisclosedListTrading";
				definition = "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading);
				superType_lazy = () -> ListTrading.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount, com.tools20022.repository.entity.DisclosedListTrading.BuyAmount,
						com.tools20022.repository.entity.DisclosedListTrading.SellAmount, com.tools20022.repository.entity.DisclosedListTrading.RequestedSettlementDateCode);
			}
		});
		return mmObject_lazy.get();
	}
}