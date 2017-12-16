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
import com.tools20022.repository.codeset.SettlingCapacityCode;
import com.tools20022.repository.codeset.TaxLiabilityCode;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Role played by a party in the context of the settlement of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlementPartyRole"
 * src="doc-files/SecuritiesSettlementPartyRole.svg">
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
 * SecuritiesSettlementSystem.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PlaceOfSettlement
 * PlaceOfSettlement}</li>
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
 * "SecuritiesSettlementPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of the settlement of securities."</li>
 * </ul>
 */
public class SecuritiesSettlementPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Specifies the settlement process in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement process in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement process in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem;
	/**
	 * Specifies the system which may be used by a party in a settlement
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
	 * SecuritiesSettlementSystem.mmSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which may be used by a party in a settlement process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Specifies the system which may be used by a party in a settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
		}
	};
	protected SettlingCapacityCode settlingCapacity;
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlingCapacity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlingCapacityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementPartyRole.class.getMethod("getSettlingCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxLiabilityCode taxCapacity;
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxCapacity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxLiabilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementPartyRole.class.getMethod("getTaxCapacity", new Class[]{});
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
				name = "SecuritiesSettlementPartyRole";
				definition = "Role played by a party in the context of the settlement of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty);
				subType_lazy = () -> Arrays.asList(PlaceOfSettlement.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem,
						com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSettlingCapacity, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmTaxCapacity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public List<SecuritiesSettlementSystem> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem;
	}

	public void setSecuritiesSettlementSystem(List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
	}

	public SettlingCapacityCode getSettlingCapacity() {
		return settlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacityCode settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
	}

	public TaxLiabilityCode getTaxCapacity() {
		return taxCapacity;
	}

	public void setTaxCapacity(TaxLiabilityCode taxCapacity) {
		this.taxCapacity = taxCapacity;
	}
}