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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationThreshold
 * BankOperation.mmOperationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationType
 * BankOperation.mmOperationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmApplicablePeriod
 * BankOperation.mmApplicablePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBankOperation
 * DateTimePeriod.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmBankOperation
 * OperationThreshold.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmBankOperation
 * BankTransaction.mmBankOperation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BankOperation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Operation on a bank account. It may be limited in time, amount or type of operation."
 * </li>
 * </ul>
 */
public class BankOperation extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OperationThreshold operationThreshold;
	/**
	 * Threshold related to a bank account operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmBankOperation
	 * OperationThreshold.mmBankOperation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmAuthorisation
	 * PartyAndAuthorisation1.mmAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmAuthorisation
	 * PartyAndAuthorisation3.mmAuthorisation}</li>
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
	public static final MMBusinessAssociationEnd mmOperationThreshold = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PartyAndAuthorisation1.mmAuthorisation, PartyAndAuthorisation3.mmAuthorisation);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperationThreshold";
			definition = "Threshold related to a bank account operation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OperationThreshold.mmBankOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OperationThreshold.mmObject();
		}
	};
	protected BankTransaction operationType;
	/**
	 * Specifies the type of the operation related to a bank account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmBankOperation
	 * BankTransaction.mmBankOperation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmBankOperation
	 * OperationMandate2.mmBankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmBankOperation
	 * OperationMandate3.mmBankOperation}</li>
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
	public static final MMBusinessAssociationEnd mmOperationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OperationMandate2.mmBankOperation, OperationMandate3.mmBankOperation);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperationType";
			definition = "Specifies the type of the operation related to a bank account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmBankOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> applicablePeriod;
	/**
	 * Specifies the period, for instance a number of days, for which the bank
	 * operations are permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBankOperation
	 * DateTimePeriod.mmBankOperation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1#mmNumberOfDays
	 * MaximumAmountByPeriod1.mmNumberOfDays}</li>
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
	public static final MMBusinessAssociationEnd mmApplicablePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(MaximumAmountByPeriod1.mmNumberOfDays);
			elementContext_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicablePeriod";
			definition = "Specifies the period, for instance a number of days, for which the bank operations are permitted. ";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBankOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankOperation";
				definition = "Operation on a bank account. It may be limited in time, amount or type of operation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmBankOperation, com.tools20022.repository.entity.OperationThreshold.mmBankOperation,
						com.tools20022.repository.entity.BankTransaction.mmBankOperation);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankOperation.mmOperationThreshold, com.tools20022.repository.entity.BankOperation.mmOperationType,
						com.tools20022.repository.entity.BankOperation.mmApplicablePeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankOperation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OperationThreshold getOperationThreshold() {
		return operationThreshold;
	}

	public void setOperationThreshold(com.tools20022.repository.entity.OperationThreshold operationThreshold) {
		this.operationThreshold = operationThreshold;
	}

	public BankTransaction getOperationType() {
		return operationType;
	}

	public void setOperationType(com.tools20022.repository.entity.BankTransaction operationType) {
		this.operationType = operationType;
	}

	public List<DateTimePeriod> getApplicablePeriod() {
		return applicablePeriod;
	}

	public void setApplicablePeriod(List<com.tools20022.repository.entity.DateTimePeriod> applicablePeriod) {
		this.applicablePeriod = applicablePeriod;
	}
}