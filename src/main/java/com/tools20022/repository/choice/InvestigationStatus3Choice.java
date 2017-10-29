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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code;
import com.tools20022.repository.codeset.ModificationRejection2Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.msg.Case3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#Confirmation
 * InvestigationStatus3Choice.Confirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#RejectedModification
 * InvestigationStatus3Choice.RejectedModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#DuplicateOf
 * InvestigationStatus3Choice.DuplicateOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice#AssignmentCancellationConfirmation
 * InvestigationStatus3Choice.AssignmentCancellationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
 * PaymentInvestigationCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#Status
 * ResolutionOfInvestigationV07.Status}</li>
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
 * "InvestigationStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an investigation case."</li>
 * </ul>
 */
public class InvestigationStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the status of the investigation, in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation3Code
	 * InvestigationExecutionConfirmation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#InvestigationStatus
	 * PaymentInvestigationCaseResolution.InvestigationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
	 * InvestigationStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the investigation, in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Confirmation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestigationStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationStatus;
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Specifies the status of the investigation, in a coded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmation3Code.mmObject();
		}
	};
	/**
	 * Reason for the rejection of a modification request, in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationRejection2Code
	 * ModificationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#RejectedModification
	 * PaymentInvestigationCaseRejection.RejectedModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
	 * InvestigationStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdMod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the rejection of a modification request, in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RejectedModification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestigationStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedModification;
			isDerived = false;
			xmlTag = "RjctdMod";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request, in a coded form.";
			minOccurs = 1;
			simpleType_lazy = () -> ModificationRejection2Code.mmObject();
		}
	};
	/**
	 * Indicates a duplicated case. Usage: When present, the case identified in
	 * the message must be closed. The case identified as duplicated (in this
	 * component) will be pursued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#DuplicateCase
	 * PaymentInvestigationCaseResolution.DuplicateCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
	 * InvestigationStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DplctOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a duplicated case. \nUsage: When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DuplicateOf = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestigationStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DuplicateCase;
			isDerived = false;
			xmlTag = "DplctOf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOf";
			definition = "Indicates a duplicated case. \nUsage: When present, the case identified in the message must be closed. The case identified as duplicated (in this component) will be pursued.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Case3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates whether the cancellation of the assignment is confirmed or
	 * rejected. Usage: If yes, the cancellation of the assignment is confirmed.
	 * If no, the cancellation of the assignment is rejected and the
	 * investigation process will continue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseRejection#AssignmentCancellationConfirmation
	 * PaymentInvestigationCaseRejection.AssignmentCancellationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus3Choice
	 * InvestigationStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnmtCxlConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentCancellationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cancellation of the assignment is confirmed or rejected.\nUsage: If yes, the cancellation of the assignment is confirmed.\nIf no, the cancellation of the assignment is rejected and the investigation process will continue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AssignmentCancellationConfirmation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestigationStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.AssignmentCancellationConfirmation;
			isDerived = false;
			xmlTag = "AssgnmtCxlConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "Indicates whether the cancellation of the assignment is confirmed or rejected.\nUsage: If yes, the cancellation of the assignment is confirmed.\nIf no, the cancellation of the assignment is rejected and the investigation process will continue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationStatus3Choice.Confirmation, com.tools20022.repository.choice.InvestigationStatus3Choice.RejectedModification,
						com.tools20022.repository.choice.InvestigationStatus3Choice.DuplicateOf, com.tools20022.repository.choice.InvestigationStatus3Choice.AssignmentCancellationConfirmation);
				trace_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.Status);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationStatus3Choice";
				definition = "Specifies the status of an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}
}