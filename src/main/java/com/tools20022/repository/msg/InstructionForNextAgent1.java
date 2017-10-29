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
import com.tools20022.repository.codeset.Instruction4Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further information related to the processing of the payment instruction that
 * may need to be acted upon by an other agent. The instruction may relate to a
 * level of service, or may be an instruction that has to be executed by the
 * creditor's agent, or may be information required by the other agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#Code
 * InstructionForNextAgent1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#InstructionInformation
 * InstructionForNextAgent1.InstructionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
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
 * "InstructionForNextAgent1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information related to the processing of the payment instruction that may need to be acted upon by an other agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the other agent."
 * </li>
 * </ul>
 */
public class InstructionForNextAgent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Coded information related to the processing of the payment instruction,
	 * provided by the initiating party, and intended for the next agent in the
	 * payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction4Code
	 * Instruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#InstructionForNextAgent
	 * PaymentInstruction.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the next agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionForNextAgent1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.InstructionForNextAgent;
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the next agent in the payment chain.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Instruction4Code.mmObject();
		}
	};
	/**
	 * Further information complementing the coded instruction or instruction to
	 * the next agent that is bilaterally agreed or specific to a user
	 * community.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information complementing the coded instruction or instruction to the next agent that is bilaterally agreed or specific to a user community."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionForNextAgent1.mmObject();
			isDerived = false;
			xmlTag = "InstrInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Further information complementing the coded instruction or instruction to the next agent that is bilaterally agreed or specific to a user community.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForNextAgent1.Code, com.tools20022.repository.msg.InstructionForNextAgent1.InstructionInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionForNextAgent1";
				definition = "Further information related to the processing of the payment instruction that may need to be acted upon by an other agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the other agent.";
			}
		});
		return mmObject_lazy.get();
	}
}