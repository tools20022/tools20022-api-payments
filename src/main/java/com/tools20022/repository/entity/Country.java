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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nation with its own government.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Country" src="doc-files/Country.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#DomiciledFunds
 * Country.DomiciledFunds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Code Country.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Citizen
 * Country.Citizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Tax Country.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
 * Country.CountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
 * Country.CountryForBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#ProducedProducts
 * Country.ProducedProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#NationalRegulatoryAuthority
 * Country.NationalRegulatoryAuthority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
 * Country.RelatedCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Name Country.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
 * Country.PostalAddressSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryRelatedInvestmentFundProcessing
 * Country.CountryRelatedInvestmentFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Market
 * Country.Market}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
 * Country.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#DomicileCountry
 * InvestmentFund.DomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Country
 * InvestmentFundClassProcessingCharacteristics.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Country
 * PostalAddress.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Origin
 * Product.Origin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Country Tax.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Nationality
 * Person.Nationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
 * PaymentCard.CardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
 * SafekeepingPlace.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
 * BeneficialOwner.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
 * CardPaymentAcquiring.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#Country
 * RegulatoryAuthorityRole.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Country
 * Market.Country}</li>
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
 * "Country"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nation with its own government."</li>
 * </ul>
 */
public class Country {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment funds which are domiciled in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#DomicileCountry
	 * InvestmentFund.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomiciledFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment funds which are domiciled in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DomiciledFunds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledFunds";
			definition = "Investment funds which are domiciled in a specific country.";
			minOccurs = 0;
			type_lazy = () -> InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.DomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies a nation with its own government (ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#Country
	 * PostalAddress6.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#CountryOfBirth
	 * DateAndPlaceOfBirth.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#CountryOfResidence
	 * PartyIdentification43.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#CountryOfResidence
	 * PartyIdentification40.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#CountryOfOperation
	 * Organisation12.CountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#CountryOfOperation
	 * OrganisationModification1.CountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#Country
	 * RegulatoryAuthority2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Country
	 * StructuredRegulatoryReporting3.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Country
	 * PostalAddress11.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#CountryOfResidence
	 * PartyIdentification58.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#Country
	 * ResidenceLocation1Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#CountryOfResidence
	 * PartyIdentification77.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#Country
	 * PostalAddress19.Country}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a nation with its own government (ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.Country, com.tools20022.repository.msg.DateAndPlaceOfBirth.CountryOfBirth,
					com.tools20022.repository.msg.PartyIdentification43.CountryOfResidence, com.tools20022.repository.msg.PartyIdentification40.CountryOfResidence, com.tools20022.repository.msg.Organisation12.CountryOfOperation,
					com.tools20022.repository.msg.OrganisationModification1.CountryOfOperation, com.tools20022.repository.msg.RegulatoryAuthority2.Country, com.tools20022.repository.msg.StructuredRegulatoryReporting3.Country,
					com.tools20022.repository.msg.PostalAddress11.Country, com.tools20022.repository.msg.PartyIdentification58.CountryOfResidence, com.tools20022.repository.choice.ResidenceLocation1Choice.Country,
					com.tools20022.repository.msg.PartyIdentification77.CountryOfResidence, com.tools20022.repository.msg.PostalAddress19.Country);
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identifies a nation with its own government (ISO 3166).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Specifies a person which is a citizen of a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#Nationality
	 * Person.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Citizen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a person which is a citizen of a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Citizen = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Specifies a person which is a citizen of a country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.Nationality;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax parameters applicable in a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Country
	 * Tax.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax parameters applicable in a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax parameters applicable in a country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the safekeeping places located in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
	 * SafekeepingPlace.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the safekeeping places located in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryForSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryForSafekeepingPlace";
			definition = "Specifies the safekeeping places located in a specific country.";
			minOccurs = 0;
			type_lazy = () -> SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the beneficial owner which has certified that it is not
	 * domiciled in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
	 * BeneficialOwner.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the beneficial owner which has certified that it is not domiciled in the country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryForBeneficialOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryForBeneficialOwner";
			definition = "Specifies the beneficial owner which has certified that it is not domiciled in the country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BeneficialOwner.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the product for which an origin is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#Origin
	 * Product.Origin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProducedProducts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product for which an origin is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProducedProducts = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProducedProducts";
			definition = "Specifies the product for which an origin is specified.";
			minOccurs = 0;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Origin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Regulatory authority of the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#Country
	 * RegulatoryAuthorityRole.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegulatoryAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory authority of the country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NationalRegulatoryAuthority = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegulatoryAuthority";
			definition = "Regulatory authority of the country.";
			minOccurs = 0;
			type_lazy = () -> RegulatoryAuthorityRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Card payment which took place in the specified country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
	 * CardPaymentAcquiring.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment which took place in the specified country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which took place in the specified country.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name by which a country is known. It is normally the name attached to the
	 * ISO country code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a country is known. It is normally the name attached to the ISO country code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a country is known. It is normally the name attached to the ISO country code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the representation of a postal address per country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#Country
	 * PostalAddress.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddressSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the representation of a postal address per country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PostalAddressSpecification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalAddressSpecification";
			definition = "Specifies the representation of a postal address per country.";
			minOccurs = 0;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the other parameters of the investment fund class which apply
	 * in that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Country
	 * InvestmentFundClassProcessingCharacteristics.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryRelatedInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the other parameters of the investment fund class which apply in that country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryRelatedInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryRelatedInvestmentFundProcessing";
			definition = "Specifies the other parameters of the investment fund class which apply in that country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a country is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#Country
	 * Market.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a country is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which a country is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which a country code is attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
	 * PaymentCard.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a country code is attached."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a country code is attached.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.CardCountryCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Country";
				definition = "Nation with its own government.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.DomicileCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Person.Nationality,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.SafekeepingPlace.Country, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.CardPaymentAcquiring.Country, com.tools20022.repository.entity.RegulatoryAuthorityRole.Country, com.tools20022.repository.entity.Market.Country);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.DomiciledFunds, com.tools20022.repository.entity.Country.Code, com.tools20022.repository.entity.Country.Citizen,
						com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Country.CountryForSafekeepingPlace, com.tools20022.repository.entity.Country.CountryForBeneficialOwner,
						com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Country.NationalRegulatoryAuthority, com.tools20022.repository.entity.Country.RelatedCardPayment,
						com.tools20022.repository.entity.Country.Name, com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.Country.Market, com.tools20022.repository.entity.Country.RelatedPaymentCard);
			}
		});
		return mmObject_lazy.get();
	}
}