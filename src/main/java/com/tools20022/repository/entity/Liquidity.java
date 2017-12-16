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
import com.tools20022.repository.codeset.LiquidityIndicatorTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ability of a financial instrument to be easily traded and converted to cash,
 * at conditions that do not affect its price.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Liquidity" src="doc-files/Liquidity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmQuantity
 * Liquidity.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmListTrading
 * Liquidity.mmListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmIndicatorType
 * Liquidity.mmIndicatorType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmUpper
 * Liquidity.mmUpper}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmLower
 * Liquidity.mmLower}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmValue
 * Liquidity.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Liquidity#mmWeightedAverageLiquidity
 * Liquidity.mmWeightedAverageLiquidity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLiquidity
 * SecuritiesQuantity.mmLiquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
 * ListTrading.mmLiquidity}</li>
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
 * "Liquidity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price."
 * </li>
 * </ul>
 */
public class Liquidity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity quantity;
	/**
	 * Quantity of a financial instrument for which liquidity range details are
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLiquidity
	 * SecuritiesQuantity.mmLiquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a financial instrument for which liquidity range details are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a financial instrument for which liquidity range details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmLiquidity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ListTrading listTrading;
	/**
	 * List trading process for which liquidity data is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
	 * ListTrading.mmLiquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ListTrading
	 * ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "List trading process for which liquidity data is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which liquidity data is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.mmLiquidity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};
	protected LiquidityIndicatorTypeCode indicatorType;
	/**
	 * Type of liquidity measure, of a financial instrument, on a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicatorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of liquidity measure, of a financial instrument, on a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndicatorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicatorType";
			definition = "Type of liquidity measure, of a financial instrument, on a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Liquidity.class.getMethod("getIndicatorType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate upper;
	/**
	 * Upper liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Upper liquidity indicator, represented as a percentage of the average trade daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUpper = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Upper";
			definition = "Upper liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Liquidity.class.getMethod("getUpper", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate lower;
	/**
	 * Lower liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lower liquidity indicator, represented as a percentage of the average trade daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLower = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lower";
			definition = "Lower liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Liquidity.class.getMethod("getLower", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount value;
	/**
	 * Market value of the securities position for which liquidity details are
	 * provided.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market value of the securities position for which liquidity details are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Market value of the securities position for which liquidity details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Liquidity.class.getMethod("getValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate weightedAverageLiquidity;
	/**
	 * Indicates the overall weighted average liquidity expressed as a
	 * percentage of average daily volume.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Liquidity
	 * Liquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLiquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWeightedAverageLiquidity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLiquidity";
			definition = "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Liquidity.class.getMethod("getWeightedAverageLiquidity", new Class[]{});
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
				name = "Liquidity";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmLiquidity, com.tools20022.repository.entity.ListTrading.mmLiquidity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Liquidity.mmQuantity, com.tools20022.repository.entity.Liquidity.mmListTrading, com.tools20022.repository.entity.Liquidity.mmIndicatorType,
						com.tools20022.repository.entity.Liquidity.mmUpper, com.tools20022.repository.entity.Liquidity.mmLower, com.tools20022.repository.entity.Liquidity.mmValue,
						com.tools20022.repository.entity.Liquidity.mmWeightedAverageLiquidity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Liquidity.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getQuantity() {
		return quantity;
	}

	public void setQuantity(com.tools20022.repository.entity.SecuritiesQuantity quantity) {
		this.quantity = quantity;
	}

	public ListTrading getListTrading() {
		return listTrading;
	}

	public void setListTrading(com.tools20022.repository.entity.ListTrading listTrading) {
		this.listTrading = listTrading;
	}

	public LiquidityIndicatorTypeCode getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(LiquidityIndicatorTypeCode indicatorType) {
		this.indicatorType = indicatorType;
	}

	public PercentageRate getUpper() {
		return upper;
	}

	public void setUpper(PercentageRate upper) {
		this.upper = upper;
	}

	public PercentageRate getLower() {
		return lower;
	}

	public void setLower(PercentageRate lower) {
		this.lower = lower;
	}

	public CurrencyAndAmount getValue() {
		return value;
	}

	public void setValue(CurrencyAndAmount value) {
		this.value = value;
	}

	public PercentageRate getWeightedAverageLiquidity() {
		return weightedAverageLiquidity;
	}

	public void setWeightedAverageLiquidity(PercentageRate weightedAverageLiquidity) {
		this.weightedAverageLiquidity = weightedAverageLiquidity;
	}
}