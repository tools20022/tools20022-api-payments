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
import com.tools20022.repository.area.camt.BankServicesBillingStatementV02;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#mmGroupIdentification
 * StatementGroup2.mmGroupIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementGroup2#mmSender
 * StatementGroup2.mmSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#mmSenderIndividualContact
 * StatementGroup2.mmSenderIndividualContact}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementGroup2#mmReceiver
 * StatementGroup2.mmReceiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#mmReceiverIndividualContact
 * StatementGroup2.mmReceiverIndividualContact}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementGroup2#mmBillingStatement
 * StatementGroup2.mmBillingStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02#mmBillingStatementGroup
 * BankServicesBillingStatementV02.mmBillingStatementGroup}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementGroup2", propOrder = {"groupIdentification", "sender", "senderIndividualContact", "receiver", "receiverIndividualContact", "billingStatement"})
public class StatementGroup2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpId", required = true)
	protected Max35Text groupIdentification;
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
	public static final MMMessageAttribute mmGroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identification of a group of customer billing statements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Sndr", required = true)
	protected PartyIdentification58 sender;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmSender = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Originating financial institution sending the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification58.mmObject();
		}
	};
	@XmlElement(name = "SndrIndvCtct")
	protected List<com.tools20022.repository.msg.ContactDetails3> senderIndividualContact;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmSenderIndividualContact = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "SndrIndvCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderIndividualContact";
			definition = "Specifies the individual to contact in case of technical problems at the sender's location.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ContactDetails3.mmObject();
		}
	};
	@XmlElement(name = "Rcvr", required = true)
	protected PartyIdentification58 receiver;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmReceiver = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "Rcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Receiver";
			definition = "Financial institution customer receiving the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification58.mmObject();
		}
	};
	@XmlElement(name = "RcvrIndvCtct")
	protected List<com.tools20022.repository.msg.ContactDetails3> receiverIndividualContact;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmReceiverIndividualContact = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "RcvrIndvCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIndividualContact";
			definition = "Specifies the individual to contact in case of technical problems at the receiver's location.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ContactDetails3.mmObject();
		}
	};
	@XmlElement(name = "BllgStmt", required = true)
	protected List<com.tools20022.repository.msg.BillingStatement2> billingStatement;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmBillingStatement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementGroup2.mmObject();
			isDerived = false;
			xmlTag = "BllgStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingStatement";
			definition = "Provides the bank services billing statement recounting of all service chargeable events that occurred during a reporting cycle, such as the end of the month reporting.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementGroup2.mmGroupIdentification, com.tools20022.repository.msg.StatementGroup2.mmSender,
						com.tools20022.repository.msg.StatementGroup2.mmSenderIndividualContact, com.tools20022.repository.msg.StatementGroup2.mmReceiver, com.tools20022.repository.msg.StatementGroup2.mmReceiverIndividualContact,
						com.tools20022.repository.msg.StatementGroup2.mmBillingStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankServicesBillingStatementV02.mmBillingStatementGroup);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementGroup2";
				definition = "Group of the statement header reporting the bank services billing and the billing statement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getGroupIdentification() {
		return groupIdentification;
	}

	public StatementGroup2 setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = Objects.requireNonNull(groupIdentification);
		return this;
	}

	public PartyIdentification58 getSender() {
		return sender;
	}

	public StatementGroup2 setSender(com.tools20022.repository.msg.PartyIdentification58 sender) {
		this.sender = Objects.requireNonNull(sender);
		return this;
	}

	public List<ContactDetails3> getSenderIndividualContact() {
		return senderIndividualContact == null ? senderIndividualContact = new ArrayList<>() : senderIndividualContact;
	}

	public StatementGroup2 setSenderIndividualContact(List<com.tools20022.repository.msg.ContactDetails3> senderIndividualContact) {
		this.senderIndividualContact = Objects.requireNonNull(senderIndividualContact);
		return this;
	}

	public PartyIdentification58 getReceiver() {
		return receiver;
	}

	public StatementGroup2 setReceiver(com.tools20022.repository.msg.PartyIdentification58 receiver) {
		this.receiver = Objects.requireNonNull(receiver);
		return this;
	}

	public List<ContactDetails3> getReceiverIndividualContact() {
		return receiverIndividualContact == null ? receiverIndividualContact = new ArrayList<>() : receiverIndividualContact;
	}

	public StatementGroup2 setReceiverIndividualContact(List<com.tools20022.repository.msg.ContactDetails3> receiverIndividualContact) {
		this.receiverIndividualContact = Objects.requireNonNull(receiverIndividualContact);
		return this;
	}

	public List<BillingStatement2> getBillingStatement() {
		return billingStatement == null ? billingStatement = new ArrayList<>() : billingStatement;
	}

	public StatementGroup2 setBillingStatement(List<com.tools20022.repository.msg.BillingStatement2> billingStatement) {
		this.billingStatement = Objects.requireNonNull(billingStatement);
		return this;
	}
}