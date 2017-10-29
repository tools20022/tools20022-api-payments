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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, for example other assets, into or out of an investment fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrder" src="doc-files/InvestmentFundOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#GrossAmountIndicator
 * InvestmentFundOrder.GrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
 * InvestmentFundOrder.RelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderType
 * InvestmentFundOrder.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#GrossAmount
 * InvestmentFundOrder.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
 * InvestmentFundOrder.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#NetAmount
 * InvestmentFundOrder.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderDateTime
 * InvestmentFundOrder.OrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#ExpiryDateTime
 * InvestmentFundOrder.ExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#CancellationRight
 * InvestmentFundOrder.CancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RequestedSettlementCurrency
 * InvestmentFundOrder.RequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RequestedExecutionDateTime
 * InvestmentFundOrder.RequestedExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#FinancialAdvice
 * InvestmentFundOrder.FinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#NegotiatedTrade
 * InvestmentFundOrder.NegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#HoldingsRate
 * InvestmentFundOrder.HoldingsRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderWaiverReason
 * InvestmentFundOrder.OrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InitialOrderIndicator
 * InvestmentFundOrder.InitialOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderBookingDate
 * InvestmentFundOrder.OrderBookingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
 * InvestmentFundOrder.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderStatus
 * InvestmentFundOrder.OrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#TotalAmount
 * InvestmentFundOrder.TotalAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
 * InvestmentPlan.StandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
 * SecuritiesQuantity.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
 * InvestmentFundTransaction.InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
 * InvestmentFundOrderExecution.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#InvestmentFundOrder
 * SecuritiesOrderStatus.InvestmentFundOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
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
 * "InvestmentFundOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an ordered amount is a gross amount (including all
	 * charges, commissions, tax). If it is not a gross amount, the ordered
	 * amount is a net amount (amount to be invested or redeemed from the fund
	 * to which other elements will be added).
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmountIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Transaction which is the source of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
	 * InvestmentFundTransaction.InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is the source of the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransaction";
			definition = "Transaction which is the source of the order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundOrderTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money used to derive the quantity of investment fund units sold
	 * or subscribed, before deduction of charges, commissions, and taxes,
	 * expressed in the currency requested by the investor.<br>
	 * [Quantity * Price] + (Charges + Commissions +Taxes)]
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of investment fund units to be subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
	 * SecuritiesQuantity.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of investment fund units to be subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnitsNumber = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Execution of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
	 * InvestmentFundOrderExecution.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Execution of an investment fund order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money used to determine the quantity of investment fund units
	 * to be subscribed or to be sold.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date and time at which the order was placed by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the order expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the order expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Cancellation right of an investor with respect to an investment fund
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRight = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}
	};
	/**
	 * Currency requested for settlement of cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedSettlementCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Date and time at which the investor requests the order to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the investor requests the order to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDateTime";
			definition = "Date and time at which the investor requests the order to be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies if advice has been received from an independent financial
	 * advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAdvice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAdviceCode.mmObject();
		}
	};
	/**
	 * Specifies whether the trade is negotiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NegotiatedTrade = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NegotiatedTradeCode.mmObject();
		}
	};
	/**
	 * Percentage of the financial quantity to be invested or redeemed.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the financial quantity to be invested or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingsRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsRate";
			definition = "Percentage of the financial quantity to be invested or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Reason why an order has to be handled differently, probably in a manual
	 * fashion, because for example, the investment manager has agreed a waiver
	 * to the extended terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderWaiverReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderWaiverReasonCode.mmObject();
		}
	};
	/**
	 * Indicates whether the subscription order is an initial order.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the subscription order is an initial order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitialOrderIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialOrderIndicator";
			definition = "Indicates whether the subscription order is an initial order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date and time an investment fund order is registered on the books of
	 * either the fund or its designated agent, eg, transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderBookingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Investment plan which triggers the standing orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
	 * InvestmentPlan.StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan which triggers the standing orders."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan which triggers the standing orders.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.StandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#InvestmentFundOrder
	 * SecuritiesOrderStatus.InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Status of an investment fund order.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount subscribed in the current tax year.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount subscribed in the current tax year."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount subscribed in the current tax year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrder";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.StandingOrder, com.tools20022.repository.entity.SecuritiesQuantity.Order,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.Order,
						com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder);
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.GrossAmountIndicator, com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderType, com.tools20022.repository.entity.InvestmentFundOrder.GrossAmount, com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber,
						com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution, com.tools20022.repository.entity.InvestmentFundOrder.NetAmount, com.tools20022.repository.entity.InvestmentFundOrder.OrderDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.ExpiryDateTime, com.tools20022.repository.entity.InvestmentFundOrder.CancellationRight,
						com.tools20022.repository.entity.InvestmentFundOrder.RequestedSettlementCurrency, com.tools20022.repository.entity.InvestmentFundOrder.RequestedExecutionDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.FinancialAdvice, com.tools20022.repository.entity.InvestmentFundOrder.NegotiatedTrade, com.tools20022.repository.entity.InvestmentFundOrder.HoldingsRate,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderWaiverReason, com.tools20022.repository.entity.InvestmentFundOrder.InitialOrderIndicator,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderBookingDate, com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus,
						com.tools20022.repository.entity.InvestmentFundOrder.TotalAmount);
			}
		});
		return mmObject_lazy.get();
	}
}