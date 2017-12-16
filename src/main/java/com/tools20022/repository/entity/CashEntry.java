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
import com.tools20022.repository.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashEntry" src="doc-files/CashEntry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
 * CashEntry.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
 * CashEntry.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
 * CashEntry.mmRelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
 * CashEntry.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
 * CashEntry.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
 * CashEntry.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
 * CashEntry.mmAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
 * CashEntry.mmDebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
 * CashEntry.mmCreditRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvoiceFinancingTransaction
 * CashEntry.mmRelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCase
 * CashEntry.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCaseResolution
 * CashEntry.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmChargesIncluded
 * CashEntry.mmChargesIncluded}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
 * CashAccount.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
 * CashBalance.mmCashBalanceEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
 * Charges.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
 * BookEntry.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
 * BookEntry.mmDebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
 * BookEntry.mmCreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashEntry
 * CashAvailability.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingCashEntry
 * PaymentInvestigationCase.mmUnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmEntryCorrection
 * PaymentInvestigationCaseResolution.mmEntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmResultingCashEntry
 * InvoiceFinancingAgreement.mmResultingCashEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmProprietaryAmount
 * AmountAndCurrencyExchange3.mmProprietaryAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35#mmAmount
 * AmountAndDirection35.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmEntryDetails
 * ReportEntry8.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmountDetails
 * EntryTransaction8.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails7#mmTransactionDetails
 * EntryDetails7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmStatementEntry
 * UnderlyingTransaction3Choice.mmStatementEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
 * AmountAndCurrencyExchangeDetails3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4
 * AmountAndCurrencyExchangeDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
 * AmountAndCurrencyExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35
 * AmountAndDirection35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionType1
 * TransactionType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementResolutionEntry2
 * StatementResolutionEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection34
 * AmountAndDirection34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8 ReportEntry8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails7 EntryDetails7}</li>
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
 * "CashEntry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
 * </li>
 * </ul>
 */
public class CashEntry extends Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Cash account on which the amount of the entry is debited or credited. It
	 * is derived from the association between Entry and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
	 * CashAccount.mmCashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmAccount
	 * OriginalNotificationReference8.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmAccount
	 * OriginalItemReference4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmAccount
	 * OriginalNotificationReference7.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmSafekeepingAccount
	 * EntryTransaction8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmAccount
	 * NotificationItem6.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalNotificationReference8.mmAccount, OriginalItemReference4.mmAccount, OriginalNotificationReference7.mmAccount, EntryTransaction8.mmSafekeepingAccount, NotificationItem6.mmAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money in the cash entry.
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#mmAmount
	 * AmountAndCurrencyExchangeDetails3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#mmAmount
	 * AmountAndCurrencyExchangeDetails4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmCorrectedAmount
	 * StatementResolutionEntry2.mmCorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection34#mmAmount
	 * AmountAndDirection34.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmAmount
	 * ReportEntry8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmAmountDetails
	 * ReportEntry8.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmount
	 * EntryTransaction8.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchangeDetails3.mmAmount, AmountAndCurrencyExchangeDetails4.mmAmount, StatementResolutionEntry2.mmCorrectedAmount, AmountAndDirection34.mmAmount, ReportEntry8.mmAmount,
					ReportEntry8.mmAmountDetails, EntryTransaction8.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashEntry.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BookEntry relatedBookEntry;
	/**
	 * Account entry for which one or more cash entries are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry for which one or more cash entries are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBookEntry";
			definition = "Account entry for which one or more cash entries are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashBalance> cashBalance;
	/**
	 * Cash amount that is the result of the sum of the cash entries from or to
	 * a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount that is the result of the sum of the cash entries from or to a cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash amount that is the result of the sum of the cash entries from or to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmCashBalanceEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected CurrencyExchange currencyExchange;
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
	 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails3.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails4.mmCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry details related to currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchangeDetails3.mmCurrencyExchange, AmountAndCurrencyExchangeDetails4.mmCurrencyExchange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Entry details related to currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * Provides information on the charges included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
	 * Charges.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmCharges
	 * StatementResolutionEntry2.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmCharges
	 * ReportEntry8.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCharges
	 * EntryTransaction8.mmCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges included in the entry amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatementResolutionEntry2.mmCharges, ReportEntry8.mmCharges, EntryTransaction8.mmCharges);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected CashAvailability availability;
	/**
	 * Availability information on the entry.<br>
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashEntry
	 * CashAvailability.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAvailability
	 * EntryTransaction8.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAvailability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction8.mmAvailability);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAvailability.mmObject();
		}
	};
	protected Interest interest;
	/**
	 * Interest amount included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
	 * Interest.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest amount included in the entry amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected BookEntry debitRelatedBookEntry;
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
	 * BookEntry.mmDebitEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitRelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book entry which is the source of the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDebitRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmDebitEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected BookEntry creditRelatedBookEntry;
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
	 * BookEntry.mmCreditEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book entry which is the source of the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmCreditEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected InvoiceFinancingAgreement relatedInvoiceFinancingTransaction;
	/**
	 * Specifies the invoice financing transaction which originates the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmResultingCashEntry
	 * InvoiceFinancingAgreement.mmResultingCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoiceFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the invoice financing transaction which originates the entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingTransaction";
			definition = "Specifies the invoice financing transaction which originates the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmResultingCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Case which is investigating a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingCashEntry
	 * PaymentInvestigationCase.mmUnderlyingCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case which is investigating a cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case which is investigating a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Payment investigation case resolution which created a correction
	 * resulting in a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmEntryCorrection
	 * PaymentInvestigationCaseResolution.mmEntryCorrection}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which created a correction resulting in a cash entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which created a correction resulting in a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmEntryCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected ChargeIncludedIndicator chargesIncluded;
	/**
	 * Indicates whether charges have already been included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ChargeIncludedIndicator
	 * ChargeIncludedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesIncluded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges have already been included in the entry amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargesIncluded = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesIncluded";
			definition = "Indicates whether charges have already been included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeIncludedIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashEntry.class.getMethod("getChargesIncluded", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashEntry";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashEntry, com.tools20022.repository.entity.CashBalance.mmCashBalanceEntry, com.tools20022.repository.entity.Charges.mmCashEntry,
						com.tools20022.repository.entity.BookEntry.mmCashEntry, com.tools20022.repository.entity.BookEntry.mmDebitEntry, com.tools20022.repository.entity.BookEntry.mmCreditEntry,
						com.tools20022.repository.entity.Interest.mmCashEntry, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry, com.tools20022.repository.entity.CashAvailability.mmCashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingCashEntry, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmEntryCorrection,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmResultingCashEntry);
				derivationElement_lazy = () -> Arrays.asList(AmountAndCurrencyExchange3.mmProprietaryAmount, AmountAndDirection35.mmAmount, ReportEntry8.mmEntryDetails, EntryTransaction8.mmAmountDetails, EntryDetails7.mmTransactionDetails,
						UnderlyingTransaction3Choice.mmStatementEntry);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmCashAccount, com.tools20022.repository.entity.CashEntry.mmAmount, com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCashBalance, com.tools20022.repository.entity.CashEntry.mmCurrencyExchange, com.tools20022.repository.entity.CashEntry.mmCharges,
						com.tools20022.repository.entity.CashEntry.mmAvailability, com.tools20022.repository.entity.CashEntry.mmInterest, com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry, com.tools20022.repository.entity.CashEntry.mmRelatedInvoiceFinancingTransaction,
						com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCase, com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.mmChargesIncluded);
				derivationComponent_lazy = () -> Arrays.asList(AmountAndCurrencyExchangeDetails3.mmObject(), AmountAndCurrencyExchangeDetails4.mmObject(), AmountAndCurrencyExchange3.mmObject(), AmountAndDirection35.mmObject(),
						TransactionType1.mmObject(), StatementResolutionEntry2.mmObject(), AmountAndDirection34.mmObject(), ReportEntry8.mmObject(), EntryDetails7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashEntry.class;
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

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public BookEntry getRelatedBookEntry() {
		return relatedBookEntry;
	}

	public void setRelatedBookEntry(com.tools20022.repository.entity.BookEntry relatedBookEntry) {
		this.relatedBookEntry = relatedBookEntry;
	}

	public List<CashBalance> getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(List<com.tools20022.repository.entity.CashBalance> cashBalance) {
		this.cashBalance = cashBalance;
	}

	public CurrencyExchange getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(com.tools20022.repository.entity.CurrencyExchange currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = charges;
	}

	public CashAvailability getAvailability() {
		return availability;
	}

	public void setAvailability(com.tools20022.repository.entity.CashAvailability availability) {
		this.availability = availability;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
	}

	public BookEntry getDebitRelatedBookEntry() {
		return debitRelatedBookEntry;
	}

	public void setDebitRelatedBookEntry(com.tools20022.repository.entity.BookEntry debitRelatedBookEntry) {
		this.debitRelatedBookEntry = debitRelatedBookEntry;
	}

	public BookEntry getCreditRelatedBookEntry() {
		return creditRelatedBookEntry;
	}

	public void setCreditRelatedBookEntry(com.tools20022.repository.entity.BookEntry creditRelatedBookEntry) {
		this.creditRelatedBookEntry = creditRelatedBookEntry;
	}

	public InvoiceFinancingAgreement getRelatedInvoiceFinancingTransaction() {
		return relatedInvoiceFinancingTransaction;
	}

	public void setRelatedInvoiceFinancingTransaction(com.tools20022.repository.entity.InvoiceFinancingAgreement relatedInvoiceFinancingTransaction) {
		this.relatedInvoiceFinancingTransaction = relatedInvoiceFinancingTransaction;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public ChargeIncludedIndicator getChargesIncluded() {
		return chargesIncluded;
	}

	public void setChargesIncluded(ChargeIncludedIndicator chargesIncluded) {
		this.chargesIncluded = chargesIncluded;
	}
}