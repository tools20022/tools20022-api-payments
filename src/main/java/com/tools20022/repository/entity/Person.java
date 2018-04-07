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
import com.tools20022.repository.codeset.CivilStatusCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ResidentialStatusCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Person" src="doc-files/Person.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmGender
 * Person.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmLanguage
 * Person.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmBirthDate
 * Person.mmBirthDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
 * Person.mmPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmProfession
 * Person.mmProfession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
 * Person.mmResidentialStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmNationality
 * Person.mmNationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmMinorIndicator
 * Person.mmMinorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmBusinessFunctionTitle
 * Person.mmBusinessFunctionTitle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
 * Person.mmPersonIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmEmployingParty
 * Person.mmEmployingParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmMeetingAttendee
 * Person.mmMeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmRelatedRole
 * Person.mmRelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPreAssignedProxyPerson
 * Person.mmPreAssignedProxyPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
 * Person.mmPersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
 * Person.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmHousehold
 * Person.mmHousehold}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmCivilStatus
 * Person.mmCivilStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmDeathDate
 * Person.mmDeathDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmCitizenshipEndDate
 * Person.mmCitizenshipEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmCitizenshipStartDate
 * Person.mmCitizenshipStartDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCitizen
 * Country.mmCitizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmNativePerson
 * Location.mmNativePerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
 * PersonIdentification.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#mmEmployee
 * EmployingPartyRole.mmEmployee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
 * ContactPersonRole.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmProxyPerson
 * AssignedProxyRole.mmProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmPreAssignedProxyRole
 * AssignedProxyRole.mmPreAssignedProxyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#mmPerson
 * MeetingAttendeeRole.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
 * PersonProfile.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Household#mmMember
 * Household.mmMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmCountryAndResidentialStatus
 * IndividualPerson19.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmCitizenshipInformation
 * IndividualPerson19.mmCitizenshipInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
 * CountryAndResidentialStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
 * DateAndPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CitizenshipInformation1
 * CitizenshipInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson19
 * IndividualPerson19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth1
 * DateAndPlaceOfBirth1}</li>
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
 * "Person"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * </ul>
 */
public class Person extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenderCode gender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmGender
	 * IndividualPerson19.mmGender}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the gender of the person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, GenderCode> mmGender = new MMBusinessAttribute<Person, GenderCode>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson19.mmGender);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}

		@Override
		public GenderCode getValue(Person obj) {
			return obj.getGender();
		}

		@Override
		public void setValue(Person obj, GenderCode value) {
			obj.setGender(value);
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmLanguage
	 * IndividualPerson19.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LANG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which a person communicates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, LanguageCode> mmLanguage = new MMBusinessAttribute<Person, LanguageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson19.mmLanguage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LANG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(Person obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Person obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};
	protected ISODateTime birthDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmBirthDate
	 * DateAndPlaceOfBirth.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmBirthDate
	 * IndividualPerson19.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth1#mmBirthDate
	 * DateAndPlaceOfBirth1.mmBirthDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is born."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, ISODateTime> mmBirthDate = new MMBusinessAttribute<Person, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmBirthDate, IndividualPerson19.mmBirthDate, DateAndPlaceOfBirth1.mmBirthDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Person obj) {
			return obj.getBirthDate();
		}

		@Override
		public void setValue(Person obj, ISODateTime value) {
			obj.setBirthDate(value);
		}
	};
	protected Location placeOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmNativePerson
	 * Location.mmNativePerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmCityOfBirth
	 * IndividualPerson19.mmCityOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (for instance Country and City) where a person was born."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.Location> mmPlaceOfBirth = new MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.Location>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson19.mmCityOfBirth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfBirth";
			definition = "Place (for instance Country and City) where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmNativePerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Person obj) {
			return obj.getPlaceOfBirth();
		}

		@Override
		public void setValue(Person obj, com.tools20022.repository.entity.Location value) {
			obj.setPlaceOfBirth(value);
		}
	};
	protected Max35Text profession;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the occupation or job of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, Max35Text> mmProfession = new MMBusinessAttribute<Person, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Person obj) {
			return obj.getProfession();
		}

		@Override
		public void setValue(Person obj, Max35Text value) {
			obj.setProfession(value);
		}
	};
	protected ResidentialStatusCode residentialStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#mmResidentialStatus
	 * CountryAndResidentialStatusType1.mmResidentialStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Residential status of an individual, for example, non-permanent resident."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, ResidentialStatusCode> mmResidentialStatus = new MMBusinessAttribute<Person, ResidentialStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CountryAndResidentialStatusType1.mmResidentialStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}

		@Override
		public ResidentialStatusCode getValue(Person obj) {
			return obj.getResidentialStatus();
		}

		@Override
		public void setValue(Person obj, ResidentialStatusCode value) {
			obj.setResidentialStatus(value);
		}
	};
	protected List<Country> nationality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCitizen
	 * Country.mmCitizen}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation1#mmNationality
	 * CitizenshipInformation1.mmNationality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the country where a person was born or is legally accepted as belonging to the country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, List<Country>> mmNationality = new MMBusinessAssociationEnd<Person, List<Country>>() {
		{
			derivation_lazy = () -> Arrays.asList(CitizenshipInformation1.mmNationality);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			opposite_lazy = () -> Country.mmCitizen;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public List<Country> getValue(Person obj) {
			return obj.getNationality();
		}

		@Override
		public void setValue(Person obj, List<Country> value) {
			obj.setNationality(value);
		}
	};
	protected YesNoIndicator minorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation1#mmMinorIndicator
	 * CitizenshipInformation1.mmMinorIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, YesNoIndicator> mmMinorIndicator = new MMBusinessAttribute<Person, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CitizenshipInformation1.mmMinorIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Person obj) {
			return obj.getMinorIndicator();
		}

		@Override
		public void setValue(Person obj, YesNoIndicator value) {
			obj.setMinorIndicator(value);
		}
	};
	protected Max35Text businessFunctionTitle;
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#mmTitle
	 * TaxAuthorisation1.mmTitle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFunctionTitle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the function in an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, Max35Text> mmBusinessFunctionTitle = new MMBusinessAttribute<Person, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxAuthorisation1.mmTitle);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessFunctionTitle";
			definition = "Title of the function in an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Person obj) {
			return obj.getBusinessFunctionTitle();
		}

		@Override
		public void setValue(Person obj, Max35Text value) {
			obj.setBusinessFunctionTitle(value);
		}
	};
	protected List<com.tools20022.repository.entity.PersonIdentification> personIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
	 * PersonIdentification.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#mmTaxContact
	 * BillingTaxIdentification1.mmTaxContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicerContact
	 * CashAccountCharacteristics2.mmAccountServicerContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmOtherIdentification
	 * IndividualPerson19.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, List<PersonIdentification>> mmPersonIdentification = new MMBusinessAssociationEnd<Person, List<PersonIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingTaxIdentification1.mmTaxContact, CashAccountCharacteristics2.mmAccountServicerContact, IndividualPerson19.mmOtherIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonIdentification";
			definition = "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
		}

		@Override
		public List<PersonIdentification> getValue(Person obj) {
			return obj.getPersonIdentification();
		}

		@Override
		public void setValue(Person obj, List<PersonIdentification> value) {
			obj.setPersonIdentification(value);
		}
	};
	protected EmployingPartyRole employingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#mmEmployee
	 * EmployingPartyRole.mmEmployee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is the employer of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, EmployingPartyRole> mmEmployingParty = new MMBusinessAssociationEnd<Person, EmployingPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> EmployingPartyRole.mmEmployee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> EmployingPartyRole.mmObject();
		}

		@Override
		public EmployingPartyRole getValue(Person obj) {
			return obj.getEmployingParty();
		}

		@Override
		public void setValue(Person obj, EmployingPartyRole value) {
			obj.setEmployingParty(value);
		}
	};
	protected MeetingAttendeeRole meetingAttendee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#mmPerson
	 * MeetingAttendeeRole.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole
	 * MeetingAttendeeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meeting attendee which is an individual person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, MeetingAttendeeRole> mmMeetingAttendee = new MMBusinessAssociationEnd<Person, MeetingAttendeeRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> MeetingAttendeeRole.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingAttendeeRole.mmObject();
		}

		@Override
		public MeetingAttendeeRole getValue(Person obj) {
			return obj.getMeetingAttendee();
		}

		@Override
		public void setValue(Person obj, MeetingAttendeeRole value) {
			obj.setMeetingAttendee(value);
		}
	};
	protected List<AssignedProxyRole> relatedRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmProxyPerson
	 * AssignedProxyRole.mmProxyPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role performed by the person for the proxy voting process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, List<AssignedProxyRole>> mmRelatedRole = new MMBusinessAssociationEnd<Person, List<AssignedProxyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			opposite_lazy = () -> AssignedProxyRole.mmProxyPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssignedProxyRole.mmObject();
		}

		@Override
		public List<AssignedProxyRole> getValue(Person obj) {
			return obj.getRelatedRole();
		}

		@Override
		public void setValue(Person obj, List<AssignedProxyRole> value) {
			obj.setRelatedRole(value);
		}
	};
	protected AssignedProxyRole preAssignedProxyPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmPreAssignedProxyRole
	 * AssignedProxyRole.mmPreAssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAssignedProxyPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the person who is the pre-assigned proxy for a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, AssignedProxyRole> mmPreAssignedProxyPerson = new MMBusinessAssociationEnd<Person, AssignedProxyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AssignedProxyRole.mmPreAssignedProxyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssignedProxyRole.mmObject();
		}

		@Override
		public AssignedProxyRole getValue(Person obj) {
			return obj.getPreAssignedProxyPerson();
		}

		@Override
		public void setValue(Person obj, AssignedProxyRole value) {
			obj.setPreAssignedProxyPerson(value);
		}
	};
	protected PersonProfile personProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
	 * PersonProfile.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonProfile
	 * PersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support the Know Your Customer processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.PersonProfile> mmPersonProfile = new MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.PersonProfile>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonProfile";
			definition = "Information to support the Know Your Customer processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.PersonProfile getValue(Person obj) {
			return obj.getPersonProfile();
		}

		@Override
		public void setValue(Person obj, com.tools20022.repository.entity.PersonProfile value) {
			obj.setPersonProfile(value);
		}
	};
	protected ContactPersonRole contactPersonRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
	 * ContactPersonRole.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact role played by a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.ContactPersonRole> mmContactPersonRole = new MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.ContactPersonRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact role played by a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.ContactPersonRole getValue(Person obj) {
			return obj.getContactPersonRole();
		}

		@Override
		public void setValue(Person obj, com.tools20022.repository.entity.ContactPersonRole value) {
			obj.setContactPersonRole(value);
		}
	};
	protected Household household;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Household#mmMember
	 * Household.mmMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Household Household}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Household"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the members of a household in relation with the ownership of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.Household> mmHousehold = new MMBusinessAssociationEnd<Person, com.tools20022.repository.entity.Household>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Household";
			definition = "Specifies the members of a household in relation with the ownership of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Household.mmMember;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Household.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Household getValue(Person obj) {
			return obj.getHousehold();
		}

		@Override
		public void setValue(Person obj, com.tools20022.repository.entity.Household value) {
			obj.setHousehold(value);
		}
	};
	protected CivilStatusCode civilStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CivilStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the civil status of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, CivilStatusCode> mmCivilStatus = new MMBusinessAttribute<Person, CivilStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CivilStatus";
			definition = "Specifies the civil status of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CivilStatusCode.mmObject();
		}

		@Override
		public CivilStatusCode getValue(Person obj) {
			return obj.getCivilStatus();
		}

		@Override
		public void setValue(Person obj, CivilStatusCode value) {
			obj.setCivilStatus(value);
		}
	};
	protected ISODateTime deathDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is dead."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, ISODateTime> mmDeathDate = new MMBusinessAttribute<Person, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeathDate";
			definition = "Date on which a person is dead.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Person obj) {
			return obj.getDeathDate();
		}

		@Override
		public void setValue(Person obj, ISODateTime value) {
			obj.setDeathDate(value);
		}
	};
	protected ISODate citizenshipEndDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation1#mmEndDate
	 * CitizenshipInformation1.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CitizenshipEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the end of citizenship."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, ISODate> mmCitizenshipEndDate = new MMBusinessAttribute<Person, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CitizenshipInformation1.mmEndDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CitizenshipEndDate";
			definition = "Date of the end of citizenship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Person obj) {
			return obj.getCitizenshipEndDate();
		}

		@Override
		public void setValue(Person obj, ISODate value) {
			obj.setCitizenshipEndDate(value);
		}
	};
	protected ISODate citizenshipStartDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation1#mmStartDate
	 * CitizenshipInformation1.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CitizenshipStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the commencement of citizenship."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Person, ISODate> mmCitizenshipStartDate = new MMBusinessAttribute<Person, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CitizenshipInformation1.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CitizenshipStartDate";
			definition = "Date of the commencement of citizenship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Person obj) {
			return obj.getCitizenshipStartDate();
		}

		@Override
		public void setValue(Person obj, ISODate value) {
			obj.setCitizenshipStartDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(Country.mmCitizen, com.tools20022.repository.entity.Location.mmNativePerson, com.tools20022.repository.entity.PersonIdentification.mmPerson, EmployingPartyRole.mmEmployee,
						com.tools20022.repository.entity.ContactPersonRole.mmPerson, AssignedProxyRole.mmProxyPerson, AssignedProxyRole.mmPreAssignedProxyRole, MeetingAttendeeRole.mmPerson,
						com.tools20022.repository.entity.PersonProfile.mmPerson, com.tools20022.repository.entity.Household.mmMember);
				derivationElement_lazy = () -> Arrays.asList(IndividualPerson19.mmCountryAndResidentialStatus, IndividualPerson19.mmCitizenshipInformation);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.mmGender, com.tools20022.repository.entity.Person.mmLanguage, com.tools20022.repository.entity.Person.mmBirthDate,
						com.tools20022.repository.entity.Person.mmPlaceOfBirth, com.tools20022.repository.entity.Person.mmProfession, com.tools20022.repository.entity.Person.mmResidentialStatus,
						com.tools20022.repository.entity.Person.mmNationality, com.tools20022.repository.entity.Person.mmMinorIndicator, com.tools20022.repository.entity.Person.mmBusinessFunctionTitle,
						com.tools20022.repository.entity.Person.mmPersonIdentification, com.tools20022.repository.entity.Person.mmEmployingParty, com.tools20022.repository.entity.Person.mmMeetingAttendee,
						com.tools20022.repository.entity.Person.mmRelatedRole, com.tools20022.repository.entity.Person.mmPreAssignedProxyPerson, com.tools20022.repository.entity.Person.mmPersonProfile,
						com.tools20022.repository.entity.Person.mmContactPersonRole, com.tools20022.repository.entity.Person.mmHousehold, com.tools20022.repository.entity.Person.mmCivilStatus,
						com.tools20022.repository.entity.Person.mmDeathDate, com.tools20022.repository.entity.Person.mmCitizenshipEndDate, com.tools20022.repository.entity.Person.mmCitizenshipStartDate);
				derivationComponent_lazy = () -> Arrays.asList(CountryAndResidentialStatusType1.mmObject(), DateAndPlaceOfBirth.mmObject(), CitizenshipInformation1.mmObject(), IndividualPerson19.mmObject(), DateAndPlaceOfBirth1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Person.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenderCode getGender() {
		return gender;
	}

	public Person setGender(GenderCode gender) {
		this.gender = Objects.requireNonNull(gender);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Person setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public ISODateTime getBirthDate() {
		return birthDate;
	}

	public Person setBirthDate(ISODateTime birthDate) {
		this.birthDate = Objects.requireNonNull(birthDate);
		return this;
	}

	public Location getPlaceOfBirth() {
		return placeOfBirth;
	}

	public Person setPlaceOfBirth(com.tools20022.repository.entity.Location placeOfBirth) {
		this.placeOfBirth = Objects.requireNonNull(placeOfBirth);
		return this;
	}

	public Max35Text getProfession() {
		return profession;
	}

	public Person setProfession(Max35Text profession) {
		this.profession = Objects.requireNonNull(profession);
		return this;
	}

	public ResidentialStatusCode getResidentialStatus() {
		return residentialStatus;
	}

	public Person setResidentialStatus(ResidentialStatusCode residentialStatus) {
		this.residentialStatus = Objects.requireNonNull(residentialStatus);
		return this;
	}

	public List<Country> getNationality() {
		return nationality == null ? nationality = new ArrayList<>() : nationality;
	}

	public Person setNationality(List<Country> nationality) {
		this.nationality = Objects.requireNonNull(nationality);
		return this;
	}

	public YesNoIndicator getMinorIndicator() {
		return minorIndicator;
	}

	public Person setMinorIndicator(YesNoIndicator minorIndicator) {
		this.minorIndicator = Objects.requireNonNull(minorIndicator);
		return this;
	}

	public Max35Text getBusinessFunctionTitle() {
		return businessFunctionTitle;
	}

	public Person setBusinessFunctionTitle(Max35Text businessFunctionTitle) {
		this.businessFunctionTitle = Objects.requireNonNull(businessFunctionTitle);
		return this;
	}

	public List<PersonIdentification> getPersonIdentification() {
		return personIdentification == null ? personIdentification = new ArrayList<>() : personIdentification;
	}

	public Person setPersonIdentification(List<com.tools20022.repository.entity.PersonIdentification> personIdentification) {
		this.personIdentification = Objects.requireNonNull(personIdentification);
		return this;
	}

	public EmployingPartyRole getEmployingParty() {
		return employingParty;
	}

	public Person setEmployingParty(EmployingPartyRole employingParty) {
		this.employingParty = Objects.requireNonNull(employingParty);
		return this;
	}

	public MeetingAttendeeRole getMeetingAttendee() {
		return meetingAttendee;
	}

	public Person setMeetingAttendee(MeetingAttendeeRole meetingAttendee) {
		this.meetingAttendee = Objects.requireNonNull(meetingAttendee);
		return this;
	}

	public List<AssignedProxyRole> getRelatedRole() {
		return relatedRole == null ? relatedRole = new ArrayList<>() : relatedRole;
	}

	public Person setRelatedRole(List<AssignedProxyRole> relatedRole) {
		this.relatedRole = Objects.requireNonNull(relatedRole);
		return this;
	}

	public AssignedProxyRole getPreAssignedProxyPerson() {
		return preAssignedProxyPerson;
	}

	public Person setPreAssignedProxyPerson(AssignedProxyRole preAssignedProxyPerson) {
		this.preAssignedProxyPerson = Objects.requireNonNull(preAssignedProxyPerson);
		return this;
	}

	public PersonProfile getPersonProfile() {
		return personProfile;
	}

	public Person setPersonProfile(com.tools20022.repository.entity.PersonProfile personProfile) {
		this.personProfile = Objects.requireNonNull(personProfile);
		return this;
	}

	public ContactPersonRole getContactPersonRole() {
		return contactPersonRole;
	}

	public Person setContactPersonRole(com.tools20022.repository.entity.ContactPersonRole contactPersonRole) {
		this.contactPersonRole = Objects.requireNonNull(contactPersonRole);
		return this;
	}

	public Household getHousehold() {
		return household;
	}

	public Person setHousehold(com.tools20022.repository.entity.Household household) {
		this.household = Objects.requireNonNull(household);
		return this;
	}

	public CivilStatusCode getCivilStatus() {
		return civilStatus;
	}

	public Person setCivilStatus(CivilStatusCode civilStatus) {
		this.civilStatus = Objects.requireNonNull(civilStatus);
		return this;
	}

	public ISODateTime getDeathDate() {
		return deathDate;
	}

	public Person setDeathDate(ISODateTime deathDate) {
		this.deathDate = Objects.requireNonNull(deathDate);
		return this;
	}

	public ISODate getCitizenshipEndDate() {
		return citizenshipEndDate;
	}

	public Person setCitizenshipEndDate(ISODate citizenshipEndDate) {
		this.citizenshipEndDate = Objects.requireNonNull(citizenshipEndDate);
		return this;
	}

	public ISODate getCitizenshipStartDate() {
		return citizenshipStartDate;
	}

	public Person setCitizenshipStartDate(ISODate citizenshipStartDate) {
		this.citizenshipStartDate = Objects.requireNonNull(citizenshipStartDate);
		return this;
	}
}