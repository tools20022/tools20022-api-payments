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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalBankTransactionDomainCode;
import com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode;
import com.tools20022.repository.msg.BankTransactionCodeStructure4;
import com.tools20022.repository.msg.BankTransactionCodeStructure5;
import com.tools20022.repository.msg.BankTransactionCodeStructure6;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#Domain
 * BankTransaction.Domain}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#Family
 * BankTransaction.Family}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankTransaction#SubFamily
 * BankTransaction.SubFamily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
 * BankTransaction.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#BankOperation
 * BankTransaction.BankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedEntry
 * BankTransaction.RelatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedPayment
 * BankTransaction.RelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForBankTransaction
 * GenericIdentification.IdentificationForBankTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#BankTransactionCode
 * Entry.BankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#BankTransaction
 * PaymentProcessing.BankTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankOperation#OperationType
 * BankOperation.OperationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#Domain
 * BankTransactionCodeStructure4.Domain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#OriginalBankTransactionCode
 * PaymentReturnReason2.OriginalBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#BankTransactionCode
 * TotalsPerBankTransactionCode4.BankTransactionCode}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5#Code
	 * BankTransactionCodeStructure5.Code}</li>
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
	public static final MMBusinessAttribute Domain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure5.Code);
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domain";
			definition = "Specifies the business area of the underlying transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionDomainCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure6#Code
	 * BankTransactionCodeStructure6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure5#Family
	 * BankTransactionCodeStructure5.Family}</li>
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
	public static final MMBusinessAttribute Family = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure6.Code, com.tools20022.repository.msg.BankTransactionCodeStructure5.Family);
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Specifies the family within a domain.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure6#SubFamilyCode
	 * BankTransactionCodeStructure6.SubFamilyCode}</li>
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
	public static final MMBusinessAttribute SubFamily = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure6.SubFamilyCode);
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFamily";
			definition = "Specifies the sub-product family within a specific family.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}
	};
	/**
	 * Bank transaction code in a proprietary form, as defined by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForBankTransaction
	 * GenericIdentification.IdentificationForBankTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4#Proprietary
	 * BankTransactionCodeStructure4.Proprietary}</li>
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
	public static final MMBusinessAssociationEnd ProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure4.Proprietary);
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bank operation for which a type is detailed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#OperationType
	 * BankOperation.OperationType}</li>
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
	public static final MMBusinessAssociationEnd BankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a type is detailed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.OperationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry for which a bank transaction code is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entry#BankTransactionCode
	 * Entry.BankTransactionCode}</li>
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
	public static final MMBusinessAssociationEnd RelatedEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedEntry";
			definition = "Entry for which a bank transaction code is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.BankTransactionCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which bank transaction information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#BankTransaction
	 * PaymentProcessing.BankTransaction}</li>
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
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BankTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which bank transaction information is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.BankTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankTransaction";
				definition = "Code of the underlying bank transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction, com.tools20022.repository.entity.Entry.BankTransactionCode,
						com.tools20022.repository.entity.PaymentProcessing.BankTransaction, com.tools20022.repository.entity.BankOperation.OperationType);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure4.Domain, com.tools20022.repository.msg.PaymentReturnReason2.OriginalBankTransactionCode,
						com.tools20022.repository.msg.TotalsPerBankTransactionCode4.BankTransactionCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankTransaction.Domain, com.tools20022.repository.entity.BankTransaction.Family, com.tools20022.repository.entity.BankTransaction.SubFamily,
						com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification, com.tools20022.repository.entity.BankTransaction.BankOperation, com.tools20022.repository.entity.BankTransaction.RelatedEntry,
						com.tools20022.repository.entity.BankTransaction.RelatedPayment);
				derivationComponent_lazy = () -> Arrays.asList(BankTransactionCodeStructure6.mmObject(), BankTransactionCodeStructure5.mmObject(), BankTransactionCodeStructure4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}