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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Period during which the right and/or privilege on an underlying financial
	 * instrument may be executed.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmExercisePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriod";
			definition = "Period during which the right and/or privilege on an underlying financial instrument may be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmExercisePeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod offerPeriod;
	/**
	 * Period during which an open offer remains valid.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOfferPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPeriod";
			definition = "Period during which an open offer remains valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmOfferPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmTradingPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod blockingPeriod;
	/**
	 * Period, set by the issuer, during which the security is blocked, ie, not
	 * available for exchange.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBlockingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriod";
			definition = "Period, set by the issuer, during which the security is blocked, ie, not available for exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBlockingPeriodDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod interestPeriod;
	/**
	 * Period during which interest has accrued.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInterestPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which interest has accrued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Tax distributionTax;
	/**
	 * Provides the tax description associated with the corporate event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDistributionTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionTax";
			definition = "Provides the tax description associated with the corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected SecuritiesPricing offerPrice;
	/**
	 * Price, determined by the offerer, at which the investor is entitled to
	 * take part in an event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOfferPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPrice";
			definition = "Price, determined by the offerer, at which the investor is entitled to take part in an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected IncentivePremium incentivePremium;
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 * <p>
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
	public static final MMBusinessAssociationEnd mmIncentivePremium = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	protected ISODateTime effectiveDate;
	/**
	 * Date/time at which the event or part of the event, for example, an
	 * option, becomes valid and should be processed and/or applied to holdings.
	 * <p>
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
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text eventConditions;
	/**
	 * Conditions that the issuer has placed on the completion of the event, for
	 * example, tender percentage required.
	 * <p>
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
	public static final MMBusinessAttribute mmEventConditions = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getEventConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime exDate;
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 * <p>
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
	public static final MMBusinessAttribute mmExDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getExDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate grossRate;
	/**
	 * Percentage paid before deductions and/or allowances have been made.
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
	public static final MMBusinessAttribute mmGrossRate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getGrossRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime meetingDate;
	/**
	 * Date/time at which the meeting will take place.
	 * <p>
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
	public static final MMBusinessAttribute mmMeetingDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getMeetingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate netRate;
	/**
	 * Percentage paid after deductions and/or allowances have been made.
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
	public static final MMBusinessAttribute mmNetRate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getNetRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount newFaceValue;
	/**
	 * New unit value of a debt security.
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
	public static final MMBusinessAttribute mmNewFaceValue = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getNewFaceValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount newParValue;
	/**
	 * New nominal value of an equity security.
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
	public static final MMBusinessAttribute mmNewParValue = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getNewParValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime paymentDate;
	/**
	 * Date/time at which the distribution is due to take place (cash and/or
	 * securities).
	 * <p>
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
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Dividend dividend;
	/**
	 * Dividend per financial instrument.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmRelatedDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected CorporateActionOptionCode corporateActionOption;
	/**
	 * Specifies information about the choices offered to the holder of a
	 * corporate action.
	 * <p>
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
	public static final MMBusinessAttribute mmCorporateActionOption = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getCorporateActionOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyOption;
	/**
	 * Currency choice given to the investor.
	 * <p>
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
	public static final MMBusinessAttribute mmCurrencyOption = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getCurrencyOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount decreaseAmount;
	/**
	 * Amount by which the issuer devalues a share (in a decrease value event).
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
	public static final MMBusinessAttribute mmDecreaseAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getDecreaseAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate decreaseRate;
	/**
	 * Amount, expressed as a percentage, by which the issuer devalues a share
	 * (in a decrease value event).
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
	public static final MMBusinessAttribute mmDecreaseRate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getDecreaseRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime offerPriceFixingDate;
	/**
	 * Date/time at which an offer price is determined (as compared to its reset
	 * date if applicable).
	 * <p>
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
	public static final MMBusinessAttribute mmOfferPriceFixingDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Distribution.class.getMethod("getOfferPriceFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Distribution";
				definition = "Distributions in cash and/or securities following a corporate event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmRelatedDistribution, com.tools20022.repository.entity.SecuritiesPricing.mmDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmExercisePeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmOfferPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmTradingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmBlockingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmCashDistribution, com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution,
						com.tools20022.repository.entity.IncentivePremium.mmCorporateActionDistribution);
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

	public void setExercisePeriod(com.tools20022.repository.entity.DateTimePeriod exercisePeriod) {
		this.exercisePeriod = exercisePeriod;
	}

	public DateTimePeriod getOfferPeriod() {
		return offerPeriod;
	}

	public void setOfferPeriod(com.tools20022.repository.entity.DateTimePeriod offerPeriod) {
		this.offerPeriod = offerPeriod;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public void setTradingPeriod(com.tools20022.repository.entity.DateTimePeriod tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
	}

	public DateTimePeriod getBlockingPeriod() {
		return blockingPeriod;
	}

	public void setBlockingPeriod(com.tools20022.repository.entity.DateTimePeriod blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
	}

	public DateTimePeriod getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(com.tools20022.repository.entity.DateTimePeriod interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public Tax getDistributionTax() {
		return distributionTax;
	}

	public void setDistributionTax(com.tools20022.repository.entity.Tax distributionTax) {
		this.distributionTax = distributionTax;
	}

	public SecuritiesPricing getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(com.tools20022.repository.entity.SecuritiesPricing offerPrice) {
		this.offerPrice = offerPrice;
	}

	public IncentivePremium getIncentivePremium() {
		return incentivePremium;
	}

	public void setIncentivePremium(com.tools20022.repository.entity.IncentivePremium incentivePremium) {
		this.incentivePremium = incentivePremium;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Max350Text getEventConditions() {
		return eventConditions;
	}

	public void setEventConditions(Max350Text eventConditions) {
		this.eventConditions = eventConditions;
	}

	public ISODateTime getExDate() {
		return exDate;
	}

	public void setExDate(ISODateTime exDate) {
		this.exDate = exDate;
	}

	public PercentageRate getGrossRate() {
		return grossRate;
	}

	public void setGrossRate(PercentageRate grossRate) {
		this.grossRate = grossRate;
	}

	public ISODateTime getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(ISODateTime meetingDate) {
		this.meetingDate = meetingDate;
	}

	public PercentageRate getNetRate() {
		return netRate;
	}

	public void setNetRate(PercentageRate netRate) {
		this.netRate = netRate;
	}

	public CurrencyAndAmount getNewFaceValue() {
		return newFaceValue;
	}

	public void setNewFaceValue(CurrencyAndAmount newFaceValue) {
		this.newFaceValue = newFaceValue;
	}

	public CurrencyAndAmount getNewParValue() {
		return newParValue;
	}

	public void setNewParValue(CurrencyAndAmount newParValue) {
		this.newParValue = newParValue;
	}

	public ISODateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Dividend getDividend() {
		return dividend;
	}

	public void setDividend(com.tools20022.repository.entity.Dividend dividend) {
		this.dividend = dividend;
	}

	public CorporateActionOptionCode getCorporateActionOption() {
		return corporateActionOption;
	}

	public void setCorporateActionOption(CorporateActionOptionCode corporateActionOption) {
		this.corporateActionOption = corporateActionOption;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	public CurrencyAndAmount getDecreaseAmount() {
		return decreaseAmount;
	}

	public void setDecreaseAmount(CurrencyAndAmount decreaseAmount) {
		this.decreaseAmount = decreaseAmount;
	}

	public PercentageRate getDecreaseRate() {
		return decreaseRate;
	}

	public void setDecreaseRate(PercentageRate decreaseRate) {
		this.decreaseRate = decreaseRate;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return offerPriceFixingDate;
	}

	public void setOfferPriceFixingDate(ISODateTime offerPriceFixingDate) {
		this.offerPriceFixingDate = offerPriceFixingDate;
	}
}