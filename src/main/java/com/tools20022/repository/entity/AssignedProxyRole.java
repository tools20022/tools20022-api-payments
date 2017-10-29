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
import com.tools20022.repository.entity.MeetingPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#ProxyPerson
 * AssignedProxyRole.ProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#PreAssignedProxyRole
 * AssignedProxyRole.PreAssignedProxyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#RelatedRole
 * Person.RelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#PreAssignedProxyPerson
 * Person.PreAssignedProxyPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.MeetingPartyRole
 * MeetingPartyRole}</li>
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
	/**
	 * Specifies the person who is the assigned proxy for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#RelatedRole
	 * Person.RelatedRole}</li>
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
	public static final MMBusinessAssociationEnd ProxyPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssignedProxyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyPerson";
			definition = "Specifies the person who is the assigned proxy for a meeting.";
			minOccurs = 0;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.RelatedRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies a proxy that has been assigned by the issuer of the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#PreAssignedProxyPerson
	 * Person.PreAssignedProxyPerson}</li>
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
	public static final MMBusinessAssociationEnd PreAssignedProxyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssignedProxyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyRole";
			definition = "Identifies a proxy that has been assigned by the issuer of the meeting.";
			minOccurs = 0;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PreAssignedProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssignedProxyRole";
				definition = "Party appointed by the rights holder to attend a meeting and vote in its name. The proxy can be the chairman of the meeting or another party selected by the issuer. The proxy can also be a third party selected by the rights holder.\r\nThe proxy can be assigned by a specific instruction or pre-assigned by the issuer of the meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.RelatedRole, com.tools20022.repository.entity.Person.PreAssignedProxyPerson);
				superType_lazy = () -> MeetingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson, com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole);
			}
		});
		return mmObject_lazy.get();
	}
}