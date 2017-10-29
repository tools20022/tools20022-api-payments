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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccount" src="doc-files/InvestmentAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountType
 * InvestmentAccount.InvestmentAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#OwnershipType
 * InvestmentAccount.OwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#Designation
 * InvestmentAccount.Designation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#ReferenceCurrency
 * InvestmentAccount.ReferenceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundClass
 * InvestmentAccount.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
 * InvestmentAccount.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
 * InvestmentAccount.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTax
 * InvestmentAccount.InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
 * InvestmentAccount.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SidePocket
 * InvestmentAccount.SidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountPartyRole
 * InvestmentAccount.InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#DebitPortfolioTransfer
 * InvestmentAccount.DebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CreditPortfolioTransfer
 * InvestmentAccount.CreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#AccountForInvestmentFundProcessing
 * InvestmentAccount.AccountForInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountContract
 * InvestmentAccount.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#AccountUsageType
 * InvestmentAccount.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount#Category
 * InvestmentAccount.Category}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount#Portfolio
 * InvestmentAccount.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#RelatedPortfolioTransfer
 * InvestmentAccount.RelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentAccount
 * InvestmentFundClass.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
 * CashAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
 * SecuritiesAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#InvestmentAccount
 * InvestmentAccountContract.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#InvestmentAccount
 * InvestmentAccountPartyRole.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#InvestmentAccount
 * InvestmentFundTax.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
 * InvestmentFundTransaction.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountFrom
 * PortfolioTransfer.AccountFrom}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountTo
 * PortfolioTransfer.AccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#NomineeAccount
 * PortfolioTransfer.NomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Account
 * Portfolio.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#InvestmentAccount
 * SidePocket.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#MainFundOrderDeskAccount
 * FundOrderDesk.MainFundOrderDeskAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
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
 * "InvestmentAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
public class InvestmentAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the account/source fund type. This is typically linked to an
	 * investment product, eg, wrapper, PEP, ISA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentAccountType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundCashAccountCode.mmObject();
		}
	};
	/**
	 * Ownership status of the account, eg, joint owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ownership status of the account, eg, joint owners."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnershipType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountOwnershipTypeCode.mmObject();
		}
	};
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to be
	 * reconciled individually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Designation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReferenceCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Investment fund classes held in an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentAccount
	 * InvestmentFundClass.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund classes held in an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund classes held in an investment account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Part of the investment account to or from which cash entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
	 * CashAccount.RelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Part of the investment account to or from which securities entries are
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
	 * SecuritiesAccount.RelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which securities entries are made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Taxes specific to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#InvestmentAccount
	 * InvestmentFundTax.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxes specific to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTax";
			definition = "Taxes specific to the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund transaction which uses the investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
	 * InvestmentFundTransaction.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction which uses the investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction which uses the investment account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Separate account containing illiquid assets of a hedge fund portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#InvestmentAccount
	 * SidePocket.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate account containing illiquid assets of a hedge fund portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocket";
			definition = "Separate account containing illiquid assets of a hedge fund portfolio.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to an investment account and played by a party
	 * in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#InvestmentAccount
	 * InvestmentAccountPartyRole.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountPartyRole";
			definition = "Specifies each role linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process for which a debit investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountFrom
	 * PortfolioTransfer.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a debit investment account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DebitPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitPortfolioTransfer";
			definition = "Transfer process for which a debit investment account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountFrom;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process for which a beneficiary investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountTo
	 * PortfolioTransfer.AccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a beneficiary investment account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditPortfolioTransfer";
			definition = "Transfer process for which a beneficiary investment account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order desk for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#MainFundOrderDeskAccount
	 * FundOrderDesk.MainFundOrderDeskAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundOrderDesk
	 * FundOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountForInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order desk for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountForInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountForInvestmentFundProcessing";
			definition = "Order desk for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FundOrderDesk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract defining the related account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#InvestmentAccount
	 * InvestmentAccountContract.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract defining the related account"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract defining the related account";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the account is used for investment or for settlement
	 * purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the account is used for investment or for settlement purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountUsageType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies whether the account is used for investment or for settlement purpose.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountUsageTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the investment account category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
	 * InvestmentAccountCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the investment account category."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Category = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the investment account category.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestmentAccountCategoryCode.mmObject();
		}
	};
	/**
	 * Portfolio held on an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Account
	 * Portfolio.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio held on an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio held on an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer of a portfolio held on a nominee account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#NomineeAccount
	 * PortfolioTransfer.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of a portfolio held on a nominee account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Transfer of a portfolio held on a nominee account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.PortfolioTransfer.AccountFrom, com.tools20022.repository.entity.PortfolioTransfer.AccountTo,
						com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount, com.tools20022.repository.entity.Portfolio.Account, com.tools20022.repository.entity.SidePocket.InvestmentAccount,
						com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountType, com.tools20022.repository.entity.InvestmentAccount.OwnershipType,
						com.tools20022.repository.entity.InvestmentAccount.Designation, com.tools20022.repository.entity.InvestmentAccount.ReferenceCurrency, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTax,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.SidePocket,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountPartyRole, com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.AccountForInvestmentFundProcessing,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccount.AccountUsageType, com.tools20022.repository.entity.InvestmentAccount.Category,
						com.tools20022.repository.entity.InvestmentAccount.Portfolio, com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer);
			}
		});
		return mmObject_lazy.get();
	}
}