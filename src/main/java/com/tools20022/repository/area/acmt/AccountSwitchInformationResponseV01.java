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
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AccountSwitchInformationResponse message is sent by the account servicer
 * that previously held the account to the new account servicer to signal
 * whether the account owner's account can be switched and to pass details of
 * payment arrangements to be transferred to the new account servicer if the
 * account may be switched. Confirmation of the balance transfer window is
 * permitted by the old account servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmMessageIdentification
 * AccountSwitchInformationResponseV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmAccountSwitchDetails
 * AccountSwitchInformationResponseV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmNewAccount
 * AccountSwitchInformationResponseV01.mmNewAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmOldAccount
 * AccountSwitchInformationResponseV01.mmOldAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmPaymentInstruction
 * AccountSwitchInformationResponseV01.mmPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmDirectDebitInstruction
 * AccountSwitchInformationResponseV01.mmDirectDebitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmSupplementaryData
 * AccountSwitchInformationResponseV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctSwtchInfRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.028.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT3</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountSwitchInformationResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountSwitchInformationResponse message is sent by the account servicer that previously held the account to the new account servicer to signal whether the account owner's account can be switched and to pass details of payment arrangements to be transferred to the new account servicer if the account may be switched. Confirmation of the balance transfer window is permitted by the old account servicer."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSwitchInformationResponseV01", propOrder = {"messageIdentification", "accountSwitchDetails", "newAccount", "oldAccount", "paymentInstruction", "directDebitInstruction", "supplementaryData"})
public class AccountSwitchInformationResponseV01 {

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
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, MessageIdentification1 value) {
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
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, AccountSwitchDetails1> mmAccountSwitchDetails = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, AccountSwitchDetails1>() {
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
		public AccountSwitchDetails1 getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getAccountSwitchDetails();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, AccountSwitchDetails1 value) {
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
	 * "New account to which the switch will be made (destination account)."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, CashAccount36> mmNewAccount = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, CashAccount36>() {
		{
			xmlTag = "NewAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAccount";
			definition = "New account to which the switch will be made (destination account).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount36.mmObject();
		}

		@Override
		public CashAccount36 getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getNewAccount();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, CashAccount36 value) {
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
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, CashAccount36> mmOldAccount = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, CashAccount36>() {
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
		public CashAccount36 getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getOldAccount();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, CashAccount36 value) {
			obj.setOldAccount(value);
		}
	};
	@XmlElement(name = "PmtInstr")
	protected List<PaymentInstruction24> paymentInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24
	 * PaymentInstruction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of debit payment arrangements associated with the old account. For example the payment may be a standing order, a bill payment arrangement or a future dated payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<PaymentInstruction24>> mmPaymentInstruction = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<PaymentInstruction24>>() {
		{
			xmlTag = "PmtInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstruction";
			definition = "Details of debit payment arrangements associated with the old account. For example the payment may be a standing order, a bill payment arrangement or a future dated payment.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstruction24.mmObject();
		}

		@Override
		public List<PaymentInstruction24> getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getPaymentInstruction();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, List<PaymentInstruction24> value) {
			obj.setPaymentInstruction(value);
		}
	};
	@XmlElement(name = "DrctDbtInstr")
	protected List<DirectDebitInstructionDetails1> directDebitInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a direct debit instruction associated with the old account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<DirectDebitInstructionDetails1>> mmDirectDebitInstruction = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<DirectDebitInstructionDetails1>>() {
		{
			xmlTag = "DrctDbtInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitInstruction";
			definition = "Details of a direct debit instruction associated with the old account.";
			minOccurs = 0;
			complexType_lazy = () -> DirectDebitInstructionDetails1.mmObject();
		}

		@Override
		public List<DirectDebitInstructionDetails1> getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getDirectDebitInstruction();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, List<DirectDebitInstructionDetails1> value) {
			obj.setDirectDebitInstruction(value);
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
	public static final MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AccountSwitchInformationResponseV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountSwitchInformationResponseV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountSwitchInformationResponseV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT3"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountSwitchInformationResponseV01";
				definition = "The AccountSwitchInformationResponse message is sent by the account servicer that previously held the account to the new account servicer to signal whether the account owner's account can be switched and to pass details of payment arrangements to be transferred to the new account servicer if the account may be switched. Confirmation of the balance transfer window is permitted by the old account servicer.";
				rootElement = "Document";
				xmlTag = "AcctSwtchInfRspn";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmAccountSwitchDetails, com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmNewAccount,
						com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmOldAccount, com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmPaymentInstruction,
						com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmDirectDebitInstruction, com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "028";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountSwitchInformationResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountSwitchInformationResponseV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public AccountSwitchDetails1 getAccountSwitchDetails() {
		return accountSwitchDetails;
	}

	public AccountSwitchInformationResponseV01 setAccountSwitchDetails(AccountSwitchDetails1 accountSwitchDetails) {
		this.accountSwitchDetails = Objects.requireNonNull(accountSwitchDetails);
		return this;
	}

	public CashAccount36 getNewAccount() {
		return newAccount;
	}

	public AccountSwitchInformationResponseV01 setNewAccount(CashAccount36 newAccount) {
		this.newAccount = Objects.requireNonNull(newAccount);
		return this;
	}

	public CashAccount36 getOldAccount() {
		return oldAccount;
	}

	public AccountSwitchInformationResponseV01 setOldAccount(CashAccount36 oldAccount) {
		this.oldAccount = Objects.requireNonNull(oldAccount);
		return this;
	}

	public List<PaymentInstruction24> getPaymentInstruction() {
		return paymentInstruction == null ? paymentInstruction = new ArrayList<>() : paymentInstruction;
	}

	public AccountSwitchInformationResponseV01 setPaymentInstruction(List<PaymentInstruction24> paymentInstruction) {
		this.paymentInstruction = Objects.requireNonNull(paymentInstruction);
		return this;
	}

	public List<DirectDebitInstructionDetails1> getDirectDebitInstruction() {
		return directDebitInstruction == null ? directDebitInstruction = new ArrayList<>() : directDebitInstruction;
	}

	public AccountSwitchInformationResponseV01 setDirectDebitInstruction(List<DirectDebitInstructionDetails1> directDebitInstruction) {
		this.directDebitInstruction = Objects.requireNonNull(directDebitInstruction);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSwitchInformationResponseV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.028.001.01")
	static public class Document {
		@XmlElement(name = "AcctSwtchInfRspn", required = true)
		public AccountSwitchInformationResponseV01 messageBody;
	}
}