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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the original amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmInstructedAmount
 * AmountAndCurrencyExchange3.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmTransactionAmount
 * AmountAndCurrencyExchange3.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmCounterValueAmount
 * AmountAndCurrencyExchange3.mmCounterValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmAnnouncedPostingAmount
 * AmountAndCurrencyExchange3.mmAnnouncedPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmProprietaryAmount
 * AmountAndCurrencyExchange3.mmProprietaryAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
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
 * "AmountAndCurrencyExchange3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the original amount."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountAndCurrencyExchange3", propOrder = {"instructedAmount", "transactionAmount", "counterValueAmount", "announcedPostingAmount", "proprietaryAmount"})
public class AmountAndCurrencyExchange3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstdAmt")
	protected AmountAndCurrencyExchangeDetails3 instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party and provides currency exchange information in case the instructed amount and/or currency is/are different from the entry amount and/or currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Identifies the amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party and provides currency exchange information in case the instructed amount and/or currency is/are different from the entry amount and/or currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.mmObject();
		}
	};
	@XmlElement(name = "TxAmt")
	protected AmountAndCurrencyExchangeDetails3 transactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Amount of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.mmObject();
		}
	};
	@XmlElement(name = "CntrValAmt")
	protected AmountAndCurrencyExchangeDetails3 counterValueAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
	 * CurrencyExchange.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrValAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the countervalue amount and  currency exchange information. \nUsage: This can be either the counter amount quoted in an FX deal, or the result of the currency information applied to an instructed amount, before deduction of charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterValueAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
			isDerived = false;
			xmlTag = "CntrValAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterValueAmount";
			definition = "Set of elements used to provide the countervalue amount and  currency exchange information. \nUsage: This can be either the counter amount quoted in an FX deal, or the result of the currency information applied to an instructed amount, before deduction of charges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.mmObject();
		}
	};
	@XmlElement(name = "AnncdPstngAmt")
	protected AmountAndCurrencyExchangeDetails3 announcedPostingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
	 * CorporateActionDistribution.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncdPstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncedPostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\nIn some situations, this amount may alternatively be called entitled amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAnnouncedPostingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
			isDerived = false;
			xmlTag = "AnncdPstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncedPostingAmount";
			definition = "Amount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\nIn some situations, this amount may alternatively be called entitled amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.mmObject();
		}
	};
	@XmlElement(name = "PrtryAmt")
	protected List<com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4> proprietaryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4
	 * AmountAndCurrencyExchangeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original amount and currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
			isDerived = false;
			xmlTag = "PrtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryAmount";
			definition = "Set of elements used to provide information on the original amount and currency exchange.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmInstructedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmTransactionAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmCounterValueAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmAnnouncedPostingAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmProprietaryAmount);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountAndCurrencyExchange3";
				definition = "Set of elements used to provide information on the original amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndCurrencyExchangeDetails3> getInstructedAmount() {
		return instructedAmount == null ? Optional.empty() : Optional.of(instructedAmount);
	}

	public AmountAndCurrencyExchange3 setInstructedAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3 instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails3> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public AmountAndCurrencyExchange3 setTransactionAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3 transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails3> getCounterValueAmount() {
		return counterValueAmount == null ? Optional.empty() : Optional.of(counterValueAmount);
	}

	public AmountAndCurrencyExchange3 setCounterValueAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3 counterValueAmount) {
		this.counterValueAmount = counterValueAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails3> getAnnouncedPostingAmount() {
		return announcedPostingAmount == null ? Optional.empty() : Optional.of(announcedPostingAmount);
	}

	public AmountAndCurrencyExchange3 setAnnouncedPostingAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3 announcedPostingAmount) {
		this.announcedPostingAmount = announcedPostingAmount;
		return this;
	}

	public List<AmountAndCurrencyExchangeDetails4> getProprietaryAmount() {
		return proprietaryAmount == null ? proprietaryAmount = new ArrayList<>() : proprietaryAmount;
	}

	public AmountAndCurrencyExchange3 setProprietaryAmount(List<com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4> proprietaryAmount) {
		this.proprietaryAmount = Objects.requireNonNull(proprietaryAmount);
		return this;
	}
}