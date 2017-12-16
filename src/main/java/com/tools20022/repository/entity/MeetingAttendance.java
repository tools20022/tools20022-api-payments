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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information on the participation of the security holder or of its assigned
 * representative.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingAttendance" src="doc-files/MeetingAttendance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmAttendanceCard
 * MeetingAttendance.mmAttendanceCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmPercentageOfVotingRights
 * MeetingAttendance.mmPercentageOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmRelatedMeeting
 * MeetingAttendance.mmRelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmMeetingAttendance
 * InstructionForMeeting.mmMeetingAttendance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmMeetingAttendance
 * AttendanceCard.mmMeetingAttendance}</li>
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
 * "MeetingAttendance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the participation of the security holder or of its assigned representative."
 * </li>
 * </ul>
 */
public class MeetingAttendance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AttendanceCard attendanceCard;
	/**
	 * Specifies details linked to the attendance card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmMeetingAttendance
	 * AttendanceCard.mmMeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance
	 * MeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies details linked to the attendance card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAttendanceCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceCard";
			definition = "Specifies details linked to the attendance card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmMeetingAttendance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
		}
	};
	protected PercentageRate percentageOfVotingRights;
	/**
	 * Percentage of rights participating to the vote versus total voting
	 * rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance
	 * MeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of rights participating to the vote versus total voting rights."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfVotingRights = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfVotingRights";
			definition = "Percentage of rights participating to the vote versus total voting rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingAttendance.class.getMethod("getPercentageOfVotingRights", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionForMeeting relatedMeeting;
	/**
	 * Instruction in which the meeting attendance conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmMeetingAttendance
	 * InstructionForMeeting.mmMeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance
	 * MeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction in which the meeting attendance conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Instruction in which the meeting attendance conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmMeetingAttendance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingAttendance";
				definition = "Information on the participation of the security holder or of its assigned representative.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InstructionForMeeting.mmMeetingAttendance, com.tools20022.repository.entity.AttendanceCard.mmMeetingAttendance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingAttendance.mmAttendanceCard, com.tools20022.repository.entity.MeetingAttendance.mmPercentageOfVotingRights,
						com.tools20022.repository.entity.MeetingAttendance.mmRelatedMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingAttendance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AttendanceCard getAttendanceCard() {
		return attendanceCard;
	}

	public void setAttendanceCard(com.tools20022.repository.entity.AttendanceCard attendanceCard) {
		this.attendanceCard = attendanceCard;
	}

	public PercentageRate getPercentageOfVotingRights() {
		return percentageOfVotingRights;
	}

	public void setPercentageOfVotingRights(PercentageRate percentageOfVotingRights) {
		this.percentageOfVotingRights = percentageOfVotingRights;
	}

	public InstructionForMeeting getRelatedMeeting() {
		return relatedMeeting;
	}

	public void setRelatedMeeting(com.tools20022.repository.entity.InstructionForMeeting relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
	}
}