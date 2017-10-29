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
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.entity.SettlementTimeRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the requested settlement time(s) of the payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#CLSTime
 * SettlementTimeRequest2.CLSTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#TillTime
 * SettlementTimeRequest2.TillTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#FromTime
 * SettlementTimeRequest2.FromTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#RejectTime
 * SettlementTimeRequest2.RejectTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
 * SettlementTimeRequest}</li>
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
 * "SettlementTimeRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information on the requested settlement time(s) of the payment instruction."
 * </li>
 * </ul>
 */
public class SettlementTimeRequest2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Time by which the amount of money must be credited, with confirmation, to
	 * the CLS Bank's account at the central bank. Usage: Time must be expressed
	 * in Central European Time (CET).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#CLSTime
	 * SettlementTimeRequest.CLSTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CLSTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\nUsage: Time must be expressed in Central European Time (CET)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CLSTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementTimeRequest2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.CLSTime;
			isDerived = false;
			xmlTag = "CLSTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CLSTime";
			definition = "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\nUsage: Time must be expressed in Central European Time (CET).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Time until when the payment may be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#TillTime
	 * SettlementTimeRequest.TillTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TillTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TillTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time until when the payment may be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TillTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementTimeRequest2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.TillTime;
			isDerived = false;
			xmlTag = "TillTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TillTime";
			definition = "Time until when the payment may be settled.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Time as from when the payment may be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#FromTime
	 * SettlementTimeRequest.FromTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time as from when the payment may be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FromTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementTimeRequest2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.FromTime;
			isDerived = false;
			xmlTag = "FrTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromTime";
			definition = "Time as from when the payment may be settled.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Time by when the payment must be settled to avoid rejection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#RejectTime
	 * SettlementTimeRequest.RejectTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time by when the payment must be settled to avoid rejection."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RejectTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementTimeRequest2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.RejectTime;
			isDerived = false;
			xmlTag = "RjctTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectTime";
			definition = "Time by when the payment must be settled to avoid rejection.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTimeRequest2.CLSTime, com.tools20022.repository.msg.SettlementTimeRequest2.TillTime,
						com.tools20022.repository.msg.SettlementTimeRequest2.FromTime, com.tools20022.repository.msg.SettlementTimeRequest2.RejectTime);
				trace_lazy = () -> SettlementTimeRequest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTimeRequest2";
				definition = "Provides information on the requested settlement time(s) of the payment instruction.";
			}
		});
		return mmObject_lazy.get();
	}
}