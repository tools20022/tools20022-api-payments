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
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
 * PaymentPartyRole.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties3
 * TransactionParties3}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InitiatingPartyRole
 * InitiatingPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Unambiguous identification of the account used in the context of the
	 * party role such as debtor account, instructing agent account...
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmDebtorAccount
	 * TransactionParties3.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties3#mmCreditorAccount
	 * TransactionParties3.mmCreditorAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmPreviousInstructingAgentAccount
	 * CreditTransferTransaction23.mmPreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent1Account
	 * CreditTransferTransaction23.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent2Account
	 * CreditTransferTransaction23.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent3Account
	 * CreditTransferTransaction23.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmDebtorAccount
	 * CreditTransferTransaction23.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmDebtorAgentAccount
	 * CreditTransferTransaction23.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmCreditorAgentAccount
	 * CreditTransferTransaction23.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmCreditorAccount
	 * CreditTransferTransaction23.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPreviousInstructingAgentAccount
	 * CreditTransferTransaction25.mmPreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent1Account
	 * CreditTransferTransaction25.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent2Account
	 * CreditTransferTransaction25.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent3Account
	 * CreditTransferTransaction25.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmDebtorAccount
	 * CreditTransferTransaction25.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmDebtorAgentAccount
	 * CreditTransferTransaction25.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmCreditorAgentAccount
	 * CreditTransferTransaction25.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmCreditorAccount
	 * CreditTransferTransaction25.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmDebtorAccount
	 * CreditTransferTransaction24.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmDebtorAgentAccount
	 * CreditTransferTransaction24.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmPreviousInstructingAgentAccount
	 * CreditTransferTransaction24.mmPreviousInstructingAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent1Account
	 * CreditTransferTransaction24.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent2Account
	 * CreditTransferTransaction24.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent3Account
	 * CreditTransferTransaction24.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmCreditorAgentAccount
	 * CreditTransferTransaction24.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmCreditorAccount
	 * CreditTransferTransaction24.mmCreditorAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmDebtorAccount
	 * RequestedModification6.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmDebtorAgentAccount
	 * RequestedModification6.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmCreditorAgentAccount
	 * RequestedModification6.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmCreditorAccount
	 * RequestedModification6.mmCreditorAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmDebtorAccount
	 * OriginalTransactionReference24.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmDebtorAgentAccount
	 * OriginalTransactionReference24.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmCreditorAgentAccount
	 * OriginalTransactionReference24.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmCreditorAccount
	 * OriginalTransactionReference24.mmCreditorAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmDebtorAccount
	 * PaymentComplementaryInformation6.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmDebtorAgentAccount
	 * PaymentComplementaryInformation6.mmDebtorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent1Account
	 * PaymentComplementaryInformation6.mmIntermediaryAgent1Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent2Account
	 * PaymentComplementaryInformation6.mmIntermediaryAgent2Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent3Account
	 * PaymentComplementaryInformation6.mmIntermediaryAgent3Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmCreditorAgentAccount
	 * PaymentComplementaryInformation6.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmCreditorAccount
	 * PaymentComplementaryInformation6.mmCreditorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPreviousInstructingAgentAccount
	 * PaymentComplementaryInformation6.mmPreviousInstructingAgentAccount}</li>
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
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport15.mmBalanceTransferAccount, TransactionParties3.mmDebtorAccount, TransactionParties3.mmCreditorAccount, DirectDebitTransactionInformation15.mmDebtorAccount,
					DirectDebitTransactionInformation15.mmDebtorAgentAccount, CreditTransferTransaction9.mmIntermediaryAgent1Account, CreditTransferTransaction9.mmIntermediaryAgent2Account,
					CreditTransferTransaction9.mmIntermediaryAgent3Account, CreditTransferTransaction9.mmCreditorAgentAccount, CreditTransferTransaction9.mmCreditorAccount, CreditTransferTransaction23.mmPreviousInstructingAgentAccount,
					CreditTransferTransaction23.mmIntermediaryAgent1Account, CreditTransferTransaction23.mmIntermediaryAgent2Account, CreditTransferTransaction23.mmIntermediaryAgent3Account, CreditTransferTransaction23.mmDebtorAccount,
					CreditTransferTransaction23.mmDebtorAgentAccount, CreditTransferTransaction23.mmCreditorAgentAccount, CreditTransferTransaction23.mmCreditorAccount, CreditTransferTransaction25.mmPreviousInstructingAgentAccount,
					CreditTransferTransaction25.mmIntermediaryAgent1Account, CreditTransferTransaction25.mmIntermediaryAgent2Account, CreditTransferTransaction25.mmIntermediaryAgent3Account, CreditTransferTransaction25.mmDebtorAccount,
					CreditTransferTransaction25.mmDebtorAgentAccount, CreditTransferTransaction25.mmCreditorAgentAccount, CreditTransferTransaction25.mmCreditorAccount, CreditTransferTransaction24.mmDebtorAccount,
					CreditTransferTransaction24.mmDebtorAgentAccount, CreditTransferTransaction24.mmPreviousInstructingAgentAccount, CreditTransferTransaction24.mmIntermediaryAgent1Account,
					CreditTransferTransaction24.mmIntermediaryAgent2Account, CreditTransferTransaction24.mmIntermediaryAgent3Account, CreditTransferTransaction24.mmCreditorAgentAccount, CreditTransferTransaction24.mmCreditorAccount,
					CreditTransferTransaction26.mmIntermediaryAgent1Account, CreditTransferTransaction26.mmIntermediaryAgent2Account, CreditTransferTransaction26.mmIntermediaryAgent3Account,
					CreditTransferTransaction26.mmCreditorAgentAccount, CreditTransferTransaction26.mmCreditorAccount, CreditTransferTransaction22.mmCreditorAccount, PaymentInstruction21.mmCreditorAccount,
					PaymentInstruction21.mmCreditorAgentAccount, DirectDebitTransactionInformation21.mmCreditorAccount, DirectDebitTransactionInformation21.mmCreditorAgentAccount,
					DirectDebitTransactionInformation21.mmIntermediaryAgent1Account, DirectDebitTransactionInformation21.mmIntermediaryAgent2Account, DirectDebitTransactionInformation21.mmIntermediaryAgent3Account,
					DirectDebitTransactionInformation21.mmDebtorAccount, DirectDebitTransactionInformation21.mmDebtorAgentAccount, Mandate10.mmCreditorAccount, Mandate10.mmDebtorAccount, RequestedModification6.mmDebtorAccount,
					RequestedModification6.mmDebtorAgentAccount, RequestedModification6.mmCreditorAgentAccount, RequestedModification6.mmCreditorAccount, PaymentInstruction23.mmDebtorAccount, PaymentInstruction22.mmDebtorAccount,
					PaymentInstruction22.mmDebtorAgentAccount, Mandate9.mmCreditorAccount, Mandate9.mmDebtorAccount, OriginalTransactionReference24.mmDebtorAccount, OriginalTransactionReference24.mmDebtorAgentAccount,
					OriginalTransactionReference24.mmCreditorAgentAccount, OriginalTransactionReference24.mmCreditorAccount, OriginalPaymentInformation7.mmDebtorAccount, OriginalPaymentInformation7.mmCreditorAccount,
					OriginalTransactionReference26.mmDebtorAccount, OriginalTransactionReference26.mmCreditorAccount, Mandate11.mmCreditorAccount, Mandate11.mmDebtorAccount, DirectDebitTransactionInformation22.mmDebtorAgentAccount,
					DirectDebitTransactionInformation22.mmDebtorAccount, Mandate8.mmCreditorAccount, Mandate8.mmDebtorAccount, AmendmentInformationDetails11.mmOriginalCreditorAgentAccount,
					AmendmentInformationDetails11.mmOriginalDebtorAccount, AmendmentInformationDetails11.mmOriginalDebtorAgentAccount, PaymentComplementaryInformation6.mmDebtorAccount, PaymentComplementaryInformation6.mmDebtorAgentAccount,
					PaymentComplementaryInformation6.mmIntermediaryAgent1Account, PaymentComplementaryInformation6.mmIntermediaryAgent2Account, PaymentComplementaryInformation6.mmIntermediaryAgent3Account,
					PaymentComplementaryInformation6.mmCreditorAgentAccount, PaymentComplementaryInformation6.mmCreditorAccount, PaymentComplementaryInformation6.mmPreviousInstructingAgentAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Identifies the payment in which a party plays a role.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Identifies the payment in which a party plays a role.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPartyRole";
				definition = "Role played by a party in the context of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole, com.tools20022.repository.entity.Payment.mmPartyRole);
				subType_lazy = () -> Arrays.asList(CreditorRole.mmObject(), InitiatingPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount, com.tools20022.repository.entity.PaymentPartyRole.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(TransactionParties3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}
}