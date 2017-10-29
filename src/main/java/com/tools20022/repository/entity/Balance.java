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
import com.tools20022.repository.choice.ContractBalanceType1Choice;
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ProcessingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Balance" src="doc-files/Balance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Type Balance.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#ValueDate
 * Balance.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#CreditDebitIndicator
 * Balance.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#AssetHolding
 * Balance.AssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#CalculationDate
 * Balance.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Adjustment
 * Balance.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Account
 * Balance.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Interest
 * Balance.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
 * Balance.BalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#ProcessingRestriction
 * Balance.ProcessingRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#OpeningClosingCode
 * Balance.OpeningClosingCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Balance
 * Account.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
 * Adjustment.AdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Balance Entry.Balance}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Balance
 * AssetHolding.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#AccountBalance
 * Interest.AccountBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice
 * ContractBalanceType1Choice}</li>
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
 * "Balance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Numerical representation of the net increases and decreases in an account at a specific point in time."
 * </li>
 * </ul>
 */
public class Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature of a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType5Choice#Code
	 * BalanceType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#Proprietary
	 * BalanceType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#Code
	 * BalanceSubType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#Proprietary
	 * BalanceSubType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceType12#CodeOrProprietary
	 * BalanceType12.CodeOrProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12#SubType
	 * BalanceType12.SubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#RequestedBalanceType
	 * ReportingRequest3.RequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#Code
	 * BillingBalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#Proprietary
	 * BillingBalanceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#Type
	 * BillingBalance1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#Code
	 * ContractBalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#Proprietary
	 * ContractBalanceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#Type
	 * ContractBalance1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Type
	 * CashBalance7.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature of a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BalanceType5Choice.Code, com.tools20022.repository.choice.BalanceType5Choice.Proprietary, com.tools20022.repository.choice.BalanceSubType1Choice.Code,
					com.tools20022.repository.choice.BalanceSubType1Choice.Proprietary, com.tools20022.repository.msg.BalanceType12.CodeOrProprietary, com.tools20022.repository.msg.BalanceType12.SubType,
					com.tools20022.repository.msg.ReportingRequest3.RequestedBalanceType, com.tools20022.repository.choice.BillingBalanceType1Choice.Code, com.tools20022.repository.choice.BillingBalanceType1Choice.Proprietary,
					com.tools20022.repository.msg.BillingBalance1.Type, com.tools20022.repository.choice.ContractBalanceType1Choice.Code, com.tools20022.repository.choice.ContractBalanceType1Choice.Proprietary,
					com.tools20022.repository.msg.ContractBalance1.Type, com.tools20022.repository.msg.CashBalance7.Type);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceTypeCode.mmObject();
		}
	};
	/**
	 * Date and time at which the balance is or will be available.
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Date
	 * CashBalance7.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the balance is or will be available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalance7.Date);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the balance is a credit or a debit balance. A zero
	 * balance is considered to be a credit balance
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
	 * {@linkplain com.tools20022.repository.msg.ContractBalance1#CreditDebitIndicator
	 * ContractBalance1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance7#CreditDebitIndicator
	 * CashBalance7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAvailability1#CreditDebitIndicator
	 * CashAvailability1.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractBalance1.CreditDebitIndicator, com.tools20022.repository.msg.CashBalance7.CreditDebitIndicator,
					com.tools20022.repository.msg.CashAvailability1.CreditDebitIndicator);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held in a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Balance
	 * AssetHolding.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held in a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Specifies in terms of value and quantity the assets held in a balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the date and time at which the balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Specifies the date and time at which the balance is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the balance adjustments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
	 * Adjustment.AdjustedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#EarningsAdjustmentAmount
	 * BalanceAdjustment1.EarningsAdjustmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the balance adjustments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.EarningsAdjustmentAmount);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the balance adjustments.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.AdjustedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Balance
	 * Account.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account or sub-account for which a balance is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account or sub-account for which a balance is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of elements used to provide interest information that applies to the
	 * balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#AccountBalance
	 * Interest.AccountBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide interest information that applies to the balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide interest information that applies to the balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.AccountBalance;
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
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Balance
	 * Entry.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit or debit postings used to calculate a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BalanceEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			type_lazy = () -> Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of balance processing restrictions that must be
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of balance processing restrictions that must be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessingRestriction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingRestriction";
			definition = "Specifies the type of balance processing restrictions that must be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the balance is an opening or a closing one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the balance is an opening or a closing one."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningClosingCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingCode";
			definition = "Specifies whether the balance is an opening or a closing one.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.OpeningClosingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Balance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.AssetHolding.Balance, com.tools20022.repository.entity.Interest.AccountBalance);
				subType_lazy = () -> Arrays.asList(CashBalance.mmObject(), SecuritiesBalance.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Balance.Type, com.tools20022.repository.entity.Balance.ValueDate, com.tools20022.repository.entity.Balance.CreditDebitIndicator,
						com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Balance.CalculationDate, com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.Balance.BalanceEntry, com.tools20022.repository.entity.Balance.ProcessingRestriction,
						com.tools20022.repository.entity.Balance.OpeningClosingCode);
				derivationComponent_lazy = () -> Arrays.asList(ContractBalanceType1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}