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
import com.tools20022.repository.codeset.TradeExecutionSessionCode;
import com.tools20022.repository.codeset.TradingSessionCode;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Established constraints under which a market operates
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradingSession" src="doc-files/TradingSession.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#TradingSessionName
 * TradingSession.TradingSessionName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#TimeBracket
 * TradingSession.TimeBracket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#Market
 * TradingSession.Market}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#Quote
 * TradingSession.Quote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#SecuritiesOrder
 * TradingSession.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#TradingSessionIndicator
 * TradingSession.TradingSessionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#TradingSessionPhase
 * TradingSession.TradingSessionPhase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#USFuturesTradingSession
 * TradingSession.USFuturesTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#ListTrading
 * TradingSession.ListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingSession
 * TradingMarket.TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingSession
 * DateTimePeriod.TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderTradingSession
 * SecuritiesOrder.SecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#ListTradingSession
 * ListTrading.ListTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#QuoteTradingSession
 * SecuritiesQuoteVariable.QuoteTradingSession}</li>
 * </ul>
 * </li>
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
 * "TradingSession"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Established constraints under which a market operates"</li>
 * </ul>
 */
public class TradingSession {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a specific execution time bracket code through its
	 * trading session name or description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a specific execution time bracket code through its trading session name or description."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingSessionName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionName";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the time bracket of a trading session in actual date and time
	 * format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingSession
	 * DateTimePeriod.TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeBracket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time bracket of a trading session in actual date and time format."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TimeBracket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeBracket";
			definition = "Specifies the time bracket of a trading session in actual date and time format.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which trading session information is specified..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingSession
	 * TradingMarket.TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market for which trading session information is specified.."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which trading session information is specified..";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote to which a trading session is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#QuoteTradingSession
	 * SecuritiesQuoteVariable.QuoteTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote to which a trading session is associated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote to which a trading session is associated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order associated with a trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderTradingSession
	 * SecuritiesOrder.SecuritiesOrderTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order associated with a trading session."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securities order associated with a trading session.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the trading phase at the stock exchange, eg, opening auction
	 * phase, main trading phase, closing auction phase, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingSessionCode
	 * TradingSessionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the trading phase at the stock exchange, eg, opening auction phase, main trading phase, closing auction phase, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingSessionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionIndicator";
			definition = "Indicates the trading phase at the stock exchange, eg, opening auction phase, main trading phase, closing auction phase, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradingSessionCode.mmObject();
		}
	};
	/**
	 * Specific execution time period expressed through its trading session
	 * identifier. This identifier is for example used by exchanges, electronic
	 * communication networks (ECNs) and alternative trading systems (ATSs) to
	 * identify opening and closing hours of a trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionPhase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific execution time period expressed through its trading session identifier. This identifier is for example used by exchanges, electronic communication networks (ECNs) and alternative trading systems (ATSs) to identify opening and closing hours of a trading session."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingSessionPhase = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionPhase";
			definition = "Specific execution time period expressed through its trading session identifier. This identifier is for example used by exchanges, electronic communication networks (ECNs) and alternative trading systems (ATSs) to identify opening and closing hours of a trading session.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeExecutionSessionCode.mmObject();
		}
	};
	/**
	 * Identification of a specific execution time bracket code, required by US
	 * regulations. This only applies to the US futures market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFuturesTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a specific execution time bracket code, required by US regulations. This only applies to the US futures market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute USFuturesTradingSession = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USFuturesTradingSession";
			definition = "Identification of a specific execution time bracket code, required by US regulations. This only applies to the US futures market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * List trading process for which a trading session is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#ListTradingSession
	 * ListTrading.ListTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ListTrading
	 * ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "List trading process for which a trading session is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which a trading session is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.ListTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingSession";
				definition = "Established constraints under which a market operates";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.TradingSession, com.tools20022.repository.entity.DateTimePeriod.TradingSession,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession, com.tools20022.repository.entity.ListTrading.ListTradingSession,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingSession.TradingSessionName, com.tools20022.repository.entity.TradingSession.TimeBracket, com.tools20022.repository.entity.TradingSession.Market,
						com.tools20022.repository.entity.TradingSession.Quote, com.tools20022.repository.entity.TradingSession.SecuritiesOrder, com.tools20022.repository.entity.TradingSession.TradingSessionIndicator,
						com.tools20022.repository.entity.TradingSession.TradingSessionPhase, com.tools20022.repository.entity.TradingSession.USFuturesTradingSession, com.tools20022.repository.entity.TradingSession.ListTrading);
			}
		});
		return mmObject_lazy.get();
	}
}