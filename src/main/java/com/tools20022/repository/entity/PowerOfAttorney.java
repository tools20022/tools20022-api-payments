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
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PowerOfAttorneyRequirements;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Document that transfers specific rights from a party to another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PowerOfAttorney" src="doc-files/PowerOfAttorney.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmPowerOfAttorneyRequirements
 * PowerOfAttorney.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
 * PowerOfAttorney.mmAuthorisedAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedPowerOfAttorney
 * SecuritiesAccount.mmRelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmPowerOfAttorney
 * PowerOfAttorneyRequirements.mmPowerOfAttorney}</li>
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
 * "PowerOfAttorney"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that transfers specific rights from a party to another party."</li>
 * </ul>
 */
public class PowerOfAttorney extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Party authorisedParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
	 * Party.mmPowerOfAttorney}</li>
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
	public static final MMBusinessAssociationEnd<PowerOfAttorney, Party> mmAuthorisedParty = new MMBusinessAssociationEnd<PowerOfAttorney, Party>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedParty";
			definition = "Party which is the holder of the power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Party.mmPowerOfAttorney;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Party getValue(PowerOfAttorney obj) {
			return obj.getAuthorisedParty();
		}

		@Override
		public void setValue(PowerOfAttorney obj, Party value) {
			obj.setAuthorisedParty(value);
		}
	};
	protected PowerOfAttorneyRequirements powerOfAttorneyRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmPowerOfAttorney
	 * PowerOfAttorneyRequirements.mmPowerOfAttorney}</li>
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
	public static final MMBusinessAssociationEnd<PowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements> mmPowerOfAttorneyRequirements = new MMBusinessAssociationEnd<PowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Describes the requirements relative to the power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmPowerOfAttorney;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.PowerOfAttorneyRequirements getValue(PowerOfAttorney obj) {
			return obj.getPowerOfAttorneyRequirements();
		}

		@Override
		public void setValue(PowerOfAttorney obj, com.tools20022.repository.entity.PowerOfAttorneyRequirements value) {
			obj.setPowerOfAttorneyRequirements(value);
		}
	};
	protected SecuritiesAccount authorisedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedPowerOfAttorney
	 * SecuritiesAccount.mmRelatedPowerOfAttorney}</li>
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
	public static final MMBusinessAssociationEnd<PowerOfAttorney, SecuritiesAccount> mmAuthorisedAccount = new MMBusinessAssociationEnd<PowerOfAttorney, SecuritiesAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAccount";
			definition = "Specifies the securities account on which the power of attorney applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAccount.mmRelatedPowerOfAttorney;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public SecuritiesAccount getValue(PowerOfAttorney obj) {
			return obj.getAuthorisedAccount();
		}

		@Override
		public void setValue(PowerOfAttorney obj, SecuritiesAccount value) {
			obj.setAuthorisedAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorney";
				definition = "Document that transfers specific rights from a party to another party.";
				associationDomain_lazy = () -> Arrays.asList(Party.mmPowerOfAttorney, SecuritiesAccount.mmRelatedPowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmPowerOfAttorney);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty, com.tools20022.repository.entity.PowerOfAttorney.mmPowerOfAttorneyRequirements,
						com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PowerOfAttorney.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Party getAuthorisedParty() {
		return authorisedParty;
	}

	public PowerOfAttorney setAuthorisedParty(Party authorisedParty) {
		this.authorisedParty = Objects.requireNonNull(authorisedParty);
		return this;
	}

	public PowerOfAttorneyRequirements getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements;
	}

	public PowerOfAttorney setPowerOfAttorneyRequirements(com.tools20022.repository.entity.PowerOfAttorneyRequirements powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = Objects.requireNonNull(powerOfAttorneyRequirements);
		return this;
	}

	public SecuritiesAccount getAuthorisedAccount() {
		return authorisedAccount;
	}

	public PowerOfAttorney setAuthorisedAccount(SecuritiesAccount authorisedAccount) {
		this.authorisedAccount = Objects.requireNonNull(authorisedAccount);
		return this;
	}
}