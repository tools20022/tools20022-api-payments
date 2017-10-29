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
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.DocumentAdjustment1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Adjustment" src="doc-files/Adjustment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Amount
 * Adjustment.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargeRate
 * Adjustment.ChargeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#CalculationMethod
 * Adjustment.CalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Payment
 * Adjustment.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Direction
 * Adjustment.Direction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Reason
 * Adjustment.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#RelatedLineItem
 * Adjustment.RelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#AllowanceChargeIndicator
 * Adjustment.AllowanceChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Price
 * Adjustment.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargeIndicator
 * Adjustment.ChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Type
 * Adjustment.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#CollateralManagement
 * Adjustment.CollateralManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
 * Adjustment.AdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#ChargesPartyRole
 * Adjustment.ChargesPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#EffectivePeriod
 * Adjustment.EffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
 * Adjustment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
 * Adjustment.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Tax
 * Adjustment.Tax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAdjustment
 * DateTimePeriod.RelatedAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Adjustment
 * Tax.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Adjustments
 * Payment.Adjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Adjustment
 * Balance.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#PriceAdjustment
 * Price.PriceAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
 * CurrencyExchange.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
 * SecuritiesOrder.Adjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChargePartyRole#Adjustment
 * ChargePartyRole.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#FinancialAdjustment
 * LineItem.FinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#FeesAndCommissions
 * CollateralManagement.FeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#AdjustmentAmountAndReason
 * RemittanceAmount3.AdjustmentAmountAndReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount Discount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1
 * DocumentAdjustment1}</li>
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
 * "Adjustment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount."
 * </li>
 * </ul>
 */
public class Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money that results from the application of an adjustment
	 * (charges. fees, discount or allowance) to the amount due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1#Amount
	 * DocumentAdjustment1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Amount
	 * ChargesRecord1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges3#TotalChargesAndTaxAmount
	 * Charges3.TotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#Amount
	 * DiscountAmountAndType1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Amount
	 * ChargesRecord2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges4#TotalChargesAndTaxAmount
	 * Charges4.TotalChargesAndTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges2#Amount
	 * Charges2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#CompensationAmount
	 * PaymentTransaction81.CompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#CompensationAmount
	 * PaymentTransaction76.CompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.Amount, com.tools20022.repository.msg.ChargesRecord1.Amount, com.tools20022.repository.msg.Charges3.TotalChargesAndTaxAmount,
					com.tools20022.repository.msg.DiscountAmountAndType1.Amount, com.tools20022.repository.msg.ChargesRecord2.Amount, com.tools20022.repository.msg.Charges4.TotalChargesAndTaxAmount,
					com.tools20022.repository.msg.Charges2.Amount, com.tools20022.repository.msg.PaymentTransaction81.CompensationAmount, com.tools20022.repository.msg.PaymentTransaction76.CompensationAmount);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate used to calculate the amount of the adjustment, allowance, charge or
	 * fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Rate
	 * ChargesRecord1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Rate
	 * ChargesRecord2.Rate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the adjustment, allowance, charge or fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesRecord1.Rate, com.tools20022.repository.msg.ChargesRecord2.Rate);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Method used to calculate an adjustment (financial adjustment, charge or
	 * allowance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to calculate an adjustment (financial adjustment, charge or allowance)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Specifies the payment resulting from charges due by one party to another
	 * or the payment to which adjustements (for instance charges) are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Adjustments
	 * Payment.Adjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#CreditDebitIndicator
	 * DocumentAdjustment1.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Direction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.CreditDebitIndicator);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}
	};
	/**
	 * Reason for the amount adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1#Reason
	 * DocumentAdjustment1.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the amount adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.Reason);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the line item on which a financial adjustment took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#FinancialAdjustment
	 * LineItem.FinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item on which a financial adjustment took place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.FinancialAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge (Indicator
	 * is Yes) that should be added or an allowance that should be subtracted
	 * (Indicator is No).
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllowanceChargeIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the price which is adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#PriceAdjustment
	 * Price.PriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price which is adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.PriceAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargeIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#FeesAndCommissions
	 * CollateralManagement.FeesAndCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Adjustment
	 * Balance.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdjustedBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of charges due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#Adjustment
	 * ChargePartyRole.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChargePartyRole
	 * ChargePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of charges due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChargesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			type_lazy = () -> ChargePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the adjustment is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAdjustment
	 * DateTimePeriod.RelatedAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the adjustment is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency exchange for which adjustments such as fees or commissions are
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
	 * CurrencyExchange.Adjustment}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange for which adjustments such as fees or commissions are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
	 * SecuritiesOrder.Adjustments}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the calculation method resulting in the tax amount
	 * included in the charge transfer. The tax is expressed as a fixed amount,
	 * or as a percentage of the charge amount, upon which the tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Adjustment
	 * Tax.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Tax
	 * ChargesRecord1.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Tax
	 * ChargesRecord2.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesRecord1.Tax, com.tools20022.repository.msg.ChargesRecord2.Tax);
			elementContext_lazy = () -> Adjustment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Price.PriceAdjustment, com.tools20022.repository.entity.CurrencyExchange.Adjustment,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.ChargePartyRole.Adjustment, com.tools20022.repository.entity.LineItem.FinancialAdjustment,
						com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.AdjustmentAmountAndReason);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject(), Discount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.Amount, com.tools20022.repository.entity.Adjustment.ChargeRate, com.tools20022.repository.entity.Adjustment.CalculationMethod,
						com.tools20022.repository.entity.Adjustment.Payment, com.tools20022.repository.entity.Adjustment.Direction, com.tools20022.repository.entity.Adjustment.Reason,
						com.tools20022.repository.entity.Adjustment.RelatedLineItem, com.tools20022.repository.entity.Adjustment.AllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.Price,
						com.tools20022.repository.entity.Adjustment.ChargeIndicator, com.tools20022.repository.entity.Adjustment.Type, com.tools20022.repository.entity.Adjustment.CollateralManagement,
						com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Adjustment.ChargesPartyRole, com.tools20022.repository.entity.Adjustment.EffectivePeriod,
						com.tools20022.repository.entity.Adjustment.CurrencyExchange, com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.Adjustment.Tax);
				derivationComponent_lazy = () -> Arrays.asList(DocumentAdjustment1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}