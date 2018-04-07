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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InterestComputationMethodCode;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.entity.SecuritiesSwapLeg;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Characteristics and conditions by which a borrower can exchange one type of
 * financial instrument for another.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialInstrumentSwap"
 * src="doc-files/FinancialInstrumentSwap.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmMaturity
 * FinancialInstrumentSwap.mmMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotSell
 * FinancialInstrumentSwap.mmSpotSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmSpotBuy
 * FinancialInstrumentSwap.mmSpotBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardBuyBack
 * FinancialInstrumentSwap.mmForwardBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardSellBack
 * FinancialInstrumentSwap.mmForwardSellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmRelatedQuote
 * FinancialInstrumentSwap.mmRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardSellBackFrequency
 * FinancialInstrumentSwap.mmForwardSellBackFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmForwardBuyBackFrequency
 * FinancialInstrumentSwap.mmForwardBuyBackFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmInterestComputation
 * FinancialInstrumentSwap.mmInterestComputation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFinancialInstrumentSwap
 * DateTimePeriod.mmFinancialInstrumentSwap}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuoteSwap
 * Quote.mmQuoteSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotSellSwap
 * SecuritiesSwapLeg.mmSpotSellSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotBuySwap
 * SecuritiesSwapLeg.mmSpotBuySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardBuyBackSwap
 * SecuritiesSwapLeg.mmForwardBuyBackSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardSellBackSwap
 * SecuritiesSwapLeg.mmForwardSellBackSwap}</li>
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
 * "FinancialInstrumentSwap"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics and conditions by which a borrower can exchange one type of financial instrument for another."
 * </li>
 * </ul>
 */
public class FinancialInstrumentSwap {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod maturity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFinancialInstrumentSwap
	 * DateTimePeriod.mmFinancialInstrumentSwap}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of time during which a swap is in effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, DateTimePeriod> mmMaturity = new MMBusinessAssociationEnd<FinancialInstrumentSwap, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Maturity";
			definition = "Range of time during which a swap is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmFinancialInstrumentSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(FinancialInstrumentSwap obj) {
			return obj.getMaturity();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, DateTimePeriod value) {
			obj.setMaturity(value);
		}
	};
	protected SecuritiesSwapLeg spotSell;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotSellSwap
	 * SecuritiesSwapLeg.mmSpotSellSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpotSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the spot leg of the sell-side of a swap."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg> mmSpotSell = new MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotSell";
			definition = "Details of the spot leg of the sell-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSwapLeg.mmSpotSellSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}

		@Override
		public SecuritiesSwapLeg getValue(FinancialInstrumentSwap obj) {
			return obj.getSpotSell();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, SecuritiesSwapLeg value) {
			obj.setSpotSell(value);
		}
	};
	protected SecuritiesSwapLeg spotBuy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmSpotBuySwap
	 * SecuritiesSwapLeg.mmSpotBuySwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpotBuy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the spot leg of the buy-side of a swap."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg> mmSpotBuy = new MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotBuy";
			definition = "Details of the spot leg of the buy-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSwapLeg.mmSpotBuySwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}

		@Override
		public SecuritiesSwapLeg getValue(FinancialInstrumentSwap obj) {
			return obj.getSpotBuy();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, SecuritiesSwapLeg value) {
			obj.setSpotBuy(value);
		}
	};
	protected SecuritiesSwapLeg forwardBuyBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardBuyBackSwap
	 * SecuritiesSwapLeg.mmForwardBuyBackSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the forward leg of a swap that has been sold and is being returned, ie, bought back."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg> mmForwardBuyBack = new MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBack";
			definition = "Details of the forward leg of a swap that has been sold and is being returned, ie, bought back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSwapLeg.mmForwardBuyBackSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}

		@Override
		public SecuritiesSwapLeg getValue(FinancialInstrumentSwap obj) {
			return obj.getForwardBuyBack();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, SecuritiesSwapLeg value) {
			obj.setForwardBuyBack(value);
		}
	};
	protected SecuritiesSwapLeg forwardSellBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#mmForwardSellBackSwap
	 * SecuritiesSwapLeg.mmForwardSellBackSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg
	 * SecuritiesSwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardSellBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the forward leg of a swap that has been bought and is being returned, ie, sold back."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg> mmForwardSellBack = new MMBusinessAssociationEnd<FinancialInstrumentSwap, SecuritiesSwapLeg>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBack";
			definition = "Details of the forward leg of a swap that has been bought and is being returned, ie, sold back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSwapLeg.mmForwardSellBackSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}

		@Override
		public SecuritiesSwapLeg getValue(FinancialInstrumentSwap obj) {
			return obj.getForwardSellBack();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, SecuritiesSwapLeg value) {
			obj.setForwardSellBack(value);
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
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuoteSwap
	 * Quote.mmQuoteSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote related to a swap."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FinancialInstrumentSwap, Optional<Quote>> mmRelatedQuote = new MMBusinessAssociationEnd<FinancialInstrumentSwap, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote related to a swap.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmQuoteSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(FinancialInstrumentSwap obj) {
			return obj.getRelatedQuote();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, Optional<Quote> value) {
			obj.setRelatedQuote(value.orElse(null));
		}
	};
	protected FrequencyCode forwardSellBackFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardSellBackFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency at which the sold financial instrument is being returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FinancialInstrumentSwap, FrequencyCode> mmForwardSellBackFrequency = new MMBusinessAttribute<FinancialInstrumentSwap, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackFrequency";
			definition = "Frequency at which the sold financial instrument is being returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(FinancialInstrumentSwap obj) {
			return obj.getForwardSellBackFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, FrequencyCode value) {
			obj.setForwardSellBackFrequency(value);
		}
	};
	protected FrequencyCode forwardBuyBackFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBuyBackFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency at which the bought financial instrument is being returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FinancialInstrumentSwap, FrequencyCode> mmForwardBuyBackFrequency = new MMBusinessAttribute<FinancialInstrumentSwap, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackFrequency";
			definition = "Frequency at which the bought financial instrument is being returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(FinancialInstrumentSwap obj) {
			return obj.getForwardBuyBackFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, FrequencyCode value) {
			obj.setForwardBuyBackFrequency(value);
		}
	};
	protected InterestComputationMethodCode interestComputation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestComputation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to compute the accrued interest of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FinancialInstrumentSwap, InterestComputationMethodCode> mmInterestComputation = new MMBusinessAttribute<FinancialInstrumentSwap, InterestComputationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestComputation";
			definition = "Method used to compute the accrued interest of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}

		@Override
		public InterestComputationMethodCode getValue(FinancialInstrumentSwap obj) {
			return obj.getInterestComputation();
		}

		@Override
		public void setValue(FinancialInstrumentSwap obj, InterestComputationMethodCode value) {
			obj.setInterestComputation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentSwap";
				definition = "Characteristics and conditions by which a borrower can exchange one type of financial instrument for another.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmFinancialInstrumentSwap, Quote.mmQuoteSwap, SecuritiesSwapLeg.mmSpotSellSwap, SecuritiesSwapLeg.mmSpotBuySwap, SecuritiesSwapLeg.mmForwardBuyBackSwap,
						SecuritiesSwapLeg.mmForwardSellBackSwap);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.mmMaturity, com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotSell,
						com.tools20022.repository.entity.FinancialInstrumentSwap.mmSpotBuy, com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardBuyBack,
						com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardSellBack, com.tools20022.repository.entity.FinancialInstrumentSwap.mmRelatedQuote,
						com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardSellBackFrequency, com.tools20022.repository.entity.FinancialInstrumentSwap.mmForwardBuyBackFrequency,
						com.tools20022.repository.entity.FinancialInstrumentSwap.mmInterestComputation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentSwap.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getMaturity() {
		return maturity;
	}

	public FinancialInstrumentSwap setMaturity(DateTimePeriod maturity) {
		this.maturity = Objects.requireNonNull(maturity);
		return this;
	}

	public SecuritiesSwapLeg getSpotSell() {
		return spotSell;
	}

	public FinancialInstrumentSwap setSpotSell(SecuritiesSwapLeg spotSell) {
		this.spotSell = Objects.requireNonNull(spotSell);
		return this;
	}

	public SecuritiesSwapLeg getSpotBuy() {
		return spotBuy;
	}

	public FinancialInstrumentSwap setSpotBuy(SecuritiesSwapLeg spotBuy) {
		this.spotBuy = Objects.requireNonNull(spotBuy);
		return this;
	}

	public SecuritiesSwapLeg getForwardBuyBack() {
		return forwardBuyBack;
	}

	public FinancialInstrumentSwap setForwardBuyBack(SecuritiesSwapLeg forwardBuyBack) {
		this.forwardBuyBack = Objects.requireNonNull(forwardBuyBack);
		return this;
	}

	public SecuritiesSwapLeg getForwardSellBack() {
		return forwardSellBack;
	}

	public FinancialInstrumentSwap setForwardSellBack(SecuritiesSwapLeg forwardSellBack) {
		this.forwardSellBack = Objects.requireNonNull(forwardSellBack);
		return this;
	}

	public Optional<Quote> getRelatedQuote() {
		return relatedQuote == null ? Optional.empty() : Optional.of(relatedQuote);
	}

	public FinancialInstrumentSwap setRelatedQuote(Quote relatedQuote) {
		this.relatedQuote = relatedQuote;
		return this;
	}

	public FrequencyCode getForwardSellBackFrequency() {
		return forwardSellBackFrequency;
	}

	public FinancialInstrumentSwap setForwardSellBackFrequency(FrequencyCode forwardSellBackFrequency) {
		this.forwardSellBackFrequency = Objects.requireNonNull(forwardSellBackFrequency);
		return this;
	}

	public FrequencyCode getForwardBuyBackFrequency() {
		return forwardBuyBackFrequency;
	}

	public FinancialInstrumentSwap setForwardBuyBackFrequency(FrequencyCode forwardBuyBackFrequency) {
		this.forwardBuyBackFrequency = Objects.requireNonNull(forwardBuyBackFrequency);
		return this;
	}

	public InterestComputationMethodCode getInterestComputation() {
		return interestComputation;
	}

	public FinancialInstrumentSwap setInterestComputation(InterestComputationMethodCode interestComputation) {
		this.interestComputation = Objects.requireNonNull(interestComputation);
		return this;
	}
}