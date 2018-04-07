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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing and settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransactionAdministrator"
 * src="doc-files/TransactionAdministrator.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
 * TransactionAdministrator.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrency
 * TransactionAdministrator.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
 * TransactionAdministrator.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashManagementService
 * TransactionAdministrator.mmCashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
 * TransactionAdministrator.mmSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmTransactionAdministrator
 * CashClearingSystem.mmTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
 * CashSettlement.mmRelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRelatedTransactionAdministrator
 * CashManagementService.mmRelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator}</li>
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
 * "TransactionAdministrator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing and settlement."
 * </li>
 * </ul>
 */
public class TransactionAdministrator extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystem cashClearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmTransactionAdministrator
	 * CashClearingSystem.mmTransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System where the clearing takes place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TransactionAdministrator, com.tools20022.repository.entity.CashClearingSystem> mmCashClearingSystem = new MMBusinessAssociationEnd<TransactionAdministrator, com.tools20022.repository.entity.CashClearingSystem>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashClearingSystem";
			definition = "System where the clearing takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmTransactionAdministrator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashClearingSystem getValue(TransactionAdministrator obj) {
			return obj.getCashClearingSystem();
		}

		@Override
		public void setValue(TransactionAdministrator obj, com.tools20022.repository.entity.CashClearingSystem value) {
			obj.setCashClearingSystem(value);
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TransactionAdministrator, CurrencyCode> mmCurrency = new MMBusinessAttribute<TransactionAdministrator, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(TransactionAdministrator obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(TransactionAdministrator obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForTransactionAdministrator
	 * CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TransactionAdministrator, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<TransactionAdministrator, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(TransactionAdministrator obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(TransactionAdministrator obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashManagementService> cashManagementService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRelatedTransactionAdministrator
	 * CashManagementService.mmRelatedTransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of applications that provides services which facilitate the management of cash positions on an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TransactionAdministrator, List<CashManagementService>> mmCashManagementService = new MMBusinessAssociationEnd<TransactionAdministrator, List<CashManagementService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmRelatedTransactionAdministrator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}

		@Override
		public List<CashManagementService> getValue(TransactionAdministrator obj) {
			return obj.getCashManagementService();
		}

		@Override
		public void setValue(TransactionAdministrator obj, List<CashManagementService> value) {
			obj.setCashManagementService(value);
		}
	};
	protected List<CashSettlement> settlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
	 * CashSettlement.mmRelatedTransactionAdministrator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement instruction managed by the transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TransactionAdministrator, List<CashSettlement>> mmSettlementInstruction = new MMBusinessAssociationEnd<TransactionAdministrator, List<CashSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the settlement instruction managed by the transaction administrator.";
			minOccurs = 0;
			opposite_lazy = () -> CashSettlement.mmRelatedTransactionAdministrator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}

		@Override
		public List<CashSettlement> getValue(TransactionAdministrator obj) {
			return obj.getSettlementInstruction();
		}

		@Override
		public void setValue(TransactionAdministrator obj, List<CashSettlement> value) {
			obj.setSettlementInstruction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionAdministrator";
				definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.mmTransactionAdministrator, CashSettlement.mmRelatedTransactionAdministrator,
						com.tools20022.repository.entity.CashManagementService.mmRelatedTransactionAdministrator, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.mmCashClearingSystem, com.tools20022.repository.entity.TransactionAdministrator.mmCurrency,
						com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.mmCashManagementService,
						com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransactionAdministrator.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystem getCashClearingSystem() {
		return cashClearingSystem;
	}

	public TransactionAdministrator setCashClearingSystem(com.tools20022.repository.entity.CashClearingSystem cashClearingSystem) {
		this.cashClearingSystem = Objects.requireNonNull(cashClearingSystem);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public TransactionAdministrator setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public TransactionAdministrator setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public List<CashManagementService> getCashManagementService() {
		return cashManagementService == null ? cashManagementService = new ArrayList<>() : cashManagementService;
	}

	public TransactionAdministrator setCashManagementService(List<com.tools20022.repository.entity.CashManagementService> cashManagementService) {
		this.cashManagementService = Objects.requireNonNull(cashManagementService);
		return this;
	}

	public List<CashSettlement> getSettlementInstruction() {
		return settlementInstruction == null ? settlementInstruction = new ArrayList<>() : settlementInstruction;
	}

	public TransactionAdministrator setSettlementInstruction(List<CashSettlement> settlementInstruction) {
		this.settlementInstruction = Objects.requireNonNull(settlementInstruction);
		return this;
	}
}