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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide further means of referencing a payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#InstructionIdentification
 * PaymentIdentification3.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#EndToEndIdentification
 * PaymentIdentification3.EndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#TransactionIdentification
 * PaymentIdentification3.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#ClearingSystemReference
 * PaymentIdentification3.ClearingSystemReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
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
 * "PaymentIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide further means of referencing a payment transaction."
 * </li>
 * </ul>
 */
public class PaymentIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the instruction.
	 * 
	 * Usage: The instruction identification is a point to point reference that
	 * can be used between the instructing party and the instructed party to
	 * refer to the individual instruction. It can be included in several
	 * messages related to the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#InstructionIdentification
	 * PaymentIdentification.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.\n\nUsage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentIdentification3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification;
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.\n\nUsage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the initiating party, to
	 * unambiguously identify the transaction. This identification is passed on,
	 * unchanged, throughout the entire end-to-end chain.
	 * 
	 * Usage: The end-to-end identification can be used for reconciliation or to
	 * link tasks relating to the transaction. It can be included in several
	 * messages related to the transaction.
	 * 
	 * Usage: In case there are technical limitations to pass on multiple
	 * references, the end-to-end identification must be passed on throughout
	 * the entire end-to-end chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#EndToEndIdentification
	 * PaymentIdentification.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\n\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.\n\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EndToEndIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentIdentification3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification;
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\n\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.\n\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the first instructing agent, to
	 * unambiguously identify the transaction that is passed on, unchanged,
	 * throughout the entire interbank chain. Usage: The transaction
	 * identification can be used for reconciliation, tracking or to link tasks
	 * relating to the transaction on the interbank level. Usage: The
	 * instructing agent has to make sure that the transaction identification is
	 * unique for a pre-agreed period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#TransactionIdentification
	 * PaymentIdentification.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain. \nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. \nUsage: The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentIdentification3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.TransactionIdentification;
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain. \nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. \nUsage: The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference, as assigned by a clearing system, to unambiguously
	 * identify the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ClearingSystemReference
	 * PaymentIdentification.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference, as assigned by a clearing system, to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ClearingSystemReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentIdentification3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ClearingSystemReference;
			isDerived = false;
			xmlTag = "ClrSysRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique reference, as assigned by a clearing system, to unambiguously identify the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification3.InstructionIdentification, com.tools20022.repository.msg.PaymentIdentification3.EndToEndIdentification,
						com.tools20022.repository.msg.PaymentIdentification3.TransactionIdentification, com.tools20022.repository.msg.PaymentIdentification3.ClearingSystemReference);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification3";
				definition = "Set of elements used to provide further means of referencing a payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}