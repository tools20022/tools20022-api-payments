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
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementInstruction3;
import com.tools20022.repository.msg.SettlementInstruction4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agent at which the instructed agent will be reimbursed. Usage: If the
 * instructing and instructed agents have the same reimbursement agent, then
 * only InstructedReimbursementAgent is not allowed. Usage: If
 * InstructedReimbursementAgent contains a branch of the instructed agent, then
 * the instructed agent will claim reimbursement from that branch/will be paid
 * by that branch.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InstructedReimbursementAgent"
 * src="doc-files/InstructedReimbursementAgent.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmInstructedReimbursementAgent
 * SettlementInstruction4.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructedReimbursementAgent
 * SettlementInstruction3.mmInstructedReimbursementAgent}</li>
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
 * "InstructedReimbursementAgent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agent at which the instructed agent will be reimbursed.\nUsage: If the instructing and instructed agents have the same reimbursement agent, then only InstructedReimbursementAgent is not allowed.\nUsage: If InstructedReimbursementAgent contains a branch of the instructed agent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch."
 * </li>
 * </ul>
 */
public class InstructedReimbursementAgent extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedReimbursementAgent";
				definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If the instructing and instructed agents have the same reimbursement agent, then only InstructedReimbursementAgent is not allowed.\nUsage: If InstructedReimbursementAgent contains a branch of the instructed agent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.";
				derivationElement_lazy = () -> Arrays.asList(SettlementInstruction4.mmInstructedReimbursementAgent, SettlementInstruction3.mmInstructedReimbursementAgent);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return InstructedReimbursementAgent.class;
			}
		});
		return mmObject_lazy.get();
	}
}