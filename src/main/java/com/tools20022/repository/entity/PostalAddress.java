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
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.codeset.AddressTypeCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmAddressType
 * PostalAddress.mmAddressType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetName
 * PostalAddress.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetBuildingIdentification
 * PostalAddress.mmStreetBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostCodeIdentification
 * PostalAddress.mmPostCodeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
 * PostalAddress.mmTownName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmState
 * PostalAddress.mmState}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingName
 * PostalAddress.mmBuildingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmFloor
 * PostalAddress.mmFloor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmDistrictName
 * PostalAddress.mmDistrictName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmRegionIdentification
 * PostalAddress.mmRegionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountyIdentification
 * PostalAddress.mmCountyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostOfficeBox
 * PostalAddress.mmPostOfficeBox}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmProvince
 * PostalAddress.mmProvince}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmDepartment
 * PostalAddress.mmDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmSubDepartment
 * PostalAddress.mmSubDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmLocation
 * PostalAddress.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmChequeIssue
 * PostalAddress.mmChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
 * PostalAddress.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
 * PostalAddress.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmSuiteIdentification
 * PostalAddress.mmSuiteIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingIdentification
 * PostalAddress.mmBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailDeliverySubLocation
 * PostalAddress.mmMailDeliverySubLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmBlock
 * PostalAddress.mmBlock}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmLot
 * PostalAddress.mmLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmDistrictSubDivisionIdentification
 * PostalAddress.mmDistrictSubDivisionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailingInstructions
 * PostalAddress.mmMailingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPhysicalDelivery
 * PostalAddress.mmPhysicalDelivery}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
 * Country.mmPostalAddressSpecification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmAddress
 * Location.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
 * DateTimePeriod.mmRelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
 * MailingInstructions.mmRelatedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
 * ChequeIssue.mmDeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
 * PhysicalDelivery.mmAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmPostalAddress
 * FinancialInstitutionIdentification8.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#mmPostalAddress
 * BranchData2.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmPostalAddress
 * PartyIdentification43.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmPostalAddress
 * PartyIdentification40.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation12#mmBusinessAddress
 * Organisation12.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#mmLegalAddress
 * Organisation12.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation12#mmBillingAddress
 * Organisation12.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1#mmAddress
 * AddressModification1.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBusinessAddress
 * OrganisationModification1.mmBusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmLegalAddress
 * OrganisationModification1.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBillingAddress
 * OrganisationModification1.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#mmAddress
 * NameAndAddress10.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmPostalAddress
 * PartyIdentification42.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmPostalAddress
 * PartyIdentification58.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmPostalAddress
 * RemittanceLocationDetails1.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmPostalAddress
 * PartyIdentification77.mmPostalAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "PostalAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that locates and identifies a specific address."</li>
 * </ul>
 */
public class PostalAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressTypeCode addressType;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmAddressType
	 * PostalAddress6.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmAddressType
	 * PostalAddress11.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmAddressType
	 * PostalAddress19.mmAddressType}</li>
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
	public static final MMBusinessAttribute mmAddressType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmAddressType, PostalAddress11.mmAddressType, PostalAddress19.mmAddressType);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getAddressType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text streetName;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmStreetName
	 * PostalAddress6.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmStreetName
	 * PostalAddress11.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmStreetName
	 * PostalAddress19.mmStreetName}</li>
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
	public static final MMBusinessAttribute mmStreetName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmStreetName, PostalAddress11.mmStreetName, PostalAddress19.mmStreetName);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getStreetName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text streetBuildingIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmBuildingNumber
	 * PostalAddress6.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmBuildingNumber
	 * PostalAddress11.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmBuildingNumber
	 * PostalAddress19.mmBuildingNumber}</li>
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
	public static final MMBusinessAttribute mmStreetBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmBuildingNumber, PostalAddress11.mmBuildingNumber, PostalAddress19.mmBuildingNumber);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getStreetBuildingIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text postCodeIdentification;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmPostCode
	 * PostalAddress6.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmPostCode
	 * PostalAddress11.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmPostCode
	 * PostalAddress19.mmPostCode}</li>
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
	public static final MMBusinessAttribute mmPostCodeIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmPostCode, PostalAddress11.mmPostCode, PostalAddress19.mmPostCode);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getPostCodeIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text townName;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmTownName
	 * PostalAddress6.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmCityOfBirth
	 * DateAndPlaceOfBirth.mmCityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmTownName
	 * PostalAddress11.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmTownName
	 * PostalAddress19.mmTownName}</li>
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
	public static final MMBusinessAttribute mmTownName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmTownName, DateAndPlaceOfBirth.mmCityOfBirth, PostalAddress11.mmTownName, PostalAddress19.mmTownName);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getTownName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text state;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountrySubDivision
	 * PostalAddress6.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmCountrySubDivision
	 * PostalAddress11.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmCountrySubDivision
	 * PostalAddress19.mmCountrySubDivision}</li>
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
	public static final MMBusinessAttribute mmState = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmCountrySubDivision, PostalAddress11.mmCountrySubDivision, PostalAddress19.mmCountrySubDivision);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getState", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text buildingName;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmBuildingName
	 * PostalAddress11.mmBuildingName}</li>
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
	public static final MMBusinessAttribute mmBuildingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress11.mmBuildingName);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getBuildingName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text floor;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmFloor
	 * PostalAddress11.mmFloor}</li>
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
	public static final MMBusinessAttribute mmFloor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress11.mmFloor);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getFloor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text districtName;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmDistrictName
	 * PostalAddress19.mmDistrictName}</li>
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
	public static final MMBusinessAttribute mmDistrictName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress19.mmDistrictName);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getDistrictName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text regionIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#mmArea
	 * ResidenceLocation1Choice.mmArea}</li>
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
	public static final MMBusinessAttribute mmRegionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ResidenceLocation1Choice.mmArea);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getRegionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text countyIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmTownLocationName
	 * PostalAddress19.mmTownLocationName}</li>
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
	public static final MMBusinessAttribute mmCountyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress19.mmTownLocationName);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getCountyIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text postOfficeBox;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmPostBox
	 * PostalAddress11.mmPostBox}</li>
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
	public static final MMBusinessAttribute mmPostOfficeBox = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress11.mmPostBox);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getPostOfficeBox", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text province;
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
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmProvinceOfBirth
	 * DateAndPlaceOfBirth.mmProvinceOfBirth}</li>
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
	public static final MMBusinessAttribute mmProvince = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmProvinceOfBirth);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getProvince", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text department;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmDepartment
	 * PostalAddress6.mmDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmDepartment
	 * PostalAddress11.mmDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmDepartment
	 * PostalAddress19.mmDepartment}</li>
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
	public static final MMBusinessAttribute mmDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmDepartment, PostalAddress11.mmDepartment, PostalAddress19.mmDepartment);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getDepartment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text subDepartment;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmSubDepartment
	 * PostalAddress6.mmSubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmSubDepartment
	 * PostalAddress11.mmSubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmSubDepartment
	 * PostalAddress19.mmSubDepartment}</li>
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
	public static final MMBusinessAttribute mmSubDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmSubDepartment, PostalAddress11.mmSubDepartment, PostalAddress19.mmSubDepartment);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getSubDepartment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Location location;
	/**
	 * Specifies a place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
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
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected ChequeIssue chequeIssue;
	/**
	 * Cheque issue information for which a delivery address is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
	 * ChequeIssue.mmDeliverTo}</li>
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
	public static final MMBusinessAssociationEnd mmChequeIssue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmDeliverTo;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
		}
	};
	protected Country country;
	/**
	 * Country of the address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
	 * Country.mmPostalAddressSpecification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#mmBankAccountDomiciliationCountry
	 * TransactionCertificate1.mmBankAccountDomiciliationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmCountryOfCounterParty
	 * ShipmentAttribute1.mmCountryOfCounterParty}</li>
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
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificate1.mmBankAccountDomiciliationCountry, ShipmentAttribute1.mmCountryOfCounterParty);
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmPostalAddressSpecification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Specifies the period during which a postal address is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
	 * DateTimePeriod.mmRelatedPostalAddress}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max35Text suiteIdentification;
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
	public static final MMBusinessAttribute mmSuiteIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getSuiteIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text buildingIdentification;
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
	public static final MMBusinessAttribute mmBuildingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getBuildingIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text mailDeliverySubLocation;
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
	public static final MMBusinessAttribute mmMailDeliverySubLocation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getMailDeliverySubLocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text block;
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
	public static final MMBusinessAttribute mmBlock = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getBlock", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text lot;
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
	public static final MMBusinessAttribute mmLot = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getLot", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text districtSubDivisionIdentification;
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
	public static final MMBusinessAttribute mmDistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PostalAddress.class.getMethod("getDistrictSubDivisionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions;
	/**
	 * Specifies the characteristics of an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
	 * MailingInstructions.mmRelatedPostalAddress}</li>
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
	public static final MMBusinessAssociationEnd mmMailingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * Physical delivery information related to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
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
	public static final MMBusinessAssociationEnd mmPhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmPostalAddressSpecification, com.tools20022.repository.entity.Location.mmAddress,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress, com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.mmDeliverTo,
						com.tools20022.repository.entity.PhysicalDelivery.mmAddress);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmPostalAddress, BranchData2.mmPostalAddress, PartyIdentification43.mmPostalAddress, PartyIdentification40.mmPostalAddress,
						Organisation12.mmBusinessAddress, Organisation12.mmLegalAddress, Organisation12.mmBillingAddress, AddressModification1.mmAddress, OrganisationModification1.mmBusinessAddress,
						OrganisationModification1.mmLegalAddress, OrganisationModification1.mmBillingAddress, NameAndAddress10.mmAddress, PartyIdentification42.mmPostalAddress, PartyIdentification58.mmPostalAddress,
						RemittanceLocationDetails1.mmPostalAddress, PartyIdentification77.mmPostalAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.mmAddressType, com.tools20022.repository.entity.PostalAddress.mmStreetName,
						com.tools20022.repository.entity.PostalAddress.mmStreetBuildingIdentification, com.tools20022.repository.entity.PostalAddress.mmPostCodeIdentification, com.tools20022.repository.entity.PostalAddress.mmTownName,
						com.tools20022.repository.entity.PostalAddress.mmState, com.tools20022.repository.entity.PostalAddress.mmBuildingName, com.tools20022.repository.entity.PostalAddress.mmFloor,
						com.tools20022.repository.entity.PostalAddress.mmDistrictName, com.tools20022.repository.entity.PostalAddress.mmRegionIdentification, com.tools20022.repository.entity.PostalAddress.mmCountyIdentification,
						com.tools20022.repository.entity.PostalAddress.mmPostOfficeBox, com.tools20022.repository.entity.PostalAddress.mmProvince, com.tools20022.repository.entity.PostalAddress.mmDepartment,
						com.tools20022.repository.entity.PostalAddress.mmSubDepartment, com.tools20022.repository.entity.PostalAddress.mmLocation, com.tools20022.repository.entity.PostalAddress.mmChequeIssue,
						com.tools20022.repository.entity.PostalAddress.mmCountry, com.tools20022.repository.entity.PostalAddress.mmValidityPeriod, com.tools20022.repository.entity.PostalAddress.mmSuiteIdentification,
						com.tools20022.repository.entity.PostalAddress.mmBuildingIdentification, com.tools20022.repository.entity.PostalAddress.mmMailDeliverySubLocation, com.tools20022.repository.entity.PostalAddress.mmBlock,
						com.tools20022.repository.entity.PostalAddress.mmLot, com.tools20022.repository.entity.PostalAddress.mmDistrictSubDivisionIdentification, com.tools20022.repository.entity.PostalAddress.mmMailingInstructions,
						com.tools20022.repository.entity.PostalAddress.mmPhysicalDelivery);
				derivationComponent_lazy = () -> Arrays.asList(PostalAddress6.mmObject(), AddressModification1.mmObject(), PostalAddress11.mmObject(), PostalAddress19.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PostalAddress.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AddressTypeCode getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressTypeCode addressType) {
		this.addressType = addressType;
	}

	public Max35Text getStreetName() {
		return streetName;
	}

	public void setStreetName(Max35Text streetName) {
		this.streetName = streetName;
	}

	public Max35Text getStreetBuildingIdentification() {
		return streetBuildingIdentification;
	}

	public void setStreetBuildingIdentification(Max35Text streetBuildingIdentification) {
		this.streetBuildingIdentification = streetBuildingIdentification;
	}

	public Max16Text getPostCodeIdentification() {
		return postCodeIdentification;
	}

	public void setPostCodeIdentification(Max16Text postCodeIdentification) {
		this.postCodeIdentification = postCodeIdentification;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public void setTownName(Max35Text townName) {
		this.townName = townName;
	}

	public Max35Text getState() {
		return state;
	}

	public void setState(Max35Text state) {
		this.state = state;
	}

	public Max35Text getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(Max35Text buildingName) {
		this.buildingName = buildingName;
	}

	public Max16Text getFloor() {
		return floor;
	}

	public void setFloor(Max16Text floor) {
		this.floor = floor;
	}

	public Max35Text getDistrictName() {
		return districtName;
	}

	public void setDistrictName(Max35Text districtName) {
		this.districtName = districtName;
	}

	public Max35Text getRegionIdentification() {
		return regionIdentification;
	}

	public void setRegionIdentification(Max35Text regionIdentification) {
		this.regionIdentification = regionIdentification;
	}

	public Max35Text getCountyIdentification() {
		return countyIdentification;
	}

	public void setCountyIdentification(Max35Text countyIdentification) {
		this.countyIdentification = countyIdentification;
	}

	public Max16Text getPostOfficeBox() {
		return postOfficeBox;
	}

	public void setPostOfficeBox(Max16Text postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public Max35Text getProvince() {
		return province;
	}

	public void setProvince(Max35Text province) {
		this.province = province;
	}

	public Max70Text getDepartment() {
		return department;
	}

	public void setDepartment(Max70Text department) {
		this.department = department;
	}

	public Max70Text getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(Max70Text subDepartment) {
		this.subDepartment = subDepartment;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public ChequeIssue getChequeIssue() {
		return chequeIssue;
	}

	public void setChequeIssue(com.tools20022.repository.entity.ChequeIssue chequeIssue) {
		this.chequeIssue = chequeIssue;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Max35Text getSuiteIdentification() {
		return suiteIdentification;
	}

	public void setSuiteIdentification(Max35Text suiteIdentification) {
		this.suiteIdentification = suiteIdentification;
	}

	public Max35Text getBuildingIdentification() {
		return buildingIdentification;
	}

	public void setBuildingIdentification(Max35Text buildingIdentification) {
		this.buildingIdentification = buildingIdentification;
	}

	public Max35Text getMailDeliverySubLocation() {
		return mailDeliverySubLocation;
	}

	public void setMailDeliverySubLocation(Max35Text mailDeliverySubLocation) {
		this.mailDeliverySubLocation = mailDeliverySubLocation;
	}

	public Max35Text getBlock() {
		return block;
	}

	public void setBlock(Max35Text block) {
		this.block = block;
	}

	public Max35Text getLot() {
		return lot;
	}

	public void setLot(Max35Text lot) {
		this.lot = lot;
	}

	public Max35Text getDistrictSubDivisionIdentification() {
		return districtSubDivisionIdentification;
	}

	public void setDistrictSubDivisionIdentification(Max35Text districtSubDivisionIdentification) {
		this.districtSubDivisionIdentification = districtSubDivisionIdentification;
	}

	public List<MailingInstructions> getMailingInstructions() {
		return mailingInstructions;
	}

	public void setMailingInstructions(List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions) {
		this.mailingInstructions = mailingInstructions;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return physicalDelivery;
	}

	public void setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = physicalDelivery;
	}
}