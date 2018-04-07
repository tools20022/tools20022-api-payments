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
import com.tools20022.repository.entity.CashClearingSystem;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementInstruction2;
import com.tools20022.repository.msg.SettlementInstruction4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Identification of a specific system or set of rules and/or processes to be
 * applied at the settlement place.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SettlementInstructionSystemRole"
 * src="doc-files/SettlementInstructionSystemRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
 * SettlementInstructionSystemRole.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
 * CashClearingSystem.mmSystemRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmClearingSystem
 * SettlementInstruction4.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmClearingSystem
 * SettlementInstruction2.mmClearingSystem}</li>
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
 * "SettlementInstructionSystemRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a specific system or set of rules and/or processes to be applied at the settlement place."
 * </li>
 * </ul>
 */
public class SettlementInstructionSystemRole extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CashClearingSystem> system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
	 * CashClearingSystem.mmSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the settlement of a payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SettlementInstructionSystemRole, List<CashClearingSystem>> mmSystem = new MMBusinessAssociationEnd<SettlementInstructionSystemRole, List<CashClearingSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the settlement of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> CashClearingSystem.mmSystemRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashClearingSystem.mmObject();
		}

		@Override
		public List<CashClearingSystem> getValue(SettlementInstructionSystemRole obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(SettlementInstructionSystemRole obj, List<CashClearingSystem> value) {
			obj.setSystem(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionSystemRole";
				definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
				associationDomain_lazy = () -> Arrays.asList(CashClearingSystem.mmSystemRole);
				derivationElement_lazy = () -> Arrays.asList(SettlementInstruction4.mmClearingSystem, SettlementInstruction2.mmClearingSystem);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SettlementInstructionSystemRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashClearingSystem> getSystem() {
		return system == null ? system = new ArrayList<>() : system;
	}

	public SettlementInstructionSystemRole setSystem(List<CashClearingSystem> system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}
}