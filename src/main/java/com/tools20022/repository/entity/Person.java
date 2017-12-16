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
import com.tools20022.repository.codeset.CivilStatusCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ResidentialStatusCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BillingTaxIdentification1;
import com.tools20022.repository.msg.CashAccountCharacteristics2;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import com.tools20022.repository.msg.TaxAuthorisation1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
 * DateAndPlaceOfBirth}</li>
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
	 * Specifies the gender of the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
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
	public static final MMBusinessAttribute mmGender = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getGender", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LanguageCode language;
	/**
	 * Language in which a person communicates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
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
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime birthDate;
	/**
	 * Date on which a person is born.
	 * <p>
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
	public static final MMBusinessAttribute mmBirthDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmBirthDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getBirthDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Location placeOfBirth;
	/**
	 * Place (for instance Country and City) where a person was born.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPlaceOfBirth = new MMBusinessAssociationEnd() {
		{
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
	};
	protected Max35Text profession;
	/**
	 * Name of the occupation or job of a person.
	 * <p>
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
	public static final MMBusinessAttribute mmProfession = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getProfession", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ResidentialStatusCode residentialStatus;
	/**
	 * Residential status of an individual, for example, non-permanent resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
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
	public static final MMBusinessAttribute mmResidentialStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getResidentialStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Country> nationality;
	/**
	 * Specifies the country where a person was born or is legally accepted as
	 * belonging to the country.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmNationality = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCitizen;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected YesNoIndicator minorIndicator;
	/**
	 * Indicates whether the person is a legal minor. It may depend on the
	 * nationality, the domicile country or the transaction in which the person
	 * is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
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
	public static final MMBusinessAttribute mmMinorIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getMinorIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text businessFunctionTitle;
	/**
	 * Title of the function in an organisation.
	 * <p>
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
	public static final MMBusinessAttribute mmBusinessFunctionTitle = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getBusinessFunctionTitle", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PersonIdentification> personIdentification;
	/**
	 * Specific identification assigned to a person. It is derived from the
	 * association between Party and PartyIdentification.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPersonIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BillingTaxIdentification1.mmTaxContact, CashAccountCharacteristics2.mmAccountServicerContact);
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
	};
	protected EmployingPartyRole employingParty;
	/**
	 * Party which is the employer of a person.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmEmployingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.mmEmployee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.mmObject();
		}
	};
	protected MeetingAttendeeRole meetingAttendee;
	/**
	 * Specifies the meeting attendee which is an individual person.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMeetingAttendee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssignedProxyRole> relatedRole;
	/**
	 * Role performed by the person for the proxy voting process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmProxyPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
		}
	};
	protected AssignedProxyRole preAssignedProxyPerson;
	/**
	 * Specifies the person who is the pre-assigned proxy for a meeting.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPreAssignedProxyPerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmPreAssignedProxyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
		}
	};
	protected PersonProfile personProfile;
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPersonProfile = new MMBusinessAssociationEnd() {
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
	};
	protected ContactPersonRole contactPersonRole;
	/**
	 * Contact role played by a person.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmContactPersonRole = new MMBusinessAssociationEnd() {
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
	};
	protected Household household;
	/**
	 * Specifies the members of a household in relation with the ownership of an
	 * account.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmHousehold = new MMBusinessAssociationEnd() {
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
	};
	protected CivilStatusCode civilStatus;
	/**
	 * Specifies the civil status of a person.
	 * <p>
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
	public static final MMBusinessAttribute mmCivilStatus = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getCivilStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime deathDate;
	/**
	 * Date on which a person is dead.
	 * <p>
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
	public static final MMBusinessAttribute mmDeathDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Person.class.getMethod("getDeathDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCitizen, com.tools20022.repository.entity.Location.mmNativePerson, com.tools20022.repository.entity.PersonIdentification.mmPerson,
						com.tools20022.repository.entity.EmployingPartyRole.mmEmployee, com.tools20022.repository.entity.ContactPersonRole.mmPerson, com.tools20022.repository.entity.AssignedProxyRole.mmProxyPerson,
						com.tools20022.repository.entity.AssignedProxyRole.mmPreAssignedProxyRole, com.tools20022.repository.entity.MeetingAttendeeRole.mmPerson, com.tools20022.repository.entity.PersonProfile.mmPerson,
						com.tools20022.repository.entity.Household.mmMember);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.mmGender, com.tools20022.repository.entity.Person.mmLanguage, com.tools20022.repository.entity.Person.mmBirthDate,
						com.tools20022.repository.entity.Person.mmPlaceOfBirth, com.tools20022.repository.entity.Person.mmProfession, com.tools20022.repository.entity.Person.mmResidentialStatus,
						com.tools20022.repository.entity.Person.mmNationality, com.tools20022.repository.entity.Person.mmMinorIndicator, com.tools20022.repository.entity.Person.mmBusinessFunctionTitle,
						com.tools20022.repository.entity.Person.mmPersonIdentification, com.tools20022.repository.entity.Person.mmEmployingParty, com.tools20022.repository.entity.Person.mmMeetingAttendee,
						com.tools20022.repository.entity.Person.mmRelatedRole, com.tools20022.repository.entity.Person.mmPreAssignedProxyPerson, com.tools20022.repository.entity.Person.mmPersonProfile,
						com.tools20022.repository.entity.Person.mmContactPersonRole, com.tools20022.repository.entity.Person.mmHousehold, com.tools20022.repository.entity.Person.mmCivilStatus,
						com.tools20022.repository.entity.Person.mmDeathDate);
				derivationComponent_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmObject());
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

	public void setGender(GenderCode gender) {
		this.gender = gender;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public ISODateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ISODateTime birthDate) {
		this.birthDate = birthDate;
	}

	public Location getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(com.tools20022.repository.entity.Location placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Max35Text getProfession() {
		return profession;
	}

	public void setProfession(Max35Text profession) {
		this.profession = profession;
	}

	public ResidentialStatusCode getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(ResidentialStatusCode residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public List<Country> getNationality() {
		return nationality;
	}

	public void setNationality(List<com.tools20022.repository.entity.Country> nationality) {
		this.nationality = nationality;
	}

	public YesNoIndicator getMinorIndicator() {
		return minorIndicator;
	}

	public void setMinorIndicator(YesNoIndicator minorIndicator) {
		this.minorIndicator = minorIndicator;
	}

	public Max35Text getBusinessFunctionTitle() {
		return businessFunctionTitle;
	}

	public void setBusinessFunctionTitle(Max35Text businessFunctionTitle) {
		this.businessFunctionTitle = businessFunctionTitle;
	}

	public List<PersonIdentification> getPersonIdentification() {
		return personIdentification;
	}

	public void setPersonIdentification(List<com.tools20022.repository.entity.PersonIdentification> personIdentification) {
		this.personIdentification = personIdentification;
	}

	public EmployingPartyRole getEmployingParty() {
		return employingParty;
	}

	public void setEmployingParty(com.tools20022.repository.entity.EmployingPartyRole employingParty) {
		this.employingParty = employingParty;
	}

	public MeetingAttendeeRole getMeetingAttendee() {
		return meetingAttendee;
	}

	public void setMeetingAttendee(com.tools20022.repository.entity.MeetingAttendeeRole meetingAttendee) {
		this.meetingAttendee = meetingAttendee;
	}

	public List<AssignedProxyRole> getRelatedRole() {
		return relatedRole;
	}

	public void setRelatedRole(List<com.tools20022.repository.entity.AssignedProxyRole> relatedRole) {
		this.relatedRole = relatedRole;
	}

	public AssignedProxyRole getPreAssignedProxyPerson() {
		return preAssignedProxyPerson;
	}

	public void setPreAssignedProxyPerson(com.tools20022.repository.entity.AssignedProxyRole preAssignedProxyPerson) {
		this.preAssignedProxyPerson = preAssignedProxyPerson;
	}

	public PersonProfile getPersonProfile() {
		return personProfile;
	}

	public void setPersonProfile(com.tools20022.repository.entity.PersonProfile personProfile) {
		this.personProfile = personProfile;
	}

	public ContactPersonRole getContactPersonRole() {
		return contactPersonRole;
	}

	public void setContactPersonRole(com.tools20022.repository.entity.ContactPersonRole contactPersonRole) {
		this.contactPersonRole = contactPersonRole;
	}

	public Household getHousehold() {
		return household;
	}

	public void setHousehold(com.tools20022.repository.entity.Household household) {
		this.household = household;
	}

	public CivilStatusCode getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(CivilStatusCode civilStatus) {
		this.civilStatus = civilStatus;
	}

	public ISODateTime getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(ISODateTime deathDate) {
		this.deathDate = deathDate;
	}
}