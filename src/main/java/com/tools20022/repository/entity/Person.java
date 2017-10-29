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
import com.tools20022.repository.codeset.CivilStatusCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ResidentialStatusCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Gender Person.Gender}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Language
 * Person.Language}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#BirthDate
 * Person.BirthDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PlaceOfBirth
 * Person.PlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Profession
 * Person.Profession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#ResidentialStatus
 * Person.ResidentialStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Nationality
 * Person.Nationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#MinorIndicator
 * Person.MinorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#BusinessFunctionTitle
 * Person.BusinessFunctionTitle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonIdentification
 * Person.PersonIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#EmployingParty
 * Person.EmployingParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#MeetingAttendee
 * Person.MeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#RelatedRole
 * Person.RelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#PreAssignedProxyPerson
 * Person.PreAssignedProxyPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonProfile
 * Person.PersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#ContactPersonRole
 * Person.ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Household
 * Person.Household}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#CivilStatus
 * Person.CivilStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#DeathDate
 * Person.DeathDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Citizen
 * Country.Citizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#NativePerson
 * Location.NativePerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification#Person
 * PersonIdentification.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.EmployingPartyRole#Employee
 * EmployingPartyRole.Employee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Person
 * ContactPersonRole.Person}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#ProxyPerson
 * AssignedProxyRole.ProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#PreAssignedProxyRole
 * AssignedProxyRole.PreAssignedProxyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#Person
 * MeetingAttendeeRole.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#Person
 * PersonProfile.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Household#Member
 * Household.Member}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
	public static final MMBusinessAttribute Gender = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#BirthDate
	 * DateAndPlaceOfBirth.BirthDate}</li>
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
	public static final MMBusinessAttribute BirthDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndPlaceOfBirth.BirthDate);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Place (for instance Country and City) where a person was born.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#NativePerson
	 * Location.NativePerson}</li>
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
	public static final MMBusinessAssociationEnd PlaceOfBirth = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfBirth";
			definition = "Place (for instance Country and City) where a person was born.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.NativePerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Profession = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ResidentialStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the country where a person was born or is legally accepted as
	 * belonging to the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#Citizen
	 * Country.Citizen}</li>
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
	public static final MMBusinessAssociationEnd Nationality = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Citizen;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute MinorIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#Title
	 * TaxAuthorisation1.Title}</li>
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
	public static final MMBusinessAttribute BusinessFunctionTitle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAuthorisation1.Title);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessFunctionTitle";
			definition = "Title of the function in an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specific identification assigned to a person. It is derived from the
	 * association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#Person
	 * PersonIdentification.Person}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#TaxContact
	 * BillingTaxIdentification1.TaxContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountServicerContact
	 * CashAccountCharacteristics2.AccountServicerContact}</li>
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
	public static final MMBusinessAssociationEnd PersonIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxIdentification1.TaxContact, com.tools20022.repository.msg.CashAccountCharacteristics2.AccountServicerContact);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonIdentification";
			definition = "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which is the employer of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#Employee
	 * EmployingPartyRole.Employee}</li>
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
	public static final MMBusinessAssociationEnd EmployingParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EmployingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.Employee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the meeting attendee which is an individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#Person
	 * MeetingAttendeeRole.Person}</li>
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
	public static final MMBusinessAssociationEnd MeetingAttendee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MeetingAttendeeRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role performed by the person for the proxy voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#ProxyPerson
	 * AssignedProxyRole.ProxyPerson}</li>
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
	public static final MMBusinessAssociationEnd RelatedRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			type_lazy = () -> AssignedProxyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the person who is the pre-assigned proxy for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#PreAssignedProxyRole
	 * AssignedProxyRole.PreAssignedProxyRole}</li>
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
	public static final MMBusinessAssociationEnd PreAssignedProxyPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssignedProxyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#Person
	 * PersonProfile.Person}</li>
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
	public static final MMBusinessAssociationEnd PersonProfile = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonProfile";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contact role played by a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Person
	 * ContactPersonRole.Person}</li>
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
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact role played by a person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the members of a household in relation with the ownership of an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Household#Member
	 * Household.Member}</li>
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
	public static final MMBusinessAssociationEnd Household = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Household";
			definition = "Specifies the members of a household in relation with the ownership of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Household.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Household.Member;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute CivilStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CivilStatus";
			definition = "Specifies the civil status of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CivilStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DeathDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeathDate";
			definition = "Date on which a person is dead.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Citizen, com.tools20022.repository.entity.Location.NativePerson, com.tools20022.repository.entity.PersonIdentification.Person,
						com.tools20022.repository.entity.EmployingPartyRole.Employee, com.tools20022.repository.entity.ContactPersonRole.Person, com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson,
						com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole, com.tools20022.repository.entity.MeetingAttendeeRole.Person, com.tools20022.repository.entity.PersonProfile.Person,
						com.tools20022.repository.entity.Household.Member);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.Gender, com.tools20022.repository.entity.Person.Language, com.tools20022.repository.entity.Person.BirthDate,
						com.tools20022.repository.entity.Person.PlaceOfBirth, com.tools20022.repository.entity.Person.Profession, com.tools20022.repository.entity.Person.ResidentialStatus,
						com.tools20022.repository.entity.Person.Nationality, com.tools20022.repository.entity.Person.MinorIndicator, com.tools20022.repository.entity.Person.BusinessFunctionTitle,
						com.tools20022.repository.entity.Person.PersonIdentification, com.tools20022.repository.entity.Person.EmployingParty, com.tools20022.repository.entity.Person.MeetingAttendee,
						com.tools20022.repository.entity.Person.RelatedRole, com.tools20022.repository.entity.Person.PreAssignedProxyPerson, com.tools20022.repository.entity.Person.PersonProfile,
						com.tools20022.repository.entity.Person.ContactPersonRole, com.tools20022.repository.entity.Person.Household, com.tools20022.repository.entity.Person.CivilStatus, com.tools20022.repository.entity.Person.DeathDate);
				derivationComponent_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}