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
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions under which securities can be acquired as part of a
 * corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BiddingConditions" src="doc-files/BiddingConditions.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProposedRate
 * BiddingConditions.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#OversubscriptionRate
 * BiddingConditions.OversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#InformationToComplyWith
 * BiddingConditions.InformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#SubscriptionCostDebitDate
 * BiddingConditions.SubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
 * BiddingConditions.MaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProrationRate
 * BiddingConditions.ProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
 * BiddingConditions.ApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
 * BiddingConditions.FrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
 * BiddingConditions.BackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#TransformationRate
 * BiddingConditions.TransformationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProrationDate
 * BiddingConditions.ProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CompulsoryPurchasePeriod
 * BiddingConditions.CompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#PercentageSought
 * BiddingConditions.PercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BidInterval
 * BiddingConditions.BidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
 * BiddingConditions.MaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
 * BiddingConditions.MinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
 * BiddingConditions.MaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
 * BiddingConditions.MinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
 * BiddingConditions.BaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CalculationMethod
 * BiddingConditions.CalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#AdditionalSubscriptionCost
 * BiddingConditions.AdditionalSubscriptionCost}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#Event
 * BiddingConditions.Event}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BiddingConditions
 * DateTimePeriod.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
 * SecuritiesQuantity.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
 * CorporateActionEvent.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
 * RateAndAmount.RateBiddingConditions}</li>
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
 * "BiddingConditions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
 * </li>
 * </ul>
 */
public class BiddingConditions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate proposed in a remarketing of variable rate notes.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProposedRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate of allowed over-subscription.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OversubscriptionRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, eg, not open to US/Canadian residents, QIB or SIL to be
	 * provided.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InformationToComplyWith = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Date by which cash must be in place in order to take part in the event.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubscriptionCostDebitDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * A maximum percentage of shares available through the over subscription
	 * privilege, usually a percentage of the basic subscription shares, eg, an
	 * account owner subscribing to 100 shares may over subscribe to a maximum
	 * of 50 additional shares when the over subscription maximum is 50%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
	 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedOverSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumAllowedOverSubscription = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedOverSubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proportionate allocation used for the offer.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proportionate allocation used for the offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProrationRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
	 * RateAndAmount.RateBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applicable to the event announced, eg, redemption rate for a redemption event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ApplicableRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
	 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
	 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate used to determine the cash consideration split across outturn
	 * settlement transactions that are the result of a transformation of the
	 * parent transaction.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransformationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransformationRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date (and time) at which an issuer will determine the proration
	 * amount/quantity of an offer.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date (and time) at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProrationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BiddingConditions
	 * DateTimePeriod.BiddingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompulsoryPurchasePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during a take-over where any outstanding equity must be purchased by the take-over company."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CompulsoryPurchasePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageSought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageSought = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Acceptable price increment used for submitting a bid.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptable price increment used for submitting a bid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BidInterval = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
	 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
	 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum number of securities the offeror is requesting to complete the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
	 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of securities the offeror is requesting to complete the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Maximum number of securities the offeror is requesting to complete the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities the offeror/issuer will purchase or redeem
	 * under the terms of the event. This can be a number or the term
	 * "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
	 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantitySought = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
	 * SecuritiesQuantity.BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BaseDenomination = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The method of calculation of drawings and partial redemptions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The method of calculation of drawings and partial redemptions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
		}
	};
	/**
	 * Additional costs - coming on top of the subscription costs - which the
	 * subscriber should pay as per the subscription process.
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSubscriptionCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalSubscriptionCost = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalSubscriptionCost";
			definition = "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Event to which the bidding conditions apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
	 * CorporateActionEvent.BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event to which the bidding conditions apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Event to which the bidding conditions apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BiddingConditions";
				definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions,
						com.tools20022.repository.entity.DateTimePeriod.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BiddingConditions.ProposedRate, com.tools20022.repository.entity.BiddingConditions.OversubscriptionRate,
						com.tools20022.repository.entity.BiddingConditions.InformationToComplyWith, com.tools20022.repository.entity.BiddingConditions.SubscriptionCostDebitDate,
						com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ProrationRate, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.TransformationRate, com.tools20022.repository.entity.BiddingConditions.ProrationDate, com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod,
						com.tools20022.repository.entity.BiddingConditions.PercentageSought, com.tools20022.repository.entity.BiddingConditions.BidInterval, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought,
						com.tools20022.repository.entity.BiddingConditions.BaseDenomination, com.tools20022.repository.entity.BiddingConditions.CalculationMethod,
						com.tools20022.repository.entity.BiddingConditions.AdditionalSubscriptionCost, com.tools20022.repository.entity.BiddingConditions.Event);
			}
		});
		return mmObject_lazy.get();
	}
}