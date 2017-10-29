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
import com.tools20022.repository.codeset.DeliveryPlaceCode;
import com.tools20022.repository.datatype.Max105Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#AttendanceCardLabelling
 * AttendanceCard.AttendanceCardLabelling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#MeetingAttendance
 * AttendanceCard.MeetingAttendance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#DeliveryMethod
 * AttendanceCard.DeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#DeliveryPlace
 * AttendanceCard.DeliveryPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#DeliveredAttendanceCard
 * ContactPoint.DeliveredAttendanceCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#AttendanceCard
 * MeetingAttendance.AttendanceCard}</li>
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
 * "AttendanceCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the attendance card which is issued for the requestor, for its underlying client or for the appointed proxy person or meeting attendee when an attendance request is included in the meeting instruction. \r\nThe instructing party can specify which information must be indicated on the attendance card and to which location the attendance card must be delivered."
 * </li>
 * </ul>
 */
public class AttendanceCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute AttendanceCardLabelling = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AttendanceCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceCardLabelling";
			definition = "Information to be indicated on the attendance card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Attendance card which is required to attend the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#AttendanceCard
	 * MeetingAttendance.AttendanceCard}</li>
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
	public static final MMBusinessAssociationEnd MeetingAttendance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AttendanceCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Attendance card which is required to attend the meeting.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.AttendanceCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AttendanceCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies where the attendance card must be delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryPlaceCode.mmObject();
		}
	};
	/**
	 * Address where the attendance card should be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#DeliveredAttendanceCard
	 * ContactPoint.DeliveredAttendanceCard}</li>
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
	public static final MMBusinessAssociationEnd DeliveryPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AttendanceCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryPlace";
			definition = "Address where the attendance card should be delivered.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AttendanceCard";
				definition = "Information about the attendance card which is issued for the requestor, for its underlying client or for the appointed proxy person or meeting attendee when an attendance request is included in the meeting instruction. \r\nThe instructing party can specify which information must be indicated on the attendance card and to which location the attendance card must be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard, com.tools20022.repository.entity.MeetingAttendance.AttendanceCard);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AttendanceCard.AttendanceCardLabelling, com.tools20022.repository.entity.AttendanceCard.MeetingAttendance,
						com.tools20022.repository.entity.AttendanceCard.DeliveryMethod, com.tools20022.repository.entity.AttendanceCard.DeliveryPlace);
			}
		});
		return mmObject_lazy.get();
	}
}