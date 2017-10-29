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
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrderExecution"
 * src="doc-files/InvestmentFundOrderExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
 * InvestmentFundOrderExecution.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#NonStandardSettlementInformation
 * InvestmentFundOrderExecution.NonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
 * InvestmentFundOrderExecution.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#DealIdentification
 * InvestmentFundOrderExecution.DealIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartiallyExecutedIndicator
 * InvestmentFundOrderExecution.PartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InterimProfitAmount
 * InvestmentFundOrderExecution.InterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
 * InvestmentFundOrderExecution.InformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#BestExecution
 * InvestmentFundOrderExecution.BestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartialSettlementOfUnits
 * InvestmentFundOrderExecution.PartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartialSettlementOfCash
 * InvestmentFundOrderExecution.PartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#LateReport
 * InvestmentFundOrderExecution.LateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#SettledIndicator
 * InvestmentFundOrderExecution.SettledIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#RegisteredIndicator
 * InvestmentFundOrderExecution.RegisteredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedAmount
 * InvestmentFundOrderExecution.ExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#CashFlow
 * InvestmentFundOrderExecution.CashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#SourceOfCash
 * InvestmentFundOrderExecution.SourceOfCash}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
 * SecuritiesQuantity.RelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FundsCashFlow#RelatedOrder
 * FundsCashFlow.RelatedOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
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
 * "InvestmentFundOrderExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * </ul>
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of investment fund units subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
	 * SecuritiesQuantity.RelatedOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnitsNumber = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonStandardSettlementInformation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
	 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Price at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
	 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedTradePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartiallyExecutedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterimProfitAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Other quoted price than the one at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
	 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InformativePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecutionCode
	 * BestExecutionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BestExecution = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}
	};
	/**
	 * Percentage of units partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementOfUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage of cash partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementOfCash = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies whether the order execution confirmation is late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LateReport = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}
	};
	/**
	 * Indicates whether the cash payment with respect to the executed order is
	 * settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettledIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the executed order has a registered status on the books
	 * of the transfer agent.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegisteredIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money invested or redeemed as a result of an investment fund
	 * order.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money invested or redeemed as a result of an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Transaction which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
	 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cash flow resulting from the execution of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#RelatedOrder
	 * FundsCashFlow.RelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash flow resulting from the execution of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Source of cash used for the settlement of the execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of cash used for the settlement of the execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SourceOfCash = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution, com.tools20022.repository.entity.FundsCashFlow.RelatedOrder);
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.NonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.Order, com.tools20022.repository.entity.InvestmentFundOrderExecution.DealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.BestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.LateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.SettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.RegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.SourceOfCash);
			}
		});
		return mmObject_lazy.get();
	}
}