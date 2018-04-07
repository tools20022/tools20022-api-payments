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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount36;
import com.tools20022.repository.msg.IndividualPerson19;
import com.tools20022.repository.msg.Organisation20;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the new account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NewAccount1#mmAccount
 * NewAccount1.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NewAccount1#mmAccountParty
 * NewAccount1.mmAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NewAccount1#mmOrganisation
 * NewAccount1.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01#mmNewAccount
 * AccountSwitchInformationRequestV01.mmNewAccount}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the new account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NewAccount1", propOrder = {"account", "accountParty", "organisation"})
public class NewAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CashAccount36 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount36
	 * CashAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewAccount1 NewAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the new account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewAccount1, CashAccount36> mmAccount = new MMMessageAssociationEnd<NewAccount1, CashAccount36>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NewAccount1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Details of the new account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount36.mmObject();
		}

		@Override
		public CashAccount36 getValue(NewAccount1 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(NewAccount1 obj, CashAccount36 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "AcctPty", required = true)
	protected List<IndividualPerson19> accountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson19
	 * IndividualPerson19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
	 * ContactPersonRole.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewAccount1 NewAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party or parties to be identified in the context of account operations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewAccount1, List<IndividualPerson19>> mmAccountParty = new MMMessageAssociationEnd<NewAccount1, List<IndividualPerson19>>() {
		{
			businessElementTrace_lazy = () -> ContactPersonRole.mmPerson;
			componentContext_lazy = () -> com.tools20022.repository.msg.NewAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParty";
			definition = "Party or parties to be identified in the context of account operations.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson19.mmObject();
		}

		@Override
		public List<IndividualPerson19> getValue(NewAccount1 obj) {
			return obj.getAccountParty();
		}

		@Override
		public void setValue(NewAccount1 obj, List<IndividualPerson19> value) {
			obj.setAccountParty(value);
		}
	};
	@XmlElement(name = "Org")
	protected Organisation20 organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation20
	 * Organisation20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmPartyRole
	 * Account.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewAccount1 NewAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewAccount1, Optional<Organisation20>> mmOrganisation = new MMMessageAssociationEnd<NewAccount1, Optional<Organisation20>>() {
		{
			businessElementTrace_lazy = () -> Account.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.NewAccount1.mmObject();
			isDerived = false;
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation20.mmObject();
		}

		@Override
		public Optional<Organisation20> getValue(NewAccount1 obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(NewAccount1 obj, Optional<Organisation20> value) {
			obj.setOrganisation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewAccount1.mmAccount, com.tools20022.repository.msg.NewAccount1.mmAccountParty, com.tools20022.repository.msg.NewAccount1.mmOrganisation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountSwitchInformationRequestV01.mmNewAccount);
				trace_lazy = () -> Account.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NewAccount1";
				definition = "Information about the new account.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount36 getAccount() {
		return account;
	}

	public NewAccount1 setAccount(CashAccount36 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<IndividualPerson19> getAccountParty() {
		return accountParty == null ? accountParty = new ArrayList<>() : accountParty;
	}

	public NewAccount1 setAccountParty(List<IndividualPerson19> accountParty) {
		this.accountParty = Objects.requireNonNull(accountParty);
		return this;
	}

	public Optional<Organisation20> getOrganisation() {
		return organisation == null ? Optional.empty() : Optional.of(organisation);
	}

	public NewAccount1 setOrganisation(Organisation20 organisation) {
		this.organisation = organisation;
		return this;
	}
}