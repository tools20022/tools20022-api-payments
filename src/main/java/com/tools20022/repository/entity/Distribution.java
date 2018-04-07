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
import com.tools20022.repository.codeset.CorporateActionOptionCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Distributions in cash and/or securities following a corporate event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Distribution" src="doc-files/Distribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmExercisePeriod
 * Distribution.mmExercisePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPeriod
 * Distribution.mmOfferPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmTradingPeriod
 * Distribution.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmBlockingPeriod
 * Distribution.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmInterestPeriod
 * Distribution.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
 * Distribution.mmDistributionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
 * Distribution.mmOfferPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmIncentivePremium
 * Distribution.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmEffectiveDate
 * Distribution.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmEventConditions
 * Distribution.mmEventConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmExDate
 * Distribution.mmExDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmGrossRate
 * Distribution.mmGrossRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmMeetingDate
 * Distribution.mmMeetingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmNetRate
 * Distribution.mmNetRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmNewFaceValue
 * Distribution.mmNewFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmNewParValue
 * Distribution.mmNewParValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmPaymentDate
 * Distribution.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmDividend
 * Distribution.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmCorporateActionOption
 * Distribution.mmCorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmCurrencyOption
 * Distribution.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDecreaseAmount
 * Distribution.mmDecreaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmDecreaseRate
 * Distribution.mmDecreaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPriceFixingDate
 * Distribution.mmOfferPriceFixingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmRelatedDistribution
 * Dividend.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDistribution
 * SecuritiesPricing.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExercisePeriodDistribution
 * DateTimePeriod.mmExercisePeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmOfferPeriodDistribution
 * DateTimePeriod.mmOfferPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingPeriodDistribution
 * DateTimePeriod.mmTradingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBlockingPeriodDistribution
 * DateTimePeriod.mmBlockingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCashDistribution
 * DateTimePeriod.mmCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
 * Tax.mmRelatedCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmCorporateActionDistribution
 * IncentivePremium.mmCorporateActionDistribution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashDistribution
 * CashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
 * SecuritiesAndCashDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesDistribution
 * SecuritiesDistribution}</li>
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
 * "Distribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distributions in cash and/or securities following a corporate event."</li>
 * </ul>
 */
public class Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod exercisePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExercisePeriodDistribution
	 * DateTimePeriod.mmExercisePeriodDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the right and/or privilege on an underlying financial instrument may be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, DateTimePeriod> mmExercisePeriod = new MMBusinessAssociationEnd<Distribution, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriod";
			definition = "Period during which the right and/or privilege on an underlying financial instrument may be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmExercisePeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Distribution obj) {
			return obj.getExercisePeriod();
		}

		@Override
		public void setValue(Distribution obj, DateTimePeriod value) {
			obj.setExercisePeriod(value);
		}
	};
	protected DateTimePeriod offerPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmOfferPeriodDistribution
	 * DateTimePeriod.mmOfferPeriodDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which an open offer remains valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, DateTimePeriod> mmOfferPeriod = new MMBusinessAssociationEnd<Distribution, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPeriod";
			definition = "Period during which an open offer remains valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmOfferPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Distribution obj) {
			return obj.getOfferPeriod();
		}

		@Override
		public void setValue(Distribution obj, DateTimePeriod value) {
			obj.setOfferPeriod(value);
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingPeriodDistribution
	 * DateTimePeriod.mmTradingPeriodDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a financial instrument is available for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, DateTimePeriod> mmTradingPeriod = new MMBusinessAssociationEnd<Distribution, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmTradingPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Distribution obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(Distribution obj, DateTimePeriod value) {
			obj.setTradingPeriod(value);
		}
	};
	protected DateTimePeriod blockingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBlockingPeriodDistribution
	 * DateTimePeriod.mmBlockingPeriodDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period, set by the issuer, during which the security is blocked, ie, not available for exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, DateTimePeriod> mmBlockingPeriod = new MMBusinessAssociationEnd<Distribution, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriod";
			definition = "Period, set by the issuer, during which the security is blocked, ie, not available for exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmBlockingPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Distribution obj) {
			return obj.getBlockingPeriod();
		}

		@Override
		public void setValue(Distribution obj, DateTimePeriod value) {
			obj.setBlockingPeriod(value);
		}
	};
	protected DateTimePeriod interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCashDistribution
	 * DateTimePeriod.mmCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which interest has accrued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, DateTimePeriod> mmInterestPeriod = new MMBusinessAssociationEnd<Distribution, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which interest has accrued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Distribution obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(Distribution obj, DateTimePeriod value) {
			obj.setInterestPeriod(value);
		}
	};
	protected Tax distributionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
	 * Tax.mmRelatedCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the tax description associated with the corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, Tax> mmDistributionTax = new MMBusinessAssociationEnd<Distribution, Tax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionTax";
			definition = "Provides the tax description associated with the corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmRelatedCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(Distribution obj) {
			return obj.getDistributionTax();
		}

		@Override
		public void setValue(Distribution obj, Tax value) {
			obj.setDistributionTax(value);
		}
	};
	protected SecuritiesPricing offerPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDistribution
	 * SecuritiesPricing.mmDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price, determined by the offerer, at which the investor is entitled to take part in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, SecuritiesPricing> mmOfferPrice = new MMBusinessAssociationEnd<Distribution, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPrice";
			definition = "Price, determined by the offerer, at which the investor is entitled to take part in an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Distribution obj) {
			return obj.getOfferPrice();
		}

		@Override
		public void setValue(Distribution obj, SecuritiesPricing value) {
			obj.setOfferPrice(value);
		}
	};
	protected IncentivePremium incentivePremium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmCorporateActionDistribution
	 * IncentivePremium.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, Optional<IncentivePremium>> mmIncentivePremium = new MMBusinessAssociationEnd<Distribution, Optional<IncentivePremium>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> IncentivePremium.mmCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> IncentivePremium.mmObject();
		}

		@Override
		public Optional<IncentivePremium> getValue(Distribution obj) {
			return obj.getIncentivePremium();
		}

		@Override
		public void setValue(Distribution obj, Optional<IncentivePremium> value) {
			obj.setIncentivePremium(value.orElse(null));
		}
	};
	protected ISODateTime effectiveDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the event or part of the event, for example, an option, becomes valid and should be processed and/or applied to holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, ISODateTime> mmEffectiveDate = new MMBusinessAttribute<Distribution, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which the event or part of the event, for example, an option, becomes valid and should be processed and/or applied to holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Distribution obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(Distribution obj, ISODateTime value) {
			obj.setEffectiveDate(value);
		}
	};
	protected Max350Text eventConditions;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions that the issuer has placed on the completion of the event, for example, tender percentage required."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, Max350Text> mmEventConditions = new MMBusinessAttribute<Distribution, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventConditions";
			definition = "Conditions that the issuer has placed on the completion of the event, for example, tender percentage required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Distribution obj) {
			return obj.getEventConditions();
		}

		@Override
		public void setValue(Distribution obj, Max350Text value) {
			obj.setEventConditions(value);
		}
	};
	protected ISODateTime exDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, ISODateTime> mmExDate = new MMBusinessAttribute<Distribution, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Distribution obj) {
			return obj.getExDate();
		}

		@Override
		public void setValue(Distribution obj, ISODateTime value) {
			obj.setExDate(value);
		}
	};
	protected PercentageRate grossRate;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage paid before deductions and/or allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, PercentageRate> mmGrossRate = new MMBusinessAttribute<Distribution, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossRate";
			definition = "Percentage paid before deductions and/or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Distribution obj) {
			return obj.getGrossRate();
		}

		@Override
		public void setValue(Distribution obj, PercentageRate value) {
			obj.setGrossRate(value);
		}
	};
	protected ISODateTime meetingDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the meeting will take place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, ISODateTime> mmMeetingDate = new MMBusinessAttribute<Distribution, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingDate";
			definition = "Date/time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Distribution obj) {
			return obj.getMeetingDate();
		}

		@Override
		public void setValue(Distribution obj, ISODateTime value) {
			obj.setMeetingDate(value);
		}
	};
	protected PercentageRate netRate;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage paid after deductions and/or allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, PercentageRate> mmNetRate = new MMBusinessAttribute<Distribution, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetRate";
			definition = "Percentage paid after deductions and/or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Distribution obj) {
			return obj.getNetRate();
		}

		@Override
		public void setValue(Distribution obj, PercentageRate value) {
			obj.setNetRate(value);
		}
	};
	protected CurrencyAndAmount newFaceValue;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewFaceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New unit value of a debt security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, CurrencyAndAmount> mmNewFaceValue = new MMBusinessAttribute<Distribution, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewFaceValue";
			definition = "New unit value of a debt security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Distribution obj) {
			return obj.getNewFaceValue();
		}

		@Override
		public void setValue(Distribution obj, CurrencyAndAmount value) {
			obj.setNewFaceValue(value);
		}
	};
	protected CurrencyAndAmount newParValue;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New nominal value of an equity security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, CurrencyAndAmount> mmNewParValue = new MMBusinessAttribute<Distribution, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewParValue";
			definition = "New nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Distribution obj) {
			return obj.getNewParValue();
		}

		@Override
		public void setValue(Distribution obj, CurrencyAndAmount value) {
			obj.setNewParValue(value);
		}
	};
	protected ISODateTime paymentDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the distribution is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, ISODateTime> mmPaymentDate = new MMBusinessAttribute<Distribution, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Distribution obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(Distribution obj, ISODateTime value) {
			obj.setPaymentDate(value);
		}
	};
	protected Dividend dividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmRelatedDistribution
	 * Dividend.mmRelatedDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend per financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Distribution, Dividend> mmDividend = new MMBusinessAssociationEnd<Distribution, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmRelatedDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(Distribution obj) {
			return obj.getDividend();
		}

		@Override
		public void setValue(Distribution obj, Dividend value) {
			obj.setDividend(value);
		}
	};
	protected CorporateActionOptionCode corporateActionOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the choices offered to the holder of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, CorporateActionOptionCode> mmCorporateActionOption = new MMBusinessAttribute<Distribution, CorporateActionOptionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Specifies information about the choices offered to the holder of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		@Override
		public CorporateActionOptionCode getValue(Distribution obj) {
			return obj.getCorporateActionOption();
		}

		@Override
		public void setValue(Distribution obj, CorporateActionOptionCode value) {
			obj.setCorporateActionOption(value);
		}
	};
	protected CurrencyCode currencyOption;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency choice given to the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, CurrencyCode> mmCurrencyOption = new MMBusinessAttribute<Distribution, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Distribution obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(Distribution obj, CurrencyCode value) {
			obj.setCurrencyOption(value);
		}
	};
	protected CurrencyAndAmount decreaseAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount by which the issuer devalues a share  (in a decrease value event)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, CurrencyAndAmount> mmDecreaseAmount = new MMBusinessAttribute<Distribution, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecreaseAmount";
			definition = "Amount by which the issuer devalues a share  (in a decrease value event).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Distribution obj) {
			return obj.getDecreaseAmount();
		}

		@Override
		public void setValue(Distribution obj, CurrencyAndAmount value) {
			obj.setDecreaseAmount(value);
		}
	};
	protected PercentageRate decreaseRate;
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
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount, expressed as a percentage, by which the issuer devalues a share  (in a decrease value event)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, PercentageRate> mmDecreaseRate = new MMBusinessAttribute<Distribution, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecreaseRate";
			definition = "Amount, expressed as a percentage, by which the issuer devalues a share  (in a decrease value event).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Distribution obj) {
			return obj.getDecreaseRate();
		}

		@Override
		public void setValue(Distribution obj, PercentageRate value) {
			obj.setDecreaseRate(value);
		}
	};
	protected ISODateTime offerPriceFixingDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Distribution Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPriceFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an offer price is determined (as compared to its reset date if applicable)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Distribution, ISODateTime> mmOfferPriceFixingDate = new MMBusinessAttribute<Distribution, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Distribution obj) {
			return obj.getOfferPriceFixingDate();
		}

		@Override
		public void setValue(Distribution obj, ISODateTime value) {
			obj.setOfferPriceFixingDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Distribution";
				definition = "Distributions in cash and/or securities following a corporate event.";
				associationDomain_lazy = () -> Arrays.asList(Dividend.mmRelatedDistribution, SecuritiesPricing.mmDistribution, DateTimePeriod.mmExercisePeriodDistribution, DateTimePeriod.mmOfferPeriodDistribution,
						DateTimePeriod.mmTradingPeriodDistribution, DateTimePeriod.mmBlockingPeriodDistribution, DateTimePeriod.mmCashDistribution, Tax.mmRelatedCorporateActionDistribution, IncentivePremium.mmCorporateActionDistribution);
				subType_lazy = () -> Arrays.asList(CashDistribution.mmObject(), SecuritiesAndCashDistribution.mmObject(), SecuritiesDistribution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Distribution.mmExercisePeriod, com.tools20022.repository.entity.Distribution.mmOfferPeriod, com.tools20022.repository.entity.Distribution.mmTradingPeriod,
						com.tools20022.repository.entity.Distribution.mmBlockingPeriod, com.tools20022.repository.entity.Distribution.mmInterestPeriod, com.tools20022.repository.entity.Distribution.mmDistributionTax,
						com.tools20022.repository.entity.Distribution.mmOfferPrice, com.tools20022.repository.entity.Distribution.mmIncentivePremium, com.tools20022.repository.entity.Distribution.mmEffectiveDate,
						com.tools20022.repository.entity.Distribution.mmEventConditions, com.tools20022.repository.entity.Distribution.mmExDate, com.tools20022.repository.entity.Distribution.mmGrossRate,
						com.tools20022.repository.entity.Distribution.mmMeetingDate, com.tools20022.repository.entity.Distribution.mmNetRate, com.tools20022.repository.entity.Distribution.mmNewFaceValue,
						com.tools20022.repository.entity.Distribution.mmNewParValue, com.tools20022.repository.entity.Distribution.mmPaymentDate, com.tools20022.repository.entity.Distribution.mmDividend,
						com.tools20022.repository.entity.Distribution.mmCorporateActionOption, com.tools20022.repository.entity.Distribution.mmCurrencyOption, com.tools20022.repository.entity.Distribution.mmDecreaseAmount,
						com.tools20022.repository.entity.Distribution.mmDecreaseRate, com.tools20022.repository.entity.Distribution.mmOfferPriceFixingDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Distribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getExercisePeriod() {
		return exercisePeriod;
	}

	public Distribution setExercisePeriod(DateTimePeriod exercisePeriod) {
		this.exercisePeriod = Objects.requireNonNull(exercisePeriod);
		return this;
	}

	public DateTimePeriod getOfferPeriod() {
		return offerPeriod;
	}

	public Distribution setOfferPeriod(DateTimePeriod offerPeriod) {
		this.offerPeriod = Objects.requireNonNull(offerPeriod);
		return this;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public Distribution setTradingPeriod(DateTimePeriod tradingPeriod) {
		this.tradingPeriod = Objects.requireNonNull(tradingPeriod);
		return this;
	}

	public DateTimePeriod getBlockingPeriod() {
		return blockingPeriod;
	}

	public Distribution setBlockingPeriod(DateTimePeriod blockingPeriod) {
		this.blockingPeriod = Objects.requireNonNull(blockingPeriod);
		return this;
	}

	public DateTimePeriod getInterestPeriod() {
		return interestPeriod;
	}

	public Distribution setInterestPeriod(DateTimePeriod interestPeriod) {
		this.interestPeriod = Objects.requireNonNull(interestPeriod);
		return this;
	}

	public Tax getDistributionTax() {
		return distributionTax;
	}

	public Distribution setDistributionTax(Tax distributionTax) {
		this.distributionTax = Objects.requireNonNull(distributionTax);
		return this;
	}

	public SecuritiesPricing getOfferPrice() {
		return offerPrice;
	}

	public Distribution setOfferPrice(SecuritiesPricing offerPrice) {
		this.offerPrice = Objects.requireNonNull(offerPrice);
		return this;
	}

	public Optional<IncentivePremium> getIncentivePremium() {
		return incentivePremium == null ? Optional.empty() : Optional.of(incentivePremium);
	}

	public Distribution setIncentivePremium(IncentivePremium incentivePremium) {
		this.incentivePremium = incentivePremium;
		return this;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public Distribution setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = Objects.requireNonNull(effectiveDate);
		return this;
	}

	public Max350Text getEventConditions() {
		return eventConditions;
	}

	public Distribution setEventConditions(Max350Text eventConditions) {
		this.eventConditions = Objects.requireNonNull(eventConditions);
		return this;
	}

	public ISODateTime getExDate() {
		return exDate;
	}

	public Distribution setExDate(ISODateTime exDate) {
		this.exDate = Objects.requireNonNull(exDate);
		return this;
	}

	public PercentageRate getGrossRate() {
		return grossRate;
	}

	public Distribution setGrossRate(PercentageRate grossRate) {
		this.grossRate = Objects.requireNonNull(grossRate);
		return this;
	}

	public ISODateTime getMeetingDate() {
		return meetingDate;
	}

	public Distribution setMeetingDate(ISODateTime meetingDate) {
		this.meetingDate = Objects.requireNonNull(meetingDate);
		return this;
	}

	public PercentageRate getNetRate() {
		return netRate;
	}

	public Distribution setNetRate(PercentageRate netRate) {
		this.netRate = Objects.requireNonNull(netRate);
		return this;
	}

	public CurrencyAndAmount getNewFaceValue() {
		return newFaceValue;
	}

	public Distribution setNewFaceValue(CurrencyAndAmount newFaceValue) {
		this.newFaceValue = Objects.requireNonNull(newFaceValue);
		return this;
	}

	public CurrencyAndAmount getNewParValue() {
		return newParValue;
	}

	public Distribution setNewParValue(CurrencyAndAmount newParValue) {
		this.newParValue = Objects.requireNonNull(newParValue);
		return this;
	}

	public ISODateTime getPaymentDate() {
		return paymentDate;
	}

	public Distribution setPaymentDate(ISODateTime paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public Dividend getDividend() {
		return dividend;
	}

	public Distribution setDividend(Dividend dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public CorporateActionOptionCode getCorporateActionOption() {
		return corporateActionOption;
	}

	public Distribution setCorporateActionOption(CorporateActionOptionCode corporateActionOption) {
		this.corporateActionOption = Objects.requireNonNull(corporateActionOption);
		return this;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public Distribution setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = Objects.requireNonNull(currencyOption);
		return this;
	}

	public CurrencyAndAmount getDecreaseAmount() {
		return decreaseAmount;
	}

	public Distribution setDecreaseAmount(CurrencyAndAmount decreaseAmount) {
		this.decreaseAmount = Objects.requireNonNull(decreaseAmount);
		return this;
	}

	public PercentageRate getDecreaseRate() {
		return decreaseRate;
	}

	public Distribution setDecreaseRate(PercentageRate decreaseRate) {
		this.decreaseRate = Objects.requireNonNull(decreaseRate);
		return this;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return offerPriceFixingDate;
	}

	public Distribution setOfferPriceFixingDate(ISODateTime offerPriceFixingDate) {
		this.offerPriceFixingDate = Objects.requireNonNull(offerPriceFixingDate);
		return this;
	}
}