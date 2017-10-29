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
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.SearchCriteria1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.DueDate1;
import com.tools20022.repository.msg.LegalMandate1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message is sent by the authorities (police, customs, tax authorities,
 * enforcement authorities) to a financial institution to request account and
 * other banking and financial information. Requested information can relate to
 * accounts, their signatories and beneficiaries and co-owners as well as
 * movements plus positions on these accounts.<br>
 * <br>
 * Requests are underpinned by specific legal texts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InfReqOpng"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#InvestigationIdentification
 * InformationRequestOpeningV01.InvestigationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#LegalMandateBasis
 * InformationRequestOpeningV01.LegalMandateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#ConfidentialityStatus
 * InformationRequestOpeningV01.ConfidentialityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#DueDate
 * InformationRequestOpeningV01.DueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#InvestigationPeriod
 * InformationRequestOpeningV01.InvestigationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#SearchCriteria
 * InformationRequestOpeningV01.SearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#SupplementaryData
 * InformationRequestOpeningV01.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#identifier
 * InformationRequestOpeningV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationRequestOpeningV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts. "
 * </li>
 * </ul>
 */
public class InformationRequestOpeningV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * Provides details on the legal basis of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LegalMandate1
	 * LegalMandate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglMndtBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalMandateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the legal basis of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock LegalMandateBasis = new MMMessageBuildingBlock() {
		{
			xmlTag = "LglMndtBsis";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalMandateBasis";
			definition = "Provides details on the legal basis of the request.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> LegalMandate1.mmObject();
		}
	};
	/**
	 * Specifies the confidentiality status of the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfdtltySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfidentialityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the confidentiality status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ConfidentialityStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "CnfdtltySts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfidentialityStatus";
			definition = "Specifies the confidentiality status of the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the date by when the financial institutiion needs to provide a
	 * response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DueDate1
	 * DueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date by when the financial institutiion needs to provide a response."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock DueDate = new MMMessageBuildingBlock() {
		{
			xmlTag = "DueDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Specifies the date by when the financial institutiion needs to provide a response.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DueDate1.mmObject();
		}
	};
	/**
	 * Specifies the dates between which period the authority requests that the
	 * financial institution provides a response to the information request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the dates between which period the authority requests that the financial institution provides a response to the information request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock InvestigationPeriod = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstgtnPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationPeriod";
			definition = "Specifies the dates between which period the authority requests that the financial institution provides a response to the information request.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
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
	 * messageFunctionality} = "001"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "auth";
			messageFunctionality = "001";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationRequestOpeningV01";
				definition = "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts. ";
				rootElement = "Document";
				xmlTag = "InfReqOpng";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestOpeningV01.InvestigationIdentification,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.LegalMandateBasis, com.tools20022.repository.area.auth.InformationRequestOpeningV01.ConfidentialityStatus,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.DueDate, com.tools20022.repository.area.auth.InformationRequestOpeningV01.InvestigationPeriod,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.SearchCriteria, com.tools20022.repository.area.auth.InformationRequestOpeningV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.auth.InformationRequestOpeningV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}