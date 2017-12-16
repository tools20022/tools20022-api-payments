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
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
 * SecuritiesOrderParameters.mmMatchIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPegInstructions
 * SecuritiesOrderParameters.mmPegInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmAutoRouting
 * SecuritiesOrderParameters.mmAutoRouting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmCorporateActionOptionIndicator
 * SecuritiesOrderParameters.mmCorporateActionOptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmExecutionTimeLimit
 * SecuritiesOrderParameters.mmExecutionTimeLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreAllocationConditionIndicator
 * SecuritiesOrderParameters.mmPreAllocationConditionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPriorityIndicator
 * SecuritiesOrderParameters.mmPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRequestedDealCurrency
 * SecuritiesOrderParameters.mmRequestedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmOrderHandlingInstruction
 * SecuritiesOrderParameters.mmOrderHandlingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmStockLocateRequired
 * SecuritiesOrderParameters.mmStockLocateRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmWorkingIndicator
 * SecuritiesOrderParameters.mmWorkingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmBookPriorityIndicator
 * SecuritiesOrderParameters.mmBookPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMaxPriceLevels
 * SecuritiesOrderParameters.mmMaxPriceLevels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreTradeAnonymity
 * SecuritiesOrderParameters.mmPreTradeAnonymity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmGoodTillBooking
 * SecuritiesOrderParameters.mmGoodTillBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmManualOrderIndicator
 * SecuritiesOrderParameters.mmManualOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmDirectedOrder
 * SecuritiesOrderParameters.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmReceivedDepartment
 * SecuritiesOrderParameters.mmReceivedDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmCustomerHandlingInstruction
 * SecuritiesOrderParameters.mmCustomerHandlingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmProcessCode
 * SecuritiesOrderParameters.mmProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRelatedSecuritiesOrder
 * SecuritiesOrderParameters.mmRelatedSecuritiesOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedOrder
 * SecuritiesPricing.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityOrderParameters
 * SecuritiesQuantity.mmMinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMatchIncrementOrderParameters
 * SecuritiesQuantity.mmMatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecutionParameters
 * SecuritiesOrder.mmOrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOrder
 * SecuritiesPegOrderInstruction.mmOrder}</li>
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
 * "SecuritiesOrderParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the transfer of a financial instrument."</li>
 * </ul>
 */
public class SecuritiesOrderParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * Minimum quantity of financial instrument to be bought or sold if the
	 * entire order cannot be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityOrderParameters
	 * SecuritiesQuantity.mmMinimumQuantityOrderParameters}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Minimum quantity of financial instrument to be bought or sold if the entire order cannot be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityOrderParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity matchIncrement;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMatchIncrementOrderParameters
	 * SecuritiesQuantity.mmMatchIncrementOrderParameters}</li>
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
	public static final MMBusinessAssociationEnd mmMatchIncrement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchIncrement";
			definition = "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMatchIncrementOrderParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesPegOrderInstruction pegInstructions;
	/**
	 * Additional instructions if the order is pegged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOrder
	 * SecuritiesPegOrderInstruction.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmPegInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PegInstructions";
			definition = "Additional instructions if the order is pegged.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
		}
	};
	protected SecuritiesPricing previousClosingPrice;
	/**
	 * Previous closing price of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedOrder
	 * SecuritiesPricing.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd mmPreviousClosingPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected AutoRoutingCode autoRouting;
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
	public static final MMBusinessAttribute mmAutoRouting = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoRouting";
			definition = "Indicates whether an automatic routing system is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoRoutingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getAutoRouting", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IncomePreferenceCode corporateActionOptionIndicator;
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
	public static final MMBusinessAttribute mmCorporateActionOptionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionIndicator";
			definition = "Indicates the possible options or choices available to account owner (for investment funds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getCorporateActionOptionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExecutionTimeLimitCode executionTimeLimit;
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
	public static final MMBusinessAttribute mmExecutionTimeLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionTimeLimit";
			definition = "Indicates from/until when an order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExecutionTimeLimitCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getExecutionTimeLimit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text preAllocationConditionIndicator;
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
	public static final MMBusinessAttribute mmPreAllocationConditionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocationConditionIndicator";
			definition = "Indicates the conditions that apply to a pre-allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getPreAllocationConditionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriorityCode priorityIndicator;
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
	public static final MMBusinessAttribute mmPriorityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates the execution priority of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getPriorityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedDealCurrency;
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
	public static final MMBusinessAttribute mmRequestedDealCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedDealCurrency";
			definition = "Currency in which a trade should be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getRequestedDealCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingFloorOrderHandlingCode orderHandlingInstruction;
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
	public static final MMBusinessAttribute mmOrderHandlingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderHandlingInstruction";
			definition = "Specifies instructions for order handling on the broker trading floor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getOrderHandlingInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator stockLocateRequired;
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
	public static final MMBusinessAttribute mmStockLocateRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockLocateRequired";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getStockLocateRequired", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator workingIndicator;
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
	public static final MMBusinessAttribute mmWorkingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getWorkingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BookPriorityIndicatorCode bookPriorityIndicator;
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
	public static final MMBusinessAttribute mmBookPriorityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookPriorityIndicator";
			definition = "Indicates if a Cancel/Replace has caused an order to lose book priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookPriorityIndicatorCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getBookPriorityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number maxPriceLevels;
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
	public static final MMBusinessAttribute mmMaxPriceLevels = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaxPriceLevels";
			definition = "Allows an order to specify a maximum number of price levels to trade through.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getMaxPriceLevels", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator preTradeAnonymity;
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
	public static final MMBusinessAttribute mmPreTradeAnonymity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreTradeAnonymity";
			definition = "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getPreTradeAnonymity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GoodTillBookingInstructionCode goodTillBooking;
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
	public static final MMBusinessAttribute mmGoodTillBooking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoodTillBooking";
			definition = "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GoodTillBookingInstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getGoodTillBooking", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator manualOrderIndicator;
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
	public static final MMBusinessAttribute mmManualOrderIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualOrderIndicator";
			definition = "Indicates if the order was initially received manually (as opposed to electronically).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getManualOrderIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator directedOrder;
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
	public static final MMBusinessAttribute mmDirectedOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates if the customer directed this order to a specific execution venue (Y) or not (N).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getDirectedOrder", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text receivedDepartment;
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
	public static final MMBusinessAttribute mmReceivedDepartment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivedDepartment";
			definition = "Identifies the Broker / Dealer Department that first took the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getReceivedDepartment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CustomerHandlingInstructionsCode customerHandlingInstruction;
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
	public static final MMBusinessAttribute mmCustomerHandlingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerHandlingInstruction";
			definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getCustomerHandlingInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CommissionTypeV2Code processCode;
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
	public static final MMBusinessAttribute mmProcessCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessCode";
			definition = "Used to identify soft trades at order entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderParameters.class.getMethod("getProcessCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder relatedSecuritiesOrder;
	/**
	 * Securities order for which parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecutionParameters
	 * SecuritiesOrder.mmOrderExecutionParameters}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesOrder";
			definition = "Securities order for which parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderParameters";
				definition = "Parameters of the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMatchIncrementOrderParameters, com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOrder);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderParameters.mmMinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.mmMatchIncrement,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmPegInstructions, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreviousClosingPrice,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmAutoRouting, com.tools20022.repository.entity.SecuritiesOrderParameters.mmCorporateActionOptionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmExecutionTimeLimit, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreAllocationConditionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmPriorityIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.mmRequestedDealCurrency,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmOrderHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.mmStockLocateRequired,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmWorkingIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.mmBookPriorityIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmMaxPriceLevels, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreTradeAnonymity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmGoodTillBooking, com.tools20022.repository.entity.SecuritiesOrderParameters.mmManualOrderIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmDirectedOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.mmReceivedDepartment,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmCustomerHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.mmProcessCode,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmRelatedSecuritiesOrder);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrderParameters.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public SecuritiesQuantity getMatchIncrement() {
		return matchIncrement;
	}

	public void setMatchIncrement(com.tools20022.repository.entity.SecuritiesQuantity matchIncrement) {
		this.matchIncrement = matchIncrement;
	}

	public SecuritiesPegOrderInstruction getPegInstructions() {
		return pegInstructions;
	}

	public void setPegInstructions(com.tools20022.repository.entity.SecuritiesPegOrderInstruction pegInstructions) {
		this.pegInstructions = pegInstructions;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(com.tools20022.repository.entity.SecuritiesPricing previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public AutoRoutingCode getAutoRouting() {
		return autoRouting;
	}

	public void setAutoRouting(AutoRoutingCode autoRouting) {
		this.autoRouting = autoRouting;
	}

	public IncomePreferenceCode getCorporateActionOptionIndicator() {
		return corporateActionOptionIndicator;
	}

	public void setCorporateActionOptionIndicator(IncomePreferenceCode corporateActionOptionIndicator) {
		this.corporateActionOptionIndicator = corporateActionOptionIndicator;
	}

	public ExecutionTimeLimitCode getExecutionTimeLimit() {
		return executionTimeLimit;
	}

	public void setExecutionTimeLimit(ExecutionTimeLimitCode executionTimeLimit) {
		this.executionTimeLimit = executionTimeLimit;
	}

	public Max16Text getPreAllocationConditionIndicator() {
		return preAllocationConditionIndicator;
	}

	public void setPreAllocationConditionIndicator(Max16Text preAllocationConditionIndicator) {
		this.preAllocationConditionIndicator = preAllocationConditionIndicator;
	}

	public PriorityCode getPriorityIndicator() {
		return priorityIndicator;
	}

	public void setPriorityIndicator(PriorityCode priorityIndicator) {
		this.priorityIndicator = priorityIndicator;
	}

	public CurrencyCode getRequestedDealCurrency() {
		return requestedDealCurrency;
	}

	public void setRequestedDealCurrency(CurrencyCode requestedDealCurrency) {
		this.requestedDealCurrency = requestedDealCurrency;
	}

	public TradingFloorOrderHandlingCode getOrderHandlingInstruction() {
		return orderHandlingInstruction;
	}

	public void setOrderHandlingInstruction(TradingFloorOrderHandlingCode orderHandlingInstruction) {
		this.orderHandlingInstruction = orderHandlingInstruction;
	}

	public YesNoIndicator getStockLocateRequired() {
		return stockLocateRequired;
	}

	public void setStockLocateRequired(YesNoIndicator stockLocateRequired) {
		this.stockLocateRequired = stockLocateRequired;
	}

	public YesNoIndicator getWorkingIndicator() {
		return workingIndicator;
	}

	public void setWorkingIndicator(YesNoIndicator workingIndicator) {
		this.workingIndicator = workingIndicator;
	}

	public BookPriorityIndicatorCode getBookPriorityIndicator() {
		return bookPriorityIndicator;
	}

	public void setBookPriorityIndicator(BookPriorityIndicatorCode bookPriorityIndicator) {
		this.bookPriorityIndicator = bookPriorityIndicator;
	}

	public Number getMaxPriceLevels() {
		return maxPriceLevels;
	}

	public void setMaxPriceLevels(Number maxPriceLevels) {
		this.maxPriceLevels = maxPriceLevels;
	}

	public YesNoIndicator getPreTradeAnonymity() {
		return preTradeAnonymity;
	}

	public void setPreTradeAnonymity(YesNoIndicator preTradeAnonymity) {
		this.preTradeAnonymity = preTradeAnonymity;
	}

	public GoodTillBookingInstructionCode getGoodTillBooking() {
		return goodTillBooking;
	}

	public void setGoodTillBooking(GoodTillBookingInstructionCode goodTillBooking) {
		this.goodTillBooking = goodTillBooking;
	}

	public YesNoIndicator getManualOrderIndicator() {
		return manualOrderIndicator;
	}

	public void setManualOrderIndicator(YesNoIndicator manualOrderIndicator) {
		this.manualOrderIndicator = manualOrderIndicator;
	}

	public YesNoIndicator getDirectedOrder() {
		return directedOrder;
	}

	public void setDirectedOrder(YesNoIndicator directedOrder) {
		this.directedOrder = directedOrder;
	}

	public Max35Text getReceivedDepartment() {
		return receivedDepartment;
	}

	public void setReceivedDepartment(Max35Text receivedDepartment) {
		this.receivedDepartment = receivedDepartment;
	}

	public CustomerHandlingInstructionsCode getCustomerHandlingInstruction() {
		return customerHandlingInstruction;
	}

	public void setCustomerHandlingInstruction(CustomerHandlingInstructionsCode customerHandlingInstruction) {
		this.customerHandlingInstruction = customerHandlingInstruction;
	}

	public CommissionTypeV2Code getProcessCode() {
		return processCode;
	}

	public void setProcessCode(CommissionTypeV2Code processCode) {
		this.processCode = processCode;
	}

	public SecuritiesOrder getRelatedSecuritiesOrder() {
		return relatedSecuritiesOrder;
	}

	public void setRelatedSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder relatedSecuritiesOrder) {
		this.relatedSecuritiesOrder = relatedSecuritiesOrder;
	}
}