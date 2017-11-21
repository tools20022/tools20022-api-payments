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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Range of sequence numbers related to card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1#mmFirstTransaction
 * CardSequenceNumberRange1.mmFirstTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1#mmLastTransaction
 * CardSequenceNumberRange1.mmLastTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardSequenceNumberRange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Range of sequence numbers related to card transactions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardSequenceNumberRange1", propOrder = {"firstTransaction", "lastTransaction"})
public class CardSequenceNumberRange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text firstTransaction;
	/**
	 * CardSequenceNumberRange1:FirstTransactionSequenceNumberMessage element to
	 * be finalised once feedback from Card SEG has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1
	 * CardSequenceNumberRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CardSequenceNumberRange1:FirstTransactionSequenceNumberMessage element to be finalised once feedback from Card SEG has been received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardSequenceNumberRange1.mmObject();
			isDerived = false;
			xmlTag = "FrstTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstTransaction";
			definition = "CardSequenceNumberRange1:FirstTransactionSequenceNumberMessage element to be finalised once feedback from Card SEG has been received.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text lastTransaction;
	/**
	 * CardSequenceNumberRange1:LastTransactionSequenceNumberMessage element to
	 * be finalised once feedback from Card SEG has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1
	 * CardSequenceNumberRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CardSequenceNumberRange1:LastTransactionSequenceNumberMessage element to be finalised once feedback from Card SEG has been received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardSequenceNumberRange1.mmObject();
			isDerived = false;
			xmlTag = "LastTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTransaction";
			definition = "CardSequenceNumberRange1:LastTransactionSequenceNumberMessage element to be finalised once feedback from Card SEG has been received.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardSequenceNumberRange1.mmFirstTransaction, CardSequenceNumberRange1.mmLastTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardSequenceNumberRange1";
				definition = "Range of sequence numbers related to card transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrstTx")
	public Max35Text getFirstTransaction() {
		return firstTransaction;
	}

	public void setFirstTransaction(Max35Text firstTransaction) {
		this.firstTransaction = firstTransaction;
	}

	@XmlElement(name = "LastTx")
	public Max35Text getLastTransaction() {
		return lastTransaction;
	}

	public void setLastTransaction(Max35Text lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
}