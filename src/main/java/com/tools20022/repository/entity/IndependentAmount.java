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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	 * Risk coverage for which an independent amount is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRiskCalculation";
			definition = "Risk coverage for which an independent amount is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmCurrentIndependentAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount independentAmountPerTrade;
	/**
	 * Independent amounts that are related to specific trades or groups of
	 * trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
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
	 * name} = "IndependentAmountPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent amounts that are related to specific trades or groups of trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndependentAmountPerTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPerTrade";
			definition = "Independent amounts that are related to specific trades or groups of trades.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IndependentAmount.class.getMethod("getIndependentAmountPerTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount independentAmountValueAtRisk;
	/**
	 * Portfolio level independent amount which reflects portfolio change over a
	 * short time period using statistical techniques such as volatility and
	 * risk factor correlations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
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
	 * name} = "IndependentAmountValueAtRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount which reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndependentAmountValueAtRisk = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountValueAtRisk";
			definition = "Portfolio level independent amount which reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IndependentAmount.class.getMethod("getIndependentAmountValueAtRisk", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount independentAmountNetOpenPosition;
	/**
	 * Portfolio level independent amount related to FX net open position, i.e.
	 * to the difference between assets and liabilities in a particular
	 * currency. This may be measured on a per currency basis or the position of
	 * all currencies when calculated in base currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
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
	 * name} = "IndependentAmountNetOpenPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount related to FX net open position, i.e. to the difference between assets and liabilities in a particular currency. This may be measured on a per currency basis or the position of all currencies when calculated in base currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndependentAmountNetOpenPosition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountNetOpenPosition";
			definition = "Portfolio level independent amount related to FX net open position, i.e. to the difference between assets and liabilities in a particular currency. This may be measured on a per currency basis or the position of all currencies when calculated in base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IndependentAmount.class.getMethod("getIndependentAmountNetOpenPosition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndependentAmount";
				definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.mmCurrentIndependentAmount);
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

	public ExposureCalculation getRelatedRiskCalculation() {
		return relatedRiskCalculation;
	}

	public void setRelatedRiskCalculation(com.tools20022.repository.entity.ExposureCalculation relatedRiskCalculation) {
		this.relatedRiskCalculation = relatedRiskCalculation;
	}

	public ActiveCurrencyAndAmount getIndependentAmountPerTrade() {
		return independentAmountPerTrade;
	}

	public void setIndependentAmountPerTrade(ActiveCurrencyAndAmount independentAmountPerTrade) {
		this.independentAmountPerTrade = independentAmountPerTrade;
	}

	public ActiveCurrencyAndAmount getIndependentAmountValueAtRisk() {
		return independentAmountValueAtRisk;
	}

	public void setIndependentAmountValueAtRisk(ActiveCurrencyAndAmount independentAmountValueAtRisk) {
		this.independentAmountValueAtRisk = independentAmountValueAtRisk;
	}

	public ActiveCurrencyAndAmount getIndependentAmountNetOpenPosition() {
		return independentAmountNetOpenPosition;
	}

	public void setIndependentAmountNetOpenPosition(ActiveCurrencyAndAmount independentAmountNetOpenPosition) {
		this.independentAmountNetOpenPosition = independentAmountNetOpenPosition;
	}
}