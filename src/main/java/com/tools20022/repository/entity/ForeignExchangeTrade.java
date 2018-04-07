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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
 * ForeignExchangeTrade.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmTypeOfProduct
 * ForeignExchangeTrade.mmTypeOfProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmBuyAmount
 * ForeignExchangeTrade.mmBuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmSellAmount
 * ForeignExchangeTrade.mmSellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
 * ForeignExchangeTrade.mmResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmOpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedSwap
 * ForeignExchangeTrade.mmRelatedSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedOption
 * ForeignExchangeTrade.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmExchangeForwardPoint
 * ForeignExchangeTrade.mmExchangeForwardPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
 * PaymentObligation.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
 * TaxVoucher.mmForeignExchangeTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmSwapLeg
 * ForeignExchangeSwap.mmSwapLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmOpeningLeg
 * NonDeliverableTrade.mmOpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmClosingLeg
 * NonDeliverableTrade.mmClosingLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmExercisedOption
 * CurrencyOption.mmExercisedOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.NonDeliverableTrade
 * NonDeliverableTrade}</li>
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
 * "ForeignExchangeTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties in which one party buys a currency and the other party sells a different currency."
 * </li>
 * </ul>
 */
public class ForeignExchangeTrade extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyExchange agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
	 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, CurrencyExchange> mmAgreedRate = new MMBusinessAssociationEnd<ForeignExchangeTrade, CurrencyExchange>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public CurrencyExchange getValue(ForeignExchangeTrade obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, CurrencyExchange value) {
			obj.setAgreedRate(value);
		}
	};
	protected Max35Text typeOfProduct;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ForeignExchangeTrade, Max35Text> mmTypeOfProduct = new MMBusinessAttribute<ForeignExchangeTrade, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfProduct";
			definition = "Specifies the type of trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ForeignExchangeTrade obj) {
			return obj.getTypeOfProduct();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Max35Text value) {
			obj.setTypeOfProduct(value);
		}
	};
	protected CurrencyAndAmount buyAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ForeignExchangeTrade, CurrencyAndAmount> mmBuyAmount = new MMBusinessAttribute<ForeignExchangeTrade, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ForeignExchangeTrade obj) {
			return obj.getBuyAmount();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, CurrencyAndAmount value) {
			obj.setBuyAmount(value);
		}
	};
	protected CurrencyAndAmount sellAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ForeignExchangeTrade, CurrencyAndAmount> mmSellAmount = new MMBusinessAttribute<ForeignExchangeTrade, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ForeignExchangeTrade obj) {
			return obj.getSellAmount();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, CurrencyAndAmount value) {
			obj.setSellAmount(value);
		}
	};
	protected List<PaymentObligation> resultingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
	 * PaymentObligation.mmExchangeRateInformation}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, List<PaymentObligation>> mmResultingSettlement = new MMBusinessAssociationEnd<ForeignExchangeTrade, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingSettlement";
			definition = "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmExchangeRateInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(ForeignExchangeTrade obj) {
			return obj.getResultingSettlement();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, List<PaymentObligation> value) {
			obj.setResultingSettlement(value);
		}
	};
	protected SecuritiesSettlement currencyExchangeForSecuritiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
	 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<SecuritiesSettlement>> mmCurrencyExchangeForSecuritiesSettlement = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<SecuritiesSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesSettlement";
			definition = "Securities settlement process for which a currency exchange is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlement.mmRelatedForeignExchangeOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement> getValue(ForeignExchangeTrade obj) {
			return obj.getCurrencyExchangeForSecuritiesSettlement();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<SecuritiesSettlement> value) {
			obj.setCurrencyExchangeForSecuritiesSettlement(value.orElse(null));
		}
	};
	protected NonDeliverableTrade openingLegRelatedNonDeliverableTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmOpeningLeg
	 * NonDeliverableTrade.mmOpeningLeg}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<NonDeliverableTrade>> mmOpeningLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<NonDeliverableTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which an opening closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> NonDeliverableTrade.mmOpeningLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NonDeliverableTrade.mmObject();
		}

		@Override
		public Optional<NonDeliverableTrade> getValue(ForeignExchangeTrade obj) {
			return obj.getOpeningLegRelatedNonDeliverableTrade();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<NonDeliverableTrade> value) {
			obj.setOpeningLegRelatedNonDeliverableTrade(value.orElse(null));
		}
	};
	protected NonDeliverableTrade closingLegRelatedNonDeliverableTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmClosingLeg
	 * NonDeliverableTrade.mmClosingLeg}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<NonDeliverableTrade>> mmClosingLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<NonDeliverableTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> NonDeliverableTrade.mmClosingLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NonDeliverableTrade.mmObject();
		}

		@Override
		public Optional<NonDeliverableTrade> getValue(ForeignExchangeTrade obj) {
			return obj.getClosingLegRelatedNonDeliverableTrade();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<NonDeliverableTrade> value) {
			obj.setClosingLegRelatedNonDeliverableTrade(value.orElse(null));
		}
	};
	protected ForeignExchangeSwap relatedSwap;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmSwapLeg
	 * ForeignExchangeSwap.mmSwapLeg}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<ForeignExchangeSwap>> mmRelatedSwap = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<ForeignExchangeSwap>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSwap";
			definition = "FX swap for which the FX trade is one leg.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeSwap.mmSwapLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeSwap.mmObject();
		}

		@Override
		public Optional<ForeignExchangeSwap> getValue(ForeignExchangeTrade obj) {
			return obj.getRelatedSwap();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<ForeignExchangeSwap> value) {
			obj.setRelatedSwap(value.orElse(null));
		}
	};
	protected CurrencyOption relatedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmExercisedOption
	 * CurrencyOption.mmExercisedOption}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<CurrencyOption>> mmRelatedOption = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<CurrencyOption>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option which is executed by one (or more) FX trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CurrencyOption.mmExercisedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyOption.mmObject();
		}

		@Override
		public Optional<CurrencyOption> getValue(ForeignExchangeTrade obj) {
			return obj.getRelatedOption();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<CurrencyOption> value) {
			obj.setRelatedOption(value.orElse(null));
		}
	};
	protected TaxVoucher currencyExchangeForTaxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
	 * TaxVoucher.mmForeignExchangeTransaction}</li>
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
	public static final MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<TaxVoucher>> mmCurrencyExchangeForTaxVoucher = new MMBusinessAssociationEnd<ForeignExchangeTrade, Optional<TaxVoucher>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTaxVoucher";
			definition = "Tax voucher for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TaxVoucher.mmForeignExchangeTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxVoucher.mmObject();
		}

		@Override
		public Optional<TaxVoucher> getValue(ForeignExchangeTrade obj) {
			return obj.getCurrencyExchangeForTaxVoucher();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<TaxVoucher> value) {
			obj.setCurrencyExchangeForTaxVoucher(value.orElse(null));
		}
	};
	protected DecimalNumber exchangeForwardPoint;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ForeignExchangeTrade, Optional<DecimalNumber>> mmExchangeForwardPoint = new MMBusinessAttribute<ForeignExchangeTrade, Optional<DecimalNumber>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(ForeignExchangeTrade obj) {
			return obj.getExchangeForwardPoint();
		}

		@Override
		public void setValue(ForeignExchangeTrade obj, Optional<DecimalNumber> value) {
			obj.setExchangeForwardPoint(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTrade";
				definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
				associationDomain_lazy = () -> Arrays.asList(PaymentObligation.mmExchangeRateInformation, SecuritiesSettlement.mmRelatedForeignExchangeOperation, CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade,
						TaxVoucher.mmForeignExchangeTransaction, ForeignExchangeSwap.mmSwapLeg, NonDeliverableTrade.mmOpeningLeg, NonDeliverableTrade.mmClosingLeg, CurrencyOption.mmExercisedOption);
				subType_lazy = () -> Arrays.asList(NonDeliverableTrade.mmObject());
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate, com.tools20022.repository.entity.ForeignExchangeTrade.mmTypeOfProduct,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmBuyAmount, com.tools20022.repository.entity.ForeignExchangeTrade.mmSellAmount, com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedSwap,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedOption, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmExchangeForwardPoint);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyExchange getAgreedRate() {
		return agreedRate;
	}

	public ForeignExchangeTrade setAgreedRate(CurrencyExchange agreedRate) {
		this.agreedRate = Objects.requireNonNull(agreedRate);
		return this;
	}

	public Max35Text getTypeOfProduct() {
		return typeOfProduct;
	}

	public ForeignExchangeTrade setTypeOfProduct(Max35Text typeOfProduct) {
		this.typeOfProduct = Objects.requireNonNull(typeOfProduct);
		return this;
	}

	public CurrencyAndAmount getBuyAmount() {
		return buyAmount;
	}

	public ForeignExchangeTrade setBuyAmount(CurrencyAndAmount buyAmount) {
		this.buyAmount = Objects.requireNonNull(buyAmount);
		return this;
	}

	public CurrencyAndAmount getSellAmount() {
		return sellAmount;
	}

	public ForeignExchangeTrade setSellAmount(CurrencyAndAmount sellAmount) {
		this.sellAmount = Objects.requireNonNull(sellAmount);
		return this;
	}

	public List<PaymentObligation> getResultingSettlement() {
		return resultingSettlement == null ? resultingSettlement = new ArrayList<>() : resultingSettlement;
	}

	public ForeignExchangeTrade setResultingSettlement(List<PaymentObligation> resultingSettlement) {
		this.resultingSettlement = Objects.requireNonNull(resultingSettlement);
		return this;
	}

	public Optional<SecuritiesSettlement> getCurrencyExchangeForSecuritiesSettlement() {
		return currencyExchangeForSecuritiesSettlement == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesSettlement);
	}

	public ForeignExchangeTrade setCurrencyExchangeForSecuritiesSettlement(SecuritiesSettlement currencyExchangeForSecuritiesSettlement) {
		this.currencyExchangeForSecuritiesSettlement = currencyExchangeForSecuritiesSettlement;
		return this;
	}

	public Optional<NonDeliverableTrade> getOpeningLegRelatedNonDeliverableTrade() {
		return openingLegRelatedNonDeliverableTrade == null ? Optional.empty() : Optional.of(openingLegRelatedNonDeliverableTrade);
	}

	public ForeignExchangeTrade setOpeningLegRelatedNonDeliverableTrade(NonDeliverableTrade openingLegRelatedNonDeliverableTrade) {
		this.openingLegRelatedNonDeliverableTrade = openingLegRelatedNonDeliverableTrade;
		return this;
	}

	public Optional<NonDeliverableTrade> getClosingLegRelatedNonDeliverableTrade() {
		return closingLegRelatedNonDeliverableTrade == null ? Optional.empty() : Optional.of(closingLegRelatedNonDeliverableTrade);
	}

	public ForeignExchangeTrade setClosingLegRelatedNonDeliverableTrade(NonDeliverableTrade closingLegRelatedNonDeliverableTrade) {
		this.closingLegRelatedNonDeliverableTrade = closingLegRelatedNonDeliverableTrade;
		return this;
	}

	public Optional<ForeignExchangeSwap> getRelatedSwap() {
		return relatedSwap == null ? Optional.empty() : Optional.of(relatedSwap);
	}

	public ForeignExchangeTrade setRelatedSwap(ForeignExchangeSwap relatedSwap) {
		this.relatedSwap = relatedSwap;
		return this;
	}

	public Optional<CurrencyOption> getRelatedOption() {
		return relatedOption == null ? Optional.empty() : Optional.of(relatedOption);
	}

	public ForeignExchangeTrade setRelatedOption(CurrencyOption relatedOption) {
		this.relatedOption = relatedOption;
		return this;
	}

	public Optional<TaxVoucher> getCurrencyExchangeForTaxVoucher() {
		return currencyExchangeForTaxVoucher == null ? Optional.empty() : Optional.of(currencyExchangeForTaxVoucher);
	}

	public ForeignExchangeTrade setCurrencyExchangeForTaxVoucher(TaxVoucher currencyExchangeForTaxVoucher) {
		this.currencyExchangeForTaxVoucher = currencyExchangeForTaxVoucher;
		return this;
	}

	public Optional<DecimalNumber> getExchangeForwardPoint() {
		return exchangeForwardPoint == null ? Optional.empty() : Optional.of(exchangeForwardPoint);
	}

	public ForeignExchangeTrade setExchangeForwardPoint(DecimalNumber exchangeForwardPoint) {
		this.exchangeForwardPoint = exchangeForwardPoint;
		return this;
	}
}