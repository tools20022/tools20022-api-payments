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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.EntryCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
 * Entry.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
 * Entry.mmEntryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmIdentification
 * Entry.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
 * Entry.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
 * Entry.mmAccountServicerTransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmReversalIndicator
 * Entry.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmValueDate
 * Entry.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
 * Entry.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmCommissionWaiverIndicator
 * Entry.mmCommissionWaiverIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmRole Entry.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmAccount
 * Entry.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBalance
 * Entry.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmEntryType
 * Entry.mmEntryType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmEntry Role.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmEntry
 * Account.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
 * Balance.mmBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedEntry
 * BankTransaction.mmRelatedEntry}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction9
 * EntryTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2
 * UnderlyingStatementEntry2}</li>
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
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection35#mmCreditDebitIndicator
	 * AmountAndDirection35.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmCreditDebitIndicator
	 * EntryTransaction9.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionType2#mmCreditDebitIndicator
	 * TransactionType2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmCreditDebitIndicator
	 * ReportEntry9.mmCreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute<Entry, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Entry, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection35.mmCreditDebitIndicator, EntryTransaction9.mmCreditDebitIndicator, TransactionType2.mmCreditDebitIndicator, ReportEntry9.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Entry obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Entry obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected ISODateTime entryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmPostingDate
	 * BalanceAdjustment1.mmPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmBookingDate
	 * ReportEntry9.mmBookingDate}</li>
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
	public static final MMBusinessAttribute<Entry, ISODateTime> mmEntryDate = new MMBusinessAttribute<Entry, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAdjustment1.mmPostingDate, ReportEntry9.mmBookingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Entry obj) {
			return obj.getEntryDate();
		}

		@Override
		public void setValue(Entry obj, ISODateTime value) {
			obj.setEntryDate(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmAccountServicerReference
	 * CertificateIdentification1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmReferences
	 * EntryTransaction9.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmEntryReference
	 * ReportEntry9.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2#mmOriginalEntryIdentification
	 * UnderlyingStatementEntry2.mmOriginalEntryIdentification}</li>
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
	public static final MMBusinessAttribute<Entry, Max35Text> mmIdentification = new MMBusinessAttribute<Entry, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CertificateIdentification1.mmAccountServicerReference, EntryTransaction9.mmReferences, ReportEntry9.mmEntryReference, UnderlyingStatementEntry2.mmOriginalEntryIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Entry obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Entry obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Max35Text accountOwnerTransactionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountOwnerTransactionIdentification
	 * TransactionReferences3.mmAccountOwnerTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<Entry, Max35Text> mmAccountOwnerTransactionIdentification = new MMBusinessAttribute<Entry, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmAccountOwnerTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Entry obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(Entry obj, Max35Text value) {
			obj.setAccountOwnerTransactionIdentification(value);
		}
	};
	protected Max35Text accountServicerTransactionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountServicerReference
	 * TransactionReferences3.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountServicerTransactionIdentification
	 * TransactionReferences3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmAccountServicerReference
	 * PaymentTransaction83.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmAccountServicerReference
	 * PaymentTransaction91.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmAccountServicerReference
	 * ReportEntry9.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmAccountServicerReference
	 * PaymentTransaction92.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry3#mmAccountServicerReference
	 * StatementResolutionEntry3.mmAccountServicerReference}</li>
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
	public static final MMBusinessAttribute<Entry, Max35Text> mmAccountServicerTransactionIdentification = new MMBusinessAttribute<Entry, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmAccountServicerReference, TransactionReferences3.mmAccountServicerTransactionIdentification, PaymentTransaction83.mmAccountServicerReference,
					PaymentTransaction91.mmAccountServicerReference, ReportEntry9.mmAccountServicerReference, PaymentTransaction92.mmAccountServicerReference, StatementResolutionEntry3.mmAccountServicerReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Entry obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(Entry obj, Max35Text value) {
			obj.setAccountServicerTransactionIdentification(value);
		}
	};
	protected TrueFalseIndicator reversalIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmReversalIndicator
	 * ReportEntry9.mmReversalIndicator}</li>
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
	public static final MMBusinessAttribute<Entry, TrueFalseIndicator> mmReversalIndicator = new MMBusinessAttribute<Entry, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(ReportEntry9.mmReversalIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(Entry obj) {
			return obj.getReversalIndicator();
		}

		@Override
		public void setValue(Entry obj, TrueFalseIndicator value) {
			obj.setReversalIndicator(value);
		}
	};
	protected ISODateTime valueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDelayedDebitDate
	 * CashAccountCharacteristics2.mmDelayedDebitDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmValueDate
	 * ReportEntry9.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::VALU</li>
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
	public static final MMBusinessAttribute<Entry, ISODateTime> mmValueDate = new MMBusinessAttribute<Entry, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccountCharacteristics2.mmDelayedDebitDate, ReportEntry9.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::VALU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Entry obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Entry obj, ISODateTime value) {
			obj.setValueDate(value);
		}
	};
	protected BankTransaction bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedEntry
	 * BankTransaction.mmRelatedEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmBankTransactionCode
	 * BillingServiceIdentification3.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmBankTransactionCode
	 * EntryTransaction9.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmBankTransactionCode
	 * ReportEntry9.mmBankTransactionCode}</li>
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
	public static final MMBusinessAssociationEnd<Entry, Optional<BankTransaction>> mmBankTransactionCode = new MMBusinessAssociationEnd<Entry, Optional<BankTransaction>>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingServiceIdentification3.mmBankTransactionCode, EntryTransaction9.mmBankTransactionCode, ReportEntry9.mmBankTransactionCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankTransactionCode";
			definition = "Type of underlying transaction resulting in the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BankTransaction.mmRelatedEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}

		@Override
		public Optional<BankTransaction> getValue(Entry obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(Entry obj, Optional<BankTransaction> value) {
			obj.setBankTransactionCode(value.orElse(null));
		}
	};
	protected YesNoIndicator commissionWaiverIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmCommissionWaiverIndicator
	 * ReportEntry9.mmCommissionWaiverIndicator}</li>
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
	public static final MMBusinessAttribute<Entry, YesNoIndicator> mmCommissionWaiverIndicator = new MMBusinessAttribute<Entry, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(ReportEntry9.mmCommissionWaiverIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Entry obj) {
			return obj.getCommissionWaiverIndicator();
		}

		@Override
		public void setValue(Entry obj, YesNoIndicator value) {
			obj.setCommissionWaiverIndicator(value);
		}
	};
	protected List<Role> role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#mmEntry
	 * Role.mmEntry}</li>
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
	public static final MMBusinessAssociationEnd<Entry, List<Role>> mmRole = new MMBusinessAssociationEnd<Entry, List<Role>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Specifies the role played by a party or a system in the context of an entry in an account.";
			minOccurs = 0;
			opposite_lazy = () -> Role.mmEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Role.mmObject();
		}

		@Override
		public List<Role> getValue(Entry obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(Entry obj, List<Role> value) {
			obj.setRole(value);
		}
	};
	protected List<Account> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmEntry
	 * Account.mmEntry}</li>
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
	public static final MMBusinessAssociationEnd<Entry, List<Account>> mmAccount = new MMBusinessAssociationEnd<Entry, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Posting of an item to an account, that results in an increase or a decrease to the balance of the account.";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(Entry obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Entry obj, List<Account> value) {
			obj.setAccount(value);
		}
	};
	protected List<Balance> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
	 * Balance.mmBalanceEntry}</li>
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
	public static final MMBusinessAssociationEnd<Entry, List<Balance>> mmBalance = new MMBusinessAssociationEnd<Entry, List<Balance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Amount that is the result of the sum of the entries from or to an account.";
			minOccurs = 0;
			opposite_lazy = () -> Balance.mmBalanceEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}

		@Override
		public List<Balance> getValue(Entry obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(Entry obj, List<Balance> value) {
			obj.setBalance(value);
		}
	};
	protected EntryCode entryType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Entry, EntryCode> mmEntryType = new MMBusinessAttribute<Entry, EntryCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntryType";
			definition = "Specifies the type of an entry in a report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryCode.mmObject();
		}

		@Override
		public EntryCode getValue(Entry obj) {
			return obj.getEntryType();
		}

		@Override
		public void setValue(Entry obj, EntryCode value) {
			obj.setEntryType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Entry";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
				associationDomain_lazy = () -> Arrays.asList(Role.mmEntry, Account.mmEntry, Balance.mmBalanceEntry, BankTransaction.mmRelatedEntry);
				subType_lazy = () -> Arrays.asList(CashEntry.mmObject(), SecuritiesEntry.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entry.mmCreditDebitIndicator, com.tools20022.repository.entity.Entry.mmEntryDate, com.tools20022.repository.entity.Entry.mmIdentification,
						com.tools20022.repository.entity.Entry.mmAccountOwnerTransactionIdentification, com.tools20022.repository.entity.Entry.mmAccountServicerTransactionIdentification,
						com.tools20022.repository.entity.Entry.mmReversalIndicator, com.tools20022.repository.entity.Entry.mmValueDate, com.tools20022.repository.entity.Entry.mmBankTransactionCode,
						com.tools20022.repository.entity.Entry.mmCommissionWaiverIndicator, com.tools20022.repository.entity.Entry.mmRole, com.tools20022.repository.entity.Entry.mmAccount, com.tools20022.repository.entity.Entry.mmBalance,
						com.tools20022.repository.entity.Entry.mmEntryType);
				derivationComponent_lazy = () -> Arrays.asList(EntryTransaction9.mmObject(), UnderlyingStatementEntry2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Entry.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Entry setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public ISODateTime getEntryDate() {
		return entryDate;
	}

	public Entry setEntryDate(ISODateTime entryDate) {
		this.entryDate = Objects.requireNonNull(entryDate);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Entry setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public Entry setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = Objects.requireNonNull(accountOwnerTransactionIdentification);
		return this;
	}

	public Max35Text getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification;
	}

	public Entry setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = Objects.requireNonNull(accountServicerTransactionIdentification);
		return this;
	}

	public TrueFalseIndicator getReversalIndicator() {
		return reversalIndicator;
	}

	public Entry setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = Objects.requireNonNull(reversalIndicator);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public Entry setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public Optional<BankTransaction> getBankTransactionCode() {
		return bankTransactionCode == null ? Optional.empty() : Optional.of(bankTransactionCode);
	}

	public Entry setBankTransactionCode(BankTransaction bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public YesNoIndicator getCommissionWaiverIndicator() {
		return commissionWaiverIndicator;
	}

	public Entry setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = Objects.requireNonNull(commissionWaiverIndicator);
		return this;
	}

	public List<Role> getRole() {
		return role == null ? role = new ArrayList<>() : role;
	}

	public Entry setRole(List<Role> role) {
		this.role = Objects.requireNonNull(role);
		return this;
	}

	public List<Account> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public Entry setAccount(List<Account> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<Balance> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public Entry setBalance(List<Balance> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public EntryCode getEntryType() {
		return entryType;
	}

	public Entry setEntryType(EntryCode entryType) {
		this.entryType = Objects.requireNonNull(entryType);
		return this;
	}
}