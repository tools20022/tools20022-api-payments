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
import com.tools20022.repository.choice.CodeOrProprietary1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Restriction1;
import com.tools20022.repository.msg.RestrictionModification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Restriction on capability or operations allowed.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountRestriction" src="doc-files/AccountRestriction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
 * AccountRestriction.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmRestrictionType
 * AccountRestriction.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmValidityPeriod
 * AccountRestriction.mmValidityPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
 * Account.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccountRestriction
 * DateTimePeriod.mmAccountRestriction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#mmRestrictionType
 * Restriction1.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RestrictionModification1#mmRestriction
 * RestrictionModification1.mmRestriction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CodeOrProprietary1Choice
 * CodeOrProprietary1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Restriction1 Restriction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RestrictionModification1
 * RestrictionModification1}</li>
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
 * "AccountRestriction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restriction on capability or operations allowed."</li>
 * </ul>
 */
public class AccountRestriction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
	 * Account.mmAccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which restrictions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountRestriction, Optional<Account>> mmAccount = new MMBusinessAssociationEnd<AccountRestriction, Optional<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account on which restrictions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Account.mmAccountRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Optional<Account> getValue(AccountRestriction obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountRestriction obj, Optional<Account> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	protected Max35Text restrictionType;
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
	 * {@linkplain com.tools20022.repository.choice.CodeOrProprietary1Choice#mmCode
	 * CodeOrProprietary1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CodeOrProprietary1Choice#mmProprietary
	 * CodeOrProprietary1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the restriction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountRestriction, Max35Text> mmRestrictionType = new MMBusinessAttribute<AccountRestriction, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CodeOrProprietary1Choice.mmCode, CodeOrProprietary1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountRestriction obj) {
			return obj.getRestrictionType();
		}

		@Override
		public void setValue(AccountRestriction obj, Max35Text value) {
			obj.setRestrictionType(value);
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccountRestriction
	 * DateTimePeriod.mmAccountRestriction}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the restriction is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountRestriction, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<AccountRestriction, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the restriction is effective.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmAccountRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(AccountRestriction obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(AccountRestriction obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountRestriction";
				definition = "Restriction on capability or operations allowed.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmAccountRestriction, DateTimePeriod.mmAccountRestriction);
				derivationElement_lazy = () -> Arrays.asList(Restriction1.mmRestrictionType, RestrictionModification1.mmRestriction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountRestriction.mmAccount, com.tools20022.repository.entity.AccountRestriction.mmRestrictionType,
						com.tools20022.repository.entity.AccountRestriction.mmValidityPeriod);
				derivationComponent_lazy = () -> Arrays.asList(CodeOrProprietary1Choice.mmObject(), Restriction1.mmObject(), RestrictionModification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountRestriction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Account> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public AccountRestriction setAccount(Account account) {
		this.account = account;
		return this;
	}

	public Max35Text getRestrictionType() {
		return restrictionType;
	}

	public AccountRestriction setRestrictionType(Max35Text restrictionType) {
		this.restrictionType = Objects.requireNonNull(restrictionType);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public AccountRestriction setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}
}