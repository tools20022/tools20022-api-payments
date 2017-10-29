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
import com.tools20022.repository.choice.CorrectiveTransaction2Choice;
import com.tools20022.repository.choice.InvestigationStatus3Choice;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The ResolutionOfInvestigation message is sent by a case assignee to a case
 * creator/case assigner.<br>
 * This message is used to inform of the resolution of a case, and optionally
 * provides details about .<br>
 * - the corrective action undertaken by the case assignee<br>
 * - information on the return where applicable<br>
 * <b>Usage</b><br>
 * The ResolutionOfInvestigation message is used by the case assignee to inform
 * a case creator or case assigner about the resolution of a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The ResolutionOfInvestigation message covers one and only one case at a time.
 * If the case assignee needs to communicate about several cases, then several
 * Resolution Of Investigation messages must be sent.<br>
 * The ResolutionOfInvestigation message provides:<br>
 * - the final outcome of the case, whether positive or negative<br>
 * - optionally, the details of the corrective action undertaken by the case
 * assignee and the information of the return<br>
 * Whenever a payment instruction has been generated to solve the case under
 * investigation following a claim non receipt or an unable to apply, the
 * optional CorrectionTransaction component present in the message must be
 * completed.<br>
 * Whenever the action of modifying or cancelling a payment results in funds
 * being returned or reversed, an investigating agent may provide the details in
 * the resolution related investigation component, to identify the return or
 * reversal transaction. These details will facilitate the account
 * reconciliations at the initiating bank and the intermediaries. It must be
 * stressed that the return or reversal of funds is outside the scope of this
 * Exceptions and Investigation service. The features given here is only meant
 * to transmit the information of return or reversal when it is available
 * through the resolution of the case.<br>
 * The ResolutionOfInvestigation message must:<br>
 * - be forwarded by all subsequent case assignee(s) until it reaches the case
 * creator<br>
 * - not be used in place of a RejectCaseAssignment or CaseStatusReport or
 * NotificationOfCaseAssignment message<br>
 * Take note of an exceptional rule that allows the use of
 * ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is
 * a response-message to a CaseStatusReportRequest. The latter which is sent
 * when the assigner has reached its own time-out threshold to receive a
 * response. However it may happen that when the request arrives, the
 * investigating agent has just obtained a resolution. In such a situation, it
 * would be redundant to send a CaseStatusReport when then followed immediately
 * by a ResolutionOfInvestigation. It is therefore quite acceptable for the
 * investigating agent, the assignee, to skip the Case Status Report and send
 * the ResolutionOfInvestigation message directly.<br>
 * The ResolutionOfInvestigation message should be the sole message to respond
 * to a cancellation request. Details of the underlying transactions and the
 * related statuses for which the cancellation request has been issued may be
 * provided in the CancellationDetails component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RsltnOfInvstgtn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#Assignment
 * ResolutionOfInvestigationV07.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#ResolvedCase
 * ResolutionOfInvestigationV07.ResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#Status
 * ResolutionOfInvestigationV07.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#CancellationDetails
 * ResolutionOfInvestigationV07.CancellationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#StatementDetails
 * ResolutionOfInvestigationV07.StatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#CorrectionTransaction
 * ResolutionOfInvestigationV07.CorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#ResolutionRelatedInformation
 * ResolutionOfInvestigationV07.ResolutionRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#SupplementaryData
 * ResolutionOfInvestigationV07.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#identifier
 * ResolutionOfInvestigationV07.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionOfInvestigationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about .\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe ResolutionOfInvestigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe ResolutionOfInvestigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message\r\nTake note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.\r\nThe ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component."
 * </li>
 * </ul>
 */
public class ResolutionOfInvestigationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}
	};
	/**
	 * Identifies a resolved case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a resolved case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ResolvedCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "RslvdCase";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies a resolved case.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}
	};
	/**
	 * Indicates the status of the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
	 * InvestigationStatus3Choice}</li>
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
	 * definition} = "Indicates the status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Status = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> InvestigationStatus3Choice.mmObject();
		}
	};
	/**
	 * Specifies the details of the underlying transactions being cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
	 * UnderlyingTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the underlying transactions being cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDetails";
			definition = "Specifies the details of the underlying transactions being cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingTransaction17.mmObject();
		}
	};
	/**
	 * Details on the underlying statement entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2
	 * StatementResolutionEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details on the underlying statement entry."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock StatementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDetails";
			definition = "Details on the underlying statement entry.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> StatementResolutionEntry2.mmObject();
		}
	};
	/**
	 * References a transaction initiated to fix the case under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice
	 * CorrectiveTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrctnTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectionTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References a transaction initiated to fix the case under investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CorrectionTransaction = new MMMessageBuildingBlock() {
		{
			xmlTag = "CrrctnTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectionTransaction";
			definition = "References a transaction initiated to fix the case under investigation.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CorrectiveTransaction2Choice.mmObject();
		}
	};
	/**
	 * Reference of a return or a reversal initiated to fix the case under
	 * investigation as part of the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1
	 * ResolutionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ResolutionRelatedInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "RsltnRltdInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionRelatedInformation";
			definition = "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ResolutionInformation1.mmObject();
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
	 * version} = "07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "029"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "029";
			version = "07";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResolutionOfInvestigationV07";
				definition = "Scope\r\nThe ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about .\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe ResolutionOfInvestigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe ResolutionOfInvestigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message\r\nTake note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.\r\nThe ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component.";
				rootElement = "Document";
				xmlTag = "RsltnOfInvstgtn";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.Assignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.ResolvedCase,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.Status, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.CancellationDetails,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.StatementDetails, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.CorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.ResolutionRelatedInformation, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}