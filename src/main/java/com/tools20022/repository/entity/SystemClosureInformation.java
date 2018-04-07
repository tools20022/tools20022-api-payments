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
import com.tools20022.repository.codeset.SystemClosureReasonCode;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SystemAvailability;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Information about inactivity of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemClosureInformation"
 * src="doc-files/SystemClosureInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#mmPeriod
 * SystemClosureInformation.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#mmSystemAvailability
 * SystemClosureInformation.mmSystemAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#mmClosureReason
 * SystemClosureInformation.mmClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosureInformation
 * SystemAvailability.mmClosureInformation}</li>
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
 * "SystemClosureInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about inactivity of a system."</li>
 * </ul>
 */
public class SystemClosureInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation
	 * SystemClosureInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time when the system is closed/not operating."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemClosureInformation, DateTimePeriod> mmPeriod = new MMBusinessAttribute<SystemClosureInformation, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemClosureInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Period of time when the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SystemClosureInformation obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(SystemClosureInformation obj, DateTimePeriod value) {
			obj.setPeriod(value);
		}
	};
	protected SystemAvailability systemAvailability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosureInformation
	 * SystemAvailability.mmClosureInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation
	 * SystemClosureInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which closure information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemClosureInformation, SystemAvailability> mmSystemAvailability = new MMBusinessAssociationEnd<SystemClosureInformation, SystemAvailability>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemClosureInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemAvailability";
			definition = "System for which closure information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemAvailability.mmClosureInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemAvailability.mmObject();
		}

		@Override
		public SystemAvailability getValue(SystemClosureInformation obj) {
			return obj.getSystemAvailability();
		}

		@Override
		public void setValue(SystemClosureInformation obj, SystemAvailability value) {
			obj.setSystemAvailability(value);
		}
	};
	protected SystemClosureReasonCode closureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation
	 * SystemClosureInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the system is closed/not operating."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemClosureInformation, SystemClosureReasonCode> mmClosureReason = new MMBusinessAttribute<SystemClosureInformation, SystemClosureReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemClosureInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemClosureReasonCode.mmObject();
		}

		@Override
		public SystemClosureReasonCode getValue(SystemClosureInformation obj) {
			return obj.getClosureReason();
		}

		@Override
		public void setValue(SystemClosureInformation obj, SystemClosureReasonCode value) {
			obj.setClosureReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemClosureInformation";
				definition = "Information about inactivity of a system.";
				associationDomain_lazy = () -> Arrays.asList(SystemAvailability.mmClosureInformation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemClosureInformation.mmPeriod, com.tools20022.repository.entity.SystemClosureInformation.mmSystemAvailability,
						com.tools20022.repository.entity.SystemClosureInformation.mmClosureReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemClosureInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getPeriod() {
		return period;
	}

	public SystemClosureInformation setPeriod(DateTimePeriod period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public SystemAvailability getSystemAvailability() {
		return systemAvailability;
	}

	public SystemClosureInformation setSystemAvailability(SystemAvailability systemAvailability) {
		this.systemAvailability = Objects.requireNonNull(systemAvailability);
		return this;
	}

	public SystemClosureReasonCode getClosureReason() {
		return closureReason;
	}

	public SystemClosureInformation setClosureReason(SystemClosureReasonCode closureReason) {
		this.closureReason = Objects.requireNonNull(closureReason);
		return this;
	}
}