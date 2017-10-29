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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details of the identification assignment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#MessageIdentification
 * IdentificationAssignment2.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#CreationDateTime
 * IdentificationAssignment2.CreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#Creator
 * IdentificationAssignment2.Creator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#FirstAgent
 * IdentificationAssignment2.FirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#Assigner
 * IdentificationAssignment2.Assigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#Assignee
 * IdentificationAssignment2.Assignee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#Assignment
 * IdentificationModificationAdviceV02.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02#Assignment
 * IdentificationVerificationRequestV02.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#Assignment
 * IdentificationVerificationReportV02.Assignment}</li>
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
 * "IdentificationAssignment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the identification assignment."</li>
 * </ul>
 */
public class IdentificationAssignment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the assigner, and sent to the
	 * next party in the chain to unambiguously identify the message.<br>
	 * <br>
	 * Usage: The assigner has to make sure that MessageIdentification is unique
	 * per assignee for a pre-agreed period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the assigner, and sent to the next party in the chain to unambiguously identify the message.\r\n\r\nUsage: The assigner has to make sure that MessageIdentification is unique per assignee for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the assigner, and sent to the next party in the chain to unambiguously identify the message.\r\n\r\nUsage: The assigner has to make sure that MessageIdentification is unique per assignee for a pre-agreed period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which the identification assignment was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
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
	 * definition} =
	 * "Date and time at which the identification assignment was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the identification assignment was created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Party that created the identification assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
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
	 * definition} = "Party that created the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Creator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the identification assignment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the first agent in the identification chain, following the
	 * payment initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the first agent in the identification chain, following the payment initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute FirstAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Identifies the first agent in the identification chain, following the payment initiating party.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Party that assigns the identification assignment to another party. This
	 * is also the sender of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
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
	 * "Party that assigns the identification assignment to another party. This is also the sender of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Assigner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party that assigns the identification assignment to another party. This is also the sender of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that the identification assignment is assigned to. This is also the
	 * receiver of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
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
	 * "Party that the identification assignment is assigned to. This is also the receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Assignee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party that the identification assignment is assigned to. This is also the receiver of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party12Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IdentificationAssignment2.MessageIdentification, com.tools20022.repository.msg.IdentificationAssignment2.CreationDateTime,
						com.tools20022.repository.msg.IdentificationAssignment2.Creator, com.tools20022.repository.msg.IdentificationAssignment2.FirstAgent, com.tools20022.repository.msg.IdentificationAssignment2.Assigner,
						com.tools20022.repository.msg.IdentificationAssignment2.Assignee);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.Assignment, com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02.Assignment,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.Assignment);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationAssignment2";
				definition = "Provides the details of the identification assignment.";
			}
		});
		return mmObject_lazy.get();
	}
}