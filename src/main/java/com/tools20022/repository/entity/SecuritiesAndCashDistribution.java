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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Distribution;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Characteristics for a mixed cash and securities distribution event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAndCashDistribution"
 * src="doc-files/SecuritiesAndCashDistribution.svg">
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumHolding
 * SecuritiesAndCashDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumHolding
 * SecuritiesAndCashDistribution.mmMinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmSecuritiesDistribution
 * SecuritiesAndCashDistribution.mmSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmCashDistribution
 * SecuritiesAndCashDistribution.mmCashDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingDistributionInformation
 * SecuritiesQuantity.mmMaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingDistributionInformation
 * SecuritiesQuantity.mmMinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmSecuritiesAndCashDistribution
 * CashDistribution.mmSecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSecuritiesAndCashDistribution
 * SecuritiesDistribution.mmSecuritiesAndCashDistribution}</li>
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
 * "SecuritiesAndCashDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics for a mixed cash and securities distribution event."</li>
 * </ul>
 */
public class SecuritiesAndCashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity intermediateToUnderlyingDenominator;
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorDistributionInformation
	 * SecuritiesQuantity.
	 * mmIntermediateToUnderlyingDenominatorDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of interim securities awarded for a given quantity of underlying shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingDistributionInformation
	 * SecuritiesQuantity.mmMaximumHoldingDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity maximumExercisableQuantity;
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantityDistributionInformation
	 * SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum quantity of financial instrument that may be exercised in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumExercisableQuantity;
	/**
	 * Minimum quantity of securities that must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantityDistributionInformation
	 * SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum quantity of securities that must be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of securities that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity distributedToUnderlyingDenominator;
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorDistributionInformation
	 * SecuritiesQuantity.
	 * mmDistributedToUnderlyingDenominatorDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity intermediateToUnderlyingNumerator;
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorDistributionInformation
	 * SecuritiesQuantity.
	 * mmIntermediateToUnderlyingNumeratorDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of interim securities awarded for a given quantity of underlying shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingDistributionInformation
	 * SecuritiesQuantity.mmMinimumHoldingDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity distributedToUnderlyingNumerator;
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorDistributionInformation
	 * SecuritiesQuantity.
	 * mmDistributedToUnderlyingNumeratorDistributionInformation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesDistribution securitiesDistribution;
	/**
	 * Securities distribution elements of a cash and securities distribution
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSecuritiesAndCashDistribution
	 * SecuritiesDistribution.mmSecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution elements of a cash and securities distribution process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDistribution";
			definition = "Securities distribution elements of a cash and securities distribution process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmSecuritiesAndCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashDistribution> cashDistribution;
	/**
	 * Cash distribution elements of a cash and securities distribution process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmSecuritiesAndCashDistribution
	 * CashDistribution.mmSecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution elements of a cash and securities distribution process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution elements of a cash and securities distribution process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmSecuritiesAndCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAndCashDistribution";
				definition = "Characteristics for a mixed cash and securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumHoldingDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.CashDistribution.mmSecuritiesAndCashDistribution,
						com.tools20022.repository.entity.SecuritiesDistribution.mmSecuritiesAndCashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmCashDistribution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesAndCashDistribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getIntermediateToUnderlyingDenominator() {
		return intermediateToUnderlyingDenominator;
	}

	public void setIntermediateToUnderlyingDenominator(com.tools20022.repository.entity.SecuritiesQuantity intermediateToUnderlyingDenominator) {
		this.intermediateToUnderlyingDenominator = intermediateToUnderlyingDenominator;
	}

	public SecuritiesQuantity getMaximumHolding() {
		return maximumHolding;
	}

	public void setMaximumHolding(com.tools20022.repository.entity.SecuritiesQuantity maximumHolding) {
		this.maximumHolding = maximumHolding;
	}

	public SecuritiesQuantity getMaximumExercisableQuantity() {
		return maximumExercisableQuantity;
	}

	public void setMaximumExercisableQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumExercisableQuantity) {
		this.maximumExercisableQuantity = maximumExercisableQuantity;
	}

	public SecuritiesQuantity getMinimumExercisableQuantity() {
		return minimumExercisableQuantity;
	}

	public void setMinimumExercisableQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumExercisableQuantity) {
		this.minimumExercisableQuantity = minimumExercisableQuantity;
	}

	public SecuritiesQuantity getDistributedToUnderlyingDenominator() {
		return distributedToUnderlyingDenominator;
	}

	public void setDistributedToUnderlyingDenominator(com.tools20022.repository.entity.SecuritiesQuantity distributedToUnderlyingDenominator) {
		this.distributedToUnderlyingDenominator = distributedToUnderlyingDenominator;
	}

	public SecuritiesQuantity getIntermediateToUnderlyingNumerator() {
		return intermediateToUnderlyingNumerator;
	}

	public void setIntermediateToUnderlyingNumerator(com.tools20022.repository.entity.SecuritiesQuantity intermediateToUnderlyingNumerator) {
		this.intermediateToUnderlyingNumerator = intermediateToUnderlyingNumerator;
	}

	public SecuritiesQuantity getMinimumHolding() {
		return minimumHolding;
	}

	public void setMinimumHolding(com.tools20022.repository.entity.SecuritiesQuantity minimumHolding) {
		this.minimumHolding = minimumHolding;
	}

	public SecuritiesQuantity getDistributedToUnderlyingNumerator() {
		return distributedToUnderlyingNumerator;
	}

	public void setDistributedToUnderlyingNumerator(com.tools20022.repository.entity.SecuritiesQuantity distributedToUnderlyingNumerator) {
		this.distributedToUnderlyingNumerator = distributedToUnderlyingNumerator;
	}

	public SecuritiesDistribution getSecuritiesDistribution() {
		return securitiesDistribution;
	}

	public void setSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution securitiesDistribution) {
		this.securitiesDistribution = securitiesDistribution;
	}

	public List<CashDistribution> getCashDistribution() {
		return cashDistribution;
	}

	public void setCashDistribution(List<com.tools20022.repository.entity.CashDistribution> cashDistribution) {
		this.cashDistribution = cashDistribution;
	}
}