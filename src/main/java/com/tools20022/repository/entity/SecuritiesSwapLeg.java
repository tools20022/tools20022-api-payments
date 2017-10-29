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
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.PercentageRate;
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
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#Amount
 * SecuritiesSwapLeg.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#Benchmark
 * SecuritiesSwapLeg.Benchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#CurvePoint
 * SecuritiesSwapLeg.CurvePoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#BenchmarkYield
 * SecuritiesSwapLeg.BenchmarkYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#BenchmarkOffset
 * SecuritiesSwapLeg.BenchmarkOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotSellSwap
 * SecuritiesSwapLeg.SpotSellSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotBuySwap
 * SecuritiesSwapLeg.SpotBuySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardBuyBackSwap
 * SecuritiesSwapLeg.ForwardBuyBackSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardSellBackSwap
 * SecuritiesSwapLeg.ForwardSellBackSwap}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotSell
 * FinancialInstrumentSwap.SpotSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotBuy
 * FinancialInstrumentSwap.SpotBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardBuyBack
 * FinancialInstrumentSwap.ForwardBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardSellBack
 * FinancialInstrumentSwap.ForwardSellBack}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Contains the currency and amount of a buy or sell leg of a swap for the spot or the forward.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Benchmark = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Contains the benchmark used for a buy or sell leg of a swap for the spot or the forward.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CurvePoint = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurvePoint";
			definition = "Identifies a point on a benchmark curve.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute BenchmarkYield = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkYield";
			definition = "Contains the yield against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute BenchmarkOffset = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkOffset";
			definition = "Contains the offset in basis points against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Swap for which a spot sell leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotSell
	 * FinancialInstrumentSwap.SpotSell}</li>
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
	public static final MMBusinessAssociationEnd SpotSellSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotSellSwap";
			definition = "Swap for which a spot sell leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Swap for which a spot buy leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotBuy
	 * FinancialInstrumentSwap.SpotBuy}</li>
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
	public static final MMBusinessAssociationEnd SpotBuySwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotBuySwap";
			definition = "Swap for which a spot buy leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Swap for which a forward buy back leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardBuyBack
	 * FinancialInstrumentSwap.ForwardBuyBack}</li>
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
	public static final MMBusinessAssociationEnd ForwardBuyBackSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackSwap";
			definition = "Swap for which a forward buy back leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Swap for which a forward sell back leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardSellBack
	 * FinancialInstrumentSwap.ForwardSellBack}</li>
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
	public static final MMBusinessAssociationEnd ForwardSellBackSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackSwap";
			definition = "Swap for which a forward sell back leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSwapLeg";
				definition = "Contains the details of one of the legs of a swap, both in time (spot versus [partial] forward details) and the side (sell versus buy).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell, com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy,
						com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSwapLeg.Amount, com.tools20022.repository.entity.SecuritiesSwapLeg.Benchmark, com.tools20022.repository.entity.SecuritiesSwapLeg.CurvePoint,
						com.tools20022.repository.entity.SecuritiesSwapLeg.BenchmarkYield, com.tools20022.repository.entity.SecuritiesSwapLeg.BenchmarkOffset, com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap);
			}
		});
		return mmObject_lazy.get();
	}
}