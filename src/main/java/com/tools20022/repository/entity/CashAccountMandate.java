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
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.msg.OperationMandate2;
import com.tools20022.repository.msg.OperationMandate3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation given to a mandate holder to perform some operation on an
 * account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountMandate" src="doc-files/CashAccountMandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountMandate#Services
 * CashAccountMandate.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#CashAccountContract
 * CashAccountMandate.CashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccountMandate
 * CashAccountContract.CashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountMandate
 * CashAccountService.CashAccountMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate2
 * OperationMandate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate3
 * OperationMandate3}</li>
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
 * "CashAccountMandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation given to a mandate holder to perform some operation on an account."
 * </li>
 * </ul>
 */
public class CashAccountMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Services that the holder of an account mandate can exercise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountMandate
	 * CashAccountService.CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services that the holder of an account mandate can exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services that the holder of an account mandate can exercise.";
			minOccurs = 0;
			type_lazy = () -> CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccountMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract to which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccountMandate
	 * CashAccountContract.CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract to which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract to which a mandate applies.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccountMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountMandate";
				definition = "Authorisation given to a mandate holder to perform some operation on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.CashAccountMandate, com.tools20022.repository.entity.CashAccountService.CashAccountMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountMandate.Services, com.tools20022.repository.entity.CashAccountMandate.CashAccountContract);
				derivationComponent_lazy = () -> Arrays.asList(OperationMandate2.mmObject(), OperationMandate3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}