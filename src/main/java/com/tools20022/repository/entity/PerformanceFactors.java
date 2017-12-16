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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNetAssetValueCalculation
 * PerformanceFactors.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmCorporateActionFactor
 * PerformanceFactors.mmCorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmCumulativeCorporateActionFactor
 * PerformanceFactors.mmCumulativeCorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
 * PerformanceFactors.mmAccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNormalPerformance
 * PerformanceFactors.mmNormalPerformance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInvestmentFundPerformanceFactors
 * NetAssetValueCalculation.mmInvestmentFundPerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPerformanceFactors
 * DateTimePeriod.mmPerformanceFactors}</li>
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
 * "PerformanceFactors"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Performance factors of the investment fund / fund class."</li>
 * </ul>
 */
public class PerformanceFactors {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Calculation for which the performance factors are obtained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInvestmentFundPerformanceFactors
	 * NetAssetValueCalculation.mmInvestmentFundPerformanceFactors}</li>
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
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation for which the performance factors are obtained.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmInvestmentFundPerformanceFactors;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected DecimalNumber corporateActionFactor;
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
	public static final MMBusinessAttribute mmCorporateActionFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFactor";
			definition = "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PerformanceFactors.class.getMethod("getCorporateActionFactor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber cumulativeCorporateActionFactor;
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
	public static final MMBusinessAttribute mmCumulativeCorporateActionFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeCorporateActionFactor";
			definition = "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PerformanceFactors.class.getMethod("getCumulativeCorporateActionFactor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod accumulationPeriod;
	/**
	 * Period of time for the calculation of the cumulative corporate action
	 * factor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPerformanceFactors
	 * DateTimePeriod.mmPerformanceFactors}</li>
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
	public static final MMBusinessAssociationEnd mmAccumulationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccumulationPeriod";
			definition = "Period of time for the calculation of the cumulative corporate action factor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPerformanceFactors;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DecimalNumber normalPerformance;
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
	public static final MMBusinessAttribute mmNormalPerformance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NormalPerformance";
			definition = "Normal performance value of the NAV.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PerformanceFactors.class.getMethod("getNormalPerformance", new Class[]{});
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
				name = "PerformanceFactors";
				definition = "Performance factors of the investment fund / fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmInvestmentFundPerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.mmPerformanceFactors);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PerformanceFactors.mmNetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.mmCorporateActionFactor,
						com.tools20022.repository.entity.PerformanceFactors.mmCumulativeCorporateActionFactor, com.tools20022.repository.entity.PerformanceFactors.mmAccumulationPeriod,
						com.tools20022.repository.entity.PerformanceFactors.mmNormalPerformance);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PerformanceFactors.class;
			}
		});
		return mmObject_lazy.get();
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public DecimalNumber getCorporateActionFactor() {
		return corporateActionFactor;
	}

	public void setCorporateActionFactor(DecimalNumber corporateActionFactor) {
		this.corporateActionFactor = corporateActionFactor;
	}

	public DecimalNumber getCumulativeCorporateActionFactor() {
		return cumulativeCorporateActionFactor;
	}

	public void setCumulativeCorporateActionFactor(DecimalNumber cumulativeCorporateActionFactor) {
		this.cumulativeCorporateActionFactor = cumulativeCorporateActionFactor;
	}

	public DateTimePeriod getAccumulationPeriod() {
		return accumulationPeriod;
	}

	public void setAccumulationPeriod(com.tools20022.repository.entity.DateTimePeriod accumulationPeriod) {
		this.accumulationPeriod = accumulationPeriod;
	}

	public DecimalNumber getNormalPerformance() {
		return normalPerformance;
	}

	public void setNormalPerformance(DecimalNumber normalPerformance) {
		this.normalPerformance = normalPerformance;
	}
}