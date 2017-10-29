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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.IdentificationAssignment2;
import com.tools20022.repository.msg.MessageIdentification5;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.VerificationReport2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The IdentificationVerificationReport message is sent by an assigner to an
 * assignee. It is used to confirm whether or not the presented party and/or
 * account identification information is correct.<br>
 * <b>Usage</b><br>
 * The IdentificationVerificationReport message is sent as a response to an
 * IdentificationVerificationRequest message.<br>
 * The IdentificationVerificationReport message can contain one or more reports.<br>
 * The IdentificationVerificationReport message may include a reason if the
 * presented party and/or account identification information is confirmed to be
 * incorrect.<br>
 * The IdentificationVerificationReport message may include the correct party
 * and/or account identification information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdVrfctnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#Assignment
 * IdentificationVerificationReportV02.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#OriginalAssignment
 * IdentificationVerificationReportV02.OriginalAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#Report
 * IdentificationVerificationReportV02.Report}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#SupplementaryData
 * IdentificationVerificationReportV02.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#identifier
 * IdentificationVerificationReportV02.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationVerificationReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.\r\nUsage\r\nThe IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.\r\nThe IdentificationVerificationReport message can contain one or more reports.\r\nThe IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.\r\nThe IdentificationVerificationReport message may include the correct party and/or account identification information."
 * </li>
 * </ul>
 */
public class IdentificationVerificationReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the identification assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
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
	 * definition} = "Identifies the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment2.mmObject();
		}
	};
	/**
	 * Provides for the reference to the original identification assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification5
	 * MessageIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAssgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides for the reference to the original identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock OriginalAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlAssgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAssignment";
			definition = "Provides for the reference to the original identification assignment.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification5.mmObject();
		}
	};
	/**
	 * Information concerning the verification of the identification data for
	 * which verification was requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport2
	 * VerificationReport2}</li>
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
	 * definition} =
	 * "Information concerning the verification of the identification data for which verification was requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Report = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Information concerning the verification of the identification data for which verification was requested.";
			minOccurs = 1;
			complexType_lazy = () -> VerificationReport2.mmObject();
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
	 * version} = "02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "acmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "024"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "acmt";
			messageFunctionality = "024";
			version = "02";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationVerificationReportV02";
				definition = "Scope\r\nThe IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.\r\nUsage\r\nThe IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.\r\nThe IdentificationVerificationReport message can contain one or more reports.\r\nThe IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.\r\nThe IdentificationVerificationReport message may include the correct party and/or account identification information.";
				rootElement = "Document";
				xmlTag = "IdVrfctnRpt";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.Assignment, com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.OriginalAssignment,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.Report, com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}