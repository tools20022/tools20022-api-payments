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
import com.tools20022.repository.codeset.CancellationStatusCode;
import com.tools20022.repository.codeset.NotificationStatusCode;
import com.tools20022.repository.codeset.ResolutionStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the instructions related to a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatus" src="doc-files/MeetingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeetingResolutionStatus
 * MeetingStatus.mmMeetingResolutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmInstructionCancellationStatus
 * MeetingStatus.mmInstructionCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmReason
 * MeetingStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmNotificationStatus
 * MeetingStatus.mmNotificationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
 * MeetingStatus.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmStatus
 * Meeting.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingStatus
 * MeetingStatusReason.mmMeetingStatus}</li>
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
 * "MeetingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the instructions related to a meeting."</li>
 * </ul>
 */
public class MeetingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ResolutionStatusCode meetingResolutionStatus;
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
	public static final MMBusinessAttribute mmMeetingResolutionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingResolutionStatus";
			definition = "Indicates whether the resolution is active or withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingStatus.class.getMethod("getMeetingResolutionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationStatusCode instructionCancellationStatus;
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
	public static final MMBusinessAttribute mmInstructionCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the request for cancellation of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingStatus.class.getMethod("getInstructionCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.MeetingStatusReason> reason;
	/**
	 * Specifies the underlying reason for a status of a meeting or related
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingStatus
	 * MeetingStatusReason.mmMeetingStatus}</li>
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
	public static final MMBusinessAssociationEnd mmReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmMeetingStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmObject();
		}
	};
	protected NotificationStatusCode notificationStatus;
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
	public static final MMBusinessAttribute mmNotificationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the related notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingStatus.class.getMethod("getNotificationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting meeting;
	/**
	 * Meeting for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmStatus
	 * Meeting.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingStatus";
				definition = "Status of the instructions related to a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmStatus, com.tools20022.repository.entity.MeetingStatusReason.mmMeetingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.mmMeetingResolutionStatus, com.tools20022.repository.entity.MeetingStatus.mmInstructionCancellationStatus,
						com.tools20022.repository.entity.MeetingStatus.mmReason, com.tools20022.repository.entity.MeetingStatus.mmNotificationStatus, com.tools20022.repository.entity.MeetingStatus.mmMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ResolutionStatusCode getMeetingResolutionStatus() {
		return meetingResolutionStatus;
	}

	public void setMeetingResolutionStatus(ResolutionStatusCode meetingResolutionStatus) {
		this.meetingResolutionStatus = meetingResolutionStatus;
	}

	public CancellationStatusCode getInstructionCancellationStatus() {
		return instructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(CancellationStatusCode instructionCancellationStatus) {
		this.instructionCancellationStatus = instructionCancellationStatus;
	}

	public List<MeetingStatusReason> getReason() {
		return reason;
	}

	public void setReason(List<com.tools20022.repository.entity.MeetingStatusReason> reason) {
		this.reason = reason;
	}

	public NotificationStatusCode getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatusCode notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}
}