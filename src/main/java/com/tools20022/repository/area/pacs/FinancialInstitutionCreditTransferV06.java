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
import com.tools20022.repository.msg.CreditTransferTransaction23;
import com.tools20022.repository.msg.GroupHeader70;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionCreditTransfer message is sent by a debtor financial
 * institution to a creditor financial institution, directly or through other
 * agents and/or a payment clearing and settlement system.<br>
 * It is used to move funds from a debtor account to a creditor, where both
 * debtor and creditor are financial institutions.<br>
 * <b>Usage</b><br>
 * The FinancialInstitutionCreditTransfer message is exchanged between agents
 * and can contain one or more credit transfer instructions where debtor and
 * creditor are both financial institutions.<br>
 * The FinancialInstitutionCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction.<br>
 * The FinancialInstitutionCreditTransfer message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmGroupHeader
 * FinancialInstitutionCreditTransferV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmCreditTransferTransactionInformation
 * FinancialInstitutionCreditTransferV06.mmCreditTransferTransactionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmSupplementaryData
 * FinancialInstitutionCreditTransferV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FICdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.009.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFinancialInstitutionCreditTransferV06
 * ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFinancialInstitutionCreditTransferV06
 * ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#forFinancialInstitutionCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountRule.
 * forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#forFinancialInstitutionCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV06
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV06
 * ConstraintTransactionInterbankSettlementDateRule.
 * forFinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forFinancialInstitutionCreditTransferV06
 * ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV06
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV06
 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitutionCreditTransferV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionCreditTransferV06", propOrder = {"groupHeader", "creditTransferTransactionInformation", "supplementaryData"})
public class FinancialInstitutionCreditTransferV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader70 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader70
	 * GroupHeader70}</li>
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
			complexType_lazy = () -> GroupHeader70.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstitutionCreditTransferV06.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransaction23> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCreditTransferTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstitutionCreditTransferV06.class.getMethod("getCreditTransferTransactionInformation", new Class[]{});
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
				return FinancialInstitutionCreditTransferV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionCreditTransferV06";
				definition = "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.";
				rootElement = "Document";
				xmlTag = "FICdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmGroupHeader,
						com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmCreditTransferTransactionInformation, com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "009";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitutionCreditTransferV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader70 getGroupHeader() {
		return groupHeader;
	}

	public FinancialInstitutionCreditTransferV06 setGroupHeader(GroupHeader70 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransaction23> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FinancialInstitutionCreditTransferV06 setCreditTransferTransactionInformation(List<CreditTransferTransaction23> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstitutionCreditTransferV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.06")
	static public class Document {
		@XmlElement(name = "FICdtTrf", required = true)
		public FinancialInstitutionCreditTransferV06 messageBody;
	}
}