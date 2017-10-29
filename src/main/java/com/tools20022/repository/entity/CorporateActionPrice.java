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
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Prices related to a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionPrice" src="doc-files/CorporateActionPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
 * CorporateActionPrice.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
 * CorporateActionPrice.CorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
 * CorporateActionPrice.CashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
 * CorporateActionPrice.PricingCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
 * CorporateActionEvent.CorporateActionPrice}</li>
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
 * "CorporateActionPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Prices related to a corporate action."</li>
 * </ul>
 */
public class CorporateActionPrice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Corporate event for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
	 * CorporateActionEvent.CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage.<br>
	 * 2. Price at which a bond is converted to underlying security either as an
	 * actual amount or a percentage.<br>
	 * 3. Strike price of an option, represented either as an actual amount or a
	 * percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
	 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
	 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
	 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
	 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
	 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
	 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashValueForTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the parameters taken into account to calculate the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
	 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters taken into account to calculate the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PricingCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}