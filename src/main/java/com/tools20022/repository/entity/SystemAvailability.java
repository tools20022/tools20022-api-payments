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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.SystemClosureInformation;
import com.tools20022.repository.entity.TimePeriod;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * information about the periods of activity and non-activity of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemAvailability" src="doc-files/SystemAvailability.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmAvailableSessionPeriod
 * SystemAvailability.mmAvailableSessionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#mmSystem
 * SystemAvailability.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosureInformation
 * SystemAvailability.mmClosureInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#mmDate
 * SystemAvailability.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosurePeriod
 * SystemAvailability.mmClosurePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSystemAvailability
 * DateTimePeriod.mmRelatedSystemAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAvailability
 * System.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimePeriod#mmSystemAvailability
 * TimePeriod.mmSystemAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#mmSystemAvailability
 * SystemClosureInformation.mmSystemAvailability}</li>
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
 * "SystemAvailability"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "information about the periods of activity and non-activity of a system."</li>
 * </ul>
 */
public class SystemAvailability {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TimePeriod availableSessionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimePeriod#mmSystemAvailability
	 * TimePeriod.mmSystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TimePeriod
	 * TimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableSessionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time window of system activity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemAvailability, TimePeriod> mmAvailableSessionPeriod = new MMBusinessAssociationEnd<SystemAvailability, TimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableSessionPeriod";
			definition = "Time window of system activity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TimePeriod.mmSystemAvailability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TimePeriod.mmObject();
		}

		@Override
		public TimePeriod getValue(SystemAvailability obj) {
			return obj.getAvailableSessionPeriod();
		}

		@Override
		public void setValue(SystemAvailability obj, TimePeriod value) {
			obj.setAvailableSessionPeriod(value);
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAvailability
	 * System.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which the system availability is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemAvailability, Optional<System>> mmSystem = new MMBusinessAssociationEnd<SystemAvailability, Optional<System>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which the system availability is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> System.mmAvailability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public Optional<System> getValue(SystemAvailability obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(SystemAvailability obj, Optional<System> value) {
			obj.setSystem(value.orElse(null));
		}
	};
	protected SystemClosureInformation closureInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#mmSystemAvailability
	 * SystemClosureInformation.mmSystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation
	 * SystemClosureInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System availability parameters which contain closure information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemAvailability, SystemClosureInformation> mmClosureInformation = new MMBusinessAssociationEnd<SystemAvailability, SystemClosureInformation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureInformation";
			definition = "System availability parameters which contain closure information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemClosureInformation.mmSystemAvailability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemClosureInformation.mmObject();
		}

		@Override
		public SystemClosureInformation getValue(SystemAvailability obj) {
			return obj.getClosureInformation();
		}

		@Override
		public void setValue(SystemAvailability obj, SystemClosureInformation value) {
			obj.setClosureInformation(value);
		}
	};
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the availability information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemAvailability, ISODate> mmDate = new MMBusinessAttribute<SystemAvailability, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date for which the availability information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SystemAvailability obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(SystemAvailability obj, ISODate value) {
			obj.setDate(value);
		}
	};
	protected DateTimePeriod closurePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSystemAvailability
	 * DateTimePeriod.mmRelatedSystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the system is closed/not operating."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemAvailability, DateTimePeriod> mmClosurePeriod = new MMBusinessAssociationEnd<SystemAvailability, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosurePeriod";
			definition = "Period for which the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedSystemAvailability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SystemAvailability obj) {
			return obj.getClosurePeriod();
		}

		@Override
		public void setValue(SystemAvailability obj, DateTimePeriod value) {
			obj.setClosurePeriod(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemAvailability";
				definition = "information about the periods of activity and non-activity of a system.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedSystemAvailability, System.mmAvailability, TimePeriod.mmSystemAvailability, SystemClosureInformation.mmSystemAvailability);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemAvailability.mmAvailableSessionPeriod, com.tools20022.repository.entity.SystemAvailability.mmSystem,
						com.tools20022.repository.entity.SystemAvailability.mmClosureInformation, com.tools20022.repository.entity.SystemAvailability.mmDate, com.tools20022.repository.entity.SystemAvailability.mmClosurePeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemAvailability.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TimePeriod getAvailableSessionPeriod() {
		return availableSessionPeriod;
	}

	public SystemAvailability setAvailableSessionPeriod(TimePeriod availableSessionPeriod) {
		this.availableSessionPeriod = Objects.requireNonNull(availableSessionPeriod);
		return this;
	}

	public Optional<System> getSystem() {
		return system == null ? Optional.empty() : Optional.of(system);
	}

	public SystemAvailability setSystem(System system) {
		this.system = system;
		return this;
	}

	public SystemClosureInformation getClosureInformation() {
		return closureInformation;
	}

	public SystemAvailability setClosureInformation(SystemClosureInformation closureInformation) {
		this.closureInformation = Objects.requireNonNull(closureInformation);
		return this;
	}

	public ISODate getDate() {
		return date;
	}

	public SystemAvailability setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public DateTimePeriod getClosurePeriod() {
		return closurePeriod;
	}

	public SystemAvailability setClosurePeriod(DateTimePeriod closurePeriod) {
		this.closurePeriod = Objects.requireNonNull(closurePeriod);
		return this;
	}
}