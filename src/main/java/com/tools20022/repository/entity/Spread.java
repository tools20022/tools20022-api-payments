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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FloatingInterestRate4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Margin over or under an index which determines a rate.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Spread" src="doc-files/Spread.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
 * Spread.mmBenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
 * Spread.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
 * Spread.mmSpreadRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBasisPointSpread
 * Spread.mmBasisPointSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmIndex
 * Spread.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
 * Spread.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedIndicationOfInterest
 * Spread.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmIndicationOfInterest
 * Spread.mmIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
 * Spread.mmRelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
 * Spread.mmBenchmarkCurve}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmPriceOffset
 * Spread.mmPriceOffset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSpread
 * Security.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
 * SecuritiesPricing.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
 * InterestCalculation.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSpread
 * Index.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
 * SecuritiesFinancing.mmRepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSwapSpread
 * BuyOrSellIndicationOfInterest.mmSwapSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmSpread
 * Curve.mmSpread}</li>
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
 * "Spread"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Margin over or under an index which determines a rate."</li>
 * </ul>
 */
public class Spread {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security benchmarkSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSpread
	 * Security.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security used as a reference to express the value of another security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, Security> mmBenchmarkSecurity = new MMBusinessAssociationEnd<Spread, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkSecurity";
			definition = "Security used as a reference to express the value of another security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Spread obj) {
			return obj.getBenchmarkSecurity();
		}

		@Override
		public void setValue(Spread obj, Security value) {
			obj.setBenchmarkSecurity(value);
		}
	};
	protected SecuritiesFinancing securitiesFinancing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
	 * SecuritiesFinancing.mmRepurchaseSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which a repurchase spread is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, Optional<SecuritiesFinancing>> mmSecuritiesFinancing = new MMBusinessAssociationEnd<Spread, Optional<SecuritiesFinancing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Securities financing process for which a repurchase spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmRepurchaseSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancing> getValue(Spread obj) {
			return obj.getSecuritiesFinancing();
		}

		@Override
		public void setValue(Spread obj, Optional<SecuritiesFinancing> value) {
			obj.setSecuritiesFinancing(value.orElse(null));
		}
	};
	protected PercentageRate spreadRate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin over or under an index which determines the interest rate of an interest bearing instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Spread, PercentageRate> mmSpreadRate = new MMBusinessAttribute<Spread, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Spread obj) {
			return obj.getSpreadRate();
		}

		@Override
		public void setValue(Spread obj, PercentageRate value) {
			obj.setSpreadRate(value);
		}
	};
	protected Number basisPointSpread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmBasisPointSpread
	 * FloatingInterestRate4.mmBasisPointSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPointSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of points to be added or substracted to the rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Spread, Number> mmBasisPointSpread = new MMBusinessAttribute<Spread, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FloatingInterestRate4.mmBasisPointSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasisPointSpread";
			definition = "Specifies the number of points to be added or substracted to the rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Spread obj) {
			return obj.getBasisPointSpread();
		}

		@Override
		public void setValue(Spread obj, Number value) {
			obj.setBasisPointSpread(value);
		}
	};
	protected Index index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Index#mmSpread
	 * Index.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Index for which a spread is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, Optional<Index>> mmIndex = new MMBusinessAssociationEnd<Spread, Optional<Index>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Index.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Index.mmObject();
		}

		@Override
		public Optional<Index> getValue(Spread obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(Spread obj, Optional<Index> value) {
			obj.setIndex(value.orElse(null));
		}
	};
	protected SecuritiesPricing benchmarkPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
	 * SecuritiesPricing.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the price of the benchmark security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, SecuritiesPricing> mmBenchmarkPrice = new MMBusinessAssociationEnd<Spread, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Spread obj) {
			return obj.getBenchmarkPrice();
		}

		@Override
		public void setValue(Spread obj, SecuritiesPricing value) {
			obj.setBenchmarkPrice(value);
		}
	};
	protected List<BuyOrSellIndicationOfInterest> relatedIndicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
	 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a spread to benchmark is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, List<BuyOrSellIndicationOfInterest>> mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd<Spread, List<BuyOrSellIndicationOfInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a spread to benchmark is specified.";
			minOccurs = 0;
			opposite_lazy = () -> BuyOrSellIndicationOfInterest.mmSpreadToBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}

		@Override
		public List<BuyOrSellIndicationOfInterest> getValue(Spread obj) {
			return obj.getRelatedIndicationOfInterest();
		}

		@Override
		public void setValue(Spread obj, List<BuyOrSellIndicationOfInterest> value) {
			obj.setRelatedIndicationOfInterest(value);
		}
	};
	protected BuyOrSellIndicationOfInterest indicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSwapSpread
	 * BuyOrSellIndicationOfInterest.mmSwapSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a spread is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, Optional<BuyOrSellIndicationOfInterest>> mmIndicationOfInterest = new MMBusinessAssociationEnd<Spread, Optional<BuyOrSellIndicationOfInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BuyOrSellIndicationOfInterest.mmSwapSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}

		@Override
		public Optional<BuyOrSellIndicationOfInterest> getValue(Spread obj) {
			return obj.getIndicationOfInterest();
		}

		@Override
		public void setValue(Spread obj, Optional<BuyOrSellIndicationOfInterest> value) {
			obj.setIndicationOfInterest(value.orElse(null));
		}
	};
	protected InterestCalculation relatedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
	 * InterestCalculation.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation process for which a spread is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, InterestCalculation> mmRelatedInterest = new MMBusinessAssociationEnd<Spread, InterestCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest calculation process for which a spread is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestCalculation.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public InterestCalculation getValue(Spread obj) {
			return obj.getRelatedInterest();
		}

		@Override
		public void setValue(Spread obj, InterestCalculation value) {
			obj.setRelatedInterest(value);
		}
	};
	protected Curve benchmarkCurve;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Curve#mmSpread
	 * Curve.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Curve Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes a benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Spread, Curve> mmBenchmarkCurve = new MMBusinessAssociationEnd<Spread, Curve>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkCurve";
			definition = "Describes a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Curve.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Curve.mmObject();
		}

		@Override
		public Curve getValue(Spread obj) {
			return obj.getBenchmarkCurve();
		}

		@Override
		public void setValue(Spread obj, Curve value) {
			obj.setBenchmarkCurve(value);
		}
	};
	protected DecimalNumber priceOffset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 218</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread.  In case of a swap spread, the price offset is target spread for a swap."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Spread, DecimalNumber> mmPriceOffset = new MMBusinessAttribute<Spread, DecimalNumber>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "218"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceOffset";
			definition = "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread.  In case of a swap spread, the price offset is target spread for a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Spread obj) {
			return obj.getPriceOffset();
		}

		@Override
		public void setValue(Spread obj, DecimalNumber value) {
			obj.setPriceOffset(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Spread";
				definition = "Margin over or under an index which determines a rate.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmSpread, SecuritiesPricing.mmSpread, InterestCalculation.mmSpread, Index.mmSpread, SecuritiesFinancing.mmRepurchaseSpread,
						BuyOrSellIndicationOfInterest.mmSpreadToBenchmark, BuyOrSellIndicationOfInterest.mmSwapSpread, Curve.mmSpread);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.mmBenchmarkSecurity, com.tools20022.repository.entity.Spread.mmSecuritiesFinancing, com.tools20022.repository.entity.Spread.mmSpreadRate,
						com.tools20022.repository.entity.Spread.mmBasisPointSpread, com.tools20022.repository.entity.Spread.mmIndex, com.tools20022.repository.entity.Spread.mmBenchmarkPrice,
						com.tools20022.repository.entity.Spread.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.mmIndicationOfInterest, com.tools20022.repository.entity.Spread.mmRelatedInterest,
						com.tools20022.repository.entity.Spread.mmBenchmarkCurve, com.tools20022.repository.entity.Spread.mmPriceOffset);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Spread.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Security getBenchmarkSecurity() {
		return benchmarkSecurity;
	}

	public Spread setBenchmarkSecurity(Security benchmarkSecurity) {
		this.benchmarkSecurity = Objects.requireNonNull(benchmarkSecurity);
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing == null ? Optional.empty() : Optional.of(securitiesFinancing);
	}

	public Spread setSecuritiesFinancing(SecuritiesFinancing securitiesFinancing) {
		this.securitiesFinancing = securitiesFinancing;
		return this;
	}

	public PercentageRate getSpreadRate() {
		return spreadRate;
	}

	public Spread setSpreadRate(PercentageRate spreadRate) {
		this.spreadRate = Objects.requireNonNull(spreadRate);
		return this;
	}

	public Number getBasisPointSpread() {
		return basisPointSpread;
	}

	public Spread setBasisPointSpread(Number basisPointSpread) {
		this.basisPointSpread = Objects.requireNonNull(basisPointSpread);
		return this;
	}

	public Optional<Index> getIndex() {
		return index == null ? Optional.empty() : Optional.of(index);
	}

	public Spread setIndex(Index index) {
		this.index = index;
		return this;
	}

	public SecuritiesPricing getBenchmarkPrice() {
		return benchmarkPrice;
	}

	public Spread setBenchmarkPrice(SecuritiesPricing benchmarkPrice) {
		this.benchmarkPrice = Objects.requireNonNull(benchmarkPrice);
		return this;
	}

	public List<BuyOrSellIndicationOfInterest> getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest == null ? relatedIndicationOfInterest = new ArrayList<>() : relatedIndicationOfInterest;
	}

	public Spread setRelatedIndicationOfInterest(List<BuyOrSellIndicationOfInterest> relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = Objects.requireNonNull(relatedIndicationOfInterest);
		return this;
	}

	public Optional<BuyOrSellIndicationOfInterest> getIndicationOfInterest() {
		return indicationOfInterest == null ? Optional.empty() : Optional.of(indicationOfInterest);
	}

	public Spread setIndicationOfInterest(BuyOrSellIndicationOfInterest indicationOfInterest) {
		this.indicationOfInterest = indicationOfInterest;
		return this;
	}

	public InterestCalculation getRelatedInterest() {
		return relatedInterest;
	}

	public Spread setRelatedInterest(InterestCalculation relatedInterest) {
		this.relatedInterest = Objects.requireNonNull(relatedInterest);
		return this;
	}

	public Curve getBenchmarkCurve() {
		return benchmarkCurve;
	}

	public Spread setBenchmarkCurve(Curve benchmarkCurve) {
		this.benchmarkCurve = Objects.requireNonNull(benchmarkCurve);
		return this;
	}

	public DecimalNumber getPriceOffset() {
		return priceOffset;
	}

	public Spread setPriceOffset(DecimalNumber priceOffset) {
		this.priceOffset = Objects.requireNonNull(priceOffset);
		return this;
	}
}