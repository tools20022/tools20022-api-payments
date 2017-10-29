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
import com.tools20022.repository.datatype.Max140Text;
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
 * <li>{@linkplain com.tools20022.repository.entity.PartyName#Name
 * PartyName.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
 * PartyName.PartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
 * PartyIdentificationInformation.PartyName}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#Name
	 * FinancialInstitutionIdentification8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#Name
	 * BranchData2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#Name
	 * ContactDetails2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43#Name
	 * PartyIdentification43.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#Proprietary
	 * IdentificationSource3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification40#Name
	 * PartyIdentification40.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#Name
	 * NameAndAddress10.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#Name
	 * TaxAuthorisation1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#Name
	 * RegulatoryAuthority2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#Name
	 * ContactDetails3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification58#Name
	 * PartyIdentification58.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification77#Name
	 * PartyIdentification77.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2#Name
	 * LegalOrganisation2.Name}</li>
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
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.Name, com.tools20022.repository.msg.BranchData2.Name, com.tools20022.repository.msg.ContactDetails2.Name,
					com.tools20022.repository.msg.PartyIdentification43.Name, com.tools20022.repository.choice.IdentificationSource3Choice.Proprietary, com.tools20022.repository.msg.PartyIdentification40.Name,
					com.tools20022.repository.msg.NameAndAddress10.Name, com.tools20022.repository.msg.TaxAuthorisation1.Name, com.tools20022.repository.msg.RegulatoryAuthority2.Name, com.tools20022.repository.msg.ContactDetails3.Name,
					com.tools20022.repository.msg.PartyIdentification58.Name, com.tools20022.repository.msg.PartyIdentification77.Name, com.tools20022.repository.msg.LegalOrganisation2.Name);
			elementContext_lazy = () -> PartyName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Party identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
	 * PartyIdentificationInformation.PartyName}</li>
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
	public static final MMBusinessAssociationEnd PartyIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.PartyName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.PartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.Name, com.tools20022.repository.entity.PartyName.PartyIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}