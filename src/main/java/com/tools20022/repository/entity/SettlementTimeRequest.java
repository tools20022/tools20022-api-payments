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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementTimeRequest2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the requested settlement time(s) of the payment
 * instruction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SettlementTimeRequest"
 * src="doc-files/SettlementTimeRequest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
 * SettlementTimeRequest.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmCLSTime
 * SettlementTimeRequest.mmCLSTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmTillTime
 * SettlementTimeRequest.mmTillTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmFromTime
 * SettlementTimeRequest.mmFromTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmRejectTime
 * SettlementTimeRequest.mmRejectTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
 * Payment.mmSettlementTimeRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
 * SettlementTimeRequest2}</li>
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
 * "SettlementTimeRequest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information on the requested settlement time(s) of the payment instruction."
 * </li>
 * </ul>
 */
public class SettlementTimeRequest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Payment payment;
	/**
	 * Payment for which settlement times are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
	 * Payment.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which settlement times are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which settlement times are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmSettlementTimeRequest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected ISODateTime cLSTime;
	/**
	 * Time by which the amount of money must be credited, with confirmation, to
	 * the CLS Bank's account at the central bank.<br>
	 * Usage: Time must be expressed in Central European Time (CET).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#mmCLSTime
	 * SettlementTimeRequest2.mmCLSTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\r\nUsage: Time must be expressed in Central European Time (CET)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCLSTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTimeRequest2.mmCLSTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CLSTime";
			definition = "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\r\nUsage: Time must be expressed in Central European Time (CET).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SettlementTimeRequest.class.getMethod("getCLSTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime tillTime;
	/**
	 * Time until when the payment may be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#mmTillTime
	 * SettlementTimeRequest2.mmTillTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TillTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time until when the payment may be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTillTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTimeRequest2.mmTillTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TillTime";
			definition = "Time until when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SettlementTimeRequest.class.getMethod("getTillTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime fromTime;
	/**
	 * Time as from when the payment may be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#mmFromTime
	 * SettlementTimeRequest2.mmFromTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time as from when the payment may be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFromTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTimeRequest2.mmFromTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromTime";
			definition = "Time as from when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SettlementTimeRequest.class.getMethod("getFromTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime rejectTime;
	/**
	 * Time by when the payment must be settled to avoid rejection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2#mmRejectTime
	 * SettlementTimeRequest2.mmRejectTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time by when the payment must be settled to avoid rejection."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTimeRequest2.mmRejectTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectTime";
			definition = "Time by when the payment must be settled to avoid rejection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SettlementTimeRequest.class.getMethod("getRejectTime", new Class[]{});
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
				name = "SettlementTimeRequest";
				definition = "Provides information on the requested settlement time(s) of the payment instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmSettlementTimeRequest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementTimeRequest.mmPayment, com.tools20022.repository.entity.SettlementTimeRequest.mmCLSTime,
						com.tools20022.repository.entity.SettlementTimeRequest.mmTillTime, com.tools20022.repository.entity.SettlementTimeRequest.mmFromTime, com.tools20022.repository.entity.SettlementTimeRequest.mmRejectTime);
				derivationComponent_lazy = () -> Arrays.asList(SettlementTimeRequest2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SettlementTimeRequest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public ISODateTime getCLSTime() {
		return cLSTime;
	}

	public void setCLSTime(ISODateTime cLSTime) {
		this.cLSTime = cLSTime;
	}

	public ISODateTime getTillTime() {
		return tillTime;
	}

	public void setTillTime(ISODateTime tillTime) {
		this.tillTime = tillTime;
	}

	public ISODateTime getFromTime() {
		return fromTime;
	}

	public void setFromTime(ISODateTime fromTime) {
		this.fromTime = fromTime;
	}

	public ISODateTime getRejectTime() {
		return rejectTime;
	}

	public void setRejectTime(ISODateTime rejectTime) {
		this.rejectTime = rejectTime;
	}
}