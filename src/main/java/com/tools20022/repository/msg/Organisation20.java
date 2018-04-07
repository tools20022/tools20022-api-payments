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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.OrganisationLegalStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification125;
import com.tools20022.repository.msg.PostalAddress6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmFullLegalName
 * Organisation20.mmFullLegalName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmTradingName
 * Organisation20.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmOrganisationLegalStatus
 * Organisation20.mmOrganisationLegalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmEstablishedDate
 * Organisation20.mmEstablishedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRegistrationNumber
 * Organisation20.mmRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRegistrationCountry
 * Organisation20.mmRegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRegistrationDate
 * Organisation20.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmTaxationIdentificationNumber
 * Organisation20.mmTaxationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmTaxationCountry
 * Organisation20.mmTaxationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmCountryOfOperation
 * Organisation20.mmCountryOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmBoardResolutionIndicator
 * Organisation20.mmBoardResolutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmBusinessAddress
 * Organisation20.mmBusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmOperationalAddress
 * Organisation20.mmOperationalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmLegalAddress
 * Organisation20.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRepresentativeOfficer
 * Organisation20.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmTreasuryManager
 * Organisation20.mmTreasuryManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmMainMandateHolder
 * Organisation20.mmMainMandateHolder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmSender
 * Organisation20.mmSender}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation20", propOrder = {"fullLegalName", "tradingName", "organisationLegalStatus", "establishedDate", "registrationNumber", "registrationCountry", "registrationDate", "taxationIdentificationNumber",
		"taxationCountry", "countryOfOperation", "boardResolutionIndicator", "businessAddress", "operationalAddress", "legalAddress", "representativeOfficer", "treasuryManager", "mainMandateHolder", "sender"})
public class Organisation20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FullLglNm", required = true)
	protected Max350Text fullLegalName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
	 * OrganisationName.mmLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullLglNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Max350Text> mmFullLegalName = new MMMessageAttribute<Organisation20, Max350Text>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmLegalName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "FullLglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Organisation20 obj) {
			return obj.getFullLegalName();
		}

		@Override
		public void setValue(Organisation20 obj, Max350Text value) {
			obj.setFullLegalName(value);
		}
	};
	@XmlElement(name = "TradgNm")
	protected Max350Text tradingName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
	 * OrganisationName.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<Max350Text>> mmTradingName = new MMMessageAttribute<Organisation20, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmTradingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "TradgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Organisation20 obj) {
			return obj.getTradingName();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<Max350Text> value) {
			obj.setTradingName(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgLglSts")
	protected OrganisationLegalStatus1Code organisationLegalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmLegalStructure
	 * Organisation.mmLegalStructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgLglSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationLegalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a legal entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<OrganisationLegalStatus1Code>> mmOrganisationLegalStatus = new MMMessageAttribute<Organisation20, Optional<OrganisationLegalStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmLegalStructure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "OrgLglSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationLegalStatus";
			definition = "Status of a legal entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OrganisationLegalStatus1Code.mmObject();
		}

		@Override
		public Optional<OrganisationLegalStatus1Code> getValue(Organisation20 obj) {
			return obj.getOrganisationLegalStatus();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<OrganisationLegalStatus1Code> value) {
			obj.setOrganisationLegalStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "EstblishdDt")
	protected ISODate establishedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstblishdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of establishment or date of founding of an institution is the date on which that institution chooses to claim as its starting point."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<ISODate>> mmEstablishedDate = new MMMessageAttribute<Organisation20, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "EstblishdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedDate";
			definition = "Date of establishment or date of founding of an institution is the date on which that institution chooses to claim as its starting point.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Organisation20 obj) {
			return obj.getEstablishedDate();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<ISODate> value) {
			obj.setEstablishedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnNb")
	protected Max70Text registrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration number for the organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<Max70Text>> mmRegistrationNumber = new MMMessageAttribute<Organisation20, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "RegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationNumber";
			definition = "Registration number for the organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Organisation20 obj) {
			return obj.getRegistrationNumber();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<Max70Text> value) {
			obj.setRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnCtry")
	protected CountryCode registrationCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the organisation is registered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<CountryCode>> mmRegistrationCountry = new MMMessageAttribute<Organisation20, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Organisation20 obj) {
			return obj.getRegistrationCountry();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<CountryCode> value) {
			obj.setRegistrationCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDt")
	protected ISODate registrationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<ISODate>> mmRegistrationDate = new MMMessageAttribute<Organisation20, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Organisation20 obj) {
			return obj.getRegistrationDate();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<ISODate> value) {
			obj.setRegistrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnIdNb")
	protected Max35Text taxationIdentificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxation unique reference number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<Max35Text>> mmTaxationIdentificationNumber = new MMMessageAttribute<Organisation20, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "TaxtnIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationIdentificationNumber";
			definition = "Taxation unique reference number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Organisation20 obj) {
			return obj.getTaxationIdentificationNumber();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<Max35Text> value) {
			obj.setTaxationIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnCtry")
	protected CountryCode taxationCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of taxation of an individual person or an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<CountryCode>> mmTaxationCountry = new MMMessageAttribute<Organisation20, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of an individual person or an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Organisation20 obj) {
			return obj.getTaxationCountry();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<CountryCode> value) {
			obj.setTaxationCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfOpr")
	protected CountryCode countryOfOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfOpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the organisation has its business activity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<CountryCode>> mmCountryOfOperation = new MMMessageAttribute<Organisation20, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOperation";
			definition = "Country in which the organisation has its business activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Organisation20 obj) {
			return obj.getCountryOfOperation();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<CountryCode> value) {
			obj.setCountryOfOperation(value.orElse(null));
		}
	};
	@XmlElement(name = "BrdRsltnInd")
	protected TrueFalseIndicator boardResolutionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrdRsltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardResolutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the new bank holds a copy of a registered company’s board resolution for the account switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation20, Optional<TrueFalseIndicator>> mmBoardResolutionIndicator = new MMMessageAttribute<Organisation20, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "BrdRsltnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardResolutionIndicator";
			definition = "Indicates that the new bank holds a copy of a registered company’s board resolution for the account switch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(Organisation20 obj) {
			return obj.getBoardResolutionIndicator();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<TrueFalseIndicator> value) {
			obj.setBoardResolutionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BizAdr")
	protected PostalAddress6 businessAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address where the business activity is taking place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>> mmBusinessAddress = new MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "BizAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessAddress";
			definition = "Address where the business activity is taking place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(Organisation20 obj) {
			return obj.getBusinessAddress();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<PostalAddress6> value) {
			obj.setBusinessAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "OprlAdr")
	protected PostalAddress6 operationalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address, for example, of a shared services centre."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>> mmOperationalAddress = new MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "OprlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalAddress";
			definition = "Address, for example, of a shared services centre.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(Organisation20 obj) {
			return obj.getOperationalAddress();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<PostalAddress6> value) {
			obj.setOperationalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "LglAdr")
	protected PostalAddress6 legalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the entity resides and is registered. More generically, it is the home address (residential address)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>> mmLegalAddress = new MMMessageAssociationEnd<Organisation20, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "LglAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalAddress";
			definition = "Address where the entity resides and is registered. More generically, it is the home address (residential address).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(Organisation20 obj) {
			return obj.getLegalAddress();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<PostalAddress6> value) {
			obj.setLegalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "RprtvOffcr")
	protected List<PartyIdentification125> representativeOfficer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprtvOffcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person in the customer's organisation who can be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>> mmRepresentativeOfficer = new MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>>() {
		{
			businessComponentTrace_lazy = () -> ContactPoint.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "RprtvOffcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Person in the customer's organisation who can be contacted by the account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public List<PartyIdentification125> getValue(Organisation20 obj) {
			return obj.getRepresentativeOfficer();
		}

		@Override
		public void setValue(Organisation20 obj, List<PartyIdentification125> value) {
			obj.setRepresentativeOfficer(value);
		}
	};
	@XmlElement(name = "TrsrMgr")
	protected PartyIdentification125 treasuryManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
	 * PersonIdentification.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrsrMgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person responsible of the treasury department within an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, Optional<PartyIdentification125>> mmTreasuryManager = new MMMessageAssociationEnd<Organisation20, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPersonName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "TrsrMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryManager";
			definition = "Person responsible of the treasury department within an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(Organisation20 obj) {
			return obj.getTreasuryManager();
		}

		@Override
		public void setValue(Organisation20 obj, Optional<PartyIdentification125> value) {
			obj.setTreasuryManager(value.orElse(null));
		}
	};
	@XmlElement(name = "MainMndtHldr")
	protected List<PartyIdentification125> mainMandateHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MainMndtHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainMandateHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person who will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>> mmMainMandateHolder = new MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "MainMndtHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainMandateHolder";
			definition = "Person who will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public List<PartyIdentification125> getValue(Organisation20 obj) {
			return obj.getMainMandateHolder();
		}

		@Override
		public void setValue(Organisation20 obj, List<PartyIdentification125> value) {
			obj.setMainMandateHolder(value);
		}
	};
	@XmlElement(name = "Sndr")
	protected List<PartyIdentification125> sender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation20 Organisation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender of a message related to the life cyle of an account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>> mmSender = new MMMessageAssociationEnd<Organisation20, List<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation20.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Sender of a message related to the life cyle of an account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public List<PartyIdentification125> getValue(Organisation20 obj) {
			return obj.getSender();
		}

		@Override
		public void setValue(Organisation20 obj, List<PartyIdentification125> value) {
			obj.setSender(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation20.mmFullLegalName, com.tools20022.repository.msg.Organisation20.mmTradingName,
						com.tools20022.repository.msg.Organisation20.mmOrganisationLegalStatus, com.tools20022.repository.msg.Organisation20.mmEstablishedDate, com.tools20022.repository.msg.Organisation20.mmRegistrationNumber,
						com.tools20022.repository.msg.Organisation20.mmRegistrationCountry, com.tools20022.repository.msg.Organisation20.mmRegistrationDate, com.tools20022.repository.msg.Organisation20.mmTaxationIdentificationNumber,
						com.tools20022.repository.msg.Organisation20.mmTaxationCountry, com.tools20022.repository.msg.Organisation20.mmCountryOfOperation, com.tools20022.repository.msg.Organisation20.mmBoardResolutionIndicator,
						com.tools20022.repository.msg.Organisation20.mmBusinessAddress, com.tools20022.repository.msg.Organisation20.mmOperationalAddress, com.tools20022.repository.msg.Organisation20.mmLegalAddress,
						com.tools20022.repository.msg.Organisation20.mmRepresentativeOfficer, com.tools20022.repository.msg.Organisation20.mmTreasuryManager, com.tools20022.repository.msg.Organisation20.mmMainMandateHolder,
						com.tools20022.repository.msg.Organisation20.mmSender);
				trace_lazy = () -> ContactPersonRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Organisation20";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getFullLegalName() {
		return fullLegalName;
	}

	public Organisation20 setFullLegalName(Max350Text fullLegalName) {
		this.fullLegalName = Objects.requireNonNull(fullLegalName);
		return this;
	}

	public Optional<Max350Text> getTradingName() {
		return tradingName == null ? Optional.empty() : Optional.of(tradingName);
	}

	public Organisation20 setTradingName(Max350Text tradingName) {
		this.tradingName = tradingName;
		return this;
	}

	public Optional<OrganisationLegalStatus1Code> getOrganisationLegalStatus() {
		return organisationLegalStatus == null ? Optional.empty() : Optional.of(organisationLegalStatus);
	}

	public Organisation20 setOrganisationLegalStatus(OrganisationLegalStatus1Code organisationLegalStatus) {
		this.organisationLegalStatus = organisationLegalStatus;
		return this;
	}

	public Optional<ISODate> getEstablishedDate() {
		return establishedDate == null ? Optional.empty() : Optional.of(establishedDate);
	}

	public Organisation20 setEstablishedDate(ISODate establishedDate) {
		this.establishedDate = establishedDate;
		return this;
	}

	public Optional<Max70Text> getRegistrationNumber() {
		return registrationNumber == null ? Optional.empty() : Optional.of(registrationNumber);
	}

	public Organisation20 setRegistrationNumber(Max70Text registrationNumber) {
		this.registrationNumber = registrationNumber;
		return this;
	}

	public Optional<CountryCode> getRegistrationCountry() {
		return registrationCountry == null ? Optional.empty() : Optional.of(registrationCountry);
	}

	public Organisation20 setRegistrationCountry(CountryCode registrationCountry) {
		this.registrationCountry = registrationCountry;
		return this;
	}

	public Optional<ISODate> getRegistrationDate() {
		return registrationDate == null ? Optional.empty() : Optional.of(registrationDate);
	}

	public Organisation20 setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	public Optional<Max35Text> getTaxationIdentificationNumber() {
		return taxationIdentificationNumber == null ? Optional.empty() : Optional.of(taxationIdentificationNumber);
	}

	public Organisation20 setTaxationIdentificationNumber(Max35Text taxationIdentificationNumber) {
		this.taxationIdentificationNumber = taxationIdentificationNumber;
		return this;
	}

	public Optional<CountryCode> getTaxationCountry() {
		return taxationCountry == null ? Optional.empty() : Optional.of(taxationCountry);
	}

	public Organisation20 setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = taxationCountry;
		return this;
	}

	public Optional<CountryCode> getCountryOfOperation() {
		return countryOfOperation == null ? Optional.empty() : Optional.of(countryOfOperation);
	}

	public Organisation20 setCountryOfOperation(CountryCode countryOfOperation) {
		this.countryOfOperation = countryOfOperation;
		return this;
	}

	public Optional<TrueFalseIndicator> getBoardResolutionIndicator() {
		return boardResolutionIndicator == null ? Optional.empty() : Optional.of(boardResolutionIndicator);
	}

	public Organisation20 setBoardResolutionIndicator(TrueFalseIndicator boardResolutionIndicator) {
		this.boardResolutionIndicator = boardResolutionIndicator;
		return this;
	}

	public Optional<PostalAddress6> getBusinessAddress() {
		return businessAddress == null ? Optional.empty() : Optional.of(businessAddress);
	}

	public Organisation20 setBusinessAddress(PostalAddress6 businessAddress) {
		this.businessAddress = businessAddress;
		return this;
	}

	public Optional<PostalAddress6> getOperationalAddress() {
		return operationalAddress == null ? Optional.empty() : Optional.of(operationalAddress);
	}

	public Organisation20 setOperationalAddress(PostalAddress6 operationalAddress) {
		this.operationalAddress = operationalAddress;
		return this;
	}

	public Optional<PostalAddress6> getLegalAddress() {
		return legalAddress == null ? Optional.empty() : Optional.of(legalAddress);
	}

	public Organisation20 setLegalAddress(PostalAddress6 legalAddress) {
		this.legalAddress = legalAddress;
		return this;
	}

	public List<PartyIdentification125> getRepresentativeOfficer() {
		return representativeOfficer == null ? representativeOfficer = new ArrayList<>() : representativeOfficer;
	}

	public Organisation20 setRepresentativeOfficer(List<PartyIdentification125> representativeOfficer) {
		this.representativeOfficer = Objects.requireNonNull(representativeOfficer);
		return this;
	}

	public Optional<PartyIdentification125> getTreasuryManager() {
		return treasuryManager == null ? Optional.empty() : Optional.of(treasuryManager);
	}

	public Organisation20 setTreasuryManager(PartyIdentification125 treasuryManager) {
		this.treasuryManager = treasuryManager;
		return this;
	}

	public List<PartyIdentification125> getMainMandateHolder() {
		return mainMandateHolder == null ? mainMandateHolder = new ArrayList<>() : mainMandateHolder;
	}

	public Organisation20 setMainMandateHolder(List<PartyIdentification125> mainMandateHolder) {
		this.mainMandateHolder = Objects.requireNonNull(mainMandateHolder);
		return this;
	}

	public List<PartyIdentification125> getSender() {
		return sender == null ? sender = new ArrayList<>() : sender;
	}

	public Organisation20 setSender(List<PartyIdentification125> sender) {
		this.sender = Objects.requireNonNull(sender);
		return this;
	}
}