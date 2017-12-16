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
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Account" src="doc-files/Account.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
 * Account.mmBaseCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmIdentification
 * Account.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedFundProcessingCharacteristics
 * Account.mmRelatedFundProcessingCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmStatus
 * Account.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLanguage
 * Account.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPartyRole
 * Account.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
 * Account.mmReportingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
 * Account.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmSettlementPartyRole
 * Account.mmSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPurpose
 * Account.mmPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmClosingDate
 * Account.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLiveDate
 * Account.mmLiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
 * Account.mmReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmInvestmentFundPartyRole
 * Account.mmInvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
 * Account.mmRelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
 * Account.mmRelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCorporateActionPartyRole
 * Account.mmRelatedCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystem
 * Account.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBalance
 * Account.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmEntry
 * Account.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountContract
 * Account.mmAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
 * Account.mmOpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundContribution
 * Account.mmDefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystemMember
 * Account.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmCollateralAccountType
 * Account.mmCollateralAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountService
 * Account.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReconciliation
 * Account.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmManagedAccountProduct
 * Account.mmManagedAccountProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
 * AccountIdentification.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
 * DateTimePeriod.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
 * AccountPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#mmAccount
 * AccountService.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
 * AccountStatus.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
 * AccountContract.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmAccount
 * Entry.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
 * InvestmentFundPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAccount
 * System.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
 * SystemMemberRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAccount
 * Balance.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
 * SettlementPartyRole.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
 * AccountRestriction.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
 * Collateral.mmCollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
 * CorporateActionPartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
 * DefaultFundContribution.mmContributionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
 * Reconciliation.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
 * ManagedAccountProduct.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmOriginalPartyAndAccountIdentification
 * IdentificationModification2.mmOriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmUpdatedPartyAndAccountIdentification
 * IdentificationModification2.mmUpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification2#mmPartyAndAccountIdentification
 * IdentificationVerification2.mmPartyAndAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationInformation2
 * IdentificationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationModification2
 * IdentificationModification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationVerification2
 * IdentificationVerification2}</li>
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
 * "Account"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners."
 * </li>
 * </ul>
 */
public class Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode baseCurrency;
	/**
	 * Base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#mmCurrency
	 * CashAccount24.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmCurrency
	 * CashAccount25.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#mmCurrency
	 * AccountForAction1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#mmCurrency
	 * AccountForAction2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmCurrency
	 * CustomerAccount5.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmCurrency
	 * CustomerAccount4.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmSettlementCurrency
	 * TradeContract1.mmSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Base currency of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount24.mmCurrency, CashAccount25.mmCurrency, AccountForAction1.mmCurrency, AccountForAction2.mmCurrency, CustomerAccount5.mmCurrency, CustomerAccount4.mmCurrency,
					TradeContract1.mmSettlementCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getBaseCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification identification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
	 * AccountIdentification.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount24#mmIdentification
	 * CashAccount24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount25#mmIdentification
	 * CashAccount25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#mmIdentification
	 * AccountForAction1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#mmIdentification
	 * AccountForAction2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmIdentification
	 * CustomerAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmIdentification
	 * CustomerAccountModification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmIdentification
	 * CustomerAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#mmAccount
	 * IdentificationInformation2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmIdentification
	 * SecuritiesAccount19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmCashAccountIdentification
	 * CashCollateral5.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDebitAccount
	 * CashAccountCharacteristics2.mmDebitAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount24.mmIdentification, CashAccount25.mmIdentification, AccountForAction1.mmIdentification, AccountForAction2.mmIdentification, CustomerAccount5.mmIdentification,
					CustomerAccountModification1.mmIdentification, CustomerAccount4.mmIdentification, IdentificationInformation2.mmAccount, SecuritiesAccount19.mmIdentification, CashCollateral5.mmCashAccountIdentification,
					CashAccountCharacteristics2.mmDebitAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected Account parentAccount;
	/**
	 * Account for which one or more sub-accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmParentAccount
	 * CashAccountCharacteristics2.mmParentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which one or more sub-accounts are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccountCharacteristics2.mmParentAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSubAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> subAccount;
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmParentAccount
	 * Account.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmParentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics;
	/**
	 * Fund processing characteristics for which a settlement account is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFundProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund processing characteristics for which a settlement account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected AccountStatus status;
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
	 * AccountStatus.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountStatus
	 * AccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language for all communication concerning the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AccountPartyRole> partyRole;
	/**
	 * Specifies each role linked to an account and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
	 * AccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.mmObject();
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * Party for which an account is specified in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	protected CurrencyCode reportingCurrency;
	/**
	 * Currency used to calculate and report the balance and related entries of
	 * an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCurrency
	 * CustomerAccountModification1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountBalanceCurrencyCode
	 * CashAccountCharacteristics2.mmAccountBalanceCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to calculate and report the balance and related entries of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReportingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccountModification1.mmCurrency, CashAccountCharacteristics2.mmAccountBalanceCurrencyCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getReportingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AccountRestriction> accountRestriction;
	/**
	 * Restriction on capability or operations allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
	 * AccountRestriction.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmRestriction
	 * CustomerAccount5.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmRestriction
	 * CustomerAccountModification1.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmRestriction
	 * CustomerAccount4.mmRestriction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmRestriction, CustomerAccountModification1.mmRestriction, CustomerAccount4.mmRestriction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
		}
	};
	protected SettlementPartyRole settlementPartyRole;
	/**
	 * Specifies the role of the party which uses the account for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
	 * SettlementPartyRole.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the party which uses the account for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
		}
	};
	protected Max140Text purpose;
	/**
	 * Specifies the purpose of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmAccountPurpose
	 * CustomerAccount5.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PurposeModification1#mmPurpose
	 * PurposeModification1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmAccountPurpose
	 * CustomerAccountModification1.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmAccountPurpose
	 * CustomerAccount4.mmAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmAccountPurpose, PurposeModification1.mmPurpose, CustomerAccountModification1.mmAccountPurpose, CustomerAccount4.mmAccountPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime closingDate;
	/**
	 * Date on which the account and related services cease effectively to be
	 * operational for the account owner.
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmClosingDate
	 * CustomerAccount5.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmClosingDate
	 * CustomerAccountModification1.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmClosingDate
	 * CustomerAccount4.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmClosingDate
	 * AccountContract3.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services cease effectively to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmClosingDate, CustomerAccountModification1.mmClosingDate, CustomerAccount4.mmClosingDate, AccountContract3.mmClosingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getClosingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime liveDate;
	/**
	 * Date of the first movement on the account.
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmGoLiveDate
	 * AccountContract3.mmGoLiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first movement on the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract3.mmGoLiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getLiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod reportedPeriod;
	/**
	 * Specifies the period for which the movements in the account are reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
	 * DateTimePeriod.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmFromToDate
	 * AccountNotification12.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for which the movements in the account are reported."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountNotification12.mmFromToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected InvestmentFundPartyRole investmentFundPartyRole;
	/**
	 * Party role for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
	 * InvestmentFundPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
	 * InvestmentFundPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party role for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
		}
	};
	protected Collateral relatedCollateralProcess;
	/**
	 * Collateral data for which a collateral account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral data for which a collateral account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected GenericIdentification type;
	/**
	 * Specifies the type of account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
	 * GenericIdentification.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery;
	/**
	 * Proceeds delivery instruction which contain account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
	 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProceedsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds delivery instruction which contain account identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedProceedsDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected CorporateActionPartyRole relatedCorporateActionPartyRole;
	/**
	 * Party for which an account is specified in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
	 * CorporateActionPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
		}
	};
	protected ClearingMemberRole defaultFundAccountOwner;
	/**
	 * Clearing member which holds a default fund account at an ICSD or at the
	 * central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
	 * ClearingMemberRole.mmDefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member which holds a default fund account at an ICSD or at the central bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.System> system;
	/**
	 * System where the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAccount
	 * System.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System where the account is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Balance> balance;
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAccount
	 * Balance.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Entry> entry;
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmAccount
	 * Entry.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AccountContract> accountContract;
	/**
	 * Agreement which provides information on the account and on the services
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
	 * AccountContract.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement which provides information on the account and on the services linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected ISODateTime openingDate;
	/**
	 * Date on which the account and related basic services are effectively
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are effectively operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getOpeningDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Rate used to calculate the difference between amounts based on the base
	 * currency and the reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
	 * CurrencyExchange.mmReportedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the difference between amounts based on the base currency and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected DefaultFundContribution defaultFundContribution;
	/**
	 * Default fund contribution parameters associated with a contribution
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
	 * DefaultFundContribution.mmContributionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default fund contribution parameters associated with a contribution account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmContributionAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	protected SystemMemberRole systemMember;
	/**
	 * Member of a system which is the owner of an account with the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
	 * SystemMemberRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member of a system which is the owner of an account with the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemMember = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
		}
	};
	protected CollateralAccountTypeCode collateralAccountType;
	/**
	 * Specifies the collateral account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getCollateralAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountService accountService;
	/**
	 * Services linked to the account and specified in the account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccount
	 * AccountService.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the account and specified in the account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
	 * Reconciliation.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected ManagedAccountProduct managedAccountProduct;
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
	 * ManagedAccountProduct.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct
	 * ManagedAccountProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagedAccountProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product which provides guidance to investors to manage their portfolios."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmManagedAccountProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmAccount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementAccount,
						com.tools20022.repository.entity.Account.mmParentAccount, com.tools20022.repository.entity.Account.mmSubAccount, com.tools20022.repository.entity.AccountIdentification.mmAccount,
						com.tools20022.repository.entity.DateTimePeriod.mmAccount, com.tools20022.repository.entity.AccountPartyRole.mmAccount, com.tools20022.repository.entity.AccountService.mmAccount,
						com.tools20022.repository.entity.AccountStatus.mmAccount, com.tools20022.repository.entity.AccountContract.mmAccount, com.tools20022.repository.entity.Entry.mmAccount,
						com.tools20022.repository.entity.InvestmentFundPartyRole.mmAccount, com.tools20022.repository.entity.TradePartyRole.mmAccount, com.tools20022.repository.entity.System.mmAccount,
						com.tools20022.repository.entity.SystemMemberRole.mmAccount, com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount, com.tools20022.repository.entity.Balance.mmAccount,
						com.tools20022.repository.entity.SettlementPartyRole.mmSettlementAccount, com.tools20022.repository.entity.AccountRestriction.mmAccount, com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount,
						com.tools20022.repository.entity.Collateral.mmCollateralAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount,
						com.tools20022.repository.entity.CorporateActionPartyRole.mmAccount, com.tools20022.repository.entity.DefaultFundContribution.mmContributionAccount, com.tools20022.repository.entity.Reconciliation.mmAccount,
						com.tools20022.repository.entity.ManagedAccountProduct.mmAccount);
				derivationElement_lazy = () -> Arrays.asList(IdentificationModification2.mmOriginalPartyAndAccountIdentification, IdentificationModification2.mmUpdatedPartyAndAccountIdentification,
						IdentificationVerification2.mmPartyAndAccountIdentification);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmBaseCurrency, com.tools20022.repository.entity.Account.mmIdentification, com.tools20022.repository.entity.Account.mmParentAccount,
						com.tools20022.repository.entity.Account.mmSubAccount, com.tools20022.repository.entity.Account.mmRelatedFundProcessingCharacteristics, com.tools20022.repository.entity.Account.mmStatus,
						com.tools20022.repository.entity.Account.mmLanguage, com.tools20022.repository.entity.Account.mmPartyRole, com.tools20022.repository.entity.Account.mmTradePartyRole,
						com.tools20022.repository.entity.Account.mmReportingCurrency, com.tools20022.repository.entity.Account.mmAccountRestriction, com.tools20022.repository.entity.Account.mmSettlementPartyRole,
						com.tools20022.repository.entity.Account.mmPurpose, com.tools20022.repository.entity.Account.mmClosingDate, com.tools20022.repository.entity.Account.mmLiveDate,
						com.tools20022.repository.entity.Account.mmReportedPeriod, com.tools20022.repository.entity.Account.mmInvestmentFundPartyRole, com.tools20022.repository.entity.Account.mmRelatedCollateralProcess,
						com.tools20022.repository.entity.Account.mmType, com.tools20022.repository.entity.Account.mmRelatedProceedsDelivery, com.tools20022.repository.entity.Account.mmRelatedCorporateActionPartyRole,
						com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner, com.tools20022.repository.entity.Account.mmSystem, com.tools20022.repository.entity.Account.mmBalance,
						com.tools20022.repository.entity.Account.mmEntry, com.tools20022.repository.entity.Account.mmAccountContract, com.tools20022.repository.entity.Account.mmOpeningDate,
						com.tools20022.repository.entity.Account.mmCurrencyExchange, com.tools20022.repository.entity.Account.mmDefaultFundContribution, com.tools20022.repository.entity.Account.mmSystemMember,
						com.tools20022.repository.entity.Account.mmCollateralAccountType, com.tools20022.repository.entity.Account.mmAccountService, com.tools20022.repository.entity.Account.mmReconciliation,
						com.tools20022.repository.entity.Account.mmManagedAccountProduct);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationInformation2.mmObject(), IdentificationModification2.mmObject(), IdentificationVerification2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Account.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public AccountIdentification getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.entity.AccountIdentification identification) {
		this.identification = identification;
	}

	public Account getParentAccount() {
		return parentAccount;
	}

	public void setParentAccount(com.tools20022.repository.entity.Account parentAccount) {
		this.parentAccount = parentAccount;
	}

	public List<Account> getSubAccount() {
		return subAccount;
	}

	public void setSubAccount(List<com.tools20022.repository.entity.Account> subAccount) {
		this.subAccount = subAccount;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedFundProcessingCharacteristics() {
		return relatedFundProcessingCharacteristics;
	}

	public void setRelatedFundProcessingCharacteristics(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics) {
		this.relatedFundProcessingCharacteristics = relatedFundProcessingCharacteristics;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.AccountStatus status) {
		this.status = status;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public List<AccountPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.AccountPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public void setTradePartyRole(com.tools20022.repository.entity.TradePartyRole tradePartyRole) {
		this.tradePartyRole = tradePartyRole;
	}

	public CurrencyCode getReportingCurrency() {
		return reportingCurrency;
	}

	public void setReportingCurrency(CurrencyCode reportingCurrency) {
		this.reportingCurrency = reportingCurrency;
	}

	public List<AccountRestriction> getAccountRestriction() {
		return accountRestriction;
	}

	public void setAccountRestriction(List<com.tools20022.repository.entity.AccountRestriction> accountRestriction) {
		this.accountRestriction = accountRestriction;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return settlementPartyRole;
	}

	public void setSettlementPartyRole(com.tools20022.repository.entity.SettlementPartyRole settlementPartyRole) {
		this.settlementPartyRole = settlementPartyRole;
	}

	public Max140Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max140Text purpose) {
		this.purpose = purpose;
	}

	public ISODateTime getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
	}

	public ISODateTime getLiveDate() {
		return liveDate;
	}

	public void setLiveDate(ISODateTime liveDate) {
		this.liveDate = liveDate;
	}

	public DateTimePeriod getReportedPeriod() {
		return reportedPeriod;
	}

	public void setReportedPeriod(com.tools20022.repository.entity.DateTimePeriod reportedPeriod) {
		this.reportedPeriod = reportedPeriod;
	}

	public InvestmentFundPartyRole getInvestmentFundPartyRole() {
		return investmentFundPartyRole;
	}

	public void setInvestmentFundPartyRole(com.tools20022.repository.entity.InvestmentFundPartyRole investmentFundPartyRole) {
		this.investmentFundPartyRole = investmentFundPartyRole;
	}

	public Collateral getRelatedCollateralProcess() {
		return relatedCollateralProcess;
	}

	public void setRelatedCollateralProcess(com.tools20022.repository.entity.Collateral relatedCollateralProcess) {
		this.relatedCollateralProcess = relatedCollateralProcess;
	}

	public GenericIdentification getType() {
		return type;
	}

	public void setType(com.tools20022.repository.entity.GenericIdentification type) {
		this.type = type;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedProceedsDelivery() {
		return relatedProceedsDelivery;
	}

	public void setRelatedProceedsDelivery(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery) {
		this.relatedProceedsDelivery = relatedProceedsDelivery;
	}

	public CorporateActionPartyRole getRelatedCorporateActionPartyRole() {
		return relatedCorporateActionPartyRole;
	}

	public void setRelatedCorporateActionPartyRole(com.tools20022.repository.entity.CorporateActionPartyRole relatedCorporateActionPartyRole) {
		this.relatedCorporateActionPartyRole = relatedCorporateActionPartyRole;
	}

	public ClearingMemberRole getDefaultFundAccountOwner() {
		return defaultFundAccountOwner;
	}

	public void setDefaultFundAccountOwner(com.tools20022.repository.entity.ClearingMemberRole defaultFundAccountOwner) {
		this.defaultFundAccountOwner = defaultFundAccountOwner;
	}

	public List<System> getSystem() {
		return system;
	}

	public void setSystem(List<com.tools20022.repository.entity.System> system) {
		this.system = system;
	}

	public List<Balance> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = balance;
	}

	public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<com.tools20022.repository.entity.Entry> entry) {
		this.entry = entry;
	}

	public List<AccountContract> getAccountContract() {
		return accountContract;
	}

	public void setAccountContract(List<com.tools20022.repository.entity.AccountContract> accountContract) {
		this.accountContract = accountContract;
	}

	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(ISODateTime openingDate) {
		this.openingDate = openingDate;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return defaultFundContribution;
	}

	public void setDefaultFundContribution(com.tools20022.repository.entity.DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = defaultFundContribution;
	}

	public SystemMemberRole getSystemMember() {
		return systemMember;
	}

	public void setSystemMember(com.tools20022.repository.entity.SystemMemberRole systemMember) {
		this.systemMember = systemMember;
	}

	public CollateralAccountTypeCode getCollateralAccountType() {
		return collateralAccountType;
	}

	public void setCollateralAccountType(CollateralAccountTypeCode collateralAccountType) {
		this.collateralAccountType = collateralAccountType;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = accountService;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = reconciliation;
	}

	public ManagedAccountProduct getManagedAccountProduct() {
		return managedAccountProduct;
	}

	public void setManagedAccountProduct(com.tools20022.repository.entity.ManagedAccountProduct managedAccountProduct) {
		this.managedAccountProduct = managedAccountProduct;
	}
}