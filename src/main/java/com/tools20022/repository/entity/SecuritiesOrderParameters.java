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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesPegOrderInstruction;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MINI</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesQuantity> mmMinimumQuantity = new MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MINI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Minimum quantity of financial instrument to be bought or sold if the entire order cannot be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumQuantityOrderParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesOrderParameters obj) {
			return obj.getMinimumQuantity();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, SecuritiesQuantity value) {
			obj.setMinimumQuantity(value);
		}
	};
	protected SecuritiesQuantity matchIncrement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesQuantity> mmMatchIncrement = new MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchIncrement";
			definition = "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMatchIncrementOrderParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesOrderParameters obj) {
			return obj.getMatchIncrement();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, SecuritiesQuantity value) {
			obj.setMatchIncrement(value);
		}
	};
	protected SecuritiesPegOrderInstruction pegInstructions;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesPegOrderInstruction> mmPegInstructions = new MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesPegOrderInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PegInstructions";
			definition = "Additional instructions if the order is pegged.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPegOrderInstruction.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
		}

		@Override
		public SecuritiesPegOrderInstruction getValue(SecuritiesOrderParameters obj) {
			return obj.getPegInstructions();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, SecuritiesPegOrderInstruction value) {
			obj.setPegInstructions(value);
		}
	};
	protected SecuritiesPricing previousClosingPrice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesPricing> mmPreviousClosingPrice = new MMBusinessAssociationEnd<SecuritiesOrderParameters, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(SecuritiesOrderParameters obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, SecuritiesPricing value) {
			obj.setPreviousClosingPrice(value);
		}
	};
	protected AutoRoutingCode autoRouting;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::AUTO</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, AutoRoutingCode> mmAutoRouting = new MMBusinessAttribute<SecuritiesOrderParameters, AutoRoutingCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::AUTO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoRouting";
			definition = "Indicates whether an automatic routing system is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoRoutingCode.mmObject();
		}

		@Override
		public AutoRoutingCode getValue(SecuritiesOrderParameters obj) {
			return obj.getAutoRouting();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, AutoRoutingCode value) {
			obj.setAutoRouting(value);
		}
	};
	protected IncomePreferenceCode corporateActionOptionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, IncomePreferenceCode> mmCorporateActionOptionIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, IncomePreferenceCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionIndicator";
			definition = "Indicates the possible options or choices available to account owner (for investment funds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}

		@Override
		public IncomePreferenceCode getValue(SecuritiesOrderParameters obj) {
			return obj.getCorporateActionOptionIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, IncomePreferenceCode value) {
			obj.setCorporateActionOptionIndicator(value);
		}
	};
	protected ExecutionTimeLimitCode executionTimeLimit;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TILI, FIXSynonym: 59</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, ExecutionTimeLimitCode> mmExecutionTimeLimit = new MMBusinessAttribute<SecuritiesOrderParameters, ExecutionTimeLimitCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TILI"), new FIXSynonym(this, "59"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionTimeLimit";
			definition = "Indicates from/until when an order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExecutionTimeLimitCode.mmObject();
		}

		@Override
		public ExecutionTimeLimitCode getValue(SecuritiesOrderParameters obj) {
			return obj.getExecutionTimeLimit();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, ExecutionTimeLimitCode value) {
			obj.setExecutionTimeLimit(value);
		}
	};
	protected Max16Text preAllocationConditionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, Max16Text> mmPreAllocationConditionIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, Max16Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocationConditionIndicator";
			definition = "Indicates the conditions that apply to a pre-allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(SecuritiesOrderParameters obj) {
			return obj.getPreAllocationConditionIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, Max16Text value) {
			obj.setPreAllocationConditionIndicator(value);
		}
	};
	protected PriorityCode priorityIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PRIR</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, PriorityCode> mmPriorityIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, PriorityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PRIR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates the execution priority of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(SecuritiesOrderParameters obj) {
			return obj.getPriorityIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, PriorityCode value) {
			obj.setPriorityIndicator(value);
		}
	};
	protected CurrencyCode requestedDealCurrency;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, CurrencyCode> mmRequestedDealCurrency = new MMBusinessAttribute<SecuritiesOrderParameters, CurrencyCode>() {
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

		@Override
		public CurrencyCode getValue(SecuritiesOrderParameters obj) {
			return obj.getRequestedDealCurrency();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, CurrencyCode value) {
			obj.setRequestedDealCurrency(value);
		}
	};
	protected TradingFloorOrderHandlingCode orderHandlingInstruction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, TradingFloorOrderHandlingCode> mmOrderHandlingInstruction = new MMBusinessAttribute<SecuritiesOrderParameters, TradingFloorOrderHandlingCode>() {
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

		@Override
		public TradingFloorOrderHandlingCode getValue(SecuritiesOrderParameters obj) {
			return obj.getOrderHandlingInstruction();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, TradingFloorOrderHandlingCode value) {
			obj.setOrderHandlingInstruction(value);
		}
	};
	protected YesNoIndicator stockLocateRequired;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 114</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator> mmStockLocateRequired = new MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "114"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockLocateRequired";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderParameters obj) {
			return obj.getStockLocateRequired();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, YesNoIndicator value) {
			obj.setStockLocateRequired(value);
		}
	};
	protected YesNoIndicator workingIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 636</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator> mmWorkingIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "636"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderParameters obj) {
			return obj.getWorkingIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, YesNoIndicator value) {
			obj.setWorkingIndicator(value);
		}
	};
	protected BookPriorityIndicatorCode bookPriorityIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 638</li>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, BookPriorityIndicatorCode> mmBookPriorityIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, BookPriorityIndicatorCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "638"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookPriorityIndicator";
			definition = "Indicates if a Cancel/Replace has caused an order to lose book priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookPriorityIndicatorCode.mmObject();
		}

		@Override
		public BookPriorityIndicatorCode getValue(SecuritiesOrderParameters obj) {
			return obj.getBookPriorityIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, BookPriorityIndicatorCode value) {
			obj.setBookPriorityIndicator(value);
		}
	};
	protected Number maxPriceLevels;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, Number> mmMaxPriceLevels = new MMBusinessAttribute<SecuritiesOrderParameters, Number>() {
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

		@Override
		public Number getValue(SecuritiesOrderParameters obj) {
			return obj.getMaxPriceLevels();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, Number value) {
			obj.setMaxPriceLevels(value);
		}
	};
	protected YesNoIndicator preTradeAnonymity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator> mmPreTradeAnonymity = new MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesOrderParameters obj) {
			return obj.getPreTradeAnonymity();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, YesNoIndicator value) {
			obj.setPreTradeAnonymity(value);
		}
	};
	protected GoodTillBookingInstructionCode goodTillBooking;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, GoodTillBookingInstructionCode> mmGoodTillBooking = new MMBusinessAttribute<SecuritiesOrderParameters, GoodTillBookingInstructionCode>() {
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

		@Override
		public GoodTillBookingInstructionCode getValue(SecuritiesOrderParameters obj) {
			return obj.getGoodTillBooking();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, GoodTillBookingInstructionCode value) {
			obj.setGoodTillBooking(value);
		}
	};
	protected YesNoIndicator manualOrderIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator> mmManualOrderIndicator = new MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesOrderParameters obj) {
			return obj.getManualOrderIndicator();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, YesNoIndicator value) {
			obj.setManualOrderIndicator(value);
		}
	};
	protected YesNoIndicator directedOrder;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator> mmDirectedOrder = new MMBusinessAttribute<SecuritiesOrderParameters, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesOrderParameters obj) {
			return obj.getDirectedOrder();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, YesNoIndicator value) {
			obj.setDirectedOrder(value);
		}
	};
	protected Max35Text receivedDepartment;
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, Max35Text> mmReceivedDepartment = new MMBusinessAttribute<SecuritiesOrderParameters, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesOrderParameters obj) {
			return obj.getReceivedDepartment();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, Max35Text value) {
			obj.setReceivedDepartment(value);
		}
	};
	protected CustomerHandlingInstructionsCode customerHandlingInstruction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, CustomerHandlingInstructionsCode> mmCustomerHandlingInstruction = new MMBusinessAttribute<SecuritiesOrderParameters, CustomerHandlingInstructionsCode>() {
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

		@Override
		public CustomerHandlingInstructionsCode getValue(SecuritiesOrderParameters obj) {
			return obj.getCustomerHandlingInstruction();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, CustomerHandlingInstructionsCode value) {
			obj.setCustomerHandlingInstruction(value);
		}
	};
	protected CommissionTypeV2Code processCode;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesOrderParameters, CommissionTypeV2Code> mmProcessCode = new MMBusinessAttribute<SecuritiesOrderParameters, CommissionTypeV2Code>() {
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

		@Override
		public CommissionTypeV2Code getValue(SecuritiesOrderParameters obj) {
			return obj.getProcessCode();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, CommissionTypeV2Code value) {
			obj.setProcessCode(value);
		}
	};
	protected SecuritiesOrder relatedSecuritiesOrder;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesOrderParameters, Optional<SecuritiesOrder>> mmRelatedSecuritiesOrder = new MMBusinessAssociationEnd<SecuritiesOrderParameters, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesOrder";
			definition = "Securities order for which parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesOrderParameters obj) {
			return obj.getRelatedSecuritiesOrder();
		}

		@Override
		public void setValue(SecuritiesOrderParameters obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedSecuritiesOrder(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderParameters";
				definition = "Parameters of the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmRelatedOrder, SecuritiesQuantity.mmMinimumQuantityOrderParameters, SecuritiesQuantity.mmMatchIncrementOrderParameters,
						SecuritiesOrder.mmOrderExecutionParameters, SecuritiesPegOrderInstruction.mmOrder);
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

	public SecuritiesOrderParameters setMinimumQuantity(SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = Objects.requireNonNull(minimumQuantity);
		return this;
	}

	public SecuritiesQuantity getMatchIncrement() {
		return matchIncrement;
	}

	public SecuritiesOrderParameters setMatchIncrement(SecuritiesQuantity matchIncrement) {
		this.matchIncrement = Objects.requireNonNull(matchIncrement);
		return this;
	}

	public SecuritiesPegOrderInstruction getPegInstructions() {
		return pegInstructions;
	}

	public SecuritiesOrderParameters setPegInstructions(SecuritiesPegOrderInstruction pegInstructions) {
		this.pegInstructions = Objects.requireNonNull(pegInstructions);
		return this;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public SecuritiesOrderParameters setPreviousClosingPrice(SecuritiesPricing previousClosingPrice) {
		this.previousClosingPrice = Objects.requireNonNull(previousClosingPrice);
		return this;
	}

	public AutoRoutingCode getAutoRouting() {
		return autoRouting;
	}

	public SecuritiesOrderParameters setAutoRouting(AutoRoutingCode autoRouting) {
		this.autoRouting = Objects.requireNonNull(autoRouting);
		return this;
	}

	public IncomePreferenceCode getCorporateActionOptionIndicator() {
		return corporateActionOptionIndicator;
	}

	public SecuritiesOrderParameters setCorporateActionOptionIndicator(IncomePreferenceCode corporateActionOptionIndicator) {
		this.corporateActionOptionIndicator = Objects.requireNonNull(corporateActionOptionIndicator);
		return this;
	}

	public ExecutionTimeLimitCode getExecutionTimeLimit() {
		return executionTimeLimit;
	}

	public SecuritiesOrderParameters setExecutionTimeLimit(ExecutionTimeLimitCode executionTimeLimit) {
		this.executionTimeLimit = Objects.requireNonNull(executionTimeLimit);
		return this;
	}

	public Max16Text getPreAllocationConditionIndicator() {
		return preAllocationConditionIndicator;
	}

	public SecuritiesOrderParameters setPreAllocationConditionIndicator(Max16Text preAllocationConditionIndicator) {
		this.preAllocationConditionIndicator = Objects.requireNonNull(preAllocationConditionIndicator);
		return this;
	}

	public PriorityCode getPriorityIndicator() {
		return priorityIndicator;
	}

	public SecuritiesOrderParameters setPriorityIndicator(PriorityCode priorityIndicator) {
		this.priorityIndicator = Objects.requireNonNull(priorityIndicator);
		return this;
	}

	public CurrencyCode getRequestedDealCurrency() {
		return requestedDealCurrency;
	}

	public SecuritiesOrderParameters setRequestedDealCurrency(CurrencyCode requestedDealCurrency) {
		this.requestedDealCurrency = Objects.requireNonNull(requestedDealCurrency);
		return this;
	}

	public TradingFloorOrderHandlingCode getOrderHandlingInstruction() {
		return orderHandlingInstruction;
	}

	public SecuritiesOrderParameters setOrderHandlingInstruction(TradingFloorOrderHandlingCode orderHandlingInstruction) {
		this.orderHandlingInstruction = Objects.requireNonNull(orderHandlingInstruction);
		return this;
	}

	public YesNoIndicator getStockLocateRequired() {
		return stockLocateRequired;
	}

	public SecuritiesOrderParameters setStockLocateRequired(YesNoIndicator stockLocateRequired) {
		this.stockLocateRequired = Objects.requireNonNull(stockLocateRequired);
		return this;
	}

	public YesNoIndicator getWorkingIndicator() {
		return workingIndicator;
	}

	public SecuritiesOrderParameters setWorkingIndicator(YesNoIndicator workingIndicator) {
		this.workingIndicator = Objects.requireNonNull(workingIndicator);
		return this;
	}

	public BookPriorityIndicatorCode getBookPriorityIndicator() {
		return bookPriorityIndicator;
	}

	public SecuritiesOrderParameters setBookPriorityIndicator(BookPriorityIndicatorCode bookPriorityIndicator) {
		this.bookPriorityIndicator = Objects.requireNonNull(bookPriorityIndicator);
		return this;
	}

	public Number getMaxPriceLevels() {
		return maxPriceLevels;
	}

	public SecuritiesOrderParameters setMaxPriceLevels(Number maxPriceLevels) {
		this.maxPriceLevels = Objects.requireNonNull(maxPriceLevels);
		return this;
	}

	public YesNoIndicator getPreTradeAnonymity() {
		return preTradeAnonymity;
	}

	public SecuritiesOrderParameters setPreTradeAnonymity(YesNoIndicator preTradeAnonymity) {
		this.preTradeAnonymity = Objects.requireNonNull(preTradeAnonymity);
		return this;
	}

	public GoodTillBookingInstructionCode getGoodTillBooking() {
		return goodTillBooking;
	}

	public SecuritiesOrderParameters setGoodTillBooking(GoodTillBookingInstructionCode goodTillBooking) {
		this.goodTillBooking = Objects.requireNonNull(goodTillBooking);
		return this;
	}

	public YesNoIndicator getManualOrderIndicator() {
		return manualOrderIndicator;
	}

	public SecuritiesOrderParameters setManualOrderIndicator(YesNoIndicator manualOrderIndicator) {
		this.manualOrderIndicator = Objects.requireNonNull(manualOrderIndicator);
		return this;
	}

	public YesNoIndicator getDirectedOrder() {
		return directedOrder;
	}

	public SecuritiesOrderParameters setDirectedOrder(YesNoIndicator directedOrder) {
		this.directedOrder = Objects.requireNonNull(directedOrder);
		return this;
	}

	public Max35Text getReceivedDepartment() {
		return receivedDepartment;
	}

	public SecuritiesOrderParameters setReceivedDepartment(Max35Text receivedDepartment) {
		this.receivedDepartment = Objects.requireNonNull(receivedDepartment);
		return this;
	}

	public CustomerHandlingInstructionsCode getCustomerHandlingInstruction() {
		return customerHandlingInstruction;
	}

	public SecuritiesOrderParameters setCustomerHandlingInstruction(CustomerHandlingInstructionsCode customerHandlingInstruction) {
		this.customerHandlingInstruction = Objects.requireNonNull(customerHandlingInstruction);
		return this;
	}

	public CommissionTypeV2Code getProcessCode() {
		return processCode;
	}

	public SecuritiesOrderParameters setProcessCode(CommissionTypeV2Code processCode) {
		this.processCode = Objects.requireNonNull(processCode);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedSecuritiesOrder() {
		return relatedSecuritiesOrder == null ? Optional.empty() : Optional.of(relatedSecuritiesOrder);
	}

	public SecuritiesOrderParameters setRelatedSecuritiesOrder(SecuritiesOrder relatedSecuritiesOrder) {
		this.relatedSecuritiesOrder = relatedSecuritiesOrder;
		return this;
	}
}