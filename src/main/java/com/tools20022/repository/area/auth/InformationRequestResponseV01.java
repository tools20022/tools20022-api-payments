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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.SearchCriteria1Choice;
import com.tools20022.repository.codeset.StatusResponse1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ReturnIndicator1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message is sent by the financial institution to the authorities (police,
 * customs, tax authorities, enforcement authorities) to provide a part or all
 * of the requested information.<br>
 * The financial institution previously received a request for financial
 * information in the scope of a financial investigation.<br>
 * <br>
 * Depending on whether the response can be provided STP within the authorities
 * financial investigations messages, the requested information may be <br>
 * • provided in part or in full within the response message itself, or <br>
 * • only referred to in the response message
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InfReqRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#ResponseIdentification
 * InformationRequestResponseV01.ResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#InvestigationIdentification
 * InformationRequestResponseV01.InvestigationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#ResponseStatus
 * InformationRequestResponseV01.ResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#SearchCriteria
 * InformationRequestResponseV01.SearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#ReturnIndicator
 * InformationRequestResponseV01.ReturnIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#SupplementaryData
 * InformationRequestResponseV01.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#identifier
 * InformationRequestResponseV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationRequestResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message is sent by the financial institution to the authorities (police, customs, tax authorities, enforcement authorities) to provide a part or all of the requested information.\r\nThe financial institution previously received a request for financial information in the scope of a financial investigation.\r\n\r\nDepending on whether the response can be provided STP within the authorities financial investigations messages, the requested information may be \r\n•\tprovided in part or in full within the response message itself, or \r\n•\tonly referred to in the response message"
 * </li>
 * </ul>
 */
public class InformationRequestResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification for the specific investigation as know by the
	 * responding party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification for the specific investigation as know by the responding party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ResponseIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RspnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseIdentification";
			definition = "Unique identification for the specific investigation as know by the responding party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification for the specific investigation as known by the
	 * requesting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification for the specific investigation as known by the requesting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock InvestigationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstgtnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationIdentification";
			definition = "Unique identification for the specific investigation as known by the requesting party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides the status of the response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusResponse1Code
	 * StatusResponse1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the response."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ResponseStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RspnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the response.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StatusResponse1Code.mmObject();
		}
	};
	/**
	 * Specifies the the search criteria for the financial institution to
	 * perform the search on. The search criteria can be an account, a customer
	 * identification or a payment instrument type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SearchCriteria = new MMMessageBuildingBlock() {
		{
			xmlTag = "SchCrit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SearchCriteria1Choice.mmObject();
		}
	};
	/**
	 * Provides the return indicators and the investigation result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the return indicators and the investigation result."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ReturnIndicator = new MMMessageBuildingBlock() {
		{
			xmlTag = "RtrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnIndicator";
			definition = "Provides the return indicators and the investigation result.";
			minOccurs = 1;
			complexType_lazy = () -> ReturnIndicator1.mmObject();
		}
	};
	/**
	 * Additional information that can not be captured in the structured fields
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
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
	 * businessArea} = "auth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "002"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "auth";
			messageFunctionality = "002";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationRequestResponseV01";
				definition = "This message is sent by the financial institution to the authorities (police, customs, tax authorities, enforcement authorities) to provide a part or all of the requested information.\r\nThe financial institution previously received a request for financial information in the scope of a financial investigation.\r\n\r\nDepending on whether the response can be provided STP within the authorities financial investigations messages, the requested information may be \r\n•\tprovided in part or in full within the response message itself, or \r\n•\tonly referred to in the response message";
				rootElement = "Document";
				xmlTag = "InfReqRspn";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestResponseV01.ResponseIdentification,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.InvestigationIdentification, com.tools20022.repository.area.auth.InformationRequestResponseV01.ResponseStatus,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.SearchCriteria, com.tools20022.repository.area.auth.InformationRequestResponseV01.ReturnIndicator,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.auth.InformationRequestResponseV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}