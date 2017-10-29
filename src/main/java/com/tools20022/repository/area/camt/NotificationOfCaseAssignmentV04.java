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
 * The Notification Of Case Assignment message is sent by a case assignee to a
 * case creator/case assigner.<br>
 * This message is used to inform the case assigner that:<br>
 * - the assignee is reassigning the case to the next agent in the transaction
 * processing chain for further action<br>
 * - the assignee will work on the case himself, without re-assigning it to
 * another party, and therefore indicating that the re-assignment has reached
 * its end-point<br>
 * <b>Usage</b><br>
 * The Notification Of Case Assignment message is used to notify the case
 * creator or case assigner of further action undertaken by the case assignee in
 * a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Notification Of Case Assignment message<br>
 * - covers one and only one case at a time. If the case assignee needs to
 * inform a case creator or case assigner about several cases, then multiple
 * Notification Of Case Assignment messages must be sent<br>
 * - except in the case where it is used to indicate that an agent is doing the
 * correction himself, this message must be forwarded by all subsequent case
 * assigner(s) until it reaches the case creator<br>
 * - must not be used in place of a Resolution Of Investigation or a Case Status
 * Report message<br>
 * When the assignee does not reassign the case to another party (that is
 * responding with a Notification Of Case Assignment message with notification
 * MINE - The case is processed by the assignee), the case assignment should
 * contain the case assignment elements as received in the original query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtfctnOfCaseAssgnmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Header
 * NotificationOfCaseAssignmentV04.Header}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Case
 * NotificationOfCaseAssignmentV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Assignment
 * NotificationOfCaseAssignmentV04.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Notification
 * NotificationOfCaseAssignmentV04.Notification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#SupplementaryData
 * NotificationOfCaseAssignmentV04.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#identifier
 * NotificationOfCaseAssignmentV04.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationOfCaseAssignmentV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message\r\nWhen the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query."
 * </li>
 * </ul>
 */
public class NotificationOfCaseAssignmentV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies generic information about the notification. The receiver of a
	 * notification must be the party which assigned the case to the sender.
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
	 * "Specifies generic information about the notification.\nThe receiver of a notification must be the party which assigned the case to the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Header = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about the notification.\nThe receiver of a notification must be the party which assigned the case to the sender.";
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
	 * Information about the type of action taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CaseForwardingNotification3
	 * CaseForwardingNotification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the type of action taken."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Notification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Information about the type of action taken.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseForwardingNotification3.mmObject();
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
	 * messageFunctionality} = "030"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "030";
			version = "04";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NotificationOfCaseAssignmentV04";
				definition = "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message\r\nWhen the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query.";
				rootElement = "Document";
				xmlTag = "NtfctnOfCaseAssgnmt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Header, com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Case,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Assignment, com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Notification,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}