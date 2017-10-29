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
import com.tools20022.repository.codeset.AddressTypeCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.msg.AddressModification1;
import com.tools20022.repository.msg.PostalAddress11;
import com.tools20022.repository.msg.PostalAddress19;
import com.tools20022.repository.msg.PostalAddress6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that locates and identifies a specific address.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PostalAddress" src="doc-files/PostalAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#AddressType
 * PostalAddress.AddressType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#StreetName
 * PostalAddress.StreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#StreetBuildingIdentification
 * PostalAddress.StreetBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#PostCodeIdentification
 * PostalAddress.PostCodeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#TownName
 * PostalAddress.TownName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#State
 * PostalAddress.State}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#BuildingName
 * PostalAddress.BuildingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Floor
 * PostalAddress.Floor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#DistrictName
 * PostalAddress.DistrictName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#RegionIdentification
 * PostalAddress.RegionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#CountyIdentification
 * PostalAddress.CountyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#PostOfficeBox
 * PostalAddress.PostOfficeBox}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Province
 * PostalAddress.Province}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Department
 * PostalAddress.Department}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#SubDepartment
 * PostalAddress.SubDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Location
 * PostalAddress.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#ChequeIssue
 * PostalAddress.ChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Country
 * PostalAddress.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#ValidityPeriod
 * PostalAddress.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#SuiteIdentification
 * PostalAddress.SuiteIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#BuildingIdentification
 * PostalAddress.BuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#MailDeliverySubLocation
 * PostalAddress.MailDeliverySubLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Block
 * PostalAddress.Block}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Lot
 * PostalAddress.Lot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#DistrictSubDivisionIdentification
 * PostalAddress.DistrictSubDivisionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#MailingInstructions
 * PostalAddress.MailingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#PhysicalDelivery
 * PostalAddress.PhysicalDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
 * Country.PostalAddressSpecification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Address
 * Location.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPostalAddress
 * DateTimePeriod.RelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#RelatedPostalAddress
 * MailingInstructions.RelatedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
 * ChequeIssue.DeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#Address
 * PhysicalDelivery.Address}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#PostalAddress
 * FinancialInstitutionIdentification8.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#PostalAddress
 * BranchData2.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#PostalAddress
 * PartyIdentification43.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#PostalAddress
 * PartyIdentification40.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#BusinessAddress
 * Organisation12.BusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#LegalAddress
 * Organisation12.LegalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#BillingAddress
 * Organisation12.BillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1#Address
 * AddressModification1.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#BusinessAddress
 * OrganisationModification1.BusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#LegalAddress
 * OrganisationModification1.LegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#BillingAddress
 * OrganisationModification1.BillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#Address
 * NameAndAddress10.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#PostalAddress
 * PartyIdentification58.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#PostalAddress
 * RemittanceLocationDetails1.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#PostalAddress
 * PartyIdentification77.PostalAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1
 * AddressModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11
 * PostalAddress11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19
 * PostalAddress19}</li>
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
 * "PostalAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that locates and identifies a specific address."</li>
 * </ul>
 */
public class PostalAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#AddressType
	 * PostalAddress6.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#AddressType
	 * PostalAddress11.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#AddressType
	 * PostalAddress19.AddressType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AddressType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.AddressType, com.tools20022.repository.msg.PostalAddress11.AddressType, com.tools20022.repository.msg.PostalAddress19.AddressType);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}
	};
	/**
	 * Name of a street or thoroughfare.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#StreetName
	 * PostalAddress6.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#StreetName
	 * PostalAddress11.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#StreetName
	 * PostalAddress19.StreetName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StreetName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.StreetName, com.tools20022.repository.msg.PostalAddress11.StreetName, com.tools20022.repository.msg.PostalAddress19.StreetName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#BuildingNumber
	 * PostalAddress6.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#BuildingNumber
	 * PostalAddress11.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#BuildingNumber
	 * PostalAddress19.BuildingNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetBuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StreetBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.BuildingNumber, com.tools20022.repository.msg.PostalAddress11.BuildingNumber, com.tools20022.repository.msg.PostalAddress19.BuildingNumber);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#PostCode
	 * PostalAddress6.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#PostCode
	 * PostalAddress11.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#PostCode
	 * PostalAddress19.PostCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostCodeIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.PostCode, com.tools20022.repository.msg.PostalAddress11.PostCode, com.tools20022.repository.msg.PostalAddress19.PostCode);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#TownName
	 * PostalAddress6.TownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#CityOfBirth
	 * DateAndPlaceOfBirth.CityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#TownName
	 * PostalAddress11.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#TownName
	 * PostalAddress19.TownName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TownName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.TownName, com.tools20022.repository.msg.DateAndPlaceOfBirth.CityOfBirth, com.tools20022.repository.msg.PostalAddress11.TownName,
					com.tools20022.repository.msg.PostalAddress19.TownName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Organised political community or area forming a part of a federation.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#CountrySubDivision
	 * PostalAddress6.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#CountrySubDivision
	 * PostalAddress11.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#CountrySubDivision
	 * PostalAddress19.CountrySubDivision}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised political community or area forming a part of a federation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute State = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.CountrySubDivision, com.tools20022.repository.msg.PostalAddress11.CountrySubDivision,
					com.tools20022.repository.msg.PostalAddress19.CountrySubDivision);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of the building or house.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#BuildingName
	 * PostalAddress11.BuildingName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the building or house."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuildingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress11.BuildingName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Floor or storey within a building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Floor
	 * PostalAddress11.Floor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Floor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor or storey within a building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Floor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress11.Floor);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a district, ie, a part of a town or region.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#DistrictName
	 * PostalAddress19.DistrictName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a district, ie, a part of a town or region."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DistrictName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress19.DistrictName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of an administrative division of a country, state, or
	 * territory.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#Area
	 * ResidenceLocation1Choice.Area}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an administrative division of a country, state, or territory."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResidenceLocation1Choice.Area);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier of a county.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#TownLocationName
	 * PostalAddress19.TownLocationName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a county."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CountyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress19.TownLocationName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Numbered box in a post office, assigned to a person or organisation,
	 * where letters are kept until called for.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#PostBox
	 * PostalAddress11.PostBox}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostOfficeBox = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress11.PostBox);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * A territory governed as an administrative or political unit of a country.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#ProvinceOfBirth
	 * DateAndPlaceOfBirth.ProvinceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Province"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A territory governed as an administrative or political unit of a country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Province = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndPlaceOfBirth.ProvinceOfBirth);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#Department
	 * PostalAddress6.Department}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Department
	 * PostalAddress11.Department}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#Department
	 * PostalAddress19.Department}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Department = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.Department, com.tools20022.repository.msg.PostalAddress11.Department, com.tools20022.repository.msg.PostalAddress19.Department);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#SubDepartment
	 * PostalAddress6.SubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#SubDepartment
	 * PostalAddress11.SubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#SubDepartment
	 * PostalAddress19.SubDepartment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.SubDepartment, com.tools20022.repository.msg.PostalAddress11.SubDepartment, com.tools20022.repository.msg.PostalAddress19.SubDepartment);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Specifies a place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#Address
	 * Location.Address}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cheque issue information for which a delivery address is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
	 * ChequeIssue.DeliverTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequeIssue
	 * ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque issue information for which a delivery address is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChequeIssue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliverTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country of the address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
	 * Country.PostalAddressSpecification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#BankAccountDomiciliationCountry
	 * TransactionCertificate1.BankAccountDomiciliationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#CountryOfCounterParty
	 * ShipmentAttribute1.CountryOfCounterParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificate1.BankAccountDomiciliationCountry, com.tools20022.repository.msg.ShipmentAttribute1.CountryOfCounterParty);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.PostalAddressSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which a postal address is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPostalAddress
	 * DateTimePeriod.RelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which a postal address is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a suite or apartment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuiteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a suite or apartment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuiteIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a building, within a group of buildings, that have the
	 * same street number identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a building, within a group of buildings, that have the same street number identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuildingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specific place to deliver mail within a pre-defined postal address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailDeliverySubLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific place to deliver mail within a pre-defined postal address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MailDeliverySubLocation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Area of land bounded by streets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Area of land bounded by streets."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Block = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of an allotment of land.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of an allotment of land."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Lot = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a district.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictSubDivisionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a sub-division of a district."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the characteristics of an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#RelatedPostalAddress
	 * MailingInstructions.RelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the characteristics of an address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MailingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Physical delivery information related to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#Address
	 * PhysicalDelivery.Address}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical delivery information related to an address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Location.Address,
						com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress, com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.DeliverTo,
						com.tools20022.repository.entity.PhysicalDelivery.Address);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.PostalAddress, com.tools20022.repository.msg.BranchData2.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification43.PostalAddress, com.tools20022.repository.msg.PartyIdentification40.PostalAddress, com.tools20022.repository.msg.Organisation12.BusinessAddress,
						com.tools20022.repository.msg.Organisation12.LegalAddress, com.tools20022.repository.msg.Organisation12.BillingAddress, com.tools20022.repository.msg.AddressModification1.Address,
						com.tools20022.repository.msg.OrganisationModification1.BusinessAddress, com.tools20022.repository.msg.OrganisationModification1.LegalAddress, com.tools20022.repository.msg.OrganisationModification1.BillingAddress,
						com.tools20022.repository.msg.NameAndAddress10.Address, com.tools20022.repository.msg.PartyIdentification58.PostalAddress, com.tools20022.repository.msg.RemittanceLocationDetails1.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification77.PostalAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.AddressType, com.tools20022.repository.entity.PostalAddress.StreetName,
						com.tools20022.repository.entity.PostalAddress.StreetBuildingIdentification, com.tools20022.repository.entity.PostalAddress.PostCodeIdentification, com.tools20022.repository.entity.PostalAddress.TownName,
						com.tools20022.repository.entity.PostalAddress.State, com.tools20022.repository.entity.PostalAddress.BuildingName, com.tools20022.repository.entity.PostalAddress.Floor,
						com.tools20022.repository.entity.PostalAddress.DistrictName, com.tools20022.repository.entity.PostalAddress.RegionIdentification, com.tools20022.repository.entity.PostalAddress.CountyIdentification,
						com.tools20022.repository.entity.PostalAddress.PostOfficeBox, com.tools20022.repository.entity.PostalAddress.Province, com.tools20022.repository.entity.PostalAddress.Department,
						com.tools20022.repository.entity.PostalAddress.SubDepartment, com.tools20022.repository.entity.PostalAddress.Location, com.tools20022.repository.entity.PostalAddress.ChequeIssue,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.PostalAddress.ValidityPeriod, com.tools20022.repository.entity.PostalAddress.SuiteIdentification,
						com.tools20022.repository.entity.PostalAddress.BuildingIdentification, com.tools20022.repository.entity.PostalAddress.MailDeliverySubLocation, com.tools20022.repository.entity.PostalAddress.Block,
						com.tools20022.repository.entity.PostalAddress.Lot, com.tools20022.repository.entity.PostalAddress.DistrictSubDivisionIdentification, com.tools20022.repository.entity.PostalAddress.MailingInstructions,
						com.tools20022.repository.entity.PostalAddress.PhysicalDelivery);
				derivationComponent_lazy = () -> Arrays.asList(PostalAddress6.mmObject(), AddressModification1.mmObject(), PostalAddress11.mmObject(), PostalAddress19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}