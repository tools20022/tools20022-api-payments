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
import com.tools20022.repository.area.camt.ClaimNonReceiptV06;
import com.tools20022.repository.area.camt.RequestToModifyPaymentV05;
import com.tools20022.repository.codeset.ExternalAgentInstruction1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information related to the processing of the investigation that may
 * need to be acted upon by the assignee.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForAssignee1#mmCode
 * InstructionForAssignee1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionForAssignee1#mmInstructionInformation
 * InstructionForAssignee1.mmInstructionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmInstructionForAssignee
 * RequestToModifyPaymentV05.mmInstructionForAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV06#mmInstructionForAssignee
 * ClaimNonReceiptV06.mmInstructionForAssignee}</li>
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
 * "InstructionForAssignee1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information related to the processing of the investigation that may need to be acted upon by the assignee."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
 * InstructionForNextAgent1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionForAssignee1", propOrder = {"code", "instructionInformation"})
public class InstructionForAssignee1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd")
	protected ExternalAgentInstruction1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalAgentInstruction1Code
	 * ExternalAgentInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
	 * PaymentInstruction.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForAssignee1
	 * InstructionForAssignee1}</li>
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
	 * "Coded information related to the processing of the investigation instruction, provided by the assigner, and intended for the assignee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#mmCode
	 * InstructionForNextAgent1.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForAssignee1, Optional<ExternalAgentInstruction1Code>> mmCode = new MMMessageAttribute<InstructionForAssignee1, Optional<ExternalAgentInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionForAssignee1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Coded information related to the processing of the investigation instruction, provided by the assigner, and intended for the assignee.";
			previousVersion_lazy = () -> InstructionForNextAgent1.mmCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalAgentInstruction1Code.mmObject();
		}

		@Override
		public Optional<ExternalAgentInstruction1Code> getValue(InstructionForAssignee1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(InstructionForAssignee1 obj, Optional<ExternalAgentInstruction1Code> value) {
			obj.setCode(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrInf")
	protected Max140Text instructionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForAssignee1
	 * InstructionForAssignee1}</li>
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
	 * "Further information complementing the coded instruction or instruction to the assignee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#mmInstructionInformation
	 * InstructionForNextAgent1.mmInstructionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForAssignee1, Optional<Max140Text>> mmInstructionInformation = new MMMessageAttribute<InstructionForAssignee1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionForAssignee1.mmObject();
			isDerived = false;
			xmlTag = "InstrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Further information complementing the coded instruction or instruction to the assignee.";
			previousVersion_lazy = () -> InstructionForNextAgent1.mmInstructionInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(InstructionForAssignee1 obj) {
			return obj.getInstructionInformation();
		}

		@Override
		public void setValue(InstructionForAssignee1 obj, Optional<Max140Text> value) {
			obj.setInstructionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForAssignee1.mmCode, com.tools20022.repository.msg.InstructionForAssignee1.mmInstructionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmInstructionForAssignee, ClaimNonReceiptV06.mmInstructionForAssignee);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForAssignee1";
				definition = "Further information related to the processing of the investigation that may need to be acted upon by the assignee.";
				previousVersion_lazy = () -> InstructionForNextAgent1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExternalAgentInstruction1Code> getCode() {
		return code == null ? Optional.empty() : Optional.of(code);
	}

	public InstructionForAssignee1 setCode(ExternalAgentInstruction1Code code) {
		this.code = code;
		return this;
	}

	public Optional<Max140Text> getInstructionInformation() {
		return instructionInformation == null ? Optional.empty() : Optional.of(instructionInformation);
	}

	public InstructionForAssignee1 setInstructionInformation(Max140Text instructionInformation) {
		this.instructionInformation = instructionInformation;
		return this;
	}
}