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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FloatingInterestRate4;
import com.tools20022.repository.msg.InterestRateContractTerm1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMBusinessAttribute<Index, PercentageRate> mmIndexRateBasis = new MMBusinessAttribute<Index, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(Index obj) {
			return obj.getIndexRateBasis();
		}

		@Override
		public void setValue(Index obj, PercentageRate value) {
			obj.setIndexRateBasis(value);
		}
	};
	protected RateAndAmount indexFactor;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Index, RateAndAmount> mmIndexFactor = new MMBusinessAssociationEnd<Index, RateAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RateAndAmount.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}

		@Override
		public RateAndAmount getValue(Index obj) {
			return obj.getIndexFactor();
		}

		@Override
		public void setValue(Index obj, RateAndAmount value) {
			obj.setIndexFactor(value);
		}
	};
	protected DecimalNumber indexPoints;
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
	public static final MMBusinessAttribute<Index, DecimalNumber> mmIndexPoints = new MMBusinessAttribute<Index, DecimalNumber>() {
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

		@Override
		public DecimalNumber getValue(Index obj) {
			return obj.getIndexPoints();
		}

		@Override
		public void setValue(Index obj, DecimalNumber value) {
			obj.setIndexPoints(value);
		}
	};
	protected ISODateTime indexFixingDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Index, ISODateTime> mmIndexFixingDate = new MMBusinessAttribute<Index, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(Index obj) {
			return obj.getIndexFixingDate();
		}

		@Override
		public void setValue(Index obj, ISODateTime value) {
			obj.setIndexFixingDate(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Index, Max35Text> mmIdentification = new MMBusinessAttribute<Index, Max35Text>() {
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

		@Override
		public Max35Text getValue(Index obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Index obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Max35Text referenceSource;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Index, Max35Text> mmReferenceSource = new MMBusinessAttribute<Index, Max35Text>() {
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

		@Override
		public Max35Text getValue(Index obj) {
			return obj.getReferenceSource();
		}

		@Override
		public void setValue(Index obj, Max35Text value) {
			obj.setReferenceSource(value);
		}
	};
	protected CurrencyCode indexRateCurrency;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Index, CurrencyCode> mmIndexRateCurrency = new MMBusinessAttribute<Index, CurrencyCode>() {
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

		@Override
		public CurrencyCode getValue(Index obj) {
			return obj.getIndexRateCurrency();
		}

		@Override
		public void setValue(Index obj, CurrencyCode value) {
			obj.setIndexRateCurrency(value);
		}
	};
	protected FrequencyCode indexRateFrequency;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Index, FrequencyCode> mmIndexRateFrequency = new MMBusinessAttribute<Index, FrequencyCode>() {
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

		@Override
		public FrequencyCode getValue(Index obj) {
			return obj.getIndexRateFrequency();
		}

		@Override
		public void setValue(Index obj, FrequencyCode value) {
			obj.setIndexRateFrequency(value);
		}
	};
	protected DecimalNumber indexRateMultiplier;
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
	public static final MMBusinessAttribute<Index, DecimalNumber> mmIndexRateMultiplier = new MMBusinessAttribute<Index, DecimalNumber>() {
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

		@Override
		public DecimalNumber getValue(Index obj) {
			return obj.getIndexRateMultiplier();
		}

		@Override
		public void setValue(Index obj, DecimalNumber value) {
			obj.setIndexRateMultiplier(value);
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Index, Optional<Spread>> mmSpread = new MMBusinessAssociationEnd<Index, Optional<Spread>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Spread.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Optional<Spread> getValue(Index obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(Index obj, Optional<Spread> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	protected List<PortfolioBenchmark> portfolioBenchmark;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Index, List<PortfolioBenchmark>> mmPortfolioBenchmark = new MMBusinessAssociationEnd<Index, List<PortfolioBenchmark>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			opposite_lazy = () -> PortfolioBenchmark.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioBenchmark.mmObject();
		}

		@Override
		public List<PortfolioBenchmark> getValue(Index obj) {
			return obj.getPortfolioBenchmark();
		}

		@Override
		public void setValue(Index obj, List<PortfolioBenchmark> value) {
			obj.setPortfolioBenchmark(value);
		}
	};
	protected VariableInterest variableInterest;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Index, VariableInterest> mmVariableInterest = new MMBusinessAssociationEnd<Index, VariableInterest>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> VariableInterest.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}

		@Override
		public VariableInterest getValue(Index obj) {
			return obj.getVariableInterest();
		}

		@Override
		public void setValue(Index obj, VariableInterest value) {
			obj.setVariableInterest(value);
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Index, SecuritiesPricing> mmSecuritiesPricing = new MMBusinessAssociationEnd<Index, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Index obj) {
			return obj.getSecuritiesPricing();
		}

		@Override
		public void setValue(Index obj, SecuritiesPricing value) {
			obj.setSecuritiesPricing(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmIndex, VariableInterest.mmIndex, RateAndAmount.mmIndex, Spread.mmIndex, PortfolioBenchmark.mmIndex);
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

	public Index setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = Objects.requireNonNull(indexRateBasis);
		return this;
	}

	public RateAndAmount getIndexFactor() {
		return indexFactor;
	}

	public Index setIndexFactor(RateAndAmount indexFactor) {
		this.indexFactor = Objects.requireNonNull(indexFactor);
		return this;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public Index setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = Objects.requireNonNull(indexPoints);
		return this;
	}

	public ISODateTime getIndexFixingDate() {
		return indexFixingDate;
	}

	public Index setIndexFixingDate(ISODateTime indexFixingDate) {
		this.indexFixingDate = Objects.requireNonNull(indexFixingDate);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Index setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getReferenceSource() {
		return referenceSource;
	}

	public Index setReferenceSource(Max35Text referenceSource) {
		this.referenceSource = Objects.requireNonNull(referenceSource);
		return this;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public Index setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = Objects.requireNonNull(indexRateCurrency);
		return this;
	}

	public FrequencyCode getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public Index setIndexRateFrequency(FrequencyCode indexRateFrequency) {
		this.indexRateFrequency = Objects.requireNonNull(indexRateFrequency);
		return this;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public Index setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = Objects.requireNonNull(indexRateMultiplier);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Index setSpread(Spread spread) {
		this.spread = spread;
		return this;
	}

	public List<PortfolioBenchmark> getPortfolioBenchmark() {
		return portfolioBenchmark == null ? portfolioBenchmark = new ArrayList<>() : portfolioBenchmark;
	}

	public Index setPortfolioBenchmark(List<PortfolioBenchmark> portfolioBenchmark) {
		this.portfolioBenchmark = Objects.requireNonNull(portfolioBenchmark);
		return this;
	}

	public VariableInterest getVariableInterest() {
		return variableInterest;
	}

	public Index setVariableInterest(VariableInterest variableInterest) {
		this.variableInterest = Objects.requireNonNull(variableInterest);
		return this;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public Index setSecuritiesPricing(SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = Objects.requireNonNull(securitiesPricing);
		return this;
	}
}