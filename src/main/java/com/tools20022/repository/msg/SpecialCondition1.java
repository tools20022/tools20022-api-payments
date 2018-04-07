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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Special conditions for the loan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmount
 * SpecialCondition1.mmIncomingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmOutgoingAmount
 * SpecialCondition1.mmOutgoingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmountToOtherAccount
 * SpecialCondition1.mmIncomingAmountToOtherAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmPaymentFromOtherAccount
 * SpecialCondition1.mmPaymentFromOtherAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "SpecialCondition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Special conditions for the loan."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SpecialCondition1", propOrder = {"incomingAmount", "outgoingAmount", "incomingAmountToOtherAccount", "paymentFromOtherAccount"})
public class SpecialCondition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IncmgAmt", required = true)
	protected ActiveCurrencyAndAmount incomingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incoming amount on special conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SpecialCondition1, ActiveCurrencyAndAmount> mmIncomingAmount = new MMMessageAttribute<SpecialCondition1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SpecialCondition1.mmObject();
			isDerived = false;
			xmlTag = "IncmgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomingAmount";
			definition = "Incoming amount on special conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SpecialCondition1 obj) {
			return obj.getIncomingAmount();
		}

		@Override
		public void setValue(SpecialCondition1 obj, ActiveCurrencyAndAmount value) {
			obj.setIncomingAmount(value);
		}
	};
	@XmlElement(name = "OutgngAmt", required = true)
	protected ActiveCurrencyAndAmount outgoingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutgngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutgoingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outgoing amount on special conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SpecialCondition1, ActiveCurrencyAndAmount> mmOutgoingAmount = new MMMessageAttribute<SpecialCondition1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SpecialCondition1.mmObject();
			isDerived = false;
			xmlTag = "OutgngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutgoingAmount";
			definition = "Outgoing amount on special conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SpecialCondition1 obj) {
			return obj.getOutgoingAmount();
		}

		@Override
		public void setValue(SpecialCondition1 obj, ActiveCurrencyAndAmount value) {
			obj.setOutgoingAmount(value);
		}
	};
	@XmlElement(name = "IncmgAmtToOthrAcct")
	protected ActiveCurrencyAndAmount incomingAmountToOtherAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmgAmtToOthrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomingAmountToOtherAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incoming amount to other account on special conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SpecialCondition1, Optional<ActiveCurrencyAndAmount>> mmIncomingAmountToOtherAccount = new MMMessageAttribute<SpecialCondition1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SpecialCondition1.mmObject();
			isDerived = false;
			xmlTag = "IncmgAmtToOthrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomingAmountToOtherAccount";
			definition = "Incoming amount to other account on special conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SpecialCondition1 obj) {
			return obj.getIncomingAmountToOtherAccount();
		}

		@Override
		public void setValue(SpecialCondition1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIncomingAmountToOtherAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFrOthrAcct")
	protected ActiveCurrencyAndAmount paymentFromOtherAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrOthrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFromOtherAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Outgoing payment amount from other account on special conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SpecialCondition1, Optional<ActiveCurrencyAndAmount>> mmPaymentFromOtherAccount = new MMMessageAttribute<SpecialCondition1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SpecialCondition1.mmObject();
			isDerived = false;
			xmlTag = "PmtFrOthrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFromOtherAccount";
			definition = "Outgoing payment amount from other account on special conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SpecialCondition1 obj) {
			return obj.getPaymentFromOtherAccount();
		}

		@Override
		public void setValue(SpecialCondition1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPaymentFromOtherAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SpecialCondition1.mmIncomingAmount, com.tools20022.repository.msg.SpecialCondition1.mmOutgoingAmount,
						com.tools20022.repository.msg.SpecialCondition1.mmIncomingAmountToOtherAccount, com.tools20022.repository.msg.SpecialCondition1.mmPaymentFromOtherAccount);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecialCondition1";
				definition = "Special conditions for the loan.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getIncomingAmount() {
		return incomingAmount;
	}

	public SpecialCondition1 setIncomingAmount(ActiveCurrencyAndAmount incomingAmount) {
		this.incomingAmount = Objects.requireNonNull(incomingAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getOutgoingAmount() {
		return outgoingAmount;
	}

	public SpecialCondition1 setOutgoingAmount(ActiveCurrencyAndAmount outgoingAmount) {
		this.outgoingAmount = Objects.requireNonNull(outgoingAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIncomingAmountToOtherAccount() {
		return incomingAmountToOtherAccount == null ? Optional.empty() : Optional.of(incomingAmountToOtherAccount);
	}

	public SpecialCondition1 setIncomingAmountToOtherAccount(ActiveCurrencyAndAmount incomingAmountToOtherAccount) {
		this.incomingAmountToOtherAccount = incomingAmountToOtherAccount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPaymentFromOtherAccount() {
		return paymentFromOtherAccount == null ? Optional.empty() : Optional.of(paymentFromOtherAccount);
	}

	public SpecialCondition1 setPaymentFromOtherAccount(ActiveCurrencyAndAmount paymentFromOtherAccount) {
		this.paymentFromOtherAccount = paymentFromOtherAccount;
		return this;
	}
}