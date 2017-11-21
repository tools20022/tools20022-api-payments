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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
 * CashSettlement.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
 * CashSettlement.mmInterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
 * CashSettlement.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmCreditDateTime
 * CashSettlement.mmCreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
 * CashSettlement.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
 * CashSettlement.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmDebitDateTime
 * CashSettlement.mmDebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
 * CashSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
 * CashSettlement.mmRelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
 * CashSettlement.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
 * CashAccount.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
 * TransactionAdministrator.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmSettlementInformation
 * RequestedModification6.mmSettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
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
 * "CashSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties."
 * </li>
 * </ul>
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount interbankSettlementAmount;
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmTotalInterbankSettlementAmount
	 * GroupHeader50.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementAmount
	 * ResolutionInformation1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementAmount
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation15.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmTotalInterbankSettlementAmount
	 * CreditTransferTransaction9.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementAmount
	 * CreditTransferTransaction23.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmTotalInterbankSettlementAmount
	 * GroupHeader70.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementAmount
	 * CreditTransferTransaction25.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader72.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader71.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation21.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction81.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversedInterbankSettlementAmount
	 * PaymentTransaction81.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementAmount
	 * RequestedModification6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction76.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction76.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementAmount
	 * OriginalTransactionReference24.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction75.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction79.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation6.mmInterbankSettlementAmount}</li>
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
	public static final MMBusinessAttribute mmInterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader50.mmTotalInterbankSettlementAmount, ResolutionInformation1.mmInterbankSettlementAmount, CorrectiveInterbankTransaction1.mmInterbankSettlementAmount,
					UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount, DirectDebitTransactionInformation15.mmInterbankSettlementAmount, CreditTransferTransaction9.mmTotalInterbankSettlementAmount,
					CreditTransferTransaction23.mmInterbankSettlementAmount, GroupHeader70.mmTotalInterbankSettlementAmount, CreditTransferTransaction25.mmInterbankSettlementAmount, GroupHeader72.mmTotalReturnedInterbankSettlementAmount,
					GroupHeader71.mmTotalReversedInterbankSettlementAmount, DirectDebitTransactionInformation21.mmInterbankSettlementAmount, PaymentTransaction81.mmOriginalInterbankSettlementAmount,
					PaymentTransaction81.mmReversedInterbankSettlementAmount, RequestedModification6.mmInterbankSettlementAmount, PaymentTransaction76.mmOriginalInterbankSettlementAmount,
					PaymentTransaction76.mmReturnedInterbankSettlementAmount, OriginalTransactionReference24.mmInterbankSettlementAmount, PaymentTransaction75.mmOriginalInterbankSettlementAmount,
					PaymentTransaction79.mmOriginalInterbankSettlementAmount, PaymentComplementaryInformation6.mmInterbankSettlementAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getInterbankSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime interbankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmInterbankSettlementDate
	 * TransactionDates2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmInterbankSettlementDate
	 * GroupHeader50.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementDate
	 * ResolutionInformation1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementDate
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInterbankSettlementDate
	 * CreditTransferTransaction9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementDate
	 * CreditTransferTransaction23.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmInterbankSettlementDate
	 * GroupHeader70.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementDate
	 * CreditTransferTransaction25.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmInterbankSettlementDate
	 * GroupHeader72.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmInterbankSettlementDate
	 * GroupHeader71.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmInterbankSettlementDate
	 * PaymentTransaction81.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementDate
	 * RequestedModification6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmInterbankSettlementDate
	 * PaymentTransaction76.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementDate
	 * OriginalTransactionReference24.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementDate
	 * PaymentTransaction75.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementDate
	 * PaymentTransaction79.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementDate
	 * PaymentComplementaryInformation6.mmInterbankSettlementDate}</li>
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
	public static final MMBusinessAttribute mmInterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDates2.mmInterbankSettlementDate, GroupHeader50.mmInterbankSettlementDate, ResolutionInformation1.mmInterbankSettlementDate,
					CorrectiveInterbankTransaction1.mmInterbankSettlementDate, UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate, DirectDebitTransactionInformation15.mmInterbankSettlementDate,
					CreditTransferTransaction9.mmInterbankSettlementDate, CreditTransferTransaction23.mmInterbankSettlementDate, GroupHeader70.mmInterbankSettlementDate, CreditTransferTransaction25.mmInterbankSettlementDate,
					GroupHeader72.mmInterbankSettlementDate, GroupHeader71.mmInterbankSettlementDate, DirectDebitTransactionInformation21.mmInterbankSettlementDate, PaymentTransaction81.mmInterbankSettlementDate,
					RequestedModification6.mmInterbankSettlementDate, PaymentTransaction76.mmInterbankSettlementDate, OriginalTransactionReference24.mmInterbankSettlementDate, PaymentTransaction75.mmOriginalInterbankSettlementDate,
					PaymentTransaction79.mmOriginalInterbankSettlementDate, PaymentComplementaryInformation6.mmInterbankSettlementDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getInterbankSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText rTGS;
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
	public static final MMBusinessAttribute mmRTGS = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getRTGS", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime creditDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmCreditDateTime
	 * SettlementDateTimeIndication1.mmCreditDateTime}</li>
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
	public static final MMBusinessAttribute mmCreditDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDateTimeIndication1.mmCreditDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getCreditDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstruction relatedPaymentInstruction;
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected SettlementMethodCode settlementMethod;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementMethod
	 * SettlementInstruction4.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementMethod
	 * SettlementInstruction2.mmSettlementMethod}</li>
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
	public static final MMBusinessAttribute mmSettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementInstruction4.mmSettlementMethod, SettlementInstruction2.mmSettlementMethod);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getSettlementMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccount settlementAccount;
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
	 * CashAccount.mmRelatedSettlementInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementAccount
	 * SettlementInstruction4.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementAccount
	 * SettlementInstruction2.mmSettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementInstruction4.mmSettlementAccount, SettlementInstruction2.mmSettlementAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected ISODateTime debitDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmDebitDateTime
	 * SettlementDateTimeIndication1.mmDebitDateTime}</li>
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
	public static final MMBusinessAttribute mmDebitDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDateTimeIndication1.mmDebitDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashSettlement.class.getMethod("getDebitDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
	 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator;
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
	 * TransactionAdministrator.mmSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected BookEntry bookEntry;
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
	 * BookEntry.mmRelatedSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCase;
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
	 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected Reservation reservation;
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
	 * Reservation.mmSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmReservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction, com.tools20022.repository.entity.Reservation.mmSettlementInstruction,
						com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection);
				derivationElement_lazy = () -> Arrays.asList(RequestedModification6.mmSettlementInformation);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.mmRTGS, com.tools20022.repository.entity.CashSettlement.mmCreditDateTime, com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.mmSettlementMethod, com.tools20022.repository.entity.CashSettlement.mmSettlementAccount, com.tools20022.repository.entity.CashSettlement.mmDebitDateTime,
						com.tools20022.repository.entity.CashSettlement.mmPartyRole, com.tools20022.repository.entity.CashSettlement.mmRelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.mmBookEntry,
						com.tools20022.repository.entity.CashSettlement.mmRelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.mmReservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInstruction4.mmObject(), SettlementDateTimeIndication1.mmObject(), SettlementInstruction2.mmObject(), ResolutionInformation1.mmObject(),
						SettlementInstruction3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(CurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	public ISODateTime getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public void setInterbankSettlementDate(ISODateTime interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
	}

	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public void setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = rTGS;
	}

	public ISODateTime getCreditDateTime() {
		return creditDateTime;
	}

	public void setCreditDateTime(ISODateTime creditDateTime) {
		this.creditDateTime = creditDateTime;
	}

	public PaymentInstruction getRelatedPaymentInstruction() {
		return relatedPaymentInstruction;
	}

	public void setRelatedPaymentInstruction(com.tools20022.repository.entity.PaymentInstruction relatedPaymentInstruction) {
		this.relatedPaymentInstruction = relatedPaymentInstruction;
	}

	public SettlementMethodCode getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(SettlementMethodCode settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public CashAccount getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.entity.CashAccount settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public ISODateTime getDebitDateTime() {
		return debitDateTime;
	}

	public void setDebitDateTime(ISODateTime debitDateTime) {
		this.debitDateTime = debitDateTime;
	}

	public List<CashSettlementInstructionPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<TransactionAdministrator> getRelatedTransactionAdministrator() {
		return relatedTransactionAdministrator;
	}

	public void setRelatedTransactionAdministrator(List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator) {
		this.relatedTransactionAdministrator = relatedTransactionAdministrator;
	}

	public BookEntry getBookEntry() {
		return bookEntry;
	}

	public void setBookEntry(com.tools20022.repository.entity.BookEntry bookEntry) {
		this.bookEntry = bookEntry;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(com.tools20022.repository.entity.Reservation reservation) {
		this.reservation = reservation;
	}
}