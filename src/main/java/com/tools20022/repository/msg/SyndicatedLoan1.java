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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Percentage;
import com.tools20022.repository.entity.Loan;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Loan offered by a group of lenders (called a syndicate) who work together to
 * lend an amount of money to a single borrower.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#Borrower
 * SyndicatedLoan1.Borrower}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#Lender
 * SyndicatedLoan1.Lender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#Amount
 * SyndicatedLoan1.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#Share
 * SyndicatedLoan1.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#ExchangeRateInformation
 * SyndicatedLoan1.ExchangeRateInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
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
 * "SyndicatedLoan1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Loan offered by a group of lenders (called a syndicate) who work together to lend an amount of money to a single borrower."
 * </li>
 * </ul>
 */
public class SyndicatedLoan1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party which obtains the loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Borrower Borrower}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brrwr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which obtains the loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Borrower = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SyndicatedLoan1.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Borrower.mmObject();
			isDerived = false;
			xmlTag = "Brrwr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrower";
			definition = "Party which obtains the loan.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party which provides an amount of money available to others to borrow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lender Lender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which provides an amount of money available to others to borrow."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Lender = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SyndicatedLoan1.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Lender.mmObject();
			isDerived = false;
			xmlTag = "Lndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lender";
			definition = "Party which provides an amount of money available to others to borrow.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> TradeParty2.mmObject();
		}
	};
	/**
	 * Amount of the part in the syndicated loan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Loan#PrincipalAmount
	 * Loan.PrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the part in the syndicated loan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SyndicatedLoan1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.PrincipalAmount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of the part in the syndicated loan.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Share of the part in the syndicated loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Percentage
	 * Percentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
	 * Allocation.AllocatedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Shr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Share of the part in the syndicated loan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Share = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SyndicatedLoan1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedQuantity;
			isDerived = false;
			xmlTag = "Shr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Share of the part in the syndicated loan.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Percentage.mmObject();
		}
	};
	/**
	 * Provides details on the currency exchange rate and contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeRate1
	 * ExchangeRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
	 * PaymentObligation.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRateInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the currency exchange rate and contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ExchangeRateInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SyndicatedLoan1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation;
			isDerived = false;
			xmlTag = "XchgRateInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Provides details on the currency exchange rate and contract.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExchangeRate1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SyndicatedLoan1.Borrower, com.tools20022.repository.msg.SyndicatedLoan1.Lender, com.tools20022.repository.msg.SyndicatedLoan1.Amount,
						com.tools20022.repository.msg.SyndicatedLoan1.Share, com.tools20022.repository.msg.SyndicatedLoan1.ExchangeRateInformation);
				trace_lazy = () -> Loan.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SyndicatedLoan1";
				definition = "Loan offered by a group of lenders (called a syndicate) who work together to lend an amount of money to a single borrower.";
			}
		});
		return mmObject_lazy.get();
	}
}