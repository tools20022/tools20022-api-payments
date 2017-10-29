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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.TransactionQuantities2Choice;
import com.tools20022.repository.codeset.QuantityCode;
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.OriginalAndCurrentQuantities1;
import com.tools20022.repository.msg.ProprietaryQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Quantity of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesQuantity" src="doc-files/SecuritiesQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Unit
 * SecuritiesQuantity.Unit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
 * SecuritiesQuantity.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
 * SecuritiesQuantity.SecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
 * SecuritiesQuantity.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Group1Or2Units
 * SecuritiesQuantity.Group1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
 * SecuritiesQuantity.RelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
 * SecuritiesQuantity.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
 * SecuritiesQuantity.MinimumQuantityDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#LotBreakdown
 * SecuritiesQuantity.LotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
 * SecuritiesQuantity.AggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Entry
 * SecuritiesQuantity.Entry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Code
 * SecuritiesQuantity.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
 * SecuritiesQuantity.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesEntitlement
 * SecuritiesQuantity.SecuritiesEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
 * SecuritiesQuantity.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
 * SecuritiesQuantity.BiddingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
 * SecuritiesQuantity.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
 * SecuritiesQuantity.RelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
 * SecuritiesQuantity.AvailableQuantityBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
 * SecuritiesQuantity.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
 * SecuritiesQuantity.MinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
 * SecuritiesQuantity.MinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
 * SecuritiesQuantity.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Allocation
 * SecuritiesQuantity.Allocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Amount
 * SecuritiesQuantity.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DenominatorRatio
 * SecuritiesQuantity.DenominatorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NumeratorRatio
 * SecuritiesQuantity.NumeratorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionElection
 * SecuritiesQuantity.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#TaxVoucher
 * SecuritiesQuantity.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedBuyIn
 * SecuritiesQuantity.RelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
 * SecuritiesQuantity.PreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Liquidity
 * SecuritiesQuantity.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Rate
 * SecuritiesQuantity.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityOrderParameters
 * SecuritiesQuantity.MinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityRelatedQuote
 * SecuritiesQuantity.MaximumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MatchIncrementOrderParameters
 * SecuritiesQuantity.MatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
 * SecuritiesQuantity.RelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Pairoff
 * SecuritiesQuantity.Pairoff}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
 * SecuritiesQuantity.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingDistributionInformation
 * SecuritiesQuantity.MaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingDistributionInformation
 * SecuritiesQuantity.MinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#QuantityRelatedQuote
 * SecuritiesQuantity.QuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityRelatedQuote
 * SecuritiesQuantity.MinimumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NetAssetValueCalculation
 * SecuritiesQuantity.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SidePocket
 * SecuritiesQuantity.SidePocket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Netting
 * SecuritiesQuantity.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderStatus
 * SecuritiesQuantity.RelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesOrderStatus
 * SecuritiesQuantity.SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCashFlow
 * SecuritiesQuantity.RelatedCashFlow}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Position
 * SecuritiesQuantity.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
 * Security.SecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
 * Security.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SecuritiesQuantity
 * NetAssetValueCalculation.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
 * TradingMarket.MinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
 * TradingMarket.MaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
 * InvestmentFundOrder.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
 * SecuritiesTrade.TradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
 * SecuritiesTransfer.TransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
 * InvestmentFundOrderExecution.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
 * SecuritiesSettlement.SettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
 * SecuritiesSettlement.TurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#SecuritiesQuantity
 * LotBreakdown.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#FinancialInstrumentQuantity
 * SecuritiesEntry.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
 * Debt.MinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
 * Debt.MinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
 * Issuance.IssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Minimum
 * Issuance.Minimum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
 * SecuritiesConversion.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
 * SecuritiesConversion.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
 * SecuritiesConversion.ConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
 * SecuritiesConversion.ConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
 * SecuritiesBalance.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
 * SecuritiesBalance.SubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
 * SecuritiesBalance.AvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
 * SecuritiesBalance.UnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
 * CorporateActionEvent.FractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
 * CorporateActionEvent.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
 * CorporateActionEvent.SecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
 * SecuritiesProceedsDefinition.StatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Quantity
 * CorporateActionElection.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
 * BiddingConditions.FrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
 * BiddingConditions.BackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
 * BiddingConditions.MaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
 * BiddingConditions.MinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
 * BiddingConditions.BaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RecordDateHolding
 * TaxVoucher.RecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
 * CorporateActionDistribution.PostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#EntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
 * Lottery.IncrementalDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
 * SecuritiesOrder.OrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
 * SecuritiesOrder.DayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
 * Allocation.AllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityDenominator
 * UnderlyingRatio.UnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityNumerator
 * UnderlyingRatio.UnderlyingQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#CashFlowQuantity
 * FundsCashFlow.CashFlowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CumulativeQuantity
 * SecuritiesOrderStatus.CumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#RemainingQuantity
 * SecuritiesOrderStatus.RemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#SecuritiesCompensation
 * BuyIn.SecuritiesCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketQuantity
 * SidePocket.SidePocketQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#Quantity
 * Liquidity.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MinimumQuantity
 * SecuritiesOrderParameters.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MatchIncrement
 * SecuritiesOrderParameters.MatchIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MaximumQuantity
 * Quote.MaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#Quantity
 * Quote.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MinimumQuantity
 * Quote.MinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff#PairedOffQuantity
 * PairOff.PairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumHolding
 * SecuritiesAndCashDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumExercisableQuantity
 * SecuritiesAndCashDistribution.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumExercisableQuantity
 * SecuritiesAndCashDistribution.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumHolding
 * SecuritiesAndCashDistribution.MinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MaximumHolding
 * SecuritiesDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingDenominator
 * SecuritiesDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingNumerator
 * SecuritiesDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MinimumHolding
 * SecuritiesDistribution.MinimumHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#NetQuantity
 * Netting.NetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#NetQuantity
 * Position.NetQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity1#Quantity
 * ProprietaryQuantity1.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#Quantity
 * TransactionQuantities2Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#OriginalAndCurrentFaceAmount
 * TransactionQuantities2Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#Proprietary
 * TransactionQuantities2Choice.Proprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1
 * OriginalAndCurrentQuantities1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
 * FinancialInstrumentQuantityChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity1
 * ProprietaryQuantity1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
 * TransactionQuantities2Choice}</li>
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
 * "SecuritiesQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Quantity of a security."</li>
 * </ul>
 */
public class SecuritiesQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#Unit
	 * FinancialInstrumentQuantityChoice.Unit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Unit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.Unit);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Quantity of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Transfer of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
	 * SecuritiesTransfer.TransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of a specific quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
	 * Security.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
	 * InvestmentFundOrder.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a number of units is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax group to which the purchased units belong.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax group to which the purchased units belong."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Group1Or2Units = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased units belong.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}
	};
	/**
	 * Order execution process for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
	 * InvestmentFundOrderExecution.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order execution process for which a number of units is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement of a specific amount of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
	 * SecuritiesSettlement.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of a specific amount of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
	 * Security.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a minimum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of securities purchased or sold in one transaction. In terms of
	 * options, a lot represents the number of contracts contained in one
	 * derivative security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#SecuritiesQuantity
	 * LotBreakdown.SecuritiesQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
	 * SecuritiesConversion.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a minimum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable multiple
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
	 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a minimum exercisable multiple quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the aggregate quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
	 * SecuritiesBalance.AggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities balance which contains the aggregate quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AggregateQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which an amount of securities is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
	 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an amount of securities is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a conditional quantity has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
	 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a conditional quantity has been defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which an over and above normal endured quantity
	 * has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an over and above normal endured quantity has been provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry in a securities account of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#FinancialInstrumentQuantity
	 * SecuritiesEntry.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry in a securities account of a specific quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.QuantityCode
	 * QuantityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QuantityCode.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a quantity of securities to receive has
	 * been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
	 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a quantity of securities to receive has been specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to securities with a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
	 * SecuritiesProceedsDefinition.StatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRelatedSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds related to securities with a specific status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action distribution process for which a quantity of securities
	 * has been posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
	 * CorporateActionDistribution.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action distribution process for which a quantity of securities has been posted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Event for which the resulting fractional quantity will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
	 * CorporateActionEvent.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedEventForFractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event for which the resulting fractional quantity will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedEventForFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a maximum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
	 * SecuritiesConversion.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a maximum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLotSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities proceeds related to a board lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BoardLotSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to a quantity of redenominated securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds related to a quantity of redenominated securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * BiddingConditions for which a back end odd lot is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
	 * BiddingConditions.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BiddingConditions for which a back end odd lot is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the entitlement parameters relative to the securities
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#EntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entitlement parameters relative to the securities entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
	 * CorporateActionEvent.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which a quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions related to the base denomination quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
	 * BiddingConditions.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions related to the base denomination quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BaseDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lottery for which an incremental denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
	 * Lottery.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lottery for which an incremental denomination is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.IncrementalDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Sub balance which contains a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
	 * SecuritiesBalance.SubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSubBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub balance which contains a quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSubBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the securities quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
	 * SecuritiesBalance.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities balance which contains the securities quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AvailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
	 * SecuritiesTrade.TradeQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
	 * SecuritiesConversion.ConversionRatioDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatioDenominatorSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion ratio denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
	 * SecuritiesConversion.ConversionRatioNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatioNumeratorSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion ratio denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a minimum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
	 * TradingMarket.MinimumTradedNominalQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedQuantityMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a minimum traded quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a minimum denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
	 * Debt.MinimumDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenominationDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a minimum denomination is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumDenominationDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a minimum increment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
	 * Debt.MinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrementDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a minimum increment is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumIncrementDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a specific quantity is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
	 * SecuritiesOrder.OrderedQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a specific quantity is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
	 * Allocation.AllocatedQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as an amount, eg, in the investment fund business, a
	 * quantity of a financial instrument may be expressed as an amount of
	 * money.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Ratio for which a denominator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityDenominator
	 * UnderlyingRatio.UnderlyingQuantityDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominatorRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio for which a denominator is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DenominatorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Ratio for which a numerator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityNumerator
	 * UnderlyingRatio.UnderlyingQuantityNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumeratorRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio for which a numerator is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NumeratorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which settlement takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
	 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which settlement takes place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified a quantity of
	 * securities to purchase or redeem under the terms of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
	 * CorporateActionEvent.SecuritiesQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which selected a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Quantity
	 * CorporateActionElection.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which selected a quantity of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which the calculation of holdings at record date took
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RecordDateHolding
	 * TaxVoucher.RecordDateHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax voucher for which the calculation of holdings at record date took place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.RecordDateHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Buy-in process for which a compensation amount of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#SecuritiesCompensation
	 * BuyIn.SecuritiesCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy-in process for which a compensation amount of securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.SecuritiesCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order which uses information on a day order quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
	 * SecuritiesOrder.DayOrderQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousDayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order which uses information on a day order quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PreviousDayOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Liquidity information related to a quantity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#Quantity
	 * Liquidity.Quantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity information related to a quantity of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as a percentage rate, eg, in the investment fund
	 * business, a quantity of a financial instrument may be expressed as
	 * percentage of the investor's total holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Securities order for which a minimum quantity to execute is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MinimumQuantity
	 * SecuritiesOrderParameters.MinimumQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityOrderParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order for which a minimum quantity to execute is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a maximum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MaximumQuantity
	 * Quote.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a maximum quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the unavailable quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
	 * SecuritiesBalance.UnavailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities balance which contains the unavailable quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order parameters for which a match increment quantity is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MatchIncrement
	 * SecuritiesOrderParameters.MatchIncrement}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrementOrderParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order parameters for which a match increment quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MatchIncrementOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a minimum subscription quantity of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#Minimum
	 * Issuance.Minimum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance for which a minimum subscription quantity of securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.Minimum;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Pair off process for which a quantity has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#PairedOffQuantity
	 * PairOff.PairedOffQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pair off process for which a quantity has been specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Pairoff = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PairOff.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.PairedOffQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which the nominal amount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
	 * Issuance.IssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which the nominal amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssueNominalAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingDenominatorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumHolding
	 * SecuritiesAndCashDistribution.MaximumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumHoldingDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a maximum holding quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumExercisableQuantity
	 * SecuritiesAndCashDistribution.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantityDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a maximum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumExercisableQuantity
	 * SecuritiesAndCashDistribution.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a minimum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingDenominatorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumeratorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumHolding
	 * SecuritiesAndCashDistribution.MinimumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a minimum holding quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingNumeratorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a maximum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MaximumHolding
	 * SecuritiesDistribution.MaximumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumHoldingRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a maximum holding quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingNumerator
	 * SecuritiesDistribution.IntermediateToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which an intermediate to underlying numerator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying
	 * denominator quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingDenominator
	 * SecuritiesDistribution.IntermediateToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which an intermediate to underlying denominator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying denominator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingDenominator
	 * SecuritiesDistribution.DistributedToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a distributed to underlying denominator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingNumerator
	 * SecuritiesDistribution.DistributedToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a distributed to underlying numerator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a minimum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MinimumHolding
	 * SecuritiesDistribution.MinimumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a minimum holding quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a maximum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
	 * TradingMarket.MaximumTradedNominalQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedQuantityMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a maximum traded quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#Quantity
	 * Quote.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a minimum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MinimumQuantity
	 * Quote.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a minimum quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SecuritiesQuantity
	 * NetAssetValueCalculation.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net asset value calculation parameters."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Side pocket for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketQuantity
	 * SidePocket.SidePocketQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Side pocket for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.SidePocketQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Netting process for which a net quantity of securities has been
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#NetQuantity
	 * Netting.NetQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Netting process for which a net quantity of securities has been calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order status for which a remaining quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#RemainingQuantity
	 * SecuritiesOrderStatus.RemainingQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order status for which a remaining quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order status for which a cumulative quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CumulativeQuantity
	 * SecuritiesOrderStatus.CumulativeQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order status for which a cumulative quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which a turned quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
	 * SecuritiesSettlement.TurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTurnaroundSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which a turned quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTurnaroundSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash flow for which quantities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#CashFlowQuantity
	 * FundsCashFlow.CashFlowQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow for which quantities are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Position which contains the net quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#NetQuantity
	 * Position.NetQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position which contains the net quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Position = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
	 * BiddingConditions.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a front end odd lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
	 * BiddingConditions.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a front end odd lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
	 * BiddingConditions.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.MinimumQuantity,
						com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber, com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity, com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber,
						com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity, com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity, com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.Debt.MinimumDenomination, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Issuance.IssueNominalAmount,
						com.tools20022.repository.entity.Issuance.Minimum, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity, com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.CorporateActionElection.Quantity,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought, com.tools20022.repository.entity.BiddingConditions.BaseDenomination,
						com.tools20022.repository.entity.TaxVoucher.RecordDateHolding, com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity, com.tools20022.repository.entity.Lottery.IncrementalDenomination,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity, com.tools20022.repository.entity.Allocation.AllocatedQuantity,
						com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator, com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator,
						com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity,
						com.tools20022.repository.entity.BuyIn.SecuritiesCompensation, com.tools20022.repository.entity.SidePocket.SidePocketQuantity, com.tools20022.repository.entity.Liquidity.Quantity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement, com.tools20022.repository.entity.Quote.MaximumQuantity,
						com.tools20022.repository.entity.Quote.Quantity, com.tools20022.repository.entity.Quote.MinimumQuantity, com.tools20022.repository.entity.PairOff.PairedOffQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding, com.tools20022.repository.entity.Netting.NetQuantity,
						com.tools20022.repository.entity.Position.NetQuantity);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryQuantity1.Quantity, com.tools20022.repository.choice.TransactionQuantities2Choice.Quantity,
						com.tools20022.repository.choice.TransactionQuantities2Choice.OriginalAndCurrentFaceAmount, com.tools20022.repository.choice.TransactionQuantities2Choice.Proprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Unit, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.Order, com.tools20022.repository.entity.SecuritiesQuantity.Group1Or2Units,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt, com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.Entry, com.tools20022.repository.entity.SecuritiesQuantity.Code, com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesEntitlement,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent, com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.Lottery,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance, com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.Trade,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.Allocation,
						com.tools20022.repository.entity.SecuritiesQuantity.Amount, com.tools20022.repository.entity.SecuritiesQuantity.DenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.NumeratorRatio,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher, com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder, com.tools20022.repository.entity.SecuritiesQuantity.Liquidity, com.tools20022.repository.entity.SecuritiesQuantity.Rate,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Pairoff, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.QuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesQuantity.SidePocket, com.tools20022.repository.entity.SecuritiesQuantity.Netting, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.Position,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions);
				derivationComponent_lazy = () -> Arrays.asList(OriginalAndCurrentQuantities1.mmObject(), FinancialInstrumentQuantityChoice.mmObject(), ProprietaryQuantity1.mmObject(), TransactionQuantities2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}