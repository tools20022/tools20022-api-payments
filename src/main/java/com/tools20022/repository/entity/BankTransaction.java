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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ExternalBankTransactionDomainCode;
import com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode;
import com.tools20022.repository.entity.BankOperation;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code of the underlying bank transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BankTransaction" src="doc-files/BankTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#mmDomain
 * BankTransaction.mmDomain}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#mmFamily
 * BankTransaction.mmFamily}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#mmSubFamily
 * BankTransaction.mmSubFamily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
 * BankTransaction.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmBankOperation
 * BankTransaction.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedEntry
 * BankTransaction.mmRelatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedPayment
 * BankTransaction.mmRelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
 * GenericIdentification.mmIdentificationForBankTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
 * Entry.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmBankTransaction
 * PaymentProcessing.mmBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationType
 * BankOperation.mmOperationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#mmDomain
 * BankTransactionCodeStructure4.mmDomain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmBankTransactionCode
 * TotalsPerBankTransactionCode5.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmOriginalBankTransactionCode
 * PaymentReturnReason3.mmOriginalBankTransactionCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure6
 * BankTransactionCodeStructure6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5
 * BankTransactionCodeStructure5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
 * BankTransactionCodeStructure4}</li>
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
 * "BankTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code of the underlying bank transaction."</li>
 * </ul>
 */
public class BankTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExternalBankTransactionDomainCode domain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionDomainCode
	 * ExternalBankTransactionDomainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5#mmCode
	 * BankTransactionCodeStructure5.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business area of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BankTransaction, ExternalBankTransactionDomainCode> mmDomain = new MMBusinessAttribute<BankTransaction, ExternalBankTransactionDomainCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure5.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domain";
			definition = "Specifies the business area of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionDomainCode.mmObject();
		}

		@Override
		public ExternalBankTransactionDomainCode getValue(BankTransaction obj) {
			return obj.getDomain();
		}

		@Override
		public void setValue(BankTransaction obj, ExternalBankTransactionDomainCode value) {
			obj.setDomain(value);
		}
	};
	protected ExternalBankTransactionFamilyCode family;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode
	 * ExternalBankTransactionFamilyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure6#mmCode
	 * BankTransactionCodeStructure6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5#mmFamily
	 * BankTransactionCodeStructure5.mmFamily}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Family"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the family within a domain."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BankTransaction, ExternalBankTransactionFamilyCode> mmFamily = new MMBusinessAttribute<BankTransaction, ExternalBankTransactionFamilyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmCode, BankTransactionCodeStructure5.mmFamily);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Specifies the family within a domain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}

		@Override
		public ExternalBankTransactionFamilyCode getValue(BankTransaction obj) {
			return obj.getFamily();
		}

		@Override
		public void setValue(BankTransaction obj, ExternalBankTransactionFamilyCode value) {
			obj.setFamily(value);
		}
	};
	protected ExternalBankTransactionFamilyCode subFamily;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode
	 * ExternalBankTransactionFamilyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure6#mmSubFamilyCode
	 * BankTransactionCodeStructure6.mmSubFamilyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubFamily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the sub-product family within a specific family."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BankTransaction, ExternalBankTransactionFamilyCode> mmSubFamily = new MMBusinessAttribute<BankTransaction, ExternalBankTransactionFamilyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmSubFamilyCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubFamily";
			definition = "Specifies the sub-product family within a specific family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}

		@Override
		public ExternalBankTransactionFamilyCode getValue(BankTransaction obj) {
			return obj.getSubFamily();
		}

		@Override
		public void setValue(BankTransaction obj, ExternalBankTransactionFamilyCode value) {
			obj.setSubFamily(value);
		}
	};
	protected List<GenericIdentification> proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
	 * GenericIdentification.mmIdentificationForBankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#mmProprietary
	 * BankTransactionCodeStructure4.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction code in a proprietary form, as defined by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BankTransaction, List<GenericIdentification>> mmProprietaryIdentification = new MMBusinessAssociationEnd<BankTransaction, List<GenericIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure4.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForBankTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(BankTransaction obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(BankTransaction obj, List<GenericIdentification> value) {
			obj.setProprietaryIdentification(value);
		}
	};
	protected BankOperation bankOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationType
	 * BankOperation.mmOperationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankOperation
	 * BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank operation for which a type is detailed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BankTransaction, Optional<BankOperation>> mmBankOperation = new MMBusinessAssociationEnd<BankTransaction, Optional<BankOperation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a type is detailed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BankOperation.mmOperationType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankOperation.mmObject();
		}

		@Override
		public Optional<BankOperation> getValue(BankTransaction obj) {
			return obj.getBankOperation();
		}

		@Override
		public void setValue(BankTransaction obj, Optional<BankOperation> value) {
			obj.setBankOperation(value.orElse(null));
		}
	};
	protected Entry relatedEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry for which a bank transaction code is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BankTransaction, Optional<Entry>> mmRelatedEntry = new MMBusinessAssociationEnd<BankTransaction, Optional<Entry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedEntry";
			definition = "Entry for which a bank transaction code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Entry.mmBankTransactionCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Entry.mmObject();
		}

		@Override
		public Optional<Entry> getValue(BankTransaction obj) {
			return obj.getRelatedEntry();
		}

		@Override
		public void setValue(BankTransaction obj, Optional<Entry> value) {
			obj.setRelatedEntry(value.orElse(null));
		}
	};
	protected PaymentProcessing relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmBankTransaction
	 * PaymentProcessing.mmBankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment for which bank transaction information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BankTransaction, PaymentProcessing> mmRelatedPayment = new MMBusinessAssociationEnd<BankTransaction, PaymentProcessing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which bank transaction information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentProcessing.mmBankTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}

		@Override
		public PaymentProcessing getValue(BankTransaction obj) {
			return obj.getRelatedPayment();
		}

		@Override
		public void setValue(BankTransaction obj, PaymentProcessing value) {
			obj.setRelatedPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransaction";
				definition = "Code of the underlying bank transaction.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForBankTransaction, Entry.mmBankTransactionCode, PaymentProcessing.mmBankTransaction, BankOperation.mmOperationType);
				derivationElement_lazy = () -> Arrays.asList(BankTransactionCodeStructure4.mmDomain, TotalsPerBankTransactionCode5.mmBankTransactionCode, PaymentReturnReason3.mmOriginalBankTransactionCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankTransaction.mmDomain, com.tools20022.repository.entity.BankTransaction.mmFamily, com.tools20022.repository.entity.BankTransaction.mmSubFamily,
						com.tools20022.repository.entity.BankTransaction.mmProprietaryIdentification, com.tools20022.repository.entity.BankTransaction.mmBankOperation, com.tools20022.repository.entity.BankTransaction.mmRelatedEntry,
						com.tools20022.repository.entity.BankTransaction.mmRelatedPayment);
				derivationComponent_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmObject(), BankTransactionCodeStructure5.mmObject(), BankTransactionCodeStructure4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalBankTransactionDomainCode getDomain() {
		return domain;
	}

	public BankTransaction setDomain(ExternalBankTransactionDomainCode domain) {
		this.domain = Objects.requireNonNull(domain);
		return this;
	}

	public ExternalBankTransactionFamilyCode getFamily() {
		return family;
	}

	public BankTransaction setFamily(ExternalBankTransactionFamilyCode family) {
		this.family = Objects.requireNonNull(family);
		return this;
	}

	public ExternalBankTransactionFamilyCode getSubFamily() {
		return subFamily;
	}

	public BankTransaction setSubFamily(ExternalBankTransactionFamilyCode subFamily) {
		this.subFamily = Objects.requireNonNull(subFamily);
		return this;
	}

	public List<GenericIdentification> getProprietaryIdentification() {
		return proprietaryIdentification == null ? proprietaryIdentification = new ArrayList<>() : proprietaryIdentification;
	}

	public BankTransaction setProprietaryIdentification(List<GenericIdentification> proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public Optional<BankOperation> getBankOperation() {
		return bankOperation == null ? Optional.empty() : Optional.of(bankOperation);
	}

	public BankTransaction setBankOperation(BankOperation bankOperation) {
		this.bankOperation = bankOperation;
		return this;
	}

	public Optional<Entry> getRelatedEntry() {
		return relatedEntry == null ? Optional.empty() : Optional.of(relatedEntry);
	}

	public BankTransaction setRelatedEntry(Entry relatedEntry) {
		this.relatedEntry = relatedEntry;
		return this;
	}

	public PaymentProcessing getRelatedPayment() {
		return relatedPayment;
	}

	public BankTransaction setRelatedPayment(PaymentProcessing relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}
}