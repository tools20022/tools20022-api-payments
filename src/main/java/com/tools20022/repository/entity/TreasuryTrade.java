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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Trade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to treasury operations such as the exchange of
 * currencies, the lending of cash amounts and the related derivatives trades
 * (options and non deliverable trades).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTrade" src="doc-files/TreasuryTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasuryTradeSettlementStatus
 * TreasuryTrade.TreasuryTradeSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#InformationPartyRole
 * TreasuryTrade.InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasurySettlementPartyRole
 * TreasuryTrade.TreasurySettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTrade#PartyRole
 * TreasuryTrade.PartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#TreasuryTrade
 * InformationPartyRole.TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TreasuryTrade
 * TreasuryTradeSettlementStatus.TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole#TreasuryTrade
 * TreasuryTradePartyRole.TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole#TreasuryTrade
 * TreasurySettlementPartyRole.TreasuryTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
 * ForeignExchangeSwap}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
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
 * "TreasuryTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to treasury operations such as the exchange of currencies, the lending of cash amounts and the related derivatives trades (options and non deliverable trades)."
 * </li>
 * </ul>
 */
public class TreasuryTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the settlement status of a treasury trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TreasuryTrade
	 * TreasuryTradeSettlementStatus.TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTradeSettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the settlement status of a treasury trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasuryTradeSettlementStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradeSettlementStatus";
			definition = "Specifies the settlement status of a treasury trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which provides prices, interest rates or exchange rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#TreasuryTrade
	 * InformationPartyRole.TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which provides prices, interest rates or exchange rates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provides prices, interest rates or exchange rates.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of the settlement of a treasury
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole#TreasuryTrade
	 * TreasurySettlementPartyRole.TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole
	 * TreasurySettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasurySettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of the settlement of a treasury trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasurySettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasurySettlementPartyRole";
			definition = "Role played by a party in the context of the settlement of a treasury trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role played by a party in a treasury trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole#TreasuryTrade
	 * TreasuryTradePartyRole.TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
	 * TreasuryTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in a treasury trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a treasury trade.";
			minOccurs = 0;
			type_lazy = () -> TreasuryTradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradePartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTrade";
				definition = "Specifies trades linked to treasury operations such as the exchange of currencies, the lending of cash amounts and the related derivatives trades (options and non deliverable trades).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade,
						com.tools20022.repository.entity.TreasuryTradePartyRole.TreasuryTrade, com.tools20022.repository.entity.TreasurySettlementPartyRole.TreasuryTrade);
				subType_lazy = () -> Arrays.asList(ForeignExchangeTrade.mmObject(), ForeignExchangeSwap.mmObject(), CurrencyOption.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus, com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole,
						com.tools20022.repository.entity.TreasuryTrade.TreasurySettlementPartyRole, com.tools20022.repository.entity.TreasuryTrade.PartyRole);
			}
		});
		return mmObject_lazy.get();
	}
}