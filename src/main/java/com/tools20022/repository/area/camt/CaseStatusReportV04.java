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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The Case Status Report message is sent by a case assignee to a case creator
 * or case assigner.<br>
 * This message is used to report on the status of a case.<br>
 * <b>Usage</b><br>
 * A Case Status Report message is sent in reply to a Case Status Report Request
 * message. This message<br>
 * - covers one and only one case at a time. (If a case assignee needs to report
 * on several cases, then multiple Case Status Report messages must be sent.)<br>
 * - may be forwarded to subsequent case assigner(s) until it reaches the end
 * point<br>
 * - is able to indicate the fact that a case has been assigned to a party
 * downstream in the payment processing chain<br>
 * - may not be used in place of a Resolution Of Investigation (except for the
 * condition given in the next bullet point) or Notification Of Case Assignment
 * message<br>
 * - may be skipped and replaced by a Resolution Of Investigation message when
 * the request for a investigation status is received at the time the assigner
 * has resolved the case. (In this case a Resolution Of Investigation message
 * can be sent instead of a Case Status Report and the case may be closed.)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CaseStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#Header
 * CaseStatusReportV04.Header}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#Case
 * CaseStatusReportV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#Status
 * CaseStatusReportV04.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#NewAssignment
 * CaseStatusReportV04.NewAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#SupplementaryData
 * CaseStatusReportV04.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#identifier
 * CaseStatusReportV04.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatusReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\r\nThis message is used to report on the status of a case.\r\nUsage\r\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\r\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\r\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\r\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\r\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\r\n- may be skipped and replaced by a Resolution Of Investigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a Resolution Of Investigation message can be sent instead of a Case Status Report and the case may be closed.)"
 * </li>
 * </ul>
 */
public class CaseStatusReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies generic information about an investigation report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportHeader4
	 * ReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies generic information about an investigation report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Header = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about an investigation report.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ReportHeader4.mmObject();
		}
	};
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Case = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}
	};
	/**
	 * Defines the status of the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseStatus2
	 * CaseStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Status = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseStatus2.mmObject();
		}
	};
	/**
	 * Identifies the change of an assignment for an investigation case from an
	 * assigner to a new assignee. Usage: The Assigner must be the sender of
	 * this confirmation and the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAssgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the change of an assignment for an investigation case from an assigner to a new assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock NewAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewAssgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAssignment";
			definition = "Identifies the change of an assignment for an investigation case from an assigner to a new assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
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
	 * version} = "04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "039"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "039";
			version = "04";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseStatusReportV04";
				definition = "Scope\r\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\r\nThis message is used to report on the status of a case.\r\nUsage\r\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\r\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\r\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\r\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\r\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\r\n- may be skipped and replaced by a Resolution Of Investigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a Resolution Of Investigation message can be sent instead of a Case Status Report and the case may be closed.)";
				rootElement = "Document";
				xmlTag = "CaseStsRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CaseStatusReportV04.Header, com.tools20022.repository.area.camt.CaseStatusReportV04.Case,
						com.tools20022.repository.area.camt.CaseStatusReportV04.Status, com.tools20022.repository.area.camt.CaseStatusReportV04.NewAssignment, com.tools20022.repository.area.camt.CaseStatusReportV04.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.CaseStatusReportV04.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}