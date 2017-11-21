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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmReceivables
 * BalanceTypeCode.mmReceivables}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmPayables
 * BalanceTypeCode.mmPayables}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmOther
 * BalanceTypeCode.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmExpenses
 * BalanceTypeCode.mmExpenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCashAndCashEquivalents
 * BalanceTypeCode.mmCashAndCashEquivalents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestorInflowOutflow
 * BalanceTypeCode.mmInvestorInflowOutflow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmRevenues
 * BalanceTypeCode.mmRevenues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBorrowings
 * BalanceTypeCode.mmBorrowings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestments
 * BalanceTypeCode.mmInvestments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmOpening
 * BalanceTypeCode.mmOpening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInterim
 * BalanceTypeCode.mmInterim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmClosing
 * BalanceTypeCode.mmClosing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBook
 * BalanceTypeCode.mmBook}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCurrent
 * BalanceTypeCode.mmCurrent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmPending
 * BalanceTypeCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmLimitRelated
 * BalanceTypeCode.mmLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmAvailable
 * BalanceTypeCode.mmAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmLiquidityTransfer
 * BalanceTypeCode.mmLiquidityTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCredit
 * BalanceTypeCode.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmEligibleAssets
 * BalanceTypeCode.mmEligibleAssets}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmPayment
 * BalanceTypeCode.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBlocked
 * BalanceTypeCode.mmBlocked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmExpected
 * BalanceTypeCode.mmExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDaylightOverdraft
 * BalanceTypeCode.mmDaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmExpectedCredit
 * BalanceTypeCode.mmExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmExpectedDebit
 * BalanceTypeCode.mmExpectedDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmAdjustment
 * BalanceTypeCode.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmProgressiveAverage
 * BalanceTypeCode.mmProgressiveAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDebit
 * BalanceTypeCode.mmDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmThreshold
 * BalanceTypeCode.mmThreshold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmNoted
 * BalanceTypeCode.mmNoted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmSelf
 * BalanceTypeCode.mmSelf}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmMaster
 * BalanceTypeCode.mmMaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmForecastSettlement
 * BalanceTypeCode.mmForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBlockedTrades
 * BalanceTypeCode.mmBlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmOtherBlockedTrades
 * BalanceTypeCode.mmOtherBlockedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCustody
 * BalanceTypeCode.mmCustody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCashForecast
 * BalanceTypeCode.mmCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDividendsCollection
 * BalanceTypeCode.mmDividendsCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmNetFunding
 * BalanceTypeCode.mmNetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmPayInPayOut
 * BalanceTypeCode.mmPayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmExchangeForecast
 * BalanceTypeCode.mmExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCentralCounterparty
 * BalanceTypeCode.mmCentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmTotalOnHold
 * BalanceTypeCode.mmTotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCreditOnHold
 * BalanceTypeCode.mmCreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDebitOnHold
 * BalanceTypeCode.mmDebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmTotalProcessed
 * BalanceTypeCode.mmTotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCreditProcessed
 * BalanceTypeCode.mmCreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDebitProcessed
 * BalanceTypeCode.mmDebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmTotalFuture
 * BalanceTypeCode.mmTotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmTotalRejected
 * BalanceTypeCode.mmTotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmOpeningAvailable
 * BalanceTypeCode.mmOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInterimAvailable
 * BalanceTypeCode.mmInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmClosingAvailable
 * BalanceTypeCode.mmClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmForwardAvailable
 * BalanceTypeCode.mmForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmClosingBooked
 * BalanceTypeCode.mmClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInterimBooked
 * BalanceTypeCode.mmInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmOpeningBooked
 * BalanceTypeCode.mmOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmPreviouslyClosedBooked
 * BalanceTypeCode.mmPreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentOpeningAvailable
 * BalanceTypeCode.mmInvestmentOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentInterimAvailable
 * BalanceTypeCode.mmInvestmentInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentClosingAvailable
 * BalanceTypeCode.mmInvestmentClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentForwardAvailable
 * BalanceTypeCode.mmInvestmentForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentClosingBooked
 * BalanceTypeCode.mmInvestmentClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentInterimBooked
 * BalanceTypeCode.mmInvestmentInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentOpeningBooked
 * BalanceTypeCode.mmInvestmentOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInvestmentExpected
 * BalanceTypeCode.mmInvestmentExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementOpeningAvailable
 * BalanceTypeCode.mmDisbursementOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementInterimAvailable
 * BalanceTypeCode.mmDisbursementInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementClosingAvailable
 * BalanceTypeCode.mmDisbursementClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementForwardAvailable
 * BalanceTypeCode.mmDisbursementForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementClosingBooked
 * BalanceTypeCode.mmDisbursementClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementInterimBooked
 * BalanceTypeCode.mmDisbursementInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementOpeningBooked
 * BalanceTypeCode.mmDisbursementOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDisbursementExpected
 * BalanceTypeCode.mmDisbursementExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionOpeningAvailable
 * BalanceTypeCode.mmCollectionOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionInterimAvailable
 * BalanceTypeCode.mmCollectionInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionClosingAvailable
 * BalanceTypeCode.mmCollectionClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionForwardAvailable
 * BalanceTypeCode.mmCollectionForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionClosingBooked
 * BalanceTypeCode.mmCollectionClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionInterimBooked
 * BalanceTypeCode.mmCollectionInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionOpeningBooked
 * BalanceTypeCode.mmCollectionOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCollectionExpected
 * BalanceTypeCode.mmCollectionExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmFirmCollateralisation
 * BalanceTypeCode.mmFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmUsedAmountsFirmCollateralisation
 * BalanceTypeCode.mmUsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmSelfCollateralisation
 * BalanceTypeCode.mmSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmUsedAmountsSelfCollateralisation
 * BalanceTypeCode.mmUsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCustodyActual
 * BalanceTypeCode.mmCustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCCPGuaranteedForecasting
 * BalanceTypeCode.mmCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmNonCCPGuaranteedForecasting
 * BalanceTypeCode.mmNonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDefinitiveSettledSecurities
 * BalanceTypeCode.mmDefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmLackOfHoldingsTransactions
 * BalanceTypeCode.mmLackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmNonSettledSecurities
 * BalanceTypeCode.mmNonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCCPGuaranteedOTCTransactions
 * BalanceTypeCode.mmCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmForecastOTCTransactions
 * BalanceTypeCode.mmForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmNonCCPGuaranteedOTCTransactions
 * BalanceTypeCode.mmNonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmSAPDirectDebitAmount
 * BalanceTypeCode.mmSAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmSAPDirectCreditAmount
 * BalanceTypeCode.mmSAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCMUPRepoDebit
 * BalanceTypeCode.mmCMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmCMUPRepoCredit
 * BalanceTypeCode.mmCMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBulkSettlementCMUPDebit
 * BalanceTypeCode.mmBulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmBulkSettlementCMUPCredit
 * BalanceTypeCode.mmBulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmSAPQueueAmount
 * BalanceTypeCode.mmSAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmIntradayRepoLimit
 * BalanceTypeCode.mmIntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmIntradayRepoDrawings
 * BalanceTypeCode.mmIntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmDiscountWindowRepoDrawings
 * BalanceTypeCode.mmDiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmAvailableDMVForDiscountWindowRepo
 * BalanceTypeCode.mmAvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmAvailableDMVForIntradayRepo
 * BalanceTypeCode.mmAvailableDMVForIntradayRepo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmElected
 * BalanceTypeCode.mmElected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmReservedForDistribution
 * BalanceTypeCode.mmReservedForDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmReservedForRemoval
 * BalanceTypeCode.mmReservedForRemoval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmRestricted
 * BalanceTypeCode.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmTotalEntitled
 * BalanceTypeCode.mmTotalEntitled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmUnelected
 * BalanceTypeCode.mmUnelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#mmInformation
 * BalanceTypeCode.mmInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType12Code
 * BalanceType12Code}</li>
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
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the balance."</li>
 * </ul>
 */
public class BalanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to receivables.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Receivables"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to receivables."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivables = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Receivables";
			definition = "Balance attributed to receivables.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Balance attributed to payables.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payables"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to payables."</li>
	 * </ul>
	 */
	public static final MMCode mmPayables = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payables";
			definition = "Balance attributed to payables.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PAYA";
		}
	};
	/**
	 * Balance attributed according to a different classification, which is not
	 * explictly defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed according to a different classification, which is not explictly defined."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Balance attributed according to a different classification, which is not explictly defined.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Balance attributed to expenses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expenses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to expenses."</li>
	 * </ul>
	 */
	public static final MMCode mmExpenses = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expenses";
			definition = "Balance attributed to expenses.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "EXPN";
		}
	};
	/**
	 * Balance attributed to cash and cash equivalents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndCashEquivalents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to cash and cash equivalents."</li>
	 * </ul>
	 */
	public static final MMCode mmCashAndCashEquivalents = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAndCashEquivalents";
			definition = "Balance attributed to cash and cash equivalents.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Balance attributed to investor inflow/outflow (creations, cancellations,
	 * income distributions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorInflowOutflow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to investor inflow/outflow (creations, cancellations, income distributions)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestorInflowOutflow = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorInflowOutflow";
			definition = "Balance attributed to investor inflow/outflow (creations, cancellations, income distributions).";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IIOF";
		}
	};
	/**
	 * Balance attributed to revenues; including dividends, interest, net
	 * realised gains/losses etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Revenues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to revenues; including dividends, interest, net realised gains/losses etc."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevenues = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Revenues";
			definition = "Balance attributed to revenues; including dividends, interest, net realised gains/losses etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REVE";
		}
	};
	/**
	 * Balance attributed to borrowings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to borrowings."</li>
	 * </ul>
	 */
	public static final MMCode mmBorrowings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Borrowings";
			definition = "Balance attributed to borrowings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance attributed to investments at value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to investments at value."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Investments";
			definition = "Balance attributed to investments at value.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Book balance of the account at the beginning of the account servicer's
	 * business day. It always equals the closing book balance from the previous
	 * business day. Note: the available balance at the beginning of the account
	 * servicer's business day may be different from the closing book balance
	 * from the previous business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. Note: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOpening = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Opening";
			definition = "Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. Note: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPNG";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INTM";
		}
	};
	/**
	 * Balance of the account at the end of the account servicer's business day.
	 * It is the sum of the opening balance at the beginning of the day and all
	 * entries booked to the account during the account servicer's business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClosing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closing";
			definition = "Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLSG";
		}
	};
	/**
	 * Balance that is registered in the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that is registered in the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMCode mmBook = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Book";
			definition = "Balance that is registered in the books of the account servicer.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Balance of the account at a precise moment in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account at a precise moment in time."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Balance of the account at a precise moment in time.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CRRT";
		}
	};
	/**
	 * Balance of securities pending delivery, eg, orders to sell securities
	 * have been executed but settlement of the open transactions has not been
	 * confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending delivery, eg, orders to sell securities have been executed but settlement of the open transactions has not been confirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Balance of securities pending delivery, eg, orders to sell securities have been executed but settlement of the open transactions has not been confirmed.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Balance of a specific limit value, eg, a bilateral balance is calculated
	 * in relation to a given bilateral limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LRLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of a specific limit value, eg, a bilateral balance is calculated in relation to a given bilateral limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLimitRelated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitRelated";
			definition = "Balance of a specific limit value, eg, a bilateral balance is calculated in relation to a given bilateral limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LRLD";
		}
	};
	/**
	 * Balance of money or securities that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of money or securities that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Available";
			definition = "Balance of money or securities that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "AVLB";
		}
	};
	/**
	 * Balance composed of the sum of all liquidity transfers made to or from an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTSF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance composed of the sum of all liquidity transfers made to or from an account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiquidityTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityTransfer";
			definition = "Balance composed of the sum of all liquidity transfers made to or from an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LTSF";
		}
	};
	/**
	 * Balance representing the sum of all credit entries booked to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of all credit entries booked to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Balance representing the sum of all credit entries booked to an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Balance representing the potential loan a Central Bank would make in cash
	 * if the collateral is pledged, eg, securities available and eligible as
	 * collateral with the Central Bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, eg, securities available and eligible as collateral with the Central Bank."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEligibleAssets = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleAssets";
			definition = "Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, eg, securities available and eligible as collateral with the Central Bank.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "EAST";
		}
	};
	/**
	 * Balance representing the sum of entries as a result of payments
	 * processing. Entries relating to fees, interest, or other movements not a
	 * result of payments sent or received by the account owner are not
	 * included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PYMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of entries as a result of payments processing.  Entries relating to fees,  interest, or other movements not a result of payments sent or received by the account owner are not included."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Balance representing the sum of entries as a result of payments processing.  Entries relating to fees,  interest, or other movements not a result of payments sent or received by the account owner are not included.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PYMT";
		}
	};
	/**
	 * Balance representing the regulatory reserve that a financial institution
	 * must have with the account servicing institution, eg, the minimum credit
	 * balance a financial institution is to keep with its Central Bank for
	 * mandatory reserve purposes. In some countries, a blocked balance is known
	 * as a 'reserve' balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, eg, the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes.  In some countries, a blocked balance is known as a 'reserve' balance."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, eg, the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes.  In some countries, a blocked balance is known as a 'reserve' balance.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation , which projects the end of day balance if everything is
	 * booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XPCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExpected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expected";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XPCD";
		}
	};
	/**
	 * Balance representing the intra day overdraft granted by the Central Bank
	 * to financial institutions participating in a RTGS system. This balance
	 * may vary over time and shall be offset at the end of the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaylightOverdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the intra day overdraft granted by the Central Bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDaylightOverdraft = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DaylightOverdraft";
			definition = "Balance representing the intra day overdraft granted by the Central Bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DLOD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day credit balance if
	 * everything books to the account and no other credit entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExpectedCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedCredit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCRD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day debit balance if everything
	 * books to the account and no other debit entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XDBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExpectedDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedDebit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XDBT";
		}
	};
	/**
	 * Balance to be held in the settlement account in order to comply with the
	 * average reserve due, in the event that the bank's balance is equal to the
	 * reserve due during the remaining days of the maintenance period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance to be held in the settlement account in order to comply with the average reserve due, in the event that the bank's balance is equal to the reserve due during the remaining days of the maintenance period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Balance to be held in the settlement account in order to comply with the average reserve due, in the event that the bank's balance is equal to the reserve due during the remaining days of the maintenance period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ADJT";
		}
	};
	/**
	 * Average of the daily balances on the account used to fulfil the reserve
	 * requirements calculated from the beginning of the maintenance period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressiveAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProgressiveAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProgressiveAverage";
			definition = "Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PRAV";
		}
	};
	/**
	 * Balance representing the sum of all debit entries booked to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of all debit entries booked to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Balance representing the sum of all debit entries booked to an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DBIT";
		}
	};
	/**
	 * Balance representing the amount that will be destined for investment.
	 * Difference between available balance and threshold for investment limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Threshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmThreshold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Threshold";
			definition = "Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "THRE";
		}
	};
	/**
	 * Balance representing the amount that a financial institution has set
	 * aside for a specific reason and which is therefore not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Noted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Noted";
			definition = "Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "NOTE";
		}
	};
	/**
	 * Balance of the account identified (as opposed to Master Balance)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Self"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account identified (as opposed to Master Balance)"</li>
	 * </ul>
	 */
	public static final MMCode mmSelf = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Self";
			definition = "Balance of the account identified (as opposed to Master Balance)";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SELF";
		}
	};
	/**
	 * Balance of the identified account plus the balance of all of its
	 * subaccounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Master"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the identified account plus the balance of all of its subaccounts."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaster = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Master";
			definition = "Balance of the identified account plus the balance of all of its subaccounts.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "MSTR";
		}
	};
	/**
	 * Balance representing the forecast of total of all cash legs for trades
	 * that are ready to settle via CSD. Amounts shown are still subject to
	 * processing of the securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of total of all cash legs for trades that are ready to settle via CSD. Amounts shown are still subject to processing of the securities settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForecastSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForecastSettlement";
			definition = "Balance representing the forecast of total of all cash legs for trades that are ready to settle via CSD. Amounts shown are still subject to processing of the securities settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FSET";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via CSD that have been matched but blocked in order to not
	 * settle. These blocked trades are included in the calculation for
	 * settlement (eg, to avoid overdrafts). Usage rule: Blocking can be done by
	 * account owner or its counterparties. Usually this is done to chain
	 * transactions or to prioritise other trades. Blocked trades have an
	 * indicator that prevents the transactions from settling. Once matched,
	 * they can settle whenever the freeze is lifted. In this case they will
	 * move to FSET. Lifting the freeze can happen anytime during the day and
	 * the transaction will be settling in the next settlement cycle which can
	 * be the same day if the (I)CSD's operates several settlements cycles per
	 * day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (eg, to avoid overdrafts).\nUsage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (I)CSD's operates several settlements cycles per day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedTrades = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (eg, to avoid overdrafts).\nUsage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (I)CSD's operates several settlements cycles per day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via CSD that have been matched but blocked in order to not
	 * settle. These blocked transactions are not included in the calculation
	 * for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherBlockedTrades = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherBlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTHB";
		}
	};
	/**
	 * Balance representing the projected total of all asset servicing
	 * transactions such as dividends, income corporate actions equivalents, tax
	 * returns, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustody = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Custody";
			definition = "Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Balance representing the total of all balance types representing
	 * transactions to settle, blocked items and custody transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashForecast = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashForecast";
			definition = "Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * Balance representing the projected total amount of all payment
	 * obligations to the participant (bank), based on their role as main paying
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsCollection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendsCollection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendsCollection";
			definition = "Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COLC";
		}
	};
	/**
	 * Balance representing the net amount to be funded resulting from all
	 * transactions which have an impact on the funding requirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNetFunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetFunding";
			definition = "Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * Balance representing the fictive forecast of automated direct debits or
	 * payment based on standing arrangements between the CSD and the user.
	 * 
	 * Usage: Pay-Ins and Pay-Outs can be different based on individual payment
	 * instructions or available funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInPayOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between the CSD and the user.\n\nUsage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPayInPayOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayInPayOut";
			definition = "Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between the CSD and the user.\n\nUsage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PIPO";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExchangeForecast = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForecast";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges that operate a central counterparty
	 * functionality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCentralCounterparty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterparty";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCPS";
		}
	};
	/**
	 * Balance representing the total of the payments that were put on hold
	 * because the limits have been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that were put on hold because the limits have been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalOnHold";
			definition = "Balance representing the total of the payments that were put on hold because the limits have been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TOHB";
		}
	};
	/**
	 * Balance representing the total incoming payments that were put on hold
	 * because the credit limit has been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditOnHold";
			definition = "Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COHB";
		}
	};
	/**
	 * Balance representing the total outgoing payments that were put on hold
	 * because the debit limit has been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDebitOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitOnHold";
			definition = "Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOHB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been processed
	 * and are waiting for settlement during the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that have been processed and are waiting for settlement during the day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalProcessed";
			definition = "Balance representing the total of the payments that have been processed and are waiting for settlement during the day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TPBL";
		}
	};
	/**
	 * Balance representing the total incoming payments that have been processed
	 * and are waiting for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total incoming payments that have been processed and are waiting for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditProcessed";
			definition = "Balance representing the total incoming payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CPBL";
		}
	};
	/**
	 * Balance representing the total outgoing payments that have been processed
	 * and are waiting for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total outgoing payments that have been processed and are waiting for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDebitProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitProcessed";
			definition = "Balance representing the total outgoing payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DPBL";
		}
	};
	/**
	 * Balance representing the total of the payments with a processing date in
	 * the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments with a processing date in the future."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalFuture";
			definition = "Balance representing the total of the payments with a processing date in the future.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FUTB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that have been rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalRejected";
			definition = "Balance representing the total of the payments that have been rejected.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REJB";
		}
	};
	/**
	 * Opening balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningAvailable";
			definition = "Opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPAV";
		}
	};
	/**
	 * Available balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimAvailable";
			definition = "Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ITAV";
		}
	};
	/**
	 * Closing balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingAvailable";
			definition = "Closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLAV";
		}
	};
	/**
	 * Forward available balance of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardAvailable";
			definition = "Forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FWAV";
		}
	};
	/**
	 * Balance of the account at the end of the pre-agreed account reporting
	 * period. It is the sum of the opening booked balance at the beginning of
	 * the period and all entries booked to the account during the pre-agreed
	 * account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingBooked";
			definition = "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLBD";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimBooked";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ITBD";
		}
	};
	/**
	 * Book balance of the account at the beginning of the account reporting
	 * period. It always equals the closing book balance from the previous
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningBooked";
			definition = "Book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPBD";
		}
	};
	/**
	 * Balance of the account at the previously closed account reporting period.
	 * The opening booked balance for the new period has to be equal to this
	 * balance.
	 * 
	 * Usage: the previously booked closing balance should equal (inclusive
	 * date) the booked closing balance of the date it references and equal the
	 * actual booked opening balance of the current date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyClosedBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. \n\nUsage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreviouslyClosedBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviouslyClosedBooked";
			definition = "Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. \n\nUsage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PRCD";
		}
	};
	/**
	 * Investment opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningAvailable";
			definition = "Investment opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IOPA";
		}
	};
	/**
	 * Investment available balance for calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimAvailable";
			definition = "Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IITA";
		}
	};
	/**
	 * Investment closing balance of an amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingAvailable";
			definition = "Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ICLA";
		}
	};
	/**
	 * Investment forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentForwardAvailable";
			definition = "Investment forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IFWA";
		}
	};
	/**
	 * Investment (mutual funds) balance of the account at the end of the
	 * pre-agreed account reporting period. It is the sum of the opening booked
	 * balance at the beginning of the period and all entries booked to the
	 * account during the pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingBooked";
			definition = "Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ICLB";
		}
	};
	/**
	 * Investment balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimBooked";
			definition = "Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IITB";
		}
	};
	/**
	 * Investment book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningBooked";
			definition = "Investment book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IOPB";
		}
	};
	/**
	 * Investment balance, composed of booked entries and pending items known at
	 * the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentExpected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentExpected";
			definition = "Investment balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IXPC";
		}
	};
	/**
	 * Disbursement opening balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningAvailable";
			definition = "Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOPA";
		}
	};
	/**
	 * Disbursement available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimAvailable";
			definition = "Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DITA";
		}
	};
	/**
	 * Disbursement closing balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingAvailable";
			definition = "Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DCLA";
		}
	};
	/**
	 * Disbursement forward available balance of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementForwardAvailable";
			definition = "Disbursement forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DFWA";
		}
	};
	/**
	 * Disbursement balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingBooked";
			definition = "Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DCLB";
		}
	};
	/**
	 * Disbursement balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimBooked";
			definition = "Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DITB";
		}
	};
	/**
	 * Disbursement book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningBooked";
			definition = "Disbursement book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOPB";
		}
	};
	/**
	 * Disbursement balance, composed of booked entries and pending items known
	 * at the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementExpected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementExpected";
			definition = "Disbursement balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DXPC";
		}
	};
	/**
	 * Collection opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningAvailable";
			definition = "Collection opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COPA";
		}
	};
	/**
	 * Collection available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimAvailable";
			definition = "Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CITA";
		}
	};
	/**
	 * Collection closing balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingAvailable";
			definition = "Collection closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCLA";
		}
	};
	/**
	 * Collection forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionForwardAvailable";
			definition = "Collection forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CFWA";
		}
	};
	/**
	 * Collection balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingBooked";
			definition = "Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCLB";
		}
	};
	/**
	 * Collection balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimBooked";
			definition = "Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CITB";
		}
	};
	/**
	 * Collection book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningBooked";
			definition = "Collection book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COPB";
		}
	};
	/**
	 * Collection balance, composed of booked entries and pending items known at
	 * the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionExpected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionExpected";
			definition = "Collection balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CXPC";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of existing holdings at CSD that are qualified to serve as
	 * collateral
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFirmCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirmCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FCOL";
		}
	};
	/**
	 * Balance representing the cash equivalent resulting from evaluation of
	 * existing holdings at CSD that are qualified to serve as collateral and
	 * have been used as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsFirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUsedAmountsFirmCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			definition = "Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FCOU";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of the net incoming balance of securities qualified to serve
	 * as collateral for which settlement instructions are held at.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSelfCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SelfCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SCOL";
		}
	};
	/**
	 * Balance representing the cash-equivalent resulting from evaluation of
	 * incoming securities, qualified to serve as collateral and actually used
	 * as collateral, which have been settled during the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsSelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUsedAmountsSelfCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			definition = "Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SCOU";
		}
	};
	/**
	 * Balance representing the actual total of all asset servicing transactions
	 * such as dividends, income corporate actions equivalents, tax returns,
	 * redemptions, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyActual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustodyActual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustodyActual";
			definition = "Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CUSA";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions in exchanges, going through CCP functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges not going through CCP functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through CCP functions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHN";
		}
	};
	/**
	 * Balance representing the cash equivalent of all settled securities
	 * transactions
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinitiveSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of all settled securities transactions"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDefinitiveSettledSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefinitiveSettledSecurities";
			definition = "Balance representing the cash equivalent of all settled securities transactions";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Balance representing the cash equivalent of transactions with a lack of
	 * holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfHoldingsTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of transactions with a lack of holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLackOfHoldingsTransactions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfHoldingsTransactions";
			definition = "Balance representing the cash equivalent of transactions with a lack of holdings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Balance representing the cash equivalent of all non-settled securities
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of all non-settled securities transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonSettledSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonSettledSecurities";
			definition = "Balance representing the cash equivalent of all non-settled securities transactions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "NSET";
		}
	};
	/**
	 * Balance representing the Forecast of the total of all cash-legs of
	 * transactions 'over the counter' (OTC), going through CCP functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through CCP functions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			definition = "Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForecastOTCTransactions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForecastOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC).";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC) not going through CCP
	 * functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through CCP functions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCN";
		}
	};
	/**
	 * Balance represents the settlement account processor direct debit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectDebitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor direct debit amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSAPDirectDebitAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPDirectDebitAmount";
			definition = "Balance represents the settlement account processor direct debit amount.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPD";
		}
	};
	/**
	 * Balance represents the settlement account processor direct credit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor direct credit amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSAPDirectCreditAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPDirectCreditAmount";
			definition = "Balance represents the settlement account processor direct credit amount.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPC";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo debits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the central moneymarkets unit processor repo debits."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCMUPRepoDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoDebit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo debits.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REPD";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo credits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the central moneymarkets unit processor repo credits."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCMUPRepoCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoCredit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo credits.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REPC";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the bulk settlement and central moneymarkets unit processor debit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBulkSettlementCMUPDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPDebit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor debit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BSCD";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the bulk settlement and central moneymarkets unit processor credit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBulkSettlementCMUPCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPCredit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor credit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BSCC";
		}
	};
	/**
	 * Balance represents the settlement account processor queue amount
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPQueueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor queue amount"</li>
	 * </ul>
	 */
	public static final MMCode mmSAPQueueAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPQueueAmount";
			definition = "Balance represents the settlement account processor queue amount";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPP";
		}
	};
	/**
	 * Balance represents the intraday repo limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the intraday repo limit."</li>
	 * </ul>
	 */
	public static final MMCode mmIntradayRepoLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoLimit";
			definition = "Balance represents the intraday repo limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IRLT";
		}
	};
	/**
	 * Balance represents the intraday repo drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the intraday repo drawings."</li>
	 * </ul>
	 */
	public static final MMCode mmIntradayRepoDrawings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoDrawings";
			definition = "Balance represents the intraday repo drawings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IRDR";
		}
	};
	/**
	 * Balance represents the discount window repo drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DWRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountWindowRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the discount window repo drawings."</li>
	 * </ul>
	 */
	public static final MMCode mmDiscountWindowRepoDrawings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountWindowRepoDrawings";
			definition = "Balance represents the discount window repo drawings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DWRD";
		}
	};
	/**
	 * Balance represents the available discounted market value for discount
	 * window repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADWR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForDiscountWindowRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the available discounted market value for discount window repo."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAvailableDMVForDiscountWindowRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			definition = "Balance represents the available discounted market value for discount window repo.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ADWR";
		}
	};
	/**
	 * Balance represents the available discounted market value for intraday
	 * repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForIntradayRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the available discounted market value for intraday repo."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAvailableDMVForIntradayRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			definition = "Balance represents the available discounted market value for intraday repo.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "AIDR";
		}
	};
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Elected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * </ul>
	 */
	public static final MMCode mmElected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Elected";
			definition = "Balance of instructed position.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Balance of financial instruments that are reserved for the distribution
	 * of the proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are reserved for the distribution of the proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReservedForDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservedForDistribution";
			definition = "Balance of financial instruments that are reserved for the distribution of the proceeds.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RDIS";
		}
	};
	/**
	 * Balance of securities which are reserved temporarily in the SPA account
	 * before they will effectively be exchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForRemoval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities which are reserved  temporarily in the SPA account before they will effectively be exchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReservedForRemoval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservedForRemoval";
			definition = "Balance of securities which are reserved  temporarily in the SPA account before they will effectively be exchanged.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RREM";
		}
	};
	/**
	 * Balance of cash that may only be used under certain conditions.
	 * 
	 * Balance type is used to block securities/cash in the client account e.g.,
	 * in relation to elections relating to certain corporate actions. The
	 * holding is under the direct control of the system paying agent, who us
	 * the only one who can transfer securities out of this balance type. Also
	 * known as the "escrow balance" or "sequestered balance".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of cash that may only be used under certain conditions.\n\nBalance type is used to block securities/cash in the client account e.g., in relation to elections relating to certain corporate actions. The holding is under the direct control of the system paying agent, who us the only one who can transfer securities out of this balance type.\nAlso known as the \"escrow balance\" or \"sequestered balance\"."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestricted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Balance of cash that may only be used under certain conditions.\n\nBalance type is used to block securities/cash in the client account e.g., in relation to elections relating to certain corporate actions. The holding is under the direct control of the system paying agent, who us the only one who can transfer securities out of this balance type.\nAlso known as the \"escrow balance\" or \"sequestered balance\".";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Total quantity of financial instruments entitled to the account owner
	 * based on the terms of the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntitled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments  entitled to the account owner based on the terms of the corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalEntitled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalEntitled";
			definition = "Total quantity of financial instruments  entitled to the account owner based on the terms of the corporate action event.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TENT";
		}
	};
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unelected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final MMCode mmUnelected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unelected";
			definition = "Balance of uninstructed position.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "UNEL";
		}
	};
	/**
	 * Balance for informational purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for informational purposes."</li>
	 * </ul>
	 */
	public static final MMCode mmInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Balance for informational purposes.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceTypeCode";
				definition = "Specifies the nature of the balance.";
				code_lazy = () -> Arrays.asList(BalanceTypeCode.mmReceivables, BalanceTypeCode.mmPayables, BalanceTypeCode.mmOther, BalanceTypeCode.mmExpenses, BalanceTypeCode.mmCashAndCashEquivalents,
						BalanceTypeCode.mmInvestorInflowOutflow, BalanceTypeCode.mmRevenues, BalanceTypeCode.mmBorrowings, BalanceTypeCode.mmInvestments, BalanceTypeCode.mmOpening, BalanceTypeCode.mmInterim, BalanceTypeCode.mmClosing,
						BalanceTypeCode.mmBook, BalanceTypeCode.mmCurrent, BalanceTypeCode.mmPending, BalanceTypeCode.mmLimitRelated, BalanceTypeCode.mmAvailable, BalanceTypeCode.mmLiquidityTransfer, BalanceTypeCode.mmCredit,
						BalanceTypeCode.mmEligibleAssets, BalanceTypeCode.mmPayment, BalanceTypeCode.mmBlocked, BalanceTypeCode.mmExpected, BalanceTypeCode.mmDaylightOverdraft, BalanceTypeCode.mmExpectedCredit,
						BalanceTypeCode.mmExpectedDebit, BalanceTypeCode.mmAdjustment, BalanceTypeCode.mmProgressiveAverage, BalanceTypeCode.mmDebit, BalanceTypeCode.mmThreshold, BalanceTypeCode.mmNoted, BalanceTypeCode.mmSelf,
						BalanceTypeCode.mmMaster, BalanceTypeCode.mmForecastSettlement, BalanceTypeCode.mmBlockedTrades, BalanceTypeCode.mmOtherBlockedTrades, BalanceTypeCode.mmCustody, BalanceTypeCode.mmCashForecast,
						BalanceTypeCode.mmDividendsCollection, BalanceTypeCode.mmNetFunding, BalanceTypeCode.mmPayInPayOut, BalanceTypeCode.mmExchangeForecast, BalanceTypeCode.mmCentralCounterparty, BalanceTypeCode.mmTotalOnHold,
						BalanceTypeCode.mmCreditOnHold, BalanceTypeCode.mmDebitOnHold, BalanceTypeCode.mmTotalProcessed, BalanceTypeCode.mmCreditProcessed, BalanceTypeCode.mmDebitProcessed, BalanceTypeCode.mmTotalFuture,
						BalanceTypeCode.mmTotalRejected, BalanceTypeCode.mmOpeningAvailable, BalanceTypeCode.mmInterimAvailable, BalanceTypeCode.mmClosingAvailable, BalanceTypeCode.mmForwardAvailable, BalanceTypeCode.mmClosingBooked,
						BalanceTypeCode.mmInterimBooked, BalanceTypeCode.mmOpeningBooked, BalanceTypeCode.mmPreviouslyClosedBooked, BalanceTypeCode.mmInvestmentOpeningAvailable, BalanceTypeCode.mmInvestmentInterimAvailable,
						BalanceTypeCode.mmInvestmentClosingAvailable, BalanceTypeCode.mmInvestmentForwardAvailable, BalanceTypeCode.mmInvestmentClosingBooked, BalanceTypeCode.mmInvestmentInterimBooked,
						BalanceTypeCode.mmInvestmentOpeningBooked, BalanceTypeCode.mmInvestmentExpected, BalanceTypeCode.mmDisbursementOpeningAvailable, BalanceTypeCode.mmDisbursementInterimAvailable,
						BalanceTypeCode.mmDisbursementClosingAvailable, BalanceTypeCode.mmDisbursementForwardAvailable, BalanceTypeCode.mmDisbursementClosingBooked, BalanceTypeCode.mmDisbursementInterimBooked,
						BalanceTypeCode.mmDisbursementOpeningBooked, BalanceTypeCode.mmDisbursementExpected, BalanceTypeCode.mmCollectionOpeningAvailable, BalanceTypeCode.mmCollectionInterimAvailable,
						BalanceTypeCode.mmCollectionClosingAvailable, BalanceTypeCode.mmCollectionForwardAvailable, BalanceTypeCode.mmCollectionClosingBooked, BalanceTypeCode.mmCollectionInterimBooked,
						BalanceTypeCode.mmCollectionOpeningBooked, BalanceTypeCode.mmCollectionExpected, BalanceTypeCode.mmFirmCollateralisation, BalanceTypeCode.mmUsedAmountsFirmCollateralisation, BalanceTypeCode.mmSelfCollateralisation,
						BalanceTypeCode.mmUsedAmountsSelfCollateralisation, BalanceTypeCode.mmCustodyActual, BalanceTypeCode.mmCCPGuaranteedForecasting, BalanceTypeCode.mmNonCCPGuaranteedForecasting,
						BalanceTypeCode.mmDefinitiveSettledSecurities, BalanceTypeCode.mmLackOfHoldingsTransactions, BalanceTypeCode.mmNonSettledSecurities, BalanceTypeCode.mmCCPGuaranteedOTCTransactions,
						BalanceTypeCode.mmForecastOTCTransactions, BalanceTypeCode.mmNonCCPGuaranteedOTCTransactions, BalanceTypeCode.mmSAPDirectDebitAmount, BalanceTypeCode.mmSAPDirectCreditAmount, BalanceTypeCode.mmCMUPRepoDebit,
						BalanceTypeCode.mmCMUPRepoCredit, BalanceTypeCode.mmBulkSettlementCMUPDebit, BalanceTypeCode.mmBulkSettlementCMUPCredit, BalanceTypeCode.mmSAPQueueAmount, BalanceTypeCode.mmIntradayRepoLimit,
						BalanceTypeCode.mmIntradayRepoDrawings, BalanceTypeCode.mmDiscountWindowRepoDrawings, BalanceTypeCode.mmAvailableDMVForDiscountWindowRepo, BalanceTypeCode.mmAvailableDMVForIntradayRepo, BalanceTypeCode.mmElected,
						BalanceTypeCode.mmReservedForDistribution, BalanceTypeCode.mmReservedForRemoval, BalanceTypeCode.mmRestricted, BalanceTypeCode.mmTotalEntitled, BalanceTypeCode.mmUnelected, BalanceTypeCode.mmInformation);
				derivation_lazy = () -> Arrays.asList(BalanceType12Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}