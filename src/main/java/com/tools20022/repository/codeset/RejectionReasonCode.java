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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectionReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ClosingTransactionAmount
 * RejectionReasonCode.mmClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TradedQuantityHigherThanOriginalOrderQuantity
 * RejectionReasonCode.mmTradedQuantityHigherThanOriginalOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TransactionNoticeIDUnknown
 * RejectionReasonCode.mmTransactionNoticeIDUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TransactionNoticeAlreadyAcceptedOrRejected
 * RejectionReasonCode.mmTransactionNoticeAlreadyAcceptedOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#OrderDateNotProvided
 * RejectionReasonCode.mmOrderDateNotProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidRequest
 * RejectionReasonCode.mmInvalidRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#IncorrectCertification
 * RejectionReasonCode.mmIncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidReference
 * RejectionReasonCode.mmInvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SafekeepingAccountRejection
 * RejectionReasonCode.mmSafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InsufficientTresholdPosition
 * RejectionReasonCode.mmInsufficientTresholdPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#QuantityRejection
 * RejectionReasonCode.mmQuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#AccountServicerDeadlineMissed
 * RejectionReasonCode.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SplitVoteNotAllowed
 * RejectionReasonCode.mmSplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PartialVoteNotAllowed
 * RejectionReasonCode.mmPartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingOrInvalidPOA
 * RejectionReasonCode.mmMissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ProxyCardDiscrepancy
 * RejectionReasonCode.mmProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RegistrationDiscrepancy
 * RejectionReasonCode.mmRegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RejectedByIssuerOrRegistrar
 * RejectionReasonCode.mmRejectedByIssuerOrRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidSecurity
 * RejectionReasonCode.mmInvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InstructionIrrevocable
 * RejectionReasonCode.mmInstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#OptionCancelled
 * RejectionReasonCode.mmOptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#OptionInactive
 * RejectionReasonCode.mmOptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidForTaxAuthorities
 * RejectionReasonCode.mmInvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RefusedByTaxAuthorities
 * RejectionReasonCode.mmRefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#LackofSecurities
 * RejectionReasonCode.mmLackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MarketDeadlineMissed
 * RejectionReasonCode.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#Mismatch
 * RejectionReasonCode.mmMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#OptionNumberRejection
 * RejectionReasonCode.mmOptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidOptionType
 * RejectionReasonCode.mmInvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RejectedSinceAlreadyCancelled
 * RejectionReasonCode.mmRejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RejectedSinceInProgress
 * RejectionReasonCode.mmRejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#UnrecognizedIdentification
 * RejectionReasonCode.mmUnrecognizedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#UnknownSymbol
 * RejectionReasonCode.mmUnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ClosedExchange
 * RejectionReasonCode.mmClosedExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ExceedsLimit
 * RejectionReasonCode.mmExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TooLate
 * RejectionReasonCode.mmTooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidPrice
 * RejectionReasonCode.mmInvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotAuthorised
 * RejectionReasonCode.mmNotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoMatchInquiry
 * RejectionReasonCode.mmNoMatchInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoInstrumentMarket
 * RejectionReasonCode.mmNoInstrumentMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoInventory
 * RejectionReasonCode.mmNoInventory}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReasonCode#Pass
 * RejectionReasonCode.mmPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PriceExceeds
 * RejectionReasonCode.mmPriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#QuantityExceeds
 * RejectionReasonCode.mmQuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#WrongSide
 * RejectionReasonCode.mmWrongSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CalculationDifference
 * RejectionReasonCode.mmCalculationDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InsufficientCredit
 * RejectionReasonCode.mmInsufficientCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#AgreementStartDate
 * RejectionReasonCode.mmAgreementStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TransactionCallDelay
 * RejectionReasonCode.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CashAccount
 * RejectionReasonCode.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DealPrice
 * RejectionReasonCode.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ForfeitAmount
 * RejectionReasonCode.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DeliveringCustodian
 * RejectionReasonCode.mmDeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ReceivingCustodian
 * RejectionReasonCode.mmReceivingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotFoundRejection
 * RejectionReasonCode.mmNotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#QuantityUnitType
 * RejectionReasonCode.mmQuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TerminationTransactionAmount
 * RejectionReasonCode.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RepurchaseRate
 * RejectionReasonCode.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PremiumAmount
 * RejectionReasonCode.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RepurchaseRateType
 * RejectionReasonCode.mmRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SpreadRate
 * RejectionReasonCode.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TradedSecuritiesQuantity
 * RejectionReasonCode.mmTradedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TradeDate
 * RejectionReasonCode.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ReceivingAgent
 * RejectionReasonCode.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#Intermediary
 * RejectionReasonCode.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DeliveringAgent
 * RejectionReasonCode.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PlaceOfTrade
 * RejectionReasonCode.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvestorNameAddressUnknown
 * RejectionReasonCode.mmInvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReasonCode.mmImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SettlementAmountCurrencyRejection
 * RejectionReasonCode.mmSettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#LetterOfGuaranteeIndicatorRejection
 * RejectionReasonCode.mmLetterOfGuaranteeIndicatorRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingCreditAuthorisation
 * RejectionReasonCode.mmMissingCreditAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#AddressDetailsRejection
 * RejectionReasonCode.mmAddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ReceivingOrDeliveringCustodianRejection
 * RejectionReasonCode.mmReceivingOrDeliveringCustodianRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ReceivingDeliveringParty3
 * RejectionReasonCode.mmReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PhysicalSettlementImpossible
 * RejectionReasonCode.mmPhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ReferenceRejection
 * RejectionReasonCode.mmReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SettlementAmountRejection
 * RejectionReasonCode.mmSettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingStatutes
 * RejectionReasonCode.mmMissingStatutes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotStampedOrSigned
 * RejectionReasonCode.mmNotStampedOrSigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidSignature
 * RejectionReasonCode.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ShareholderNumberRejection
 * RejectionReasonCode.mmShareholderNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MinimumSettlementQuantity
 * RejectionReasonCode.mmMinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoMatch
 * RejectionReasonCode.mmNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingLegalPower
 * RejectionReasonCode.mmMissingLegalPower}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ProcessingBatchRejection
 * RejectionReasonCode.mmProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TypeOfOwnershipRejection
 * RejectionReasonCode.mmTypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MultipleSettlementQuantity
 * RejectionReasonCode.mmMultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#WrongRegistrationRequest
 * RejectionReasonCode.mmWrongRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TaxStatusRejection
 * RejectionReasonCode.mmTaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DisagreementInRegistrationReason
 * RejectionReasonCode.mmDisagreementInRegistrationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingRegistrationRequest
 * RejectionReasonCode.mmMissingRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SettlementSystemMethodRejection
 * RejectionReasonCode.mmSettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CommonReferenceRejection
 * RejectionReasonCode.mmCommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NarrativeInformationRejection
 * RejectionReasonCode.mmNarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#IncorrectProgramConversion
 * RejectionReasonCode.mmIncorrectProgramConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InsufficientCollateral
 * RejectionReasonCode.mmInsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#BusinessPartnerNumberRejection
 * RejectionReasonCode.mmBusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#BankReferenceNumberRejection
 * RejectionReasonCode.mmBankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#TypeOfOrderRejection
 * RejectionReasonCode.mmTypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CorporateActionRejection
 * RejectionReasonCode.mmCorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ImpossibleCashSettlementSystem
 * RejectionReasonCode.mmImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CommercializationContractRejection
 * RejectionReasonCode.mmCommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ConcentrationLimitExceeded
 * RejectionReasonCode.mmConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#UnknownDealExposure
 * RejectionReasonCode.mmUnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SettlementDateRejection
 * RejectionReasonCode.mmSettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PlaceOfSettlementRejection
 * RejectionReasonCode.mmPlaceOfSettlementRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DisagreeWithCallAmount
 * RejectionReasonCode.mmDisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#DisagreeWithExposureAmount
 * RejectionReasonCode.mmDisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RegistrationRequestDataAndOrderRejection
 * RejectionReasonCode.mmRegistrationRequestDataAndOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#FeeCommissionRejection
 * RejectionReasonCode.mmFeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#IncorrectActivityType
 * RejectionReasonCode.mmIncorrectActivityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SettlementTransactionRejection
 * RejectionReasonCode.mmSettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ClosingDateTimeRejection
 * RejectionReasonCode.mmClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#VariableRateSupportRejection
 * RejectionReasonCode.mmVariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingOption
 * RejectionReasonCode.mmMissingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotDefinedAgent
 * RejectionReasonCode.mmNotDefinedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingPeriodEndDate
 * RejectionReasonCode.mmMissingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingPeriodStartDate
 * RejectionReasonCode.mmMissingPeriodStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingResultingAmount
 * RejectionReasonCode.mmMissingResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#WrongSecurityType
 * RejectionReasonCode.mmWrongSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotEligibleDisperseSecurity
 * RejectionReasonCode.mmNotEligibleDisperseSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NonEligibleSecurity
 * RejectionReasonCode.mmNonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingExchangeRate
 * RejectionReasonCode.mmMissingExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ValueDateBeforePaymentDate
 * RejectionReasonCode.mmValueDateBeforePaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#UnexpectedAccruedInterest
 * RejectionReasonCode.mmUnexpectedAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoAccessToService
 * RejectionReasonCode.mmNoAccessToService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingCertification
 * RejectionReasonCode.mmMissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotBusinessDay
 * RejectionReasonCode.mmNotBusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#EffectiveDayAfterPaymentDate
 * RejectionReasonCode.mmEffectiveDayAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#GrossAmountLessThanNetAmount
 * RejectionReasonCode.mmGrossAmountLessThanNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MissingDefaultOption
 * RejectionReasonCode.mmMissingDefaultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NonActiveParty
 * RejectionReasonCode.mmNonActiveParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PeriodEndDateBeforeStartDate
 * RejectionReasonCode.mmPeriodEndDateBeforeStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#RecordDateAfterPaymentDate
 * RejectionReasonCode.mmRecordDateAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#FailedValidation
 * RejectionReasonCode.mmFailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#EventAlreadyDeactivated
 * RejectionReasonCode.mmEventAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoPendingDeactivationInstruction
 * RejectionReasonCode.mmNoPendingDeactivationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#AmendmentNotAllowed
 * RejectionReasonCode.mmAmendmentNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#CancellationNotAllowed
 * RejectionReasonCode.mmCancellationNotAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReasonCode#Late
 * RejectionReasonCode.mmLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ElectionAlreadyCancelled
 * RejectionReasonCode.mmElectionAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#ElectionAlreadyAmended
 * RejectionReasonCode.mmElectionAlreadyAmended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SameCAIdentification
 * RejectionReasonCode.mmSameCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidCAIdentification
 * RejectionReasonCode.mmInvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidAgent
 * RejectionReasonCode.mmInvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotMainAgent
 * RejectionReasonCode.mmNotMainAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidOption
 * RejectionReasonCode.mmInvalidOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#PendingDeactivation
 * RejectionReasonCode.mmPendingDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotIdentifiedCashAccount
 * RejectionReasonCode.mmNotIdentifiedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotIdentifiedCorrespondentBank
 * RejectionReasonCode.mmNotIdentifiedCorrespondentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidStandingInstructionType
 * RejectionReasonCode.mmInvalidStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoHolding
 * RejectionReasonCode.mmNoHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InsufficientBalance
 * RejectionReasonCode.mmInsufficientBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#SameIdentification
 * RejectionReasonCode.mmSameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#OptionAlreadyDeactivated
 * RejectionReasonCode.mmOptionAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidEventType
 * RejectionReasonCode.mmInvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidUnderlyingSecurity
 * RejectionReasonCode.mmInvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidEventProcessingType
 * RejectionReasonCode.mmInvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidMandatoryVoluntaryEventType
 * RejectionReasonCode.mmInvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidCorporateActionInformation
 * RejectionReasonCode.mmInvalidCorporateActionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidDetails
 * RejectionReasonCode.mmInvalidDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NoRemainingOption
 * RejectionReasonCode.mmNoRemainingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MismatchedCAIdentification
 * RejectionReasonCode.mmMismatchedCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NotApplicable
 * RejectionReasonCode.mmNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidMovementInformation
 * RejectionReasonCode.mmInvalidMovementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#MovementAlreadySettled
 * RejectionReasonCode.mmMovementAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#NarrativeReason
 * RejectionReasonCode.mmNarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode#InvalidIdentification
 * RejectionReasonCode.mmInvalidIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReasonCode#Other
 * RejectionReasonCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CTRA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unrecognised or invalid closing closing amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid closing closing amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ClosingTransactionAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing closing amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CTRA";
		}
	};
	/**
	 * Market member executed the order exceeding the requested quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TQHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedQuantityHigherThanOriginalOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market member executed the order exceeding the requested quantity."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TradedQuantityHigherThanOriginalOrderQuantity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedQuantityHigherThanOriginalOrderQuantity";
			definition = "Market member executed the order exceeding the requested quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TQHI";
		}
	};
	/**
	 * The combination of the Transaction Notice Reference, Market Member, and
	 * Intermediary is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNIU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeIDUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode TransactionNoticeIDUnknown = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeIDUnknown";
			definition = "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TNIU";
		}
	};
	/**
	 * A message with the same Transaction Notice Reference, Market Member, and
	 * Intermediary has already been processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeAlreadyAcceptedOrRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode TransactionNoticeAlreadyAcceptedOrRejected = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeAlreadyAcceptedOrRejected";
			definition = "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TNAR";
		}
	};
	/**
	 * Order entry date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateNotProvided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order entry date is missing."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode OrderDateNotProvided = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateNotProvided";
			definition = "Order entry date is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ODNP";
		}
	};
	/**
	 * Statement/status advice request cannot be executed. The message type
	 * requested is not valid for the message reference or statement period
	 * concerned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidRequest = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidRequest";
			definition = "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Instruction is rejected since the provided certification is incorrect or
	 * incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is rejected since the provided certification is incorrect or incomplete."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode IncorrectCertification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectCertification";
			definition = "Instruction is rejected since the provided certification is incorrect or incomplete.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Instruction contains an invalid message reference, reference is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULNK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid message reference, reference is unknown."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidReference = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidReference";
			definition = "Instruction contains an invalid message reference, reference is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Instruction contains an invalid or unrecognised safekeeping account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid or unrecognised safekeeping account."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SafekeepingAccountRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccountRejection";
			definition = "Instruction contains an invalid or unrecognised safekeeping account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Position is less than required threshold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientTresholdPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position is less than required threshold."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InsufficientTresholdPosition = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientTresholdPosition";
			definition = "Position is less than required threshold.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Unrecognised or invalid instructed quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid instructed quantity."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode QuantityRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityRejection";
			definition = "Unrecognised or invalid instructed quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Instruction received after the account servicers specified deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction received after the account servicers specified deadline."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode AccountServicerDeadlineMissed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Instruction received after the account servicers specified deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Split voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Split voting is not allowed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SplitVoteNotAllowed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Partial voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial voting is not allowed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PartialVoteNotAllowed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Missing or invalid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing or invalid power of attorney."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingOrInvalidPOA = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IPOA";
		}
	};
	/**
	 * Invalid proxy information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRXY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid proxy information."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ProxyCardDiscrepancy = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PRXY";
		}
	};
	/**
	 * Invalid registration information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid registration information."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RegistrationDiscrepancy = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDiscrepancy";
			definition = "Invalid registration information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IREG";
		}
	};
	/**
	 * Issuer or Registrar has rejected the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuerOrRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer or Registrar has rejected the instruction."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RejectedByIssuerOrRegistrar = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			definition = "Issuer or Registrar has rejected the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RBIS";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid financial instrument identification."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidSecurity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidSecurity";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * The instruction is irrevocable
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The instruction is irrevocable"</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InstructionIrrevocable = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionIrrevocable";
			definition = "The instruction is irrevocable";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INIR";
		}
	};
	/**
	 * Option is not valid; it has been cancelled by the market or service
	 * provider, and cannot be responded to. Any responses already processed
	 * against this option are considered void and new responses will be
	 * required .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required ."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode OptionCancelled = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionCancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required .";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, eg, expired
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode OptionInactive = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionInactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INTV";
		}
	};
	/**
	 * For tax reclaim, the reclaim is invalid for the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For tax reclaim, the reclaim is invalid for the tax authorities."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidForTaxAuthorities = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidForTaxAuthorities";
			definition = "For tax reclaim, the reclaim is invalid for the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Reclaim is refused by the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reclaim is refused by the tax authorities."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RefusedByTaxAuthorities = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RefusedByTaxAuthorities";
			definition = "Reclaim is refused by the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REFT";
		}
	};
	/**
	 * Instructed position exceeds the eligible balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructed position exceeds the eligible balance."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode LackofSecurities = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackofSecurities";
			definition = "Instructed position exceeds the eligible balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after market deadline."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MarketDeadlineMissed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Mismatch between option number and option type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mismatch between option number and option type."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode Mismatch = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mismatch";
			definition = "Mismatch between option number and option type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NMTY";
		}
	};
	/**
	 * Unrecognised option number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised option number."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode OptionNumberRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionNumberRejection";
			definition = "Unrecognised option number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "OPNM";
		}
	};
	/**
	 * Invalid option type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid option type."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidOptionType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOptionType";
			definition = "Invalid option type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "OPTY";
		}
	};
	/**
	 * Cancellation request was rejected since the instruction has already been
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was rejected since the instruction has already been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode RejectedSinceAlreadyCancelled = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			definition = "Cancellation request was rejected since the instruction has already been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Cancellation request has been rejected because the instruction process is
	 * in progress or has been processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected because the instruction process is in progress or has been processed."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode RejectedSinceInProgress = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedSinceInProgress";
			definition = "Cancellation request has been rejected because the instruction process is in progress or has been processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Unrecognised event number or identification (eg corporate action event
	 * number, a meeting identification)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EVNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognizedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised event number or identification (eg corporate action event number, a meeting identification)"
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode UnrecognizedIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrecognizedIdentification";
			definition = "Unrecognised event number or identification (eg corporate action event number, a meeting identification)";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "EVNM";
		}
	};
	/**
	 * Financial instrument's symbol has not been recognized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial instrument's symbol has not been recognized."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode UnknownSymbol = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownSymbol";
			definition = "Financial instrument's symbol has not been recognized.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Exchange on which the financial instrument is traded is closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange on which the financial instrument is traded is closed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ClosedExchange = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosedExchange";
			definition = "Exchange on which the financial instrument is traded is closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "EXCL";
		}
	};
	/**
	 * Countervalue of the order exceeds the allowed trading limit or quote
	 * exceeds limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceedsLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode ExceedsLimit = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceedsLimit";
			definition = "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "EXLI";
		}
	};
	/**
	 * Request has exceeded the allowed time frame.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request has exceeded the allowed time frame."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TooLate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLate";
			definition = "Request has exceeded the allowed time frame.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TOLA";
		}
	};
	/**
	 * Price does not comply with the financial instrument's characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price does not comply with the financial instrument's characteristics."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidPrice = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidPrice";
			definition = "Price does not comply with the financial instrument's characteristics.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Permission to be processed is not granted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Permission to be processed is not granted."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotAuthorised = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAuthorised";
			definition = "Permission to be processed is not granted.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * No counterparty order has been identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No counterparty order has been identified."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoMatchInquiry = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatchInquiry";
			definition = "No counterparty order has been identified.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Referred instrument does not exist in combination with the mentioned
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NINS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstrumentMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Referred instrument does not exist in combination with the mentioned market."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoInstrumentMarket = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoInstrumentMarket";
			definition = "Referred instrument does not exist in combination with the mentioned market.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NINS";
		}
	};
	/**
	 * Requested financial instrument is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInventory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested financial instrument is not available."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoInventory = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoInventory";
			definition = "Requested financial instrument is not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NINV";
		}
	};
	/**
	 * Counterparty is not interested in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty is not interested in the transaction."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode Pass = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pass";
			definition = "Counterparty is not interested in the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Price in the execution exceeds the order price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceExceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price in the execution exceeds the order price."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PriceExceeds = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceExceeds";
			definition = "Price in the execution exceeds the order price.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Quantity in the execution exceeds the ordered quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityExceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity in the execution exceeds the ordered quantity."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode QuantityExceeds = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityExceeds";
			definition = "Quantity in the execution exceeds the ordered quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Order is for the wrong side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is for the wrong side."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode WrongSide = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongSide";
			definition = "Order is for the wrong side.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SIDE";
		}
	};
	/**
	 * This is primarily used when the Notice of Execution received by the
	 * buy-side contains fees, gross trade amount, net trade amount, etc.,
	 * values that differ from the buy-side's calculations. Buy-side may reject
	 * the trade if they feel that the difference in calculations is too high.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This is primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode CalculationDifference = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDifference";
			definition = "This is primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Requestor has no insufficient credit to make the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requestor has no insufficient credit to make the trade."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InsufficientCredit = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientCredit";
			definition = "Requestor has no insufficient credit to make the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Agreement start date is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement start date is missing or invalid."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode AgreementStartDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgreementStartDate";
			definition = "Agreement start date is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ASTM";
		}
	};
	/**
	 * Unrecognised or invalid transaction call delay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid transaction call delay."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TransactionCallDelay = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Unrecognised or invalid cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid cash account."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode CashAccount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Unrecognised or invalid deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid deal price."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DealPrice = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid forfeit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid forfeit amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ForfeitAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised or invalid delivering custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid delivering custodian."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DeliveringCustodian = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringCustodian";
			definition = "Unrecognised or invalid delivering custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DCUS";
		}
	};
	/**
	 * Unrecognised or invalid receiving agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid receiving agent."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ReceivingCustodian = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingCustodian";
			definition = "Unrecognised or invalid receiving agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RCUS";
		}
	};
	/**
	 * Cancellation request has been rejected since the instruction could not be
	 * found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected since the instruction could not be found."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotFoundRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotFoundRejection";
			definition = "Cancellation request has been rejected since the instruction could not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Quantity unit type is not provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity unit type is not provided."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode QuantityUnitType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityUnitType";
			definition = "Quantity unit type is not provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "QUNP";
		}
	};
	/**
	 * Unrecognised or invalid termination transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid termination transaction amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TerminationTransactionAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid repurchase rate."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RepurchaseRate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Unrecognised or invalid premium amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid premium amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PremiumAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid repurchase rate type."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RepurchaseRateType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Unrecognised or invalid spread rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid spread rate."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SpreadRate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Traded securities quantity not provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TQNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Traded securities quantity not provided."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TradedSecuritiesQuantity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradedSecuritiesQuantity";
			definition = "Traded securities quantity not provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TQNP";
		}
	};
	/**
	 * Unrecognised or invalid trade date or requested trade date or future
	 * trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid trade date or requested trade date or future trade date."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode TradeDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IVAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ReceivingAgent = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Intermediary is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode Intermediary = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Delivering agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivering agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DeliveringAgent = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Unrecognised or invalid place of trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid place of trade."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PlaceOfTrade = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Investor name and address is not recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor name and address is not recognised."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvestorNameAddressUnknown = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * It is not possible to use the RTGS system instructed (NRTG or YRTG).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is not possible to use the RTGS system instructed (NRTG or YRTG)."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ImpossibleToUseTheRTGSSystemInstructed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "It is not possible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement amount currency."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SettlementAmountCurrencyRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEOG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIndicatorRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid letter of guarantee indicator instructed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode LetterOfGuaranteeIndicatorRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuaranteeIndicatorRejection";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Missing credit authorisation (for pre-release transactions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Missing credit authorisation (for pre-release transactions)."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingCreditAuthorisation = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditAuthorisation";
			definition = "Missing credit authorisation (for pre-release transactions).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MCRA";
		}
	};
	/**
	 * Address details are incorrect or cannot be recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressDetailsRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address details are incorrect or cannot be recognised."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode AddressDetailsRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AddressDetailsRejection";
			definition = "Address details are incorrect or cannot be recognised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DADR";
		}
	};
	/**
	 * Unrecognised or invalid receiving or delivering custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingOrDeliveringCustodianRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid receiving or delivering custodian."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ReceivingOrDeliveringCustodianRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingOrDeliveringCustodianRejection";
			definition = "Unrecognised or invalid receiving or delivering custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Unrecognised or invalid buyer or seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid buyer or seller."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ReceivingDeliveringParty3 = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Unrecognised or invalid buyer or seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Physical settlement is impossible for the instructed financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical settlement is impossible for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode PhysicalSettlementImpossible = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has a reference identical to another previously received instruction."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode ReferenceRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReferenceRejection";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SettlementAmountRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmountRejection";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Missing statutes or commercial register or other legal documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingStatutes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Missing statutes or commercial register or other legal documents."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingStatutes = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingStatutes";
			definition = "Missing statutes or commercial register or other legal documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStampedOrSigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument has not been stamped and/or duly signed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotStampedOrSigned = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotStampedOrSigned";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Registration request does not have a valid signature of the owner of the
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request does not have a valid signature of the owner of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidSignature = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidSignature";
			definition = "Registration request does not have a valid signature of the owner of the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Unrecognised or invalid shareholder number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareholderNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid shareholder number."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ShareholderNumberRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShareholderNumberRejection";
			definition = "Unrecognised or invalid shareholder number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode MinimumSettlementQuantity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Cancellation request has been rejected since more than one instruction
	 * match to the cancellation criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected since more than one instruction match to the cancellation criteria."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoMatch = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatch";
			definition = "Cancellation request has been rejected since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Missing legal power for transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingLegalPower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing legal power for transfer."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingLegalPower = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingLegalPower";
			definition = "Missing legal power for transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode ProcessingBatchRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchRejection";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Type of ownership indicated is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOwnershipRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of ownership indicated is not correct."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TypeOfOwnershipRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfOwnershipRejection";
			definition = "Type of ownership indicated is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "OWNT";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode MultipleSettlementQuantity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is wrong. You have used the registration request of a
	 * different issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode WrongRegistrationRequest = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REQW";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid tax status of the securities instructed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TaxStatusRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxStatusRejection";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Registration reason indicated is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementInRegistrationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration reason indicated is not correct."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DisagreementInRegistrationReason = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementInRegistrationReason";
			definition = "Registration reason indicated is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RREA";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request to be completed by the buyer and to be forwarded to the issuer is missing."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingRegistrationRequest = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REQM";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid settlement system/method instructed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SettlementSystemMethodRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethodRejection";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised, invalid or missing common reference."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode CommonReferenceRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonReferenceRejection";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement preagreed narrative
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid service level agreement preagreed narrative information."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NarrativeInformationRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeInformationRejection";
			definition = "Unrecognised or invalid service level agreement preagreed narrative information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Invalid or incorrect program conversion specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectProgramConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid or incorrect program conversion specified."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode IncorrectProgramConversion = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectProgramConversion";
			definition = "Invalid or incorrect program conversion specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ICOP";
		}
	};
	/**
	 * Insufficient collateral proposed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient collateral proposed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InsufficientCollateral = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientCollateral";
			definition = "Insufficient collateral proposed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ICOL";
		}
	};
	/**
	 * Unrecognised or invalid business partner number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessPartnerNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid business partner number."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode BusinessPartnerNumberRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessPartnerNumberRejection";
			definition = "Unrecognised or invalid business partner number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "BPAR";
		}
	};
	/**
	 * Unrecognised or invalid bank reference number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReferenceNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid bank reference number."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode BankReferenceNumberRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankReferenceNumberRejection";
			definition = "Unrecognised or invalid bank reference number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "BREF";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid type of order."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode TypeOfOrderRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfOrderRejection";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action pending on the financial instrument instructed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode CorporateActionRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionRejection";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Impossible standing arrangements override instruction for the cash
	 * settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Impossible standing arrangements override instruction for the cash settlement system."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode ImpossibleCashSettlementSystem = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognized or invalid commercialization contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognized or invalid commercialization contract."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode CommercializationContractRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercializationContractRejection";
			definition = "Unrecognized or invalid commercialization contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Concentration limit was exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Concentration limit was exceeded."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ConcentrationLimitExceeded = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConcentrationLimitExceeded";
			definition = "Concentration limit was exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CONL";
		}
	};
	/**
	 * Deal or exposure is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownDealExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal or exposure is unknown."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode UnknownDealExposure = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownDealExposure";
			definition = "Deal or exposure is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CPTY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement date."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SettlementDateRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDateRejection";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Unrecognised or invalid place of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid place of settlement."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PlaceOfSettlementRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfSettlementRejection";
			definition = "Unrecognised or invalid place of settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Party A does not agree with the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party A does not agree with the call amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DisagreeWithCallAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreeWithCallAmount";
			definition = "Party A does not agree with the call amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Party A does not agree with the exposure amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithExposureAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party A does not agree with the exposure amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode DisagreeWithExposureAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreeWithExposureAmount";
			definition = "Party A does not agree with the exposure amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DISE";
		}
	};
	/**
	 * Disagreement between the data on the registration request and the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationRequestDataAndOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disagreement between the data on the registration request and the order."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode RegistrationRequestDataAndOrderRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			definition = "Disagreement between the data on the registration request and the order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Unrecognized or invalid fee or commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognized or invalid fee or commission."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode FeeCommissionRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FeeCommissionRejection";
			definition = "Unrecognized or invalid fee or commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Incorrect activity type specified, for example, pre-release conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectActivityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Incorrect activity type specified, for example, pre-release conversion."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode IncorrectActivityType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectActivityType";
			definition = "Incorrect activity type specified, for example, pre-release conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "IACT";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement transaction type."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SettlementTransactionRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionRejection";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid closing date/time."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ClosingDateTimeRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingDateTimeRejection";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VASU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid variable rate support (repurchase agreement)."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode VariableRateSupportRejection = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupportRejection";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * A second option is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A second option is mandatory."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingOption = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingOption";
			definition = "A second option is mandatory.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SECO";
		}
	};
	/**
	 * Party is not defined as an agent
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDefinedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party is not defined as an agent"</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotDefinedAgent = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotDefinedAgent";
			definition = "Party is not defined as an agent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "AGID";
		}
	};
	/**
	 * Period Ending Date or Code is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period Ending Date or Code is missing."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingPeriodEndDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingPeriodEndDate";
			definition = "Period Ending Date or Code is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ENDP";
		}
	};
	/**
	 * Period Starting Date or Code is missing
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period Starting Date or Code is missing"</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingPeriodStartDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingPeriodStartDate";
			definition = "Period Starting Date or Code is missing";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "STAR";
		}
	};
	/**
	 * Resulting amount must be filled in as Exchange rate is present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting amount must be filled in as Exchange rate is present."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingResultingAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingResultingAmount";
			definition = "Resulting amount must be filled in as Exchange rate is present.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RESU";
		}
	};
	/**
	 * Security type does not match with the type of corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSecurityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security type does not match with the type of corporate action."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode WrongSecurityType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongSecurityType";
			definition = "Security type does not match with the type of corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SECT";
		}
	};
	/**
	 * The disperse security is not eligible in the I(CSD) Service Provider
	 * Owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleDisperseSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The disperse security is not eligible in the I(CSD) Service Provider Owner."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotEligibleDisperseSecurity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleDisperseSecurity";
			definition = "The disperse security is not eligible in the I(CSD) Service Provider Owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * The security is not eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security is not eligible."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NonEligibleSecurity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonEligibleSecurity";
			definition = "The security is not eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * There cannot be a resulting amount without an exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There cannot be a resulting amount without an exchange rate."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingExchangeRate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingExchangeRate";
			definition = "There cannot be a resulting amount without an exchange rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "XRAT";
		}
	};
	/**
	 * Value date is before payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateBeforePaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date is before payment date."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ValueDateBeforePaymentDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDateBeforePaymentDate";
			definition = "Value date is before payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Accrued interest is not applicable for this type of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedAccruedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrued interest is not applicable for this type of security."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode UnexpectedAccruedInterest = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnexpectedAccruedInterest";
			definition = "Accrued interest is not applicable for this type of security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Agent has no access to the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccessToService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent has no access to the service."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoAccessToService = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAccessToService";
			definition = "Agent has no access to the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Certification Indicator is not filled in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification Indicator is not filled in."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingCertification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCertification";
			definition = "Certification Indicator is not filled in.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Date is not a business day for the security market
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotBusinessDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date is not a business day for the security market"</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotBusinessDay = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotBusinessDay";
			definition = "Date is not a business day for the security market";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "BDAY";
		}
	};
	/**
	 * Effective date is after the payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDayAfterPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Effective date is after the payment date."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode EffectiveDayAfterPaymentDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			definition = "Effective date is after the payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PDAY";
		}
	};
	/**
	 * Gross amount is less than net amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GAMN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountLessThanNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross amount is less than net amount."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode GrossAmountLessThanNetAmount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			definition = "Gross amount is less than net amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "GAMN";
		}
	};
	/**
	 * One option must be marked as the default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDefaultOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "One option must be marked as the default."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MissingDefaultOption = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDefaultOption";
			definition = "One option must be marked as the default.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Party is not active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonActiveParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party is not active."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NonActiveParty = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonActiveParty";
			definition = "Party is not active.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NPAT";
		}
	};
	/**
	 * Period Ending date is before Period Starting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodEndDateBeforeStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period Ending date is before Period Starting date."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode PeriodEndDateBeforeStartDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			definition = "Period Ending date is before Period Starting date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PERI";
		}
	};
	/**
	 * Record date is after payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateAfterPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record date is after payment date."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode RecordDateAfterPaymentDate = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDateAfterPaymentDate";
			definition = "Record date is after payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "RDTE";
		}
	};
	/**
	 * The validation of the advice/instruction/request failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The validation of the advice/instruction/request failed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode FailedValidation = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailedValidation";
			definition = "The validation of the advice/instruction/request failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Rejected as the deactivation of the event is already completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventAlreadyDeactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejected as the deactivation of the event is already completed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode EventAlreadyDeactivated = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventAlreadyDeactivated";
			definition = "Rejected as the deactivation of the event is already completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The cancellation request is rejected as there is no pending deactivation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPendingDeactivationInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation request is rejected as there is no pending deactivation instruction."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoPendingDeactivationInstruction = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoPendingDeactivationInstruction";
			definition = "The cancellation request is rejected as there is no pending deactivation instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PDEA";
		}
	};
	/**
	 * Amendment is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment is not allowed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode AmendmentNotAllowed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmendmentNotAllowed";
			definition = "Amendment is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NAMD";
		}
	};
	/**
	 * Cancellation is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation is not allowed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode CancellationNotAllowed = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationNotAllowed";
			definition = "Cancellation is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NCAN";
		}
	};
	/**
	 * Instruction/Request arrives too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request arrives too late."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode Late = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Late";
			definition = "Instruction/Request arrives too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "LATT";
		}
	};
	/**
	 * The election advice is already cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The election advice is already cancelled."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ElectionAlreadyCancelled = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionAlreadyCancelled";
			definition = "The election advice is already cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * The election advice is already amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAlreadyAmended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The election advice is already amended."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode ElectionAlreadyAmended = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionAlreadyAmended";
			definition = "The election advice is already amended.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "ELEA";
		}
	};
	/**
	 * An Agent Corporate Action Deactivation Instruction with the same
	 * identification already exists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An Agent Corporate Action Deactivation Instruction with the same identification already exists."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode SameCAIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SameCAIdentification";
			definition = "An Agent Corporate Action Deactivation Instruction with the same identification already exists.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SAME";
		}
	};
	/**
	 * Invalid corporate action identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid corporate action identification supplied."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidCAIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidCAIdentification";
			definition = "Invalid corporate action identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "REFI";
		}
	};
	/**
	 * Invalid agent identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid agent identification supplied."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidAgent = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidAgent";
			definition = "Invalid agent identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "AGIN";
		}
	};
	/**
	 * Agent Identification specified does not correspond to the main Agent of
	 * the relating event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotMainAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent Identification specified does not correspond to the main Agent of the relating event."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotMainAgent = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotMainAgent";
			definition = "Agent Identification specified does not correspond to the main Agent of the relating event.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Invalid combination of CA option code and CA option number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid combination of CA option code and CA option number."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidOption = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOption";
			definition = "Invalid combination of CA option code and CA option number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * The specified Corporate Action option already has a pending deactivation
	 * instruction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeactivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The specified Corporate Action option already has a pending deactivation instruction"
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode PendingDeactivation = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingDeactivation";
			definition = "The specified Corporate Action option already has a pending deactivation instruction";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Unable to identify cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to identify cash account."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotIdentifiedCashAccount = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotIdentifiedCashAccount";
			definition = "Unable to identify cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CASA";
		}
	};
	/**
	 * Unable to identify correspondent bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCorrespondentBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to identify correspondent bank."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotIdentifiedCorrespondentBank = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			definition = "Unable to identify correspondent bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Invalid standing instruction type for the specified underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidStandingInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid standing instruction type for the specified underlying security."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidStandingInstructionType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidStandingInstructionType";
			definition = "Invalid standing instruction type for the specified underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * No holding for the specified underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No holding for the specified underlying security."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoHolding = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoHolding";
			definition = "No holding for the specified underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NOHO";
		}
	};
	/**
	 * Insufficient balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient balance."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InsufficientBalance = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientBalance";
			definition = "Insufficient balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INHO";
		}
	};
	/**
	 * Several message with the same identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Several message with the same identification."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode SameIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SameIdentification";
			definition = "Several message with the same identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "SAID";
		}
	};
	/**
	 * Rejected as the deactivation of the option is already completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAlreadyDeactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejected as the deactivation of the option is already completed."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode OptionAlreadyDeactivated = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionAlreadyDeactivated";
			definition = "Rejected as the deactivation of the option is already completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "DEAO";
		}
	};
	/**
	 * CA Event Type does not correspond with the relating Corporate Action
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CA Event Type does not correspond with the relating Corporate Action"</li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidEventType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidEventType";
			definition = "CA Event Type does not correspond with the relating Corporate Action";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INET";
		}
	};
	/**
	 * Underlying Security Identification does not correspond with the Corporate
	 * Action Reference supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying Security Identification does not correspond with the Corporate Action Reference supplied."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidUnderlyingSecurity = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidUnderlyingSecurity";
			definition = "Underlying Security Identification does not correspond with the Corporate Action Reference supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INUS";
		}
	};
	/**
	 * Event Processing Type does not correspond with the relating Corporate
	 * Action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event Processing Type does not correspond with the relating Corporate Action."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidEventProcessingType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidEventProcessingType";
			definition = "Event Processing Type does not correspond with the relating Corporate Action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INPT";
		}
	};
	/**
	 * Mandatory/Voluntary Event Type does not correspond with the relating
	 * Corporate Action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandatory/Voluntary Event Type does not correspond with the relating Corporate Action."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidMandatoryVoluntaryEventType = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			definition = "Mandatory/Voluntary Event Type does not correspond with the relating Corporate Action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INMV";
		}
	};
	/**
	 * Details specified in the Corporate Action General Information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCorporateActionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details specified in the Corporate Action General Information block are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidCorporateActionInformation = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidCorporateActionInformation";
			definition = "Details specified in the Corporate Action General Information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Message details specified in the instruction/request are inconsistent
	 * with those that were specified in the relating original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidDetails = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidDetails";
			definition = "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INDT";
		}
	};
	/**
	 * Specified Corporate Action has no remaining options to disable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRemainingOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified Corporate Action has no remaining options to disable."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NoRemainingOption = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoRemainingOption";
			definition = "Specified Corporate Action has no remaining options to disable.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NORO";
		}
	};
	/**
	 * Issuer CA Identification does not correspond with the Corporate Action
	 * Identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MICA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchedCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer CA Identification does not correspond with the Corporate Action Identification supplied."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode MismatchedCAIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MismatchedCAIdentification";
			definition = "Issuer CA Identification does not correspond with the Corporate Action Identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MICA";
		}
	};
	/**
	 * This instruction type is not applicable for mandatory events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This instruction type is not applicable for mandatory events."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NotApplicable = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotApplicable";
			definition = "This instruction type is not applicable for mandatory events.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NOAP";
		}
	};
	/**
	 * Details specified in the MOVEMENT GENERAL INFORMATION block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMovementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details specified in the MOVEMENT GENERAL INFORMATION block are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidMovementInformation = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidMovementInformation";
			definition = "Details specified in the MOVEMENT GENERAL INFORMATION block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INMO";
		}
	};
	/**
	 * One or more of the underlying movements have already settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementAlreadySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more of the underlying movements have already settled."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode MovementAlreadySettled = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementAlreadySettled";
			definition = "One or more of the underlying movements have already settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "MOSE";
		}
	};
	/**
	 * A narrative reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A narrative reason is provided."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode NarrativeReason = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeReason";
			definition = "A narrative reason is provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Instruction contains an invalid message identification, identification is
	 * unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid message identification, identification is unknown."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonCode InvalidIdentification = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidIdentification";
			definition = "Instruction contains an invalid message identification, identification is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Other reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other reason."</li>
	 * </ul>
	 */
	public static final RejectionReasonCode Other = new RejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, RejectionReasonCode> codesByName = new LinkedHashMap<>();

	protected RejectionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CTRA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonCode";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonCode.ClosingTransactionAmount, com.tools20022.repository.codeset.RejectionReasonCode.TradedQuantityHigherThanOriginalOrderQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.TransactionNoticeIDUnknown, com.tools20022.repository.codeset.RejectionReasonCode.TransactionNoticeAlreadyAcceptedOrRejected,
						com.tools20022.repository.codeset.RejectionReasonCode.OrderDateNotProvided, com.tools20022.repository.codeset.RejectionReasonCode.InvalidRequest,
						com.tools20022.repository.codeset.RejectionReasonCode.IncorrectCertification, com.tools20022.repository.codeset.RejectionReasonCode.InvalidReference,
						com.tools20022.repository.codeset.RejectionReasonCode.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReasonCode.QuantityRejection, com.tools20022.repository.codeset.RejectionReasonCode.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonCode.SplitVoteNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.PartialVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReasonCode.ProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReasonCode.RegistrationDiscrepancy, com.tools20022.repository.codeset.RejectionReasonCode.RejectedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidSecurity, com.tools20022.repository.codeset.RejectionReasonCode.InstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionCancelled, com.tools20022.repository.codeset.RejectionReasonCode.OptionInactive,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReasonCode.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReasonCode.LackofSecurities, com.tools20022.repository.codeset.RejectionReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReasonCode.Mismatch,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.InvalidOptionType,
						com.tools20022.repository.codeset.RejectionReasonCode.RejectedSinceAlreadyCancelled, com.tools20022.repository.codeset.RejectionReasonCode.RejectedSinceInProgress,
						com.tools20022.repository.codeset.RejectionReasonCode.UnrecognizedIdentification, com.tools20022.repository.codeset.RejectionReasonCode.UnknownSymbol,
						com.tools20022.repository.codeset.RejectionReasonCode.ClosedExchange, com.tools20022.repository.codeset.RejectionReasonCode.ExceedsLimit, com.tools20022.repository.codeset.RejectionReasonCode.TooLate,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidPrice, com.tools20022.repository.codeset.RejectionReasonCode.NotAuthorised, com.tools20022.repository.codeset.RejectionReasonCode.NoMatchInquiry,
						com.tools20022.repository.codeset.RejectionReasonCode.NoInstrumentMarket, com.tools20022.repository.codeset.RejectionReasonCode.NoInventory, com.tools20022.repository.codeset.RejectionReasonCode.Pass,
						com.tools20022.repository.codeset.RejectionReasonCode.PriceExceeds, com.tools20022.repository.codeset.RejectionReasonCode.QuantityExceeds, com.tools20022.repository.codeset.RejectionReasonCode.WrongSide,
						com.tools20022.repository.codeset.RejectionReasonCode.CalculationDifference, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientCredit,
						com.tools20022.repository.codeset.RejectionReasonCode.AgreementStartDate, com.tools20022.repository.codeset.RejectionReasonCode.TransactionCallDelay,
						com.tools20022.repository.codeset.RejectionReasonCode.CashAccount, com.tools20022.repository.codeset.RejectionReasonCode.DealPrice, com.tools20022.repository.codeset.RejectionReasonCode.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.DeliveringCustodian, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingCustodian,
						com.tools20022.repository.codeset.RejectionReasonCode.NotFoundRejection, com.tools20022.repository.codeset.RejectionReasonCode.QuantityUnitType,
						com.tools20022.repository.codeset.RejectionReasonCode.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReasonCode.PremiumAmount, com.tools20022.repository.codeset.RejectionReasonCode.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReasonCode.SpreadRate,
						com.tools20022.repository.codeset.RejectionReasonCode.TradedSecuritiesQuantity, com.tools20022.repository.codeset.RejectionReasonCode.TradeDate, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingAgent,
						com.tools20022.repository.codeset.RejectionReasonCode.Intermediary, com.tools20022.repository.codeset.RejectionReasonCode.DeliveringAgent, com.tools20022.repository.codeset.RejectionReasonCode.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReasonCode.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectionReasonCode.ImpossibleToUseTheRTGSSystemInstructed,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementAmountCurrencyRejection, com.tools20022.repository.codeset.RejectionReasonCode.LetterOfGuaranteeIndicatorRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingCreditAuthorisation, com.tools20022.repository.codeset.RejectionReasonCode.AddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.ReceivingOrDeliveringCustodianRejection, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.RejectionReasonCode.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReasonCode.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReasonCode.MissingStatutes,
						com.tools20022.repository.codeset.RejectionReasonCode.NotStampedOrSigned, com.tools20022.repository.codeset.RejectionReasonCode.InvalidSignature,
						com.tools20022.repository.codeset.RejectionReasonCode.ShareholderNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.NoMatch, com.tools20022.repository.codeset.RejectionReasonCode.MissingLegalPower, com.tools20022.repository.codeset.RejectionReasonCode.ProcessingBatchRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.TypeOfOwnershipRejection, com.tools20022.repository.codeset.RejectionReasonCode.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.WrongRegistrationRequest, com.tools20022.repository.codeset.RejectionReasonCode.TaxStatusRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.DisagreementInRegistrationReason, com.tools20022.repository.codeset.RejectionReasonCode.MissingRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementSystemMethodRejection, com.tools20022.repository.codeset.RejectionReasonCode.CommonReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.NarrativeInformationRejection, com.tools20022.repository.codeset.RejectionReasonCode.IncorrectProgramConversion,
						com.tools20022.repository.codeset.RejectionReasonCode.InsufficientCollateral, com.tools20022.repository.codeset.RejectionReasonCode.BusinessPartnerNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.BankReferenceNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.TypeOfOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.CorporateActionRejection, com.tools20022.repository.codeset.RejectionReasonCode.ImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RejectionReasonCode.CommercializationContractRejection, com.tools20022.repository.codeset.RejectionReasonCode.ConcentrationLimitExceeded,
						com.tools20022.repository.codeset.RejectionReasonCode.UnknownDealExposure, com.tools20022.repository.codeset.RejectionReasonCode.SettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.PlaceOfSettlementRejection, com.tools20022.repository.codeset.RejectionReasonCode.DisagreeWithCallAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.DisagreeWithExposureAmount, com.tools20022.repository.codeset.RejectionReasonCode.RegistrationRequestDataAndOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReasonCode.IncorrectActivityType,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReasonCode.ClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.VariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReasonCode.MissingOption,
						com.tools20022.repository.codeset.RejectionReasonCode.NotDefinedAgent, com.tools20022.repository.codeset.RejectionReasonCode.MissingPeriodEndDate,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingPeriodStartDate, com.tools20022.repository.codeset.RejectionReasonCode.MissingResultingAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.WrongSecurityType, com.tools20022.repository.codeset.RejectionReasonCode.NotEligibleDisperseSecurity,
						com.tools20022.repository.codeset.RejectionReasonCode.NonEligibleSecurity, com.tools20022.repository.codeset.RejectionReasonCode.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReasonCode.ValueDateBeforePaymentDate, com.tools20022.repository.codeset.RejectionReasonCode.UnexpectedAccruedInterest,
						com.tools20022.repository.codeset.RejectionReasonCode.NoAccessToService, com.tools20022.repository.codeset.RejectionReasonCode.MissingCertification,
						com.tools20022.repository.codeset.RejectionReasonCode.NotBusinessDay, com.tools20022.repository.codeset.RejectionReasonCode.EffectiveDayAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReasonCode.GrossAmountLessThanNetAmount, com.tools20022.repository.codeset.RejectionReasonCode.MissingDefaultOption,
						com.tools20022.repository.codeset.RejectionReasonCode.NonActiveParty, com.tools20022.repository.codeset.RejectionReasonCode.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.RejectionReasonCode.RecordDateAfterPaymentDate, com.tools20022.repository.codeset.RejectionReasonCode.FailedValidation,
						com.tools20022.repository.codeset.RejectionReasonCode.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonCode.NoPendingDeactivationInstruction,
						com.tools20022.repository.codeset.RejectionReasonCode.AmendmentNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.CancellationNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.Late,
						com.tools20022.repository.codeset.RejectionReasonCode.ElectionAlreadyCancelled, com.tools20022.repository.codeset.RejectionReasonCode.ElectionAlreadyAmended,
						com.tools20022.repository.codeset.RejectionReasonCode.SameCAIdentification, com.tools20022.repository.codeset.RejectionReasonCode.InvalidCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidAgent, com.tools20022.repository.codeset.RejectionReasonCode.NotMainAgent, com.tools20022.repository.codeset.RejectionReasonCode.InvalidOption,
						com.tools20022.repository.codeset.RejectionReasonCode.PendingDeactivation, com.tools20022.repository.codeset.RejectionReasonCode.NotIdentifiedCashAccount,
						com.tools20022.repository.codeset.RejectionReasonCode.NotIdentifiedCorrespondentBank, com.tools20022.repository.codeset.RejectionReasonCode.InvalidStandingInstructionType,
						com.tools20022.repository.codeset.RejectionReasonCode.NoHolding, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientBalance, com.tools20022.repository.codeset.RejectionReasonCode.SameIdentification,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonCode.InvalidEventType,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidUnderlyingSecurity, com.tools20022.repository.codeset.RejectionReasonCode.InvalidEventProcessingType,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidMandatoryVoluntaryEventType, com.tools20022.repository.codeset.RejectionReasonCode.InvalidCorporateActionInformation,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidDetails, com.tools20022.repository.codeset.RejectionReasonCode.NoRemainingOption,
						com.tools20022.repository.codeset.RejectionReasonCode.MismatchedCAIdentification, com.tools20022.repository.codeset.RejectionReasonCode.NotApplicable,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidMovementInformation, com.tools20022.repository.codeset.RejectionReasonCode.MovementAlreadySettled,
						com.tools20022.repository.codeset.RejectionReasonCode.NarrativeReason, com.tools20022.repository.codeset.RejectionReasonCode.InvalidIdentification, com.tools20022.repository.codeset.RejectionReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosingTransactionAmount.getCodeName().get(), ClosingTransactionAmount);
		codesByName.put(TradedQuantityHigherThanOriginalOrderQuantity.getCodeName().get(), TradedQuantityHigherThanOriginalOrderQuantity);
		codesByName.put(TransactionNoticeIDUnknown.getCodeName().get(), TransactionNoticeIDUnknown);
		codesByName.put(TransactionNoticeAlreadyAcceptedOrRejected.getCodeName().get(), TransactionNoticeAlreadyAcceptedOrRejected);
		codesByName.put(OrderDateNotProvided.getCodeName().get(), OrderDateNotProvided);
		codesByName.put(InvalidRequest.getCodeName().get(), InvalidRequest);
		codesByName.put(IncorrectCertification.getCodeName().get(), IncorrectCertification);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(InsufficientTresholdPosition.getCodeName().get(), InsufficientTresholdPosition);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SplitVoteNotAllowed.getCodeName().get(), SplitVoteNotAllowed);
		codesByName.put(PartialVoteNotAllowed.getCodeName().get(), PartialVoteNotAllowed);
		codesByName.put(MissingOrInvalidPOA.getCodeName().get(), MissingOrInvalidPOA);
		codesByName.put(ProxyCardDiscrepancy.getCodeName().get(), ProxyCardDiscrepancy);
		codesByName.put(RegistrationDiscrepancy.getCodeName().get(), RegistrationDiscrepancy);
		codesByName.put(RejectedByIssuerOrRegistrar.getCodeName().get(), RejectedByIssuerOrRegistrar);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(InstructionIrrevocable.getCodeName().get(), InstructionIrrevocable);
		codesByName.put(OptionCancelled.getCodeName().get(), OptionCancelled);
		codesByName.put(OptionInactive.getCodeName().get(), OptionInactive);
		codesByName.put(InvalidForTaxAuthorities.getCodeName().get(), InvalidForTaxAuthorities);
		codesByName.put(RefusedByTaxAuthorities.getCodeName().get(), RefusedByTaxAuthorities);
		codesByName.put(LackofSecurities.getCodeName().get(), LackofSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Mismatch.getCodeName().get(), Mismatch);
		codesByName.put(OptionNumberRejection.getCodeName().get(), OptionNumberRejection);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(UnrecognizedIdentification.getCodeName().get(), UnrecognizedIdentification);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(ClosedExchange.getCodeName().get(), ClosedExchange);
		codesByName.put(ExceedsLimit.getCodeName().get(), ExceedsLimit);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(NoMatchInquiry.getCodeName().get(), NoMatchInquiry);
		codesByName.put(NoInstrumentMarket.getCodeName().get(), NoInstrumentMarket);
		codesByName.put(NoInventory.getCodeName().get(), NoInventory);
		codesByName.put(Pass.getCodeName().get(), Pass);
		codesByName.put(PriceExceeds.getCodeName().get(), PriceExceeds);
		codesByName.put(QuantityExceeds.getCodeName().get(), QuantityExceeds);
		codesByName.put(WrongSide.getCodeName().get(), WrongSide);
		codesByName.put(CalculationDifference.getCodeName().get(), CalculationDifference);
		codesByName.put(InsufficientCredit.getCodeName().get(), InsufficientCredit);
		codesByName.put(AgreementStartDate.getCodeName().get(), AgreementStartDate);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(DeliveringCustodian.getCodeName().get(), DeliveringCustodian);
		codesByName.put(ReceivingCustodian.getCodeName().get(), ReceivingCustodian);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(QuantityUnitType.getCodeName().get(), QuantityUnitType);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(TradedSecuritiesQuantity.getCodeName().get(), TradedSecuritiesQuantity);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(LetterOfGuaranteeIndicatorRejection.getCodeName().get(), LetterOfGuaranteeIndicatorRejection);
		codesByName.put(MissingCreditAuthorisation.getCodeName().get(), MissingCreditAuthorisation);
		codesByName.put(AddressDetailsRejection.getCodeName().get(), AddressDetailsRejection);
		codesByName.put(ReceivingOrDeliveringCustodianRejection.getCodeName().get(), ReceivingOrDeliveringCustodianRejection);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(MissingStatutes.getCodeName().get(), MissingStatutes);
		codesByName.put(NotStampedOrSigned.getCodeName().get(), NotStampedOrSigned);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(ShareholderNumberRejection.getCodeName().get(), ShareholderNumberRejection);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(MissingLegalPower.getCodeName().get(), MissingLegalPower);
		codesByName.put(ProcessingBatchRejection.getCodeName().get(), ProcessingBatchRejection);
		codesByName.put(TypeOfOwnershipRejection.getCodeName().get(), TypeOfOwnershipRejection);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(WrongRegistrationRequest.getCodeName().get(), WrongRegistrationRequest);
		codesByName.put(TaxStatusRejection.getCodeName().get(), TaxStatusRejection);
		codesByName.put(DisagreementInRegistrationReason.getCodeName().get(), DisagreementInRegistrationReason);
		codesByName.put(MissingRegistrationRequest.getCodeName().get(), MissingRegistrationRequest);
		codesByName.put(SettlementSystemMethodRejection.getCodeName().get(), SettlementSystemMethodRejection);
		codesByName.put(CommonReferenceRejection.getCodeName().get(), CommonReferenceRejection);
		codesByName.put(NarrativeInformationRejection.getCodeName().get(), NarrativeInformationRejection);
		codesByName.put(IncorrectProgramConversion.getCodeName().get(), IncorrectProgramConversion);
		codesByName.put(InsufficientCollateral.getCodeName().get(), InsufficientCollateral);
		codesByName.put(BusinessPartnerNumberRejection.getCodeName().get(), BusinessPartnerNumberRejection);
		codesByName.put(BankReferenceNumberRejection.getCodeName().get(), BankReferenceNumberRejection);
		codesByName.put(TypeOfOrderRejection.getCodeName().get(), TypeOfOrderRejection);
		codesByName.put(CorporateActionRejection.getCodeName().get(), CorporateActionRejection);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(CommercializationContractRejection.getCodeName().get(), CommercializationContractRejection);
		codesByName.put(ConcentrationLimitExceeded.getCodeName().get(), ConcentrationLimitExceeded);
		codesByName.put(UnknownDealExposure.getCodeName().get(), UnknownDealExposure);
		codesByName.put(SettlementDateRejection.getCodeName().get(), SettlementDateRejection);
		codesByName.put(PlaceOfSettlementRejection.getCodeName().get(), PlaceOfSettlementRejection);
		codesByName.put(DisagreeWithCallAmount.getCodeName().get(), DisagreeWithCallAmount);
		codesByName.put(DisagreeWithExposureAmount.getCodeName().get(), DisagreeWithExposureAmount);
		codesByName.put(RegistrationRequestDataAndOrderRejection.getCodeName().get(), RegistrationRequestDataAndOrderRejection);
		codesByName.put(FeeCommissionRejection.getCodeName().get(), FeeCommissionRejection);
		codesByName.put(IncorrectActivityType.getCodeName().get(), IncorrectActivityType);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(VariableRateSupportRejection.getCodeName().get(), VariableRateSupportRejection);
		codesByName.put(MissingOption.getCodeName().get(), MissingOption);
		codesByName.put(NotDefinedAgent.getCodeName().get(), NotDefinedAgent);
		codesByName.put(MissingPeriodEndDate.getCodeName().get(), MissingPeriodEndDate);
		codesByName.put(MissingPeriodStartDate.getCodeName().get(), MissingPeriodStartDate);
		codesByName.put(MissingResultingAmount.getCodeName().get(), MissingResultingAmount);
		codesByName.put(WrongSecurityType.getCodeName().get(), WrongSecurityType);
		codesByName.put(NotEligibleDisperseSecurity.getCodeName().get(), NotEligibleDisperseSecurity);
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(MissingExchangeRate.getCodeName().get(), MissingExchangeRate);
		codesByName.put(ValueDateBeforePaymentDate.getCodeName().get(), ValueDateBeforePaymentDate);
		codesByName.put(UnexpectedAccruedInterest.getCodeName().get(), UnexpectedAccruedInterest);
		codesByName.put(NoAccessToService.getCodeName().get(), NoAccessToService);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(NotBusinessDay.getCodeName().get(), NotBusinessDay);
		codesByName.put(EffectiveDayAfterPaymentDate.getCodeName().get(), EffectiveDayAfterPaymentDate);
		codesByName.put(GrossAmountLessThanNetAmount.getCodeName().get(), GrossAmountLessThanNetAmount);
		codesByName.put(MissingDefaultOption.getCodeName().get(), MissingDefaultOption);
		codesByName.put(NonActiveParty.getCodeName().get(), NonActiveParty);
		codesByName.put(PeriodEndDateBeforeStartDate.getCodeName().get(), PeriodEndDateBeforeStartDate);
		codesByName.put(RecordDateAfterPaymentDate.getCodeName().get(), RecordDateAfterPaymentDate);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(EventAlreadyDeactivated.getCodeName().get(), EventAlreadyDeactivated);
		codesByName.put(NoPendingDeactivationInstruction.getCodeName().get(), NoPendingDeactivationInstruction);
		codesByName.put(AmendmentNotAllowed.getCodeName().get(), AmendmentNotAllowed);
		codesByName.put(CancellationNotAllowed.getCodeName().get(), CancellationNotAllowed);
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(ElectionAlreadyCancelled.getCodeName().get(), ElectionAlreadyCancelled);
		codesByName.put(ElectionAlreadyAmended.getCodeName().get(), ElectionAlreadyAmended);
		codesByName.put(SameCAIdentification.getCodeName().get(), SameCAIdentification);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(NotMainAgent.getCodeName().get(), NotMainAgent);
		codesByName.put(InvalidOption.getCodeName().get(), InvalidOption);
		codesByName.put(PendingDeactivation.getCodeName().get(), PendingDeactivation);
		codesByName.put(NotIdentifiedCashAccount.getCodeName().get(), NotIdentifiedCashAccount);
		codesByName.put(NotIdentifiedCorrespondentBank.getCodeName().get(), NotIdentifiedCorrespondentBank);
		codesByName.put(InvalidStandingInstructionType.getCodeName().get(), InvalidStandingInstructionType);
		codesByName.put(NoHolding.getCodeName().get(), NoHolding);
		codesByName.put(InsufficientBalance.getCodeName().get(), InsufficientBalance);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(OptionAlreadyDeactivated.getCodeName().get(), OptionAlreadyDeactivated);
		codesByName.put(InvalidEventType.getCodeName().get(), InvalidEventType);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidEventProcessingType.getCodeName().get(), InvalidEventProcessingType);
		codesByName.put(InvalidMandatoryVoluntaryEventType.getCodeName().get(), InvalidMandatoryVoluntaryEventType);
		codesByName.put(InvalidCorporateActionInformation.getCodeName().get(), InvalidCorporateActionInformation);
		codesByName.put(InvalidDetails.getCodeName().get(), InvalidDetails);
		codesByName.put(NoRemainingOption.getCodeName().get(), NoRemainingOption);
		codesByName.put(MismatchedCAIdentification.getCodeName().get(), MismatchedCAIdentification);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
		codesByName.put(InvalidMovementInformation.getCodeName().get(), InvalidMovementInformation);
		codesByName.put(MovementAlreadySettled.getCodeName().get(), MovementAlreadySettled);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static RejectionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReasonCode[] values() {
		RejectionReasonCode[] values = new RejectionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReasonCode> {
		@Override
		public RejectionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}