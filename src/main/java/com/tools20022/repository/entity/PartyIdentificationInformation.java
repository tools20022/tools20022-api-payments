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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTypeOfIdentification
 * PartyIdentificationInformation.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
 * PartyIdentificationInformation.mmDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyType
 * PartyIdentificationInformation.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
 * PartyIdentificationInformation.mmLEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmIdentification
 * Market.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmIdentification
 * PartyIdentification43.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmIdentification
 * PartyIdentification40.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyModification1#mmPartyIdentification
 * PartyModification1.mmPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3#mmParty
 * ProprietaryParty3.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#mmParty
 * Party12Choice.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmIdentification
 * PartyIdentification42.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmIdentification
 * PartyIdentification58.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmIdentification
 * PartyIdentification77.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#mmParty
 * Party28Choice.mmParty}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.Party10Choice Party10Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42
 * PartyIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party9Choice Party9Choice}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected GenericIdentification otherIdentification;
	/**
	 * Identifier issued to a party for which no specific identifier has been
	 * defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
	 * GenericIdentification.mmRelatedPartyIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
	 * PersonIdentification5.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmOther
	 * ContactDetails2.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#mmOther
	 * OrganisationIdentification8.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmOther
	 * OrganisationIdentification7.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#mmOther
	 * ContactDetails3.mmOther}</li>
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
	public static final MMBusinessAssociationEnd mmOtherIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification5.mmOther, ContactDetails2.mmOther, OrganisationIdentification8.mmOther, OrganisationIdentification7.mmOther, ContactDetails3.mmOther);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Party identifiedParty;
	/**
	 * Party for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
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
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#mmTaxIdentification
	 * TaxParty1.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#mmRegistrationIdentification
	 * TaxParty1.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#mmTaxIdentification
	 * TaxParty2.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#mmRegistrationIdentification
	 * TaxParty2.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxIdentification
	 * TaxParty3.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmRegistrationIdentification
	 * TaxParty3.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmCustomerTaxIdentification
	 * BillingTaxRegion1.mmCustomerTaxIdentification}</li>
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
	public static final MMBusinessAttribute mmTaxIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxParty1.mmTaxIdentification, TaxParty1.mmRegistrationIdentification, TaxParty2.mmTaxIdentification, TaxParty2.mmRegistrationIdentification, TaxParty3.mmTaxIdentification,
					TaxParty3.mmRegistrationIdentification, BillingTaxRegion1.mmCustomerTaxIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getTaxIdentificationNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text nationalRegistrationNumber;
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
	public static final MMBusinessAttribute mmNationalRegistrationNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getNationalRegistrationNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfIdentificationCode typeOfIdentification;
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
	public static final MMBusinessAttribute mmTypeOfIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getTypeOfIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text declaration;
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
	public static final MMBusinessAttribute mmDeclaration = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getDeclaration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyTypeCode partyType;
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
	public static final MMBusinessAttribute mmPartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getPartyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PartyName> partyName;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
	 * PartyName.mmPartyIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmPartyName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyName.mmPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * Specifies the period during which an identification is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
	 * DateTimePeriod.mmRelatedIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Market identifiedMarket;
	/**
	 * Market for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected LEIIdentifier lEI;
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
	public static final MMBusinessAttribute mmLEI = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getLEI", new Class[]{});
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
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification, com.tools20022.repository.entity.Party.mmIdentification,
						com.tools20022.repository.entity.PartyName.mmPartyIdentification, com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification, com.tools20022.repository.entity.Market.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentification43.mmIdentification, PartyIdentification40.mmIdentification, PartyModification1.mmPartyIdentification, ProprietaryParty3.mmParty, Party12Choice.mmParty,
						PartyIdentification42.mmIdentification, PartyIdentification58.mmIdentification, PartyIdentification77.mmIdentification, Party28Choice.mmParty);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.mmNationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmDeclaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyType, com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmLEI);
				derivationComponent_lazy = () -> Arrays.asList(Party11Choice.mmObject(), PartyIdentification43.mmObject(), PartyIdentification40.mmObject(), PartyModification1.mmObject(), NameAndAddress10.mmObject(),
						ProprietaryParty3.mmObject(), Party12Choice.mmObject(), Party10Choice.mmObject(), PartyIdentification42.mmObject(), Party9Choice.mmObject(), Party13Choice.mmObject(), PartyIdentification58.mmObject(),
						PartyIdentification77.mmObject(), Party28Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyIdentificationInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getOtherIdentification() {
		return otherIdentification;
	}

	public void setOtherIdentification(com.tools20022.repository.entity.GenericIdentification otherIdentification) {
		this.otherIdentification = otherIdentification;
	}

	public Party getIdentifiedParty() {
		return identifiedParty;
	}

	public void setIdentifiedParty(com.tools20022.repository.entity.Party identifiedParty) {
		this.identifiedParty = identifiedParty;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public Max35Text getNationalRegistrationNumber() {
		return nationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
	}

	public TypeOfIdentificationCode getTypeOfIdentification() {
		return typeOfIdentification;
	}

	public void setTypeOfIdentification(TypeOfIdentificationCode typeOfIdentification) {
		this.typeOfIdentification = typeOfIdentification;
	}

	public Max350Text getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Max350Text declaration) {
		this.declaration = declaration;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public void setPartyType(PartyTypeCode partyType) {
		this.partyType = partyType;
	}

	public List<PartyName> getPartyName() {
		return partyName;
	}

	public void setPartyName(List<com.tools20022.repository.entity.PartyName> partyName) {
		this.partyName = partyName;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Market getIdentifiedMarket() {
		return identifiedMarket;
	}

	public void setIdentifiedMarket(com.tools20022.repository.entity.Market identifiedMarket) {
		this.identifiedMarket = identifiedMarket;
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}
}