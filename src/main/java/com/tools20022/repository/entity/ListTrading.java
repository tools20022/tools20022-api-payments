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
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio. One example is index arbitrage, which
 * consists in the purchase or sale of a basket of stocks in conjunction with
 * the sale or purchase of a derivative product (for example index futures) to
 * profit from price differences between the basket and the derivative product.
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ListTrading" src="doc-files/ListTrading.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
 * ListTrading.mmListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
 * ListTrading.mmSecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
 * ListTrading.mmListTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmListName
 * ListTrading.mmListName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBasisPriceType
 * ListTrading.mmBasisPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmStrikeTime
 * ListTrading.mmStrikeTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmGrossAmountIndicator
 * ListTrading.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSellSideIdentification
 * ListTrading.mmSellSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBuySideIdentification
 * ListTrading.mmBuySideIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
 * ListTrading.mmLiquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmBidType
 * ListTrading.mmBidType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
 * SecuritiesOrder.mmListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmListTrading
 * TradingSession.mmListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmListTrading
 * Liquidity.mmListTrading}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DisclosedListTrading
 * DisclosedListTrading}</li>
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
 * "ListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * </ul>
 */
public class ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text listIdentification;
	/**
	 * Unique identifier for a list, as assigned by the trading party. The
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmListIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getListIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrder> securitiesListOrder;
	/**
	 * Order list containing the details of the individual orders within the
	 * program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
	 * SecuritiesOrder.mmListTrading}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesListOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order list containing the details of the individual orders within the program."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesListOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected TradingSession listTradingSession;
	/**
	 * Details of a specific trading session for a list trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmListTrading
	 * TradingSession.mmListTrading}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of a specific trading session for a list trading."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmListTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected Max140Text listName;
	/**
	 * Provides the name of the order list.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the name of the order list."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmListName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getListName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BasisPriceTypeCode basisPriceType;
	/**
	 * Represents the basis price type in a bid order (list trading).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the basis price type in a bid order (list trading)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasisPriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getBasisPriceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime strikeTime;
	/**
	 * Time at which current market prices are used to determine the value of a
	 * basket.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time at which current market prices are used to determine the value of a basket."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrikeTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getStrikeTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * Indicates whether an amount is a gross amount (including all charges,
	 * commissions and tax), or a net amount.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGrossAmountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getGrossAmountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text sellSideIdentification;
	/**
	 * Unique identifier for a bid, as assigned by the the sell-side (broker,
	 * exchange, electronic communication network (ECN)). The identifier must be
	 * unique within a single trading day.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSellSideIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellSideIdentification";
			definition = "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getSellSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text buySideIdentification;
	/**
	 * Unique identifier for a bid, as assigned by the buy-side institution. The
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBuySideIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySideIdentification";
			definition = "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getBuySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Liquidity> liquidity;
	/**
	 * Information on the liquidity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmListTrading
	 * Liquidity.mmListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the liquidity of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLiquidity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
		}
	};
	protected BidTypeCode bidType;
	/**
	 * Indicates the type of bid for a list order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.BidTypeCode
	 * BidTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of bid for a list order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBidType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates the type of bid for a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BidTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ListTrading.class.getMethod("getBidType", new Class[]{});
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
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmListTrading, com.tools20022.repository.entity.TradingSession.mmListTrading,
						com.tools20022.repository.entity.Liquidity.mmListTrading);
				subType_lazy = () -> Arrays.asList(DisclosedListTrading.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ListTrading.mmListIdentification, com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder,
						com.tools20022.repository.entity.ListTrading.mmListTradingSession, com.tools20022.repository.entity.ListTrading.mmListName, com.tools20022.repository.entity.ListTrading.mmBasisPriceType,
						com.tools20022.repository.entity.ListTrading.mmStrikeTime, com.tools20022.repository.entity.ListTrading.mmGrossAmountIndicator, com.tools20022.repository.entity.ListTrading.mmSellSideIdentification,
						com.tools20022.repository.entity.ListTrading.mmBuySideIdentification, com.tools20022.repository.entity.ListTrading.mmLiquidity, com.tools20022.repository.entity.ListTrading.mmBidType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ListTrading.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public void setListIdentification(Max35Text listIdentification) {
		this.listIdentification = listIdentification;
	}

	public List<SecuritiesOrder> getSecuritiesListOrder() {
		return securitiesListOrder;
	}

	public void setSecuritiesListOrder(List<com.tools20022.repository.entity.SecuritiesOrder> securitiesListOrder) {
		this.securitiesListOrder = securitiesListOrder;
	}

	public TradingSession getListTradingSession() {
		return listTradingSession;
	}

	public void setListTradingSession(com.tools20022.repository.entity.TradingSession listTradingSession) {
		this.listTradingSession = listTradingSession;
	}

	public Max140Text getListName() {
		return listName;
	}

	public void setListName(Max140Text listName) {
		this.listName = listName;
	}

	public BasisPriceTypeCode getBasisPriceType() {
		return basisPriceType;
	}

	public void setBasisPriceType(BasisPriceTypeCode basisPriceType) {
		this.basisPriceType = basisPriceType;
	}

	public ISODateTime getStrikeTime() {
		return strikeTime;
	}

	public void setStrikeTime(ISODateTime strikeTime) {
		this.strikeTime = strikeTime;
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	public Max35Text getSellSideIdentification() {
		return sellSideIdentification;
	}

	public void setSellSideIdentification(Max35Text sellSideIdentification) {
		this.sellSideIdentification = sellSideIdentification;
	}

	public Max35Text getBuySideIdentification() {
		return buySideIdentification;
	}

	public void setBuySideIdentification(Max35Text buySideIdentification) {
		this.buySideIdentification = buySideIdentification;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity;
	}

	public void setLiquidity(List<com.tools20022.repository.entity.Liquidity> liquidity) {
		this.liquidity = liquidity;
	}

	public BidTypeCode getBidType() {
		return bidType;
	}

	public void setBidType(BidTypeCode bidType) {
		this.bidType = bidType;
	}
}