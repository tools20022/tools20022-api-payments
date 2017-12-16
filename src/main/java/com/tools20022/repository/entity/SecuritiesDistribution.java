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
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Distribution;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Distribution
 * Distribution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMaximumHolding
 * SecuritiesDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMinimumHolding
 * SecuritiesDistribution.mmMinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
 * SecuritiesDistribution.mmCashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
 * SecuritiesDistribution.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
 * SecuritiesDistribution.mmReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateSecurityExpiryDate
 * SecuritiesDistribution.mmIntermediateSecurityExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmTradingAvailabilityDate
 * SecuritiesDistribution.mmTradingAvailabilityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmOfferExpiryDate
 * SecuritiesDistribution.mmOfferExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmOversubscriptionRate
 * SecuritiesDistribution.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmOversubscriptionAmount
 * SecuritiesDistribution.mmOversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentAmount
 * SecuritiesDistribution.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentRate
 * SecuritiesDistribution.mmReinvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmLoyalityPremiumIndicator
 * SecuritiesDistribution.mmLoyalityPremiumIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmOversubscriptionIndicator
 * SecuritiesDistribution.mmOversubscriptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmRenounceableIndicator
 * SecuritiesDistribution.mmRenounceableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDecimalPrecision
 * SecuritiesDistribution.mmDecimalPrecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentType
 * SecuritiesDistribution.mmReinvestmentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmRevocableIndicator
 * SecuritiesDistribution.mmRevocableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSecuritiesAndCashDistribution
 * SecuritiesDistribution.mmSecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmFractionTreatment
 * SecuritiesDistribution.mmFractionTreatment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateSecurityDistributionIndicator
 * SecuritiesDistribution.mmIntermediateSecurityDistributionIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmSecuritiesDistribution
 * SecuritiesAndCashDistribution.mmSecuritiesDistribution}</li>
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
 * "SecuritiesDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics for a securities distribution event."</li>
 * </ul>
 */
public class SecuritiesDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity maximumHolding;
	/**
	 * Indicates the maximum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingRelatedSecuritiesDistribution
	 * SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> intermediateToUnderlyingNumerator;
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> intermediateToUnderlyingDenominator;
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> distributedToUnderlyingDenominator;
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> distributedToUnderlyingNumerator;
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
	 * SecuritiesQuantity.
	 * mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumHolding;
	/**
	 * Indicates the minimum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingRelatedSecuritiesDistribution
	 * SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesPricing cashFractionsPrice;
	/**
	 * Price paid by the issuer for the remaining fraction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashFractionsPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmCashFractionsPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPrice";
			definition = "Price paid by the issuer for the remaining fraction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing subscriptionPrice;
	/**
	 * The amount of money required per unit for the purchase of an instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSuscriptionPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmSubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "The amount of money required per unit for the purchase of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing reinvestmentPrice;
	/**
	 * Price at which a cash disbursement will be reinvested into a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmReinvestmentPriceRelatedSecuritiesDistribution
	 * SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmReinvestmentPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPrice";
			definition = "Price at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected ISODateTime intermediateSecurityExpiryDate;
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
	public static final MMBusinessAttribute mmIntermediateSecurityExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityExpiryDate";
			definition = "Date/time at which a privilege or an intermediate security is no longer available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getIntermediateSecurityExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime tradingAvailabilityDate;
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
	public static final MMBusinessAttribute mmTradingAvailabilityDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingAvailabilityDate";
			definition = "Date/time at which a security starts or resumes trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getTradingAvailabilityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime offerExpiryDate;
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
	public static final MMBusinessAttribute mmOfferExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferExpiryDate";
			definition = "Date/time at which a privilege or a security is no longer available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getOfferExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate oversubscriptionRate;
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
	public static final MMBusinessAttribute mmOversubscriptionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of oversubscription allowed by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getOversubscriptionRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount oversubscriptionAmount;
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
	public static final MMBusinessAttribute mmOversubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionAmount";
			definition = "Amount of oversubscription allowed by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getOversubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount reinvestmentAmount;
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
	public static final MMBusinessAttribute mmReinvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getReinvestmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate reinvestmentRate;
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
	public static final MMBusinessAttribute mmReinvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentRate";
			definition = "Rate at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getReinvestmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator loyalityPremiumIndicator;
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
	public static final MMBusinessAttribute mmLoyalityPremiumIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LoyalityPremiumIndicator";
			definition = "Dividend, in addition to regular dividends, payable to loyal (time, size, amount) investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getLoyalityPremiumIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator oversubscriptionIndicator;
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
	public static final MMBusinessAttribute mmOversubscriptionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionIndicator";
			definition = "Indicates that the event permits the holder to subscribe to more securities than the underlying position allows.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getOversubscriptionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator renounceableIndicator;
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
	public static final MMBusinessAttribute mmRenounceableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RenounceableIndicator";
			definition = "Indicates whether the intermediate securities held by the beneficial owner or agent can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getRenounceableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number decimalPrecision;
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
	public static final MMBusinessAttribute mmDecimalPrecision = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecimalPrecision";
			definition = "Indicates the number of digits to the right of the decimal point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getDecimalPrecision", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentTypeCode reinvestmentType;
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
	public static final MMBusinessAttribute mmReinvestmentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentType";
			definition = "Specifies whether the investment will be net or gross.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getReinvestmentType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator revocableIndicator;
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
	public static final MMBusinessAttribute mmRevocableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevocableIndicator";
			definition = "Action or event can be reversed at anytime, or otherwise annulled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getRevocableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAndCashDistribution securitiesAndCashDistribution;
	/**
	 * Distribution for which the cash distribution elements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmSecuritiesDistribution
	 * SecuritiesAndCashDistribution.mmSecuritiesDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected RoundingDirectionCode fractionTreatment;
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
	public static final MMBusinessAttribute mmFractionTreatment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies how the fractions will be treated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getFractionTreatment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator intermediateSecurityDistributionIndicator;
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
	public static final MMBusinessAttribute mmIntermediateSecurityDistributionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityDistributionIndicator";
			definition = "Indicates whether there will be a distribution of intermediate securities or privilege.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesDistribution.class.getMethod("getIntermediateSecurityDistributionIndicator", new Class[]{});
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
				name = "SecuritiesDistribution";
				definition = "Characteristics for a securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmSecuritiesDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDistribution.mmMaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.mmMinimumHolding,
						com.tools20022.repository.entity.SecuritiesDistribution.mmCashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.mmSubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentPrice, com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateSecurityExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.mmTradingAvailabilityDate, com.tools20022.repository.entity.SecuritiesDistribution.mmOfferExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.mmOversubscriptionRate, com.tools20022.repository.entity.SecuritiesDistribution.mmOversubscriptionAmount,
						com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentAmount, com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentRate,
						com.tools20022.repository.entity.SecuritiesDistribution.mmLoyalityPremiumIndicator, com.tools20022.repository.entity.SecuritiesDistribution.mmOversubscriptionIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmRenounceableIndicator, com.tools20022.repository.entity.SecuritiesDistribution.mmDecimalPrecision,
						com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentType, com.tools20022.repository.entity.SecuritiesDistribution.mmRevocableIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmSecuritiesAndCashDistribution, com.tools20022.repository.entity.SecuritiesDistribution.mmFractionTreatment,
						com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateSecurityDistributionIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesDistribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getMaximumHolding() {
		return maximumHolding;
	}

	public void setMaximumHolding(com.tools20022.repository.entity.SecuritiesQuantity maximumHolding) {
		this.maximumHolding = maximumHolding;
	}

	public List<SecuritiesQuantity> getIntermediateToUnderlyingNumerator() {
		return intermediateToUnderlyingNumerator;
	}

	public void setIntermediateToUnderlyingNumerator(List<com.tools20022.repository.entity.SecuritiesQuantity> intermediateToUnderlyingNumerator) {
		this.intermediateToUnderlyingNumerator = intermediateToUnderlyingNumerator;
	}

	public List<SecuritiesQuantity> getIntermediateToUnderlyingDenominator() {
		return intermediateToUnderlyingDenominator;
	}

	public void setIntermediateToUnderlyingDenominator(List<com.tools20022.repository.entity.SecuritiesQuantity> intermediateToUnderlyingDenominator) {
		this.intermediateToUnderlyingDenominator = intermediateToUnderlyingDenominator;
	}

	public List<SecuritiesQuantity> getDistributedToUnderlyingDenominator() {
		return distributedToUnderlyingDenominator;
	}

	public void setDistributedToUnderlyingDenominator(List<com.tools20022.repository.entity.SecuritiesQuantity> distributedToUnderlyingDenominator) {
		this.distributedToUnderlyingDenominator = distributedToUnderlyingDenominator;
	}

	public List<SecuritiesQuantity> getDistributedToUnderlyingNumerator() {
		return distributedToUnderlyingNumerator;
	}

	public void setDistributedToUnderlyingNumerator(List<com.tools20022.repository.entity.SecuritiesQuantity> distributedToUnderlyingNumerator) {
		this.distributedToUnderlyingNumerator = distributedToUnderlyingNumerator;
	}

	public SecuritiesQuantity getMinimumHolding() {
		return minimumHolding;
	}

	public void setMinimumHolding(com.tools20022.repository.entity.SecuritiesQuantity minimumHolding) {
		this.minimumHolding = minimumHolding;
	}

	public SecuritiesPricing getCashFractionsPrice() {
		return cashFractionsPrice;
	}

	public void setCashFractionsPrice(com.tools20022.repository.entity.SecuritiesPricing cashFractionsPrice) {
		this.cashFractionsPrice = cashFractionsPrice;
	}

	public SecuritiesPricing getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(com.tools20022.repository.entity.SecuritiesPricing subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public SecuritiesPricing getReinvestmentPrice() {
		return reinvestmentPrice;
	}

	public void setReinvestmentPrice(com.tools20022.repository.entity.SecuritiesPricing reinvestmentPrice) {
		this.reinvestmentPrice = reinvestmentPrice;
	}

	public ISODateTime getIntermediateSecurityExpiryDate() {
		return intermediateSecurityExpiryDate;
	}

	public void setIntermediateSecurityExpiryDate(ISODateTime intermediateSecurityExpiryDate) {
		this.intermediateSecurityExpiryDate = intermediateSecurityExpiryDate;
	}

	public ISODateTime getTradingAvailabilityDate() {
		return tradingAvailabilityDate;
	}

	public void setTradingAvailabilityDate(ISODateTime tradingAvailabilityDate) {
		this.tradingAvailabilityDate = tradingAvailabilityDate;
	}

	public ISODateTime getOfferExpiryDate() {
		return offerExpiryDate;
	}

	public void setOfferExpiryDate(ISODateTime offerExpiryDate) {
		this.offerExpiryDate = offerExpiryDate;
	}

	public PercentageRate getOversubscriptionRate() {
		return oversubscriptionRate;
	}

	public void setOversubscriptionRate(PercentageRate oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
	}

	public CurrencyAndAmount getOversubscriptionAmount() {
		return oversubscriptionAmount;
	}

	public void setOversubscriptionAmount(CurrencyAndAmount oversubscriptionAmount) {
		this.oversubscriptionAmount = oversubscriptionAmount;
	}

	public CurrencyAndAmount getReinvestmentAmount() {
		return reinvestmentAmount;
	}

	public void setReinvestmentAmount(CurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
	}

	public BaseOneRate getReinvestmentRate() {
		return reinvestmentRate;
	}

	public void setReinvestmentRate(BaseOneRate reinvestmentRate) {
		this.reinvestmentRate = reinvestmentRate;
	}

	public YesNoIndicator getLoyalityPremiumIndicator() {
		return loyalityPremiumIndicator;
	}

	public void setLoyalityPremiumIndicator(YesNoIndicator loyalityPremiumIndicator) {
		this.loyalityPremiumIndicator = loyalityPremiumIndicator;
	}

	public YesNoIndicator getOversubscriptionIndicator() {
		return oversubscriptionIndicator;
	}

	public void setOversubscriptionIndicator(YesNoIndicator oversubscriptionIndicator) {
		this.oversubscriptionIndicator = oversubscriptionIndicator;
	}

	public YesNoIndicator getRenounceableIndicator() {
		return renounceableIndicator;
	}

	public void setRenounceableIndicator(YesNoIndicator renounceableIndicator) {
		this.renounceableIndicator = renounceableIndicator;
	}

	public Number getDecimalPrecision() {
		return decimalPrecision;
	}

	public void setDecimalPrecision(Number decimalPrecision) {
		this.decimalPrecision = decimalPrecision;
	}

	public PaymentTypeCode getReinvestmentType() {
		return reinvestmentType;
	}

	public void setReinvestmentType(PaymentTypeCode reinvestmentType) {
		this.reinvestmentType = reinvestmentType;
	}

	public YesNoIndicator getRevocableIndicator() {
		return revocableIndicator;
	}

	public void setRevocableIndicator(YesNoIndicator revocableIndicator) {
		this.revocableIndicator = revocableIndicator;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return securitiesAndCashDistribution;
	}

	public void setSecuritiesAndCashDistribution(com.tools20022.repository.entity.SecuritiesAndCashDistribution securitiesAndCashDistribution) {
		this.securitiesAndCashDistribution = securitiesAndCashDistribution;
	}

	public RoundingDirectionCode getFractionTreatment() {
		return fractionTreatment;
	}

	public void setFractionTreatment(RoundingDirectionCode fractionTreatment) {
		this.fractionTreatment = fractionTreatment;
	}

	public YesNoIndicator getIntermediateSecurityDistributionIndicator() {
		return intermediateSecurityDistributionIndicator;
	}

	public void setIntermediateSecurityDistributionIndicator(YesNoIndicator intermediateSecurityDistributionIndicator) {
		this.intermediateSecurityDistributionIndicator = intermediateSecurityDistributionIndicator;
	}
}