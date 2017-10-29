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
import com.tools20022.repository.choice.Party11Choice;
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.choice.Party13Choice;
import com.tools20022.repository.choice.Party28Choice;
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a party
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyIdentificationInformation"
 * src="doc-files/PartyIdentificationInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
 * PartyIdentificationInformation.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
 * PartyIdentificationInformation.IdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#TaxIdentificationNumber
 * PartyIdentificationInformation.TaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#NationalRegistrationNumber
 * PartyIdentificationInformation.NationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#TypeOfIdentification
 * PartyIdentificationInformation.TypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#Declaration
 * PartyIdentificationInformation.Declaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyType
 * PartyIdentificationInformation.PartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
 * PartyIdentificationInformation.PartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#ValidityPeriod
 * PartyIdentificationInformation.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedMarket
 * PartyIdentificationInformation.IdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#LEI
 * PartyIdentificationInformation.LEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
 * GenericIdentification.RelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Identification
 * Party.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
 * PartyName.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedIdentification
 * DateTimePeriod.RelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Identification
 * Market.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#Identification
 * PartyIdentification43.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#Identification
 * PartyIdentification40.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyModification1#PartyIdentification
 * PartyModification1.PartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3#Party
 * ProprietaryParty3.Party}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#Party
 * Party12Choice.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#Identification
 * PartyIdentification58.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#Identification
 * PartyIdentification77.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#Party
 * Party28Choice.Party}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Party11Choice Party11Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43
 * PartyIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification40
 * PartyIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyModification1
 * PartyModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10
 * NameAndAddress10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3
 * ProprietaryParty3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice Party12Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party13Choice Party13Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification58
 * PartyIdentification58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification77
 * PartyIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice Party28Choice}
 * </li>
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
 * "PartyIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a party"</li>
 * </ul>
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifier issued to a party for which no specific identifier has been
	 * defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
	 * GenericIdentification.RelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#Other
	 * PersonIdentification5.Other}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#Other
	 * ContactDetails2.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#Other
	 * OrganisationIdentification8.Other}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#Other
	 * ContactDetails3.Other}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a party for which no specific identifier has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OtherIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification5.Other, com.tools20022.repository.msg.ContactDetails2.Other, com.tools20022.repository.msg.OrganisationIdentification8.Other,
					com.tools20022.repository.msg.ContactDetails3.Other);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
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
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#TaxIdentification
	 * TaxParty1.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#RegistrationIdentification
	 * TaxParty1.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#TaxIdentification
	 * TaxParty2.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#RegistrationIdentification
	 * TaxParty2.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#TaxIdentification
	 * TaxParty3.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#RegistrationIdentification
	 * TaxParty3.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#CustomerTaxIdentification
	 * BillingTaxRegion1.CustomerTaxIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty1.TaxIdentification, com.tools20022.repository.msg.TaxParty1.RegistrationIdentification, com.tools20022.repository.msg.TaxParty2.TaxIdentification,
					com.tools20022.repository.msg.TaxParty2.RegistrationIdentification, com.tools20022.repository.msg.TaxParty3.TaxIdentification, com.tools20022.repository.msg.TaxParty3.RegistrationIdentification,
					com.tools20022.repository.msg.BillingTaxRegion1.CustomerTaxIdentification);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a national registration authority to an entity. In
	 * Singapore this is known as the NRIC.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NationalRegistrationNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of alternate identification which can be used to
	 * identify a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of alternate identification which can be used to identify a party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}
	};
	/**
	 * Provides declaration details relative to the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides declaration details relative to the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Declaration = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the type of party in different business contexts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party in different business contexts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
	 * PartyName.PartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PartyName PartyName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyName.PartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which an identification is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedIdentification
	 * DateTimePeriod.RelatedIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#Identification
	 * Market.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal Entity Identifier is a code allocated to a party as described in
	 * ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LEI = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification, com.tools20022.repository.entity.Party.Identification,
						com.tools20022.repository.entity.PartyName.PartyIdentification, com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification, com.tools20022.repository.entity.Market.Identification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification43.Identification, com.tools20022.repository.msg.PartyIdentification40.Identification,
						com.tools20022.repository.msg.PartyModification1.PartyIdentification, com.tools20022.repository.msg.ProprietaryParty3.Party, com.tools20022.repository.choice.Party12Choice.Party,
						com.tools20022.repository.msg.PartyIdentification58.Identification, com.tools20022.repository.msg.PartyIdentification77.Identification, com.tools20022.repository.choice.Party28Choice.Party);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.NationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.TypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.Declaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.PartyType, com.tools20022.repository.entity.PartyIdentificationInformation.PartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.LEI);
				derivationComponent_lazy = () -> Arrays.asList(Party11Choice.mmObject(), PartyIdentification43.mmObject(), PartyIdentification40.mmObject(), PartyModification1.mmObject(), NameAndAddress10.mmObject(),
						ProprietaryParty3.mmObject(), Party12Choice.mmObject(), Party13Choice.mmObject(), PartyIdentification58.mmObject(), PartyIdentification77.mmObject(), Party28Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}