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
import com.tools20022.repository.choice.Party28Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InitiatingPartyRole;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous identification of the original message references.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalSender
 * OriginalMessage2.OriginalSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalMessageIdentification
 * OriginalMessage2.OriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalMessageNameIdentification
 * OriginalMessage2.OriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalCreationDateTime
 * OriginalMessage2.OriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalPackageIdentification
 * OriginalMessage2.OriginalPackageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalRecordIdentification
 * OriginalMessage2.OriginalRecordIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "OriginalMessage2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identification of the original message references."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage3
 * OriginalMessage3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
 * OriginalGroupInformation3}</li>
 * </ul>
 */
public class OriginalMessage2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original message sender used to identify the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party28Choice
	 * Party28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InitiatingPartyRole
	 * InitiatingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlSndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalSender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original message sender used to identify the message. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalSender
	 * OriginalMessage3.OriginalSender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalSender = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			businessComponentTrace_lazy = () -> InitiatingPartyRole.mmObject();
			isDerived = false;
			xmlTag = "OrgnlSndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalSender";
			definition = "Original message sender used to identify the message. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessage3.OriginalSender);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party28Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Point to point reference assigned by the original instructing party to
	 * unambiguously identify the original group of individual transactions.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ExecutionIdentification
	 * PaymentIdentification.ExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalMessageIdentification
	 * OriginalMessage3.OriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalMessageIdentification
	 * OriginalGroupInformation3.OriginalMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification;
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.OriginalMessageIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessage3.OriginalMessageIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the original message name identifier to which the message
	 * refers, such as pacs.003.001.01 or MT103.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers, such as pacs.003.001.01 or MT103."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalMessageNameIdentification
	 * OriginalMessage3.OriginalMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalMessageNameIdentification
	 * OriginalGroupInformation3.OriginalMessageNameIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers, such as pacs.003.001.01 or MT103.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.OriginalMessageNameIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessage3.OriginalMessageNameIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Original date and time at which the message was created.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CreationDate
	 * PaymentExecution.CreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original date and time at which the message was created."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalCreationDateTime
	 * OriginalMessage3.OriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalCreationDateTime
	 * OriginalGroupInformation3.OriginalCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CreationDate;
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Original date and time at which the message was created.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.OriginalCreationDateTime;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessage3.OriginalCreationDateTime);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the identification of original package of instructions, entries
	 * or records.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPackgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPackageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification of original package of instructions, entries or records."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalPackageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPackgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPackageIdentification";
			definition = "Specifies the identification of original package of instructions, entries or records.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the identification of original entry, instruction or record
	 * within the package.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2
	 * OriginalMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification of original entry, instruction or record within the package. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcrdId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRecordIdentification";
			definition = "Specifies the identification of original entry, instruction or record within the package. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessage2.OriginalSender, com.tools20022.repository.msg.OriginalMessage2.OriginalMessageIdentification,
						com.tools20022.repository.msg.OriginalMessage2.OriginalMessageNameIdentification, com.tools20022.repository.msg.OriginalMessage2.OriginalCreationDateTime,
						com.tools20022.repository.msg.OriginalMessage2.OriginalPackageIdentification, com.tools20022.repository.msg.OriginalMessage2.OriginalRecordIdentification);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalMessage2";
				definition = "Unique and unambiguous identification of the original message references.";
				previousVersion_lazy = () -> OriginalGroupInformation3.mmObject();
				nextVersions_lazy = () -> Arrays.asList(OriginalMessage3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}