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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.TradeExecutionSessionCode;
import com.tools20022.repository.codeset.TradingSessionCode;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
	protected Max140Text tradingSessionName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 336</li>
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
	public static final MMBusinessAttribute<TradingSession, Max140Text> mmTradingSessionName = new MMBusinessAttribute<TradingSession, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "336"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionName";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(TradingSession obj) {
			return obj.getTradingSessionName();
		}

		@Override
		public void setValue(TradingSession obj, Max140Text value) {
			obj.setTradingSessionName(value);
		}
	};
	protected DateTimePeriod timeBracket;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TradingSession, DateTimePeriod> mmTimeBracket = new MMBusinessAssociationEnd<TradingSession, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeBracket";
			definition = "Specifies the time bracket of a trading session in actual date and time format.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(TradingSession obj) {
			return obj.getTimeBracket();
		}

		@Override
		public void setValue(TradingSession obj, DateTimePeriod value) {
			obj.setTimeBracket(value);
		}
	};
	protected TradingMarket market;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TradingSession, Optional<TradingMarket>> mmMarket = new MMBusinessAssociationEnd<TradingSession, Optional<TradingMarket>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which trading session information is specified..";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TradingMarket.mmTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public Optional<TradingMarket> getValue(TradingSession obj) {
			return obj.getMarket();
		}

		@Override
		public void setValue(TradingSession obj, Optional<TradingMarket> value) {
			obj.setMarket(value.orElse(null));
		}
	};
	protected SecuritiesQuoteVariable quote;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TradingSession, Optional<SecuritiesQuoteVariable>> mmQuote = new MMBusinessAssociationEnd<TradingSession, Optional<SecuritiesQuoteVariable>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote to which a trading session is associated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuoteVariable.mmQuoteTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}

		@Override
		public Optional<SecuritiesQuoteVariable> getValue(TradingSession obj) {
			return obj.getQuote();
		}

		@Override
		public void setValue(TradingSession obj, Optional<SecuritiesQuoteVariable> value) {
			obj.setQuote(value.orElse(null));
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TradingSession, Optional<SecuritiesOrder>> mmSecuritiesOrder = new MMBusinessAssociationEnd<TradingSession, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securities order associated with a trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmSecuritiesOrderTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(TradingSession obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(TradingSession obj, Optional<SecuritiesOrder> value) {
			obj.setSecuritiesOrder(value.orElse(null));
		}
	};
	protected TradingSessionCode tradingSessionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TRSE</li>
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
	public static final MMBusinessAttribute<TradingSession, TradingSessionCode> mmTradingSessionIndicator = new MMBusinessAttribute<TradingSession, TradingSessionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TRSE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionIndicator";
			definition = "Indicates the trading phase at the stock exchange, eg, opening auction phase, main trading phase, closing auction phase, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingSessionCode.mmObject();
		}

		@Override
		public TradingSessionCode getValue(TradingSession obj) {
			return obj.getTradingSessionIndicator();
		}

		@Override
		public void setValue(TradingSession obj, TradingSessionCode value) {
			obj.setTradingSessionIndicator(value);
		}
	};
	protected TradeExecutionSessionCode tradingSessionPhase;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 336</li>
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
	public static final MMBusinessAttribute<TradingSession, TradeExecutionSessionCode> mmTradingSessionPhase = new MMBusinessAttribute<TradingSession, TradeExecutionSessionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "336"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSessionPhase";
			definition = "Specific execution time period expressed through its trading session identifier. This identifier is for example used by exchanges, electronic communication networks (ECNs) and alternative trading systems (ATSs) to identify opening and closing hours of a trading session.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeExecutionSessionCode.mmObject();
		}

		@Override
		public TradeExecutionSessionCode getValue(TradingSession obj) {
			return obj.getTradingSessionPhase();
		}

		@Override
		public void setValue(TradingSession obj, TradeExecutionSessionCode value) {
			obj.setTradingSessionPhase(value);
		}
	};
	protected Max140Text uSFuturesTradingSession;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 625</li>
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
	public static final MMBusinessAttribute<TradingSession, Max140Text> mmUSFuturesTradingSession = new MMBusinessAttribute<TradingSession, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "625"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USFuturesTradingSession";
			definition = "Identification of a specific execution time bracket code, required by US regulations. This only applies to the US futures market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(TradingSession obj) {
			return obj.getUSFuturesTradingSession();
		}

		@Override
		public void setValue(TradingSession obj, Max140Text value) {
			obj.setUSFuturesTradingSession(value);
		}
	};
	protected ListTrading listTrading;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<TradingSession, Optional<ListTrading>> mmListTrading = new MMBusinessAssociationEnd<TradingSession, Optional<ListTrading>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which a trading session is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ListTrading.mmListTradingSession;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ListTrading.mmObject();
		}

		@Override
		public Optional<ListTrading> getValue(TradingSession obj) {
			return obj.getListTrading();
		}

		@Override
		public void setValue(TradingSession obj, Optional<ListTrading> value) {
			obj.setListTrading(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingSession";
				definition = "Established constraints under which a market operates";
				associationDomain_lazy = () -> Arrays.asList(TradingMarket.mmTradingSession, DateTimePeriod.mmTradingSession, SecuritiesOrder.mmSecuritiesOrderTradingSession, ListTrading.mmListTradingSession,
						SecuritiesQuoteVariable.mmQuoteTradingSession);
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

	public TradingSession setTradingSessionName(Max140Text tradingSessionName) {
		this.tradingSessionName = Objects.requireNonNull(tradingSessionName);
		return this;
	}

	public DateTimePeriod getTimeBracket() {
		return timeBracket;
	}

	public TradingSession setTimeBracket(DateTimePeriod timeBracket) {
		this.timeBracket = Objects.requireNonNull(timeBracket);
		return this;
	}

	public Optional<TradingMarket> getMarket() {
		return market == null ? Optional.empty() : Optional.of(market);
	}

	public TradingSession setMarket(TradingMarket market) {
		this.market = market;
		return this;
	}

	public Optional<SecuritiesQuoteVariable> getQuote() {
		return quote == null ? Optional.empty() : Optional.of(quote);
	}

	public TradingSession setQuote(SecuritiesQuoteVariable quote) {
		this.quote = quote;
		return this;
	}

	public Optional<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder == null ? Optional.empty() : Optional.of(securitiesOrder);
	}

	public TradingSession setSecuritiesOrder(SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
		return this;
	}

	public TradingSessionCode getTradingSessionIndicator() {
		return tradingSessionIndicator;
	}

	public TradingSession setTradingSessionIndicator(TradingSessionCode tradingSessionIndicator) {
		this.tradingSessionIndicator = Objects.requireNonNull(tradingSessionIndicator);
		return this;
	}

	public TradeExecutionSessionCode getTradingSessionPhase() {
		return tradingSessionPhase;
	}

	public TradingSession setTradingSessionPhase(TradeExecutionSessionCode tradingSessionPhase) {
		this.tradingSessionPhase = Objects.requireNonNull(tradingSessionPhase);
		return this;
	}

	public Max140Text getUSFuturesTradingSession() {
		return uSFuturesTradingSession;
	}

	public TradingSession setUSFuturesTradingSession(Max140Text uSFuturesTradingSession) {
		this.uSFuturesTradingSession = Objects.requireNonNull(uSFuturesTradingSession);
		return this;
	}

	public Optional<ListTrading> getListTrading() {
		return listTrading == null ? Optional.empty() : Optional.of(listTrading);
	}

	public TradingSession setListTrading(ListTrading listTrading) {
		this.listTrading = listTrading;
		return this;
	}
}