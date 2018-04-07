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
import com.tools20022.repository.entity.SecuritiesAndCashDistribution;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
	protected SecuritiesQuantity maximumHolding;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesQuantity> mmMaximumHolding = new MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesDistribution obj) {
			return obj.getMaximumHolding();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, SecuritiesQuantity value) {
			obj.setMaximumHolding(value);
		}
	};
	protected List<SecuritiesQuantity> intermediateToUnderlyingNumerator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>> mmIntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(SecuritiesDistribution obj) {
			return obj.getIntermediateToUnderlyingNumerator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, List<SecuritiesQuantity> value) {
			obj.setIntermediateToUnderlyingNumerator(value);
		}
	};
	protected List<SecuritiesQuantity> intermediateToUnderlyingDenominator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>> mmIntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(SecuritiesDistribution obj) {
			return obj.getIntermediateToUnderlyingDenominator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, List<SecuritiesQuantity> value) {
			obj.setIntermediateToUnderlyingDenominator(value);
		}
	};
	protected List<SecuritiesQuantity> distributedToUnderlyingDenominator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>> mmDistributedToUnderlyingDenominator = new MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(SecuritiesDistribution obj) {
			return obj.getDistributedToUnderlyingDenominator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, List<SecuritiesQuantity> value) {
			obj.setDistributedToUnderlyingDenominator(value);
		}
	};
	protected List<SecuritiesQuantity> distributedToUnderlyingNumerator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>> mmDistributedToUnderlyingNumerator = new MMBusinessAssociationEnd<SecuritiesDistribution, List<SecuritiesQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(SecuritiesDistribution obj) {
			return obj.getDistributedToUnderlyingNumerator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, List<SecuritiesQuantity> value) {
			obj.setDistributedToUnderlyingNumerator(value);
		}
	};
	protected SecuritiesQuantity minimumHolding;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesQuantity> mmMinimumHolding = new MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesDistribution obj) {
			return obj.getMinimumHolding();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, SecuritiesQuantity value) {
			obj.setMinimumHolding(value);
		}
	};
	protected SecuritiesPricing cashFractionsPrice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing> mmCashFractionsPrice = new MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPrice";
			definition = "Price paid by the issuer for the remaining fraction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(SecuritiesDistribution obj) {
			return obj.getCashFractionsPrice();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, SecuritiesPricing value) {
			obj.setCashFractionsPrice(value);
		}
	};
	protected SecuritiesPricing subscriptionPrice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing> mmSubscriptionPrice = new MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "The amount of money required per unit for the purchase of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(SecuritiesDistribution obj) {
			return obj.getSubscriptionPrice();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, SecuritiesPricing value) {
			obj.setSubscriptionPrice(value);
		}
	};
	protected SecuritiesPricing reinvestmentPrice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing> mmReinvestmentPrice = new MMBusinessAssociationEnd<SecuritiesDistribution, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPrice";
			definition = "Price at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(SecuritiesDistribution obj) {
			return obj.getReinvestmentPrice();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, SecuritiesPricing value) {
			obj.setReinvestmentPrice(value);
		}
	};
	protected ISODateTime intermediateSecurityExpiryDate;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, ISODateTime> mmIntermediateSecurityExpiryDate = new MMBusinessAttribute<SecuritiesDistribution, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(SecuritiesDistribution obj) {
			return obj.getIntermediateSecurityExpiryDate();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, ISODateTime value) {
			obj.setIntermediateSecurityExpiryDate(value);
		}
	};
	protected ISODateTime tradingAvailabilityDate;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, ISODateTime> mmTradingAvailabilityDate = new MMBusinessAttribute<SecuritiesDistribution, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(SecuritiesDistribution obj) {
			return obj.getTradingAvailabilityDate();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, ISODateTime value) {
			obj.setTradingAvailabilityDate(value);
		}
	};
	protected ISODateTime offerExpiryDate;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, ISODateTime> mmOfferExpiryDate = new MMBusinessAttribute<SecuritiesDistribution, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(SecuritiesDistribution obj) {
			return obj.getOfferExpiryDate();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, ISODateTime value) {
			obj.setOfferExpiryDate(value);
		}
	};
	protected PercentageRate oversubscriptionRate;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, PercentageRate> mmOversubscriptionRate = new MMBusinessAttribute<SecuritiesDistribution, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(SecuritiesDistribution obj) {
			return obj.getOversubscriptionRate();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, PercentageRate value) {
			obj.setOversubscriptionRate(value);
		}
	};
	protected CurrencyAndAmount oversubscriptionAmount;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, CurrencyAndAmount> mmOversubscriptionAmount = new MMBusinessAttribute<SecuritiesDistribution, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(SecuritiesDistribution obj) {
			return obj.getOversubscriptionAmount();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, CurrencyAndAmount value) {
			obj.setOversubscriptionAmount(value);
		}
	};
	protected CurrencyAndAmount reinvestmentAmount;
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
	public static final MMBusinessAttribute<SecuritiesDistribution, CurrencyAndAmount> mmReinvestmentAmount = new MMBusinessAttribute<SecuritiesDistribution, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(SecuritiesDistribution obj) {
			return obj.getReinvestmentAmount();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, CurrencyAndAmount value) {
			obj.setReinvestmentAmount(value);
		}
	};
	protected BaseOneRate reinvestmentRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, BaseOneRate> mmReinvestmentRate = new MMBusinessAttribute<SecuritiesDistribution, BaseOneRate>() {
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

		@Override
		public BaseOneRate getValue(SecuritiesDistribution obj) {
			return obj.getReinvestmentRate();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, BaseOneRate value) {
			obj.setReinvestmentRate(value);
		}
	};
	protected YesNoIndicator loyalityPremiumIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator> mmLoyalityPremiumIndicator = new MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesDistribution obj) {
			return obj.getLoyalityPremiumIndicator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, YesNoIndicator value) {
			obj.setLoyalityPremiumIndicator(value);
		}
	};
	protected YesNoIndicator oversubscriptionIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator> mmOversubscriptionIndicator = new MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesDistribution obj) {
			return obj.getOversubscriptionIndicator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, YesNoIndicator value) {
			obj.setOversubscriptionIndicator(value);
		}
	};
	protected YesNoIndicator renounceableIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator> mmRenounceableIndicator = new MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesDistribution obj) {
			return obj.getRenounceableIndicator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, YesNoIndicator value) {
			obj.setRenounceableIndicator(value);
		}
	};
	protected Number decimalPrecision;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, Number> mmDecimalPrecision = new MMBusinessAttribute<SecuritiesDistribution, Number>() {
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

		@Override
		public Number getValue(SecuritiesDistribution obj) {
			return obj.getDecimalPrecision();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, Number value) {
			obj.setDecimalPrecision(value);
		}
	};
	protected PaymentTypeCode reinvestmentType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, PaymentTypeCode> mmReinvestmentType = new MMBusinessAttribute<SecuritiesDistribution, PaymentTypeCode>() {
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

		@Override
		public PaymentTypeCode getValue(SecuritiesDistribution obj) {
			return obj.getReinvestmentType();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, PaymentTypeCode value) {
			obj.setReinvestmentType(value);
		}
	};
	protected YesNoIndicator revocableIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator> mmRevocableIndicator = new MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesDistribution obj) {
			return obj.getRevocableIndicator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, YesNoIndicator value) {
			obj.setRevocableIndicator(value);
		}
	};
	protected SecuritiesAndCashDistribution securitiesAndCashDistribution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution> mmSecuritiesAndCashDistribution = new MMBusinessAssociationEnd<SecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesAndCashDistribution getValue(SecuritiesDistribution obj) {
			return obj.getSecuritiesAndCashDistribution();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, com.tools20022.repository.entity.SecuritiesAndCashDistribution value) {
			obj.setSecuritiesAndCashDistribution(value);
		}
	};
	protected RoundingDirectionCode fractionTreatment;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, RoundingDirectionCode> mmFractionTreatment = new MMBusinessAttribute<SecuritiesDistribution, RoundingDirectionCode>() {
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

		@Override
		public RoundingDirectionCode getValue(SecuritiesDistribution obj) {
			return obj.getFractionTreatment();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, RoundingDirectionCode value) {
			obj.setFractionTreatment(value);
		}
	};
	protected YesNoIndicator intermediateSecurityDistributionIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator> mmIntermediateSecurityDistributionIndicator = new MMBusinessAttribute<SecuritiesDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesDistribution obj) {
			return obj.getIntermediateSecurityDistributionIndicator();
		}

		@Override
		public void setValue(SecuritiesDistribution obj, YesNoIndicator value) {
			obj.setIntermediateSecurityDistributionIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDistribution";
				definition = "Characteristics for a securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution, SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution,
						SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution, SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution, SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution, SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmSecuritiesDistribution);
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

	public SecuritiesDistribution setMaximumHolding(SecuritiesQuantity maximumHolding) {
		this.maximumHolding = Objects.requireNonNull(maximumHolding);
		return this;
	}

	public List<SecuritiesQuantity> getIntermediateToUnderlyingNumerator() {
		return intermediateToUnderlyingNumerator == null ? intermediateToUnderlyingNumerator = new ArrayList<>() : intermediateToUnderlyingNumerator;
	}

	public SecuritiesDistribution setIntermediateToUnderlyingNumerator(List<SecuritiesQuantity> intermediateToUnderlyingNumerator) {
		this.intermediateToUnderlyingNumerator = Objects.requireNonNull(intermediateToUnderlyingNumerator);
		return this;
	}

	public List<SecuritiesQuantity> getIntermediateToUnderlyingDenominator() {
		return intermediateToUnderlyingDenominator == null ? intermediateToUnderlyingDenominator = new ArrayList<>() : intermediateToUnderlyingDenominator;
	}

	public SecuritiesDistribution setIntermediateToUnderlyingDenominator(List<SecuritiesQuantity> intermediateToUnderlyingDenominator) {
		this.intermediateToUnderlyingDenominator = Objects.requireNonNull(intermediateToUnderlyingDenominator);
		return this;
	}

	public List<SecuritiesQuantity> getDistributedToUnderlyingDenominator() {
		return distributedToUnderlyingDenominator == null ? distributedToUnderlyingDenominator = new ArrayList<>() : distributedToUnderlyingDenominator;
	}

	public SecuritiesDistribution setDistributedToUnderlyingDenominator(List<SecuritiesQuantity> distributedToUnderlyingDenominator) {
		this.distributedToUnderlyingDenominator = Objects.requireNonNull(distributedToUnderlyingDenominator);
		return this;
	}

	public List<SecuritiesQuantity> getDistributedToUnderlyingNumerator() {
		return distributedToUnderlyingNumerator == null ? distributedToUnderlyingNumerator = new ArrayList<>() : distributedToUnderlyingNumerator;
	}

	public SecuritiesDistribution setDistributedToUnderlyingNumerator(List<SecuritiesQuantity> distributedToUnderlyingNumerator) {
		this.distributedToUnderlyingNumerator = Objects.requireNonNull(distributedToUnderlyingNumerator);
		return this;
	}

	public SecuritiesQuantity getMinimumHolding() {
		return minimumHolding;
	}

	public SecuritiesDistribution setMinimumHolding(SecuritiesQuantity minimumHolding) {
		this.minimumHolding = Objects.requireNonNull(minimumHolding);
		return this;
	}

	public SecuritiesPricing getCashFractionsPrice() {
		return cashFractionsPrice;
	}

	public SecuritiesDistribution setCashFractionsPrice(SecuritiesPricing cashFractionsPrice) {
		this.cashFractionsPrice = Objects.requireNonNull(cashFractionsPrice);
		return this;
	}

	public SecuritiesPricing getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public SecuritiesDistribution setSubscriptionPrice(SecuritiesPricing subscriptionPrice) {
		this.subscriptionPrice = Objects.requireNonNull(subscriptionPrice);
		return this;
	}

	public SecuritiesPricing getReinvestmentPrice() {
		return reinvestmentPrice;
	}

	public SecuritiesDistribution setReinvestmentPrice(SecuritiesPricing reinvestmentPrice) {
		this.reinvestmentPrice = Objects.requireNonNull(reinvestmentPrice);
		return this;
	}

	public ISODateTime getIntermediateSecurityExpiryDate() {
		return intermediateSecurityExpiryDate;
	}

	public SecuritiesDistribution setIntermediateSecurityExpiryDate(ISODateTime intermediateSecurityExpiryDate) {
		this.intermediateSecurityExpiryDate = Objects.requireNonNull(intermediateSecurityExpiryDate);
		return this;
	}

	public ISODateTime getTradingAvailabilityDate() {
		return tradingAvailabilityDate;
	}

	public SecuritiesDistribution setTradingAvailabilityDate(ISODateTime tradingAvailabilityDate) {
		this.tradingAvailabilityDate = Objects.requireNonNull(tradingAvailabilityDate);
		return this;
	}

	public ISODateTime getOfferExpiryDate() {
		return offerExpiryDate;
	}

	public SecuritiesDistribution setOfferExpiryDate(ISODateTime offerExpiryDate) {
		this.offerExpiryDate = Objects.requireNonNull(offerExpiryDate);
		return this;
	}

	public PercentageRate getOversubscriptionRate() {
		return oversubscriptionRate;
	}

	public SecuritiesDistribution setOversubscriptionRate(PercentageRate oversubscriptionRate) {
		this.oversubscriptionRate = Objects.requireNonNull(oversubscriptionRate);
		return this;
	}

	public CurrencyAndAmount getOversubscriptionAmount() {
		return oversubscriptionAmount;
	}

	public SecuritiesDistribution setOversubscriptionAmount(CurrencyAndAmount oversubscriptionAmount) {
		this.oversubscriptionAmount = Objects.requireNonNull(oversubscriptionAmount);
		return this;
	}

	public CurrencyAndAmount getReinvestmentAmount() {
		return reinvestmentAmount;
	}

	public SecuritiesDistribution setReinvestmentAmount(CurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = Objects.requireNonNull(reinvestmentAmount);
		return this;
	}

	public BaseOneRate getReinvestmentRate() {
		return reinvestmentRate;
	}

	public SecuritiesDistribution setReinvestmentRate(BaseOneRate reinvestmentRate) {
		this.reinvestmentRate = Objects.requireNonNull(reinvestmentRate);
		return this;
	}

	public YesNoIndicator getLoyalityPremiumIndicator() {
		return loyalityPremiumIndicator;
	}

	public SecuritiesDistribution setLoyalityPremiumIndicator(YesNoIndicator loyalityPremiumIndicator) {
		this.loyalityPremiumIndicator = Objects.requireNonNull(loyalityPremiumIndicator);
		return this;
	}

	public YesNoIndicator getOversubscriptionIndicator() {
		return oversubscriptionIndicator;
	}

	public SecuritiesDistribution setOversubscriptionIndicator(YesNoIndicator oversubscriptionIndicator) {
		this.oversubscriptionIndicator = Objects.requireNonNull(oversubscriptionIndicator);
		return this;
	}

	public YesNoIndicator getRenounceableIndicator() {
		return renounceableIndicator;
	}

	public SecuritiesDistribution setRenounceableIndicator(YesNoIndicator renounceableIndicator) {
		this.renounceableIndicator = Objects.requireNonNull(renounceableIndicator);
		return this;
	}

	public Number getDecimalPrecision() {
		return decimalPrecision;
	}

	public SecuritiesDistribution setDecimalPrecision(Number decimalPrecision) {
		this.decimalPrecision = Objects.requireNonNull(decimalPrecision);
		return this;
	}

	public PaymentTypeCode getReinvestmentType() {
		return reinvestmentType;
	}

	public SecuritiesDistribution setReinvestmentType(PaymentTypeCode reinvestmentType) {
		this.reinvestmentType = Objects.requireNonNull(reinvestmentType);
		return this;
	}

	public YesNoIndicator getRevocableIndicator() {
		return revocableIndicator;
	}

	public SecuritiesDistribution setRevocableIndicator(YesNoIndicator revocableIndicator) {
		this.revocableIndicator = Objects.requireNonNull(revocableIndicator);
		return this;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return securitiesAndCashDistribution;
	}

	public SecuritiesDistribution setSecuritiesAndCashDistribution(com.tools20022.repository.entity.SecuritiesAndCashDistribution securitiesAndCashDistribution) {
		this.securitiesAndCashDistribution = Objects.requireNonNull(securitiesAndCashDistribution);
		return this;
	}

	public RoundingDirectionCode getFractionTreatment() {
		return fractionTreatment;
	}

	public SecuritiesDistribution setFractionTreatment(RoundingDirectionCode fractionTreatment) {
		this.fractionTreatment = Objects.requireNonNull(fractionTreatment);
		return this;
	}

	public YesNoIndicator getIntermediateSecurityDistributionIndicator() {
		return intermediateSecurityDistributionIndicator;
	}

	public SecuritiesDistribution setIntermediateSecurityDistributionIndicator(YesNoIndicator intermediateSecurityDistributionIndicator) {
		this.intermediateSecurityDistributionIndicator = Objects.requireNonNull(intermediateSecurityDistributionIndicator);
		return this;
	}
}