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
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Identifies the party which is the terminal manager (TM) to contact for the
 * maintenance.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TerminalManagerRole" src="doc-files/TerminalManagerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole#mmTerminalManagementSystem
 * TerminalManagerRole.mmTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmTerminalManagerRole
 * TerminalManagementSystem.mmTerminalManagerRole}</li>
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
 * "TerminalManagerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the party which is the terminal manager (TM) to contact for the maintenance."
 * </li>
 * </ul>
 */
public class TerminalManagerRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.TerminalManagementSystem> terminalManagementSystem;
	/**
	 * Identifies the system for which a party plays the terminal manager role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmTerminalManagerRole
	 * TerminalManagementSystem.mmTerminalManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole
	 * TerminalManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the system for which a party plays the terminal manager role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Identifies the system for which a party plays the terminal manager role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmTerminalManagerRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagerRole";
				definition = "Identifies the party which is the terminal manager (TM) to contact for the maintenance.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmTerminalManagerRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagerRole.mmTerminalManagementSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TerminalManagerRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<TerminalManagementSystem> getTerminalManagementSystem() {
		return terminalManagementSystem;
	}

	public void setTerminalManagementSystem(List<com.tools20022.repository.entity.TerminalManagementSystem> terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
	}
}