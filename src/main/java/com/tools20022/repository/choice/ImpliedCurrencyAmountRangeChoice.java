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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.msg.AmountRangeBoundary1;
import com.tools20022.repository.msg.FromToAmountRange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between ranges of values in which an amount is considered valid or a
 * specified amount value which has to be matched or unmatched to be valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#FromAmount
 * ImpliedCurrencyAmountRangeChoice.FromAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#ToAmount
 * ImpliedCurrencyAmountRangeChoice.ToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#FromToAmount
 * ImpliedCurrencyAmountRangeChoice.FromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#EqualAmount
 * ImpliedCurrencyAmountRangeChoice.EqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#NotEqualAmount
 * ImpliedCurrencyAmountRangeChoice.NotEqualAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRange
 * AmountRange}</li>
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
 * "ImpliedCurrencyAmountRangeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid."
 * </li>
 * </ul>
 */
public class ImpliedCurrencyAmountRangeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Lower boundary of a range of amount values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#FromAmount
	 * AmountRange.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FromAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AmountRange.FromAmount;
			isDerived = false;
			xmlTag = "FrAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}
	};
	/**
	 * Upper boundary of a range of amount values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#ToAmount
	 * AmountRange.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ToAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AmountRange.ToAmount;
			isDerived = false;
			xmlTag = "ToAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}
	};
	/**
	 * Range of valid amount values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange
	 * FromToAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of valid amount values."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FromToAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			xmlTag = "FrToAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToAmount";
			definition = "Range of valid amount values.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> FromToAmountRange.mmObject();
		}
	};
	/**
	 * Exact value an amount must match to be considered valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#EqualAmount
	 * AmountRange.EqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact value an amount must match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EqualAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AmountRange.EqualAmount;
			isDerived = false;
			xmlTag = "EQAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value that an amount must not match to be considered valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#NotEqualAmount
	 * AmountRange.NotEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that an amount must not match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NotEqualAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AmountRange.NotEqualAmount;
			isDerived = false;
			xmlTag = "NEQAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.FromAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.ToAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.FromToAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.EqualAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.NotEqualAmount);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ImpliedCurrencyAmountRangeChoice";
				definition = "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid.";
			}
		});
		return mmObject_lazy.get();
	}
}