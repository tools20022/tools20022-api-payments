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
import com.tools20022.repository.msg.Price2;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceMethod
 * SecuritiesPricing.PriceMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceType
 * SecuritiesPricing.PriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CumDividendIndicator
 * SecuritiesPricing.CumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CalculationBasis
 * SecuritiesPricing.CalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRelatedStatistics
 * SecuritiesPricing.PriceChangeRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Rate
 * SecuritiesPricing.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#HighestPriceValueRelatedStatistics
 * SecuritiesPricing.HighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LowestPriceValueRelatedStatistics
 * SecuritiesPricing.LowestPriceValueRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
 * SecuritiesPricing.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
 * SecuritiesPricing.SecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Yielded
 * SecuritiesPricing.Yielded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TypeOfRate
 * SecuritiesPricing.TypeOfRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Derivative
 * SecuritiesPricing.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedWarrant
 * SecuritiesPricing.RelatedWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LotBreakdown
 * SecuritiesPricing.LotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TypeOfAmount
 * SecuritiesPricing.TypeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerAmount
 * SecuritiesPricing.AmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceCalculationPeriod
 * SecuritiesPricing.PriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#QuotationDate
 * SecuritiesPricing.QuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#YieldCalculation
 * SecuritiesPricing.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesFinancing
 * SecuritiesPricing.RelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TaxVoucher
 * SecuritiesPricing.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
 * SecuritiesPricing.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#NetAssetValueCalculation
 * SecuritiesPricing.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedBuyIn
 * SecuritiesPricing.RelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Index
 * SecuritiesPricing.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#InformationPartyRole
 * SecuritiesPricing.InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceFactPeriod
 * SecuritiesPricing.PriceFactPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AnalyticsCalculation
 * SecuritiesPricing.AnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#DurationCalculation
 * SecuritiesPricing.DurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LifeCalculation
 * SecuritiesPricing.LifeCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Date
 * SecuritiesPricing.Date}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Spread
 * SecuritiesPricing.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
 * SecuritiesPricing.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
 * SecuritiesPricing.StopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Allocation
 * SecuritiesPricing.Allocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedOrder
 * SecuritiesPricing.RelatedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
 * SecuritiesPricing.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Entitlement
 * SecuritiesPricing.Entitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedFuture
 * SecuritiesPricing.RelatedFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Distribution
 * SecuritiesPricing.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRedemptionSchedule
 * SecuritiesPricing.PriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedRedemptionSchedule
 * SecuritiesPricing.RelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PreviousClosingPriceRelatedQuote
 * SecuritiesPricing.PreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RequestedPriceRelatedQuote
 * SecuritiesPricing.RequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceRelatedQuote
 * SecuritiesPricing.PriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MarketPriceRelatedQuote
 * SecuritiesPricing.MarketPriceRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Price
 * SecuritiesPricing.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedPosition
 * SecuritiesPricing.RelatedPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Pricing
 * Security.Pricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Price
 * InformationPartyRole.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Price
 * NetAssetValueCalculation.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChange
 * RedemptionSchedule.PriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Price
 * RedemptionSchedule.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceCalculationRelatedPricing
 * DateTimePeriod.PriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceFactRelatedPricing
 * DateTimePeriod.PriceFactRelatedPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
 * SecuritiesTrade.TradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
 * InvestmentFundOrderExecution.InformativePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotPrice
 * LotBreakdown.LotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#SecuritiesPricing
 * Price.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceChange
 * ValuationStatistics.PriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#HighestPriceValue
 * ValuationStatistics.HighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#LowestPriceValue
 * ValuationStatistics.LowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
 * SecuritiesTradeExecution.DealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#Tick
 * Derivative.Tick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#ExercisePrice
 * Derivative.ExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
 * Issuance.OriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#SecuritiesPricing
 * Index.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#SubscriptionPrice
 * Warrant.SubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
 * SecuritiesConversion.ConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EndPrice
 * SecuritiesFinancing.EndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
 * BiddingConditions.MaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
 * BiddingConditions.MinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ScripDividendReinvestmentPricePerShare
 * TaxVoucher.ScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
 * CorporateActionPrice.CorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
 * CorporateActionPrice.CashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
 * CorporateActionPrice.PricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#SecuritiesPricing
 * AmountAndQuantity.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#SecuritiesPricing
 * AmountRatio.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkPrice
 * Spread.BenchmarkPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
 * SecuritiesOrder.OrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
 * SecuritiesOrder.StopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#RedemptionPrice
 * YieldCalculation.RedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#AllocatedPrice
 * Allocation.AllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#OfferPrice
 * Distribution.OfferPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#BuyInPrice
 * BuyIn.BuyInPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreviousClosingPrice
 * SecuritiesOrderParameters.PreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#PreviousClosingPrice
 * Quote.PreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#RequestedPrice
 * Quote.RequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#Price Quote.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MarketPrice
 * Quote.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#CashFractionsPrice
 * SecuritiesDistribution.CashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SubscriptionPrice
 * SecuritiesDistribution.SubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentPrice
 * SecuritiesDistribution.ReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#SecuritiesPricing
 * AnalyticsCalculation.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#RelatedSecuritiesPricing
 * DurationCalculation.RelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#SecuritiesPricing
 * LifeCalculation.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#StrikePrice
 * Entitlement.StrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#Price
 * Position.Price}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Price2#Value Price2.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#Proprietary
 * TransactionPrice3Choice.Proprietary}</li>
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
	/**
	 * Type of pricing calculation method.
	 * <p>
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
	public static final MMBusinessAttribute PriceMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}
	};
	/**
	 * Type and information about a price.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Price2#Type Price2.Type}</li>
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
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Price2.Type);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	/**
	 * Indicates whether the dividend is included, ie, cum-dividend, in the
	 * executed price. When the dividend is not included, the price will be
	 * ex-dividend.
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
	public static final MMBusinessAttribute CumDividendIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Ratio applied on the non-adjusted price.
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
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a change of price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceChange
	 * ValuationStatistics.PriceChange}</li>
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
	public static final MMBusinessAssociationEnd PriceChangeRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as a rate, ie, percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#Rate
	 * PriceRateOrAmountChoice.Rate}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceRateOrAmountChoice.Rate);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a highest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#HighestPriceValue
	 * ValuationStatistics.HighestPriceValue}</li>
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
	public static final MMBusinessAssociationEnd HighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Valuation statistics for which a lowest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#LowestPriceValue
	 * ValuationStatistics.LowestPriceValue}</li>
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
	public static final MMBusinessAssociationEnd LowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the security for which a price is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Pricing
	 * Security.Pricing}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Pricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade execution for which a deal price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
	 * SecuritiesTradeExecution.DealPrice}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the price is expressed as a yield (yield is the annual
	 * rate of return expressed as a percentage).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#Yielded
	 * YieldedOrValueType1Choice.Yielded}</li>
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
	public static final MMBusinessAttribute Yielded = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.YieldedOrValueType1Choice.Yielded);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#ValueType
	 * YieldedOrValueType1Choice.ValueType}</li>
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
	public static final MMBusinessAttribute TypeOfRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.YieldedOrValueType1Choice.ValueType);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	/**
	 * Derivative for which an exercise price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#ExercisePrice
	 * Derivative.ExercisePrice}</li>
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
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.ExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Warrant for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#SubscriptionPrice
	 * Warrant.SubscriptionPrice}</li>
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
	public static final MMBusinessAssociationEnd RelatedWarrant = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			type_lazy = () -> Warrant.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
	 * SecuritiesConversion.ConversionPrice}</li>
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
	public static final MMBusinessAssociationEnd RelatedSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#LotPrice
	 * LotBreakdown.LotPrice}</li>
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
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
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
	public static final MMBusinessAttribute TypeOfAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}
	};
	/**
	 * Corporate action event for which an exercise price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
	 * CorporateActionPrice.CorporateActionExercisePrice}</li>
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
	public static final MMBusinessAssociationEnd ExercisePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a generic cash price received per
	 * product is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
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
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as an amount per a quantity of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#SecuritiesPricing
	 * AmountAndQuantity.SecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd AmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as an amount per another amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#SecuritiesPricing
	 * AmountRatio.SecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd AmountPricePerAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRatio.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a generic cash price paid per product is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
	 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
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
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the price of a security is determined (For outturn
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceCalculationRelatedPricing
	 * DateTimePeriod.PriceCalculationRelatedPricing}</li>
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
	public static final MMBusinessAssociationEnd PriceCalculationPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a cash in lieu of share price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
	 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
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
	public static final MMBusinessAssociationEnd CashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which an over subscription deposit price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
	 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
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
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a cash value has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
	 * CorporateActionPrice.CashValueForTax}</li>
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
	public static final MMBusinessAssociationEnd CashValueForTaxRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
	 * BiddingConditions.MaximumPrice}</li>
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
	public static final MMBusinessAssociationEnd MaximumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a minimum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
	 * BiddingConditions.MinimumPrice}</li>
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
	public static final MMBusinessAssociationEnd MinimumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the price is obtained.
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
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate of return on an investment, based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#RedemptionPrice
	 * YieldCalculation.RedemptionPrice}</li>
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
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.RedemptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities financing process for which an end price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EndPrice
	 * SecuritiesFinancing.EndPrice}</li>
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
	public static final MMBusinessAssociationEnd RelatedSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.EndPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund order for which an executed price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
	 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
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
	public static final MMBusinessAssociationEnd FundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund order for which an informative price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
	 * InvestmentFundOrderExecution.InformativePrice}</li>
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
	public static final MMBusinessAssociationEnd FundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which the cost per share is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ScripDividendReinvestmentPricePerShare
	 * TaxVoucher.ScripDividendReinvestmentPricePerShare}</li>
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
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which the trade price is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
	 * SecuritiesTrade.TradePrice}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value calculation for which a securities pricing is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Price
	 * NetAssetValueCalculation.Price}</li>
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
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * BuyIn process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#BuyInPrice
	 * BuyIn.BuyInPrice}</li>
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
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.BuyInPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the index information when used for calculating the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#SecuritiesPricing
	 * Index.SecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which provided the pricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#Price
	 * InformationPartyRole.Price}</li>
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
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the price fact type is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceFactRelatedPricing
	 * DateTimePeriod.PriceFactRelatedPricing}</li>
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
	public static final MMBusinessAssociationEnd PriceFactPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated analytics based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#SecuritiesPricing
	 * AnalyticsCalculation.SecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd AnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated duration based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#RelatedSecuritiesPricing
	 * DurationCalculation.RelatedSecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated life based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#SecuritiesPricing
	 * LifeCalculation.SecuritiesPricing}</li>
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
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time of the price. For CIV, this is the NAV date.
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
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Spread which uses the price as benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#BenchmarkPrice
	 * Spread.BenchmarkPrice}</li>
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
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
	 * SecuritiesOrder.OrderPrice}</li>
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
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a stop price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
	 * SecuritiesOrder.StopPrice}</li>
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
	public static final MMBusinessAssociationEnd StopPriceOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.StopPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedPrice
	 * Allocation.AllocatedPrice}</li>
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
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a previous closing price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreviousClosingPrice
	 * SecuritiesOrderParameters.PreviousClosingPrice}</li>
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
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a discount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
	 * Issuance.OriginalIssueDiscount}</li>
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
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.OriginalIssueDiscount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entitlement for which a strike price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#StrikePrice
	 * Entitlement.StrikePrice}</li>
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
	public static final MMBusinessAssociationEnd Entitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entitlement.StrikePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a cash fractions price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#CashFractionsPrice
	 * SecuritiesDistribution.CashFractionsPrice}</li>
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
	public static final MMBusinessAssociationEnd CashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SubscriptionPrice
	 * SecuritiesDistribution.SubscriptionPrice}</li>
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
	public static final MMBusinessAssociationEnd SuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a reinvestment price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentPrice
	 * SecuritiesDistribution.ReinvestmentPrice}</li>
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
	public static final MMBusinessAssociationEnd ReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract for which a tick is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Derivative#Tick
	 * Derivative.Tick}</li>
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
	public static final MMBusinessAssociationEnd RelatedFuture = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.Tick;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution for which an offer price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#OfferPrice
	 * Distribution.OfferPrice}</li>
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
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.OfferPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption schedule for which a change in price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChange
	 * RedemptionSchedule.PriceChange}</li>
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
	public static final MMBusinessAssociationEnd PriceChangeRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption schedule for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#Price
	 * RedemptionSchedule.Price}</li>
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
	public static final MMBusinessAssociationEnd RelatedRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a previous closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#PreviousClosingPrice
	 * Quote.PreviousClosingPrice}</li>
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
	public static final MMBusinessAssociationEnd PreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a requested price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#RequestedPrice
	 * Quote.RequestedPrice}</li>
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
	public static final MMBusinessAssociationEnd RequestedPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.RequestedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#Price
	 * Quote.Price}</li>
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
	public static final MMBusinessAssociationEnd PriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MarketPrice
	 * Quote.MarketPrice}</li>
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
	public static final MMBusinessAssociationEnd MarketPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MarketPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#SecuritiesPricing
	 * Price.SecuritiesPricing}</li>
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
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#Amount
	 * PriceRateOrAmountChoice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#DealPrice
	 * TransactionPrice3Choice.DealPrice}</li>
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
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceRateOrAmountChoice.Amount, com.tools20022.repository.choice.TransactionPrice3Choice.DealPrice);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action price for which pricing information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
	 * CorporateActionPrice.PricingCalculation}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Position for which a price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Position#Price
	 * Position.Price}</li>
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
	public static final MMBusinessAssociationEnd RelatedPosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.InformationPartyRole.Price, com.tools20022.repository.entity.NetAssetValueCalculation.Price,
						com.tools20022.repository.entity.RedemptionSchedule.PriceChange, com.tools20022.repository.entity.RedemptionSchedule.Price, com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing, com.tools20022.repository.entity.SecuritiesTrade.TradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice, com.tools20022.repository.entity.LotBreakdown.LotPrice, com.tools20022.repository.entity.Price.SecuritiesPricing,
						com.tools20022.repository.entity.ValuationStatistics.PriceChange, com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue, com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice, com.tools20022.repository.entity.Derivative.Tick, com.tools20022.repository.entity.Derivative.ExercisePrice,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Index.SecuritiesPricing, com.tools20022.repository.entity.Warrant.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesFinancing.EndPrice, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct, com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice,
						com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice, com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax,
						com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation, com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing, com.tools20022.repository.entity.AmountRatio.SecuritiesPricing,
						com.tools20022.repository.entity.Spread.BenchmarkPrice, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice, com.tools20022.repository.entity.SecuritiesOrder.StopPrice,
						com.tools20022.repository.entity.YieldCalculation.RedemptionPrice, com.tools20022.repository.entity.Allocation.AllocatedPrice, com.tools20022.repository.entity.Distribution.OfferPrice,
						com.tools20022.repository.entity.BuyIn.BuyInPrice, com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice, com.tools20022.repository.entity.Quote.PreviousClosingPrice,
						com.tools20022.repository.entity.Quote.RequestedPrice, com.tools20022.repository.entity.Quote.Price, com.tools20022.repository.entity.Quote.MarketPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice, com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing,
						com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing, com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing, com.tools20022.repository.entity.Entitlement.StrikePrice,
						com.tools20022.repository.entity.Position.Price);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Price2.Value, com.tools20022.repository.choice.TransactionPrice3Choice.Proprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.PriceMethod, com.tools20022.repository.entity.SecuritiesPricing.PriceType,
						com.tools20022.repository.entity.SecuritiesPricing.CumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.CalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.Rate,
						com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.Yielded,
						com.tools20022.repository.entity.SecuritiesPricing.TypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.Derivative, com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.TypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.QuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.YieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.Index, com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation, com.tools20022.repository.entity.SecuritiesPricing.DurationCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.LifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.Date, com.tools20022.repository.entity.SecuritiesPricing.Spread,
						com.tools20022.repository.entity.SecuritiesPricing.Order, com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.SecuritiesPricing.Allocation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Entitlement,
						com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.RelatedFuture,
						com.tools20022.repository.entity.SecuritiesPricing.Distribution, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.PreviousClosingPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.RequestedPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.PriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.MarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.Price, com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedPosition);
				derivationComponent_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmObject(), PriceRateOrAmountChoice.mmObject(), Price2.mmObject(), TransactionPrice3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}