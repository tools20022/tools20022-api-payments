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
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.ReportHeader4;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The CaseStatusReportRequest message is sent by a case creator or case
 * assigner to a case assignee.<br>
 * This message is used to request the status of a case.<br>
 * <b>Usage</b><br>
 * The Case Status Report Request message must be answered with a Case Status
 * Report message. It can be used to request the status of a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Case Status Report Request message covers one and only one case at a
 * time. If a case creator or case assigner needs the status of several cases,
 * then multiple Case Status Report Request messages must be sent.<br>
 * The Case Status Report Request message may be forwarded to subsequent case
 * assignee(s) in the case processing chain.<br>
 * The processing of a case generates Notification Of Case Assignment and/or
 * Resolution Of Investigation messages to the case creator/case assigner. They
 * alone should provide collaborating parties sufficient information about the
 * progress of the investigation. The Case Status Report Request must therefore
 * only be used when no information has been received from the case assignee
 * within the expected time frame.<br>
 * An agent may suspend an investigation by classifying it as overdue if, this
 * agent, after sending the request for the status of the investigation, does
 * not receive any response after a long time. Agents may set their individual
 * threshold wait-time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CaseStsRptReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#RequestHeader
 * CaseStatusReportRequestV03.RequestHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#Case
 * CaseStatusReportRequestV03.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#SupplementaryData
 * CaseStatusReportRequestV03.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#identifier
 * CaseStatusReportRequestV03.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatusReportRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CaseStatusReportRequest message is sent by a case creator or case assigner to a case assignee.\r\nThis message is used to request the status of a case.\r\nUsage\r\nThe Case Status Report Request message must be answered with a Case Status Report message. It can be used to request the status of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Case Status Report Request message covers one and only one case at a time. If a case creator or case assigner needs the status of several cases, then multiple Case Status Report Request messages must be sent.\r\nThe Case Status Report Request message may be forwarded to subsequent case assignee(s) in the case processing chain.\r\nThe processing of a case generates Notification Of Case Assignment and/or Resolution Of Investigation messages to the case creator/case assigner. They alone should provide collaborating parties sufficient information about the progress of the investigation. The Case Status Report Request must therefore only be used when no information has been received from the case assignee within the expected time frame.\r\nAn agent may suspend an investigation by classifying it as overdue if, this agent, after sending the request for the status of the investigation, does not receive any response after a long time. Agents may set their individual threshold wait-time."
 * </li>
 * </ul>
 */
public class CaseStatusReportRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the party requesting the status, the requested party, the
	 * identification and the date of the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportHeader4
	 * ReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party requesting the status, the requested party, the identification and the date of the status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RequestHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestHeader";
			definition = "Identifies the party requesting the status, the requested party, the identification and the date of the status.";
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
	 * version} = "03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "038"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "038";
			version = "03";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseStatusReportRequestV03";
				definition = "Scope\r\nThe CaseStatusReportRequest message is sent by a case creator or case assigner to a case assignee.\r\nThis message is used to request the status of a case.\r\nUsage\r\nThe Case Status Report Request message must be answered with a Case Status Report message. It can be used to request the status of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Case Status Report Request message covers one and only one case at a time. If a case creator or case assigner needs the status of several cases, then multiple Case Status Report Request messages must be sent.\r\nThe Case Status Report Request message may be forwarded to subsequent case assignee(s) in the case processing chain.\r\nThe processing of a case generates Notification Of Case Assignment and/or Resolution Of Investigation messages to the case creator/case assigner. They alone should provide collaborating parties sufficient information about the progress of the investigation. The Case Status Report Request must therefore only be used when no information has been received from the case assignee within the expected time frame.\r\nAn agent may suspend an investigation by classifying it as overdue if, this agent, after sending the request for the status of the investigation, does not receive any response after a long time. Agents may set their individual threshold wait-time.";
				rootElement = "Document";
				xmlTag = "CaseStsRptReq";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CaseStatusReportRequestV03.RequestHeader, com.tools20022.repository.area.camt.CaseStatusReportRequestV03.Case,
						com.tools20022.repository.area.camt.CaseStatusReportRequestV03.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.CaseStatusReportRequestV03.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}