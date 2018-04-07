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
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.FinancialInstrumentSwap;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesSwapLeg, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<SecuritiesSwapLeg, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(SecuritiesSwapLeg obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected BenchmarkCurveNameCode benchmark;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesSwapLeg, BenchmarkCurveNameCode> mmBenchmark = new MMBusinessAttribute<SecuritiesSwapLeg, BenchmarkCurveNameCode>() {
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

		@Override
		public BenchmarkCurveNameCode getValue(SecuritiesSwapLeg obj) {
			return obj.getBenchmark();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, BenchmarkCurveNameCode value) {
			obj.setBenchmark(value);
		}
	};
	protected Max256Text curvePoint;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 222</li>
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
	public static final MMBusinessAttribute<SecuritiesSwapLeg, Max256Text> mmCurvePoint = new MMBusinessAttribute<SecuritiesSwapLeg, Max256Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "222"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurvePoint";
			definition = "Identifies a point on a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(SecuritiesSwapLeg obj) {
			return obj.getCurvePoint();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, Max256Text value) {
			obj.setCurvePoint(value);
		}
	};
	protected PercentageRate benchmarkYield;
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
	public static final MMBusinessAttribute<SecuritiesSwapLeg, PercentageRate> mmBenchmarkYield = new MMBusinessAttribute<SecuritiesSwapLeg, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(SecuritiesSwapLeg obj) {
			return obj.getBenchmarkYield();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, PercentageRate value) {
			obj.setBenchmarkYield(value);
		}
	};
	protected BaseOneRate benchmarkOffset;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesSwapLeg, BaseOneRate> mmBenchmarkOffset = new MMBusinessAttribute<SecuritiesSwapLeg, BaseOneRate>() {
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

		@Override
		public BaseOneRate getValue(SecuritiesSwapLeg obj) {
			return obj.getBenchmarkOffset();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, BaseOneRate value) {
			obj.setBenchmarkOffset(value);
		}
	};
	protected FinancialInstrumentSwap spotSellSwap;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>> mmSpotSellSwap = new MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotSellSwap";
			definition = "Swap for which a spot sell leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> FinancialInstrumentSwap.mmSpotSell;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentSwap> getValue(SecuritiesSwapLeg obj) {
			return obj.getSpotSellSwap();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, Optional<FinancialInstrumentSwap> value) {
			obj.setSpotSellSwap(value.orElse(null));
		}
	};
	protected FinancialInstrumentSwap spotBuySwap;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>> mmSpotBuySwap = new MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotBuySwap";
			definition = "Swap for which a spot buy leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> FinancialInstrumentSwap.mmSpotBuy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentSwap> getValue(SecuritiesSwapLeg obj) {
			return obj.getSpotBuySwap();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, Optional<FinancialInstrumentSwap> value) {
			obj.setSpotBuySwap(value.orElse(null));
		}
	};
	protected FinancialInstrumentSwap forwardBuyBackSwap;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>> mmForwardBuyBackSwap = new MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackSwap";
			definition = "Swap for which a forward buy back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> FinancialInstrumentSwap.mmForwardBuyBack;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentSwap> getValue(SecuritiesSwapLeg obj) {
			return obj.getForwardBuyBackSwap();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, Optional<FinancialInstrumentSwap> value) {
			obj.setForwardBuyBackSwap(value.orElse(null));
		}
	};
	protected FinancialInstrumentSwap forwardSellBackSwap;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>> mmForwardSellBackSwap = new MMBusinessAssociationEnd<SecuritiesSwapLeg, Optional<FinancialInstrumentSwap>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackSwap";
			definition = "Swap for which a forward sell back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> FinancialInstrumentSwap.mmForwardSellBack;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentSwap> getValue(SecuritiesSwapLeg obj) {
			return obj.getForwardSellBackSwap();
		}

		@Override
		public void setValue(SecuritiesSwapLeg obj, Optional<FinancialInstrumentSwap> value) {
			obj.setForwardSellBackSwap(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSwapLeg";
				definition = "Contains the details of one of the legs of a swap, both in time (spot versus [partial] forward details) and the side (sell versus buy).";
				associationDomain_lazy = () -> Arrays.asList(FinancialInstrumentSwap.mmSpotSell, FinancialInstrumentSwap.mmSpotBuy, FinancialInstrumentSwap.mmForwardBuyBack, FinancialInstrumentSwap.mmForwardSellBack);
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

	public SecuritiesSwapLeg setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public BenchmarkCurveNameCode getBenchmark() {
		return benchmark;
	}

	public SecuritiesSwapLeg setBenchmark(BenchmarkCurveNameCode benchmark) {
		this.benchmark = Objects.requireNonNull(benchmark);
		return this;
	}

	public Max256Text getCurvePoint() {
		return curvePoint;
	}

	public SecuritiesSwapLeg setCurvePoint(Max256Text curvePoint) {
		this.curvePoint = Objects.requireNonNull(curvePoint);
		return this;
	}

	public PercentageRate getBenchmarkYield() {
		return benchmarkYield;
	}

	public SecuritiesSwapLeg setBenchmarkYield(PercentageRate benchmarkYield) {
		this.benchmarkYield = Objects.requireNonNull(benchmarkYield);
		return this;
	}

	public BaseOneRate getBenchmarkOffset() {
		return benchmarkOffset;
	}

	public SecuritiesSwapLeg setBenchmarkOffset(BaseOneRate benchmarkOffset) {
		this.benchmarkOffset = Objects.requireNonNull(benchmarkOffset);
		return this;
	}

	public Optional<FinancialInstrumentSwap> getSpotSellSwap() {
		return spotSellSwap == null ? Optional.empty() : Optional.of(spotSellSwap);
	}

	public SecuritiesSwapLeg setSpotSellSwap(FinancialInstrumentSwap spotSellSwap) {
		this.spotSellSwap = spotSellSwap;
		return this;
	}

	public Optional<FinancialInstrumentSwap> getSpotBuySwap() {
		return spotBuySwap == null ? Optional.empty() : Optional.of(spotBuySwap);
	}

	public SecuritiesSwapLeg setSpotBuySwap(FinancialInstrumentSwap spotBuySwap) {
		this.spotBuySwap = spotBuySwap;
		return this;
	}

	public Optional<FinancialInstrumentSwap> getForwardBuyBackSwap() {
		return forwardBuyBackSwap == null ? Optional.empty() : Optional.of(forwardBuyBackSwap);
	}

	public SecuritiesSwapLeg setForwardBuyBackSwap(FinancialInstrumentSwap forwardBuyBackSwap) {
		this.forwardBuyBackSwap = forwardBuyBackSwap;
		return this;
	}

	public Optional<FinancialInstrumentSwap> getForwardSellBackSwap() {
		return forwardSellBackSwap == null ? Optional.empty() : Optional.of(forwardSellBackSwap);
	}

	public SecuritiesSwapLeg setForwardSellBackSwap(FinancialInstrumentSwap forwardSellBackSwap) {
		this.forwardSellBackSwap = forwardSellBackSwap;
		return this;
	}
}