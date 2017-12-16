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
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction is paired off and netted against one or more previous
 * transactions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PairOff" src="doc-files/PairOff.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
 * PairOff.mmPairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
 * PairOff.mmRelatedSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPairoff
 * SecuritiesQuantity.mmPairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPairOff
 * SecuritiesSettlement.mmPairOff}</li>
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
 * "PairOff"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction is paired off and netted against one or more previous transactions."
 * </li>
 * </ul>
 */
public class PairOff extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity pairedOffQuantity;
	/**
	 * Quantity of financial instruments to be paired-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPairoff
	 * SecuritiesQuantity.mmPairoff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PairOff
	 * PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairedOffQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instruments to be paired-off."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPairedOffQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = true;
			elementContext_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairedOffQuantity";
			definition = "Quantity of financial instruments to be paired-off.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmPairoff;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesSettlement relatedSecuritiesSettlement;
	/**
	 * Trade settlement process which is the source of the pair off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPairOff
	 * SecuritiesSettlement.mmPairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PairOff
	 * PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade settlement process which is the source of the pair off."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Trade settlement process which is the source of the pair off.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPairOff;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PairOff";
				definition = "Transaction is paired off and netted against one or more previous transactions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmPairoff, com.tools20022.repository.entity.SecuritiesSettlement.mmPairOff);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PairOff.mmPairedOffQuantity, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PairOff.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getPairedOffQuantity() {
		return pairedOffQuantity;
	}

	public void setPairedOffQuantity(com.tools20022.repository.entity.SecuritiesQuantity pairedOffQuantity) {
		this.pairedOffQuantity = pairedOffQuantity;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return relatedSecuritiesSettlement;
	}

	public void setRelatedSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedSecuritiesSettlement) {
		this.relatedSecuritiesSettlement = relatedSecuritiesSettlement;
	}
}