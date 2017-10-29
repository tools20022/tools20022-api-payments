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
import com.tools20022.repository.codeset.TradingMethodCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradingMethod
 * Negotiation.TradingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradeExecution
 * Negotiation.TradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradingSystem
 * Negotiation.TradingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#NegotiationIdentification
 * Negotiation.NegotiationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#Quote
 * Negotiation.Quote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#IndicationOfInterest
 * Negotiation.IndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#SecuritiesOrder
 * Negotiation.SecuritiesOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#RelatedNegotiation
 * Trade.RelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Negotiation
 * System.Negotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedNegotiation
 * SecuritiesOrder.RelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#RelatedNegotiation
 * Quote.RelatedNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#NegotiationDetails
 * BuyOrSellIndicationOfInterest.NegotiationDetails}</li>
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
	public static final MMBusinessAttribute TradingMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradingMethodCode.mmObject();
		}
	};
	/**
	 * Execution of a trade as a result of a successful negotiation between two
	 * trading parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#RelatedNegotiation
	 * Trade.RelatedNegotiation}</li>
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
	public static final MMBusinessAssociationEnd TradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeExecution";
			definition = "Execution of a trade as a result of a successful negotiation between two trading parties.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Electronic system through which parties are able to negotiate trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#Negotiation
	 * System.Negotiation}</li>
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
	public static final MMBusinessAssociationEnd TradingSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSystem";
			definition = "Electronic system through which parties are able to negotiate trades.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Negotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute NegotiationIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiationIdentification";
			definition = "Reference of a negotiation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Quote details shown in a negotiation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#RelatedNegotiation
	 * Quote.RelatedNegotiation}</li>
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
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote details shown in a negotiation process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process which is the start of the negotiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#NegotiationDetails
	 * BuyOrSellIndicationOfInterest.NegotiationDetails}</li>
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
	public static final MMBusinessAssociationEnd IndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process which is the start of the negotiation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of a successful negotiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedNegotiation
	 * SecuritiesOrder.RelatedNegotiation}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Negotiation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Result of a successful negotiation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Negotiation";
				definition = "Decision making on the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.RelatedNegotiation, com.tools20022.repository.entity.System.Negotiation,
						com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation, com.tools20022.repository.entity.Quote.RelatedNegotiation, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Negotiation.TradingMethod, com.tools20022.repository.entity.Negotiation.TradeExecution, com.tools20022.repository.entity.Negotiation.TradingSystem,
						com.tools20022.repository.entity.Negotiation.NegotiationIdentification, com.tools20022.repository.entity.Negotiation.Quote, com.tools20022.repository.entity.Negotiation.IndicationOfInterest,
						com.tools20022.repository.entity.Negotiation.SecuritiesOrder);
			}
		});
		return mmObject_lazy.get();
	}
}