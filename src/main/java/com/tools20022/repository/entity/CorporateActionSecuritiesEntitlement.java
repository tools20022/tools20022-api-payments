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
import com.tools20022.repository.codeset.RenounceableStatusCode;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rights for securities entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionSecuritiesEntitlement"
 * src="doc-files/CorporateActionSecuritiesEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
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
 * "CorporateActionSecuritiesEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights for securities entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionSecuritiesEntitlement extends CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity entitledSecuritiesQuantity;
	/**
	 * Quantity of securities based on the terms of the corporate action event
	 * and balance of underlying securities entitled to the account owner. (This
	 * quantity can be positive or negative).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
	 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEntitledSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntitledSecuritiesQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected RenounceableStatusCode renounceableEntitlementStatusType;
	/**
	 * Specifies whether terms of the event allow resale of the rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode
	 * RenounceableStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRenounceableEntitlementStatusType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RenounceableStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionSecuritiesEntitlement.class.getMethod("getRenounceableEntitlementStatusType", new Class[]{});
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
				name = "CorporateActionSecuritiesEntitlement";
				definition = "Rights for securities entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesEntitlement);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionSecuritiesEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getEntitledSecuritiesQuantity() {
		return entitledSecuritiesQuantity;
	}

	public void setEntitledSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity entitledSecuritiesQuantity) {
		this.entitledSecuritiesQuantity = entitledSecuritiesQuantity;
	}

	public RenounceableStatusCode getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType;
	}

	public void setRenounceableEntitlementStatusType(RenounceableStatusCode renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
	}
}