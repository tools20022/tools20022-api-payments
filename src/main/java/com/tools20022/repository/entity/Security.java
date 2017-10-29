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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Security" src="doc-files/Security.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Identification
 * Security.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RegisteredDistributionCountry
 * Security.RegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#DenominationCurrency
 * Security.DenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RegistrationForm
 * Security.RegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#DematerialisedIndicator
 * Security.DematerialisedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#EUSavingsDirective
 * Security.EUSavingsDirective}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
 * Security.SecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Fees Security.Fees}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Pricing
 * Security.Pricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
 * Security.SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TradingMarket
 * Security.TradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
 * Security.PlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Registration
 * Security.Registration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Restriction
 * Security.Restriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CorporateEvent
 * Security.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#TemporaryFinancialInstrumentIndicator
 * Security.TemporaryFinancialInstrumentIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#AvailableDate
 * Security.AvailableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#DeclarationDetails
 * Security.DeclarationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Spread
 * Security.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Dividend
 * Security.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Balance
 * Security.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#FungibleIndicator
 * Security.FungibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Appearance
 * Security.Appearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#NearTermPositionLimit
 * Security.NearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#ContractSettlementMonth
 * Security.ContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#MinimumTradingPricingIncrement
 * Security.MinimumTradingPricingIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Rating
 * Security.Rating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CouponAttached
 * Security.CouponAttached}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Sector
 * Security.Sector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#WarrantAttachedOnDelivery
 * Security.WarrantAttachedOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#StrippableIndicator
 * Security.StrippableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#FirstDealingDate
 * Security.FirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TaxDetails
 * Security.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
 * Security.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RegistrationJurisdiction
 * Security.RegistrationJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PartyRole
 * Security.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecurityStatus
 * Security.SecurityStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Modification
 * Security.Modification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RedemptionSchedule
 * Security.RedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
 * Security.SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
 * Security.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#CorporateActionStandingInstructions
 * Security.CorporateActionStandingInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Quote
 * Security.Quote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
 * Security.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
 * Security.RelatedVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Conversion
 * Security.Conversion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#ComponentSecurity
 * Security.ComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RecompositionIndicator
 * Security.RecompositionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Series
 * Security.Series}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#PercentageOfDebtClaim
 * Security.PercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CoverRate
 * Security.CoverRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MaturityRedemption
 * Security.MaturityRedemption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
 * Security.RelatedMarginCall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CloseLink
 * Security.CloseLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#PotentialEuroSystemEligibility
 * Security.PotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
 * Security.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RestrictedIndicator
 * Security.RestrictedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
 * SecuritiesIdentification.IdentifiedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Security
 * Dividend.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
 * SecuritiesPricing.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
 * Party.CloseLinkSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Security
 * RedemptionSchedule.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
 * TradingMarket.TradedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
 * TradingMarket.ListedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
 * SecuritiesAccount.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#Security
 * SecuritiesTax.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
 * SecuritiesQuantity.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
 * SecuritiesQuantity.MinimumQuantityDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
 * SecuritiesTrade.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
 * SecuritiesTransfer.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#Security
 * SecuritiesPartyRole.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
 * SecuritiesSettlement.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#Security
 * SecuritiesRelatedFees.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#Security
 * SecuritiesStatus.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
 * VariableInterest.BenchmarkReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#Security
 * CouponAttached.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
 * SecuritiesConversion.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#Security
 * BasicSecuritiesRegistration.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Security
 * SecuritiesRestriction.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
 * SecuritiesBalance.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
 * CorporateActionEvent.UnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
 * SecuritiesModification.NewSecurityReferenceData}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkSecurity
 * Spread.BenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
 * SecuritiesOrder.OrderedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#Security
 * Rating.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#Security
 * Sector.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RegisteredSecurities
 * Jurisdiction.RegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#Security
 * AgentCorporateActionStandingInstruction.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#Security
 * MarginCall.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#QuotedSecurity
 * Quote.QuotedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ComponentSecurity#Security
 * ComponentSecurity.Security}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt Debt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
 * "Security"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
	 * SecuritiesIdentification.IdentifiedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#ContractDocumentIdentification
	 * LoanContract1.ContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#FinancialInstrumentIdentification
	 * EntryTransaction8.FinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.ContractDocumentIdentification, com.tools20022.repository.msg.EntryTransaction8.FinancialInstrumentIdentification);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredDistributionCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DenominationCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the form, ie, ownership, of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode
	 * FormOfSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationForm = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}
	};
	/**
	 * Indicates whether a security exists only as an electronic record, ie,
	 * there is no physical document representing the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DematerialisedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the investment fund class is subject to the European
	 * Union Saving Directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsDirective"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund class is subject to the European Union Saving Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EUSavingsDirective = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}
	};
	/**
	 * Specifies the quantity associated with a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
	 * SecuritiesQuantity.SecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity associated with a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fees related to securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#Security
	 * SecuritiesRelatedFees.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees related to securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Fees = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesRelatedFees.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the price of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
	 * SecuritiesPricing.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the price of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Pricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account on which the security is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
	 * SecuritiesAccount.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the security is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
	 * TradingMarket.TradedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
	 * TradingMarket.ListedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfListing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.ListedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to registration of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#Security
	 * BasicSecuritiesRegistration.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to registration of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Registration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Regulatory restriction(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Security
	 * SecuritiesRestriction.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restriction(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Restriction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event linked to the security
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
	 * CorporateActionEvent.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CorporateAction
	 * EntryTransaction8.CorporateAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event linked to the security"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction8.CorporateAction);
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the security is a temporary security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the security is a temporary security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which securities become available for sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which securities become available for sale."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AvailableDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides declaration details narrative relative to the financial
	 * instrument, eg, beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeclarationDetails = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Spread that uses the security as benchmark reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#BenchmarkSecurity
	 * Spread.BenchmarkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread that uses the security as benchmark reference."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend per financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#Security
	 * Dividend.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend per financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance of the account which holds a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
	 * SecuritiesBalance.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account which holds a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether a security is interchangeable, ie, the security is
	 * allowed to be replaced by another security, without loss of value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FungibleIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the deliverability of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Appearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deliverability of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Appearance = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}
	};
	/**
	 * Position limit in the near-term contract for a given exchange-traded
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limit in the near-term contract for a given exchange-traded product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NearTermPositionLimit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractSettlementMonth = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Minimum price increase for a given exchange-traded Instrument
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increase for a given exchange-traded Instrument"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Rating(s) of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Rating#Security
	 * Rating.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rating(s) of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Rating = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Coupon information of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#Security
	 * CouponAttached.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coupon information of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CouponAttached = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the market sector the security is classified as
	 * pharmaceuticals, automobile, housing, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Sector#Security
	 * Sector.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the warrants on a financial instrument (which has been
	 * traded cum warrants) will be attached on delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantAttachedOnDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the interest is separable from the principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrippableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest is separable from the principal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrippableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which new securities begin trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstDealingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which new securities begin trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstDealingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax details of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#Security
	 * SecuritiesTax.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax details of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxDetails = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade in which the security is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
	 * SecuritiesTrade.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which the security is involved."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) in which the
	 * security is legally recorded for regulatory and/or tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RegisteredSecurities
	 * Jurisdiction.RegisteredSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies roles played by a party that are linked to the handling of
	 * securities but not related to a specific process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#Security
	 * SecuritiesPartyRole.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#Security
	 * SecuritiesStatus.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecurityStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Modification process which applies to a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
	 * SecuritiesModification.NewSecurityReferenceData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification process which applies to a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Modification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * RedemptionSchedule(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#Security
	 * RedemptionSchedule.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RedemptionSchedule(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement of a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
	 * SecuritiesSettlement.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process in which that security is transferred..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
	 * SecuritiesTransfer.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process in which that security is transferred.."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing instructions related to the security in the context of corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#Security
	 * AgentCorporateActionStandingInstruction.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing instructions related to the security in the context of corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#QuotedSecurity
	 * Quote.QuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a specific security is indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
	 * SecuritiesOrder.OrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a specific security is indicated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variable interest parameters specified for interest related to a
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
	 * VariableInterest.BenchmarkReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedVariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variable interest parameters specified for interest related to a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.BenchmarkReference;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the conversion exchange of an entitlement or of preferred
	 * equities or of convertible bonds, into another form of securities,
	 * usually common equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
	 * SecuritiesConversion.SecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Conversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The security is part of the component security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#Security
	 * ComponentSecurity.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security is part of the component security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ComponentSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest and the principal can be recomposed. This
	 * is the reverse operation of stripping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecompositionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RecompositionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifier that links multiple security classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier that links multiple security classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Series = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Percentage of the underlying assets of a fund that represents a debt and
	 * is in the scope of the EU Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of dividends the issuer intends to pay out the following year
	 * based on their normalised earnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CoverRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Return of an investor's principal in a security at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Return of an investor's principal in a security at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaturityRedemption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}
	};
	/**
	 * Margin call for which the associated securities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#Security
	 * MarginCall.Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin call for which the associated securities are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Situation in which two entities are linked because one of these entities
	 * owns some of the capital of the other one, or has a control relationship
	 * with it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
	 * Party.CloseLinkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CloseLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.CloseLinkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates that the security is intended to be held in a manner that could
	 * allow the Eurosystem eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentialEuroSystemEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
	 * SecuritiesQuantity.MinimumQuantityDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144 of the
	 * Securities and Exchange Commission,that sets the conditions under which
	 * restricted, unregistered and control securities can be sold).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RestrictedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Security.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity, com.tools20022.repository.entity.Dividend.Security,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.Party.CloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.Security,
						com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.ListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesTax.Security, com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.Security, com.tools20022.repository.entity.SecuritiesTransfer.Security, com.tools20022.repository.entity.SecuritiesPartyRole.Security,
						com.tools20022.repository.entity.SecuritiesSettlement.Security, com.tools20022.repository.entity.SecuritiesRelatedFees.Security, com.tools20022.repository.entity.SecuritiesStatus.Security,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.CouponAttached.Security, com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.Security, com.tools20022.repository.entity.SecuritiesRestriction.Security, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData, com.tools20022.repository.entity.Spread.BenchmarkSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.Rating.Security, com.tools20022.repository.entity.Sector.Security,
						com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.Quote.QuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.Security);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Identification, com.tools20022.repository.entity.Security.RegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.DenominationCurrency, com.tools20022.repository.entity.Security.RegistrationForm, com.tools20022.repository.entity.Security.DematerialisedIndicator,
						com.tools20022.repository.entity.Security.EUSavingsDirective, com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.Fees,
						com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.Security.TradingMarket,
						com.tools20022.repository.entity.Security.PlaceOfListing, com.tools20022.repository.entity.Security.Registration, com.tools20022.repository.entity.Security.Restriction,
						com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.Security.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.AvailableDate,
						com.tools20022.repository.entity.Security.DeclarationDetails, com.tools20022.repository.entity.Security.Spread, com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Security.Balance,
						com.tools20022.repository.entity.Security.FungibleIndicator, com.tools20022.repository.entity.Security.Appearance, com.tools20022.repository.entity.Security.NearTermPositionLimit,
						com.tools20022.repository.entity.Security.ContractSettlementMonth, com.tools20022.repository.entity.Security.MinimumTradingPricingIncrement, com.tools20022.repository.entity.Security.Rating,
						com.tools20022.repository.entity.Security.CouponAttached, com.tools20022.repository.entity.Security.Sector, com.tools20022.repository.entity.Security.WarrantAttachedOnDelivery,
						com.tools20022.repository.entity.Security.StrippableIndicator, com.tools20022.repository.entity.Security.FirstDealingDate, com.tools20022.repository.entity.Security.TaxDetails,
						com.tools20022.repository.entity.Security.SecuritiesTrade, com.tools20022.repository.entity.Security.RegistrationJurisdiction, com.tools20022.repository.entity.Security.PartyRole,
						com.tools20022.repository.entity.Security.SecurityStatus, com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Security.RedemptionSchedule,
						com.tools20022.repository.entity.Security.SecuritiesSettlement, com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.Security.CorporateActionStandingInstructions,
						com.tools20022.repository.entity.Security.Quote, com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.Security.RelatedVariableInterest,
						com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.Security.ComponentSecurity, com.tools20022.repository.entity.Security.RecompositionIndicator,
						com.tools20022.repository.entity.Security.Series, com.tools20022.repository.entity.Security.PercentageOfDebtClaim, com.tools20022.repository.entity.Security.CoverRate,
						com.tools20022.repository.entity.Security.MaturityRedemption, com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.Security.CloseLink,
						com.tools20022.repository.entity.Security.PotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.MinimumQuantity, com.tools20022.repository.entity.Security.RestrictedIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}