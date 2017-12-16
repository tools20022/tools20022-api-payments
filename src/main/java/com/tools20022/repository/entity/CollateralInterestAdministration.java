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
import com.tools20022.repository.entity.InterestManagement;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InterestManagement
 * InterestManagement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmCollateralManagement
 * CollateralInterestAdministration.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmClosingCollateralBalance
 * CollateralInterestAdministration.mmClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmOpeningCollateralBalance
 * CollateralInterestAdministration.mmOpeningCollateralBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmInterestManagement
 * CollateralManagement.mmInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmRelatedCollateralInterestManagement
 * CollateralBalance.mmRelatedCollateralInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralInterestManagement
 * CollateralBalance.mmCollateralInterestManagement}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralInterestAdministration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Calculation and request of interest linked to collateral."</li>
 * </ul>
 */
public class CollateralInterestAdministration extends InterestManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralManagement collateralManagement;
	/**
	 * Collateral processes that interest management is part of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmInterestManagement
	 * CollateralManagement.mmInterestManagement}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral processes that interest management is part of.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected CollateralBalance closingCollateralBalance;
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralInterestManagement
	 * CollateralBalance.mmCollateralInterestManagement}</li>
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
	public static final MMBusinessAssociationEnd mmClosingCollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmCollateralInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};
	protected CollateralBalance openingCollateralBalance;
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmRelatedCollateralInterestManagement
	 * CollateralBalance.mmRelatedCollateralInterestManagement}</li>
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
	public static final MMBusinessAssociationEnd mmOpeningCollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmRelatedCollateralInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralInterestAdministration";
				definition = "Calculation and request of interest linked to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.mmInterestManagement, com.tools20022.repository.entity.CollateralBalance.mmRelatedCollateralInterestManagement,
						com.tools20022.repository.entity.CollateralBalance.mmCollateralInterestManagement);
				superType_lazy = () -> InterestManagement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralInterestAdministration.mmCollateralManagement, com.tools20022.repository.entity.CollateralInterestAdministration.mmClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.mmOpeningCollateralBalance);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralInterestAdministration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public void setCollateralManagement(com.tools20022.repository.entity.CollateralManagement collateralManagement) {
		this.collateralManagement = collateralManagement;
	}

	public CollateralBalance getClosingCollateralBalance() {
		return closingCollateralBalance;
	}

	public void setClosingCollateralBalance(com.tools20022.repository.entity.CollateralBalance closingCollateralBalance) {
		this.closingCollateralBalance = closingCollateralBalance;
	}

	public CollateralBalance getOpeningCollateralBalance() {
		return openingCollateralBalance;
	}

	public void setOpeningCollateralBalance(com.tools20022.repository.entity.CollateralBalance openingCollateralBalance) {
		this.openingCollateralBalance = openingCollateralBalance;
	}
}