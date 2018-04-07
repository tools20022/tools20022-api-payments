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
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.LegSwapTypeCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QuoteTypeCode;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.TradingSession;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Proposition of price for a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesQuoteVariable"
 * src="doc-files/SecuritiesQuoteVariable.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQualifier
 * SecuritiesQuoteVariable.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmType
 * SecuritiesQuoteVariable.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmLegSwapType
 * SecuritiesQuoteVariable.mmLegSwapType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmPriceType
 * SecuritiesQuoteVariable.mmPriceType}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
 * SecuritiesQuoteVariable.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmRelatedQuote
 * Commission.mmRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
 * SecuritiesOrder.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmQuote
 * TradingSession.mmQuote}</li>
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
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=Price at which a
 * financial instrument is bid or offered. Proposition of a price.</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesQuoteVariable"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * </ul>
 */
public class SecuritiesQuoteVariable {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected QualifierCode qualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesQuoteVariable, QualifierCode> mmQualifier = new MMBusinessAttribute<SecuritiesQuoteVariable, QualifierCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}

		@Override
		public QualifierCode getValue(SecuritiesQuoteVariable obj) {
			return obj.getQualifier();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, QualifierCode value) {
			obj.setQualifier(value);
		}
	};
	protected QuoteTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 537</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesQuoteVariable, QuoteTypeCode> mmType = new MMBusinessAttribute<SecuritiesQuoteVariable, QuoteTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "537"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteTypeCode.mmObject();
		}

		@Override
		public QuoteTypeCode getValue(SecuritiesQuoteVariable obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, QuoteTypeCode value) {
			obj.setType(value);
		}
	};
	protected TradingSession quoteTradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmQuote
	 * TradingSession.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a specific trading session associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, TradingSession> mmQuoteTradingSession = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, TradingSession>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteTradingSession";
			definition = "Details of a specific trading session associated with a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingSession.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}

		@Override
		public TradingSession getValue(SecuritiesQuoteVariable obj) {
			return obj.getQuoteTradingSession();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, TradingSession value) {
			obj.setQuoteTradingSession(value);
		}
	};
	protected LegSwapTypeCode legSwapType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSwapType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesQuoteVariable, LegSwapTypeCode> mmLegSwapType = new MMBusinessAttribute<SecuritiesQuoteVariable, LegSwapTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegSwapType";
			definition = "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegSwapTypeCode.mmObject();
		}

		@Override
		public LegSwapTypeCode getValue(SecuritiesQuoteVariable obj) {
			return obj.getLegSwapType();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, LegSwapTypeCode value) {
			obj.setLegSwapType(value);
		}
	};
	protected PriceValueTypeCode priceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesQuoteVariable, PriceValueTypeCode> mmPriceType = new MMBusinessAttribute<SecuritiesQuoteVariable, PriceValueTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}

		@Override
		public PriceValueTypeCode getValue(SecuritiesQuoteVariable obj) {
			return obj.getPriceType();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, PriceValueTypeCode value) {
			obj.setPriceType(value);
		}
	};
	protected Quote midSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMidSideQuoteVariable
	 * Quote.mmMidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote> mmMidSide = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MidSide";
			definition = "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmMidSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuoteVariable obj) {
			return obj.getMidSide();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, Quote value) {
			obj.setMidSide(value);
		}
	};
	protected Quote bidSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmBidSideQuoteVariable
	 * Quote.mmBidSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a bid of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote> mmBidSide = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidSide";
			definition = "Indicates that the quote details are indicated as a bid of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmBidSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuoteVariable obj) {
			return obj.getBidSide();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, Quote value) {
			obj.setBidSide(value);
		}
	};
	protected Quote offerSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmOfferSideQuoteVariable
	 * Quote.mmOfferSideQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as an offer of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote> mmOfferSide = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferSide";
			definition = "Indicates that the quote details are indicated as an offer of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmOfferSideQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuoteVariable obj) {
			return obj.getOfferSide();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, Quote value) {
			obj.setOfferSide(value);
		}
	};
	protected Quote relatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmSecurityQuoteVariable
	 * Quote.mmSecurityQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote parameters related to a security quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote> mmRelatedQuote = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, Quote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote parameters related to a security quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Quote.mmSecurityQuoteVariable;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Quote getValue(SecuritiesQuoteVariable obj) {
			return obj.getRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, Quote value) {
			obj.setRelatedQuote(value);
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
	 * SecuritiesOrder.mmQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Preliminary information on conditions of the order, specified in the quote (request)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, SecuritiesOrder> mmSecuritiesOrder = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, SecuritiesOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Preliminary information on conditions of the order, specified in the quote (request).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrder.mmQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public SecuritiesOrder getValue(SecuritiesQuoteVariable obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, SecuritiesOrder value) {
			obj.setSecuritiesOrder(value);
		}
	};
	protected List<Commission> commission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmRelatedQuote
	 * Commission.mmRelatedQuote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission associated with a quote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesQuoteVariable, List<Commission>> mmCommission = new MMBusinessAssociationEnd<SecuritiesQuoteVariable, List<Commission>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a quote.";
			minOccurs = 0;
			opposite_lazy = () -> Commission.mmRelatedQuote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Commission.mmObject();
		}

		@Override
		public List<Commission> getValue(SecuritiesQuoteVariable obj) {
			return obj.getCommission();
		}

		@Override
		public void setValue(SecuritiesQuoteVariable obj, List<Commission> value) {
			obj.setCommission(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Price at which a financial instrument is bid or offered. Proposition of a price."}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuoteVariable";
				definition = "Proposition of price for a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(Commission.mmRelatedQuote, SecuritiesOrder.mmQuote, TradingSession.mmQuote, Quote.mmMidSideQuoteVariable, Quote.mmBidSideQuoteVariable, Quote.mmOfferSideQuoteVariable,
						Quote.mmSecurityQuoteVariable);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuoteVariable.mmQualifier, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmType,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmQuoteTradingSession, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmLegSwapType,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmPriceType, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmMidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmBidSide,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmOfferSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmCommission);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesQuoteVariable.class;
			}
		});
		return mmObject_lazy.get();
	}

	public QualifierCode getQualifier() {
		return qualifier;
	}

	public SecuritiesQuoteVariable setQualifier(QualifierCode qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public QuoteTypeCode getType() {
		return type;
	}

	public SecuritiesQuoteVariable setType(QuoteTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public TradingSession getQuoteTradingSession() {
		return quoteTradingSession;
	}

	public SecuritiesQuoteVariable setQuoteTradingSession(TradingSession quoteTradingSession) {
		this.quoteTradingSession = Objects.requireNonNull(quoteTradingSession);
		return this;
	}

	public LegSwapTypeCode getLegSwapType() {
		return legSwapType;
	}

	public SecuritiesQuoteVariable setLegSwapType(LegSwapTypeCode legSwapType) {
		this.legSwapType = Objects.requireNonNull(legSwapType);
		return this;
	}

	public PriceValueTypeCode getPriceType() {
		return priceType;
	}

	public SecuritiesQuoteVariable setPriceType(PriceValueTypeCode priceType) {
		this.priceType = Objects.requireNonNull(priceType);
		return this;
	}

	public Quote getMidSide() {
		return midSide;
	}

	public SecuritiesQuoteVariable setMidSide(Quote midSide) {
		this.midSide = Objects.requireNonNull(midSide);
		return this;
	}

	public Quote getBidSide() {
		return bidSide;
	}

	public SecuritiesQuoteVariable setBidSide(Quote bidSide) {
		this.bidSide = Objects.requireNonNull(bidSide);
		return this;
	}

	public Quote getOfferSide() {
		return offerSide;
	}

	public SecuritiesQuoteVariable setOfferSide(Quote offerSide) {
		this.offerSide = Objects.requireNonNull(offerSide);
		return this;
	}

	public Quote getRelatedQuote() {
		return relatedQuote;
	}

	public SecuritiesQuoteVariable setRelatedQuote(Quote relatedQuote) {
		this.relatedQuote = Objects.requireNonNull(relatedQuote);
		return this;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public SecuritiesQuoteVariable setSecuritiesOrder(SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}

	public List<Commission> getCommission() {
		return commission == null ? commission = new ArrayList<>() : commission;
	}

	public SecuritiesQuoteVariable setCommission(List<Commission> commission) {
		this.commission = Objects.requireNonNull(commission);
		return this;
	}
}