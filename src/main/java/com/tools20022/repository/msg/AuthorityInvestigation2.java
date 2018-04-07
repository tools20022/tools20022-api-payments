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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InvestigatedParties1Choice;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthorityRequestType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the requested authority investigation information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmType
 * AuthorityInvestigation2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmInvestigatedRoles
 * AuthorityInvestigation2.mmInvestigatedRoles}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmAdditionalInvestigatedParties
 * AuthorityInvestigation2.mmAdditionalInvestigatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmAdditionalInformation
 * AuthorityInvestigation2.mmAdditionalInformation}</li>
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
 * "AuthorityInvestigation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the requested authority investigation information details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthorityInvestigation2", propOrder = {"type", "investigatedRoles", "additionalInvestigatedParties", "additionalInformation"})
public class AuthorityInvestigation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected AuthorityRequestType1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityRequestType1
	 * AuthorityRequestType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
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
	 * definition} = "Identifies the type requested information as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorityInvestigation2, AuthorityRequestType1> mmType = new MMMessageAttribute<AuthorityInvestigation2, AuthorityRequestType1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type requested information as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AuthorityRequestType1.mmObject();
		}

		@Override
		public AuthorityRequestType1 getValue(AuthorityInvestigation2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AuthorityInvestigation2 obj, AuthorityRequestType1 value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "InvstgtdRoles", required = true)
	protected InvestigatedParties1Choice investigatedRoles;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigatedParties1Choice
	 * InvestigatedParties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtdRoles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigatedRoles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the roles the customer plays in the requested information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorityInvestigation2, InvestigatedParties1Choice> mmInvestigatedRoles = new MMMessageAttribute<AuthorityInvestigation2, InvestigatedParties1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "InvstgtdRoles";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigatedRoles";
			definition = "Identifies the roles the customer plays in the requested information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigatedParties1Choice.mmObject();
		}

		@Override
		public InvestigatedParties1Choice getValue(AuthorityInvestigation2 obj) {
			return obj.getInvestigatedRoles();
		}

		@Override
		public void setValue(AuthorityInvestigation2 obj, InvestigatedParties1Choice value) {
			obj.setInvestigatedRoles(value);
		}
	};
	@XmlElement(name = "AddtlInvstgtdPties")
	protected InvestigatedParties1Choice additionalInvestigatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigatedParties1Choice
	 * InvestigatedParties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInvstgtdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInvestigatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the additional investigated parties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorityInvestigation2, Optional<InvestigatedParties1Choice>> mmAdditionalInvestigatedParties = new MMMessageAttribute<AuthorityInvestigation2, Optional<InvestigatedParties1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInvstgtdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInvestigatedParties";
			definition = "Specifies the additional investigated parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestigatedParties1Choice.mmObject();
		}

		@Override
		public Optional<InvestigatedParties1Choice> getValue(AuthorityInvestigation2 obj) {
			return obj.getAdditionalInvestigatedParties();
		}

		@Override
		public void setValue(AuthorityInvestigation2 obj, Optional<InvestigatedParties1Choice> value) {
			obj.setAdditionalInvestigatedParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information, in free text form, to complement the requested information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorityInvestigation2, Optional<Max500Text>> mmAdditionalInformation = new MMMessageAttribute<AuthorityInvestigation2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information, in free text form, to complement the requested information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(AuthorityInvestigation2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AuthorityInvestigation2 obj, Optional<Max500Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorityInvestigation2.mmType, com.tools20022.repository.msg.AuthorityInvestigation2.mmInvestigatedRoles,
						com.tools20022.repository.msg.AuthorityInvestigation2.mmAdditionalInvestigatedParties, com.tools20022.repository.msg.AuthorityInvestigation2.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorityInvestigation2";
				definition = "Specifies the requested authority investigation information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public AuthorityRequestType1 getType() {
		return type;
	}

	public AuthorityInvestigation2 setType(AuthorityRequestType1 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public InvestigatedParties1Choice getInvestigatedRoles() {
		return investigatedRoles;
	}

	public AuthorityInvestigation2 setInvestigatedRoles(InvestigatedParties1Choice investigatedRoles) {
		this.investigatedRoles = Objects.requireNonNull(investigatedRoles);
		return this;
	}

	public Optional<InvestigatedParties1Choice> getAdditionalInvestigatedParties() {
		return additionalInvestigatedParties == null ? Optional.empty() : Optional.of(additionalInvestigatedParties);
	}

	public AuthorityInvestigation2 setAdditionalInvestigatedParties(InvestigatedParties1Choice additionalInvestigatedParties) {
		this.additionalInvestigatedParties = additionalInvestigatedParties;
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public AuthorityInvestigation2 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}