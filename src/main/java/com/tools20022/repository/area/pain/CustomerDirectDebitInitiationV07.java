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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader55;
import com.tools20022.repository.msg.PaymentInstruction21;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The CustomerDirectDebitInitiation message is sent by the initiating party to
 * the forwarding agent or creditor agent. It is used to request single or bulk
 * collection(s) of funds from one or various debtor's account(s) for a
 * creditor.<br>
 * <b>Usage</b><br>
 * The CustomerDirectDebitInitiation message can contain one or more direct
 * debit instructions.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the creditor agent.
 * The creditor agent is the account servicer of the creditor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerDirectDebitInitiation message to the creditor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerDirectDebitInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerDirectDebitInitiation may or may not contain mandate related
 * information, i.e. extracts from a mandate, such as MandateIdentification or
 * DateOfSignature. The CustomerDirectDebitInitiation message must not be
 * considered as a mandate.<br>
 * The CustomerDirectDebitInitiation message must not be used by the creditor
 * agent to execute the direct debit instruction(s). The
 * FIToFICustomerDirectDebit message must be used instead.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
 * PaymentsInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CstmrDrctDbtInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#GroupHeader
 * CustomerDirectDebitInitiationV07.GroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#PaymentInformation
 * CustomerDirectDebitInitiationV07.PaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#SupplementaryData
 * CustomerDirectDebitInitiationV07.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#identifier
 * CustomerDirectDebitInitiationV07.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerDirectDebitInitiationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead."
 * </li>
 * </ul>
 */
public class CustomerDirectDebitInitiationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader55
	 * GroupHeader55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GroupHeader55.mmObject();
		}
	};
	/**
	 * Set of characteristics that apply to the credit side of the payment
	 * transactions included in the direct debit transaction initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21
	 * PaymentInstruction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PaymentInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation.";
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstruction21.mmObject();
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
	 * businessArea} = "pain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "008"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "pain";
			messageFunctionality = "008";
			version = "07";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerDirectDebitInitiationV07";
				definition = "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.";
				rootElement = "Document";
				xmlTag = "CstmrDrctDbtInitn";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.GroupHeader, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.PaymentInformation,
						com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}