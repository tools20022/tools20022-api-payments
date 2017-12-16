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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmBuyAmount
 * DisclosedListTrading.mmBuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmSellAmount
 * DisclosedListTrading.mmSellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmRequestedSettlementDateCode
 * DisclosedListTrading.mmRequestedSettlementDateCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDisclosedListTrading
 * SecuritiesAccount.mmDisclosedListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected SecuritiesAccount disclosedListTradingAccount;
	/**
	 * Securities account used for the trade of a disclosed list of securities,
	 * eg, in basket or program trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDisclosedListTrading
	 * SecuritiesAccount.mmDisclosedListTrading}</li>
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
	public static final MMBusinessAssociationEnd mmDisclosedListTradingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTradingAccount";
			definition = "Securities account used for the trade of a disclosed list of securities, eg, in basket or program trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmDisclosedListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected CurrencyAndAmount buyAmount;
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
	public static final MMBusinessAttribute mmBuyAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Total trade value for which a party is willing to purchase financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisclosedListTrading.class.getMethod("getBuyAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount sellAmount;
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
	public static final MMBusinessAttribute mmSellAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Total trade value for which a party is willing to sell financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisclosedListTrading.class.getMethod("getSellAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementDateCode requestedSettlementDateCode;
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
	public static final MMBusinessAttribute mmRequestedSettlementDateCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDateCode";
			definition = "Requested date of trade settlement in coded form (eg, trade date +1).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisclosedListTrading.class.getMethod("getRequestedSettlementDateCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisclosedListTrading";
				definition = "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmDisclosedListTrading);
				superType_lazy = () -> ListTrading.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount, com.tools20022.repository.entity.DisclosedListTrading.mmBuyAmount,
						com.tools20022.repository.entity.DisclosedListTrading.mmSellAmount, com.tools20022.repository.entity.DisclosedListTrading.mmRequestedSettlementDateCode);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DisclosedListTrading.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount getDisclosedListTradingAccount() {
		return disclosedListTradingAccount;
	}

	public void setDisclosedListTradingAccount(com.tools20022.repository.entity.SecuritiesAccount disclosedListTradingAccount) {
		this.disclosedListTradingAccount = disclosedListTradingAccount;
	}

	public CurrencyAndAmount getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(CurrencyAndAmount buyAmount) {
		this.buyAmount = buyAmount;
	}

	public CurrencyAndAmount getSellAmount() {
		return sellAmount;
	}

	public void setSellAmount(CurrencyAndAmount sellAmount) {
		this.sellAmount = sellAmount;
	}

	public SettlementDateCode getRequestedSettlementDateCode() {
		return requestedSettlementDateCode;
	}

	public void setRequestedSettlementDateCode(SettlementDateCode requestedSettlementDateCode) {
		this.requestedSettlementDateCode = requestedSettlementDateCode;
	}
}