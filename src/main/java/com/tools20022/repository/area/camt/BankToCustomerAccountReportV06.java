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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.AccountReport19;
import com.tools20022.repository.msg.GroupHeader58;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The BankToCustomerAccountReport message is sent by the account servicer to an
 * account owner or to a party authorised by the account owner to receive the
 * message. It can be used to inform the account owner, or authorised party, of
 * the entries reported to the account, and/or to provide the owner with balance
 * information on the account at a given point in time.<br>
 * <b>Usage</b><br>
 * The BankToCustomerAccountReport message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.
 * It can be used to:<br>
 * - report pending and booked items;<br>
 * - provide balance information.<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled by the account owner to receive the account information
 * (also known as recipient).<br>
 * For a statement, the Bank-to-Customer Account Statement message should be
 * used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrAcctRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#GroupHeader
 * BankToCustomerAccountReportV06.GroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#Report
 * BankToCustomerAccountReportV06.Report}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#SupplementaryData
 * BankToCustomerAccountReportV06.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#identifier
 * BankToCustomerAccountReportV06.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerAccountReportV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerAccountReport message can contain reports for more than one account. It provides information for cash management and/or reconciliation. It can be used to:\r\n- report pending and booked items;\r\n- provide balance information.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nFor a statement, the Bank-to-Customer Account Statement message should be used."
 * </li>
 * </ul>
 */
public class BankToCustomerAccountReportV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Common information for the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader58
	 * GroupHeader58}</li>
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
	 * definition} = "Common information for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GroupHeader58.mmObject();
		}
	};
	/**
	 * Reports on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountReport19
	 * AccountReport19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on a cash account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Report = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Reports on a cash account.";
			minOccurs = 1;
			complexType_lazy = () -> AccountReport19.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "052"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "052";
			version = "06";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerAccountReportV06";
				definition = "Scope\r\nThe BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerAccountReport message can contain reports for more than one account. It provides information for cash management and/or reconciliation. It can be used to:\r\n- report pending and booked items;\r\n- provide balance information.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nFor a statement, the Bank-to-Customer Account Statement message should be used.";
				rootElement = "Document";
				xmlTag = "BkToCstmrAcctRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerAccountReportV06.GroupHeader, com.tools20022.repository.area.camt.BankToCustomerAccountReportV06.Report,
						com.tools20022.repository.area.camt.BankToCustomerAccountReportV06.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.BankToCustomerAccountReportV06.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}