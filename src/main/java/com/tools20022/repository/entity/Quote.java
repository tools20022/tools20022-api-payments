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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the quote details are indicated as an offer, a bid or a mid
 * of a security, commodity, currency (the latter being an average of the offer
 * and the bid).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Quote" src="doc-files/Quote.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
 * Quote.mmMaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuantity
 * Quote.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
 * Quote.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPartyRole
 * Quote.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRelatedNegotiation
 * Quote.mmRelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
 * Quote.mmQuotedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
 * Quote.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
 * Quote.mmRequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
 * Quote.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmMidSideQuoteVariable
 * Quote.mmMidSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmBidSideQuoteVariable
 * Quote.mmBidSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmOfferSideQuoteVariable
 * Quote.mmOfferSideQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmSecurityQuoteVariable
 * Quote.mmSecurityQuoteVariable}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuoteSwap
 * Quote.mmQuoteSwap}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmValidUntilDateTime
 * Quote.mmValidUntilDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmCurrency
 * Quote.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmStatus
 * Quote.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
 * Quote.mmQuotedSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmQuote
 * Security.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmQuote
 * InformationPartyRole.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPreviousClosingPriceRelatedQuote
 * SecuritiesPricing.mmPreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRequestedPriceRelatedQuote
 * SecuritiesPricing.mmRequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceRelatedQuote
 * SecuritiesPricing.mmPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMarketPriceRelatedQuote
 * SecuritiesPricing.mmMarketPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityRelatedQuote
 * SecuritiesQuantity.mmMaximumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmQuantityRelatedQuote
 * SecuritiesQuantity.mmQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityRelatedQuote
 * SecuritiesQuantity.mmMinimumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmQuote
 * Negotiation.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus#mmRelatedQuote
 * QuoteStatus.mmRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmRelatedQuote
 * FinancialInstrumentSwap.mmRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmMidSide
 * SecuritiesQuoteVariable.mmMidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmBidSide
 * SecuritiesQuoteVariable.mmBidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmOfferSide
 * SecuritiesQuoteVariable.mmOfferSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmRelatedQuote
 * SecuritiesQuoteVariable.mmRelatedQuote}</li>
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
 * "Quote"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid)."
 * </li>
 * </ul>
 */
public class Quote {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity maximumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityRelatedQuote
	 * SecuritiesQuantity.mmMaximumQuantityRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 134, FIXSynonym: 135</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the maximum quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuantity> mmMaximumQuantity = new MMBusinessAssociationEnd<Quote, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "134"), new FIXSynonym(this, "135"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Specifies the maximum quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMaximumQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Quote obj) {
			return obj.getMaximumQuantity();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuantity value) {
			obj.setMaximumQuantity(value);
		}
	};
	protected SecuritiesQuantity quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmQuantityRelatedQuote
	 * SecuritiesQuantity.mmQuantityRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 134, FIXSynonym: 135</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a Financial Instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuantity> mmQuantity = new MMBusinessAssociationEnd<Quote, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "134"), new FIXSynonym(this, "135"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a Financial Instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Quote obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuantity value) {
			obj.setQuantity(value);
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityRelatedQuote
	 * SecuritiesQuantity.mmMinimumQuantityRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 647, FIXSynonym: 648</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimal quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuantity> mmMinimumQuantity = new MMBusinessAssociationEnd<Quote, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "647"), new FIXSynonym(this, "648"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Specifies the minimal quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Quote obj) {
			return obj.getMinimumQuantity();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuantity value) {
			obj.setMinimumQuantity(value);
		}
	};
	protected List<InformationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmQuote
	 * InformationPartyRole.mmQuote}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in a quotation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, List<InformationPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Quote, List<InformationPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a quotation process.";
			minOccurs = 0;
			opposite_lazy = () -> InformationPartyRole.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public List<InformationPartyRole> getValue(Quote obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Quote obj, List<InformationPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmQuote
	 * Negotiation.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation process during which quotes are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, Optional<Negotiation>> mmRelatedNegotiation = new MMBusinessAssociationEnd<Quote, Optional<Negotiation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process during which quotes are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Negotiation.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}

		@Override
		public Optional<Negotiation> getValue(Quote obj) {
			return obj.getRelatedNegotiation();
		}

		@Override
		public void setValue(Quote obj, Optional<Negotiation> value) {
			obj.setRelatedNegotiation(value.orElse(null));
		}
	};
	protected List<CurrencyExchange> quotedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesQuote
	 * CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate specified in a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, List<CurrencyExchange>> mmQuotedRate = new MMBusinessAssociationEnd<Quote, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedRate";
			definition = "Exchange rate specified in a quote.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Quote obj) {
			return obj.getQuotedRate();
		}

		@Override
		public void setValue(Quote obj, List<CurrencyExchange> value) {
			obj.setQuotedRate(value);
		}
	};
	protected SecuritiesPricing previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPreviousClosingPriceRelatedQuote
	 * SecuritiesPricing.mmPreviousClosingPriceRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous closing price of the financial instrument - Useful for verifying its identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesPricing> mmPreviousClosingPrice = new MMBusinessAssociationEnd<Quote, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of the financial instrument - Useful for verifying its identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmPreviousClosingPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Quote obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(Quote obj, SecuritiesPricing value) {
			obj.setPreviousClosingPrice(value);
		}
	};
	protected SecuritiesPricing requestedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRequestedPriceRelatedQuote
	 * SecuritiesPricing.mmRequestedPriceRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesPricing> mmRequestedPrice = new MMBusinessAssociationEnd<Quote, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPrice";
			definition = "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmRequestedPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Quote obj) {
			return obj.getRequestedPrice();
		}

		@Override
		public void setValue(Quote obj, SecuritiesPricing value) {
			obj.setRequestedPrice(value);
		}
	};
	protected SecuritiesPricing price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceRelatedQuote
	 * SecuritiesPricing.mmPriceRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 44</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price of the instrument, applicable to the quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesPricing> mmPrice = new MMBusinessAssociationEnd<Quote, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "44"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Quote obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(Quote obj, SecuritiesPricing value) {
			obj.setPrice(value);
		}
	};
	protected SecuritiesPricing marketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMarketPriceRelatedQuote
	 * SecuritiesPricing.mmMarketPriceRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 645, FIXSynonym: 646</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used by markets to indicate the current best bid and offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesPricing> mmMarketPrice = new MMBusinessAssociationEnd<Quote, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "645"), new FIXSynonym(this, "646"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Used by markets to indicate the current best bid and offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmMarketPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Quote obj) {
			return obj.getMarketPrice();
		}

		@Override
		public void setValue(Quote obj, SecuritiesPricing value) {
			obj.setMarketPrice(value);
		}
	};
	protected SecuritiesQuoteVariable midSideQuoteVariable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmMidSide
	 * SecuritiesQuoteVariable.mmMidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidSideQuoteVariable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote details for which mid information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable> mmMidSideQuoteVariable = new MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MidSideQuoteVariable";
			definition = "Quote details for which mid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuoteVariable.mmMidSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}

		@Override
		public SecuritiesQuoteVariable getValue(Quote obj) {
			return obj.getMidSideQuoteVariable();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuoteVariable value) {
			obj.setMidSideQuoteVariable(value);
		}
	};
	protected SecuritiesQuoteVariable bidSideQuoteVariable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmBidSide
	 * SecuritiesQuoteVariable.mmBidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidSideQuoteVariable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote details for which bid information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable> mmBidSideQuoteVariable = new MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidSideQuoteVariable";
			definition = "Quote details for which bid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuoteVariable.mmBidSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}

		@Override
		public SecuritiesQuoteVariable getValue(Quote obj) {
			return obj.getBidSideQuoteVariable();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuoteVariable value) {
			obj.setBidSideQuoteVariable(value);
		}
	};
	protected SecuritiesQuoteVariable offerSideQuoteVariable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmOfferSide
	 * SecuritiesQuoteVariable.mmOfferSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferSideQuoteVariable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote details for which offer information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable> mmOfferSideQuoteVariable = new MMBusinessAssociationEnd<Quote, SecuritiesQuoteVariable>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferSideQuoteVariable";
			definition = "Quote details for which offer information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuoteVariable.mmOfferSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}

		@Override
		public SecuritiesQuoteVariable getValue(Quote obj) {
			return obj.getOfferSideQuoteVariable();
		}

		@Override
		public void setValue(Quote obj, SecuritiesQuoteVariable value) {
			obj.setOfferSideQuoteVariable(value);
		}
	};
	protected SecuritiesQuoteVariable securityQuoteVariable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmRelatedQuote
	 * SecuritiesQuoteVariable.mmRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityQuoteVariable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposition of price for a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, Optional<SecuritiesQuoteVariable>> mmSecurityQuoteVariable = new MMBusinessAssociationEnd<Quote, Optional<SecuritiesQuoteVariable>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityQuoteVariable";
			definition = "Proposition of price for a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuoteVariable.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}

		@Override
		public Optional<SecuritiesQuoteVariable> getValue(Quote obj) {
			return obj.getSecurityQuoteVariable();
		}

		@Override
		public void setValue(Quote obj, Optional<SecuritiesQuoteVariable> value) {
			obj.setSecurityQuoteVariable(value.orElse(null));
		}
	};
	protected FinancialInstrumentSwap quoteSwap;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmRelatedQuote
	 * FinancialInstrumentSwap.mmRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics and conditions, quoted by the seller, by which a borrower can exchange one type of fund for another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, FinancialInstrumentSwap> mmQuoteSwap = new MMBusinessAssociationEnd<Quote, FinancialInstrumentSwap>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteSwap";
			definition = "Characteristics and conditions, quoted by the seller, by which a borrower can exchange one type of fund for another.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialInstrumentSwap.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}

		@Override
		public FinancialInstrumentSwap getValue(Quote obj) {
			return obj.getQuoteSwap();
		}

		@Override
		public void setValue(Quote obj, FinancialInstrumentSwap value) {
			obj.setQuoteSwap(value);
		}
	};
	protected ISODateTime validUntilDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 126</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidUntilDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expresses the validity date and time of the Quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Quote, ISODateTime> mmValidUntilDateTime = new MMBusinessAttribute<Quote, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "126"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Quote obj) {
			return obj.getValidUntilDateTime();
		}

		@Override
		public void setValue(Quote obj, ISODateTime value) {
			obj.setValidUntilDateTime(value);
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Quote, CurrencyCode> mmCurrency = new MMBusinessAttribute<Quote, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Quote obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Quote obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected QuoteStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuoteStatus#mmRelatedQuote
	 * QuoteStatus.mmRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuoteStatus
	 * QuoteStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provide the status for the quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, QuoteStatus> mmStatus = new MMBusinessAssociationEnd<Quote, QuoteStatus>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Provide the status for the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> QuoteStatus.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> QuoteStatus.mmObject();
		}

		@Override
		public QuoteStatus getValue(Quote obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Quote obj, QuoteStatus value) {
			obj.setStatus(value);
		}
	};
	protected Security quotedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmQuote
	 * Security.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quote
	 * Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security specified in a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Quote, Security> mmQuotedSecurity = new MMBusinessAssociationEnd<Quote, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedSecurity";
			definition = "Security specified in a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Quote obj) {
			return obj.getQuotedSecurity();
		}

		@Override
		public void setValue(Quote obj, Security value) {
			obj.setQuotedSecurity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quote";
				definition = "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).";
				associationDomain_lazy = () -> Arrays.asList(Security.mmQuote, InformationPartyRole.mmQuote, SecuritiesPricing.mmPreviousClosingPriceRelatedQuote, SecuritiesPricing.mmRequestedPriceRelatedQuote,
						SecuritiesPricing.mmPriceRelatedQuote, SecuritiesPricing.mmMarketPriceRelatedQuote, SecuritiesQuantity.mmMaximumQuantityRelatedQuote, SecuritiesQuantity.mmQuantityRelatedQuote,
						SecuritiesQuantity.mmMinimumQuantityRelatedQuote, CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote, Negotiation.mmQuote, QuoteStatus.mmRelatedQuote, FinancialInstrumentSwap.mmRelatedQuote,
						SecuritiesQuoteVariable.mmMidSide, SecuritiesQuoteVariable.mmBidSide, SecuritiesQuoteVariable.mmOfferSide, SecuritiesQuoteVariable.mmRelatedQuote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Quote.mmMaximumQuantity, com.tools20022.repository.entity.Quote.mmQuantity, com.tools20022.repository.entity.Quote.mmMinimumQuantity,
						com.tools20022.repository.entity.Quote.mmPartyRole, com.tools20022.repository.entity.Quote.mmRelatedNegotiation, com.tools20022.repository.entity.Quote.mmQuotedRate,
						com.tools20022.repository.entity.Quote.mmPreviousClosingPrice, com.tools20022.repository.entity.Quote.mmRequestedPrice, com.tools20022.repository.entity.Quote.mmPrice,
						com.tools20022.repository.entity.Quote.mmMarketPrice, com.tools20022.repository.entity.Quote.mmMidSideQuoteVariable, com.tools20022.repository.entity.Quote.mmBidSideQuoteVariable,
						com.tools20022.repository.entity.Quote.mmOfferSideQuoteVariable, com.tools20022.repository.entity.Quote.mmSecurityQuoteVariable, com.tools20022.repository.entity.Quote.mmQuoteSwap,
						com.tools20022.repository.entity.Quote.mmValidUntilDateTime, com.tools20022.repository.entity.Quote.mmCurrency, com.tools20022.repository.entity.Quote.mmStatus,
						com.tools20022.repository.entity.Quote.mmQuotedSecurity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Quote.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getMaximumQuantity() {
		return maximumQuantity;
	}

	public Quote setMaximumQuantity(SecuritiesQuantity maximumQuantity) {
		this.maximumQuantity = Objects.requireNonNull(maximumQuantity);
		return this;
	}

	public SecuritiesQuantity getQuantity() {
		return quantity;
	}

	public Quote setQuantity(SecuritiesQuantity quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public Quote setMinimumQuantity(SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = Objects.requireNonNull(minimumQuantity);
		return this;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Quote setPartyRole(List<InformationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<Negotiation> getRelatedNegotiation() {
		return relatedNegotiation == null ? Optional.empty() : Optional.of(relatedNegotiation);
	}

	public Quote setRelatedNegotiation(Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
		return this;
	}

	public List<CurrencyExchange> getQuotedRate() {
		return quotedRate == null ? quotedRate = new ArrayList<>() : quotedRate;
	}

	public Quote setQuotedRate(List<CurrencyExchange> quotedRate) {
		this.quotedRate = Objects.requireNonNull(quotedRate);
		return this;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public Quote setPreviousClosingPrice(SecuritiesPricing previousClosingPrice) {
		this.previousClosingPrice = Objects.requireNonNull(previousClosingPrice);
		return this;
	}

	public SecuritiesPricing getRequestedPrice() {
		return requestedPrice;
	}

	public Quote setRequestedPrice(SecuritiesPricing requestedPrice) {
		this.requestedPrice = Objects.requireNonNull(requestedPrice);
		return this;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public Quote setPrice(SecuritiesPricing price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public SecuritiesPricing getMarketPrice() {
		return marketPrice;
	}

	public Quote setMarketPrice(SecuritiesPricing marketPrice) {
		this.marketPrice = Objects.requireNonNull(marketPrice);
		return this;
	}

	public SecuritiesQuoteVariable getMidSideQuoteVariable() {
		return midSideQuoteVariable;
	}

	public Quote setMidSideQuoteVariable(SecuritiesQuoteVariable midSideQuoteVariable) {
		this.midSideQuoteVariable = Objects.requireNonNull(midSideQuoteVariable);
		return this;
	}

	public SecuritiesQuoteVariable getBidSideQuoteVariable() {
		return bidSideQuoteVariable;
	}

	public Quote setBidSideQuoteVariable(SecuritiesQuoteVariable bidSideQuoteVariable) {
		this.bidSideQuoteVariable = Objects.requireNonNull(bidSideQuoteVariable);
		return this;
	}

	public SecuritiesQuoteVariable getOfferSideQuoteVariable() {
		return offerSideQuoteVariable;
	}

	public Quote setOfferSideQuoteVariable(SecuritiesQuoteVariable offerSideQuoteVariable) {
		this.offerSideQuoteVariable = Objects.requireNonNull(offerSideQuoteVariable);
		return this;
	}

	public Optional<SecuritiesQuoteVariable> getSecurityQuoteVariable() {
		return securityQuoteVariable == null ? Optional.empty() : Optional.of(securityQuoteVariable);
	}

	public Quote setSecurityQuoteVariable(SecuritiesQuoteVariable securityQuoteVariable) {
		this.securityQuoteVariable = securityQuoteVariable;
		return this;
	}

	public FinancialInstrumentSwap getQuoteSwap() {
		return quoteSwap;
	}

	public Quote setQuoteSwap(FinancialInstrumentSwap quoteSwap) {
		this.quoteSwap = Objects.requireNonNull(quoteSwap);
		return this;
	}

	public ISODateTime getValidUntilDateTime() {
		return validUntilDateTime;
	}

	public Quote setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = Objects.requireNonNull(validUntilDateTime);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Quote setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public QuoteStatus getStatus() {
		return status;
	}

	public Quote setStatus(QuoteStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Security getQuotedSecurity() {
		return quotedSecurity;
	}

	public Quote setQuotedSecurity(Security quotedSecurity) {
		this.quotedSecurity = Objects.requireNonNull(quotedSecurity);
		return this;
	}
}