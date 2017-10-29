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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.EntryCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.EntryTransaction8;
import com.tools20022.repository.msg.UnderlyingStatementEntry1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting to an account that results in an increase or decrease to a balance.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Entry" src="doc-files/Entry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#CreditDebitIndicator
 * Entry.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#EntryDate
 * Entry.EntryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Identification
 * Entry.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#AccountOwnerTransactionIdentification
 * Entry.AccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#AccountServicerTransactionIdentification
 * Entry.AccountServicerTransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#ReversalIndicator
 * Entry.ReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#ValueDate
 * Entry.ValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#BankTransactionCode
 * Entry.BankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#CommissionWaiverIndicator
 * Entry.CommissionWaiverIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Role Entry.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Account Entry.Account}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Balance Entry.Balance}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#EntryType
 * Entry.EntryType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Entry Role.Entry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Entry Account.Entry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
 * Balance.BalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedEntry
 * BankTransaction.RelatedEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesEntry
 * SecuritiesEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1
 * UnderlyingStatementEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8
 * EntryTransaction8}</li>
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
 * "Entry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting to an account that results in an increase or decrease to a balance."
 * </li>
 * </ul>
 */
public class Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an entry is a credit or a debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection35#CreditDebitIndicator
	 * AmountAndDirection35.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionType1#CreditDebitIndicator
	 * TransactionType1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#CreditDebitIndicator
	 * ReportEntry8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CreditDebitIndicator
	 * EntryTransaction8.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entry is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection35.CreditDebitIndicator, com.tools20022.repository.msg.TransactionType1.CreditDebitIndicator,
					com.tools20022.repository.msg.ReportEntry8.CreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction8.CreditDebitIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which an entry is posted to an account on the account
	 * servicer's books.
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#PostingDate
	 * BalanceAdjustment1.PostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#BookingDate
	 * ReportEntry8.BookingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.PostingDate, com.tools20022.repository.msg.ReportEntry8.BookingDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for an entry, as assigned by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1#OriginalEntryIdentification
	 * UnderlyingStatementEntry1.OriginalEntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#AccountServicerReference
	 * CertificateIdentification1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#EntryReference
	 * ReportEntry8.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#References
	 * EntryTransaction8.References}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an entry, as assigned by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingStatementEntry1.OriginalEntryIdentification, com.tools20022.repository.msg.CertificateIdentification1.AccountServicerReference,
					com.tools20022.repository.msg.ReportEntry8.EntryReference, com.tools20022.repository.msg.EntryTransaction8.References);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * owner (or the instructing party managing the account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountOwnerTransactionIdentification
	 * TransactionReferences3.AccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountOwnerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences3.AccountOwnerTransactionIdentification);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountServicerReference
	 * TransactionReferences3.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountServicerTransactionIdentification
	 * TransactionReferences3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#AccountServicerReference
	 * StatementResolutionEntry2.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#AccountServicerReference
	 * ReportEntry8.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#AccountServicerReference
	 * PaymentTransaction80.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#AccountServicerReference
	 * PaymentTransaction83.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#AccountServicerReference
	 * PaymentTransaction82.AccountServicerReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountServicerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences3.AccountServicerReference, com.tools20022.repository.msg.TransactionReferences3.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.StatementResolutionEntry2.AccountServicerReference, com.tools20022.repository.msg.ReportEntry8.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction80.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction83.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction82.AccountServicerReference);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates whether or not the entry is the result of a reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#ReversalIndicator
	 * ReportEntry8.ReversalIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the entry is the result of a reversal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReversalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry8.ReversalIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Date and time assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DelayedDebitDate
	 * CashAccountCharacteristics2.DelayedDebitDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#ValueDate
	 * ReportEntry8.ValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.DelayedDebitDate, com.tools20022.repository.msg.ReportEntry8.ValueDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Type of underlying transaction resulting in the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedEntry
	 * BankTransaction.RelatedEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#BankTransactionCode
	 * ReportEntry8.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#BankTransactionCode
	 * BillingServiceIdentification3.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#BankTransactionCode
	 * EntryTransaction8.BankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of underlying transaction resulting in the entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankTransactionCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry8.BankTransactionCode, com.tools20022.repository.msg.BillingServiceIdentification3.BankTransactionCode,
					com.tools20022.repository.msg.EntryTransaction8.BankTransactionCode);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransactionCode";
			definition = "Type of underlying transaction resulting in the entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transaction is exempt from commission or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#CommissionWaiverIndicator
	 * ReportEntry8.CommissionWaiverIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is exempt from commission or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CommissionWaiverIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry8.CommissionWaiverIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party or a system in the context of an
	 * entry in an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#Entry
	 * Role.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party or a system in the context of an entry in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Specifies the role played by a party or a system in the context of an entry in an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Role.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Posting of an item to an account, that results in an increase or a
	 * decrease to the balance of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Entry
	 * Account.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting of an item to an account, that results in an increase or a decrease to the balance of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Posting of an item to an account, that results in an increase or a decrease to the balance of the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount that is the result of the sum of the entries from or to an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
	 * Balance.BalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that is the result of the sum of the entries from or to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Amount that is the result of the sum of the entries from or to an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.BalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of an entry in a report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.EntryCode
	 * EntryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of an entry in a report."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntryType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryType";
			definition = "Specifies the type of an entry in a report.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EntryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Entry";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Entry, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Balance.BalanceEntry,
						com.tools20022.repository.entity.BankTransaction.RelatedEntry);
				subType_lazy = () -> Arrays.asList(CashEntry.mmObject(), SecuritiesEntry.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entry.CreditDebitIndicator, com.tools20022.repository.entity.Entry.EntryDate, com.tools20022.repository.entity.Entry.Identification,
						com.tools20022.repository.entity.Entry.AccountOwnerTransactionIdentification, com.tools20022.repository.entity.Entry.AccountServicerTransactionIdentification,
						com.tools20022.repository.entity.Entry.ReversalIndicator, com.tools20022.repository.entity.Entry.ValueDate, com.tools20022.repository.entity.Entry.BankTransactionCode,
						com.tools20022.repository.entity.Entry.CommissionWaiverIndicator, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.Entry.Account, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.Entry.EntryType);
				derivationComponent_lazy = () -> Arrays.asList(UnderlyingStatementEntry1.mmObject(), EntryTransaction8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}