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
 * The AccountSwitchRequestPayment message is sent by the old account servicer
 * to the new account servicer after the completion of the account switch to
 * request the transfer of funds for a payment that the previous account
 * servicer has had to make from the old account (for example: the settlement of
 * a card transaction that was authorised offline).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmMessageIdentification
 * AccountSwitchRequestPaymentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmAccountSwitchDetails
 * AccountSwitchRequestPaymentV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmOldAccount
 * AccountSwitchRequestPaymentV01.mmOldAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmCreditInstructions
 * AccountSwitchRequestPaymentV01.mmCreditInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmSupplementaryData
 * AccountSwitchRequestPaymentV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctSwtchReqPmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.034.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT3</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountSwitchRequestPaymentV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountSwitchRequestPayment message is sent by the old account servicer to the new account servicer after the completion of the account switch to request the transfer of funds for a payment that the previous account servicer has had to make from the old account (for example: the settlement of a card transaction that was authorised offline)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSwitchRequestPaymentV01", propOrder = {"messageIdentification", "accountSwitchDetails", "oldAccount", "creditInstructions", "supplementaryData"})
public class AccountSwitchRequestPaymentV01 {

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
	public static final MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(AccountSwitchRequestPaymentV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountSwitchRequestPaymentV01 obj, MessageIdentification1 value) {
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
	 * "Contains information about the details of the account switch and a response code to the original payment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, AccountSwitchDetails1> mmAccountSwitchDetails = new MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, AccountSwitchDetails1>() {
		{
			xmlTag = "AcctSwtchDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSwitchDetails";
			definition = "Contains information about the details of the account switch and a response code to the original payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountSwitchDetails1.mmObject();
		}

		@Override
		public AccountSwitchDetails1 getValue(AccountSwitchRequestPaymentV01 obj) {
			return obj.getAccountSwitchDetails();
		}

		@Override
		public void setValue(AccountSwitchRequestPaymentV01 obj, AccountSwitchDetails1 value) {
			obj.setAccountSwitchDetails(value);
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
	public static final MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, CashAccount36> mmOldAccount = new MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, CashAccount36>() {
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
		public CashAccount36 getValue(AccountSwitchRequestPaymentV01 obj) {
			return obj.getOldAccount();
		}

		@Override
		public void setValue(AccountSwitchRequestPaymentV01 obj, CashAccount36 value) {
			obj.setOldAccount(value);
		}
	};
	@XmlElement(name = "CdtInstrs", required = true)
	protected CreditTransferTransaction27 creditInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27
	 * CreditTransferTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific information relating to a request for payment, including details that enable the receiving account servicer to reconcile the payment to be received with the original payment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, CreditTransferTransaction27> mmCreditInstructions = new MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, CreditTransferTransaction27>() {
		{
			xmlTag = "CdtInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstructions";
			definition = "Specific information relating to a request for payment, including details that enable the receiving account servicer to reconcile the payment to be received with the original payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction27.mmObject();
		}

		@Override
		public CreditTransferTransaction27 getValue(AccountSwitchRequestPaymentV01 obj) {
			return obj.getCreditInstructions();
		}

		@Override
		public void setValue(AccountSwitchRequestPaymentV01 obj, CreditTransferTransaction27 value) {
			obj.setCreditInstructions(value);
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
	public static final MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AccountSwitchRequestPaymentV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountSwitchRequestPaymentV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountSwitchRequestPaymentV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT3"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountSwitchRequestPaymentV01";
				definition = "The AccountSwitchRequestPayment message is sent by the old account servicer to the new account servicer after the completion of the account switch to request the transfer of funds for a payment that the previous account servicer has had to make from the old account (for example: the settlement of a card transaction that was authorised offline).";
				rootElement = "Document";
				xmlTag = "AcctSwtchReqPmt";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01.mmAccountSwitchDetails, com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01.mmOldAccount,
						com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01.mmCreditInstructions, com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "034";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountSwitchRequestPaymentV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountSwitchRequestPaymentV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public AccountSwitchDetails1 getAccountSwitchDetails() {
		return accountSwitchDetails;
	}

	public AccountSwitchRequestPaymentV01 setAccountSwitchDetails(AccountSwitchDetails1 accountSwitchDetails) {
		this.accountSwitchDetails = Objects.requireNonNull(accountSwitchDetails);
		return this;
	}

	public CashAccount36 getOldAccount() {
		return oldAccount;
	}

	public AccountSwitchRequestPaymentV01 setOldAccount(CashAccount36 oldAccount) {
		this.oldAccount = Objects.requireNonNull(oldAccount);
		return this;
	}

	public CreditTransferTransaction27 getCreditInstructions() {
		return creditInstructions;
	}

	public AccountSwitchRequestPaymentV01 setCreditInstructions(CreditTransferTransaction27 creditInstructions) {
		this.creditInstructions = Objects.requireNonNull(creditInstructions);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSwitchRequestPaymentV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.034.001.01")
	static public class Document {
		@XmlElement(name = "AcctSwtchReqPmt", required = true)
		public AccountSwitchRequestPaymentV01 messageBody;
	}
}