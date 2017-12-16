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
import com.tools20022.repository.codeset.TradeExecutionSessionCode;
import com.tools20022.repository.codeset.TradingSessionCode;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionName
 * TradingSession.mmTradingSessionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTimeBracket
 * TradingSession.mmTimeBracket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
 * TradingSession.mmMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmQuote
 * TradingSession.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmSecuritiesOrder
 * TradingSession.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionIndicator
 * TradingSession.mmTradingSessionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionPhase
 * TradingSession.mmTradingSessionPhase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmUSFuturesTradingSession
 * TradingSession.mmUSFuturesTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmListTrading
 * TradingSession.mmListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingSession
 * TradingMarket.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingSession
 * DateTimePeriod.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderTradingSession
 * SecuritiesOrder.mmSecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
 * ListTrading.mmListTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
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
 * "TradingSession"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Established constraints under which a market operates"</li>
 * </ul>
 */
public class TradingSession {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text tradingSessionName;
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
	public static final MMBusinessAttribute mmTradingSessionName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionName";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingSession.class.getMethod("getTradingSessionName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod timeBracket;
	/**
	 * Specifies the time bracket of a trading session in actual date and time
	 * format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingSession
	 * DateTimePeriod.mmTradingSession}</li>
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
	public static final MMBusinessAssociationEnd mmTimeBracket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeBracket";
			definition = "Specifies the time bracket of a trading session in actual date and time format.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected TradingMarket market;
	/**
	 * Market for which trading session information is specified..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingSession
	 * TradingMarket.mmTradingSession}</li>
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
	public static final MMBusinessAssociationEnd mmMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which trading session information is specified..";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected SecuritiesQuoteVariable quote;
	/**
	 * Quote to which a trading session is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
	 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
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
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote to which a trading session is associated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmQuoteTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Securities order associated with a trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderTradingSession
	 * SecuritiesOrder.mmSecuritiesOrderTradingSession}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securities order associated with a trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected TradingSessionCode tradingSessionIndicator;
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
	public static final MMBusinessAttribute mmTradingSessionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionIndicator";
			definition = "Indicates the trading phase at the stock exchange, eg, opening auction phase, main trading phase, closing auction phase, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingSessionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingSession.class.getMethod("getTradingSessionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeExecutionSessionCode tradingSessionPhase;
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
	public static final MMBusinessAttribute mmTradingSessionPhase = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionPhase";
			definition = "Specific execution time period expressed through its trading session identifier. This identifier is for example used by exchanges, electronic communication networks (ECNs) and alternative trading systems (ATSs) to identify opening and closing hours of a trading session.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeExecutionSessionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingSession.class.getMethod("getTradingSessionPhase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text uSFuturesTradingSession;
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
	public static final MMBusinessAttribute mmUSFuturesTradingSession = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USFuturesTradingSession";
			definition = "Identification of a specific execution time bracket code, required by US regulations. This only applies to the US futures market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingSession.class.getMethod("getUSFuturesTradingSession", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ListTrading listTrading;
	/**
	 * List trading process for which a trading session is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
	 * ListTrading.mmListTradingSession}</li>
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
	public static final MMBusinessAssociationEnd mmListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which a trading session is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.mmListTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingSession";
				definition = "Established constraints under which a market operates";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.mmTradingSession, com.tools20022.repository.entity.DateTimePeriod.mmTradingSession,
						com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderTradingSession, com.tools20022.repository.entity.ListTrading.mmListTradingSession,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmQuoteTradingSession);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingSession.mmTradingSessionName, com.tools20022.repository.entity.TradingSession.mmTimeBracket,
						com.tools20022.repository.entity.TradingSession.mmMarket, com.tools20022.repository.entity.TradingSession.mmQuote, com.tools20022.repository.entity.TradingSession.mmSecuritiesOrder,
						com.tools20022.repository.entity.TradingSession.mmTradingSessionIndicator, com.tools20022.repository.entity.TradingSession.mmTradingSessionPhase,
						com.tools20022.repository.entity.TradingSession.mmUSFuturesTradingSession, com.tools20022.repository.entity.TradingSession.mmListTrading);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradingSession.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getTradingSessionName() {
		return tradingSessionName;
	}

	public void setTradingSessionName(Max140Text tradingSessionName) {
		this.tradingSessionName = tradingSessionName;
	}

	public DateTimePeriod getTimeBracket() {
		return timeBracket;
	}

	public void setTimeBracket(com.tools20022.repository.entity.DateTimePeriod timeBracket) {
		this.timeBracket = timeBracket;
	}

	public TradingMarket getMarket() {
		return market;
	}

	public void setMarket(com.tools20022.repository.entity.TradingMarket market) {
		this.market = market;
	}

	public SecuritiesQuoteVariable getQuote() {
		return quote;
	}

	public void setQuote(com.tools20022.repository.entity.SecuritiesQuoteVariable quote) {
		this.quote = quote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public TradingSessionCode getTradingSessionIndicator() {
		return tradingSessionIndicator;
	}

	public void setTradingSessionIndicator(TradingSessionCode tradingSessionIndicator) {
		this.tradingSessionIndicator = tradingSessionIndicator;
	}

	public TradeExecutionSessionCode getTradingSessionPhase() {
		return tradingSessionPhase;
	}

	public void setTradingSessionPhase(TradeExecutionSessionCode tradingSessionPhase) {
		this.tradingSessionPhase = tradingSessionPhase;
	}

	public Max140Text getUSFuturesTradingSession() {
		return uSFuturesTradingSession;
	}

	public void setUSFuturesTradingSession(Max140Text uSFuturesTradingSession) {
		this.uSFuturesTradingSession = uSFuturesTradingSession;
	}

	public ListTrading getListTrading() {
		return listTrading;
	}

	public void setListTrading(com.tools20022.repository.entity.ListTrading listTrading) {
		this.listTrading = listTrading;
	}
}