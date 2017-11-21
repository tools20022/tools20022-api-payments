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
 * Specifies the reason for a transaction to be rejected, returned or reversed
 * by an instructed agent or somebody acting on behalf of an instructed agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmIncorrectAccountNumber
 * TransactionReasonCode.mmIncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNonNumericAccountNumber
 * TransactionReasonCode.mmNonNumericAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidAccountNumberForClearingCode
 * TransactionReasonCode.mmInvalidAccountNumberForClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmClosedAccountNumber
 * TransactionReasonCode.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidAccountNumberWithInstitution
 * TransactionReasonCode.mmInvalidAccountNumberWithInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmBlockedAccount
 * TransactionReasonCode.mmBlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmZeroAmount
 * TransactionReasonCode.mmZeroAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotAllowedAmount
 * TransactionReasonCode.mmNotAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotAllowedCurrency
 * TransactionReasonCode.mmNotAllowedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInsufficientFunds
 * TransactionReasonCode.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmDuplication
 * TransactionReasonCode.mmDuplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmTooLowAmount
 * TransactionReasonCode.mmTooLowAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmBlockedAmount
 * TransactionReasonCode.mmBlockedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmChargeDisagreement
 * TransactionReasonCode.mmChargeDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInconsistentWithEndCustomer
 * TransactionReasonCode.mmInconsistentWithEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmUnknownCreditor
 * TransactionReasonCode.mmUnknownCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNoLongerValidCreditor
 * TransactionReasonCode.mmNoLongerValidCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmMissingCreditorAddress
 * TransactionReasonCode.mmMissingCreditorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmUnrecognisedInitiatingParty
 * TransactionReasonCode.mmUnrecognisedInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmTransactionForbidden
 * TransactionReasonCode.mmTransactionForbidden}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidBankOperationCode
 * TransactionReasonCode.mmInvalidBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidDate
 * TransactionReasonCode.mmInvalidDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotSpecifiedReason
 * TransactionReasonCode.mmNotSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmUnknownAccount
 * TransactionReasonCode.mmUnknownAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotUniqueTransactionReference
 * TransactionReasonCode.mmNotUniqueTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmBankIdentifierIncorrect
 * TransactionReasonCode.mmBankIdentifierIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNonNumericRoutingCode
 * TransactionReasonCode.mmNonNumericRoutingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotValidRoutingCode
 * TransactionReasonCode.mmNotValidRoutingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmClosedBranch
 * TransactionReasonCode.mmClosedBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmCutOffTime
 * TransactionReasonCode.mmCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmCorrespondentBankNotPossible
 * TransactionReasonCode.mmCorrespondentBankNotPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmTransactionReasonNonReportable
 * TransactionReasonCode.mmTransactionReasonNonReportable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmBalanceInfoRequested
 * TransactionReasonCode.mmBalanceInfoRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmChargeDetailsNotCorrect
 * TransactionReasonCode.mmChargeDetailsNotCorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotSpecifiedReasonAgentGenerated
 * TransactionReasonCode.mmNotSpecifiedReasonAgentGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNotSpecifiedReasonCustomerGenerated
 * TransactionReasonCode.mmNotSpecifiedReasonCustomerGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmUnknownEndCustomer
 * TransactionReasonCode.mmUnknownEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmMissingDebtorAddress
 * TransactionReasonCode.mmMissingDebtorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmWrongAmount
 * TransactionReasonCode.mmWrongAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidControlSum
 * TransactionReasonCode.mmInvalidControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNoMandate
 * TransactionReasonCode.mmNoMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmMissingMandatoryInformationInMandate
 * TransactionReasonCode.mmMissingMandatoryInformationInMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidFileFormatForOtherReasonThanGroupingIndicator
 * TransactionReasonCode.mmInvalidFileFormatForOtherReasonThanGroupingIndicator}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidFileFormatForGroupingIndicator
 * TransactionReasonCode.mmInvalidFileFormatForGroupingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmRefundRequestByEndCustomer
 * TransactionReasonCode.mmRefundRequestByEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmEndCustomerDeceased
 * TransactionReasonCode.mmEndCustomerDeceased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmCollectionNotDue
 * TransactionReasonCode.mmCollectionNotDue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmInvalidName
 * TransactionReasonCode.mmInvalidName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmSettlementFailed
 * TransactionReasonCode.mmSettlementFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#mmNarrative
 * TransactionReasonCode.mmNarrative}</li>
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
 * <li>"AC01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transaction to be rejected, returned or reversed by an instructed agent or somebody acting on behalf of an instructed agent."
 * </li>
 * </ul>
 */
public class TransactionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Format of the account number specified is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the account number specified is not correct."</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAccountNumber";
			definition = "Format of the account number specified is not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC01";
		}
	};
	/**
	 * Format of the account number specified is non-numeric.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNumericAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the account number specified is non-numeric."</li>
	 * </ul>
	 */
	public static final MMCode mmNonNumericAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonNumericAccountNumber";
			definition = "Format of the account number specified is non-numeric.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC02";
		}
	};
	/**
	 * Format of the account number specified is not valid for local
	 * Sort/National Clearing Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccountNumberForClearingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of the account number specified is not valid for local Sort/National Clearing Code."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAccountNumberForClearingCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberForClearingCode";
			definition = "Format of the account number specified is not valid for local Sort/National Clearing Code.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC03";
		}
	};
	/**
	 * Account number specified has been closed on the Receiver's books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number specified has been closed on the Receiver's books."</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the Receiver's books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Account number specified is not a valid account at the Final Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccountNumberWithInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number specified is not a valid account at the Final Agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAccountNumberWithInstitution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberWithInstitution";
			definition = "Account number specified is not a valid account at the Final Agent.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC05";
		}
	};
	/**
	 * Account specified is blocked, prohibiting posting of transactions against
	 * it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account specified is blocked, prohibiting posting of transactions against it."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedAccount";
			definition = "Account specified is blocked, prohibiting posting of transactions against it.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC06";
		}
	};
	/**
	 * Specified message amount is equal to zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified message amount is equal to zero."</li>
	 * </ul>
	 */
	public static final MMCode mmZeroAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ZeroAmount";
			definition = "Specified message amount is equal to zero.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM01";
		}
	};
	/**
	 * Specified transaction/message amount is greater than allowed maximum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified transaction/message amount is greater than allowed maximum."</li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedAmount";
			definition = "Specified transaction/message amount is greater than allowed maximum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM02";
		}
	};
	/**
	 * Specified message amount is in an non processable currency outside of
	 * existing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified message amount is in an non processable currency outside of existing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowedCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedCurrency";
			definition = "Specified message amount is in an non processable currency outside of existing agreement.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM03";
		}
	};
	/**
	 * Amount of funds available to cover specified message amount is
	 * insufficient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of funds available to cover specified message amount is insufficient."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientFunds";
			definition = "Amount of funds available to cover specified message amount is insufficient.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM04";
		}
	};
	/**
	 * This message appears to have been duplicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "This message appears to have been duplicated."</li>
	 * </ul>
	 */
	public static final MMCode mmDuplication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duplication";
			definition = "This message appears to have been duplicated.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM05";
		}
	};
	/**
	 * Specified transaction amount is less than agreed minimum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLowAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified transaction amount is less than agreed minimum."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTooLowAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLowAmount";
			definition = "Specified transaction amount is less than agreed minimum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM06";
		}
	};
	/**
	 * Amount specified in message has been blocked by regulatory authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified in message has been blocked by regulatory authorities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedAmount";
			definition = "Amount specified in message has been blocked by regulatory authorities.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM07";
		}
	};
	/**
	 * Specified charges amount is not as agreed between sender and receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDisagreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified charges amount is not as agreed between sender and receiver."</li>
	 * </ul>
	 */
	public static final MMCode mmChargeDisagreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeDisagreement";
			definition = "Specified charges amount is not as agreed between sender and receiver.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM08";
		}
	};
	/**
	 * Identification of end customer is not consistent with associated account
	 * number. (formerly CreditorConsistency)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InconsistentWithEndCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInconsistentWithEndCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InconsistentWithEndCustomer";
			definition = "Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency)";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE01";
		}
	};
	/**
	 * Creditor specified is not known at associated Sort/National Clearing
	 * code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor specified is not known at associated Sort/National Clearing code."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnknownCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownCreditor";
			definition = "Creditor specified is not known at associated Sort/National Clearing code.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE02";
		}
	};
	/**
	 * Creditor specified no longer exists in the books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLongerValidCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor specified no longer exists in the books."</li>
	 * </ul>
	 */
	public static final MMCode mmNoLongerValidCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoLongerValidCreditor";
			definition = "Creditor specified no longer exists in the books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE03";
		}
	};
	/**
	 * Specification of creditor's address, which is required for payment, is
	 * missing/not correct (formerly IncorrectCreditorAddress).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of creditor's address, which is required for payment, is missing/not correct (formerly IncorrectCreditorAddress)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMissingCreditorAddress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAddress";
			definition = "Specification of creditor's address, which is required for payment, is missing/not correct (formerly IncorrectCreditorAddress).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE04";
		}
	};
	/**
	 * Party who initiated the message is not recognised by the end customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedInitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who initiated the message is not recognised by the end customer."</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedInitiatingParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrecognisedInitiatingParty";
			definition = "Party who initiated the message is not recognised by the end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE05";
		}
	};
	/**
	 * Transaction forbidden on this type of account (formerly NoAgreement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AG01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionForbidden"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction forbidden on this type of account (formerly NoAgreement)."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionForbidden = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionForbidden";
			definition = "Transaction forbidden on this type of account (formerly NoAgreement).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AG01";
		}
	};
	/**
	 * Bank Operation code specified in the message is not valid for receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AG02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank Operation code specified in the message is not valid for receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidBankOperationCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidBankOperationCode";
			definition = "Bank Operation code specified in the message is not valid for receiver.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AG02";
		}
	};
	/**
	 * Invalid date (eg, wrong settlement date).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DT01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid date (eg, wrong settlement date)."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidDate";
			definition = "Invalid date (eg, wrong settlement date).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "DT01";
		}
	};
	/**
	 * Reason has not been specified due to sensitivities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason has not been specified due to sensitivities."</li>
	 * </ul>
	 */
	public static final MMCode mmNotSpecifiedReason = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReason";
			definition = "Reason has not been specified due to sensitivities.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS01";
		}
	};
	/**
	 * Unknown account with institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PY01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown account with institution."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownAccount";
			definition = "Unknown account with institution.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "PY01";
		}
	};
	/**
	 * Transaction reference is not unique within the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RF01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotUniqueTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reference is not unique within the message."</li>
	 * </ul>
	 */
	public static final MMCode mmNotUniqueTransactionReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotUniqueTransactionReference";
			definition = "Transaction reference is not unique within the message.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RF01";
		}
	};
	/**
	 * Bank identifier code specified in the message has an incorrect format
	 * (formerly IncorrectFormatForRoutingCode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RC01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankIdentifierIncorrect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBankIdentifierIncorrect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankIdentifierIncorrect";
			definition = "Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC01";
		}
	};
	/**
	 * Routing code specified in the transaction/message is not numeric.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RC02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNumericRoutingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Routing code specified in the transaction/message is not numeric."</li>
	 * </ul>
	 */
	public static final MMCode mmNonNumericRoutingCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonNumericRoutingCode";
			definition = "Routing code specified in the transaction/message is not numeric.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC02";
		}
	};
	/**
	 * Routing code specified in the transaction/message is not valid for local
	 * clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RC03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotValidRoutingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Routing code specified in the transaction/message is not valid for local clearing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotValidRoutingCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotValidRoutingCode";
			definition = "Routing code specified in the transaction/message is not valid for local clearing.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC03";
		}
	};
	/**
	 * Routing code specified in the transaction/message refers to a closed
	 * branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RC04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Routing code specified in the transaction/message refers to a closed branch."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClosedBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosedBranch";
			definition = "Routing code specified in the transaction/message refers to a closed branch.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC04";
		}
	};
	/**
	 * Associated message was received after agreed processing cut-off time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TM01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Associated message was received after agreed processing cut-off time."</li>
	 * </ul>
	 */
	public static final MMCode mmCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Associated message was received after agreed processing cut-off time.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "TM01";
		}
	};
	/**
	 * Correspondent bank not possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ED01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNotPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Correspondent bank not possible."</li>
	 * </ul>
	 */
	public static final MMCode mmCorrespondentBankNotPossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorrespondentBankNotPossible";
			definition = "Correspondent bank not possible.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED01";
		}
	};
	/**
	 * Transaction reason non reportable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ED02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReasonNonReportable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason non reportable."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionReasonNonReportable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionReasonNonReportable";
			definition = "Transaction reason non reportable.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED02";
		}
	};
	/**
	 * Balance of payments complementary info is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ED03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInfoRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of payments complementary info is requested."</li>
	 * </ul>
	 */
	public static final MMCode mmBalanceInfoRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceInfoRequested";
			definition = "Balance of payments complementary info is requested.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED03";
		}
	};
	/**
	 * Charge details not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ED04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetailsNotCorrect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge details not correct."</li>
	 * </ul>
	 */
	public static final MMCode mmChargeDetailsNotCorrect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeDetailsNotCorrect";
			definition = "Charge details not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED04";
		}
	};
	/**
	 * Reason has not been specified by agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonAgentGenerated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason has not been specified by agent."</li>
	 * </ul>
	 */
	public static final MMCode mmNotSpecifiedReasonAgentGenerated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonAgentGenerated";
			definition = "Reason has not been specified by agent.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS03";
		}
	};
	/**
	 * Reason has not been specified by end customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonCustomerGenerated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason has not been specified by end customer."</li>
	 * </ul>
	 */
	public static final MMCode mmNotSpecifiedReasonCustomerGenerated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonCustomerGenerated";
			definition = "Reason has not been specified by end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS02";
		}
	};
	/**
	 * End customer specified is not known at associated Sort/National Bank Code
	 * or does no longer exist in the books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownEndCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "End customer specified is not known at associated Sort/National Bank Code or does no longer exist in the books."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnknownEndCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownEndCustomer";
			definition = "End customer specified is not known at associated Sort/National Bank Code or does no longer exist in the books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE06";
		}
	};
	/**
	 * Specification of debtor's address, which is required for payment, is
	 * missing/not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BE07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of debtor's address, which is required for payment, is missing/not correct."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMissingDebtorAddress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAddress";
			definition = "Specification of debtor's address, which is required for payment, is missing/not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE07";
		}
	};
	/**
	 * Amount received is not the amount agreed or expected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount received is not the amount agreed or expected."</li>
	 * </ul>
	 */
	public static final MMCode mmWrongAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongAmount";
			definition = "Amount received is not the amount agreed or expected.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM09";
		}
	};
	/**
	 * Sum of instructed amounts does not equal the control sum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AM10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of instructed amounts does not equal the control sum."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidControlSum = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidControlSum";
			definition = "Sum of instructed amounts does not equal the control sum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM10";
		}
	};
	/**
	 * Mandate is cancelled or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate is cancelled or invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmNoMandate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMandate";
			definition = "Mandate is cancelled or invalid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD01";
		}
	};
	/**
	 * Mandate related information data required by the scheme is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMandatoryInformationInMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate related information data required by the scheme is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingMandatoryInformationInMandate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingMandatoryInformationInMandate";
			definition = "Mandate related information data required by the scheme is missing.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD02";
		}
	};
	/**
	 * File format incomplete or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidFileFormatForOtherReasonThanGroupingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File format incomplete or invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidFileFormatForOtherReasonThanGroupingIndicator = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForOtherReasonThanGroupingIndicator";
			definition = "File format incomplete or invalid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD03";
		}
	};
	/**
	 * File format incorrect in terms of grouping indicator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidFileFormatForGroupingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File format incorrect in terms of grouping indicator."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidFileFormatForGroupingIndicator = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForGroupingIndicator";
			definition = "File format incorrect in terms of grouping indicator.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD04";
		}
	};
	/**
	 * Return of funds requested by end customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundRequestByEndCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of funds requested by end customer."</li>
	 * </ul>
	 */
	public static final MMCode mmRefundRequestByEndCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RefundRequestByEndCustomer";
			definition = "Return of funds requested by end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD06";
		}
	};
	/**
	 * End customer is deceased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerDeceased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End customer is deceased."</li>
	 * </ul>
	 */
	public static final MMCode mmEndCustomerDeceased = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndCustomerDeceased";
			definition = "End customer is deceased.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD07";
		}
	};
	/**
	 * Creditor or creditor's agent should not have collected the direct debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MD05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionNotDue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor or creditor's agent should not have collected the direct debit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollectionNotDue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionNotDue";
			definition = "Creditor or creditor's agent should not have collected the direct debit.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD05";
		}
	};
	/**
	 * Name provided is not valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AC07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name provided is not valid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidName";
			definition = "Name provided is not valid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC07";
		}
	};
	/**
	 * Settlement of the transaction has failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ED05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of the transaction has failed."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementFailed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementFailed";
			definition = "Settlement of the transaction has failed.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED05";
		}
	};
	/**
	 * Reason is provided as narrative information in the additional reason
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
	 * TransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is provided as narrative information in the additional reason information."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNarrative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Narrative";
			definition = "Reason is provided as narrative information in the additional reason information.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "NARR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AC01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReasonCode";
				definition = "Specifies the reason for a transaction to be rejected, returned or reversed by an instructed agent or somebody acting on behalf of an instructed agent.";
				code_lazy = () -> Arrays.asList(TransactionReasonCode.mmIncorrectAccountNumber, TransactionReasonCode.mmNonNumericAccountNumber, TransactionReasonCode.mmInvalidAccountNumberForClearingCode,
						TransactionReasonCode.mmClosedAccountNumber, TransactionReasonCode.mmInvalidAccountNumberWithInstitution, TransactionReasonCode.mmBlockedAccount, TransactionReasonCode.mmZeroAmount,
						TransactionReasonCode.mmNotAllowedAmount, TransactionReasonCode.mmNotAllowedCurrency, TransactionReasonCode.mmInsufficientFunds, TransactionReasonCode.mmDuplication, TransactionReasonCode.mmTooLowAmount,
						TransactionReasonCode.mmBlockedAmount, TransactionReasonCode.mmChargeDisagreement, TransactionReasonCode.mmInconsistentWithEndCustomer, TransactionReasonCode.mmUnknownCreditor,
						TransactionReasonCode.mmNoLongerValidCreditor, TransactionReasonCode.mmMissingCreditorAddress, TransactionReasonCode.mmUnrecognisedInitiatingParty, TransactionReasonCode.mmTransactionForbidden,
						TransactionReasonCode.mmInvalidBankOperationCode, TransactionReasonCode.mmInvalidDate, TransactionReasonCode.mmNotSpecifiedReason, TransactionReasonCode.mmUnknownAccount,
						TransactionReasonCode.mmNotUniqueTransactionReference, TransactionReasonCode.mmBankIdentifierIncorrect, TransactionReasonCode.mmNonNumericRoutingCode, TransactionReasonCode.mmNotValidRoutingCode,
						TransactionReasonCode.mmClosedBranch, TransactionReasonCode.mmCutOffTime, TransactionReasonCode.mmCorrespondentBankNotPossible, TransactionReasonCode.mmTransactionReasonNonReportable,
						TransactionReasonCode.mmBalanceInfoRequested, TransactionReasonCode.mmChargeDetailsNotCorrect, TransactionReasonCode.mmNotSpecifiedReasonAgentGenerated, TransactionReasonCode.mmNotSpecifiedReasonCustomerGenerated,
						TransactionReasonCode.mmUnknownEndCustomer, TransactionReasonCode.mmMissingDebtorAddress, TransactionReasonCode.mmWrongAmount, TransactionReasonCode.mmInvalidControlSum, TransactionReasonCode.mmNoMandate,
						TransactionReasonCode.mmMissingMandatoryInformationInMandate, TransactionReasonCode.mmInvalidFileFormatForOtherReasonThanGroupingIndicator, TransactionReasonCode.mmInvalidFileFormatForGroupingIndicator,
						TransactionReasonCode.mmRefundRequestByEndCustomer, TransactionReasonCode.mmEndCustomerDeceased, TransactionReasonCode.mmCollectionNotDue, TransactionReasonCode.mmInvalidName,
						TransactionReasonCode.mmSettlementFailed, TransactionReasonCode.mmNarrative);
			}
		});
		return mmObject_lazy.get();
	}
}