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
import com.tools20022.repository.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.CashClearingSystemCode;
import com.tools20022.repository.codeset.CashSettlementSystemCode;
import com.tools20022.repository.codeset.CashSystemTypeCode;
import com.tools20022.repository.entity.ClearingSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Clearing system that processes only cash transfers.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashClearingSystem" src="doc-files/CashClearingSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmIdentification
 * CashClearingSystem.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmTransactionAdministrator
 * CashClearingSystem.mmTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
 * CashClearingSystem.mmSystemRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashClearingSystem#mmType
 * CashClearingSystem.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmCashSettlementSystem
 * CashClearingSystem.mmCashSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
 * ClearingSystemIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
 * ClearingSystemIdentification2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
 * TransactionAdministrator.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
 * SettlementInstructionSystemRole.mmSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ClearingSystem
 * ClearingSystem}</li>
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
 * "CashClearingSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Clearing system that processes only cash transfers."</li>
 * </ul>
 */
public class CashClearingSystem extends ClearingSystem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystemCode identification;
	/**
	 * Information used to identify a cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice#mmCode
	 * ClearingSystemIdentification3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice#mmProprietary
	 * ClearingSystemIdentification3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice#mmCode
	 * ClearingSystemIdentification2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice#mmProprietary
	 * ClearingSystemIdentification2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#mmClearingSystemIdentification
	 * ClearingSystemMemberIdentification2.mmClearingSystemIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to identify a cash clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ClearingSystemIdentification3Choice.mmCode, ClearingSystemIdentification3Choice.mmProprietary, ClearingSystemIdentification2Choice.mmCode, ClearingSystemIdentification2Choice.mmProprietary,
					ClearingSystemMemberIdentification2.mmClearingSystemIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Information used to identify a cash clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashClearingSystemCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashClearingSystem.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TransactionAdministrator> transactionAdministrator;
	/**
	 * Set of integrated applications that provides centralised services such as
	 * clearing and settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
	 * TransactionAdministrator.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of integrated applications that provides centralised services such as clearing and settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionAdministrator";
			definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmCashClearingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected SettlementInstructionSystemRole systemRole;
	/**
	 * Specifies the role played by the cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role played by the cash clearing system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemRole";
			definition = "Specifies the role played by the cash clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.mmObject();
		}
	};
	protected CashSystemTypeCode type;
	/**
	 * Specifies the category of cash clearing system, eg, cheque clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode
	 * CashSystemTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, eg, cheque clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the category of cash clearing system, eg, cheque clearing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashSystemTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashClearingSystem.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashSettlementSystemCode cashSettlementSystem;
	/**
	 * Specifies the cash settlement system used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cash settlement system used."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashSettlementSystem = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashSettlementSystem";
			definition = "Specifies the cash settlement system used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashSettlementSystemCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashClearingSystem.class.getMethod("getCashSettlementSystem", new Class[]{});
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
				name = "CashClearingSystem";
				definition = "Clearing system that processes only cash transfers.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.mmCashClearingSystem, com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem);
				superType_lazy = () -> ClearingSystem.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.mmIdentification, com.tools20022.repository.entity.CashClearingSystem.mmTransactionAdministrator,
						com.tools20022.repository.entity.CashClearingSystem.mmSystemRole, com.tools20022.repository.entity.CashClearingSystem.mmType, com.tools20022.repository.entity.CashClearingSystem.mmCashSettlementSystem);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemIdentification3Choice.mmObject(), ClearingSystemIdentification2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashClearingSystem.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystemCode getIdentification() {
		return identification;
	}

	public void setIdentification(CashClearingSystemCode identification) {
		this.identification = identification;
	}

	public List<TransactionAdministrator> getTransactionAdministrator() {
		return transactionAdministrator;
	}

	public void setTransactionAdministrator(List<com.tools20022.repository.entity.TransactionAdministrator> transactionAdministrator) {
		this.transactionAdministrator = transactionAdministrator;
	}

	public SettlementInstructionSystemRole getSystemRole() {
		return systemRole;
	}

	public void setSystemRole(com.tools20022.repository.entity.SettlementInstructionSystemRole systemRole) {
		this.systemRole = systemRole;
	}

	public CashSystemTypeCode getType() {
		return type;
	}

	public void setType(CashSystemTypeCode type) {
		this.type = type;
	}

	public CashSettlementSystemCode getCashSettlementSystem() {
		return cashSettlementSystem;
	}

	public void setCashSettlementSystem(CashSettlementSystemCode cashSettlementSystem) {
		this.cashSettlementSystem = cashSettlementSystem;
	}
}