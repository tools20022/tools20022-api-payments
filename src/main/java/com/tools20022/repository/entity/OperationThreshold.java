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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.Authorisation2;
import com.tools20022.repository.msg.MaximumAmountByPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Threshold related to a bank account operation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OperationThreshold" src="doc-files/OperationThreshold.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#BankOperation
 * OperationThreshold.BankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#MininumAmountPerTransaction
 * OperationThreshold.MininumAmountPerTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#MaximumAmount
 * OperationThreshold.MaximumAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#OperationThreshold
 * BankOperation.OperationThreshold}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1
 * MaximumAmountByPeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
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
 * "OperationThreshold"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Threshold related to a bank account operation."</li>
 * </ul>
 */
public class OperationThreshold {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Bank operation for which a threshold is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#OperationThreshold
	 * BankOperation.OperationThreshold}</li>
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
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank operation for which a threshold is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a threshold is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.OperationThreshold;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lower limit for the operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MininumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower limit for the operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MininumAmountPerTransaction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MininumAmountPerTransaction";
			definition = "Lower limit for the operation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum amount allowed over a specific period of time and/or amount which
	 * is the upper limit for an operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1#MaximumAmount
	 * MaximumAmountByPeriod1.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByTransaction
	 * Authorisation2.MaximumAmountByTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByPeriod
	 * Authorisation2.MaximumAmountByPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByBulkSubmission
	 * Authorisation2.MaximumAmountByBulkSubmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed over a specific period of time and/or amount which is the upper limit for an operation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaximumAmountByPeriod1.MaximumAmount, com.tools20022.repository.msg.Authorisation2.MaximumAmountByTransaction,
					com.tools20022.repository.msg.Authorisation2.MaximumAmountByPeriod, com.tools20022.repository.msg.Authorisation2.MaximumAmountByBulkSubmission);
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount allowed over a specific period of time and/or amount which is the upper limit for an operation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OperationThreshold";
				definition = "Threshold related to a bank account operation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankOperation.OperationThreshold);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OperationThreshold.BankOperation, com.tools20022.repository.entity.OperationThreshold.MininumAmountPerTransaction,
						com.tools20022.repository.entity.OperationThreshold.MaximumAmount);
				derivationComponent_lazy = () -> Arrays.asList(MaximumAmountByPeriod1.mmObject(), Authorisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}