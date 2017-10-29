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
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the analytics.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AnalyticsCalculation" src="doc-files/AnalyticsCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#SecuritiesPricing
 * AnalyticsCalculation.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AnalyticsCalculation#Value
 * AnalyticsCalculation.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#CalculationType
 * AnalyticsCalculation.CalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#ValueDate
 * AnalyticsCalculation.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#ValuePeriod
 * AnalyticsCalculation.ValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#EstimatedInterestRate
 * AnalyticsCalculation.EstimatedInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#VariableRateValueDate
 * AnalyticsCalculation.VariableRateValueDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AnalyticsCalculation
 * SecuritiesPricing.AnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsValue#AnalyticsCalculation
 * AnalyticsValue.AnalyticsCalculation}</li>
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
 * "AnalyticsCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the analytics."</li>
 * </ul>
 */
public class AnalyticsCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pricing for which an analytics calculation is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AnalyticsCalculation
	 * SecuritiesPricing.AnalyticsCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing for which an analytics calculation is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing for which an analytics calculation is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of the defined analytics calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsValue#AnalyticsCalculation
	 * AnalyticsValue.AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AnalyticsValue
	 * AnalyticsValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the defined analytics calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Value = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Result of the defined analytics calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AnalyticsValue.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.AnalyticsCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
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
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}
	};
	/**
	 * Date/time on which the calculation is based. For example: valuation on
	 * October 1 (price date) based on price of September 19 ( value date).
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based. For example: valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based. For example: valuation on October 1 (price date) based on price of September 19 ( value date).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
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
	public static final MMBusinessAttribute ValuePeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Estimated per annum ratio of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstimatedInterestRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedInterestRate";
			definition = "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as of which the variable rate is valid.
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
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time as of which the variable rate is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateValueDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AnalyticsCalculation";
				definition = "Characteristics related to the analytics.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation, com.tools20022.repository.entity.AnalyticsValue.AnalyticsCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing, com.tools20022.repository.entity.AnalyticsCalculation.Value,
						com.tools20022.repository.entity.AnalyticsCalculation.CalculationType, com.tools20022.repository.entity.AnalyticsCalculation.ValueDate, com.tools20022.repository.entity.AnalyticsCalculation.ValuePeriod,
						com.tools20022.repository.entity.AnalyticsCalculation.EstimatedInterestRate, com.tools20022.repository.entity.AnalyticsCalculation.VariableRateValueDate);
			}
		});
		return mmObject_lazy.get();
	}
}