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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party responsible for keeping track of the owners of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegistrarRole" src="doc-files/RegistrarRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
 * RegistrarRole.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegisterName
 * RegistrarRole.mmRegisterName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedRegistrar
 * SecuritiesAccount.mmRelatedRegistrar}</li>
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
 * "RegistrarRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party responsible for keeping track of the owners of securities."</li>
 * </ul>
 */
public class RegistrarRole extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccount registrarAccount;
	/**
	 * Account at the registrar where financial instruments are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedRegistrar
	 * SecuritiesAccount.mmRelatedRegistrar}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole RegistrarRole}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrarAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account at the registrar where financial instruments are registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegistrarAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegistrarRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrarAccount";
			definition = "Account at the registrar where financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedRegistrar;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected Max35Text registerName;
	/**
	 * Name of the register managed by a registration authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole RegistrarRole}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisterName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the register managed by a registration authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisterName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegistrarRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisterName";
			definition = "Name of the register managed by a registration authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegistrarRole.class.getMethod("getRegisterName", new Class[]{});
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
				name = "RegistrarRole";
				definition = "Party responsible for keeping track of the owners of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmRelatedRegistrar);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegistrarRole.mmRegistrarAccount, com.tools20022.repository.entity.RegistrarRole.mmRegisterName);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegistrarRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount getRegistrarAccount() {
		return registrarAccount;
	}

	public void setRegistrarAccount(com.tools20022.repository.entity.SecuritiesAccount registrarAccount) {
		this.registrarAccount = registrarAccount;
	}

	public Max35Text getRegisterName() {
		return registerName;
	}

	public void setRegisterName(Max35Text registerName) {
		this.registerName = registerName;
	}
}