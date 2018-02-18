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
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02;
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information which describes the organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmFullLegalName
 * OrganisationModification1.mmFullLegalName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmTradingName
 * OrganisationModification1.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmCountryOfOperation
 * OrganisationModification1.mmCountryOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmRegistrationDate
 * OrganisationModification1.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmOperationalAddress
 * OrganisationModification1.mmOperationalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBusinessAddress
 * OrganisationModification1.mmBusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmLegalAddress
 * OrganisationModification1.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBillingAddress
 * OrganisationModification1.mmBillingAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmOrganisationIdentification
 * OrganisationModification1.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmRepresentativeOfficer
 * OrganisationModification1.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmTreasuryManager
 * OrganisationModification1.mmTreasuryManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmMainMandateHolder
 * OrganisationModification1.mmMainMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmSender
 * OrganisationModification1.mmSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmLegalRepresentative
 * OrganisationModification1.mmLegalRepresentative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmOrganisation
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmOrganisation
 * AccountExcludedMandateMaintenanceRequestV02.mmOrganisation}</li>
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
 * "OrganisationModification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information which describes the organisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation12
 * Organisation12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrganisationModification1", propOrder = {"fullLegalName", "tradingName", "countryOfOperation", "registrationDate", "operationalAddress", "businessAddress", "legalAddress", "billingAddress", "organisationIdentification",
		"representativeOfficer", "treasuryManager", "mainMandateHolder", "sender", "legalRepresentative"})
public class OrganisationModification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FullLglNm", required = true)
	protected FullLegalNameModification1 fullLegalName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FullLegalNameModification1
	 * FullLegalNameModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
	 * OrganisationName.mmLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	public static final MMMessageAttribute mmFullLegalName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmLegalName;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "FullLglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FullLegalNameModification1.mmObject();
		}
	};
	@XmlElement(name = "TradgNm")
	protected TradingNameModification1 tradingName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradingNameModification1
	 * TradingNameModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
	 * OrganisationName.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	public static final MMMessageAttribute mmTradingName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmTradingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "TradgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TradingNameModification1.mmObject();
		}
	};
	@XmlElement(name = "CtryOfOpr", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	public static final MMMessageAttribute mmCountryOfOperation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOperation";
			definition = "Country in which the organisation has its business activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
	 * Organisation.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmRegistrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "OprlAdr")
	protected AddressModification1 operationalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressModification1
	 * AddressModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * definition} =
	 * "Is an operational address, for example, of a shared services center."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Location.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "OprlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalAddress";
			definition = "Is an operational address, for example, of a shared services center.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressModification1.mmObject();
		}
	};
	@XmlElement(name = "BizAdr")
	protected AddressModification1 businessAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressModification1
	 * AddressModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * definition} =
	 * "Is the address where the business activity is taking place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "BizAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessAddress";
			definition = "Is the address where the business activity is taking place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressModification1.mmObject();
		}
	};
	@XmlElement(name = "LglAdr", required = true)
	protected AddressModification1 legalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressModification1
	 * AddressModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "LglAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalAddress";
			definition = "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressModification1.mmObject();
		}
	};
	@XmlElement(name = "BllgAdr")
	protected AddressModification1 billingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AddressModification1
	 * AddressModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address where invoices must be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBillingAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "BllgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddress";
			definition = "Address where invoices must be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AddressModification1.mmObject();
		}
	};
	@XmlElement(name = "OrgId", required = true)
	protected OrganisationIdentification8 organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way of identifying an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisationIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Unique and unambiguous way of identifying an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification8.mmObject();
		}
	};
	@XmlElement(name = "RprtvOffcr")
	protected List<com.tools20022.repository.msg.PartyModification1> representativeOfficer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyModification1
	 * PartyModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * "Person in the customer's organisation who can be contacted by the account servicer in relation to the account(s) identified in this instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepresentativeOfficer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "RprtvOffcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Person in the customer's organisation who can be contacted by the account servicer in relation to the account(s) identified in this instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyModification1.mmObject();
		}
	};
	@XmlElement(name = "TrsrMgr")
	protected PartyModification1 treasuryManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyModification1
	 * PartyModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * "Person responsible of the treasury department within the customer’s organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTreasuryManager = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "TrsrMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryManager";
			definition = "Person responsible of the treasury department within the customer’s organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyModification1.mmObject();
		}
	};
	@XmlElement(name = "MainMndtHldr")
	protected List<com.tools20022.repository.msg.PartyModification1> mainMandateHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyModification1
	 * PartyModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * "Person that has the mandate to delegate authority, to assign mandates to other individuals (mandate holders) to perform specific bank operations on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMainMandateHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "MainMndtHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainMandateHolder";
			definition = "Person that has the mandate to delegate authority, to assign mandates to other individuals (mandate holders) to perform specific bank operations on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyModification1.mmObject();
		}
	};
	@XmlElement(name = "Sndr")
	protected List<com.tools20022.repository.msg.PartyModification1> sender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyModification1
	 * PartyModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
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
	 * "Person that may be the potential sender of a message related to the life cycle of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSender = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Person that may be the potential sender of a message related to the life cycle of the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyModification1.mmObject();
		}
	};
	@XmlElement(name = "LglRprtv")
	protected List<com.tools20022.repository.msg.PartyModification1> legalRepresentative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyModification1
	 * PartyModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRprtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRepresentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person that is officially and legally mandated to represent the organisation. Depending on legislation, the legal representative(s) might for instance be assigned by the Board, identified in the by-laws of the organisation, be publicly announced in the official journal of a country, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRepresentative = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrganisationModification1.mmObject();
			isDerived = false;
			xmlTag = "LglRprtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRepresentative";
			definition = "Person that is officially and legally mandated to represent the organisation. Depending on legislation, the legal representative(s) might for instance be assigned by the Board, identified in the by-laws of the organisation, be publicly announced in the official journal of a country, etc.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyModification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationModification1.mmFullLegalName, com.tools20022.repository.msg.OrganisationModification1.mmTradingName,
						com.tools20022.repository.msg.OrganisationModification1.mmCountryOfOperation, com.tools20022.repository.msg.OrganisationModification1.mmRegistrationDate,
						com.tools20022.repository.msg.OrganisationModification1.mmOperationalAddress, com.tools20022.repository.msg.OrganisationModification1.mmBusinessAddress,
						com.tools20022.repository.msg.OrganisationModification1.mmLegalAddress, com.tools20022.repository.msg.OrganisationModification1.mmBillingAddress,
						com.tools20022.repository.msg.OrganisationModification1.mmOrganisationIdentification, com.tools20022.repository.msg.OrganisationModification1.mmRepresentativeOfficer,
						com.tools20022.repository.msg.OrganisationModification1.mmTreasuryManager, com.tools20022.repository.msg.OrganisationModification1.mmMainMandateHolder,
						com.tools20022.repository.msg.OrganisationModification1.mmSender, com.tools20022.repository.msg.OrganisationModification1.mmLegalRepresentative);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountExcludedMandateMaintenanceAmendmentRequestV02.mmOrganisation, AccountExcludedMandateMaintenanceRequestV02.mmOrganisation);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationModification1";
				definition = "Information which describes the organisation.";
				previousVersion_lazy = () -> Organisation12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FullLegalNameModification1 getFullLegalName() {
		return fullLegalName;
	}

	public OrganisationModification1 setFullLegalName(com.tools20022.repository.msg.FullLegalNameModification1 fullLegalName) {
		this.fullLegalName = Objects.requireNonNull(fullLegalName);
		return this;
	}

	public Optional<TradingNameModification1> getTradingName() {
		return tradingName == null ? Optional.empty() : Optional.of(tradingName);
	}

	public OrganisationModification1 setTradingName(com.tools20022.repository.msg.TradingNameModification1 tradingName) {
		this.tradingName = tradingName;
		return this;
	}

	public CountryCode getCountryOfOperation() {
		return countryOfOperation;
	}

	public OrganisationModification1 setCountryOfOperation(CountryCode countryOfOperation) {
		this.countryOfOperation = Objects.requireNonNull(countryOfOperation);
		return this;
	}

	public Optional<ISODate> getRegistrationDate() {
		return registrationDate == null ? Optional.empty() : Optional.of(registrationDate);
	}

	public OrganisationModification1 setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	public Optional<AddressModification1> getOperationalAddress() {
		return operationalAddress == null ? Optional.empty() : Optional.of(operationalAddress);
	}

	public OrganisationModification1 setOperationalAddress(com.tools20022.repository.msg.AddressModification1 operationalAddress) {
		this.operationalAddress = operationalAddress;
		return this;
	}

	public Optional<AddressModification1> getBusinessAddress() {
		return businessAddress == null ? Optional.empty() : Optional.of(businessAddress);
	}

	public OrganisationModification1 setBusinessAddress(com.tools20022.repository.msg.AddressModification1 businessAddress) {
		this.businessAddress = businessAddress;
		return this;
	}

	public AddressModification1 getLegalAddress() {
		return legalAddress;
	}

	public OrganisationModification1 setLegalAddress(com.tools20022.repository.msg.AddressModification1 legalAddress) {
		this.legalAddress = Objects.requireNonNull(legalAddress);
		return this;
	}

	public Optional<AddressModification1> getBillingAddress() {
		return billingAddress == null ? Optional.empty() : Optional.of(billingAddress);
	}

	public OrganisationModification1 setBillingAddress(com.tools20022.repository.msg.AddressModification1 billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	public OrganisationIdentification8 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public OrganisationModification1 setOrganisationIdentification(com.tools20022.repository.msg.OrganisationIdentification8 organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public List<PartyModification1> getRepresentativeOfficer() {
		return representativeOfficer == null ? representativeOfficer = new ArrayList<>() : representativeOfficer;
	}

	public OrganisationModification1 setRepresentativeOfficer(List<com.tools20022.repository.msg.PartyModification1> representativeOfficer) {
		this.representativeOfficer = Objects.requireNonNull(representativeOfficer);
		return this;
	}

	public Optional<PartyModification1> getTreasuryManager() {
		return treasuryManager == null ? Optional.empty() : Optional.of(treasuryManager);
	}

	public OrganisationModification1 setTreasuryManager(com.tools20022.repository.msg.PartyModification1 treasuryManager) {
		this.treasuryManager = treasuryManager;
		return this;
	}

	public List<PartyModification1> getMainMandateHolder() {
		return mainMandateHolder == null ? mainMandateHolder = new ArrayList<>() : mainMandateHolder;
	}

	public OrganisationModification1 setMainMandateHolder(List<com.tools20022.repository.msg.PartyModification1> mainMandateHolder) {
		this.mainMandateHolder = Objects.requireNonNull(mainMandateHolder);
		return this;
	}

	public List<PartyModification1> getSender() {
		return sender == null ? sender = new ArrayList<>() : sender;
	}

	public OrganisationModification1 setSender(List<com.tools20022.repository.msg.PartyModification1> sender) {
		this.sender = Objects.requireNonNull(sender);
		return this;
	}

	public List<PartyModification1> getLegalRepresentative() {
		return legalRepresentative == null ? legalRepresentative = new ArrayList<>() : legalRepresentative;
	}

	public OrganisationModification1 setLegalRepresentative(List<com.tools20022.repository.msg.PartyModification1> legalRepresentative) {
		this.legalRepresentative = Objects.requireNonNull(legalRepresentative);
		return this;
	}
}