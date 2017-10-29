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
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Group of the statement header reporting the bank services billing and the
 * billing statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#GroupIdentification
 * StatementGroup2.GroupIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementGroup2#Sender
 * StatementGroup2.Sender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#SenderIndividualContact
 * StatementGroup2.SenderIndividualContact}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementGroup2#Receiver
 * StatementGroup2.Receiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#ReceiverIndividualContact
 * StatementGroup2.ReceiverIndividualContact}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#BillingStatement
 * StatementGroup2.BillingStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02#BillingStatementGroup
 * BankServicesBillingStatementV02.BillingStatementGroup}</li>
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
 * "StatementGroup2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Group of the statement header reporting the bank services billing and the billing statement."
 * </li>
 * </ul>
 */
public class StatementGroup2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a group of customer billing statements.
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
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a group of customer billing statements."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute GroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identification of a group of customer billing statements.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Originating financial institution sending the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification58
	 * PartyIdentification58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
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
	 * definition} = "Originating financial institution sending the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Sender = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Originating financial institution sending the statement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification58.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the individual to contact in case of technical problems at the
	 * sender's location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrIndvCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderIndividualContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the individual to contact in case of technical problems at the sender's location."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SenderIndividualContact = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "SndrIndvCtct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderIndividualContact";
			definition = "Specifies the individual to contact in case of technical problems at the sender's location.";
			minOccurs = 0;
			maxOccurs = 2;
			complexType_lazy = () -> ContactDetails3.mmObject();
		}
	};
	/**
	 * Financial institution customer receiving the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification58
	 * PartyIdentification58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
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
	 * definition} = "Financial institution customer receiving the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Receiver = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "Rcvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Receiver";
			definition = "Financial institution customer receiving the statement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification58.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the individual to contact in case of technical problems at the
	 * receiver's location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrIndvCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverIndividualContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the individual to contact in case of technical problems at the receiver's location."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReceiverIndividualContact = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "RcvrIndvCtct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIndividualContact";
			definition = "Specifies the individual to contact in case of technical problems at the receiver's location.";
			minOccurs = 0;
			maxOccurs = 2;
			complexType_lazy = () -> ContactDetails3.mmObject();
		}
	};
	/**
	 * Provides the bank services billing statement recounting of all service
	 * chargeable events that occurred during a reporting cycle, such as the end
	 * of the month reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementGroup2
	 * StatementGroup2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the bank services billing statement recounting of all service chargeable events that occurred during a reporting cycle, such as the end of the month reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BillingStatement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "BllgStmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingStatement";
			definition = "Provides the bank services billing statement recounting of all service chargeable events that occurred during a reporting cycle, such as the end of the month reporting.";
			minOccurs = 1;
			type_lazy = () -> BillingStatement2.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementGroup2.GroupIdentification, com.tools20022.repository.msg.StatementGroup2.Sender,
						com.tools20022.repository.msg.StatementGroup2.SenderIndividualContact, com.tools20022.repository.msg.StatementGroup2.Receiver, com.tools20022.repository.msg.StatementGroup2.ReceiverIndividualContact,
						com.tools20022.repository.msg.StatementGroup2.BillingStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankServicesBillingStatementV02.BillingStatementGroup);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatementGroup2";
				definition = "Group of the statement header reporting the bank services billing and the billing statement.";
			}
		});
		return mmObject_lazy.get();
	}
}