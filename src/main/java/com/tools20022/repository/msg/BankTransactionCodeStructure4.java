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
import com.tools20022.repository.entity.BankTransaction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#Domain
 * BankTransactionCodeStructure4.Domain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#Proprietary
 * BankTransactionCodeStructure4.Proprietary}</li>
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
public class BankTransactionCodeStructure4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of elements used to provide the domain, the family and the sub-family
	 * of the bank transaction code, in a structured and hierarchical format.
	 * 
	 * Usage: If a specific family or sub-family code cannot be provided, the
	 * generic family code defined for the domain or the generic sub-family code
	 * defined for the family should be provided.
	 * <p>
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
	public static final MMMessageAssociationEnd Domain = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BankTransactionCodeStructure4.mmObject();
			businessComponentTrace_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			xmlTag = "Domn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domain";
			definition = "Set of elements used to provide the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or sub-family code cannot be provided, the generic family code defined for the domain or the generic sub-family code defined for the family should be provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BankTransactionCodeStructure5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Bank transaction code in a proprietary form, as defined by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1
	 * ProprietaryBankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
	 * BankTransaction.ProprietaryIdentification}</li>
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
	public static final MMMessageAssociationEnd Proprietary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BankTransactionCodeStructure4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification;
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryBankTransactionCodeStructure1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure4.Domain, com.tools20022.repository.msg.BankTransactionCodeStructure4.Proprietary);
				trace_lazy = () -> BankTransaction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure4";
				definition = "Set of elements used to identify the type or operations code of a transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}
}