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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.IdentificationSource3Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyName" src="doc-files/PartyName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PartyName#mmName
 * PartyName.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName
 * OrganisationName}</li>
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
 * "PartyName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a party is known and which is usually used to identify that party."
 * </li>
 * </ul>
 */
public class PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party. This name is derived from the concatenation of the elements that
	 * compose the name of a person or from the legal name of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmName
	 * FinancialInstitutionIdentification8.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#mmName
	 * BranchData2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmName
	 * ContactDetails2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmName
	 * PartyIdentification43.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#mmProprietary
	 * IdentificationSource3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmName
	 * PartyIdentification40.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#mmName
	 * NameAndAddress10.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#mmName
	 * TaxAuthorisation1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#mmName
	 * RegulatoryAuthority2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmName
	 * PartyIdentification42.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#mmName
	 * ContactDetails3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmName
	 * PartyIdentification58.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmName
	 * PartyIdentification77.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmName
	 * LegalOrganisation2.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmName, BranchData2.mmName, ContactDetails2.mmName, PartyIdentification43.mmName, IdentificationSource3Choice.mmProprietary,
					PartyIdentification40.mmName, NameAndAddress10.mmName, TaxAuthorisation1.mmName, RegulatoryAuthority2.mmName, PartyIdentification42.mmName, ContactDetails3.mmName, PartyIdentification58.mmName,
					PartyIdentification77.mmName, LegalOrganisation2.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyName.class.getMethod("getName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentificationInformation partyIdentification;
	/**
	 * Party identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
	 * PartyIdentificationInformation.mmPartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.mmName, com.tools20022.repository.entity.PartyName.mmPartyIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	public PartyIdentificationInformation getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(com.tools20022.repository.entity.PartyIdentificationInformation partyIdentification) {
		this.partyIdentification = partyIdentification;
	}
}