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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FloatingInterestRate4;
import com.tools20022.repository.msg.InterestRateContractTerm1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Identifies the index.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Index" src="doc-files/Index.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
 * Index.mmIndexRateBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
 * Index.mmIndexFactor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
 * Index.mmIndexPoints}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFixingDate
 * Index.mmIndexFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIdentification
 * Index.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmReferenceSource
 * Index.mmReferenceSource}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateCurrency
 * Index.mmIndexRateCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateFrequency
 * Index.mmIndexRateFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateMultiplier
 * Index.mmIndexRateMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSpread
 * Index.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmPortfolioBenchmark
 * Index.mmPortfolioBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmVariableInterest
 * Index.mmVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
 * Index.mmSecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
 * SecuritiesPricing.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
 * VariableInterest.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
 * RateAndAmount.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmIndex
 * Spread.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
 * PortfolioBenchmark.mmIndex}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmTerm
 * FloatingInterestRate4.mmTerm}</li>
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
 * "Index"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the index."</li>
 * </ul>
 */
public class Index {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate indexRateBasis;
	/**
	 * Specifies the reference rate.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reference rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexRateBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexRateBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount indexFactor;
	/**
	 * Index rate applied to the amount paid to adjust it for instance to
	 * inflation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
	 * RateAndAmount.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate applied to the amount paid to adjust it for instance to inflation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndexFactor = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected DecimalNumber indexPoints;
	/**
	 * Number of points above the index used to calculate a price.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of points above the index used to calculate a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexPoints = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexPoints";
			definition = "Number of points above the index used to calculate a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexPoints", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime indexFixingDate;
	/**
	 * Date/time at which an index rate will be determined .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which an index rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Identifies the index by a name for instance LIBOR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmReferenceRate
	 * FloatingInterestRate4.mmReferenceRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the index by a name for instance LIBOR."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FloatingInterestRate4.mmReferenceRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the index by a name for instance LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text referenceSource;
	/**
	 * Identifies the reference source. The source can be the fixing agent or a
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference source. The source can be the fixing agent or a system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReferenceSource = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReferenceSource";
			definition = "Identifies the reference source. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getReferenceSource", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode indexRateCurrency;
	/**
	 * Specifies the currency of the reference rate for fixed income instruments
	 * where the price of the instrument is indexed to the price of an
	 * underlying benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexRateCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexRateCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode indexRateFrequency;
	/**
	 * Frequency at which the index changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the index changes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexRateFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the index changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexRateFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber indexRateMultiplier;
	/**
	 * Multiplier for the variable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#mmValue
	 * InterestRateContractTerm1.mmValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiplier for the variable rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndexRateMultiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRateContractTerm1.mmValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Index.class.getMethod("getIndexRateMultiplier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * Percentage to be added to or deducted from the index rate to calculate
	 * the effective rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Spread#mmIndex
	 * Spread.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage to be added to or deducted from the index rate to calculate the effective rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PortfolioBenchmark> portfolioBenchmark;
	/**
	 * Portfolio benchmark which uses an index for decomposition,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
	 * PortfolioBenchmark.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioBenchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio benchmark which uses an index for decomposition,"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolioBenchmark = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
		}
	};
	protected VariableInterest variableInterest;
	/**
	 * Variable interest which uises the index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
	 * VariableInterest.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest which uises the index."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * Pricing which uses an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
	 * SecuritiesPricing.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing which uses an index."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmIndex, com.tools20022.repository.entity.VariableInterest.mmIndex, com.tools20022.repository.entity.RateAndAmount.mmIndex,
						com.tools20022.repository.entity.Spread.mmIndex, com.tools20022.repository.entity.PortfolioBenchmark.mmIndex);
				derivationElement_lazy = () -> Arrays.asList(FloatingInterestRate4.mmTerm);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Index.mmIndexRateBasis, com.tools20022.repository.entity.Index.mmIndexFactor, com.tools20022.repository.entity.Index.mmIndexPoints,
						com.tools20022.repository.entity.Index.mmIndexFixingDate, com.tools20022.repository.entity.Index.mmIdentification, com.tools20022.repository.entity.Index.mmReferenceSource,
						com.tools20022.repository.entity.Index.mmIndexRateCurrency, com.tools20022.repository.entity.Index.mmIndexRateFrequency, com.tools20022.repository.entity.Index.mmIndexRateMultiplier,
						com.tools20022.repository.entity.Index.mmSpread, com.tools20022.repository.entity.Index.mmPortfolioBenchmark, com.tools20022.repository.entity.Index.mmVariableInterest,
						com.tools20022.repository.entity.Index.mmSecuritiesPricing);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Index.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public void setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
	}

	public RateAndAmount getIndexFactor() {
		return indexFactor;
	}

	public void setIndexFactor(com.tools20022.repository.entity.RateAndAmount indexFactor) {
		this.indexFactor = indexFactor;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public void setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = indexPoints;
	}

	public ISODateTime getIndexFixingDate() {
		return indexFixingDate;
	}

	public void setIndexFixingDate(ISODateTime indexFixingDate) {
		this.indexFixingDate = indexFixingDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getReferenceSource() {
		return referenceSource;
	}

	public void setReferenceSource(Max35Text referenceSource) {
		this.referenceSource = referenceSource;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public void setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = indexRateCurrency;
	}

	public FrequencyCode getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public void setIndexRateFrequency(FrequencyCode indexRateFrequency) {
		this.indexRateFrequency = indexRateFrequency;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public void setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = indexRateMultiplier;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}

	public List<PortfolioBenchmark> getPortfolioBenchmark() {
		return portfolioBenchmark;
	}

	public void setPortfolioBenchmark(List<com.tools20022.repository.entity.PortfolioBenchmark> portfolioBenchmark) {
		this.portfolioBenchmark = portfolioBenchmark;
	}

	public VariableInterest getVariableInterest() {
		return variableInterest;
	}

	public void setVariableInterest(com.tools20022.repository.entity.VariableInterest variableInterest) {
		this.variableInterest = variableInterest;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public void setSecuritiesPricing(com.tools20022.repository.entity.SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = securitiesPricing;
	}
}