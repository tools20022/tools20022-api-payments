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
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Receivables
 * BalanceTypeCode.Receivables}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Payables
 * BalanceTypeCode.Payables}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Other
 * BalanceTypeCode.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Expenses
 * BalanceTypeCode.Expenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CashAndCashEquivalents
 * BalanceTypeCode.CashAndCashEquivalents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestorInflowOutflow
 * BalanceTypeCode.InvestorInflowOutflow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Revenues
 * BalanceTypeCode.Revenues}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Borrowings
 * BalanceTypeCode.Borrowings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Investments
 * BalanceTypeCode.Investments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Opening
 * BalanceTypeCode.Opening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Interim
 * BalanceTypeCode.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Closing
 * BalanceTypeCode.Closing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Book
 * BalanceTypeCode.Book}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Current
 * BalanceTypeCode.Current}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Pending
 * BalanceTypeCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#LimitRelated
 * BalanceTypeCode.LimitRelated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Available
 * BalanceTypeCode.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#LiquidityTransfer
 * BalanceTypeCode.LiquidityTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Credit
 * BalanceTypeCode.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#EligibleAssets
 * BalanceTypeCode.EligibleAssets}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Payment
 * BalanceTypeCode.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Blocked
 * BalanceTypeCode.Blocked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Expected
 * BalanceTypeCode.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DaylightOverdraft
 * BalanceTypeCode.DaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ExpectedCredit
 * BalanceTypeCode.ExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ExpectedDebit
 * BalanceTypeCode.ExpectedDebit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Adjustment
 * BalanceTypeCode.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ProgressiveAverage
 * BalanceTypeCode.ProgressiveAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Debit
 * BalanceTypeCode.Debit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Threshold
 * BalanceTypeCode.Threshold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Noted
 * BalanceTypeCode.Noted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Self
 * BalanceTypeCode.Self}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Master
 * BalanceTypeCode.Master}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ForecastSettlement
 * BalanceTypeCode.ForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#BlockedTrades
 * BalanceTypeCode.BlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#OtherBlockedTrades
 * BalanceTypeCode.OtherBlockedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Custody
 * BalanceTypeCode.Custody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CashForecast
 * BalanceTypeCode.CashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DividendsCollection
 * BalanceTypeCode.DividendsCollection}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#NetFunding
 * BalanceTypeCode.NetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#PayInPayOut
 * BalanceTypeCode.PayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ExchangeForecast
 * BalanceTypeCode.ExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CentralCounterparty
 * BalanceTypeCode.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#TotalOnHold
 * BalanceTypeCode.TotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CreditOnHold
 * BalanceTypeCode.CreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DebitOnHold
 * BalanceTypeCode.DebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#TotalProcessed
 * BalanceTypeCode.TotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CreditProcessed
 * BalanceTypeCode.CreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DebitProcessed
 * BalanceTypeCode.DebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#TotalFuture
 * BalanceTypeCode.TotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#TotalRejected
 * BalanceTypeCode.TotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#OpeningAvailable
 * BalanceTypeCode.OpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InterimAvailable
 * BalanceTypeCode.InterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ClosingAvailable
 * BalanceTypeCode.ClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ForwardAvailable
 * BalanceTypeCode.ForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ClosingBooked
 * BalanceTypeCode.ClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InterimBooked
 * BalanceTypeCode.InterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#OpeningBooked
 * BalanceTypeCode.OpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#PreviouslyClosedBooked
 * BalanceTypeCode.PreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentOpeningAvailable
 * BalanceTypeCode.InvestmentOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentInterimAvailable
 * BalanceTypeCode.InvestmentInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentClosingAvailable
 * BalanceTypeCode.InvestmentClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentForwardAvailable
 * BalanceTypeCode.InvestmentForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentClosingBooked
 * BalanceTypeCode.InvestmentClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentInterimBooked
 * BalanceTypeCode.InvestmentInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentOpeningBooked
 * BalanceTypeCode.InvestmentOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#InvestmentExpected
 * BalanceTypeCode.InvestmentExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementOpeningAvailable
 * BalanceTypeCode.DisbursementOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementInterimAvailable
 * BalanceTypeCode.DisbursementInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementClosingAvailable
 * BalanceTypeCode.DisbursementClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementForwardAvailable
 * BalanceTypeCode.DisbursementForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementClosingBooked
 * BalanceTypeCode.DisbursementClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementInterimBooked
 * BalanceTypeCode.DisbursementInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementOpeningBooked
 * BalanceTypeCode.DisbursementOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DisbursementExpected
 * BalanceTypeCode.DisbursementExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionOpeningAvailable
 * BalanceTypeCode.CollectionOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionInterimAvailable
 * BalanceTypeCode.CollectionInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionClosingAvailable
 * BalanceTypeCode.CollectionClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionForwardAvailable
 * BalanceTypeCode.CollectionForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionClosingBooked
 * BalanceTypeCode.CollectionClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionInterimBooked
 * BalanceTypeCode.CollectionInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionOpeningBooked
 * BalanceTypeCode.CollectionOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CollectionExpected
 * BalanceTypeCode.CollectionExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#FirmCollateralisation
 * BalanceTypeCode.FirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#UsedAmountsFirmCollateralisation
 * BalanceTypeCode.UsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#SelfCollateralisation
 * BalanceTypeCode.SelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#UsedAmountsSelfCollateralisation
 * BalanceTypeCode.UsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CustodyActual
 * BalanceTypeCode.CustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CCPGuaranteedForecasting
 * BalanceTypeCode.CCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#NonCCPGuaranteedForecasting
 * BalanceTypeCode.NonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DefinitiveSettledSecurities
 * BalanceTypeCode.DefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#LackOfHoldingsTransactions
 * BalanceTypeCode.LackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#NonSettledSecurities
 * BalanceTypeCode.NonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CCPGuaranteedOTCTransactions
 * BalanceTypeCode.CCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ForecastOTCTransactions
 * BalanceTypeCode.ForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#NonCCPGuaranteedOTCTransactions
 * BalanceTypeCode.NonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#SAPDirectDebitAmount
 * BalanceTypeCode.SAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#SAPDirectCreditAmount
 * BalanceTypeCode.SAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CMUPRepoDebit
 * BalanceTypeCode.CMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#CMUPRepoCredit
 * BalanceTypeCode.CMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#BulkSettlementCMUPDebit
 * BalanceTypeCode.BulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#BulkSettlementCMUPCredit
 * BalanceTypeCode.BulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#SAPQueueAmount
 * BalanceTypeCode.SAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#IntradayRepoLimit
 * BalanceTypeCode.IntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#IntradayRepoDrawings
 * BalanceTypeCode.IntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#DiscountWindowRepoDrawings
 * BalanceTypeCode.DiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#AvailableDMVForDiscountWindowRepo
 * BalanceTypeCode.AvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#AvailableDMVForIntradayRepo
 * BalanceTypeCode.AvailableDMVForIntradayRepo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Elected
 * BalanceTypeCode.Elected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ReservedForDistribution
 * BalanceTypeCode.ReservedForDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#ReservedForRemoval
 * BalanceTypeCode.ReservedForRemoval}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Restricted
 * BalanceTypeCode.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#TotalEntitled
 * BalanceTypeCode.TotalEntitled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Unelected
 * BalanceTypeCode.Unelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode#Information
 * BalanceTypeCode.Information}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMCode Receivables = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Payables = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Expenses = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CashAndCashEquivalents = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestorInflowOutflow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Revenues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Borrowings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Investments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Opening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Interim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Closing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Book = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode LimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Available = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode LiquidityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode EligibleAssets = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Payment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Expected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DaylightOverdraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ExpectedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ExpectedDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Adjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ProgressiveAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Threshold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Noted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Self = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Master = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ForecastSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode BlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode OtherBlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Custody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CashForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DividendsCollection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode NetFunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode PayInPayOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ExchangeForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CentralCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TotalOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CreditOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DebitOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TotalProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CreditProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DebitProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TotalFuture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TotalRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode OpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode OpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode PreviouslyClosedBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InvestmentExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DisbursementExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CollectionExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode FirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode UsedAmountsFirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode UsedAmountsSelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CustodyActual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode NonCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DefinitiveSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode LackOfHoldingsTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode NonSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ForecastOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode NonCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SAPDirectDebitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SAPDirectCreditAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CMUPRepoDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CMUPRepoCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode BulkSettlementCMUPDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode BulkSettlementCMUPCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SAPQueueAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode IntradayRepoLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode IntradayRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode DiscountWindowRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode AvailableDMVForDiscountWindowRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode AvailableDMVForIntradayRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Elected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ReservedForDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ReservedForRemoval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Restricted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TotalEntitled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Unelected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Information = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Balance for informational purposes.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceTypeCode";
				definition = "Specifies the nature of the balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceTypeCode.Receivables, com.tools20022.repository.codeset.BalanceTypeCode.Payables, com.tools20022.repository.codeset.BalanceTypeCode.Other,
						com.tools20022.repository.codeset.BalanceTypeCode.Expenses, com.tools20022.repository.codeset.BalanceTypeCode.CashAndCashEquivalents, com.tools20022.repository.codeset.BalanceTypeCode.InvestorInflowOutflow,
						com.tools20022.repository.codeset.BalanceTypeCode.Revenues, com.tools20022.repository.codeset.BalanceTypeCode.Borrowings, com.tools20022.repository.codeset.BalanceTypeCode.Investments,
						com.tools20022.repository.codeset.BalanceTypeCode.Opening, com.tools20022.repository.codeset.BalanceTypeCode.Interim, com.tools20022.repository.codeset.BalanceTypeCode.Closing,
						com.tools20022.repository.codeset.BalanceTypeCode.Book, com.tools20022.repository.codeset.BalanceTypeCode.Current, com.tools20022.repository.codeset.BalanceTypeCode.Pending,
						com.tools20022.repository.codeset.BalanceTypeCode.LimitRelated, com.tools20022.repository.codeset.BalanceTypeCode.Available, com.tools20022.repository.codeset.BalanceTypeCode.LiquidityTransfer,
						com.tools20022.repository.codeset.BalanceTypeCode.Credit, com.tools20022.repository.codeset.BalanceTypeCode.EligibleAssets, com.tools20022.repository.codeset.BalanceTypeCode.Payment,
						com.tools20022.repository.codeset.BalanceTypeCode.Blocked, com.tools20022.repository.codeset.BalanceTypeCode.Expected, com.tools20022.repository.codeset.BalanceTypeCode.DaylightOverdraft,
						com.tools20022.repository.codeset.BalanceTypeCode.ExpectedCredit, com.tools20022.repository.codeset.BalanceTypeCode.ExpectedDebit, com.tools20022.repository.codeset.BalanceTypeCode.Adjustment,
						com.tools20022.repository.codeset.BalanceTypeCode.ProgressiveAverage, com.tools20022.repository.codeset.BalanceTypeCode.Debit, com.tools20022.repository.codeset.BalanceTypeCode.Threshold,
						com.tools20022.repository.codeset.BalanceTypeCode.Noted, com.tools20022.repository.codeset.BalanceTypeCode.Self, com.tools20022.repository.codeset.BalanceTypeCode.Master,
						com.tools20022.repository.codeset.BalanceTypeCode.ForecastSettlement, com.tools20022.repository.codeset.BalanceTypeCode.BlockedTrades, com.tools20022.repository.codeset.BalanceTypeCode.OtherBlockedTrades,
						com.tools20022.repository.codeset.BalanceTypeCode.Custody, com.tools20022.repository.codeset.BalanceTypeCode.CashForecast, com.tools20022.repository.codeset.BalanceTypeCode.DividendsCollection,
						com.tools20022.repository.codeset.BalanceTypeCode.NetFunding, com.tools20022.repository.codeset.BalanceTypeCode.PayInPayOut, com.tools20022.repository.codeset.BalanceTypeCode.ExchangeForecast,
						com.tools20022.repository.codeset.BalanceTypeCode.CentralCounterparty, com.tools20022.repository.codeset.BalanceTypeCode.TotalOnHold, com.tools20022.repository.codeset.BalanceTypeCode.CreditOnHold,
						com.tools20022.repository.codeset.BalanceTypeCode.DebitOnHold, com.tools20022.repository.codeset.BalanceTypeCode.TotalProcessed, com.tools20022.repository.codeset.BalanceTypeCode.CreditProcessed,
						com.tools20022.repository.codeset.BalanceTypeCode.DebitProcessed, com.tools20022.repository.codeset.BalanceTypeCode.TotalFuture, com.tools20022.repository.codeset.BalanceTypeCode.TotalRejected,
						com.tools20022.repository.codeset.BalanceTypeCode.OpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InterimAvailable, com.tools20022.repository.codeset.BalanceTypeCode.ClosingAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.ForwardAvailable, com.tools20022.repository.codeset.BalanceTypeCode.ClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.InterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.OpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.PreviouslyClosedBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.CollectionInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.CollectionForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.CollectionInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.CollectionExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.FirmCollateralisation, com.tools20022.repository.codeset.BalanceTypeCode.UsedAmountsFirmCollateralisation,
						com.tools20022.repository.codeset.BalanceTypeCode.SelfCollateralisation, com.tools20022.repository.codeset.BalanceTypeCode.UsedAmountsSelfCollateralisation,
						com.tools20022.repository.codeset.BalanceTypeCode.CustodyActual, com.tools20022.repository.codeset.BalanceTypeCode.CCPGuaranteedForecasting,
						com.tools20022.repository.codeset.BalanceTypeCode.NonCCPGuaranteedForecasting, com.tools20022.repository.codeset.BalanceTypeCode.DefinitiveSettledSecurities,
						com.tools20022.repository.codeset.BalanceTypeCode.LackOfHoldingsTransactions, com.tools20022.repository.codeset.BalanceTypeCode.NonSettledSecurities,
						com.tools20022.repository.codeset.BalanceTypeCode.CCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceTypeCode.ForecastOTCTransactions,
						com.tools20022.repository.codeset.BalanceTypeCode.NonCCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceTypeCode.SAPDirectDebitAmount,
						com.tools20022.repository.codeset.BalanceTypeCode.SAPDirectCreditAmount, com.tools20022.repository.codeset.BalanceTypeCode.CMUPRepoDebit, com.tools20022.repository.codeset.BalanceTypeCode.CMUPRepoCredit,
						com.tools20022.repository.codeset.BalanceTypeCode.BulkSettlementCMUPDebit, com.tools20022.repository.codeset.BalanceTypeCode.BulkSettlementCMUPCredit,
						com.tools20022.repository.codeset.BalanceTypeCode.SAPQueueAmount, com.tools20022.repository.codeset.BalanceTypeCode.IntradayRepoLimit, com.tools20022.repository.codeset.BalanceTypeCode.IntradayRepoDrawings,
						com.tools20022.repository.codeset.BalanceTypeCode.DiscountWindowRepoDrawings, com.tools20022.repository.codeset.BalanceTypeCode.AvailableDMVForDiscountWindowRepo,
						com.tools20022.repository.codeset.BalanceTypeCode.AvailableDMVForIntradayRepo, com.tools20022.repository.codeset.BalanceTypeCode.Elected, com.tools20022.repository.codeset.BalanceTypeCode.ReservedForDistribution,
						com.tools20022.repository.codeset.BalanceTypeCode.ReservedForRemoval, com.tools20022.repository.codeset.BalanceTypeCode.Restricted, com.tools20022.repository.codeset.BalanceTypeCode.TotalEntitled,
						com.tools20022.repository.codeset.BalanceTypeCode.Unelected, com.tools20022.repository.codeset.BalanceTypeCode.Information);
				derivation_lazy = () -> Arrays.asList(BalanceType12Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}