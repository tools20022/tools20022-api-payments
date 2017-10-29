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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.DiscountAmountType1Choice;
import com.tools20022.repository.codeset.DiscountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.DiscountAmountAndType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decrease of the value of goods and / or services by applying a discount rate
 * to the original amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discount" src="doc-files/Discount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#DiscountAppliedAmount
 * Discount.DiscountAppliedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount#DiscountType
 * Discount.DiscountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#DiscountBasisAmount
 * Discount.DiscountBasisAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#Type
 * DiscountAmountAndType1.Type}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DiscountAmountType1Choice
 * DiscountAmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DiscountAmountAndType1
 * DiscountAmountAndType1}</li>
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
 * "Discount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decrease of the value of goods and / or services by applying a discount rate to the original amount."
 * </li>
 * </ul>
 */
public class Discount extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money that results from the application of an agreed discount
	 * to the amount due and payable to the creditor.
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#DiscountAppliedAmount
	 * RemittanceAmount2.DiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#DiscountAppliedAmount
	 * RemittanceAmount3.DiscountAppliedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DiscountAppliedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.DiscountAppliedAmount, com.tools20022.repository.msg.RemittanceAmount3.DiscountAppliedAmount);
			elementContext_lazy = () -> Discount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the type of discount applied to the original amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountAmountType1Choice#Code
	 * DiscountAmountType1Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of discount applied to the original amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DiscountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DiscountAmountType1Choice.Code);
			elementContext_lazy = () -> Discount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountType";
			definition = "Specifies the type of discount applied to the original amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DiscountTypeCode.mmObject();
		}
	};
	/**
	 * Amount used as a basis to calculate the discount amount.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount used as a basis to calculate the discount amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DiscountBasisAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Amount used as a basis to calculate the discount amount.";
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
				name = "Discount";
				definition = "Decrease of the value of goods and / or services by applying a discount rate to the original amount.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscountAmountAndType1.Type);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discount.DiscountAppliedAmount, com.tools20022.repository.entity.Discount.DiscountType, com.tools20022.repository.entity.Discount.DiscountBasisAmount);
				derivationComponent_lazy = () -> Arrays.asList(DiscountAmountType1Choice.mmObject(), DiscountAmountAndType1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}