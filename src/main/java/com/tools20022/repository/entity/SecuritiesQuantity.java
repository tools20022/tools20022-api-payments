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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.TransactionQuantities2Choice;
import com.tools20022.repository.codeset.QuantityCode;
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalAndCurrentQuantities1;
import com.tools20022.repository.msg.ProprietaryQuantity1;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
 * SecuritiesQuantity.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
 * SecuritiesQuantity.mmSecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
 * SecuritiesQuantity.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
 * SecuritiesQuantity.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
 * SecuritiesQuantity.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesProceedsDefinition
 * SecuritiesQuantity.mmSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmEntry
 * SecuritiesQuantity.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCode
 * SecuritiesQuantity.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmStatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionDistribution
 * SecuritiesQuantity.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBoardLotSecuritiesProceeds
 * SecuritiesQuantity.mmBoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNewDenominationSecuritiesProceeds
 * SecuritiesQuantity.mmNewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
 * SecuritiesQuantity.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
 * SecuritiesQuantity.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
 * SecuritiesQuantity.mmRelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
 * SecuritiesQuantity.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAllocation
 * SecuritiesQuantity.mmAllocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
 * SecuritiesQuantity.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDenominatorRatio
 * SecuritiesQuantity.mmDenominatorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNumeratorRatio
 * SecuritiesQuantity.mmNumeratorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
 * SecuritiesQuantity.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
 * SecuritiesQuantity.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedBuyIn
 * SecuritiesQuantity.mmRelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
 * SecuritiesQuantity.mmPreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLiquidity
 * SecuritiesQuantity.mmLiquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRate
 * SecuritiesQuantity.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityOrderParameters
 * SecuritiesQuantity.mmMinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityRelatedQuote
 * SecuritiesQuantity.mmMaximumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMatchIncrementOrderParameters
 * SecuritiesQuantity.mmMatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedIssuance
 * SecuritiesQuantity.mmRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPairoff
 * SecuritiesQuantity.mmPairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIssuance
 * SecuritiesQuantity.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingDistributionInformation
 * SecuritiesQuantity.mmMaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingDistributionInformation
 * SecuritiesQuantity.mmMinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmQuantityRelatedQuote
 * SecuritiesQuantity.mmQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityRelatedQuote
 * SecuritiesQuantity.mmMinimumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSidePocket
 * SecuritiesQuantity.mmSidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetting
 * SecuritiesQuantity.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
 * SecuritiesQuantity.mmRelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPosition
 * SecuritiesQuantity.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
 * Security.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
 * Security.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
 * InvestmentFundOrder.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
 * SecuritiesTransfer.mmTransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
 * SecuritiesSettlement.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
 * SecuritiesSettlement.mmTurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
 * LotBreakdown.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
 * Debt.mmMinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
 * Debt.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
 * Issuance.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmMinimum
 * Issuance.mmMinimum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
 * SecuritiesConversion.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
 * SecuritiesConversion.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
 * SecuritiesBalance.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
 * SecuritiesBalance.mmSubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
 * SecuritiesBalance.mmAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
 * SecuritiesBalance.mmUnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
 * CorporateActionEvent.mmFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
 * CorporateActionEvent.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
 * CorporateActionElection.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
 * BiddingConditions.mmBackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
 * BiddingConditions.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
 * BiddingConditions.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
 * BiddingConditions.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
 * TaxVoucher.mmRecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
 * CorporateActionDistribution.mmPostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
 * SecuritiesOrder.mmOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
 * SecuritiesOrder.mmDayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
 * Allocation.mmAllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
 * FundsCashFlow.mmCashFlowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
 * BuyIn.mmSecuritiesCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketQuantity
 * SidePocket.mmSidePocketQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmQuantity
 * Liquidity.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
 * SecuritiesOrderParameters.mmMatchIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
 * Quote.mmMaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuantity
 * Quote.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
 * Quote.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
 * PairOff.mmPairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumHolding
 * SecuritiesAndCashDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumHolding
 * SecuritiesAndCashDistribution.mmMinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMaximumHolding
 * SecuritiesDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMinimumHolding
 * SecuritiesDistribution.mmMinimumHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmNetQuantity
 * Netting.mmNetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
 * Position.mmNetQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity1#mmQuantity
 * ProprietaryQuantity1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmQuantity
 * TransactionQuantities2Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmOriginalAndCurrentFaceAmount
 * TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmProprietary
 * TransactionQuantities2Choice.mmProprietary}</li>
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
	protected DecimalNumber unit;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmUnit
	 * FinancialInstrumentQuantityChoice.mmUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: UNIT</li>
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
	public static final MMBusinessAttribute<SecuritiesQuantity, DecimalNumber> mmUnit = new MMBusinessAttribute<SecuritiesQuantity, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantityChoice.mmUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "UNIT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(SecuritiesQuantity obj) {
			return obj.getUnit();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, DecimalNumber value) {
			obj.setUnit(value);
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTransfer>> mmSecuritiesTransfer = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public Optional<SecuritiesTransfer> getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesTransfer();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesTransfer> value) {
			obj.setSecuritiesTransfer(value.orElse(null));
		}
	};
	protected Security securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Security> mmSecurityIdentification = new MMBusinessAssociationEnd<SecuritiesQuantity, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(SecuritiesQuantity obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Security value) {
			obj.setSecurityIdentification(value);
		}
	};
	protected InvestmentFundOrder order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, InvestmentFundOrder> mmOrder = new MMBusinessAssociationEnd<SecuritiesQuantity, InvestmentFundOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrder.mmObject();
		}

		@Override
		public InvestmentFundOrder getValue(SecuritiesQuantity obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, InvestmentFundOrder value) {
			obj.setOrder(value);
		}
	};
	protected UKTaxGroupUnitCode group1Or2Units;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesQuantity, UKTaxGroupUnitCode> mmGroup1Or2Units = new MMBusinessAttribute<SecuritiesQuantity, UKTaxGroupUnitCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased units belong.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}

		@Override
		public UKTaxGroupUnitCode getValue(SecuritiesQuantity obj) {
			return obj.getGroup1Or2Units();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, UKTaxGroupUnitCode value) {
			obj.setGroup1Or2Units(value);
		}
	};
	protected InvestmentFundOrderExecution relatedOrderExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, InvestmentFundOrderExecution> mmRelatedOrderExecution = new MMBusinessAssociationEnd<SecuritiesQuantity, InvestmentFundOrderExecution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}

		@Override
		public InvestmentFundOrderExecution getValue(SecuritiesQuantity obj) {
			return obj.getRelatedOrderExecution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, InvestmentFundOrderExecution value) {
			obj.setRelatedOrderExecution(value);
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesSettlement>> mmSecuritiesSettlement = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement> getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesSettlement> value) {
			obj.setSecuritiesSettlement(value.orElse(null));
		}
	};
	protected Security minimumQuantityDebt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Security> mmMinimumQuantityDebt = new MMBusinessAssociationEnd<SecuritiesQuantity, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(SecuritiesQuantity obj) {
			return obj.getMinimumQuantityDebt();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Security value) {
			obj.setMinimumQuantityDebt(value);
		}
	};
	protected List<LotBreakdown> lotBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, List<LotBreakdown>> mmLotBreakdown = new MMBusinessAssociationEnd<SecuritiesQuantity, List<LotBreakdown>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			opposite_lazy = () -> LotBreakdown.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public List<LotBreakdown> getValue(SecuritiesQuantity obj) {
			return obj.getLotBreakdown();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, List<LotBreakdown> value) {
			obj.setLotBreakdown(value);
		}
	};
	protected List<SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesConversion>> mmMinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public List<SecuritiesConversion> getValue(SecuritiesQuantity obj) {
			return obj.getMinimumExercisableQuantitySecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, List<SecuritiesConversion> value) {
			obj.setMinimumExercisableQuantitySecuritiesConversion(value);
		}
	};
	protected SecuritiesConversion minimumExercisableMultipleQuantitySecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesConversion>> mmMinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public Optional<SecuritiesConversion> getValue(SecuritiesQuantity obj) {
			return obj.getMinimumExercisableMultipleQuantitySecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesConversion> value) {
			obj.setMinimumExercisableMultipleQuantitySecuritiesConversion(value.orElse(null));
		}
	};
	protected SecuritiesBalance aggregateQuantityBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>> mmAggregateQuantityBalance = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public Optional<SecuritiesBalance> getValue(SecuritiesQuantity obj) {
			return obj.getAggregateQuantityBalance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesBalance> value) {
			obj.setAggregateQuantityBalance(value.orElse(null));
		}
	};
	protected SecuritiesProceedsDefinition securitiesProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmSecuritiesProceedsDefinition = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesProceedsDefinition();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setSecuritiesProceedsDefinition(value);
		}
	};
	protected SecuritiesProceedsDefinition conditionalQuantitySecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
	 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmConditionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getConditionalQuantitySecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setConditionalQuantitySecuritiesProceeds(value);
		}
	};
	protected SecuritiesProceedsDefinition overAndAboveQuantitySecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesProceedsDefinition.
	 * mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmOverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getOverAndAboveQuantitySecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setOverAndAboveQuantitySecuritiesProceeds(value);
		}
	};
	protected SecuritiesEntry entry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
	 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesEntry>> mmEntry = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesEntry.mmFinancialInstrumentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesEntry.mmObject();
		}

		@Override
		public Optional<SecuritiesEntry> getValue(SecuritiesQuantity obj) {
			return obj.getEntry();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesEntry> value) {
			obj.setEntry(value.orElse(null));
		}
	};
	protected QuantityCode code;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesQuantity, QuantityCode> mmCode = new MMBusinessAttribute<SecuritiesQuantity, QuantityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuantityCode.mmObject();
		}

		@Override
		public QuantityCode getValue(SecuritiesQuantity obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, QuantityCode value) {
			obj.setCode(value);
		}
	};
	protected SecuritiesProceedsDefinition expectedQuantitySecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
	 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmQuantityToReceive;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getExpectedQuantitySecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setExpectedQuantitySecuritiesProceeds(value);
		}
	};
	protected SecuritiesProceedsDefinition statusRelatedSecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
	 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmStatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmStatusQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getStatusRelatedSecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setStatusRelatedSecuritiesProceeds(value);
		}
	};
	protected CorporateActionDistribution corporateActionDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
	 * CorporateActionDistribution.mmPostingQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionDistribution> mmCorporateActionDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionDistribution.mmPostingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public CorporateActionDistribution getValue(SecuritiesQuantity obj) {
			return obj.getCorporateActionDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionDistribution value) {
			obj.setCorporateActionDistribution(value);
		}
	};
	protected CorporateActionEvent relatedEventForFractionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
	 * CorporateActionEvent.mmFractionalQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent> mmRelatedEventForFractionalQuantity = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(SecuritiesQuantity obj) {
			return obj.getRelatedEventForFractionalQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionEvent value) {
			obj.setRelatedEventForFractionalQuantity(value);
		}
	};
	protected List<SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
	 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesConversion>> mmMaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public List<SecuritiesConversion> getValue(SecuritiesQuantity obj) {
			return obj.getMaximumExercisableQuantitySecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, List<SecuritiesConversion> value) {
			obj.setMaximumExercisableQuantitySecuritiesConversion(value);
		}
	};
	protected SecuritiesProceedsDefinition boardLotSecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmBoardLotSecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getBoardLotSecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setBoardLotSecuritiesProceeds(value);
		}
	};
	protected SecuritiesProceedsDefinition newDenominationSecuritiesProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition> mmNewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(SecuritiesQuantity obj) {
			return obj.getNewDenominationSecuritiesProceeds();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesProceedsDefinition value) {
			obj.setNewDenominationSecuritiesProceeds(value);
		}
	};
	protected BiddingConditions backEndOddLotBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
	 * BiddingConditions.mmBackEndOddLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions> mmBackEndOddLotBiddingConditions = new MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmBackEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesQuantity obj) {
			return obj.getBackEndOddLotBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, BiddingConditions value) {
			obj.setBackEndOddLotBiddingConditions(value);
		}
	};
	protected CorporateActionSecuritiesEntitlement securitiesEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionSecuritiesEntitlement> mmSecuritiesEntitlement = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionSecuritiesEntitlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
		}

		@Override
		public CorporateActionSecuritiesEntitlement getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesEntitlement();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionSecuritiesEntitlement value) {
			obj.setSecuritiesEntitlement(value);
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent> mmCorporateActionEvent = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(SecuritiesQuantity obj) {
			return obj.getCorporateActionEvent();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionEvent value) {
			obj.setCorporateActionEvent(value);
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
	 * BiddingConditions.mmBaseDenomination}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions> mmBiddingConditions = new MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmBaseDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesQuantity obj) {
			return obj.getBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, BiddingConditions value) {
			obj.setBiddingConditions(value);
		}
	};
	protected Lottery lottery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
	 * Lottery.mmIncrementalDenomination}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Lottery> mmLottery = new MMBusinessAssociationEnd<SecuritiesQuantity, Lottery>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Lottery.mmIncrementalDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Lottery.mmObject();
		}

		@Override
		public Lottery getValue(SecuritiesQuantity obj) {
			return obj.getLottery();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Lottery value) {
			obj.setLottery(value);
		}
	};
	protected SecuritiesBalance relatedSubBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>> mmRelatedSubBalance = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public Optional<SecuritiesBalance> getValue(SecuritiesQuantity obj) {
			return obj.getRelatedSubBalance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesBalance> value) {
			obj.setRelatedSubBalance(value.orElse(null));
		}
	};
	protected SecuritiesBalance availableQuantityBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
	 * SecuritiesBalance.mmAvailableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>> mmAvailableQuantityBalance = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmAvailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public Optional<SecuritiesBalance> getValue(SecuritiesQuantity obj) {
			return obj.getAvailableQuantityBalance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesBalance> value) {
			obj.setAvailableQuantityBalance(value.orElse(null));
		}
	};
	protected SecuritiesTrade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTrade>> mmTrade = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}

		@Override
		public Optional<SecuritiesTrade> getValue(SecuritiesQuantity obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesTrade> value) {
			obj.setTrade(value.orElse(null));
		}
	};
	protected SecuritiesConversion ratioDenominatorSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
	 * SecuritiesConversion.mmConversionRatioDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesConversion> mmRatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesConversion>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesConversion.mmConversionRatioDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public SecuritiesConversion getValue(SecuritiesQuantity obj) {
			return obj.getRatioDenominatorSecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesConversion value) {
			obj.setRatioDenominatorSecuritiesConversion(value);
		}
	};
	protected SecuritiesConversion ratioNumeratorSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
	 * SecuritiesConversion.mmConversionRatioNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesConversion> mmRatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesConversion>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesConversion.mmConversionRatioNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public SecuritiesConversion getValue(SecuritiesQuantity obj) {
			return obj.getRatioNumeratorSecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesConversion value) {
			obj.setRatioNumeratorSecuritiesConversion(value);
		}
	};
	protected TradingMarket minimumTradedQuantityMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
	 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, TradingMarket> mmMinimumTradedQuantityMarket = new MMBusinessAssociationEnd<SecuritiesQuantity, TradingMarket>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingMarket.mmMinimumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public TradingMarket getValue(SecuritiesQuantity obj) {
			return obj.getMinimumTradedQuantityMarket();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, TradingMarket value) {
			obj.setMinimumTradedQuantityMarket(value);
		}
	};
	protected Debt minimumDenominationDebt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
	 * Debt.mmMinimumDenomination}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Debt> mmMinimumDenominationDebt = new MMBusinessAssociationEnd<SecuritiesQuantity, Debt>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Debt.mmMinimumDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}

		@Override
		public Debt getValue(SecuritiesQuantity obj) {
			return obj.getMinimumDenominationDebt();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Debt value) {
			obj.setMinimumDenominationDebt(value);
		}
	};
	protected Debt minimumIncrementDebt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
	 * Debt.mmMinimumIncrement}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Debt> mmMinimumIncrementDebt = new MMBusinessAssociationEnd<SecuritiesQuantity, Debt>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Debt.mmMinimumIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}

		@Override
		public Debt getValue(SecuritiesQuantity obj) {
			return obj.getMinimumIncrementDebt();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Debt value) {
			obj.setMinimumIncrementDebt(value);
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesQuantity obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected Allocation allocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
	 * Allocation.mmAllocatedQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<Allocation>> mmAllocation = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmAllocatedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public Optional<Allocation> getValue(SecuritiesQuantity obj) {
			return obj.getAllocation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<Allocation> value) {
			obj.setAllocation(value.orElse(null));
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesQuantity, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<SecuritiesQuantity, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesQuantity obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected UnderlyingRatio denominatorRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
	 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, UnderlyingRatio> mmDenominatorRatio = new MMBusinessAssociationEnd<SecuritiesQuantity, UnderlyingRatio>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UnderlyingRatio.mmUnderlyingQuantityDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}

		@Override
		public UnderlyingRatio getValue(SecuritiesQuantity obj) {
			return obj.getDenominatorRatio();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, UnderlyingRatio value) {
			obj.setDenominatorRatio(value);
		}
	};
	protected UnderlyingRatio numeratorRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
	 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, UnderlyingRatio> mmNumeratorRatio = new MMBusinessAssociationEnd<SecuritiesQuantity, UnderlyingRatio>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UnderlyingRatio.mmUnderlyingQuantityNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}

		@Override
		public UnderlyingRatio getValue(SecuritiesQuantity obj) {
			return obj.getNumeratorRatio();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, UnderlyingRatio value) {
			obj.setNumeratorRatio(value);
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
	 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTradeExecution>> mmSecuritiesTradeExecution = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesTradeExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeExecution.mmExecutedTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
		}

		@Override
		public Optional<SecuritiesTradeExecution> getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesTradeExecution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesTradeExecution> value) {
			obj.setSecuritiesTradeExecution(value.orElse(null));
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
	 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent> mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmSecuritiesQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(SecuritiesQuantity obj) {
			return obj.getRelatedCorporateActionEvent();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionEvent value) {
			obj.setRelatedCorporateActionEvent(value);
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionElection> mmCorporateActionElection = new MMBusinessAssociationEnd<SecuritiesQuantity, CorporateActionElection>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionElection.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionElection.mmObject();
		}

		@Override
		public CorporateActionElection getValue(SecuritiesQuantity obj) {
			return obj.getCorporateActionElection();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, CorporateActionElection value) {
			obj.setCorporateActionElection(value);
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
	 * TaxVoucher.mmRecordDateHolding}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, TaxVoucher> mmTaxVoucher = new MMBusinessAssociationEnd<SecuritiesQuantity, TaxVoucher>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TaxVoucher.mmRecordDateHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxVoucher.mmObject();
		}

		@Override
		public TaxVoucher getValue(SecuritiesQuantity obj) {
			return obj.getTaxVoucher();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, TaxVoucher value) {
			obj.setTaxVoucher(value);
		}
	};
	protected BuyIn relatedBuyIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
	 * BuyIn.mmSecuritiesCompensation}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<BuyIn>> mmRelatedBuyIn = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<BuyIn>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BuyIn.mmSecuritiesCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}

		@Override
		public Optional<BuyIn> getValue(SecuritiesQuantity obj) {
			return obj.getRelatedBuyIn();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<BuyIn> value) {
			obj.setRelatedBuyIn(value.orElse(null));
		}
	};
	protected SecuritiesOrder previousDayOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
	 * SecuritiesOrder.mmDayOrderQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrder>> mmPreviousDayOrder = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmDayOrderQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesQuantity obj) {
			return obj.getPreviousDayOrder();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesOrder> value) {
			obj.setPreviousDayOrder(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmQuantity
	 * Liquidity.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, List<Liquidity>> mmLiquidity = new MMBusinessAssociationEnd<SecuritiesQuantity, List<Liquidity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> Liquidity.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Liquidity.mmObject();
		}

		@Override
		public List<Liquidity> getValue(SecuritiesQuantity obj) {
			return obj.getLiquidity();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, List<Liquidity> value) {
			obj.setLiquidity(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesQuantity, PercentageRate> mmRate = new MMBusinessAttribute<SecuritiesQuantity, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesQuantity obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected List<SecuritiesOrderParameters> minimumQuantityOrderParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
	 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesOrderParameters>> mmMinimumQuantityOrderParameters = new MMBusinessAssociationEnd<SecuritiesQuantity, List<SecuritiesOrderParameters>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrderParameters.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}

		@Override
		public List<SecuritiesOrderParameters> getValue(SecuritiesQuantity obj) {
			return obj.getMinimumQuantityOrderParameters();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, List<SecuritiesOrderParameters> value) {
			obj.setMinimumQuantityOrderParameters(value);
		}
	};
	protected Quote maximumQuantityRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
	 * Quote.mmMaximumQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<Quote>> mmMaximumQuantityRelatedQuote = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(SecuritiesQuantity obj) {
			return obj.getMaximumQuantityRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<Quote> value) {
			obj.setMaximumQuantityRelatedQuote(value.orElse(null));
		}
	};
	protected SecuritiesBalance unavailableQuantityBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
	 * SecuritiesBalance.mmUnavailableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>> mmUnavailableQuantityBalance = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmUnavailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public Optional<SecuritiesBalance> getValue(SecuritiesQuantity obj) {
			return obj.getUnavailableQuantityBalance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesBalance> value) {
			obj.setUnavailableQuantityBalance(value.orElse(null));
		}
	};
	protected SecuritiesOrderParameters matchIncrementOrderParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
	 * SecuritiesOrderParameters.mmMatchIncrement}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrderParameters>> mmMatchIncrementOrderParameters = new MMBusinessAssociationEnd<SecuritiesQuantity, Optional<SecuritiesOrderParameters>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrderParameters.mmMatchIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}

		@Override
		public Optional<SecuritiesOrderParameters> getValue(SecuritiesQuantity obj) {
			return obj.getMatchIncrementOrderParameters();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Optional<SecuritiesOrderParameters> value) {
			obj.setMatchIncrementOrderParameters(value.orElse(null));
		}
	};
	protected Issuance relatedIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmMinimum
	 * Issuance.mmMinimum}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Issuance> mmRelatedIssuance = new MMBusinessAssociationEnd<SecuritiesQuantity, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmMinimum;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(SecuritiesQuantity obj) {
			return obj.getRelatedIssuance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Issuance value) {
			obj.setRelatedIssuance(value);
		}
	};
	protected PairOff pairoff;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
	 * PairOff.mmPairedOffQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, PairOff> mmPairoff = new MMBusinessAssociationEnd<SecuritiesQuantity, PairOff>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PairOff.mmPairedOffQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PairOff.mmObject();
		}

		@Override
		public PairOff getValue(SecuritiesQuantity obj) {
			return obj.getPairoff();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, PairOff value) {
			obj.setPairoff(value);
		}
	};
	protected Issuance issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Issuance> mmIssuance = new MMBusinessAssociationEnd<SecuritiesQuantity, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmIssueNominalAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(SecuritiesQuantity obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Issuance value) {
			obj.setIssuance(value);
		}
	};
	protected SecuritiesAndCashDistribution intermediateToUnderlyingDenominatorDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmIntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getIntermediateToUnderlyingDenominatorDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setIntermediateToUnderlyingDenominatorDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution maximumHoldingDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumHolding
	 * SecuritiesAndCashDistribution.mmMaximumHolding}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmMaximumHoldingDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMaximumHoldingDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setMaximumHoldingDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution maximumExercisableQuantityDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumExercisableQuantity
	 * SecuritiesAndCashDistribution.mmMaximumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmMaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMaximumExercisableQuantityDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setMaximumExercisableQuantityDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution minimumExercisableQuantityDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumExercisableQuantity
	 * SecuritiesAndCashDistribution.mmMinimumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmMinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMinimumExercisableQuantityDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setMinimumExercisableQuantityDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution distributedToUnderlyingDenominatorDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmDistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getDistributedToUnderlyingDenominatorDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setDistributedToUnderlyingDenominatorDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution intermediateToUnderlyingNumeratorDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmIntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getIntermediateToUnderlyingNumeratorDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setIntermediateToUnderlyingNumeratorDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution minimumHoldingDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumHolding
	 * SecuritiesAndCashDistribution.mmMinimumHolding}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmMinimumHoldingDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMinimumHoldingDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setMinimumHoldingDistributionInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution distributedToUnderlyingNumeratorDistributionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution> mmDistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesAndCashDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}

		@Override
		public SecuritiesAndCashDistribution getValue(SecuritiesQuantity obj) {
			return obj.getDistributedToUnderlyingNumeratorDistributionInformation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesAndCashDistribution value) {
			obj.setDistributedToUnderlyingNumeratorDistributionInformation(value);
		}
	};
	protected SecuritiesDistribution maximumHoldingRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMaximumHolding
	 * SecuritiesDistribution.mmMaximumHolding}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmMaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMaximumHoldingRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setMaximumHoldingRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingNumerator
	 * SecuritiesDistribution.mmIntermediateToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingDenominator
	 * SecuritiesDistribution.mmIntermediateToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingDenominator
	 * SecuritiesDistribution.mmDistributedToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingNumerator
	 * SecuritiesDistribution.mmDistributedToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution minimumHoldingRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMinimumHolding
	 * SecuritiesDistribution.mmMinimumHolding}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution> mmMinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesQuantity obj) {
			return obj.getMinimumHoldingRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesDistribution value) {
			obj.setMinimumHoldingRelatedSecuritiesDistribution(value);
		}
	};
	protected TradingMarket maximumTradedQuantityMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
	 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, TradingMarket> mmMaximumTradedQuantityMarket = new MMBusinessAssociationEnd<SecuritiesQuantity, TradingMarket>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingMarket.mmMaximumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public TradingMarket getValue(SecuritiesQuantity obj) {
			return obj.getMaximumTradedQuantityMarket();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, TradingMarket value) {
			obj.setMaximumTradedQuantityMarket(value);
		}
	};
	protected Quote quantityRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Quote> mmQuantityRelatedQuote = new MMBusinessAssociationEnd<SecuritiesQuantity, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuantity obj) {
			return obj.getQuantityRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Quote value) {
			obj.setQuantityRelatedQuote(value);
		}
	};
	protected Quote minimumQuantityRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
	 * Quote.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Quote> mmMinimumQuantityRelatedQuote = new MMBusinessAssociationEnd<SecuritiesQuantity, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuantity obj) {
			return obj.getMinimumQuantityRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Quote value) {
			obj.setMinimumQuantityRelatedQuote(value);
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
	 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, NetAssetValueCalculation> mmNetAssetValueCalculation = new MMBusinessAssociationEnd<SecuritiesQuantity, NetAssetValueCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> NetAssetValueCalculation.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public NetAssetValueCalculation getValue(SecuritiesQuantity obj) {
			return obj.getNetAssetValueCalculation();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, NetAssetValueCalculation value) {
			obj.setNetAssetValueCalculation(value);
		}
	};
	protected SidePocket sidePocket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketQuantity
	 * SidePocket.mmSidePocketQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SidePocket> mmSidePocket = new MMBusinessAssociationEnd<SecuritiesQuantity, SidePocket>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SidePocket.mmSidePocketQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SidePocket.mmObject();
		}

		@Override
		public SidePocket getValue(SecuritiesQuantity obj) {
			return obj.getSidePocket();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SidePocket value) {
			obj.setSidePocket(value);
		}
	};
	protected Netting netting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmNetQuantity
	 * Netting.mmNetQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Netting> mmNetting = new MMBusinessAssociationEnd<SecuritiesQuantity, Netting>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Netting.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Netting.mmObject();
		}

		@Override
		public Netting getValue(SecuritiesQuantity obj) {
			return obj.getNetting();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Netting value) {
			obj.setNetting(value);
		}
	};
	protected SecuritiesOrderStatus relatedOrderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
	 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesOrderStatus> mmRelatedOrderStatus = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesOrderStatus>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrderStatus.mmRemainingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
		}

		@Override
		public SecuritiesOrderStatus getValue(SecuritiesQuantity obj) {
			return obj.getRelatedOrderStatus();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesOrderStatus value) {
			obj.setRelatedOrderStatus(value);
		}
	};
	protected SecuritiesOrderStatus securitiesOrderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
	 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesOrderStatus> mmSecuritiesOrderStatus = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesOrderStatus>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrderStatus.mmCumulativeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
		}

		@Override
		public SecuritiesOrderStatus getValue(SecuritiesQuantity obj) {
			return obj.getSecuritiesOrderStatus();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesOrderStatus value) {
			obj.setSecuritiesOrderStatus(value);
		}
	};
	protected SecuritiesSettlement relatedTurnaroundSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
	 * SecuritiesSettlement.mmTurnedQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesSettlement> mmRelatedTurnaroundSettlement = new MMBusinessAssociationEnd<SecuritiesQuantity, SecuritiesSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSettlement.mmTurnedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public SecuritiesSettlement getValue(SecuritiesQuantity obj) {
			return obj.getRelatedTurnaroundSettlement();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, SecuritiesSettlement value) {
			obj.setRelatedTurnaroundSettlement(value);
		}
	};
	protected FundsCashFlow relatedCashFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
	 * FundsCashFlow.mmCashFlowQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, FundsCashFlow> mmRelatedCashFlow = new MMBusinessAssociationEnd<SecuritiesQuantity, FundsCashFlow>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FundsCashFlow.mmCashFlowQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}

		@Override
		public FundsCashFlow getValue(SecuritiesQuantity obj) {
			return obj.getRelatedCashFlow();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, FundsCashFlow value) {
			obj.setRelatedCashFlow(value);
		}
	};
	protected Position position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
	 * Position.mmNetQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, Position> mmPosition = new MMBusinessAssociationEnd<SecuritiesQuantity, Position>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Position.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Position.mmObject();
		}

		@Override
		public Position getValue(SecuritiesQuantity obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, Position value) {
			obj.setPosition(value);
		}
	};
	protected BiddingConditions maximumQuantityBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
	 * BiddingConditions.mmMaximumQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions> mmMaximumQuantityBiddingConditions = new MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesQuantity obj) {
			return obj.getMaximumQuantityBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, BiddingConditions value) {
			obj.setMaximumQuantityBiddingConditions(value);
		}
	};
	protected BiddingConditions frontEndOddLotBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
	 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions> mmFrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmFrontEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesQuantity obj) {
			return obj.getFrontEndOddLotBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, BiddingConditions value) {
			obj.setFrontEndOddLotBiddingConditions(value);
		}
	};
	protected BiddingConditions minimumQuantityBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
	 * BiddingConditions.mmMinimumQuantitySought}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions> mmMinimumQuantityBiddingConditions = new MMBusinessAssociationEnd<SecuritiesQuantity, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMinimumQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesQuantity obj) {
			return obj.getMinimumQuantityBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesQuantity obj, BiddingConditions value) {
			obj.setMinimumQuantityBiddingConditions(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmSecuritiesQuantity, Security.mmMinimumQuantity, NetAssetValueCalculation.mmSecuritiesQuantity, TradingMarket.mmMinimumTradedNominalQuantity,
						TradingMarket.mmMaximumTradedNominalQuantity, InvestmentFundOrder.mmUnitsNumber, SecuritiesTrade.mmTradeQuantity, SecuritiesTransfer.mmTransferredQuantity, InvestmentFundOrderExecution.mmUnitsNumber,
						SecuritiesSettlement.mmSettlementQuantity, SecuritiesSettlement.mmTurnedQuantity, LotBreakdown.mmSecuritiesQuantity, SecuritiesEntry.mmFinancialInstrumentQuantity, SecuritiesTradeExecution.mmExecutedTradeQuantity,
						Debt.mmMinimumDenomination, Debt.mmMinimumIncrement, Issuance.mmIssueNominalAmount, Issuance.mmMinimum, SecuritiesConversion.mmMinimumExercisableQuantity, SecuritiesConversion.mmMinimumExercisableMultipleQuantity,
						SecuritiesConversion.mmMaximumExercisableQuantity, SecuritiesConversion.mmConversionRatioDenominator, SecuritiesConversion.mmConversionRatioNumerator, SecuritiesBalance.mmAggregateQuantity,
						SecuritiesBalance.mmSubBalanceQuantity, SecuritiesBalance.mmAvailableQuantity, SecuritiesBalance.mmUnavailableQuantity, CorporateActionEvent.mmFractionalQuantity, CorporateActionEvent.mmSecuritiesQuantity,
						CorporateActionEvent.mmSecuritiesQuantitySought, SecuritiesProceedsDefinition.mmSecuritiesQuantity, SecuritiesProceedsDefinition.mmConditionalQuantity,
						SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity, SecuritiesProceedsDefinition.mmQuantityToReceive, SecuritiesProceedsDefinition.mmStatusQuantity,
						SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity, SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity, CorporateActionElection.mmQuantity, BiddingConditions.mmFrontEndOddLotQuantity,
						BiddingConditions.mmBackEndOddLotQuantity, BiddingConditions.mmMaximumQuantity, BiddingConditions.mmMinimumQuantitySought, BiddingConditions.mmBaseDenomination, TaxVoucher.mmRecordDateHolding,
						CorporateActionDistribution.mmPostingQuantity, CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity, Lottery.mmIncrementalDenomination, SecuritiesOrder.mmOrderedQuantity,
						SecuritiesOrder.mmDayOrderQuantity, Allocation.mmAllocatedQuantity, UnderlyingRatio.mmUnderlyingQuantityDenominator, UnderlyingRatio.mmUnderlyingQuantityNumerator, FundsCashFlow.mmCashFlowQuantity,
						SecuritiesOrderStatus.mmCumulativeQuantity, SecuritiesOrderStatus.mmRemainingQuantity, BuyIn.mmSecuritiesCompensation, SidePocket.mmSidePocketQuantity, Liquidity.mmQuantity,
						SecuritiesOrderParameters.mmMinimumQuantity, SecuritiesOrderParameters.mmMatchIncrement, Quote.mmMaximumQuantity, Quote.mmQuantity, Quote.mmMinimumQuantity, PairOff.mmPairedOffQuantity,
						SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator, SecuritiesAndCashDistribution.mmMaximumHolding, SecuritiesAndCashDistribution.mmMaximumExercisableQuantity,
						SecuritiesAndCashDistribution.mmMinimumExercisableQuantity, SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator, SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator,
						SecuritiesAndCashDistribution.mmMinimumHolding, SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator, SecuritiesDistribution.mmMaximumHolding, SecuritiesDistribution.mmIntermediateToUnderlyingNumerator,
						SecuritiesDistribution.mmIntermediateToUnderlyingDenominator, SecuritiesDistribution.mmDistributedToUnderlyingDenominator, SecuritiesDistribution.mmDistributedToUnderlyingNumerator,
						SecuritiesDistribution.mmMinimumHolding, Netting.mmNetQuantity, Position.mmNetQuantity);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryQuantity1.mmQuantity, TransactionQuantities2Choice.mmQuantity, TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount, TransactionQuantities2Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmUnit, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.mmOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmGroup1Or2Units,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt, com.tools20022.repository.entity.SecuritiesQuantity.mmLotBreakdown,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.mmEntry, com.tools20022.repository.entity.SecuritiesQuantity.mmCode, com.tools20022.repository.entity.SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.mmBoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.mmNewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.mmBackEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesEntitlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionEvent, com.tools20022.repository.entity.SecuritiesQuantity.mmBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmLottery,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedSubBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmAvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumDenominationDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumIncrementDebt, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmAllocation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAmount, com.tools20022.repository.entity.SecuritiesQuantity.mmDenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.mmNumeratorRatio,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.mmTaxVoucher, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.mmPreviousDayOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmLiquidity, com.tools20022.repository.entity.SecuritiesQuantity.mmRate,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityOrderParameters, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.mmUnavailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmMatchIncrementOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.mmPairoff, com.tools20022.repository.entity.SecuritiesQuantity.mmIssuance,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.mmQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSidePocket, com.tools20022.repository.entity.SecuritiesQuantity.mmNetting, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.mmPosition,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmFrontEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityBiddingConditions);
				derivationComponent_lazy = () -> Arrays.asList(OriginalAndCurrentQuantities1.mmObject(), FinancialInstrumentQuantityChoice.mmObject(), ProprietaryQuantity1.mmObject(), TransactionQuantities2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesQuantity.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getUnit() {
		return unit;
	}

	public SecuritiesQuantity setUnit(DecimalNumber unit) {
		this.unit = Objects.requireNonNull(unit);
		return this;
	}

	public Optional<SecuritiesTransfer> getSecuritiesTransfer() {
		return securitiesTransfer == null ? Optional.empty() : Optional.of(securitiesTransfer);
	}

	public SecuritiesQuantity setSecuritiesTransfer(SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
		return this;
	}

	public Security getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesQuantity setSecurityIdentification(Security securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public InvestmentFundOrder getOrder() {
		return order;
	}

	public SecuritiesQuantity setOrder(InvestmentFundOrder order) {
		this.order = Objects.requireNonNull(order);
		return this;
	}

	public UKTaxGroupUnitCode getGroup1Or2Units() {
		return group1Or2Units;
	}

	public SecuritiesQuantity setGroup1Or2Units(UKTaxGroupUnitCode group1Or2Units) {
		this.group1Or2Units = Objects.requireNonNull(group1Or2Units);
		return this;
	}

	public InvestmentFundOrderExecution getRelatedOrderExecution() {
		return relatedOrderExecution;
	}

	public SecuritiesQuantity setRelatedOrderExecution(InvestmentFundOrderExecution relatedOrderExecution) {
		this.relatedOrderExecution = Objects.requireNonNull(relatedOrderExecution);
		return this;
	}

	public Optional<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? Optional.empty() : Optional.of(securitiesSettlement);
	}

	public SecuritiesQuantity setSecuritiesSettlement(SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
		return this;
	}

	public Security getMinimumQuantityDebt() {
		return minimumQuantityDebt;
	}

	public SecuritiesQuantity setMinimumQuantityDebt(Security minimumQuantityDebt) {
		this.minimumQuantityDebt = Objects.requireNonNull(minimumQuantityDebt);
		return this;
	}

	public List<LotBreakdown> getLotBreakdown() {
		return lotBreakdown == null ? lotBreakdown = new ArrayList<>() : lotBreakdown;
	}

	public SecuritiesQuantity setLotBreakdown(List<LotBreakdown> lotBreakdown) {
		this.lotBreakdown = Objects.requireNonNull(lotBreakdown);
		return this;
	}

	public List<SecuritiesConversion> getMinimumExercisableQuantitySecuritiesConversion() {
		return minimumExercisableQuantitySecuritiesConversion == null ? minimumExercisableQuantitySecuritiesConversion = new ArrayList<>() : minimumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesQuantity setMinimumExercisableQuantitySecuritiesConversion(List<SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion) {
		this.minimumExercisableQuantitySecuritiesConversion = Objects.requireNonNull(minimumExercisableQuantitySecuritiesConversion);
		return this;
	}

	public Optional<SecuritiesConversion> getMinimumExercisableMultipleQuantitySecuritiesConversion() {
		return minimumExercisableMultipleQuantitySecuritiesConversion == null ? Optional.empty() : Optional.of(minimumExercisableMultipleQuantitySecuritiesConversion);
	}

	public SecuritiesQuantity setMinimumExercisableMultipleQuantitySecuritiesConversion(SecuritiesConversion minimumExercisableMultipleQuantitySecuritiesConversion) {
		this.minimumExercisableMultipleQuantitySecuritiesConversion = minimumExercisableMultipleQuantitySecuritiesConversion;
		return this;
	}

	public Optional<SecuritiesBalance> getAggregateQuantityBalance() {
		return aggregateQuantityBalance == null ? Optional.empty() : Optional.of(aggregateQuantityBalance);
	}

	public SecuritiesQuantity setAggregateQuantityBalance(SecuritiesBalance aggregateQuantityBalance) {
		this.aggregateQuantityBalance = aggregateQuantityBalance;
		return this;
	}

	public SecuritiesProceedsDefinition getSecuritiesProceedsDefinition() {
		return securitiesProceedsDefinition;
	}

	public SecuritiesQuantity setSecuritiesProceedsDefinition(SecuritiesProceedsDefinition securitiesProceedsDefinition) {
		this.securitiesProceedsDefinition = Objects.requireNonNull(securitiesProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getConditionalQuantitySecuritiesProceeds() {
		return conditionalQuantitySecuritiesProceeds;
	}

	public SecuritiesQuantity setConditionalQuantitySecuritiesProceeds(SecuritiesProceedsDefinition conditionalQuantitySecuritiesProceeds) {
		this.conditionalQuantitySecuritiesProceeds = Objects.requireNonNull(conditionalQuantitySecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getOverAndAboveQuantitySecuritiesProceeds() {
		return overAndAboveQuantitySecuritiesProceeds;
	}

	public SecuritiesQuantity setOverAndAboveQuantitySecuritiesProceeds(SecuritiesProceedsDefinition overAndAboveQuantitySecuritiesProceeds) {
		this.overAndAboveQuantitySecuritiesProceeds = Objects.requireNonNull(overAndAboveQuantitySecuritiesProceeds);
		return this;
	}

	public Optional<SecuritiesEntry> getEntry() {
		return entry == null ? Optional.empty() : Optional.of(entry);
	}

	public SecuritiesQuantity setEntry(SecuritiesEntry entry) {
		this.entry = entry;
		return this;
	}

	public QuantityCode getCode() {
		return code;
	}

	public SecuritiesQuantity setCode(QuantityCode code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public SecuritiesProceedsDefinition getExpectedQuantitySecuritiesProceeds() {
		return expectedQuantitySecuritiesProceeds;
	}

	public SecuritiesQuantity setExpectedQuantitySecuritiesProceeds(SecuritiesProceedsDefinition expectedQuantitySecuritiesProceeds) {
		this.expectedQuantitySecuritiesProceeds = Objects.requireNonNull(expectedQuantitySecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getStatusRelatedSecuritiesProceeds() {
		return statusRelatedSecuritiesProceeds;
	}

	public SecuritiesQuantity setStatusRelatedSecuritiesProceeds(SecuritiesProceedsDefinition statusRelatedSecuritiesProceeds) {
		this.statusRelatedSecuritiesProceeds = Objects.requireNonNull(statusRelatedSecuritiesProceeds);
		return this;
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public SecuritiesQuantity setCorporateActionDistribution(CorporateActionDistribution corporateActionDistribution) {
		this.corporateActionDistribution = Objects.requireNonNull(corporateActionDistribution);
		return this;
	}

	public CorporateActionEvent getRelatedEventForFractionalQuantity() {
		return relatedEventForFractionalQuantity;
	}

	public SecuritiesQuantity setRelatedEventForFractionalQuantity(CorporateActionEvent relatedEventForFractionalQuantity) {
		this.relatedEventForFractionalQuantity = Objects.requireNonNull(relatedEventForFractionalQuantity);
		return this;
	}

	public List<SecuritiesConversion> getMaximumExercisableQuantitySecuritiesConversion() {
		return maximumExercisableQuantitySecuritiesConversion == null ? maximumExercisableQuantitySecuritiesConversion = new ArrayList<>() : maximumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesQuantity setMaximumExercisableQuantitySecuritiesConversion(List<SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion) {
		this.maximumExercisableQuantitySecuritiesConversion = Objects.requireNonNull(maximumExercisableQuantitySecuritiesConversion);
		return this;
	}

	public SecuritiesProceedsDefinition getBoardLotSecuritiesProceeds() {
		return boardLotSecuritiesProceeds;
	}

	public SecuritiesQuantity setBoardLotSecuritiesProceeds(SecuritiesProceedsDefinition boardLotSecuritiesProceeds) {
		this.boardLotSecuritiesProceeds = Objects.requireNonNull(boardLotSecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getNewDenominationSecuritiesProceeds() {
		return newDenominationSecuritiesProceeds;
	}

	public SecuritiesQuantity setNewDenominationSecuritiesProceeds(SecuritiesProceedsDefinition newDenominationSecuritiesProceeds) {
		this.newDenominationSecuritiesProceeds = Objects.requireNonNull(newDenominationSecuritiesProceeds);
		return this;
	}

	public BiddingConditions getBackEndOddLotBiddingConditions() {
		return backEndOddLotBiddingConditions;
	}

	public SecuritiesQuantity setBackEndOddLotBiddingConditions(BiddingConditions backEndOddLotBiddingConditions) {
		this.backEndOddLotBiddingConditions = Objects.requireNonNull(backEndOddLotBiddingConditions);
		return this;
	}

	public CorporateActionSecuritiesEntitlement getSecuritiesEntitlement() {
		return securitiesEntitlement;
	}

	public SecuritiesQuantity setSecuritiesEntitlement(CorporateActionSecuritiesEntitlement securitiesEntitlement) {
		this.securitiesEntitlement = Objects.requireNonNull(securitiesEntitlement);
		return this;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public SecuritiesQuantity setCorporateActionEvent(CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = Objects.requireNonNull(corporateActionEvent);
		return this;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public SecuritiesQuantity setBiddingConditions(BiddingConditions biddingConditions) {
		this.biddingConditions = Objects.requireNonNull(biddingConditions);
		return this;
	}

	public Lottery getLottery() {
		return lottery;
	}

	public SecuritiesQuantity setLottery(Lottery lottery) {
		this.lottery = Objects.requireNonNull(lottery);
		return this;
	}

	public Optional<SecuritiesBalance> getRelatedSubBalance() {
		return relatedSubBalance == null ? Optional.empty() : Optional.of(relatedSubBalance);
	}

	public SecuritiesQuantity setRelatedSubBalance(SecuritiesBalance relatedSubBalance) {
		this.relatedSubBalance = relatedSubBalance;
		return this;
	}

	public Optional<SecuritiesBalance> getAvailableQuantityBalance() {
		return availableQuantityBalance == null ? Optional.empty() : Optional.of(availableQuantityBalance);
	}

	public SecuritiesQuantity setAvailableQuantityBalance(SecuritiesBalance availableQuantityBalance) {
		this.availableQuantityBalance = availableQuantityBalance;
		return this;
	}

	public Optional<SecuritiesTrade> getTrade() {
		return trade == null ? Optional.empty() : Optional.of(trade);
	}

	public SecuritiesQuantity setTrade(SecuritiesTrade trade) {
		this.trade = trade;
		return this;
	}

	public SecuritiesConversion getRatioDenominatorSecuritiesConversion() {
		return ratioDenominatorSecuritiesConversion;
	}

	public SecuritiesQuantity setRatioDenominatorSecuritiesConversion(SecuritiesConversion ratioDenominatorSecuritiesConversion) {
		this.ratioDenominatorSecuritiesConversion = Objects.requireNonNull(ratioDenominatorSecuritiesConversion);
		return this;
	}

	public SecuritiesConversion getRatioNumeratorSecuritiesConversion() {
		return ratioNumeratorSecuritiesConversion;
	}

	public SecuritiesQuantity setRatioNumeratorSecuritiesConversion(SecuritiesConversion ratioNumeratorSecuritiesConversion) {
		this.ratioNumeratorSecuritiesConversion = Objects.requireNonNull(ratioNumeratorSecuritiesConversion);
		return this;
	}

	public TradingMarket getMinimumTradedQuantityMarket() {
		return minimumTradedQuantityMarket;
	}

	public SecuritiesQuantity setMinimumTradedQuantityMarket(TradingMarket minimumTradedQuantityMarket) {
		this.minimumTradedQuantityMarket = Objects.requireNonNull(minimumTradedQuantityMarket);
		return this;
	}

	public Debt getMinimumDenominationDebt() {
		return minimumDenominationDebt;
	}

	public SecuritiesQuantity setMinimumDenominationDebt(Debt minimumDenominationDebt) {
		this.minimumDenominationDebt = Objects.requireNonNull(minimumDenominationDebt);
		return this;
	}

	public Debt getMinimumIncrementDebt() {
		return minimumIncrementDebt;
	}

	public SecuritiesQuantity setMinimumIncrementDebt(Debt minimumIncrementDebt) {
		this.minimumIncrementDebt = Objects.requireNonNull(minimumIncrementDebt);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesQuantity setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<Allocation> getAllocation() {
		return allocation == null ? Optional.empty() : Optional.of(allocation);
	}

	public SecuritiesQuantity setAllocation(Allocation allocation) {
		this.allocation = allocation;
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public SecuritiesQuantity setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public UnderlyingRatio getDenominatorRatio() {
		return denominatorRatio;
	}

	public SecuritiesQuantity setDenominatorRatio(UnderlyingRatio denominatorRatio) {
		this.denominatorRatio = Objects.requireNonNull(denominatorRatio);
		return this;
	}

	public UnderlyingRatio getNumeratorRatio() {
		return numeratorRatio;
	}

	public SecuritiesQuantity setNumeratorRatio(UnderlyingRatio numeratorRatio) {
		this.numeratorRatio = Objects.requireNonNull(numeratorRatio);
		return this;
	}

	public Optional<SecuritiesTradeExecution> getSecuritiesTradeExecution() {
		return securitiesTradeExecution == null ? Optional.empty() : Optional.of(securitiesTradeExecution);
	}

	public SecuritiesQuantity setSecuritiesTradeExecution(SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
		return this;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public SecuritiesQuantity setRelatedCorporateActionEvent(CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = Objects.requireNonNull(relatedCorporateActionEvent);
		return this;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public SecuritiesQuantity setCorporateActionElection(CorporateActionElection corporateActionElection) {
		this.corporateActionElection = Objects.requireNonNull(corporateActionElection);
		return this;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public SecuritiesQuantity setTaxVoucher(TaxVoucher taxVoucher) {
		this.taxVoucher = Objects.requireNonNull(taxVoucher);
		return this;
	}

	public Optional<BuyIn> getRelatedBuyIn() {
		return relatedBuyIn == null ? Optional.empty() : Optional.of(relatedBuyIn);
	}

	public SecuritiesQuantity setRelatedBuyIn(BuyIn relatedBuyIn) {
		this.relatedBuyIn = relatedBuyIn;
		return this;
	}

	public Optional<SecuritiesOrder> getPreviousDayOrder() {
		return previousDayOrder == null ? Optional.empty() : Optional.of(previousDayOrder);
	}

	public SecuritiesQuantity setPreviousDayOrder(SecuritiesOrder previousDayOrder) {
		this.previousDayOrder = previousDayOrder;
		return this;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity == null ? liquidity = new ArrayList<>() : liquidity;
	}

	public SecuritiesQuantity setLiquidity(List<Liquidity> liquidity) {
		this.liquidity = Objects.requireNonNull(liquidity);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public SecuritiesQuantity setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public List<SecuritiesOrderParameters> getMinimumQuantityOrderParameters() {
		return minimumQuantityOrderParameters == null ? minimumQuantityOrderParameters = new ArrayList<>() : minimumQuantityOrderParameters;
	}

	public SecuritiesQuantity setMinimumQuantityOrderParameters(List<SecuritiesOrderParameters> minimumQuantityOrderParameters) {
		this.minimumQuantityOrderParameters = Objects.requireNonNull(minimumQuantityOrderParameters);
		return this;
	}

	public Optional<Quote> getMaximumQuantityRelatedQuote() {
		return maximumQuantityRelatedQuote == null ? Optional.empty() : Optional.of(maximumQuantityRelatedQuote);
	}

	public SecuritiesQuantity setMaximumQuantityRelatedQuote(Quote maximumQuantityRelatedQuote) {
		this.maximumQuantityRelatedQuote = maximumQuantityRelatedQuote;
		return this;
	}

	public Optional<SecuritiesBalance> getUnavailableQuantityBalance() {
		return unavailableQuantityBalance == null ? Optional.empty() : Optional.of(unavailableQuantityBalance);
	}

	public SecuritiesQuantity setUnavailableQuantityBalance(SecuritiesBalance unavailableQuantityBalance) {
		this.unavailableQuantityBalance = unavailableQuantityBalance;
		return this;
	}

	public Optional<SecuritiesOrderParameters> getMatchIncrementOrderParameters() {
		return matchIncrementOrderParameters == null ? Optional.empty() : Optional.of(matchIncrementOrderParameters);
	}

	public SecuritiesQuantity setMatchIncrementOrderParameters(SecuritiesOrderParameters matchIncrementOrderParameters) {
		this.matchIncrementOrderParameters = matchIncrementOrderParameters;
		return this;
	}

	public Issuance getRelatedIssuance() {
		return relatedIssuance;
	}

	public SecuritiesQuantity setRelatedIssuance(Issuance relatedIssuance) {
		this.relatedIssuance = Objects.requireNonNull(relatedIssuance);
		return this;
	}

	public PairOff getPairoff() {
		return pairoff;
	}

	public SecuritiesQuantity setPairoff(PairOff pairoff) {
		this.pairoff = Objects.requireNonNull(pairoff);
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public SecuritiesQuantity setIssuance(Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingDenominatorDistributionInformation() {
		return intermediateToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingDenominatorDistributionInformation(SecuritiesAndCashDistribution intermediateToUnderlyingDenominatorDistributionInformation) {
		this.intermediateToUnderlyingDenominatorDistributionInformation = Objects.requireNonNull(intermediateToUnderlyingDenominatorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMaximumHoldingDistributionInformation() {
		return maximumHoldingDistributionInformation;
	}

	public SecuritiesQuantity setMaximumHoldingDistributionInformation(SecuritiesAndCashDistribution maximumHoldingDistributionInformation) {
		this.maximumHoldingDistributionInformation = Objects.requireNonNull(maximumHoldingDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMaximumExercisableQuantityDistributionInformation() {
		return maximumExercisableQuantityDistributionInformation;
	}

	public SecuritiesQuantity setMaximumExercisableQuantityDistributionInformation(SecuritiesAndCashDistribution maximumExercisableQuantityDistributionInformation) {
		this.maximumExercisableQuantityDistributionInformation = Objects.requireNonNull(maximumExercisableQuantityDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMinimumExercisableQuantityDistributionInformation() {
		return minimumExercisableQuantityDistributionInformation;
	}

	public SecuritiesQuantity setMinimumExercisableQuantityDistributionInformation(SecuritiesAndCashDistribution minimumExercisableQuantityDistributionInformation) {
		this.minimumExercisableQuantityDistributionInformation = Objects.requireNonNull(minimumExercisableQuantityDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingDenominatorDistributionInformation() {
		return distributedToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesQuantity setDistributedToUnderlyingDenominatorDistributionInformation(SecuritiesAndCashDistribution distributedToUnderlyingDenominatorDistributionInformation) {
		this.distributedToUnderlyingDenominatorDistributionInformation = Objects.requireNonNull(distributedToUnderlyingDenominatorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingNumeratorDistributionInformation() {
		return intermediateToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingNumeratorDistributionInformation(SecuritiesAndCashDistribution intermediateToUnderlyingNumeratorDistributionInformation) {
		this.intermediateToUnderlyingNumeratorDistributionInformation = Objects.requireNonNull(intermediateToUnderlyingNumeratorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMinimumHoldingDistributionInformation() {
		return minimumHoldingDistributionInformation;
	}

	public SecuritiesQuantity setMinimumHoldingDistributionInformation(SecuritiesAndCashDistribution minimumHoldingDistributionInformation) {
		this.minimumHoldingDistributionInformation = Objects.requireNonNull(minimumHoldingDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingNumeratorDistributionInformation() {
		return distributedToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesQuantity setDistributedToUnderlyingNumeratorDistributionInformation(SecuritiesAndCashDistribution distributedToUnderlyingNumeratorDistributionInformation) {
		this.distributedToUnderlyingNumeratorDistributionInformation = Objects.requireNonNull(distributedToUnderlyingNumeratorDistributionInformation);
		return this;
	}

	public SecuritiesDistribution getMaximumHoldingRelatedSecuritiesDistribution() {
		return maximumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setMaximumHoldingRelatedSecuritiesDistribution(SecuritiesDistribution maximumHoldingRelatedSecuritiesDistribution) {
		this.maximumHoldingRelatedSecuritiesDistribution = Objects.requireNonNull(maximumHoldingRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution(SecuritiesDistribution intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = Objects.requireNonNull(intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution(SecuritiesDistribution intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = Objects.requireNonNull(intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution(SecuritiesDistribution distributedToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingDenominatorRelatedSecuritiesDistribution = Objects.requireNonNull(distributedToUnderlyingDenominatorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution(SecuritiesDistribution distributedToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingNumeratorRelatedSecuritiesDistribution = Objects.requireNonNull(distributedToUnderlyingNumeratorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getMinimumHoldingRelatedSecuritiesDistribution() {
		return minimumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setMinimumHoldingRelatedSecuritiesDistribution(SecuritiesDistribution minimumHoldingRelatedSecuritiesDistribution) {
		this.minimumHoldingRelatedSecuritiesDistribution = Objects.requireNonNull(minimumHoldingRelatedSecuritiesDistribution);
		return this;
	}

	public TradingMarket getMaximumTradedQuantityMarket() {
		return maximumTradedQuantityMarket;
	}

	public SecuritiesQuantity setMaximumTradedQuantityMarket(TradingMarket maximumTradedQuantityMarket) {
		this.maximumTradedQuantityMarket = Objects.requireNonNull(maximumTradedQuantityMarket);
		return this;
	}

	public Quote getQuantityRelatedQuote() {
		return quantityRelatedQuote;
	}

	public SecuritiesQuantity setQuantityRelatedQuote(Quote quantityRelatedQuote) {
		this.quantityRelatedQuote = Objects.requireNonNull(quantityRelatedQuote);
		return this;
	}

	public Quote getMinimumQuantityRelatedQuote() {
		return minimumQuantityRelatedQuote;
	}

	public SecuritiesQuantity setMinimumQuantityRelatedQuote(Quote minimumQuantityRelatedQuote) {
		this.minimumQuantityRelatedQuote = Objects.requireNonNull(minimumQuantityRelatedQuote);
		return this;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public SecuritiesQuantity setNetAssetValueCalculation(NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = Objects.requireNonNull(netAssetValueCalculation);
		return this;
	}

	public SidePocket getSidePocket() {
		return sidePocket;
	}

	public SecuritiesQuantity setSidePocket(SidePocket sidePocket) {
		this.sidePocket = Objects.requireNonNull(sidePocket);
		return this;
	}

	public Netting getNetting() {
		return netting;
	}

	public SecuritiesQuantity setNetting(Netting netting) {
		this.netting = Objects.requireNonNull(netting);
		return this;
	}

	public SecuritiesOrderStatus getRelatedOrderStatus() {
		return relatedOrderStatus;
	}

	public SecuritiesQuantity setRelatedOrderStatus(SecuritiesOrderStatus relatedOrderStatus) {
		this.relatedOrderStatus = Objects.requireNonNull(relatedOrderStatus);
		return this;
	}

	public SecuritiesOrderStatus getSecuritiesOrderStatus() {
		return securitiesOrderStatus;
	}

	public SecuritiesQuantity setSecuritiesOrderStatus(SecuritiesOrderStatus securitiesOrderStatus) {
		this.securitiesOrderStatus = Objects.requireNonNull(securitiesOrderStatus);
		return this;
	}

	public SecuritiesSettlement getRelatedTurnaroundSettlement() {
		return relatedTurnaroundSettlement;
	}

	public SecuritiesQuantity setRelatedTurnaroundSettlement(SecuritiesSettlement relatedTurnaroundSettlement) {
		this.relatedTurnaroundSettlement = Objects.requireNonNull(relatedTurnaroundSettlement);
		return this;
	}

	public FundsCashFlow getRelatedCashFlow() {
		return relatedCashFlow;
	}

	public SecuritiesQuantity setRelatedCashFlow(FundsCashFlow relatedCashFlow) {
		this.relatedCashFlow = Objects.requireNonNull(relatedCashFlow);
		return this;
	}

	public Position getPosition() {
		return position;
	}

	public SecuritiesQuantity setPosition(Position position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public BiddingConditions getMaximumQuantityBiddingConditions() {
		return maximumQuantityBiddingConditions;
	}

	public SecuritiesQuantity setMaximumQuantityBiddingConditions(BiddingConditions maximumQuantityBiddingConditions) {
		this.maximumQuantityBiddingConditions = Objects.requireNonNull(maximumQuantityBiddingConditions);
		return this;
	}

	public BiddingConditions getFrontEndOddLotBiddingConditions() {
		return frontEndOddLotBiddingConditions;
	}

	public SecuritiesQuantity setFrontEndOddLotBiddingConditions(BiddingConditions frontEndOddLotBiddingConditions) {
		this.frontEndOddLotBiddingConditions = Objects.requireNonNull(frontEndOddLotBiddingConditions);
		return this;
	}

	public BiddingConditions getMinimumQuantityBiddingConditions() {
		return minimumQuantityBiddingConditions;
	}

	public SecuritiesQuantity setMinimumQuantityBiddingConditions(BiddingConditions minimumQuantityBiddingConditions) {
		this.minimumQuantityBiddingConditions = Objects.requireNonNull(minimumQuantityBiddingConditions);
		return this;
	}
}