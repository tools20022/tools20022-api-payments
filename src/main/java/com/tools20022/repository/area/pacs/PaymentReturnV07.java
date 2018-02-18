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

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.GroupHeader72;
import com.tools20022.repository.msg.OriginalGroupHeader2;
import com.tools20022.repository.msg.PaymentTransaction76;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The PaymentReturn message is sent by an agent to the previous agent in the
 * payment chain to undo a payment previously settled.<br>
 * <b>Usage</b><br>
 * The PaymentReturn message is exchanged between agents to return funds after
 * settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer
 * message and FinancialInstitutionCreditTransfer message) or direct debit
 * instructions (FIToFICustomerDirectDebit message).<br>
 * The PaymentReturn message should not be used between agents and non-financial
 * institution customers. Non-financial institution customers will be informed
 * about a debit or a credit on their account(s) through a
 * BankToCustomerDebitCreditNotification message ('notification') and/or
 * BankToCustomerAccountReport/BankToCustomerStatement message ('statement').<br>
 * The PaymentReturn message can be used to return single instructions or
 * multiple instructions from one or different files.<br>
 * The PaymentReturn message can be used in domestic and cross-border scenarios.<br>
 * The PaymentReturn message refers to the original instruction(s) by means of
 * references only or by means of references and a set of elements from the
 * original instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#mmGroupHeader
 * PaymentReturnV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#mmOriginalGroupInformation
 * PaymentReturnV07.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#mmTransactionInformation
 * PaymentReturnV07.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#mmSupplementaryData
 * PaymentReturnV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PmtRtr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.004.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forPaymentReturnV07
 * ConstraintInstructedAgentRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forPaymentReturnV07
 * ConstraintInstructingAgentRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule#forPaymentReturnV07
 * ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule#forPaymentReturnV07
 * ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV07
 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule#forPaymentReturnV07
 * ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.
 * forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule#forPaymentReturnV07
 * ConstraintOriginalGroupInformationRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV07
 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV07
 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forPaymentReturnV07
 * ConstraintTransactionInterbankSettlementDateRule.forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule#forPaymentReturnV07
 * ConstraintGroupReturnAndTransactionInformationNotPresentRule.
 * forPaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule#forPaymentReturnV07
 * ConstraintGroupReturnAndTransactionInformationPresentRule.forPaymentReturnV07
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV07
 * ConstraintSupplementaryDataRule.forPaymentReturnV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnV07", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class PaymentReturnV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader72 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader72
	 * GroupHeader72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader72.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV07.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupHeader2 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
	 * OriginalGroupHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV07.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction76> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76
	 * PaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transactions, to which the return message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the return message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction76.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV07.class.getMethod("getTransactionInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forPaymentReturnV07, com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV07, com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.forPaymentReturnV07, com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV07, com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule.forPaymentReturnV07,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule.forPaymentReturnV07, com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnV07";
				definition = "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.";
				rootElement = "Document";
				xmlTag = "PmtRtr";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentReturnV07.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentReturnV07.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.PaymentReturnV07.mmTransactionInformation, com.tools20022.repository.area.pacs.PaymentReturnV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "004";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentReturnV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader72 getGroupHeader() {
		return groupHeader;
	}

	public PaymentReturnV07 setGroupHeader(GroupHeader72 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public Optional<OriginalGroupHeader2> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentReturnV07 setOriginalGroupInformation(OriginalGroupHeader2 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public List<PaymentTransaction76> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public PaymentReturnV07 setTransactionInformation(List<PaymentTransaction76> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PaymentReturnV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.07")
	static public class Document {
		@XmlElement(name = "PmtRtr", required = true)
		public PaymentReturnV07 messageBody;
	}
}