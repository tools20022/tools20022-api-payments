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
import com.tools20022.repository.codeset.CorporateActionOptionCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
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
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#ExercisePeriod
 * Distribution.ExercisePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#OfferPeriod
 * Distribution.OfferPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#TradingPeriod
 * Distribution.TradingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#BlockingPeriod
 * Distribution.BlockingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#InterestPeriod
 * Distribution.InterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#DistributionTax
 * Distribution.DistributionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#OfferPrice
 * Distribution.OfferPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#IncentivePremium
 * Distribution.IncentivePremium}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#EffectiveDate
 * Distribution.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#EventConditions
 * Distribution.EventConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#ExDate
 * Distribution.ExDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#GrossRate
 * Distribution.GrossRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#MeetingDate
 * Distribution.MeetingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#NetRate
 * Distribution.NetRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#NewFaceValue
 * Distribution.NewFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#NewParValue
 * Distribution.NewParValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#PaymentDate
 * Distribution.PaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#Dividend
 * Distribution.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#CorporateActionOption
 * Distribution.CorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#CurrencyOption
 * Distribution.CurrencyOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#DecreaseAmount
 * Distribution.DecreaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#DecreaseRate
 * Distribution.DecreaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#OfferPriceFixingDate
 * Distribution.OfferPriceFixingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#RelatedDistribution
 * Dividend.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Distribution
 * SecuritiesPricing.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExercisePeriodDistribution
 * DateTimePeriod.ExercisePeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#OfferPeriodDistribution
 * DateTimePeriod.OfferPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingPeriodDistribution
 * DateTimePeriod.TradingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BlockingPeriodDistribution
 * DateTimePeriod.BlockingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CashDistribution
 * DateTimePeriod.CashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedCorporateActionDistribution
 * Tax.RelatedCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#CorporateActionDistribution
 * IncentivePremium.CorporateActionDistribution}</li>
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
	/**
	 * Period during which the right and/or privilege on an underlying financial
	 * instrument may be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExercisePeriodDistribution
	 * DateTimePeriod.ExercisePeriodDistribution}</li>
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
	public static final MMBusinessAssociationEnd ExercisePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriod";
			definition = "Period during which the right and/or privilege on an underlying financial instrument may be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which an open offer remains valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#OfferPeriodDistribution
	 * DateTimePeriod.OfferPeriodDistribution}</li>
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
	public static final MMBusinessAssociationEnd OfferPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPeriod";
			definition = "Period during which an open offer remains valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#TradingPeriodDistribution
	 * DateTimePeriod.TradingPeriodDistribution}</li>
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
	public static final MMBusinessAssociationEnd TradingPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period, set by the issuer, during which the security is blocked, ie, not
	 * available for exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BlockingPeriodDistribution
	 * DateTimePeriod.BlockingPeriodDistribution}</li>
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
	public static final MMBusinessAssociationEnd BlockingPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriod";
			definition = "Period, set by the issuer, during which the security is blocked, ie, not available for exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which interest has accrued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CashDistribution
	 * DateTimePeriod.CashDistribution}</li>
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
	public static final MMBusinessAssociationEnd InterestPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which interest has accrued.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the tax description associated with the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#RelatedCorporateActionDistribution
	 * Tax.RelatedCorporateActionDistribution}</li>
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
	public static final MMBusinessAssociationEnd DistributionTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionTax";
			definition = "Provides the tax description associated with the corporate event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price, determined by the offerer, at which the investor is entitled to
	 * take part in an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Distribution
	 * SecuritiesPricing.Distribution}</li>
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
	public static final MMBusinessAssociationEnd OfferPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPrice";
			definition = "Price, determined by the offerer, at which the investor is entitled to take part in an event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#CorporateActionDistribution
	 * IncentivePremium.CorporateActionDistribution}</li>
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
	public static final MMBusinessAssociationEnd IncentivePremium = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which the event or part of the event, for example, an option, becomes valid and should be processed and/or applied to holdings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute EventConditions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventConditions";
			definition = "Conditions that the issuer has placed on the completion of the event, for example, tender percentage required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ExDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute GrossRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossRate";
			definition = "Percentage paid before deductions and/or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MeetingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingDate";
			definition = "Date/time at which the meeting will take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NetRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetRate";
			definition = "Percentage paid after deductions and/or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NewFaceValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewFaceValue";
			definition = "New unit value of a debt security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NewParValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewParValue";
			definition = "New nominal value of an equity security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Dividend per financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#RelatedDistribution
	 * Dividend.RelatedDistribution}</li>
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
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.RelatedDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute CorporateActionOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Specifies information about the choices offered to the holder of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CurrencyOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DecreaseAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecreaseAmount";
			definition = "Amount by which the issuer devalues a share  (in a decrease value event).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DecreaseRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecreaseRate";
			definition = "Amount, expressed as a percentage, by which the issuer devalues a share  (in a decrease value event).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute OfferPriceFixingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Distribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Distribution";
				definition = "Distributions in cash and/or securities following a corporate event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.RelatedDistribution, com.tools20022.repository.entity.SecuritiesPricing.Distribution,
						com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.CashDistribution, com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution,
						com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution);
				subType_lazy = () -> Arrays.asList(CashDistribution.mmObject(), SecuritiesAndCashDistribution.mmObject(), SecuritiesDistribution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Distribution.ExercisePeriod, com.tools20022.repository.entity.Distribution.OfferPeriod, com.tools20022.repository.entity.Distribution.TradingPeriod,
						com.tools20022.repository.entity.Distribution.BlockingPeriod, com.tools20022.repository.entity.Distribution.InterestPeriod, com.tools20022.repository.entity.Distribution.DistributionTax,
						com.tools20022.repository.entity.Distribution.OfferPrice, com.tools20022.repository.entity.Distribution.IncentivePremium, com.tools20022.repository.entity.Distribution.EffectiveDate,
						com.tools20022.repository.entity.Distribution.EventConditions, com.tools20022.repository.entity.Distribution.ExDate, com.tools20022.repository.entity.Distribution.GrossRate,
						com.tools20022.repository.entity.Distribution.MeetingDate, com.tools20022.repository.entity.Distribution.NetRate, com.tools20022.repository.entity.Distribution.NewFaceValue,
						com.tools20022.repository.entity.Distribution.NewParValue, com.tools20022.repository.entity.Distribution.PaymentDate, com.tools20022.repository.entity.Distribution.Dividend,
						com.tools20022.repository.entity.Distribution.CorporateActionOption, com.tools20022.repository.entity.Distribution.CurrencyOption, com.tools20022.repository.entity.Distribution.DecreaseAmount,
						com.tools20022.repository.entity.Distribution.DecreaseRate, com.tools20022.repository.entity.Distribution.OfferPriceFixingDate);
			}
		});
		return mmObject_lazy.get();
	}
}