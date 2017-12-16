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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmDomiciledFunds
 * Country.mmDomiciledFunds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCode
 * Country.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCitizen
 * Country.mmCitizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
 * Country.mmCountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
 * Country.mmCountryForBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
 * Country.mmProducedProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmNationalRegulatoryAuthority
 * Country.mmNationalRegulatoryAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
 * Country.mmRelatedCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmName
 * Country.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
 * Country.mmPostalAddressSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryRelatedInvestmentFundProcessing
 * Country.mmCountryRelatedInvestmentFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmMarket
 * Country.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
 * Country.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
 * InvestmentFund.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmCountry
 * InvestmentFundClassProcessingCharacteristics.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
 * PostalAddress.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmOrigin
 * Product.mmOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmNationality
 * Person.mmNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
 * PaymentCard.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
 * SafekeepingPlace.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
 * BeneficialOwner.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
 * CardPaymentAcquiring.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmCountry
 * RegulatoryAuthorityRole.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmCountry
 * Market.mmCountry}</li>
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
 * "Country"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nation with its own government."</li>
 * </ul>
 */
public class Country {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestmentFund> domiciledFunds;
	/**
	 * Investment funds which are domiciled in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
	 * InvestmentFund.mmDomicileCountry}</li>
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
	public static final MMBusinessAssociationEnd mmDomiciledFunds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomiciledFunds";
			definition = "Investment funds which are domiciled in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmDomicileCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	protected CountryCode code;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountry
	 * PostalAddress6.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmCountryOfBirth
	 * DateAndPlaceOfBirth.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmCountryOfResidence
	 * PartyIdentification43.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmCountryOfResidence
	 * PartyIdentification40.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmCountryOfOperation
	 * Organisation12.mmCountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmCountryOfOperation
	 * OrganisationModification1.mmCountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#mmCountry
	 * RegulatoryAuthority2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmCountry
	 * StructuredRegulatoryReporting3.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmCountryOfResidence
	 * PartyIdentification42.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmCountry
	 * PostalAddress11.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmCountryOfResidence
	 * PartyIdentification58.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#mmCountry
	 * ResidenceLocation1Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmCountryOfResidence
	 * PartyIdentification77.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmCountry
	 * PostalAddress19.mmCountry}</li>
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
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmCountry, DateAndPlaceOfBirth.mmCountryOfBirth, PartyIdentification43.mmCountryOfResidence, PartyIdentification40.mmCountryOfResidence, Organisation12.mmCountryOfOperation,
					OrganisationModification1.mmCountryOfOperation, RegulatoryAuthority2.mmCountry, StructuredRegulatoryReporting3.mmCountry, PartyIdentification42.mmCountryOfResidence, PostalAddress11.mmCountry,
					PartyIdentification58.mmCountryOfResidence, ResidenceLocation1Choice.mmCountry, PartyIdentification77.mmCountryOfResidence, PostalAddress19.mmCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identifies a nation with its own government (ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Country.class.getMethod("getCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Person citizen;
	/**
	 * Specifies a person which is a citizen of a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
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
	public static final MMBusinessAssociationEnd mmCitizen = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Specifies a person which is a citizen of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmNationality;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Tax parameters applicable in a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmCountry
	 * Tax.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax parameters applicable in a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> countryForSafekeepingPlace;
	/**
	 * Specifies the safekeeping places located in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
	 * SafekeepingPlace.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmCountryForSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryForSafekeepingPlace";
			definition = "Specifies the safekeeping places located in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected BeneficialOwner countryForBeneficialOwner;
	/**
	 * Specifies the beneficial owner which has certified that it is not
	 * domiciled in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
	 * BeneficialOwner.mmNonDomicileCountry}</li>
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
	public static final MMBusinessAssociationEnd mmCountryForBeneficialOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CountryForBeneficialOwner";
			definition = "Specifies the beneficial owner which has certified that it is not domiciled in the country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmNonDomicileCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> producedProducts;
	/**
	 * Specifies the product for which an origin is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
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
	public static final MMBusinessAssociationEnd mmProducedProducts = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProducedProducts";
			definition = "Specifies the product for which an origin is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmOrigin;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RegulatoryAuthorityRole> nationalRegulatoryAuthority;
	/**
	 * Regulatory authority of the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmCountry
	 * RegulatoryAuthorityRole.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmNationalRegulatoryAuthority = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegulatoryAuthority";
			definition = "Regulatory authority of the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentAcquiring> relatedCardPayment;
	/**
	 * Card payment which took place in the specified country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
	 * CardPaymentAcquiring.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which took place in the specified country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected Max35Text name;
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
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a country is known. It is normally the name attached to the ISO country code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Country.class.getMethod("getName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PostalAddress> postalAddressSpecification;
	/**
	 * Specifies the representation of a postal address per country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmPostalAddressSpecification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostalAddressSpecification";
			definition = "Specifies the representation of a postal address per country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics countryRelatedInvestmentFundProcessing;
	/**
	 * Specifies the other parameters of the investment fund class which apply
	 * in that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmCountry
	 * InvestmentFundClassProcessingCharacteristics.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmCountryRelatedInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CountryRelatedInvestmentFundProcessing";
			definition = "Specifies the other parameters of the investment fund class which apply in that country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Market market;
	/**
	 * Market for which a country is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmCountry
	 * Market.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which a country is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmCountry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which a country code is attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
	 * PaymentCard.mmCardCountryCode}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a country code is attached.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmCardCountryCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Country";
				definition = "Nation with its own government.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.mmDomicileCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmCountry,
						com.tools20022.repository.entity.PostalAddress.mmCountry, com.tools20022.repository.entity.Product.mmOrigin, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Person.mmNationality,
						com.tools20022.repository.entity.PaymentCard.mmCardCountryCode, com.tools20022.repository.entity.SafekeepingPlace.mmCountry, com.tools20022.repository.entity.BeneficialOwner.mmNonDomicileCountry,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmCountry, com.tools20022.repository.entity.RegulatoryAuthorityRole.mmCountry, com.tools20022.repository.entity.Market.mmCountry);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmDomiciledFunds, com.tools20022.repository.entity.Country.mmCode, com.tools20022.repository.entity.Country.mmCitizen,
						com.tools20022.repository.entity.Country.mmTax, com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace, com.tools20022.repository.entity.Country.mmCountryForBeneficialOwner,
						com.tools20022.repository.entity.Country.mmProducedProducts, com.tools20022.repository.entity.Country.mmNationalRegulatoryAuthority, com.tools20022.repository.entity.Country.mmRelatedCardPayment,
						com.tools20022.repository.entity.Country.mmName, com.tools20022.repository.entity.Country.mmPostalAddressSpecification, com.tools20022.repository.entity.Country.mmCountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.Country.mmMarket, com.tools20022.repository.entity.Country.mmRelatedPaymentCard);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Country.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFund> getDomiciledFunds() {
		return domiciledFunds;
	}

	public void setDomiciledFunds(List<com.tools20022.repository.entity.InvestmentFund> domiciledFunds) {
		this.domiciledFunds = domiciledFunds;
	}

	public CountryCode getCode() {
		return code;
	}

	public void setCode(CountryCode code) {
		this.code = code;
	}

	public Person getCitizen() {
		return citizen;
	}

	public void setCitizen(com.tools20022.repository.entity.Person citizen) {
		this.citizen = citizen;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}

	public List<SafekeepingPlace> getCountryForSafekeepingPlace() {
		return countryForSafekeepingPlace;
	}

	public void setCountryForSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> countryForSafekeepingPlace) {
		this.countryForSafekeepingPlace = countryForSafekeepingPlace;
	}

	public BeneficialOwner getCountryForBeneficialOwner() {
		return countryForBeneficialOwner;
	}

	public void setCountryForBeneficialOwner(com.tools20022.repository.entity.BeneficialOwner countryForBeneficialOwner) {
		this.countryForBeneficialOwner = countryForBeneficialOwner;
	}

	public List<Product> getProducedProducts() {
		return producedProducts;
	}

	public void setProducedProducts(List<com.tools20022.repository.entity.Product> producedProducts) {
		this.producedProducts = producedProducts;
	}

	public List<RegulatoryAuthorityRole> getNationalRegulatoryAuthority() {
		return nationalRegulatoryAuthority;
	}

	public void setNationalRegulatoryAuthority(List<com.tools20022.repository.entity.RegulatoryAuthorityRole> nationalRegulatoryAuthority) {
		this.nationalRegulatoryAuthority = nationalRegulatoryAuthority;
	}

	public List<CardPaymentAcquiring> getRelatedCardPayment() {
		return relatedCardPayment;
	}

	public void setRelatedCardPayment(List<com.tools20022.repository.entity.CardPaymentAcquiring> relatedCardPayment) {
		this.relatedCardPayment = relatedCardPayment;
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public List<PostalAddress> getPostalAddressSpecification() {
		return postalAddressSpecification;
	}

	public void setPostalAddressSpecification(List<com.tools20022.repository.entity.PostalAddress> postalAddressSpecification) {
		this.postalAddressSpecification = postalAddressSpecification;
	}

	public InvestmentFundClassProcessingCharacteristics getCountryRelatedInvestmentFundProcessing() {
		return countryRelatedInvestmentFundProcessing;
	}

	public void setCountryRelatedInvestmentFundProcessing(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics countryRelatedInvestmentFundProcessing) {
		this.countryRelatedInvestmentFundProcessing = countryRelatedInvestmentFundProcessing;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(com.tools20022.repository.entity.Market market) {
		this.market = market;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}
}