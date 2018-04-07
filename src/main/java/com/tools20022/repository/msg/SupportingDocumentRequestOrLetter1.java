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
import com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01;
import com.tools20022.repository.choice.Party28Choice;
import com.tools20022.repository.codeset.SupportDocumentType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentGeneralInformation3;
import com.tools20022.repository.msg.OriginalMessage2;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Currency control related document or letter supporting the contract
 * registration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmRequestOrLetterIdentification
 * SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDate
 * SupportingDocumentRequestOrLetter1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSender
 * SupportingDocumentRequestOrLetter1.mmSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmReceiver
 * SupportingDocumentRequestOrLetter1.mmReceiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmOriginalReferences
 * SupportingDocumentRequestOrLetter1.mmOriginalReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSubject
 * SupportingDocumentRequestOrLetter1.mmSubject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmType
 * SupportingDocumentRequestOrLetter1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDescription
 * SupportingDocumentRequestOrLetter1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmResponseRequired
 * SupportingDocumentRequestOrLetter1.mmResponseRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDueDate
 * SupportingDocumentRequestOrLetter1.mmDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmAttachment
 * SupportingDocumentRequestOrLetter1.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSupplementaryData
 * SupportingDocumentRequestOrLetter1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01#mmRequestOrLetter
 * CurrencyControlRequestOrLetterV01.mmRequestOrLetter}</li>
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
 * "SupportingDocumentRequestOrLetter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency control related document or letter supporting the contract registration."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupportingDocumentRequestOrLetter1", propOrder = {"requestOrLetterIdentification", "date", "sender", "receiver", "originalReferences", "subject", "type", "description", "responseRequired", "dueDate", "attachment",
		"supplementaryData"})
public class SupportingDocumentRequestOrLetter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqOrLttrId", required = true)
	protected Max35Text requestOrLetterIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqOrLttrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestOrLetterIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the supporting document request or the letter."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, Max35Text> mmRequestOrLetterIdentification = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "ReqOrLttrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestOrLetterIdentification";
			definition = "Unique and unambiguous identification of the supporting document request or the letter.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getRequestOrLetterIdentification();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Max35Text value) {
			obj.setRequestOrLetterIdentification(value);
		}
	};
	@XmlElement(name = "Dt")
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the supporting document request or the letter."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<ISODate>> mmDate = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of the supporting document request or the letter.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Optional<ISODate> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Sndr")
	protected Party28Choice sender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party28Choice
	 * Party28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSendingParty
	 * RegisteredContract.mmSendingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sender of the request or letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, Optional<Party28Choice>> mmSender = new MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, Optional<Party28Choice>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmSendingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Sender of the request or letter.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party28Choice.mmObject();
		}

		@Override
		public Optional<Party28Choice> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getSender();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Optional<Party28Choice> value) {
			obj.setSender(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcvr")
	protected Party28Choice receiver;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party28Choice
	 * Party28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReceivingParty
	 * RegisteredContract.mmReceivingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Receiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver of the request or letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, Optional<Party28Choice>> mmReceiver = new MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, Optional<Party28Choice>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmReceivingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Rcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Receiver";
			definition = "Receiver of the request or letter.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party28Choice.mmObject();
		}

		@Override
		public Optional<Party28Choice> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getReceiver();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Optional<Party28Choice> value) {
			obj.setReceiver(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlRefs")
	protected List<OriginalMessage2> originalReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the references of the original underlying message(s) for which supporting documents are requested or for which the letter is sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<OriginalMessage2>> mmOriginalReferences = new MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<OriginalMessage2>>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReferences";
			definition = "Provides the references of the original underlying message(s) for which supporting documents are requested or for which the letter is sent.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMessage2.mmObject();
		}

		@Override
		public List<OriginalMessage2> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getOriginalReferences();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, List<OriginalMessage2> value) {
			obj.setOriginalReferences(value);
		}
	};
	@XmlElement(name = "Sbjt", required = true)
	protected Max140Text subject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPurpose
	 * Document.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sbjt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subject of the letter or supporting document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, Max140Text> mmSubject = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, Max140Text>() {
		{
			businessElementTrace_lazy = () -> Document.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Sbjt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subject";
			definition = "Subject of the letter or supporting document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getSubject();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Max140Text value) {
			obj.setSubject(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected SupportDocumentType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code
	 * SupportDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the type of supporting document requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, SupportDocumentType1Code> mmType = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, SupportDocumentType1Code>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Provides the type of supporting document requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SupportDocumentType1Code.mmObject();
		}

		@Override
		public SupportDocumentType1Code getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, SupportDocumentType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max1025Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further free format description of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<Max1025Text>> mmDescription = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<Max1025Text>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Further free format description of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Optional<Max1025Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnReqrd", required = true)
	protected TrueFalseIndicator responseRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to indicate whether a response is required or not.\r\n\r\nUsage: when the request is used to send a letter, there is no response required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, TrueFalseIndicator> mmResponseRequired = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "RspnReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseRequired";
			definition = "Flag to indicate whether a response is required or not.\r\n\r\nUsage: when the request is used to send a letter, there is no response required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getResponseRequired();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, TrueFalseIndicator value) {
			obj.setResponseRequired(value);
		}
	};
	@XmlElement(name = "DueDt")
	protected ISODate dueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
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
	 * definition} = "Date by which the response to the request is expected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<ISODate>> mmDueDate = new MMMessageAttribute<SupportingDocumentRequestOrLetter1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Date by which the response to the request is expected.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getDueDate();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, Optional<ISODate> value) {
			obj.setDueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Attchmnt")
	protected List<DocumentGeneralInformation3> attachment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attchmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents provided as attachments to the supporting document request or letter."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<DocumentGeneralInformation3>> mmAttachment = new MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<DocumentGeneralInformation3>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmAttachment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the supporting document request or letter.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
		}

		@Override
		public List<DocumentGeneralInformation3> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getAttachment();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, List<DocumentGeneralInformation3> value) {
			obj.setAttachment(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
	 * SupportingDocumentRequestOrLetter1}</li>
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<SupportingDocumentRequestOrLetter1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SupportingDocumentRequestOrLetter1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SupportingDocumentRequestOrLetter1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmDate,
						com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmSender, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmReceiver,
						com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmOriginalReferences, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmSubject,
						com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmType, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmDescription,
						com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmResponseRequired, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmDueDate,
						com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmAttachment, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(CurrencyControlRequestOrLetterV01.mmRequestOrLetter);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportingDocumentRequestOrLetter1";
				definition = "Currency control related document or letter supporting the contract registration.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRequestOrLetterIdentification() {
		return requestOrLetterIdentification;
	}

	public SupportingDocumentRequestOrLetter1 setRequestOrLetterIdentification(Max35Text requestOrLetterIdentification) {
		this.requestOrLetterIdentification = Objects.requireNonNull(requestOrLetterIdentification);
		return this;
	}

	public Optional<ISODate> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public SupportingDocumentRequestOrLetter1 setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public Optional<Party28Choice> getSender() {
		return sender == null ? Optional.empty() : Optional.of(sender);
	}

	public SupportingDocumentRequestOrLetter1 setSender(Party28Choice sender) {
		this.sender = sender;
		return this;
	}

	public Optional<Party28Choice> getReceiver() {
		return receiver == null ? Optional.empty() : Optional.of(receiver);
	}

	public SupportingDocumentRequestOrLetter1 setReceiver(Party28Choice receiver) {
		this.receiver = receiver;
		return this;
	}

	public List<OriginalMessage2> getOriginalReferences() {
		return originalReferences == null ? originalReferences = new ArrayList<>() : originalReferences;
	}

	public SupportingDocumentRequestOrLetter1 setOriginalReferences(List<OriginalMessage2> originalReferences) {
		this.originalReferences = Objects.requireNonNull(originalReferences);
		return this;
	}

	public Max140Text getSubject() {
		return subject;
	}

	public SupportingDocumentRequestOrLetter1 setSubject(Max140Text subject) {
		this.subject = Objects.requireNonNull(subject);
		return this;
	}

	public SupportDocumentType1Code getType() {
		return type;
	}

	public SupportingDocumentRequestOrLetter1 setType(SupportDocumentType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max1025Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public SupportingDocumentRequestOrLetter1 setDescription(Max1025Text description) {
		this.description = description;
		return this;
	}

	public TrueFalseIndicator getResponseRequired() {
		return responseRequired;
	}

	public SupportingDocumentRequestOrLetter1 setResponseRequired(TrueFalseIndicator responseRequired) {
		this.responseRequired = Objects.requireNonNull(responseRequired);
		return this;
	}

	public Optional<ISODate> getDueDate() {
		return dueDate == null ? Optional.empty() : Optional.of(dueDate);
	}

	public SupportingDocumentRequestOrLetter1 setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public List<DocumentGeneralInformation3> getAttachment() {
		return attachment == null ? attachment = new ArrayList<>() : attachment;
	}

	public SupportingDocumentRequestOrLetter1 setAttachment(List<DocumentGeneralInformation3> attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SupportingDocumentRequestOrLetter1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}