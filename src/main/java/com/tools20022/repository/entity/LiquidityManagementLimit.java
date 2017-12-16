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
import com.tools20022.repository.codeset.LiquidityLimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmVolatilityMargin
 * LiquidityManagementLimit.mmVolatilityMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
 * LiquidityManagementLimit.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmRelatedCashServices
 * LiquidityManagementLimit.mmRelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmLiquidityLimitType
 * LiquidityManagementLimit.mmLiquidityLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmRequiredAmount
 * LiquidityManagementLimit.mmRequiredAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmLiquidityManagementLimit
 * CashManagementService.mmLiquidityManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedLimitManagement
 * CurrencyExchange.mmRelatedLimitManagement}</li>
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
 * "LiquidityManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, for example, transaction amount or counterparty."
 * </li>
 * </ul>
 */
public class LiquidityManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate volatilityMargin;
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
	public static final MMBusinessAttribute mmVolatilityMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VolatilityMargin";
			definition = "Margin used to decrease long positions and increase short positions for the calculation of the limit usage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LiquidityManagementLimit.class.getMethod("getVolatilityMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Exchange rate used in the calculation of the limit when different
	 * currencies are involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedLimitManagement
	 * CurrencyExchange.mmRelatedLimitManagement}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Exchange rate used in the calculation of the limit when different currencies are involved.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedLimitManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CashManagementService relatedCashServices;
	/**
	 * Cash management services which provide standing liquidity management
	 * facilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmLiquidityManagementLimit
	 * CashManagementService.mmLiquidityManagementLimit}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCashServices = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashServices";
			definition = "Cash management services which provide standing liquidity management facilities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmLiquidityManagementLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}
	};
	protected LiquidityLimitTypeCode liquidityLimitType;
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
	public static final MMBusinessAttribute mmLiquidityLimitType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityLimitType";
			definition = "Type of liquidity management limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityLimitTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LiquidityManagementLimit.class.getMethod("getLiquidityLimitType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount requiredAmount;
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
	public static final MMBusinessAttribute mmRequiredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequiredAmount";
			definition = "Amount required to cover the needs of liquidity management.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LiquidityManagementLimit.class.getMethod("getRequiredAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityManagementLimit";
				definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, for example, transaction amount or counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.mmLiquidityManagementLimit, com.tools20022.repository.entity.CurrencyExchange.mmRelatedLimitManagement);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LiquidityManagementLimit.mmVolatilityMargin, com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.mmRelatedCashServices, com.tools20022.repository.entity.LiquidityManagementLimit.mmLiquidityLimitType,
						com.tools20022.repository.entity.LiquidityManagementLimit.mmRequiredAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return LiquidityManagementLimit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getVolatilityMargin() {
		return volatilityMargin;
	}

	public void setVolatilityMargin(PercentageRate volatilityMargin) {
		this.volatilityMargin = volatilityMargin;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public CashManagementService getRelatedCashServices() {
		return relatedCashServices;
	}

	public void setRelatedCashServices(com.tools20022.repository.entity.CashManagementService relatedCashServices) {
		this.relatedCashServices = relatedCashServices;
	}

	public LiquidityLimitTypeCode getLiquidityLimitType() {
		return liquidityLimitType;
	}

	public void setLiquidityLimitType(LiquidityLimitTypeCode liquidityLimitType) {
		this.liquidityLimitType = liquidityLimitType;
	}

	public CurrencyAndAmount getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(CurrencyAndAmount requiredAmount) {
		this.requiredAmount = requiredAmount;
	}
}