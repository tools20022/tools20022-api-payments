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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumHolding
 * SecuritiesAndCashDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumExercisableQuantity
 * SecuritiesAndCashDistribution.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumExercisableQuantity
 * SecuritiesAndCashDistribution.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumHolding
 * SecuritiesAndCashDistribution.MinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#SecuritiesDistribution
 * SecuritiesAndCashDistribution.SecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#CashDistribution
 * SecuritiesAndCashDistribution.CashDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingDistributionInformation
 * SecuritiesQuantity.MaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingDistributionInformation
 * SecuritiesQuantity.MinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#SecuritiesAndCashDistribution
 * CashDistribution.SecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SecuritiesAndCashDistribution
 * SecuritiesDistribution.SecuritiesAndCashDistribution}</li>
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
 * "SecuritiesAndCashDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics for a mixed cash and securities distribution event."</li>
 * </ul>
 */
public class SecuritiesAndCashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorDistributionInformation
	 * SecuritiesQuantity.
	 * IntermediateToUnderlyingDenominatorDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingDistributionInformation
	 * SecuritiesQuantity.MaximumHoldingDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd MaximumHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantityDistributionInformation
	 * SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd MaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities that must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantityDistributionInformation
	 * SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd MinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of securities that must be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorDistributionInformation
	 * SecuritiesQuantity.
	 * DistributedToUnderlyingDenominatorDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorDistributionInformation
	 * SecuritiesQuantity.
	 * IntermediateToUnderlyingNumeratorDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingDistributionInformation
	 * SecuritiesQuantity.MinimumHoldingDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd MinimumHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorDistributionInformation
	 * SecuritiesQuantity.
	 * DistributedToUnderlyingNumeratorDistributionInformation}</li>
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
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution elements of a cash and securities distribution
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SecuritiesAndCashDistribution
	 * SecuritiesDistribution.SecuritiesAndCashDistribution}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDistribution";
			definition = "Securities distribution elements of a cash and securities distribution process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash distribution elements of a cash and securities distribution process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#SecuritiesAndCashDistribution
	 * CashDistribution.SecuritiesAndCashDistribution}</li>
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
	public static final MMBusinessAssociationEnd CashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution elements of a cash and securities distribution process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAndCashDistribution";
				definition = "Characteristics for a mixed cash and securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution,
						com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution);
			}
		});
		return mmObject_lazy.get();
	}
}