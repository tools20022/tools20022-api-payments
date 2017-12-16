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
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
 * BiddingConditions.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
 * BiddingConditions.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
 * BiddingConditions.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
 * BiddingConditions.mmProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
 * BiddingConditions.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
 * BiddingConditions.mmBackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmTransformationRate
 * BiddingConditions.mmTransformationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
 * BiddingConditions.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmPercentageSought
 * BiddingConditions.mmPercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBidInterval
 * BiddingConditions.mmBidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
 * BiddingConditions.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
 * BiddingConditions.mmMinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
 * BiddingConditions.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
 * BiddingConditions.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
 * BiddingConditions.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCalculationMethod
 * BiddingConditions.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmAdditionalSubscriptionCost
 * BiddingConditions.mmAdditionalSubscriptionCost}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
 * BiddingConditions.mmEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
 * DateTimePeriod.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
 * SecuritiesQuantity.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
 * CorporateActionEvent.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
 * RateAndAmount.mmRateBiddingConditions}</li>
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
 * "BiddingConditions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
 * </li>
 * </ul>
 */
public class BiddingConditions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate proposedRate;
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
	public static final MMBusinessAttribute mmProposedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getProposedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate oversubscriptionRate;
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
	public static final MMBusinessAttribute mmOversubscriptionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getOversubscriptionRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text informationToComplyWith;
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
	public static final MMBusinessAttribute mmInformationToComplyWith = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getInformationToComplyWith", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime subscriptionCostDebitDate;
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
	public static final MMBusinessAttribute mmSubscriptionCostDebitDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getSubscriptionCostDebitDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount maximumAllowedOverSubscription;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
	 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumAllowedOverSubscription = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedOverSubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected PercentageRate prorationRate;
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
	public static final MMBusinessAttribute mmProrationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getProrationRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount applicableRate;
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
	 * RateAndAmount.mmRateBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmApplicableRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected SecuritiesQuantity frontEndOddLotQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
	 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmFrontEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmFrontEndOddLotBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity backEndOddLotQuantity;
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
	 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmBackEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmBackEndOddLotBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected PercentageRate transformationRate;
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
	public static final MMBusinessAttribute mmTransformationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getTransformationRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime prorationDate;
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
	public static final MMBusinessAttribute mmProrationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getProrationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod compulsoryPurchasePeriod;
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
	 * DateTimePeriod.mmBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmCompulsoryPurchasePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PercentageRate percentageSought;
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
	public static final MMBusinessAttribute mmPercentageSought = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getPercentageSought", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount bidInterval;
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
	public static final MMBusinessAttribute mmBidInterval = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getBidInterval", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPricing maximumPrice;
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
	 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing minimumPrice;
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
	 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesQuantity maximumQuantity;
	/**
	 * Maximum number of securities the offeror is requesting to complete the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
	 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Maximum number of securities the offeror is requesting to complete the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumQuantitySought;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
	 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantitySought = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity baseDenomination;
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
	 * SecuritiesQuantity.mmBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmBaseDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionCalculationMethodCode calculationMethod;
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
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getCalculationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount additionalSubscriptionCost;
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
	public static final MMBusinessAttribute mmAdditionalSubscriptionCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalSubscriptionCost";
			definition = "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BiddingConditions.class.getMethod("getAdditionalSubscriptionCost", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent event;
	/**
	 * Event to which the bidding conditions apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
	 * CorporateActionEvent.mmBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Event to which the bidding conditions apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BiddingConditions";
				definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions,
						com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmBackEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.mmBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.mmFrontEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions, com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BiddingConditions.mmProposedRate, com.tools20022.repository.entity.BiddingConditions.mmOversubscriptionRate,
						com.tools20022.repository.entity.BiddingConditions.mmInformationToComplyWith, com.tools20022.repository.entity.BiddingConditions.mmSubscriptionCostDebitDate,
						com.tools20022.repository.entity.BiddingConditions.mmMaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.mmProrationRate,
						com.tools20022.repository.entity.BiddingConditions.mmApplicableRate, com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.mmTransformationRate,
						com.tools20022.repository.entity.BiddingConditions.mmProrationDate, com.tools20022.repository.entity.BiddingConditions.mmCompulsoryPurchasePeriod,
						com.tools20022.repository.entity.BiddingConditions.mmPercentageSought, com.tools20022.repository.entity.BiddingConditions.mmBidInterval, com.tools20022.repository.entity.BiddingConditions.mmMaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.mmMinimumPrice, com.tools20022.repository.entity.BiddingConditions.mmMaximumQuantity, com.tools20022.repository.entity.BiddingConditions.mmMinimumQuantitySought,
						com.tools20022.repository.entity.BiddingConditions.mmBaseDenomination, com.tools20022.repository.entity.BiddingConditions.mmCalculationMethod,
						com.tools20022.repository.entity.BiddingConditions.mmAdditionalSubscriptionCost, com.tools20022.repository.entity.BiddingConditions.mmEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BiddingConditions.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getProposedRate() {
		return proposedRate;
	}

	public void setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
	}

	public PercentageRate getOversubscriptionRate() {
		return oversubscriptionRate;
	}

	public void setOversubscriptionRate(PercentageRate oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
	}

	public Max350Text getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(Max350Text informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	public ISODateTime getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(ISODateTime subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
	}

	public RateAndAmount getMaximumAllowedOverSubscription() {
		return maximumAllowedOverSubscription;
	}

	public void setMaximumAllowedOverSubscription(com.tools20022.repository.entity.RateAndAmount maximumAllowedOverSubscription) {
		this.maximumAllowedOverSubscription = maximumAllowedOverSubscription;
	}

	public PercentageRate getProrationRate() {
		return prorationRate;
	}

	public void setProrationRate(PercentageRate prorationRate) {
		this.prorationRate = prorationRate;
	}

	public RateAndAmount getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(com.tools20022.repository.entity.RateAndAmount applicableRate) {
		this.applicableRate = applicableRate;
	}

	public SecuritiesQuantity getFrontEndOddLotQuantity() {
		return frontEndOddLotQuantity;
	}

	public void setFrontEndOddLotQuantity(com.tools20022.repository.entity.SecuritiesQuantity frontEndOddLotQuantity) {
		this.frontEndOddLotQuantity = frontEndOddLotQuantity;
	}

	public SecuritiesQuantity getBackEndOddLotQuantity() {
		return backEndOddLotQuantity;
	}

	public void setBackEndOddLotQuantity(com.tools20022.repository.entity.SecuritiesQuantity backEndOddLotQuantity) {
		this.backEndOddLotQuantity = backEndOddLotQuantity;
	}

	public PercentageRate getTransformationRate() {
		return transformationRate;
	}

	public void setTransformationRate(PercentageRate transformationRate) {
		this.transformationRate = transformationRate;
	}

	public ISODateTime getProrationDate() {
		return prorationDate;
	}

	public void setProrationDate(ISODateTime prorationDate) {
		this.prorationDate = prorationDate;
	}

	public DateTimePeriod getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod;
	}

	public void setCompulsoryPurchasePeriod(com.tools20022.repository.entity.DateTimePeriod compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
	}

	public PercentageRate getPercentageSought() {
		return percentageSought;
	}

	public void setPercentageSought(PercentageRate percentageSought) {
		this.percentageSought = percentageSought;
	}

	public CurrencyAndAmount getBidInterval() {
		return bidInterval;
	}

	public void setBidInterval(CurrencyAndAmount bidInterval) {
		this.bidInterval = bidInterval;
	}

	public SecuritiesPricing getMaximumPrice() {
		return maximumPrice;
	}

	public void setMaximumPrice(com.tools20022.repository.entity.SecuritiesPricing maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public SecuritiesPricing getMinimumPrice() {
		return minimumPrice;
	}

	public void setMinimumPrice(com.tools20022.repository.entity.SecuritiesPricing minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public SecuritiesQuantity getMaximumQuantity() {
		return maximumQuantity;
	}

	public void setMaximumQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public SecuritiesQuantity getMinimumQuantitySought() {
		return minimumQuantitySought;
	}

	public void setMinimumQuantitySought(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantitySought) {
		this.minimumQuantitySought = minimumQuantitySought;
	}

	public SecuritiesQuantity getBaseDenomination() {
		return baseDenomination;
	}

	public void setBaseDenomination(com.tools20022.repository.entity.SecuritiesQuantity baseDenomination) {
		this.baseDenomination = baseDenomination;
	}

	public CorporateActionCalculationMethodCode getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(CorporateActionCalculationMethodCode calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public CurrencyAndAmount getAdditionalSubscriptionCost() {
		return additionalSubscriptionCost;
	}

	public void setAdditionalSubscriptionCost(CurrencyAndAmount additionalSubscriptionCost) {
		this.additionalSubscriptionCost = additionalSubscriptionCost;
	}

	public CorporateActionEvent getEvent() {
		return event;
	}

	public void setEvent(com.tools20022.repository.entity.CorporateActionEvent event) {
		this.event = event;
	}
}