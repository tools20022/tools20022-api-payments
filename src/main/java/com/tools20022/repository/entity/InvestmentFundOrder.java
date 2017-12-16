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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmountIndicator
 * InvestmentFundOrder.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
 * InvestmentFundOrder.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
 * InvestmentFundOrder.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
 * InvestmentFundOrder.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
 * InvestmentFundOrder.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
 * InvestmentFundOrder.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmExpiryDateTime
 * InvestmentFundOrder.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
 * InvestmentFundOrder.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
 * InvestmentFundOrder.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
 * InvestmentFundOrder.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmHoldingsRate
 * InvestmentFundOrder.mmHoldingsRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
 * InvestmentFundOrder.mmOrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInitialOrderIndicator
 * InvestmentFundOrder.mmInitialOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderBookingDate
 * InvestmentFundOrder.mmOrderBookingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentPlan
 * InvestmentFundOrder.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmTotalAmount
 * InvestmentFundOrder.mmTotalAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
 * InvestmentPlan.mmStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
 * SecuritiesQuantity.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
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
 * "InvestmentFundOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator grossAmountIndicator;
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
	public static final MMBusinessAttribute mmGrossAmountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransaction relatedTransaction;
	/**
	 * Transaction which is the source of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
	 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransaction";
			definition = "Transaction which is the source of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected FundOrderTypeCode orderType;
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
	public static final MMBusinessAttribute mmOrderType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundOrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount grossAmount;
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
	public static final MMBusinessAttribute mmGrossAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity unitsNumber;
	/**
	 * Quantity of investment fund units to be subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
	 * SecuritiesQuantity.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmUnitsNumber = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected InvestmentFundOrderExecution investmentFundOrderExecution;
	/**
	 * Execution of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
	 * InvestmentFundOrderExecution.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Execution of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected CurrencyAndAmount netAmount;
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
	public static final MMBusinessAttribute mmNetAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNetAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderDateTime;
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
	public static final MMBusinessAttribute mmOrderDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime expiryDateTime;
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
	public static final MMBusinessAttribute mmExpiryDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getExpiryDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationRightCode cancellationRight;
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
	public static final MMBusinessAttribute mmCancellationRight = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getCancellationRight", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedSettlementCurrency;
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
	public static final MMBusinessAttribute mmRequestedSettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime requestedExecutionDateTime;
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
	public static final MMBusinessAttribute mmRequestedExecutionDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDateTime";
			definition = "Date and time at which the investor requests the order to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedExecutionDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialAdviceCode financialAdvice;
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
	public static final MMBusinessAttribute mmFinancialAdvice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAdviceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getFinancialAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NegotiatedTradeCode negotiatedTrade;
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
	public static final MMBusinessAttribute mmNegotiatedTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NegotiatedTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNegotiatedTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate holdingsRate;
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
	public static final MMBusinessAttribute mmHoldingsRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsRate";
			definition = "Percentage of the financial quantity to be invested or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getHoldingsRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderWaiverReasonCode orderWaiverReason;
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
	public static final MMBusinessAttribute mmOrderWaiverReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderWaiverReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderWaiverReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator initialOrderIndicator;
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
	public static final MMBusinessAttribute mmInitialOrderIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialOrderIndicator";
			definition = "Indicates whether the subscription order is an initial order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getInitialOrderIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderBookingDate;
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
	public static final MMBusinessAttribute mmOrderBookingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderBookingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan which triggers the standing orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
	 * InvestmentPlan.mmStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan which triggers the standing orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus;
	/**
	 * Status of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
	 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
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
	public static final MMBusinessAssociationEnd mmOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Status of an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected CurrencyAndAmount totalAmount;
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
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount subscribed in the current tax year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getTotalAmount", new Class[]{});
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
				name = "InvestmentFundOrder";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmOrder,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder);
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmountIndicator, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderType, com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmount, com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber,
						com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.InvestmentFundOrder.mmNetAmount,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmExpiryDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmCancellationRight,
						com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedSettlementCurrency, com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedExecutionDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.mmFinancialAdvice, com.tools20022.repository.entity.InvestmentFundOrder.mmNegotiatedTrade, com.tools20022.repository.entity.InvestmentFundOrder.mmHoldingsRate,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderWaiverReason, com.tools20022.repository.entity.InvestmentFundOrder.mmInitialOrderIndicator,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderBookingDate, com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus,
						com.tools20022.repository.entity.InvestmentFundOrder.mmTotalAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	public InvestmentFundTransaction getRelatedTransaction() {
		return relatedTransaction;
	}

	public void setRelatedTransaction(com.tools20022.repository.entity.InvestmentFundTransaction relatedTransaction) {
		this.relatedTransaction = relatedTransaction;
	}

	public FundOrderTypeCode getOrderType() {
		return orderType;
	}

	public void setOrderType(FundOrderTypeCode orderType) {
		this.orderType = orderType;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.entity.SecuritiesQuantity unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public InvestmentFundOrderExecution getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(com.tools20022.repository.entity.InvestmentFundOrderExecution investmentFundOrderExecution) {
		this.investmentFundOrderExecution = investmentFundOrderExecution;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public ISODateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public ISODateTime getExpiryDateTime() {
		return expiryDateTime;
	}

	public void setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public void setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = cancellationRight;
	}

	public CurrencyCode getRequestedSettlementCurrency() {
		return requestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(CurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
	}

	public ISODateTime getRequestedExecutionDateTime() {
		return requestedExecutionDateTime;
	}

	public void setRequestedExecutionDateTime(ISODateTime requestedExecutionDateTime) {
		this.requestedExecutionDateTime = requestedExecutionDateTime;
	}

	public FinancialAdviceCode getFinancialAdvice() {
		return financialAdvice;
	}

	public void setFinancialAdvice(FinancialAdviceCode financialAdvice) {
		this.financialAdvice = financialAdvice;
	}

	public NegotiatedTradeCode getNegotiatedTrade() {
		return negotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTradeCode negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
	}

	public PercentageRate getHoldingsRate() {
		return holdingsRate;
	}

	public void setHoldingsRate(PercentageRate holdingsRate) {
		this.holdingsRate = holdingsRate;
	}

	public OrderWaiverReasonCode getOrderWaiverReason() {
		return orderWaiverReason;
	}

	public void setOrderWaiverReason(OrderWaiverReasonCode orderWaiverReason) {
		this.orderWaiverReason = orderWaiverReason;
	}

	public YesNoIndicator getInitialOrderIndicator() {
		return initialOrderIndicator;
	}

	public void setInitialOrderIndicator(YesNoIndicator initialOrderIndicator) {
		this.initialOrderIndicator = initialOrderIndicator;
	}

	public ISODateTime getOrderBookingDate() {
		return orderBookingDate;
	}

	public void setOrderBookingDate(ISODateTime orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public List<SecuritiesOrderStatus> getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus) {
		this.orderStatus = orderStatus;
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}
}