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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max256Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes a benchmark curve.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Curve" src="doc-files/Curve.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#Currency
 * Curve.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#Name Curve.Name}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#Point Curve.Point}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#Spread Curve.Spread}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkCurve
 * Spread.BenchmarkCurve}</li>
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
 * "Curve"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes a benchmark curve."</li>
 * </ul>
 */
public class Curve {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the currency used for the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Identifies the currency used for the benchmark curve.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Identifies the name of the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#Index
	 * BenchmarkCurveName4Choice.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#Name
	 * BenchmarkCurveName4Choice.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BenchmarkCurveName4Choice.Index, com.tools20022.repository.choice.BenchmarkCurveName4Choice.Name);
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Identifies the name of the benchmark curve.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}
	};
	/**
	 * Identifies a point on a benchmark curve. The point can be stated via a
	 * combination of maturity month/year and coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Point"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Point = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Point";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Spread for which a benchmark curve is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#BenchmarkCurve
	 * Spread.BenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread for which a benchmark curve is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Curve.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread for which a benchmark curve is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkCurve;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Curve";
				definition = "Describes a benchmark curve.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.BenchmarkCurve);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Curve.Currency, com.tools20022.repository.entity.Curve.Name, com.tools20022.repository.entity.Curve.Point, com.tools20022.repository.entity.Curve.Spread);
			}
		});
		return mmObject_lazy.get();
	}
}