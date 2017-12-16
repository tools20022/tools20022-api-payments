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
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contains the details of one of the legs of a swap, both in time (spot versus
 * [partial] forward details) and the side (sell versus buy).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSwapLeg" src="doc-files/SecuritiesSwapLeg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmAmount
 * SecuritiesSwapLeg.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmBenchmark
 * SecuritiesSwapLeg.mmBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmCurvePoint
 * SecuritiesSwapLeg.mmCurvePoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmBenchmarkYield
 * SecuritiesSwapLeg.mmBenchmarkYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmBenchmarkOffset
 * SecuritiesSwapLeg.mmBenchmarkOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotSellSwap
 * SecuritiesSwapLeg.mmSpotSellSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotBuySwap
 * SecuritiesSwapLeg.mmSpotBuySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardBuyBackSwap
 * SecuritiesSwapLeg.mmForwardBuyBackSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardSellBackSwap
 * SecuritiesSwapLeg.mmForwardSellBackSwap}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotSell
 * FinancialInstrumentSwap.mmSpotSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotBuy
 * FinancialInstrumentSwap.mmSpotBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardBuyBack
 * FinancialInstrumentSwap.mmForwardBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardSellBack
 * FinancialInstrumentSwap.mmForwardSellBack}</li>
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
 * "SecuritiesSwapLeg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the details of one of the legs of a swap, both in time (spot versus [partial] forward details) and the side (sell versus buy)."
 * </li>
 * </ul>
 */
public class SecuritiesSwapLeg {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
	/**
	 * Contains the currency and amount of a buy or sell leg of a swap for the
	 * spot or the forward.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the currency and amount of a buy or sell leg of a swap for the spot or the forward."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Contains the currency and amount of a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSwapLeg.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BenchmarkCurveNameCode benchmark;
	/**
	 * Contains the benchmark used for a buy or sell leg of a swap for the spot
	 * or the forward.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Benchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the benchmark used for a buy or sell leg of a swap for the spot or the forward."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBenchmark = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Contains the benchmark used for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSwapLeg.class.getMethod("getBenchmark", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max256Text curvePoint;
	/**
	 * Identifies a point on a benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurvePoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a point on a benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurvePoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurvePoint";
			definition = "Identifies a point on a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSwapLeg.class.getMethod("getCurvePoint", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate benchmarkYield;
	/**
	 * Contains the yield against a benchmark for a buy or sell leg of a swap
	 * for the spot or the forward.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the yield against a benchmark for a buy or sell leg of a swap for the spot or the forward."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBenchmarkYield = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkYield";
			definition = "Contains the yield against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSwapLeg.class.getMethod("getBenchmarkYield", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate benchmarkOffset;
	/**
	 * Contains the offset in basis points against a benchmark for a buy or sell
	 * leg of a swap for the spot or the forward.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the offset in basis points against a benchmark for a buy or sell leg of a swap for the spot or the forward."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBenchmarkOffset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkOffset";
			definition = "Contains the offset in basis points against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSwapLeg.class.getMethod("getBenchmarkOffset", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentSwap spotSellSwap;
	/**
	 * Swap for which a spot sell leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotSell
	 * FinancialInstrumentSwap.mmSpotSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpotSellSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a spot sell leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpotSellSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotSellSwap";
			definition = "Swap for which a spot sell leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotSell;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	protected FinancialInstrumentSwap spotBuySwap;
	/**
	 * Swap for which a spot buy leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotBuy
	 * FinancialInstrumentSwap.mmSpotBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpotBuySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a spot buy leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpotBuySwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotBuySwap";
			definition = "Swap for which a spot buy leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotBuy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	protected FinancialInstrumentSwap forwardBuyBackSwap;
	/**
	 * Swap for which a forward buy back leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardBuyBack
	 * FinancialInstrumentSwap.mmForwardBuyBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBuyBackSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a forward buy back leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmForwardBuyBackSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackSwap";
			definition = "Swap for which a forward buy back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardBuyBack;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	protected FinancialInstrumentSwap forwardSellBackSwap;
	/**
	 * Swap for which a forward sell back leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardSellBack
	 * FinancialInstrumentSwap.mmForwardSellBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardSellBackSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a forward sell back leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmForwardSellBackSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackSwap";
			definition = "Swap for which a forward sell back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardSellBack;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSwapLeg";
				definition = "Contains the details of one of the legs of a swap, both in time (spot versus [partial] forward details) and the side (sell versus buy).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotSell, com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotBuy,
						com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardBuyBack, com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardSellBack);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSwapLeg.mmAmount, com.tools20022.repository.entity.SecuritiesSwapLeg.mmBenchmark,
						com.tools20022.repository.entity.SecuritiesSwapLeg.mmCurvePoint, com.tools20022.repository.entity.SecuritiesSwapLeg.mmBenchmarkYield, com.tools20022.repository.entity.SecuritiesSwapLeg.mmBenchmarkOffset,
						com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotSellSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardBuyBackSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardSellBackSwap);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSwapLeg.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public BenchmarkCurveNameCode getBenchmark() {
		return benchmark;
	}

	public void setBenchmark(BenchmarkCurveNameCode benchmark) {
		this.benchmark = benchmark;
	}

	public Max256Text getCurvePoint() {
		return curvePoint;
	}

	public void setCurvePoint(Max256Text curvePoint) {
		this.curvePoint = curvePoint;
	}

	public PercentageRate getBenchmarkYield() {
		return benchmarkYield;
	}

	public void setBenchmarkYield(PercentageRate benchmarkYield) {
		this.benchmarkYield = benchmarkYield;
	}

	public BaseOneRate getBenchmarkOffset() {
		return benchmarkOffset;
	}

	public void setBenchmarkOffset(BaseOneRate benchmarkOffset) {
		this.benchmarkOffset = benchmarkOffset;
	}

	public FinancialInstrumentSwap getSpotSellSwap() {
		return spotSellSwap;
	}

	public void setSpotSellSwap(com.tools20022.repository.entity.FinancialInstrumentSwap spotSellSwap) {
		this.spotSellSwap = spotSellSwap;
	}

	public FinancialInstrumentSwap getSpotBuySwap() {
		return spotBuySwap;
	}

	public void setSpotBuySwap(com.tools20022.repository.entity.FinancialInstrumentSwap spotBuySwap) {
		this.spotBuySwap = spotBuySwap;
	}

	public FinancialInstrumentSwap getForwardBuyBackSwap() {
		return forwardBuyBackSwap;
	}

	public void setForwardBuyBackSwap(com.tools20022.repository.entity.FinancialInstrumentSwap forwardBuyBackSwap) {
		this.forwardBuyBackSwap = forwardBuyBackSwap;
	}

	public FinancialInstrumentSwap getForwardSellBackSwap() {
		return forwardSellBackSwap;
	}

	public void setForwardSellBackSwap(com.tools20022.repository.entity.FinancialInstrumentSwap forwardSellBackSwap) {
		this.forwardSellBackSwap = forwardSellBackSwap;
	}
}