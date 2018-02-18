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
import com.tools20022.repository.msg.GroupHeader71;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.PaymentTransaction81;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent
 * by an agent to the next party in the payment chain. It is used to reverse a
 * payment previously executed.<br>
 * <b>Usage</b><br>
 * The FIToFIPaymentReversal message is exchanged between agents to reverse a
 * payment message that has been settled. The result will be a credit on the
 * debtor account (when the reversed payment was a Direct Debit) or a debit on
 * the creditor account (when the reversed payment was a Credit Transfer).<br>
 * The FIToFIPaymentReversal message may or may not be the follow-up of a
 * payment message.<br>
 * The FIToFIPaymentReversal message refers to the original payment message by
 * means of references only or by means of references and a set of elements from
 * the original instruction.<br>
 * The FIToFIPaymentReversal message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmGroupHeader
 * FIToFIPaymentReversalV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmOriginalGroupInformation
 * FIToFIPaymentReversalV07.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmTransactionInformation
 * FIToFIPaymentReversalV07.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmSupplementaryData
 * FIToFIPaymentReversalV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.007.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule#forFIToFIPaymentReversalV07
 * ConstraintGroupReversalAndTransactionInformationNotPresentRule.
 * forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule#forFIToFIPaymentReversalV07
 * ConstraintGroupReversalAndTransactionInformationPresentRule.
 * forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#forFIToFIPaymentReversalV07
 * ConstraintGroupReversalAndReasonRule.forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFIToFIPaymentReversalV07
 * ConstraintInstructedAgentRule.forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFIToFIPaymentReversalV07
 * ConstraintInstructingAgentRule.forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV07
 * ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV07}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forFIToFIPaymentReversalV07
 * ConstraintTransactionInterbankSettlementDateRule.forFIToFIPaymentReversalV07}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV07
 * ConstraintGroupReversalAndNumberOfTransactionsRule.
 * forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV07
 * ConstraintTotalReversedInterbankSettlementAmountRule.
 * forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule#forFIToFIPaymentReversalV07
 * ConstraintTotalReversedInterbankSettlementAmountAndSumRule.
 * forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV07
 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV07
 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule#forFIToFIPaymentReversalV07
 * ConstraintOriginalGroupInformationRule.forFIToFIPaymentReversalV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentReversalV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a payment message that has been settled. The result will be a credit on the debtor account (when the reversed payment was a Direct Debit) or a debit on the creditor account (when the reversed payment was a Credit Transfer).\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a payment message.\r\nThe FIToFIPaymentReversal message refers to the original payment message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIPaymentReversalV07", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class FIToFIPaymentReversalV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader71 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader71
	 * GroupHeader71}</li>
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
			complexType_lazy = () -> GroupHeader71.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentReversalV07.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupHeader3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
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
			complexType_lazy = () -> OriginalGroupHeader3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentReversalV07.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction81> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81
	 * PaymentTransaction81}</li>
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
	 * "Information concerning the original transactions, to which the reversal message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the reversal message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction81.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentReversalV07.class.getMethod("getTransactionInformation", new Class[]{});
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
				return FIToFIPaymentReversalV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.forFIToFIPaymentReversalV07, com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFIToFIPaymentReversalV07, com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV07, com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule.forFIToFIPaymentReversalV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentReversalV07";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a payment message that has been settled. The result will be a credit on the debtor account (when the reversed payment was a Direct Debit) or a debit on the creditor account (when the reversed payment was a Credit Transfer).\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a payment message.\r\nThe FIToFIPaymentReversal message refers to the original payment message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios.";
				rootElement = "Document";
				xmlTag = "FIToFIPmtRvsl";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07.mmGroupHeader, com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07.mmTransactionInformation, com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "007";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentReversalV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader71 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIPaymentReversalV07 setGroupHeader(GroupHeader71 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public Optional<OriginalGroupHeader3> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public FIToFIPaymentReversalV07 setOriginalGroupInformation(OriginalGroupHeader3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public List<PaymentTransaction81> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public FIToFIPaymentReversalV07 setTransactionInformation(List<PaymentTransaction81> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFIPaymentReversalV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.07")
	static public class Document {
		@XmlElement(name = "FIToFIPmtRvsl", required = true)
		public FIToFIPaymentReversalV07 messageBody;
	}
}