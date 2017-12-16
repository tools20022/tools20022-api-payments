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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrder" src="doc-files/SecuritiesOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderEffectiveDate
 * SecuritiesOrder.mmOrderEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExpiryDate
 * SecuritiesOrder.mmOrderExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
 * SecuritiesOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCashMargin
 * SecuritiesOrder.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
 * SecuritiesOrder.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSolicitedOrder
 * SecuritiesOrder.mmSolicitedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCustomerCapacity
 * SecuritiesOrder.mmCustomerCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
 * SecuritiesOrder.mmPositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmForeignExchangeExecutionRequested
 * SecuritiesOrder.mmForeignExchangeExecutionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
 * SecuritiesOrder.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderOriginatorEligibility
 * SecuritiesOrder.mmOrderOriginatorEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
 * SecuritiesOrder.mmOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBusinessProcessType
 * SecuritiesOrder.mmBusinessProcessType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
 * SecuritiesOrder.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
 * SecuritiesOrder.mmOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmGiveUpNumberOfDays
 * SecuritiesOrder.mmGiveUpNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmTradeRegulatoryConditionsType
 * SecuritiesOrder.mmTradeRegulatoryConditionsType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
 * SecuritiesOrder.mmDayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderPartyRole
 * SecuritiesOrder.mmSecuritiesOrderPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
 * SecuritiesOrder.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedNegotiation
 * SecuritiesOrder.mmRelatedNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
 * SecuritiesOrder.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmLegalParameters
 * SecuritiesOrder.mmLegalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
 * SecuritiesOrder.mmOrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
 * SecuritiesOrder.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecutionParameters
 * SecuritiesOrder.mmOrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
 * SecuritiesOrder.mmOrderingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
 * SecuritiesOrder.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmFundTransactionDirectionIndicator
 * SecuritiesOrder.mmFundTransactionDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderDate
 * SecuritiesOrder.mmOrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPegDifference
 * SecuritiesOrder.mmPegDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderTradingSession
 * SecuritiesOrder.mmSecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedOrderBook
 * SecuritiesOrder.mmRelatedOrderBook}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
 * SecuritiesOrder.mmListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBuySideRelatedCrossTrade
 * SecuritiesOrder.mmBuySideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSellSideRelatedCrossTrade
 * SecuritiesOrder.mmSellSideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
 * SecuritiesOrder.mmOrderedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
 * SecuritiesOrder.mmBookingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
 * SecuritiesOrder.mmQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
 * SecuritiesOrder.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
 * SecuritiesOrder.mmExecutionInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
 * SecuritiesOrder.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
 * Security.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
 * SecuritiesPricing.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
 * SecuritiesPricing.mmStopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
 * TradingMarket.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
 * SecuritiesAccount.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
 * Adjustment.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
 * SecuritiesQuantity.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
 * SecuritiesQuantity.mmPreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
 * ListTrading.mmSecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmSecuritiesOrder
 * TradingSession.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesOrder
 * Allocation.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmRelatedOrder
 * SecuritiesPostTradeBooking.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#mmSecuritiesOrder
 * SecuritiesOrderPartyRole.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmSecuritiesOrder
 * Negotiation.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRelatedSecuritiesOrder
 * SecuritiesOrderParameters.mmRelatedSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmRelatedOrder
 * SecuritiesRegulatoryDetails.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmSecuritiesOrder
 * ExchangeForPhysicalTrade.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrderBook#mmOrder
 * OrderBook.mmOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
 * CrossTrade.mmBuySideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
 * CrossTrade.mmSellSideOrder}</li>
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
 * "SecuritiesOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * </ul>
 */
public class SecuritiesOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime orderEffectiveDate;
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
	public static final MMBusinessAttribute mmOrderEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderEffectiveDate";
			definition = "Date/time on which the order is effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderExpiryDate;
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
	public static final MMBusinessAttribute mmOrderExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExpiryDate";
			definition = "Date/time on which the order is to expire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashMarginOrderCode cashMargin;
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
	public static final MMBusinessAttribute mmCashMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashMarginOrderCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getCashMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SideCode side;
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
	public static final MMBusinessAttribute mmSide = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator solicitedOrder;
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
	public static final MMBusinessAttribute mmSolicitedOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSolicitedOrder", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CustomerOrderCapacityCode customerCapacity;
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
	public static final MMBusinessAttribute mmCustomerCapacity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerOrderCapacityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getCustomerCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PositionEffectCode positionEffect;
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
	public static final MMBusinessAttribute mmPositionEffect = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositionEffectCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getPositionEffect", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator foreignExchangeExecutionRequested;
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
	public static final MMBusinessAttribute mmForeignExchangeExecutionRequested = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getForeignExchangeExecutionRequested", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode settlementCurrency;
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
	public static final MMBusinessAttribute mmSettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EligibilityCode orderOriginatorEligibility;
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
	public static final MMBusinessAttribute mmOrderOriginatorEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderOriginatorEligibility", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity orderedQuantity;
	/**
	 * Quantity of financial instrument to be ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
	 * SecuritiesQuantity.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderedQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected BusinessProcessTypeCode businessProcessType;
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
	public static final MMBusinessAttribute mmBusinessProcessType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessProcessType";
			definition = "Type of business process model used to carry out the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessProcessTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getBusinessProcessType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingMarket placeOfTrade;
	/**
	 * Market at which the order is to be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
	 * TradingMarket.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market at which the order is to be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected CurrencyAndAmount orderedAmount;
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
	public static final MMBusinessAttribute mmOrderedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedAmount";
			definition = "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3Number giveUpNumberOfDays;
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
	public static final MMBusinessAttribute mmGiveUpNumberOfDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getGiveUpNumberOfDays", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeRegulatoryConditionsCode tradeRegulatoryConditionsType;
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
	public static final MMBusinessAttribute mmTradeRegulatoryConditionsType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getTradeRegulatoryConditionsType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity dayOrderQuantity;
	/**
	 * For good till orders, the order quantity less all quantity (adjusted for
	 * stock splits) that traded on previous days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
	 * SecuritiesQuantity.mmPreviousDayOrder}</li>
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
	public static final MMBusinessAssociationEnd mmDayOrderQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayOrderQuantity";
			definition = "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmPreviousDayOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderPartyRole> securitiesOrderPartyRole;
	/**
	 * Specifies the party which plays a role in the process of ordering
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#mmSecuritiesOrder
	 * SecuritiesOrderPartyRole.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrderPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderPartyRole";
			definition = "Specifies the party which plays a role in the process of ordering securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderStatus> status;
	/**
	 * Indicates the status of an order at a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
	 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * Negotiation which resulted in an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmSecuritiesOrder
	 * Negotiation.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation which resulted in an order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Adjustment> adjustments;
	/**
	 * Charges and commissions associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
	 * Adjustment.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmAdjustments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Charges and commissions associated with a securities order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected SecuritiesRegulatoryDetails legalParameters;
	/**
	 * Legal parameters required in a securities order for regulatory purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmRelatedOrder
	 * SecuritiesRegulatoryDetails.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmLegalParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalParameters";
			definition = "Legal parameters required in a securities order for regulatory purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmObject();
		}
	};
	protected SecuritiesPricing orderPrice;
	/**
	 * Indicates the requested price for the order. This can be a "stop" price a
	 * "limit" price or a "deal" price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
	 * SecuritiesPricing.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderPrice";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing stopPrice;
	/**
	 * Indicates the stop price in case of a stop order or a stop limit order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
	 * SecuritiesPricing.mmStopPriceOrder}</li>
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
	public static final MMBusinessAssociationEnd mmStopPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopPrice";
			definition = "Indicates the stop price in case of a stop order or a stop limit order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Allocation> securitiesOrderAllocation;
	/**
	 * Information about the pre-allocation of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesOrder
	 * Allocation.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrderAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderAllocation";
			definition = "Information about the pre-allocation of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrderParameters orderExecutionParameters;
	/**
	 * Conditions under which a securities order must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRelatedSecuritiesOrder
	 * SecuritiesOrderParameters.mmRelatedSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderExecutionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExecutionParameters";
			definition = "Conditions under which a securities order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmRelatedSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected SecuritiesTrade orderExecution;
	/**
	 * Result of a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
	 * SecuritiesTrade.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExecution";
			definition = "Result of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> orderingAccount;
	/**
	 * Account impacted by a security transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
	 * SecuritiesAccount.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderingAccount";
			definition = "Account impacted by a security transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected SecuritiesQuoteVariable quote;
	/**
	 * Quote for which the order conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
	 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote for which the order conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected TransactionType1Code fundTransactionDirectionIndicator;
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
	public static final MMBusinessAttribute mmFundTransactionDirectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundTransactionDirectionIndicator";
			definition = "Indicates the type of investment funds transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionType1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getFundTransactionDirectionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderDate;
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
	public static final MMBusinessAttribute mmOrderDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDate";
			definition = "Date/time on which the order was placed by the investor with the \ntrading party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount pegDifference;
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
	public static final MMBusinessAttribute mmPegDifference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PegDifference";
			definition = "Price difference for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getPegDifference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingSession securitiesOrderTradingSession;
	/**
	 * Details of a specific trading session associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmSecuritiesOrder
	 * TradingSession.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrderTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderTradingSession";
			definition = "Details of a specific trading session associated with a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected OrderBook relatedOrderBook;
	/**
	 * Order book whichgenerates an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrderBook#mmOrder
	 * OrderBook.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrderBook = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderBook";
			definition = "Order book whichgenerates an order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrderBook.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrderBook.mmObject();
		}
	};
	protected ListTrading listTrading;
	/**
	 * List trading information containing a serie of orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
	 * ListTrading.mmSecuritiesListOrder}</li>
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
	public static final MMBusinessAssociationEnd mmListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading information containing a serie of orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};
	protected CrossTrade buySideRelatedCrossTrade;
	/**
	 * Cross trade for which the buy side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
	 * CrossTrade.mmBuySideOrder}</li>
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
	public static final MMBusinessAssociationEnd mmBuySideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySideRelatedCrossTrade";
			definition = "Cross trade for which the buy side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmBuySideOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
		}
	};
	protected CrossTrade sellSideRelatedCrossTrade;
	/**
	 * Cross trade for which the sell side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
	 * CrossTrade.mmSellSideOrder}</li>
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
	public static final MMBusinessAssociationEnd mmSellSideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellSideRelatedCrossTrade";
			definition = "Cross trade for which the sell side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmSellSideOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> orderedSecurity;
	/**
	 * Security for which an order is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
	 * Security.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedSecurity";
			definition = "Security for which an order is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SecuritiesPostTradeBooking bookingInstructions;
	/**
	 * Information about the booking of executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmRelatedOrder
	 * SecuritiesPostTradeBooking.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmBookingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookingInstructions";
			definition = "Information about the booking of executions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
		}
	};
	protected ExchangeForPhysicalTrade exchangeForPhysicalTrade;
	/**
	 * Conditions under which an exchange for physical trade takes place in the
	 * case of a non disclosed bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmSecuritiesOrder
	 * ExchangeForPhysicalTrade.mmSecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeForPhysicalTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
		}
	};
	protected OrderQuantityTypeCode quantityType;
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
	public static final MMBusinessAttribute mmQuantityType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityType";
			definition = "Describes how the quantity is specified, that is by quantity of units or by amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderQuantityTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getQuantityType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clientOrderIdentification;
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
	public static final MMBusinessAttribute mmClientOrderIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getClientOrderIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrderExecutionInstruction executionInstructions;
	/**
	 * Execution instructions in which securities order parameters are defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
	 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmExecutionInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionInstructions";
			definition = "Execution instructions in which securities order parameters are defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
		}
	};
	protected OrderTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getType", new Class[]{});
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
				name = "SecuritiesOrder";
				definition = "Intention to transfer an ownership of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesPricing.mmOrder,
						com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder, com.tools20022.repository.entity.TradingMarket.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder,
						com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmPreviousDayOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder, com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder, com.tools20022.repository.entity.TradingSession.mmSecuritiesOrder,
						com.tools20022.repository.entity.Allocation.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmSecuritiesOrder,
						com.tools20022.repository.entity.Negotiation.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmRelatedSecuritiesOrder, com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmSecuritiesOrder, com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmSecuritiesOrder, com.tools20022.repository.entity.OrderBook.mmOrder,
						com.tools20022.repository.entity.CrossTrade.mmBuySideOrder, com.tools20022.repository.entity.CrossTrade.mmSellSideOrder);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrder.mmObject(), com.tools20022.repository.entity.CrossTrade.mmObject());
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmOrderEffectiveDate, com.tools20022.repository.entity.SecuritiesOrder.mmOrderExpiryDate,
						com.tools20022.repository.entity.SecuritiesOrder.mmIdentification, com.tools20022.repository.entity.SecuritiesOrder.mmCashMargin, com.tools20022.repository.entity.SecuritiesOrder.mmSide,
						com.tools20022.repository.entity.SecuritiesOrder.mmSolicitedOrder, com.tools20022.repository.entity.SecuritiesOrder.mmCustomerCapacity, com.tools20022.repository.entity.SecuritiesOrder.mmPositionEffect,
						com.tools20022.repository.entity.SecuritiesOrder.mmForeignExchangeExecutionRequested, com.tools20022.repository.entity.SecuritiesOrder.mmSettlementCurrency,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderOriginatorEligibility, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity,
						com.tools20022.repository.entity.SecuritiesOrder.mmBusinessProcessType, com.tools20022.repository.entity.SecuritiesOrder.mmPlaceOfTrade, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedAmount,
						com.tools20022.repository.entity.SecuritiesOrder.mmGiveUpNumberOfDays, com.tools20022.repository.entity.SecuritiesOrder.mmTradeRegulatoryConditionsType,
						com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderPartyRole, com.tools20022.repository.entity.SecuritiesOrder.mmStatus,
						com.tools20022.repository.entity.SecuritiesOrder.mmRelatedNegotiation, com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments, com.tools20022.repository.entity.SecuritiesOrder.mmLegalParameters,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice, com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderAllocation,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecutionParameters, com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution, com.tools20022.repository.entity.SecuritiesOrder.mmOrderingAccount,
						com.tools20022.repository.entity.SecuritiesOrder.mmQuote, com.tools20022.repository.entity.SecuritiesOrder.mmFundTransactionDirectionIndicator, com.tools20022.repository.entity.SecuritiesOrder.mmOrderDate,
						com.tools20022.repository.entity.SecuritiesOrder.mmPegDifference, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderTradingSession,
						com.tools20022.repository.entity.SecuritiesOrder.mmRelatedOrderBook, com.tools20022.repository.entity.SecuritiesOrder.mmListTrading, com.tools20022.repository.entity.SecuritiesOrder.mmBuySideRelatedCrossTrade,
						com.tools20022.repository.entity.SecuritiesOrder.mmSellSideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.mmBookingInstructions, com.tools20022.repository.entity.SecuritiesOrder.mmExchangeForPhysicalTrade, com.tools20022.repository.entity.SecuritiesOrder.mmQuantityType,
						com.tools20022.repository.entity.SecuritiesOrder.mmClientOrderIdentification, com.tools20022.repository.entity.SecuritiesOrder.mmExecutionInstructions, com.tools20022.repository.entity.SecuritiesOrder.mmType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getOrderEffectiveDate() {
		return orderEffectiveDate;
	}

	public void setOrderEffectiveDate(ISODateTime orderEffectiveDate) {
		this.orderEffectiveDate = orderEffectiveDate;
	}

	public ISODateTime getOrderExpiryDate() {
		return orderExpiryDate;
	}

	public void setOrderExpiryDate(ISODateTime orderExpiryDate) {
		this.orderExpiryDate = orderExpiryDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public CashMarginOrderCode getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(CashMarginOrderCode cashMargin) {
		this.cashMargin = cashMargin;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public YesNoIndicator getSolicitedOrder() {
		return solicitedOrder;
	}

	public void setSolicitedOrder(YesNoIndicator solicitedOrder) {
		this.solicitedOrder = solicitedOrder;
	}

	public CustomerOrderCapacityCode getCustomerCapacity() {
		return customerCapacity;
	}

	public void setCustomerCapacity(CustomerOrderCapacityCode customerCapacity) {
		this.customerCapacity = customerCapacity;
	}

	public PositionEffectCode getPositionEffect() {
		return positionEffect;
	}

	public void setPositionEffect(PositionEffectCode positionEffect) {
		this.positionEffect = positionEffect;
	}

	public YesNoIndicator getForeignExchangeExecutionRequested() {
		return foreignExchangeExecutionRequested;
	}

	public void setForeignExchangeExecutionRequested(YesNoIndicator foreignExchangeExecutionRequested) {
		this.foreignExchangeExecutionRequested = foreignExchangeExecutionRequested;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public EligibilityCode getOrderOriginatorEligibility() {
		return orderOriginatorEligibility;
	}

	public void setOrderOriginatorEligibility(EligibilityCode orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
	}

	public SecuritiesQuantity getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(com.tools20022.repository.entity.SecuritiesQuantity orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public BusinessProcessTypeCode getBusinessProcessType() {
		return businessProcessType;
	}

	public void setBusinessProcessType(BusinessProcessTypeCode businessProcessType) {
		this.businessProcessType = businessProcessType;
	}

	public TradingMarket getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.entity.TradingMarket placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	public CurrencyAndAmount getOrderedAmount() {
		return orderedAmount;
	}

	public void setOrderedAmount(CurrencyAndAmount orderedAmount) {
		this.orderedAmount = orderedAmount;
	}

	public Max3Number getGiveUpNumberOfDays() {
		return giveUpNumberOfDays;
	}

	public void setGiveUpNumberOfDays(Max3Number giveUpNumberOfDays) {
		this.giveUpNumberOfDays = giveUpNumberOfDays;
	}

	public TradeRegulatoryConditionsCode getTradeRegulatoryConditionsType() {
		return tradeRegulatoryConditionsType;
	}

	public void setTradeRegulatoryConditionsType(TradeRegulatoryConditionsCode tradeRegulatoryConditionsType) {
		this.tradeRegulatoryConditionsType = tradeRegulatoryConditionsType;
	}

	public SecuritiesQuantity getDayOrderQuantity() {
		return dayOrderQuantity;
	}

	public void setDayOrderQuantity(com.tools20022.repository.entity.SecuritiesQuantity dayOrderQuantity) {
		this.dayOrderQuantity = dayOrderQuantity;
	}

	public List<SecuritiesOrderPartyRole> getSecuritiesOrderPartyRole() {
		return securitiesOrderPartyRole;
	}

	public void setSecuritiesOrderPartyRole(List<com.tools20022.repository.entity.SecuritiesOrderPartyRole> securitiesOrderPartyRole) {
		this.securitiesOrderPartyRole = securitiesOrderPartyRole;
	}

	public List<SecuritiesOrderStatus> getStatus() {
		return status;
	}

	public void setStatus(List<com.tools20022.repository.entity.SecuritiesOrderStatus> status) {
		this.status = status;
	}

	public Negotiation getRelatedNegotiation() {
		return relatedNegotiation;
	}

	public void setRelatedNegotiation(com.tools20022.repository.entity.Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}

	public void setAdjustments(List<com.tools20022.repository.entity.Adjustment> adjustments) {
		this.adjustments = adjustments;
	}

	public SecuritiesRegulatoryDetails getLegalParameters() {
		return legalParameters;
	}

	public void setLegalParameters(com.tools20022.repository.entity.SecuritiesRegulatoryDetails legalParameters) {
		this.legalParameters = legalParameters;
	}

	public SecuritiesPricing getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(com.tools20022.repository.entity.SecuritiesPricing orderPrice) {
		this.orderPrice = orderPrice;
	}

	public SecuritiesPricing getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(com.tools20022.repository.entity.SecuritiesPricing stopPrice) {
		this.stopPrice = stopPrice;
	}

	public List<Allocation> getSecuritiesOrderAllocation() {
		return securitiesOrderAllocation;
	}

	public void setSecuritiesOrderAllocation(List<com.tools20022.repository.entity.Allocation> securitiesOrderAllocation) {
		this.securitiesOrderAllocation = securitiesOrderAllocation;
	}

	public SecuritiesOrderParameters getOrderExecutionParameters() {
		return orderExecutionParameters;
	}

	public void setOrderExecutionParameters(com.tools20022.repository.entity.SecuritiesOrderParameters orderExecutionParameters) {
		this.orderExecutionParameters = orderExecutionParameters;
	}

	public SecuritiesTrade getOrderExecution() {
		return orderExecution;
	}

	public void setOrderExecution(com.tools20022.repository.entity.SecuritiesTrade orderExecution) {
		this.orderExecution = orderExecution;
	}

	public List<SecuritiesAccount> getOrderingAccount() {
		return orderingAccount;
	}

	public void setOrderingAccount(List<com.tools20022.repository.entity.SecuritiesAccount> orderingAccount) {
		this.orderingAccount = orderingAccount;
	}

	public SecuritiesQuoteVariable getQuote() {
		return quote;
	}

	public void setQuote(com.tools20022.repository.entity.SecuritiesQuoteVariable quote) {
		this.quote = quote;
	}

	public TransactionType1Code getFundTransactionDirectionIndicator() {
		return fundTransactionDirectionIndicator;
	}

	public void setFundTransactionDirectionIndicator(TransactionType1Code fundTransactionDirectionIndicator) {
		this.fundTransactionDirectionIndicator = fundTransactionDirectionIndicator;
	}

	public ISODateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(ISODateTime orderDate) {
		this.orderDate = orderDate;
	}

	public CurrencyAndAmount getPegDifference() {
		return pegDifference;
	}

	public void setPegDifference(CurrencyAndAmount pegDifference) {
		this.pegDifference = pegDifference;
	}

	public TradingSession getSecuritiesOrderTradingSession() {
		return securitiesOrderTradingSession;
	}

	public void setSecuritiesOrderTradingSession(com.tools20022.repository.entity.TradingSession securitiesOrderTradingSession) {
		this.securitiesOrderTradingSession = securitiesOrderTradingSession;
	}

	public OrderBook getRelatedOrderBook() {
		return relatedOrderBook;
	}

	public void setRelatedOrderBook(com.tools20022.repository.entity.OrderBook relatedOrderBook) {
		this.relatedOrderBook = relatedOrderBook;
	}

	public ListTrading getListTrading() {
		return listTrading;
	}

	public void setListTrading(com.tools20022.repository.entity.ListTrading listTrading) {
		this.listTrading = listTrading;
	}

	public CrossTrade getBuySideRelatedCrossTrade() {
		return buySideRelatedCrossTrade;
	}

	public void setBuySideRelatedCrossTrade(com.tools20022.repository.entity.CrossTrade buySideRelatedCrossTrade) {
		this.buySideRelatedCrossTrade = buySideRelatedCrossTrade;
	}

	public CrossTrade getSellSideRelatedCrossTrade() {
		return sellSideRelatedCrossTrade;
	}

	public void setSellSideRelatedCrossTrade(com.tools20022.repository.entity.CrossTrade sellSideRelatedCrossTrade) {
		this.sellSideRelatedCrossTrade = sellSideRelatedCrossTrade;
	}

	public List<Security> getOrderedSecurity() {
		return orderedSecurity;
	}

	public void setOrderedSecurity(List<com.tools20022.repository.entity.Security> orderedSecurity) {
		this.orderedSecurity = orderedSecurity;
	}

	public SecuritiesPostTradeBooking getBookingInstructions() {
		return bookingInstructions;
	}

	public void setBookingInstructions(com.tools20022.repository.entity.SecuritiesPostTradeBooking bookingInstructions) {
		this.bookingInstructions = bookingInstructions;
	}

	public ExchangeForPhysicalTrade getExchangeForPhysicalTrade() {
		return exchangeForPhysicalTrade;
	}

	public void setExchangeForPhysicalTrade(com.tools20022.repository.entity.ExchangeForPhysicalTrade exchangeForPhysicalTrade) {
		this.exchangeForPhysicalTrade = exchangeForPhysicalTrade;
	}

	public OrderQuantityTypeCode getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(OrderQuantityTypeCode quantityType) {
		this.quantityType = quantityType;
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public void setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = clientOrderIdentification;
	}

	public SecuritiesOrderExecutionInstruction getExecutionInstructions() {
		return executionInstructions;
	}

	public void setExecutionInstructions(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction executionInstructions) {
		this.executionInstructions = executionInstructions;
	}

	public OrderTypeCode getType() {
		return type;
	}

	public void setType(OrderTypeCode type) {
		this.type = type;
	}
}