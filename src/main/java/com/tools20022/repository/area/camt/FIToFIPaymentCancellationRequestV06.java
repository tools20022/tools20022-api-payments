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
 * The FIToFIPaymentCancellationRequest message is sent by a case creator/case
 * assigner to a case assignee.<br>
 * This message is used to request the cancellation of an original payment
 * instruction. The FIToFIPaymentCancellationRequest message is exchanged
 * between the instructing agent and the instructed agent to request the
 * cancellation of a interbank payment message previously sent (such as
 * FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit or
 * FinancialInstitutionCreditTransfer).<br>
 * <br>
 * The FIToFIPaymentCancellationRequest supports for both the request for
 * cancellation (the instructed agent - or assignee - has not yet processed and
 * forwarded the payment instruction) as well as the request for refund (payment
 * has been fully processed already by the instructed agent - or assignee).<br>
 * <br>
 * <b>Usage</b><br>
 * The FIToFIPaymentCancellationRequest message must be answered with a:<br>
 * - ResolutionOfInvestigation message with a positive final outcome when the
 * case assignee can perform the requested cancellation<br>
 * - ResolutionOfInvestigation message with a negative final outcome when the
 * case assignee may perform the requested cancellation but fails to do so (too
 * late, irrevocable instruction, ...)<br>
 * - RejectInvestigation message when the case assignee is unable or not
 * authorised to perform the requested cancellation<br>
 * - NotificationOfCaseAssignment message to indicate whether the case assignee
 * will take on the case himself or reassign the case to a subsequent party in
 * the payment processing chain.<br>
 * A FIToFIPaymentCancellationRequest message concerns one and only one original
 * payment instruction at a time.<br>
 * When a case assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the ResolutionOfInvestigation message.<br>
 * The processing of a FIToFI Payment Cancellation Request message case may lead
 * to a Debit Authorisation Request message sent to the creditor by its account
 * servicing institution.<br>
 * The FIToFIPaymentCancellationRequest message may be used to escalate a case
 * after an unsuccessful request to modify the payment. In this scenario, the
 * case identification remains the same as in the original
 * FIToFIPaymentCancellationRequest message and the element ReopenCaseIndication
 * is set to 'Yes' or 'true'.<br>
 * The FIToFIPaymentCancellationRequest message has the following main
 * characteristics:<br>
 * Case Identification: The case creator assigns a unique case identification
 * and the reason code for the cancellation request. This information will be
 * passed unchanged to all subsequent case assignee(s). For the
 * FIToFIPaymentCancellationRequest message the case has been made optional, as
 * the message might be used outside of a case management environment where the
 * case identification is not relevant.<br>
 * Moreover, the case identification may be present at different levels:<br>
 * - One unique case is defined per cancellation request message: If multiple
 * underlying groups or transactions are present in the message and the case
 * assignee has already forwarded the transaction for which the cancellation is
 * requested, the case cannot be forwarded to the next party in the chain (see
 * rule on uniqueness of the case) and the case creator will have to issue
 * individual cancellation requests for each underlying individual transaction.
 * In response to this cancellation request, the case must also be present at
 * the message level in the Resolution of Investigation message.<br>
 * - One case per original group or transaction present in the cancellation
 * request: For each group or transaction, a unique case has been assigned. This
 * means, when a payment instruction has already been forwarded by the case
 * assignee, the cancellation request may be forwarded to next party in the
 * payment chain, with the unique case assigned to the transaction. When the
 * group can only be cancelled partially, new cancellation requests need however
 * to be issued for the individual transactions within the group for which the
 * cancellation request has not been successful. In response to this
 * cancellation request, the case must be present in the cancellation details
 * identifying the original group or transaction in the Resolution of
 * Investigation message.<br>
 * - No case used in cancellation request message.<br>
 * Cancellation of a cover payment: The cancellation of a payment instruction
 * for which cover is provided by a separate instruction always results in the
 * cancellation of the whole transaction, including the cover. The case assignee
 * performing the cancellation must initiate the return of funds to the case
 * creator. The case assigner must not request the cancellation of the cover
 * separately.<br>
 * Cancellation request initiators: The cancellation of a payment instruction
 * can be initiated by either the debtor/creditor or any subsequent agent in the
 * payment instruction processing chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#Assignment
 * FIToFIPaymentCancellationRequestV06.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#Case
 * FIToFIPaymentCancellationRequestV06.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#ControlData
 * FIToFIPaymentCancellationRequestV06.ControlData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#Underlying
 * FIToFIPaymentCancellationRequestV06.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#SupplementaryData
 * FIToFIPaymentCancellationRequestV06.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#identifier
 * FIToFIPaymentCancellationRequestV06.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentCancellationRequestV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FIToFIPaymentCancellationRequest message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction. The FIToFIPaymentCancellationRequest message is exchanged between the instructing agent and the instructed agent to request the cancellation of a interbank payment message previously sent (such as FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit or FinancialInstitutionCreditTransfer).\r\n\r\nThe FIToFIPaymentCancellationRequest supports for both the request for cancellation (the instructed agent - or assignee - has not yet processed and forwarded the payment instruction) as well as the request for refund (payment has been fully processed already by the instructed agent - or assignee).\r\n\r\nUsage\r\nThe FIToFIPaymentCancellationRequest message must be answered with a:\r\n- ResolutionOfInvestigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- ResolutionOfInvestigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction, ...)\r\n- RejectInvestigation message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- NotificationOfCaseAssignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA FIToFIPaymentCancellationRequest message concerns one and only one original payment instruction at a time.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the ResolutionOfInvestigation message.\r\nThe processing of a FIToFI Payment Cancellation Request message case may lead to a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe FIToFIPaymentCancellationRequest message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original FIToFIPaymentCancellationRequest message and the element ReopenCaseIndication is set to 'Yes' or 'true'.\r\nThe FIToFIPaymentCancellationRequest message has the following main characteristics:\r\nCase Identification:\nThe case creator assigns a unique case identification and the reason code for the cancellation request. This information will be passed unchanged to all subsequent case assignee(s). For the FIToFIPaymentCancellationRequest message the case has been made optional, as the message might be used outside of a case management environment where the case identification is not relevant.\r\nMoreover, the case identification may be present at different levels:\r\n- One unique case is defined per cancellation request message: If multiple underlying groups or transactions are present in the message and the case assignee has already forwarded the transaction for which the cancellation is requested, the case cannot be forwarded to the next party in the chain (see rule on uniqueness of the case) and the case creator will have to issue individual cancellation requests for each underlying individual transaction. In response to this cancellation request, the case must also be present at the message level in the Resolution of Investigation message.\r\n- One case per original group or transaction present in the cancellation request: For each group or transaction, a unique case has been assigned. This means, when a payment instruction has already been forwarded by the case assignee, the cancellation request may be forwarded to next party in the payment chain, with the unique case assigned to the transaction. When the group can only be cancelled partially, new cancellation requests need however to be issued for the individual transactions within the group for which the cancellation request has not been successful. In response to this cancellation request, the case must be present in the cancellation details identifying the original group or transaction in the Resolution of Investigation message.\r\n- No case used in cancellation request message.\r\nCancellation of a cover payment:\nThe cancellation of a payment instruction for which cover is provided by a separate instruction always results in the cancellation of the whole transaction, including the cover. The case assignee performing the cancellation must initiate the return of funds to the case creator. The case assigner must not request the cancellation of the cover separately.\r\nCancellation request initiators:\nThe cancellation of a payment instruction can be initiated by either the debtor/creditor or any subsequent agent in the payment instruction processing chain."
 * </li>
 * </ul>
 */
public class FIToFIPaymentCancellationRequestV06 {

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
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}
	};
	/**
	 * Provides details on the number of transactions and the control sum of the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ControlData1
	 * ControlData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the number of transactions and the control sum of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ControlData = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrlData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlData";
			definition = "Provides details on the number of transactions and the control sum of the message.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ControlData1.mmObject();
		}
	};
	/**
	 * Identifies the payment instruction to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
	 * UnderlyingTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment instruction to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Underlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction to be cancelled.";
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction16.mmObject();
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
	 * messageFunctionality} = "056"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "056";
			version = "06";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentCancellationRequestV06";
				definition = "Scope\r\nThe FIToFIPaymentCancellationRequest message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction. The FIToFIPaymentCancellationRequest message is exchanged between the instructing agent and the instructed agent to request the cancellation of a interbank payment message previously sent (such as FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit or FinancialInstitutionCreditTransfer).\r\n\r\nThe FIToFIPaymentCancellationRequest supports for both the request for cancellation (the instructed agent - or assignee - has not yet processed and forwarded the payment instruction) as well as the request for refund (payment has been fully processed already by the instructed agent - or assignee).\r\n\r\nUsage\r\nThe FIToFIPaymentCancellationRequest message must be answered with a:\r\n- ResolutionOfInvestigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- ResolutionOfInvestigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction, ...)\r\n- RejectInvestigation message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- NotificationOfCaseAssignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA FIToFIPaymentCancellationRequest message concerns one and only one original payment instruction at a time.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the ResolutionOfInvestigation message.\r\nThe processing of a FIToFI Payment Cancellation Request message case may lead to a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe FIToFIPaymentCancellationRequest message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original FIToFIPaymentCancellationRequest message and the element ReopenCaseIndication is set to 'Yes' or 'true'.\r\nThe FIToFIPaymentCancellationRequest message has the following main characteristics:\r\nCase Identification:\nThe case creator assigns a unique case identification and the reason code for the cancellation request. This information will be passed unchanged to all subsequent case assignee(s). For the FIToFIPaymentCancellationRequest message the case has been made optional, as the message might be used outside of a case management environment where the case identification is not relevant.\r\nMoreover, the case identification may be present at different levels:\r\n- One unique case is defined per cancellation request message: If multiple underlying groups or transactions are present in the message and the case assignee has already forwarded the transaction for which the cancellation is requested, the case cannot be forwarded to the next party in the chain (see rule on uniqueness of the case) and the case creator will have to issue individual cancellation requests for each underlying individual transaction. In response to this cancellation request, the case must also be present at the message level in the Resolution of Investigation message.\r\n- One case per original group or transaction present in the cancellation request: For each group or transaction, a unique case has been assigned. This means, when a payment instruction has already been forwarded by the case assignee, the cancellation request may be forwarded to next party in the payment chain, with the unique case assigned to the transaction. When the group can only be cancelled partially, new cancellation requests need however to be issued for the individual transactions within the group for which the cancellation request has not been successful. In response to this cancellation request, the case must be present in the cancellation details identifying the original group or transaction in the Resolution of Investigation message.\r\n- No case used in cancellation request message.\r\nCancellation of a cover payment:\nThe cancellation of a payment instruction for which cover is provided by a separate instruction always results in the cancellation of the whole transaction, including the cover. The case assignee performing the cancellation must initiate the return of funds to the case creator. The case assigner must not request the cancellation of the cover separately.\r\nCancellation request initiators:\nThe cancellation of a payment instruction can be initiated by either the debtor/creditor or any subsequent agent in the payment instruction processing chain.";
				rootElement = "Document";
				xmlTag = "FIToFIPmtCxlReq";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.Assignment, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.Case,
						com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.ControlData, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.Underlying,
						com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}