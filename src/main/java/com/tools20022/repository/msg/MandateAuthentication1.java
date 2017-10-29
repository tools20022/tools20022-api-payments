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
import com.tools20022.repository.choice.AuthenticationChannel1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.entity.Authentication;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transport authentication details related to the mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#MessageAuthenticationCode
 * MandateAuthentication1.MessageAuthenticationCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAuthentication1#Date
 * MandateAuthentication1.Date}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAuthentication1#Channel
 * MandateAuthentication1.Channel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "MandateAuthentication1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transport authentication details related to the mandate."</li>
 * </ul>
 */
public class MandateAuthentication1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a piece of information used to authenticate a message, that is
	 * to confirm that the message came from the stated sender (its
	 * authenticity) and has not been changed in transit (its integrity).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationEntity
	 * Authentication.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1
	 * MandateAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgAuthntcnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageAuthenticationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a piece of information used to authenticate a message, that is  to confirm that the message came from the stated sender (its authenticity) and has not been changed in transit (its integrity)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MessageAuthenticationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationEntity;
			isDerived = false;
			xmlTag = "MsgAuthntcnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageAuthenticationCode";
			definition = "Specifies a piece of information used to authenticate a message, that is  to confirm that the message came from the stated sender (its authenticity) and has not been changed in transit (its integrity).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Date when the authentication was conducted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#Date
	 * ObligationFulfilment.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1
	 * MandateAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the authentication was conducted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.Date;
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date when the authentication was conducted.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Channel used to transmit the authentication information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuthenticationChannel1Choice
	 * AuthenticationChannel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationMethod
	 * Authentication.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1
	 * MandateAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Channel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel used to transmit the authentication information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Channel = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationMethod;
			isDerived = false;
			xmlTag = "Chanl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Channel";
			definition = "Channel used to transmit the authentication information.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AuthenticationChannel1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAuthentication1.MessageAuthenticationCode, com.tools20022.repository.msg.MandateAuthentication1.Date,
						com.tools20022.repository.msg.MandateAuthentication1.Channel);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateAuthentication1";
				definition = "Specifies the transport authentication details related to the mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}