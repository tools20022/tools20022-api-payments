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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Role played by a party in the context of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentPartyRole" src="doc-files/PaymentPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
 * PaymentPartyRole.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPaymentPartyRole
 * CashAccount.mmPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DebtorAgentRole
 * DebtorAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorAgentRole
 * CreditorAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InitiatingPartyRole
 * InitiatingPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties4
 * TransactionParties4}</li>
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
 * "PaymentPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in the context of a payment."</li>
 * </ul>
 */
public class PaymentPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPaymentPartyRole
	 * CashAccount.mmPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmBalanceTransferAccount
	 * AccountReport15.mmBalanceTransferAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmDebtorAccount
	 * DirectDebitTransactionInformation15.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmDebtorAgentAccount
	 * DirectDebitTransactionInformation15.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent1Account
	 * CreditTransferTransaction9.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent2Account
	 * CreditTransferTransaction9.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent3Account
	 * CreditTransferTransaction9.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmCreditorAgentAccount
	 * CreditTransferTransaction9.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmCreditorAccount
	 * CreditTransferTransaction9.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent1Account
	 * CreditTransferTransaction26.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent2Account
	 * CreditTransferTransaction26.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent3Account
	 * CreditTransferTransaction26.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmCreditorAgentAccount
	 * CreditTransferTransaction26.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmCreditorAccount
	 * CreditTransferTransaction26.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmCreditorAccount
	 * CreditTransferTransaction22.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmCreditorAccount
	 * PaymentInstruction21.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmCreditorAgentAccount
	 * PaymentInstruction21.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmCreditorAccount
	 * DirectDebitTransactionInformation21.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmCreditorAgentAccount
	 * DirectDebitTransactionInformation21.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent1Account
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent2Account
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent3Account
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDebtorAccount
	 * DirectDebitTransactionInformation21.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDebtorAgentAccount
	 * DirectDebitTransactionInformation21.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmCreditorAccount
	 * Mandate10.mmCreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmDebtorAccount
	 * Mandate10.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtorAccount
	 * PaymentInstruction23.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmDebtorAccount
	 * PaymentInstruction22.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmDebtorAgentAccount
	 * PaymentInstruction22.mmDebtorAgentAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmCreditorAccount
	 * Mandate9.mmCreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmDebtorAccount
	 * Mandate9.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmDebtorAccount
	 * OriginalPaymentInformation7.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmCreditorAccount
	 * OriginalPaymentInformation7.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmDebtorAccount
	 * OriginalTransactionReference26.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmCreditorAccount
	 * OriginalTransactionReference26.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmCreditorAccount
	 * Mandate11.mmCreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmDebtorAccount
	 * Mandate11.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDebtorAgentAccount
	 * DirectDebitTransactionInformation22.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDebtorAccount
	 * DirectDebitTransactionInformation22.mmDebtorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmCreditorAccount
	 * Mandate8.mmCreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmDebtorAccount
	 * Mandate8.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmDebtorAccount
	 * PaymentInstruction24.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmDebtorAgentAccount
	 * PaymentInstruction24.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmCreditorAccount
	 * CreditTransferTransaction27.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmDebtorAccount
	 * PaymentComplementaryInformation7.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmDebtorAgentAccount
	 * PaymentComplementaryInformation7.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent1Account
	 * PaymentComplementaryInformation7.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent2Account
	 * PaymentComplementaryInformation7.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent3Account
	 * PaymentComplementaryInformation7.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmCreditorAgentAccount
	 * PaymentComplementaryInformation7.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmCreditorAccount
	 * PaymentComplementaryInformation7.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent1Account
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent2Account
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent3Account
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent1Account
	 * CreditTransferTransaction31.mmPreviousInstructingAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent2Account
	 * CreditTransferTransaction31.mmPreviousInstructingAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent3Account
	 * CreditTransferTransaction31.mmPreviousInstructingAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent1Account
	 * CreditTransferTransaction31.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent2Account
	 * CreditTransferTransaction31.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent3Account
	 * CreditTransferTransaction31.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmDebtorAccount
	 * CreditTransferTransaction31.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmDebtorAgentAccount
	 * CreditTransferTransaction31.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmCreditorAgentAccount
	 * CreditTransferTransaction31.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmCreditorAccount
	 * CreditTransferTransaction31.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmDebtorAccount
	 * RequestedModification7.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmDebtorAgentAccount
	 * RequestedModification7.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmCreditorAgentAccount
	 * RequestedModification7.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmCreditorAccount
	 * RequestedModification7.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmDebtorAccount
	 * TransactionParties4.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties4#mmCreditorAccount
	 * TransactionParties4.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmDebtorAccount
	 * OriginalTransactionReference27.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmDebtorAgentAccount
	 * OriginalTransactionReference27.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmCreditorAgentAccount
	 * OriginalTransactionReference27.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmCreditorAccount
	 * OriginalTransactionReference27.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmDebtorAccount
	 * CreditTransferTransaction32.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmDebtorAgentAccount
	 * CreditTransferTransaction32.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent1Account
	 * CreditTransferTransaction32.mmPreviousInstructingAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent2Account
	 * CreditTransferTransaction32.mmPreviousInstructingAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent3Account
	 * CreditTransferTransaction32.mmPreviousInstructingAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent1Account
	 * CreditTransferTransaction32.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent2Account
	 * CreditTransferTransaction32.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent3Account
	 * CreditTransferTransaction32.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmCreditorAgentAccount
	 * CreditTransferTransaction32.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmCreditorAccount
	 * CreditTransferTransaction32.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent1Account
	 * CreditTransferTransaction30.mmPreviousInstructingAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent2Account
	 * CreditTransferTransaction30.mmPreviousInstructingAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent3Account
	 * CreditTransferTransaction30.mmPreviousInstructingAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent1Account
	 * CreditTransferTransaction30.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent2Account
	 * CreditTransferTransaction30.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent3Account
	 * CreditTransferTransaction30.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmDebtorAccount
	 * CreditTransferTransaction30.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmDebtorAgentAccount
	 * CreditTransferTransaction30.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmCreditorAgentAccount
	 * CreditTransferTransaction30.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmCreditorAccount
	 * CreditTransferTransaction30.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails12.mmOriginalCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAccount
	 * AmendmentInformationDetails12.mmOriginalDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails12.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentPartyRole, List<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<PaymentPartyRole, List<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport15.mmBalanceTransferAccount, DirectDebitTransactionInformation15.mmDebtorAccount, DirectDebitTransactionInformation15.mmDebtorAgentAccount,
					CreditTransferTransaction9.mmIntermediaryAgent1Account, CreditTransferTransaction9.mmIntermediaryAgent2Account, CreditTransferTransaction9.mmIntermediaryAgent3Account, CreditTransferTransaction9.mmCreditorAgentAccount,
					CreditTransferTransaction9.mmCreditorAccount, CreditTransferTransaction26.mmIntermediaryAgent1Account, CreditTransferTransaction26.mmIntermediaryAgent2Account, CreditTransferTransaction26.mmIntermediaryAgent3Account,
					CreditTransferTransaction26.mmCreditorAgentAccount, CreditTransferTransaction26.mmCreditorAccount, CreditTransferTransaction22.mmCreditorAccount, PaymentInstruction21.mmCreditorAccount,
					PaymentInstruction21.mmCreditorAgentAccount, DirectDebitTransactionInformation21.mmCreditorAccount, DirectDebitTransactionInformation21.mmCreditorAgentAccount,
					DirectDebitTransactionInformation21.mmIntermediaryAgent1Account, DirectDebitTransactionInformation21.mmIntermediaryAgent2Account, DirectDebitTransactionInformation21.mmIntermediaryAgent3Account,
					DirectDebitTransactionInformation21.mmDebtorAccount, DirectDebitTransactionInformation21.mmDebtorAgentAccount, Mandate10.mmCreditorAccount, Mandate10.mmDebtorAccount, PaymentInstruction23.mmDebtorAccount,
					PaymentInstruction22.mmDebtorAccount, PaymentInstruction22.mmDebtorAgentAccount, Mandate9.mmCreditorAccount, Mandate9.mmDebtorAccount, OriginalPaymentInformation7.mmDebtorAccount,
					OriginalPaymentInformation7.mmCreditorAccount, OriginalTransactionReference26.mmDebtorAccount, OriginalTransactionReference26.mmCreditorAccount, Mandate11.mmCreditorAccount, Mandate11.mmDebtorAccount,
					DirectDebitTransactionInformation22.mmDebtorAgentAccount, DirectDebitTransactionInformation22.mmDebtorAccount, Mandate8.mmCreditorAccount, Mandate8.mmDebtorAccount,
					AmendmentInformationDetails11.mmOriginalCreditorAgentAccount, AmendmentInformationDetails11.mmOriginalDebtorAccount, AmendmentInformationDetails11.mmOriginalDebtorAgentAccount, PaymentInstruction24.mmDebtorAccount,
					PaymentInstruction24.mmDebtorAgentAccount, CreditTransferTransaction27.mmCreditorAccount, PaymentComplementaryInformation7.mmDebtorAccount, PaymentComplementaryInformation7.mmDebtorAgentAccount,
					PaymentComplementaryInformation7.mmIntermediaryAgent1Account, PaymentComplementaryInformation7.mmIntermediaryAgent2Account, PaymentComplementaryInformation7.mmIntermediaryAgent3Account,
					PaymentComplementaryInformation7.mmCreditorAgentAccount, PaymentComplementaryInformation7.mmCreditorAccount, PaymentComplementaryInformation7.mmPreviousInstructingAgent1Account,
					PaymentComplementaryInformation7.mmPreviousInstructingAgent2Account, PaymentComplementaryInformation7.mmPreviousInstructingAgent3Account, CreditTransferTransaction31.mmPreviousInstructingAgent1Account,
					CreditTransferTransaction31.mmPreviousInstructingAgent2Account, CreditTransferTransaction31.mmPreviousInstructingAgent3Account, CreditTransferTransaction31.mmIntermediaryAgent1Account,
					CreditTransferTransaction31.mmIntermediaryAgent2Account, CreditTransferTransaction31.mmIntermediaryAgent3Account, CreditTransferTransaction31.mmDebtorAccount, CreditTransferTransaction31.mmDebtorAgentAccount,
					CreditTransferTransaction31.mmCreditorAgentAccount, CreditTransferTransaction31.mmCreditorAccount, RequestedModification7.mmDebtorAccount, RequestedModification7.mmDebtorAgentAccount,
					RequestedModification7.mmCreditorAgentAccount, RequestedModification7.mmCreditorAccount, TransactionParties4.mmDebtorAccount, TransactionParties4.mmCreditorAccount, OriginalTransactionReference27.mmDebtorAccount,
					OriginalTransactionReference27.mmDebtorAgentAccount, OriginalTransactionReference27.mmCreditorAgentAccount, OriginalTransactionReference27.mmCreditorAccount, CreditTransferTransaction32.mmDebtorAccount,
					CreditTransferTransaction32.mmDebtorAgentAccount, CreditTransferTransaction32.mmPreviousInstructingAgent1Account, CreditTransferTransaction32.mmPreviousInstructingAgent2Account,
					CreditTransferTransaction32.mmPreviousInstructingAgent3Account, CreditTransferTransaction32.mmIntermediaryAgent1Account, CreditTransferTransaction32.mmIntermediaryAgent2Account,
					CreditTransferTransaction32.mmIntermediaryAgent3Account, CreditTransferTransaction32.mmCreditorAgentAccount, CreditTransferTransaction32.mmCreditorAccount, CreditTransferTransaction30.mmPreviousInstructingAgent1Account,
					CreditTransferTransaction30.mmPreviousInstructingAgent2Account, CreditTransferTransaction30.mmPreviousInstructingAgent3Account, CreditTransferTransaction30.mmIntermediaryAgent1Account,
					CreditTransferTransaction30.mmIntermediaryAgent2Account, CreditTransferTransaction30.mmIntermediaryAgent3Account, CreditTransferTransaction30.mmDebtorAccount, CreditTransferTransaction30.mmDebtorAgentAccount,
					CreditTransferTransaction30.mmCreditorAgentAccount, CreditTransferTransaction30.mmCreditorAccount, AmendmentInformationDetails12.mmOriginalCreditorAgentAccount, AmendmentInformationDetails12.mmOriginalDebtorAccount,
					AmendmentInformationDetails12.mmOriginalDebtorAgentAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(PaymentPartyRole obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(PaymentPartyRole obj, List<CashAccount> value) {
			obj.setCashAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentPartyRole, List<Payment>> mmPayment = new MMBusinessAssociationEnd<PaymentPartyRole, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Identifies the payment in which a party plays a role.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(PaymentPartyRole obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(PaymentPartyRole obj, List<Payment> value) {
			obj.setPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPartyRole";
				definition = "Role played by a party in the context of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole, com.tools20022.repository.entity.Payment.mmPartyRole);
				subType_lazy = () -> Arrays.asList(DebtorAgentRole.mmObject(), CreditorRole.mmObject(), CreditorAgentRole.mmObject(), InitiatingPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount, com.tools20022.repository.entity.PaymentPartyRole.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(TransactionParties4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public PaymentPartyRole setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<Payment> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public PaymentPartyRole setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}
}