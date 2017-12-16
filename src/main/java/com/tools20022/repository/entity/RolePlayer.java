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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Type of entity that plays a specific role in a specific context.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RolePlayer" src="doc-files/RolePlayer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
 * RolePlayer.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmValidityPeriod
 * RolePlayer.mmValidityPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmPlayer Role.mmPlayer}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedRolePlayer
 * DateTimePeriod.mmRelatedRolePlayer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "RolePlayer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of entity that plays a specific role in a specific context."</li>
 * </ul>
 */
public class RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Role> role;
	/**
	 * Role of the entity in the activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#mmPlayer
	 * Role.mmPlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the entity in the activity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role of the entity in the activity.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.mmPlayer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * Specifies the period during which a role player is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedRolePlayer
	 * DateTimePeriod.mmRelatedRolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the period during which a role player is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a role player is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedRolePlayer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RolePlayer";
				definition = "Type of entity that plays a specific role in a specific context.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmPlayer, com.tools20022.repository.entity.DateTimePeriod.mmRelatedRolePlayer);
				subType_lazy = () -> Arrays.asList(Party.mmObject(), System.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.mmRole, com.tools20022.repository.entity.RolePlayer.mmValidityPeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RolePlayer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<com.tools20022.repository.entity.Role> role) {
		this.role = role;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
}