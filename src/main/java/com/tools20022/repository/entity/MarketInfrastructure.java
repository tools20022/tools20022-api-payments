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
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Multilateral system among participating institutions, including the operator
 * of the system, used for the purposes of clearing, settling, or recording
 * payments, securities, derivatives or other financial transactions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarketInfrastructure" src="doc-files/MarketInfrastructure.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#mmAccountLink
 * MarketInfrastructure.mmAccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmMarketInfrastructure
 * AccountLink.mmMarketInfrastructure}</li>
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
 * "MarketInfrastructure"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Multilateral system among participating institutions, including the operator of the system, used for the purposes of clearing, settling, or recording payments, securities, derivatives or other financial transactions."
 * </li>
 * </ul>
 */
public class MarketInfrastructure extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.AccountLink> accountLink;
	/**
	 * Defines the link between the accounts held with a market infrastructure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmMarketInfrastructure
	 * AccountLink.mmMarketInfrastructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure
	 * MarketInfrastructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between the accounts held with a market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between the accounts held with a market infrastructure.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmMarketInfrastructure;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketInfrastructure";
				definition = "Multilateral system among participating institutions, including the operator of the system, used for the purposes of clearing, settling, or recording payments, securities, derivatives or other financial transactions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountLink.mmMarketInfrastructure);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketInfrastructure.mmAccountLink);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarketInfrastructure.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountLink> getAccountLink() {
		return accountLink;
	}

	public void setAccountLink(List<com.tools20022.repository.entity.AccountLink> accountLink) {
		this.accountLink = accountLink;
	}
}