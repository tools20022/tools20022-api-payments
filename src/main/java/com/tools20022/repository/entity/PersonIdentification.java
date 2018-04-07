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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonIdentification" src="doc-files/PersonIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmSocialSecurityNumber
 * PersonIdentification.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
 * PersonIdentification.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
 * PersonIdentification.mmPersonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmDriversLicenseNumber
 * PersonIdentification.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmAlienRegistrationNumber
 * PersonIdentification.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPassportNumber
 * PersonIdentification.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmIdentityCardNumber
 * PersonIdentification.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmEmployerIdentificationNumber
 * PersonIdentification.mmEmployerIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmIdentification
 * PersonName.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
 * Person.mmPersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification1Choice#mmCode
 * OtherIdentification1Choice.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification44#mmType
 * GenericIdentification44.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party11Choice#mmPrivateIdentification
 * Party11Choice.mmPrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#mmPrivateIdentification
 * Party10Choice.mmPrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party34Choice#mmPrivateIdentification
 * Party34Choice.mmPrivateIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
 * PersonIdentificationSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericPersonIdentification1
 * GenericPersonIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification5
 * PersonIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2
 * ContactDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3
 * ContactDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification13
 * PersonIdentification13}</li>
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
 * "PersonIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * </ul>
 */
public class PersonIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text socialSecurityNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmSocialSecurityNumber
	 * IndividualPerson19.mmSocialSecurityNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//SSNX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmSocialSecurityNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson19.mmSocialSecurityNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//SSNX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getSocialSecurityNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setSocialSecurityNumber(value);
		}
	};
	protected Person person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmDateAndPlaceOfBirth
	 * PersonIdentification5.mmDateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification13#mmDateAndPlaceOfBirth
	 * PersonIdentification13.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PersonIdentification, Optional<Person>> mmPerson = new MMBusinessAssociationEnd<PersonIdentification, Optional<Person>>() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification5.mmDateAndPlaceOfBirth, PersonIdentification13.mmDateAndPlaceOfBirth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmPersonIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}

		@Override
		public Optional<Person> getValue(PersonIdentification obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(PersonIdentification obj, Optional<Person> value) {
			obj.setPerson(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.PersonName> personName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmIdentification
	 * PersonName.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonName
	 * PersonName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmTreasuryManager
	 * Organisation20.mmTreasuryManager}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PersonIdentification, List<PersonName>> mmPersonName = new MMBusinessAssociationEnd<PersonIdentification, List<PersonName>>() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation20.mmTreasuryManager);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonName";
			definition = "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonName.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
		}

		@Override
		public List<PersonName> getValue(PersonIdentification obj) {
			return obj.getPersonName();
		}

		@Override
		public void setValue(PersonIdentification obj, List<PersonName> value) {
			obj.setPersonName(value);
		}
	};
	protected Max35Text driversLicenseNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//DRLC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmDriversLicenseNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//DRLC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getDriversLicenseNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setDriversLicenseNumber(value);
		}
	};
	protected Max35Text alienRegistrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//ARNU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmAlienRegistrationNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//ARNU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getAlienRegistrationNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setAlienRegistrationNumber(value);
		}
	};
	protected Max35Text passportNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//CCPT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmPassportNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//CCPT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getPassportNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setPassportNumber(value);
		}
	};
	protected Max35Text identityCardNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national authority to an identity card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmIdentityCardNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getIdentityCardNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setIdentityCardNumber(value);
		}
	};
	protected Max35Text employerIdentificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//EINX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an employer by a registration authority."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonIdentification, Max35Text> mmEmployerIdentificationNumber = new MMBusinessAttribute<PersonIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//EINX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification obj) {
			return obj.getEmployerIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification obj, Max35Text value) {
			obj.setEmployerIdentificationNumber(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification";
				definition = "Unique and unambiguous way to identify a person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.mmIdentification, com.tools20022.repository.entity.Person.mmPersonIdentification);
				derivationElement_lazy = () -> Arrays.asList(OtherIdentification1Choice.mmCode, GenericIdentification44.mmType, Party11Choice.mmPrivateIdentification, Party10Choice.mmPrivateIdentification,
						Party34Choice.mmPrivateIdentification);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.mmSocialSecurityNumber, com.tools20022.repository.entity.PersonIdentification.mmPerson,
						com.tools20022.repository.entity.PersonIdentification.mmPersonName, com.tools20022.repository.entity.PersonIdentification.mmDriversLicenseNumber,
						com.tools20022.repository.entity.PersonIdentification.mmAlienRegistrationNumber, com.tools20022.repository.entity.PersonIdentification.mmPassportNumber,
						com.tools20022.repository.entity.PersonIdentification.mmIdentityCardNumber, com.tools20022.repository.entity.PersonIdentification.mmEmployerIdentificationNumber);
				derivationComponent_lazy = () -> Arrays.asList(PersonIdentificationSchemeName1Choice.mmObject(), GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject(),
						ContactDetails3.mmObject(), PersonIdentification13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PersonIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public PersonIdentification setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
		return this;
	}

	public Optional<Person> getPerson() {
		return person == null ? Optional.empty() : Optional.of(person);
	}

	public PersonIdentification setPerson(com.tools20022.repository.entity.Person person) {
		this.person = person;
		return this;
	}

	public List<PersonName> getPersonName() {
		return personName == null ? personName = new ArrayList<>() : personName;
	}

	public PersonIdentification setPersonName(List<com.tools20022.repository.entity.PersonName> personName) {
		this.personName = Objects.requireNonNull(personName);
		return this;
	}

	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public PersonIdentification setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = Objects.requireNonNull(driversLicenseNumber);
		return this;
	}

	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public PersonIdentification setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = Objects.requireNonNull(alienRegistrationNumber);
		return this;
	}

	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public PersonIdentification setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = Objects.requireNonNull(passportNumber);
		return this;
	}

	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public PersonIdentification setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = Objects.requireNonNull(identityCardNumber);
		return this;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public PersonIdentification setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = Objects.requireNonNull(employerIdentificationNumber);
		return this;
	}
}