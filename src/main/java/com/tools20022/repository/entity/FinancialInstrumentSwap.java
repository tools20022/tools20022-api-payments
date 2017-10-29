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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InterestComputationMethodCode;
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
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#Maturity
 * FinancialInstrumentSwap.Maturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotSell
 * FinancialInstrumentSwap.SpotSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#SpotBuy
 * FinancialInstrumentSwap.SpotBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardBuyBack
 * FinancialInstrumentSwap.ForwardBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardSellBack
 * FinancialInstrumentSwap.ForwardSellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#RelatedQuote
 * FinancialInstrumentSwap.RelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardSellBackFrequency
 * FinancialInstrumentSwap.ForwardSellBackFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#ForwardBuyBackFrequency
 * FinancialInstrumentSwap.ForwardBuyBackFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#InterestComputation
 * FinancialInstrumentSwap.InterestComputation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#FinancialInstrumentSwap
 * DateTimePeriod.FinancialInstrumentSwap}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#QuoteSwap
 * Quote.QuoteSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotSellSwap
 * SecuritiesSwapLeg.SpotSellSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotBuySwap
 * SecuritiesSwapLeg.SpotBuySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardBuyBackSwap
 * SecuritiesSwapLeg.ForwardBuyBackSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardSellBackSwap
 * SecuritiesSwapLeg.ForwardSellBackSwap}</li>
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
	/**
	 * Range of time during which a swap is in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#FinancialInstrumentSwap
	 * DateTimePeriod.FinancialInstrumentSwap}</li>
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
	public static final MMBusinessAssociationEnd Maturity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Maturity";
			definition = "Range of time during which a swap is in effect.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of the spot leg of the sell-side of a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotSellSwap
	 * SecuritiesSwapLeg.SpotSellSwap}</li>
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
	public static final MMBusinessAssociationEnd SpotSell = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotSell";
			definition = "Details of the spot leg of the sell-side of a swap.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of the spot leg of the buy-side of a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#SpotBuySwap
	 * SecuritiesSwapLeg.SpotBuySwap}</li>
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
	public static final MMBusinessAssociationEnd SpotBuy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotBuy";
			definition = "Details of the spot leg of the buy-side of a swap.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of the forward leg of a swap that has been sold and is being
	 * returned, ie, bought back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardBuyBackSwap
	 * SecuritiesSwapLeg.ForwardBuyBackSwap}</li>
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
	public static final MMBusinessAssociationEnd ForwardBuyBack = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBack";
			definition = "Details of the forward leg of a swap that has been sold and is being returned, ie, bought back.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of the forward leg of a swap that has been bought and is being
	 * returned, ie, sold back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSwapLeg#ForwardSellBackSwap
	 * SecuritiesSwapLeg.ForwardSellBackSwap}</li>
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
	public static final MMBusinessAssociationEnd ForwardSellBack = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBack";
			definition = "Details of the forward leg of a swap that has been bought and is being returned, ie, sold back.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote related to a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#QuoteSwap
	 * Quote.QuoteSwap}</li>
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
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote related to a swap.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuoteSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ForwardSellBackFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackFrequency";
			definition = "Frequency at which the sold financial instrument is being returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ForwardBuyBackFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackFrequency";
			definition = "Frequency at which the bought financial instrument is being returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute InterestComputation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestComputation";
			definition = "Method used to compute the accrued interest of a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentSwap";
				definition = "Characteristics and conditions by which a borrower can exchange one type of financial instrument for another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap, com.tools20022.repository.entity.Quote.QuoteSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity, com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell,
						com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack,
						com.tools20022.repository.entity.FinancialInstrumentSwap.RelatedQuote, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBackFrequency,
						com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBackFrequency, com.tools20022.repository.entity.FinancialInstrumentSwap.InterestComputation);
			}
		});
		return mmObject_lazy.get();
	}
}