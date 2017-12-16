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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Method used by the trading parties to negotiate and/or execute a deal.
	 * <p>
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
	public static final MMBusinessAttribute mmTradingMethod = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Negotiation.class.getMethod("getTradingMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade tradeExecution;
	/**
	 * Execution of a trade as a result of a successful negotiation between two
	 * trading parties.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeExecution";
			definition = "Execution of a trade as a result of a successful negotiation between two trading parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected System tradingSystem;
	/**
	 * Electronic system through which parties are able to negotiate trades.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSystem";
			definition = "Electronic system through which parties are able to negotiate trades.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected Max35Text negotiationIdentification;
	/**
	 * Reference of a negotiation.
	 * <p>
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
	public static final MMBusinessAttribute mmNegotiationIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Negotiation.class.getMethod("getNegotiationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Quote quote;
	/**
	 * Quote details shown in a negotiation process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote details shown in a negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest indicationOfInterest;
	/**
	 * Indication of interest process which is the start of the negotiation.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process which is the start of the negotiation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmNegotiationDetails;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrder> securitiesOrder;
	/**
	 * Result of a successful negotiation.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Result of a successful negotiation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmRelatedNegotiation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Negotiation";
				definition = "Decision making on the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Trade.mmRelatedNegotiation, com.tools20022.repository.entity.System.mmNegotiation, com.tools20022.repository.entity.SecuritiesOrder.mmRelatedNegotiation,
								com.tools20022.repository.entity.Quote.mmRelatedNegotiation, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmNegotiationDetails);
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

	public void setTradingMethod(TradingMethodCode tradingMethod) {
		this.tradingMethod = tradingMethod;
	}

	public Trade getTradeExecution() {
		return tradeExecution;
	}

	public void setTradeExecution(com.tools20022.repository.entity.Trade tradeExecution) {
		this.tradeExecution = tradeExecution;
	}

	public System getTradingSystem() {
		return tradingSystem;
	}

	public void setTradingSystem(com.tools20022.repository.entity.System tradingSystem) {
		this.tradingSystem = tradingSystem;
	}

	public Max35Text getNegotiationIdentification() {
		return negotiationIdentification;
	}

	public void setNegotiationIdentification(Max35Text negotiationIdentification) {
		this.negotiationIdentification = negotiationIdentification;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
	}

	public BuyOrSellIndicationOfInterest getIndicationOfInterest() {
		return indicationOfInterest;
	}

	public void setIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest indicationOfInterest) {
		this.indicationOfInterest = indicationOfInterest;
	}

	public List<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(List<com.tools20022.repository.entity.SecuritiesOrder> securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}
}