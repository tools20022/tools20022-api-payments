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
import com.tools20022.repository.codeset.TransactionReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transaction to be rejected, returned or reversed
 * by an instructed agent or somebody acting on behalf of an instructed agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#IncorrectAccountNumber
 * TransactionReasonCode.IncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NonNumericAccountNumber
 * TransactionReasonCode.NonNumericAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidAccountNumberForClearingCode
 * TransactionReasonCode.InvalidAccountNumberForClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#ClosedAccountNumber
 * TransactionReasonCode.ClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidAccountNumberWithInstitution
 * TransactionReasonCode.InvalidAccountNumberWithInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#BlockedAccount
 * TransactionReasonCode.BlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#ZeroAmount
 * TransactionReasonCode.ZeroAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotAllowedAmount
 * TransactionReasonCode.NotAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotAllowedCurrency
 * TransactionReasonCode.NotAllowedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InsufficientFunds
 * TransactionReasonCode.InsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#Duplication
 * TransactionReasonCode.Duplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#TooLowAmount
 * TransactionReasonCode.TooLowAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#BlockedAmount
 * TransactionReasonCode.BlockedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#ChargeDisagreement
 * TransactionReasonCode.ChargeDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InconsistentWithEndCustomer
 * TransactionReasonCode.InconsistentWithEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#UnknownCreditor
 * TransactionReasonCode.UnknownCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NoLongerValidCreditor
 * TransactionReasonCode.NoLongerValidCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#MissingCreditorAddress
 * TransactionReasonCode.MissingCreditorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#UnrecognisedInitiatingParty
 * TransactionReasonCode.UnrecognisedInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#TransactionForbidden
 * TransactionReasonCode.TransactionForbidden}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidBankOperationCode
 * TransactionReasonCode.InvalidBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidDate
 * TransactionReasonCode.InvalidDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotSpecifiedReason
 * TransactionReasonCode.NotSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#UnknownAccount
 * TransactionReasonCode.UnknownAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotUniqueTransactionReference
 * TransactionReasonCode.NotUniqueTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#BankIdentifierIncorrect
 * TransactionReasonCode.BankIdentifierIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NonNumericRoutingCode
 * TransactionReasonCode.NonNumericRoutingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotValidRoutingCode
 * TransactionReasonCode.NotValidRoutingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#ClosedBranch
 * TransactionReasonCode.ClosedBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#CutOffTime
 * TransactionReasonCode.CutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#CorrespondentBankNotPossible
 * TransactionReasonCode.CorrespondentBankNotPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#TransactionReasonNonReportable
 * TransactionReasonCode.TransactionReasonNonReportable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#BalanceInfoRequested
 * TransactionReasonCode.BalanceInfoRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#ChargeDetailsNotCorrect
 * TransactionReasonCode.ChargeDetailsNotCorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotSpecifiedReasonAgentGenerated
 * TransactionReasonCode.NotSpecifiedReasonAgentGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NotSpecifiedReasonCustomerGenerated
 * TransactionReasonCode.NotSpecifiedReasonCustomerGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#UnknownEndCustomer
 * TransactionReasonCode.UnknownEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#MissingDebtorAddress
 * TransactionReasonCode.MissingDebtorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#WrongAmount
 * TransactionReasonCode.WrongAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidControlSum
 * TransactionReasonCode.InvalidControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#NoMandate
 * TransactionReasonCode.NoMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#MissingMandatoryInformationInMandate
 * TransactionReasonCode.MissingMandatoryInformationInMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidFileFormatForOtherReasonThanGroupingIndicator
 * TransactionReasonCode.InvalidFileFormatForOtherReasonThanGroupingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidFileFormatForGroupingIndicator
 * TransactionReasonCode.InvalidFileFormatForGroupingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#RefundRequestByEndCustomer
 * TransactionReasonCode.RefundRequestByEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#EndCustomerDeceased
 * TransactionReasonCode.EndCustomerDeceased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#CollectionNotDue
 * TransactionReasonCode.CollectionNotDue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#InvalidName
 * TransactionReasonCode.InvalidName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#SettlementFailed
 * TransactionReasonCode.SettlementFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode#Narrative
 * TransactionReasonCode.Narrative}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionReasonCode extends MMCode {

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
	public static final TransactionReasonCode IncorrectAccountNumber = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAccountNumber";
			definition = "Format of the account number specified is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NonNumericAccountNumber = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonNumericAccountNumber";
			definition = "Format of the account number specified is non-numeric.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidAccountNumberForClearingCode = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberForClearingCode";
			definition = "Format of the account number specified is not valid for local Sort/National Clearing Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode ClosedAccountNumber = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the Receiver's books.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidAccountNumberWithInstitution = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberWithInstitution";
			definition = "Account number specified is not a valid account at the Final Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode BlockedAccount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedAccount";
			definition = "Account specified is blocked, prohibiting posting of transactions against it.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode ZeroAmount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ZeroAmount";
			definition = "Specified message amount is equal to zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotAllowedAmount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedAmount";
			definition = "Specified transaction/message amount is greater than allowed maximum.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotAllowedCurrency = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedCurrency";
			definition = "Specified message amount is in an non processable currency outside of existing agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InsufficientFunds = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientFunds";
			definition = "Amount of funds available to cover specified message amount is insufficient.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode Duplication = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duplication";
			definition = "This message appears to have been duplicated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode TooLowAmount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLowAmount";
			definition = "Specified transaction amount is less than agreed minimum.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode BlockedAmount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedAmount";
			definition = "Amount specified in message has been blocked by regulatory authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode ChargeDisagreement = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeDisagreement";
			definition = "Specified charges amount is not as agreed between sender and receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
			codeName = "AM08";
		}
	};
	/**
	 * Identification of end customer is not consistent with associated account
	 * number. (formerly CreditorConsistency).
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
	 * "Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency)."
	 * </li>
	 * </ul>
	 */
	public static final TransactionReasonCode InconsistentWithEndCustomer = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InconsistentWithEndCustomer";
			definition = "Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode UnknownCreditor = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownCreditor";
			definition = "Creditor specified is not known at associated Sort/National Clearing code.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NoLongerValidCreditor = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoLongerValidCreditor";
			definition = "Creditor specified no longer exists in the books.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode MissingCreditorAddress = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAddress";
			definition = "Specification of creditor's address, which is required for payment, is missing/not correct (formerly IncorrectCreditorAddress).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode UnrecognisedInitiatingParty = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrecognisedInitiatingParty";
			definition = "Party who initiated the message is not recognised by the end customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode TransactionForbidden = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionForbidden";
			definition = "Transaction forbidden on this type of account (formerly NoAgreement).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidBankOperationCode = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidBankOperationCode";
			definition = "Bank Operation code specified in the message is not valid for receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidDate = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidDate";
			definition = "Invalid date (eg, wrong settlement date).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotSpecifiedReason = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReason";
			definition = "Reason has not been specified due to sensitivities.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode UnknownAccount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownAccount";
			definition = "Unknown account with institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotUniqueTransactionReference = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotUniqueTransactionReference";
			definition = "Transaction reference is not unique within the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode BankIdentifierIncorrect = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankIdentifierIncorrect";
			definition = "Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NonNumericRoutingCode = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonNumericRoutingCode";
			definition = "Routing code specified in the transaction/message is not numeric.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotValidRoutingCode = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotValidRoutingCode";
			definition = "Routing code specified in the transaction/message is not valid for local clearing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode ClosedBranch = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosedBranch";
			definition = "Routing code specified in the transaction/message refers to a closed branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode CutOffTime = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Associated message was received after agreed processing cut-off time.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode CorrespondentBankNotPossible = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorrespondentBankNotPossible";
			definition = "Correspondent bank not possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode TransactionReasonNonReportable = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionReasonNonReportable";
			definition = "Transaction reason non reportable.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode BalanceInfoRequested = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceInfoRequested";
			definition = "Balance of payments complementary info is requested.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode ChargeDetailsNotCorrect = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeDetailsNotCorrect";
			definition = "Charge details not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotSpecifiedReasonAgentGenerated = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonAgentGenerated";
			definition = "Reason has not been specified by agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NotSpecifiedReasonCustomerGenerated = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonCustomerGenerated";
			definition = "Reason has not been specified by end customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode UnknownEndCustomer = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownEndCustomer";
			definition = "End customer specified is not known at associated Sort/National Bank Code or does no longer exist in the books.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode MissingDebtorAddress = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAddress";
			definition = "Specification of debtor's address, which is required for payment, is missing/not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode WrongAmount = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongAmount";
			definition = "Amount received is not the amount agreed or expected.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidControlSum = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidControlSum";
			definition = "Sum of instructed amounts does not equal the control sum.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode NoMandate = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMandate";
			definition = "Mandate is cancelled or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode MissingMandatoryInformationInMandate = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingMandatoryInformationInMandate";
			definition = "Mandate related information data required by the scheme is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidFileFormatForOtherReasonThanGroupingIndicator = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForOtherReasonThanGroupingIndicator";
			definition = "File format incomplete or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidFileFormatForGroupingIndicator = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForGroupingIndicator";
			definition = "File format incorrect in terms of grouping indicator.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode RefundRequestByEndCustomer = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RefundRequestByEndCustomer";
			definition = "Return of funds requested by end customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode EndCustomerDeceased = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndCustomerDeceased";
			definition = "End customer is deceased.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode CollectionNotDue = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionNotDue";
			definition = "Creditor or creditor's agent should not have collected the direct debit.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode InvalidName = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidName";
			definition = "Name provided is not valid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode SettlementFailed = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementFailed";
			definition = "Settlement of the transaction has failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
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
	public static final TransactionReasonCode Narrative = new TransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Narrative";
			definition = "Reason is provided as narrative information in the additional reason information.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	final static private LinkedHashMap<String, TransactionReasonCode> codesByName = new LinkedHashMap<>();

	protected TransactionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AC01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReasonCode";
				definition = "Specifies the reason for a transaction to be rejected, returned or reversed by an instructed agent or somebody acting on behalf of an instructed agent.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionReasonCode.IncorrectAccountNumber, com.tools20022.repository.codeset.TransactionReasonCode.NonNumericAccountNumber,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidAccountNumberForClearingCode, com.tools20022.repository.codeset.TransactionReasonCode.ClosedAccountNumber,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidAccountNumberWithInstitution, com.tools20022.repository.codeset.TransactionReasonCode.BlockedAccount,
						com.tools20022.repository.codeset.TransactionReasonCode.ZeroAmount, com.tools20022.repository.codeset.TransactionReasonCode.NotAllowedAmount,
						com.tools20022.repository.codeset.TransactionReasonCode.NotAllowedCurrency, com.tools20022.repository.codeset.TransactionReasonCode.InsufficientFunds,
						com.tools20022.repository.codeset.TransactionReasonCode.Duplication, com.tools20022.repository.codeset.TransactionReasonCode.TooLowAmount, com.tools20022.repository.codeset.TransactionReasonCode.BlockedAmount,
						com.tools20022.repository.codeset.TransactionReasonCode.ChargeDisagreement, com.tools20022.repository.codeset.TransactionReasonCode.InconsistentWithEndCustomer,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownCreditor, com.tools20022.repository.codeset.TransactionReasonCode.NoLongerValidCreditor,
						com.tools20022.repository.codeset.TransactionReasonCode.MissingCreditorAddress, com.tools20022.repository.codeset.TransactionReasonCode.UnrecognisedInitiatingParty,
						com.tools20022.repository.codeset.TransactionReasonCode.TransactionForbidden, com.tools20022.repository.codeset.TransactionReasonCode.InvalidBankOperationCode,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidDate, com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReason,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownAccount, com.tools20022.repository.codeset.TransactionReasonCode.NotUniqueTransactionReference,
						com.tools20022.repository.codeset.TransactionReasonCode.BankIdentifierIncorrect, com.tools20022.repository.codeset.TransactionReasonCode.NonNumericRoutingCode,
						com.tools20022.repository.codeset.TransactionReasonCode.NotValidRoutingCode, com.tools20022.repository.codeset.TransactionReasonCode.ClosedBranch, com.tools20022.repository.codeset.TransactionReasonCode.CutOffTime,
						com.tools20022.repository.codeset.TransactionReasonCode.CorrespondentBankNotPossible, com.tools20022.repository.codeset.TransactionReasonCode.TransactionReasonNonReportable,
						com.tools20022.repository.codeset.TransactionReasonCode.BalanceInfoRequested, com.tools20022.repository.codeset.TransactionReasonCode.ChargeDetailsNotCorrect,
						com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReasonAgentGenerated, com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReasonCustomerGenerated,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownEndCustomer, com.tools20022.repository.codeset.TransactionReasonCode.MissingDebtorAddress,
						com.tools20022.repository.codeset.TransactionReasonCode.WrongAmount, com.tools20022.repository.codeset.TransactionReasonCode.InvalidControlSum, com.tools20022.repository.codeset.TransactionReasonCode.NoMandate,
						com.tools20022.repository.codeset.TransactionReasonCode.MissingMandatoryInformationInMandate, com.tools20022.repository.codeset.TransactionReasonCode.InvalidFileFormatForOtherReasonThanGroupingIndicator,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidFileFormatForGroupingIndicator, com.tools20022.repository.codeset.TransactionReasonCode.RefundRequestByEndCustomer,
						com.tools20022.repository.codeset.TransactionReasonCode.EndCustomerDeceased, com.tools20022.repository.codeset.TransactionReasonCode.CollectionNotDue,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidName, com.tools20022.repository.codeset.TransactionReasonCode.SettlementFailed, com.tools20022.repository.codeset.TransactionReasonCode.Narrative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectAccountNumber.getCodeName().get(), IncorrectAccountNumber);
		codesByName.put(NonNumericAccountNumber.getCodeName().get(), NonNumericAccountNumber);
		codesByName.put(InvalidAccountNumberForClearingCode.getCodeName().get(), InvalidAccountNumberForClearingCode);
		codesByName.put(ClosedAccountNumber.getCodeName().get(), ClosedAccountNumber);
		codesByName.put(InvalidAccountNumberWithInstitution.getCodeName().get(), InvalidAccountNumberWithInstitution);
		codesByName.put(BlockedAccount.getCodeName().get(), BlockedAccount);
		codesByName.put(ZeroAmount.getCodeName().get(), ZeroAmount);
		codesByName.put(NotAllowedAmount.getCodeName().get(), NotAllowedAmount);
		codesByName.put(NotAllowedCurrency.getCodeName().get(), NotAllowedCurrency);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(Duplication.getCodeName().get(), Duplication);
		codesByName.put(TooLowAmount.getCodeName().get(), TooLowAmount);
		codesByName.put(BlockedAmount.getCodeName().get(), BlockedAmount);
		codesByName.put(ChargeDisagreement.getCodeName().get(), ChargeDisagreement);
		codesByName.put(InconsistentWithEndCustomer.getCodeName().get(), InconsistentWithEndCustomer);
		codesByName.put(UnknownCreditor.getCodeName().get(), UnknownCreditor);
		codesByName.put(NoLongerValidCreditor.getCodeName().get(), NoLongerValidCreditor);
		codesByName.put(MissingCreditorAddress.getCodeName().get(), MissingCreditorAddress);
		codesByName.put(UnrecognisedInitiatingParty.getCodeName().get(), UnrecognisedInitiatingParty);
		codesByName.put(TransactionForbidden.getCodeName().get(), TransactionForbidden);
		codesByName.put(InvalidBankOperationCode.getCodeName().get(), InvalidBankOperationCode);
		codesByName.put(InvalidDate.getCodeName().get(), InvalidDate);
		codesByName.put(NotSpecifiedReason.getCodeName().get(), NotSpecifiedReason);
		codesByName.put(UnknownAccount.getCodeName().get(), UnknownAccount);
		codesByName.put(NotUniqueTransactionReference.getCodeName().get(), NotUniqueTransactionReference);
		codesByName.put(BankIdentifierIncorrect.getCodeName().get(), BankIdentifierIncorrect);
		codesByName.put(NonNumericRoutingCode.getCodeName().get(), NonNumericRoutingCode);
		codesByName.put(NotValidRoutingCode.getCodeName().get(), NotValidRoutingCode);
		codesByName.put(ClosedBranch.getCodeName().get(), ClosedBranch);
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
		codesByName.put(CorrespondentBankNotPossible.getCodeName().get(), CorrespondentBankNotPossible);
		codesByName.put(TransactionReasonNonReportable.getCodeName().get(), TransactionReasonNonReportable);
		codesByName.put(BalanceInfoRequested.getCodeName().get(), BalanceInfoRequested);
		codesByName.put(ChargeDetailsNotCorrect.getCodeName().get(), ChargeDetailsNotCorrect);
		codesByName.put(NotSpecifiedReasonAgentGenerated.getCodeName().get(), NotSpecifiedReasonAgentGenerated);
		codesByName.put(NotSpecifiedReasonCustomerGenerated.getCodeName().get(), NotSpecifiedReasonCustomerGenerated);
		codesByName.put(UnknownEndCustomer.getCodeName().get(), UnknownEndCustomer);
		codesByName.put(MissingDebtorAddress.getCodeName().get(), MissingDebtorAddress);
		codesByName.put(WrongAmount.getCodeName().get(), WrongAmount);
		codesByName.put(InvalidControlSum.getCodeName().get(), InvalidControlSum);
		codesByName.put(NoMandate.getCodeName().get(), NoMandate);
		codesByName.put(MissingMandatoryInformationInMandate.getCodeName().get(), MissingMandatoryInformationInMandate);
		codesByName.put(InvalidFileFormatForOtherReasonThanGroupingIndicator.getCodeName().get(), InvalidFileFormatForOtherReasonThanGroupingIndicator);
		codesByName.put(InvalidFileFormatForGroupingIndicator.getCodeName().get(), InvalidFileFormatForGroupingIndicator);
		codesByName.put(RefundRequestByEndCustomer.getCodeName().get(), RefundRequestByEndCustomer);
		codesByName.put(EndCustomerDeceased.getCodeName().get(), EndCustomerDeceased);
		codesByName.put(CollectionNotDue.getCodeName().get(), CollectionNotDue);
		codesByName.put(InvalidName.getCodeName().get(), InvalidName);
		codesByName.put(SettlementFailed.getCodeName().get(), SettlementFailed);
		codesByName.put(Narrative.getCodeName().get(), Narrative);
	}

	public static TransactionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionReasonCode[] values() {
		TransactionReasonCode[] values = new TransactionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionReasonCode> {
		@Override
		public TransactionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}