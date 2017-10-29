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
import com.tools20022.repository.codeset.AuthenticationEntity1Code;
import com.tools20022.repository.codeset.AuthenticationMethod1Code;
import com.tools20022.repository.entity.Authentication;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#AuthenticationMethod
 * CardholderAuthentication2.AuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#AuthenticationEntity
 * CardholderAuthentication2.AuthenticationEntity}</li>
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
 * "CardholderAuthentication2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
public class CardholderAuthentication2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method used to authenticate the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationMethod
	 * Authentication.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to authenticate the cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AuthenticationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationMethod;
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate the cardholder.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * Entity or object in charge of verifying the cardholder authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationEntity
	 * Authentication.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity or object in charge of verifying the cardholder authenticity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AuthenticationEntity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationEntity;
			isDerived = false;
			xmlTag = "AuthntcnNtty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the cardholder authenticity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntity1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication2.AuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication2.AuthenticationEntity);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication2";
				definition = "Data related to the authentication of the cardholder.";
			}
		});
		return mmObject_lazy.get();
	}
}