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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the list of criteria to be returned in the contract registration
 * statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#TransactionJournal
 * ContractRegistrationStatementCriteria1.TransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#SupportingDocumentJournal
 * ContractRegistrationStatementCriteria1.SupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#AdditionalSupportingDocumentJournal
 * ContractRegistrationStatementCriteria1.AdditionalSupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#RegulatoryRuleValidation
 * ContractRegistrationStatementCriteria1.RegulatoryRuleValidation}</li>
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
 * "ContractRegistrationStatementCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the list of criteria to be returned in the contract registration statement."
 * </li>
 * </ul>
 */
public class ContractRegistrationStatementCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the journal of the transactions recorded under the
	 * registered currency control contract must be returned or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1
	 * ContractRegistrationStatementCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the journal of the transactions recorded under the registered currency control contract must be returned or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionJournal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TxJrnl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionJournal";
			definition = "Indicates whether the journal of the transactions recorded under the registered currency control contract must be returned or not.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the journal of the supporting documents recorded under
	 * the registered currency control contract must be returned or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1
	 * ContractRegistrationStatementCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtgDocJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocumentJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the journal of the supporting documents recorded under the registered currency control contract must be returned or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SupportingDocumentJournal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SpprtgDocJrnl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocumentJournal";
			definition = "Indicates whether the journal of the supporting documents recorded under the registered currency control contract must be returned or not.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the journal of additional supporting documents recorded
	 * under the registered currency control contract must be returned or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1
	 * ContractRegistrationStatementCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSpprtgDocJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSupportingDocumentJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the journal of additional supporting documents recorded under the registered currency control contract must be returned or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalSupportingDocumentJournal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSpprtgDocJrnl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSupportingDocumentJournal";
			definition = "Indicates whether the journal of additional supporting documents recorded under the registered currency control contract must be returned or not.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the details on the currency control rule against which
	 * has been violated must be returned or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1
	 * ContractRegistrationStatementCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRuleVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryRuleValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the details on the currency control rule against which has been violated must be returned or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RegulatoryRuleValidation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RgltryRuleVldtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryRuleValidation";
			definition = "Indicates whether the details on the currency control rule against which has been violated must be returned or not.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.TransactionJournal,
						com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.SupportingDocumentJournal, com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.AdditionalSupportingDocumentJournal,
						com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.RegulatoryRuleValidation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationStatementCriteria1";
				definition = "Provides the list of criteria to be returned in the contract registration statement.";
			}
		});
		return mmObject_lazy.get();
	}
}