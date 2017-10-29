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
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.ListTrading#ListIdentification
 * ListTrading.ListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
 * ListTrading.SecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#ListTradingSession
 * ListTrading.ListTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#ListName
 * ListTrading.ListName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#BasisPriceType
 * ListTrading.BasisPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#StrikeTime
 * ListTrading.StrikeTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#GrossAmountIndicator
 * ListTrading.GrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SellSideIdentification
 * ListTrading.SellSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#BuySideIdentification
 * ListTrading.BuySideIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#Liquidity
 * ListTrading.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#BidType
 * ListTrading.BidType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
 * SecuritiesOrder.ListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#ListTrading
 * TradingSession.ListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#ListTrading
 * Liquidity.ListTrading}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMBusinessAttribute ListIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Order list containing the details of the individual orders within the
	 * program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
	 * SecuritiesOrder.ListTrading}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesListOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of a specific trading session for a list trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#ListTrading
	 * TradingSession.ListTrading}</li>
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
	public static final MMBusinessAssociationEnd ListTradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ListName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute BasisPriceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute StrikeTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute GrossAmountIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute SellSideIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideIdentification";
			definition = "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute BuySideIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideIdentification";
			definition = "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information on the liquidity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#ListTrading
	 * Liquidity.ListTrading}</li>
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
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute BidType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates the type of bid for a list order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BidTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ListTrading, com.tools20022.repository.entity.TradingSession.ListTrading, com.tools20022.repository.entity.Liquidity.ListTrading);
				subType_lazy = () -> Arrays.asList(DisclosedListTrading.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ListTrading.ListIdentification, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder,
						com.tools20022.repository.entity.ListTrading.ListTradingSession, com.tools20022.repository.entity.ListTrading.ListName, com.tools20022.repository.entity.ListTrading.BasisPriceType,
						com.tools20022.repository.entity.ListTrading.StrikeTime, com.tools20022.repository.entity.ListTrading.GrossAmountIndicator, com.tools20022.repository.entity.ListTrading.SellSideIdentification,
						com.tools20022.repository.entity.ListTrading.BuySideIdentification, com.tools20022.repository.entity.ListTrading.Liquidity, com.tools20022.repository.entity.ListTrading.BidType);
			}
		});
		return mmObject_lazy.get();
	}
}