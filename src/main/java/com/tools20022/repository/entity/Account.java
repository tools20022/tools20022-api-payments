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
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.msg.IdentificationInformation2;
import com.tools20022.repository.msg.IdentificationModification2;
import com.tools20022.repository.msg.IdentificationVerification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Account#BaseCurrency
 * Account.BaseCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Identification
 * Account.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ParentAccount
 * Account.ParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SubAccount
 * Account.SubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedFundProcessingCharacteristics
 * Account.RelatedFundProcessingCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Status
 * Account.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Language
 * Account.Language}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#PartyRole
 * Account.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#TradePartyRole
 * Account.TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ReportingCurrency
 * Account.ReportingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountRestriction
 * Account.AccountRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SettlementPartyRole
 * Account.SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Purpose
 * Account.Purpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ClosingDate
 * Account.ClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#LiveDate
 * Account.LiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ReportedPeriod
 * Account.ReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#InvestmentFundPartyRole
 * Account.InvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
 * Account.RelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Type Account.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
 * Account.RelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCorporateActionPartyRole
 * Account.RelatedCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundAccountOwner
 * Account.DefaultFundAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#System
 * Account.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Balance
 * Account.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Entry Account.Entry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountContract
 * Account.AccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#OpeningDate
 * Account.OpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
 * Account.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundContribution
 * Account.DefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SystemMember
 * Account.SystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#CollateralAccountType
 * Account.CollateralAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountService
 * Account.AccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Reconciliation
 * Account.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#ManagedAccountProduct
 * Account.ManagedAccountProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
 * GenericIdentification.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementAccount
 * InvestmentFundClassProcessingCharacteristics.SettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ParentAccount
 * Account.ParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SubAccount
 * Account.SubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Account
 * AccountIdentification.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Account
 * DateTimePeriod.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#Account
 * AccountPartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#Account
 * AccountService.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#Account
 * AccountStatus.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Account
 * AccountContract.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Account Entry.Account}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#Account
 * InvestmentFundPartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#Account
 * TradePartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Account
 * System.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Account
 * SystemMemberRole.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DefaultFundAccount
 * ClearingMemberRole.DefaultFundAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Account
 * Balance.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#SettlementAccount
 * SettlementPartyRole.SettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountRestriction#Account
 * AccountRestriction.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
 * CurrencyExchange.ReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
 * Collateral.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#Account
 * CorporateActionPartyRole.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ContributionAccount
 * DefaultFundContribution.ContributionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#Account
 * Reconciliation.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#Account
 * ManagedAccountProduct.Account}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#OriginalPartyAndAccountIdentification
 * IdentificationModification2.OriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#UpdatedPartyAndAccountIdentification
 * IdentificationModification2.UpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification2#PartyAndAccountIdentification
 * IdentificationVerification2.PartyAndAccountIdentification}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#Currency
	 * CashAccount24.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Currency
	 * CashAccount25.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1#Currency
	 * AccountForAction1.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2#Currency
	 * AccountForAction2.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Currency
	 * CustomerAccount5.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Currency
	 * CustomerAccount4.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#SettlementCurrency
	 * TradeContract1.SettlementCurrency}</li>
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
	public static final MMBusinessAttribute BaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount24.Currency, com.tools20022.repository.msg.CashAccount25.Currency, com.tools20022.repository.msg.AccountForAction1.Currency,
					com.tools20022.repository.msg.AccountForAction2.Currency, com.tools20022.repository.msg.CustomerAccount5.Currency, com.tools20022.repository.msg.CustomerAccount4.Currency,
					com.tools20022.repository.msg.TradeContract1.SettlementCurrency);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Account
	 * AccountIdentification.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccount24#Identification
	 * CashAccount24.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount25#Identification
	 * CashAccount25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#Identification
	 * AccountForAction1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#Identification
	 * AccountForAction2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#Identification
	 * CustomerAccount5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Identification
	 * CustomerAccountModification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#Identification
	 * CustomerAccount4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#Account
	 * IdentificationInformation2.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#Identification
	 * SecuritiesAccount19.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#CashAccountIdentification
	 * CashCollateral5.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DebitAccount
	 * CashAccountCharacteristics2.DebitAccount}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount24.Identification, com.tools20022.repository.msg.CashAccount25.Identification, com.tools20022.repository.msg.AccountForAction1.Identification,
					com.tools20022.repository.msg.AccountForAction2.Identification, com.tools20022.repository.msg.CustomerAccount5.Identification, com.tools20022.repository.msg.CustomerAccountModification1.Identification,
					com.tools20022.repository.msg.CustomerAccount4.Identification, com.tools20022.repository.msg.IdentificationInformation2.Account, com.tools20022.repository.msg.SecuritiesAccount19.Identification,
					com.tools20022.repository.msg.CashCollateral5.CashAccountIdentification, com.tools20022.repository.msg.CashAccountCharacteristics2.DebitAccount);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account for which one or more sub-accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#SubAccount
	 * Account.SubAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#ParentAccount
	 * CashAccountCharacteristics2.ParentAccount}</li>
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
	public static final MMBusinessAssociationEnd ParentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.ParentAccount);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SubAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#ParentAccount
	 * Account.ParentAccount}</li>
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
	public static final MMBusinessAssociationEnd SubAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ParentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund processing characteristics for which a settlement account is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#Account
	 * AccountStatus.Account}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountStatus.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to an account and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#Account
	 * AccountPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> AccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an account is specified in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#Account
	 * TradePartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd TradePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Currency
	 * CustomerAccountModification1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountBalanceCurrencyCode
	 * CashAccountCharacteristics2.AccountBalanceCurrencyCode}</li>
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
	public static final MMBusinessAttribute ReportingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccountModification1.Currency, com.tools20022.repository.msg.CashAccountCharacteristics2.AccountBalanceCurrencyCode);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Restriction on capability or operations allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#Account
	 * AccountRestriction.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#Restriction
	 * CustomerAccount5.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Restriction
	 * CustomerAccountModification1.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#Restriction
	 * CustomerAccount4.Restriction}</li>
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
	public static final MMBusinessAssociationEnd AccountRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.Restriction, com.tools20022.repository.msg.CustomerAccountModification1.Restriction,
					com.tools20022.repository.msg.CustomerAccount4.Restriction);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role of the party which uses the account for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#SettlementAccount
	 * SettlementPartyRole.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd SettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#AccountPurpose
	 * CustomerAccount5.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PurposeModification1#Purpose
	 * PurposeModification1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#AccountPurpose
	 * CustomerAccountModification1.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#AccountPurpose
	 * CustomerAccount4.AccountPurpose}</li>
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
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.AccountPurpose, com.tools20022.repository.msg.PurposeModification1.Purpose,
					com.tools20022.repository.msg.CustomerAccountModification1.AccountPurpose, com.tools20022.repository.msg.CustomerAccount4.AccountPurpose);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#ClosingDate
	 * CustomerAccount5.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#ClosingDate
	 * CustomerAccountModification1.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#ClosingDate
	 * CustomerAccount4.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#ClosingDate
	 * AccountContract3.ClosingDate}</li>
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
	public static final MMBusinessAttribute ClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.ClosingDate, com.tools20022.repository.msg.CustomerAccountModification1.ClosingDate,
					com.tools20022.repository.msg.CustomerAccount4.ClosingDate, com.tools20022.repository.msg.AccountContract3.ClosingDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#GoLiveDate
	 * AccountContract3.GoLiveDate}</li>
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
	public static final MMBusinessAttribute LiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract3.GoLiveDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the period for which the movements in the account are reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Account
	 * DateTimePeriod.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#FromToDate
	 * AccountNotification12.FromToDate}</li>
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
	public static final MMBusinessAssociationEnd ReportedPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountNotification12.FromToDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party role for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#Account
	 * InvestmentFundPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFundPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral data for which a collateral account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
	 * Collateral.CollateralAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedCollateralProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
	 * GenericIdentification.Account}</li>
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
	public static final MMBusinessAssociationEnd Type = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proceeds delivery instruction which contain account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
	 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedProceedsDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an account is specified in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#Account
	 * CorporateActionPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a default fund account at an ICSD or at the
	 * central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DefaultFundAccount
	 * ClearingMemberRole.DefaultFundAccount}</li>
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
	public static final MMBusinessAssociationEnd DefaultFundAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System where the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Account
	 * System.Account}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Balance#Account
	 * Balance.Account}</li>
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
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Account
	 * Entry.Account}</li>
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
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement which provides information on the account and on the services
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#Account
	 * AccountContract.Account}</li>
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
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute OpeningDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate used to calculate the difference between amounts based on the base
	 * currency and the reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
	 * CurrencyExchange.ReportedAccount}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.ReportedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Default fund contribution parameters associated with a contribution
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ContributionAccount
	 * DefaultFundContribution.ContributionAccount}</li>
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
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Member of a system which is the owner of an account with the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#Account
	 * SystemMemberRole.Account}</li>
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
	public static final MMBusinessAssociationEnd SystemMember = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute CollateralAccountType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}
	};
	/**
	 * Services linked to the account and specified in the account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#Account
	 * AccountService.Account}</li>
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
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#Account
	 * Reconciliation.Account}</li>
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
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#Account
	 * ManagedAccountProduct.Account}</li>
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
	public static final MMBusinessAssociationEnd ManagedAccountProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Account, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount,
						com.tools20022.repository.entity.Account.ParentAccount, com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.AccountIdentification.Account,
						com.tools20022.repository.entity.DateTimePeriod.Account, com.tools20022.repository.entity.AccountPartyRole.Account, com.tools20022.repository.entity.AccountService.Account,
						com.tools20022.repository.entity.AccountStatus.Account, com.tools20022.repository.entity.AccountContract.Account, com.tools20022.repository.entity.Entry.Account,
						com.tools20022.repository.entity.InvestmentFundPartyRole.Account, com.tools20022.repository.entity.TradePartyRole.Account, com.tools20022.repository.entity.System.Account,
						com.tools20022.repository.entity.SystemMemberRole.Account, com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount, com.tools20022.repository.entity.AccountRestriction.Account, com.tools20022.repository.entity.CurrencyExchange.ReportedAccount,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount,
						com.tools20022.repository.entity.CorporateActionPartyRole.Account, com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount, com.tools20022.repository.entity.Reconciliation.Account,
						com.tools20022.repository.entity.ManagedAccountProduct.Account);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IdentificationModification2.OriginalPartyAndAccountIdentification,
						com.tools20022.repository.msg.IdentificationModification2.UpdatedPartyAndAccountIdentification, com.tools20022.repository.msg.IdentificationVerification2.PartyAndAccountIdentification);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.BaseCurrency, com.tools20022.repository.entity.Account.Identification, com.tools20022.repository.entity.Account.ParentAccount,
						com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics, com.tools20022.repository.entity.Account.Status,
						com.tools20022.repository.entity.Account.Language, com.tools20022.repository.entity.Account.PartyRole, com.tools20022.repository.entity.Account.TradePartyRole,
						com.tools20022.repository.entity.Account.ReportingCurrency, com.tools20022.repository.entity.Account.AccountRestriction, com.tools20022.repository.entity.Account.SettlementPartyRole,
						com.tools20022.repository.entity.Account.Purpose, com.tools20022.repository.entity.Account.ClosingDate, com.tools20022.repository.entity.Account.LiveDate, com.tools20022.repository.entity.Account.ReportedPeriod,
						com.tools20022.repository.entity.Account.InvestmentFundPartyRole, com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.Account.Type,
						com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.Account.RelatedCorporateActionPartyRole, com.tools20022.repository.entity.Account.DefaultFundAccountOwner,
						com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Account.AccountContract,
						com.tools20022.repository.entity.Account.OpeningDate, com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Account.DefaultFundContribution,
						com.tools20022.repository.entity.Account.SystemMember, com.tools20022.repository.entity.Account.CollateralAccountType, com.tools20022.repository.entity.Account.AccountService,
						com.tools20022.repository.entity.Account.Reconciliation, com.tools20022.repository.entity.Account.ManagedAccountProduct);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationInformation2.mmObject(), IdentificationModification2.mmObject(), IdentificationVerification2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}