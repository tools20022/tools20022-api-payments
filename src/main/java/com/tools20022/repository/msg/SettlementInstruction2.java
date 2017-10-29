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
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.SettlementMethod2Code;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.SettlementInstructionSystemRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details on the settlement of the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementMethod
 * SettlementInstruction2.SettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementAccount
 * SettlementInstruction2.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#ClearingSystem
 * SettlementInstruction2.ClearingSystem}</li>
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
 * "SettlementInstruction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the settlement of the instruction."</li>
 * </ul>
 */
public class SettlementInstruction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod2Code
	 * SettlementMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementMethod
	 * CashSettlement.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2
	 * SettlementInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SettlementMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInstruction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementMethod;
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementMethod2Code.mmObject();
		}
	};
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
	 * CashSettlement.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2
	 * SettlementInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementInstruction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementAccount;
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specification of a pre-agreed offering between clearing agents or the
	 * channel through which the payment instruction is processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
	 * ClearingSystemIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2
	 * SettlementInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClearingSystem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementInstruction2.mmObject();
			businessComponentTrace_lazy = () -> SettlementInstructionSystemRole.mmObject();
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingSystemIdentification3Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction2.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction2.SettlementAccount,
						com.tools20022.repository.msg.SettlementInstruction2.ClearingSystem);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementInstruction2";
				definition = "Provides further details on the settlement of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}
}