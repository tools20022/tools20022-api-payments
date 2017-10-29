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
import com.tools20022.repository.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.MissingCover3;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Scope The Claim Non Receipt message is sent by a case creator/case assigner
 * to a case assignee. This message is used to initiate an investigation for
 * missing funds at the creditor (missing credit entry to its account) or at an
 * agent along the processing chain (missing cover for a received payment
 * instruction). Usage The claim non receipt case occurs in two situations: -
 * The creditor is expecting funds from a particular debtor and cannot find the
 * corresponding credit entry on its account. In this situation, it is
 * understood that the creditor will contact its debtor, and that the debtor
 * will trigger the claim non receipt case on its behalf. A workflow where the
 * creditor directly addresses a Claim Non Receipt message to its account
 * servicing institution is not retained. - An agent in the processing chain
 * cannot find a cover payment corresponding to a received payment instruction.
 * In this situation, the agent may directly trigger the investigation by
 * sending a Claim Non Receipt message to the sender of the original payment
 * instruction. The Claim Non Receipt message covers one and only one payment
 * instruction at a time. If several expected payment instructions/cover
 * instructions are found missing, then multiple Claim Non Receipt messages must
 * be sent. Depending on the result of the investigation by a case assignee
 * (incorrect routing, errors/omissions when processing the instruction or even
 * the absence of an error) and the stage at which the payment instruction is
 * being process, the claim non receipt case may lead to a: - Request To Cancel
 * Payment message, sent to the subsequent agent in the payment processing
 * chain, if the original payment instruction has been incorrectly routed
 * through the chain of agents. (This also implies that a new, corrected,
 * payment instruction is issued). - Request To Modify Payment message, sent to
 * the subsequent agent in the payment processing chain, if a truncation or
 * omission has occurred during the processing of the original payment
 * instruction. If the above situations occur, the assignee wanting to request a
 * payment cancellation or payment modification should first send out a
 * Resolution Of Investigation with a confirmation status that indicates that
 * either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will
 * follow. (See section on Resolution Of Investigation for more details). In the
 * cover is missing, the case assignee may also simply issue the omitted cover
 * payment or when the initial cover information was incorrect, update the cover
 * (through modification and/or cancellation as required) with the correction
 * information provided in the ClaimNonReceipt message. The case assignee will
 * issue a Resolution Of Investigation message with the CorrectionTransaction
 * element mentioning the references of the cover payment. The Claim Non Receipt
 * message may be forwarded to subsequent case assignees. The ClaimNonReceipt
 * message has the following main characteristics: - Case Identification: The
 * case creator assigns a unique case identification. This information will be
 * passed unchanged to subsequent case assignee(s). - Underlying Payment: The
 * case creator refers to the underlying payment instruction for the unambiguous
 * identification of the payment instruction. This identification needs to be
 * updated by the subsequent case assigner(s) in order to match the one used
 * with their case assignee(s). - MissingCoverIndicator: The
 * MissingCoverIndication element distinguishes between a missing cover
 * situation (when set to YES) or a missing funds situation (when set to NO). -
 * CoverCorrection The CoverCorrection element allows the case assigner to
 * provide corrected cover information, when these are incorrect in the
 * underlying payment instruction for which the cover is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ClmNonRct"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Assignment
 * ClaimNonReceiptV05.Assignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Case
 * ClaimNonReceiptV05.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Underlying
 * ClaimNonReceiptV05.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#CoverDetails
 * ClaimNonReceiptV05.CoverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#SupplementaryData
 * ClaimNonReceiptV05.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#identifier
 * ClaimNonReceiptV05.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClaimNonReceiptV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\nUsage\nThe claim non receipt case occurs in two situations:\n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a:\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\nThe Claim Non Receipt message may be forwarded to subsequent case assignees.\nThe ClaimNonReceipt message has the following main characteristics:\n- Case Identification:\nThe case creator assigns a unique case identification. This information will be passed unchanged to subsequent case assignee(s).\n- Underlying Payment:\nThe case creator refers to the underlying payment instruction for the unambiguous identification of the payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- MissingCoverIndicator:\nThe MissingCoverIndication element distinguishes between a missing cover situation (when set to YES) or a missing funds situation (when set to NO).\n- CoverCorrection\nThe CoverCorrection element allows the case assigner to provide corrected cover information, when these are incorrect in the underlying payment instruction for which the cover is issued."
 * </li>
 * </ul>
 */
public class ClaimNonReceiptV05 {

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
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}
	};
	/**
	 * Identifies the payment instruction for which the Creditor has not
	 * received the funds. Usage: In case of a missing cover, it must be the
	 * identification of the related payment instruction. In case of a claim non
	 * receipt initiated by the debtor, it must be the identification of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
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
	 * definition} =
	 * "Identifies the payment instruction for which the Creditor has not received the funds.\nUsage: In case of a missing cover, it must be the identification of the related payment instruction.\nIn case of a claim non receipt initiated by the debtor, it must be the identification of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Underlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction for which the Creditor has not received the funds.\nUsage: In case of a missing cover, it must be the identification of the related payment instruction.\nIn case of a claim non receipt initiated by the debtor, it must be the identification of the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction3Choice.mmObject();
		}
	};
	/**
	 * Provides the cover related information of a claim non receipt
	 * investigation. The absence of the component means that the message is not
	 * a cover related investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MissingCover3
	 * MissingCover3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the cover related information of a claim non receipt investigation. The absence of the component means that the message is not a cover related investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CoverDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CoverDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverDetails";
			definition = "Provides the cover related information of a claim non receipt investigation. The absence of the component means that the message is not a cover related investigation.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MissingCover3.mmObject();
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
	 * version} = "05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "027"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "027";
			version = "05";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClaimNonReceiptV05";
				definition = "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\nUsage\nThe claim non receipt case occurs in two situations:\n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a:\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\nThe Claim Non Receipt message may be forwarded to subsequent case assignees.\nThe ClaimNonReceipt message has the following main characteristics:\n- Case Identification:\nThe case creator assigns a unique case identification. This information will be passed unchanged to subsequent case assignee(s).\n- Underlying Payment:\nThe case creator refers to the underlying payment instruction for the unambiguous identification of the payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- MissingCoverIndicator:\nThe MissingCoverIndication element distinguishes between a missing cover situation (when set to YES) or a missing funds situation (when set to NO).\n- CoverCorrection\nThe CoverCorrection element allows the case assigner to provide corrected cover information, when these are incorrect in the underlying payment instruction for which the cover is issued.";
				rootElement = "Document";
				xmlTag = "ClmNonRct";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ClaimNonReceiptV05.Assignment, com.tools20022.repository.area.camt.ClaimNonReceiptV05.Case,
						com.tools20022.repository.area.camt.ClaimNonReceiptV05.Underlying, com.tools20022.repository.area.camt.ClaimNonReceiptV05.CoverDetails, com.tools20022.repository.area.camt.ClaimNonReceiptV05.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.ClaimNonReceiptV05.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}