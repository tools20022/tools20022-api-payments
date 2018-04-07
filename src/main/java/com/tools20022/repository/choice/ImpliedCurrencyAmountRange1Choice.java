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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountRangeBoundary1;
import com.tools20022.repository.msg.FromToAmountRange1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromAmount
 * ImpliedCurrencyAmountRange1Choice.mmFromAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmToAmount
 * ImpliedCurrencyAmountRange1Choice.mmToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromToAmount
 * ImpliedCurrencyAmountRange1Choice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmEqualAmount
 * ImpliedCurrencyAmountRange1Choice.mmEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmNotEqualAmount
 * ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount}</li>
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
 * "ImpliedCurrencyAmountRange1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ImpliedCurrencyAmountRange1Choice", propOrder = {"fromAmount", "toAmount", "fromToAmount", "equalAmount", "notEqualAmount"})
public class ImpliedCurrencyAmountRange1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrAmt", required = true)
	protected AmountRangeBoundary1 fromAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
	 * AmountRange.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
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
	public static final MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, AmountRangeBoundary1> mmFromAmount = new MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, AmountRangeBoundary1>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmFromAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}

		@Override
		public AmountRangeBoundary1 getValue(ImpliedCurrencyAmountRange1Choice obj) {
			return obj.getFromAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRange1Choice obj, AmountRangeBoundary1 value) {
			obj.setFromAmount(value);
		}
	};
	@XmlElement(name = "ToAmt", required = true)
	protected AmountRangeBoundary1 toAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
	 * AmountRange.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
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
	public static final MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, AmountRangeBoundary1> mmToAmount = new MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, AmountRangeBoundary1>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmToAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}

		@Override
		public AmountRangeBoundary1 getValue(ImpliedCurrencyAmountRange1Choice obj) {
			return obj.getToAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRange1Choice obj, AmountRangeBoundary1 value) {
			obj.setToAmount(value);
		}
	};
	@XmlElement(name = "FrToAmt", required = true)
	protected FromToAmountRange1 fromToAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange1
	 * FromToAmountRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
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
	public static final MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, FromToAmountRange1> mmFromToAmount = new MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, FromToAmountRange1>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToAmount";
			definition = "Range of valid amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FromToAmountRange1.mmObject();
		}

		@Override
		public FromToAmountRange1 getValue(ImpliedCurrencyAmountRange1Choice obj) {
			return obj.getFromToAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRange1Choice obj, FromToAmountRange1 value) {
			obj.setFromToAmount(value);
		}
	};
	@XmlElement(name = "EQAmt", required = true)
	protected ImpliedCurrencyAndAmount equalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmEqualAmount
	 * AmountRange.mmEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
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
	public static final MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, ImpliedCurrencyAndAmount> mmEqualAmount = new MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmEqualAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ImpliedCurrencyAmountRange1Choice obj) {
			return obj.getEqualAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRange1Choice obj, ImpliedCurrencyAndAmount value) {
			obj.setEqualAmount(value);
		}
	};
	@XmlElement(name = "NEQAmt", required = true)
	protected ImpliedCurrencyAndAmount notEqualAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmNotEqualAmount
	 * AmountRange.mmNotEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
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
	public static final MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, ImpliedCurrencyAndAmount> mmNotEqualAmount = new MMMessageAttribute<ImpliedCurrencyAmountRange1Choice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmNotEqualAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ImpliedCurrencyAmountRange1Choice obj) {
			return obj.getNotEqualAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRange1Choice obj, ImpliedCurrencyAndAmount value) {
			obj.setNotEqualAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmFromAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmToAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmFromToAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmEqualAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ImpliedCurrencyAmountRange1Choice";
				definition = "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRangeBoundary1 getFromAmount() {
		return fromAmount;
	}

	public ImpliedCurrencyAmountRange1Choice setFromAmount(AmountRangeBoundary1 fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary1 getToAmount() {
		return toAmount;
	}

	public ImpliedCurrencyAmountRange1Choice setToAmount(AmountRangeBoundary1 toAmount) {
		this.toAmount = Objects.requireNonNull(toAmount);
		return this;
	}

	public FromToAmountRange1 getFromToAmount() {
		return fromToAmount;
	}

	public ImpliedCurrencyAmountRange1Choice setFromToAmount(FromToAmountRange1 fromToAmount) {
		this.fromToAmount = Objects.requireNonNull(fromToAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getEqualAmount() {
		return equalAmount;
	}

	public ImpliedCurrencyAmountRange1Choice setEqualAmount(ImpliedCurrencyAndAmount equalAmount) {
		this.equalAmount = Objects.requireNonNull(equalAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getNotEqualAmount() {
		return notEqualAmount;
	}

	public ImpliedCurrencyAmountRange1Choice setNotEqualAmount(ImpliedCurrencyAndAmount notEqualAmount) {
		this.notEqualAmount = Objects.requireNonNull(notEqualAmount);
		return this;
	}
}