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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between two parties in which one party buys a currency and the
 * other party sells a different currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ForeignExchangeTrade" src="doc-files/ForeignExchangeTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
 * ForeignExchangeTrade.AgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#TypeOfProduct
 * ForeignExchangeTrade.TypeOfProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#BuyAmount
 * ForeignExchangeTrade.BuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#SellAmount
 * ForeignExchangeTrade.SellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
 * ForeignExchangeTrade.ResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#OpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedSwap
 * ForeignExchangeTrade.RelatedSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedOption
 * ForeignExchangeTrade.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.CurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ExchangeForwardPoint
 * ForeignExchangeTrade.ExchangeForwardPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
 * PaymentObligation.ExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ForeignExchangeTransaction
 * TaxVoucher.ForeignExchangeTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#SwapLeg
 * ForeignExchangeSwap.SwapLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#OpeningLeg
 * NonDeliverableTrade.OpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#ClosingLeg
 * NonDeliverableTrade.ClosingLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#ExercisedOption
 * CurrencyOption.ExercisedOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.NonDeliverableTrade
 * NonDeliverableTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
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
 * "ForeignExchangeTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties in which one party buys a currency and the other party sells a different currency."
 * </li>
 * </ul>
 */
public class ForeignExchangeTrade extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange rate between two currencies. The rate is agreed by the trading
	 * parties during the negotiation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
	 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AgreedRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfProduct = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfProduct";
			definition = "Specifies the type of trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency and amount bought in a foreign exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount bought in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuyAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Currency and amount sold in a foreign exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount sold in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SellAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Payment of the settlement amount to the account(s) of the final
	 * beneficiary. A payment may be settled gross, through split amounts at
	 * several agents of the buyer, or netted with several other treasury
	 * agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
	 * PaymentObligation.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ResultingSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingSettlement";
			definition = "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which a currency exchange is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
	 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which a currency exchange is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesSettlement";
			definition = "Securities settlement process for which a currency exchange is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Non deliverable trade for which an opening closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#OpeningLeg
	 * NonDeliverableTrade.OpeningLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegRelatedNonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non deliverable trade for which an opening closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OpeningLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which an opening closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NonDeliverableTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Non deliverable trade for which a closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#ClosingLeg
	 * NonDeliverableTrade.ClosingLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegRelatedNonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non deliverable trade for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosingLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which a closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NonDeliverableTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * FX swap for which the FX trade is one leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#SwapLeg
	 * ForeignExchangeSwap.SwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
	 * ForeignExchangeSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FX swap for which the FX trade is one leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSwap";
			definition = "FX swap for which the FX trade is one leg.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Option which is executed by one (or more) FX trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#ExercisedOption
	 * CurrencyOption.ExercisedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option which is executed by one (or more) FX trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option which is executed by one (or more) FX trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.ExercisedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which currency exchange information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ForeignExchangeTransaction
	 * TaxVoucher.ForeignExchangeTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForTaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax voucher for which currency exchange information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForTaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTaxVoucher";
			definition = "Tax voucher for which currency exchange information is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Difference between the foreign exchange spot rate and the foreign
	 * exchange forward rate expressed in basis points quoted in accordance with
	 * the prevailing market conventions for the currency pair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForwardPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangeForwardPoint = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. ";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTrade";
				definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation, com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade, com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction,
						com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg, com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg,
						com.tools20022.repository.entity.CurrencyOption.ExercisedOption);
				subType_lazy = () -> Arrays.asList(NonDeliverableTrade.mmObject());
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate, com.tools20022.repository.entity.ForeignExchangeTrade.TypeOfProduct,
						com.tools20022.repository.entity.ForeignExchangeTrade.BuyAmount, com.tools20022.repository.entity.ForeignExchangeTrade.SellAmount, com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap,
						com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption, com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.ForeignExchangeTrade.ExchangeForwardPoint);
			}
		});
		return mmObject_lazy.get();
	}
}