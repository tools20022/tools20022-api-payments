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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of the (block) trade (transactions) by the investor or
 * investment manager to different underlying clients, ie, investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Allocation" src="doc-files/Allocation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#Percentage
 * Allocation.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
 * Allocation.AllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementCurrency
 * Allocation.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocationAccount
 * Allocation.AllocationAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#AllocatedPrice
 * Allocation.AllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#AllocationAmount
 * Allocation.AllocationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#Method
 * Allocation.Method}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AveragePricePrecision
 * Allocation.AveragePricePrecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementExecutionParameters
 * Allocation.SettlementExecutionParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesOrder
 * Allocation.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesTrade
 * Allocation.SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#Identification
 * Allocation.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Allocation
 * SecuritiesPricing.Allocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedAllocation
 * SecuritiesAccount.RelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Allocation
 * SecuritiesQuantity.Allocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAllocation
 * SecuritiesTrade.TradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettledAllocation
 * SecuritiesSettlement.SettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderAllocation
 * SecuritiesOrder.SecuritiesOrderAllocation}</li>
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
 * "Allocation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distribution of the (block) trade (transactions) by the investor or investment manager to different underlying clients, ie, investment funds."
 * </li>
 * </ul>
 */
public class Allocation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Percent of the securities quantity that this allocation represents.
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent of the securities quantity that this allocation represents."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Percent of the securities quantity that this allocation represents.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Quantity of a specific security allocated from a block trade, based upon
	 * the distribution of the trade to different accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Allocation
	 * SecuritiesQuantity.Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#Share
	 * SyndicatedLoan1.Share}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AllocatedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SyndicatedLoan1.Share);
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocatedQuantity";
			definition = "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Allocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency to be used for settlement of the allocation.
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency to be used for settlement of the allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement of the allocation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Account to or from which an allocation must be made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedAllocation
	 * SecuritiesAccount.RelatedAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which an allocation must be made."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AllocationAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationAccount";
			definition = "Account to or from which an allocation must be made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Executed price used in an allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Allocation
	 * SecuritiesPricing.Allocation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Executed price used in an allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AllocatedPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocatedPrice";
			definition = "Executed price used in an allocation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Allocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocated quantity of security multiplied by the allocated price.
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocated quantity of security multiplied by the allocated price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllocationAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationAmount";
			definition = "Allocated quantity of security multiplied by the allocated price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates the method of pre-allocation, that is the factors that are/were
	 * applied in the pre-allocation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the method of pre-allocation, that is the factors that are/were applied in the pre-allocation process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Indicates the method of pre-allocation, that is the factors that are/were applied in the pre-allocation process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Number of decimal places used for average pricing.
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePricePrecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of decimal places used for average pricing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AveragePricePrecision = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AveragePricePrecision";
			definition = "Number of decimal places used for average pricing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Parameters used to execute the settlement of a securities allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettledAllocation
	 * SecuritiesSettlement.SettledAllocation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementExecutionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of a securities allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementExecutionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementExecutionParameters";
			definition = "Parameters used to execute the settlement of a securities allocation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securites order which is allocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderAllocation
	 * SecuritiesOrder.SecuritiesOrderAllocation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securites order which is allocated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securites order which is allocated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade which is allocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAllocation
	 * SecuritiesTrade.TradeAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is allocated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade which is allocated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the allocation.
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
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allocation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the allocation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Allocation";
				definition = "Distribution of the (block) trade (transactions) by the investor or investment manager to different underlying clients, ie, investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Allocation, com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation,
						com.tools20022.repository.entity.SecuritiesQuantity.Allocation, com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation, com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Allocation.Percentage, com.tools20022.repository.entity.Allocation.AllocatedQuantity, com.tools20022.repository.entity.Allocation.SettlementCurrency,
						com.tools20022.repository.entity.Allocation.AllocationAccount, com.tools20022.repository.entity.Allocation.AllocatedPrice, com.tools20022.repository.entity.Allocation.AllocationAmount,
						com.tools20022.repository.entity.Allocation.Method, com.tools20022.repository.entity.Allocation.AveragePricePrecision, com.tools20022.repository.entity.Allocation.SettlementExecutionParameters,
						com.tools20022.repository.entity.Allocation.SecuritiesOrder, com.tools20022.repository.entity.Allocation.SecuritiesTrade, com.tools20022.repository.entity.Allocation.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}