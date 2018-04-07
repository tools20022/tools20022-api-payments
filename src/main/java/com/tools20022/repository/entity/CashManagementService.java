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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CallInCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionType2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of applications that provides services which facilitate the management of
 * cash positions on an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashManagementService"
 * src="doc-files/CashManagementService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
 * CashManagementService.mmRiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmStandingOrder
 * CashManagementService.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRelatedTransactionAdministrator
 * CashManagementService.mmRelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmLiquidityManagementLimit
 * CashManagementService.mmLiquidityManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmCallInType
 * CashManagementService.mmCallInType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCashManagementService
 * RiskManagementLimit.mmCashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashManagementService
 * TransactionAdministrator.mmCashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmRelatedCashServices
 * CashStandingOrder.mmRelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmRelatedCashServices
 * LiquidityManagementLimit.mmRelatedCashServices}</li>
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
 * "CashManagementService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of applications that provides services which facilitate the management of cash positions on an account."
 * </li>
 * </ul>
 */
public class CashManagementService extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.RiskManagementLimit> riskManagementLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCashManagementService
	 * RiskManagementLimit.mmCashManagementService}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskManagementLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount value applied to or by a party versus a specific counterparty or a set of counterparts. The limit can be expressed as a debit limit or a credit limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashManagementService, List<RiskManagementLimit>> mmRiskManagementLimit = new MMBusinessAssociationEnd<CashManagementService, List<RiskManagementLimit>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskManagementLimit";
			definition = "Maximum amount value applied to or by a party versus a specific counterparty or a set of counterparts. The limit can be expressed as a debit limit or a credit limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmCashManagementService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
		}

		@Override
		public List<RiskManagementLimit> getValue(CashManagementService obj) {
			return obj.getRiskManagementLimit();
		}

		@Override
		public void setValue(CashManagementService obj, List<RiskManagementLimit> value) {
			obj.setRiskManagementLimit(value);
		}
	};
	protected List<CashStandingOrder> standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmRelatedCashServices
	 * CashStandingOrder.mmRelatedCashServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies standing orders that must be executed in the context of cash management. This service may be offered by a transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashManagementService, List<CashStandingOrder>> mmStandingOrder = new MMBusinessAssociationEnd<CashManagementService, List<CashStandingOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Specifies standing orders that must be executed in the context of cash management. This service may be offered by a transaction administrator.";
			minOccurs = 0;
			opposite_lazy = () -> CashStandingOrder.mmRelatedCashServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashStandingOrder.mmObject();
		}

		@Override
		public List<CashStandingOrder> getValue(CashManagementService obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(CashManagementService obj, List<CashStandingOrder> value) {
			obj.setStandingOrder(value);
		}
	};
	protected TransactionAdministrator relatedTransactionAdministrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashManagementService
	 * TransactionAdministrator.mmCashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction administrator of a cash management service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashManagementService, Optional<TransactionAdministrator>> mmRelatedTransactionAdministrator = new MMBusinessAssociationEnd<CashManagementService, Optional<TransactionAdministrator>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator of a cash management service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TransactionAdministrator.mmCashManagementService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransactionAdministrator.mmObject();
		}

		@Override
		public Optional<TransactionAdministrator> getValue(CashManagementService obj) {
			return obj.getRelatedTransactionAdministrator();
		}

		@Override
		public void setValue(CashManagementService obj, Optional<TransactionAdministrator> value) {
			obj.setRelatedTransactionAdministrator(value.orElse(null));
		}
	};
	protected LiquidityManagementLimit liquidityManagementLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmRelatedCashServices
	 * LiquidityManagementLimit.mmRelatedCashServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionType2#mmFloorLimit
	 * TransactionType2.mmFloorLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityManagementLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashManagementService, Optional<LiquidityManagementLimit>> mmLiquidityManagementLimit = new MMBusinessAssociationEnd<CashManagementService, Optional<LiquidityManagementLimit>>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionType2.mmFloorLimit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityManagementLimit";
			definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmRelatedCashServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
		}

		@Override
		public Optional<LiquidityManagementLimit> getValue(CashManagementService obj) {
			return obj.getLiquidityManagementLimit();
		}

		@Override
		public void setValue(CashManagementService obj, Optional<LiquidityManagementLimit> value) {
			obj.setLiquidityManagementLimit(value.orElse(null));
		}
	};
	protected CallInCode callInType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CallInCode
	 * CallInCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallInType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of call when additional funding from a settlement member is requested by a central settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashManagementService, CallInCode> mmCallInType = new MMBusinessAttribute<CashManagementService, CallInCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallInType";
			definition = "Type of call when additional funding from a settlement member is requested by a central settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CallInCode.mmObject();
		}

		@Override
		public CallInCode getValue(CashManagementService obj) {
			return obj.getCallInType();
		}

		@Override
		public void setValue(CashManagementService obj, CallInCode value) {
			obj.setCallInType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashManagementService";
				definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.mmCashManagementService, TransactionAdministrator.mmCashManagementService, CashStandingOrder.mmRelatedCashServices,
						com.tools20022.repository.entity.LiquidityManagementLimit.mmRelatedCashServices);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit, com.tools20022.repository.entity.CashManagementService.mmStandingOrder,
						com.tools20022.repository.entity.CashManagementService.mmRelatedTransactionAdministrator, com.tools20022.repository.entity.CashManagementService.mmLiquidityManagementLimit,
						com.tools20022.repository.entity.CashManagementService.mmCallInType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashManagementService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<RiskManagementLimit> getRiskManagementLimit() {
		return riskManagementLimit == null ? riskManagementLimit = new ArrayList<>() : riskManagementLimit;
	}

	public CashManagementService setRiskManagementLimit(List<com.tools20022.repository.entity.RiskManagementLimit> riskManagementLimit) {
		this.riskManagementLimit = Objects.requireNonNull(riskManagementLimit);
		return this;
	}

	public List<CashStandingOrder> getStandingOrder() {
		return standingOrder == null ? standingOrder = new ArrayList<>() : standingOrder;
	}

	public CashManagementService setStandingOrder(List<CashStandingOrder> standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}

	public Optional<TransactionAdministrator> getRelatedTransactionAdministrator() {
		return relatedTransactionAdministrator == null ? Optional.empty() : Optional.of(relatedTransactionAdministrator);
	}

	public CashManagementService setRelatedTransactionAdministrator(TransactionAdministrator relatedTransactionAdministrator) {
		this.relatedTransactionAdministrator = relatedTransactionAdministrator;
		return this;
	}

	public Optional<LiquidityManagementLimit> getLiquidityManagementLimit() {
		return liquidityManagementLimit == null ? Optional.empty() : Optional.of(liquidityManagementLimit);
	}

	public CashManagementService setLiquidityManagementLimit(com.tools20022.repository.entity.LiquidityManagementLimit liquidityManagementLimit) {
		this.liquidityManagementLimit = liquidityManagementLimit;
		return this;
	}

	public CallInCode getCallInType() {
		return callInType;
	}

	public CashManagementService setCallInType(CallInCode callInType) {
		this.callInType = Objects.requireNonNull(callInType);
		return this;
	}
}