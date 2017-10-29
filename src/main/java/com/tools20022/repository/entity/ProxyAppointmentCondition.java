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
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conditions that must be met to appoint a proxy.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProxyAppointmentCondition"
 * src="doc-files/ProxyAppointmentCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#NotificationAddress
 * ProxyAppointmentCondition.NotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#Meeting
 * ProxyAppointmentCondition.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#RegistrationMethod
 * ProxyAppointmentCondition.RegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#AllowedProxyType
 * ProxyAppointmentCondition.AllowedProxyType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedProxyAppointment
 * ContactPoint.RelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#ProxyAppointmentConditions
 * Meeting.ProxyAppointmentConditions}</li>
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
 * "ProxyAppointmentCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Conditions that must be met to appoint a proxy."</li>
 * </ul>
 */
public class ProxyAppointmentCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address where the information on the proxy should be sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedProxyAppointment
	 * ContactPoint.RelatedProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the information on the proxy should be sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NotificationAddress = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the meeting to which the proxy appointment conditions aplly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#ProxyAppointmentConditions
	 * Meeting.ProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meeting to which the proxy appointment conditions aplly."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Specifies the meeting to which the proxy appointment conditions aplly.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates how to register a proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies who can be assigned as a proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who can be assigned as a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllowedProxyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowedProxyType";
			definition = "Specifies who can be assigned as a proxy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentCondition";
				definition = "Conditions that must be met to appoint a proxy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment, com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress, com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting,
						com.tools20022.repository.entity.ProxyAppointmentCondition.RegistrationMethod, com.tools20022.repository.entity.ProxyAppointmentCondition.AllowedProxyType);
			}
		});
		return mmObject_lazy.get();
	}
}