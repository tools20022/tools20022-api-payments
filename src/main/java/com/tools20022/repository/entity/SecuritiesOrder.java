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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Order;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrder" src="doc-files/SecuritiesOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderEffectiveDate
 * SecuritiesOrder.OrderEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExpiryDate
 * SecuritiesOrder.OrderExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Identification
 * SecuritiesOrder.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#CashMargin
 * SecuritiesOrder.CashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Side
 * SecuritiesOrder.Side}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SolicitedOrder
 * SecuritiesOrder.SolicitedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#CustomerCapacity
 * SecuritiesOrder.CustomerCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PositionEffect
 * SecuritiesOrder.PositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ForeignExchangeExecutionRequested
 * SecuritiesOrder.ForeignExchangeExecutionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SettlementCurrency
 * SecuritiesOrder.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderOriginatorEligibility
 * SecuritiesOrder.OrderOriginatorEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
 * SecuritiesOrder.OrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BusinessProcessType
 * SecuritiesOrder.BusinessProcessType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
 * SecuritiesOrder.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedAmount
 * SecuritiesOrder.OrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#GiveUpNumberOfDays
 * SecuritiesOrder.GiveUpNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#TradeRegulatoryConditionsType
 * SecuritiesOrder.TradeRegulatoryConditionsType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
 * SecuritiesOrder.DayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderPartyRole
 * SecuritiesOrder.SecuritiesOrderPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Status
 * SecuritiesOrder.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedNegotiation
 * SecuritiesOrder.RelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
 * SecuritiesOrder.Adjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#LegalParameters
 * SecuritiesOrder.LegalParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
 * SecuritiesOrder.OrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
 * SecuritiesOrder.StopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderAllocation
 * SecuritiesOrder.SecuritiesOrderAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecutionParameters
 * SecuritiesOrder.OrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
 * SecuritiesOrder.OrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
 * SecuritiesOrder.OrderingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Quote
 * SecuritiesOrder.Quote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#FundTransactionDirectionIndicator
 * SecuritiesOrder.FundTransactionDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderDate
 * SecuritiesOrder.OrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PegDifference
 * SecuritiesOrder.PegDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderTradingSession
 * SecuritiesOrder.SecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedOrderBook
 * SecuritiesOrder.RelatedOrderBook}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
 * SecuritiesOrder.ListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BuySideRelatedCrossTrade
 * SecuritiesOrder.BuySideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SellSideRelatedCrossTrade
 * SecuritiesOrder.SellSideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
 * SecuritiesOrder.OrderedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BookingInstructions
 * SecuritiesOrder.BookingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExchangeForPhysicalTrade
 * SecuritiesOrder.ExchangeForPhysicalTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#QuantityType
 * SecuritiesOrder.QuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ClientOrderIdentification
 * SecuritiesOrder.ClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExecutionInstructions
 * SecuritiesOrder.ExecutionInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Type
 * SecuritiesOrder.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
 * Security.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
 * SecuritiesPricing.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
 * SecuritiesPricing.StopPriceOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
 * TradingMarket.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
 * SecuritiesAccount.RelatedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
 * Adjustment.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
 * SecuritiesQuantity.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
 * SecuritiesQuantity.PreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
 * SecuritiesTrade.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
 * ListTrading.SecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#SecuritiesOrder
 * TradingSession.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesOrder
 * Allocation.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#RelatedOrder
 * SecuritiesOrderExecutionInstruction.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#RelatedOrder
 * SecuritiesPostTradeBooking.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#SecuritiesOrder
 * SecuritiesOrderPartyRole.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#SecuritiesOrder
 * Negotiation.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SecuritiesOrder
 * SecuritiesOrderStatus.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RelatedSecuritiesOrder
 * SecuritiesOrderParameters.RelatedSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#RelatedOrder
 * SecuritiesRegulatoryDetails.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#SecuritiesOrder
 * SecuritiesQuoteVariable.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#SecuritiesOrder
 * ExchangeForPhysicalTrade.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrderBook#Order
 * OrderBook.Order}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#BuySideOrder
 * CrossTrade.BuySideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#SellSideOrder
 * CrossTrade.SellSideOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
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
 * "SecuritiesOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * </ul>
 */
public class SecuritiesOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time on which the order is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderEffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderEffectiveDate";
			definition = "Date/time on which the order is effective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time on which the order is to expire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is to expire."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExpiryDate";
			definition = "Date/time on which the order is to expire.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique identifier for an order, as assigned by the sell-side. The
	 * identifier must be unique within a single trading day.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies whether an order is a margin order or a non-margin order. This
	 * is primarily used when sending orders to Japanese exchanges to indicate
	 * sell margin or buy to cover. The same tag could be assigned also by
	 * buy-side to indicate the intent to sell or buy margin and the sell-side
	 * to accept or reject (base on some validation criteria) the margin
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
	 * CashMarginOrderCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashMargin = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashMarginOrderCode.mmObject();
		}
	};
	/**
	 * Coded list to specify the side of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.SideCode
	 * SideCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Side = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SideCode.mmObject();
		}
	};
	/**
	 * Indicates that an order has been generated in response to an
	 * advertisement or an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order has been generated in response to an advertisement or an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SolicitedOrder = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Capacity of customer placing the order. Primarily used by futures
	 * exchanges to indicate the CTI code (customer type indicator) as required
	 * by the US CFTC (Commodity Futures Trading Commission).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
	 * CustomerOrderCapacityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CustomerCapacity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CustomerOrderCapacityCode.mmObject();
		}
	};
	/**
	 * Indicates whether the resulting position after a trade should be an
	 * opening position or closing position. Used for omnibus accounting - where
	 * accounts are held on a gross basis instead of being netted together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PositionEffect = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PositionEffectCode.mmObject();
		}
	};
	/**
	 * Indicates a request for a foreign exchange accommodation trade to be
	 * executed along with security transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeExecutionRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForeignExchangeExecutionRequested = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency to be used for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency to be used for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Counterparties eligibility as defined by article 24 of the EU MiFID
	 * Directive applicable to transactions executed by investment firms for
	 * eligible counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderOriginatorEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to be ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
	 * SecuritiesQuantity.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderedQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of business process model used to carry out the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessProcessType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of business process model used to carry out the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessProcessType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessProcessType";
			definition = "Type of business process model used to carry out the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessProcessTypeCode.mmObject();
		}
	};
	/**
	 * Market at which the order is to be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
	 * TradingMarket.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market at which the order is to be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market at which the order is to be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount to be used to derive the appropriate quantity of financial
	 * instrument to be bought or sold.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedAmount";
			definition = "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the number of days from trade date that the counterparty on the
	 * other side of the trade should be "given up" or divulged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GiveUpNumberOfDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	/**
	 * Specifies the regulatory conditions type of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode
	 * TradeRegulatoryConditionsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryConditionsType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the regulatory conditions type of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeRegulatoryConditionsType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
		}
	};
	/**
	 * For good till orders, the order quantity less all quantity (adjusted for
	 * stock splits) that traded on previous days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
	 * SecuritiesQuantity.PreviousDayOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DayOrderQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayOrderQuantity";
			definition = "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the party which plays a role in the process of ordering
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#SecuritiesOrder
	 * SecuritiesOrderPartyRole.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole
	 * SecuritiesOrderPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which plays a role in the process of ordering securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderPartyRole";
			definition = "Specifies the party which plays a role in the process of ordering securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the status of an order at a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SecuritiesOrder
	 * SecuritiesOrderStatus.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an order at a specific point in time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Negotiation which resulted in an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#SecuritiesOrder
	 * Negotiation.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation which resulted in an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation which resulted in an order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Charges and commissions associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
	 * Adjustment.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges and commissions associated with a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Charges and commissions associated with a securities order.";
			minOccurs = 0;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal parameters required in a securities order for regulatory purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#RelatedOrder
	 * SecuritiesRegulatoryDetails.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails
	 * SecuritiesRegulatoryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal parameters required in a securities order for regulatory purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LegalParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalParameters";
			definition = "Legal parameters required in a securities order for regulatory purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the requested price for the order. This can be a "stop" price a
	 * "limit" price or a "deal" price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
	 * SecuritiesPricing.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPrice";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the stop price in case of a stop order or a stop limit order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
	 * SecuritiesPricing.StopPriceOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the stop price in case of a stop order or a stop limit order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StopPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPrice";
			definition = "Indicates the stop price in case of a stop order or a stop limit order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the pre-allocation of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SecuritiesOrder
	 * Allocation.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the pre-allocation of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderAllocation";
			definition = "Information about the pre-allocation of an order.";
			minOccurs = 0;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Conditions under which a securities order must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RelatedSecuritiesOrder
	 * SecuritiesOrderParameters.RelatedSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExecutionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which a securities order must be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderExecutionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecutionParameters";
			definition = "Conditions under which a securities order must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
	 * SecuritiesTrade.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecution";
			definition = "Result of a securities order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account impacted by a security transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
	 * SecuritiesAccount.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by a security transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderingAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderingAccount";
			definition = "Account impacted by a security transaction.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote for which the order conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#SecuritiesOrder
	 * SecuritiesQuoteVariable.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote for which the order conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote for which the order conditions are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of investment funds transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundTransactionDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of investment funds transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FundTransactionDirectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundTransactionDirectionIndicator";
			definition = "Indicates the type of investment funds transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * Date/time on which the order was placed by the investor with the trading
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the order was placed by the investor with the \ntrading party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDate";
			definition = "Date/time on which the order was placed by the investor with the \ntrading party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Price difference for a pegged order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price difference for a pegged order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PegDifference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PegDifference";
			definition = "Price difference for a pegged order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Details of a specific trading session associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#SecuritiesOrder
	 * TradingSession.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a specific trading session associated with a securities order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderTradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderTradingSession";
			definition = "Details of a specific trading session associated with a securities order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order book whichgenerates an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.OrderBook#Order
	 * OrderBook.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrderBook OrderBook}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderBook"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order book whichgenerates an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderBook = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderBook";
			definition = "Order book whichgenerates an order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrderBook.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrderBook.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * List trading information containing a serie of orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
	 * ListTrading.SecuritiesListOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List trading information containing a serie of orders."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading information containing a serie of orders.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.SecuritiesListOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cross trade for which the buy side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#BuySideOrder
	 * CrossTrade.BuySideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CrossTrade
	 * CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideRelatedCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade for which the buy side information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BuySideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideRelatedCrossTrade";
			definition = "Cross trade for which the buy side information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CrossTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.BuySideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cross trade for which the sell side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#SellSideOrder
	 * CrossTrade.SellSideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CrossTrade
	 * CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideRelatedCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade for which the sell side information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SellSideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideRelatedCrossTrade";
			definition = "Cross trade for which the sell side information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CrossTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.SellSideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which an order is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
	 * Security.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an order is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedSecurity";
			definition = "Security for which an order is specified.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the booking of executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#RelatedOrder
	 * SecuritiesPostTradeBooking.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the booking of executions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookingInstructions";
			definition = "Information about the booking of executions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Conditions under which an exchange for physical trade takes place in the
	 * case of a non disclosed bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#SecuritiesOrder
	 * ExchangeForPhysicalTrade.SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeForPhysicalTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes how the quantity is specified, that is by quantity of units or
	 * by amount of money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes how the quantity is specified, that is by quantity of units or by amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuantityType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityType";
			definition = "Describes how the quantity is specified, that is by quantity of units or by amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderQuantityTypeCode.mmObject();
		}
	};
	/**
	 * Unique identifier for the order as assigned by the buy-side. Uniqueness
	 * must be guaranteed within a single trading day. Firms, particularly those
	 * that electronically submit multi-day orders, trade globally or throughout
	 * market close periods, should ensure uniqueness across days, for example
	 * by embedding a date within the ClientOrderIdentification element.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClientOrderIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Execution instructions in which securities order parameters are defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#RelatedOrder
	 * SecuritiesOrderExecutionInstruction.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution instructions in which securities order parameters are defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutionInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionInstructions";
			definition = "Execution instructions in which securities order parameters are defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of instruction to a broker or dealer to buy or sell a
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrder";
				definition = "Intention to transfer an ownership of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesPricing.Order,
						com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder,
						com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder, com.tools20022.repository.entity.TradingSession.SecuritiesOrder,
						com.tools20022.repository.entity.Allocation.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder, com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder, com.tools20022.repository.entity.Negotiation.SecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder, com.tools20022.repository.entity.OrderBook.Order, com.tools20022.repository.entity.CrossTrade.BuySideOrder,
						com.tools20022.repository.entity.CrossTrade.SellSideOrder);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrder.mmObject(), CrossTrade.mmObject());
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.OrderEffectiveDate, com.tools20022.repository.entity.SecuritiesOrder.OrderExpiryDate,
						com.tools20022.repository.entity.SecuritiesOrder.Identification, com.tools20022.repository.entity.SecuritiesOrder.CashMargin, com.tools20022.repository.entity.SecuritiesOrder.Side,
						com.tools20022.repository.entity.SecuritiesOrder.SolicitedOrder, com.tools20022.repository.entity.SecuritiesOrder.CustomerCapacity, com.tools20022.repository.entity.SecuritiesOrder.PositionEffect,
						com.tools20022.repository.entity.SecuritiesOrder.ForeignExchangeExecutionRequested, com.tools20022.repository.entity.SecuritiesOrder.SettlementCurrency,
						com.tools20022.repository.entity.SecuritiesOrder.OrderOriginatorEligibility, com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.BusinessProcessType,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.SecuritiesOrder.OrderedAmount, com.tools20022.repository.entity.SecuritiesOrder.GiveUpNumberOfDays,
						com.tools20022.repository.entity.SecuritiesOrder.TradeRegulatoryConditionsType, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderPartyRole, com.tools20022.repository.entity.SecuritiesOrder.Status, com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.SecuritiesOrder.LegalParameters, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice,
						com.tools20022.repository.entity.SecuritiesOrder.StopPrice, com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation, com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesOrder.OrderExecution, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.SecuritiesOrder.Quote,
						com.tools20022.repository.entity.SecuritiesOrder.FundTransactionDirectionIndicator, com.tools20022.repository.entity.SecuritiesOrder.OrderDate, com.tools20022.repository.entity.SecuritiesOrder.PegDifference,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession, com.tools20022.repository.entity.SecuritiesOrder.RelatedOrderBook, com.tools20022.repository.entity.SecuritiesOrder.ListTrading,
						com.tools20022.repository.entity.SecuritiesOrder.BuySideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.SellSideRelatedCrossTrade,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.SecuritiesOrder.BookingInstructions, com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade,
						com.tools20022.repository.entity.SecuritiesOrder.QuantityType, com.tools20022.repository.entity.SecuritiesOrder.ClientOrderIdentification, com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions,
						com.tools20022.repository.entity.SecuritiesOrder.Type);
			}
		});
		return mmObject_lazy.get();
	}
}