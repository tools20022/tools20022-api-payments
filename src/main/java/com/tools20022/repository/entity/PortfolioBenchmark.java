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
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Portfolio;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
	protected List<Index> index;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PortfolioBenchmark, List<Index>> mmIndex = new MMBusinessAssociationEnd<PortfolioBenchmark, List<Index>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index which may be used for decomposition.";
			minOccurs = 0;
			opposite_lazy = () -> Index.mmPortfolioBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Index.mmObject();
		}

		@Override
		public List<Index> getValue(PortfolioBenchmark obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, List<Index> value) {
			obj.setIndex(value);
		}
	};
	protected Portfolio portfolio;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<PortfolioBenchmark, Optional<Portfolio>> mmPortfolio = new MMBusinessAssociationEnd<PortfolioBenchmark, Optional<Portfolio>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio to which the benchmark applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Portfolio.mmBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Portfolio.mmObject();
		}

		@Override
		public Optional<Portfolio> getValue(PortfolioBenchmark obj) {
			return obj.getPortfolio();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, Optional<Portfolio> value) {
			obj.setPortfolio(value.orElse(null));
		}
	};
	protected PercentageRate benchmarkWeight;
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
	public static final MMBusinessAttribute<PortfolioBenchmark, PercentageRate> mmBenchmarkWeight = new MMBusinessAttribute<PortfolioBenchmark, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(PortfolioBenchmark obj) {
			return obj.getBenchmarkWeight();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, PercentageRate value) {
			obj.setBenchmarkWeight(value);
		}
	};
	protected PercentageRate maximumDeviation;
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
	public static final MMBusinessAttribute<PortfolioBenchmark, PercentageRate> mmMaximumDeviation = new MMBusinessAttribute<PortfolioBenchmark, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(PortfolioBenchmark obj) {
			return obj.getMaximumDeviation();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, PercentageRate value) {
			obj.setMaximumDeviation(value);
		}
	};
	protected PercentageRate minimumDeviation;
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
	public static final MMBusinessAttribute<PortfolioBenchmark, PercentageRate> mmMinimumDeviation = new MMBusinessAttribute<PortfolioBenchmark, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(PortfolioBenchmark obj) {
			return obj.getMinimumDeviation();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, PercentageRate value) {
			obj.setMinimumDeviation(value);
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PortfolioBenchmark, DateTimePeriod> mmEffectivePeriod = new MMBusinessAttribute<PortfolioBenchmark, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the instrument is used as a benchmark for the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(PortfolioBenchmark obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, DateTimePeriod value) {
			obj.setEffectivePeriod(value);
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PortfolioBenchmark, Max350Text> mmDescription = new MMBusinessAttribute<PortfolioBenchmark, Max350Text>() {
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

		@Override
		public Max350Text getValue(PortfolioBenchmark obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(PortfolioBenchmark obj, Max350Text value) {
			obj.setDescription(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioBenchmark";
				definition = "Security or other price against which the performance of the portfolio is evaluated.";
				associationDomain_lazy = () -> Arrays.asList(Portfolio.mmBenchmark, Index.mmPortfolioBenchmark);
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
		return index == null ? index = new ArrayList<>() : index;
	}

	public PortfolioBenchmark setIndex(List<Index> index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Optional<Portfolio> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public PortfolioBenchmark setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public PercentageRate getBenchmarkWeight() {
		return benchmarkWeight;
	}

	public PortfolioBenchmark setBenchmarkWeight(PercentageRate benchmarkWeight) {
		this.benchmarkWeight = Objects.requireNonNull(benchmarkWeight);
		return this;
	}

	public PercentageRate getMaximumDeviation() {
		return maximumDeviation;
	}

	public PortfolioBenchmark setMaximumDeviation(PercentageRate maximumDeviation) {
		this.maximumDeviation = Objects.requireNonNull(maximumDeviation);
		return this;
	}

	public PercentageRate getMinimumDeviation() {
		return minimumDeviation;
	}

	public PortfolioBenchmark setMinimumDeviation(PercentageRate minimumDeviation) {
		this.minimumDeviation = Objects.requireNonNull(minimumDeviation);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public PortfolioBenchmark setEffectivePeriod(DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public PortfolioBenchmark setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}
}