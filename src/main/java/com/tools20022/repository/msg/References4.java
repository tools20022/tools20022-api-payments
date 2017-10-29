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
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements for the identification of the message and related references.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References4#MessageIdentification
 * References4.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References4#ProcessIdentification
 * References4.ProcessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References4#AttachedDocumentName
 * References4.AttachedDocumentName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#References
 * AccountClosingAmendmentRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#References
 * AccountClosingRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#References
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#References
 * AccountExcludedMandateMaintenanceRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#References
 * AccountMandateMaintenanceAmendmentRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#References
 * AccountMandateMaintenanceRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#References
 * AccountOpeningAmendmentRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#References
 * AccountOpeningRequestV02.References}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#References
 * AccountReportRequestV02.References}</li>
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
 * "References4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements for the identification of the message and related references."
 * </li>
 * </ul>
 */
public class References4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies a message by a unique identifier and the date and time when
	 * the message was created by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
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
	public static final MMMessageAssociationEnd MessageIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MessageIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies a process by a unique identifier and the date and time when
	 * the first message belonging to the process was created by the sender. The
	 * process identification remains the same in all messages belonging to the
	 * same process, from the initial request message to the final account
	 * report closing the process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
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
	public static final MMMessageAssociationEnd ProcessIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "PrcId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessIdentification";
			definition = "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MessageIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * File name of a document logically related to the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
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
	public static final MMMessageAttribute AttachedDocumentName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "AttchdDocNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedDocumentName";
			definition = "File name of a document logically related to the request.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.References4.MessageIdentification, com.tools20022.repository.msg.References4.ProcessIdentification,
						com.tools20022.repository.msg.References4.AttachedDocumentName);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.References, com.tools20022.repository.area.acmt.AccountClosingRequestV02.References,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.References, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.References,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.References, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.References,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.References, com.tools20022.repository.area.acmt.AccountOpeningRequestV02.References,
						com.tools20022.repository.area.acmt.AccountReportRequestV02.References);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "References4";
				definition = "Set of elements for the identification of the message and related references.";
			}
		});
		return mmObject_lazy.get();
	}
}