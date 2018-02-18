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
import com.tools20022.repository.choice.BalanceSubType1Choice;
import com.tools20022.repository.choice.BalanceType5Choice;
import com.tools20022.repository.choice.BillingBalanceType1Choice;
import com.tools20022.repository.choice.ContractBalanceType1Choice;
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.OpeningClosingCode;
import com.tools20022.repository.codeset.ProcessingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmType
 * Balance.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmValueDate
 * Balance.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmCreditDebitIndicator
 * Balance.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
 * Balance.mmAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmCalculationDate
 * Balance.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
 * Balance.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAccount
 * Balance.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
 * Balance.mmBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmProcessingRestriction
 * Balance.mmProcessingRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmOpeningClosingCode
 * Balance.mmOpeningClosingCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBalance
 * Account.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
 * Adjustment.mmAdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBalance
 * Entry.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
 * AssetHolding.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
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
	protected BalanceTypeCode type;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#mmCode
	 * BalanceType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#mmProprietary
	 * BalanceType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#mmCode
	 * BalanceSubType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#mmProprietary
	 * BalanceSubType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceType12#mmCodeOrProprietary
	 * BalanceType12.mmCodeOrProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12#mmSubType
	 * BalanceType12.mmSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedBalanceType
	 * ReportingRequest3.mmRequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#mmCode
	 * BillingBalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#mmProprietary
	 * BillingBalanceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#mmType
	 * BillingBalance1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#mmCode
	 * ContractBalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#mmProprietary
	 * ContractBalanceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#mmType
	 * ContractBalance1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmType
	 * CashBalance7.mmType}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceType5Choice.mmCode, BalanceType5Choice.mmProprietary, BalanceSubType1Choice.mmCode, BalanceSubType1Choice.mmProprietary, BalanceType12.mmCodeOrProprietary, BalanceType12.mmSubType,
					ReportingRequest3.mmRequestedBalanceType, BillingBalanceType1Choice.mmCode, BillingBalanceType1Choice.mmProprietary, BillingBalance1.mmType, ContractBalanceType1Choice.mmCode, ContractBalanceType1Choice.mmProprietary,
					ContractBalance1.mmType, CashBalance7.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmDate
	 * CashBalance7.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
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
	 * "Date and time at which the balance is or will be available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalance7.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::VALU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContractBalance1#mmCreditDebitIndicator
	 * ContractBalance1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance7#mmCreditDebitIndicator
	 * CashBalance7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAvailability1#mmCreditDebitIndicator
	 * CashAvailability1.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CRDB</li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContractBalance1.mmCreditDebitIndicator, CashBalance7.mmCreditDebitIndicator, CashAvailability1.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CRDB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> assetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
	 * AssetHolding.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd mmAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Specifies in terms of value and quantity the assets held in a balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected ISODateTime calculationDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Specifies the date and time at which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Adjustment> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
	 * Adjustment.mmAdjustedBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmEarningsAdjustmentAmount
	 * BalanceAdjustment1.mmEarningsAdjustmentAmount}</li>
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
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAdjustment1.mmEarningsAdjustmentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the balance adjustments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmAdjustedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBalance
	 * Account.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account or sub-account for which a balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
	 * Interest.mmAccountBalance}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide interest information that applies to the balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmAccountBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Entry> balanceEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmBalance
	 * Entry.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd mmBalanceEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};
	protected ProcessingTypeCode processingRestriction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmProcessingRestriction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingRestriction";
			definition = "Specifies the type of balance processing restrictions that must be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getProcessingRestriction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OpeningClosingCode openingClosingCode;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmOpeningClosingCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingCode";
			definition = "Specifies whether the balance is an opening or a closing one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Balance.class.getMethod("getOpeningClosingCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Balance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmBalance, com.tools20022.repository.entity.Adjustment.mmAdjustedBalance, com.tools20022.repository.entity.Entry.mmBalance,
						com.tools20022.repository.entity.AssetHolding.mmBalance, com.tools20022.repository.entity.Interest.mmAccountBalance);
				subType_lazy = () -> Arrays.asList(CashBalance.mmObject(), SecuritiesBalance.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Balance.mmType, com.tools20022.repository.entity.Balance.mmValueDate, com.tools20022.repository.entity.Balance.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Balance.mmAssetHolding, com.tools20022.repository.entity.Balance.mmCalculationDate, com.tools20022.repository.entity.Balance.mmAdjustment,
						com.tools20022.repository.entity.Balance.mmAccount, com.tools20022.repository.entity.Balance.mmInterest, com.tools20022.repository.entity.Balance.mmBalanceEntry,
						com.tools20022.repository.entity.Balance.mmProcessingRestriction, com.tools20022.repository.entity.Balance.mmOpeningClosingCode);
				derivationComponent_lazy = () -> Arrays.asList(ContractBalanceType1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Balance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceTypeCode getType() {
		return type;
	}

	public Balance setType(BalanceTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public Balance setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Balance setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<AssetHolding> getAssetHolding() {
		return assetHolding == null ? assetHolding = new ArrayList<>() : assetHolding;
	}

	public Balance setAssetHolding(List<com.tools20022.repository.entity.AssetHolding> assetHolding) {
		this.assetHolding = Objects.requireNonNull(assetHolding);
		return this;
	}

	public ISODateTime getCalculationDate() {
		return calculationDate;
	}

	public Balance setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public List<Adjustment> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public Balance setAdjustment(List<com.tools20022.repository.entity.Adjustment> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public Balance setAccount(com.tools20022.repository.entity.Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public Balance setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public List<Entry> getBalanceEntry() {
		return balanceEntry == null ? balanceEntry = new ArrayList<>() : balanceEntry;
	}

	public Balance setBalanceEntry(List<com.tools20022.repository.entity.Entry> balanceEntry) {
		this.balanceEntry = Objects.requireNonNull(balanceEntry);
		return this;
	}

	public ProcessingTypeCode getProcessingRestriction() {
		return processingRestriction;
	}

	public Balance setProcessingRestriction(ProcessingTypeCode processingRestriction) {
		this.processingRestriction = Objects.requireNonNull(processingRestriction);
		return this;
	}

	public OpeningClosingCode getOpeningClosingCode() {
		return openingClosingCode;
	}

	public Balance setOpeningClosingCode(OpeningClosingCode openingClosingCode) {
		this.openingClosingCode = Objects.requireNonNull(openingClosingCode);
		return this;
	}
}