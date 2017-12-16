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
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the price sensitivity of a fixed-income security to a change
 * in interest rates.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DurationCalculation" src="doc-files/DurationCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmVariableInterest
 * DurationCalculation.mmVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DurationCalculation#mmYears
 * DurationCalculation.mmYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmCalculationType
 * DurationCalculation.mmCalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmValueDate
 * DurationCalculation.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmValuePeriod
 * DurationCalculation.mmValuePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDurationCalculation
 * SecuritiesPricing.mmDurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmDurationCalculation
 * VariableInterest.mmDurationCalculation}</li>
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
 * "DurationCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the price sensitivity of a fixed-income security to a change in interest rates."
 * </li>
 * </ul>
 */
public class DurationCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing relatedSecuritiesPricing;
	/**
	 * Securities pricing for which a duration calculation is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDurationCalculation
	 * SecuritiesPricing.mmDurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities pricing for which a duration calculation is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesPricing";
			definition = "Securities pricing for which a duration calculation is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmDurationCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected VariableInterest variableInterest;
	/**
	 * Variable interest used for the calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmDurationCalculation
	 * VariableInterest.mmDurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest used for the calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest used for the calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmDurationCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected Number years;
	/**
	 * Result of the duration calculation measured in number of years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Years"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the duration calculation measured in number of years."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Years";
			definition = "Result of the duration calculation measured in number of years.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DurationCalculation.class.getMethod("getYears", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CalculationTypeCode calculationType;
	/**
	 * Specifies the type of calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DurationCalculation.class.getMethod("getCalculationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime valueDate;
	/**
	 * Date/time on which the calculation is based, eg, valuation on October 1
	 * (price date) based on price of September 19 ( value date).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, eg, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, eg, valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DurationCalculation.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod valuePeriod;
	/**
	 * Period on which the calculation is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the calculation is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValuePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DurationCalculation.class.getMethod("getValuePeriod", new Class[]{});
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
				name = "DurationCalculation";
				definition = "Calculation of the price sensitivity of a fixed-income security to a change in interest rates.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmDurationCalculation, com.tools20022.repository.entity.VariableInterest.mmDurationCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DurationCalculation.mmRelatedSecuritiesPricing, com.tools20022.repository.entity.DurationCalculation.mmVariableInterest,
						com.tools20022.repository.entity.DurationCalculation.mmYears, com.tools20022.repository.entity.DurationCalculation.mmCalculationType, com.tools20022.repository.entity.DurationCalculation.mmValueDate,
						com.tools20022.repository.entity.DurationCalculation.mmValuePeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DurationCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getRelatedSecuritiesPricing() {
		return relatedSecuritiesPricing;
	}

	public void setRelatedSecuritiesPricing(com.tools20022.repository.entity.SecuritiesPricing relatedSecuritiesPricing) {
		this.relatedSecuritiesPricing = relatedSecuritiesPricing;
	}

	public VariableInterest getVariableInterest() {
		return variableInterest;
	}

	public void setVariableInterest(com.tools20022.repository.entity.VariableInterest variableInterest) {
		this.variableInterest = variableInterest;
	}

	public Number getYears() {
		return years;
	}

	public void setYears(Number years) {
		this.years = years;
	}

	public CalculationTypeCode getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(CalculationTypeCode calculationType) {
		this.calculationType = calculationType;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
	}

	public DateTimePeriod getValuePeriod() {
		return valuePeriod;
	}

	public void setValuePeriod(com.tools20022.repository.entity.DateTimePeriod valuePeriod) {
		this.valuePeriod = valuePeriod;
	}
}