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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Time span defined by a start date and time, and an end date and time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DateTimePeriod" src="doc-files/DateTimePeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#FromDateTime
 * DateTimePeriod.FromDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#ToDateTime
 * DateTimePeriod.ToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingOrder
 * DateTimePeriod.RelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PaymentInstruction
 * DateTimePeriod.PaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#NumberOfDays
 * DateTimePeriod.NumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ValuationStatistics
 * DateTimePeriod.ValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PerformanceFactors
 * DateTimePeriod.PerformanceFactors}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Status
 * DateTimePeriod.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceCalculationRelatedPricing
 * DateTimePeriod.PriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CorporateActionOption
 * DateTimePeriod.CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ParallelTradingProceedsDefinition
 * DateTimePeriod.ParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PrivilegeSuspensionCorporateAction
 * DateTimePeriod.PrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInterestCalculation
 * DateTimePeriod.RelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BiddingConditions
 * DateTimePeriod.BiddingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#ClassAction
 * DateTimePeriod.ClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.BookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.DepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositSuspensionRelatedEvent
 * DateTimePeriod.DepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PledgeSuspensionRelatedEvent
 * DateTimePeriod.PledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SegregationPeriodRelatedEvent
 * DateTimePeriod.SegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookClosureCorporateAction
 * DateTimePeriod.BookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.CoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExtendiblePeriodDebt
 * DateTimePeriod.ExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SecuritiesConversion
 * DateTimePeriod.SecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#YieldCalculation
 * DateTimePeriod.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CustomDateDebt
 * DateTimePeriod.CustomDateDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#TaxPeriod
 * DateTimePeriod.TaxPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Account
 * DateTimePeriod.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAgreement
 * DateTimePeriod.RelatedAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssentedLinePeriodProceedsDefinition
 * DateTimePeriod.AssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SellThruIssuerProceedsDefinition
 * DateTimePeriod.SellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedProductDelivery
 * DateTimePeriod.RelatedProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvoice
 * DateTimePeriod.RelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradeCertificate
 * DateTimePeriod.TradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPortfolioValuation
 * DateTimePeriod.RelatedPortfolioValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#System
 * DateTimePeriod.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AccountRestriction
 * DateTimePeriod.AccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BankOperation
 * DateTimePeriod.BankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedCorporateAction
 * DateTimePeriod.RelatedCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedLimit
 * DateTimePeriod.RelatedLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedIdentification
 * DateTimePeriod.RelatedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssessmentValidityScheme
 * DateTimePeriod.AssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExercisePeriodDistribution
 * DateTimePeriod.ExercisePeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#OfferPeriodDistribution
 * DateTimePeriod.OfferPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingPeriodDistribution
 * DateTimePeriod.TradingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BlockingPeriodDistribution
 * DateTimePeriod.BlockingPeriodDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Guarantee
 * DateTimePeriod.Guarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceFactRelatedPricing
 * DateTimePeriod.PriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CashDistribution
 * DateTimePeriod.CashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ComponentSecurity
 * DateTimePeriod.ComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingSession
 * DateTimePeriod.TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#FinancialInstrumentSwap
 * DateTimePeriod.FinancialInstrumentSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPostalAddress
 * DateTimePeriod.RelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RedemptionSchedule
 * DateTimePeriod.RedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAccountLink
 * DateTimePeriod.RelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAdjustment
 * DateTimePeriod.RelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesIdentification
 * DateTimePeriod.RelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingSettlementInstruction
 * DateTimePeriod.RelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesRegistration
 * DateTimePeriod.RelatedSecuritiesRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Amount
 * DateTimePeriod.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvestmentPlan
 * DateTimePeriod.RelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Issuance
 * DateTimePeriod.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPaymentTerms
 * DateTimePeriod.RelatedPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Percentage
 * DateTimePeriod.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedRolePlayer
 * DateTimePeriod.RelatedRolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSystemAvailability
 * DateTimePeriod.RelatedSystemAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ValidityPeriod
 * SecuritiesIdentification.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceCalculationPeriod
 * SecuritiesPricing.PriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceFactPeriod
 * SecuritiesPricing.PriceFactPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#ValidityPeriod
 * RolePlayer.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#ValidityPeriod
 * PostalAddress.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#ValidityPeriod
 * PartyIdentificationInformation.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ReportedPeriod
 * Account.ReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#EffectivePeriod
 * RedemptionSchedule.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#AssessmentValidityPeriod
 * Scheme.AssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#ValidityTime
 * Status.ValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#ValidityPeriod
 * Agreement.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#EffectivePeriod
 * Adjustment.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#InvestmentPeriod
 * InvestmentPlan.InvestmentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ProcessingValidityTime
 * PaymentInstruction.ProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#VersionValidityPeriod
 * System.VersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#ValidityPeriod
 * Limit.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#ValidityPeriod
 * StandingOrder.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ValuationStatistics#Period
 * ValuationStatistics.Period}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#AccumulationPeriod
 * PerformanceFactors.AccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#ValidityPeriod
 * AccountRestriction.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#ClosurePeriod
 * SystemAvailability.ClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestPeriod
 * InterestCalculation.InterestPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendiblePeriod
 * Debt.ExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CustomDate
 * Debt.CustomDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#SubscriptionPeriod
 * Issuance.SubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPeriod
 * SecuritiesConversion.ConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#ValidityPeriod
 * StandingSettlementInstruction.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SplitPeriod
 * BasicSecuritiesRegistration.SplitPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BookClosurePeriod
 * CorporateActionEvent.BookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingPeriod
 * CorporateActionEvent.TradingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#ClaimPeriod
 * ClassAction.ClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ActionPeriod
 * CorporateActionOption.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ParallelTradingPeriod
 * SecuritiesProceedsDefinition.ParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AssentedLinePeriod
 * SecuritiesProceedsDefinition.AssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SellThruIssuerPeriod
 * SecuritiesProceedsDefinition.SellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CompulsoryPurchasePeriod
 * BiddingConditions.CompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#PrivilegeSuspensionPeriod
 * SuspensionPeriod.PrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.DepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForPledge
 * SuspensionPeriod.DepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.DepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CoDepositoriesSuspensionPeriod
 * SuspensionPeriod.CoDepositoriesSuspensionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#TimeBracket
 * TradingSession.TimeBracket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#ValuePeriod
 * YieldCalculation.ValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#ApplicablePeriod
 * BankOperation.ApplicablePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#PeriodCovered
 * Invoice.PeriodCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#FromToDate
 * TaxPeriod.FromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#ExercisePeriod
 * Distribution.ExercisePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#OfferPeriod
 * Distribution.OfferPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#TradingPeriod
 * Distribution.TradingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#BlockingPeriod
 * Distribution.BlockingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#InterestPeriod
 * Distribution.InterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#DeliveryPeriod
 * ProductDelivery.DeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#InspectionDate
 * TradeCertificate.InspectionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#EffectivePeriod
 * Guarantee.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#ValuationPeriod
 * PortfolioValuation.ValuationPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#ValidityPeriod
 * AccountLink.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#SeparationPeriod
 * ComponentSecurity.SeparationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#Maturity
 * FinancialInstrumentSwap.Maturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndPeriod#Period
 * AmountAndPeriod.Period}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#PaymentPeriod
 * PaymentTerms.PaymentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PercentageAndPeriod#Period
 * PercentageAndPeriod.Period}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#ReportingPeriod
 * ReportingRequest3.ReportingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#Date
 * Period4Choice.Date}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period4Choice#FromDateToDate
 * Period4Choice.FromDateToDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails
 * DatePeriodDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
 * DateTimePeriodDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails1
 * DatePeriodDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod1
 * ReportingPeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice Period4Choice}
 * </li>
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
 * "DateTimePeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Time span defined by a start date and time, and an end date and time."</li>
 * </ul>
 */
public class DateTimePeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which the range starts.
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
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails#FromDate
	 * DatePeriodDetails.FromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#FromDateTime
	 * DateTimePeriodDetails.FromDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#FromDate
	 * Period2.FromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1#FromDate
	 * DatePeriodDetails1.FromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#ValidFrom
	 * Restriction1.ValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#StartDate
	 * OperationMandate2.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#StartDate
	 * OperationMandate3.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#FromToDate
	 * ReportingPeriod1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#FromToTime
	 * ReportingPeriod1.FromToTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#FromDate
	 * DatePeriod1.FromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#FromDate
	 * Period4Choice.FromDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range starts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FromDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.FromDate, com.tools20022.repository.msg.DateTimePeriodDetails.FromDateTime, com.tools20022.repository.msg.Period2.FromDate,
					com.tools20022.repository.msg.DatePeriodDetails1.FromDate, com.tools20022.repository.msg.Restriction1.ValidFrom, com.tools20022.repository.msg.OperationMandate2.StartDate,
					com.tools20022.repository.msg.OperationMandate3.StartDate, com.tools20022.repository.msg.ReportingPeriod1.FromToDate, com.tools20022.repository.msg.ReportingPeriod1.FromToTime,
					com.tools20022.repository.msg.DatePeriod1.FromDate, com.tools20022.repository.choice.Period4Choice.FromDate);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which the range ends.
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
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails#ToDate
	 * DatePeriodDetails.ToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#ToDateTime
	 * DateTimePeriodDetails.ToDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#ToDate
	 * Period2.ToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails1#ToDate
	 * DatePeriodDetails1.ToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#ValidUntil
	 * Restriction1.ValidUntil}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate2#EndDate
	 * OperationMandate2.EndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate3#EndDate
	 * OperationMandate3.EndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#ToDate
	 * DatePeriod1.ToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#ToDate
	 * Period4Choice.ToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range ends."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ToDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.ToDate, com.tools20022.repository.msg.DateTimePeriodDetails.ToDateTime, com.tools20022.repository.msg.Period2.ToDate,
					com.tools20022.repository.msg.DatePeriodDetails1.ToDate, com.tools20022.repository.msg.Restriction1.ValidUntil, com.tools20022.repository.msg.OperationMandate2.EndDate,
					com.tools20022.repository.msg.OperationMandate3.EndDate, com.tools20022.repository.msg.DatePeriod1.ToDate, com.tools20022.repository.choice.Period4Choice.ToDate);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Standing order for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#ValidityPeriod
	 * StandingOrder.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment instruction for which a processing validity time is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ProcessingValidityTime
	 * PaymentInstruction.ProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction for which a processing validity time is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstruction";
			definition = "Payment instruction for which a processing validity time is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period specified as a number of days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Days
	 * BalanceAdjustment1.Days}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period specified as a number of days."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.Days);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDays";
			definition = "Period specified as a number of days.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a reference period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#Period
	 * ValuationStatistics.Period}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a reference period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValuationStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Valuation statistics for which a reference period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Performance factors for which an accumulation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#AccumulationPeriod
	 * PerformanceFactors.AccumulationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerformanceFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Performance factors for which an accumulation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PerformanceFactors = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerformanceFactors";
			definition = "Performance factors for which an accumulation period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status for which a validity time is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#ValidityTime
	 * Status.ValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status for which a validity time is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a validity time is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Status.ValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities pricing for which a price calculation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceCalculationPeriod
	 * SecuritiesPricing.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationRelatedPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities pricing for which a price calculation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceCalculationRelatedPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationRelatedPricing";
			definition = "Securities pricing for which a price calculation period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action option for which an action period is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ActionPeriod
	 * CorporateActionOption.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action option for which an action period is defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Corporate action option for which an action period is defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.ActionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a parallel trading period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ParallelTradingPeriod
	 * SecuritiesProceedsDefinition.ParallelTradingPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a parallel trading period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ParallelTradingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingProceedsDefinition";
			definition = "Securities proceeds for which a parallel trading period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a privilege suspension period has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#PrivilegeSuspensionPeriod
	 * SuspensionPeriod.PrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a privilege suspension period has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PrivilegeSuspensionCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionCorporateAction";
			definition = "Corporate event for which a privilege suspension period has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawal
	 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd WithdrawalSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest calculation process for which an interest period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestPeriod
	 * InterestCalculation.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation process for which an interest period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInterestCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestCalculation";
			definition = "Interest calculation process for which an interest period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.InterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a compulsory purchase period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CompulsoryPurchasePeriod
	 * BiddingConditions.CompulsoryPurchasePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a compulsory purchase period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions for which a compulsory purchase period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Class action for which a claim period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#ClaimPeriod
	 * ClassAction.ClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Class action for which a claim period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClassAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassAction";
			definition = "Class action for which a claim period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.ClaimPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for book entry transfers is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForBookEntryTransfer
	 * SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntryTransferSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for book entry transfers is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookEntryTransferSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntryTransferSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for book entry transfers is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for deposits at agent is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDepositAtAgent
	 * SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAtAgentSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for deposits at agent is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits at agent is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for deposits is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDeposit
	 * SuspensionPeriod.DepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for deposits is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for pledges is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForPledge
	 * SuspensionPeriod.DepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for pledges is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PledgeSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PledgeSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for pledges is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for segregation is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForSegregation
	 * SuspensionPeriod.DepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregationPeriodRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for segregation is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SegregationPeriodRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregationPeriodRelatedEvent";
			definition = "Corporate event for which a suspension period for segregation is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals at agent is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalAtAgent
	 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAtAgentSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals at agent is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd WithdrawalAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals at agent is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals in nominee
	 * name is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInNomineeName
	 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInNomineeNameSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals in nominee name is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd WithdrawalInNomineeNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInNomineeNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in nominee name is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals in street
	 * name is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInStreetName
	 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInStreetNameSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals in street name is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd WithdrawalInStreetNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInStreetNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in street name is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which a book closure period has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BookClosurePeriod
	 * CorporateActionEvent.BookClosurePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosureCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which a book closure period has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookClosureCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosureCorporateAction";
			definition = "Corporate action for which a book closure period has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a suspension period for co-depositories is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CoDepositoriesSuspensionPeriod
	 * SuspensionPeriod.CoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for co-depositories is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CoDepositoriesSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for co-depositories is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which an extendible period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#ExtendiblePeriod
	 * Debt.ExtendiblePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriodDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which an extendible period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExtendiblePeriodDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriodDebt";
			definition = "Debt for which an extendible period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.ExtendiblePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPeriod
	 * SecuritiesConversion.ConversionPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Securities conversion process for which a conversion period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Yield calculation for which a value period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#ValuePeriod
	 * YieldCalculation.ValuePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation for which a value period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a value period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.ValuePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a custom date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Debt#CustomDate
	 * Debt.CustomDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a custom date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CustomDateDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDateDebt";
			definition = "Debt for which a custom date is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.CustomDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax period for which a from/to date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPeriod#FromToDate
	 * TaxPeriod.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPeriod TaxPeriod}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax period for which a from/to date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPeriod";
			definition = "Tax period for which a from/to date is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPeriod.FromToDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account for which a reported period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#ReportedPeriod
	 * Account.ReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a reported period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reported period is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ReportedPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#ValidityPeriod
	 * Agreement.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Agreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which an assented line period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AssentedLinePeriod
	 * SecuritiesProceedsDefinition.AssentedLinePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLinePeriodProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an assented line period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssentedLinePeriodProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriodProceedsDefinition";
			definition = "Securities proceeds for which an assented line period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a sell thru issuer period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SellThruIssuerPeriod
	 * SecuritiesProceedsDefinition.SellThruIssuerPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellThruIssuerProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a sell thru issuer period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SellThruIssuerProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerProceedsDefinition";
			definition = "Securities proceeds for which a sell thru issuer period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade delivery process for which a delivery period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#DeliveryPeriod
	 * ProductDelivery.DeliveryPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade delivery process for which a delivery period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProductDelivery";
			definition = "Trade delivery process for which a delivery period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invoice for which a period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#PeriodCovered
	 * Invoice.PeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which a period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.PeriodCovered;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade certificate for which an inspection date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#InspectionDate
	 * TradeCertificate.InspectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade certificate for which an inspection date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Trade certificate for which an inspection date is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.InspectionDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Portfolio valuation process for which a valuation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#ValuationPeriod
	 * PortfolioValuation.ValuationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio valuation process for which a valuation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioValuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioValuation";
			definition = "Portfolio valuation process for which a valuation period is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#VersionValidityPeriod
	 * System.VersionValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.VersionValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account restriction for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#ValidityPeriod
	 * AccountRestriction.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account restriction for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountRestriction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Account restriction for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bank operation for which an applicable period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#ApplicablePeriod
	 * BankOperation.ApplicablePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankOperation
	 * BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank operation for which an applicable period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which an applicable period is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.ApplicablePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a trading period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingPeriod
	 * CorporateActionEvent.TradingPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a trading period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action event for which a trading period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Limit for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#ValidityPeriod
	 * Limit.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLimit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimit";
			definition = "Limit for which a validity period is specified.";
			minOccurs = 0;
			type_lazy = () -> Limit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party identification for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#ValidityPeriod
	 * PartyIdentificationInformation.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identification for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIdentification";
			definition = "Party identification for which a validity period is specified.";
			minOccurs = 0;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Scheme for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#AssessmentValidityPeriod
	 * Scheme.AssessmentValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssessmentValidityScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssessmentValidityScheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityScheme";
			definition = "Scheme for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an exercise period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#ExercisePeriod
	 * Distribution.ExercisePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an exercise period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExercisePeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriodDistribution";
			definition = "Cash and securities distribution information for which an exercise period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.ExercisePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an offer period is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#OfferPeriod
	 * Distribution.OfferPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an offer period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OfferPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPeriodDistribution";
			definition = "Cash and securities distribution information for which an offer period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.OfferPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a trading period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#TradingPeriod
	 * Distribution.TradingPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a trading period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriodDistribution";
			definition = "Cash and securities distribution information for which a trading period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.TradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a blocking period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#BlockingPeriod
	 * Distribution.BlockingPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a blocking period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BlockingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriodDistribution";
			definition = "Cash and securities distribution information for which a blocking period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.BlockingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Guarantee for which an effective period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#EffectivePeriod
	 * Guarantee.EffectivePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee for which an effective period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee for which an effective period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities pricing for which a price fact period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceFactPeriod
	 * SecuritiesPricing.PriceFactPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactRelatedPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities pricing for which a price fact period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceFactRelatedPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactRelatedPricing";
			definition = "Securities pricing for which a price fact period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash distribution for which an interest period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#InterestPeriod
	 * Distribution.InterestPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution for which an interest period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution for which an interest period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.InterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security component for which a separation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#SeparationPeriod
	 * ComponentSecurity.SeparationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security component for which a separation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ComponentSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "Security component for which a separation period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trading session for which a time bracket is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#TimeBracket
	 * TradingSession.TimeBracket}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading session for which a time bracket is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session for which a time bracket is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.TimeBracket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Swap for which a maturity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#Maturity
	 * FinancialInstrumentSwap.Maturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a maturity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialInstrumentSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentSwap";
			definition = "Swap for which a maturity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Postal address for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#ValidityPeriod
	 * PostalAddress.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPostalAddress = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption schedule for which a notice period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#EffectivePeriod
	 * RedemptionSchedule.EffectivePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a notice period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "Redemption schedule for which a notice period is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Link between two accounts for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#ValidityPeriod
	 * AccountLink.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link between two accounts for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountLink";
			definition = "Link between two accounts for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountLink.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Adjustment for which a validity period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#EffectivePeriod
	 * Adjustment.EffectivePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment for which a validity period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAdjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAdjustment";
			definition = "Adjustment for which a validity period is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities identification for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ValidityPeriod
	 * SecuritiesIdentification.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which a validity period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * SSI for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#ValidityPeriod
	 * StandingSettlementInstruction.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SSI for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStandingSettlementInstruction";
			definition = "SSI for which a validity period is specified.";
			minOccurs = 0;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities registration process for which a split period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SplitPeriod
	 * BasicSecuritiesRegistration.SplitPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities registration process for which a split period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesRegistration";
			definition = "Securities registration process for which a split period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Relationship with an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndPeriod#Period
	 * AmountAndPeriod.Period}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndPeriod
	 * AmountAndPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relationship with an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Amount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Relationship with an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndPeriod.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * InvestmentPlan for which an investment period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#InvestmentPeriod
	 * InvestmentPlan.InvestmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InvestmentPlan for which an investment period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "InvestmentPlan for which an investment period is specified.";
			minOccurs = 0;
			type_lazy = () -> InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which subscription information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#SubscriptionPeriod
	 * Issuance.SubscriptionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which subscription information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which subscription information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.SubscriptionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment terms for which a period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#PaymentPeriod
	 * PaymentTerms.PaymentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terms for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentTerms";
			definition = "Payment terms for which a period is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentTerms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.PaymentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Relationship with a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PercentageAndPeriod#Period
	 * PercentageAndPeriod.Period}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PercentageAndPeriod
	 * PercentageAndPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relationship with a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Percentage = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Relationship with a percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PercentageAndPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PercentageAndPeriod.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role player for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#ValidityPeriod
	 * RolePlayer.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RolePlayer
	 * RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRolePlayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role player for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRolePlayer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRolePlayer";
			definition = "Role player for which a validity period is specified.";
			minOccurs = 0;
			type_lazy = () -> RolePlayer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System availability for which the closure period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#ClosurePeriod
	 * SystemAvailability.ClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System availability for which the closure period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSystemAvailability = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSystemAvailability";
			definition = "System availability for which the closure period is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.ClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriod";
				definition = "Time span defined by a start date and time, and an end date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod, com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod, com.tools20022.repository.entity.RolePlayer.ValidityPeriod, com.tools20022.repository.entity.PostalAddress.ValidityPeriod,
						com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod, com.tools20022.repository.entity.Account.ReportedPeriod, com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod,
						com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod, com.tools20022.repository.entity.Status.ValidityTime, com.tools20022.repository.entity.Agreement.ValidityPeriod,
						com.tools20022.repository.entity.Adjustment.EffectivePeriod, com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod, com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime,
						com.tools20022.repository.entity.System.VersionValidityPeriod, com.tools20022.repository.entity.Limit.ValidityPeriod, com.tools20022.repository.entity.StandingOrder.ValidityPeriod,
						com.tools20022.repository.entity.ValuationStatistics.Period, com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod, com.tools20022.repository.entity.AccountRestriction.ValidityPeriod,
						com.tools20022.repository.entity.SystemAvailability.ClosurePeriod, com.tools20022.repository.entity.InterestCalculation.InterestPeriod, com.tools20022.repository.entity.Debt.ExtendiblePeriod,
						com.tools20022.repository.entity.Debt.CustomDate, com.tools20022.repository.entity.Issuance.SubscriptionPeriod, com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod, com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod, com.tools20022.repository.entity.ClassAction.ClaimPeriod,
						com.tools20022.repository.entity.CorporateActionOption.ActionPeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod,
						com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod, com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod,
						com.tools20022.repository.entity.TradingSession.TimeBracket, com.tools20022.repository.entity.YieldCalculation.ValuePeriod, com.tools20022.repository.entity.BankOperation.ApplicablePeriod,
						com.tools20022.repository.entity.Invoice.PeriodCovered, com.tools20022.repository.entity.TaxPeriod.FromToDate, com.tools20022.repository.entity.Distribution.ExercisePeriod,
						com.tools20022.repository.entity.Distribution.OfferPeriod, com.tools20022.repository.entity.Distribution.TradingPeriod, com.tools20022.repository.entity.Distribution.BlockingPeriod,
						com.tools20022.repository.entity.Distribution.InterestPeriod, com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod, com.tools20022.repository.entity.TradeCertificate.InspectionDate,
						com.tools20022.repository.entity.Guarantee.EffectivePeriod, com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod, com.tools20022.repository.entity.AccountLink.ValidityPeriod,
						com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod, com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity, com.tools20022.repository.entity.AmountAndPeriod.Period,
						com.tools20022.repository.entity.PaymentTerms.PaymentPeriod, com.tools20022.repository.entity.PercentageAndPeriod.Period);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingRequest3.ReportingPeriod, com.tools20022.repository.choice.Period4Choice.Date,
						com.tools20022.repository.choice.Period4Choice.FromDateToDate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.FromDateTime, com.tools20022.repository.entity.DateTimePeriod.ToDateTime,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder, com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction, com.tools20022.repository.entity.DateTimePeriod.NumberOfDays,
						com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics, com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.Status,
						com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption,
						com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation,
						com.tools20022.repository.entity.DateTimePeriod.BiddingConditions, com.tools20022.repository.entity.DateTimePeriod.ClassAction,
						com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion, com.tools20022.repository.entity.DateTimePeriod.YieldCalculation,
						com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt, com.tools20022.repository.entity.DateTimePeriod.TaxPeriod, com.tools20022.repository.entity.DateTimePeriod.Account,
						com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement, com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery,
						com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice, com.tools20022.repository.entity.DateTimePeriod.TradeCertificate, com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation,
						com.tools20022.repository.entity.DateTimePeriod.System, com.tools20022.repository.entity.DateTimePeriod.AccountRestriction, com.tools20022.repository.entity.DateTimePeriod.BankOperation,
						com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction, com.tools20022.repository.entity.DateTimePeriod.RelatedLimit, com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification,
						com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme, com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.Guarantee, com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.CashDistribution, com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.TradingSession,
						com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap, com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress, com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule,
						com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink, com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration,
						com.tools20022.repository.entity.DateTimePeriod.Amount, com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.Issuance,
						com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms, com.tools20022.repository.entity.DateTimePeriod.Percentage, com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer,
						com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability);
				derivationComponent_lazy = () -> Arrays.asList(DatePeriodDetails.mmObject(), DateTimePeriodDetails.mmObject(), Period2.mmObject(), DatePeriodDetails1.mmObject(), ReportingPeriod1.mmObject(), Period4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}