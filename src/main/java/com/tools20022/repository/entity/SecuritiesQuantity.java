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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalAndCurrentQuantities1;
import com.tools20022.repository.msg.ProprietaryQuantity1;
import java.lang.reflect.Method;
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
	public static final MMBusinessAttribute mmUnit = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesQuantity.class.getMethod("getUnit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecurityIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
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
	public static final MMBusinessAttribute mmGroup1Or2Units = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesQuantity.class.getMethod("getGroup1Or2Units", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmRelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LotBreakdown> lotBreakdown;
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
	public static final MMBusinessAssociationEnd mmLotBreakdown = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion;
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
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
	public static final MMBusinessAssociationEnd mmAggregateQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmConditionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmOverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmFinancialInstrumentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
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
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesQuantity.class.getMethod("getCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmQuantityToReceive;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmStatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmStatusQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmPostingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedEventForFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion;
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
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
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
	public static final MMBusinessAssociationEnd mmBoardLotSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmNewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
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
	public static final MMBusinessAssociationEnd mmBackEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecuritiesEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmObject();
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
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
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
	public static final MMBusinessAssociationEnd mmBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmBaseDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
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
	public static final MMBusinessAssociationEnd mmLottery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.mmIncrementalDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedSubBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
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
	public static final MMBusinessAssociationEnd mmAvailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
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
	public static final MMBusinessAssociationEnd mmRatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
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
	public static final MMBusinessAssociationEnd mmRatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumDenominationDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmMinimumDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumIncrementDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmMinimumIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
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
	public static final MMBusinessAssociationEnd mmAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmAllocatedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesQuantity.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmDenominatorRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
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
	public static final MMBusinessAssociationEnd mmNumeratorRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmExecutedTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
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
	public static final MMBusinessAssociationEnd mmCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
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
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmSecuritiesCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
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
	public static final MMBusinessAssociationEnd mmPreviousDayOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Liquidity> liquidity;
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
	public static final MMBusinessAssociationEnd mmLiquidity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesQuantity.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderParameters> minimumQuantityOrderParameters;
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityOrderParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
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
	public static final MMBusinessAssociationEnd mmUnavailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
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
	public static final MMBusinessAssociationEnd mmMatchIncrementOrderParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmMatchIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmMinimum;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
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
	public static final MMBusinessAssociationEnd mmPairoff = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmPairedOffQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssueNominalAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
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
	public static final MMBusinessAssociationEnd mmQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
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
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
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
	public static final MMBusinessAssociationEnd mmSidePocket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.mmSidePocketQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
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
	public static final MMBusinessAssociationEnd mmNetting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedTurnaroundSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
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
	public static final MMBusinessAssociationEnd mmPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
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
	public static final MMBusinessAssociationEnd mmMaximumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
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
	public static final MMBusinessAssociationEnd mmFrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMinimumQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesQuantity, com.tools20022.repository.entity.Security.mmMinimumQuantity,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity, com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity, com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity, com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity, com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.mmFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesTradeExecution.mmExecutedTradeQuantity,
						com.tools20022.repository.entity.Debt.mmMinimumDenomination, com.tools20022.repository.entity.Debt.mmMinimumIncrement, com.tools20022.repository.entity.Issuance.mmIssueNominalAmount,
						com.tools20022.repository.entity.Issuance.mmMinimum, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator, com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator,
						com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmConditionalQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmQuantityToReceive, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmStatusQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionElection.mmQuantity, com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.mmMaximumQuantity,
						com.tools20022.repository.entity.BiddingConditions.mmMinimumQuantitySought, com.tools20022.repository.entity.BiddingConditions.mmBaseDenomination, com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding,
						com.tools20022.repository.entity.CorporateActionDistribution.mmPostingQuantity, com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity,
						com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity,
						com.tools20022.repository.entity.Allocation.mmAllocatedQuantity, com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityDenominator,
						com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityNumerator, com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity,
						com.tools20022.repository.entity.BuyIn.mmSecuritiesCompensation, com.tools20022.repository.entity.SidePocket.mmSidePocketQuantity, com.tools20022.repository.entity.Liquidity.mmQuantity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmMinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.mmMatchIncrement, com.tools20022.repository.entity.Quote.mmMaximumQuantity,
						com.tools20022.repository.entity.Quote.mmQuantity, com.tools20022.repository.entity.Quote.mmMinimumQuantity, com.tools20022.repository.entity.PairOff.mmPairedOffQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmMaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.mmMinimumHolding,
						com.tools20022.repository.entity.Netting.mmNetQuantity, com.tools20022.repository.entity.Position.mmNetQuantity);
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

	public SecuritiesQuantity setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
		return this;
	}

	public Security getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesQuantity setSecurityIdentification(com.tools20022.repository.entity.Security securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public InvestmentFundOrder getOrder() {
		return order;
	}

	public SecuritiesQuantity setOrder(com.tools20022.repository.entity.InvestmentFundOrder order) {
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

	public SecuritiesQuantity setRelatedOrderExecution(com.tools20022.repository.entity.InvestmentFundOrderExecution relatedOrderExecution) {
		this.relatedOrderExecution = Objects.requireNonNull(relatedOrderExecution);
		return this;
	}

	public Optional<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? Optional.empty() : Optional.of(securitiesSettlement);
	}

	public SecuritiesQuantity setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
		return this;
	}

	public Security getMinimumQuantityDebt() {
		return minimumQuantityDebt;
	}

	public SecuritiesQuantity setMinimumQuantityDebt(com.tools20022.repository.entity.Security minimumQuantityDebt) {
		this.minimumQuantityDebt = Objects.requireNonNull(minimumQuantityDebt);
		return this;
	}

	public List<LotBreakdown> getLotBreakdown() {
		return lotBreakdown == null ? lotBreakdown = new ArrayList<>() : lotBreakdown;
	}

	public SecuritiesQuantity setLotBreakdown(List<com.tools20022.repository.entity.LotBreakdown> lotBreakdown) {
		this.lotBreakdown = Objects.requireNonNull(lotBreakdown);
		return this;
	}

	public List<SecuritiesConversion> getMinimumExercisableQuantitySecuritiesConversion() {
		return minimumExercisableQuantitySecuritiesConversion == null ? minimumExercisableQuantitySecuritiesConversion = new ArrayList<>() : minimumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesQuantity setMinimumExercisableQuantitySecuritiesConversion(List<com.tools20022.repository.entity.SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion) {
		this.minimumExercisableQuantitySecuritiesConversion = Objects.requireNonNull(minimumExercisableQuantitySecuritiesConversion);
		return this;
	}

	public Optional<SecuritiesConversion> getMinimumExercisableMultipleQuantitySecuritiesConversion() {
		return minimumExercisableMultipleQuantitySecuritiesConversion == null ? Optional.empty() : Optional.of(minimumExercisableMultipleQuantitySecuritiesConversion);
	}

	public SecuritiesQuantity setMinimumExercisableMultipleQuantitySecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion minimumExercisableMultipleQuantitySecuritiesConversion) {
		this.minimumExercisableMultipleQuantitySecuritiesConversion = minimumExercisableMultipleQuantitySecuritiesConversion;
		return this;
	}

	public Optional<SecuritiesBalance> getAggregateQuantityBalance() {
		return aggregateQuantityBalance == null ? Optional.empty() : Optional.of(aggregateQuantityBalance);
	}

	public SecuritiesQuantity setAggregateQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance aggregateQuantityBalance) {
		this.aggregateQuantityBalance = aggregateQuantityBalance;
		return this;
	}

	public SecuritiesProceedsDefinition getSecuritiesProceedsDefinition() {
		return securitiesProceedsDefinition;
	}

	public SecuritiesQuantity setSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition securitiesProceedsDefinition) {
		this.securitiesProceedsDefinition = Objects.requireNonNull(securitiesProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getConditionalQuantitySecuritiesProceeds() {
		return conditionalQuantitySecuritiesProceeds;
	}

	public SecuritiesQuantity setConditionalQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition conditionalQuantitySecuritiesProceeds) {
		this.conditionalQuantitySecuritiesProceeds = Objects.requireNonNull(conditionalQuantitySecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getOverAndAboveQuantitySecuritiesProceeds() {
		return overAndAboveQuantitySecuritiesProceeds;
	}

	public SecuritiesQuantity setOverAndAboveQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition overAndAboveQuantitySecuritiesProceeds) {
		this.overAndAboveQuantitySecuritiesProceeds = Objects.requireNonNull(overAndAboveQuantitySecuritiesProceeds);
		return this;
	}

	public Optional<SecuritiesEntry> getEntry() {
		return entry == null ? Optional.empty() : Optional.of(entry);
	}

	public SecuritiesQuantity setEntry(com.tools20022.repository.entity.SecuritiesEntry entry) {
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

	public SecuritiesQuantity setExpectedQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition expectedQuantitySecuritiesProceeds) {
		this.expectedQuantitySecuritiesProceeds = Objects.requireNonNull(expectedQuantitySecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getStatusRelatedSecuritiesProceeds() {
		return statusRelatedSecuritiesProceeds;
	}

	public SecuritiesQuantity setStatusRelatedSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition statusRelatedSecuritiesProceeds) {
		this.statusRelatedSecuritiesProceeds = Objects.requireNonNull(statusRelatedSecuritiesProceeds);
		return this;
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public SecuritiesQuantity setCorporateActionDistribution(com.tools20022.repository.entity.CorporateActionDistribution corporateActionDistribution) {
		this.corporateActionDistribution = Objects.requireNonNull(corporateActionDistribution);
		return this;
	}

	public CorporateActionEvent getRelatedEventForFractionalQuantity() {
		return relatedEventForFractionalQuantity;
	}

	public SecuritiesQuantity setRelatedEventForFractionalQuantity(com.tools20022.repository.entity.CorporateActionEvent relatedEventForFractionalQuantity) {
		this.relatedEventForFractionalQuantity = Objects.requireNonNull(relatedEventForFractionalQuantity);
		return this;
	}

	public List<SecuritiesConversion> getMaximumExercisableQuantitySecuritiesConversion() {
		return maximumExercisableQuantitySecuritiesConversion == null ? maximumExercisableQuantitySecuritiesConversion = new ArrayList<>() : maximumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesQuantity setMaximumExercisableQuantitySecuritiesConversion(List<com.tools20022.repository.entity.SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion) {
		this.maximumExercisableQuantitySecuritiesConversion = Objects.requireNonNull(maximumExercisableQuantitySecuritiesConversion);
		return this;
	}

	public SecuritiesProceedsDefinition getBoardLotSecuritiesProceeds() {
		return boardLotSecuritiesProceeds;
	}

	public SecuritiesQuantity setBoardLotSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition boardLotSecuritiesProceeds) {
		this.boardLotSecuritiesProceeds = Objects.requireNonNull(boardLotSecuritiesProceeds);
		return this;
	}

	public SecuritiesProceedsDefinition getNewDenominationSecuritiesProceeds() {
		return newDenominationSecuritiesProceeds;
	}

	public SecuritiesQuantity setNewDenominationSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition newDenominationSecuritiesProceeds) {
		this.newDenominationSecuritiesProceeds = Objects.requireNonNull(newDenominationSecuritiesProceeds);
		return this;
	}

	public BiddingConditions getBackEndOddLotBiddingConditions() {
		return backEndOddLotBiddingConditions;
	}

	public SecuritiesQuantity setBackEndOddLotBiddingConditions(com.tools20022.repository.entity.BiddingConditions backEndOddLotBiddingConditions) {
		this.backEndOddLotBiddingConditions = Objects.requireNonNull(backEndOddLotBiddingConditions);
		return this;
	}

	public CorporateActionSecuritiesEntitlement getSecuritiesEntitlement() {
		return securitiesEntitlement;
	}

	public SecuritiesQuantity setSecuritiesEntitlement(com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement securitiesEntitlement) {
		this.securitiesEntitlement = Objects.requireNonNull(securitiesEntitlement);
		return this;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public SecuritiesQuantity setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = Objects.requireNonNull(corporateActionEvent);
		return this;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public SecuritiesQuantity setBiddingConditions(com.tools20022.repository.entity.BiddingConditions biddingConditions) {
		this.biddingConditions = Objects.requireNonNull(biddingConditions);
		return this;
	}

	public Lottery getLottery() {
		return lottery;
	}

	public SecuritiesQuantity setLottery(com.tools20022.repository.entity.Lottery lottery) {
		this.lottery = Objects.requireNonNull(lottery);
		return this;
	}

	public Optional<SecuritiesBalance> getRelatedSubBalance() {
		return relatedSubBalance == null ? Optional.empty() : Optional.of(relatedSubBalance);
	}

	public SecuritiesQuantity setRelatedSubBalance(com.tools20022.repository.entity.SecuritiesBalance relatedSubBalance) {
		this.relatedSubBalance = relatedSubBalance;
		return this;
	}

	public Optional<SecuritiesBalance> getAvailableQuantityBalance() {
		return availableQuantityBalance == null ? Optional.empty() : Optional.of(availableQuantityBalance);
	}

	public SecuritiesQuantity setAvailableQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance availableQuantityBalance) {
		this.availableQuantityBalance = availableQuantityBalance;
		return this;
	}

	public Optional<SecuritiesTrade> getTrade() {
		return trade == null ? Optional.empty() : Optional.of(trade);
	}

	public SecuritiesQuantity setTrade(com.tools20022.repository.entity.SecuritiesTrade trade) {
		this.trade = trade;
		return this;
	}

	public SecuritiesConversion getRatioDenominatorSecuritiesConversion() {
		return ratioDenominatorSecuritiesConversion;
	}

	public SecuritiesQuantity setRatioDenominatorSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion ratioDenominatorSecuritiesConversion) {
		this.ratioDenominatorSecuritiesConversion = Objects.requireNonNull(ratioDenominatorSecuritiesConversion);
		return this;
	}

	public SecuritiesConversion getRatioNumeratorSecuritiesConversion() {
		return ratioNumeratorSecuritiesConversion;
	}

	public SecuritiesQuantity setRatioNumeratorSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion ratioNumeratorSecuritiesConversion) {
		this.ratioNumeratorSecuritiesConversion = Objects.requireNonNull(ratioNumeratorSecuritiesConversion);
		return this;
	}

	public TradingMarket getMinimumTradedQuantityMarket() {
		return minimumTradedQuantityMarket;
	}

	public SecuritiesQuantity setMinimumTradedQuantityMarket(com.tools20022.repository.entity.TradingMarket minimumTradedQuantityMarket) {
		this.minimumTradedQuantityMarket = Objects.requireNonNull(minimumTradedQuantityMarket);
		return this;
	}

	public Debt getMinimumDenominationDebt() {
		return minimumDenominationDebt;
	}

	public SecuritiesQuantity setMinimumDenominationDebt(com.tools20022.repository.entity.Debt minimumDenominationDebt) {
		this.minimumDenominationDebt = Objects.requireNonNull(minimumDenominationDebt);
		return this;
	}

	public Debt getMinimumIncrementDebt() {
		return minimumIncrementDebt;
	}

	public SecuritiesQuantity setMinimumIncrementDebt(com.tools20022.repository.entity.Debt minimumIncrementDebt) {
		this.minimumIncrementDebt = Objects.requireNonNull(minimumIncrementDebt);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesQuantity setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<Allocation> getAllocation() {
		return allocation == null ? Optional.empty() : Optional.of(allocation);
	}

	public SecuritiesQuantity setAllocation(com.tools20022.repository.entity.Allocation allocation) {
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

	public SecuritiesQuantity setDenominatorRatio(com.tools20022.repository.entity.UnderlyingRatio denominatorRatio) {
		this.denominatorRatio = Objects.requireNonNull(denominatorRatio);
		return this;
	}

	public UnderlyingRatio getNumeratorRatio() {
		return numeratorRatio;
	}

	public SecuritiesQuantity setNumeratorRatio(com.tools20022.repository.entity.UnderlyingRatio numeratorRatio) {
		this.numeratorRatio = Objects.requireNonNull(numeratorRatio);
		return this;
	}

	public Optional<SecuritiesTradeExecution> getSecuritiesTradeExecution() {
		return securitiesTradeExecution == null ? Optional.empty() : Optional.of(securitiesTradeExecution);
	}

	public SecuritiesQuantity setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
		return this;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public SecuritiesQuantity setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = Objects.requireNonNull(relatedCorporateActionEvent);
		return this;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public SecuritiesQuantity setCorporateActionElection(com.tools20022.repository.entity.CorporateActionElection corporateActionElection) {
		this.corporateActionElection = Objects.requireNonNull(corporateActionElection);
		return this;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public SecuritiesQuantity setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = Objects.requireNonNull(taxVoucher);
		return this;
	}

	public Optional<BuyIn> getRelatedBuyIn() {
		return relatedBuyIn == null ? Optional.empty() : Optional.of(relatedBuyIn);
	}

	public SecuritiesQuantity setRelatedBuyIn(com.tools20022.repository.entity.BuyIn relatedBuyIn) {
		this.relatedBuyIn = relatedBuyIn;
		return this;
	}

	public Optional<SecuritiesOrder> getPreviousDayOrder() {
		return previousDayOrder == null ? Optional.empty() : Optional.of(previousDayOrder);
	}

	public SecuritiesQuantity setPreviousDayOrder(com.tools20022.repository.entity.SecuritiesOrder previousDayOrder) {
		this.previousDayOrder = previousDayOrder;
		return this;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity == null ? liquidity = new ArrayList<>() : liquidity;
	}

	public SecuritiesQuantity setLiquidity(List<com.tools20022.repository.entity.Liquidity> liquidity) {
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

	public SecuritiesQuantity setMinimumQuantityOrderParameters(List<com.tools20022.repository.entity.SecuritiesOrderParameters> minimumQuantityOrderParameters) {
		this.minimumQuantityOrderParameters = Objects.requireNonNull(minimumQuantityOrderParameters);
		return this;
	}

	public Optional<Quote> getMaximumQuantityRelatedQuote() {
		return maximumQuantityRelatedQuote == null ? Optional.empty() : Optional.of(maximumQuantityRelatedQuote);
	}

	public SecuritiesQuantity setMaximumQuantityRelatedQuote(com.tools20022.repository.entity.Quote maximumQuantityRelatedQuote) {
		this.maximumQuantityRelatedQuote = maximumQuantityRelatedQuote;
		return this;
	}

	public Optional<SecuritiesBalance> getUnavailableQuantityBalance() {
		return unavailableQuantityBalance == null ? Optional.empty() : Optional.of(unavailableQuantityBalance);
	}

	public SecuritiesQuantity setUnavailableQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance unavailableQuantityBalance) {
		this.unavailableQuantityBalance = unavailableQuantityBalance;
		return this;
	}

	public Optional<SecuritiesOrderParameters> getMatchIncrementOrderParameters() {
		return matchIncrementOrderParameters == null ? Optional.empty() : Optional.of(matchIncrementOrderParameters);
	}

	public SecuritiesQuantity setMatchIncrementOrderParameters(com.tools20022.repository.entity.SecuritiesOrderParameters matchIncrementOrderParameters) {
		this.matchIncrementOrderParameters = matchIncrementOrderParameters;
		return this;
	}

	public Issuance getRelatedIssuance() {
		return relatedIssuance;
	}

	public SecuritiesQuantity setRelatedIssuance(com.tools20022.repository.entity.Issuance relatedIssuance) {
		this.relatedIssuance = Objects.requireNonNull(relatedIssuance);
		return this;
	}

	public PairOff getPairoff() {
		return pairoff;
	}

	public SecuritiesQuantity setPairoff(com.tools20022.repository.entity.PairOff pairoff) {
		this.pairoff = Objects.requireNonNull(pairoff);
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public SecuritiesQuantity setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingDenominatorDistributionInformation() {
		return intermediateToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingDenominatorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution intermediateToUnderlyingDenominatorDistributionInformation) {
		this.intermediateToUnderlyingDenominatorDistributionInformation = Objects.requireNonNull(intermediateToUnderlyingDenominatorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMaximumHoldingDistributionInformation() {
		return maximumHoldingDistributionInformation;
	}

	public SecuritiesQuantity setMaximumHoldingDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution maximumHoldingDistributionInformation) {
		this.maximumHoldingDistributionInformation = Objects.requireNonNull(maximumHoldingDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMaximumExercisableQuantityDistributionInformation() {
		return maximumExercisableQuantityDistributionInformation;
	}

	public SecuritiesQuantity setMaximumExercisableQuantityDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution maximumExercisableQuantityDistributionInformation) {
		this.maximumExercisableQuantityDistributionInformation = Objects.requireNonNull(maximumExercisableQuantityDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMinimumExercisableQuantityDistributionInformation() {
		return minimumExercisableQuantityDistributionInformation;
	}

	public SecuritiesQuantity setMinimumExercisableQuantityDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution minimumExercisableQuantityDistributionInformation) {
		this.minimumExercisableQuantityDistributionInformation = Objects.requireNonNull(minimumExercisableQuantityDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingDenominatorDistributionInformation() {
		return distributedToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesQuantity setDistributedToUnderlyingDenominatorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution distributedToUnderlyingDenominatorDistributionInformation) {
		this.distributedToUnderlyingDenominatorDistributionInformation = Objects.requireNonNull(distributedToUnderlyingDenominatorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingNumeratorDistributionInformation() {
		return intermediateToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingNumeratorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution intermediateToUnderlyingNumeratorDistributionInformation) {
		this.intermediateToUnderlyingNumeratorDistributionInformation = Objects.requireNonNull(intermediateToUnderlyingNumeratorDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getMinimumHoldingDistributionInformation() {
		return minimumHoldingDistributionInformation;
	}

	public SecuritiesQuantity setMinimumHoldingDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution minimumHoldingDistributionInformation) {
		this.minimumHoldingDistributionInformation = Objects.requireNonNull(minimumHoldingDistributionInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingNumeratorDistributionInformation() {
		return distributedToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesQuantity setDistributedToUnderlyingNumeratorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution distributedToUnderlyingNumeratorDistributionInformation) {
		this.distributedToUnderlyingNumeratorDistributionInformation = Objects.requireNonNull(distributedToUnderlyingNumeratorDistributionInformation);
		return this;
	}

	public SecuritiesDistribution getMaximumHoldingRelatedSecuritiesDistribution() {
		return maximumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setMaximumHoldingRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution maximumHoldingRelatedSecuritiesDistribution) {
		this.maximumHoldingRelatedSecuritiesDistribution = Objects.requireNonNull(maximumHoldingRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = Objects.requireNonNull(intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = Objects.requireNonNull(intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution distributedToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingDenominatorRelatedSecuritiesDistribution = Objects.requireNonNull(distributedToUnderlyingDenominatorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution distributedToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingNumeratorRelatedSecuritiesDistribution = Objects.requireNonNull(distributedToUnderlyingNumeratorRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getMinimumHoldingRelatedSecuritiesDistribution() {
		return minimumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesQuantity setMinimumHoldingRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution minimumHoldingRelatedSecuritiesDistribution) {
		this.minimumHoldingRelatedSecuritiesDistribution = Objects.requireNonNull(minimumHoldingRelatedSecuritiesDistribution);
		return this;
	}

	public TradingMarket getMaximumTradedQuantityMarket() {
		return maximumTradedQuantityMarket;
	}

	public SecuritiesQuantity setMaximumTradedQuantityMarket(com.tools20022.repository.entity.TradingMarket maximumTradedQuantityMarket) {
		this.maximumTradedQuantityMarket = Objects.requireNonNull(maximumTradedQuantityMarket);
		return this;
	}

	public Quote getQuantityRelatedQuote() {
		return quantityRelatedQuote;
	}

	public SecuritiesQuantity setQuantityRelatedQuote(com.tools20022.repository.entity.Quote quantityRelatedQuote) {
		this.quantityRelatedQuote = Objects.requireNonNull(quantityRelatedQuote);
		return this;
	}

	public Quote getMinimumQuantityRelatedQuote() {
		return minimumQuantityRelatedQuote;
	}

	public SecuritiesQuantity setMinimumQuantityRelatedQuote(com.tools20022.repository.entity.Quote minimumQuantityRelatedQuote) {
		this.minimumQuantityRelatedQuote = Objects.requireNonNull(minimumQuantityRelatedQuote);
		return this;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public SecuritiesQuantity setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = Objects.requireNonNull(netAssetValueCalculation);
		return this;
	}

	public SidePocket getSidePocket() {
		return sidePocket;
	}

	public SecuritiesQuantity setSidePocket(com.tools20022.repository.entity.SidePocket sidePocket) {
		this.sidePocket = Objects.requireNonNull(sidePocket);
		return this;
	}

	public Netting getNetting() {
		return netting;
	}

	public SecuritiesQuantity setNetting(com.tools20022.repository.entity.Netting netting) {
		this.netting = Objects.requireNonNull(netting);
		return this;
	}

	public SecuritiesOrderStatus getRelatedOrderStatus() {
		return relatedOrderStatus;
	}

	public SecuritiesQuantity setRelatedOrderStatus(com.tools20022.repository.entity.SecuritiesOrderStatus relatedOrderStatus) {
		this.relatedOrderStatus = Objects.requireNonNull(relatedOrderStatus);
		return this;
	}

	public SecuritiesOrderStatus getSecuritiesOrderStatus() {
		return securitiesOrderStatus;
	}

	public SecuritiesQuantity setSecuritiesOrderStatus(com.tools20022.repository.entity.SecuritiesOrderStatus securitiesOrderStatus) {
		this.securitiesOrderStatus = Objects.requireNonNull(securitiesOrderStatus);
		return this;
	}

	public SecuritiesSettlement getRelatedTurnaroundSettlement() {
		return relatedTurnaroundSettlement;
	}

	public SecuritiesQuantity setRelatedTurnaroundSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedTurnaroundSettlement) {
		this.relatedTurnaroundSettlement = Objects.requireNonNull(relatedTurnaroundSettlement);
		return this;
	}

	public FundsCashFlow getRelatedCashFlow() {
		return relatedCashFlow;
	}

	public SecuritiesQuantity setRelatedCashFlow(com.tools20022.repository.entity.FundsCashFlow relatedCashFlow) {
		this.relatedCashFlow = Objects.requireNonNull(relatedCashFlow);
		return this;
	}

	public Position getPosition() {
		return position;
	}

	public SecuritiesQuantity setPosition(com.tools20022.repository.entity.Position position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public BiddingConditions getMaximumQuantityBiddingConditions() {
		return maximumQuantityBiddingConditions;
	}

	public SecuritiesQuantity setMaximumQuantityBiddingConditions(com.tools20022.repository.entity.BiddingConditions maximumQuantityBiddingConditions) {
		this.maximumQuantityBiddingConditions = Objects.requireNonNull(maximumQuantityBiddingConditions);
		return this;
	}

	public BiddingConditions getFrontEndOddLotBiddingConditions() {
		return frontEndOddLotBiddingConditions;
	}

	public SecuritiesQuantity setFrontEndOddLotBiddingConditions(com.tools20022.repository.entity.BiddingConditions frontEndOddLotBiddingConditions) {
		this.frontEndOddLotBiddingConditions = Objects.requireNonNull(frontEndOddLotBiddingConditions);
		return this;
	}

	public BiddingConditions getMinimumQuantityBiddingConditions() {
		return minimumQuantityBiddingConditions;
	}

	public SecuritiesQuantity setMinimumQuantityBiddingConditions(com.tools20022.repository.entity.BiddingConditions minimumQuantityBiddingConditions) {
		this.minimumQuantityBiddingConditions = Objects.requireNonNull(minimumQuantityBiddingConditions);
		return this;
	}
}