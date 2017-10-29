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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different values taken into account to calculate the current
 * collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralBalance" src="doc-files/CollateralBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralDescription
 * CollateralBalance.CollateralDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#HeldAmount
 * CollateralBalance.HeldAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#PriorAgreed
 * CollateralBalance.PriorAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#VariationMarginRelatedRiskCalculation
 * CollateralBalance.VariationMarginRelatedRiskCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralBalance#InTransit
 * CollateralBalance.InTransit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#SegregatedIndependentAmountRelatedRiskCalculation
 * CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#RelatedCollateralInterestManagement
 * CollateralBalance.RelatedCollateralInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralInterestManagement
 * CollateralBalance.CollateralInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralBalance
 * Collateral.CollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentVariationMargin
 * ExposureCalculation.CurrentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentSegregatedIndependentAmount
 * ExposureCalculation.CurrentSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#ClosingCollateralBalance
 * CollateralInterestAdministration.ClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#OpeningCollateralBalance
 * CollateralInterestAdministration.OpeningCollateralBalance}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different values taken into account to calculate the current collateral."
 * </li>
 * </ul>
 */
public class CollateralBalance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Describes the collateral included in the collateral balance,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralBalance
	 * Collateral.CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the collateral included in the collateral balance,"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralDescription = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Describes the collateral included in the collateral balance,";
			minOccurs = 0;
			type_lazy = () -> Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral currently held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral currently held."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HeldAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldAmount";
			definition = "Specifies the collateral currently held.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the collateral which has been agreed but is not yet
	 * transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorAgreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which has been agreed but is not yet transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriorAgreed = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreed";
			definition = "Specifies the collateral which has been agreed but is not yet transferred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Risk coverage for which a current variation margin is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentVariationMargin
	 * ExposureCalculation.CurrentVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk coverage for which a current variation margin is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedRiskCalculation";
			definition = "Risk coverage for which a current variation margin is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral which is being transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral which is being transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InTransit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransit";
			definition = "Specifies the collateral which is being transferred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Risk coverage for which a collateral balance is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentSegregatedIndependentAmount
	 * ExposureCalculation.CurrentSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Risk coverage for which a collateral balance is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedRiskCalculation";
			definition = "Risk coverage for which a collateral balance is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral interest management for which an opening balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#OpeningCollateralBalance
	 * CollateralInterestAdministration.OpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which an opening balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralInterestManagement";
			definition = "Collateral interest management for which an opening balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral interest management for which a closing balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#ClosingCollateralBalance
	 * CollateralInterestAdministration.ClosingCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which a closing balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInterestManagement";
			definition = "Collateral interest management for which a closing balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralBalance";
				definition = "Specifies the different values taken into account to calculate the current collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.CollateralBalance, com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount, com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralBalance.CollateralDescription, com.tools20022.repository.entity.CollateralBalance.HeldAmount,
						com.tools20022.repository.entity.CollateralBalance.PriorAgreed, com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation, com.tools20022.repository.entity.CollateralBalance.InTransit,
						com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation, com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement,
						com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement);
			}
		});
		return mmObject_lazy.get();
	}
}