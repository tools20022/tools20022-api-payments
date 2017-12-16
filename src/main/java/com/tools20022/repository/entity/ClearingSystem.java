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
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the system which plays a role in the clearing process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingSystem" src="doc-files/ClearingSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem#mmClearing
 * ClearingSystem.mmClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCentralClearingCounterparty
 * ClearingSystem.mmCentralClearingCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmDefaultFund
 * ClearingSystem.mmDefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCollateralManagement
 * ClearingSystem.mmCollateralManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#mmClearingSystem
 * Clearing.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmClearingSystem
 * CollateralManagement.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmClearingSystem
 * DefaultFund.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole#mmSystem
 * CentralClearingCounterpartyRole.mmSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashClearingSystem
 * CashClearingSystem}</li>
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
 * "ClearingSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the system which plays a role in the clearing process."</li>
 * </ul>
 */
public class ClearingSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Clearing> clearing;
	/**
	 * Specifies the clearing process for which a clearing system is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearingSystem
	 * Clearing.mmClearingSystem}</li>
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
	public static final MMBusinessAssociationEnd mmClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clearing";
			definition = "Specifies the clearing process for which a clearing system is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Clearing.mmClearingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
		}
	};
	protected CentralClearingCounterpartyRole centralClearingCounterparty;
	/**
	 * Central counterparty which is related to a clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole#mmSystem
	 * CentralClearingCounterpartyRole.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmCentralClearingCounterparty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralClearingCounterparty";
			definition = "Central counterparty which is related to a clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CentralClearingCounterpartyRole.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CentralClearingCounterpartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DefaultFund> defaultFund;
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
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmClearingSystem
	 * DefaultFund.mmClearingSystem}</li>
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
	public static final MMBusinessAssociationEnd mmDefaultFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmClearingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * Collateral activities related to a clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmClearingSystem
	 * CollateralManagement.mmClearingSystem}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral activities related to a clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmClearingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSystem";
				definition = "Specifies the system which plays a role in the clearing process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.mmClearingSystem, com.tools20022.repository.entity.CollateralManagement.mmClearingSystem,
						com.tools20022.repository.entity.DefaultFund.mmClearingSystem, com.tools20022.repository.entity.CentralClearingCounterpartyRole.mmSystem);
				subType_lazy = () -> Arrays.asList(CashClearingSystem.mmObject());
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.mmClearing, com.tools20022.repository.entity.ClearingSystem.mmCentralClearingCounterparty,
						com.tools20022.repository.entity.ClearingSystem.mmDefaultFund, com.tools20022.repository.entity.ClearingSystem.mmCollateralManagement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClearingSystem.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Clearing> getClearing() {
		return clearing;
	}

	public void setClearing(List<com.tools20022.repository.entity.Clearing> clearing) {
		this.clearing = clearing;
	}

	public CentralClearingCounterpartyRole getCentralClearingCounterparty() {
		return centralClearingCounterparty;
	}

	public void setCentralClearingCounterparty(com.tools20022.repository.entity.CentralClearingCounterpartyRole centralClearingCounterparty) {
		this.centralClearingCounterparty = centralClearingCounterparty;
	}

	public List<DefaultFund> getDefaultFund() {
		return defaultFund;
	}

	public void setDefaultFund(List<com.tools20022.repository.entity.DefaultFund> defaultFund) {
		this.defaultFund = defaultFund;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public void setCollateralManagement(com.tools20022.repository.entity.CollateralManagement collateralManagement) {
		this.collateralManagement = collateralManagement;
	}
}