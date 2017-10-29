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
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of the transfer of a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderParameters"
 * src="doc-files/SecuritiesOrderParameters.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MinimumQuantity
 * SecuritiesOrderParameters.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MatchIncrement
 * SecuritiesOrderParameters.MatchIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PegInstructions
 * SecuritiesOrderParameters.PegInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreviousClosingPrice
 * SecuritiesOrderParameters.PreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#AutoRouting
 * SecuritiesOrderParameters.AutoRouting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#CorporateActionOptionIndicator
 * SecuritiesOrderParameters.CorporateActionOptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#ExecutionTimeLimit
 * SecuritiesOrderParameters.ExecutionTimeLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreAllocationConditionIndicator
 * SecuritiesOrderParameters.PreAllocationConditionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PriorityIndicator
 * SecuritiesOrderParameters.PriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RequestedDealCurrency
 * SecuritiesOrderParameters.RequestedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#OrderHandlingInstruction
 * SecuritiesOrderParameters.OrderHandlingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#StockLocateRequired
 * SecuritiesOrderParameters.StockLocateRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#WorkingIndicator
 * SecuritiesOrderParameters.WorkingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#BookPriorityIndicator
 * SecuritiesOrderParameters.BookPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MaxPriceLevels
 * SecuritiesOrderParameters.MaxPriceLevels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreTradeAnonymity
 * SecuritiesOrderParameters.PreTradeAnonymity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#GoodTillBooking
 * SecuritiesOrderParameters.GoodTillBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#ManualOrderIndicator
 * SecuritiesOrderParameters.ManualOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#DirectedOrder
 * SecuritiesOrderParameters.DirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#ReceivedDepartment
 * SecuritiesOrderParameters.ReceivedDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#CustomerHandlingInstruction
 * SecuritiesOrderParameters.CustomerHandlingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#ProcessCode
 * SecuritiesOrderParameters.ProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RelatedSecuritiesOrder
 * SecuritiesOrderParameters.RelatedSecuritiesOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedOrder
 * SecuritiesPricing.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityOrderParameters
 * SecuritiesQuantity.MinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MatchIncrementOrderParameters
 * SecuritiesQuantity.MatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecutionParameters
 * SecuritiesOrder.OrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#Order
 * SecuritiesPegOrderInstruction.Order}</li>
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
 * "SecuritiesOrderParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the transfer of a financial instrument."</li>
 * </ul>
 */
public class SecuritiesOrderParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Minimum quantity of financial instrument to be bought or sold if the
	 * entire order cannot be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityOrderParameters
	 * SecuritiesQuantity.MinimumQuantityOrderParameters}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument to be bought or sold if the entire order cannot be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Minimum quantity of financial instrument to be bought or sold if the entire order cannot be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allows orders to specify a minimum quantity that applies to every
	 * execution. (one execution could be for multiple counter-orders). The
	 * order may still fill against smaller orders, but the cumulative quantity
	 * of the execution must be in multiples of the MatchIncrement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MatchIncrementOrderParameters
	 * SecuritiesQuantity.MatchIncrementOrderParameters}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MatchIncrement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchIncrement";
			definition = "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Additional instructions if the order is pegged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#Order
	 * SecuritiesPegOrderInstruction.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional instructions if the order is pegged."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PegInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PegInstructions";
			definition = "Additional instructions if the order is pegged.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Previous closing price of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedOrder
	 * SecuritiesPricing.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous closing price of security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PreviousClosingPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether an automatic routing system is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRoutingCode
	 * AutoRoutingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoRouting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an automatic routing system is involved."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AutoRouting = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoRouting";
			definition = "Indicates whether an automatic routing system is involved.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AutoRoutingCode.mmObject();
		}
	};
	/**
	 * Indicates the possible options or choices available to account owner (for
	 * investment funds).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreferenceCode
	 * IncomePreferenceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the possible options or choices available to account owner (for investment funds)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionOptionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionIndicator";
			definition = "Indicates the possible options or choices available to account owner (for investment funds).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}
	};
	/**
	 * Indicates from/until when an order must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionTimeLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates from/until when an order must be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutionTimeLimit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionTimeLimit";
			definition = "Indicates from/until when an order must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExecutionTimeLimitCode.mmObject();
		}
	};
	/**
	 * Indicates the conditions that apply to a pre-allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocationConditionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the conditions that apply to a pre-allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreAllocationConditionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAllocationConditionIndicator";
			definition = "Indicates the conditions that apply to a pre-allocation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Indicates the execution priority of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the execution priority of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriorityIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates the execution priority of the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Currency in which a trade should be executed.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDealCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a trade should be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedDealCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedDealCurrency";
			definition = "Currency in which a trade should be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies instructions for order handling on the broker trading floor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode
	 * TradingFloorOrderHandlingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderHandlingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies instructions for order handling on the broker trading floor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderHandlingInstruction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderHandlingInstruction";
			definition = "Specifies instructions for order handling on the broker trading floor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
		}
	};
	/**
	 * Indicates whether the broker is to locate the stock in conjunction with a
	 * short sell order. This information is mandatory in case of short sales.
	 * When executed, the report will then mention the securities location.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLocateRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StockLocateRequired = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLocateRequired";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the order is currently being worked. For open outcry markets
	 * this indicates that the order is being worked in the crowd. For
	 * electronic markets it indicates that the order has transitioned from a
	 * contingent order to a market order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WorkingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if a Cancel/Replace has caused an order to lose book priority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BookPriorityIndicatorCode
	 * BookPriorityIndicatorCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookPriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if a Cancel/Replace has caused an order to lose book priority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BookPriorityIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookPriorityIndicator";
			definition = "Indicates if a Cancel/Replace has caused an order to lose book priority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BookPriorityIndicatorCode.mmObject();
		}
	};
	/**
	 * Allows an order to specify a maximum number of price levels to trade
	 * through.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxPriceLevels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows an order to specify a maximum number of price levels to trade through."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaxPriceLevels = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaxPriceLevels";
			definition = "Allows an order to specify a maximum number of price levels to trade through.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Allows trader to explicitly request anonymity or disclosure in pre-trade
	 * market data feeds. Anonymity is relevant in markets where counterparties
	 * are regularly disclosed in order depth feeds. Disclosure is relevant when
	 * counterparties are not normally visible.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTradeAnonymity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreTradeAnonymity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreTradeAnonymity";
			definition = "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * For partially good till orders, the specification of whether to book each
	 * execution, or to accumulate the executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GoodTillBooking = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoodTillBooking";
			definition = "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GoodTillBookingInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates if the order was initially received manually (as opposed to
	 * electronically).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the order was initially received manually (as opposed to electronically)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ManualOrderIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualOrderIndicator";
			definition = "Indicates if the order was initially received manually (as opposed to electronically).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the customer directed this order to a specific execution
	 * venue (Y) or not (N).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the customer directed this order to a specific execution venue (Y) or not (N)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DirectedOrder = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates if the customer directed this order to a specific execution venue (Y) or not (N).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the Broker / Dealer Department that first took the order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the Broker / Dealer Department that first took the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReceivedDepartment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivedDepartment";
			definition = "Identifies the Broker / Dealer Department that first took the order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Codes that apply special information that the Broker / Dealer needs to
	 * report, as specified by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerHandlingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CustomerHandlingInstruction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerHandlingInstruction";
			definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
		}
	};
	/**
	 * Used to identify soft trades at order entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used to identify soft trades at order entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessCode";
			definition = "Used to identify soft trades at order entry.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}
	};
	/**
	 * Securities order for which parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecutionParameters
	 * SecuritiesOrder.OrderExecutionParameters}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order for which parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesOrder";
			definition = "Securities order for which parameters are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderParameters";
				definition = "Parameters of the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters, com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement,
						com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions, com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice,
						com.tools20022.repository.entity.SecuritiesOrderParameters.AutoRouting, com.tools20022.repository.entity.SecuritiesOrderParameters.CorporateActionOptionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.ExecutionTimeLimit, com.tools20022.repository.entity.SecuritiesOrderParameters.PreAllocationConditionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.PriorityIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.RequestedDealCurrency,
						com.tools20022.repository.entity.SecuritiesOrderParameters.OrderHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.StockLocateRequired,
						com.tools20022.repository.entity.SecuritiesOrderParameters.WorkingIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.BookPriorityIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.MaxPriceLevels, com.tools20022.repository.entity.SecuritiesOrderParameters.PreTradeAnonymity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.GoodTillBooking, com.tools20022.repository.entity.SecuritiesOrderParameters.ManualOrderIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.DirectedOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.ReceivedDepartment,
						com.tools20022.repository.entity.SecuritiesOrderParameters.CustomerHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.ProcessCode,
						com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder);
			}
		});
		return mmObject_lazy.get();
	}
}