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
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Card transaction entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#Card
 * CardEntry2.Card}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#POI CardEntry2.POI}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#AggregatedEntry
 * CardEntry2.AggregatedEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#PrePaidAccount
 * CardEntry2.PrePaidAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardEntry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card transaction entry."</li>
 * </ul>
 */
public class CardEntry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Electronic money product that provides the cardholder with a portable and
	 * specialised computer device, which typically contains a microprocessor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard4
	 * PaymentCard4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
	 * CardPayment.PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Card = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardEntry2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Physical or logical card payment terminal containing software and
	 * hardware components.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
	 * CardPaymentAcquiring.PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical or logical card payment terminal containing software and hardware components."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd POI = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardEntry2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction;
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Physical or logical card payment terminal containing software and hardware components.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PointOfInteraction1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Card entry details, based on card transaction aggregated data performed
	 * by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtdNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card entry details, based on card transaction aggregated data performed by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AggregatedEntry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardEntry2.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "AggtdNtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatedEntry";
			definition = "Card entry details, based on card transaction aggregated data performed by the account servicer.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardAggregated1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Prepaid account for the transfer or loading of an amount of money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
	 * PaymentCard.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry2
	 * CardEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrePdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaidAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prepaid account for the transfer or loading of an amount of money."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PrePaidAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardEntry2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.RelatedAccount;
			isDerived = false;
			xmlTag = "PrePdAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaidAccount";
			definition = "Prepaid account for the transfer or loading of an amount of money.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry2.Card, com.tools20022.repository.msg.CardEntry2.POI, com.tools20022.repository.msg.CardEntry2.AggregatedEntry,
						com.tools20022.repository.msg.CardEntry2.PrePaidAccount);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardEntry2";
				definition = "Card transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}
}