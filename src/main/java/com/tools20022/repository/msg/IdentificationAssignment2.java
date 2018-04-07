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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02;
import com.tools20022.repository.area.acmt.IdentificationVerificationReportV02;
import com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02;
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmMessageIdentification
 * IdentificationAssignment2.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmCreationDateTime
 * IdentificationAssignment2.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmCreator
 * IdentificationAssignment2.mmCreator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmFirstAgent
 * IdentificationAssignment2.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmAssigner
 * IdentificationAssignment2.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2#mmAssignee
 * IdentificationAssignment2.mmAssignee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmAssignment
 * IdentificationModificationAdviceV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02#mmAssignment
 * IdentificationVerificationRequestV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmAssignment
 * IdentificationVerificationReportV02.mmAssignment}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationAssignment2", propOrder = {"messageIdentification", "creationDateTime", "creator", "firstAgent", "assigner", "assignee"})
public class IdentificationAssignment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<IdentificationAssignment2, Max35Text> mmMessageIdentification = new MMMessageAttribute<IdentificationAssignment2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the assigner, and sent to the next party in the chain to unambiguously identify the message.\r\n\r\nUsage: The assigner has to make sure that MessageIdentification is unique per assignee for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationAssignment2 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<IdentificationAssignment2, ISODateTime> mmCreationDateTime = new MMMessageAttribute<IdentificationAssignment2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the identification assignment was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IdentificationAssignment2 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "Cretr")
	protected Party12Choice creator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<IdentificationAssignment2, Optional<Party12Choice>> mmCreator = new MMMessageAssociationEnd<IdentificationAssignment2, Optional<Party12Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the identification assignment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Optional<Party12Choice> getValue(IdentificationAssignment2 obj) {
			return obj.getCreator();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, Optional<Party12Choice> value) {
			obj.setCreator(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstAgt")
	protected BranchAndFinancialInstitutionIdentification5 firstAgent;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<IdentificationAssignment2, Optional<BranchAndFinancialInstitutionIdentification5>> mmFirstAgent = new MMMessageAttribute<IdentificationAssignment2, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Identifies the first agent in the identification chain, following the payment initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(IdentificationAssignment2 obj) {
			return obj.getFirstAgent();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setFirstAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Assgnr", required = true)
	protected Party12Choice assigner;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<IdentificationAssignment2, Party12Choice> mmAssigner = new MMMessageAssociationEnd<IdentificationAssignment2, Party12Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party that assigns the identification assignment to another party. This is also the sender of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Party12Choice getValue(IdentificationAssignment2 obj) {
			return obj.getAssigner();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, Party12Choice value) {
			obj.setAssigner(value);
		}
	};
	@XmlElement(name = "Assgne", required = true)
	protected Party12Choice assignee;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<IdentificationAssignment2, Party12Choice> mmAssignee = new MMMessageAssociationEnd<IdentificationAssignment2, Party12Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party that the identification assignment is assigned to. This is also the receiver of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Party12Choice getValue(IdentificationAssignment2 obj) {
			return obj.getAssignee();
		}

		@Override
		public void setValue(IdentificationAssignment2 obj, Party12Choice value) {
			obj.setAssignee(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IdentificationAssignment2.mmMessageIdentification, com.tools20022.repository.msg.IdentificationAssignment2.mmCreationDateTime,
						com.tools20022.repository.msg.IdentificationAssignment2.mmCreator, com.tools20022.repository.msg.IdentificationAssignment2.mmFirstAgent, com.tools20022.repository.msg.IdentificationAssignment2.mmAssigner,
						com.tools20022.repository.msg.IdentificationAssignment2.mmAssignee);
				messageBuildingBlock_lazy = () -> Arrays.asList(IdentificationModificationAdviceV02.mmAssignment, IdentificationVerificationRequestV02.mmAssignment, IdentificationVerificationReportV02.mmAssignment);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationAssignment2";
				definition = "Provides the details of the identification assignment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public IdentificationAssignment2 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public IdentificationAssignment2 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<Party12Choice> getCreator() {
		return creator == null ? Optional.empty() : Optional.of(creator);
	}

	public IdentificationAssignment2 setCreator(Party12Choice creator) {
		this.creator = creator;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getFirstAgent() {
		return firstAgent == null ? Optional.empty() : Optional.of(firstAgent);
	}

	public IdentificationAssignment2 setFirstAgent(BranchAndFinancialInstitutionIdentification5 firstAgent) {
		this.firstAgent = firstAgent;
		return this;
	}

	public Party12Choice getAssigner() {
		return assigner;
	}

	public IdentificationAssignment2 setAssigner(Party12Choice assigner) {
		this.assigner = Objects.requireNonNull(assigner);
		return this;
	}

	public Party12Choice getAssignee() {
		return assignee;
	}

	public IdentificationAssignment2 setAssignee(Party12Choice assignee) {
		this.assignee = Objects.requireNonNull(assignee);
		return this;
	}
}