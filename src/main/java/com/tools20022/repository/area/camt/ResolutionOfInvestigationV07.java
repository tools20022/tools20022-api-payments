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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.CorrectiveTransaction2Choice;
import com.tools20022.repository.choice.InvestigationStatus3Choice;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmAssignment
 * ResolutionOfInvestigationV07.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmResolvedCase
 * ResolutionOfInvestigationV07.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmStatus
 * ResolutionOfInvestigationV07.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmCancellationDetails
 * ResolutionOfInvestigationV07.mmCancellationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmStatementDetails
 * ResolutionOfInvestigationV07.mmStatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmCorrectionTransaction
 * ResolutionOfInvestigationV07.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmResolutionRelatedInformation
 * ResolutionOfInvestigationV07.mmResolutionRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmSupplementaryData
 * ResolutionOfInvestigationV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RsltnOfInvstgtn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.029.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV07
 * ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule#forResolutionOfInvestigationV07
 * ConstraintMessageOrGroupResolvedCaseRule.forResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV07
 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
 * forResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule#forResolutionOfInvestigationV07
 * ConstraintMessageOrInitiationTransactionResolvedCaseRule.
 * forResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule#forResolutionOfInvestigationV07
 * ConstraintMessageOrInterbankTransactionResolvedCaseRule.
 * forResolutionOfInvestigationV07}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResolutionOfInvestigationV07", propOrder = {"assignment", "resolvedCase", "status", "cancellationDetails", "statementDetails", "correctionTransaction", "resolutionRelatedInformation", "supplementaryData"})
public class ResolutionOfInvestigationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RslvdCase")
	protected Case3 resolvedCase;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmResolvedCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies a resolved case.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Case3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getResolvedCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected InvestigationStatus3Choice status;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationStatus3Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlDtls")
	protected List<UnderlyingTransaction17> cancellationDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmCancellationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDetails";
			definition = "Specifies the details of the underlying transactions being cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingTransaction17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getCancellationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StmtDtls")
	protected StatementResolutionEntry2 statementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmStatementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDetails";
			definition = "Details on the underlying statement entry.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementResolutionEntry2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getStatementDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CrrctnTx")
	protected CorrectiveTransaction2Choice correctionTransaction;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmCorrectionTransaction = new MMMessageBuildingBlock() {
		{
			xmlTag = "CrrctnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectionTransaction";
			definition = "References a transaction initiated to fix the case under investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorrectiveTransaction2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getCorrectionTransaction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RsltnRltdInf")
	protected ResolutionInformation1 resolutionRelatedInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock mmResolutionRelatedInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "RsltnRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionRelatedInformation";
			definition = "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ResolutionInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionOfInvestigationV07.class.getMethod("getResolutionRelatedInformation", new Class[]{});
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
				return ResolutionOfInvestigationV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV07,
						com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule.forResolutionOfInvestigationV07,
						com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV07,
						com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule.forResolutionOfInvestigationV07,
						com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule.forResolutionOfInvestigationV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionOfInvestigationV07";
				definition = "Scope\r\nThe ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about .\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe ResolutionOfInvestigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe ResolutionOfInvestigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message\r\nTake note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.\r\nThe ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component.";
				rootElement = "Document";
				xmlTag = "RsltnOfInvstgtn";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmResolvedCase,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmStatus, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmCancellationDetails,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmStatementDetails, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmCorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmResolutionRelatedInformation, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "029";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ResolutionOfInvestigationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public ResolutionOfInvestigationV07 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<Case3> getResolvedCase() {
		return resolvedCase == null ? Optional.empty() : Optional.of(resolvedCase);
	}

	public ResolutionOfInvestigationV07 setResolvedCase(Case3 resolvedCase) {
		this.resolvedCase = resolvedCase;
		return this;
	}

	public InvestigationStatus3Choice getStatus() {
		return status;
	}

	public ResolutionOfInvestigationV07 setStatus(InvestigationStatus3Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<UnderlyingTransaction17> getCancellationDetails() {
		return cancellationDetails == null ? cancellationDetails = new ArrayList<>() : cancellationDetails;
	}

	public ResolutionOfInvestigationV07 setCancellationDetails(List<UnderlyingTransaction17> cancellationDetails) {
		this.cancellationDetails = Objects.requireNonNull(cancellationDetails);
		return this;
	}

	public Optional<StatementResolutionEntry2> getStatementDetails() {
		return statementDetails == null ? Optional.empty() : Optional.of(statementDetails);
	}

	public ResolutionOfInvestigationV07 setStatementDetails(StatementResolutionEntry2 statementDetails) {
		this.statementDetails = statementDetails;
		return this;
	}

	public Optional<CorrectiveTransaction2Choice> getCorrectionTransaction() {
		return correctionTransaction == null ? Optional.empty() : Optional.of(correctionTransaction);
	}

	public ResolutionOfInvestigationV07 setCorrectionTransaction(CorrectiveTransaction2Choice correctionTransaction) {
		this.correctionTransaction = correctionTransaction;
		return this;
	}

	public Optional<ResolutionInformation1> getResolutionRelatedInformation() {
		return resolutionRelatedInformation == null ? Optional.empty() : Optional.of(resolutionRelatedInformation);
	}

	public ResolutionOfInvestigationV07 setResolutionRelatedInformation(ResolutionInformation1 resolutionRelatedInformation) {
		this.resolutionRelatedInformation = resolutionRelatedInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ResolutionOfInvestigationV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.07")
	static public class Document {
		@XmlElement(name = "RsltnOfInvstgtn", required = true)
		public ResolutionOfInvestigationV07 messageBody;
	}
}