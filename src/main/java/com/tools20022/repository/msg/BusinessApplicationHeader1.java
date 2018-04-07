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
import com.tools20022.repository.area.head.BusinessApplicationHeaderV01;
import com.tools20022.repository.choice.Party9Choice;
import com.tools20022.repository.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.codeset.UnicodeChartsCode;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SignatureEnvelope;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the Business Application Header of the Business Message.<br>
 * Can be used when replying to a query; can also be used when canceling or
 * amending.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmCharacterSet
 * BusinessApplicationHeader1.mmCharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmFrom
 * BusinessApplicationHeader1.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmTo
 * BusinessApplicationHeader1.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmBusinessMessageIdentifier
 * BusinessApplicationHeader1.mmBusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmMessageDefinitionIdentifier
 * BusinessApplicationHeader1.mmMessageDefinitionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmBusinessService
 * BusinessApplicationHeader1.mmBusinessService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmCreationDate
 * BusinessApplicationHeader1.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmCopyDuplicate
 * BusinessApplicationHeader1.mmCopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmPossibleDuplicate
 * BusinessApplicationHeader1.mmPossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmPriority
 * BusinessApplicationHeader1.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#mmSignature
 * BusinessApplicationHeader1.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmRelated
 * BusinessApplicationHeaderV01.mmRelated}</li>
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
 * "BusinessApplicationHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the Business Application Header of the Business Message.\r\nCan be used when replying to a query; can also be used when canceling or amending."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessApplicationHeader1", propOrder = {"characterSet", "from", "to", "businessMessageIdentifier", "messageDefinitionIdentifier", "businessService", "creationDate", "copyDuplicate", "possibleDuplicate", "priority",
		"signature"})
public class BusinessApplicationHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CharSet")
	protected UnicodeChartsCode characterSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnicodeChartsCode
	 * UnicodeChartsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CharSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharacterSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the character set of the text-based elements used in the Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Optional<UnicodeChartsCode>> mmCharacterSet = new MMMessageAttribute<BusinessApplicationHeader1, Optional<UnicodeChartsCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CharSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharacterSet";
			definition = "Contains the character set of the text-based elements used in the Business Message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnicodeChartsCode.mmObject();
		}

		@Override
		public Optional<UnicodeChartsCode> getValue(BusinessApplicationHeader1 obj) {
			return obj.getCharacterSet();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<UnicodeChartsCode> value) {
			obj.setCharacterSet(value.orElse(null));
		}
	};
	@XmlElement(name = "Fr", required = true)
	protected Party9Choice from;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessApplicationHeader1, Party9Choice> mmFrom = new MMMessageAssociationEnd<BusinessApplicationHeader1, Party9Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party9Choice.mmObject();
		}

		@Override
		public Party9Choice getValue(BusinessApplicationHeader1 obj) {
			return obj.getFrom();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Party9Choice value) {
			obj.setFrom(value);
		}
	};
	@XmlElement(name = "To", required = true)
	protected Party9Choice to;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessApplicationHeader1, Party9Choice> mmTo = new MMMessageAssociationEnd<BusinessApplicationHeader1, Party9Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party9Choice.mmObject();
		}

		@Override
		public Party9Choice getValue(BusinessApplicationHeader1 obj) {
			return obj.getTo();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Party9Choice value) {
			obj.setTo(value);
		}
	};
	@XmlElement(name = "BizMsgIdr", required = true)
	protected Max35Text businessMessageIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizMsgIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessMessageIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Max35Text> mmBusinessMessageIdentifier = new MMMessageAttribute<BusinessApplicationHeader1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "BizMsgIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessMessageIdentifier";
			definition = "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BusinessApplicationHeader1 obj) {
			return obj.getBusinessMessageIdentifier();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Max35Text value) {
			obj.setBusinessMessageIdentifier(value);
		}
	};
	@XmlElement(name = "MsgDefIdr", required = true)
	protected Max35Text messageDefinitionIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDefIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDefinitionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Max35Text> mmMessageDefinitionIdentifier = new MMMessageAttribute<BusinessApplicationHeader1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "MsgDefIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDefinitionIdentifier";
			definition = "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BusinessApplicationHeader1 obj) {
			return obj.getMessageDefinitionIdentifier();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Max35Text value) {
			obj.setMessageDefinitionIdentifier(value);
		}
	};
	@XmlElement(name = "BizSvc")
	protected Max35Text businessService;
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&amp;I."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Optional<Max35Text>> mmBusinessService = new MMMessageAttribute<BusinessApplicationHeader1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "BizSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessService";
			definition = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&I.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BusinessApplicationHeader1 obj) {
			return obj.getBusinessService();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<Max35Text> value) {
			obj.setBusinessService(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDt", required = true)
	protected ISONormalisedDateTime creationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISONormalisedDateTime
	 * ISONormalisedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when this Business Message (header) was created.\r\nNote Times must be normalized, using the \"Z\" annotation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, ISONormalisedDateTime> mmCreationDate = new MMMessageAttribute<BusinessApplicationHeader1, ISONormalisedDateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "Date and time when this Business Message (header) was created.\r\nNote Times must be normalized, using the \"Z\" annotation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISONormalisedDateTime.mmObject();
		}

		@Override
		public ISONormalisedDateTime getValue(BusinessApplicationHeader1 obj) {
			return obj.getCreationDate();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, ISONormalisedDateTime value) {
			obj.setCreationDate(value);
		}
	};
	@XmlElement(name = "CpyDplct")
	protected CopyDuplicate1Code copyDuplicate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the message is a Copy, a Duplicate or a copy of a duplicate of a previously sent ISO 20022 Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Optional<CopyDuplicate1Code>> mmCopyDuplicate = new MMMessageAttribute<BusinessApplicationHeader1, Optional<CopyDuplicate1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Indicates whether the message is a Copy, a Duplicate or a copy of a duplicate of a previously sent ISO 20022 Message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}

		@Override
		public Optional<CopyDuplicate1Code> getValue(BusinessApplicationHeader1 obj) {
			return obj.getCopyDuplicate();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<CopyDuplicate1Code> value) {
			obj.setCopyDuplicate(value.orElse(null));
		}
	};
	@XmlElement(name = "PssblDplct")
	protected YesNoIndicator possibleDuplicate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PssblDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Optional<YesNoIndicator>> mmPossibleDuplicate = new MMMessageAttribute<BusinessApplicationHeader1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "PssblDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(BusinessApplicationHeader1 obj) {
			return obj.getPossibleDuplicate();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<YesNoIndicator> value) {
			obj.setPossibleDuplicate(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected BusinessMessagePriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessMessagePriorityCode
	 * BusinessMessagePriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relative indication of the processing precedence of the message over a (set of) Business Messages with assigned priorities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessApplicationHeader1, Optional<BusinessMessagePriorityCode>> mmPriority = new MMMessageAttribute<BusinessApplicationHeader1, Optional<BusinessMessagePriorityCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Relative indication of the processing precedence of the message over a (set of) Business Messages with assigned priorities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessMessagePriorityCode.mmObject();
		}

		@Override
		public Optional<BusinessMessagePriorityCode> getValue(BusinessApplicationHeader1 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<BusinessMessagePriorityCode> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "Sgntr")
	protected SignatureEnvelope signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	 * definition} =
	 * "Contains the digital signature of the Business Entity authorised to sign this Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessApplicationHeader1, Optional<SignatureEnvelope>> mmSignature = new MMMessageAssociationEnd<BusinessApplicationHeader1, Optional<SignatureEnvelope>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Contains the digital signature of the Business Entity authorised to sign this Business Message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignatureEnvelope.mmObject();
		}

		@Override
		public Optional<SignatureEnvelope> getValue(BusinessApplicationHeader1 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(BusinessApplicationHeader1 obj, Optional<SignatureEnvelope> value) {
			obj.setSignature(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.BusinessApplicationHeader1.mmCharacterSet, com.tools20022.repository.msg.BusinessApplicationHeader1.mmFrom, com.tools20022.repository.msg.BusinessApplicationHeader1.mmTo,
								com.tools20022.repository.msg.BusinessApplicationHeader1.mmBusinessMessageIdentifier, com.tools20022.repository.msg.BusinessApplicationHeader1.mmMessageDefinitionIdentifier,
								com.tools20022.repository.msg.BusinessApplicationHeader1.mmBusinessService, com.tools20022.repository.msg.BusinessApplicationHeader1.mmCreationDate,
								com.tools20022.repository.msg.BusinessApplicationHeader1.mmCopyDuplicate, com.tools20022.repository.msg.BusinessApplicationHeader1.mmPossibleDuplicate,
								com.tools20022.repository.msg.BusinessApplicationHeader1.mmPriority, com.tools20022.repository.msg.BusinessApplicationHeader1.mmSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(BusinessApplicationHeaderV01.mmRelated);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessApplicationHeader1";
				definition = "Specifies the Business Application Header of the Business Message.\r\nCan be used when replying to a query; can also be used when canceling or amending.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UnicodeChartsCode> getCharacterSet() {
		return characterSet == null ? Optional.empty() : Optional.of(characterSet);
	}

	public BusinessApplicationHeader1 setCharacterSet(UnicodeChartsCode characterSet) {
		this.characterSet = characterSet;
		return this;
	}

	public Party9Choice getFrom() {
		return from;
	}

	public BusinessApplicationHeader1 setFrom(Party9Choice from) {
		this.from = Objects.requireNonNull(from);
		return this;
	}

	public Party9Choice getTo() {
		return to;
	}

	public BusinessApplicationHeader1 setTo(Party9Choice to) {
		this.to = Objects.requireNonNull(to);
		return this;
	}

	public Max35Text getBusinessMessageIdentifier() {
		return businessMessageIdentifier;
	}

	public BusinessApplicationHeader1 setBusinessMessageIdentifier(Max35Text businessMessageIdentifier) {
		this.businessMessageIdentifier = Objects.requireNonNull(businessMessageIdentifier);
		return this;
	}

	public Max35Text getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	public BusinessApplicationHeader1 setMessageDefinitionIdentifier(Max35Text messageDefinitionIdentifier) {
		this.messageDefinitionIdentifier = Objects.requireNonNull(messageDefinitionIdentifier);
		return this;
	}

	public Optional<Max35Text> getBusinessService() {
		return businessService == null ? Optional.empty() : Optional.of(businessService);
	}

	public BusinessApplicationHeader1 setBusinessService(Max35Text businessService) {
		this.businessService = businessService;
		return this;
	}

	public ISONormalisedDateTime getCreationDate() {
		return creationDate;
	}

	public BusinessApplicationHeader1 setCreationDate(ISONormalisedDateTime creationDate) {
		this.creationDate = Objects.requireNonNull(creationDate);
		return this;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicate() {
		return copyDuplicate == null ? Optional.empty() : Optional.of(copyDuplicate);
	}

	public BusinessApplicationHeader1 setCopyDuplicate(CopyDuplicate1Code copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
		return this;
	}

	public Optional<YesNoIndicator> getPossibleDuplicate() {
		return possibleDuplicate == null ? Optional.empty() : Optional.of(possibleDuplicate);
	}

	public BusinessApplicationHeader1 setPossibleDuplicate(YesNoIndicator possibleDuplicate) {
		this.possibleDuplicate = possibleDuplicate;
		return this;
	}

	public Optional<BusinessMessagePriorityCode> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public BusinessApplicationHeader1 setPriority(BusinessMessagePriorityCode priority) {
		this.priority = priority;
		return this;
	}

	public Optional<SignatureEnvelope> getSignature() {
		return signature == null ? Optional.empty() : Optional.of(signature);
	}

	public BusinessApplicationHeader1 setSignature(SignatureEnvelope signature) {
		this.signature = signature;
		return this;
	}
}