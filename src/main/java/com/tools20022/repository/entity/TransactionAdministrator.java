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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashClearingSystem
 * TransactionAdministrator.CashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#Currency
 * TransactionAdministrator.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CurrencyExchange
 * TransactionAdministrator.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CashManagementService
 * TransactionAdministrator.CashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#SettlementInstruction
 * TransactionAdministrator.SettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#TransactionAdministrator
 * CashClearingSystem.TransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedTransactionAdministrator
 * CashSettlement.RelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#RelatedTransactionAdministrator
 * CashManagementService.RelatedTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.CurrencyExchangeForTransactionAdministrator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
	/**
	 * System where the clearing takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#TransactionAdministrator
	 * CashClearingSystem.TransactionAdministrator}</li>
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
	public static final MMBusinessAssociationEnd CashClearingSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashClearingSystem";
			definition = "System where the clearing takes place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency which may be processed by the system. A system may process
	 * transactions in a single currency or in multiple currencies.
	 * <p>
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
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Static data maintained by the transaction administrator and related to
	 * currency exchange details as maintained for system operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForTransactionAdministrator
	 * CurrencyExchange.CurrencyExchangeForTransactionAdministrator}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of applications that provides services which facilitate the
	 * management of cash positions on an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#RelatedTransactionAdministrator
	 * CashManagementService.RelatedTransactionAdministrator}</li>
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
	public static final MMBusinessAssociationEnd CashManagementService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the settlement instruction managed by the transaction
	 * administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedTransactionAdministrator
	 * CashSettlement.RelatedTransactionAdministrator}</li>
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
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the settlement instruction managed by the transaction administrator.";
			minOccurs = 0;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionAdministrator";
				definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator, com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator,
						com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem, com.tools20022.repository.entity.TransactionAdministrator.Currency,
						com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.CashManagementService,
						com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}