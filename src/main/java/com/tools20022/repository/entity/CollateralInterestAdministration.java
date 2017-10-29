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
import com.tools20022.repository.entity.InterestManagement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation and request of interest linked to collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralInterestAdministration"
 * src="doc-files/CollateralInterestAdministration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#CollateralManagement
 * CollateralInterestAdministration.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#ClosingCollateralBalance
 * CollateralInterestAdministration.ClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#OpeningCollateralBalance
 * CollateralInterestAdministration.OpeningCollateralBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#InterestManagement
 * CollateralManagement.InterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#RelatedCollateralInterestManagement
 * CollateralBalance.RelatedCollateralInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralInterestManagement
 * CollateralBalance.CollateralInterestManagement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InterestManagement
 * InterestManagement}</li>
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
 * "CollateralInterestAdministration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Calculation and request of interest linked to collateral."</li>
 * </ul>
 */
public class CollateralInterestAdministration extends InterestManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral processes that interest management is part of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#InterestManagement
	 * CollateralManagement.InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral processes that interest management is part of."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral processes that interest management is part of.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.InterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralInterestManagement
	 * CollateralBalance.CollateralInterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the opening collateral balance for the calculation of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosingCollateralBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#RelatedCollateralInterestManagement
	 * CollateralBalance.RelatedCollateralInterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the opening collateral balance for the calculation of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OpeningCollateralBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralInterestAdministration";
				definition = "Calculation and request of interest linked to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.InterestManagement, com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement,
						com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement);
				superType_lazy = () -> InterestManagement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement, com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance);
			}
		});
		return mmObject_lazy.get();
	}
}