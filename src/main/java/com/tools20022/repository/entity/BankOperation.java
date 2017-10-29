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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Operation on a bank account. It may be limited in time, amount or type of
 * operation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BankOperation" src="doc-files/BankOperation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#OperationThreshold
 * BankOperation.OperationThreshold}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankOperation#OperationType
 * BankOperation.OperationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#ApplicablePeriod
 * BankOperation.ApplicablePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BankOperation
 * DateTimePeriod.BankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#BankOperation
 * OperationThreshold.BankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#BankOperation
 * BankTransaction.BankOperation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BankOperation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Operation on a bank account. It may be limited in time, amount or type of operation."
 * </li>
 * </ul>
 */
public class BankOperation extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Threshold related to a bank account operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#BankOperation
	 * OperationThreshold.BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#Authorisation
	 * PartyAndAuthorisation1.Authorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#Authorisation
	 * PartyAndAuthorisation3.Authorisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation BankOperation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Threshold related to a bank account operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OperationThreshold = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndAuthorisation1.Authorisation, com.tools20022.repository.msg.PartyAndAuthorisation3.Authorisation);
			elementContext_lazy = () -> BankOperation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperationThreshold";
			definition = "Threshold related to a bank account operation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.OperationThreshold.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OperationThreshold.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of the operation related to a bank account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#BankOperation
	 * BankTransaction.BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#BankOperation
	 * OperationMandate2.BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#BankOperation
	 * OperationMandate3.BankOperation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation BankOperation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the operation related to a bank account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OperationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OperationMandate2.BankOperation, com.tools20022.repository.msg.OperationMandate3.BankOperation);
			elementContext_lazy = () -> BankOperation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperationType";
			definition = "Specifies the type of the operation related to a bank account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period, for instance a number of days, for which the bank
	 * operations are permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BankOperation
	 * DateTimePeriod.BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1#NumberOfDays
	 * MaximumAmountByPeriod1.NumberOfDays}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation BankOperation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicablePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period, for instance a number of days, for which the bank operations are permitted. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ApplicablePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaximumAmountByPeriod1.NumberOfDays);
			elementContext_lazy = () -> BankOperation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicablePeriod";
			definition = "Specifies the period, for instance a number of days, for which the bank operations are permitted. ";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankOperation";
				definition = "Operation on a bank account. It may be limited in time, amount or type of operation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.BankOperation, com.tools20022.repository.entity.OperationThreshold.BankOperation,
						com.tools20022.repository.entity.BankTransaction.BankOperation);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankOperation.OperationThreshold, com.tools20022.repository.entity.BankOperation.OperationType,
						com.tools20022.repository.entity.BankOperation.ApplicablePeriod);
			}
		});
		return mmObject_lazy.get();
	}
}