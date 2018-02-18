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
import com.tools20022.repository.choice.PriceRateOrAmountChoice;
import com.tools20022.repository.choice.TransactionPrice3Choice;
import com.tools20022.repository.choice.YieldedOrValueType1Choice;
import com.tools20022.repository.codeset.AmountPriceTypeCode;
import com.tools20022.repository.codeset.PriceMethodCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price2;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the price of the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPricing" src="doc-files/SecuritiesPricing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
 * SecuritiesPricing.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
 * SecuritiesPricing.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
 * SecuritiesPricing.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCalculationBasis
 * SecuritiesPricing.mmCalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRelatedStatistics
 * SecuritiesPricing.mmPriceChangeRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
 * SecuritiesPricing.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmHighestPriceValueRelatedStatistics
 * SecuritiesPricing.mmHighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLowestPriceValueRelatedStatistics
 * SecuritiesPricing.mmLowestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYielded
 * SecuritiesPricing.mmYielded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfRate
 * SecuritiesPricing.mmTypeOfRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
 * SecuritiesPricing.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedWarrant
 * SecuritiesPricing.mmRelatedWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
 * SecuritiesPricing.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
 * SecuritiesPricing.mmTypeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
 * SecuritiesPricing.mmAmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
 * SecuritiesPricing.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
 * SecuritiesPricing.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedBuyIn
 * SecuritiesPricing.mmRelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
 * SecuritiesPricing.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmInformationPartyRole
 * SecuritiesPricing.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
 * SecuritiesPricing.mmPriceFactPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAnalyticsCalculation
 * SecuritiesPricing.mmAnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDurationCalculation
 * SecuritiesPricing.mmDurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLifeCalculation
 * SecuritiesPricing.mmLifeCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDate
 * SecuritiesPricing.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
 * SecuritiesPricing.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
 * SecuritiesPricing.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
 * SecuritiesPricing.mmStopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAllocation
 * SecuritiesPricing.mmAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedOrder
 * SecuritiesPricing.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIssuance
 * SecuritiesPricing.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmEntitlement
 * SecuritiesPricing.mmEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
 * SecuritiesPricing.mmRelatedFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDistribution
 * SecuritiesPricing.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRedemptionSchedule
 * SecuritiesPricing.mmPriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedRedemptionSchedule
 * SecuritiesPricing.mmRelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPreviousClosingPriceRelatedQuote
 * SecuritiesPricing.mmPreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRequestedPriceRelatedQuote
 * SecuritiesPricing.mmRequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceRelatedQuote
 * SecuritiesPricing.mmPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMarketPriceRelatedQuote
 * SecuritiesPricing.mmMarketPriceRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
 * SecuritiesPricing.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedPosition
 * SecuritiesPricing.mmRelatedPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
 * InformationPartyRole.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
 * NetAssetValueCalculation.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
 * RedemptionSchedule.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
 * RedemptionSchedule.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
 * LotBreakdown.mmLotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
 * Price.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
 * ValuationStatistics.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
 * ValuationStatistics.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
 * ValuationStatistics.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
 * SecuritiesTradeExecution.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmTick
 * Derivative.mmTick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
 * Derivative.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
 * Issuance.mmOriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
 * Index.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
 * Warrant.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
 * SecuritiesConversion.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
 * SecuritiesFinancing.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
 * BiddingConditions.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
 * BiddingConditions.mmMinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
 * AmountAndQuantity.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
 * AmountRatio.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
 * Spread.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
 * SecuritiesOrder.mmOrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
 * SecuritiesOrder.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
 * YieldCalculation.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
 * Allocation.mmAllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
 * Distribution.mmOfferPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
 * BuyIn.mmBuyInPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
 * Quote.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
 * Quote.mmRequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
 * Quote.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
 * SecuritiesDistribution.mmCashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
 * SecuritiesDistribution.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
 * SecuritiesDistribution.mmReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
 * AnalyticsCalculation.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
 * LifeCalculation.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
 * Entitlement.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmPrice
 * Position.mmPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmValue Price2.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#mmProprietary
 * TransactionPrice3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
 * YieldedOrValueType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
 * PriceRateOrAmountChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice3Choice
 * TransactionPrice3Choice}</li>
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
 * "SecuritiesPricing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the price of the security."</li>
 * </ul>
 */
public class SecuritiesPricing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceMethodCode priceMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode
	 * PriceMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getPriceMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfPriceCode priceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmType
	 * Price2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Price2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getPriceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator cumDividendIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCumDividendIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getCumDividendIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate calculationBasis;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getCalculationBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ValuationStatistics> priceChangeRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a change of price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceChangeRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmRate
	 * PriceRateOrAmountChoice.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceRateOrAmountChoice.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ValuationStatistics highestPriceValueRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
	 * ValuationStatistics.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a highest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmHighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmHighestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected ValuationStatistics lowestPriceValueRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
	 * ValuationStatistics.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a lowest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmLowestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security for which a price is given."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade execution for which a deal price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected YesNoIndicator yielded;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmYielded
	 * YieldedOrValueType1Choice.mmYielded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yielded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYielded = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmYielded);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getYielded", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriceValueTypeCode typeOfRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmValueType
	 * YieldedOrValueType1Choice.mmValueType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmValueType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getTypeOfRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Derivative> derivative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative for which an exercise price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDerivative = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Warrant> relatedWarrant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedWarrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
		}
	};
	protected SecuritiesConversion relatedSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
	 * SecuritiesConversion.mmConversionPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion price is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected LotBreakdown lotBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lot for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLotBreakdown = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmLotPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected AmountPriceTypeCode typeOfAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getTypeOfAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionPrice exercisePriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an exercise price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExercisePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price received per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected AmountAndQuantity amountPricePerFinancialInstrumentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
	 * AmountAndQuantity.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as an amount per a quantity of financial instruments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.mmObject();
		}
	};
	protected AmountRatio amountPricePerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
	 * AmountRatio.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRatio
	 * AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an amount per another amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmountPricePerAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRatio.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRatio.mmObject();
		}
	};
	protected CorporateActionPrice genericCashPricePaidPerProductRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price paid per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected DateTimePeriod priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
	 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceCalculationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CorporateActionPrice cashInLieuOfSharePriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash in lieu of share price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice overSubscriptionDepositPriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an over subscription deposit price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice cashValueForTaxRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTaxRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash value has been provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashValueForTaxRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected BiddingConditions maximumPriceBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
	 * BiddingConditions.mmMaximumPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMaximumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMaximumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected BiddingConditions minimumPriceBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
	 * BiddingConditions.mmMinimumPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMinimumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected ISODateTime quotationDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the price is obtained."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getQuotationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.YieldCalculation> yieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
	 * YieldCalculation.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of return on an investment, based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmYieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmRedemptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> relatedSecuritiesFinancing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
	 * SecuritiesFinancing.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which an end price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToExecutedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an executed price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToInformativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToInformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an informative price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher for which the cost per share is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which the trade price is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.NetAssetValueCalculation> netAssetValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
	 * NetAssetValueCalculation.mmPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value calculation for which a securities pricing is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
	 * BuyIn.mmBuyInPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BuyIn process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmBuyInPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Index> index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
	 * Index.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the index information when used for calculating the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected InformationPartyRole informationPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
	 * InformationPartyRole.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provided the pricing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInformationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected DateTimePeriod priceFactPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
	 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the price fact type is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceFactPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AnalyticsCalculation> analyticsCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
	 * AnalyticsCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnalyticsCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated analytics based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DurationCalculation> durationCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
	 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated duration based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDurationCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmRelatedSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LifeCalculation> lifeCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
	 * LifeCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated  life based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLifeCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
		}
	};
	protected ISODateTime date;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the price. For CIV, this is the NAV date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
	 * Spread.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread which uses the price as benchmark."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected SecuritiesOrder order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected SecuritiesOrder stopPriceOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
	 * SecuritiesOrder.mmStopPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPriceOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a stop price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStopPriceOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice;
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
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
	 * Allocation.mmAllocatedPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmAllocatedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrderParameters relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
	 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a previous closing price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
	 * Issuance.mmOriginalIssueDiscount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a discount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmOriginalIssueDiscount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Entitlement entitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
	 * Entitlement.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entitlement
	 * Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which a strike price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entitlement.mmStrikePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
		}
	};
	protected SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
	 * SecuritiesDistribution.mmCashFractionsPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFractionsPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a cash fractions price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmCashFractionsPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
	 * SecuritiesDistribution.mmSubscriptionPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuscriptionPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
	 * SecuritiesDistribution.mmReinvestmentPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a reinvestment price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected Derivative relatedFuture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmTick
	 * Derivative.mmTick}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract for which a tick is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedFuture = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmTick;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected Distribution distribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
	 * Distribution.mmOfferPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which an offer price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmOfferPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected RedemptionSchedule priceChangeRedemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
	 * RedemptionSchedule.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a change in price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceChangeRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected RedemptionSchedule relatedRedemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
	 * RedemptionSchedule.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption schedule for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected Quote previousClosingPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
	 * Quote.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a previous closing price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote requestedPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
	 * Quote.mmRequestedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a requested price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRequestedPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmRequestedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote priceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#mmPrice
	 * Quote.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote marketPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
	 * Quote.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a market price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarketPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMarketPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Price price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmAmount
	 * PriceRateOrAmountChoice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#mmDealPrice
	 * TransactionPrice3Choice.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceRateOrAmountChoice.mmAmount, TransactionPrice3Choice.mmDealPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected CorporateActionPrice relatedCorporateActionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
	 * CorporateActionPrice.mmPricingCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action price for which pricing information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected Position relatedPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmPrice
	 * Position.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position for which a price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmPricing, com.tools20022.repository.entity.InformationPartyRole.mmPrice,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice, com.tools20022.repository.entity.RedemptionSchedule.mmPriceChange, com.tools20022.repository.entity.RedemptionSchedule.mmPrice,
						com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice, com.tools20022.repository.entity.LotBreakdown.mmLotPrice, com.tools20022.repository.entity.Price.mmSecuritiesPricing,
						com.tools20022.repository.entity.ValuationStatistics.mmPriceChange, com.tools20022.repository.entity.ValuationStatistics.mmHighestPriceValue, com.tools20022.repository.entity.ValuationStatistics.mmLowestPriceValue,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice, com.tools20022.repository.entity.Derivative.mmTick, com.tools20022.repository.entity.Derivative.mmExercisePrice,
						com.tools20022.repository.entity.Issuance.mmOriginalIssueDiscount, com.tools20022.repository.entity.Index.mmSecuritiesPricing, com.tools20022.repository.entity.Warrant.mmSubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice, com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice, com.tools20022.repository.entity.BiddingConditions.mmMaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.mmMinimumPrice, com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice, com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct, com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice, com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax,
						com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation, com.tools20022.repository.entity.AmountAndQuantity.mmSecuritiesPricing, com.tools20022.repository.entity.AmountRatio.mmSecuritiesPricing,
						com.tools20022.repository.entity.Spread.mmBenchmarkPrice, com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice, com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice,
						com.tools20022.repository.entity.YieldCalculation.mmRedemptionPrice, com.tools20022.repository.entity.Allocation.mmAllocatedPrice, com.tools20022.repository.entity.Distribution.mmOfferPrice,
						com.tools20022.repository.entity.BuyIn.mmBuyInPrice, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreviousClosingPrice, com.tools20022.repository.entity.Quote.mmPreviousClosingPrice,
						com.tools20022.repository.entity.Quote.mmRequestedPrice, com.tools20022.repository.entity.Quote.mmPrice, com.tools20022.repository.entity.Quote.mmMarketPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.mmCashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.mmSubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentPrice, com.tools20022.repository.entity.AnalyticsCalculation.mmSecuritiesPricing,
						com.tools20022.repository.entity.DurationCalculation.mmRelatedSecuritiesPricing, com.tools20022.repository.entity.LifeCalculation.mmSecuritiesPricing, com.tools20022.repository.entity.Entitlement.mmStrikePrice,
						com.tools20022.repository.entity.Position.mmPrice);
				derivationElement_lazy = () -> Arrays.asList(Price2.mmValue, TransactionPrice3Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmPriceMethod, com.tools20022.repository.entity.SecuritiesPricing.mmPriceType,
						com.tools20022.repository.entity.SecuritiesPricing.mmCumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.mmCalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmRate,
						com.tools20022.repository.entity.SecuritiesPricing.mmHighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmLowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.mmYielded,
						com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.mmDerivative, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmPriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.mmQuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmYieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmTaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.mmIndex, com.tools20022.repository.entity.SecuritiesPricing.mmInformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.mmAnalyticsCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmDurationCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmLifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmSpread, com.tools20022.repository.entity.SecuritiesPricing.mmOrder, com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder,
						com.tools20022.repository.entity.SecuritiesPricing.mmAllocation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.mmIssuance,
						com.tools20022.repository.entity.SecuritiesPricing.mmEntitlement, com.tools20022.repository.entity.SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedFuture, com.tools20022.repository.entity.SecuritiesPricing.mmDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.mmPreviousClosingPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmRequestedPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmMarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmPrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedPosition);
				derivationComponent_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmObject(), PriceRateOrAmountChoice.mmObject(), Price2.mmObject(), TransactionPrice3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPricing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PriceMethodCode getPriceMethod() {
		return priceMethod;
	}

	public SecuritiesPricing setPriceMethod(PriceMethodCode priceMethod) {
		this.priceMethod = Objects.requireNonNull(priceMethod);
		return this;
	}

	public TypeOfPriceCode getPriceType() {
		return priceType;
	}

	public SecuritiesPricing setPriceType(TypeOfPriceCode priceType) {
		this.priceType = Objects.requireNonNull(priceType);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public SecuritiesPricing setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public PercentageRate getCalculationBasis() {
		return calculationBasis;
	}

	public SecuritiesPricing setCalculationBasis(PercentageRate calculationBasis) {
		this.calculationBasis = Objects.requireNonNull(calculationBasis);
		return this;
	}

	public List<ValuationStatistics> getPriceChangeRelatedStatistics() {
		return priceChangeRelatedStatistics == null ? priceChangeRelatedStatistics = new ArrayList<>() : priceChangeRelatedStatistics;
	}

	public SecuritiesPricing setPriceChangeRelatedStatistics(List<com.tools20022.repository.entity.ValuationStatistics> priceChangeRelatedStatistics) {
		this.priceChangeRelatedStatistics = Objects.requireNonNull(priceChangeRelatedStatistics);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public SecuritiesPricing setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<ValuationStatistics> getHighestPriceValueRelatedStatistics() {
		return highestPriceValueRelatedStatistics == null ? Optional.empty() : Optional.of(highestPriceValueRelatedStatistics);
	}

	public SecuritiesPricing setHighestPriceValueRelatedStatistics(com.tools20022.repository.entity.ValuationStatistics highestPriceValueRelatedStatistics) {
		this.highestPriceValueRelatedStatistics = highestPriceValueRelatedStatistics;
		return this;
	}

	public Optional<ValuationStatistics> getLowestPriceValueRelatedStatistics() {
		return lowestPriceValueRelatedStatistics == null ? Optional.empty() : Optional.of(lowestPriceValueRelatedStatistics);
	}

	public SecuritiesPricing setLowestPriceValueRelatedStatistics(com.tools20022.repository.entity.ValuationStatistics lowestPriceValueRelatedStatistics) {
		this.lowestPriceValueRelatedStatistics = lowestPriceValueRelatedStatistics;
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesPricing setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Optional<SecuritiesTradeExecution> getSecuritiesTradeExecution() {
		return securitiesTradeExecution == null ? Optional.empty() : Optional.of(securitiesTradeExecution);
	}

	public SecuritiesPricing setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
		return this;
	}

	public YesNoIndicator getYielded() {
		return yielded;
	}

	public SecuritiesPricing setYielded(YesNoIndicator yielded) {
		this.yielded = Objects.requireNonNull(yielded);
		return this;
	}

	public PriceValueTypeCode getTypeOfRate() {
		return typeOfRate;
	}

	public SecuritiesPricing setTypeOfRate(PriceValueTypeCode typeOfRate) {
		this.typeOfRate = Objects.requireNonNull(typeOfRate);
		return this;
	}

	public List<Derivative> getDerivative() {
		return derivative == null ? derivative = new ArrayList<>() : derivative;
	}

	public SecuritiesPricing setDerivative(List<com.tools20022.repository.entity.Derivative> derivative) {
		this.derivative = Objects.requireNonNull(derivative);
		return this;
	}

	public List<Warrant> getRelatedWarrant() {
		return relatedWarrant == null ? relatedWarrant = new ArrayList<>() : relatedWarrant;
	}

	public SecuritiesPricing setRelatedWarrant(List<com.tools20022.repository.entity.Warrant> relatedWarrant) {
		this.relatedWarrant = Objects.requireNonNull(relatedWarrant);
		return this;
	}

	public SecuritiesConversion getRelatedSecuritiesConversion() {
		return relatedSecuritiesConversion;
	}

	public SecuritiesPricing setRelatedSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion relatedSecuritiesConversion) {
		this.relatedSecuritiesConversion = Objects.requireNonNull(relatedSecuritiesConversion);
		return this;
	}

	public Optional<LotBreakdown> getLotBreakdown() {
		return lotBreakdown == null ? Optional.empty() : Optional.of(lotBreakdown);
	}

	public SecuritiesPricing setLotBreakdown(com.tools20022.repository.entity.LotBreakdown lotBreakdown) {
		this.lotBreakdown = lotBreakdown;
		return this;
	}

	public AmountPriceTypeCode getTypeOfAmount() {
		return typeOfAmount;
	}

	public SecuritiesPricing setTypeOfAmount(AmountPriceTypeCode typeOfAmount) {
		this.typeOfAmount = Objects.requireNonNull(typeOfAmount);
		return this;
	}

	public CorporateActionPrice getExercisePriceRelatedEvent() {
		return exercisePriceRelatedEvent;
	}

	public SecuritiesPricing setExercisePriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice exercisePriceRelatedEvent) {
		this.exercisePriceRelatedEvent = Objects.requireNonNull(exercisePriceRelatedEvent);
		return this;
	}

	public Optional<CorporateActionPrice> getGenericCashPriceReceivedPerProductRelatedEvent() {
		return genericCashPriceReceivedPerProductRelatedEvent == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProductRelatedEvent);
	}

	public SecuritiesPricing setGenericCashPriceReceivedPerProductRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent) {
		this.genericCashPriceReceivedPerProductRelatedEvent = genericCashPriceReceivedPerProductRelatedEvent;
		return this;
	}

	public AmountAndQuantity getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public SecuritiesPricing setAmountPricePerFinancialInstrumentQuantity(com.tools20022.repository.entity.AmountAndQuantity amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = Objects.requireNonNull(amountPricePerFinancialInstrumentQuantity);
		return this;
	}

	public AmountRatio getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public SecuritiesPricing setAmountPricePerAmount(com.tools20022.repository.entity.AmountRatio amountPricePerAmount) {
		this.amountPricePerAmount = Objects.requireNonNull(amountPricePerAmount);
		return this;
	}

	public Optional<CorporateActionPrice> getGenericCashPricePaidPerProductRelatedEvent() {
		return genericCashPricePaidPerProductRelatedEvent == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProductRelatedEvent);
	}

	public SecuritiesPricing setGenericCashPricePaidPerProductRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice genericCashPricePaidPerProductRelatedEvent) {
		this.genericCashPricePaidPerProductRelatedEvent = genericCashPricePaidPerProductRelatedEvent;
		return this;
	}

	public DateTimePeriod getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public SecuritiesPricing setPriceCalculationPeriod(com.tools20022.repository.entity.DateTimePeriod priceCalculationPeriod) {
		this.priceCalculationPeriod = Objects.requireNonNull(priceCalculationPeriod);
		return this;
	}

	public Optional<CorporateActionPrice> getCashInLieuOfSharePriceRelatedEvent() {
		return cashInLieuOfSharePriceRelatedEvent == null ? Optional.empty() : Optional.of(cashInLieuOfSharePriceRelatedEvent);
	}

	public SecuritiesPricing setCashInLieuOfSharePriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice cashInLieuOfSharePriceRelatedEvent) {
		this.cashInLieuOfSharePriceRelatedEvent = cashInLieuOfSharePriceRelatedEvent;
		return this;
	}

	public Optional<CorporateActionPrice> getOverSubscriptionDepositPriceRelatedEvent() {
		return overSubscriptionDepositPriceRelatedEvent == null ? Optional.empty() : Optional.of(overSubscriptionDepositPriceRelatedEvent);
	}

	public SecuritiesPricing setOverSubscriptionDepositPriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice overSubscriptionDepositPriceRelatedEvent) {
		this.overSubscriptionDepositPriceRelatedEvent = overSubscriptionDepositPriceRelatedEvent;
		return this;
	}

	public CorporateActionPrice getCashValueForTaxRelatedEvent() {
		return cashValueForTaxRelatedEvent;
	}

	public SecuritiesPricing setCashValueForTaxRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice cashValueForTaxRelatedEvent) {
		this.cashValueForTaxRelatedEvent = Objects.requireNonNull(cashValueForTaxRelatedEvent);
		return this;
	}

	public BiddingConditions getMaximumPriceBiddingConditions() {
		return maximumPriceBiddingConditions;
	}

	public SecuritiesPricing setMaximumPriceBiddingConditions(com.tools20022.repository.entity.BiddingConditions maximumPriceBiddingConditions) {
		this.maximumPriceBiddingConditions = Objects.requireNonNull(maximumPriceBiddingConditions);
		return this;
	}

	public BiddingConditions getMinimumPriceBiddingConditions() {
		return minimumPriceBiddingConditions;
	}

	public SecuritiesPricing setMinimumPriceBiddingConditions(com.tools20022.repository.entity.BiddingConditions minimumPriceBiddingConditions) {
		this.minimumPriceBiddingConditions = Objects.requireNonNull(minimumPriceBiddingConditions);
		return this;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public SecuritiesPricing setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = Objects.requireNonNull(quotationDate);
		return this;
	}

	public List<YieldCalculation> getYieldCalculation() {
		return yieldCalculation == null ? yieldCalculation = new ArrayList<>() : yieldCalculation;
	}

	public SecuritiesPricing setYieldCalculation(List<com.tools20022.repository.entity.YieldCalculation> yieldCalculation) {
		this.yieldCalculation = Objects.requireNonNull(yieldCalculation);
		return this;
	}

	public List<SecuritiesFinancing> getRelatedSecuritiesFinancing() {
		return relatedSecuritiesFinancing == null ? relatedSecuritiesFinancing = new ArrayList<>() : relatedSecuritiesFinancing;
	}

	public SecuritiesPricing setRelatedSecuritiesFinancing(List<com.tools20022.repository.entity.SecuritiesFinancing> relatedSecuritiesFinancing) {
		this.relatedSecuritiesFinancing = Objects.requireNonNull(relatedSecuritiesFinancing);
		return this;
	}

	public Optional<InvestmentFundOrderExecution> getFundOrderRelatedToExecutedPrice() {
		return fundOrderRelatedToExecutedPrice == null ? Optional.empty() : Optional.of(fundOrderRelatedToExecutedPrice);
	}

	public SecuritiesPricing setFundOrderRelatedToExecutedPrice(com.tools20022.repository.entity.InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice) {
		this.fundOrderRelatedToExecutedPrice = fundOrderRelatedToExecutedPrice;
		return this;
	}

	public Optional<InvestmentFundOrderExecution> getFundOrderRelatedToInformativePrice() {
		return fundOrderRelatedToInformativePrice == null ? Optional.empty() : Optional.of(fundOrderRelatedToInformativePrice);
	}

	public SecuritiesPricing setFundOrderRelatedToInformativePrice(com.tools20022.repository.entity.InvestmentFundOrderExecution fundOrderRelatedToInformativePrice) {
		this.fundOrderRelatedToInformativePrice = fundOrderRelatedToInformativePrice;
		return this;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public SecuritiesPricing setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = Objects.requireNonNull(taxVoucher);
		return this;
	}

	public Optional<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade == null ? Optional.empty() : Optional.of(securitiesTrade);
	}

	public SecuritiesPricing setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
		return this;
	}

	public List<NetAssetValueCalculation> getNetAssetValueCalculation() {
		return netAssetValueCalculation == null ? netAssetValueCalculation = new ArrayList<>() : netAssetValueCalculation;
	}

	public SecuritiesPricing setNetAssetValueCalculation(List<com.tools20022.repository.entity.NetAssetValueCalculation> netAssetValueCalculation) {
		this.netAssetValueCalculation = Objects.requireNonNull(netAssetValueCalculation);
		return this;
	}

	public BuyIn getRelatedBuyIn() {
		return relatedBuyIn;
	}

	public SecuritiesPricing setRelatedBuyIn(com.tools20022.repository.entity.BuyIn relatedBuyIn) {
		this.relatedBuyIn = Objects.requireNonNull(relatedBuyIn);
		return this;
	}

	public List<Index> getIndex() {
		return index == null ? index = new ArrayList<>() : index;
	}

	public SecuritiesPricing setIndex(List<com.tools20022.repository.entity.Index> index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public InformationPartyRole getInformationPartyRole() {
		return informationPartyRole;
	}

	public SecuritiesPricing setInformationPartyRole(com.tools20022.repository.entity.InformationPartyRole informationPartyRole) {
		this.informationPartyRole = Objects.requireNonNull(informationPartyRole);
		return this;
	}

	public DateTimePeriod getPriceFactPeriod() {
		return priceFactPeriod;
	}

	public SecuritiesPricing setPriceFactPeriod(com.tools20022.repository.entity.DateTimePeriod priceFactPeriod) {
		this.priceFactPeriod = Objects.requireNonNull(priceFactPeriod);
		return this;
	}

	public List<AnalyticsCalculation> getAnalyticsCalculation() {
		return analyticsCalculation == null ? analyticsCalculation = new ArrayList<>() : analyticsCalculation;
	}

	public SecuritiesPricing setAnalyticsCalculation(List<com.tools20022.repository.entity.AnalyticsCalculation> analyticsCalculation) {
		this.analyticsCalculation = Objects.requireNonNull(analyticsCalculation);
		return this;
	}

	public List<DurationCalculation> getDurationCalculation() {
		return durationCalculation == null ? durationCalculation = new ArrayList<>() : durationCalculation;
	}

	public SecuritiesPricing setDurationCalculation(List<com.tools20022.repository.entity.DurationCalculation> durationCalculation) {
		this.durationCalculation = Objects.requireNonNull(durationCalculation);
		return this;
	}

	public List<LifeCalculation> getLifeCalculation() {
		return lifeCalculation == null ? lifeCalculation = new ArrayList<>() : lifeCalculation;
	}

	public SecuritiesPricing setLifeCalculation(List<com.tools20022.repository.entity.LifeCalculation> lifeCalculation) {
		this.lifeCalculation = Objects.requireNonNull(lifeCalculation);
		return this;
	}

	public ISODateTime getDate() {
		return date;
	}

	public SecuritiesPricing setDate(ISODateTime date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public SecuritiesPricing setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
		return this;
	}

	public Optional<SecuritiesOrder> getOrder() {
		return order == null ? Optional.empty() : Optional.of(order);
	}

	public SecuritiesPricing setOrder(com.tools20022.repository.entity.SecuritiesOrder order) {
		this.order = order;
		return this;
	}

	public Optional<SecuritiesOrder> getStopPriceOrder() {
		return stopPriceOrder == null ? Optional.empty() : Optional.of(stopPriceOrder);
	}

	public SecuritiesPricing setStopPriceOrder(com.tools20022.repository.entity.SecuritiesOrder stopPriceOrder) {
		this.stopPriceOrder = stopPriceOrder;
		return this;
	}

	public Optional<Allocation> getAllocation() {
		return allocation == null ? Optional.empty() : Optional.of(allocation);
	}

	public SecuritiesPricing setAllocation(com.tools20022.repository.entity.Allocation allocation) {
		this.allocation = allocation;
		return this;
	}

	public Optional<SecuritiesOrderParameters> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesPricing setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrderParameters relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public SecuritiesPricing setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public Entitlement getEntitlement() {
		return entitlement;
	}

	public SecuritiesPricing setEntitlement(com.tools20022.repository.entity.Entitlement entitlement) {
		this.entitlement = Objects.requireNonNull(entitlement);
		return this;
	}

	public SecuritiesDistribution getCashFractionsPriceRelatedSecuritiesDistribution() {
		return cashFractionsPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setCashFractionsPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution) {
		this.cashFractionsPriceRelatedSecuritiesDistribution = Objects.requireNonNull(cashFractionsPriceRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getSuscriptionPriceRelatedSecuritiesDistribution() {
		return suscriptionPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setSuscriptionPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution) {
		this.suscriptionPriceRelatedSecuritiesDistribution = Objects.requireNonNull(suscriptionPriceRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getReinvestmentPriceRelatedSecuritiesDistribution() {
		return reinvestmentPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setReinvestmentPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution) {
		this.reinvestmentPriceRelatedSecuritiesDistribution = Objects.requireNonNull(reinvestmentPriceRelatedSecuritiesDistribution);
		return this;
	}

	public Derivative getRelatedFuture() {
		return relatedFuture;
	}

	public SecuritiesPricing setRelatedFuture(com.tools20022.repository.entity.Derivative relatedFuture) {
		this.relatedFuture = Objects.requireNonNull(relatedFuture);
		return this;
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public SecuritiesPricing setDistribution(com.tools20022.repository.entity.Distribution distribution) {
		this.distribution = Objects.requireNonNull(distribution);
		return this;
	}

	public RedemptionSchedule getPriceChangeRedemptionSchedule() {
		return priceChangeRedemptionSchedule;
	}

	public SecuritiesPricing setPriceChangeRedemptionSchedule(com.tools20022.repository.entity.RedemptionSchedule priceChangeRedemptionSchedule) {
		this.priceChangeRedemptionSchedule = Objects.requireNonNull(priceChangeRedemptionSchedule);
		return this;
	}

	public RedemptionSchedule getRelatedRedemptionSchedule() {
		return relatedRedemptionSchedule;
	}

	public SecuritiesPricing setRelatedRedemptionSchedule(com.tools20022.repository.entity.RedemptionSchedule relatedRedemptionSchedule) {
		this.relatedRedemptionSchedule = Objects.requireNonNull(relatedRedemptionSchedule);
		return this;
	}

	public Optional<Quote> getPreviousClosingPriceRelatedQuote() {
		return previousClosingPriceRelatedQuote == null ? Optional.empty() : Optional.of(previousClosingPriceRelatedQuote);
	}

	public SecuritiesPricing setPreviousClosingPriceRelatedQuote(com.tools20022.repository.entity.Quote previousClosingPriceRelatedQuote) {
		this.previousClosingPriceRelatedQuote = previousClosingPriceRelatedQuote;
		return this;
	}

	public Optional<Quote> getRequestedPriceRelatedQuote() {
		return requestedPriceRelatedQuote == null ? Optional.empty() : Optional.of(requestedPriceRelatedQuote);
	}

	public SecuritiesPricing setRequestedPriceRelatedQuote(com.tools20022.repository.entity.Quote requestedPriceRelatedQuote) {
		this.requestedPriceRelatedQuote = requestedPriceRelatedQuote;
		return this;
	}

	public Optional<Quote> getPriceRelatedQuote() {
		return priceRelatedQuote == null ? Optional.empty() : Optional.of(priceRelatedQuote);
	}

	public SecuritiesPricing setPriceRelatedQuote(com.tools20022.repository.entity.Quote priceRelatedQuote) {
		this.priceRelatedQuote = priceRelatedQuote;
		return this;
	}

	public Optional<Quote> getMarketPriceRelatedQuote() {
		return marketPriceRelatedQuote == null ? Optional.empty() : Optional.of(marketPriceRelatedQuote);
	}

	public SecuritiesPricing setMarketPriceRelatedQuote(com.tools20022.repository.entity.Quote marketPriceRelatedQuote) {
		this.marketPriceRelatedQuote = marketPriceRelatedQuote;
		return this;
	}

	public Price getPrice() {
		return price;
	}

	public SecuritiesPricing setPrice(com.tools20022.repository.entity.Price price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public CorporateActionPrice getRelatedCorporateActionPrice() {
		return relatedCorporateActionPrice;
	}

	public SecuritiesPricing setRelatedCorporateActionPrice(com.tools20022.repository.entity.CorporateActionPrice relatedCorporateActionPrice) {
		this.relatedCorporateActionPrice = Objects.requireNonNull(relatedCorporateActionPrice);
		return this;
	}

	public Position getRelatedPosition() {
		return relatedPosition;
	}

	public SecuritiesPricing setRelatedPosition(com.tools20022.repository.entity.Position relatedPosition) {
		this.relatedPosition = Objects.requireNonNull(relatedPosition);
		return this;
	}
}