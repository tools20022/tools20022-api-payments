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
import com.tools20022.repository.choice.PartyOrGroup1Choice;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.entity.BankOperation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SignatureCondition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Authorisation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party and related authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmPartyOrGroup
 * PartyAndAuthorisation1.mmPartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmSignatureOrder
 * PartyAndAuthorisation1.mmSignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmAuthorisation
 * PartyAndAuthorisation1.mmAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "PartyAndAuthorisation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and related authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
 * PartyAndAuthorisation3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAndAuthorisation1", propOrder = {"partyOrGroup", "signatureOrder", "authorisation"})
public class PartyAndAuthorisation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyOrGrp", required = true)
	protected PartyOrGroup1Choice partyOrGroup;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PartyOrGroup1Choice
	 * PartyOrGroup1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyOrGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyOrGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a party or a group of parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAndAuthorisation1, PartyOrGroup1Choice> mmPartyOrGroup = new MMMessageAssociationEnd<PartyAndAuthorisation1, PartyOrGroup1Choice>() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAndAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "PtyOrGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyOrGroup";
			definition = "Specifies a party or a group of parties.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyOrGroup1Choice.mmObject();
		}

		@Override
		public PartyOrGroup1Choice getValue(PartyAndAuthorisation1 obj) {
			return obj.getPartyOrGroup();
		}

		@Override
		public void setValue(PartyAndAuthorisation1 obj, PartyOrGroup1Choice value) {
			obj.setPartyOrGroup(value);
		}
	};
	@XmlElement(name = "SgntrOrdr")
	protected Max15PlusSignedNumericText signatureOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrder
	 * SignatureCondition.mmSignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order in which the mandate holder has to sign."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyAndAuthorisation1, Optional<Max15PlusSignedNumericText>> mmSignatureOrder = new MMMessageAttribute<PartyAndAuthorisation1, Optional<Max15PlusSignedNumericText>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatureOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAndAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "SgntrOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureOrder";
			definition = "Order in which the mandate holder has to sign.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}

		@Override
		public Optional<Max15PlusSignedNumericText> getValue(PartyAndAuthorisation1 obj) {
			return obj.getSignatureOrder();
		}

		@Override
		public void setValue(PartyAndAuthorisation1 obj, Optional<Max15PlusSignedNumericText> value) {
			obj.setSignatureOrder(value.orElse(null));
		}
	};
	@XmlElement(name = "Authstn", required = true)
	protected Authorisation2 authorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Authorisation2
	 * Authorisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationThreshold
	 * BankOperation.mmOperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation granted to a mandate holder."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAndAuthorisation1, Authorisation2> mmAuthorisation = new MMMessageAssociationEnd<PartyAndAuthorisation1, Authorisation2>() {
		{
			businessElementTrace_lazy = () -> BankOperation.mmOperationThreshold;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAndAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation granted to a mandate holder.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Authorisation2.mmObject();
		}

		@Override
		public Authorisation2 getValue(PartyAndAuthorisation1 obj) {
			return obj.getAuthorisation();
		}

		@Override
		public void setValue(PartyAndAuthorisation1 obj, Authorisation2 value) {
			obj.setAuthorisation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndAuthorisation1.mmPartyOrGroup, com.tools20022.repository.msg.PartyAndAuthorisation1.mmSignatureOrder,
						com.tools20022.repository.msg.PartyAndAuthorisation1.mmAuthorisation);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyAndAuthorisation1";
				definition = "Party and related authorisation.";
				nextVersions_lazy = () -> Arrays.asList(PartyAndAuthorisation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyOrGroup1Choice getPartyOrGroup() {
		return partyOrGroup;
	}

	public PartyAndAuthorisation1 setPartyOrGroup(PartyOrGroup1Choice partyOrGroup) {
		this.partyOrGroup = Objects.requireNonNull(partyOrGroup);
		return this;
	}

	public Optional<Max15PlusSignedNumericText> getSignatureOrder() {
		return signatureOrder == null ? Optional.empty() : Optional.of(signatureOrder);
	}

	public PartyAndAuthorisation1 setSignatureOrder(Max15PlusSignedNumericText signatureOrder) {
		this.signatureOrder = signatureOrder;
		return this;
	}

	public Authorisation2 getAuthorisation() {
		return authorisation;
	}

	public PartyAndAuthorisation1 setAuthorisation(Authorisation2 authorisation) {
		this.authorisation = Objects.requireNonNull(authorisation);
		return this;
	}
}