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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.MarketInfrastructure;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Defines the link between the accounts held with a market infrastructure.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountLink" src="doc-files/AccountLink.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#mmCashAccount
 * AccountLink.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
 * AccountLink.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
 * AccountLink.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmMarketInfrastructure
 * AccountLink.mmMarketInfrastructure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCashSettlementIndicator
 * AccountLink.mmCashSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCollateralisationIndicator
 * AccountLink.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmDefaultIndicator
 * AccountLink.mmDefaultIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmAccountLink
 * CashAccount.mmAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
 * DateTimePeriod.mmRelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
 * SecuritiesAccount.mmAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#mmAccountLink
 * MarketInfrastructure.mmAccountLink}</li>
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
 * "AccountLink"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the link between the accounts held with a market infrastructure."</li>
 * </ul>
 */
public class AccountLink {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmAccountLink
	 * CashAccount.mmAccountLink}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account linked to a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountLink, CashAccount> mmCashAccount = new MMBusinessAssociationEnd<AccountLink, CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account linked to a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccount.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public CashAccount getValue(AccountLink obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(AccountLink obj, CashAccount value) {
			obj.setCashAccount(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
	 * DateTimePeriod.mmRelatedAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the period when the securities account is linked to the cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountLink, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<AccountLink, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Defines the period when the securities account is linked to the cash account.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(AccountLink obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(AccountLink obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected List<SecuritiesAccount> securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
	 * SecuritiesAccount.mmAccountLink}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities account linked to a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountLink, List<SecuritiesAccount>> mmSecuritiesAccount = new MMBusinessAssociationEnd<AccountLink, List<SecuritiesAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Securities account linked to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesAccount.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(AccountLink obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(AccountLink obj, List<SecuritiesAccount> value) {
			obj.setSecuritiesAccount(value);
		}
	};
	protected List<MarketInfrastructure> marketInfrastructure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#mmAccountLink
	 * MarketInfrastructure.mmAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure
	 * MarketInfrastructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the market infrastructure where the accounts are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountLink, List<MarketInfrastructure>> mmMarketInfrastructure = new MMBusinessAssociationEnd<AccountLink, List<MarketInfrastructure>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructure";
			definition = "Specifies the market infrastructure where the accounts are held.";
			minOccurs = 0;
			opposite_lazy = () -> MarketInfrastructure.mmAccountLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarketInfrastructure.mmObject();
		}

		@Override
		public List<MarketInfrastructure> getValue(AccountLink obj) {
			return obj.getMarketInfrastructure();
		}

		@Override
		public void setValue(AccountLink obj, List<MarketInfrastructure> value) {
			obj.setMarketInfrastructure(value);
		}
	};
	protected YesNoIndicator cashSettlementIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountLink, YesNoIndicator> mmCashSettlementIndicator = new MMBusinessAttribute<AccountLink, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashSettlementIndicator";
			definition = "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink obj) {
			return obj.getCashSettlementIndicator();
		}

		@Override
		public void setValue(AccountLink obj, YesNoIndicator value) {
			obj.setCashSettlementIndicator(value);
		}
	};
	protected YesNoIndicator collateralisationIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountLink, YesNoIndicator> mmCollateralisationIndicator = new MMBusinessAttribute<AccountLink, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink obj) {
			return obj.getCollateralisationIndicator();
		}

		@Override
		public void setValue(AccountLink obj, YesNoIndicator value) {
			obj.setCollateralisationIndicator(value);
		}
	};
	protected YesNoIndicator defaultIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether created account link is set as default for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountLink, YesNoIndicator> mmDefaultIndicator = new MMBusinessAttribute<AccountLink, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultIndicator";
			definition = "Specifies whether created account link is set as default for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink obj) {
			return obj.getDefaultIndicator();
		}

		@Override
		public void setValue(AccountLink obj, YesNoIndicator value) {
			obj.setDefaultIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountLink";
				definition = "Defines the link between the accounts held with a market infrastructure.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmAccountLink, DateTimePeriod.mmRelatedAccountLink, SecuritiesAccount.mmAccountLink, MarketInfrastructure.mmAccountLink);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountLink.mmCashAccount, com.tools20022.repository.entity.AccountLink.mmValidityPeriod, com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount,
						com.tools20022.repository.entity.AccountLink.mmMarketInfrastructure, com.tools20022.repository.entity.AccountLink.mmCashSettlementIndicator, com.tools20022.repository.entity.AccountLink.mmCollateralisationIndicator,
						com.tools20022.repository.entity.AccountLink.mmDefaultIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountLink.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public AccountLink setCashAccount(CashAccount cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public AccountLink setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount == null ? securitiesAccount = new ArrayList<>() : securitiesAccount;
	}

	public AccountLink setSecuritiesAccount(List<SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public List<MarketInfrastructure> getMarketInfrastructure() {
		return marketInfrastructure == null ? marketInfrastructure = new ArrayList<>() : marketInfrastructure;
	}

	public AccountLink setMarketInfrastructure(List<MarketInfrastructure> marketInfrastructure) {
		this.marketInfrastructure = Objects.requireNonNull(marketInfrastructure);
		return this;
	}

	public YesNoIndicator getCashSettlementIndicator() {
		return cashSettlementIndicator;
	}

	public AccountLink setCashSettlementIndicator(YesNoIndicator cashSettlementIndicator) {
		this.cashSettlementIndicator = Objects.requireNonNull(cashSettlementIndicator);
		return this;
	}

	public YesNoIndicator getCollateralisationIndicator() {
		return collateralisationIndicator;
	}

	public AccountLink setCollateralisationIndicator(YesNoIndicator collateralisationIndicator) {
		this.collateralisationIndicator = Objects.requireNonNull(collateralisationIndicator);
		return this;
	}

	public YesNoIndicator getDefaultIndicator() {
		return defaultIndicator;
	}

	public AccountLink setDefaultIndicator(YesNoIndicator defaultIndicator) {
		this.defaultIndicator = Objects.requireNonNull(defaultIndicator);
		return this;
	}
}