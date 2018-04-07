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
import com.tools20022.repository.entity.CashManagementService;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCashManagementService
 * RiskManagementLimit.mmCashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCounterparty
 * RiskManagementLimit.mmCounterparty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmLimit
 * SystemMemberRole.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
 * CashManagementService.mmRiskManagementLimit}</li>
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
 * "RiskManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
 * </li>
 * </ul>
 */
public class RiskManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashManagementService cashManagementService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
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
	public static final MMBusinessAssociationEnd<RiskManagementLimit, Optional<CashManagementService>> mmCashManagementService = new MMBusinessAssociationEnd<RiskManagementLimit, Optional<CashManagementService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Cash management service which offers limit management services.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}

		@Override
		public Optional<CashManagementService> getValue(RiskManagementLimit obj) {
			return obj.getCashManagementService();
		}

		@Override
		public void setValue(RiskManagementLimit obj, Optional<CashManagementService> value) {
			obj.setCashManagementService(value.orElse(null));
		}
	};
	protected List<SystemMemberRole> counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmLimit
	 * SystemMemberRole.mmLimit}</li>
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
	public static final MMBusinessAssociationEnd<RiskManagementLimit, List<SystemMemberRole>> mmCounterparty = new MMBusinessAssociationEnd<RiskManagementLimit, List<SystemMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Identification of the system member for which the limit is established.";
			minOccurs = 1;
			opposite_lazy = () -> SystemMemberRole.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}

		@Override
		public List<SystemMemberRole> getValue(RiskManagementLimit obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(RiskManagementLimit obj, List<SystemMemberRole> value) {
			obj.setCounterparty(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RiskManagementLimit";
				definition = "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
				associationDomain_lazy = () -> Arrays.asList(SystemMemberRole.mmLimit, com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.mmCashManagementService, com.tools20022.repository.entity.RiskManagementLimit.mmCounterparty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RiskManagementLimit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CashManagementService> getCashManagementService() {
		return cashManagementService == null ? Optional.empty() : Optional.of(cashManagementService);
	}

	public RiskManagementLimit setCashManagementService(com.tools20022.repository.entity.CashManagementService cashManagementService) {
		this.cashManagementService = cashManagementService;
		return this;
	}

	public List<SystemMemberRole> getCounterparty() {
		return counterparty == null ? counterparty = new ArrayList<>() : counterparty;
	}

	public RiskManagementLimit setCounterparty(List<SystemMemberRole> counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}
}