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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Index
 * PortfolioBenchmark.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Portfolio
 * PortfolioBenchmark.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#BenchmarkWeight
 * PortfolioBenchmark.BenchmarkWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#MaximumDeviation
 * PortfolioBenchmark.MaximumDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#MinimumDeviation
 * PortfolioBenchmark.MinimumDeviation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#EffectivePeriod
 * PortfolioBenchmark.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Description
 * PortfolioBenchmark.Description}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Benchmark
 * Portfolio.Benchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#PortfolioBenchmark
 * Index.PortfolioBenchmark}</li>
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
 * "PortfolioBenchmark"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security or other price against which the performance of the portfolio is evaluated."
 * </li>
 * </ul>
 */
public class PortfolioBenchmark {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the index which may be used for decomposition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#PortfolioBenchmark
	 * Index.PortfolioBenchmark}</li>
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
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index which may be used for decomposition.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.PortfolioBenchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Portfolio to which the benchmark applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Benchmark
	 * Portfolio.Benchmark}</li>
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
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio to which the benchmark applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Benchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute BenchmarkWeight = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkWeight";
			definition = "Instrument weighting in the benchmark for the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MaximumDeviation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumDeviation";
			definition = "Maximum allowable deviation from the benchmark.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MinimumDeviation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDeviation";
			definition = "Minimum allowable deviation from the benchmark.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the instrument is used as a benchmark for the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the benchmark used to determine the performance of a portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioBenchmark";
				definition = "Security or other price against which the performance of the portfolio is evaluated.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Benchmark, com.tools20022.repository.entity.Index.PortfolioBenchmark);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioBenchmark.Index, com.tools20022.repository.entity.PortfolioBenchmark.Portfolio,
						com.tools20022.repository.entity.PortfolioBenchmark.BenchmarkWeight, com.tools20022.repository.entity.PortfolioBenchmark.MaximumDeviation, com.tools20022.repository.entity.PortfolioBenchmark.MinimumDeviation,
						com.tools20022.repository.entity.PortfolioBenchmark.EffectivePeriod, com.tools20022.repository.entity.PortfolioBenchmark.Description);
			}
		});
		return mmObject_lazy.get();
	}
}