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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.IdentificationAssignment2;
import com.tools20022.repository.msg.MessageIdentification5;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.VerificationReport2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmAssignment
 * IdentificationVerificationReportV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmOriginalAssignment
 * IdentificationVerificationReportV02.mmOriginalAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmReport
 * IdentificationVerificationReportV02.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmSupplementaryData
 * IdentificationVerificationReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdVrfctnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.024.001.02}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationVerificationReportV02", propOrder = {"assignment", "originalAssignment", "report", "supplementaryData"})
public class IdentificationVerificationReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected IdentificationAssignment2 assignment;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV02, IdentificationAssignment2> mmAssignment = new MMMessageBuildingBlock<IdentificationVerificationReportV02, IdentificationAssignment2>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment2.mmObject();
		}

		@Override
		public IdentificationAssignment2 getValue(IdentificationVerificationReportV02 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(IdentificationVerificationReportV02 obj, IdentificationAssignment2 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "OrgnlAssgnmt")
	protected MessageIdentification5 originalAssignment;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV02, Optional<MessageIdentification5>> mmOriginalAssignment = new MMMessageBuildingBlock<IdentificationVerificationReportV02, Optional<MessageIdentification5>>() {
		{
			xmlTag = "OrgnlAssgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAssignment";
			definition = "Provides for the reference to the original identification assignment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification5.mmObject();
		}

		@Override
		public Optional<MessageIdentification5> getValue(IdentificationVerificationReportV02 obj) {
			return obj.getOriginalAssignment();
		}

		@Override
		public void setValue(IdentificationVerificationReportV02 obj, Optional<MessageIdentification5> value) {
			obj.setOriginalAssignment(value.orElse(null));
		}
	};
	@XmlElement(name = "Rpt", required = true)
	protected List<VerificationReport2> report;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV02, List<VerificationReport2>> mmReport = new MMMessageBuildingBlock<IdentificationVerificationReportV02, List<VerificationReport2>>() {
		{
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Information concerning the verification of the identification data for which verification was requested.";
			minOccurs = 1;
			complexType_lazy = () -> VerificationReport2.mmObject();
		}

		@Override
		public List<VerificationReport2> getValue(IdentificationVerificationReportV02 obj) {
			return obj.getReport();
		}

		@Override
		public void setValue(IdentificationVerificationReportV02 obj, List<VerificationReport2> value) {
			obj.setReport(value);
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
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<IdentificationVerificationReportV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IdentificationVerificationReportV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IdentificationVerificationReportV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationVerificationReportV02";
				definition = "Scope\r\nThe IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.\r\nUsage\r\nThe IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.\r\nThe IdentificationVerificationReport message can contain one or more reports.\r\nThe IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.\r\nThe IdentificationVerificationReport message may include the correct party and/or account identification information.";
				rootElement = "Document";
				xmlTag = "IdVrfctnRpt";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.mmAssignment,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.mmOriginalAssignment, com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.mmReport,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "024";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationVerificationReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationAssignment2 getAssignment() {
		return assignment;
	}

	public IdentificationVerificationReportV02 setAssignment(IdentificationAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<MessageIdentification5> getOriginalAssignment() {
		return originalAssignment == null ? Optional.empty() : Optional.of(originalAssignment);
	}

	public IdentificationVerificationReportV02 setOriginalAssignment(MessageIdentification5 originalAssignment) {
		this.originalAssignment = originalAssignment;
		return this;
	}

	public List<VerificationReport2> getReport() {
		return report == null ? report = new ArrayList<>() : report;
	}

	public IdentificationVerificationReportV02 setReport(List<VerificationReport2> report) {
		this.report = Objects.requireNonNull(report);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IdentificationVerificationReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02")
	static public class Document {
		@XmlElement(name = "IdVrfctnRpt", required = true)
		public IdentificationVerificationReportV02 messageBody;
	}
}