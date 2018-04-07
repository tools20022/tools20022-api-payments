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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupInformation29;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the underlying statement
 * entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2#mmOriginalGroupInformation
 * UnderlyingStatementEntry2.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2#mmOriginalStatementIdentification
 * UnderlyingStatementEntry2.mmOriginalStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2#mmOriginalEntryIdentification
 * UnderlyingStatementEntry2.mmOriginalEntryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
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
 * "UnderlyingStatementEntry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the underlying statement entry."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingStatementEntry2", propOrder = {"originalGroupInformation", "originalStatementIdentification", "originalEntryIdentification"})
public class UnderlyingStatementEntry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation29 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation29
	 * OriginalGroupInformation29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2
	 * UnderlyingStatementEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingStatementEntry2, Optional<OriginalGroupInformation29>> mmOriginalGroupInformation = new MMMessageAssociationEnd<UnderlyingStatementEntry2, Optional<OriginalGroupInformation29>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingStatementEntry2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Set of elements used to provide information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupInformation29.mmObject();
		}

		@Override
		public Optional<OriginalGroupInformation29> getValue(UnderlyingStatementEntry2 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(UnderlyingStatementEntry2 obj, Optional<OriginalGroupInformation29> value) {
			obj.setOriginalGroupInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlStmtId")
	protected Max35Text originalStatementIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2
	 * UnderlyingStatementEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlStmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalStatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the original statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingStatementEntry2, Optional<Max35Text>> mmOriginalStatementIdentification = new MMMessageAttribute<UnderlyingStatementEntry2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingStatementEntry2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlStmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalStatementIdentification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the original statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingStatementEntry2 obj) {
			return obj.getOriginalStatementIdentification();
		}

		@Override
		public void setValue(UnderlyingStatementEntry2 obj, Optional<Max35Text> value) {
			obj.setOriginalStatementIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNtryId")
	protected Max35Text originalEntryIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry2
	 * UnderlyingStatementEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEntryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique identification, as assigned by the account servicer, to unambiguously identify the original entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingStatementEntry2, Optional<Max35Text>> mmOriginalEntryIdentification = new MMMessageAttribute<UnderlyingStatementEntry2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingStatementEntry2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEntryIdentification";
			definition = "Original unique identification, as assigned by the account servicer, to unambiguously identify the original entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingStatementEntry2 obj) {
			return obj.getOriginalEntryIdentification();
		}

		@Override
		public void setValue(UnderlyingStatementEntry2 obj, Optional<Max35Text> value) {
			obj.setOriginalEntryIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingStatementEntry2.mmOriginalGroupInformation, com.tools20022.repository.msg.UnderlyingStatementEntry2.mmOriginalStatementIdentification,
						com.tools20022.repository.msg.UnderlyingStatementEntry2.mmOriginalEntryIdentification);
				trace_lazy = () -> Entry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingStatementEntry2";
				definition = "Set of elements used to provide information on the underlying statement entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupInformation29> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public UnderlyingStatementEntry2 setOriginalGroupInformation(OriginalGroupInformation29 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max35Text> getOriginalStatementIdentification() {
		return originalStatementIdentification == null ? Optional.empty() : Optional.of(originalStatementIdentification);
	}

	public UnderlyingStatementEntry2 setOriginalStatementIdentification(Max35Text originalStatementIdentification) {
		this.originalStatementIdentification = originalStatementIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalEntryIdentification() {
		return originalEntryIdentification == null ? Optional.empty() : Optional.of(originalEntryIdentification);
	}

	public UnderlyingStatementEntry2 setOriginalEntryIdentification(Max35Text originalEntryIdentification) {
		this.originalEntryIdentification = originalEntryIdentification;
		return this;
	}
}