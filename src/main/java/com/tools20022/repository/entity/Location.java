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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Organisation12;
import com.tools20022.repository.msg.OrganisationModification1;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmNativePerson
 * Location.mmNativePerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmSystem
 * Location.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
 * Location.mmOperatingOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmAddress
 * Location.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
 * Location.mmIssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIncoterms
 * Location.mmIncoterms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
 * Location.mmDepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
 * Location.mmDestinationTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmInsuranceCertificate
 * Location.mmInsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedExpiry
 * Location.mmRelatedExpiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedJurisdiction
 * Location.mmRelatedJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIdentification
 * Location.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
 * Location.mmRegisteredOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
 * Location.mmRelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTimeZone
 * Location.mmTimeZone}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
 * GenericIdentification.mmIdentifiedLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
 * Organisation.mmPlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfRegistration
 * Organisation.mmPlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmLocation
 * PostalAddress.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UTCOffset#mmLocation
 * UTCOffset.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
 * Person.mmPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
 * Document.mmPlaceOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableAt
 * InsuranceCertificate.mmClaimsPayableAt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmLocation
 * System.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmExpiryPlace
 * Expiry.mmExpiryPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmIdentification
 * Jurisdiction.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
 * Transport.mmPlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
 * Transport.mmPlaceOfDestination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransitLocation
 * Transport.mmTransitLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmLocation
 * Incoterms.mmLocation}</li>
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
	protected Person nativePerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
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
	public static final MMBusinessAssociationEnd mmNativePerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NativePerson";
			definition = "Person for which a birth place is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmPlaceOfBirth;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmLocation
	 * System.mmLocation}</li>
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
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a location is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected Party domiciledParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmDomicile
	 * Party.mmDomicile}</li>
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
	public static final MMBusinessAssociationEnd mmDomiciledParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomiciledParty";
			definition = "Party which is domiciled in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmDomicile;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected Organisation operatingOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
	 * Organisation.mmPlaceOfOperation}</li>
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
	public static final MMBusinessAssociationEnd mmOperatingOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperatingOrganisation";
			definition = "Organisation which has its operations in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmPlaceOfOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PostalAddress> address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmLocation
	 * PostalAddress.mmLocation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmOperationalAddress
	 * Organisation12.mmOperationalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmOperationalAddress
	 * OrganisationModification1.mmOperationalAddress}</li>
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
	public static final MMBusinessAssociationEnd mmAddress = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation12.mmOperationalAddress, OrganisationModification1.mmOperationalAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Information that locates and identifies a specific address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Document> issuedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
	 * Document.mmPlaceOfIssue}</li>
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
	public static final MMBusinessAssociationEnd mmIssuedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuedDocument";
			definition = "Document which was issued at a specific location.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmPlaceOfIssue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Incoterms> incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmLocation
	 * Incoterms.mmLocation}</li>
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
	public static final MMBusinessAssociationEnd mmIncoterms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Incoterms associated with a location.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.mmLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
		}
	};
	protected Transport departureTransportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
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
	public static final MMBusinessAssociationEnd mmDepartureTransportParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepartureTransportParameters";
			definition = "Transport parameters linked to a place of departure.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDeparture;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected Transport destinationTransportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
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
	public static final MMBusinessAssociationEnd mmDestinationTransportParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DestinationTransportParameters";
			definition = "Transport parameters linked to a place of destination.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDestination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected InsuranceCertificate insuranceCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableAt
	 * InsuranceCertificate.mmClaimsPayableAt}</li>
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
	public static final MMBusinessAssociationEnd mmInsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Insurance for which the claims are payable at a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmClaimsPayableAt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}
	};
	protected Party party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmResidence
	 * Party.mmResidence}</li>
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
	public static final MMBusinessAssociationEnd mmParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Party which resides in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmResidence;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected Expiry relatedExpiry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmExpiryPlace
	 * Expiry.mmExpiryPlace}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedExpiry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedExpiry";
			definition = "Expiry information which contains an expiry location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.mmExpiryPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
		}
	};
	protected Jurisdiction relatedJurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmIdentification
	 * Jurisdiction.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedJurisdiction";
			definition = "Jurisdiction of the location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
	 * GenericIdentification.mmIdentifiedLocation}</li>
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
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the location, for instance, the name of an airport, a county, a state, a province or a city by a code or a text. eg LHR for London Heathrow airport.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Party taxableParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmLocation
	 * Party.mmLocation}</li>
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
	public static final MMBusinessAssociationEnd mmTaxableParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected Organisation registeredOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfRegistration
	 * Organisation.mmPlaceOfRegistration}</li>
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
	public static final MMBusinessAssociationEnd mmRegisteredOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredOrganisation";
			definition = "Organisation which is registered at that location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmPlaceOfRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected Transport relatedTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransitLocation
	 * Transport.mmTransitLocation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Transport process for which a transit location is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransitLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.UTCOffset> timeZone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UTCOffset#mmLocation
	 * UTCOffset.mmLocation}</li>
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
	public static final MMBusinessAssociationEnd mmTimeZone = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeZone";
			definition = "Offset of the time before or after 00:00 hour UTC.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UTCOffset.mmLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UTCOffset.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Location";
				definition = "Specifies a place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation, com.tools20022.repository.entity.Party.mmDomicile,
						com.tools20022.repository.entity.Party.mmResidence, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Organisation.mmPlaceOfOperation,
						com.tools20022.repository.entity.Organisation.mmPlaceOfRegistration, com.tools20022.repository.entity.PostalAddress.mmLocation, com.tools20022.repository.entity.UTCOffset.mmLocation,
						com.tools20022.repository.entity.Person.mmPlaceOfBirth, com.tools20022.repository.entity.Document.mmPlaceOfIssue, com.tools20022.repository.entity.InsuranceCertificate.mmClaimsPayableAt,
						com.tools20022.repository.entity.System.mmLocation, com.tools20022.repository.entity.Expiry.mmExpiryPlace, com.tools20022.repository.entity.Jurisdiction.mmIdentification,
						com.tools20022.repository.entity.Transport.mmPlaceOfDeparture, com.tools20022.repository.entity.Transport.mmPlaceOfDestination, com.tools20022.repository.entity.Transport.mmTransitLocation,
						com.tools20022.repository.entity.Incoterms.mmLocation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.mmNativePerson, com.tools20022.repository.entity.Location.mmSystem, com.tools20022.repository.entity.Location.mmDomiciledParty,
						com.tools20022.repository.entity.Location.mmOperatingOrganisation, com.tools20022.repository.entity.Location.mmAddress, com.tools20022.repository.entity.Location.mmIssuedDocument,
						com.tools20022.repository.entity.Location.mmIncoterms, com.tools20022.repository.entity.Location.mmDepartureTransportParameters, com.tools20022.repository.entity.Location.mmDestinationTransportParameters,
						com.tools20022.repository.entity.Location.mmInsuranceCertificate, com.tools20022.repository.entity.Location.mmParty, com.tools20022.repository.entity.Location.mmRelatedExpiry,
						com.tools20022.repository.entity.Location.mmRelatedJurisdiction, com.tools20022.repository.entity.Location.mmIdentification, com.tools20022.repository.entity.Location.mmTaxableParty,
						com.tools20022.repository.entity.Location.mmRegisteredOrganisation, com.tools20022.repository.entity.Location.mmRelatedTransport, com.tools20022.repository.entity.Location.mmTimeZone);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Location.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Person> getNativePerson() {
		return nativePerson == null ? Optional.empty() : Optional.of(nativePerson);
	}

	public Location setNativePerson(com.tools20022.repository.entity.Person nativePerson) {
		this.nativePerson = nativePerson;
		return this;
	}

	public System getSystem() {
		return system;
	}

	public Location setSystem(com.tools20022.repository.entity.System system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public Optional<Party> getDomiciledParty() {
		return domiciledParty == null ? Optional.empty() : Optional.of(domiciledParty);
	}

	public Location setDomiciledParty(com.tools20022.repository.entity.Party domiciledParty) {
		this.domiciledParty = domiciledParty;
		return this;
	}

	public Optional<Organisation> getOperatingOrganisation() {
		return operatingOrganisation == null ? Optional.empty() : Optional.of(operatingOrganisation);
	}

	public Location setOperatingOrganisation(com.tools20022.repository.entity.Organisation operatingOrganisation) {
		this.operatingOrganisation = operatingOrganisation;
		return this;
	}

	public List<PostalAddress> getAddress() {
		return address == null ? address = new ArrayList<>() : address;
	}

	public Location setAddress(List<com.tools20022.repository.entity.PostalAddress> address) {
		this.address = Objects.requireNonNull(address);
		return this;
	}

	public List<Document> getIssuedDocument() {
		return issuedDocument == null ? issuedDocument = new ArrayList<>() : issuedDocument;
	}

	public Location setIssuedDocument(List<com.tools20022.repository.entity.Document> issuedDocument) {
		this.issuedDocument = Objects.requireNonNull(issuedDocument);
		return this;
	}

	public List<Incoterms> getIncoterms() {
		return incoterms == null ? incoterms = new ArrayList<>() : incoterms;
	}

	public Location setIncoterms(List<com.tools20022.repository.entity.Incoterms> incoterms) {
		this.incoterms = Objects.requireNonNull(incoterms);
		return this;
	}

	public Optional<Transport> getDepartureTransportParameters() {
		return departureTransportParameters == null ? Optional.empty() : Optional.of(departureTransportParameters);
	}

	public Location setDepartureTransportParameters(com.tools20022.repository.entity.Transport departureTransportParameters) {
		this.departureTransportParameters = departureTransportParameters;
		return this;
	}

	public Optional<Transport> getDestinationTransportParameters() {
		return destinationTransportParameters == null ? Optional.empty() : Optional.of(destinationTransportParameters);
	}

	public Location setDestinationTransportParameters(com.tools20022.repository.entity.Transport destinationTransportParameters) {
		this.destinationTransportParameters = destinationTransportParameters;
		return this;
	}

	public Optional<InsuranceCertificate> getInsuranceCertificate() {
		return insuranceCertificate == null ? Optional.empty() : Optional.of(insuranceCertificate);
	}

	public Location setInsuranceCertificate(com.tools20022.repository.entity.InsuranceCertificate insuranceCertificate) {
		this.insuranceCertificate = insuranceCertificate;
		return this;
	}

	public Optional<Party> getParty() {
		return party == null ? Optional.empty() : Optional.of(party);
	}

	public Location setParty(com.tools20022.repository.entity.Party party) {
		this.party = party;
		return this;
	}

	public Expiry getRelatedExpiry() {
		return relatedExpiry;
	}

	public Location setRelatedExpiry(com.tools20022.repository.entity.Expiry relatedExpiry) {
		this.relatedExpiry = Objects.requireNonNull(relatedExpiry);
		return this;
	}

	public Optional<Jurisdiction> getRelatedJurisdiction() {
		return relatedJurisdiction == null ? Optional.empty() : Optional.of(relatedJurisdiction);
	}

	public Location setRelatedJurisdiction(com.tools20022.repository.entity.Jurisdiction relatedJurisdiction) {
		this.relatedJurisdiction = relatedJurisdiction;
		return this;
	}

	public List<GenericIdentification> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Location setIdentification(List<com.tools20022.repository.entity.GenericIdentification> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Party> getTaxableParty() {
		return taxableParty == null ? Optional.empty() : Optional.of(taxableParty);
	}

	public Location setTaxableParty(com.tools20022.repository.entity.Party taxableParty) {
		this.taxableParty = taxableParty;
		return this;
	}

	public Optional<Organisation> getRegisteredOrganisation() {
		return registeredOrganisation == null ? Optional.empty() : Optional.of(registeredOrganisation);
	}

	public Location setRegisteredOrganisation(com.tools20022.repository.entity.Organisation registeredOrganisation) {
		this.registeredOrganisation = registeredOrganisation;
		return this;
	}

	public Transport getRelatedTransport() {
		return relatedTransport;
	}

	public Location setRelatedTransport(com.tools20022.repository.entity.Transport relatedTransport) {
		this.relatedTransport = Objects.requireNonNull(relatedTransport);
		return this;
	}

	public List<UTCOffset> getTimeZone() {
		return timeZone == null ? timeZone = new ArrayList<>() : timeZone;
	}

	public Location setTimeZone(List<com.tools20022.repository.entity.UTCOffset> timeZone) {
		this.timeZone = Objects.requireNonNull(timeZone);
		return this;
	}
}