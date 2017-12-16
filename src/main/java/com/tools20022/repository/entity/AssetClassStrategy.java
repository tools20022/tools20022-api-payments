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
import com.tools20022.repository.entity.PortfolioStrategy;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Strategy is asset class based.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetClassStrategy" src="doc-files/AssetClassStrategy.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PortfolioStrategy
 * PortfolioStrategy}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#mmAssetClass
 * AssetClassStrategy.mmAssetClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmStrategy
 * AssetClassification.mmStrategy}</li>
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
 * "AssetClassStrategy"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Strategy is asset class based."</li>
 * </ul>
 */
public class AssetClassStrategy extends PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.AssetClassification> assetClass;
	/**
	 * Strategy based on asset classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmStrategy
	 * AssetClassification.mmStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy
	 * AssetClassStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy based on asset classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetClass";
			definition = "Strategy based on asset classes.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmStrategy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassStrategy";
				definition = "Strategy is asset class based.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.mmStrategy);
				superType_lazy = () -> PortfolioStrategy.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassStrategy.mmAssetClass);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssetClassStrategy.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<AssetClassification> getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(List<com.tools20022.repository.entity.AssetClassification> assetClass) {
		this.assetClass = assetClass;
	}
}