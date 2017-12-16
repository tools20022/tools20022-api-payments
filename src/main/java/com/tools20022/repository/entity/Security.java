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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EntryTransaction8;
import com.tools20022.repository.msg.LoanContract1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegisteredDistributionCountry
 * Security.mmRegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
 * Security.mmDenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
 * Security.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
 * Security.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmEUSavingsDirective
 * Security.mmEUSavingsDirective}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
 * Security.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFees
 * Security.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
 * Security.mmTradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
 * Security.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRestriction
 * Security.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
 * Security.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
 * Security.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
 * Security.mmDeclarationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSpread
 * Security.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmDividend
 * Security.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmBalance
 * Security.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmFungibleIndicator
 * Security.mmFungibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAppearance
 * Security.mmAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
 * Security.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmContractSettlementMonth
 * Security.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
 * Security.mmMinimumTradingPricingIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRating
 * Security.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSector
 * Security.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmWarrantAttachedOnDelivery
 * Security.mmWarrantAttachedOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmStrippableIndicator
 * Security.mmStrippableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFirstDealingDate
 * Security.mmFirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationJurisdiction
 * Security.mmRegistrationJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPartyRole
 * Security.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
 * Security.mmSecurityStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmModification
 * Security.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRedemptionSchedule
 * Security.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
 * Security.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateActionStandingInstructions
 * Security.mmCorporateActionStandingInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmQuote
 * Security.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
 * Security.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedVariableInterest
 * Security.mmRelatedVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmConversion
 * Security.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmComponentSecurity
 * Security.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRecompositionIndicator
 * Security.mmRecompositionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSeries
 * Security.mmSeries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPercentageOfDebtClaim
 * Security.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCoverRate
 * Security.mmCoverRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMaturityRedemption
 * Security.mmMaturityRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
 * Security.mmRelatedMarginCall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPotentialEuroSystemEligibility
 * Security.mmPotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
 * Security.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRestrictedIndicator
 * Security.mmRestrictedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
 * Dividend.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
 * RedemptionSchedule.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
 * TradingMarket.mmTradedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
 * TradingMarket.mmListedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
 * SecuritiesQuantity.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
 * SecuritiesTransfer.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
 * SecuritiesPartyRole.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
 * SecuritiesRelatedFees.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
 * SecuritiesStatus.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
 * VariableInterest.mmBenchmarkReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
 * CouponAttached.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
 * SecuritiesConversion.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
 * SecuritiesRestriction.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
 * SecuritiesBalance.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
 * CorporateActionEvent.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
 * SecuritiesModification.mmNewSecurityReferenceData}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
 * Spread.mmBenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
 * SecuritiesOrder.mmOrderedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmSecurity
 * Rating.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmSecurity
 * Sector.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
 * Jurisdiction.mmRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
 * MarginCall.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
 * Quote.mmQuotedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
 * ComponentSecurity.mmSecurity}</li>
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
 * "Security"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesIdentification> identification;
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
	 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmContractDocumentIdentification
	 * LoanContract1.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmFinancialInstrumentIdentification
	 * EntryTransaction8.mmFinancialInstrumentIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmContractDocumentIdentification, EntryTransaction8.mmFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected CountryCode registeredDistributionCountry;
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
	public static final MMBusinessAttribute mmRegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegisteredDistributionCountry", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode denominationCurrency;
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
	public static final MMBusinessAttribute mmDenominationCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDenominationCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FormOfSecurityCode registrationForm;
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
	public static final MMBusinessAttribute mmRegistrationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegistrationForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedIndicator;
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
	public static final MMBusinessAttribute mmDematerialisedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDematerialisedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUSavingsDirectiveCode eUSavingsDirective;
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
	public static final MMBusinessAttribute mmEUSavingsDirective = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getEUSavingsDirective", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * Specifies the quantity associated with a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
	 * SecuritiesQuantity.mmSecurityIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees;
	/**
	 * Fees related to securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
	 * SecuritiesRelatedFees.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmFees = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> pricing;
	/**
	 * Information on the price of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
	 * SecuritiesPricing.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * Account on which the security is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
	 * SecuritiesAccount.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> tradingMarket;
	/**
	 * Market(s) on which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
	 * TradingMarket.mmTradedSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmTradingMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> placeOfListing;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
	 * TradingMarket.mmListedSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfListing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmListedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration;
	/**
	 * Information related to registration of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
	 * BasicSecuritiesRegistration.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRestriction> restriction;
	/**
	 * Regulatory restriction(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
	 * SecuritiesRestriction.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmRestriction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent;
	/**
	 * Corporate event linked to the security
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCorporateAction
	 * EntryTransaction8.mmCorporateAction}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateEvent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction8.mmCorporateAction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected YesNoIndicator temporaryFinancialInstrumentIndicator;
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
	public static final MMBusinessAttribute mmTemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getTemporaryFinancialInstrumentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime availableDate;
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
	public static final MMBusinessAttribute mmAvailableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAvailableDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text declarationDetails;
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
	public static final MMBusinessAttribute mmDeclarationDetails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDeclarationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * Spread that uses the security as benchmark reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
	 * Spread.mmBenchmarkSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * Dividend per financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
	 * Dividend.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected SecuritiesBalance balance;
	/**
	 * Balance of the account which holds a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
	 * SecuritiesBalance.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected YesNoIndicator fungibleIndicator;
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
	public static final MMBusinessAttribute mmFungibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFungibleIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AppearanceCode appearance;
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
	public static final MMBusinessAttribute mmAppearance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAppearance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number nearTermPositionLimit;
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
	public static final MMBusinessAttribute mmNearTermPositionLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getNearTermPositionLimit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISOYearMonth contractSettlementMonth;
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
	public static final MMBusinessAttribute mmContractSettlementMonth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getContractSettlementMonth", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number minimumTradingPricingIncrement;
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
	public static final MMBusinessAttribute mmMinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMinimumTradingPricingIncrement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Rating> rating;
	/**
	 * Rating(s) of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmSecurity
	 * Rating.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmRating = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CouponAttached> couponAttached;
	/**
	 * Coupon information of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
	 * CouponAttached.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmCouponAttached = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
		}
	};
	protected Sector sector;
	/**
	 * Indicates the market sector the security is classified as
	 * pharmaceuticals, automobile, housing, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmSecurity
	 * Sector.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected YesNoIndicator warrantAttachedOnDelivery;
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
	public static final MMBusinessAttribute mmWarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getWarrantAttachedOnDelivery", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator strippableIndicator;
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
	public static final MMBusinessAttribute mmStrippableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getStrippableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstDealingDate;
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
	public static final MMBusinessAttribute mmFirstDealingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFirstDealingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTax> taxDetails;
	/**
	 * Tax details of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
	 * SecuritiesTax.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmTaxDetails = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * Trade in which the security is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Jurisdiction registrationJurisdiction;
	/**
	 * Jurisdiction (country, county, state, province, city) in which the
	 * security is legally recorded for regulatory and/or tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
	 * Jurisdiction.mmRegisteredSecurities}</li>
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
	public static final MMBusinessAssociationEnd mmRegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole;
	/**
	 * Specifies roles played by a party that are linked to the handling of
	 * securities but not related to a specific process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
	 * SecuritiesPartyRole.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus;
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
	 * SecuritiesStatus.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecurityStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
		}
	};
	protected SecuritiesModification modification;
	/**
	 * Modification process which applies to a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
	 * SecuritiesModification.mmNewSecurityReferenceData}</li>
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
	public static final MMBusinessAssociationEnd mmModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule;
	/**
	 * RedemptionSchedule(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
	 * RedemptionSchedule.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Settlement of a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
	 * SecuritiesSettlement.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer process in which that security is transferred..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
	 * SecuritiesTransfer.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions;
	/**
	 * Standing instructions related to the security in the context of corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
	 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
		}
	};
	protected Quote quote;
	/**
	 * Quote of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Order for which a specific security is indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected VariableInterest relatedVariableInterest;
	/**
	 * Variable interest parameters specified for interest related to a
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
	 * VariableInterest.mmBenchmarkReference}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> conversion;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
	 * SecuritiesConversion.mmSecurityIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity;
	/**
	 * The security is part of the component security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
	 * ComponentSecurity.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmComponentSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	protected YesNoIndicator recompositionIndicator;
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
	public static final MMBusinessAttribute mmRecompositionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRecompositionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text series;
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
	public static final MMBusinessAttribute mmSeries = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getSeries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentageOfDebtClaim;
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
	public static final MMBusinessAttribute mmPercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPercentageOfDebtClaim", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate coverRate;
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
	public static final MMBusinessAttribute mmCoverRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getCoverRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MaturityRedemptionTypeCode maturityRedemption;
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
	public static final MMBusinessAttribute mmMaturityRedemption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMaturityRedemption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall relatedMarginCall;
	/**
	 * Margin call for which the associated securities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
	 * MarginCall.mmSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected Party closeLink;
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
	 * Party.mmCloseLinkSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmCloseLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmCloseLinkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected YesNoIndicator potentialEuroSystemEligibility;
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
	public static final MMBusinessAttribute mmPotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPotentialEuroSystemEligibility", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
	 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator restrictedIndicator;
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
	public static final MMBusinessAttribute mmRestrictedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRestrictedIndicator", new Class[]{});
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
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.Dividend.mmSecurity,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.Party.mmCloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.mmSecurity,
						com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecurity, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity, com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity,
						com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference, com.tools20022.repository.entity.CouponAttached.mmSecurity, com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity, com.tools20022.repository.entity.SecuritiesBalance.mmSecurity,
						com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData,
						com.tools20022.repository.entity.Spread.mmBenchmarkSecurity, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity, com.tools20022.repository.entity.Rating.mmSecurity,
						com.tools20022.repository.entity.Sector.mmSecurity, com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity,
						com.tools20022.repository.entity.MarginCall.mmSecurity, com.tools20022.repository.entity.Quote.mmQuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.mmSecurity);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmIdentification, com.tools20022.repository.entity.Security.mmRegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.mmDenominationCurrency, com.tools20022.repository.entity.Security.mmRegistrationForm, com.tools20022.repository.entity.Security.mmDematerialisedIndicator,
						com.tools20022.repository.entity.Security.mmEUSavingsDirective, com.tools20022.repository.entity.Security.mmSecuritiesQuantity, com.tools20022.repository.entity.Security.mmFees,
						com.tools20022.repository.entity.Security.mmPricing, com.tools20022.repository.entity.Security.mmSecuritiesAccount, com.tools20022.repository.entity.Security.mmTradingMarket,
						com.tools20022.repository.entity.Security.mmPlaceOfListing, com.tools20022.repository.entity.Security.mmRegistration, com.tools20022.repository.entity.Security.mmRestriction,
						com.tools20022.repository.entity.Security.mmCorporateEvent, com.tools20022.repository.entity.Security.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.mmAvailableDate,
						com.tools20022.repository.entity.Security.mmDeclarationDetails, com.tools20022.repository.entity.Security.mmSpread, com.tools20022.repository.entity.Security.mmDividend,
						com.tools20022.repository.entity.Security.mmBalance, com.tools20022.repository.entity.Security.mmFungibleIndicator, com.tools20022.repository.entity.Security.mmAppearance,
						com.tools20022.repository.entity.Security.mmNearTermPositionLimit, com.tools20022.repository.entity.Security.mmContractSettlementMonth, com.tools20022.repository.entity.Security.mmMinimumTradingPricingIncrement,
						com.tools20022.repository.entity.Security.mmRating, com.tools20022.repository.entity.Security.mmCouponAttached, com.tools20022.repository.entity.Security.mmSector,
						com.tools20022.repository.entity.Security.mmWarrantAttachedOnDelivery, com.tools20022.repository.entity.Security.mmStrippableIndicator, com.tools20022.repository.entity.Security.mmFirstDealingDate,
						com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.Security.mmRegistrationJurisdiction,
						com.tools20022.repository.entity.Security.mmPartyRole, com.tools20022.repository.entity.Security.mmSecurityStatus, com.tools20022.repository.entity.Security.mmModification,
						com.tools20022.repository.entity.Security.mmRedemptionSchedule, com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Security.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Security.mmCorporateActionStandingInstructions, com.tools20022.repository.entity.Security.mmQuote, com.tools20022.repository.entity.Security.mmSecuritiesOrder,
						com.tools20022.repository.entity.Security.mmRelatedVariableInterest, com.tools20022.repository.entity.Security.mmConversion, com.tools20022.repository.entity.Security.mmComponentSecurity,
						com.tools20022.repository.entity.Security.mmRecompositionIndicator, com.tools20022.repository.entity.Security.mmSeries, com.tools20022.repository.entity.Security.mmPercentageOfDebtClaim,
						com.tools20022.repository.entity.Security.mmCoverRate, com.tools20022.repository.entity.Security.mmMaturityRedemption, com.tools20022.repository.entity.Security.mmRelatedMarginCall,
						com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.Security.mmPotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.mmMinimumQuantity,
						com.tools20022.repository.entity.Security.mmRestrictedIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Security.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesIdentification> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.SecuritiesIdentification> identification) {
		this.identification = identification;
	}

	public CountryCode getRegisteredDistributionCountry() {
		return registeredDistributionCountry;
	}

	public void setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = registeredDistributionCountry;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	public FormOfSecurityCode getRegistrationForm() {
		return registrationForm;
	}

	public void setRegistrationForm(FormOfSecurityCode registrationForm) {
		this.registrationForm = registrationForm;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public void setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
	}

	public EUSavingsDirectiveCode getEUSavingsDirective() {
		return eUSavingsDirective;
	}

	public void setEUSavingsDirective(EUSavingsDirectiveCode eUSavingsDirective) {
		this.eUSavingsDirective = eUSavingsDirective;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<SecuritiesRelatedFees> getFees() {
		return fees;
	}

	public void setFees(List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees) {
		this.fees = fees;
	}

	public List<SecuritiesPricing> getPricing() {
		return pricing;
	}

	public void setPricing(List<com.tools20022.repository.entity.SecuritiesPricing> pricing) {
		this.pricing = pricing;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<TradingMarket> getTradingMarket() {
		return tradingMarket;
	}

	public void setTradingMarket(List<com.tools20022.repository.entity.TradingMarket> tradingMarket) {
		this.tradingMarket = tradingMarket;
	}

	public List<TradingMarket> getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(List<com.tools20022.repository.entity.TradingMarket> placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	public List<BasicSecuritiesRegistration> getRegistration() {
		return registration;
	}

	public void setRegistration(List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration) {
		this.registration = registration;
	}

	public List<SecuritiesRestriction> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.entity.SecuritiesRestriction> restriction) {
		this.restriction = restriction;
	}

	public List<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent;
	}

	public void setCorporateEvent(List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent) {
		this.corporateEvent = corporateEvent;
	}

	public YesNoIndicator getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator;
	}

	public void setTemporaryFinancialInstrumentIndicator(YesNoIndicator temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
	}

	public ISODateTime getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(ISODateTime availableDate) {
		this.availableDate = availableDate;
	}

	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}

	public List<Dividend> getDividend() {
		return dividend;
	}

	public void setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = dividend;
	}

	public SecuritiesBalance getBalance() {
		return balance;
	}

	public void setBalance(com.tools20022.repository.entity.SecuritiesBalance balance) {
		this.balance = balance;
	}

	public YesNoIndicator getFungibleIndicator() {
		return fungibleIndicator;
	}

	public void setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
	}

	public AppearanceCode getAppearance() {
		return appearance;
	}

	public void setAppearance(AppearanceCode appearance) {
		this.appearance = appearance;
	}

	public Number getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public void setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public void setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
	}

	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public void setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<com.tools20022.repository.entity.Rating> rating) {
		this.rating = rating;
	}

	public List<CouponAttached> getCouponAttached() {
		return couponAttached;
	}

	public void setCouponAttached(List<com.tools20022.repository.entity.CouponAttached> couponAttached) {
		this.couponAttached = couponAttached;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = sector;
	}

	public YesNoIndicator getWarrantAttachedOnDelivery() {
		return warrantAttachedOnDelivery;
	}

	public void setWarrantAttachedOnDelivery(YesNoIndicator warrantAttachedOnDelivery) {
		this.warrantAttachedOnDelivery = warrantAttachedOnDelivery;
	}

	public YesNoIndicator getStrippableIndicator() {
		return strippableIndicator;
	}

	public void setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = strippableIndicator;
	}

	public ISODateTime getFirstDealingDate() {
		return firstDealingDate;
	}

	public void setFirstDealingDate(ISODateTime firstDealingDate) {
		this.firstDealingDate = firstDealingDate;
	}

	public List<SecuritiesTax> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<com.tools20022.repository.entity.SecuritiesTax> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return securitiesTrade;
	}

	public void setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
	}

	public Jurisdiction getRegistrationJurisdiction() {
		return registrationJurisdiction;
	}

	public void setRegistrationJurisdiction(com.tools20022.repository.entity.Jurisdiction registrationJurisdiction) {
		this.registrationJurisdiction = registrationJurisdiction;
	}

	public List<SecuritiesPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<SecuritiesStatus> getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus) {
		this.securityStatus = securityStatus;
	}

	public SecuritiesModification getModification() {
		return modification;
	}

	public void setModification(com.tools20022.repository.entity.SecuritiesModification modification) {
		this.modification = modification;
	}

	public List<RedemptionSchedule> getRedemptionSchedule() {
		return redemptionSchedule;
	}

	public void setRedemptionSchedule(List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule) {
		this.redemptionSchedule = redemptionSchedule;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public List<AgentCorporateActionStandingInstruction> getCorporateActionStandingInstructions() {
		return corporateActionStandingInstructions;
	}

	public void setCorporateActionStandingInstructions(List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions) {
		this.corporateActionStandingInstructions = corporateActionStandingInstructions;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public VariableInterest getRelatedVariableInterest() {
		return relatedVariableInterest;
	}

	public void setRelatedVariableInterest(com.tools20022.repository.entity.VariableInterest relatedVariableInterest) {
		this.relatedVariableInterest = relatedVariableInterest;
	}

	public List<SecuritiesConversion> getConversion() {
		return conversion;
	}

	public void setConversion(List<com.tools20022.repository.entity.SecuritiesConversion> conversion) {
		this.conversion = conversion;
	}

	public List<ComponentSecurity> getComponentSecurity() {
		return componentSecurity;
	}

	public void setComponentSecurity(List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity) {
		this.componentSecurity = componentSecurity;
	}

	public YesNoIndicator getRecompositionIndicator() {
		return recompositionIndicator;
	}

	public void setRecompositionIndicator(YesNoIndicator recompositionIndicator) {
		this.recompositionIndicator = recompositionIndicator;
	}

	public Max35Text getSeries() {
		return series;
	}

	public void setSeries(Max35Text series) {
		this.series = series;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	public PercentageRate getCoverRate() {
		return coverRate;
	}

	public void setCoverRate(PercentageRate coverRate) {
		this.coverRate = coverRate;
	}

	public MaturityRedemptionTypeCode getMaturityRedemption() {
		return maturityRedemption;
	}

	public void setMaturityRedemption(MaturityRedemptionTypeCode maturityRedemption) {
		this.maturityRedemption = maturityRedemption;
	}

	public MarginCall getRelatedMarginCall() {
		return relatedMarginCall;
	}

	public void setRelatedMarginCall(com.tools20022.repository.entity.MarginCall relatedMarginCall) {
		this.relatedMarginCall = relatedMarginCall;
	}

	public Party getCloseLink() {
		return closeLink;
	}

	public void setCloseLink(com.tools20022.repository.entity.Party closeLink) {
		this.closeLink = closeLink;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility;
	}

	public void setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = potentialEuroSystemEligibility;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public void setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
	}
}