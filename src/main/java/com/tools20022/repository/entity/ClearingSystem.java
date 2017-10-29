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
import com.tools20022.repository.entity.System;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the system which plays a role in the clearing process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingSystem" src="doc-files/ClearingSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem#Clearing
 * ClearingSystem.Clearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#CentralClearingCounterparty
 * ClearingSystem.CentralClearingCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem#DefaultFund
 * ClearingSystem.DefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#CollateralManagement
 * ClearingSystem.CollateralManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#ClearingSystem
 * Clearing.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#ClearingSystem
 * CollateralManagement.ClearingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DefaultFund#ClearingSystem
 * DefaultFund.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole#System
 * CentralClearingCounterpartyRole.System}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashClearingSystem
 * CashClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "ClearingSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the system which plays a role in the clearing process."</li>
 * </ul>
 */
public class ClearingSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the clearing process for which a clearing system is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#ClearingSystem
	 * Clearing.ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing process for which a clearing system is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Clearing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clearing";
			definition = "Specifies the clearing process for which a clearing system is used.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Clearing.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Central counterparty which is related to a clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole#System
	 * CentralClearingCounterpartyRole.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole
	 * CentralClearingCounterpartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralClearingCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central counterparty which is related to a clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CentralClearingCounterparty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralClearingCounterparty";
			definition = "Central counterparty which is related to a clearing system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CentralClearingCounterpartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CentralClearingCounterpartyRole.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assets posted by participants in a clearing fund that can be used in the
	 * event of a default by a participant to compensate non-defaulting
	 * participants for losses they suffer due to this default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#ClearingSystem
	 * DefaultFund.ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DefaultFund
	 * DefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DefaultFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral activities related to a clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#ClearingSystem
	 * CollateralManagement.ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral activities related to a clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral activities related to a clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingSystem";
				definition = "Specifies the system which plays a role in the clearing process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.ClearingSystem, com.tools20022.repository.entity.CollateralManagement.ClearingSystem,
						com.tools20022.repository.entity.DefaultFund.ClearingSystem, com.tools20022.repository.entity.CentralClearingCounterpartyRole.System);
				subType_lazy = () -> Arrays.asList(CashClearingSystem.mmObject());
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.Clearing, com.tools20022.repository.entity.ClearingSystem.CentralClearingCounterparty,
						com.tools20022.repository.entity.ClearingSystem.DefaultFund, com.tools20022.repository.entity.ClearingSystem.CollateralManagement);
			}
		});
		return mmObject_lazy.get();
	}
}