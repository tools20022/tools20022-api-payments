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
import com.tools20022.repository.entity.Mandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document that transfers specific rights from a party to another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PowerOfAttorney" src="doc-files/PowerOfAttorney.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedParty
 * PowerOfAttorney.AuthorisedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#PowerOfAttorneyRequirements
 * PowerOfAttorney.PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedAccount
 * PowerOfAttorney.AuthorisedAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#PowerOfAttorney
 * Party.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedPowerOfAttorney
 * SecuritiesAccount.RelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#PowerOfAttorney
 * PowerOfAttorneyRequirements.PowerOfAttorney}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
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
 * "PowerOfAttorney"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that transfers specific rights from a party to another party."</li>
 * </ul>
 */
public class PowerOfAttorney extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party which is the holder of the power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#PowerOfAttorney
	 * Party.PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is the holder of the power of attorney."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AuthorisedParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedParty";
			definition = "Party which is the holder of the power of attorney.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.PowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes the requirements relative to the power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#PowerOfAttorney
	 * PowerOfAttorneyRequirements.PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the requirements relative to the power of attorney."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Describes the requirements relative to the power of attorney.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the securities account on which the power of attorney applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedPowerOfAttorney
	 * SecuritiesAccount.RelatedPowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities account on which the power of attorney applies."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AuthorisedAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAccount";
			definition = "Specifies the securities account on which the power of attorney applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorney";
				definition = "Document that transfers specific rights from a party to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.PowerOfAttorney, com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney,
						com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty, com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements,
						com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount);
			}
		});
		return mmObject_lazy.get();
	}
}