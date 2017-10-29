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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.MarketTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Market;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties may meet in order
 * to negotiate and execute trades among themselves. It also identifies the
 * primary market where an asset is issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradingMarket" src="doc-files/TradingMarket.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
 * TradingMarket.TradedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Type
 * TradingMarket.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
 * TradingMarket.ListedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#SourceOfPrice
 * TradingMarket.SourceOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#TradeLotSize
 * TradingMarket.TradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
 * TradingMarket.MinimumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#ListingDate
 * TradingMarket.ListingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
 * TradingMarket.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingCurrency
 * TradingMarket.TradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
 * TradingMarket.MaximumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#StockExchange
 * TradingMarket.StockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#QuoteLot
 * TradingMarket.QuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RoundLot
 * TradingMarket.RoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingSession
 * TradingMarket.TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
 * TradingMarket.ListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#DefaultCurrency
 * TradingMarket.DefaultCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#FirstTradingDate
 * TradingMarket.FirstTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#LastTradingDate
 * TradingMarket.LastTradingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
 * TradingMarket.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#RelatedPlaceOfSettlement
 * TradingMarket.RelatedPlaceOfSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TradingMarket
 * Security.TradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
 * Security.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
 * SecuritiesIdentification.ApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#TradeLotMarket
 * LotBreakdown.TradeLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#QuoteLotMarket
 * LotBreakdown.QuoteLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#RoundLotMarket
 * LotBreakdown.RoundLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
 * Issuance.IssuePlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#MarketIdentification
 * SourceOfPrice.MarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
 * SecuritiesOrder.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#Market
 * TradingSession.Market}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#SettlementMarket
 * PlaceOfSettlement.SettlementMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange#Market
 * StockExchange.Market}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
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
 * "TradingMarket"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued."
 * </li>
 * </ul>
 */
public class TradingMarket extends Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security which is traded on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#TradingMarket
	 * Security.TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is traded on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradedSecurity";
			definition = "Security which is traded on a specific market.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.TradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Nature of a market in which transactions take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of a market in which transactions take place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of a market in which transactions take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarketTypeCode.mmObject();
		}
	};
	/**
	 * Security whch is listed on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
	 * Security.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security whch is listed on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurity";
			definition = "Security whch is listed on a specific market.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.PlaceOfListing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which provides a price on a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#MarketIdentification
	 * SourceOfPrice.MarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SourceOfPrice
	 * SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provides a price on a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SourceOfPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfPrice";
			definition = "Party which provides a price on a market.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.MarketIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the number of securities that have to be traded in one lot .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#TradeLotMarket
	 * LotBreakdown.TradeLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of securities that have to be traded in one lot ."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeLotSize = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeLotSize";
			definition = "Specifies the number of securities that have to be traded in one lot .";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.TradeLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
	 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time at which the security is listed at the specific exchange.
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security is listed at the specific exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ListingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Order for which a place of trade is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
	 * SecuritiesOrder.PlaceOfTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a place of trade is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a place of trade is requested.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency of the trading.
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Miaximum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
	 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miaximum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Miaximum number of securities that can be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Stock exchange which operates on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StockExchange#Market
	 * StockExchange.Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StockExchange
	 * StockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock exchange which operates on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StockExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Stock exchange which operates on a specific market.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StockExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StockExchange.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot size associated with the price. Most exchanges require that pricing
	 * be quoted in round lot size. However, some exchanges have pricing quoted
	 * in many different lot sizes, for example, Latin America, some Asian
	 * markets, Turkey.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#QuoteLotMarket
	 * LotBreakdown.QuoteLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuoteLot = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteLot";
			definition = "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#RoundLotMarket
	 * LotBreakdown.RoundLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundLot = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.RoundLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trading session associated with a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#Market
	 * TradingSession.Market}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading session associated with a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session associated with a market.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trading identification used on this trading market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
	 * SecuritiesIdentification.ApplicableTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurityTradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading identification used on this trading market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListedSecurityTradingIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurityTradingIdentification";
			definition = "Trading identification used on this trading market.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Default currency for the securities trading on this market.
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default currency for the securities trading on this market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DefaultCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultCurrency";
			definition = "Default currency for the securities trading on this market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * First date/time at which the security is eligible for trading.
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which the security is eligible for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstTradingDate";
			definition = "First date/time at which the security is eligible for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last date/time at which the security is eligible for trading.
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which the security is eligible for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Last date/time at which the security is eligible for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Issuance for which the place has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
	 * Issuance.IssuePlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which the place has been defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the place has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuePlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place of settlement for which a settlement market is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#SettlementMarket
	 * PlaceOfSettlement.SettlementMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PlaceOfSettlement
	 * PlaceOfSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPlaceOfSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of settlement for which a settlement market is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPlaceOfSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPlaceOfSettlement";
			definition = "Place of settlement for which a settlement market is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PlaceOfSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingMarket";
				definition = "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.TradingMarket, com.tools20022.repository.entity.Security.PlaceOfListing,
						com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.LotBreakdown.TradeLotMarket, com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket,
						com.tools20022.repository.entity.LotBreakdown.RoundLotMarket, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.SourceOfPrice.MarketIdentification,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.TradingSession.Market, com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket,
						com.tools20022.repository.entity.StockExchange.Market);
				superType_lazy = () -> Market.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.Type, com.tools20022.repository.entity.TradingMarket.ListedSecurity,
						com.tools20022.repository.entity.TradingMarket.SourceOfPrice, com.tools20022.repository.entity.TradingMarket.TradeLotSize, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.ListingDate, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.TradingMarket.TradingCurrency,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.TradingMarket.StockExchange, com.tools20022.repository.entity.TradingMarket.QuoteLot,
						com.tools20022.repository.entity.TradingMarket.RoundLot, com.tools20022.repository.entity.TradingMarket.TradingSession, com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification,
						com.tools20022.repository.entity.TradingMarket.DefaultCurrency, com.tools20022.repository.entity.TradingMarket.FirstTradingDate, com.tools20022.repository.entity.TradingMarket.LastTradingDate,
						com.tools20022.repository.entity.TradingMarket.Issuance, com.tools20022.repository.entity.TradingMarket.RelatedPlaceOfSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}