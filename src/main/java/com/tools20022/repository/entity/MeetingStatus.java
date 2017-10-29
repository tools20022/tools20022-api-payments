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
import com.tools20022.repository.codeset.CancellationStatusCode;
import com.tools20022.repository.codeset.NotificationStatusCode;
import com.tools20022.repository.codeset.ResolutionStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the instructions related to a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatus" src="doc-files/MeetingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#MeetingResolutionStatus
 * MeetingStatus.MeetingResolutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#InstructionCancellationStatus
 * MeetingStatus.InstructionCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Reason
 * MeetingStatus.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#NotificationStatus
 * MeetingStatus.NotificationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
 * MeetingStatus.Meeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Status
 * Meeting.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingStatus
 * MeetingStatusReason.MeetingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "MeetingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the instructions related to a meeting."</li>
 * </ul>
 */
public class MeetingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the resolution is active or withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingResolutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the resolution is active or withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeetingResolutionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingResolutionStatus";
			definition = "Indicates whether the resolution is active or withdrawn.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResolutionStatusCode.mmObject();
		}
	};
	/**
	 * Status of the request for cancellation of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request for cancellation of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the request for cancellation of an instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the underlying reason for a status of a meeting or related
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingStatus
	 * MeetingStatusReason.MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying reason for a status of a meeting or related instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
			minOccurs = 0;
			type_lazy = () -> MeetingStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the related notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the related notification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the related notification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NotificationStatusCode.mmObject();
		}
	};
	/**
	 * Meeting for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Meeting#Status
	 * Meeting.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingStatus";
				definition = "Status of the instructions related to a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.MeetingResolutionStatus, com.tools20022.repository.entity.MeetingStatus.InstructionCancellationStatus,
						com.tools20022.repository.entity.MeetingStatus.Reason, com.tools20022.repository.entity.MeetingStatus.NotificationStatus, com.tools20022.repository.entity.MeetingStatus.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}