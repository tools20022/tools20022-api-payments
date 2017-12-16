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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the status of an account or the status of the processing of the
 * actions linked to the management of an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountStatus" src="doc-files/AccountStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
 * AccountStatus.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmStatus
 * AccountStatus.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmBlocked
 * AccountStatus.mmBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmManagementStatus
 * AccountStatus.mmManagementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
 * AccountStatus.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBalanceStatus
 * AccountStatus.mmBalanceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBlockedReason
 * AccountStatus.mmBlockedReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmStatus
 * Account.mmStatus}</li>
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
 * "AccountStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of an account or the status of the processing of the actions linked to the management of an account."
 * </li>
 * </ul>
 */
public class AccountStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Identifies the account for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected AccountStatusCode status;
	/**
	 * Specifies the status of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#mmStatus
	 * CustomerAccount5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatus
	 * CustomerAccountModification1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#mmStatus
	 * CustomerAccount4.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmStatus, CustomerAccountModification1.mmStatus, CustomerAccount4.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator blocked;
	/**
	 * Indicates whether the account is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account is blocked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlocked = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Indicates whether the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getBlocked", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountManagementStatusCode managementStatus;
	/**
	 * Specifies the status of the processing of a request linked to the
	 * management of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the processing of a request linked to the management of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmManagementStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagementStatus";
			definition = "Specifies the status of the processing of a request linked to the management of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getManagementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EntryStatusCode entryStatus;
	/**
	 * Status of an entry on the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionType1#mmStatus
	 * TransactionType1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmStatus
	 * ReportEntry8.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntryStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionType1.mmStatus, ReportEntry8.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getEntryStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BalanceStatusCode balanceStatus;
	/**
	 * Current status of a cash balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of a cash balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBalanceStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceStatus";
			definition = "Current status of a cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getBalanceStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReasonBlockedCode blockedReason;
	/**
	 * Specifies the different reasons for which the account is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different reasons for which the account is blocked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedReason";
			definition = "Specifies the different reasons for which the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReasonBlockedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountStatus.class.getMethod("getBlockedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatus";
				definition = "Specifies the status of an account or the status of the processing of the actions linked to the management of an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountStatus.mmAccount, com.tools20022.repository.entity.AccountStatus.mmStatus, com.tools20022.repository.entity.AccountStatus.mmBlocked,
						com.tools20022.repository.entity.AccountStatus.mmManagementStatus, com.tools20022.repository.entity.AccountStatus.mmEntryStatus, com.tools20022.repository.entity.AccountStatus.mmBalanceStatus,
						com.tools20022.repository.entity.AccountStatus.mmBlockedReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public AccountStatusCode getStatus() {
		return status;
	}

	public void setStatus(AccountStatusCode status) {
		this.status = status;
	}

	public YesNoIndicator getBlocked() {
		return blocked;
	}

	public void setBlocked(YesNoIndicator blocked) {
		this.blocked = blocked;
	}

	public AccountManagementStatusCode getManagementStatus() {
		return managementStatus;
	}

	public void setManagementStatus(AccountManagementStatusCode managementStatus) {
		this.managementStatus = managementStatus;
	}

	public EntryStatusCode getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(EntryStatusCode entryStatus) {
		this.entryStatus = entryStatus;
	}

	public BalanceStatusCode getBalanceStatus() {
		return balanceStatus;
	}

	public void setBalanceStatus(BalanceStatusCode balanceStatus) {
		this.balanceStatus = balanceStatus;
	}

	public ReasonBlockedCode getBlockedReason() {
		return blockedReason;
	}

	public void setBlockedReason(ReasonBlockedCode blockedReason) {
		this.blockedReason = blockedReason;
	}
}