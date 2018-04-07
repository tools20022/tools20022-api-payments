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
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Liquidity;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.TradingSession;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
	protected Max35Text listIdentification;
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
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmListIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
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

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getListIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setListIdentification(value);
		}
	};
	protected List<SecuritiesOrder> securitiesListOrder;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<ListTrading, List<SecuritiesOrder>> mmSecuritiesListOrder = new MMBusinessAssociationEnd<ListTrading, List<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrder.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public List<SecuritiesOrder> getValue(ListTrading obj) {
			return obj.getSecuritiesListOrder();
		}

		@Override
		public void setValue(ListTrading obj, List<SecuritiesOrder> value) {
			obj.setSecuritiesListOrder(value);
		}
	};
	protected TradingSession listTradingSession;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<ListTrading, TradingSession> mmListTradingSession = new MMBusinessAssociationEnd<ListTrading, TradingSession>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingSession.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}

		@Override
		public TradingSession getValue(ListTrading obj) {
			return obj.getListTradingSession();
		}

		@Override
		public void setValue(ListTrading obj, TradingSession value) {
			obj.setListTradingSession(value);
		}
	};
	protected Max140Text listName;
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 392</li>
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
	public static final MMBusinessAttribute<ListTrading, Max140Text> mmListName = new MMBusinessAttribute<ListTrading, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "392"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(ListTrading obj) {
			return obj.getListName();
		}

		@Override
		public void setValue(ListTrading obj, Max140Text value) {
			obj.setListName(value);
		}
	};
	protected BasisPriceTypeCode basisPriceType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
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
	public static final MMBusinessAttribute<ListTrading, BasisPriceTypeCode> mmBasisPriceType = new MMBusinessAttribute<ListTrading, BasisPriceTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}

		@Override
		public BasisPriceTypeCode getValue(ListTrading obj) {
			return obj.getBasisPriceType();
		}

		@Override
		public void setValue(ListTrading obj, BasisPriceTypeCode value) {
			obj.setBasisPriceType(value);
		}
	};
	protected ISODateTime strikeTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 443</li>
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
	public static final MMBusinessAttribute<ListTrading, ISODateTime> mmStrikeTime = new MMBusinessAttribute<ListTrading, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "443"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ListTrading obj) {
			return obj.getStrikeTime();
		}

		@Override
		public void setValue(ListTrading obj, ISODateTime value) {
			obj.setStrikeTime(value);
		}
	};
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 416</li>
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
	public static final MMBusinessAttribute<ListTrading, YesNoIndicator> mmGrossAmountIndicator = new MMBusinessAttribute<ListTrading, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "416"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ListTrading obj) {
			return obj.getGrossAmountIndicator();
		}

		@Override
		public void setValue(ListTrading obj, YesNoIndicator value) {
			obj.setGrossAmountIndicator(value);
		}
	};
	protected Max35Text sellSideIdentification;
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
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmSellSideIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
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

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getSellSideIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setSellSideIdentification(value);
		}
	};
	protected Max35Text buySideIdentification;
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
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmBuySideIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
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

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getBuySideIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setBuySideIdentification(value);
		}
	};
	protected List<Liquidity> liquidity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<ListTrading, List<Liquidity>> mmLiquidity = new MMBusinessAssociationEnd<ListTrading, List<Liquidity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> Liquidity.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Liquidity.mmObject();
		}

		@Override
		public List<Liquidity> getValue(ListTrading obj) {
			return obj.getLiquidity();
		}

		@Override
		public void setValue(ListTrading obj, List<Liquidity> value) {
			obj.setLiquidity(value);
		}
	};
	protected BidTypeCode bidType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ListTrading, BidTypeCode> mmBidType = new MMBusinessAttribute<ListTrading, BidTypeCode>() {
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

		@Override
		public BidTypeCode getValue(ListTrading obj) {
			return obj.getBidType();
		}

		@Override
		public void setValue(ListTrading obj, BidTypeCode value) {
			obj.setBidType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmListTrading, TradingSession.mmListTrading, Liquidity.mmListTrading);
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

	public ListTrading setListIdentification(Max35Text listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public List<SecuritiesOrder> getSecuritiesListOrder() {
		return securitiesListOrder == null ? securitiesListOrder = new ArrayList<>() : securitiesListOrder;
	}

	public ListTrading setSecuritiesListOrder(List<SecuritiesOrder> securitiesListOrder) {
		this.securitiesListOrder = Objects.requireNonNull(securitiesListOrder);
		return this;
	}

	public TradingSession getListTradingSession() {
		return listTradingSession;
	}

	public ListTrading setListTradingSession(TradingSession listTradingSession) {
		this.listTradingSession = Objects.requireNonNull(listTradingSession);
		return this;
	}

	public Max140Text getListName() {
		return listName;
	}

	public ListTrading setListName(Max140Text listName) {
		this.listName = Objects.requireNonNull(listName);
		return this;
	}

	public BasisPriceTypeCode getBasisPriceType() {
		return basisPriceType;
	}

	public ListTrading setBasisPriceType(BasisPriceTypeCode basisPriceType) {
		this.basisPriceType = Objects.requireNonNull(basisPriceType);
		return this;
	}

	public ISODateTime getStrikeTime() {
		return strikeTime;
	}

	public ListTrading setStrikeTime(ISODateTime strikeTime) {
		this.strikeTime = Objects.requireNonNull(strikeTime);
		return this;
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public ListTrading setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = Objects.requireNonNull(grossAmountIndicator);
		return this;
	}

	public Max35Text getSellSideIdentification() {
		return sellSideIdentification;
	}

	public ListTrading setSellSideIdentification(Max35Text sellSideIdentification) {
		this.sellSideIdentification = Objects.requireNonNull(sellSideIdentification);
		return this;
	}

	public Max35Text getBuySideIdentification() {
		return buySideIdentification;
	}

	public ListTrading setBuySideIdentification(Max35Text buySideIdentification) {
		this.buySideIdentification = Objects.requireNonNull(buySideIdentification);
		return this;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity == null ? liquidity = new ArrayList<>() : liquidity;
	}

	public ListTrading setLiquidity(List<Liquidity> liquidity) {
		this.liquidity = Objects.requireNonNull(liquidity);
		return this;
	}

	public BidTypeCode getBidType() {
		return bidType;
	}

	public ListTrading setBidType(BidTypeCode bidType) {
		this.bidType = Objects.requireNonNull(bidType);
		return this;
	}
}