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
import com.tools20022.repository.codeset.MemberTypeCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about the members of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemMemberRole" src="doc-files/SystemMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#CashBalance
 * SystemMemberRole.CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Type
 * SystemMemberRole.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#MemberStatus
 * SystemMemberRole.MemberStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Limit
 * SystemMemberRole.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Account
 * SystemMemberRole.Account}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SystemMember
 * Account.SystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#Counterparty
 * RiskManagementLimit.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Counterparty
 * CashBalance.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemStatus#SystemMemberRole
 * SystemStatus.SystemMemberRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "SystemMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the members of a system."</li>
 * </ul>
 */
public class SystemMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash balance for which a counterparty is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#Counterparty
	 * CashBalance.Counterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash balance for which a counterparty is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash balance for which a counterparty is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.Counterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Nature of the relationship a member has with a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the relationship a member has with a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MemberTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#SystemMemberRole
	 * SystemStatus.SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemStatus
	 * SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a member."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MemberStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Specifies the status of a member.";
			minOccurs = 0;
			type_lazy = () -> SystemStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.SystemMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash management feature limiting the maximum risk a party accepts to take
	 * with respect to a counterparty or a set of counterparties. A risk
	 * management limit is either bilateral, ie, for a counterparty, or
	 * multilateral, ie, for a set of counterparties or all other members in a
	 * system.The limit may also apply to sponsored members, ie, indirect
	 * members. In principle, a risk management limit is calculated on the net
	 * position between two members and is expressed as a credit or debit limit,
	 * from the point of view of the party setting the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#Counterparty
	 * RiskManagementLimit.Counterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Limit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RiskManagementLimit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.Counterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account owned by the member of a system with the system.<br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#SystemMember
	 * Account.SystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SystemMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemMemberRole";
				definition = "Information about the members of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.SystemMember, com.tools20022.repository.entity.RiskManagementLimit.Counterparty,
						com.tools20022.repository.entity.CashBalance.Counterparty, com.tools20022.repository.entity.SystemStatus.SystemMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.CashBalance, com.tools20022.repository.entity.SystemMemberRole.Type, com.tools20022.repository.entity.SystemMemberRole.MemberStatus,
						com.tools20022.repository.entity.SystemMemberRole.Limit, com.tools20022.repository.entity.SystemMemberRole.Account);
			}
		});
		return mmObject_lazy.get();
	}
}