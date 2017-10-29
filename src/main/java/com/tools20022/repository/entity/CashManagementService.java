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
import com.tools20022.repository.codeset.CallInCode;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#RiskManagementLimit
 * CashManagementService.RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#StandingOrder
 * CashManagementService.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#RelatedTransactionAdministrator
 * CashManagementService.RelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#LiquidityManagementLimit
 * CashManagementService.LiquidityManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#CallInType
 * CashManagementService.CallInType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#CashManagementService
 * RiskManagementLimit.CashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashManagementService
 * TransactionAdministrator.CashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#RelatedCashServices
 * CashStandingOrder.RelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#RelatedCashServices
 * LiquidityManagementLimit.RelatedCashServices}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
	/**
	 * Maximum amount value applied to or by a party versus a specific
	 * counterparty or a set of counterparts. The limit can be expressed as a
	 * debit limit or a credit limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#CashManagementService
	 * RiskManagementLimit.CashManagementService}</li>
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
	public static final MMBusinessAssociationEnd RiskManagementLimit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashManagementService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskManagementLimit";
			definition = "Maximum amount value applied to or by a party versus a specific counterparty or a set of counterparts. The limit can be expressed as a debit limit or a credit limit.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.CashManagementService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies standing orders that must be executed in the context of cash
	 * management. This service may be offered by a transaction administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#RelatedCashServices
	 * CashStandingOrder.RelatedCashServices}</li>
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
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashManagementService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Specifies standing orders that must be executed in the context of cash management. This service may be offered by a transaction administrator.";
			minOccurs = 0;
			type_lazy = () -> CashStandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.RelatedCashServices;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction administrator of a cash management service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashManagementService
	 * TransactionAdministrator.CashManagementService}</li>
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
	public static final MMBusinessAssociationEnd RelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashManagementService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator of a cash management service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CashManagementService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash management feature limiting the amount of liquidity needed to
	 * perform clearing and settlement operations. At any point in time during
	 * the process, the limit imposes the maximum amount of liquidity available
	 * for operations concerning the system or other managed elements, eg,
	 * transaction amount or counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#RelatedCashServices
	 * LiquidityManagementLimit.RelatedCashServices}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionType1#FloorLimit
	 * TransactionType1.FloorLimit}</li>
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
	public static final MMBusinessAssociationEnd LiquidityManagementLimit = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionType1.FloorLimit);
			elementContext_lazy = () -> CashManagementService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityManagementLimit";
			definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of call when additional funding from a settlement member is
	 * requested by a central settlement system.
	 * <p>
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
	public static final MMBusinessAttribute CallInType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashManagementService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallInType";
			definition = "Type of call when additional funding from a settlement member is requested by a central settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CallInCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashManagementService";
				definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.CashManagementService, com.tools20022.repository.entity.TransactionAdministrator.CashManagementService,
						com.tools20022.repository.entity.CashStandingOrder.RelatedCashServices, com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.RiskManagementLimit, com.tools20022.repository.entity.CashManagementService.StandingOrder,
						com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator, com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit,
						com.tools20022.repository.entity.CashManagementService.CallInType);
			}
		});
		return mmObject_lazy.get();
	}
}