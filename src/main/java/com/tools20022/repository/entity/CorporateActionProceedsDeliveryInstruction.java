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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies the delivery instructions for the securities and cash proceeds at
 * any stage of the Corporate Action process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionProceedsDeliveryInstruction"
 * src="doc-files/CorporateActionProceedsDeliveryInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmRelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.
 * mmCorporateActionStandingInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
 * Account.mmRelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
 * PaymentObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCorporateAction
 * SecuritiesDeliveryObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmRelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions}</li>
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
 * "CorporateActionProceedsDeliveryInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
 * </li>
 * </ul>
 */
public class CorporateActionProceedsDeliveryInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionDistribution relatedDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters of the distribution of the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, CorporateActionDistribution> mmRelatedDistribution = new MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, CorporateActionDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDistribution";
			definition = "Parameters of the distribution of the proceeds of a CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public CorporateActionDistribution getValue(CorporateActionProceedsDeliveryInstruction obj) {
			return obj.getRelatedDistribution();
		}

		@Override
		public void setValue(CorporateActionProceedsDeliveryInstruction obj, CorporateActionDistribution value) {
			obj.setRelatedDistribution(value);
		}
	};
	protected List<SecuritiesDeliveryObligation> securitiesProceedsMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCorporateAction
	 * SecuritiesDeliveryObligation.mmRelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of securities related to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<SecuritiesDeliveryObligation>> mmSecuritiesProceedsMovement = new MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<SecuritiesDeliveryObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsMovement";
			definition = "Instructions for the movement of securities related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesDeliveryObligation.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
		}

		@Override
		public List<SecuritiesDeliveryObligation> getValue(CorporateActionProceedsDeliveryInstruction obj) {
			return obj.getSecuritiesProceedsMovement();
		}

		@Override
		public void setValue(CorporateActionProceedsDeliveryInstruction obj, List<SecuritiesDeliveryObligation> value) {
			obj.setSecuritiesProceedsMovement(value);
		}
	};
	protected List<PaymentObligation> cashProceedsMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
	 * PaymentObligation.mmRelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of cash related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<PaymentObligation>> mmCashProceedsMovement = new MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashProceedsMovement";
			definition = "Instructions for the movement of cash related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(CorporateActionProceedsDeliveryInstruction obj) {
			return obj.getCashProceedsMovement();
		}

		@Override
		public void setValue(CorporateActionProceedsDeliveryInstruction obj, List<PaymentObligation> value) {
			obj.setCashProceedsMovement(value);
		}
	};
	protected List<Account> settlementAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
	 * Account.mmRelatedProceedsDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<Account>> mmSettlementAccount = new MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmRelatedProceedsDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(CorporateActionProceedsDeliveryInstruction obj) {
			return obj.getSettlementAccount();
		}

		@Override
		public void setValue(CorporateActionProceedsDeliveryInstruction obj, List<Account> value) {
			obj.setSettlementAccount(value);
		}
	};
	protected AgentCorporateActionStandingInstruction corporateActionStandingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmRelatedDeliveryInstructions
	 * AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, AgentCorporateActionStandingInstruction> mmCorporateActionStandingInstruction = new MMBusinessAssociationEnd<CorporateActionProceedsDeliveryInstruction, AgentCorporateActionStandingInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstruction";
			definition = "Standing instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
		}

		@Override
		public AgentCorporateActionStandingInstruction getValue(CorporateActionProceedsDeliveryInstruction obj) {
			return obj.getCorporateActionStandingInstruction();
		}

		@Override
		public void setValue(CorporateActionProceedsDeliveryInstruction obj, AgentCorporateActionStandingInstruction value) {
			obj.setCorporateActionStandingInstruction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProceedsDeliveryInstruction";
				definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmRelatedProceedsDelivery, PaymentObligation.mmRelatedCorporateAction, SecuritiesDeliveryObligation.mmRelatedCorporateAction,
						CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction, AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCorporateActionStandingInstruction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionProceedsDeliveryInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionDistribution getRelatedDistribution() {
		return relatedDistribution;
	}

	public CorporateActionProceedsDeliveryInstruction setRelatedDistribution(CorporateActionDistribution relatedDistribution) {
		this.relatedDistribution = Objects.requireNonNull(relatedDistribution);
		return this;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesProceedsMovement() {
		return securitiesProceedsMovement == null ? securitiesProceedsMovement = new ArrayList<>() : securitiesProceedsMovement;
	}

	public CorporateActionProceedsDeliveryInstruction setSecuritiesProceedsMovement(List<SecuritiesDeliveryObligation> securitiesProceedsMovement) {
		this.securitiesProceedsMovement = Objects.requireNonNull(securitiesProceedsMovement);
		return this;
	}

	public List<PaymentObligation> getCashProceedsMovement() {
		return cashProceedsMovement == null ? cashProceedsMovement = new ArrayList<>() : cashProceedsMovement;
	}

	public CorporateActionProceedsDeliveryInstruction setCashProceedsMovement(List<PaymentObligation> cashProceedsMovement) {
		this.cashProceedsMovement = Objects.requireNonNull(cashProceedsMovement);
		return this;
	}

	public List<Account> getSettlementAccount() {
		return settlementAccount == null ? settlementAccount = new ArrayList<>() : settlementAccount;
	}

	public CorporateActionProceedsDeliveryInstruction setSettlementAccount(List<Account> settlementAccount) {
		this.settlementAccount = Objects.requireNonNull(settlementAccount);
		return this;
	}

	public AgentCorporateActionStandingInstruction getCorporateActionStandingInstruction() {
		return corporateActionStandingInstruction;
	}

	public CorporateActionProceedsDeliveryInstruction setCorporateActionStandingInstruction(AgentCorporateActionStandingInstruction corporateActionStandingInstruction) {
		this.corporateActionStandingInstruction = Objects.requireNonNull(corporateActionStandingInstruction);
		return this;
	}
}