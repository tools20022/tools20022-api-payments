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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#mmTransactionJournal
 * ContractRegistrationStatementCriteria1.mmTransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#mmSupportingDocumentJournal
 * ContractRegistrationStatementCriteria1.mmSupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#mmAdditionalSupportingDocumentJournal
 * ContractRegistrationStatementCriteria1.mmAdditionalSupportingDocumentJournal}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1#mmRegulatoryRuleValidation
 * ContractRegistrationStatementCriteria1.mmRegulatoryRuleValidation}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistrationStatementCriteria1", propOrder = {"transactionJournal", "supportingDocumentJournal", "additionalSupportingDocumentJournal", "regulatoryRuleValidation"})
public class ContractRegistrationStatementCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxJrnl")
	protected TrueFalseIndicator transactionJournal;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>> mmTransactionJournal = new MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TxJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionJournal";
			definition = "Indicates whether the journal of the transactions recorded under the registered currency control contract must be returned or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ContractRegistrationStatementCriteria1 obj) {
			return obj.getTransactionJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatementCriteria1 obj, Optional<TrueFalseIndicator> value) {
			obj.setTransactionJournal(value.orElse(null));
		}
	};
	@XmlElement(name = "SpprtgDocJrnl")
	protected TrueFalseIndicator supportingDocumentJournal;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>> mmSupportingDocumentJournal = new MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SpprtgDocJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocumentJournal";
			definition = "Indicates whether the journal of the supporting documents recorded under the registered currency control contract must be returned or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ContractRegistrationStatementCriteria1 obj) {
			return obj.getSupportingDocumentJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatementCriteria1 obj, Optional<TrueFalseIndicator> value) {
			obj.setSupportingDocumentJournal(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlSpprtgDocJrnl")
	protected TrueFalseIndicator additionalSupportingDocumentJournal;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>> mmAdditionalSupportingDocumentJournal = new MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSpprtgDocJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSupportingDocumentJournal";
			definition = "Indicates whether the journal of additional supporting documents recorded under the registered currency control contract must be returned or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ContractRegistrationStatementCriteria1 obj) {
			return obj.getAdditionalSupportingDocumentJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatementCriteria1 obj, Optional<TrueFalseIndicator> value) {
			obj.setAdditionalSupportingDocumentJournal(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryRuleVldtn")
	protected TrueFalseIndicator regulatoryRuleValidation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>> mmRegulatoryRuleValidation = new MMMessageAttribute<ContractRegistrationStatementCriteria1, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RgltryRuleVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryRuleValidation";
			definition = "Indicates whether the details on the currency control rule against which has been violated must be returned or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ContractRegistrationStatementCriteria1 obj) {
			return obj.getRegulatoryRuleValidation();
		}

		@Override
		public void setValue(ContractRegistrationStatementCriteria1 obj, Optional<TrueFalseIndicator> value) {
			obj.setRegulatoryRuleValidation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmTransactionJournal,
						com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmSupportingDocumentJournal, com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmAdditionalSupportingDocumentJournal,
						com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmRegulatoryRuleValidation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationStatementCriteria1";
				definition = "Provides the list of criteria to be returned in the contract registration statement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getTransactionJournal() {
		return transactionJournal == null ? Optional.empty() : Optional.of(transactionJournal);
	}

	public ContractRegistrationStatementCriteria1 setTransactionJournal(TrueFalseIndicator transactionJournal) {
		this.transactionJournal = transactionJournal;
		return this;
	}

	public Optional<TrueFalseIndicator> getSupportingDocumentJournal() {
		return supportingDocumentJournal == null ? Optional.empty() : Optional.of(supportingDocumentJournal);
	}

	public ContractRegistrationStatementCriteria1 setSupportingDocumentJournal(TrueFalseIndicator supportingDocumentJournal) {
		this.supportingDocumentJournal = supportingDocumentJournal;
		return this;
	}

	public Optional<TrueFalseIndicator> getAdditionalSupportingDocumentJournal() {
		return additionalSupportingDocumentJournal == null ? Optional.empty() : Optional.of(additionalSupportingDocumentJournal);
	}

	public ContractRegistrationStatementCriteria1 setAdditionalSupportingDocumentJournal(TrueFalseIndicator additionalSupportingDocumentJournal) {
		this.additionalSupportingDocumentJournal = additionalSupportingDocumentJournal;
		return this;
	}

	public Optional<TrueFalseIndicator> getRegulatoryRuleValidation() {
		return regulatoryRuleValidation == null ? Optional.empty() : Optional.of(regulatoryRuleValidation);
	}

	public ContractRegistrationStatementCriteria1 setRegulatoryRuleValidation(TrueFalseIndicator regulatoryRuleValidation) {
		this.regulatoryRuleValidation = regulatoryRuleValidation;
		return this;
	}
}