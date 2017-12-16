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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Security or other price against which the performance of the portfolio is
 * evaluated.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioBenchmark" src="doc-files/PortfolioBenchmark.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
 * PortfolioBenchmark.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmPortfolio
 * PortfolioBenchmark.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmBenchmarkWeight
 * PortfolioBenchmark.mmBenchmarkWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmMaximumDeviation
 * PortfolioBenchmark.mmMaximumDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmMinimumDeviation
 * PortfolioBenchmark.mmMinimumDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmEffectivePeriod
 * PortfolioBenchmark.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmDescription
 * PortfolioBenchmark.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmBenchmark
 * Portfolio.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmPortfolioBenchmark
 * Index.mmPortfolioBenchmark}</li>
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
 * "PortfolioBenchmark"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security or other price against which the performance of the portfolio is evaluated."
 * </li>
 * </ul>
 */
public class PortfolioBenchmark {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Index> index;
	/**
	 * Specifies the index which may be used for decomposition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmPortfolioBenchmark
	 * Index.mmPortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the index which may be used for decomposition."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index which may be used for decomposition.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmPortfolioBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected Portfolio portfolio;
	/**
	 * Portfolio to which the benchmark applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmBenchmark
	 * Portfolio.mmBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio to which the benchmark applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio to which the benchmark applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected PercentageRate benchmarkWeight;
	/**
	 * Instrument weighting in the benchmark for the portfolio.
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument weighting in the benchmark for the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBenchmarkWeight = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkWeight";
			definition = "Instrument weighting in the benchmark for the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioBenchmark.class.getMethod("getBenchmarkWeight", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate maximumDeviation;
	/**
	 * Maximum allowable deviation from the benchmark.
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumDeviation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum allowable deviation from the benchmark."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumDeviation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumDeviation";
			definition = "Maximum allowable deviation from the benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioBenchmark.class.getMethod("getMaximumDeviation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate minimumDeviation;
	/**
	 * Minimum allowable deviation from the benchmark.
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDeviation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum allowable deviation from the benchmark."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumDeviation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDeviation";
			definition = "Minimum allowable deviation from the benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioBenchmark.class.getMethod("getMinimumDeviation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * Period during which the instrument is used as a benchmark for the
	 * portfolio.
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the instrument is used as a benchmark for the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the instrument is used as a benchmark for the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioBenchmark.class.getMethod("getEffectivePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text description;
	/**
	 * Free text description of the benchmark used to determine the performance
	 * of a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free text description of the benchmark used to determine the performance of a portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the benchmark used to determine the performance of a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioBenchmark.class.getMethod("getDescription", new Class[]{});
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
				name = "PortfolioBenchmark";
				definition = "Security or other price against which the performance of the portfolio is evaluated.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.mmBenchmark, com.tools20022.repository.entity.Index.mmPortfolioBenchmark);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioBenchmark.mmIndex, com.tools20022.repository.entity.PortfolioBenchmark.mmPortfolio,
						com.tools20022.repository.entity.PortfolioBenchmark.mmBenchmarkWeight, com.tools20022.repository.entity.PortfolioBenchmark.mmMaximumDeviation, com.tools20022.repository.entity.PortfolioBenchmark.mmMinimumDeviation,
						com.tools20022.repository.entity.PortfolioBenchmark.mmEffectivePeriod, com.tools20022.repository.entity.PortfolioBenchmark.mmDescription);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioBenchmark.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Index> getIndex() {
		return index;
	}

	public void setIndex(List<com.tools20022.repository.entity.Index> index) {
		this.index = index;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public PercentageRate getBenchmarkWeight() {
		return benchmarkWeight;
	}

	public void setBenchmarkWeight(PercentageRate benchmarkWeight) {
		this.benchmarkWeight = benchmarkWeight;
	}

	public PercentageRate getMaximumDeviation() {
		return maximumDeviation;
	}

	public void setMaximumDeviation(PercentageRate maximumDeviation) {
		this.maximumDeviation = maximumDeviation;
	}

	public PercentageRate getMinimumDeviation() {
		return minimumDeviation;
	}

	public void setMinimumDeviation(PercentageRate minimumDeviation) {
		this.minimumDeviation = minimumDeviation;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}
}