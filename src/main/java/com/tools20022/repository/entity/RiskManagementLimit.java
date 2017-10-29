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
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the maximum risk that a party accepts to
 * take with respect to a counterparty or a set of counterparties. A risk
 * management limit is either bilateral, for a counterparty, or multilateral,
 * for a set of counterparties or all other members in a system.The limit may
 * also apply to sponsored or indirect members. In principle, a risk management
 * limit is calculated on the net position between two members and is expressed
 * as a credit or debit limit, from the point of view of the party setting the
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RiskManagementLimit" src="doc-files/RiskManagementLimit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#CashManagementService
 * RiskManagementLimit.CashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#Counterparty
 * RiskManagementLimit.Counterparty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Limit
 * SystemMemberRole.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#RiskManagementLimit
 * CashManagementService.RiskManagementLimit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "RiskManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
 * </li>
 * </ul>
 */
public class RiskManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash management service which offers limit management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#RiskManagementLimit
	 * CashManagementService.RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management service which offers limit management services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashManagementService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Cash management service which offers limit management services.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.RiskManagementLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the system member for which the limit is established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#Limit
	 * SystemMemberRole.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Identification of the system member for which the limit is established.";
			minOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RiskManagementLimit";
				definition = "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.Limit, com.tools20022.repository.entity.CashManagementService.RiskManagementLimit);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.CashManagementService, com.tools20022.repository.entity.RiskManagementLimit.Counterparty);
			}
		});
		return mmObject_lazy.get();
	}
}