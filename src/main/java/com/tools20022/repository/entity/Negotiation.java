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
import com.tools20022.repository.codeset.TradingMethodCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision making on the transfer of a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Negotiation" src="doc-files/Negotiation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmTradingMethod
 * Negotiation.mmTradingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
 * Negotiation.mmTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmTradingSystem
 * Negotiation.mmTradingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmNegotiationIdentification
 * Negotiation.mmNegotiationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmQuote
 * Negotiation.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmIndicationOfInterest
 * Negotiation.mmIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmSecuritiesOrder
 * Negotiation.mmSecuritiesOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmRelatedNegotiation
 * Trade.mmRelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmNegotiation
 * System.mmNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedNegotiation
 * SecuritiesOrder.mmRelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRelatedNegotiation
 * Quote.mmRelatedNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNegotiationDetails
 * BuyOrSellIndicationOfInterest.mmNegotiationDetails}</li>
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
 * "Negotiation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Decision making on the transfer of a financial instrument."</li>
 * </ul>
 */
public class Negotiation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradingMethodCode tradingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodCode
	 * TradingMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used by the trading parties to negotiate and/or execute a deal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Negotiation, TradingMethodCode> mmTradingMethod = new MMBusinessAttribute<Negotiation, TradingMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingMethodCode.mmObject();
		}

		@Override
		public TradingMethodCode getValue(Negotiation obj) {
			return obj.getTradingMethod();
		}

		@Override
		public void setValue(Negotiation obj, TradingMethodCode value) {
			obj.setTradingMethod(value);
		}
	};
	protected Trade tradeExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmRelatedNegotiation
	 * Trade.mmRelatedNegotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution of a trade as a result of a successful negotiation between two trading parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Negotiation, Trade> mmTradeExecution = new MMBusinessAssociationEnd<Negotiation, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeExecution";
			definition = "Execution of a trade as a result of a successful negotiation between two trading parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Negotiation obj) {
			return obj.getTradeExecution();
		}

		@Override
		public void setValue(Negotiation obj, Trade value) {
			obj.setTradeExecution(value);
		}
	};
	protected System tradingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmNegotiation
	 * System.mmNegotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic system through which parties are able to negotiate trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Negotiation, Optional<System>> mmTradingSystem = new MMBusinessAssociationEnd<Negotiation, Optional<System>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSystem";
			definition = "Electronic system through which parties are able to negotiate trades.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> System.mmNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public Optional<System> getValue(Negotiation obj) {
			return obj.getTradingSystem();
		}

		@Override
		public void setValue(Negotiation obj, Optional<System> value) {
			obj.setTradingSystem(value.orElse(null));
		}
	};
	protected Max35Text negotiationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of a negotiation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Negotiation, Max35Text> mmNegotiationIdentification = new MMBusinessAttribute<Negotiation, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiationIdentification";
			definition = "Reference of a negotiation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Negotiation obj) {
			return obj.getNegotiationIdentification();
		}

		@Override
		public void setValue(Negotiation obj, Max35Text value) {
			obj.setNegotiationIdentification(value);
		}
	};
	protected Quote quote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmRelatedNegotiation
	 * Quote.mmRelatedNegotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote details shown in a negotiation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Negotiation, Quote> mmQuote = new MMBusinessAssociationEnd<Negotiation, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote details shown in a negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(Negotiation obj) {
			return obj.getQuote();
		}

		@Override
		public void setValue(Negotiation obj, Quote value) {
			obj.setQuote(value);
		}
	};
	protected BuyOrSellIndicationOfInterest indicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNegotiationDetails
	 * BuyOrSellIndicationOfInterest.mmNegotiationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process which is the start of the negotiation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Negotiation, Optional<BuyOrSellIndicationOfInterest>> mmIndicationOfInterest = new MMBusinessAssociationEnd<Negotiation, Optional<BuyOrSellIndicationOfInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process which is the start of the negotiation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BuyOrSellIndicationOfInterest.mmNegotiationDetails;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}

		@Override
		public Optional<BuyOrSellIndicationOfInterest> getValue(Negotiation obj) {
			return obj.getIndicationOfInterest();
		}

		@Override
		public void setValue(Negotiation obj, Optional<BuyOrSellIndicationOfInterest> value) {
			obj.setIndicationOfInterest(value.orElse(null));
		}
	};
	protected List<SecuritiesOrder> securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedNegotiation
	 * SecuritiesOrder.mmRelatedNegotiation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Negotiation Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a successful negotiation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Negotiation, List<SecuritiesOrder>> mmSecuritiesOrder = new MMBusinessAssociationEnd<Negotiation, List<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Result of a successful negotiation.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public List<SecuritiesOrder> getValue(Negotiation obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(Negotiation obj, List<SecuritiesOrder> value) {
			obj.setSecuritiesOrder(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Negotiation";
				definition = "Decision making on the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(Trade.mmRelatedNegotiation, System.mmNegotiation, SecuritiesOrder.mmRelatedNegotiation, Quote.mmRelatedNegotiation, BuyOrSellIndicationOfInterest.mmNegotiationDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Negotiation.mmTradingMethod, com.tools20022.repository.entity.Negotiation.mmTradeExecution, com.tools20022.repository.entity.Negotiation.mmTradingSystem,
						com.tools20022.repository.entity.Negotiation.mmNegotiationIdentification, com.tools20022.repository.entity.Negotiation.mmQuote, com.tools20022.repository.entity.Negotiation.mmIndicationOfInterest,
						com.tools20022.repository.entity.Negotiation.mmSecuritiesOrder);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Negotiation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradingMethodCode getTradingMethod() {
		return tradingMethod;
	}

	public Negotiation setTradingMethod(TradingMethodCode tradingMethod) {
		this.tradingMethod = Objects.requireNonNull(tradingMethod);
		return this;
	}

	public Trade getTradeExecution() {
		return tradeExecution;
	}

	public Negotiation setTradeExecution(Trade tradeExecution) {
		this.tradeExecution = Objects.requireNonNull(tradeExecution);
		return this;
	}

	public Optional<System> getTradingSystem() {
		return tradingSystem == null ? Optional.empty() : Optional.of(tradingSystem);
	}

	public Negotiation setTradingSystem(System tradingSystem) {
		this.tradingSystem = tradingSystem;
		return this;
	}

	public Max35Text getNegotiationIdentification() {
		return negotiationIdentification;
	}

	public Negotiation setNegotiationIdentification(Max35Text negotiationIdentification) {
		this.negotiationIdentification = Objects.requireNonNull(negotiationIdentification);
		return this;
	}

	public Quote getQuote() {
		return quote;
	}

	public Negotiation setQuote(Quote quote) {
		this.quote = Objects.requireNonNull(quote);
		return this;
	}

	public Optional<BuyOrSellIndicationOfInterest> getIndicationOfInterest() {
		return indicationOfInterest == null ? Optional.empty() : Optional.of(indicationOfInterest);
	}

	public Negotiation setIndicationOfInterest(BuyOrSellIndicationOfInterest indicationOfInterest) {
		this.indicationOfInterest = indicationOfInterest;
		return this;
	}

	public List<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder == null ? securitiesOrder = new ArrayList<>() : securitiesOrder;
	}

	public Negotiation setSecuritiesOrder(List<SecuritiesOrder> securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}
}