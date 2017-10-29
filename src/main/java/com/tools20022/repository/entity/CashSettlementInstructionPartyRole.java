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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in cash settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashSettlementInstructionPartyRole"
 * src="doc-files/CashSettlementInstructionPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#CashAccount
 * CashSettlementInstructionPartyRole.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#SettlementInstruction
 * CashSettlementInstructionPartyRole.SettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashSettlementPartyRole
 * CashAccount.CashSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#PartyRole
 * CashSettlement.PartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
 * SettlementInstructionSystemRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructedReimbursementAgent
 * InstructedReimbursementAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
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
 * "CashSettlementInstructionPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in cash settlement."</li>
 * </ul>
 */
public class CashSettlementInstructionPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role such as instructing reimbursement agent account...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashSettlementPartyRole
	 * CashAccount.CashSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#InstructingReimbursementAgentAccount
	 * SettlementInstruction4.InstructingReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#InstructedReimbursementAgentAccount
	 * SettlementInstruction4.InstructedReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#ThirdReimbursementAgentAccount
	 * SettlementInstruction4.ThirdReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#InstructingReimbursementAgentAccount
	 * SettlementInstruction3.InstructingReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#InstructedReimbursementAgentAccount
	 * SettlementInstruction3.InstructedReimbursementAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role such as instructing reimbursement agent account..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInstruction4.InstructedReimbursementAgentAccount,
					com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInstruction3.InstructingReimbursementAgentAccount,
					com.tools20022.repository.msg.SettlementInstruction3.InstructedReimbursementAgentAccount);
			elementContext_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as instructing reimbursement agent account...";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the settlement instruction in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#PartyRole
	 * CashSettlement.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the settlement instruction in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Identifies the settlement instruction in which a party plays a role.";
			minOccurs = 0;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlementInstructionPartyRole";
				definition = "Role played by a party in cash settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole, com.tools20022.repository.entity.CashSettlement.PartyRole);
				subType_lazy = () -> Arrays.asList(SettlementInstructionSystemRole.mmObject(), InstructedReimbursementAgent.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}