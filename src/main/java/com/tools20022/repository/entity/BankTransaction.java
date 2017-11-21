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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmOriginalBankTransactionCode
 * PaymentReturnReason2.mmOriginalBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmBankTransactionCode
 * TotalsPerBankTransactionCode4.mmBankTransactionCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Specifies the business area of the underlying transaction.
	 * <p>
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
	public static final MMBusinessAttribute mmDomain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure5.mmCode);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domain";
			definition = "Specifies the business area of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionDomainCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankTransaction.class.getMethod("getDomain", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalBankTransactionFamilyCode family;
	/**
	 * Specifies the family within a domain.
	 * <p>
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
	public static final MMBusinessAttribute mmFamily = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmCode, BankTransactionCodeStructure5.mmFamily);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Specifies the family within a domain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankTransaction.class.getMethod("getFamily", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalBankTransactionFamilyCode subFamily;
	/**
	 * Specifies the sub-product family within a specific family.
	 * <p>
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
	public static final MMBusinessAttribute mmSubFamily = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmSubFamilyCode);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubFamily";
			definition = "Specifies the sub-product family within a specific family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankTransaction.class.getMethod("getSubFamily", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> proprietaryIdentification;
	/**
	 * Bank transaction code in a proprietary form, as defined by the issuer.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BankTransactionCodeStructure4.mmProprietary);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected BankOperation bankOperation;
	/**
	 * Bank operation for which a type is detailed.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a type is detailed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.mmOperationType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
		}
	};
	protected Entry relatedEntry;
	/**
	 * Entry for which a bank transaction code is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedEntry";
			definition = "Entry for which a bank transaction code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmBankTransactionCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};
	protected PaymentProcessing relatedPayment;
	/**
	 * Payment for which bank transaction information is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which bank transaction information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmBankTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransaction";
				definition = "Code of the underlying bank transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction, com.tools20022.repository.entity.Entry.mmBankTransactionCode,
						com.tools20022.repository.entity.PaymentProcessing.mmBankTransaction, com.tools20022.repository.entity.BankOperation.mmOperationType);
				derivationElement_lazy = () -> Arrays.asList(BankTransactionCodeStructure4.mmDomain, PaymentReturnReason2.mmOriginalBankTransactionCode, TotalsPerBankTransactionCode4.mmBankTransactionCode);
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

	public void setDomain(ExternalBankTransactionDomainCode domain) {
		this.domain = domain;
	}

	public ExternalBankTransactionFamilyCode getFamily() {
		return family;
	}

	public void setFamily(ExternalBankTransactionFamilyCode family) {
		this.family = family;
	}

	public ExternalBankTransactionFamilyCode getSubFamily() {
		return subFamily;
	}

	public void setSubFamily(ExternalBankTransactionFamilyCode subFamily) {
		this.subFamily = subFamily;
	}

	public List<GenericIdentification> getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(List<com.tools20022.repository.entity.GenericIdentification> proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	public BankOperation getBankOperation() {
		return bankOperation;
	}

	public void setBankOperation(com.tools20022.repository.entity.BankOperation bankOperation) {
		this.bankOperation = bankOperation;
	}

	public Entry getRelatedEntry() {
		return relatedEntry;
	}

	public void setRelatedEntry(com.tools20022.repository.entity.Entry relatedEntry) {
		this.relatedEntry = relatedEntry;
	}

	public PaymentProcessing getRelatedPayment() {
		return relatedPayment;
	}

	public void setRelatedPayment(com.tools20022.repository.entity.PaymentProcessing relatedPayment) {
		this.relatedPayment = relatedPayment;
	}
}