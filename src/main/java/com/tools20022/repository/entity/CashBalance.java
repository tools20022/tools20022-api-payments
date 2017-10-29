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
import com.tools20022.repository.choice.BalanceSubType1Choice;
import com.tools20022.repository.choice.BalanceType5Choice;
import com.tools20022.repository.choice.BillingBalanceType1Choice;
import com.tools20022.repository.codeset.BalanceAdjustmentTypeCode;
import com.tools20022.repository.codeset.BalanceCounterpartyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time. A cash balance is calculated from a sum of cash
 * credits minus a sum of cash debits.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashBalance" src="doc-files/CashBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
 * CashBalance.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CalculationType
 * CashBalance.CalculationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Counterparty
 * CashBalance.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Amount
 * CashBalance.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Availability
 * CashBalance.Availability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
 * CashBalance.CashBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#BalanceAdjustmentCode
 * CashBalance.BalanceAdjustmentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
 * CashBalance.RelatedCardPaymentValidationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CutOffDate
 * CashBalance.CutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedRegisteredContract
 * CashBalance.RelatedRegisteredContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
 * CashAccount.CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
 * CashEntry.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#CashBalance
 * SystemMemberRole.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashBalance
 * CashAvailability.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
 * CardPaymentValidation.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
 * RegisteredContract.ContractBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Balance
 * AccountStatement6.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Balance
 * AccountReport19.Balance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType5Choice
 * BalanceType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceSubType1Choice
 * BalanceSubType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12 BalanceType12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice
 * BillingBalanceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1
 * BillingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1
 * BalanceAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1
 * ContractBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6
 * AccountStatement6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19
 * AccountReport19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification13
 * AccountNotification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12
 * AccountNotification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7 CashBalance7}</li>
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
 * "CashBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits."
 * </li>
 * </ul>
 */
public class CashBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
	 * CashAccount.CashBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Account
	 * AccountStatement6.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Account
	 * AccountReport19.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#Account
	 * AccountNotification13.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#RelatedAccount
	 * AccountNotification13.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Account
	 * AccountNotification12.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#RelatedAccount
	 * AccountNotification12.RelatedAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which a balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountStatement6.Account, com.tools20022.repository.msg.AccountReport19.Account, com.tools20022.repository.msg.AccountNotification13.Account,
					com.tools20022.repository.msg.AccountNotification13.RelatedAccount, com.tools20022.repository.msg.AccountNotification12.Account, com.tools20022.repository.msg.AccountNotification12.RelatedAccount);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a balance is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the balance is calculated against one other party or
	 * against a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode
	 * BalanceCounterpartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the balance is calculated against one other party or against a group of parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies whether the balance is calculated against one other party or against a group of parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceCounterpartyCode.mmObject();
		}
	};
	/**
	 * Party against which a balance is calculated (from the point of view of
	 * the account owner). A bilateral balance is calculated against one other
	 * party; a multilateral balance is calculated against a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#CashBalance
	 * SystemMemberRole.CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties.";
			minOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency and amount of money of the cash balance.
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#BalanceAmount
	 * BalanceAdjustment1.BalanceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#AverageAmount
	 * BalanceAdjustment1.AverageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#BalanceRequiredAmount
	 * BillingServiceAdjustment1.BalanceRequiredAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#Amount
	 * ContractBalance1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Amount
	 * CashBalance7.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#BalanceRequiredAccountAmount
	 * BillingService2.BalanceRequiredAccountAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount of money of the cash balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.BalanceAmount, com.tools20022.repository.msg.BalanceAdjustment1.AverageAmount,
					com.tools20022.repository.msg.BillingServiceAdjustment1.BalanceRequiredAmount, com.tools20022.repository.msg.ContractBalance1.Amount, com.tools20022.repository.msg.CashBalance7.Amount,
					com.tools20022.repository.msg.BillingService2.BalanceRequiredAccountAmount);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of money of the cash balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashBalance
	 * CashAvailability.CashBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Availability
	 * CashBalance7.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Availability
	 * ReportEntry8.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#Availability
	 * TotalsPerBankTransactionCode4.Availability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalance7.Availability, com.tools20022.repository.msg.ReportEntry8.Availability, com.tools20022.repository.msg.TotalsPerBankTransactionCode4.Availability);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Credit or debit postings used to calculate a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
	 * CashEntry.CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#Value
	 * BillingBalance1.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Entry
	 * AccountStatement6.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Entry
	 * AccountReport19.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification13#Item
	 * AccountNotification13.Item}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Entry
	 * AccountNotification12.Entry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalanceEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit or debit postings used to calculate a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashBalanceEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingBalance1.Value, com.tools20022.repository.msg.AccountStatement6.Entry, com.tools20022.repository.msg.AccountReport19.Entry,
					com.tools20022.repository.msg.AccountNotification13.Item, com.tools20022.repository.msg.AccountNotification12.Entry);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the type of allowed balance adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
	 * BalanceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Type
	 * BalanceAdjustment1.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAdjustmentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of allowed balance adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BalanceAdjustmentCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.Type);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceAdjustmentCode";
			definition = "Defines the type of allowed balance adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Validation process which verifies the balance attached to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
	 * CardPaymentValidation.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation process which verifies the balance attached to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidationProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidationProcess";
			definition = "Validation process which verifies the balance attached to the card.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentValidation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Predetermined date in a billing or processing cycle when account activity
	 * for the previous reporting period is summarized (when checks written
	 * against an account are collected and summarized in a monthly statement).
	 * Checks paid or deposits received after the cut-off date are included in
	 * the next month's statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CutOffDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CutOffDate";
			definition = "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Related contract balance on date of contract registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
	 * RegisteredContract.ContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegisteredContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related contract balance on date of contract registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRegisteredContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegisteredContract";
			definition = "Related contract balance on date of contract registration.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ContractBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashBalance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.SystemMemberRole.CashBalance,
						com.tools20022.repository.entity.CashAvailability.CashBalance, com.tools20022.repository.entity.CardPaymentValidation.Balance, com.tools20022.repository.entity.RegisteredContract.ContractBalance);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountStatement6.Balance, com.tools20022.repository.msg.AccountReport19.Balance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.CashBalance.CalculationType, com.tools20022.repository.entity.CashBalance.Counterparty,
						com.tools20022.repository.entity.CashBalance.Amount, com.tools20022.repository.entity.CashBalance.Availability, com.tools20022.repository.entity.CashBalance.CashBalanceEntry,
						com.tools20022.repository.entity.CashBalance.BalanceAdjustmentCode, com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.CashBalance.CutOffDate,
						com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract);
				derivationComponent_lazy = () -> Arrays.asList(BalanceType5Choice.mmObject(), BalanceSubType1Choice.mmObject(), BalanceType12.mmObject(), BillingBalanceType1Choice.mmObject(), BillingBalance1.mmObject(),
						BalanceAdjustment1.mmObject(), ContractBalance1.mmObject(), AccountStatement6.mmObject(), AccountReport19.mmObject(), AccountNotification13.mmObject(), AccountNotification12.mmObject(), CashBalance7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}