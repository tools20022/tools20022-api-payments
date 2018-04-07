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
import com.tools20022.repository.area.acmt.AccountReportV02;
import com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02;
import com.tools20022.repository.codeset.UseCases1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MessageIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements for the identification of the message and related references.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.References5#mmRequestType
 * References5.mmRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References5#mmMessageIdentification
 * References5.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References5#mmProcessIdentification
 * References5.mmProcessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References5#mmAcknowledgedMessageIdentification
 * References5.mmAcknowledgedMessageIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References5#mmStatus
 * References5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References5#mmAttachedDocumentName
 * References5.mmAttachedDocumentName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#mmReferences
 * AccountReportV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmReferences
 * AccountRequestAcknowledgementV02.mmReferences}</li>
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
 * "References5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements for the identification of the message and related references."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References5", propOrder = {"requestType", "messageIdentification", "processIdentification", "acknowledgedMessageIdentification", "status", "attachedDocumentName"})
public class References5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqTp", required = true)
	protected UseCases1Code requestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UseCases1Code
	 * UseCases1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of acknowledged request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References5, UseCases1Code> mmRequestType = new MMMessageAttribute<References5, UseCases1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "ReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestType";
			definition = "Identifies the type of acknowledged request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UseCases1Code.mmObject();
		}

		@Override
		public UseCases1Code getValue(References5 obj) {
			return obj.getRequestType();
		}

		@Override
		public void setValue(References5 obj, UseCases1Code value) {
			obj.setRequestType(value);
		}
	};
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
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
	 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References5, MessageIdentification1> mmMessageIdentification = new MMMessageAssociationEnd<References5, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(References5 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(References5 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PrcId", required = true)
	protected MessageIdentification1 processIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References5, MessageIdentification1> mmProcessIdentification = new MMMessageAssociationEnd<References5, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "PrcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessIdentification";
			definition = "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(References5 obj) {
			return obj.getProcessIdentification();
		}

		@Override
		public void setValue(References5 obj, MessageIdentification1 value) {
			obj.setProcessIdentification(value);
		}
	};
	@XmlElement(name = "AckdMsgId")
	protected List<MessageIdentification1> acknowledgedMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the message that is acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References5, List<MessageIdentification1>> mmAcknowledgedMessageIdentification = new MMMessageAssociationEnd<References5, List<MessageIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "AckdMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedMessageIdentification";
			definition = "Reference to the message that is acknowledged.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public List<MessageIdentification1> getValue(References5 obj) {
			return obj.getAcknowledgedMessageIdentification();
		}

		@Override
		public void setValue(References5 obj, List<MessageIdentification1> value) {
			obj.setAcknowledgedMessageIdentification(value);
		}
	};
	@XmlElement(name = "Sts")
	protected Max35Text status;
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
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References5, Optional<Max35Text>> mmStatus = new MMMessageAttribute<References5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(References5 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(References5 obj, Optional<Max35Text> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AttchdDocNm")
	protected List<Max70Text> attachedDocumentName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References5 References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdDocNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedDocumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File name of a document logically related to the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References5, List<Max70Text>> mmAttachedDocumentName = new MMMessageAttribute<References5, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References5.mmObject();
			isDerived = false;
			xmlTag = "AttchdDocNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedDocumentName";
			definition = "File name of a document logically related to the request.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(References5 obj) {
			return obj.getAttachedDocumentName();
		}

		@Override
		public void setValue(References5 obj, List<Max70Text> value) {
			obj.setAttachedDocumentName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.References5.mmRequestType, com.tools20022.repository.msg.References5.mmMessageIdentification,
						com.tools20022.repository.msg.References5.mmProcessIdentification, com.tools20022.repository.msg.References5.mmAcknowledgedMessageIdentification, com.tools20022.repository.msg.References5.mmStatus,
						com.tools20022.repository.msg.References5.mmAttachedDocumentName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountReportV02.mmReferences, AccountRequestAcknowledgementV02.mmReferences);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References5";
				definition = "Set of elements for the identification of the message and related references.";
			}
		});
		return mmObject_lazy.get();
	}

	public UseCases1Code getRequestType() {
		return requestType;
	}

	public References5 setRequestType(UseCases1Code requestType) {
		this.requestType = Objects.requireNonNull(requestType);
		return this;
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public References5 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public MessageIdentification1 getProcessIdentification() {
		return processIdentification;
	}

	public References5 setProcessIdentification(MessageIdentification1 processIdentification) {
		this.processIdentification = Objects.requireNonNull(processIdentification);
		return this;
	}

	public List<MessageIdentification1> getAcknowledgedMessageIdentification() {
		return acknowledgedMessageIdentification == null ? acknowledgedMessageIdentification = new ArrayList<>() : acknowledgedMessageIdentification;
	}

	public References5 setAcknowledgedMessageIdentification(List<MessageIdentification1> acknowledgedMessageIdentification) {
		this.acknowledgedMessageIdentification = Objects.requireNonNull(acknowledgedMessageIdentification);
		return this;
	}

	public Optional<Max35Text> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public References5 setStatus(Max35Text status) {
		this.status = status;
		return this;
	}

	public List<Max70Text> getAttachedDocumentName() {
		return attachedDocumentName == null ? attachedDocumentName = new ArrayList<>() : attachedDocumentName;
	}

	public References5 setAttachedDocumentName(List<Max70Text> attachedDocumentName) {
		this.attachedDocumentName = Objects.requireNonNull(attachedDocumentName);
		return this;
	}
}