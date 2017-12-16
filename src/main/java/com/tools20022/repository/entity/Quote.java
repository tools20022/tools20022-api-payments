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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Specifies the maximum quantity of the financial instrument.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMaximumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Specifies the maximum quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity quantity;
	/**
	 * Quantity of a Financial Instrument.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a Financial Instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * Specifies the minimal quantity of the financial instrument.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Specifies the minimal quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InformationPartyRole> partyRole;
	/**
	 * Specifies each role played by a party in a quotation process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a quotation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * Negotiation process during which quotes are provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process during which quotes are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> quotedRate;
	/**
	 * Exchange rate specified in a quote.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmQuotedRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedRate";
			definition = "Exchange rate specified in a quote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected SecuritiesPricing previousClosingPrice;
	/**
	 * Previous closing price of the financial instrument - Useful for verifying
	 * its identification.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPreviousClosingPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of the financial instrument - Useful for verifying its identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPreviousClosingPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing requestedPrice;
	/**
	 * Is used to specify the desired currency of the quoted price when they
	 * differ from the normal trading currency of the instrument being quote
	 * requested.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRequestedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPrice";
			definition = "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRequestedPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing price;
	/**
	 * Indicates the price of the instrument, applicable to the quote.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing marketPrice;
	/**
	 * Used by markets to indicate the current best bid and offer.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMarketPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Used by markets to indicate the current best bid and offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMarketPriceRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesQuoteVariable midSideQuoteVariable;
	/**
	 * Quote details for which mid information is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMidSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MidSideQuoteVariable";
			definition = "Quote details for which mid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmMidSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected SecuritiesQuoteVariable bidSideQuoteVariable;
	/**
	 * Quote details for which bid information is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBidSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidSideQuoteVariable";
			definition = "Quote details for which bid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmBidSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected SecuritiesQuoteVariable offerSideQuoteVariable;
	/**
	 * Quote details for which offer information is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOfferSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferSideQuoteVariable";
			definition = "Quote details for which offer information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmOfferSide;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected SecuritiesQuoteVariable securityQuoteVariable;
	/**
	 * Proposition of price for a financial instrument.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecurityQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityQuoteVariable";
			definition = "Proposition of price for a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected FinancialInstrumentSwap quoteSwap;
	/**
	 * Characteristics and conditions, quoted by the seller, by which a borrower
	 * can exchange one type of fund for another.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmQuoteSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteSwap";
			definition = "Characteristics and conditions, quoted by the seller, by which a borrower can exchange one type of fund for another.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	protected ISODateTime validUntilDateTime;
	/**
	 * Expresses the validity date and time of the Quote.
	 * <p>
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
	public static final MMBusinessAttribute mmValidUntilDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Quote.class.getMethod("getValidUntilDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currency;
	/**
	 * Can be used to specify the desired currency of the quoted price that may
	 * differ from the normal trading currency of the instrument being quote
	 * requested.
	 * <p>
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Quote.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QuoteStatus status;
	/**
	 * Provide the status for the quote.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Provide the status for the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuoteStatus.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuoteStatus.mmObject();
		}
	};
	protected Security quotedSecurity;
	/**
	 * Security specified in a quote.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmQuotedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedSecurity";
			definition = "Security specified in a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quote";
				definition = "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmQuote, com.tools20022.repository.entity.InformationPartyRole.mmQuote,
						com.tools20022.repository.entity.SecuritiesPricing.mmPreviousClosingPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmRequestedPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmMarketPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.mmQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityRelatedQuote, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.Negotiation.mmQuote, com.tools20022.repository.entity.QuoteStatus.mmRelatedQuote, com.tools20022.repository.entity.FinancialInstrumentSwap.mmRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmMidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmBidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmOfferSide,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmRelatedQuote);
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

	public void setMaximumQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public SecuritiesQuantity getQuantity() {
		return quantity;
	}

	public void setQuantity(com.tools20022.repository.entity.SecuritiesQuantity quantity) {
		this.quantity = quantity;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.InformationPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public Negotiation getRelatedNegotiation() {
		return relatedNegotiation;
	}

	public void setRelatedNegotiation(com.tools20022.repository.entity.Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
	}

	public List<CurrencyExchange> getQuotedRate() {
		return quotedRate;
	}

	public void setQuotedRate(List<com.tools20022.repository.entity.CurrencyExchange> quotedRate) {
		this.quotedRate = quotedRate;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(com.tools20022.repository.entity.SecuritiesPricing previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public SecuritiesPricing getRequestedPrice() {
		return requestedPrice;
	}

	public void setRequestedPrice(com.tools20022.repository.entity.SecuritiesPricing requestedPrice) {
		this.requestedPrice = requestedPrice;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.SecuritiesPricing price) {
		this.price = price;
	}

	public SecuritiesPricing getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(com.tools20022.repository.entity.SecuritiesPricing marketPrice) {
		this.marketPrice = marketPrice;
	}

	public SecuritiesQuoteVariable getMidSideQuoteVariable() {
		return midSideQuoteVariable;
	}

	public void setMidSideQuoteVariable(com.tools20022.repository.entity.SecuritiesQuoteVariable midSideQuoteVariable) {
		this.midSideQuoteVariable = midSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getBidSideQuoteVariable() {
		return bidSideQuoteVariable;
	}

	public void setBidSideQuoteVariable(com.tools20022.repository.entity.SecuritiesQuoteVariable bidSideQuoteVariable) {
		this.bidSideQuoteVariable = bidSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getOfferSideQuoteVariable() {
		return offerSideQuoteVariable;
	}

	public void setOfferSideQuoteVariable(com.tools20022.repository.entity.SecuritiesQuoteVariable offerSideQuoteVariable) {
		this.offerSideQuoteVariable = offerSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getSecurityQuoteVariable() {
		return securityQuoteVariable;
	}

	public void setSecurityQuoteVariable(com.tools20022.repository.entity.SecuritiesQuoteVariable securityQuoteVariable) {
		this.securityQuoteVariable = securityQuoteVariable;
	}

	public FinancialInstrumentSwap getQuoteSwap() {
		return quoteSwap;
	}

	public void setQuoteSwap(com.tools20022.repository.entity.FinancialInstrumentSwap quoteSwap) {
		this.quoteSwap = quoteSwap;
	}

	public ISODateTime getValidUntilDateTime() {
		return validUntilDateTime;
	}

	public void setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public QuoteStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.QuoteStatus status) {
		this.status = status;
	}

	public Security getQuotedSecurity() {
		return quotedSecurity;
	}

	public void setQuotedSecurity(com.tools20022.repository.entity.Security quotedSecurity) {
		this.quotedSecurity = quotedSecurity;
	}
}