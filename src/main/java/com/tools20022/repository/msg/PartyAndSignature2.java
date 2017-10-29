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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.ElectronicSignature;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#Party
 * PartyAndSignature2.Party}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#Signature
 * PartyAndSignature2.Signature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
 * ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#DigitalSignature
 * AccountAdditionalInformationRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#DigitalSignature
 * AccountClosingAdditionalInformationRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#DigitalSignature
 * AccountClosingAmendmentRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#DigitalSignature
 * AccountClosingRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#DigitalSignature
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#DigitalSignature
 * AccountExcludedMandateMaintenanceRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#DigitalSignature
 * AccountMandateMaintenanceAmendmentRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#DigitalSignature
 * AccountMandateMaintenanceRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#DigitalSignature
 * AccountOpeningAdditionalInformationRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#DigitalSignature
 * AccountOpeningAmendmentRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#DigitalSignature
 * AccountOpeningRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#DigitalSignature
 * AccountReportRequestV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#DigitalSignature
 * AccountReportV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#DigitalSignature
 * AccountRequestAcknowledgementV02.DigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#DigitalSignature
 * AccountRequestRejectionV02.DigitalSignature}</li>
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
 * "PartyAndSignature2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class PartyAndSignature2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Entity involved in an activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Party = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAndSignature2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Entity involved in an activity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Signature of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryData3
	 * ProprietaryData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signature of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Signature = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAndSignature2.mmObject();
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryData3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndSignature2.Party, com.tools20022.repository.msg.PartyAndSignature2.Signature);
				trace_lazy = () -> ElectronicSignature.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountClosingRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountOpeningRequestV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountReportRequestV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountReportV02.DigitalSignature,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.DigitalSignature, com.tools20022.repository.area.acmt.AccountRequestRejectionV02.DigitalSignature);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyAndSignature2";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}
}