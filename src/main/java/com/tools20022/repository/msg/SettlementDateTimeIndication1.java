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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CashSettlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information on the occurred settlement time(s) of the payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#DebitDateTime
 * SettlementDateTimeIndication1.DebitDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#CreditDateTime
 * SettlementDateTimeIndication1.CreditDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
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
 * "SettlementDateTimeIndication1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the occurred settlement time(s) of the payment transaction."</li>
 * </ul>
 */
public class SettlementDateTimeIndication1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which a payment has been debited at the transaction
	 * administrator. In the case of TARGET, the date and time at which the
	 * payment has been debited at the central bank, expressed in Central
	 * European Time (CET).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#DebitDateTime
	 * CashSettlement.DebitDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
	 * SettlementDateTimeIndication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a payment has been debited at the transaction administrator. In the case of TARGET, the date and time at which the payment has been debited at the central bank, expressed in Central European Time (CET)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute DebitDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementDateTimeIndication1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.DebitDateTime;
			isDerived = false;
			xmlTag = "DbtDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitDateTime";
			definition = "Date and time at which a payment has been debited at the transaction administrator. In the case of TARGET, the date and time at which the payment has been debited at the central bank, expressed in Central European Time (CET).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which a payment has been credited at the transaction
	 * administrator. In the case of TARGET, the date and time at which the
	 * payment has been credited at the receiving central bank, expressed in
	 * Central European Time (CET).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#CreditDateTime
	 * CashSettlement.CreditDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
	 * SettlementDateTimeIndication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a payment has been credited at the transaction administrator. In the case of TARGET, the date and time at which the payment has been credited at the receiving central bank, expressed in Central European Time (CET)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreditDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementDateTimeIndication1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.CreditDateTime;
			isDerived = false;
			xmlTag = "CdtDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDateTime";
			definition = "Date and time at which a payment has been credited at the transaction administrator. In the case of TARGET, the date and time at which the payment has been credited at the receiving central bank, expressed in Central European Time (CET).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.DebitDateTime, com.tools20022.repository.msg.SettlementDateTimeIndication1.CreditDateTime);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementDateTimeIndication1";
				definition = "Information on the occurred settlement time(s) of the payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}