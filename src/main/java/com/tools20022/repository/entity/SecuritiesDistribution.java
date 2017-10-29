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
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics for a securities distribution event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesDistribution"
 * src="doc-files/SecuritiesDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MaximumHolding
 * SecuritiesDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingDenominator
 * SecuritiesDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingNumerator
 * SecuritiesDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MinimumHolding
 * SecuritiesDistribution.MinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#CashFractionsPrice
 * SecuritiesDistribution.CashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SubscriptionPrice
 * SecuritiesDistribution.SubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentPrice
 * SecuritiesDistribution.ReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateSecurityExpiryDate
 * SecuritiesDistribution.IntermediateSecurityExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#TradingAvailabilityDate
 * SecuritiesDistribution.TradingAvailabilityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#OfferExpiryDate
 * SecuritiesDistribution.OfferExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#OversubscriptionRate
 * SecuritiesDistribution.OversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#OversubscriptionAmount
 * SecuritiesDistribution.OversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentAmount
 * SecuritiesDistribution.ReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentRate
 * SecuritiesDistribution.ReinvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#LoyalityPremiumIndicator
 * SecuritiesDistribution.LoyalityPremiumIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#OversubscriptionIndicator
 * SecuritiesDistribution.OversubscriptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#RenounceableIndicator
 * SecuritiesDistribution.RenounceableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DecimalPrecision
 * SecuritiesDistribution.DecimalPrecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentType
 * SecuritiesDistribution.ReinvestmentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#RevocableIndicator
 * SecuritiesDistribution.RevocableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SecuritiesAndCashDistribution
 * SecuritiesDistribution.SecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#FractionTreatment
 * SecuritiesDistribution.FractionTreatment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateSecurityDistributionIndicator
 * SecuritiesDistribution.IntermediateSecurityDistributionIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#SecuritiesDistribution
 * SecuritiesAndCashDistribution.SecuritiesDistribution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Distribution
 * Distribution}</li>
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
 * "SecuritiesDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics for a securities distribution event."</li>
 * </ul>
 */
public class SecuritiesDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the maximum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingRelatedSecuritiesDistribution
	 * SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The quantity of interim securities awarded for a given quantity of underlying shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The quantity of interim securities awarded for a given quantity of underlying shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the minimum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingRelatedSecuritiesDistribution
	 * SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price paid by the issuer for the remaining fraction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashFractionsPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFractionsPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price paid by the issuer for the remaining fraction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashFractionsPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPrice";
			definition = "Price paid by the issuer for the remaining fraction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The amount of money required per unit for the purchase of an instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SuscriptionPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The amount of money required per unit for the purchase of an instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "The amount of money required per unit for the purchase of an instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price at which a cash disbursement will be reinvested into a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ReinvestmentPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price at which a cash disbursement will be reinvested into a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReinvestmentPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPrice";
			definition = "Price at which a cash disbursement will be reinvested into a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time at which a privilege or an intermediate security is no longer
	 * available.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecurityExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a privilege or an intermediate security is no longer available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IntermediateSecurityExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityExpiryDate";
			definition = "Date/time at which a privilege or an intermediate security is no longer available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which a security starts or resumes trading.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingAvailabilityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which a security starts or resumes trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingAvailabilityDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingAvailabilityDate";
			definition = "Date/time at which a security starts or resumes trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which a privilege or a security is no longer available.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a privilege or a security is no longer available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OfferExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferExpiryDate";
			definition = "Date/time at which a privilege or a security is no longer available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate of oversubscription allowed by the issuer.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of oversubscription allowed by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OversubscriptionRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of oversubscription allowed by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of oversubscription allowed by the issuer.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of oversubscription allowed by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OversubscriptionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionAmount";
			definition = "Amount of oversubscription allowed by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount at which a cash disbursement will be reinvested into a security.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount at which a cash disbursement will be reinvested into a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount at which a cash disbursement will be reinvested into a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate at which a cash disbursement will be reinvested into a security.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which a cash disbursement will be reinvested into a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentRate";
			definition = "Rate at which a cash disbursement will be reinvested into a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Dividend, in addition to regular dividends, payable to loyal (time, size,
	 * amount) investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoyalityPremiumIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend, in addition to regular dividends, payable to loyal (time, size, amount) investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LoyalityPremiumIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoyalityPremiumIndicator";
			definition = "Dividend, in addition to regular dividends, payable to loyal (time, size, amount) investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the event permits the holder to subscribe to more
	 * securities than the underlying position allows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the event permits the holder to subscribe to more securities than the underlying position allows."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OversubscriptionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionIndicator";
			definition = "Indicates that the event permits the holder to subscribe to more securities than the underlying position allows.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the intermediate securities held by the beneficial
	 * owner or agent can be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the intermediate securities held by the beneficial owner or agent can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RenounceableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenounceableIndicator";
			definition = "Indicates whether the intermediate securities held by the beneficial owner or agent can be sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the number of digits to the right of the decimal point.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecimalPrecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the number of digits to the right of the decimal point."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DecimalPrecision = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecimalPrecision";
			definition = "Indicates the number of digits to the right of the decimal point.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies whether the investment will be net or gross.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the investment will be net or gross."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentType";
			definition = "Specifies whether the investment will be net or gross.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Action or event can be reversed at anytime, or otherwise annulled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action or event can be reversed at anytime, or otherwise annulled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RevocableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevocableIndicator";
			definition = "Action or event can be reversed at anytime, or otherwise annulled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Distribution for which the cash distribution elements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#SecuritiesDistribution
	 * SecuritiesAndCashDistribution.SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAndCashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution for which the cash distribution elements are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how the fractions will be treated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionTreatment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how the fractions will be treated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FractionTreatment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies how the fractions will be treated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Indicates whether there will be a distribution of intermediate securities
	 * or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecurityDistributionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there will be a distribution of intermediate securities or privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IntermediateSecurityDistributionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityDistributionIndicator";
			definition = "Indicates whether there will be a distribution of intermediate securities or privilege.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDistribution";
				definition = "Characteristics for a securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding,
						com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateSecurityExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.TradingAvailabilityDate, com.tools20022.repository.entity.SecuritiesDistribution.OfferExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionRate, com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionAmount,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentAmount, com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentRate,
						com.tools20022.repository.entity.SecuritiesDistribution.LoyalityPremiumIndicator, com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.RenounceableIndicator, com.tools20022.repository.entity.SecuritiesDistribution.DecimalPrecision,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentType, com.tools20022.repository.entity.SecuritiesDistribution.RevocableIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution, com.tools20022.repository.entity.SecuritiesDistribution.FractionTreatment,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateSecurityDistributionIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}