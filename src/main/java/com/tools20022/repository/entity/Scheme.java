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
import com.tools20022.repository.choice.AccountSchemeName1Choice;
import com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice;
import com.tools20022.repository.choice.MandateStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#NameShort
 * Scheme.NameShort}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Code Scheme.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Identification
 * Scheme.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Rating Scheme.Rating}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#CreditorRole
 * Scheme.CreditorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#InformationPartyRole
 * Scheme.InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Version
 * Scheme.Version}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#AssessmentValidityPeriod
 * Scheme.AssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#NameLong
 * Scheme.NameLong}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Description
 * Scheme.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#DomainValueCode
 * Scheme.DomainValueCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#DomainValueName
 * Scheme.DomainValueName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Sector Scheme.Sector}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#AssetClassification
 * Scheme.AssetClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Scheme
 * InformationPartyRole.Scheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Scheme
 * GenericIdentification.Scheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssessmentValidityScheme
 * DateTimePeriod.AssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#AssetClassScheme
 * AssetClassification.AssetClassScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#RatingScheme
 * Rating.RatingScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#Scheme Sector.Scheme}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditorRole#SchemeIdentification
 * CreditorRole.SchemeIdentification}</li>
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
	/**
	 * Short textual description of the scheme.
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#SchemeName
	 * GenericIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#SchemeName
	 * GenericIdentification13.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#Proprietary
	 * PersonIdentificationSchemeName1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#SchemeName
	 * GenericIdentification30.SchemeName}</li>
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
	public static final MMBusinessAttribute NameShort = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.SchemeName, com.tools20022.repository.msg.GenericIdentification13.SchemeName,
					com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Proprietary, com.tools20022.repository.msg.GenericIdentification30.SchemeName);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameShort";
			definition = "Short textual description of the scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code that represents the enumerated list, for example, ISO 6166 for ISIN.
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
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#Code
	 * FinancialIdentificationSchemeName1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#Proprietary
	 * FinancialIdentificationSchemeName1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#Code
	 * AccountSchemeName1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#Proprietary
	 * AccountSchemeName1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#Code
	 * OrganisationIdentificationSchemeName1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#Proprietary
	 * OrganisationIdentificationSchemeName1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#Code
	 * PersonIdentificationSchemeName1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#Code
	 * IdentificationSource3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#Code
	 * MandateStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#Proprietary
	 * MandateStatus1Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.Code, com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.Proprietary,
					com.tools20022.repository.choice.AccountSchemeName1Choice.Code, com.tools20022.repository.choice.AccountSchemeName1Choice.Proprietary, com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.Code,
					com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.Proprietary, com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Code,
					com.tools20022.repository.choice.IdentificationSource3Choice.Code, com.tools20022.repository.choice.MandateStatus1Choice.Code, com.tools20022.repository.choice.MandateStatus1Choice.Proprietary);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification information for which a scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Scheme
	 * GenericIdentification.Scheme}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification1#Type
	 * OtherIdentification1.Type}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherIdentification1.Type);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification information for which a scheme is specified.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rating for which an identification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#RatingScheme
	 * Rating.RatingScheme}</li>
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
	public static final MMBusinessAssociationEnd Rating = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating for which an identification by scheme is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.RatingScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Creditor for which an identification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditorRole#SchemeIdentification
	 * CreditorRole.SchemeIdentification}</li>
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
	public static final MMBusinessAssociationEnd CreditorRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorRole";
			definition = "Creditor for which an identification by scheme is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CreditorRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CreditorRole.SchemeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party as source of a scheme code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#Scheme
	 * InformationPartyRole.Scheme}</li>
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
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Role played by a party as source of a scheme code.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Version number of the scheme.
	 * <p>
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
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of the scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period during which the version of the scheme applies (see ISO-8601).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssessmentValidityScheme
	 * DateTimePeriod.AssessmentValidityScheme}</li>
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
	public static final MMBusinessAssociationEnd AssessmentValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityPeriod";
			definition = "Period during which the version of the scheme applies (see ISO-8601).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Long textual description of the scheme.
	 * <p>
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
	public static final MMBusinessAttribute NameLong = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameLong";
			definition = "Long textual description of the scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Textual description of the scheme.
	 * <p>
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
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Textual description of the scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Code for a specific instance of an entry within the enumerated list, for
	 * example, ISIN.
	 * <p>
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
	public static final MMBusinessAttribute DomainValueCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueCode";
			definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Textual description of the DomainValueCode, for example, International
	 * Securities Identification Number.
	 * <p>
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
	public static final MMBusinessAttribute DomainValueName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueName";
			definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Specifies the sector to which the scheme applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Sector#Scheme
	 * Sector.Scheme}</li>
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
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Specifies the sector to which the scheme applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset for which a classification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#AssetClassScheme
	 * AssetClassification.AssetClassScheme}</li>
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
	public static final MMBusinessAssociationEnd AssetClassification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassification";
			definition = "Asset for which a classification by scheme is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.AssetClassScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Scheme";
				definition = "Information regarding an enumerated code list and its owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.Scheme, com.tools20022.repository.entity.GenericIdentification.Scheme,
						com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme, com.tools20022.repository.entity.AssetClassification.AssetClassScheme, com.tools20022.repository.entity.Rating.RatingScheme,
						com.tools20022.repository.entity.Sector.Scheme, com.tools20022.repository.entity.CreditorRole.SchemeIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Scheme.NameShort, com.tools20022.repository.entity.Scheme.Code, com.tools20022.repository.entity.Scheme.Identification,
						com.tools20022.repository.entity.Scheme.Rating, com.tools20022.repository.entity.Scheme.CreditorRole, com.tools20022.repository.entity.Scheme.InformationPartyRole, com.tools20022.repository.entity.Scheme.Version,
						com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod, com.tools20022.repository.entity.Scheme.NameLong, com.tools20022.repository.entity.Scheme.Description,
						com.tools20022.repository.entity.Scheme.DomainValueCode, com.tools20022.repository.entity.Scheme.DomainValueName, com.tools20022.repository.entity.Scheme.Sector,
						com.tools20022.repository.entity.Scheme.AssetClassification);
				derivationComponent_lazy = () -> Arrays.asList(FinancialIdentificationSchemeName1Choice.mmObject(), AccountSchemeName1Choice.mmObject(), MandateStatus1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}