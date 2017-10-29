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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#AnyBIC
 * OrganisationIdentification8.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#Other
 * OrganisationIdentification8.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#From
 * AccountAdditionalInformationRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#OrganisationIdentification
 * AccountAdditionalInformationRequestV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#From
 * AccountClosingAdditionalInformationRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#OrganisationIdentification
 * AccountClosingAdditionalInformationRequestV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#From
 * AccountClosingAmendmentRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#OrganisationIdentification
 * AccountClosingAmendmentRequestV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#From
 * AccountClosingRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#From
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#From
 * AccountExcludedMandateMaintenanceRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#From
 * AccountMandateMaintenanceAmendmentRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#OrganisationIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#From
 * AccountMandateMaintenanceRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#From
 * AccountOpeningAdditionalInformationRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#OrganisationIdentification
 * AccountOpeningAdditionalInformationRequestV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#From
 * AccountOpeningAmendmentRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#From
 * AccountOpeningRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#From
 * AccountReportRequestV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#OrganisationIdentification
 * AccountReportRequestV02.OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportV02#From
 * AccountReportV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#From
 * AccountRequestAcknowledgementV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#OrganisationIdentification
 * AccountRequestAcknowledgementV02.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#From
 * AccountRequestRejectionV02.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#OrganisationIdentification
 * AccountRequestRejectionV02.OrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrganisationIdentification8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify an organisation."</li>
 * </ul>
 */
public class OrganisationIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution or non financial institution by
	 * the ISO 9362 Registration Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#AnyBIC
	 * OrganisationIdentification.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution or non financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AnyBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OrganisationIdentification8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.AnyBIC;
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial institution or non financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Unique identification of an organisation, as assigned by an institution,
	 * using an identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1
	 * GenericOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of an organisation, as assigned by an institution, using an identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Other = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OrganisationIdentification8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an organisation, as assigned by an institution, using an identification scheme.";
			minOccurs = 0;
			type_lazy = () -> GenericOrganisationIdentification1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification8.AnyBIC, com.tools20022.repository.msg.OrganisationIdentification8.Other);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.From,
						com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.OrganisationIdentification, com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.From,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.OrganisationIdentification, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.From,
						com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.OrganisationIdentification, com.tools20022.repository.area.acmt.AccountClosingRequestV02.From,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.From, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.From,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.From, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.OrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.From, com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.From,
						com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.OrganisationIdentification, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.From,
						com.tools20022.repository.area.acmt.AccountOpeningRequestV02.From, com.tools20022.repository.area.acmt.AccountReportRequestV02.From,
						com.tools20022.repository.area.acmt.AccountReportRequestV02.OrganisationIdentification, com.tools20022.repository.area.acmt.AccountReportV02.From,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.From, com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.OrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountRequestRejectionV02.From, com.tools20022.repository.area.acmt.AccountRequestRejectionV02.OrganisationIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification8";
				definition = "Unique and unambiguous way to identify an organisation.";
			}
		});
		return mmObject_lazy.get();
	}
}