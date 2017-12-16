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
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
 * Adjustment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
 * Adjustment.mmChargeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCalculationMethod
 * Adjustment.mmCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmDirection
 * Adjustment.mmDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmReason
 * Adjustment.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
 * Adjustment.mmRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAllowanceChargeIndicator
 * Adjustment.mmAllowanceChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
 * Adjustment.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeIndicator
 * Adjustment.mmChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmType
 * Adjustment.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCollateralManagement
 * Adjustment.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
 * Adjustment.mmAdjustedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargesPartyRole
 * Adjustment.mmChargesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
 * Adjustment.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
 * Adjustment.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
 * DateTimePeriod.mmRelatedAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
 * Balance.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
 * Price.mmPriceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
 * SecuritiesOrder.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
 * ChargePartyRole.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
 * LineItem.mmFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
 * CollateralManagement.mmFeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmAdjustmentAmountAndReason
 * RemittanceAmount3.mmAdjustmentAmountAndReason}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmAmount
	 * DocumentAdjustment1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmAmount
	 * ChargesRecord1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges3#mmTotalChargesAndTaxAmount
	 * Charges3.mmTotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#mmAmount
	 * DiscountAmountAndType1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmAmount
	 * ChargesRecord2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges4#mmTotalChargesAndTaxAmount
	 * Charges4.mmTotalChargesAndTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges2#mmAmount
	 * Charges2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmCompensationAmount
	 * PaymentTransaction81.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmCompensationAmount
	 * PaymentTransaction76.mmCompensationAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentAdjustment1.mmAmount, ChargesRecord1.mmAmount, Charges3.mmTotalChargesAndTaxAmount, DiscountAmountAndType1.mmAmount, ChargesRecord2.mmAmount, Charges4.mmTotalChargesAndTaxAmount,
					Charges2.mmAmount, PaymentTransaction81.mmCompensationAmount, PaymentTransaction76.mmCompensationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate chargeRate;
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
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmRate
	 * ChargesRecord1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmRate
	 * ChargesRecord2.mmRate}</li>
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
	public static final MMBusinessAttribute mmChargeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesRecord1.mmRate, ChargesRecord2.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getChargeRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxationBasisCode calculationMethod;
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
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getCalculationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Specifies the payment resulting from charges due by one party to another
	 * or the payment to which adjustements (for instance charges) are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
	 * Payment.mmAdjustments}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected AdjustmentDirectionCode direction;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmCreditDebitIndicator
	 * DocumentAdjustment1.mmCreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute mmDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentAdjustment1.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText reason;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmReason
	 * DocumentAdjustment1.mmReason}</li>
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
	public static final MMBusinessAttribute mmReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentAdjustment1.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LineItem relatedLineItem;
	/**
	 * Specifies the line item on which a financial adjustment took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmFinancialAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected YesNoIndicator allowanceChargeIndicator;
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
	public static final MMBusinessAttribute mmAllowanceChargeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getAllowanceChargeIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Price price;
	/**
	 * Specifies the price which is adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmPriceAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected YesNoIndicator chargeIndicator;
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
	public static final MMBusinessAttribute mmChargeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getChargeIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdjustmentTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
	 * CollateralManagement.mmFeesAndCommissions}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmFeesAndCommissions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected Balance adjustedBalance;
	/**
	 * Balance for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
	 * Balance.mmAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmAdjustedBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ChargePartyRole> chargesPartyRole;
	/**
	 * Role played by a party in the context of charges due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
	 * ChargePartyRole.mmAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmChargesPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.mmObject();
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * Period during which the adjustment is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
	 * DateTimePeriod.mmRelatedAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmEffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CurrencyExchange currencyExchange;
	/**
	 * Currency exchange for which adjustments such as fees or commissions are
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
	 * CurrencyExchange.mmAdjustment}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Order for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
	 * SecuritiesOrder.mmAdjustments}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Information on the calculation method resulting in the tax amount
	 * included in the charge transfer. The tax is expressed as a fixed amount,
	 * or as a percentage of the charge amount, upon which the tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
	 * Tax.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmTax
	 * ChargesRecord1.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmTax
	 * ChargesRecord2.mmTax}</li>
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
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesRecord1.mmTax, ChargesRecord2.mmTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment, com.tools20022.repository.entity.Tax.mmAdjustment, com.tools20022.repository.entity.Payment.mmAdjustments,
						com.tools20022.repository.entity.Balance.mmAdjustment, com.tools20022.repository.entity.Price.mmPriceAdjustment, com.tools20022.repository.entity.CurrencyExchange.mmAdjustment,
						com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments, com.tools20022.repository.entity.ChargePartyRole.mmAdjustment, com.tools20022.repository.entity.LineItem.mmFinancialAdjustment,
						com.tools20022.repository.entity.CollateralManagement.mmFeesAndCommissions);
				derivationElement_lazy = () -> Arrays.asList(RemittanceAmount3.mmAdjustmentAmountAndReason);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject(), Discount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.mmAmount, com.tools20022.repository.entity.Adjustment.mmChargeRate, com.tools20022.repository.entity.Adjustment.mmCalculationMethod,
						com.tools20022.repository.entity.Adjustment.mmPayment, com.tools20022.repository.entity.Adjustment.mmDirection, com.tools20022.repository.entity.Adjustment.mmReason,
						com.tools20022.repository.entity.Adjustment.mmRelatedLineItem, com.tools20022.repository.entity.Adjustment.mmAllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.mmPrice,
						com.tools20022.repository.entity.Adjustment.mmChargeIndicator, com.tools20022.repository.entity.Adjustment.mmType, com.tools20022.repository.entity.Adjustment.mmCollateralManagement,
						com.tools20022.repository.entity.Adjustment.mmAdjustedBalance, com.tools20022.repository.entity.Adjustment.mmChargesPartyRole, com.tools20022.repository.entity.Adjustment.mmEffectivePeriod,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder, com.tools20022.repository.entity.Adjustment.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(DocumentAdjustment1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Adjustment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getChargeRate() {
		return chargeRate;
	}

	public void setChargeRate(PercentageRate chargeRate) {
		this.chargeRate = chargeRate;
	}

	public TaxationBasisCode getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(TaxationBasisCode calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public AdjustmentDirectionCode getDirection() {
		return direction;
	}

	public void setDirection(AdjustmentDirectionCode direction) {
		this.direction = direction;
	}

	public Max4AlphaNumericText getReason() {
		return reason;
	}

	public void setReason(Max4AlphaNumericText reason) {
		this.reason = reason;
	}

	public LineItem getRelatedLineItem() {
		return relatedLineItem;
	}

	public void setRelatedLineItem(com.tools20022.repository.entity.LineItem relatedLineItem) {
		this.relatedLineItem = relatedLineItem;
	}

	public YesNoIndicator getAllowanceChargeIndicator() {
		return allowanceChargeIndicator;
	}

	public void setAllowanceChargeIndicator(YesNoIndicator allowanceChargeIndicator) {
		this.allowanceChargeIndicator = allowanceChargeIndicator;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.Price price) {
		this.price = price;
	}

	public YesNoIndicator getChargeIndicator() {
		return chargeIndicator;
	}

	public void setChargeIndicator(YesNoIndicator chargeIndicator) {
		this.chargeIndicator = chargeIndicator;
	}

	public AdjustmentTypeCode getType() {
		return type;
	}

	public void setType(AdjustmentTypeCode type) {
		this.type = type;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public void setCollateralManagement(com.tools20022.repository.entity.CollateralManagement collateralManagement) {
		this.collateralManagement = collateralManagement;
	}

	public Balance getAdjustedBalance() {
		return adjustedBalance;
	}

	public void setAdjustedBalance(com.tools20022.repository.entity.Balance adjustedBalance) {
		this.adjustedBalance = adjustedBalance;
	}

	public List<ChargePartyRole> getChargesPartyRole() {
		return chargesPartyRole;
	}

	public void setChargesPartyRole(List<com.tools20022.repository.entity.ChargePartyRole> chargesPartyRole) {
		this.chargesPartyRole = chargesPartyRole;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public CurrencyExchange getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(com.tools20022.repository.entity.CurrencyExchange currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}
}