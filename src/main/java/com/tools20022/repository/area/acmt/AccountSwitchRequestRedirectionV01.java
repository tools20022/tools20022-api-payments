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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.AccountSwitchDetails1;
import com.tools20022.repository.msg.CashAccount36;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AccountSwitchRequestRedirection message is sent by the new account
 * servicer to a central account switch servicer to set up the redirection of
 * payment and collection transactions that are processed after completion of
 * the account switch. It is routed to the previous account servicer to signal
 * that it should schedule the cancellation of all payment arrangements on the
 * old account. This message may also be used by the new bank to amend the new
 * account details, if the details previously provided were incorrect.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmMessageIdentification
 * AccountSwitchRequestRedirectionV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmAccountSwitchDetails
 * AccountSwitchRequestRedirectionV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmNewAccount
 * AccountSwitchRequestRedirectionV01.mmNewAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmOldAccount
 * AccountSwitchRequestRedirectionV01.mmOldAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmSupplementaryData
 * AccountSwitchRequestRedirectionV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctSwtchReqRdrctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.030.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT3</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountSwitchRequestRedirectionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountSwitchRequestRedirection message is sent by the new account servicer to a central account switch servicer to set up the redirection of payment and collection transactions that are processed after completion of the account switch.  It is routed to the previous account servicer to signal that it should schedule the cancellation of all payment arrangements on the old account. This message may also be used by the new bank to amend the new account details, if the details previously provided were incorrect."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSwitchRequestRedirectionV01", propOrder = {"messageIdentification", "accountSwitchDetails", "newAccount", "oldAccount", "supplementaryData"})
public class AccountSwitchRequestRedirectionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountSwitchRequestRedirectionV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountSwitchRequestRedirectionV01 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "AcctSwtchDtls", required = true)
	protected AccountSwitchDetails1 accountSwitchDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSwtchDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSwitchDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains information about the details of the account switch."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, AccountSwitchDetails1> mmAccountSwitchDetails = new MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, AccountSwitchDetails1>() {
		{
			xmlTag = "AcctSwtchDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSwitchDetails";
			definition = "Contains information about the details of the account switch.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountSwitchDetails1.mmObject();
		}

		@Override
		public AccountSwitchDetails1 getValue(AccountSwitchRequestRedirectionV01 obj) {
			return obj.getAccountSwitchDetails();
		}

		@Override
		public void setValue(AccountSwitchRequestRedirectionV01 obj, AccountSwitchDetails1 value) {
			obj.setAccountSwitchDetails(value);
		}
	};
	@XmlElement(name = "NewAcct", required = true)
	protected CashAccount36 newAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer holding the account to which the switch will be made for example the acquiring account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, CashAccount36> mmNewAccount = new MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, CashAccount36>() {
		{
			xmlTag = "NewAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAccount";
			definition = "Account servicer holding the account to which the switch will be made for example the acquiring account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount36.mmObject();
		}

		@Override
		public CashAccount36 getValue(AccountSwitchRequestRedirectionV01 obj) {
			return obj.getNewAccount();
		}

		@Override
		public void setValue(AccountSwitchRequestRedirectionV01 obj, CashAccount36 value) {
			obj.setNewAccount(value);
		}
	};
	@XmlElement(name = "OdAcct", required = true)
	protected CashAccount36 oldAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held at the old account servicer being switched to the new account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, CashAccount36> mmOldAccount = new MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, CashAccount36>() {
		{
			xmlTag = "OdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldAccount";
			definition = "Account held at the old account servicer being switched to the new account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount36.mmObject();
		}

		@Override
		public CashAccount36 getValue(AccountSwitchRequestRedirectionV01 obj) {
			return obj.getOldAccount();
		}

		@Override
		public void setValue(AccountSwitchRequestRedirectionV01 obj, CashAccount36 value) {
			obj.setOldAccount(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AccountSwitchRequestRedirectionV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountSwitchRequestRedirectionV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountSwitchRequestRedirectionV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT3"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountSwitchRequestRedirectionV01";
				definition = "The AccountSwitchRequestRedirection message is sent by the new account servicer to a central account switch servicer to set up the redirection of payment and collection transactions that are processed after completion of the account switch.  It is routed to the previous account servicer to signal that it should schedule the cancellation of all payment arrangements on the old account. This message may also be used by the new bank to amend the new account details, if the details previously provided were incorrect.";
				rootElement = "Document";
				xmlTag = "AcctSwtchReqRdrctn";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01.mmAccountSwitchDetails, com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01.mmNewAccount,
						com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01.mmOldAccount, com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "030";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountSwitchRequestRedirectionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountSwitchRequestRedirectionV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public AccountSwitchDetails1 getAccountSwitchDetails() {
		return accountSwitchDetails;
	}

	public AccountSwitchRequestRedirectionV01 setAccountSwitchDetails(AccountSwitchDetails1 accountSwitchDetails) {
		this.accountSwitchDetails = Objects.requireNonNull(accountSwitchDetails);
		return this;
	}

	public CashAccount36 getNewAccount() {
		return newAccount;
	}

	public AccountSwitchRequestRedirectionV01 setNewAccount(CashAccount36 newAccount) {
		this.newAccount = Objects.requireNonNull(newAccount);
		return this;
	}

	public CashAccount36 getOldAccount() {
		return oldAccount;
	}

	public AccountSwitchRequestRedirectionV01 setOldAccount(CashAccount36 oldAccount) {
		this.oldAccount = Objects.requireNonNull(oldAccount);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSwitchRequestRedirectionV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.030.001.01")
	static public class Document {
		@XmlElement(name = "AcctSwtchReqRdrctn", required = true)
		public AccountSwitchRequestRedirectionV01 messageBody;
	}
}