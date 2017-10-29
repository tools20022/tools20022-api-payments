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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.choice.TransactionPrice3Choice;
import com.tools20022.repository.choice.TransactionQuantities2Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Entry;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#References
 * EntryTransaction8.References}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Amount
 * EntryTransaction8.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CreditDebitIndicator
 * EntryTransaction8.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#AmountDetails
 * EntryTransaction8.AmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Availability
 * EntryTransaction8.Availability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#BankTransactionCode
 * EntryTransaction8.BankTransactionCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Charges
 * EntryTransaction8.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Interest
 * EntryTransaction8.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedParties
 * EntryTransaction8.RelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedAgents
 * EntryTransaction8.RelatedAgents}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Purpose
 * EntryTransaction8.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedRemittanceInformation
 * EntryTransaction8.RelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RemittanceInformation
 * EntryTransaction8.RemittanceInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedDates
 * EntryTransaction8.RelatedDates}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedPrice
 * EntryTransaction8.RelatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedQuantities
 * EntryTransaction8.RelatedQuantities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#FinancialInstrumentIdentification
 * EntryTransaction8.FinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Tax
 * EntryTransaction8.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#ReturnInformation
 * EntryTransaction8.ReturnInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CorporateAction
 * EntryTransaction8.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#SafekeepingAccount
 * EntryTransaction8.SafekeepingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#CashDeposit
 * EntryTransaction8.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CardTransaction
 * EntryTransaction8.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#AdditionalTransactionInformation
 * EntryTransaction8.AdditionalTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#SupplementaryData
 * EntryTransaction8.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
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
 * "EntryTransaction8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the underlying transaction."</li>
 * </ul>
 */
public class EntryTransaction8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the identification of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#Identification
	 * Entry.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd References = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.Identification;
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Provides the identification of the underlying transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionReferences3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of money in the cash transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Amount
	 * CashEntry.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.Amount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction is a credit or a debit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#CreditDebitIndicator
	 * Entry.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is a credit or a debit transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.CreditDebitIndicator;
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the transaction is a credit or a debit transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	/**
	 * Provides detailed information on the original amount.
	 * 
	 * Usage: This component (on transaction level) should be used in case
	 * booking is for a single transaction and the original amount is different
	 * from the entry amount. It can also be used in case individual original
	 * amounts are provided in case of a batch or aggregate booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AmountDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates when the booked amount of money will become available, that is
	 * can be accessed and starts generating interest.
	 * 
	 * Usage: This type of information is used in the US and is linked to
	 * particular instruments such as cheques. Example: When a cheque is
	 * deposited, it will be booked on the deposit day, but the amount of money
	 * will only be accessible as of the indicated availability day (according
	 * to national banking regulations).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAvailability1
	 * CashAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Availability
	 * CashEntry.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Availability = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.Availability;
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			type_lazy = () -> CashAvailability1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to fully identify the type of underlying transaction
	 * resulting in an entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#BankTransactionCode
	 * Entry.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BankTransactionCode = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.BankTransactionCode;
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information on the charges, pre-advised or included in the entry
	 * amount.<br>
	 * <br>
	 * Usage: This component (on transaction level) can be used in case the
	 * booking is for a single transaction, and charges are included in the
	 * entry amount. It can also be used in case individual charge amounts are
	 * applied to individual transactions in case of a batch or aggregate amount
	 * booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges4 Charges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Charges
	 * CashEntry.Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Charges = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.Charges;
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Charges4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details of the interest amount included in the entry amount.
	 * 
	 * Usage: This component (on transaction level) can be used if the booking
	 * is for a single transaction, and interest amount is included in the entry
	 * amount. It can also be used if individual interest amounts are applied to
	 * individual transactions in the case of a batch or aggregate amount
	 * booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest3
	 * TransactionInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
	 * Interest.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount.  It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Interest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.InterestCalculation;
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount.  It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionInterest3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the parties related to the underlying
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionParties3
	 * TransactionParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PartyRole
	 * Payment.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the parties related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PartyRole;
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Set of elements used to identify the parties related to the underlying transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionParties3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the agents related to the underlying
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionAgents3
	 * TransactionAgents3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PartyRole
	 * Payment.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAgts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the agents related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedAgents = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PartyRole;
			isDerived = false;
			xmlTag = "RltdAgts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAgents";
			definition = "Set of elements used to identify the agents related to the underlying transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionAgents3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Underlying reason for the payment transaction. Usage: Purpose is used by
	 * the end-customers, that is initiating party, (ultimate) debtor,
	 * (ultimate) creditor to provide information concerning the nature of the
	 * payment. Purpose is a content element, which is not used for processing
	 * by any of the agents involved in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#Purpose
	 * PaymentObligation.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Purpose = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Purpose;
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Purpose2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information related to the handling of the remittance
	 * information by any of the agents in the transaction processing chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#PlaceOfStorage
	 * Document.PlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfStorage;
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			minOccurs = 0;
			maxOccurs = 10;
			type_lazy = () -> RemittanceLocation4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Structured information that enables the matching, that is reconciliation,
	 * of a payment with the items that the payment is intended to settle, such
	 * as commercial invoices in an account receivable system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11
	 * RemittanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#AssociatedDocument
	 * PaymentObligation.AssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structured information that enables the matching, that is reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RemittanceInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.AssociatedDocument;
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, that is reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RemittanceInformation11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the dates related to the underlying
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDates2
	 * TransactionDates2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
	 * Payment.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the dates related to the underlying transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedDates = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			isDerived = false;
			xmlTag = "RltdDts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDates";
			definition = "Set of elements used to identify the dates related to the underlying transactions.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionDates2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the price information related to the
	 * underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice
	 * TransactionPrice3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
	 * SecuritiesTradeExecution.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the price information related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice;
			isDerived = false;
			xmlTag = "RltdPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPrice";
			definition = "Set of elements used to identify the price information related to the underlying transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionPrice3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the related quantities, such as
	 * securities, in the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#FinancialInstrumentQuantity
	 * SecuritiesEntry.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdQties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuantities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the related quantities, such as securities, in the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedQuantities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity;
			isDerived = false;
			xmlTag = "RltdQties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedQuantities";
			definition = "Set of elements used to identify the related quantities, such as securities, in the underlying transaction.";
			minOccurs = 0;
			type_lazy = () -> TransactionQuantities2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of a security, as assigned under a formal or proprietary
	 * identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#Identification
	 * Security.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.Identification;
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecurityIdentification19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details on the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation3
	 * TaxInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
	 * Payment.TaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Tax = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TaxInformation3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the return information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReturnReason2
	 * PaymentReturnReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
	 * Payment.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the return information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReturnInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentStatus;
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Provides the return information.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentReturnReason2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to identify the underlying corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#CorporateEvent
	 * Security.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the underlying corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CorporateAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.CorporateEvent;
			isDerived = false;
			xmlTag = "CorpActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Set of elements used to identify the underlying corporate action.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateAction9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Safekeeping or investment account. A safekeeping account is an account on
	 * which a securities entry is made. An investment account is an account
	 * between an investor(s) and a fund manager or a fund. The account can
	 * contain holdings in any investment fund or investment fund class managed
	 * (or distributed) by the fund manager, within the same fund family.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
	 * CashEntry.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SafekeepingAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.CashAccount;
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAccount19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the details of a cash deposit for an amount of money in cash
	 * notes and/or coins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashDeposit1
	 * CashDeposit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of a cash deposit for an amount of money in cash notes and/or coins."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CashDeposit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
			isDerived = false;
			xmlTag = "CshDpst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			definition = "Provides the details of a cash deposit for an amount of money in cash notes and/or coins.";
			minOccurs = 0;
			type_lazy = () -> CashDeposit1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the data related to the card (number, scheme), terminal (number,
	 * identification) and transactional data used to uniquely identify a card
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2
	 * CardTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the data related to the card (number, scheme), terminal (number, identification) and transactional data used to uniquely identify a card transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CardTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides the data related to the card (number, scheme), terminal (number, identification) and transactional data used to uniquely identify a card transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CardTransaction2.mmObject();
		}
	};
	/**
	 * Further details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalTransactionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Further details of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EntryTransaction8.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction8.References, com.tools20022.repository.msg.EntryTransaction8.Amount,
						com.tools20022.repository.msg.EntryTransaction8.CreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction8.AmountDetails, com.tools20022.repository.msg.EntryTransaction8.Availability,
						com.tools20022.repository.msg.EntryTransaction8.BankTransactionCode, com.tools20022.repository.msg.EntryTransaction8.Charges, com.tools20022.repository.msg.EntryTransaction8.Interest,
						com.tools20022.repository.msg.EntryTransaction8.RelatedParties, com.tools20022.repository.msg.EntryTransaction8.RelatedAgents, com.tools20022.repository.msg.EntryTransaction8.Purpose,
						com.tools20022.repository.msg.EntryTransaction8.RelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction8.RemittanceInformation, com.tools20022.repository.msg.EntryTransaction8.RelatedDates,
						com.tools20022.repository.msg.EntryTransaction8.RelatedPrice, com.tools20022.repository.msg.EntryTransaction8.RelatedQuantities, com.tools20022.repository.msg.EntryTransaction8.FinancialInstrumentIdentification,
						com.tools20022.repository.msg.EntryTransaction8.Tax, com.tools20022.repository.msg.EntryTransaction8.ReturnInformation, com.tools20022.repository.msg.EntryTransaction8.CorporateAction,
						com.tools20022.repository.msg.EntryTransaction8.SafekeepingAccount, com.tools20022.repository.msg.EntryTransaction8.CashDeposit, com.tools20022.repository.msg.EntryTransaction8.CardTransaction,
						com.tools20022.repository.msg.EntryTransaction8.AdditionalTransactionInformation, com.tools20022.repository.msg.EntryTransaction8.SupplementaryData);
				trace_lazy = () -> Entry.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EntryTransaction8";
				definition = "Identifies the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}