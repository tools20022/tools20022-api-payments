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
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in a settlement process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SettlementPartyRole" src="doc-files/SettlementPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
 * SettlementPartyRole.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlement
 * SettlementPartyRole.mmSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmSettlementPartyRole
 * Account.mmSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmSettlementPartyRole
 * Settlement.mmSettlementPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasurySettlementPartyRole
 * TreasurySettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SSIDatabaseProvider
 * SSIDatabaseProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CentralClearingCounterpartyRole
 * CentralClearingCounterpartyRole}</li>
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
 * "SettlementPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in a settlement process."</li>
 * </ul>
 */
public class SettlementPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Account settlementAccount;
	/**
	 * Account which is used for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSettlementPartyRole
	 * Account.mmSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account which is used for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Account which is used for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSettlementPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected Settlement settlement;
	/**
	 * Specifies the settlement process for which the party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmSettlementPartyRole
	 * Settlement.mmSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement process for which the party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Specifies the settlement process for which the party plays a role.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.mmSettlementPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementPartyRole";
				definition = "Role played by a party in a settlement process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmSettlementPartyRole, com.tools20022.repository.entity.Settlement.mmSettlementPartyRole);
				subType_lazy = () -> Arrays.asList(SecuritiesSettlementPartyRole.mmObject(), CashSettlementInstructionPartyRole.mmObject(), TreasurySettlementPartyRole.mmObject(), SSIDatabaseProvider.mmObject(),
						CentralClearingCounterpartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementPartyRole.mmSettlementAccount, com.tools20022.repository.entity.SettlementPartyRole.mmSettlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SettlementPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Account getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.entity.Account settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(com.tools20022.repository.entity.Settlement settlement) {
		this.settlement = settlement;
	}
}