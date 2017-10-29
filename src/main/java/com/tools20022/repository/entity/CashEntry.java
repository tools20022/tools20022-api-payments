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
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
 * CashEntry.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Amount
 * CashEntry.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#RelatedBookEntry
 * CashEntry.RelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
 * CashEntry.CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
 * CashEntry.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Charges
 * CashEntry.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Availability
 * CashEntry.Availability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Interest
 * CashEntry.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#DebitRelatedBookEntry
 * CashEntry.DebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#CreditRelatedBookEntry
 * CashEntry.CreditRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvoiceFinancingTransaction
 * CashEntry.RelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCase
 * CashEntry.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCaseResolution
 * CashEntry.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#ChargesIncluded
 * CashEntry.ChargesIncluded}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
 * CashAccount.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
 * CashBalance.CashBalanceEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CashEntry
 * Charges.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CashEntry
 * BookEntry.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#DebitEntry
 * BookEntry.DebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CreditEntry
 * BookEntry.CreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#CashEntry
 * Interest.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAvailability#CashEntry
 * CashAvailability.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingCashEntry
 * PaymentInvestigationCase.UnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#EntryCorrection
 * PaymentInvestigationCaseResolution.EntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#ResultingCashEntry
 * InvoiceFinancingAgreement.ResultingCashEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#ProprietaryAmount
 * AmountAndCurrencyExchange3.ProprietaryAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35#Amount
 * AmountAndDirection35.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#EntryDetails
 * ReportEntry8.EntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#AmountDetails
 * EntryTransaction8.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails7#TransactionDetails
 * EntryDetails7.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#StatementEntry
 * UnderlyingTransaction3Choice.StatementEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Cash account on which the amount of the entry is debited or credited. It
	 * is derived from the association between Entry and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
	 * CashAccount.CashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#Account
	 * OriginalNotificationReference8.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#Account
	 * OriginalItemReference4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#Account
	 * OriginalNotificationReference7.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#SafekeepingAccount
	 * EntryTransaction8.SafekeepingAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Account
	 * NotificationItem6.Account}</li>
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
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotificationReference8.Account, com.tools20022.repository.msg.OriginalItemReference4.Account,
					com.tools20022.repository.msg.OriginalNotificationReference7.Account, com.tools20022.repository.msg.EntryTransaction8.SafekeepingAccount, com.tools20022.repository.msg.NotificationItem6.Account);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#Amount
	 * AmountAndCurrencyExchangeDetails3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#Amount
	 * AmountAndCurrencyExchangeDetails4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#CorrectedAmount
	 * StatementResolutionEntry2.CorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection34#Amount
	 * AmountAndDirection34.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Amount
	 * ReportEntry8.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#AmountDetails
	 * ReportEntry8.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Amount
	 * EntryTransaction8.Amount}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.Amount, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4.Amount,
					com.tools20022.repository.msg.StatementResolutionEntry2.CorrectedAmount, com.tools20022.repository.msg.AmountAndDirection34.Amount, com.tools20022.repository.msg.ReportEntry8.Amount,
					com.tools20022.repository.msg.ReportEntry8.AmountDetails, com.tools20022.repository.msg.EntryTransaction8.Amount);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account entry for which one or more cash entries are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#CashEntry
	 * BookEntry.CashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBookEntry";
			definition = "Account entry for which one or more cash entries are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount that is the result of the sum of the cash entries from or to
	 * a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
	 * CashBalance.CashBalanceEntry}</li>
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
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash amount that is the result of the sum of the cash entries from or to a cash account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashBalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
	 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails3.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails4.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.CurrencyExchange, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4.CurrencyExchange);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information on the charges included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#CashEntry
	 * Charges.CashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#Charges
	 * StatementResolutionEntry2.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Charges
	 * ReportEntry8.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Charges
	 * EntryTransaction8.Charges}</li>
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
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementResolutionEntry2.Charges, com.tools20022.repository.msg.ReportEntry8.Charges, com.tools20022.repository.msg.EntryTransaction8.Charges);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashEntry
	 * CashAvailability.CashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#Availability
	 * EntryTransaction8.Availability}</li>
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
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction8.Availability);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest amount included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#CashEntry
	 * Interest.CashEntry}</li>
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
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount included in the entry amount.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#DebitEntry
	 * BookEntry.DebitEntry}</li>
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
	public static final MMBusinessAssociationEnd DebitRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.DebitEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#CreditEntry
	 * BookEntry.CreditEntry}</li>
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
	public static final MMBusinessAssociationEnd CreditRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CreditEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the invoice financing transaction which originates the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#ResultingCashEntry
	 * InvoiceFinancingAgreement.ResultingCashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingTransaction";
			definition = "Specifies the invoice financing transaction which originates the entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case which is investigating a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingCashEntry
	 * PaymentInvestigationCase.UnderlyingCashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case which is investigating a cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment investigation case resolution which created a correction
	 * resulting in a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#EntryCorrection
	 * PaymentInvestigationCaseResolution.EntryCorrection}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which created a correction resulting in a cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ChargesIncluded = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesIncluded";
			definition = "Indicates whether charges have already been included in the entry amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeIncludedIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashEntry";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashEntry, com.tools20022.repository.entity.CashBalance.CashBalanceEntry, com.tools20022.repository.entity.Charges.CashEntry,
						com.tools20022.repository.entity.BookEntry.CashEntry, com.tools20022.repository.entity.BookEntry.DebitEntry, com.tools20022.repository.entity.BookEntry.CreditEntry,
						com.tools20022.repository.entity.Interest.CashEntry, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CashAvailability.CashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.ProprietaryAmount, com.tools20022.repository.msg.AmountAndDirection35.Amount,
						com.tools20022.repository.msg.ReportEntry8.EntryDetails, com.tools20022.repository.msg.EntryTransaction8.AmountDetails, com.tools20022.repository.msg.EntryDetails7.TransactionDetails,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.StatementEntry);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.CashAccount, com.tools20022.repository.entity.CashEntry.Amount, com.tools20022.repository.entity.CashEntry.RelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.CashEntry.Charges,
						com.tools20022.repository.entity.CashEntry.Availability, com.tools20022.repository.entity.CashEntry.Interest, com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry, com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase,
						com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.ChargesIncluded);
				derivationComponent_lazy = () -> Arrays.asList(AmountAndCurrencyExchangeDetails3.mmObject(), AmountAndCurrencyExchangeDetails4.mmObject(), AmountAndCurrencyExchange3.mmObject(), AmountAndDirection35.mmObject(),
						TransactionType1.mmObject(), StatementResolutionEntry2.mmObject(), AmountAndDirection34.mmObject(), ReportEntry8.mmObject(), EntryDetails7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}