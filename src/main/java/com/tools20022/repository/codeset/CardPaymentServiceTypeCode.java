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
import com.tools20022.repository.codeset.CardPaymentServiceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by a card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransfer
 * CardPaymentServiceTypeCode.mmCardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#OriginalCredit
 * CardPaymentServiceTypeCode.mmOriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardPayment
 * CardPaymentServiceTypeCode.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashBack
 * CardPaymentServiceTypeCode.mmCashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashAdvance
 * CardPaymentServiceTypeCode.mmCashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashDeposit
 * CardPaymentServiceTypeCode.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DeferredPayment
 * CardPaymentServiceTypeCode.mmDeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Reservation
 * CardPaymentServiceTypeCode.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Loading
 * CardPaymentServiceTypeCode.mmLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Refund
 * CardPaymentServiceTypeCode.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#QuasiCash
 * CardPaymentServiceTypeCode.mmQuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Balance
 * CardPaymentServiceTypeCode.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardActivation
 * CardPaymentServiceTypeCode.mmCardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardVerification
 * CardPaymentServiceTypeCode.mmCardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINChange
 * CardPaymentServiceTypeCode.mmPINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ValidityCheck
 * CardPaymentServiceTypeCode.mmValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Aggregation
 * CardPaymentServiceTypeCode.mmAggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DCC
 * CardPaymentServiceTypeCode.mmDCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Gratuity
 * CardPaymentServiceTypeCode.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Instalment
 * CardPaymentServiceTypeCode.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Loyalty
 * CardPaymentServiceTypeCode.mmLoyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NoShow
 * CardPaymentServiceTypeCode.mmNoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PurchaseCorporate
 * CardPaymentServiceTypeCode.mmPurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RecurringPayment
 * CardPaymentServiceTypeCode.mmRecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#SolicitedAvailableFunds
 * CardPaymentServiceTypeCode.mmSolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UnsolicitedAvailableFunds
 * CardPaymentServiceTypeCode.mmUnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#VoiceAuthorisation
 * CardPaymentServiceTypeCode.mmVoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#InitialReservation
 * CardPaymentServiceTypeCode.mmInitialReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#UpdateReservation
 * CardPaymentServiceTypeCode.mmUpdateReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PaymentReservation
 * CardPaymentServiceTypeCode.mmPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AdditionalPayment
 * CardPaymentServiceTypeCode.mmAdditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#FirstRecurring
 * CardPaymentServiceTypeCode.mmFirstRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#FollowingRecurring
 * CardPaymentServiceTypeCode.mmFollowingRecurring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PersonToBusiness
 * CardPaymentServiceTypeCode.mmPersonToBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PersonToPerson
 * CardPaymentServiceTypeCode.mmPersonToPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AcceptorInstalment
 * CardPaymentServiceTypeCode.mmAcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#IssuerInstalment
 * CardPaymentServiceTypeCode.mmIssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Unloading
 * CardPaymentServiceTypeCode.mmUnloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransferPush
 * CardPaymentServiceTypeCode.mmCardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CardsFundTransferPull
 * CardPaymentServiceTypeCode.mmCardsFundTransferPull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CashWithdrawal
 * CardPaymentServiceTypeCode.mmCashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PINUnblock
 * CardPaymentServiceTypeCode.mmPINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ChosenWithdrawal
 * CardPaymentServiceTypeCode.mmChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#PreAuthorisedWithdrawal
 * CardPaymentServiceTypeCode.mmPreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#ProfileWithdrawal
 * CardPaymentServiceTypeCode.mmProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#StandardWithdrawal
 * CardPaymentServiceTypeCode.mmStandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferCardBillPayment
 * CardPaymentServiceTypeCode.mmTransferCardBillPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFromCash
 * CardPaymentServiceTypeCode.mmTransferFromCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFromCheque
 * CardPaymentServiceTypeCode.mmTransferFromCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferFundsDisbursementGeneral
 * CardPaymentServiceTypeCode.mmTransferFundsDisbursementGeneral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferGovernmentDisbursement
 * CardPaymentServiceTypeCode.mmTransferGovernmentDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferMerchantDisbursement
 * CardPaymentServiceTypeCode.mmTransferMerchantDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#TransferPayrollPensionDisbursement
 * CardPaymentServiceTypeCode.mmTransferPayrollPensionDisbursement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#NonRefundable
 * CardPaymentServiceTypeCode.mmNonRefundable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#Instant
 * CardPaymentServiceTypeCode.mmInstant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CreditAdjustement
 * CardPaymentServiceTypeCode.mmCreditAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#DebitAdjustement
 * CardPaymentServiceTypeCode.mmDebitAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#CreateCertificate
 * CardPaymentServiceTypeCode.mmCreateCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RenewCerificate
 * CardPaymentServiceTypeCode.mmRenewCerificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RevokeCertificate
 * CardPaymentServiceTypeCode.mmRevokeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#AddWhiteList
 * CardPaymentServiceTypeCode.mmAddWhiteList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode#RemoveWhiteList
 * CardPaymentServiceTypeCode.mmRemoveWhiteList}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceTypeCode extends MMCode {

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
	public static final CardPaymentServiceTypeCode CardsFundTransfer = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardsFundTransfer";
			definition = "Transfer of funds to and/or from a card account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode OriginalCredit = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalCredit";
			definition = "Original credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CardPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CashBack = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBack";
			definition = "Card payment with cash-back.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CashAdvance = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAdvance";
			definition = "Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CashDeposit = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Cash deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode DeferredPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeferredPayment";
			definition = "Deferred payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Reservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation (pre-authorisation).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Loading = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loading";
			definition = "Loading or reloading non-financial account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Refund = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Refund transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode QuasiCash = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuasiCash";
			definition = "Quasi-cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Balance = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance enquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CardActivation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardActivation";
			definition = "Card activation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CardVerification = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardVerification";
			definition = "Card verification.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PINChange = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINChange";
			definition = "PIN (Personal Identification Number) change.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode ValidityCheck = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityCheck";
			definition = "Card validity check.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Aggregation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Aggregation";
			definition = "Aggregation of low payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode DCC = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DCC";
			definition = "Dynamic currency conversion (DCC).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Gratuity = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Card payment with gratuity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Instalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Instalment payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Loyalty = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loyalty";
			definition = "Loyalty services.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode NoShow = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoShow";
			definition = "No show after reservation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PurchaseCorporate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseCorporate";
			definition = "Purchase and corporate data.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode RecurringPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecurringPayment";
			definition = "Recurring payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode SolicitedAvailableFunds = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitedAvailableFunds";
			definition = "Solicited available funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode UnsolicitedAvailableFunds = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnsolicitedAvailableFunds";
			definition = "Unsolicited available funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode VoiceAuthorisation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoiceAuthorisation";
			definition = "Voice authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode InitialReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialReservation";
			definition = "Initial reservation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode UpdateReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UpdateReservation";
			definition = "Update reservation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PaymentReservation = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentReservation";
			definition = "Payment after reservation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode AdditionalPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalPayment";
			definition = "Additional payment after reservation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode FirstRecurring = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstRecurring";
			definition = "Initial recurring payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode FollowingRecurring = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FollowingRecurring";
			definition = "Repeat recurring payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PersonToBusiness = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonToBusiness";
			definition = "Card payment transaction transfer from person to business.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PersonToPerson = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonToPerson";
			definition = "Card payment transaction transfer from person to person.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode AcceptorInstalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			definition = "Instalment payment transaction performed by the acceptor or the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode IssuerInstalment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			definition = "Instalment payment transaction performed by the card issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Unloading = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			definition = "Unloading non-financial account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CardsFundTransferPush = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			definition = "Transfer of funds to a card or an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CardsFundTransferPull = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			definition = "Transfer of funds from a card or an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CashWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Withdrawal of cash on an ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PINUnblock = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the cardholder PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode ChosenWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode PreAuthorisedWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel (amount could be absent).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode ProfileWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and Notes Values are pre-defined by the customer profile.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode StandardWithdrawal = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Customer pressed a button associated with a withdrawal of unique amount and notes mix.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferCardBillPayment = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCardBillPayment";
			definition = "Transfer for payment of bills.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferFromCash = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCash";
			definition = "Transfer from cash deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferFromCheque = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCheque";
			definition = "Transfer from cheque deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferFundsDisbursementGeneral = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFundsDisbursementGeneral";
			definition = "Transfer for general disbursement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferGovernmentDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferGovernmentDisbursement";
			definition = "Transfer for government disbursement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferMerchantDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferMerchantDisbursement";
			definition = "Transfer for merchant disbursement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode TransferPayrollPensionDisbursement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferPayrollPensionDisbursement";
			definition = "Transfer for payroll pension disbursement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode NonRefundable = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			definition = "Payment of goods or services which are not refundable, for instance low cost airline tickets.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode Instant = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			definition = "Instant transaction";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CreditAdjustement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAdjustement";
			definition = "Credit adjustment to a previous transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode DebitAdjustement = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAdjustement";
			definition = "Debit adjustment to a previous transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode CreateCertificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateCertificate";
			definition = "Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode RenewCerificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewCerificate";
			definition = "Renewal of an X.509 certificate, protected by the certificate to renew.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode RevokeCertificate = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevokeCertificate";
			definition = "Revocation of an active X.509 certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode AddWhiteList = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddWhiteList";
			definition = "Add a POI in the white list of the terminal manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
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
	public static final CardPaymentServiceTypeCode RemoveWhiteList = new CardPaymentServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveWhiteList";
			definition = "Remove a POI from the white list of the terminal manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceTypeCode.mmObject();
			codeName = "WLSR";
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceTypeCode> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceTypeCode";
				definition = "Service provided by a card payment transaction.";
				derivation_lazy = () -> Arrays.asList(CardPaymentServiceType2Code.mmObject());
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
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardsFundTransfer.getCodeName().get(), CardsFundTransfer);
		codesByName.put(OriginalCredit.getCodeName().get(), OriginalCredit);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CashBack.getCodeName().get(), CashBack);
		codesByName.put(CashAdvance.getCodeName().get(), CashAdvance);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(DeferredPayment.getCodeName().get(), DeferredPayment);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(Loading.getCodeName().get(), Loading);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(QuasiCash.getCodeName().get(), QuasiCash);
		codesByName.put(Balance.getCodeName().get(), Balance);
		codesByName.put(CardActivation.getCodeName().get(), CardActivation);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(ValidityCheck.getCodeName().get(), ValidityCheck);
		codesByName.put(Aggregation.getCodeName().get(), Aggregation);
		codesByName.put(DCC.getCodeName().get(), DCC);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Instalment.getCodeName().get(), Instalment);
		codesByName.put(Loyalty.getCodeName().get(), Loyalty);
		codesByName.put(NoShow.getCodeName().get(), NoShow);
		codesByName.put(PurchaseCorporate.getCodeName().get(), PurchaseCorporate);
		codesByName.put(RecurringPayment.getCodeName().get(), RecurringPayment);
		codesByName.put(SolicitedAvailableFunds.getCodeName().get(), SolicitedAvailableFunds);
		codesByName.put(UnsolicitedAvailableFunds.getCodeName().get(), UnsolicitedAvailableFunds);
		codesByName.put(VoiceAuthorisation.getCodeName().get(), VoiceAuthorisation);
		codesByName.put(InitialReservation.getCodeName().get(), InitialReservation);
		codesByName.put(UpdateReservation.getCodeName().get(), UpdateReservation);
		codesByName.put(PaymentReservation.getCodeName().get(), PaymentReservation);
		codesByName.put(AdditionalPayment.getCodeName().get(), AdditionalPayment);
		codesByName.put(FirstRecurring.getCodeName().get(), FirstRecurring);
		codesByName.put(FollowingRecurring.getCodeName().get(), FollowingRecurring);
		codesByName.put(PersonToBusiness.getCodeName().get(), PersonToBusiness);
		codesByName.put(PersonToPerson.getCodeName().get(), PersonToPerson);
		codesByName.put(AcceptorInstalment.getCodeName().get(), AcceptorInstalment);
		codesByName.put(IssuerInstalment.getCodeName().get(), IssuerInstalment);
		codesByName.put(Unloading.getCodeName().get(), Unloading);
		codesByName.put(CardsFundTransferPush.getCodeName().get(), CardsFundTransferPush);
		codesByName.put(CardsFundTransferPull.getCodeName().get(), CardsFundTransferPull);
		codesByName.put(CashWithdrawal.getCodeName().get(), CashWithdrawal);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(TransferCardBillPayment.getCodeName().get(), TransferCardBillPayment);
		codesByName.put(TransferFromCash.getCodeName().get(), TransferFromCash);
		codesByName.put(TransferFromCheque.getCodeName().get(), TransferFromCheque);
		codesByName.put(TransferFundsDisbursementGeneral.getCodeName().get(), TransferFundsDisbursementGeneral);
		codesByName.put(TransferGovernmentDisbursement.getCodeName().get(), TransferGovernmentDisbursement);
		codesByName.put(TransferMerchantDisbursement.getCodeName().get(), TransferMerchantDisbursement);
		codesByName.put(TransferPayrollPensionDisbursement.getCodeName().get(), TransferPayrollPensionDisbursement);
		codesByName.put(NonRefundable.getCodeName().get(), NonRefundable);
		codesByName.put(Instant.getCodeName().get(), Instant);
		codesByName.put(CreditAdjustement.getCodeName().get(), CreditAdjustement);
		codesByName.put(DebitAdjustement.getCodeName().get(), DebitAdjustement);
		codesByName.put(CreateCertificate.getCodeName().get(), CreateCertificate);
		codesByName.put(RenewCerificate.getCodeName().get(), RenewCerificate);
		codesByName.put(RevokeCertificate.getCodeName().get(), RevokeCertificate);
		codesByName.put(AddWhiteList.getCodeName().get(), AddWhiteList);
		codesByName.put(RemoveWhiteList.getCodeName().get(), RemoveWhiteList);
	}

	public static CardPaymentServiceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceTypeCode[] values() {
		CardPaymentServiceTypeCode[] values = new CardPaymentServiceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceTypeCode> {
		@Override
		public CardPaymentServiceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}