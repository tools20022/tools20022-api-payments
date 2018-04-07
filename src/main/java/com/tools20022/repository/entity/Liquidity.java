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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.LiquidityIndicatorTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Liquidity, SecuritiesQuantity> mmQuantity = new MMBusinessAssociationEnd<Liquidity, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a financial instrument for which liquidity range details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmLiquidity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Liquidity obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Liquidity obj, SecuritiesQuantity value) {
			obj.setQuantity(value);
		}
	};
	protected ListTrading listTrading;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Liquidity, ListTrading> mmListTrading = new MMBusinessAssociationEnd<Liquidity, ListTrading>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which liquidity data is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ListTrading.mmLiquidity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ListTrading.mmObject();
		}

		@Override
		public ListTrading getValue(Liquidity obj) {
			return obj.getListTrading();
		}

		@Override
		public void setValue(Liquidity obj, ListTrading value) {
			obj.setListTrading(value);
		}
	};
	protected LiquidityIndicatorTypeCode indicatorType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 409</li>
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
	public static final MMBusinessAttribute<Liquidity, LiquidityIndicatorTypeCode> mmIndicatorType = new MMBusinessAttribute<Liquidity, LiquidityIndicatorTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "409"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicatorType";
			definition = "Type of liquidity measure, of a financial instrument, on a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
		}

		@Override
		public LiquidityIndicatorTypeCode getValue(Liquidity obj) {
			return obj.getIndicatorType();
		}

		@Override
		public void setValue(Liquidity obj, LiquidityIndicatorTypeCode value) {
			obj.setIndicatorType(value);
		}
	};
	protected PercentageRate upper;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 403</li>
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
	public static final MMBusinessAttribute<Liquidity, PercentageRate> mmUpper = new MMBusinessAttribute<Liquidity, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "403"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Upper";
			definition = "Upper liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Liquidity obj) {
			return obj.getUpper();
		}

		@Override
		public void setValue(Liquidity obj, PercentageRate value) {
			obj.setUpper(value);
		}
	};
	protected PercentageRate lower;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 402</li>
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
	public static final MMBusinessAttribute<Liquidity, PercentageRate> mmLower = new MMBusinessAttribute<Liquidity, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "402"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lower";
			definition = "Lower liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Liquidity obj) {
			return obj.getLower();
		}

		@Override
		public void setValue(Liquidity obj, PercentageRate value) {
			obj.setLower(value);
		}
	};
	protected CurrencyAndAmount value;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 404</li>
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
	public static final MMBusinessAttribute<Liquidity, CurrencyAndAmount> mmValue = new MMBusinessAttribute<Liquidity, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "404"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Market value of the securities position for which liquidity details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Liquidity obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(Liquidity obj, CurrencyAndAmount value) {
			obj.setValue(value);
		}
	};
	protected PercentageRate weightedAverageLiquidity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 410</li>
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
	public static final MMBusinessAttribute<Liquidity, PercentageRate> mmWeightedAverageLiquidity = new MMBusinessAttribute<Liquidity, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "410"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLiquidity";
			definition = "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Liquidity obj) {
			return obj.getWeightedAverageLiquidity();
		}

		@Override
		public void setValue(Liquidity obj, PercentageRate value) {
			obj.setWeightedAverageLiquidity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Liquidity";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesQuantity.mmLiquidity, ListTrading.mmLiquidity);
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

	public Liquidity setQuantity(SecuritiesQuantity quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public ListTrading getListTrading() {
		return listTrading;
	}

	public Liquidity setListTrading(ListTrading listTrading) {
		this.listTrading = Objects.requireNonNull(listTrading);
		return this;
	}

	public LiquidityIndicatorTypeCode getIndicatorType() {
		return indicatorType;
	}

	public Liquidity setIndicatorType(LiquidityIndicatorTypeCode indicatorType) {
		this.indicatorType = Objects.requireNonNull(indicatorType);
		return this;
	}

	public PercentageRate getUpper() {
		return upper;
	}

	public Liquidity setUpper(PercentageRate upper) {
		this.upper = Objects.requireNonNull(upper);
		return this;
	}

	public PercentageRate getLower() {
		return lower;
	}

	public Liquidity setLower(PercentageRate lower) {
		this.lower = Objects.requireNonNull(lower);
		return this;
	}

	public CurrencyAndAmount getValue() {
		return value;
	}

	public Liquidity setValue(CurrencyAndAmount value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public PercentageRate getWeightedAverageLiquidity() {
		return weightedAverageLiquidity;
	}

	public Liquidity setWeightedAverageLiquidity(PercentageRate weightedAverageLiquidity) {
		this.weightedAverageLiquidity = Objects.requireNonNull(weightedAverageLiquidity);
		return this;
	}
}