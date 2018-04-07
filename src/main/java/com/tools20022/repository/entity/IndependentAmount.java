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
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Amount applied as an add-on to the exposure usually intended to cover a
 * possible increase in exposure before the next valuation date.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IndependentAmount" src="doc-files/IndependentAmount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmRelatedRiskCalculation
 * IndependentAmount.mmRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountPerTrade
 * IndependentAmount.mmIndependentAmountPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountValueAtRisk
 * IndependentAmount.mmIndependentAmountValueAtRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountNetOpenPosition
 * IndependentAmount.mmIndependentAmountNetOpenPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentIndependentAmount
 * ExposureCalculation.mmCurrentIndependentAmount}</li>
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
 * "IndependentAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date."
 * </li>
 * </ul>
 */
public class IndependentAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExposureCalculation relatedRiskCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentIndependentAmount
	 * ExposureCalculation.mmCurrentIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk coverage for which an independent amount is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<IndependentAmount, Optional<ExposureCalculation>> mmRelatedRiskCalculation = new MMBusinessAssociationEnd<IndependentAmount, Optional<ExposureCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRiskCalculation";
			definition = "Risk coverage for which an independent amount is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ExposureCalculation.mmCurrentIndependentAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}

		@Override
		public Optional<ExposureCalculation> getValue(IndependentAmount obj) {
			return obj.getRelatedRiskCalculation();
		}

		@Override
		public void setValue(IndependentAmount obj, Optional<ExposureCalculation> value) {
			obj.setRelatedRiskCalculation(value.orElse(null));
		}
	};
	protected CurrencyAndAmount independentAmountPerTrade;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent amounts that are related to specific trades or groups of trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IndependentAmount, CurrencyAndAmount> mmIndependentAmountPerTrade = new MMBusinessAttribute<IndependentAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountPerTrade";
			definition = "Independent amounts that are related to specific trades or groups of trades.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(IndependentAmount obj) {
			return obj.getIndependentAmountPerTrade();
		}

		@Override
		public void setValue(IndependentAmount obj, CurrencyAndAmount value) {
			obj.setIndependentAmountPerTrade(value);
		}
	};
	protected CurrencyAndAmount independentAmountValueAtRisk;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountValueAtRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount which reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IndependentAmount, CurrencyAndAmount> mmIndependentAmountValueAtRisk = new MMBusinessAttribute<IndependentAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountValueAtRisk";
			definition = "Portfolio level independent amount which reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(IndependentAmount obj) {
			return obj.getIndependentAmountValueAtRisk();
		}

		@Override
		public void setValue(IndependentAmount obj, CurrencyAndAmount value) {
			obj.setIndependentAmountValueAtRisk(value);
		}
	};
	protected CurrencyAndAmount independentAmountNetOpenPosition;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountNetOpenPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount related to FX net open position, i.e. to the difference between assets and liabilities in a particular currency. This may be measured on a per currency basis or the position of all currencies when calculated in base currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IndependentAmount, CurrencyAndAmount> mmIndependentAmountNetOpenPosition = new MMBusinessAttribute<IndependentAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountNetOpenPosition";
			definition = "Portfolio level independent amount related to FX net open position, i.e. to the difference between assets and liabilities in a particular currency. This may be measured on a per currency basis or the position of all currencies when calculated in base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(IndependentAmount obj) {
			return obj.getIndependentAmountNetOpenPosition();
		}

		@Override
		public void setValue(IndependentAmount obj, CurrencyAndAmount value) {
			obj.setIndependentAmountNetOpenPosition(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndependentAmount";
				definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
				associationDomain_lazy = () -> Arrays.asList(ExposureCalculation.mmCurrentIndependentAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndependentAmount.mmRelatedRiskCalculation, com.tools20022.repository.entity.IndependentAmount.mmIndependentAmountPerTrade,
						com.tools20022.repository.entity.IndependentAmount.mmIndependentAmountValueAtRisk, com.tools20022.repository.entity.IndependentAmount.mmIndependentAmountNetOpenPosition);
			}

			@Override
			public Class<?> getInstanceClass() {
				return IndependentAmount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExposureCalculation> getRelatedRiskCalculation() {
		return relatedRiskCalculation == null ? Optional.empty() : Optional.of(relatedRiskCalculation);
	}

	public IndependentAmount setRelatedRiskCalculation(ExposureCalculation relatedRiskCalculation) {
		this.relatedRiskCalculation = relatedRiskCalculation;
		return this;
	}

	public CurrencyAndAmount getIndependentAmountPerTrade() {
		return independentAmountPerTrade;
	}

	public IndependentAmount setIndependentAmountPerTrade(CurrencyAndAmount independentAmountPerTrade) {
		this.independentAmountPerTrade = Objects.requireNonNull(independentAmountPerTrade);
		return this;
	}

	public CurrencyAndAmount getIndependentAmountValueAtRisk() {
		return independentAmountValueAtRisk;
	}

	public IndependentAmount setIndependentAmountValueAtRisk(CurrencyAndAmount independentAmountValueAtRisk) {
		this.independentAmountValueAtRisk = Objects.requireNonNull(independentAmountValueAtRisk);
		return this;
	}

	public CurrencyAndAmount getIndependentAmountNetOpenPosition() {
		return independentAmountNetOpenPosition;
	}

	public IndependentAmount setIndependentAmountNetOpenPosition(CurrencyAndAmount independentAmountNetOpenPosition) {
		this.independentAmountNetOpenPosition = Objects.requireNonNull(independentAmountNetOpenPosition);
		return this;
	}
}