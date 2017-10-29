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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkSecurity
 * Spread.BenchmarkSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#SecuritiesFinancing
 * Spread.SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#SpreadRate
 * Spread.SpreadRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BasisPointSpread
 * Spread.BasisPointSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#Index Spread.Index}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkPrice
 * Spread.BenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#RelatedIndicationOfInterest
 * Spread.RelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#IndicationOfInterest
 * Spread.IndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#RelatedInterest
 * Spread.RelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkCurve
 * Spread.BenchmarkCurve}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#PriceOffset
 * Spread.PriceOffset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Spread
 * Security.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Spread
 * SecuritiesPricing.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Spread
 * InterestCalculation.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#Spread Index.Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RepurchaseSpread
 * SecuritiesFinancing.RepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SpreadToBenchmark
 * BuyOrSellIndicationOfInterest.SpreadToBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SwapSpread
 * BuyOrSellIndicationOfInterest.SwapSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#Spread Curve.Spread}</li>
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
	/**
	 * Security used as a reference to express the value of another security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Security#Spread
	 * Security.Spread}</li>
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
	public static final MMBusinessAssociationEnd BenchmarkSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkSecurity";
			definition = "Security used as a reference to express the value of another security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities financing process for which a repurchase spread is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RepurchaseSpread
	 * SecuritiesFinancing.RepurchaseSpread}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Securities financing process for which a repurchase spread is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Margin over or under an index which determines the interest rate of an
	 * interest bearing instrument.
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
	public static final MMBusinessAttribute SpreadRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the number of points to be added or substracted to the rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#BasisPointSpread
	 * FloatingInterestRate4.BasisPointSpread}</li>
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
	public static final MMBusinessAttribute BasisPointSpread = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate4.BasisPointSpread);
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasisPointSpread";
			definition = "Specifies the number of points to be added or substracted to the rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Index for which a spread is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Index#Spread
	 * Index.Spread}</li>
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
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a spread is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the price of the benchmark security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Spread
	 * SecuritiesPricing.Spread}</li>
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
	public static final MMBusinessAssociationEnd BenchmarkPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process for which a spread to benchmark is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SpreadToBenchmark
	 * BuyOrSellIndicationOfInterest.SpreadToBenchmark}</li>
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
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a spread to benchmark is specified.";
			minOccurs = 0;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process for which a spread is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SwapSpread
	 * BuyOrSellIndicationOfInterest.SwapSpread}</li>
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
	public static final MMBusinessAssociationEnd IndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process for which a spread is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest calculation process for which a spread is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Spread
	 * InterestCalculation.Spread}</li>
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
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest calculation process for which a spread is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes a benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Curve#Spread
	 * Curve.Spread}</li>
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
	public static final MMBusinessAssociationEnd BenchmarkCurve = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkCurve";
			definition = "Describes a benchmark curve.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Curve.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Curve.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Either a swap spread or spread to benchmark depending upon order type. In
	 * case of a spread to benchmark, the price offset is expressed in terms of
	 * basis points relative to a benchmark - this can be a positive or a
	 * negative spread. In case of a swap spread, the price offset is target
	 * spread for a swap.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
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
	public static final MMBusinessAttribute PriceOffset = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Spread.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceOffset";
			definition = "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread.  In case of a swap spread, the price offset is target spread for a swap.";
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
				name = "Spread";
				definition = "Margin over or under an index which determines a rate.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Spread, com.tools20022.repository.entity.SecuritiesPricing.Spread, com.tools20022.repository.entity.InterestCalculation.Spread,
						com.tools20022.repository.entity.Index.Spread, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread, com.tools20022.repository.entity.Curve.Spread);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.BenchmarkSecurity, com.tools20022.repository.entity.Spread.SecuritiesFinancing, com.tools20022.repository.entity.Spread.SpreadRate,
						com.tools20022.repository.entity.Spread.BasisPointSpread, com.tools20022.repository.entity.Spread.Index, com.tools20022.repository.entity.Spread.BenchmarkPrice,
						com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.IndicationOfInterest, com.tools20022.repository.entity.Spread.RelatedInterest,
						com.tools20022.repository.entity.Spread.BenchmarkCurve, com.tools20022.repository.entity.Spread.PriceOffset);
			}
		});
		return mmObject_lazy.get();
	}
}