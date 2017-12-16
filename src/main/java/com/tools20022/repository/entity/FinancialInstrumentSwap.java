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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Range of time during which a swap is in effect.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMaturity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Maturity";
			definition = "Range of time during which a swap is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmFinancialInstrumentSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected SecuritiesSwapLeg spotSell;
	/**
	 * Details of the spot leg of the sell-side of a swap.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSpotSell = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotSell";
			definition = "Details of the spot leg of the sell-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotSellSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
		}
	};
	protected SecuritiesSwapLeg spotBuy;
	/**
	 * Details of the spot leg of the buy-side of a swap.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSpotBuy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpotBuy";
			definition = "Details of the spot leg of the buy-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotBuySwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
		}
	};
	protected SecuritiesSwapLeg forwardBuyBack;
	/**
	 * Details of the forward leg of a swap that has been sold and is being
	 * returned, ie, bought back.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmForwardBuyBack = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBack";
			definition = "Details of the forward leg of a swap that has been sold and is being returned, ie, bought back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardBuyBackSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
		}
	};
	protected SecuritiesSwapLeg forwardSellBack;
	/**
	 * Details of the forward leg of a swap that has been bought and is being
	 * returned, ie, sold back.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmForwardSellBack = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBack";
			definition = "Details of the forward leg of a swap that has been bought and is being returned, ie, sold back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardSellBackSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.mmObject();
		}
	};
	protected Quote relatedQuote;
	/**
	 * Quote related to a swap.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote related to a swap.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuoteSwap;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected FrequencyCode forwardSellBackFrequency;
	/**
	 * Frequency at which the sold financial instrument is being returned.
	 * <p>
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
	public static final MMBusinessAttribute mmForwardSellBackFrequency = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentSwap.class.getMethod("getForwardSellBackFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode forwardBuyBackFrequency;
	/**
	 * Frequency at which the bought financial instrument is being returned.
	 * <p>
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
	public static final MMBusinessAttribute mmForwardBuyBackFrequency = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentSwap.class.getMethod("getForwardBuyBackFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestComputationMethodCode interestComputation;
	/**
	 * Method used to compute the accrued interest of a financial instrument.
	 * <p>
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
	public static final MMBusinessAttribute mmInterestComputation = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentSwap.class.getMethod("getInterestComputation", new Class[]{});
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
				name = "FinancialInstrumentSwap";
				definition = "Characteristics and conditions by which a borrower can exchange one type of financial instrument for another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmFinancialInstrumentSwap, com.tools20022.repository.entity.Quote.mmQuoteSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotSellSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.mmSpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardBuyBackSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.mmForwardSellBackSwap);
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

	public void setMaturity(com.tools20022.repository.entity.DateTimePeriod maturity) {
		this.maturity = maturity;
	}

	public SecuritiesSwapLeg getSpotSell() {
		return spotSell;
	}

	public void setSpotSell(com.tools20022.repository.entity.SecuritiesSwapLeg spotSell) {
		this.spotSell = spotSell;
	}

	public SecuritiesSwapLeg getSpotBuy() {
		return spotBuy;
	}

	public void setSpotBuy(com.tools20022.repository.entity.SecuritiesSwapLeg spotBuy) {
		this.spotBuy = spotBuy;
	}

	public SecuritiesSwapLeg getForwardBuyBack() {
		return forwardBuyBack;
	}

	public void setForwardBuyBack(com.tools20022.repository.entity.SecuritiesSwapLeg forwardBuyBack) {
		this.forwardBuyBack = forwardBuyBack;
	}

	public SecuritiesSwapLeg getForwardSellBack() {
		return forwardSellBack;
	}

	public void setForwardSellBack(com.tools20022.repository.entity.SecuritiesSwapLeg forwardSellBack) {
		this.forwardSellBack = forwardSellBack;
	}

	public Quote getRelatedQuote() {
		return relatedQuote;
	}

	public void setRelatedQuote(com.tools20022.repository.entity.Quote relatedQuote) {
		this.relatedQuote = relatedQuote;
	}

	public FrequencyCode getForwardSellBackFrequency() {
		return forwardSellBackFrequency;
	}

	public void setForwardSellBackFrequency(FrequencyCode forwardSellBackFrequency) {
		this.forwardSellBackFrequency = forwardSellBackFrequency;
	}

	public FrequencyCode getForwardBuyBackFrequency() {
		return forwardBuyBackFrequency;
	}

	public void setForwardBuyBackFrequency(FrequencyCode forwardBuyBackFrequency) {
		this.forwardBuyBackFrequency = forwardBuyBackFrequency;
	}

	public InterestComputationMethodCode getInterestComputation() {
		return interestComputation;
	}

	public void setInterestComputation(InterestComputationMethodCode interestComputation) {
		this.interestComputation = interestComputation;
	}
}