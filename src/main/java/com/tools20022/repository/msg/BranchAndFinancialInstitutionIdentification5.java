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
import com.tools20022.repository.entity.Organisation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to uniquely and unambiguously identify a financial
 * institution or a branch of a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#FinancialInstitutionIdentification
 * BranchAndFinancialInstitutionIdentification5.
 * FinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#BranchIdentification
 * BranchAndFinancialInstitutionIdentification5.BranchIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#AccountServicerIdentification
 * AccountAdditionalInformationRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#AccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#TransferAccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.
 * TransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#AccountServicerIdentification
 * AccountClosingAmendmentRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#TransferAccountServicerIdentification
 * AccountClosingAmendmentRequestV02.TransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#AccountServicerIdentification
 * AccountClosingRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#TransferAccountServicerIdentification
 * AccountClosingRequestV02.TransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#AccountServicerIdentification
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.
 * AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#AccountServicerIdentification
 * AccountExcludedMandateMaintenanceRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#AccountServicerIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#AccountServicerIdentification
 * AccountMandateMaintenanceRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#AccountServicerIdentification
 * AccountOpeningAdditionalInformationRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#AccountServicerIdentification
 * AccountOpeningAmendmentRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#AccountServicerIdentification
 * AccountOpeningRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#AccountServicerIdentification
 * AccountReportRequestV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#AccountServicerIdentification
 * AccountReportV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#AccountServicerIdentification
 * AccountRequestAcknowledgementV02.AccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#AccountServicerIdentification
 * AccountRequestRejectionV02.AccountServicerIdentification}</li>
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
 * "BranchAndFinancialInstitutionIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution."
 * </li>
 * </ul>
 */
public class BranchAndFinancialInstitutionIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a financial institution, as
	 * assigned under an internationally recognised or proprietary
	 * identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FinancialInstitutionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "FinInstnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionIdentification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies a specific branch of a financial institution.
	 * 
	 * Usage: This component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BranchIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchData2.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.FinancialInstitutionIdentification,
						com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.BranchIdentification);
				trace_lazy = () -> Organisation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.TransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.TransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingRequestV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingRequestV02.TransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningRequestV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountReportRequestV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountReportV02.AccountServicerIdentification, com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.AccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountRequestRejectionV02.AccountServicerIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BranchAndFinancialInstitutionIdentification5";
				definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}
}