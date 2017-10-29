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
import com.tools20022.repository.codeset.LiquidityLimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the amount of liquidity needed to perform
 * clearing and settlement operations. At any point in time during the process,
 * the limit imposes the maximum amount of liquidity available for operations
 * concerning the system or other managed elements, for example, transaction
 * amount or counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LiquidityManagementLimit"
 * src="doc-files/LiquidityManagementLimit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#VolatilityMargin
 * LiquidityManagementLimit.VolatilityMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#CurrencyExchange
 * LiquidityManagementLimit.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#RelatedCashServices
 * LiquidityManagementLimit.RelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#LiquidityLimitType
 * LiquidityManagementLimit.LiquidityLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#RequiredAmount
 * LiquidityManagementLimit.RequiredAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#LiquidityManagementLimit
 * CashManagementService.LiquidityManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedLimitManagement
 * CurrencyExchange.RelatedLimitManagement}</li>
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
 * "LiquidityManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, for example, transaction amount or counterparty."
 * </li>
 * </ul>
 */
public class LiquidityManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin used to decrease long positions and increase short positions for
	 * the calculation of the limit usage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin used to decrease long positions and increase short positions for the calculation of the limit usage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VolatilityMargin = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VolatilityMargin";
			definition = "Margin used to decrease long positions and increase short positions for the calculation of the limit usage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Exchange rate used in the calculation of the limit when different
	 * currencies are involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedLimitManagement
	 * CurrencyExchange.RelatedLimitManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate used in the calculation of the limit when different currencies are involved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Exchange rate used in the calculation of the limit when different currencies are involved.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash management services which provide standing liquidity management
	 * facilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#LiquidityManagementLimit
	 * CashManagementService.LiquidityManagementLimit}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management services which provide standing liquidity management facilities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashServices";
			definition = "Cash management services which provide standing liquidity management facilities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashManagementService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of liquidity management limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
	 * LiquidityLimitTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityLimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of liquidity management limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LiquidityLimitType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityLimitType";
			definition = "Type of liquidity management limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LiquidityLimitTypeCode.mmObject();
		}
	};
	/**
	 * Amount required to cover the needs of liquidity management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount required to cover the needs of liquidity management."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequiredAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequiredAmount";
			definition = "Amount required to cover the needs of liquidity management.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LiquidityManagementLimit";
				definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, for example, transaction amount or counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit, com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LiquidityManagementLimit.VolatilityMargin, com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices, com.tools20022.repository.entity.LiquidityManagementLimit.LiquidityLimitType,
						com.tools20022.repository.entity.LiquidityManagementLimit.RequiredAmount);
			}
		});
		return mmObject_lazy.get();
	}
}