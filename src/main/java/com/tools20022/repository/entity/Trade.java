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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.NettingEligibleCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Garnishment1;
import com.tools20022.repository.msg.Garnishment2;
import com.tools20022.repository.msg.TradeContract1;
import com.tools20022.repository.msg.TransactionDates3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of an order between at least two parties. A trade relates to the
 * delivery of goods and services, cash or securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Trade" src="doc-files/Trade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
 * Trade.mmTradeDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
 * Trade.mmTradeCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmValueDate
 * Trade.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmEndDate
 * Trade.mmEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAllocationIndicator
 * Trade.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmCollateralisationType
 * Trade.mmCollateralisationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmBlockIndicator
 * Trade.mmBlockIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlementNetting
 * Trade.mmSettlementNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
 * Trade.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmObligation
 * Trade.mmObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmRelatedNegotiation
 * Trade.mmRelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
 * Trade.mmGoverningDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmStartDate
 * Trade.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSystem
 * Trade.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAsset Trade.mmAsset}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmMarket
 * Trade.mmMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
 * Trade.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlement
 * Trade.mmSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmOrder Trade.mmOrder}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmLeg Trade.mmLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmFinancialTransaction
 * Trade.mmFinancialTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmReconciliation
 * Trade.mmReconciliation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTrade Asset.mmTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmTrade
 * Commission.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmTrade
 * Obligation.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
 * TradePartyRole.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTrade
 * System.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#mmTrade
 * Settlement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmTrade Leg.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
 * Negotiation.mmTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
 * MasterAgreement.mmGovernedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
 * Guarantee.mmGuaranteedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
 * Reconciliation.mmReconciledTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmTrade
 * Market.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Order#mmTrade Order.mmTrade}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
 * FinancialTransaction.mmTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
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
 * "Trade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities."
 * </li>
 * </ul>
 */
public class Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime tradeDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmDate
	 * Garnishment1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTradeDate
	 * TransactionDates3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTransactionDateTime
	 * TransactionDates3.mmTransactionDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment2#mmDate
	 * Garnishment2.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD, FIXSynonym: 75</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmTradeDateTime = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Garnishment1.mmDate, TransactionDates3.mmTradeDate, TransactionDates3.mmTransactionDateTime, Garnishment2.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"), new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setTradeDateTime(value);
		}
	};
	protected List<Commission> tradeCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmTrade
	 * Commission.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission parameters associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Commission>> mmTradeCommission = new MMBusinessAssociationEnd<Trade, List<Commission>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> Commission.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Commission.mmObject();
		}

		@Override
		public List<Commission> getValue(Trade obj) {
			return obj.getTradeCommission();
		}

		@Override
		public void setValue(Trade obj, List<Commission> value) {
			obj.setTradeCommission(value);
		}
	};
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODate> mmValueDate = new MMBusinessAttribute<Trade, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Trade obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Trade obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	protected ISODateTime endDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmMaturityDate
	 * TradeContract1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmEndDate
	 * TransactionDates3.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "End date of the trade, such as a treasury trade or a derivative trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmEndDate = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeContract1.mmMaturityDate, TransactionDates3.mmEndDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setEndDate(value);
		}
	};
	protected List<TradeIdentification> tradeRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
	 * TradeIdentification.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<TradeIdentification>> mmTradeRelatedIdentifications = new MMBusinessAssociationEnd<Trade, List<TradeIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> TradeIdentification.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradeIdentification.mmObject();
		}

		@Override
		public List<TradeIdentification> getValue(Trade obj) {
			return obj.getTradeRelatedIdentifications();
		}

		@Override
		public void setValue(Trade obj, List<TradeIdentification> value) {
			obj.setTradeRelatedIdentifications(value);
		}
	};
	protected Max35Text allocationIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of allocation for a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, Max35Text> mmAllocationIndicator = new MMBusinessAttribute<Trade, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies the type of allocation for a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade obj) {
			return obj.getAllocationIndicator();
		}

		@Override
		public void setValue(Trade obj, Max35Text value) {
			obj.setAllocationIndicator(value);
		}
	};
	protected Max35Text collateralisationType;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateralisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, Max35Text> mmCollateralisationType = new MMBusinessAttribute<Trade, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralisationType";
			definition = "Specifies the type of collateralisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade obj) {
			return obj.getCollateralisationType();
		}

		@Override
		public void setValue(Trade obj, Max35Text value) {
			obj.setCollateralisationType(value);
		}
	};
	protected YesNoIndicator blockIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is a block or single trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, YesNoIndicator> mmBlockIndicator = new MMBusinessAttribute<Trade, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Trade obj) {
			return obj.getBlockIndicator();
		}

		@Override
		public void setValue(Trade obj, YesNoIndicator value) {
			obj.setBlockIndicator(value);
		}
	};
	protected NettingEligibleCode settlementNetting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
	 * NettingEligibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates to the clearing member whether the trade is eligible for settlement netting or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, NettingEligibleCode> mmSettlementNetting = new MMBusinessAttribute<Trade, NettingEligibleCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNetting";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligibleCode.mmObject();
		}

		@Override
		public NettingEligibleCode getValue(Trade obj) {
			return obj.getSettlementNetting();
		}

		@Override
		public void setValue(Trade obj, NettingEligibleCode value) {
			obj.setSettlementNetting(value);
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
	 * TradePartyRole.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in relation with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, TradePartyRole> mmTradePartyRole = new MMBusinessAssociationEnd<Trade, TradePartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradePartyRole.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradePartyRole.mmObject();
		}

		@Override
		public TradePartyRole getValue(Trade obj) {
			return obj.getTradePartyRole();
		}

		@Override
		public void setValue(Trade obj, TradePartyRole value) {
			obj.setTradePartyRole(value);
		}
	};
	protected List<Obligation> obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmTrade
	 * Obligation.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Obligation>> mmObligation = new MMBusinessAssociationEnd<Trade, List<Obligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			opposite_lazy = () -> Obligation.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public List<Obligation> getValue(Trade obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(Trade obj, List<Obligation> value) {
			obj.setObligation(value);
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
	 * Negotiation.mmTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Negotiation process which is the source of the treasury trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Optional<Negotiation>> mmRelatedNegotiation = new MMBusinessAssociationEnd<Trade, Optional<Negotiation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Negotiation.mmTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}

		@Override
		public Optional<Negotiation> getValue(Trade obj) {
			return obj.getRelatedNegotiation();
		}

		@Override
		public void setValue(Trade obj, Optional<Negotiation> value) {
			obj.setRelatedNegotiation(value.orElse(null));
		}
	};
	protected MasterAgreement governingDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
	 * MasterAgreement.mmGovernedTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal agreement applicable to a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Optional<MasterAgreement>> mmGoverningDocument = new MMBusinessAssociationEnd<Trade, Optional<MasterAgreement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MasterAgreement.mmGovernedTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MasterAgreement.mmObject();
		}

		@Override
		public Optional<MasterAgreement> getValue(Trade obj) {
			return obj.getGoverningDocument();
		}

		@Override
		public void setValue(Trade obj, Optional<MasterAgreement> value) {
			obj.setGoverningDocument(value.orElse(null));
		}
	};
	protected ISODateTime startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmStartDate
	 * TradeContract1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmStartDate
	 * TransactionDates3.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date of the trade, such as a treasury trade or a derivative trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmStartDate = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeContract1.mmStartDate, TransactionDates3.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setStartDate(value);
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#mmTrade
	 * System.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System involved in the processing of a trade such as clearing, settlement or matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, System> mmSystem = new MMBusinessAssociationEnd<Trade, System>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> System.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public System getValue(Trade obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(Trade obj, System value) {
			obj.setSystem(value);
		}
	};
	protected List<Asset> asset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#mmTrade
	 * Asset.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is the object of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Asset>> mmAsset = new MMBusinessAssociationEnd<Trade, List<Asset>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			opposite_lazy = () -> Asset.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public List<Asset> getValue(Trade obj) {
			return obj.getAsset();
		}

		@Override
		public void setValue(Trade obj, List<Asset> value) {
			obj.setAsset(value);
		}
	};
	protected Market market;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#mmTrade
	 * Market.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market where a trade is negotiated and executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Market> mmMarket = new MMBusinessAssociationEnd<Trade, Market>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Market.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}

		@Override
		public Market getValue(Trade obj) {
			return obj.getMarket();
		}

		@Override
		public void setValue(Trade obj, Market value) {
			obj.setMarket(value);
		}
	};
	protected Guarantee guarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
	 * Guarantee.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee which covers a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Guarantee> mmGuarantee = new MMBusinessAssociationEnd<Trade, Guarantee>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Guarantee.mmGuaranteedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Guarantee.mmObject();
		}

		@Override
		public Guarantee getValue(Trade obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(Trade obj, Guarantee value) {
			obj.setGuarantee(value);
		}
	};
	protected Settlement settlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmTrade
	 * Settlement.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Settlement> mmSettlement = new MMBusinessAssociationEnd<Trade, Settlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Settlement.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Settlement.mmObject();
		}

		@Override
		public Settlement getValue(Trade obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(Trade obj, Settlement value) {
			obj.setSettlement(value);
		}
	};
	protected Order order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Order#mmTrade
	 * Order.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the order related to a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Order> mmOrder = new MMBusinessAssociationEnd<Trade, Order>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Order.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Order.mmObject();
		}

		@Override
		public Order getValue(Trade obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(Trade obj, Order value) {
			obj.setOrder(value);
		}
	};
	protected List<Leg> leg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Leg#mmTrade
	 * Leg.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Leg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate transactions which combined together form a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Leg>> mmLeg = new MMBusinessAssociationEnd<Trade, List<Leg>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			opposite_lazy = () -> Leg.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Leg.mmObject();
		}

		@Override
		public List<Leg> getValue(Trade obj) {
			return obj.getLeg();
		}

		@Override
		public void setValue(Trade obj, List<Leg> value) {
			obj.setLeg(value);
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
	 * FinancialTransaction.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial transaction to which the trade belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, FinancialTransaction> mmFinancialTransaction = new MMBusinessAssociationEnd<Trade, FinancialTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialTransaction.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}

		@Override
		public FinancialTransaction getValue(Trade obj) {
			return obj.getFinancialTransaction();
		}

		@Override
		public void setValue(Trade obj, FinancialTransaction value) {
			obj.setFinancialTransaction(value);
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
	 * Reconciliation.mmReconciledTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Reconciliation> mmReconciliation = new MMBusinessAssociationEnd<Trade, Reconciliation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Reconciliation.mmReconciledTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reconciliation.mmObject();
		}

		@Override
		public Reconciliation getValue(Trade obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(Trade obj, Reconciliation value) {
			obj.setReconciliation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmTrade, Commission.mmTrade, Obligation.mmTrade, TradeIdentification.mmTrade, TradePartyRole.mmTrade, System.mmTrade, Settlement.mmTrade, Leg.mmTrade,
						Negotiation.mmTradeExecution, MasterAgreement.mmGovernedTrades, Guarantee.mmGuaranteedTrade, Reconciliation.mmReconciledTrades, Market.mmTrade, Order.mmTrade, FinancialTransaction.mmTrade);
				subType_lazy = () -> Arrays.asList(SecuritiesTrade.mmObject(), TreasuryTrade.mmObject(), CommercialTrade.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeDateTime, com.tools20022.repository.entity.Trade.mmTradeCommission, com.tools20022.repository.entity.Trade.mmValueDate,
						com.tools20022.repository.entity.Trade.mmEndDate, com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.Trade.mmAllocationIndicator,
						com.tools20022.repository.entity.Trade.mmCollateralisationType, com.tools20022.repository.entity.Trade.mmBlockIndicator, com.tools20022.repository.entity.Trade.mmSettlementNetting,
						com.tools20022.repository.entity.Trade.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmObligation, com.tools20022.repository.entity.Trade.mmRelatedNegotiation,
						com.tools20022.repository.entity.Trade.mmGoverningDocument, com.tools20022.repository.entity.Trade.mmStartDate, com.tools20022.repository.entity.Trade.mmSystem, com.tools20022.repository.entity.Trade.mmAsset,
						com.tools20022.repository.entity.Trade.mmMarket, com.tools20022.repository.entity.Trade.mmGuarantee, com.tools20022.repository.entity.Trade.mmSettlement, com.tools20022.repository.entity.Trade.mmOrder,
						com.tools20022.repository.entity.Trade.mmLeg, com.tools20022.repository.entity.Trade.mmFinancialTransaction, com.tools20022.repository.entity.Trade.mmReconciliation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Trade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public Trade setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public List<Commission> getTradeCommission() {
		return tradeCommission == null ? tradeCommission = new ArrayList<>() : tradeCommission;
	}

	public Trade setTradeCommission(List<Commission> tradeCommission) {
		this.tradeCommission = Objects.requireNonNull(tradeCommission);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public Trade setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public ISODateTime getEndDate() {
		return endDate;
	}

	public Trade setEndDate(ISODateTime endDate) {
		this.endDate = Objects.requireNonNull(endDate);
		return this;
	}

	public List<TradeIdentification> getTradeRelatedIdentifications() {
		return tradeRelatedIdentifications == null ? tradeRelatedIdentifications = new ArrayList<>() : tradeRelatedIdentifications;
	}

	public Trade setTradeRelatedIdentifications(List<TradeIdentification> tradeRelatedIdentifications) {
		this.tradeRelatedIdentifications = Objects.requireNonNull(tradeRelatedIdentifications);
		return this;
	}

	public Max35Text getAllocationIndicator() {
		return allocationIndicator;
	}

	public Trade setAllocationIndicator(Max35Text allocationIndicator) {
		this.allocationIndicator = Objects.requireNonNull(allocationIndicator);
		return this;
	}

	public Max35Text getCollateralisationType() {
		return collateralisationType;
	}

	public Trade setCollateralisationType(Max35Text collateralisationType) {
		this.collateralisationType = Objects.requireNonNull(collateralisationType);
		return this;
	}

	public YesNoIndicator getBlockIndicator() {
		return blockIndicator;
	}

	public Trade setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = Objects.requireNonNull(blockIndicator);
		return this;
	}

	public NettingEligibleCode getSettlementNetting() {
		return settlementNetting;
	}

	public Trade setSettlementNetting(NettingEligibleCode settlementNetting) {
		this.settlementNetting = Objects.requireNonNull(settlementNetting);
		return this;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public Trade setTradePartyRole(TradePartyRole tradePartyRole) {
		this.tradePartyRole = Objects.requireNonNull(tradePartyRole);
		return this;
	}

	public List<Obligation> getObligation() {
		return obligation == null ? obligation = new ArrayList<>() : obligation;
	}

	public Trade setObligation(List<Obligation> obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Negotiation> getRelatedNegotiation() {
		return relatedNegotiation == null ? Optional.empty() : Optional.of(relatedNegotiation);
	}

	public Trade setRelatedNegotiation(Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
		return this;
	}

	public Optional<MasterAgreement> getGoverningDocument() {
		return governingDocument == null ? Optional.empty() : Optional.of(governingDocument);
	}

	public Trade setGoverningDocument(MasterAgreement governingDocument) {
		this.governingDocument = governingDocument;
		return this;
	}

	public ISODateTime getStartDate() {
		return startDate;
	}

	public Trade setStartDate(ISODateTime startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public System getSystem() {
		return system;
	}

	public Trade setSystem(System system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public List<Asset> getAsset() {
		return asset == null ? asset = new ArrayList<>() : asset;
	}

	public Trade setAsset(List<Asset> asset) {
		this.asset = Objects.requireNonNull(asset);
		return this;
	}

	public Market getMarket() {
		return market;
	}

	public Trade setMarket(Market market) {
		this.market = Objects.requireNonNull(market);
		return this;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public Trade setGuarantee(Guarantee guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public Trade setSettlement(Settlement settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public Order getOrder() {
		return order;
	}

	public Trade setOrder(Order order) {
		this.order = Objects.requireNonNull(order);
		return this;
	}

	public List<Leg> getLeg() {
		return leg == null ? leg = new ArrayList<>() : leg;
	}

	public Trade setLeg(List<Leg> leg) {
		this.leg = Objects.requireNonNull(leg);
		return this;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public Trade setFinancialTransaction(FinancialTransaction financialTransaction) {
		this.financialTransaction = Objects.requireNonNull(financialTransaction);
		return this;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public Trade setReconciliation(Reconciliation reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}
}