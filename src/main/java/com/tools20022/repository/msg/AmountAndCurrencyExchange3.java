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
import com.tools20022.repository.entity.CashEntry;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#InstructedAmount
 * AmountAndCurrencyExchange3.InstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#TransactionAmount
 * AmountAndCurrencyExchange3.TransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#CounterValueAmount
 * AmountAndCurrencyExchange3.CounterValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#AnnouncedPostingAmount
 * AmountAndCurrencyExchange3.AnnouncedPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#ProprietaryAmount
 * AmountAndCurrencyExchange3.ProprietaryAmount}</li>
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
public class AmountAndCurrencyExchange3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the amount of money to be moved between the debtor and
	 * creditor, before deduction of charges, expressed in the currency as
	 * ordered by the initiating party and provides currency exchange
	 * information in case the instructed amount and/or currency is/are
	 * different from the entry amount and/or currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#InstructedAmount
	 * Payment.InstructedAmount}</li>
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
	public static final MMMessageAssociationEnd InstructedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructedAmount;
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Identifies the amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party and provides currency exchange information in case the instructed amount and/or currency is/are different from the entry amount and/or currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrencyExchangeDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#OriginalAmount
	 * CurrencyExchange.OriginalAmount}</li>
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
	public static final MMMessageAssociationEnd TransactionAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.OriginalAmount;
			isDerived = false;
			xmlTag = "TxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Amount of the underlying transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrencyExchangeDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to provide the countervalue amount and currency
	 * exchange information. Usage: This can be either the counter amount quoted
	 * in an FX deal, or the result of the currency information applied to an
	 * instructed amount, before deduction of charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ResultingAmount
	 * CurrencyExchange.ResultingAmount}</li>
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
	public static final MMMessageAssociationEnd CounterValueAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.ResultingAmount;
			isDerived = false;
			xmlTag = "CntrValAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterValueAmount";
			definition = "Set of elements used to provide the countervalue amount and  currency exchange information. \nUsage: This can be either the counter amount quoted in an FX deal, or the result of the currency information applied to an instructed amount, before deduction of charges.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrencyExchangeDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of money, based on terms of corporate action event and balance of
	 * underlying securities, entitled to/from the account owner. In some
	 * situations, this amount may alternatively be called entitled amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingAmount
	 * CorporateActionDistribution.PostingAmount}</li>
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
	public static final MMMessageAssociationEnd AnnouncedPostingAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.PostingAmount;
			isDerived = false;
			xmlTag = "AnncdPstngAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncedPostingAmount";
			definition = "Amount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\nIn some situations, this amount may alternatively be called entitled amount.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrencyExchangeDetails3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to provide information on the original amount and
	 * currency exchange.
	 * <p>
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
	public static final MMMessageAssociationEnd ProprietaryAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountAndCurrencyExchange3.mmObject();
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			xmlTag = "PrtryAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryAmount";
			definition = "Set of elements used to provide information on the original amount and currency exchange.";
			minOccurs = 0;
			type_lazy = () -> AmountAndCurrencyExchangeDetails4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.InstructedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.TransactionAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange3.CounterValueAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.AnnouncedPostingAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange3.ProprietaryAmount);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountAndCurrencyExchange3";
				definition = "Set of elements used to provide information on the original amount.";
			}
		});
		return mmObject_lazy.get();
	}
}