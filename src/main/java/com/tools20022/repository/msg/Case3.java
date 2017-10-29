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
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestigationCase;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details to identify an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#Identification
 * Case3.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#Creator Case3.Creator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#ReopenCaseIndication
 * Case3.ReopenCaseIndication}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Case
 * NotificationOfCaseAssignmentV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#Case
 * RejectInvestigationV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#Case
 * CancelCaseAssignmentV03.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#Case
 * RequestForDuplicateV04.Case}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV04#Case
 * DuplicateV04.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#Case
 * ProprietaryFormatInvestigationV03.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#Case
 * DebitAuthorisationResponseV03.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#Case
 * CaseStatusReportRequestV03.Case}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#Case
 * CaseStatusReportV04.Case}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Case
 * UnableToApplyV05.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#Case
 * CustomerPaymentCancellationRequestV06.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#Case
 * AdditionalPaymentInformationV07.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#ResolvedCase
 * ResolutionOfInvestigationV07.ResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#Case
 * FIToFIPaymentCancellationRequestV06.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#Case
 * DebitAuthorisationRequestV05.Case}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Case
 * ClaimNonReceiptV05.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#Case
 * RequestToModifyPaymentV04.Case}</li>
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
 * "Case3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details to identify an investigation case."</li>
 * </ul>
 */
public class Case3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Uniquely identifies the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#Identification
	 * InvestigationCase.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party that created the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cretr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that created the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Creator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the investigation case.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates whether or not the case was previously closed and is now
	 * re-opened.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReopCaseIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReopenCaseIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the case was previously closed and is now re-opened."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReopenCaseIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "ReopCaseIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenCaseIndication";
			definition = "Indicates whether or not the case was previously closed and is now re-opened.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Case3.Identification, com.tools20022.repository.msg.Case3.Creator, com.tools20022.repository.msg.Case3.ReopenCaseIndication);
				trace_lazy = () -> InvestigationCase.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Case, com.tools20022.repository.area.camt.RejectInvestigationV04.Case,
						com.tools20022.repository.area.camt.CancelCaseAssignmentV03.Case, com.tools20022.repository.area.camt.RequestForDuplicateV04.Case, com.tools20022.repository.area.camt.DuplicateV04.Case,
						com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03.Case, com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.Case,
						com.tools20022.repository.area.camt.CaseStatusReportRequestV03.Case, com.tools20022.repository.area.camt.CaseStatusReportV04.Case, com.tools20022.repository.area.camt.UnableToApplyV05.Case,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06.Case, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.Case,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.ResolvedCase, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.Case,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.Case, com.tools20022.repository.area.camt.ClaimNonReceiptV05.Case, com.tools20022.repository.area.camt.RequestToModifyPaymentV04.Case);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Case3";
				definition = "Provides further details to identify an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}
}