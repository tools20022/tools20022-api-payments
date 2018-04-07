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
import com.tools20022.repository.choice.ClaimNonReceipt1Choice;
import com.tools20022.repository.choice.CorrectiveTransaction3Choice;
import com.tools20022.repository.choice.InvestigationStatus4Choice;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ResolutionOfInvestigation message is sent by a case assignee to a case
 * creator/case assigner.<br>
 * This message is used to inform of the resolution of a case, and optionally
 * provides details about.<br>
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
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmAssignment
 * ResolutionOfInvestigationV08.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmResolvedCase
 * ResolutionOfInvestigationV08.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmStatus
 * ResolutionOfInvestigationV08.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmCancellationDetails
 * ResolutionOfInvestigationV08.mmCancellationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmModificationDetails
 * ResolutionOfInvestigationV08.mmModificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmClaimNonReceiptDetails
 * ResolutionOfInvestigationV08.mmClaimNonReceiptDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmStatementDetails
 * ResolutionOfInvestigationV08.mmStatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmCorrectionTransaction
 * ResolutionOfInvestigationV08.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmResolutionRelatedInformation
 * ResolutionOfInvestigationV08.mmResolutionRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmSupplementaryData
 * ResolutionOfInvestigationV08.mmSupplementaryData}</li>
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
 * messageDefinitionIdentifier} = {@code camt.029.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#for_camt_ResolutionOfInvestigationV08
 * ConstraintPartialOrRejectedCancellationRule.
 * for_camt_ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule#for_camt_ResolutionOfInvestigationV08
 * ConstraintMessageOrGroupResolvedCaseRule.
 * for_camt_ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#for_camt_ResolutionOfInvestigationV08
 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
 * for_camt_ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule#for_camt_ResolutionOfInvestigationV08
 * ConstraintMessageOrInitiationTransactionResolvedCaseRule.
 * for_camt_ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule#for_camt_ResolutionOfInvestigationV08
 * ConstraintMessageOrInterbankTransactionResolvedCaseRule.
 * for_camt_ResolutionOfInvestigationV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionOfInvestigationV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about.\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe ResolutionOfInvestigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe ResolutionOfInvestigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message\r\nTake note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.\r\nThe ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResolutionOfInvestigationV08", propOrder = {"assignment", "resolvedCase", "status", "cancellationDetails", "modificationDetails", "claimNonReceiptDetails", "statementDetails", "correctionTransaction",
		"resolutionRelatedInformation", "supplementaryData"})
public class ResolutionOfInvestigationV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment4 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment4
	 * CaseAssignment4}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, CaseAssignment4> mmAssignment = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, CaseAssignment4>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment4.mmObject();
		}

		@Override
		public CaseAssignment4 getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, CaseAssignment4 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "RslvdCase")
	protected Case4 resolvedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case4 Case4}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<Case4>> mmResolvedCase = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<Case4>>() {
		{
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies a resolved case.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Case4.mmObject();
		}

		@Override
		public Optional<Case4> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getResolvedCase();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<Case4> value) {
			obj.setResolvedCase(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected InvestigationStatus4Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus4Choice
	 * InvestigationStatus4Choice}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, InvestigationStatus4Choice> mmStatus = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, InvestigationStatus4Choice>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationStatus4Choice.mmObject();
		}

		@Override
		public InvestigationStatus4Choice getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, InvestigationStatus4Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "CxlDtls")
	protected List<UnderlyingTransaction19> cancellationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19
	 * UnderlyingTransaction19}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, List<UnderlyingTransaction19>> mmCancellationDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, List<UnderlyingTransaction19>>() {
		{
			xmlTag = "CxlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDetails";
			definition = "Specifies the details of the underlying transactions being cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingTransaction19.mmObject();
		}

		@Override
		public List<UnderlyingTransaction19> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getCancellationDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, List<UnderlyingTransaction19> value) {
			obj.setCancellationDetails(value);
		}
	};
	@XmlElement(name = "ModDtls")
	protected PaymentTransaction90 modificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90
	 * PaymentTransaction90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the underlying transaction being modified."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<PaymentTransaction90>> mmModificationDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<PaymentTransaction90>>() {
		{
			xmlTag = "ModDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationDetails";
			definition = "Specifies the details of the underlying transaction being modified.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction90.mmObject();
		}

		@Override
		public Optional<PaymentTransaction90> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getModificationDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<PaymentTransaction90> value) {
			obj.setModificationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ClmNonRctDtls")
	protected ClaimNonReceipt1Choice claimNonReceiptDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice
	 * ClaimNonReceipt1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmNonRctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimNonReceiptDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the underlying transaction for which a claim non receipt has been initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<ClaimNonReceipt1Choice>> mmClaimNonReceiptDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<ClaimNonReceipt1Choice>>() {
		{
			xmlTag = "ClmNonRctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimNonReceiptDetails";
			definition = "Specifies the details of the underlying transaction for which a claim non receipt has been initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClaimNonReceipt1Choice.mmObject();
		}

		@Override
		public Optional<ClaimNonReceipt1Choice> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getClaimNonReceiptDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<ClaimNonReceipt1Choice> value) {
			obj.setClaimNonReceiptDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtDtls")
	protected StatementResolutionEntry3 statementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry3
	 * StatementResolutionEntry3}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<StatementResolutionEntry3>> mmStatementDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<StatementResolutionEntry3>>() {
		{
			xmlTag = "StmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDetails";
			definition = "Details on the underlying statement entry.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementResolutionEntry3.mmObject();
		}

		@Override
		public Optional<StatementResolutionEntry3> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getStatementDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<StatementResolutionEntry3> value) {
			obj.setStatementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CrrctnTx")
	protected CorrectiveTransaction3Choice correctionTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction3Choice
	 * CorrectiveTransaction3Choice}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<CorrectiveTransaction3Choice>> mmCorrectionTransaction = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<CorrectiveTransaction3Choice>>() {
		{
			xmlTag = "CrrctnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectionTransaction";
			definition = "References a transaction initiated to fix the case under investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorrectiveTransaction3Choice.mmObject();
		}

		@Override
		public Optional<CorrectiveTransaction3Choice> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getCorrectionTransaction();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<CorrectiveTransaction3Choice> value) {
			obj.setCorrectionTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnRltdInf")
	protected ResolutionInformation2 resolutionRelatedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation2
	 * ResolutionInformation2}</li>
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<ResolutionInformation2>> mmResolutionRelatedInformation = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, Optional<ResolutionInformation2>>() {
		{
			xmlTag = "RsltnRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionRelatedInformation";
			definition = "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ResolutionInformation2.mmObject();
		}

		@Override
		public Optional<ResolutionInformation2> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getResolutionRelatedInformation();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, Optional<ResolutionInformation2> value) {
			obj.setResolutionRelatedInformation(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV08, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ResolutionOfInvestigationV08, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ResolutionOfInvestigationV08 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV08 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.for_camt_ResolutionOfInvestigationV08,
						com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule.for_camt_ResolutionOfInvestigationV08,
						com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.for_camt_ResolutionOfInvestigationV08,
						com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule.for_camt_ResolutionOfInvestigationV08,
						com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule.for_camt_ResolutionOfInvestigationV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionOfInvestigationV08";
				definition = "Scope\r\nThe ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about.\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe ResolutionOfInvestigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe ResolutionOfInvestigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message\r\nTake note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.\r\nThe ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component.";
				rootElement = "Document";
				xmlTag = "RsltnOfInvstgtn";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmResolvedCase,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmStatus, com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmCancellationDetails,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmModificationDetails, com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmClaimNonReceiptDetails,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmStatementDetails, com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmCorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmResolutionRelatedInformation, com.tools20022.repository.area.camt.ResolutionOfInvestigationV08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "029";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ResolutionOfInvestigationV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment4 getAssignment() {
		return assignment;
	}

	public ResolutionOfInvestigationV08 setAssignment(CaseAssignment4 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<Case4> getResolvedCase() {
		return resolvedCase == null ? Optional.empty() : Optional.of(resolvedCase);
	}

	public ResolutionOfInvestigationV08 setResolvedCase(Case4 resolvedCase) {
		this.resolvedCase = resolvedCase;
		return this;
	}

	public InvestigationStatus4Choice getStatus() {
		return status;
	}

	public ResolutionOfInvestigationV08 setStatus(InvestigationStatus4Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<UnderlyingTransaction19> getCancellationDetails() {
		return cancellationDetails == null ? cancellationDetails = new ArrayList<>() : cancellationDetails;
	}

	public ResolutionOfInvestigationV08 setCancellationDetails(List<UnderlyingTransaction19> cancellationDetails) {
		this.cancellationDetails = Objects.requireNonNull(cancellationDetails);
		return this;
	}

	public Optional<PaymentTransaction90> getModificationDetails() {
		return modificationDetails == null ? Optional.empty() : Optional.of(modificationDetails);
	}

	public ResolutionOfInvestigationV08 setModificationDetails(PaymentTransaction90 modificationDetails) {
		this.modificationDetails = modificationDetails;
		return this;
	}

	public Optional<ClaimNonReceipt1Choice> getClaimNonReceiptDetails() {
		return claimNonReceiptDetails == null ? Optional.empty() : Optional.of(claimNonReceiptDetails);
	}

	public ResolutionOfInvestigationV08 setClaimNonReceiptDetails(ClaimNonReceipt1Choice claimNonReceiptDetails) {
		this.claimNonReceiptDetails = claimNonReceiptDetails;
		return this;
	}

	public Optional<StatementResolutionEntry3> getStatementDetails() {
		return statementDetails == null ? Optional.empty() : Optional.of(statementDetails);
	}

	public ResolutionOfInvestigationV08 setStatementDetails(StatementResolutionEntry3 statementDetails) {
		this.statementDetails = statementDetails;
		return this;
	}

	public Optional<CorrectiveTransaction3Choice> getCorrectionTransaction() {
		return correctionTransaction == null ? Optional.empty() : Optional.of(correctionTransaction);
	}

	public ResolutionOfInvestigationV08 setCorrectionTransaction(CorrectiveTransaction3Choice correctionTransaction) {
		this.correctionTransaction = correctionTransaction;
		return this;
	}

	public Optional<ResolutionInformation2> getResolutionRelatedInformation() {
		return resolutionRelatedInformation == null ? Optional.empty() : Optional.of(resolutionRelatedInformation);
	}

	public ResolutionOfInvestigationV08 setResolutionRelatedInformation(ResolutionInformation2 resolutionRelatedInformation) {
		this.resolutionRelatedInformation = resolutionRelatedInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ResolutionOfInvestigationV08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.08")
	static public class Document {
		@XmlElement(name = "RsltnOfInvstgtn", required = true)
		public ResolutionOfInvestigationV08 messageBody;
	}
}