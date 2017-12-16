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
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Officer who has some rights to represent a given organisation. In account
 * management, it is the person to be contacted by the account servicer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RepresentativeOfficer"
 * src="doc-files/RepresentativeOfficer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
 * RepresentativeOfficer.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRepresentativeOfficer
 * Organisation.mmRepresentativeOfficer}</li>
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
 * "RepresentativeOfficer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer."
 * </li>
 * </ul>
 */
public class RepresentativeOfficer extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Organisation organisation;
	/**
	 * Organisation which is represented by the representative officer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRepresentativeOfficer
	 * Organisation.mmRepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer
	 * RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation which is represented by the representative officer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is represented by the representative officer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmRepresentativeOfficer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepresentativeOfficer";
				definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmRepresentativeOfficer);
				superType_lazy = () -> AccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RepresentativeOfficer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.entity.Organisation organisation) {
		this.organisation = organisation;
	}
}