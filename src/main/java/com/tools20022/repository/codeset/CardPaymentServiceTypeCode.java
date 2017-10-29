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
 * Service provided by a card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransfer
 * CardPaymentServiceTypeCode.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#OriginalCredit
 * CardPaymentServiceTypeCode.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardPayment
 * CardPaymentServiceTypeCode.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashBack
 * CardPaymentServiceTypeCode.CashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashAdvance
 * CardPaymentServiceTypeCode.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashDeposit
 * CardPaymentServiceTypeCode.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DeferredPayment
 * CardPaymentServiceTypeCode.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Reservation
 * CardPaymentServiceTypeCode.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Loading
 * CardPaymentServiceTypeCode.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Refund
 * CardPaymentServiceTypeCode.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#QuasiCash
 * CardPaymentServiceTypeCode.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Balance
 * CardPaymentServiceTypeCode.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardActivation
 * CardPaymentServiceTypeCode.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardVerification
 * CardPaymentServiceTypeCode.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINChange
 * CardPaymentServiceTypeCode.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ValidityCheck
 * CardPaymentServiceTypeCode.ValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Aggregation
 * CardPaymentServiceTypeCode.Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DCC
 * CardPaymentServiceTypeCode.DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Gratuity
 * CardPaymentServiceTypeCode.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Instalment
 * CardPaymentServiceTypeCode.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Loyalty
 * CardPaymentServiceTypeCode.Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NoShow
 * CardPaymentServiceTypeCode.NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PurchaseCorporate
 * CardPaymentServiceTypeCode.PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RecurringPayment
 * CardPaymentServiceTypeCode.RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#SolicitedAvailableFunds
 * CardPaymentServiceTypeCode.SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UnsolicitedAvailableFunds
 * CardPaymentServiceTypeCode.UnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#VoiceAuthorisation
 * CardPaymentServiceTypeCode.VoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#InitialReservation
 * CardPaymentServiceTypeCode.InitialReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UpdateReservation
 * CardPaymentServiceTypeCode.UpdateReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PaymentReservation
 * CardPaymentServiceTypeCode.PaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AdditionalPayment
 * CardPaymentServiceTypeCode.AdditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#FirstRecurring
 * CardPaymentServiceTypeCode.FirstRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#FollowingRecurring
 * CardPaymentServiceTypeCode.FollowingRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PersonToBusiness
 * CardPaymentServiceTypeCode.PersonToBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PersonToPerson
 * CardPaymentServiceTypeCode.PersonToPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AcceptorInstalment
 * CardPaymentServiceTypeCode.AcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#IssuerInstalment
 * CardPaymentServiceTypeCode.IssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Unloading
 * CardPaymentServiceTypeCode.Unloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransferPush
 * CardPaymentServiceTypeCode.CardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransferPull
 * CardPaymentServiceTypeCode.CardsFundTransferPull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashWithdrawal
 * CardPaymentServiceTypeCode.CashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINUnblock
 * CardPaymentServiceTypeCode.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ChosenWithdrawal
 * CardPaymentServiceTypeCode.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PreAuthorisedWithdrawal
 * CardPaymentServiceTypeCode.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ProfileWithdrawal
 * CardPaymentServiceTypeCode.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#StandardWithdrawal
 * CardPaymentServiceTypeCode.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferCardBillPayment
 * CardPaymentServiceTypeCode.TransferCardBillPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFromCash
 * CardPaymentServiceTypeCode.TransferFromCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFromCheque
 * CardPaymentServiceTypeCode.TransferFromCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFundsDisbursementGeneral
 * CardPaymentServiceTypeCode.TransferFundsDisbursementGeneral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferGovernmentDisbursement
 * CardPaymentServiceTypeCode.TransferGovernmentDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferMerchantDisbursement
 * CardPaymentServiceTypeCode.TransferMerchantDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferPayrollPensionDisbursement
 * CardPaymentServiceTypeCode.TransferPayrollPensionDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NonRefundable
 * CardPaymentServiceTypeCode.NonRefundable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Instant
 * CardPaymentServiceTypeCode.Instant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CreditAdjustement
 * CardPaymentServiceTypeCode.CreditAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DebitAdjustement
 * CardPaymentServiceTypeCode.DebitAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CreateCertificate
 * CardPaymentServiceTypeCode.CreateCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RenewCerificate
 * CardPaymentServiceTypeCode.RenewCerificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RevokeCertificate
 * CardPaymentServiceTypeCode.RevokeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AddWhiteList
 * CardPaymentServiceTypeCode.AddWhiteList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RemoveWhiteList
 * CardPaymentServiceTypeCode.RemoveWhiteList}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
 * CardPaymentServiceType2Code}</li>
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
 * <li>"CAFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service provided by a card payment transaction."</li>
 * </ul>
 */
public class CardPaymentServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer of funds to and/or from a card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of funds to and/or from a card account."</li>
	 * </ul>
	 */
	public static final MMCode CardsFundTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardsFundTransfer";
			definition = "Transfer of funds to and/or from a card account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFT";
		}
	};
	/**
	 * Original credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original credit."</li>
	 * </ul>
	 */
	public static final MMCode OriginalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalCredit";
			definition = "Original credit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "ORCR";
		}
	};
	/**
	 * Card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment."</li>
	 * </ul>
	 */
	public static final MMCode CardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRDP";
		}
	};
	/**
	 * Card payment with cash-back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment with cash-back."</li>
	 * </ul>
	 */
	public static final MMCode CashBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBack";
			definition = "Card payment with cash-back.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHB";
		}
	};
	/**
	 * Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank
	 * counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashAdvance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAdvance";
			definition = "Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHW";
		}
	};
	/**
	 * Cash deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash deposit."</li>
	 * </ul>
	 */
	public static final MMCode CashDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Cash deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHD";
		}
	};
	/**
	 * Deferred payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred payment."</li>
	 * </ul>
	 */
	public static final MMCode DeferredPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeferredPayment";
			definition = "Deferred payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DEFR";
		}
	};
	/**
	 * Reservation (pre-authorisation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation (pre-authorisation)."</li>
	 * </ul>
	 */
	public static final MMCode Reservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation (pre-authorisation).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RESA";
		}
	};
	/**
	 * Loading or reloading non-financial account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loading or reloading non-financial account."</li>
	 * </ul>
	 */
	public static final MMCode Loading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loading";
			definition = "Loading or reloading non-financial account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "LOAD";
		}
	};
	/**
	 * Refund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refund transaction."</li>
	 * </ul>
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Refund transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RFND";
		}
	};
	/**
	 * Quasi-cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quasi-cash."</li>
	 * </ul>
	 */
	public static final MMCode QuasiCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuasiCash";
			definition = "Quasi-cash.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "QUCH";
		}
	};
	/**
	 * Balance enquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance enquiry."</li>
	 * </ul>
	 */
	public static final MMCode Balance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance enquiry.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "BALC";
		}
	};
	/**
	 * Card activation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card activation."</li>
	 * </ul>
	 */
	public static final MMCode CardActivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardActivation";
			definition = "Card activation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CACT";
		}
	};
	/**
	 * Card verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card verification."</li>
	 * </ul>
	 */
	public static final MMCode CardVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardVerification";
			definition = "Card verification.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAVR";
		}
	};
	/**
	 * PIN (Personal Identification Number) change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PIN (Personal Identification Number) change."</li>
	 * </ul>
	 */
	public static final MMCode PINChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINChange";
			definition = "PIN (Personal Identification Number) change.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PINC";
		}
	};
	/**
	 * Card validity check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card validity check."</li>
	 * </ul>
	 */
	public static final MMCode ValidityCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityCheck";
			definition = "Card validity check.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "VALC";
		}
	};
	/**
	 * Aggregation of low payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Aggregation of low payments."</li>
	 * </ul>
	 */
	public static final MMCode Aggregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Aggregation";
			definition = "Aggregation of low payments.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "AGGR";
		}
	};
	/**
	 * Dynamic currency conversion (DCC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dynamic currency conversion (DCC)."</li>
	 * </ul>
	 */
	public static final MMCode DCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DCC";
			definition = "Dynamic currency conversion (DCC).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DCCV";
		}
	};
	/**
	 * Card payment with gratuity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment with gratuity."</li>
	 * </ul>
	 */
	public static final MMCode Gratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Card payment with gratuity.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "GRTT";
		}
	};
	/**
	 * Instalment payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instalment payment."</li>
	 * </ul>
	 */
	public static final MMCode Instalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Instalment payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Loyalty services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOYT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loyalty services."</li>
	 * </ul>
	 */
	public static final MMCode Loyalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loyalty";
			definition = "Loyalty services.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "LOYT";
		}
	};
	/**
	 * No show after reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No show after reservation."</li>
	 * </ul>
	 */
	public static final MMCode NoShow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoShow";
			definition = "No show after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "NRES";
		}
	};
	/**
	 * Purchase and corporate data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase and corporate data."</li>
	 * </ul>
	 */
	public static final MMCode PurchaseCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseCorporate";
			definition = "Purchase and corporate data.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PUCO";
		}
	};
	/**
	 * Recurring payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recurring payment."</li>
	 * </ul>
	 */
	public static final MMCode RecurringPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecurringPayment";
			definition = "Recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RECP";
		}
	};
	/**
	 * Solicited available funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Solicited available funds."</li>
	 * </ul>
	 */
	public static final MMCode SolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitedAvailableFunds";
			definition = "Solicited available funds.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "SOAF";
		}
	};
	/**
	 * Unsolicited available funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unsolicited available funds."</li>
	 * </ul>
	 */
	public static final MMCode UnsolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsolicitedAvailableFunds";
			definition = "Unsolicited available funds.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "UNAF";
		}
	};
	/**
	 * Voice authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VCAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Voice authorisation."</li>
	 * </ul>
	 */
	public static final MMCode VoiceAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoiceAuthorisation";
			definition = "Voice authorisation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "VCAU";
		}
	};
	/**
	 * Initial reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial reservation."</li>
	 * </ul>
	 */
	public static final MMCode InitialReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialReservation";
			definition = "Initial reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "IRES";
		}
	};
	/**
	 * Update reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update reservation."</li>
	 * </ul>
	 */
	public static final MMCode UpdateReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UpdateReservation";
			definition = "Update reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "URES";
		}
	};
	/**
	 * Payment after reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment after reservation."</li>
	 * </ul>
	 */
	public static final MMCode PaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentReservation";
			definition = "Payment after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PRES";
		}
	};
	/**
	 * Additional payment after reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional payment after reservation."</li>
	 * </ul>
	 */
	public static final MMCode AdditionalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalPayment";
			definition = "Additional payment after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "ARES";
		}
	};
	/**
	 * Initial recurring payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstRecurring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial recurring payment."</li>
	 * </ul>
	 */
	public static final MMCode FirstRecurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstRecurring";
			definition = "Initial recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "FREC";
		}
	};
	/**
	 * Repeat recurring payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingRecurring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repeat recurring payment."</li>
	 * </ul>
	 */
	public static final MMCode FollowingRecurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FollowingRecurring";
			definition = "Repeat recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RREC";
		}
	};
	/**
	 * Card payment transaction transfer from person to business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TP2B"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToBusiness"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction transfer from person to business."</li>
	 * </ul>
	 */
	public static final MMCode PersonToBusiness = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonToBusiness";
			definition = "Card payment transaction transfer from person to business.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TP2B";
		}
	};
	/**
	 * Card payment transaction transfer from person to person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TP2P"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment transaction transfer from person to person."</li>
	 * </ul>
	 */
	public static final MMCode PersonToPerson = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonToPerson";
			definition = "Card payment transaction transfer from person to person.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TP2P";
		}
	};
	/**
	 * Instalment payment transaction performed by the acceptor or the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instalment payment transaction performed by the acceptor or the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AcceptorInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			definition = "Instalment payment transaction performed by the acceptor or the acquirer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSA";
		}
	};
	/**
	 * Instalment payment transaction performed by the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instalment payment transaction performed by the card issuer."</li>
	 * </ul>
	 */
	public static final MMCode IssuerInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			definition = "Instalment payment transaction performed by the card issuer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSI";
		}
	};
	/**
	 * Unloading non-financial account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unloading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unloading non-financial account."</li>
	 * </ul>
	 */
	public static final MMCode Unloading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			definition = "Unloading non-financial account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "UNLD";
		}
	};
	/**
	 * Transfer of funds to a card or an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPush"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of funds to a card or an account."</li>
	 * </ul>
	 */
	public static final MMCode CardsFundTransferPush = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			definition = "Transfer of funds to a card or an account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFH";
		}
	};
	/**
	 * Transfer of funds from a card or an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPull"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of funds from a card or an account."</li>
	 * </ul>
	 */
	public static final MMCode CardsFundTransferPull = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			definition = "Transfer of funds from a card or an account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFL";
		}
	};
	/**
	 * Withdrawal of cash on an ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal of cash on an ATM."</li>
	 * </ul>
	 */
	public static final MMCode CashWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Withdrawal of cash on an ATM.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CHWD";
		}
	};
	/**
	 * Unblock the cardholder PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unblock the cardholder PIN."</li>
	 * </ul>
	 */
	public static final MMCode PINUnblock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the cardholder PIN.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PINU";
		}
	};
	/**
	 * Amount and notes values are chosen by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and notes values are chosen by the customer."</li>
	 * </ul>
	 */
	public static final MMCode ChosenWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSWD";
		}
	};
	/**
	 * Withdrawal transaction was pre-authorised by another channel (amount
	 * could be absent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUWS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withdrawal transaction was pre-authorised by another channel (amount could be absent)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PreAuthorisedWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel (amount could be absent).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "AUWS";
		}
	};
	/**
	 * Amount and Notes Values are pre-defined by the customer profile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount and Notes Values are pre-defined by the customer profile."</li>
	 * </ul>
	 */
	public static final MMCode ProfileWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and Notes Values are pre-defined by the customer profile.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PFWD";
		}
	};
	/**
	 * Customer pressed a button associated with a withdrawal of unique amount
	 * and notes mix.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer pressed a button associated with a withdrawal of unique amount and notes mix."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StandardWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Customer pressed a button associated with a withdrawal of unique amount and notes mix.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "SDWD";
		}
	};
	/**
	 * Transfer for payment of bills.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCardBillPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer for payment of bills."</li>
	 * </ul>
	 */
	public static final MMCode TransferCardBillPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCardBillPayment";
			definition = "Transfer for payment of bills.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFBL";
		}
	};
	/**
	 * Transfer from cash deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFromCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer from cash deposit."</li>
	 * </ul>
	 */
	public static final MMCode TransferFromCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCash";
			definition = "Transfer from cash deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFCS";
		}
	};
	/**
	 * Transfer from cheque deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFromCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer from cheque deposit."</li>
	 * </ul>
	 */
	public static final MMCode TransferFromCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCheque";
			definition = "Transfer from cheque deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFCH";
		}
	};
	/**
	 * Transfer for general disbursement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFundsDisbursementGeneral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer for general disbursement."</li>
	 * </ul>
	 */
	public static final MMCode TransferFundsDisbursementGeneral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFundsDisbursementGeneral";
			definition = "Transfer for general disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFDB";
		}
	};
	/**
	 * Transfer for government disbursement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferGovernmentDisbursement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer for government disbursement."</li>
	 * </ul>
	 */
	public static final MMCode TransferGovernmentDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferGovernmentDisbursement";
			definition = "Transfer for government disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFGD";
		}
	};
	/**
	 * Transfer for merchant disbursement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferMerchantDisbursement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer for merchant disbursement."</li>
	 * </ul>
	 */
	public static final MMCode TransferMerchantDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferMerchantDisbursement";
			definition = "Transfer for merchant disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFMD";
		}
	};
	/**
	 * Transfer for payroll pension disbursement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferPayrollPensionDisbursement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer for payroll pension disbursement."</li>
	 * </ul>
	 */
	public static final MMCode TransferPayrollPensionDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferPayrollPensionDisbursement";
			definition = "Transfer for payroll pension disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFPD";
		}
	};
	/**
	 * Payment of goods or services which are not refundable, for instance low
	 * cost airline tickets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of goods or services which are not refundable, for instance low cost airline tickets."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NonRefundable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			definition = "Payment of goods or services which are not refundable, for instance low cost airline tickets.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "NRFD";
		}
	};
	/**
	 * Instant transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instant transaction"</li>
	 * </ul>
	 */
	public static final MMCode Instant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			definition = "Instant transaction";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Credit adjustment to a previous transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAdjustement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit adjustment to a previous transaction."</li>
	 * </ul>
	 */
	public static final MMCode CreditAdjustement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAdjustement";
			definition = "Credit adjustment to a previous transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CADJ";
		}
	};
	/**
	 * Debit adjustment to a previous transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAdjustement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit adjustment to a previous transaction."</li>
	 * </ul>
	 */
	public static final MMCode DebitAdjustement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAdjustement";
			definition = "Debit adjustment to a previous transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DADJ";
		}
	};
	/**
	 * Creation of an X.509 certificate with the public key and the information
	 * of the owner of the asymmetric key provided by the requestor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreateCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CreateCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateCertificate";
			definition = "Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTC";
		}
	};
	/**
	 * Renewal of an X.509 certificate, protected by the certificate to renew.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenewCerificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Renewal of an X.509 certificate, protected by the certificate to renew."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RenewCerificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewCerificate";
			definition = "Renewal of an X.509 certificate, protected by the certificate to renew.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTR";
		}
	};
	/**
	 * Revocation of an active X.509 certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevokeCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Revocation of an active X.509 certificate."</li>
	 * </ul>
	 */
	public static final MMCode RevokeCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevokeCertificate";
			definition = "Revocation of an active X.509 certificate.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTK";
		}
	};
	/**
	 * Add a POI in the white list of the terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddWhiteList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Add a POI in the white list of the terminal manager."</li>
	 * </ul>
	 */
	public static final MMCode AddWhiteList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddWhiteList";
			definition = "Add a POI in the white list of the terminal manager.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "WLSA";
		}
	};
	/**
	 * Remove a POI from the white list of the terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WLSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoveWhiteList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remove a POI from the white list of the terminal manager."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RemoveWhiteList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveWhiteList";
			definition = "Remove a POI from the white list of the terminal manager.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "WLSR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAFT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceTypeCode";
				definition = "Service provided by a card payment transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransfer, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashBack,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashAdvance, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Loading, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Refund, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.QuasiCash,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Balance, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINChange,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ValidityCheck, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Instalment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Loyalty,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NoShow, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PurchaseCorporate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RecurringPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.SolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UnsolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.VoiceAuthorisation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.InitialReservation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UpdateReservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PaymentReservation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AdditionalPayment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.FirstRecurring, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.FollowingRecurring,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PersonToBusiness, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PersonToPerson,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AcceptorInstalment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.IssuerInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Unloading, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransferPush,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransferPull, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINUnblock, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ChosenWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PreAuthorisedWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ProfileWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.StandardWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferCardBillPayment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFromCash, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFromCheque,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFundsDisbursementGeneral, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferGovernmentDisbursement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferMerchantDisbursement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferPayrollPensionDisbursement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NonRefundable, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Instant,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CreditAdjustement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DebitAdjustement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CreateCertificate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RenewCerificate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RevokeCertificate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AddWhiteList,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RemoveWhiteList);
				derivation_lazy = () -> Arrays.asList(CardPaymentServiceType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}