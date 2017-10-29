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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashSettlement" src="doc-files/CashSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementAmount
 * CashSettlement.InterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementDate
 * CashSettlement.InterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#RTGS
 * CashSettlement.RTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#CreditDateTime
 * CashSettlement.CreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
 * CashSettlement.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementMethod
 * CashSettlement.SettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
 * CashSettlement.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#DebitDateTime
 * CashSettlement.DebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#PartyRole
 * CashSettlement.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedTransactionAdministrator
 * CashSettlement.RelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#BookEntry
 * CashSettlement.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedInvestigationCase
 * CashSettlement.RelatedInvestigationCase}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
 * CashSettlement.Reservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
 * CashAccount.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
 * PaymentInstruction.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#SettlementInstruction
 * TransactionAdministrator.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
 * Reservation.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#RelatedSettlementInstruction
 * BookEntry.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#SettlementInstruction
 * CashSettlementInstructionPartyRole.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#CoverCorrection
 * PaymentInvestigationCaseResolution.CoverCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#SettlementInformation
 * RequestedModification6.SettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction4
 * SettlementInstruction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
 * SettlementDateTimeIndication1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction2
 * SettlementInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResolutionInformation1
 * ResolutionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction3
 * SettlementInstruction3}</li>
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
 * "CashSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties."
 * </li>
 * </ul>
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#TotalInterbankSettlementAmount
	 * GroupHeader50.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#InterbankSettlementAmount
	 * ResolutionInformation1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InterbankSettlementAmount
	 * CorrectiveInterbankTransaction1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction2.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InterbankSettlementAmount
	 * DirectDebitTransactionInformation15.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#TotalInterbankSettlementAmount
	 * CreditTransferTransaction9.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InterbankSettlementAmount
	 * CreditTransferTransaction23.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#TotalInterbankSettlementAmount
	 * GroupHeader70.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InterbankSettlementAmount
	 * CreditTransferTransaction25.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#TotalReturnedInterbankSettlementAmount
	 * GroupHeader72.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#TotalReversedInterbankSettlementAmount
	 * GroupHeader71.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InterbankSettlementAmount
	 * DirectDebitTransactionInformation21.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalInterbankSettlementAmount
	 * PaymentTransaction81.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversedInterbankSettlementAmount
	 * PaymentTransaction81.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InterbankSettlementAmount
	 * RequestedModification6.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalInterbankSettlementAmount
	 * PaymentTransaction76.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnedInterbankSettlementAmount
	 * PaymentTransaction76.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#InterbankSettlementAmount
	 * OriginalTransactionReference24.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInterbankSettlementAmount
	 * PaymentTransaction75.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInterbankSettlementAmount
	 * PaymentTransaction79.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InterbankSettlementAmount
	 * PaymentComplementaryInformation6.InterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader50.TotalInterbankSettlementAmount, com.tools20022.repository.msg.ResolutionInformation1.InterbankSettlementAmount,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InterbankSettlementAmount, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.InterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction9.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction23.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader70.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction25.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader72.TotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader71.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction81.ReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification6.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction76.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction76.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction79.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InterbankSettlementAmount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#InterbankSettlementDate
	 * TransactionDates2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#InterbankSettlementDate
	 * GroupHeader50.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#InterbankSettlementDate
	 * ResolutionInformation1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InterbankSettlementDate
	 * CorrectiveInterbankTransaction1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction2.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InterbankSettlementDate
	 * DirectDebitTransactionInformation15.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InterbankSettlementDate
	 * CreditTransferTransaction9.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InterbankSettlementDate
	 * CreditTransferTransaction23.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#InterbankSettlementDate
	 * GroupHeader70.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InterbankSettlementDate
	 * CreditTransferTransaction25.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#InterbankSettlementDate
	 * GroupHeader72.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#InterbankSettlementDate
	 * GroupHeader71.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InterbankSettlementDate
	 * DirectDebitTransactionInformation21.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#InterbankSettlementDate
	 * PaymentTransaction81.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InterbankSettlementDate
	 * RequestedModification6.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#InterbankSettlementDate
	 * PaymentTransaction76.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#InterbankSettlementDate
	 * OriginalTransactionReference24.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInterbankSettlementDate
	 * PaymentTransaction75.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInterbankSettlementDate
	 * PaymentTransaction79.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InterbankSettlementDate
	 * PaymentComplementaryInformation6.InterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDates2.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader50.InterbankSettlementDate,
					com.tools20022.repository.msg.ResolutionInformation1.InterbankSettlementDate, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InterbankSettlementDate,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation15.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction9.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction23.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader70.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction25.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader72.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader71.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction81.InterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification6.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction76.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction75.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.InterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Qualifies the RTGS status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the RTGS status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RTGS = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the credit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#CreditDateTime
	 * SettlementDateTimeIndication1.CreditDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the credit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.CreditDateTime);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
	 * PaymentInstruction.SettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PaymentInstruction which is the source of the settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#SettlementMethod
	 * SettlementInstruction4.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementMethod
	 * SettlementInstruction2.SettlementMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction2.SettlementMethod);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}
	};
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
	 * CashAccount.RelatedSettlementInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#SettlementAccount
	 * SettlementInstruction4.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementAccount
	 * SettlementInstruction2.SettlementAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.SettlementAccount, com.tools20022.repository.msg.SettlementInstruction2.SettlementAccount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the debit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#DebitDateTime
	 * SettlementDateTimeIndication1.DebitDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the debit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebitDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.DebitDateTime);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#SettlementInstruction
	 * CashSettlementInstructionPartyRole.SettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#SettlementInstruction
	 * TransactionAdministrator.SettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction administrator which manages the related settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			type_lazy = () -> TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#RelatedSettlementInstruction
	 * BookEntry.RelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#CoverCorrection
	 * PaymentInvestigationCaseResolution.CoverCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case resolution which is the source of the correction of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
	 * Reservation.SettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction, com.tools20022.repository.entity.Reservation.SettlementInstruction,
						com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification6.SettlementInformation);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.InterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.InterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.RTGS, com.tools20022.repository.entity.CashSettlement.CreditDateTime, com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.SettlementMethod, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.CashSettlement.DebitDateTime,
						com.tools20022.repository.entity.CashSettlement.PartyRole, com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.BookEntry,
						com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.Reservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInstruction4.mmObject(), SettlementDateTimeIndication1.mmObject(), SettlementInstruction2.mmObject(), ResolutionInformation1.mmObject(),
						SettlementInstruction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}