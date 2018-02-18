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
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.ServiceLevelCode;
import com.tools20022.repository.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ServiceLevel" src="doc-files/ServiceLevel.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
 * ServiceLevel.mmPaymentProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmCode
 * ServiceLevel.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmOther
 * ServiceLevel.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmBilateral
 * ServiceLevel.mmBilateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
 * PaymentProcessing.mmServiceLevel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmProprietary
 * ServiceLevel8Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
 * ServiceLevel8Choice}</li>
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
 * "ServiceLevel"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement under which or rules under which the transaction should be processed."
 * </li>
 * </ul>
 */
public class ServiceLevel {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentProcessing paymentProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment process for which a service level is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentProcessing";
			definition = "Payment process for which a service level is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected ServiceLevelCode code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmCode
	 * ServiceLevel8Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a pre-agreed level of service between the parties in a coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ServiceLevel8Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceLevelCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ServiceLevel.class.getMethod("getCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SWIFTServiceLevelCode other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOther = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SWIFTServiceLevelCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ServiceLevel.class.getMethod("getOther", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text bilateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a pre-agreed level of service between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBilateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ServiceLevel.class.getMethod("getBilateral", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel";
				definition = "Agreement under which or rules under which the transaction should be processed.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel);
				derivationElement_lazy = () -> Arrays.asList(ServiceLevel8Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ServiceLevel.mmPaymentProcessing, com.tools20022.repository.entity.ServiceLevel.mmCode, com.tools20022.repository.entity.ServiceLevel.mmOther,
						com.tools20022.repository.entity.ServiceLevel.mmBilateral);
				derivationComponent_lazy = () -> Arrays.asList(ServiceLevel8Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ServiceLevel.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentProcessing> getPaymentProcessing() {
		return paymentProcessing == null ? Optional.empty() : Optional.of(paymentProcessing);
	}

	public ServiceLevel setPaymentProcessing(com.tools20022.repository.entity.PaymentProcessing paymentProcessing) {
		this.paymentProcessing = paymentProcessing;
		return this;
	}

	public ServiceLevelCode getCode() {
		return code;
	}

	public ServiceLevel setCode(ServiceLevelCode code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public SWIFTServiceLevelCode getOther() {
		return other;
	}

	public ServiceLevel setOther(SWIFTServiceLevelCode other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}

	public Max35Text getBilateral() {
		return bilateral;
	}

	public ServiceLevel setBilateral(Max35Text bilateral) {
		this.bilateral = Objects.requireNonNull(bilateral);
		return this;
	}
}