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
import com.tools20022.repository.codeset.NettingEligibleCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Garnishment1;
import com.tools20022.repository.msg.TradeContract1;
import com.tools20022.repository.msg.TransactionDates2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Specifies the date/time on which the trade was executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmTradeDate
	 * TransactionDates2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmTransactionDateTime
	 * TransactionDates2.mmTransactionDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmDate
	 * Garnishment1.mmDate}</li>
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
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDates2.mmTradeDate, TransactionDates2.mmTransactionDateTime, Garnishment1.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getTradeDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Commission> tradeCommission;
	/**
	 * Commission parameters associated with a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradeCommission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Date on which the trade is settled, ie, the amounts are due.
	 * <p>
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
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime endDate;
	/**
	 * End date of the trade, such as a treasury trade or a derivative trade.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmEndDate
	 * TransactionDates2.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmMaturityDate
	 * TradeContract1.mmMaturityDate}</li>
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
	public static final MMBusinessAttribute mmEndDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDates2.mmEndDate, TradeContract1.mmMaturityDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getEndDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TradeIdentification> tradeRelatedIdentifications;
	/**
	 * Specifies the different identifications associated with a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
		}
	};
	protected Max35Text allocationIndicator;
	/**
	 * Specifies the type of allocation for a trade.
	 * <p>
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
	public static final MMBusinessAttribute mmAllocationIndicator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getAllocationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text collateralisationType;
	/**
	 * Specifies the type of collateralisation.
	 * <p>
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
	public static final MMBusinessAttribute mmCollateralisationType = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getCollateralisationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator blockIndicator;
	/**
	 * Indicates whether the trade is a block or single trade.
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
	public static final MMBusinessAttribute mmBlockIndicator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getBlockIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NettingEligibleCode settlementNetting;
	/**
	 * Indicates to the clearing member whether the trade is eligible for
	 * settlement netting or not.
	 * <p>
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
	public static final MMBusinessAttribute mmSettlementNetting = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getSettlementNetting", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * Role played by a party in relation with a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> obligation;
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
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
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * Negotiation process which is the source of the treasury trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected MasterAgreement governingDocument;
	/**
	 * Legal agreement applicable to a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmGoverningDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmGovernedTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
		}
	};
	protected ISODateTime startDate;
	/**
	 * Start date of the trade, such as a treasury trade or a derivative trade.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmStartDate
	 * TransactionDates2.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmStartDate
	 * TradeContract1.mmStartDate}</li>
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
	public static final MMBusinessAttribute mmStartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDates2.mmStartDate, TradeContract1.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Trade.class.getMethod("getStartDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected System system;
	/**
	 * System involved in the processing of a trade such as clearing, settlement
	 * or matching system.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Asset> asset;
	/**
	 * Asset which is the object of a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected Market market;
	/**
	 * Market where a trade is negotiated and executed.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected Guarantee guarantee;
	/**
	 * Guarantee which covers a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected Settlement settlement;
	/**
	 * Transfer of proceeds.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};
	protected Order order;
	/**
	 * Specifies the order related to a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Order.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Leg> leg;
	/**
	 * Separate transactions which combined together form a trade.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLeg = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * Financial transaction to which the trade belongs.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmFinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmReconciledTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmTrade, com.tools20022.repository.entity.Commission.mmTrade, com.tools20022.repository.entity.Obligation.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmTrade, com.tools20022.repository.entity.TradePartyRole.mmTrade, com.tools20022.repository.entity.System.mmTrade,
						com.tools20022.repository.entity.Settlement.mmTrade, com.tools20022.repository.entity.Leg.mmTrade, com.tools20022.repository.entity.Negotiation.mmTradeExecution,
						com.tools20022.repository.entity.MasterAgreement.mmGovernedTrades, com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade, com.tools20022.repository.entity.Reconciliation.mmReconciledTrades,
						com.tools20022.repository.entity.Market.mmTrade, com.tools20022.repository.entity.Order.mmTrade, com.tools20022.repository.entity.FinancialTransaction.mmTrade);
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

	public void setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	public List<Commission> getTradeCommission() {
		return tradeCommission;
	}

	public void setTradeCommission(List<com.tools20022.repository.entity.Commission> tradeCommission) {
		this.tradeCommission = tradeCommission;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public ISODateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(ISODateTime endDate) {
		this.endDate = endDate;
	}

	public List<TradeIdentification> getTradeRelatedIdentifications() {
		return tradeRelatedIdentifications;
	}

	public void setTradeRelatedIdentifications(List<com.tools20022.repository.entity.TradeIdentification> tradeRelatedIdentifications) {
		this.tradeRelatedIdentifications = tradeRelatedIdentifications;
	}

	public Max35Text getAllocationIndicator() {
		return allocationIndicator;
	}

	public void setAllocationIndicator(Max35Text allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
	}

	public Max35Text getCollateralisationType() {
		return collateralisationType;
	}

	public void setCollateralisationType(Max35Text collateralisationType) {
		this.collateralisationType = collateralisationType;
	}

	public YesNoIndicator getBlockIndicator() {
		return blockIndicator;
	}

	public void setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = blockIndicator;
	}

	public NettingEligibleCode getSettlementNetting() {
		return settlementNetting;
	}

	public void setSettlementNetting(NettingEligibleCode settlementNetting) {
		this.settlementNetting = settlementNetting;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public void setTradePartyRole(com.tools20022.repository.entity.TradePartyRole tradePartyRole) {
		this.tradePartyRole = tradePartyRole;
	}

	public List<Obligation> getObligation() {
		return obligation;
	}

	public void setObligation(List<com.tools20022.repository.entity.Obligation> obligation) {
		this.obligation = obligation;
	}

	public Negotiation getRelatedNegotiation() {
		return relatedNegotiation;
	}

	public void setRelatedNegotiation(com.tools20022.repository.entity.Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
	}

	public MasterAgreement getGoverningDocument() {
		return governingDocument;
	}

	public void setGoverningDocument(com.tools20022.repository.entity.MasterAgreement governingDocument) {
		this.governingDocument = governingDocument;
	}

	public ISODateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(ISODateTime startDate) {
		this.startDate = startDate;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
	}

	public List<Asset> getAsset() {
		return asset;
	}

	public void setAsset(List<com.tools20022.repository.entity.Asset> asset) {
		this.asset = asset;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(com.tools20022.repository.entity.Market market) {
		this.market = market;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(com.tools20022.repository.entity.Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(com.tools20022.repository.entity.Settlement settlement) {
		this.settlement = settlement;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.Order order) {
		this.order = order;
	}

	public List<Leg> getLeg() {
		return leg;
	}

	public void setLeg(List<com.tools20022.repository.entity.Leg> leg) {
		this.leg = leg;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public void setFinancialTransaction(com.tools20022.repository.entity.FinancialTransaction financialTransaction) {
		this.financialTransaction = financialTransaction;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = reconciliation;
	}
}