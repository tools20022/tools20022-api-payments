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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the type or operations code of a transaction
 * entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#mmDomain
 * BankTransactionCodeStructure4.mmDomain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#mmProprietary
 * BankTransactionCodeStructure4.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BankTransaction
 * BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDomainOrProprietaryRule#forBankTransactionCodeStructure4
 * ConstraintDomainOrProprietaryRule.forBankTransactionCodeStructure4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFamilyAndSubFamilyRule#forBankTransactionCodeStructure4
 * ConstraintFamilyAndSubFamilyRule.forBankTransactionCodeStructure4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankTransactionCodeStructure4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to identify the type or operations code of a transaction entry."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure4", propOrder = {"domain", "proprietary"})
public class BankTransactionCodeStructure4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Domn")
	protected BankTransactionCodeStructure5 domain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5
	 * BankTransactionCodeStructure5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Domn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or sub-family code cannot be provided, the generic family code defined for the domain or the generic sub-family code defined for the family should be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDomain = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BankTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure4.mmObject();
			isDerived = false;
			xmlTag = "Domn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domain";
			definition = "Set of elements used to provide the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or sub-family code cannot be provided, the generic family code defined for the domain or the generic sub-family code defined for the family should be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure5.mmObject();
		}
	};
	@XmlElement(name = "Prtry")
	protected ProprietaryBankTransactionCodeStructure1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1
	 * ProprietaryBankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction code in a proprietary form, as defined by the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmProprietaryIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure4.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure4.mmDomain, com.tools20022.repository.msg.BankTransactionCodeStructure4.mmProprietary);
				trace_lazy = () -> BankTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDomainOrProprietaryRule.forBankTransactionCodeStructure4,
						com.tools20022.repository.constraints.ConstraintFamilyAndSubFamilyRule.forBankTransactionCodeStructure4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure4";
				definition = "Set of elements used to identify the type or operations code of a transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BankTransactionCodeStructure5> getDomain() {
		return domain == null ? Optional.empty() : Optional.of(domain);
	}

	public BankTransactionCodeStructure4 setDomain(com.tools20022.repository.msg.BankTransactionCodeStructure5 domain) {
		this.domain = domain;
		return this;
	}

	public Optional<ProprietaryBankTransactionCodeStructure1> getProprietary() {
		return proprietary == null ? Optional.empty() : Optional.of(proprietary);
	}

	public BankTransactionCodeStructure4 setProprietary(com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1 proprietary) {
		this.proprietary = proprietary;
		return this;
	}
}