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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Information regarding an enumerated code list and its owner.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Scheme" src="doc-files/Scheme.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmNameShort
 * Scheme.mmNameShort}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmCode Scheme.mmCode}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmRating
 * Scheme.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmCreditorRole
 * Scheme.mmCreditorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmInformationPartyRole
 * Scheme.mmInformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmVersion
 * Scheme.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
 * Scheme.mmAssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmNameLong
 * Scheme.mmNameLong}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDescription
 * Scheme.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDomainValueCode
 * Scheme.mmDomainValueCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDomainValueName
 * Scheme.mmDomainValueName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmSector
 * Scheme.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
 * Scheme.mmAssetClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmScheme
 * InformationPartyRole.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
 * DateTimePeriod.mmAssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
 * AssetClassification.mmAssetClassScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
 * Rating.mmRatingScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmScheme
 * Sector.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditorRole#mmSchemeIdentification
 * CreditorRole.mmSchemeIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
 * FinancialIdentificationSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice
 * AccountSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MandateStatus1Choice
 * MandateStatus1Choice}</li>
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
 * "Scheme"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding an enumerated code list and its owner."</li>
 * </ul>
 */
public class Scheme {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text nameShort;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmSchemeName
	 * GenericIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmSchemeName
	 * GenericIdentification13.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmSchemeName
	 * GenericIdentification47.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#mmProprietary
	 * PersonIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmSchemeName
	 * GenericIdentification30.mmSchemeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max35Text> mmNameShort = new MMBusinessAttribute<Scheme, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification1.mmSchemeName, GenericIdentification13.mmSchemeName, GenericIdentification47.mmSchemeName, PersonIdentificationSchemeName1Choice.mmProprietary,
					GenericIdentification30.mmSchemeName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameShort";
			definition = "Short textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Scheme obj) {
			return obj.getNameShort();
		}

		@Override
		public void setValue(Scheme obj, Max35Text value) {
			obj.setNameShort(value);
		}
	};
	protected Max35Text code;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#mmCode
	 * FinancialIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#mmProprietary
	 * FinancialIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#mmCode
	 * AccountSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#mmProprietary
	 * AccountSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#mmCode
	 * OrganisationIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#mmProprietary
	 * OrganisationIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#mmCode
	 * PersonIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#mmCode
	 * IdentificationSource3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#mmCode
	 * MandateStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#mmProprietary
	 * MandateStatus1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code that represents the enumerated list, for example, ISO 6166 for ISIN."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max35Text> mmCode = new MMBusinessAttribute<Scheme, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialIdentificationSchemeName1Choice.mmCode, FinancialIdentificationSchemeName1Choice.mmProprietary, AccountSchemeName1Choice.mmCode, AccountSchemeName1Choice.mmProprietary,
					OrganisationIdentificationSchemeName1Choice.mmCode, OrganisationIdentificationSchemeName1Choice.mmProprietary, PersonIdentificationSchemeName1Choice.mmCode, IdentificationSource3Choice.mmCode,
					MandateStatus1Choice.mmCode, MandateStatus1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Scheme obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(Scheme obj, Max35Text value) {
			obj.setCode(value);
		}
	};
	protected List<GenericIdentification> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
	 * GenericIdentification.mmScheme}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmType
	 * OtherIdentification1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification information for which a scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, List<GenericIdentification>> mmIdentification = new MMBusinessAssociationEnd<Scheme, List<GenericIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherIdentification1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification information for which a scheme is specified.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(Scheme obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Scheme obj, List<GenericIdentification> value) {
			obj.setIdentification(value);
		}
	};
	protected Rating rating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
	 * Rating.mmRatingScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rating for which an identification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, Rating> mmRating = new MMBusinessAssociationEnd<Scheme, Rating>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Rating.mmRatingScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Rating.mmObject();
		}

		@Override
		public Rating getValue(Scheme obj) {
			return obj.getRating();
		}

		@Override
		public void setValue(Scheme obj, Rating value) {
			obj.setRating(value);
		}
	};
	protected CreditorRole creditorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditorRole#mmSchemeIdentification
	 * CreditorRole.mmSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditorRole
	 * CreditorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor for which an identification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, CreditorRole> mmCreditorRole = new MMBusinessAssociationEnd<Scheme, CreditorRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditorRole";
			definition = "Creditor for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CreditorRole.mmSchemeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CreditorRole.mmObject();
		}

		@Override
		public CreditorRole getValue(Scheme obj) {
			return obj.getCreditorRole();
		}

		@Override
		public void setValue(Scheme obj, CreditorRole value) {
			obj.setCreditorRole(value);
		}
	};
	protected List<InformationPartyRole> informationPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmScheme
	 * InformationPartyRole.mmScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party as source of a scheme code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, List<InformationPartyRole>> mmInformationPartyRole = new MMBusinessAssociationEnd<Scheme, List<InformationPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Role played by a party as source of a scheme code.";
			minOccurs = 0;
			opposite_lazy = () -> InformationPartyRole.mmScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public List<InformationPartyRole> getValue(Scheme obj) {
			return obj.getInformationPartyRole();
		}

		@Override
		public void setValue(Scheme obj, List<InformationPartyRole> value) {
			obj.setInformationPartyRole(value);
		}
	};
	protected Max35Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version number of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max35Text> mmVersion = new MMBusinessAttribute<Scheme, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Scheme obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(Scheme obj, Max35Text value) {
			obj.setVersion(value);
		}
	};
	protected DateTimePeriod assessmentValidityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
	 * DateTimePeriod.mmAssessmentValidityScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssessmentValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the version of the scheme applies (see ISO-8601)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, DateTimePeriod> mmAssessmentValidityPeriod = new MMBusinessAssociationEnd<Scheme, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityPeriod";
			definition = "Period during which the version of the scheme applies (see ISO-8601).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmAssessmentValidityScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Scheme obj) {
			return obj.getAssessmentValidityPeriod();
		}

		@Override
		public void setValue(Scheme obj, DateTimePeriod value) {
			obj.setAssessmentValidityPeriod(value);
		}
	};
	protected Max70Text nameLong;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max70Text> mmNameLong = new MMBusinessAttribute<Scheme, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameLong";
			definition = "Long textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Scheme obj) {
			return obj.getNameLong();
		}

		@Override
		public void setValue(Scheme obj, Max70Text value) {
			obj.setNameLong(value);
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max350Text> mmDescription = new MMBusinessAttribute<Scheme, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Scheme obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Scheme obj, Max350Text value) {
			obj.setDescription(value);
		}
	};
	protected Max35Text domainValueCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomainValueCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for a specific instance of an entry within the enumerated list, for example, ISIN."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max35Text> mmDomainValueCode = new MMBusinessAttribute<Scheme, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomainValueCode";
			definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Scheme obj) {
			return obj.getDomainValueCode();
		}

		@Override
		public void setValue(Scheme obj, Max35Text value) {
			obj.setDomainValueCode(value);
		}
	};
	protected Max70Text domainValueName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomainValueName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Textual description of the DomainValueCode, for example, International Securities Identification Number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Scheme, Max70Text> mmDomainValueName = new MMBusinessAttribute<Scheme, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomainValueName";
			definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Scheme obj) {
			return obj.getDomainValueName();
		}

		@Override
		public void setValue(Scheme obj, Max70Text value) {
			obj.setDomainValueName(value);
		}
	};
	protected Sector sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Sector#mmScheme
	 * Sector.mmScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the sector to which the scheme applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, Sector> mmSector = new MMBusinessAssociationEnd<Scheme, Sector>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Specifies the sector to which the scheme applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Sector.mmScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Sector.mmObject();
		}

		@Override
		public Sector getValue(Scheme obj) {
			return obj.getSector();
		}

		@Override
		public void setValue(Scheme obj, Sector value) {
			obj.setSector(value);
		}
	};
	protected AssetClassification assetClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
	 * AssetClassification.mmAssetClassScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which a classification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Scheme, AssetClassification> mmAssetClassification = new MMBusinessAssociationEnd<Scheme, AssetClassification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassification";
			definition = "Asset for which a classification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AssetClassification.mmAssetClassScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetClassification.mmObject();
		}

		@Override
		public AssetClassification getValue(Scheme obj) {
			return obj.getAssetClassification();
		}

		@Override
		public void setValue(Scheme obj, AssetClassification value) {
			obj.setAssetClassification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Scheme";
				definition = "Information regarding an enumerated code list and its owner.";
				associationDomain_lazy = () -> Arrays.asList(InformationPartyRole.mmScheme, GenericIdentification.mmScheme, DateTimePeriod.mmAssessmentValidityScheme, AssetClassification.mmAssetClassScheme, Rating.mmRatingScheme,
						Sector.mmScheme, CreditorRole.mmSchemeIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Scheme.mmNameShort, com.tools20022.repository.entity.Scheme.mmCode, com.tools20022.repository.entity.Scheme.mmIdentification,
						com.tools20022.repository.entity.Scheme.mmRating, com.tools20022.repository.entity.Scheme.mmCreditorRole, com.tools20022.repository.entity.Scheme.mmInformationPartyRole,
						com.tools20022.repository.entity.Scheme.mmVersion, com.tools20022.repository.entity.Scheme.mmAssessmentValidityPeriod, com.tools20022.repository.entity.Scheme.mmNameLong,
						com.tools20022.repository.entity.Scheme.mmDescription, com.tools20022.repository.entity.Scheme.mmDomainValueCode, com.tools20022.repository.entity.Scheme.mmDomainValueName,
						com.tools20022.repository.entity.Scheme.mmSector, com.tools20022.repository.entity.Scheme.mmAssetClassification);
				derivationComponent_lazy = () -> Arrays.asList(FinancialIdentificationSchemeName1Choice.mmObject(), AccountSchemeName1Choice.mmObject(), MandateStatus1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Scheme.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getNameShort() {
		return nameShort;
	}

	public Scheme setNameShort(Max35Text nameShort) {
		this.nameShort = Objects.requireNonNull(nameShort);
		return this;
	}

	public Max35Text getCode() {
		return code;
	}

	public Scheme setCode(Max35Text code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public List<GenericIdentification> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Scheme setIdentification(List<GenericIdentification> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Rating getRating() {
		return rating;
	}

	public Scheme setRating(Rating rating) {
		this.rating = Objects.requireNonNull(rating);
		return this;
	}

	public CreditorRole getCreditorRole() {
		return creditorRole;
	}

	public Scheme setCreditorRole(CreditorRole creditorRole) {
		this.creditorRole = Objects.requireNonNull(creditorRole);
		return this;
	}

	public List<InformationPartyRole> getInformationPartyRole() {
		return informationPartyRole == null ? informationPartyRole = new ArrayList<>() : informationPartyRole;
	}

	public Scheme setInformationPartyRole(List<InformationPartyRole> informationPartyRole) {
		this.informationPartyRole = Objects.requireNonNull(informationPartyRole);
		return this;
	}

	public Max35Text getVersion() {
		return version;
	}

	public Scheme setVersion(Max35Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public DateTimePeriod getAssessmentValidityPeriod() {
		return assessmentValidityPeriod;
	}

	public Scheme setAssessmentValidityPeriod(DateTimePeriod assessmentValidityPeriod) {
		this.assessmentValidityPeriod = Objects.requireNonNull(assessmentValidityPeriod);
		return this;
	}

	public Max70Text getNameLong() {
		return nameLong;
	}

	public Scheme setNameLong(Max70Text nameLong) {
		this.nameLong = Objects.requireNonNull(nameLong);
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public Scheme setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Max35Text getDomainValueCode() {
		return domainValueCode;
	}

	public Scheme setDomainValueCode(Max35Text domainValueCode) {
		this.domainValueCode = Objects.requireNonNull(domainValueCode);
		return this;
	}

	public Max70Text getDomainValueName() {
		return domainValueName;
	}

	public Scheme setDomainValueName(Max70Text domainValueName) {
		this.domainValueName = Objects.requireNonNull(domainValueName);
		return this;
	}

	public Sector getSector() {
		return sector;
	}

	public Scheme setSector(Sector sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public AssetClassification getAssetClassification() {
		return assetClassification;
	}

	public Scheme setAssetClassification(AssetClassification assetClassification) {
		this.assetClassification = Objects.requireNonNull(assetClassification);
		return this;
	}
}