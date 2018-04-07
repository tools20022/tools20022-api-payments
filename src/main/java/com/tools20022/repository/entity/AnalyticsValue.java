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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AnalyticsCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Value given to a price analytic.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AnalyticsValue" src="doc-files/AnalyticsValue.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AnalyticsValue#mmAmount
 * AnalyticsValue.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AnalyticsValue#mmRate
 * AnalyticsValue.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsValue#mmNumberOfYears
 * AnalyticsValue.mmNumberOfYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsValue#mmAnalyticsCalculation
 * AnalyticsValue.mmAnalyticsCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmValue
 * AnalyticsCalculation.mmValue}</li>
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
 * "AnalyticsValue"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Value given to a price analytic."</li>
 * </ul>
 */
public class AnalyticsValue {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsValue
	 * AnalyticsValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analytics expressed as a currency and value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AnalyticsValue, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<AnalyticsValue, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Analytics expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AnalyticsValue obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(AnalyticsValue obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected PercentageRate rate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsValue
	 * AnalyticsValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analytics expressed as a rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AnalyticsValue, PercentageRate> mmRate = new MMBusinessAttribute<AnalyticsValue, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Analytics expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(AnalyticsValue obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(AnalyticsValue obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected Number numberOfYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsValue
	 * AnalyticsValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analytics expressed as a number of years."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AnalyticsValue, Number> mmNumberOfYears = new MMBusinessAttribute<AnalyticsValue, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfYears";
			definition = "Analytics expressed as a number of years.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(AnalyticsValue obj) {
			return obj.getNumberOfYears();
		}

		@Override
		public void setValue(AnalyticsValue obj, Number value) {
			obj.setNumberOfYears(value);
		}
	};
	protected AnalyticsCalculation analyticsCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmValue
	 * AnalyticsCalculation.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsValue
	 * AnalyticsValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnalyticsCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Analytics calculation for which an analytics value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AnalyticsValue, AnalyticsCalculation> mmAnalyticsCalculation = new MMBusinessAssociationEnd<AnalyticsValue, AnalyticsCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Analytics calculation for which an analytics value is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AnalyticsCalculation.mmValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AnalyticsCalculation.mmObject();
		}

		@Override
		public AnalyticsCalculation getValue(AnalyticsValue obj) {
			return obj.getAnalyticsCalculation();
		}

		@Override
		public void setValue(AnalyticsValue obj, AnalyticsCalculation value) {
			obj.setAnalyticsCalculation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AnalyticsValue";
				definition = "Value given to a price analytic.";
				associationDomain_lazy = () -> Arrays.asList(AnalyticsCalculation.mmValue);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AnalyticsValue.mmAmount, com.tools20022.repository.entity.AnalyticsValue.mmRate, com.tools20022.repository.entity.AnalyticsValue.mmNumberOfYears,
						com.tools20022.repository.entity.AnalyticsValue.mmAnalyticsCalculation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AnalyticsValue.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public AnalyticsValue setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public AnalyticsValue setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Number getNumberOfYears() {
		return numberOfYears;
	}

	public AnalyticsValue setNumberOfYears(Number numberOfYears) {
		this.numberOfYears = Objects.requireNonNull(numberOfYears);
		return this;
	}

	public AnalyticsCalculation getAnalyticsCalculation() {
		return analyticsCalculation;
	}

	public AnalyticsValue setAnalyticsCalculation(AnalyticsCalculation analyticsCalculation) {
		this.analyticsCalculation = Objects.requireNonNull(analyticsCalculation);
		return this;
	}
}