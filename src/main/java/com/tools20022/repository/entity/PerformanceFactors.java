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
import com.tools20022.repository.datatype.DecimalNumber;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Performance factors of the investment fund / fund class.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PerformanceFactors" src="doc-files/PerformanceFactors.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#NetAssetValueCalculation
 * PerformanceFactors.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#CorporateActionFactor
 * PerformanceFactors.CorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#CumulativeCorporateActionFactor
 * PerformanceFactors.CumulativeCorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#AccumulationPeriod
 * PerformanceFactors.AccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#NormalPerformance
 * PerformanceFactors.NormalPerformance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#InvestmentFundPerformanceFactors
 * NetAssetValueCalculation.InvestmentFundPerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PerformanceFactors
 * DateTimePeriod.PerformanceFactors}</li>
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
 * "PerformanceFactors"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Performance factors of the investment fund / fund class."</li>
 * </ul>
 */
public class PerformanceFactors {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Calculation for which the performance factors are obtained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#InvestmentFundPerformanceFactors
	 * NetAssetValueCalculation.InvestmentFundPerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation for which the performance factors are obtained."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation for which the performance factors are obtained.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of the NAV before all corporate events of the valuation date,
	 * divided by the value of the NAV after the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionFactor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFactor";
			definition = "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Value of the NAV before a corporate event, divided by the value of the
	 * NAV after the corporate event, accumulated for a number of corporate
	 * events over the defined period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeCorporateActionFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CumulativeCorporateActionFactor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeCorporateActionFactor";
			definition = "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Period of time for the calculation of the cumulative corporate action
	 * factor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PerformanceFactors
	 * DateTimePeriod.PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period of time for the calculation of the cumulative corporate action factor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccumulationPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccumulationPeriod";
			definition = "Period of time for the calculation of the cumulative corporate action factor.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Normal performance value of the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalPerformance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Normal performance value of the NAV."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NormalPerformance = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NormalPerformance";
			definition = "Normal performance value of the NAV.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PerformanceFactors";
				definition = "Performance factors of the investment fund / fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.CorporateActionFactor,
						com.tools20022.repository.entity.PerformanceFactors.CumulativeCorporateActionFactor, com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod,
						com.tools20022.repository.entity.PerformanceFactors.NormalPerformance);
			}
		});
		return mmObject_lazy.get();
	}
}