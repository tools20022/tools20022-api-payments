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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
 * DateTimePeriod.mmFromDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
 * DateTimePeriod.mmToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
 * DateTimePeriod.mmRelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
 * DateTimePeriod.mmPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
 * DateTimePeriod.mmNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmValuationStatistics
 * DateTimePeriod.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPerformanceFactors
 * DateTimePeriod.mmPerformanceFactors}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
 * DateTimePeriod.mmCorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmParallelTradingProceedsDefinition
 * DateTimePeriod.mmParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
 * DateTimePeriod.mmRelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
 * DateTimePeriod.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmClassAction
 * DateTimePeriod.mmClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
 * DateTimePeriod.mmBookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
 * DateTimePeriod.mmSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmYieldCalculation
 * DateTimePeriod.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
 * DateTimePeriod.mmCustomDateDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
 * DateTimePeriod.mmTaxPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
 * DateTimePeriod.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
 * DateTimePeriod.mmRelatedAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssentedLinePeriodProceedsDefinition
 * DateTimePeriod.mmAssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSellThruIssuerProceedsDefinition
 * DateTimePeriod.mmSellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
 * DateTimePeriod.mmRelatedProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvoice
 * DateTimePeriod.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradeCertificate
 * DateTimePeriod.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPortfolioValuation
 * DateTimePeriod.mmRelatedPortfolioValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
 * DateTimePeriod.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccountRestriction
 * DateTimePeriod.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBankOperation
 * DateTimePeriod.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
 * DateTimePeriod.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
 * DateTimePeriod.mmRelatedLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
 * DateTimePeriod.mmAssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExercisePeriodDistribution
 * DateTimePeriod.mmExercisePeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmOfferPeriodDistribution
 * DateTimePeriod.mmOfferPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingPeriodDistribution
 * DateTimePeriod.mmTradingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBlockingPeriodDistribution
 * DateTimePeriod.mmBlockingPeriodDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
 * DateTimePeriod.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCashDistribution
 * DateTimePeriod.mmCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmComponentSecurity
 * DateTimePeriod.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingSession
 * DateTimePeriod.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFinancialInstrumentSwap
 * DateTimePeriod.mmFinancialInstrumentSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
 * DateTimePeriod.mmRelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRedemptionSchedule
 * DateTimePeriod.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
 * DateTimePeriod.mmRelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
 * DateTimePeriod.mmRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAmount
 * DateTimePeriod.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvestmentPlan
 * DateTimePeriod.mmRelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmIssuance
 * DateTimePeriod.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPaymentTerms
 * DateTimePeriod.mmRelatedPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPercentage
 * DateTimePeriod.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedRolePlayer
 * DateTimePeriod.mmRelatedRolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSystemAvailability
 * DateTimePeriod.mmRelatedSystemAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
 * SecuritiesPricing.mmPriceFactPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmValidityPeriod
 * RolePlayer.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
 * PostalAddress.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
 * Account.mmReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmEffectivePeriod
 * RedemptionSchedule.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
 * Scheme.mmAssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
 * Agreement.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
 * Adjustment.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInvestmentPeriod
 * InvestmentPlan.mmInvestmentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
 * PaymentInstruction.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
 * System.mmVersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
 * Limit.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
 * StandingOrder.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
 * ValuationStatistics.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
 * PerformanceFactors.mmAccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmValidityPeriod
 * AccountRestriction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosurePeriod
 * SystemAvailability.mmClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
 * InterestCalculation.mmInterestPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
 * Debt.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
 * Debt.mmCustomDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmSubscriptionPeriod
 * Issuance.mmSubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
 * SecuritiesConversion.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
 * StandingSettlementInstruction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
 * CorporateActionEvent.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
 * CorporateActionEvent.mmTradingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
 * ClassAction.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
 * CorporateActionOption.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTimeBracket
 * TradingSession.mmTimeBracket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
 * YieldCalculation.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmApplicablePeriod
 * BankOperation.mmApplicablePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
 * Invoice.mmPeriodCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
 * TaxPeriod.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmExercisePeriod
 * Distribution.mmExercisePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPeriod
 * Distribution.mmOfferPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmTradingPeriod
 * Distribution.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmBlockingPeriod
 * Distribution.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmInterestPeriod
 * Distribution.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
 * ProductDelivery.mmDeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
 * TradeCertificate.mmInspectionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
 * Guarantee.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmValuationPeriod
 * PortfolioValuation.mmValuationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
 * AccountLink.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationPeriod
 * ComponentSecurity.mmSeparationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmMaturity
 * FinancialInstrumentSwap.mmMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndPeriod#mmPeriod
 * AmountAndPeriod.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
 * PaymentTerms.mmPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PercentageAndPeriod#mmPeriod
 * PercentageAndPeriod.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#mmDate
 * Period4Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period4Choice#mmFromDateToDate
 * Period4Choice.mmFromDateToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmReportingPeriod
 * ReportingRequest4.mmReportingPeriod}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.DateTimePeriod1
 * DateTimePeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod2
 * ReportingPeriod2}</li>
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
	protected ISODateTime fromDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails#mmFromDate
	 * DatePeriodDetails.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#mmFromDateTime
	 * DateTimePeriodDetails.mmFromDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#mmFromDate
	 * Period2.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1#mmFromDate
	 * DatePeriodDetails1.mmFromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#mmValidFrom
	 * Restriction1.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmStartDate
	 * OperationMandate2.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmStartDate
	 * OperationMandate3.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToDate
	 * ReportingPeriod1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToTime
	 * ReportingPeriod1.mmFromToTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#mmFromDate
	 * DatePeriod1.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Period4Choice#mmFromDate
	 * Period4Choice.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriod1#mmFromDateTime
	 * DateTimePeriod1.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmEstablishedDate
	 * Organisation20.mmEstablishedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRegistrationDate
	 * Organisation20.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPersonNameLong1#mmStartDate
	 * IndividualPersonNameLong1.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod2#mmFromDate
	 * DatePeriod2.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod2#mmFromToDate
	 * ReportingPeriod2.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod2#mmFromToTime
	 * ReportingPeriod2.mmFromToTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine3#mmDate
	 * CreditLine3.mmDate}</li>
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
	public static final MMBusinessAttribute<DateTimePeriod, ISODateTime> mmFromDateTime = new MMBusinessAttribute<DateTimePeriod, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(DatePeriodDetails.mmFromDate, DateTimePeriodDetails.mmFromDateTime, Period2.mmFromDate, DatePeriodDetails1.mmFromDate, Restriction1.mmValidFrom, OperationMandate2.mmStartDate,
					OperationMandate3.mmStartDate, ReportingPeriod1.mmFromToDate, ReportingPeriod1.mmFromToTime, DatePeriod1.mmFromDate, Period4Choice.mmFromDate, DateTimePeriod1.mmFromDateTime, Organisation20.mmEstablishedDate,
					Organisation20.mmRegistrationDate, IndividualPersonNameLong1.mmStartDate, DatePeriod2.mmFromDate, ReportingPeriod2.mmFromToDate, ReportingPeriod2.mmFromToTime, CreditLine3.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimePeriod obj) {
			return obj.getFromDateTime();
		}

		@Override
		public void setValue(DateTimePeriod obj, ISODateTime value) {
			obj.setFromDateTime(value);
		}
	};
	protected ISODateTime toDateTime;
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
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails#mmToDate
	 * DatePeriodDetails.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#mmToDateTime
	 * DateTimePeriodDetails.mmToDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#mmToDate
	 * Period2.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1#mmToDate
	 * DatePeriodDetails1.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#mmValidUntil
	 * Restriction1.mmValidUntil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmEndDate
	 * OperationMandate2.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmEndDate
	 * OperationMandate3.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#mmToDate
	 * DatePeriod1.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#mmToDate
	 * Period4Choice.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriod1#mmToDateTime
	 * DateTimePeriod1.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPersonNameLong1#mmEndDate
	 * IndividualPersonNameLong1.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod2#mmToDate
	 * DatePeriod2.mmToDate}</li>
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
	public static final MMBusinessAttribute<DateTimePeriod, ISODateTime> mmToDateTime = new MMBusinessAttribute<DateTimePeriod, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(DatePeriodDetails.mmToDate, DateTimePeriodDetails.mmToDateTime, Period2.mmToDate, DatePeriodDetails1.mmToDate, Restriction1.mmValidUntil, OperationMandate2.mmEndDate,
					OperationMandate3.mmEndDate, DatePeriod1.mmToDate, Period4Choice.mmToDate, DateTimePeriod1.mmToDateTime, IndividualPersonNameLong1.mmEndDate, DatePeriod2.mmToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimePeriod obj) {
			return obj.getToDateTime();
		}

		@Override
		public void setValue(DateTimePeriod obj, ISODateTime value) {
			obj.setToDateTime(value);
		}
	};
	protected StandingOrder relatedStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, StandingOrder> mmRelatedStandingOrder = new MMBusinessAssociationEnd<DateTimePeriod, StandingOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> StandingOrder.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}

		@Override
		public StandingOrder getValue(DateTimePeriod obj) {
			return obj.getRelatedStandingOrder();
		}

		@Override
		public void setValue(DateTimePeriod obj, StandingOrder value) {
			obj.setRelatedStandingOrder(value);
		}
	};
	protected PaymentInstruction paymentInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
	 * PaymentInstruction.mmProcessingValidityTime}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, PaymentInstruction> mmPaymentInstruction = new MMBusinessAssociationEnd<DateTimePeriod, PaymentInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentInstruction";
			definition = "Payment instruction for which a processing validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}

		@Override
		public PaymentInstruction getValue(DateTimePeriod obj) {
			return obj.getPaymentInstruction();
		}

		@Override
		public void setValue(DateTimePeriod obj, PaymentInstruction value) {
			obj.setPaymentInstruction(value);
		}
	};
	protected Number numberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmDays
	 * BalanceAdjustment1.mmDays}</li>
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
	public static final MMBusinessAttribute<DateTimePeriod, Number> mmNumberOfDays = new MMBusinessAttribute<DateTimePeriod, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAdjustment1.mmDays);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfDays";
			definition = "Period specified as a number of days.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(DateTimePeriod obj) {
			return obj.getNumberOfDays();
		}

		@Override
		public void setValue(DateTimePeriod obj, Number value) {
			obj.setNumberOfDays(value);
		}
	};
	protected ValuationStatistics valuationStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
	 * ValuationStatistics.mmPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, ValuationStatistics> mmValuationStatistics = new MMBusinessAssociationEnd<DateTimePeriod, ValuationStatistics>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Valuation statistics for which a reference period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ValuationStatistics.mmPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}

		@Override
		public ValuationStatistics getValue(DateTimePeriod obj) {
			return obj.getValuationStatistics();
		}

		@Override
		public void setValue(DateTimePeriod obj, ValuationStatistics value) {
			obj.setValuationStatistics(value);
		}
	};
	protected PerformanceFactors performanceFactors;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
	 * PerformanceFactors.mmAccumulationPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, PerformanceFactors> mmPerformanceFactors = new MMBusinessAssociationEnd<DateTimePeriod, PerformanceFactors>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerformanceFactors";
			definition = "Performance factors for which an accumulation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PerformanceFactors.mmAccumulationPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PerformanceFactors.mmObject();
		}

		@Override
		public PerformanceFactors getValue(DateTimePeriod obj) {
			return obj.getPerformanceFactors();
		}

		@Override
		public void setValue(DateTimePeriod obj, PerformanceFactors value) {
			obj.setPerformanceFactors(value);
		}
	};
	protected Status status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmValidityTime
	 * Status.mmValidityTime}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Status> mmStatus = new MMBusinessAssociationEnd<DateTimePeriod, Status>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Status.mmValidityTime;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Status.mmObject();
		}

		@Override
		public Status getValue(DateTimePeriod obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(DateTimePeriod obj, Status value) {
			obj.setStatus(value);
		}
	};
	protected SecuritiesPricing priceCalculationRelatedPricing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesPricing> mmPriceCalculationRelatedPricing = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationRelatedPricing";
			definition = "Securities pricing for which a price calculation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(DateTimePeriod obj) {
			return obj.getPriceCalculationRelatedPricing();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesPricing value) {
			obj.setPriceCalculationRelatedPricing(value);
		}
	};
	protected CorporateActionOption corporateActionOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, CorporateActionOption> mmCorporateActionOption = new MMBusinessAssociationEnd<DateTimePeriod, CorporateActionOption>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Corporate action option for which an action period is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionOption.mmActionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionOption.mmObject();
		}

		@Override
		public CorporateActionOption getValue(DateTimePeriod obj) {
			return obj.getCorporateActionOption();
		}

		@Override
		public void setValue(DateTimePeriod obj, CorporateActionOption value) {
			obj.setCorporateActionOption(value);
		}
	};
	protected SecuritiesProceedsDefinition parallelTradingProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition> mmParallelTradingProceedsDefinition = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingProceedsDefinition";
			definition = "Securities proceeds for which a parallel trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(DateTimePeriod obj) {
			return obj.getParallelTradingProceedsDefinition();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesProceedsDefinition value) {
			obj.setParallelTradingProceedsDefinition(value);
		}
	};
	protected SuspensionPeriod privilegeSuspensionCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
	 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmPrivilegeSuspensionCorporateAction = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionCorporateAction";
			definition = "Corporate event for which a privilege suspension period has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getPrivilegeSuspensionCorporateAction();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setPrivilegeSuspensionCorporateAction(value);
		}
	};
	protected SuspensionPeriod withdrawalSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmWithdrawalSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getWithdrawalSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setWithdrawalSuspensionRelatedEvent(value);
		}
	};
	protected InterestCalculation relatedInterestCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, InterestCalculation> mmRelatedInterestCalculation = new MMBusinessAssociationEnd<DateTimePeriod, InterestCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestCalculation";
			definition = "Interest calculation process for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestCalculation.mmInterestPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public InterestCalculation getValue(DateTimePeriod obj) {
			return obj.getRelatedInterestCalculation();
		}

		@Override
		public void setValue(DateTimePeriod obj, InterestCalculation value) {
			obj.setRelatedInterestCalculation(value);
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
	 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, BiddingConditions> mmBiddingConditions = new MMBusinessAssociationEnd<DateTimePeriod, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions for which a compulsory purchase period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmCompulsoryPurchasePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(DateTimePeriod obj) {
			return obj.getBiddingConditions();
		}

		@Override
		public void setValue(DateTimePeriod obj, BiddingConditions value) {
			obj.setBiddingConditions(value);
		}
	};
	protected ClassAction classAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
	 * ClassAction.mmClaimPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, ClassAction> mmClassAction = new MMBusinessAssociationEnd<DateTimePeriod, ClassAction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassAction";
			definition = "Class action for which a claim period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ClassAction.mmClaimPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClassAction.mmObject();
		}

		@Override
		public ClassAction getValue(DateTimePeriod obj) {
			return obj.getClassAction();
		}

		@Override
		public void setValue(DateTimePeriod obj, ClassAction value) {
			obj.setClassAction(value);
		}
	};
	protected SuspensionPeriod bookEntryTransferSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmBookEntryTransferSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntryTransferSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for book entry transfers is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getBookEntryTransferSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setBookEntryTransferSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod depositAtAgentSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmDepositAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getDepositAtAgentSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setDepositAtAgentSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod depositSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmDepositSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getDepositSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setDepositSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod pledgeSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmPledgeSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PledgeSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for pledges is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getPledgeSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setPledgeSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod segregationPeriodRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmSegregationPeriodRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SegregationPeriodRelatedEvent";
			definition = "Corporate event for which a suspension period for segregation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getSegregationPeriodRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setSegregationPeriodRelatedEvent(value);
		}
	};
	protected SuspensionPeriod withdrawalAtAgentSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmWithdrawalAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getWithdrawalAtAgentSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setWithdrawalAtAgentSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod withdrawalInNomineeNameSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmWithdrawalInNomineeNameSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInNomineeNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in nominee name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getWithdrawalInNomineeNameSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setWithdrawalInNomineeNameSuspensionRelatedEvent(value);
		}
	};
	protected SuspensionPeriod withdrawalInStreetNameSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmWithdrawalInStreetNameSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInStreetNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in street name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getWithdrawalInStreetNameSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setWithdrawalInStreetNameSuspensionRelatedEvent(value);
		}
	};
	protected CorporateActionEvent bookClosureCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
	 * CorporateActionEvent.mmBookClosurePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, CorporateActionEvent> mmBookClosureCorporateAction = new MMBusinessAssociationEnd<DateTimePeriod, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookClosureCorporateAction";
			definition = "Corporate action for which a book closure period has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmBookClosurePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(DateTimePeriod obj) {
			return obj.getBookClosureCorporateAction();
		}

		@Override
		public void setValue(DateTimePeriod obj, CorporateActionEvent value) {
			obj.setBookClosureCorporateAction(value);
		}
	};
	protected SuspensionPeriod coDepositoriesSuspensionRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
	 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod> mmCoDepositoriesSuspensionRelatedEvent = new MMBusinessAssociationEnd<DateTimePeriod, SuspensionPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for co-depositories is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SuspensionPeriod.mmCoDepositoriesSuspensionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public SuspensionPeriod getValue(DateTimePeriod obj) {
			return obj.getCoDepositoriesSuspensionRelatedEvent();
		}

		@Override
		public void setValue(DateTimePeriod obj, SuspensionPeriod value) {
			obj.setCoDepositoriesSuspensionRelatedEvent(value);
		}
	};
	protected Debt extendiblePeriodDebt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
	 * Debt.mmExtendiblePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Debt> mmExtendiblePeriodDebt = new MMBusinessAssociationEnd<DateTimePeriod, Debt>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriodDebt";
			definition = "Debt for which an extendible period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Debt.mmExtendiblePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}

		@Override
		public Debt getValue(DateTimePeriod obj) {
			return obj.getExtendiblePeriodDebt();
		}

		@Override
		public void setValue(DateTimePeriod obj, Debt value) {
			obj.setExtendiblePeriodDebt(value);
		}
	};
	protected SecuritiesConversion securitiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
	 * SecuritiesConversion.mmConversionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesConversion> mmSecuritiesConversion = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesConversion>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Securities conversion process for which a conversion period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesConversion.mmConversionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public SecuritiesConversion getValue(DateTimePeriod obj) {
			return obj.getSecuritiesConversion();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesConversion value) {
			obj.setSecuritiesConversion(value);
		}
	};
	protected YieldCalculation yieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
	 * YieldCalculation.mmValuePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, YieldCalculation> mmYieldCalculation = new MMBusinessAssociationEnd<DateTimePeriod, YieldCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a value period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> YieldCalculation.mmValuePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> YieldCalculation.mmObject();
		}

		@Override
		public YieldCalculation getValue(DateTimePeriod obj) {
			return obj.getYieldCalculation();
		}

		@Override
		public void setValue(DateTimePeriod obj, YieldCalculation value) {
			obj.setYieldCalculation(value);
		}
	};
	protected Debt customDateDebt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
	 * Debt.mmCustomDate}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Debt> mmCustomDateDebt = new MMBusinessAssociationEnd<DateTimePeriod, Debt>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomDateDebt";
			definition = "Debt for which a custom date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Debt.mmCustomDate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}

		@Override
		public Debt getValue(DateTimePeriod obj) {
			return obj.getCustomDateDebt();
		}

		@Override
		public void setValue(DateTimePeriod obj, Debt value) {
			obj.setCustomDateDebt(value);
		}
	};
	protected TaxPeriod taxPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
	 * TaxPeriod.mmFromToDate}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, TaxPeriod> mmTaxPeriod = new MMBusinessAssociationEnd<DateTimePeriod, TaxPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPeriod";
			definition = "Tax period for which a from/to date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TaxPeriod.mmFromToDate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxPeriod.mmObject();
		}

		@Override
		public TaxPeriod getValue(DateTimePeriod obj) {
			return obj.getTaxPeriod();
		}

		@Override
		public void setValue(DateTimePeriod obj, TaxPeriod value) {
			obj.setTaxPeriod(value);
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
	 * Account.mmReportedPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Optional<Account>> mmAccount = new MMBusinessAssociationEnd<DateTimePeriod, Optional<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reported period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Account.mmReportedPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Optional<Account> getValue(DateTimePeriod obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(DateTimePeriod obj, Optional<Account> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	protected Agreement relatedAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
	 * Agreement.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Agreement> mmRelatedAgreement = new MMBusinessAssociationEnd<DateTimePeriod, Agreement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Agreement.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}

		@Override
		public Agreement getValue(DateTimePeriod obj) {
			return obj.getRelatedAgreement();
		}

		@Override
		public void setValue(DateTimePeriod obj, Agreement value) {
			obj.setRelatedAgreement(value);
		}
	};
	protected SecuritiesProceedsDefinition assentedLinePeriodProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
	 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition> mmAssentedLinePeriodProceedsDefinition = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriodProceedsDefinition";
			definition = "Securities proceeds for which an assented line period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmAssentedLinePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(DateTimePeriod obj) {
			return obj.getAssentedLinePeriodProceedsDefinition();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesProceedsDefinition value) {
			obj.setAssentedLinePeriodProceedsDefinition(value);
		}
	};
	protected SecuritiesProceedsDefinition sellThruIssuerProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
	 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition> mmSellThruIssuerProceedsDefinition = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerProceedsDefinition";
			definition = "Securities proceeds for which a sell thru issuer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmSellThruIssuerPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(DateTimePeriod obj) {
			return obj.getSellThruIssuerProceedsDefinition();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesProceedsDefinition value) {
			obj.setSellThruIssuerProceedsDefinition(value);
		}
	};
	protected ProductDelivery relatedProductDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
	 * ProductDelivery.mmDeliveryPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, ProductDelivery> mmRelatedProductDelivery = new MMBusinessAssociationEnd<DateTimePeriod, ProductDelivery>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProductDelivery";
			definition = "Trade delivery process for which a delivery period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductDelivery.mmDeliveryPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}

		@Override
		public ProductDelivery getValue(DateTimePeriod obj) {
			return obj.getRelatedProductDelivery();
		}

		@Override
		public void setValue(DateTimePeriod obj, ProductDelivery value) {
			obj.setRelatedProductDelivery(value);
		}
	};
	protected Invoice relatedInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Invoice> mmRelatedInvoice = new MMBusinessAssociationEnd<DateTimePeriod, Invoice>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Invoice.mmPeriodCovered;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public Invoice getValue(DateTimePeriod obj) {
			return obj.getRelatedInvoice();
		}

		@Override
		public void setValue(DateTimePeriod obj, Invoice value) {
			obj.setRelatedInvoice(value);
		}
	};
	protected TradeCertificate tradeCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
	 * TradeCertificate.mmInspectionDate}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, TradeCertificate> mmTradeCertificate = new MMBusinessAssociationEnd<DateTimePeriod, TradeCertificate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Trade certificate for which an inspection date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradeCertificate.mmInspectionDate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradeCertificate.mmObject();
		}

		@Override
		public TradeCertificate getValue(DateTimePeriod obj) {
			return obj.getTradeCertificate();
		}

		@Override
		public void setValue(DateTimePeriod obj, TradeCertificate value) {
			obj.setTradeCertificate(value);
		}
	};
	protected PortfolioValuation relatedPortfolioValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmValuationPeriod
	 * PortfolioValuation.mmValuationPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Optional<PortfolioValuation>> mmRelatedPortfolioValuation = new MMBusinessAssociationEnd<DateTimePeriod, Optional<PortfolioValuation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioValuation";
			definition = "Portfolio valuation process for which a valuation period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PortfolioValuation.mmValuationPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioValuation.mmObject();
		}

		@Override
		public Optional<PortfolioValuation> getValue(DateTimePeriod obj) {
			return obj.getRelatedPortfolioValuation();
		}

		@Override
		public void setValue(DateTimePeriod obj, Optional<PortfolioValuation> value) {
			obj.setRelatedPortfolioValuation(value.orElse(null));
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
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
	 * System.mmVersionValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, System> mmSystem = new MMBusinessAssociationEnd<DateTimePeriod, System>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> System.mmVersionValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public System getValue(DateTimePeriod obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(DateTimePeriod obj, System value) {
			obj.setSystem(value);
		}
	};
	protected AccountRestriction accountRestriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmValidityPeriod
	 * AccountRestriction.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, AccountRestriction> mmAccountRestriction = new MMBusinessAssociationEnd<DateTimePeriod, AccountRestriction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Account restriction for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountRestriction.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountRestriction.mmObject();
		}

		@Override
		public AccountRestriction getValue(DateTimePeriod obj) {
			return obj.getAccountRestriction();
		}

		@Override
		public void setValue(DateTimePeriod obj, AccountRestriction value) {
			obj.setAccountRestriction(value);
		}
	};
	protected BankOperation bankOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmApplicablePeriod
	 * BankOperation.mmApplicablePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Optional<BankOperation>> mmBankOperation = new MMBusinessAssociationEnd<DateTimePeriod, Optional<BankOperation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which an applicable period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BankOperation.mmApplicablePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankOperation.mmObject();
		}

		@Override
		public Optional<BankOperation> getValue(DateTimePeriod obj) {
			return obj.getBankOperation();
		}

		@Override
		public void setValue(DateTimePeriod obj, Optional<BankOperation> value) {
			obj.setBankOperation(value.orElse(null));
		}
	};
	protected CorporateActionEvent relatedCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, CorporateActionEvent> mmRelatedCorporateAction = new MMBusinessAssociationEnd<DateTimePeriod, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action event for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(DateTimePeriod obj) {
			return obj.getRelatedCorporateAction();
		}

		@Override
		public void setValue(DateTimePeriod obj, CorporateActionEvent value) {
			obj.setRelatedCorporateAction(value);
		}
	};
	protected List<Limit> relatedLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
	 * Limit.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, List<Limit>> mmRelatedLimit = new MMBusinessAssociationEnd<DateTimePeriod, List<Limit>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLimit";
			definition = "Limit for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> Limit.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Limit.mmObject();
		}

		@Override
		public List<Limit> getValue(DateTimePeriod obj) {
			return obj.getRelatedLimit();
		}

		@Override
		public void setValue(DateTimePeriod obj, List<Limit> value) {
			obj.setRelatedLimit(value);
		}
	};
	protected List<PartyIdentificationInformation> relatedIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
	 * PartyIdentificationInformation.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, List<PartyIdentificationInformation>> mmRelatedIdentification = new MMBusinessAssociationEnd<DateTimePeriod, List<PartyIdentificationInformation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIdentification";
			definition = "Party identification for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> PartyIdentificationInformation.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public List<PartyIdentificationInformation> getValue(DateTimePeriod obj) {
			return obj.getRelatedIdentification();
		}

		@Override
		public void setValue(DateTimePeriod obj, List<PartyIdentificationInformation> value) {
			obj.setRelatedIdentification(value);
		}
	};
	protected Scheme assessmentValidityScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
	 * Scheme.mmAssessmentValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Scheme> mmAssessmentValidityScheme = new MMBusinessAssociationEnd<DateTimePeriod, Scheme>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityScheme";
			definition = "Scheme for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmAssessmentValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(DateTimePeriod obj) {
			return obj.getAssessmentValidityScheme();
		}

		@Override
		public void setValue(DateTimePeriod obj, Scheme value) {
			obj.setAssessmentValidityScheme(value);
		}
	};
	protected Distribution exercisePeriodDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmExercisePeriod
	 * Distribution.mmExercisePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Distribution> mmExercisePeriodDistribution = new MMBusinessAssociationEnd<DateTimePeriod, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriodDistribution";
			definition = "Cash and securities distribution information for which an exercise period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmExercisePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(DateTimePeriod obj) {
			return obj.getExercisePeriodDistribution();
		}

		@Override
		public void setValue(DateTimePeriod obj, Distribution value) {
			obj.setExercisePeriodDistribution(value);
		}
	};
	protected Distribution offerPeriodDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPeriod
	 * Distribution.mmOfferPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Distribution> mmOfferPeriodDistribution = new MMBusinessAssociationEnd<DateTimePeriod, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPeriodDistribution";
			definition = "Cash and securities distribution information for which an offer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmOfferPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(DateTimePeriod obj) {
			return obj.getOfferPeriodDistribution();
		}

		@Override
		public void setValue(DateTimePeriod obj, Distribution value) {
			obj.setOfferPeriodDistribution(value);
		}
	};
	protected Distribution tradingPeriodDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmTradingPeriod
	 * Distribution.mmTradingPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Distribution> mmTradingPeriodDistribution = new MMBusinessAssociationEnd<DateTimePeriod, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriodDistribution";
			definition = "Cash and securities distribution information for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmTradingPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(DateTimePeriod obj) {
			return obj.getTradingPeriodDistribution();
		}

		@Override
		public void setValue(DateTimePeriod obj, Distribution value) {
			obj.setTradingPeriodDistribution(value);
		}
	};
	protected Distribution blockingPeriodDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmBlockingPeriod
	 * Distribution.mmBlockingPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Distribution> mmBlockingPeriodDistribution = new MMBusinessAssociationEnd<DateTimePeriod, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriodDistribution";
			definition = "Cash and securities distribution information for which a blocking period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmBlockingPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(DateTimePeriod obj) {
			return obj.getBlockingPeriodDistribution();
		}

		@Override
		public void setValue(DateTimePeriod obj, Distribution value) {
			obj.setBlockingPeriodDistribution(value);
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
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
	 * Guarantee.mmEffectivePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Guarantee> mmGuarantee = new MMBusinessAssociationEnd<DateTimePeriod, Guarantee>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee for which an effective period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Guarantee.mmEffectivePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Guarantee.mmObject();
		}

		@Override
		public Guarantee getValue(DateTimePeriod obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(DateTimePeriod obj, Guarantee value) {
			obj.setGuarantee(value);
		}
	};
	protected SecuritiesPricing priceFactRelatedPricing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
	 * SecuritiesPricing.mmPriceFactPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesPricing> mmPriceFactRelatedPricing = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFactRelatedPricing";
			definition = "Securities pricing for which a price fact period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmPriceFactPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(DateTimePeriod obj) {
			return obj.getPriceFactRelatedPricing();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesPricing value) {
			obj.setPriceFactRelatedPricing(value);
		}
	};
	protected Distribution cashDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmInterestPeriod
	 * Distribution.mmInterestPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Distribution> mmCashDistribution = new MMBusinessAssociationEnd<DateTimePeriod, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmInterestPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(DateTimePeriod obj) {
			return obj.getCashDistribution();
		}

		@Override
		public void setValue(DateTimePeriod obj, Distribution value) {
			obj.setCashDistribution(value);
		}
	};
	protected ComponentSecurity componentSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationPeriod
	 * ComponentSecurity.mmSeparationPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, ComponentSecurity> mmComponentSecurity = new MMBusinessAssociationEnd<DateTimePeriod, ComponentSecurity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "Security component for which a separation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ComponentSecurity.mmSeparationPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ComponentSecurity.mmObject();
		}

		@Override
		public ComponentSecurity getValue(DateTimePeriod obj) {
			return obj.getComponentSecurity();
		}

		@Override
		public void setValue(DateTimePeriod obj, ComponentSecurity value) {
			obj.setComponentSecurity(value);
		}
	};
	protected TradingSession tradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTimeBracket
	 * TradingSession.mmTimeBracket}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, TradingSession> mmTradingSession = new MMBusinessAssociationEnd<DateTimePeriod, TradingSession>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session for which a time bracket is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingSession.mmTimeBracket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}

		@Override
		public TradingSession getValue(DateTimePeriod obj) {
			return obj.getTradingSession();
		}

		@Override
		public void setValue(DateTimePeriod obj, TradingSession value) {
			obj.setTradingSession(value);
		}
	};
	protected FinancialInstrumentSwap financialInstrumentSwap;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmMaturity
	 * FinancialInstrumentSwap.mmMaturity}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, FinancialInstrumentSwap> mmFinancialInstrumentSwap = new MMBusinessAssociationEnd<DateTimePeriod, FinancialInstrumentSwap>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentSwap";
			definition = "Swap for which a maturity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialInstrumentSwap.mmMaturity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public FinancialInstrumentSwap getValue(DateTimePeriod obj) {
			return obj.getFinancialInstrumentSwap();
		}

		@Override
		public void setValue(DateTimePeriod obj, FinancialInstrumentSwap value) {
			obj.setFinancialInstrumentSwap(value);
		}
	};
	protected PostalAddress relatedPostalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
	 * PostalAddress.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, PostalAddress> mmRelatedPostalAddress = new MMBusinessAssociationEnd<DateTimePeriod, PostalAddress>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PostalAddress.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}

		@Override
		public PostalAddress getValue(DateTimePeriod obj) {
			return obj.getRelatedPostalAddress();
		}

		@Override
		public void setValue(DateTimePeriod obj, PostalAddress value) {
			obj.setRelatedPostalAddress(value);
		}
	};
	protected RedemptionSchedule redemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmEffectivePeriod
	 * RedemptionSchedule.mmEffectivePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, RedemptionSchedule> mmRedemptionSchedule = new MMBusinessAssociationEnd<DateTimePeriod, RedemptionSchedule>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "Redemption schedule for which a notice period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RedemptionSchedule.mmEffectivePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RedemptionSchedule.mmObject();
		}

		@Override
		public RedemptionSchedule getValue(DateTimePeriod obj) {
			return obj.getRedemptionSchedule();
		}

		@Override
		public void setValue(DateTimePeriod obj, RedemptionSchedule value) {
			obj.setRedemptionSchedule(value);
		}
	};
	protected AccountLink relatedAccountLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
	 * AccountLink.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, AccountLink> mmRelatedAccountLink = new MMBusinessAssociationEnd<DateTimePeriod, AccountLink>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountLink";
			definition = "Link between two accounts for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountLink.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountLink.mmObject();
		}

		@Override
		public AccountLink getValue(DateTimePeriod obj) {
			return obj.getRelatedAccountLink();
		}

		@Override
		public void setValue(DateTimePeriod obj, AccountLink value) {
			obj.setRelatedAccountLink(value);
		}
	};
	protected Adjustment relatedAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
	 * Adjustment.mmEffectivePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Adjustment> mmRelatedAdjustment = new MMBusinessAssociationEnd<DateTimePeriod, Adjustment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAdjustment";
			definition = "Adjustment for which a validity period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Adjustment.mmEffectivePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public Adjustment getValue(DateTimePeriod obj) {
			return obj.getRelatedAdjustment();
		}

		@Override
		public void setValue(DateTimePeriod obj, Adjustment value) {
			obj.setRelatedAdjustment(value);
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
	 * SecuritiesIdentification.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SecuritiesIdentification> mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd<DateTimePeriod, SecuritiesIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(DateTimePeriod obj) {
			return obj.getRelatedSecuritiesIdentification();
		}

		@Override
		public void setValue(DateTimePeriod obj, SecuritiesIdentification value) {
			obj.setRelatedSecuritiesIdentification(value);
		}
	};
	protected List<StandingSettlementInstruction> relatedStandingSettlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
	 * StandingSettlementInstruction.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, List<StandingSettlementInstruction>> mmRelatedStandingSettlementInstruction = new MMBusinessAssociationEnd<DateTimePeriod, List<StandingSettlementInstruction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStandingSettlementInstruction";
			definition = "SSI for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> StandingSettlementInstruction.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}

		@Override
		public List<StandingSettlementInstruction> getValue(DateTimePeriod obj) {
			return obj.getRelatedStandingSettlementInstruction();
		}

		@Override
		public void setValue(DateTimePeriod obj, List<StandingSettlementInstruction> value) {
			obj.setRelatedStandingSettlementInstruction(value);
		}
	};
	protected BasicSecuritiesRegistration relatedSecuritiesRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
	 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, BasicSecuritiesRegistration> mmRelatedSecuritiesRegistration = new MMBusinessAssociationEnd<DateTimePeriod, BasicSecuritiesRegistration>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesRegistration";
			definition = "Securities registration process for which a split period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BasicSecuritiesRegistration.mmSplitPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}

		@Override
		public BasicSecuritiesRegistration getValue(DateTimePeriod obj) {
			return obj.getRelatedSecuritiesRegistration();
		}

		@Override
		public void setValue(DateTimePeriod obj, BasicSecuritiesRegistration value) {
			obj.setRelatedSecuritiesRegistration(value);
		}
	};
	protected AmountAndPeriod amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndPeriod#mmPeriod
	 * AmountAndPeriod.mmPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, AmountAndPeriod> mmAmount = new MMBusinessAssociationEnd<DateTimePeriod, AmountAndPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Relationship with an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountAndPeriod.mmPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountAndPeriod.mmObject();
		}

		@Override
		public AmountAndPeriod getValue(DateTimePeriod obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(DateTimePeriod obj, AmountAndPeriod value) {
			obj.setAmount(value);
		}
	};
	protected List<InvestmentPlan> relatedInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInvestmentPeriod
	 * InvestmentPlan.mmInvestmentPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, List<InvestmentPlan>> mmRelatedInvestmentPlan = new MMBusinessAssociationEnd<DateTimePeriod, List<InvestmentPlan>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "InvestmentPlan for which an investment period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> InvestmentPlan.mmInvestmentPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}

		@Override
		public List<InvestmentPlan> getValue(DateTimePeriod obj) {
			return obj.getRelatedInvestmentPlan();
		}

		@Override
		public void setValue(DateTimePeriod obj, List<InvestmentPlan> value) {
			obj.setRelatedInvestmentPlan(value);
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmSubscriptionPeriod
	 * Issuance.mmSubscriptionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, Issuance> mmIssuance = new MMBusinessAssociationEnd<DateTimePeriod, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which subscription information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmSubscriptionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(DateTimePeriod obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(DateTimePeriod obj, Issuance value) {
			obj.setIssuance(value);
		}
	};
	protected PaymentTerms relatedPaymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
	 * PaymentTerms.mmPaymentPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, PaymentTerms> mmRelatedPaymentTerms = new MMBusinessAssociationEnd<DateTimePeriod, PaymentTerms>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentTerms";
			definition = "Payment terms for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentTerms.mmPaymentPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentTerms.mmObject();
		}

		@Override
		public PaymentTerms getValue(DateTimePeriod obj) {
			return obj.getRelatedPaymentTerms();
		}

		@Override
		public void setValue(DateTimePeriod obj, PaymentTerms value) {
			obj.setRelatedPaymentTerms(value);
		}
	};
	protected PercentageAndPeriod percentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PercentageAndPeriod#mmPeriod
	 * PercentageAndPeriod.mmPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, PercentageAndPeriod> mmPercentage = new MMBusinessAssociationEnd<DateTimePeriod, PercentageAndPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Relationship with a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PercentageAndPeriod.mmPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PercentageAndPeriod.mmObject();
		}

		@Override
		public PercentageAndPeriod getValue(DateTimePeriod obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(DateTimePeriod obj, PercentageAndPeriod value) {
			obj.setPercentage(value);
		}
	};
	protected List<RolePlayer> relatedRolePlayer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmValidityPeriod
	 * RolePlayer.mmValidityPeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, List<RolePlayer>> mmRelatedRolePlayer = new MMBusinessAssociationEnd<DateTimePeriod, List<RolePlayer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRolePlayer";
			definition = "Role player for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> RolePlayer.mmValidityPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RolePlayer.mmObject();
		}

		@Override
		public List<RolePlayer> getValue(DateTimePeriod obj) {
			return obj.getRelatedRolePlayer();
		}

		@Override
		public void setValue(DateTimePeriod obj, List<RolePlayer> value) {
			obj.setRelatedRolePlayer(value);
		}
	};
	protected SystemAvailability relatedSystemAvailability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosurePeriod
	 * SystemAvailability.mmClosurePeriod}</li>
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
	public static final MMBusinessAssociationEnd<DateTimePeriod, SystemAvailability> mmRelatedSystemAvailability = new MMBusinessAssociationEnd<DateTimePeriod, SystemAvailability>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSystemAvailability";
			definition = "System availability for which the closure period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemAvailability.mmClosurePeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemAvailability.mmObject();
		}

		@Override
		public SystemAvailability getValue(DateTimePeriod obj) {
			return obj.getRelatedSystemAvailability();
		}

		@Override
		public void setValue(DateTimePeriod obj, SystemAvailability value) {
			obj.setRelatedSystemAvailability(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriod";
				definition = "Time span defined by a start date and time, and an end date and time.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesIdentification.mmValidityPeriod, SecuritiesPricing.mmPriceCalculationPeriod, SecuritiesPricing.mmPriceFactPeriod, RolePlayer.mmValidityPeriod,
						PostalAddress.mmValidityPeriod, PartyIdentificationInformation.mmValidityPeriod, Account.mmReportedPeriod, RedemptionSchedule.mmEffectivePeriod, Scheme.mmAssessmentValidityPeriod, Status.mmValidityTime,
						Agreement.mmValidityPeriod, Adjustment.mmEffectivePeriod, InvestmentPlan.mmInvestmentPeriod, PaymentInstruction.mmProcessingValidityTime, System.mmVersionValidityPeriod, Limit.mmValidityPeriod,
						StandingOrder.mmValidityPeriod, ValuationStatistics.mmPeriod, PerformanceFactors.mmAccumulationPeriod, AccountRestriction.mmValidityPeriod, SystemAvailability.mmClosurePeriod, InterestCalculation.mmInterestPeriod,
						Debt.mmExtendiblePeriod, Debt.mmCustomDate, Issuance.mmSubscriptionPeriod, SecuritiesConversion.mmConversionPeriod, StandingSettlementInstruction.mmValidityPeriod, BasicSecuritiesRegistration.mmSplitPeriod,
						CorporateActionEvent.mmBookClosurePeriod, CorporateActionEvent.mmTradingPeriod, ClassAction.mmClaimPeriod, CorporateActionOption.mmActionPeriod, SecuritiesProceedsDefinition.mmParallelTradingPeriod,
						SecuritiesProceedsDefinition.mmAssentedLinePeriod, SecuritiesProceedsDefinition.mmSellThruIssuerPeriod, BiddingConditions.mmCompulsoryPurchasePeriod, SuspensionPeriod.mmPrivilegeSuspensionPeriod,
						SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal, SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer, SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent,
						SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit, SuspensionPeriod.mmDepositorySuspensionPeriodForPledge, SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation,
						SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent, SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName, SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName,
						SuspensionPeriod.mmCoDepositoriesSuspensionPeriod, TradingSession.mmTimeBracket, YieldCalculation.mmValuePeriod, BankOperation.mmApplicablePeriod, Invoice.mmPeriodCovered, TaxPeriod.mmFromToDate,
						Distribution.mmExercisePeriod, Distribution.mmOfferPeriod, Distribution.mmTradingPeriod, Distribution.mmBlockingPeriod, Distribution.mmInterestPeriod, ProductDelivery.mmDeliveryPeriod,
						TradeCertificate.mmInspectionDate, Guarantee.mmEffectivePeriod, PortfolioValuation.mmValuationPeriod, AccountLink.mmValidityPeriod, ComponentSecurity.mmSeparationPeriod, FinancialInstrumentSwap.mmMaturity,
						AmountAndPeriod.mmPeriod, PaymentTerms.mmPaymentPeriod, PercentageAndPeriod.mmPeriod);
				derivationElement_lazy = () -> Arrays.asList(Period4Choice.mmDate, Period4Choice.mmFromDateToDate, ReportingRequest4.mmReportingPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmFromDateTime, com.tools20022.repository.entity.DateTimePeriod.mmToDateTime,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder, com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction, com.tools20022.repository.entity.DateTimePeriod.mmNumberOfDays,
						com.tools20022.repository.entity.DateTimePeriod.mmValuationStatistics, com.tools20022.repository.entity.DateTimePeriod.mmPerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.mmStatus,
						com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption,
						com.tools20022.repository.entity.DateTimePeriod.mmParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation,
						com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions, com.tools20022.repository.entity.DateTimePeriod.mmClassAction,
						com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.mmSecuritiesConversion, com.tools20022.repository.entity.DateTimePeriod.mmYieldCalculation,
						com.tools20022.repository.entity.DateTimePeriod.mmCustomDateDebt, com.tools20022.repository.entity.DateTimePeriod.mmTaxPeriod, com.tools20022.repository.entity.DateTimePeriod.mmAccount,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedAgreement, com.tools20022.repository.entity.DateTimePeriod.mmAssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.mmSellThruIssuerProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.mmRelatedProductDelivery,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvoice, com.tools20022.repository.entity.DateTimePeriod.mmTradeCertificate, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPortfolioValuation,
						com.tools20022.repository.entity.DateTimePeriod.mmSystem, com.tools20022.repository.entity.DateTimePeriod.mmAccountRestriction, com.tools20022.repository.entity.DateTimePeriod.mmBankOperation,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit, com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification,
						com.tools20022.repository.entity.DateTimePeriod.mmAssessmentValidityScheme, com.tools20022.repository.entity.DateTimePeriod.mmExercisePeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmOfferPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmTradingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmBlockingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmGuarantee, com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.mmCashDistribution, com.tools20022.repository.entity.DateTimePeriod.mmComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.mmTradingSession,
						com.tools20022.repository.entity.DateTimePeriod.mmFinancialInstrumentSwap, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress,
						com.tools20022.repository.entity.DateTimePeriod.mmRedemptionSchedule, com.tools20022.repository.entity.DateTimePeriod.mmRelatedAccountLink, com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification, com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingSettlementInstruction,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration, com.tools20022.repository.entity.DateTimePeriod.mmAmount, com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvestmentPlan,
						com.tools20022.repository.entity.DateTimePeriod.mmIssuance, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPaymentTerms, com.tools20022.repository.entity.DateTimePeriod.mmPercentage,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedRolePlayer, com.tools20022.repository.entity.DateTimePeriod.mmRelatedSystemAvailability);
				derivationComponent_lazy = () -> Arrays.asList(DatePeriodDetails.mmObject(), DateTimePeriodDetails.mmObject(), Period2.mmObject(), DatePeriodDetails1.mmObject(), ReportingPeriod1.mmObject(), Period4Choice.mmObject(),
						DateTimePeriod1.mmObject(), ReportingPeriod2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DateTimePeriod.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public DateTimePeriod setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = Objects.requireNonNull(fromDateTime);
		return this;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public DateTimePeriod setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = Objects.requireNonNull(toDateTime);
		return this;
	}

	public StandingOrder getRelatedStandingOrder() {
		return relatedStandingOrder;
	}

	public DateTimePeriod setRelatedStandingOrder(StandingOrder relatedStandingOrder) {
		this.relatedStandingOrder = Objects.requireNonNull(relatedStandingOrder);
		return this;
	}

	public PaymentInstruction getPaymentInstruction() {
		return paymentInstruction;
	}

	public DateTimePeriod setPaymentInstruction(PaymentInstruction paymentInstruction) {
		this.paymentInstruction = Objects.requireNonNull(paymentInstruction);
		return this;
	}

	public Number getNumberOfDays() {
		return numberOfDays;
	}

	public DateTimePeriod setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = Objects.requireNonNull(numberOfDays);
		return this;
	}

	public ValuationStatistics getValuationStatistics() {
		return valuationStatistics;
	}

	public DateTimePeriod setValuationStatistics(ValuationStatistics valuationStatistics) {
		this.valuationStatistics = Objects.requireNonNull(valuationStatistics);
		return this;
	}

	public PerformanceFactors getPerformanceFactors() {
		return performanceFactors;
	}

	public DateTimePeriod setPerformanceFactors(PerformanceFactors performanceFactors) {
		this.performanceFactors = Objects.requireNonNull(performanceFactors);
		return this;
	}

	public Status getStatus() {
		return status;
	}

	public DateTimePeriod setStatus(Status status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public SecuritiesPricing getPriceCalculationRelatedPricing() {
		return priceCalculationRelatedPricing;
	}

	public DateTimePeriod setPriceCalculationRelatedPricing(SecuritiesPricing priceCalculationRelatedPricing) {
		this.priceCalculationRelatedPricing = Objects.requireNonNull(priceCalculationRelatedPricing);
		return this;
	}

	public CorporateActionOption getCorporateActionOption() {
		return corporateActionOption;
	}

	public DateTimePeriod setCorporateActionOption(CorporateActionOption corporateActionOption) {
		this.corporateActionOption = Objects.requireNonNull(corporateActionOption);
		return this;
	}

	public SecuritiesProceedsDefinition getParallelTradingProceedsDefinition() {
		return parallelTradingProceedsDefinition;
	}

	public DateTimePeriod setParallelTradingProceedsDefinition(SecuritiesProceedsDefinition parallelTradingProceedsDefinition) {
		this.parallelTradingProceedsDefinition = Objects.requireNonNull(parallelTradingProceedsDefinition);
		return this;
	}

	public SuspensionPeriod getPrivilegeSuspensionCorporateAction() {
		return privilegeSuspensionCorporateAction;
	}

	public DateTimePeriod setPrivilegeSuspensionCorporateAction(SuspensionPeriod privilegeSuspensionCorporateAction) {
		this.privilegeSuspensionCorporateAction = Objects.requireNonNull(privilegeSuspensionCorporateAction);
		return this;
	}

	public SuspensionPeriod getWithdrawalSuspensionRelatedEvent() {
		return withdrawalSuspensionRelatedEvent;
	}

	public DateTimePeriod setWithdrawalSuspensionRelatedEvent(SuspensionPeriod withdrawalSuspensionRelatedEvent) {
		this.withdrawalSuspensionRelatedEvent = Objects.requireNonNull(withdrawalSuspensionRelatedEvent);
		return this;
	}

	public InterestCalculation getRelatedInterestCalculation() {
		return relatedInterestCalculation;
	}

	public DateTimePeriod setRelatedInterestCalculation(InterestCalculation relatedInterestCalculation) {
		this.relatedInterestCalculation = Objects.requireNonNull(relatedInterestCalculation);
		return this;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public DateTimePeriod setBiddingConditions(BiddingConditions biddingConditions) {
		this.biddingConditions = Objects.requireNonNull(biddingConditions);
		return this;
	}

	public ClassAction getClassAction() {
		return classAction;
	}

	public DateTimePeriod setClassAction(ClassAction classAction) {
		this.classAction = Objects.requireNonNull(classAction);
		return this;
	}

	public SuspensionPeriod getBookEntryTransferSuspensionRelatedEvent() {
		return bookEntryTransferSuspensionRelatedEvent;
	}

	public DateTimePeriod setBookEntryTransferSuspensionRelatedEvent(SuspensionPeriod bookEntryTransferSuspensionRelatedEvent) {
		this.bookEntryTransferSuspensionRelatedEvent = Objects.requireNonNull(bookEntryTransferSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getDepositAtAgentSuspensionRelatedEvent() {
		return depositAtAgentSuspensionRelatedEvent;
	}

	public DateTimePeriod setDepositAtAgentSuspensionRelatedEvent(SuspensionPeriod depositAtAgentSuspensionRelatedEvent) {
		this.depositAtAgentSuspensionRelatedEvent = Objects.requireNonNull(depositAtAgentSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getDepositSuspensionRelatedEvent() {
		return depositSuspensionRelatedEvent;
	}

	public DateTimePeriod setDepositSuspensionRelatedEvent(SuspensionPeriod depositSuspensionRelatedEvent) {
		this.depositSuspensionRelatedEvent = Objects.requireNonNull(depositSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getPledgeSuspensionRelatedEvent() {
		return pledgeSuspensionRelatedEvent;
	}

	public DateTimePeriod setPledgeSuspensionRelatedEvent(SuspensionPeriod pledgeSuspensionRelatedEvent) {
		this.pledgeSuspensionRelatedEvent = Objects.requireNonNull(pledgeSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getSegregationPeriodRelatedEvent() {
		return segregationPeriodRelatedEvent;
	}

	public DateTimePeriod setSegregationPeriodRelatedEvent(SuspensionPeriod segregationPeriodRelatedEvent) {
		this.segregationPeriodRelatedEvent = Objects.requireNonNull(segregationPeriodRelatedEvent);
		return this;
	}

	public SuspensionPeriod getWithdrawalAtAgentSuspensionRelatedEvent() {
		return withdrawalAtAgentSuspensionRelatedEvent;
	}

	public DateTimePeriod setWithdrawalAtAgentSuspensionRelatedEvent(SuspensionPeriod withdrawalAtAgentSuspensionRelatedEvent) {
		this.withdrawalAtAgentSuspensionRelatedEvent = Objects.requireNonNull(withdrawalAtAgentSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getWithdrawalInNomineeNameSuspensionRelatedEvent() {
		return withdrawalInNomineeNameSuspensionRelatedEvent;
	}

	public DateTimePeriod setWithdrawalInNomineeNameSuspensionRelatedEvent(SuspensionPeriod withdrawalInNomineeNameSuspensionRelatedEvent) {
		this.withdrawalInNomineeNameSuspensionRelatedEvent = Objects.requireNonNull(withdrawalInNomineeNameSuspensionRelatedEvent);
		return this;
	}

	public SuspensionPeriod getWithdrawalInStreetNameSuspensionRelatedEvent() {
		return withdrawalInStreetNameSuspensionRelatedEvent;
	}

	public DateTimePeriod setWithdrawalInStreetNameSuspensionRelatedEvent(SuspensionPeriod withdrawalInStreetNameSuspensionRelatedEvent) {
		this.withdrawalInStreetNameSuspensionRelatedEvent = Objects.requireNonNull(withdrawalInStreetNameSuspensionRelatedEvent);
		return this;
	}

	public CorporateActionEvent getBookClosureCorporateAction() {
		return bookClosureCorporateAction;
	}

	public DateTimePeriod setBookClosureCorporateAction(CorporateActionEvent bookClosureCorporateAction) {
		this.bookClosureCorporateAction = Objects.requireNonNull(bookClosureCorporateAction);
		return this;
	}

	public SuspensionPeriod getCoDepositoriesSuspensionRelatedEvent() {
		return coDepositoriesSuspensionRelatedEvent;
	}

	public DateTimePeriod setCoDepositoriesSuspensionRelatedEvent(SuspensionPeriod coDepositoriesSuspensionRelatedEvent) {
		this.coDepositoriesSuspensionRelatedEvent = Objects.requireNonNull(coDepositoriesSuspensionRelatedEvent);
		return this;
	}

	public Debt getExtendiblePeriodDebt() {
		return extendiblePeriodDebt;
	}

	public DateTimePeriod setExtendiblePeriodDebt(Debt extendiblePeriodDebt) {
		this.extendiblePeriodDebt = Objects.requireNonNull(extendiblePeriodDebt);
		return this;
	}

	public SecuritiesConversion getSecuritiesConversion() {
		return securitiesConversion;
	}

	public DateTimePeriod setSecuritiesConversion(SecuritiesConversion securitiesConversion) {
		this.securitiesConversion = Objects.requireNonNull(securitiesConversion);
		return this;
	}

	public YieldCalculation getYieldCalculation() {
		return yieldCalculation;
	}

	public DateTimePeriod setYieldCalculation(YieldCalculation yieldCalculation) {
		this.yieldCalculation = Objects.requireNonNull(yieldCalculation);
		return this;
	}

	public Debt getCustomDateDebt() {
		return customDateDebt;
	}

	public DateTimePeriod setCustomDateDebt(Debt customDateDebt) {
		this.customDateDebt = Objects.requireNonNull(customDateDebt);
		return this;
	}

	public TaxPeriod getTaxPeriod() {
		return taxPeriod;
	}

	public DateTimePeriod setTaxPeriod(TaxPeriod taxPeriod) {
		this.taxPeriod = Objects.requireNonNull(taxPeriod);
		return this;
	}

	public Optional<Account> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public DateTimePeriod setAccount(Account account) {
		this.account = account;
		return this;
	}

	public Agreement getRelatedAgreement() {
		return relatedAgreement;
	}

	public DateTimePeriod setRelatedAgreement(Agreement relatedAgreement) {
		this.relatedAgreement = Objects.requireNonNull(relatedAgreement);
		return this;
	}

	public SecuritiesProceedsDefinition getAssentedLinePeriodProceedsDefinition() {
		return assentedLinePeriodProceedsDefinition;
	}

	public DateTimePeriod setAssentedLinePeriodProceedsDefinition(SecuritiesProceedsDefinition assentedLinePeriodProceedsDefinition) {
		this.assentedLinePeriodProceedsDefinition = Objects.requireNonNull(assentedLinePeriodProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getSellThruIssuerProceedsDefinition() {
		return sellThruIssuerProceedsDefinition;
	}

	public DateTimePeriod setSellThruIssuerProceedsDefinition(SecuritiesProceedsDefinition sellThruIssuerProceedsDefinition) {
		this.sellThruIssuerProceedsDefinition = Objects.requireNonNull(sellThruIssuerProceedsDefinition);
		return this;
	}

	public ProductDelivery getRelatedProductDelivery() {
		return relatedProductDelivery;
	}

	public DateTimePeriod setRelatedProductDelivery(ProductDelivery relatedProductDelivery) {
		this.relatedProductDelivery = Objects.requireNonNull(relatedProductDelivery);
		return this;
	}

	public Invoice getRelatedInvoice() {
		return relatedInvoice;
	}

	public DateTimePeriod setRelatedInvoice(Invoice relatedInvoice) {
		this.relatedInvoice = Objects.requireNonNull(relatedInvoice);
		return this;
	}

	public TradeCertificate getTradeCertificate() {
		return tradeCertificate;
	}

	public DateTimePeriod setTradeCertificate(TradeCertificate tradeCertificate) {
		this.tradeCertificate = Objects.requireNonNull(tradeCertificate);
		return this;
	}

	public Optional<PortfolioValuation> getRelatedPortfolioValuation() {
		return relatedPortfolioValuation == null ? Optional.empty() : Optional.of(relatedPortfolioValuation);
	}

	public DateTimePeriod setRelatedPortfolioValuation(PortfolioValuation relatedPortfolioValuation) {
		this.relatedPortfolioValuation = relatedPortfolioValuation;
		return this;
	}

	public System getSystem() {
		return system;
	}

	public DateTimePeriod setSystem(System system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public AccountRestriction getAccountRestriction() {
		return accountRestriction;
	}

	public DateTimePeriod setAccountRestriction(AccountRestriction accountRestriction) {
		this.accountRestriction = Objects.requireNonNull(accountRestriction);
		return this;
	}

	public Optional<BankOperation> getBankOperation() {
		return bankOperation == null ? Optional.empty() : Optional.of(bankOperation);
	}

	public DateTimePeriod setBankOperation(BankOperation bankOperation) {
		this.bankOperation = bankOperation;
		return this;
	}

	public CorporateActionEvent getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public DateTimePeriod setRelatedCorporateAction(CorporateActionEvent relatedCorporateAction) {
		this.relatedCorporateAction = Objects.requireNonNull(relatedCorporateAction);
		return this;
	}

	public List<Limit> getRelatedLimit() {
		return relatedLimit == null ? relatedLimit = new ArrayList<>() : relatedLimit;
	}

	public DateTimePeriod setRelatedLimit(List<Limit> relatedLimit) {
		this.relatedLimit = Objects.requireNonNull(relatedLimit);
		return this;
	}

	public List<PartyIdentificationInformation> getRelatedIdentification() {
		return relatedIdentification == null ? relatedIdentification = new ArrayList<>() : relatedIdentification;
	}

	public DateTimePeriod setRelatedIdentification(List<PartyIdentificationInformation> relatedIdentification) {
		this.relatedIdentification = Objects.requireNonNull(relatedIdentification);
		return this;
	}

	public Scheme getAssessmentValidityScheme() {
		return assessmentValidityScheme;
	}

	public DateTimePeriod setAssessmentValidityScheme(Scheme assessmentValidityScheme) {
		this.assessmentValidityScheme = Objects.requireNonNull(assessmentValidityScheme);
		return this;
	}

	public Distribution getExercisePeriodDistribution() {
		return exercisePeriodDistribution;
	}

	public DateTimePeriod setExercisePeriodDistribution(Distribution exercisePeriodDistribution) {
		this.exercisePeriodDistribution = Objects.requireNonNull(exercisePeriodDistribution);
		return this;
	}

	public Distribution getOfferPeriodDistribution() {
		return offerPeriodDistribution;
	}

	public DateTimePeriod setOfferPeriodDistribution(Distribution offerPeriodDistribution) {
		this.offerPeriodDistribution = Objects.requireNonNull(offerPeriodDistribution);
		return this;
	}

	public Distribution getTradingPeriodDistribution() {
		return tradingPeriodDistribution;
	}

	public DateTimePeriod setTradingPeriodDistribution(Distribution tradingPeriodDistribution) {
		this.tradingPeriodDistribution = Objects.requireNonNull(tradingPeriodDistribution);
		return this;
	}

	public Distribution getBlockingPeriodDistribution() {
		return blockingPeriodDistribution;
	}

	public DateTimePeriod setBlockingPeriodDistribution(Distribution blockingPeriodDistribution) {
		this.blockingPeriodDistribution = Objects.requireNonNull(blockingPeriodDistribution);
		return this;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public DateTimePeriod setGuarantee(Guarantee guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public SecuritiesPricing getPriceFactRelatedPricing() {
		return priceFactRelatedPricing;
	}

	public DateTimePeriod setPriceFactRelatedPricing(SecuritiesPricing priceFactRelatedPricing) {
		this.priceFactRelatedPricing = Objects.requireNonNull(priceFactRelatedPricing);
		return this;
	}

	public Distribution getCashDistribution() {
		return cashDistribution;
	}

	public DateTimePeriod setCashDistribution(Distribution cashDistribution) {
		this.cashDistribution = Objects.requireNonNull(cashDistribution);
		return this;
	}

	public ComponentSecurity getComponentSecurity() {
		return componentSecurity;
	}

	public DateTimePeriod setComponentSecurity(ComponentSecurity componentSecurity) {
		this.componentSecurity = Objects.requireNonNull(componentSecurity);
		return this;
	}

	public TradingSession getTradingSession() {
		return tradingSession;
	}

	public DateTimePeriod setTradingSession(TradingSession tradingSession) {
		this.tradingSession = Objects.requireNonNull(tradingSession);
		return this;
	}

	public FinancialInstrumentSwap getFinancialInstrumentSwap() {
		return financialInstrumentSwap;
	}

	public DateTimePeriod setFinancialInstrumentSwap(FinancialInstrumentSwap financialInstrumentSwap) {
		this.financialInstrumentSwap = Objects.requireNonNull(financialInstrumentSwap);
		return this;
	}

	public PostalAddress getRelatedPostalAddress() {
		return relatedPostalAddress;
	}

	public DateTimePeriod setRelatedPostalAddress(PostalAddress relatedPostalAddress) {
		this.relatedPostalAddress = Objects.requireNonNull(relatedPostalAddress);
		return this;
	}

	public RedemptionSchedule getRedemptionSchedule() {
		return redemptionSchedule;
	}

	public DateTimePeriod setRedemptionSchedule(RedemptionSchedule redemptionSchedule) {
		this.redemptionSchedule = Objects.requireNonNull(redemptionSchedule);
		return this;
	}

	public AccountLink getRelatedAccountLink() {
		return relatedAccountLink;
	}

	public DateTimePeriod setRelatedAccountLink(AccountLink relatedAccountLink) {
		this.relatedAccountLink = Objects.requireNonNull(relatedAccountLink);
		return this;
	}

	public Adjustment getRelatedAdjustment() {
		return relatedAdjustment;
	}

	public DateTimePeriod setRelatedAdjustment(Adjustment relatedAdjustment) {
		this.relatedAdjustment = Objects.requireNonNull(relatedAdjustment);
		return this;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public DateTimePeriod setRelatedSecuritiesIdentification(SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = Objects.requireNonNull(relatedSecuritiesIdentification);
		return this;
	}

	public List<StandingSettlementInstruction> getRelatedStandingSettlementInstruction() {
		return relatedStandingSettlementInstruction == null ? relatedStandingSettlementInstruction = new ArrayList<>() : relatedStandingSettlementInstruction;
	}

	public DateTimePeriod setRelatedStandingSettlementInstruction(List<StandingSettlementInstruction> relatedStandingSettlementInstruction) {
		this.relatedStandingSettlementInstruction = Objects.requireNonNull(relatedStandingSettlementInstruction);
		return this;
	}

	public BasicSecuritiesRegistration getRelatedSecuritiesRegistration() {
		return relatedSecuritiesRegistration;
	}

	public DateTimePeriod setRelatedSecuritiesRegistration(BasicSecuritiesRegistration relatedSecuritiesRegistration) {
		this.relatedSecuritiesRegistration = Objects.requireNonNull(relatedSecuritiesRegistration);
		return this;
	}

	public AmountAndPeriod getAmount() {
		return amount;
	}

	public DateTimePeriod setAmount(AmountAndPeriod amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<InvestmentPlan> getRelatedInvestmentPlan() {
		return relatedInvestmentPlan == null ? relatedInvestmentPlan = new ArrayList<>() : relatedInvestmentPlan;
	}

	public DateTimePeriod setRelatedInvestmentPlan(List<InvestmentPlan> relatedInvestmentPlan) {
		this.relatedInvestmentPlan = Objects.requireNonNull(relatedInvestmentPlan);
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public DateTimePeriod setIssuance(Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public PaymentTerms getRelatedPaymentTerms() {
		return relatedPaymentTerms;
	}

	public DateTimePeriod setRelatedPaymentTerms(PaymentTerms relatedPaymentTerms) {
		this.relatedPaymentTerms = Objects.requireNonNull(relatedPaymentTerms);
		return this;
	}

	public PercentageAndPeriod getPercentage() {
		return percentage;
	}

	public DateTimePeriod setPercentage(PercentageAndPeriod percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public List<RolePlayer> getRelatedRolePlayer() {
		return relatedRolePlayer == null ? relatedRolePlayer = new ArrayList<>() : relatedRolePlayer;
	}

	public DateTimePeriod setRelatedRolePlayer(List<RolePlayer> relatedRolePlayer) {
		this.relatedRolePlayer = Objects.requireNonNull(relatedRolePlayer);
		return this;
	}

	public SystemAvailability getRelatedSystemAvailability() {
		return relatedSystemAvailability;
	}

	public DateTimePeriod setRelatedSystemAvailability(SystemAvailability relatedSystemAvailability) {
		this.relatedSystemAvailability = Objects.requireNonNull(relatedSystemAvailability);
		return this;
	}
}