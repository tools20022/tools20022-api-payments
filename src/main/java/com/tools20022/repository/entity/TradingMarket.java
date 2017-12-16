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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.MarketTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Market;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
 * TradingMarket.mmTradedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmType
 * TradingMarket.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
 * TradingMarket.mmListedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
 * TradingMarket.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
 * TradingMarket.mmTradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmListingDate
 * TradingMarket.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
 * TradingMarket.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
 * TradingMarket.mmTradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmStockExchange
 * TradingMarket.mmStockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
 * TradingMarket.mmQuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
 * TradingMarket.mmRoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingSession
 * TradingMarket.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmDefaultCurrency
 * TradingMarket.mmDefaultCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmFirstTradingDate
 * TradingMarket.mmFirstTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmLastTradingDate
 * TradingMarket.mmLastTradingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmIssuance
 * TradingMarket.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedPlaceOfSettlement
 * TradingMarket.mmRelatedPlaceOfSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
 * Security.mmTradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
 * Security.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
 * LotBreakdown.mmTradeLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
 * LotBreakdown.mmQuoteLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
 * LotBreakdown.mmRoundLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuePlace
 * Issuance.mmIssuePlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
 * SourceOfPrice.mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
 * SecuritiesOrder.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
 * TradingSession.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#mmSettlementMarket
 * PlaceOfSettlement.mmSettlementMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange#mmMarket
 * StockExchange.mmMarket}</li>
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
 * "TradingMarket"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued."
 * </li>
 * </ul>
 */
public class TradingMarket extends Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Security> tradedSecurity;
	/**
	 * Security which is traded on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
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
	public static final MMBusinessAssociationEnd mmTradedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradedSecurity";
			definition = "Security which is traded on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmTradingMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected MarketTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of a market in which transactions take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> listedSecurity;
	/**
	 * Security whch is listed on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
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
	public static final MMBusinessAssociationEnd mmListedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListedSecurity";
			definition = "Security whch is listed on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmPlaceOfListing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SourceOfPrice sourceOfPrice;
	/**
	 * Party which provides a price on a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmSourceOfPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceOfPrice";
			definition = "Party which provides a price on a market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmMarketIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
		}
	};
	protected LotBreakdown tradeLotSize;
	/**
	 * Specifies the number of securities that have to be traded in one lot .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
	 * LotBreakdown.mmTradeLotMarket}</li>
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
	public static final MMBusinessAssociationEnd mmTradeLotSize = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeLotSize";
			definition = "Specifies the number of securities that have to be traded in one lot .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmTradeLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected SecuritiesQuantity minimumTradedNominalQuantity;
	/**
	 * Minimum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
	 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumTradedQuantityMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ISODateTime listingDate;
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
	public static final MMBusinessAttribute mmListingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getListingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order for which a place of trade is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
	 * SecuritiesOrder.mmPlaceOfTrade}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a place of trade is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmPlaceOfTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected CurrencyCode tradingCurrency;
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
	public static final MMBusinessAttribute mmTradingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getTradingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity maximumTradedNominalQuantity;
	/**
	 * Miaximum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
	 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Miaximum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumTradedQuantityMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected StockExchange stockExchange;
	/**
	 * Stock exchange which operates on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StockExchange#mmMarket
	 * StockExchange.mmMarket}</li>
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
	public static final MMBusinessAssociationEnd mmStockExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Stock exchange which operates on a specific market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StockExchange.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StockExchange.mmObject();
		}
	};
	protected LotBreakdown quoteLot;
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
	 * LotBreakdown.mmQuoteLotMarket}</li>
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
	public static final MMBusinessAssociationEnd mmQuoteLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteLot";
			definition = "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmQuoteLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected LotBreakdown roundLot;
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
	 * LotBreakdown.mmRoundLotMarket}</li>
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
	public static final MMBusinessAssociationEnd mmRoundLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmRoundLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingSession> tradingSession;
	/**
	 * Trading session associated with a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
	 * TradingSession.mmMarket}</li>
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
	public static final MMBusinessAssociationEnd mmTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session associated with a market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected SecuritiesIdentification listedSecurityTradingIdentification;
	/**
	 * Trading identification used on this trading market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
	 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
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
	public static final MMBusinessAssociationEnd mmListedSecurityTradingIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListedSecurityTradingIdentification";
			definition = "Trading identification used on this trading market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmApplicableTradingMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected CurrencyCode defaultCurrency;
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
	public static final MMBusinessAttribute mmDefaultCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultCurrency";
			definition = "Default currency for the securities trading on this market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getDefaultCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstTradingDate;
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
	public static final MMBusinessAttribute mmFirstTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstTradingDate";
			definition = "First date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getFirstTradingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime lastTradingDate;
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
	public static final MMBusinessAttribute mmLastTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Last date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradingMarket.class.getMethod("getLastTradingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Issuance issuance;
	/**
	 * Issuance for which the place has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePlace
	 * Issuance.mmIssuePlace}</li>
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the place has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssuePlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected PlaceOfSettlement relatedPlaceOfSettlement;
	/**
	 * Place of settlement for which a settlement market is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#mmSettlementMarket
	 * PlaceOfSettlement.mmSettlementMarket}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPlaceOfSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPlaceOfSettlement";
			definition = "Place of settlement for which a settlement market is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PlaceOfSettlement.mmSettlementMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PlaceOfSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingMarket";
				definition = "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmTradingMarket, com.tools20022.repository.entity.Security.mmPlaceOfListing,
						com.tools20022.repository.entity.SecuritiesIdentification.mmApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumTradedQuantityMarket,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumTradedQuantityMarket, com.tools20022.repository.entity.LotBreakdown.mmTradeLotMarket, com.tools20022.repository.entity.LotBreakdown.mmQuoteLotMarket,
						com.tools20022.repository.entity.LotBreakdown.mmRoundLotMarket, com.tools20022.repository.entity.Issuance.mmIssuePlace, com.tools20022.repository.entity.SourceOfPrice.mmMarketIdentification,
						com.tools20022.repository.entity.SecuritiesOrder.mmPlaceOfTrade, com.tools20022.repository.entity.TradingSession.mmMarket, com.tools20022.repository.entity.PlaceOfSettlement.mmSettlementMarket,
						com.tools20022.repository.entity.StockExchange.mmMarket);
				superType_lazy = () -> Market.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmType, com.tools20022.repository.entity.TradingMarket.mmListedSecurity,
						com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice, com.tools20022.repository.entity.TradingMarket.mmTradeLotSize, com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.mmListingDate, com.tools20022.repository.entity.TradingMarket.mmRelatedOrder, com.tools20022.repository.entity.TradingMarket.mmTradingCurrency,
						com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity, com.tools20022.repository.entity.TradingMarket.mmStockExchange, com.tools20022.repository.entity.TradingMarket.mmQuoteLot,
						com.tools20022.repository.entity.TradingMarket.mmRoundLot, com.tools20022.repository.entity.TradingMarket.mmTradingSession, com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification,
						com.tools20022.repository.entity.TradingMarket.mmDefaultCurrency, com.tools20022.repository.entity.TradingMarket.mmFirstTradingDate, com.tools20022.repository.entity.TradingMarket.mmLastTradingDate,
						com.tools20022.repository.entity.TradingMarket.mmIssuance, com.tools20022.repository.entity.TradingMarket.mmRelatedPlaceOfSettlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradingMarket.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getTradedSecurity() {
		return tradedSecurity;
	}

	public void setTradedSecurity(List<com.tools20022.repository.entity.Security> tradedSecurity) {
		this.tradedSecurity = tradedSecurity;
	}

	public MarketTypeCode getType() {
		return type;
	}

	public void setType(MarketTypeCode type) {
		this.type = type;
	}

	public List<Security> getListedSecurity() {
		return listedSecurity;
	}

	public void setListedSecurity(List<com.tools20022.repository.entity.Security> listedSecurity) {
		this.listedSecurity = listedSecurity;
	}

	public SourceOfPrice getSourceOfPrice() {
		return sourceOfPrice;
	}

	public void setSourceOfPrice(com.tools20022.repository.entity.SourceOfPrice sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
	}

	public LotBreakdown getTradeLotSize() {
		return tradeLotSize;
	}

	public void setTradeLotSize(com.tools20022.repository.entity.LotBreakdown tradeLotSize) {
		this.tradeLotSize = tradeLotSize;
	}

	public SecuritiesQuantity getMinimumTradedNominalQuantity() {
		return minimumTradedNominalQuantity;
	}

	public void setMinimumTradedNominalQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumTradedNominalQuantity) {
		this.minimumTradedNominalQuantity = minimumTradedNominalQuantity;
	}

	public ISODateTime getListingDate() {
		return listingDate;
	}

	public void setListingDate(ISODateTime listingDate) {
		this.listingDate = listingDate;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public SecuritiesQuantity getMaximumTradedNominalQuantity() {
		return maximumTradedNominalQuantity;
	}

	public void setMaximumTradedNominalQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumTradedNominalQuantity) {
		this.maximumTradedNominalQuantity = maximumTradedNominalQuantity;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(com.tools20022.repository.entity.StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	public LotBreakdown getQuoteLot() {
		return quoteLot;
	}

	public void setQuoteLot(com.tools20022.repository.entity.LotBreakdown quoteLot) {
		this.quoteLot = quoteLot;
	}

	public LotBreakdown getRoundLot() {
		return roundLot;
	}

	public void setRoundLot(com.tools20022.repository.entity.LotBreakdown roundLot) {
		this.roundLot = roundLot;
	}

	public List<TradingSession> getTradingSession() {
		return tradingSession;
	}

	public void setTradingSession(List<com.tools20022.repository.entity.TradingSession> tradingSession) {
		this.tradingSession = tradingSession;
	}

	public SecuritiesIdentification getListedSecurityTradingIdentification() {
		return listedSecurityTradingIdentification;
	}

	public void setListedSecurityTradingIdentification(com.tools20022.repository.entity.SecuritiesIdentification listedSecurityTradingIdentification) {
		this.listedSecurityTradingIdentification = listedSecurityTradingIdentification;
	}

	public CurrencyCode getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(CurrencyCode defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public ISODateTime getFirstTradingDate() {
		return firstTradingDate;
	}

	public void setFirstTradingDate(ISODateTime firstTradingDate) {
		this.firstTradingDate = firstTradingDate;
	}

	public ISODateTime getLastTradingDate() {
		return lastTradingDate;
	}

	public void setLastTradingDate(ISODateTime lastTradingDate) {
		this.lastTradingDate = lastTradingDate;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public void setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = issuance;
	}

	public PlaceOfSettlement getRelatedPlaceOfSettlement() {
		return relatedPlaceOfSettlement;
	}

	public void setRelatedPlaceOfSettlement(com.tools20022.repository.entity.PlaceOfSettlement relatedPlaceOfSettlement) {
		this.relatedPlaceOfSettlement = relatedPlaceOfSettlement;
	}
}