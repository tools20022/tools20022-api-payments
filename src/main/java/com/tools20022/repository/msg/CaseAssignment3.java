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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestigationCase;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Represents the assignment of a case to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#Identification
 * CaseAssignment3.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#Assigner
 * CaseAssignment3.Assigner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#Assignee
 * CaseAssignment3.Assignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#CreationDateTime
 * CaseAssignment3.CreationDateTime}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#Assignment
 * NotificationOfCaseAssignmentV04.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#Assignment
 * RejectInvestigationV04.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#Assignment
 * CancelCaseAssignmentV03.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#Assignment
 * RequestForDuplicateV04.Assignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV04#Assignment
 * DuplicateV04.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#Assignment
 * ProprietaryFormatInvestigationV03.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#Assignment
 * DebitAuthorisationResponseV03.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#NewAssignment
 * CaseStatusReportV04.NewAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Assignment
 * UnableToApplyV05.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#Assignment
 * CustomerPaymentCancellationRequestV06.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#Assignment
 * AdditionalPaymentInformationV07.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#Assignment
 * ResolutionOfInvestigationV07.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#Assignment
 * FIToFIPaymentCancellationRequestV06.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#Assignment
 * DebitAuthorisationRequestV05.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Assignment
 * ClaimNonReceiptV05.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#Assignment
 * RequestToModifyPaymentV04.Assignment}</li>
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
 * "CaseAssignment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Represents the assignment of a case to a party."</li>
 * </ul>
 */
public class CaseAssignment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Uniquely identifies the case assignment.
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
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#AssignmentIdentification
	 * InvestigationCase.AssignmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
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
	 * definition} = "Uniquely identifies the case assignment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.AssignmentIdentification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party who assigns the case. Usage: This is also the sender of the
	 * message.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who assigns the case. \nUsage: This is also the sender of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Assigner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party who assigns the case. \nUsage: This is also the sender of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party to which the case is assigned. Usage: This is also the receiver of
	 * the message.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the case is assigned.\nUsage: This is also the receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Assignee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the case is assigned.\nUsage: This is also the receiver of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date and time at which the assignment was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#CreationDateTime
	 * InvestigationCase.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the assignment was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.CreationDateTime;
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the assignment was created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CaseAssignment3.Identification, com.tools20022.repository.msg.CaseAssignment3.Assigner, com.tools20022.repository.msg.CaseAssignment3.Assignee,
						com.tools20022.repository.msg.CaseAssignment3.CreationDateTime);
				trace_lazy = () -> InvestigationCase.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Assignment, com.tools20022.repository.area.camt.RejectInvestigationV04.Assignment,
						com.tools20022.repository.area.camt.CancelCaseAssignmentV03.Assignment, com.tools20022.repository.area.camt.RequestForDuplicateV04.Assignment, com.tools20022.repository.area.camt.DuplicateV04.Assignment,
						com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03.Assignment, com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.Assignment,
						com.tools20022.repository.area.camt.CaseStatusReportV04.NewAssignment, com.tools20022.repository.area.camt.UnableToApplyV05.Assignment,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06.Assignment, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.Assignment,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.Assignment, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.Assignment,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.Assignment, com.tools20022.repository.area.camt.ClaimNonReceiptV05.Assignment,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.Assignment);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseAssignment3";
				definition = "Represents the assignment of a case to a party.";
			}
		});
		return mmObject_lazy.get();
	}
}