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
import com.tools20022.repository.codeset.DeliveryPlaceCode;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information about the attendance card which is issued for the requestor, for
 * its underlying client or for the appointed proxy person or meeting attendee
 * when an attendance request is included in the meeting instruction. <br>
 * The instructing party can specify which information must be indicated on the
 * attendance card and to which location the attendance card must be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AttendanceCard" src="doc-files/AttendanceCard.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmAttendanceCardLabelling
 * AttendanceCard.mmAttendanceCardLabelling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmMeetingAttendance
 * AttendanceCard.mmMeetingAttendance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmDeliveryMethod
 * AttendanceCard.mmDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmDeliveryPlace
 * AttendanceCard.mmDeliveryPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmDeliveredAttendanceCard
 * ContactPoint.mmDeliveredAttendanceCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmAttendanceCard
 * MeetingAttendance.mmAttendanceCard}</li>
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
 * "AttendanceCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the attendance card which is issued for the requestor, for its underlying client or for the appointed proxy person or meeting attendee when an attendance request is included in the meeting instruction. \r\nThe instructing party can specify which information must be indicated on the attendance card and to which location the attendance card must be delivered."
 * </li>
 * </ul>
 */
public class AttendanceCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max105Text attendanceCardLabelling;
	/**
	 * Information to be indicated on the attendance card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceCardLabelling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to be indicated on the attendance card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttendanceCardLabelling = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceCardLabelling";
			definition = "Information to be indicated on the attendance card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AttendanceCard.class.getMethod("getAttendanceCardLabelling", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingAttendance meetingAttendance;
	/**
	 * Attendance card which is required to attend the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmAttendanceCard
	 * MeetingAttendance.mmAttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingAttendance
	 * MeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attendance card which is required to attend the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingAttendance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Attendance card which is required to attend the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmAttendanceCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
		}
	};
	protected DeliveryPlaceCode deliveryMethod;
	/**
	 * Specifies where the attendance card must be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
	 * DeliveryPlaceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the attendance card must be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeliveryMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies where the attendance card must be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryPlaceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AttendanceCard.class.getMethod("getDeliveryMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> deliveryPlace;
	/**
	 * Address where the attendance card should be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmDeliveredAttendanceCard
	 * ContactPoint.mmDeliveredAttendanceCard}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address where the attendance card should be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliveryPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryPlace";
			definition = "Address where the attendance card should be delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmDeliveredAttendanceCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceCard";
				definition = "Information about the attendance card which is issued for the requestor, for its underlying client or for the appointed proxy person or meeting attendee when an attendance request is included in the meeting instruction. \r\nThe instructing party can specify which information must be indicated on the attendance card and to which location the attendance card must be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmDeliveredAttendanceCard, com.tools20022.repository.entity.MeetingAttendance.mmAttendanceCard);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AttendanceCard.mmAttendanceCardLabelling, com.tools20022.repository.entity.AttendanceCard.mmMeetingAttendance,
						com.tools20022.repository.entity.AttendanceCard.mmDeliveryMethod, com.tools20022.repository.entity.AttendanceCard.mmDeliveryPlace);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AttendanceCard.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max105Text getAttendanceCardLabelling() {
		return attendanceCardLabelling;
	}

	public void setAttendanceCardLabelling(Max105Text attendanceCardLabelling) {
		this.attendanceCardLabelling = attendanceCardLabelling;
	}

	public MeetingAttendance getMeetingAttendance() {
		return meetingAttendance;
	}

	public void setMeetingAttendance(com.tools20022.repository.entity.MeetingAttendance meetingAttendance) {
		this.meetingAttendance = meetingAttendance;
	}

	public DeliveryPlaceCode getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryPlaceCode deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public List<ContactPoint> getDeliveryPlace() {
		return deliveryPlace;
	}

	public void setDeliveryPlace(List<com.tools20022.repository.entity.ContactPoint> deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}
}