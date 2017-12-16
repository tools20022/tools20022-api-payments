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
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Infrastructure that may be a component of a clearing house and which
 * facilitates clearing and settlement for its members by standing between the
 * buyer and the seller. It may net transactions and it substitutes itself as
 * settlement counterparty for each position.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CentralClearingCounterpartyRole"
 * src="doc-files/CentralClearingCounterpartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole#mmSystem
 * CentralClearingCounterpartyRole.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCentralClearingCounterparty
 * ClearingSystem.mmCentralClearingCounterparty}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CentralClearingCounterpartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Infrastructure that may be a component of a clearing house and which facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position."
 * </li>
 * </ul>
 */
public class CentralClearingCounterpartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ClearingSystem> system;
	/**
	 * Specifies the system which plays a role in the clearing of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCentralClearingCounterparty
	 * ClearingSystem.mmCentralClearingCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole
	 * CentralClearingCounterpartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the clearing of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CentralClearingCounterpartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the clearing of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmCentralClearingCounterparty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CentralClearingCounterpartyRole";
				definition = "Infrastructure that may be a component of a clearing house and which facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.mmCentralClearingCounterparty);
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CentralClearingCounterpartyRole.mmSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CentralClearingCounterpartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ClearingSystem> getSystem() {
		return system;
	}

	public void setSystem(List<com.tools20022.repository.entity.ClearingSystem> system) {
		this.system = system;
	}
}