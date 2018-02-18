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
import com.tools20022.repository.codeset.CSCManagement1Code;
import com.tools20022.repository.datatype.Min3Max4NumericText;
import com.tools20022.repository.entity.PaymentCard;
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
 * Card security code (CSC) associated with the card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCManagement
 * CardSecurityInformation1.mmCSCManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCValue
 * CardSecurityInformation1.mmCSCValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "CardSecurityInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card security code (CSC) associated with the card performing the transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardSecurityInformation1", propOrder = {"cSCManagement", "cSCValue"})
public class CardSecurityInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CSCMgmt", required = true)
	protected CSCManagement1Code cSCManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCodeManagement
	 * PaymentCard.mmSecurityCodeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1
	 * CardSecurityInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSCMgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card security code (CSC) management associated with the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSCManagement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSecurityCodeManagement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardSecurityInformation1.mmObject();
			isDerived = false;
			xmlTag = "CSCMgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCManagement";
			definition = "Card security code (CSC) management associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCManagement1Code.mmObject();
		}
	};
	@XmlElement(name = "CSCVal")
	protected Min3Max4NumericText cSCValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4NumericText
	 * Min3Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCode
	 * PaymentCard.mmSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1
	 * CardSecurityInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSCVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code (CSC)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSCValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSecurityCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardSecurityInformation1.mmObject();
			isDerived = false;
			xmlTag = "CSCVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCValue";
			definition = "Card security code (CSC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min3Max4NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardSecurityInformation1.mmCSCManagement, com.tools20022.repository.msg.CardSecurityInformation1.mmCSCValue);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardSecurityInformation1";
				definition = "Card security code (CSC) associated with the card performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public CSCManagement1Code getCSCManagement() {
		return cSCManagement;
	}

	public CardSecurityInformation1 setCSCManagement(CSCManagement1Code cSCManagement) {
		this.cSCManagement = Objects.requireNonNull(cSCManagement);
		return this;
	}

	public Optional<Min3Max4NumericText> getCSCValue() {
		return cSCValue == null ? Optional.empty() : Optional.of(cSCValue);
	}

	public CardSecurityInformation1 setCSCValue(Min3Max4NumericText cSCValue) {
		this.cSCValue = cSCValue;
		return this;
	}
}