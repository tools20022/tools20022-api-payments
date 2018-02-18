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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalMessage2;
import com.tools20022.repository.msg.OriginalMessage3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party initiating the payment to an agent. In the payment context, this can
 * either be the debtor (in a credit transfer), the creditor (in a direct
 * debit), or a party that initiates the payment on behalf of the debtor or
 * creditor. In the context of treasury, the party that instructs the trading
 * party to execute a treasury deal on its behalf.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InitiatingPartyRole" src="doc-files/InitiatingPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalSender
 * OriginalMessage2.mmOriginalSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalSender
 * OriginalMessage3.mmOriginalSender}</li>
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
 * "InitiatingPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party initiating the payment to an agent. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor. In the context of treasury, the party that instructs the trading party to execute a treasury deal on its behalf."
 * </li>
 * </ul>
 */
public class InitiatingPartyRole extends PaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InitiatingPartyRole";
				definition = "Party initiating the payment to an agent. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor. In the context of treasury, the party that instructs the trading party to execute a treasury deal on its behalf.";
				derivationElement_lazy = () -> Arrays.asList(OriginalMessage2.mmOriginalSender, OriginalMessage3.mmOriginalSender);
				superType_lazy = () -> PaymentPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return InitiatingPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}