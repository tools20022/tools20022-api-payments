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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#AvailableSessionPeriod
 * SystemAvailability.AvailableSessionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#System
 * SystemAvailability.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#ClosureInformation
 * SystemAvailability.ClosureInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#Date
 * SystemAvailability.Date}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#ClosurePeriod
 * SystemAvailability.ClosurePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSystemAvailability
 * DateTimePeriod.RelatedSystemAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Availability
 * System.Availability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimePeriod#SystemAvailability
 * TimePeriod.SystemAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#SystemAvailability
 * SystemClosureInformation.SystemAvailability}</li>
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
	/**
	 * Time window of system activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimePeriod#SystemAvailability
	 * TimePeriod.SystemAvailability}</li>
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
	public static final MMBusinessAssociationEnd AvailableSessionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableSessionPeriod";
			definition = "Time window of system activity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TimePeriod.SystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System for which the system availability is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#Availability
	 * System.Availability}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which the system availability is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Availability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System availability parameters which contain closure information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemClosureInformation#SystemAvailability
	 * SystemClosureInformation.SystemAvailability}</li>
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
	public static final MMBusinessAssociationEnd ClosureInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureInformation";
			definition = "System availability parameters which contain closure information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemClosureInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemClosureInformation.SystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date for which the availability information is provided.
	 * <p>
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
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SystemAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date for which the availability information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Period for which the system is closed/not operating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSystemAvailability
	 * DateTimePeriod.RelatedSystemAvailability}</li>
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
	public static final MMBusinessAssociationEnd ClosurePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosurePeriod";
			definition = "Period for which the system is closed/not operating.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemAvailability";
				definition = "information about the periods of activity and non-activity of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability, com.tools20022.repository.entity.System.Availability,
						com.tools20022.repository.entity.TimePeriod.SystemAvailability, com.tools20022.repository.entity.SystemClosureInformation.SystemAvailability);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemAvailability.AvailableSessionPeriod, com.tools20022.repository.entity.SystemAvailability.System,
						com.tools20022.repository.entity.SystemAvailability.ClosureInformation, com.tools20022.repository.entity.SystemAvailability.Date, com.tools20022.repository.entity.SystemAvailability.ClosurePeriod);
			}
		});
		return mmObject_lazy.get();
	}
}