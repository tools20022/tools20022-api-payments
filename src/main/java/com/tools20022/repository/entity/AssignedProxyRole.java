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
import com.tools20022.repository.entity.MeetingPartyRole;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Party appointed by the rights holder to attend a meeting and vote in its
 * name. The proxy can be the chairman of the meeting or another party selected
 * by the issuer. The proxy can also be a third party selected by the rights
 * holder.<br>
 * The proxy can be assigned by a specific instruction or pre-assigned by the
 * issuer of the meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssignedProxyRole" src="doc-files/AssignedProxyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.MeetingPartyRole
 * MeetingPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmProxyPerson
 * AssignedProxyRole.mmProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmPreAssignedProxyRole
 * AssignedProxyRole.mmPreAssignedProxyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmRelatedRole
 * Person.mmRelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPreAssignedProxyPerson
 * Person.mmPreAssignedProxyPerson}</li>
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
 * "AssignedProxyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party appointed by the rights holder to attend a meeting and vote in its name. The proxy can be the chairman of the meeting or another party selected by the issuer. The proxy can also be a third party selected by the rights holder.\r\nThe proxy can be assigned by a specific instruction or pre-assigned by the issuer of the meeting."
 * </li>
 * </ul>
 */
public class AssignedProxyRole extends MeetingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Person> proxyPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmRelatedRole
	 * Person.mmRelatedRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the person who is the assigned proxy for a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AssignedProxyRole, List<Person>> mmProxyPerson = new MMBusinessAssociationEnd<AssignedProxyRole, List<Person>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyPerson";
			definition = "Specifies the person who is the assigned proxy for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> Person.mmRelatedRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}

		@Override
		public List<Person> getValue(AssignedProxyRole obj) {
			return obj.getProxyPerson();
		}

		@Override
		public void setValue(AssignedProxyRole obj, List<Person> value) {
			obj.setProxyPerson(value);
		}
	};
	protected List<Person> preAssignedProxyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPreAssignedProxyPerson
	 * Person.mmPreAssignedProxyPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAssignedProxyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a proxy that has been assigned by the issuer of the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AssignedProxyRole, List<Person>> mmPreAssignedProxyRole = new MMBusinessAssociationEnd<AssignedProxyRole, List<Person>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyRole";
			definition = "Identifies a proxy that has been assigned by the issuer of the meeting.";
			minOccurs = 0;
			opposite_lazy = () -> Person.mmPreAssignedProxyPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}

		@Override
		public List<Person> getValue(AssignedProxyRole obj) {
			return obj.getPreAssignedProxyRole();
		}

		@Override
		public void setValue(AssignedProxyRole obj, List<Person> value) {
			obj.setPreAssignedProxyRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssignedProxyRole";
				definition = "Party appointed by the rights holder to attend a meeting and vote in its name. The proxy can be the chairman of the meeting or another party selected by the issuer. The proxy can also be a third party selected by the rights holder.\r\nThe proxy can be assigned by a specific instruction or pre-assigned by the issuer of the meeting.";
				associationDomain_lazy = () -> Arrays.asList(Person.mmRelatedRole, Person.mmPreAssignedProxyPerson);
				superType_lazy = () -> MeetingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssignedProxyRole.mmProxyPerson, com.tools20022.repository.entity.AssignedProxyRole.mmPreAssignedProxyRole);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssignedProxyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Person> getProxyPerson() {
		return proxyPerson == null ? proxyPerson = new ArrayList<>() : proxyPerson;
	}

	public AssignedProxyRole setProxyPerson(List<Person> proxyPerson) {
		this.proxyPerson = Objects.requireNonNull(proxyPerson);
		return this;
	}

	public List<Person> getPreAssignedProxyRole() {
		return preAssignedProxyRole == null ? preAssignedProxyRole = new ArrayList<>() : preAssignedProxyRole;
	}

	public AssignedProxyRole setPreAssignedProxyRole(List<Person> preAssignedProxyRole) {
		this.preAssignedProxyRole = Objects.requireNonNull(preAssignedProxyRole);
		return this;
	}
}