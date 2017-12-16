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
import com.tools20022.repository.codeset.RegistrationProcessingStatusCode;
import com.tools20022.repository.codeset.SecuritiesPaymentStatusCode;
import com.tools20022.repository.codeset.SecurityStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the security within its lifecycle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesStatus" src="doc-files/SecuritiesStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
 * SecuritiesStatus.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmStatus
 * SecuritiesStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmRegistrationStatus
 * SecuritiesStatus.mmRegistrationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
 * SecuritiesStatus.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
 * Security.mmSecurityStatus}</li>
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
 * "SecuritiesStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the security within its lifecycle."</li>
 * </ul>
 */
public class SecuritiesStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPaymentStatusCode paymentStatus;
	/**
	 * Status of payment of a security at a particular time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
	 * SecuritiesPaymentStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatus.class.getMethod("getPaymentStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityStatusCode status;
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecurityStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatus.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegistrationProcessingStatusCode registrationStatus;
	/**
	 * Specifies the status of the registration of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode
	 * RegistrationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the registration of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationStatus";
			definition = "Specifies the status of the registration of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatus.class.getMethod("getRegistrationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security security;
	/**
	 * Security for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
	 * Security.mmSecurityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecurityStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatus";
				definition = "Specifies the status of the security within its lifecycle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecurityStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesStatus.mmPaymentStatus, com.tools20022.repository.entity.SecuritiesStatus.mmStatus,
						com.tools20022.repository.entity.SecuritiesStatus.mmRegistrationStatus, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPaymentStatusCode getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatusCode paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public SecurityStatusCode getStatus() {
		return status;
	}

	public void setStatus(SecurityStatusCode status) {
		this.status = status;
	}

	public RegistrationProcessingStatusCode getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(RegistrationProcessingStatusCode registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}
}