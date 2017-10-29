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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.msg.TransactionParties3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentPartyRole" src="doc-files/PaymentPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
 * PaymentPartyRole.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#Payment
 * PaymentPartyRole.Payment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#PaymentPartyRole
 * CashAccount.PaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PartyRole
 * Payment.PartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InitiatingPartyRole
 * InitiatingPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties3
 * TransactionParties3}</li>
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
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role such as debtor account, instructing agent account...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#PaymentPartyRole
	 * CashAccount.PaymentPartyRole}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#BalanceTransferAccount
	 * AccountReport15.BalanceTransferAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#DebtorAccount
	 * TransactionParties3.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#CreditorAccount
	 * TransactionParties3.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#DebtorAccount
	 * DirectDebitTransactionInformation15.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#DebtorAgentAccount
	 * DirectDebitTransactionInformation15.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent1Account
	 * CreditTransferTransaction9.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent2Account
	 * CreditTransferTransaction9.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#IntermediaryAgent3Account
	 * CreditTransferTransaction9.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#CreditorAgentAccount
	 * CreditTransferTransaction9.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#CreditorAccount
	 * CreditTransferTransaction9.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PreviousInstructingAgentAccount
	 * CreditTransferTransaction23.PreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent1Account
	 * CreditTransferTransaction23.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent2Account
	 * CreditTransferTransaction23.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#IntermediaryAgent3Account
	 * CreditTransferTransaction23.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#DebtorAccount
	 * CreditTransferTransaction23.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#DebtorAgentAccount
	 * CreditTransferTransaction23.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#CreditorAgentAccount
	 * CreditTransferTransaction23.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#CreditorAccount
	 * CreditTransferTransaction23.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PreviousInstructingAgentAccount
	 * CreditTransferTransaction25.PreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent1Account
	 * CreditTransferTransaction25.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent2Account
	 * CreditTransferTransaction25.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#IntermediaryAgent3Account
	 * CreditTransferTransaction25.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#DebtorAccount
	 * CreditTransferTransaction25.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#DebtorAgentAccount
	 * CreditTransferTransaction25.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#CreditorAgentAccount
	 * CreditTransferTransaction25.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#CreditorAccount
	 * CreditTransferTransaction25.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#DebtorAccount
	 * CreditTransferTransaction24.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#DebtorAgentAccount
	 * CreditTransferTransaction24.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#PreviousInstructingAgentAccount
	 * CreditTransferTransaction24.PreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent1Account
	 * CreditTransferTransaction24.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent2Account
	 * CreditTransferTransaction24.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#IntermediaryAgent3Account
	 * CreditTransferTransaction24.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#CreditorAgentAccount
	 * CreditTransferTransaction24.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#CreditorAccount
	 * CreditTransferTransaction24.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent1Account
	 * CreditTransferTransaction26.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent2Account
	 * CreditTransferTransaction26.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#IntermediaryAgent3Account
	 * CreditTransferTransaction26.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#CreditorAgentAccount
	 * CreditTransferTransaction26.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#CreditorAccount
	 * CreditTransferTransaction26.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#CreditorAccount
	 * CreditTransferTransaction22.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#CreditorAccount
	 * PaymentInstruction21.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#CreditorAgentAccount
	 * PaymentInstruction21.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#CreditorAccount
	 * DirectDebitTransactionInformation21.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#CreditorAgentAccount
	 * DirectDebitTransactionInformation21.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent1Account
	 * DirectDebitTransactionInformation21.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent2Account
	 * DirectDebitTransactionInformation21.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#IntermediaryAgent3Account
	 * DirectDebitTransactionInformation21.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#DebtorAccount
	 * DirectDebitTransactionInformation21.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#DebtorAgentAccount
	 * DirectDebitTransactionInformation21.DebtorAgentAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#CreditorAccount
	 * Mandate10.CreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#DebtorAccount
	 * Mandate10.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#DebtorAccount
	 * RequestedModification6.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#DebtorAgentAccount
	 * RequestedModification6.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#CreditorAgentAccount
	 * RequestedModification6.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#CreditorAccount
	 * RequestedModification6.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#DebtorAccount
	 * PaymentInstruction23.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAccount
	 * PaymentInstruction22.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAgentAccount
	 * PaymentInstruction22.DebtorAgentAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#CreditorAccount
	 * Mandate9.CreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#DebtorAccount
	 * Mandate9.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#DebtorAccount
	 * OriginalTransactionReference24.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#DebtorAgentAccount
	 * OriginalTransactionReference24.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#CreditorAgentAccount
	 * OriginalTransactionReference24.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#CreditorAccount
	 * OriginalTransactionReference24.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#DebtorAccount
	 * OriginalPaymentInformation7.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#CreditorAccount
	 * OriginalPaymentInformation7.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#DebtorAccount
	 * OriginalTransactionReference26.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#CreditorAccount
	 * OriginalTransactionReference26.CreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CreditorAccount
	 * Mandate11.CreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#DebtorAccount
	 * Mandate11.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#DebtorAgentAccount
	 * DirectDebitTransactionInformation22.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#DebtorAccount
	 * DirectDebitTransactionInformation22.DebtorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#CreditorAccount
	 * Mandate8.CreditorAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#DebtorAccount
	 * Mandate8.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalCreditorAgentAccount
	 * AmendmentInformationDetails11.OriginalCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalDebtorAccount
	 * AmendmentInformationDetails11.OriginalDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalDebtorAgentAccount
	 * AmendmentInformationDetails11.OriginalDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#DebtorAccount
	 * PaymentComplementaryInformation6.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#DebtorAgentAccount
	 * PaymentComplementaryInformation6.DebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent1Account
	 * PaymentComplementaryInformation6.IntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent2Account
	 * PaymentComplementaryInformation6.IntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#IntermediaryAgent3Account
	 * PaymentComplementaryInformation6.IntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#CreditorAgentAccount
	 * PaymentComplementaryInformation6.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#CreditorAccount
	 * PaymentComplementaryInformation6.CreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#PreviousInstructingAgentAccount
	 * PaymentComplementaryInformation6.PreviousInstructingAgentAccount}</li>
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
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.BalanceTransferAccount, com.tools20022.repository.msg.TransactionParties3.DebtorAccount,
					com.tools20022.repository.msg.TransactionParties3.CreditorAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation15.DebtorAccount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.DebtorAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent1Account,
					com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransferTransaction9.IntermediaryAgent3Account,
					com.tools20022.repository.msg.CreditTransferTransaction9.CreditorAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction9.CreditorAccount,
					com.tools20022.repository.msg.CreditTransferTransaction23.PreviousInstructingAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent1Account,
					com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransferTransaction23.IntermediaryAgent3Account,
					com.tools20022.repository.msg.CreditTransferTransaction23.DebtorAccount, com.tools20022.repository.msg.CreditTransferTransaction23.DebtorAgentAccount,
					com.tools20022.repository.msg.CreditTransferTransaction23.CreditorAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction23.CreditorAccount,
					com.tools20022.repository.msg.CreditTransferTransaction25.PreviousInstructingAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent1Account,
					com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransferTransaction25.IntermediaryAgent3Account,
					com.tools20022.repository.msg.CreditTransferTransaction25.DebtorAccount, com.tools20022.repository.msg.CreditTransferTransaction25.DebtorAgentAccount,
					com.tools20022.repository.msg.CreditTransferTransaction25.CreditorAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction25.CreditorAccount,
					com.tools20022.repository.msg.CreditTransferTransaction24.DebtorAccount, com.tools20022.repository.msg.CreditTransferTransaction24.DebtorAgentAccount,
					com.tools20022.repository.msg.CreditTransferTransaction24.PreviousInstructingAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent1Account,
					com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransferTransaction24.IntermediaryAgent3Account,
					com.tools20022.repository.msg.CreditTransferTransaction24.CreditorAgentAccount, com.tools20022.repository.msg.CreditTransferTransaction24.CreditorAccount,
					com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent1Account, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent2Account,
					com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent3Account, com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAgentAccount,
					com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAccount, com.tools20022.repository.msg.CreditTransferTransaction22.CreditorAccount, com.tools20022.repository.msg.PaymentInstruction21.CreditorAccount,
					com.tools20022.repository.msg.PaymentInstruction21.CreditorAgentAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.CreditorAccount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.CreditorAgentAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent1Account,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent2Account, com.tools20022.repository.msg.DirectDebitTransactionInformation21.IntermediaryAgent3Account,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.DebtorAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.DebtorAgentAccount,
					com.tools20022.repository.msg.Mandate10.CreditorAccount, com.tools20022.repository.msg.Mandate10.DebtorAccount, com.tools20022.repository.msg.RequestedModification6.DebtorAccount,
					com.tools20022.repository.msg.RequestedModification6.DebtorAgentAccount, com.tools20022.repository.msg.RequestedModification6.CreditorAgentAccount, com.tools20022.repository.msg.RequestedModification6.CreditorAccount,
					com.tools20022.repository.msg.PaymentInstruction23.DebtorAccount, com.tools20022.repository.msg.PaymentInstruction22.DebtorAccount, com.tools20022.repository.msg.PaymentInstruction22.DebtorAgentAccount,
					com.tools20022.repository.msg.Mandate9.CreditorAccount, com.tools20022.repository.msg.Mandate9.DebtorAccount, com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAccount,
					com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAgentAccount, com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAgentAccount,
					com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAccount, com.tools20022.repository.msg.OriginalPaymentInformation7.DebtorAccount,
					com.tools20022.repository.msg.OriginalPaymentInformation7.CreditorAccount, com.tools20022.repository.msg.OriginalTransactionReference26.DebtorAccount,
					com.tools20022.repository.msg.OriginalTransactionReference26.CreditorAccount, com.tools20022.repository.msg.Mandate11.CreditorAccount, com.tools20022.repository.msg.Mandate11.DebtorAccount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgentAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAccount,
					com.tools20022.repository.msg.Mandate8.CreditorAccount, com.tools20022.repository.msg.Mandate8.DebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgentAccount,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgentAccount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.DebtorAccount, com.tools20022.repository.msg.PaymentComplementaryInformation6.DebtorAgentAccount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent1Account, com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent2Account,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.IntermediaryAgent3Account, com.tools20022.repository.msg.PaymentComplementaryInformation6.CreditorAgentAccount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.CreditorAccount, com.tools20022.repository.msg.PaymentComplementaryInformation6.PreviousInstructingAgentAccount);
			elementContext_lazy = () -> PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.PaymentPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the payment in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PartyRole
	 * Payment.PartyRole}</li>
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
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Identifies the payment in which a party plays a role.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentPartyRole";
				definition = "Role played by a party in the context of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.PaymentPartyRole, com.tools20022.repository.entity.Payment.PartyRole);
				subType_lazy = () -> Arrays.asList(CreditorRole.mmObject(), InitiatingPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentPartyRole.CashAccount, com.tools20022.repository.entity.PaymentPartyRole.Payment);
				derivationComponent_lazy = () -> Arrays.asList(TransactionParties3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}