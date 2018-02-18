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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementInstruction3;
import com.tools20022.repository.msg.SettlementInstruction4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashSettlementPartyRole
 * CashAccount.mmCashSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
 * CashSettlement.mmPartyRole}</li>
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
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashSettlementPartyRole
	 * CashAccount.mmCashSettlementPartyRole}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmInstructingReimbursementAgentAccount
	 * SettlementInstruction4.mmInstructingReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmInstructedReimbursementAgentAccount
	 * SettlementInstruction4.mmInstructedReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmThirdReimbursementAgentAccount
	 * SettlementInstruction4.mmThirdReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructingReimbursementAgentAccount
	 * SettlementInstruction3.mmInstructingReimbursementAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructedReimbursementAgentAccount
	 * SettlementInstruction3.mmInstructedReimbursementAgentAccount}</li>
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
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementInstruction4.mmInstructingReimbursementAgentAccount, SettlementInstruction4.mmInstructedReimbursementAgentAccount, SettlementInstruction4.mmThirdReimbursementAgentAccount,
					SettlementInstruction3.mmInstructingReimbursementAgentAccount, SettlementInstruction3.mmInstructedReimbursementAgentAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as instructing reimbursement agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashSettlementPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlement> settlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
	 * CashSettlement.mmPartyRole}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Identifies the settlement instruction in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlementInstructionPartyRole";
				definition = "Role played by a party in cash settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashSettlementPartyRole, com.tools20022.repository.entity.CashSettlement.mmPartyRole);
				subType_lazy = () -> Arrays.asList(SettlementInstructionSystemRole.mmObject(), InstructedReimbursementAgent.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmCashAccount, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashSettlementInstructionPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public CashSettlementInstructionPartyRole setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<CashSettlement> getSettlementInstruction() {
		return settlementInstruction == null ? settlementInstruction = new ArrayList<>() : settlementInstruction;
	}

	public CashSettlementInstructionPartyRole setSettlementInstruction(List<com.tools20022.repository.entity.CashSettlement> settlementInstruction) {
		this.settlementInstruction = Objects.requireNonNull(settlementInstruction);
		return this;
	}
}