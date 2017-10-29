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
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateSuspension1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MandateSuspensionRequest message is sent by the initiator of the request
 * to its agent. The initiator can either be the debtor, debtor agent, creditor
 * or creditor agent.<br>
 * A MandateSuspensionRequest message is used to request the suspension of an
 * existing mandate until the suspension is lifted. <br>
 * <b>Usage</b><br>
 * The MandateSuspensionRequest message can contain one or more suspension
 * requests.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The MandateSuspensionRequest message can be used in domestic and cross-border
 * scenarios.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
 * PaymentsInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MndtSspnsnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#GroupHeader
 * MandateSuspensionRequestV01.GroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#UnderlyingSuspensionDetails
 * MandateSuspensionRequestV01.UnderlyingSuspensionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#SupplementaryData
 * MandateSuspensionRequestV01.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#identifier
 * MandateSuspensionRequestV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateSuspensionRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateSuspensionRequest message is sent by the initiator of the request to its agent. The initiator can either be the debtor, debtor agent, creditor or creditor agent.\r\nA MandateSuspensionRequest message is used to request the suspension of an existing mandate until the suspension is lifted. \r\nUsage\r\nThe MandateSuspensionRequest message can contain one or more suspension requests.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe MandateSuspensionRequest message can be used in domestic and cross-border scenarios.\r\n"
 * </li>
 * </ul>
 */
public class MandateSuspensionRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate suspension request, but which are not part of the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
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
	 * "Set of characteristics to identify the message and parties playing a role in the mandate suspension request, but which are not part of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate suspension request, but which are not part of the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}
	};
	/**
	 * Set of elements used to provide information on the suspension request of
	 * the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MandateSuspension1
	 * MandateSuspension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygSspnsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSuspensionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the suspension request of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock UnderlyingSuspensionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygSspnsnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSuspensionDetails";
			definition = "Set of elements used to provide information on the suspension request of the mandate.";
			minOccurs = 1;
			complexType_lazy = () -> MandateSuspension1.mmObject();
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
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "pain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "018"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "pain";
			messageFunctionality = "018";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateSuspensionRequestV01";
				definition = "Scope\r\nThe MandateSuspensionRequest message is sent by the initiator of the request to its agent. The initiator can either be the debtor, debtor agent, creditor or creditor agent.\r\nA MandateSuspensionRequest message is used to request the suspension of an existing mandate until the suspension is lifted. \r\nUsage\r\nThe MandateSuspensionRequest message can contain one or more suspension requests.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe MandateSuspensionRequest message can be used in domestic and cross-border scenarios.\r\n";
				rootElement = "Document";
				xmlTag = "MndtSspnsnReq";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateSuspensionRequestV01.GroupHeader, com.tools20022.repository.area.pain.MandateSuspensionRequestV01.UnderlyingSuspensionDetails,
						com.tools20022.repository.area.pain.MandateSuspensionRequestV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.MandateSuspensionRequestV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}