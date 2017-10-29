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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a place.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Location" src="doc-files/Location.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Location#NativePerson
 * Location.NativePerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#System
 * Location.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#DomiciledParty
 * Location.DomiciledParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#OperatingOrganisation
 * Location.OperatingOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Address
 * Location.Address}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#IssuedDocument
 * Location.IssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Incoterms
 * Location.Incoterms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DepartureTransportParameters
 * Location.DepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DestinationTransportParameters
 * Location.DestinationTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#InsuranceCertificate
 * Location.InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Party
 * Location.Party}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#RelatedExpiry
 * Location.RelatedExpiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#RelatedJurisdiction
 * Location.RelatedJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Identification
 * Location.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#TaxableParty
 * Location.TaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#RegisteredOrganisation
 * Location.RegisteredOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#RelatedTransport
 * Location.RelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#TimeZone
 * Location.TimeZone}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedLocation
 * GenericIdentification.IdentifiedLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Domicile
 * Party.Domicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Residence
 * Party.Residence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Location
 * Party.Location}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfOperation
 * Organisation.PlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfRegistration
 * Organisation.PlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Location
 * PostalAddress.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UTCOffset#Location
 * UTCOffset.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PlaceOfBirth
 * Person.PlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PlaceOfIssue
 * Document.PlaceOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ClaimsPayableAt
 * InsuranceCertificate.ClaimsPayableAt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Location
 * System.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#ExpiryPlace
 * Expiry.ExpiryPlace}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Jurisdiction#Identification
 * Jurisdiction.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PlaceOfDeparture
 * Transport.PlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#PlaceOfDestination
 * Transport.PlaceOfDestination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransitLocation
 * Transport.TransitLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Location
 * Incoterms.Location}</li>
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
 * "Location"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a place."</li>
 * </ul>
 */
public class Location {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Person for which a birth place is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#PlaceOfBirth
	 * Person.PlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NativePerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which a birth place is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NativePerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NativePerson";
			definition = "Person for which a birth place is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PlaceOfBirth;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System for which a location is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Location
	 * System.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a location is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a location is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which is domiciled in a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Party#Domicile
	 * Party.Domicile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomiciledParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is domiciled in a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DomiciledParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledParty";
			definition = "Party which is domiciled in a specific location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Domicile;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation which has its operations in a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfOperation
	 * Organisation.PlaceOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation which has its operations in a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OperatingOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperatingOrganisation";
			definition = "Organisation which has its operations in a specific location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.PlaceOfOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information that locates and identifies a specific address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#Location
	 * PostalAddress.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#OperationalAddress
	 * Organisation12.OperationalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#OperationalAddress
	 * OrganisationModification1.OperationalAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Address = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation12.OperationalAddress, com.tools20022.repository.msg.OrganisationModification1.OperationalAddress);
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Information that locates and identifies a specific address.";
			minOccurs = 0;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document which was issued at a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#PlaceOfIssue
	 * Document.PlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which was issued at a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuedDocument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedDocument";
			definition = "Document which was issued at a specific location.";
			minOccurs = 0;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfIssue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Incoterms associated with a location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#Location
	 * Incoterms.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incoterms associated with a location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Incoterms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Incoterms associated with a location.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transport parameters linked to a place of departure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#PlaceOfDeparture
	 * Transport.PlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepartureTransportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transport parameters linked to a place of departure."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepartureTransportParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepartureTransportParameters";
			definition = "Transport parameters linked to a place of departure.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.PlaceOfDeparture;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transport parameters linked to a place of destination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#PlaceOfDestination
	 * Transport.PlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DestinationTransportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transport parameters linked to a place of destination."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DestinationTransportParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DestinationTransportParameters";
			definition = "Transport parameters linked to a place of destination.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.PlaceOfDestination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Insurance for which the claims are payable at a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ClaimsPayableAt
	 * InsuranceCertificate.ClaimsPayableAt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insurance for which the claims are payable at a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Insurance for which the claims are payable at a specific location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which resides in a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Party#Residence
	 * Party.Residence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which resides in a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Party = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Party which resides in a specific location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Residence;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Expiry information which contains an expiry location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#ExpiryPlace
	 * Expiry.ExpiryPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedExpiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiry information which contains an expiry location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedExpiry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedExpiry";
			definition = "Expiry information which contains an expiry location.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Expiry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.ExpiryPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction of the location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#Identification
	 * Jurisdiction.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction of the location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedJurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedJurisdiction";
			definition = "Jurisdiction of the location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the location, for instance, the name of an airport, a county,
	 * a state, a province or a city by a code or a text. eg LHR for London
	 * Heathrow airport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedLocation
	 * GenericIdentification.IdentifiedLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the location, for instance, the name of an airport, a county, a state, a province or a city by a code or a text. eg LHR for London Heathrow airport."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the location, for instance, the name of an airport, a county, a state, a province or a city by a code or a text. eg LHR for London Heathrow airport.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Party#Location
	 * Party.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxableParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation which is registered at that location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfRegistration
	 * Organisation.PlaceOfRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is registered at that location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RegisteredOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredOrganisation";
			definition = "Organisation which is registered at that location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.PlaceOfRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transport process for which a transit location is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#TransitLocation
	 * Transport.TransitLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport process for which a transit location is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Transport process for which a transit location is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransitLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Offset of the time before or after 00:00 hour UTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UTCOffset#Location
	 * UTCOffset.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UTCOffset UTCOffset}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Location
	 * Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offset of the time before or after 00:00 hour UTC."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TimeZone = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Location.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeZone";
			definition = "Offset of the time before or after 00:00 hour UTC.";
			minOccurs = 0;
			type_lazy = () -> UTCOffset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UTCOffset.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Location";
				definition = "Specifies a place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation, com.tools20022.repository.entity.Party.Domicile, com.tools20022.repository.entity.Party.Residence,
						com.tools20022.repository.entity.Party.Location, com.tools20022.repository.entity.Organisation.PlaceOfOperation, com.tools20022.repository.entity.Organisation.PlaceOfRegistration,
						com.tools20022.repository.entity.PostalAddress.Location, com.tools20022.repository.entity.UTCOffset.Location, com.tools20022.repository.entity.Person.PlaceOfBirth,
						com.tools20022.repository.entity.Document.PlaceOfIssue, com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt, com.tools20022.repository.entity.System.Location,
						com.tools20022.repository.entity.Expiry.ExpiryPlace, com.tools20022.repository.entity.Jurisdiction.Identification, com.tools20022.repository.entity.Transport.PlaceOfDeparture,
						com.tools20022.repository.entity.Transport.PlaceOfDestination, com.tools20022.repository.entity.Transport.TransitLocation, com.tools20022.repository.entity.Incoterms.Location);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.NativePerson, com.tools20022.repository.entity.Location.System, com.tools20022.repository.entity.Location.DomiciledParty,
						com.tools20022.repository.entity.Location.OperatingOrganisation, com.tools20022.repository.entity.Location.Address, com.tools20022.repository.entity.Location.IssuedDocument,
						com.tools20022.repository.entity.Location.Incoterms, com.tools20022.repository.entity.Location.DepartureTransportParameters, com.tools20022.repository.entity.Location.DestinationTransportParameters,
						com.tools20022.repository.entity.Location.InsuranceCertificate, com.tools20022.repository.entity.Location.Party, com.tools20022.repository.entity.Location.RelatedExpiry,
						com.tools20022.repository.entity.Location.RelatedJurisdiction, com.tools20022.repository.entity.Location.Identification, com.tools20022.repository.entity.Location.TaxableParty,
						com.tools20022.repository.entity.Location.RegisteredOrganisation, com.tools20022.repository.entity.Location.RelatedTransport, com.tools20022.repository.entity.Location.TimeZone);
			}
		});
		return mmObject_lazy.get();
	}
}