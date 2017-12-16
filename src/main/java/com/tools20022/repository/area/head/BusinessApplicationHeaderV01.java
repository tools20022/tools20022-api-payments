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

package com.tools20022.repository.area.head;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion;
import com.tools20022.repository.choice.Party9Choice;
import com.tools20022.repository.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.codeset.UnicodeChartsCode;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.BusinessApplicationHeader1;
import com.tools20022.repository.other.SignatureEnvelope;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The Business Layer deals with Business Messages. The behaviour of the
 * Business Messages is fully described by the Business Transaction and the
 * structure of the Business Messages is fully described by the Message
 * Definitions and related Message Rules, Rules and Market Practices. All of
 * which are registered in the ISO 20022 Repository.<br>
 * A single new Business Message (with its accompagnying business application
 * header) is created - by the sending MessagingEndpoint - for each business
 * event; that is each interaction in a Business Transaction. A Business Message
 * adheres to the following principles:<br>
 * " A Business Message (and its business application header) must not contain
 * information about the Message Transport System or the mechanics or mechanism
 * of message sending, transportation, or receipt. <br>
 * " A Business Message must be comprehensible outside of the context of the
 * Transport Message. That is the Business Message must not require knowledge of
 * the Transport Message to be understood.<br>
 * " A Business Message may contain headers, footers, and envelopes that are
 * meaningful for the business. When present, they are treated as any other
 * message content, which means that they are considered part of the Message
 * Definition of the Business Message and as such will be part of the ISO 20022
 * Repository.<br>
 * " A Business Message refers to Business Actors by their Name. Each instance
 * of a Business Actor has one Name. The Business Actor must not be referred to
 * in the Transport Layer.<br>
 * Specific usage of this BusinessMessageHeader may be defined by the relevant
 * SEG.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmCharacterSet
 * BusinessApplicationHeaderV01.mmCharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmFrom
 * BusinessApplicationHeaderV01.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmTo
 * BusinessApplicationHeaderV01.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmBusinessMessageIdentifier
 * BusinessApplicationHeaderV01.mmBusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmMessageDefinitionIdentifier
 * BusinessApplicationHeaderV01.mmMessageDefinitionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmBusinessService
 * BusinessApplicationHeaderV01.mmBusinessService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmCreationDate
 * BusinessApplicationHeaderV01.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmCopyDuplicate
 * BusinessApplicationHeaderV01.mmCopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmPossibleDuplicate
 * BusinessApplicationHeaderV01.mmPossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmPriority
 * BusinessApplicationHeaderV01.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmSignature
 * BusinessApplicationHeaderV01.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#mmRelated
 * BusinessApplicationHeaderV01.mmRelated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AppHdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion
 * BusinessApplicationHeaderLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code head.001.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessApplicationHeaderV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.\r\nA single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:\r\n\" A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. \r\n\" A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.\r\n\" A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.\r\n\" A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.\r\nSpecific usage of this BusinessMessageHeader may be defined by the relevant SEG."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BusinessApplicationHeaderV01", propOrder = {"characterSet", "from", "to", "businessMessageIdentifier", "messageDefinitionIdentifier", "businessService", "creationDate", "copyDuplicate", "possibleDuplicate", "priority",
		"signature", "related"})
public class BusinessApplicationHeaderV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected UnicodeChartsCode characterSet;
	/**
	 * Contains the character set of the text-based elements used in the
	 * Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnicodeChartsCode
	 * UnicodeChartsCode}</li>
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
	public static final MMMessageBuildingBlock mmCharacterSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "CharSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharacterSet";
			definition = "Contains the character set of the text-based elements used in the Business Message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnicodeChartsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getCharacterSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Party9Choice from;
	/**
	 * The sending MessagingEndpoint that has created this Business Message for
	 * the receiving MessagingEndpoint that will process this Business Message.<br>
	 * <br>
	 * Note the sending MessagingEndpoint might be different from the sending
	 * address potentially contained in the transport header (as defined in the
	 * transport layer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
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
	public static final MMMessageBuildingBlock mmFrom = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party9Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getFrom", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Party9Choice to;
	/**
	 * The MessagingEndpoint designated by the sending MessagingEndpoint to be
	 * the recipient who will ultimately process this Business Message.<br>
	 * <br>
	 * Note the receiving MessagingEndpoint might be different from the
	 * receiving address potentially contained in the transport header (as
	 * defined in the transport layer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
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
	public static final MMMessageBuildingBlock mmTo = new MMMessageBuildingBlock() {
		{
			xmlTag = "To";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party9Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getTo", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text businessMessageIdentifier;
	/**
	 * Unambiguously identifies the Business Message to the MessagingEndpoint
	 * that has created the Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	public static final MMMessageBuildingBlock mmBusinessMessageIdentifier = new MMMessageBuildingBlock() {
		{
			xmlTag = "BizMsgIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessMessageIdentifier";
			definition = "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getBusinessMessageIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text messageDefinitionIdentifier;
	/**
	 * Contains the MessageIdentifier that defines the BusinessMessage.<br>
	 * It must contain a MessageIdentifier published on the ISO 20022 website.<br>
	 * <br>
	 * example camt.001.001.03
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageDefinitionIdentifier = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgDefIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDefinitionIdentifier";
			definition = "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getMessageDefinitionIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text businessService;
	/**
	 * Specifies the business service agreed between the two MessagingEndpoints
	 * under which rules this Business Message is exchanged.<br>
	 * To be used when there is a choice of processing services or processing
	 * service levels.<br>
	 * Example: E&amp;I
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&amp;I"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBusinessService = new MMMessageBuildingBlock() {
		{
			xmlTag = "BizSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessService";
			definition = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&I";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getBusinessService", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISONormalisedDateTime creationDate;
	/**
	 * Date and time when this Business Message (header) was created.<br>
	 * Note Times must be normalized, using the "Z" annotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISONormalisedDateTime
	 * ISONormalisedDateTime}</li>
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
	 * "Date and time when this Business Message (header) was created.\r\nNote    Times must be normalized, using the \"Z\" annotation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCreationDate = new MMMessageBuildingBlock() {
		{
			xmlTag = "CreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "Date and time when this Business Message (header) was created.\r\nNote    Times must be normalized, using the \"Z\" annotation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISONormalisedDateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getCreationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyDuplicate1Code copyDuplicate;
	/**
	 * Indicates whether the message is a Copy, a Duplicate or a copy of a
	 * duplicate of a previously sent ISO 20022 Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
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
	public static final MMMessageBuildingBlock mmCopyDuplicate = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Indicates whether the message is a Copy, a Duplicate or a copy of a duplicate of a previously sent ISO 20022 Message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getCopyDuplicate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator possibleDuplicate;
	/**
	 * Flag indicating if the Business Message exchanged between the
	 * MessagingEndpoints is possibly a duplicate. <br>
	 * If the receiving MessagingEndpoint did not receive the original, then
	 * this Business Message should be processed as if it were the original. <br>
	 * <br>
	 * If the receiving MessagingEndpoint did receive the original, then it
	 * should perform necessary actions to avoid processing this Business
	 * Message again.<br>
	 * <br>
	 * This will guarantee business idempotent behaviour.<br>
	 * <br>
	 * NOTE: this is named "PossResend" in FIX - this is an application level
	 * resend not a network level retransmission
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
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
	 * "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint  did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPossibleDuplicate = new MMMessageBuildingBlock() {
		{
			xmlTag = "PssblDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint  did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getPossibleDuplicate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BusinessMessagePriorityCode priority;
	/**
	 * Relative indication of the processing precedence of the message over a
	 * (set of) Business Messages with assigned priorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessMessagePriorityCode
	 * BusinessMessagePriorityCode}</li>
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
	public static final MMMessageBuildingBlock mmPriority = new MMMessageBuildingBlock() {
		{
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Relative indication of the processing precedence of the message over a (set of) Business Messages with assigned priorities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessMessagePriorityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SignatureEnvelope signature;
	/**
	 * Contains the digital signature of the Business Entity authorised to sign
	 * this Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
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
	public static final MMMessageBuildingBlock mmSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Contains the digital signature of the Business Entity authorised to sign this Business Message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignatureEnvelope.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BusinessApplicationHeader1 related;
	/**
	 * Specifies the Business Application Header of the Business Message to
	 * which this Business Message relates.<br>
	 * Can be used when replying to a query; can also be used when canceling or
	 * amending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Related"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the Business Application Header of the Business Message to which this Business Message relates.\r\nCan be used when replying to a query;  can also be used when canceling or amending."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelated = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rltd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Related";
			definition = "Specifies the Business Application Header of the Business Message to which this Business Message relates.\r\nCan be used when replying to a query;  can also be used when canceling or amending.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BusinessApplicationHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BusinessApplicationHeaderV01.class.getMethod("getRelated", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessApplicationHeaderV01";
				definition = "The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.\r\nA single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:\r\n\" A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. \r\n\" A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.\r\n\" A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.\r\n\" A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.\r\nSpecific usage of this BusinessMessageHeader may be defined by the relevant SEG.";
				rootElement = "Document";
				xmlTag = "AppHdr";
				businessArea_lazy = () -> BusinessApplicationHeaderLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmCharacterSet, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmFrom,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmTo, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmBusinessMessageIdentifier,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmMessageDefinitionIdentifier, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmBusinessService,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmCreationDate, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmCopyDuplicate,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmPossibleDuplicate, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmPriority,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmSignature, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.mmRelated);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "head";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BusinessApplicationHeaderV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CharSet")
	public UnicodeChartsCode getCharacterSet() {
		return characterSet;
	}

	public void setCharacterSet(UnicodeChartsCode characterSet) {
		this.characterSet = characterSet;
	}

	@XmlElement(name = "Fr", required = true)
	public Party9Choice getFrom() {
		return from;
	}

	public void setFrom(Party9Choice from) {
		this.from = from;
	}

	@XmlElement(name = "To", required = true)
	public Party9Choice getTo() {
		return to;
	}

	public void setTo(Party9Choice to) {
		this.to = to;
	}

	@XmlElement(name = "BizMsgIdr", required = true)
	public Max35Text getBusinessMessageIdentifier() {
		return businessMessageIdentifier;
	}

	public void setBusinessMessageIdentifier(Max35Text businessMessageIdentifier) {
		this.businessMessageIdentifier = businessMessageIdentifier;
	}

	@XmlElement(name = "MsgDefIdr", required = true)
	public Max35Text getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	public void setMessageDefinitionIdentifier(Max35Text messageDefinitionIdentifier) {
		this.messageDefinitionIdentifier = messageDefinitionIdentifier;
	}

	@XmlElement(name = "BizSvc")
	public Max35Text getBusinessService() {
		return businessService;
	}

	public void setBusinessService(Max35Text businessService) {
		this.businessService = businessService;
	}

	@XmlElement(name = "CreDt", required = true)
	public ISONormalisedDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISONormalisedDateTime creationDate) {
		this.creationDate = creationDate;
	}

	@XmlElement(name = "CpyDplct")
	public CopyDuplicate1Code getCopyDuplicate() {
		return copyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicate1Code copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
	}

	@XmlElement(name = "PssblDplct")
	public YesNoIndicator getPossibleDuplicate() {
		return possibleDuplicate;
	}

	public void setPossibleDuplicate(YesNoIndicator possibleDuplicate) {
		this.possibleDuplicate = possibleDuplicate;
	}

	@XmlElement(name = "Prty")
	public BusinessMessagePriorityCode getPriority() {
		return priority;
	}

	public void setPriority(BusinessMessagePriorityCode priority) {
		this.priority = priority;
	}

	@XmlElement(name = "Sgntr")
	public SignatureEnvelope getSignature() {
		return signature;
	}

	public void setSignature(SignatureEnvelope signature) {
		this.signature = signature;
	}

	@XmlElement(name = "Rltd")
	public BusinessApplicationHeader1 getRelated() {
		return related;
	}

	public void setRelated(BusinessApplicationHeader1 related) {
		this.related = related;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.01.01")
	static public class Document {
		@XmlElement(name = "AppHdr", required = true)
		public BusinessApplicationHeaderV01 messageBody;
	}
}