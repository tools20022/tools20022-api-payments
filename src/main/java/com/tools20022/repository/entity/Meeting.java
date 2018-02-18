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
import com.tools20022.repository.codeset.MeetingDateStatusCode;
import com.tools20022.repository.codeset.MeetingTypeClassificationCode;
import com.tools20022.repository.codeset.MeetingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the physical parameters of a general meeting. Several dates and
 * places can be defined for a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Meeting" src="doc-files/Meeting.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
 * Meeting.mmDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDateStatus
 * Meeting.mmDateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
 * Meeting.mmMeetingLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
 * Meeting.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingServicing
 * Meeting.mmMeetingServicing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPerson
 * Meeting.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPartyRole
 * Meeting.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmStatus
 * Meeting.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
 * Meeting.mmCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmQuorum
 * Meeting.mmQuorum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmVotingCondition
 * Meeting.mmVotingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceRequired
 * Meeting.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceConfirmation
 * Meeting.mmAttendanceConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
 * Meeting.mmIncentivePremium}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmParticipation
 * Meeting.mmParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmResolutionProposalConditions
 * Meeting.mmResolutionProposalConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAgendaItem
 * Meeting.mmAgendaItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
 * Meeting.mmProxyAppointmentConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
 * Meeting.mmAdditionalRight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmType
 * Meeting.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmPowerOfAttorneyRequirements
 * Meeting.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
 * Meeting.mmMeetingEventClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForMeeting
 * ContactPoint.mmContactPointForMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
 * ContactPersonRole.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
 * CorporateActionEvent.mmRelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingPartyRole#mmMeeting
 * MeetingPartyRole.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmMeeting
 * ResolutionProposal.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
 * ProxyAppointmentCondition.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmMeeting
 * MeetingParticipation.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmMeeting
 * Quorum.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmMeeting
 * Resolution.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
 * MeetingStatus.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#mmMeeting
 * VotingCondition.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
 * IncentivePremium.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmMeeting
 * PowerOfAttorneyRequirements.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#mmMeeting
 * AdditionalRight.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingSpecification
 * MeetingServicing.mmMeetingSpecification}</li>
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
 * "Meeting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting."
 * </li>
 * </ul>
 */
public class Meeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime dateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the meeting will take place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateAndTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getDateAndTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingDateStatusCode dateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of a meeting date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getDateStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> meetingLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForMeeting
	 * ContactPoint.mmContactPointForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of the company meeting for the scheduled meeting date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmContactPointForMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected Max35Text identification;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Deadline> deadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
	 * Deadline.mmRelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeadline = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	protected MeetingServicing meetingServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingSpecification
	 * MeetingServicing.mmMeetingSpecification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Servicing processes related to the organisation of a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmMeetingSpecification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPersonRole> person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
	 * ContactPersonRole.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the person who is the contact for a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingPartyRole#mmMeeting
	 * MeetingPartyRole.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingPartyRole
	 * MeetingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingStatus> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
	 * MeetingStatus.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatus
	 * MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the imeeting and of the related nstructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
		}
	};
	protected CorporateActionEvent corporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
	 * CorporateActionEvent.mmRelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a meeting is organised."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Quorum> quorum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmMeeting
	 * Quorum.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quorum Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quorum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a quorum is required or not together with the quorum parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuorum = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quorum.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.VotingCondition> votingCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmMeeting
	 * VotingCondition.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different voting types, channels and premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVotingCondition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
		}
	};
	protected YesNoIndicator attendanceRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether physical participation to a meeting is required in order to be allowed to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttendanceRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getAttendanceRequired", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text attendanceConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how to order the attendance card or to give notice of attendance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttendanceConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceConfirmation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getAttendanceConfirmation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IncentivePremium incentivePremium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
	 * IncentivePremium.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIncentivePremium = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingParticipation> participation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmMeeting
	 * MeetingParticipation.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Participation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potential participation to the voting process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParticipation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ResolutionProposal> resolutionProposalConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmMeeting
	 * ResolutionProposal.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ResolutionProposal
	 * ResolutionProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to fulfill in order to be able to propose a resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResolutionProposalConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Resolution> agendaItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmMeeting
	 * Resolution.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Resolution
	 * Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgendaItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Item proposed for the vote or presented for information only."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgendaItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProxyAppointmentCondition> proxyAppointmentConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
	 * ProxyAppointmentCondition.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on how to appoint proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProxyAppointmentConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AdditionalRight> additionalRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmMeeting
	 * AdditionalRight.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalRight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
		}
	};
	protected MeetingTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of meeting for which an invitation is sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which an invitation is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PowerOfAttorneyRequirements powerOfAttorneyRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmMeeting
	 * PowerOfAttorneyRequirements.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to be filled in to obtain a valid power of attorney."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
		}
	};
	protected MeetingTypeClassificationCode meetingEventClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingEventClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classifies the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMeetingEventClassification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingEventClassification";
			definition = "Classifies the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeClassificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Meeting.class.getMethod("getMeetingEventClassification", new Class[]{});
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
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmContactPointForMeeting, com.tools20022.repository.entity.ContactPersonRole.mmMeeting,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting, com.tools20022.repository.entity.Deadline.mmRelatedMeeting, com.tools20022.repository.entity.MeetingPartyRole.mmMeeting,
						com.tools20022.repository.entity.ResolutionProposal.mmMeeting, com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting, com.tools20022.repository.entity.MeetingParticipation.mmMeeting,
						com.tools20022.repository.entity.Quorum.mmMeeting, com.tools20022.repository.entity.Resolution.mmMeeting, com.tools20022.repository.entity.MeetingStatus.mmMeeting,
						com.tools20022.repository.entity.VotingCondition.mmMeeting, com.tools20022.repository.entity.IncentivePremium.mmMeeting, com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmMeeting,
						com.tools20022.repository.entity.AdditionalRight.mmMeeting, com.tools20022.repository.entity.MeetingServicing.mmMeetingSpecification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmDateAndTime, com.tools20022.repository.entity.Meeting.mmDateStatus, com.tools20022.repository.entity.Meeting.mmMeetingLocation,
						com.tools20022.repository.entity.Meeting.mmIdentification, com.tools20022.repository.entity.Meeting.mmDeadline, com.tools20022.repository.entity.Meeting.mmMeetingServicing,
						com.tools20022.repository.entity.Meeting.mmPerson, com.tools20022.repository.entity.Meeting.mmPartyRole, com.tools20022.repository.entity.Meeting.mmStatus, com.tools20022.repository.entity.Meeting.mmCorporateEvent,
						com.tools20022.repository.entity.Meeting.mmQuorum, com.tools20022.repository.entity.Meeting.mmVotingCondition, com.tools20022.repository.entity.Meeting.mmAttendanceRequired,
						com.tools20022.repository.entity.Meeting.mmAttendanceConfirmation, com.tools20022.repository.entity.Meeting.mmIncentivePremium, com.tools20022.repository.entity.Meeting.mmParticipation,
						com.tools20022.repository.entity.Meeting.mmResolutionProposalConditions, com.tools20022.repository.entity.Meeting.mmAgendaItem, com.tools20022.repository.entity.Meeting.mmProxyAppointmentConditions,
						com.tools20022.repository.entity.Meeting.mmAdditionalRight, com.tools20022.repository.entity.Meeting.mmType, com.tools20022.repository.entity.Meeting.mmPowerOfAttorneyRequirements,
						com.tools20022.repository.entity.Meeting.mmMeetingEventClassification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Meeting.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateAndTime() {
		return dateAndTime;
	}

	public Meeting setDateAndTime(ISODateTime dateAndTime) {
		this.dateAndTime = Objects.requireNonNull(dateAndTime);
		return this;
	}

	public MeetingDateStatusCode getDateStatus() {
		return dateStatus;
	}

	public Meeting setDateStatus(MeetingDateStatusCode dateStatus) {
		this.dateStatus = Objects.requireNonNull(dateStatus);
		return this;
	}

	public List<ContactPoint> getMeetingLocation() {
		return meetingLocation == null ? meetingLocation = new ArrayList<>() : meetingLocation;
	}

	public Meeting setMeetingLocation(List<com.tools20022.repository.entity.ContactPoint> meetingLocation) {
		this.meetingLocation = Objects.requireNonNull(meetingLocation);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Meeting setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<Deadline> getDeadline() {
		return deadline == null ? deadline = new ArrayList<>() : deadline;
	}

	public Meeting setDeadline(List<com.tools20022.repository.entity.Deadline> deadline) {
		this.deadline = Objects.requireNonNull(deadline);
		return this;
	}

	public Optional<MeetingServicing> getMeetingServicing() {
		return meetingServicing == null ? Optional.empty() : Optional.of(meetingServicing);
	}

	public Meeting setMeetingServicing(com.tools20022.repository.entity.MeetingServicing meetingServicing) {
		this.meetingServicing = meetingServicing;
		return this;
	}

	public List<ContactPersonRole> getPerson() {
		return person == null ? person = new ArrayList<>() : person;
	}

	public Meeting setPerson(List<com.tools20022.repository.entity.ContactPersonRole> person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}

	public List<MeetingPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Meeting setPartyRole(List<com.tools20022.repository.entity.MeetingPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<MeetingStatus> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public Meeting setStatus(List<com.tools20022.repository.entity.MeetingStatus> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent == null ? Optional.empty() : Optional.of(corporateEvent);
	}

	public Meeting setCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent corporateEvent) {
		this.corporateEvent = corporateEvent;
		return this;
	}

	public List<Quorum> getQuorum() {
		return quorum == null ? quorum = new ArrayList<>() : quorum;
	}

	public Meeting setQuorum(List<com.tools20022.repository.entity.Quorum> quorum) {
		this.quorum = Objects.requireNonNull(quorum);
		return this;
	}

	public List<VotingCondition> getVotingCondition() {
		return votingCondition == null ? votingCondition = new ArrayList<>() : votingCondition;
	}

	public Meeting setVotingCondition(List<com.tools20022.repository.entity.VotingCondition> votingCondition) {
		this.votingCondition = Objects.requireNonNull(votingCondition);
		return this;
	}

	public YesNoIndicator getAttendanceRequired() {
		return attendanceRequired;
	}

	public Meeting setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = Objects.requireNonNull(attendanceRequired);
		return this;
	}

	public Max350Text getAttendanceConfirmation() {
		return attendanceConfirmation;
	}

	public Meeting setAttendanceConfirmation(Max350Text attendanceConfirmation) {
		this.attendanceConfirmation = Objects.requireNonNull(attendanceConfirmation);
		return this;
	}

	public Optional<IncentivePremium> getIncentivePremium() {
		return incentivePremium == null ? Optional.empty() : Optional.of(incentivePremium);
	}

	public Meeting setIncentivePremium(com.tools20022.repository.entity.IncentivePremium incentivePremium) {
		this.incentivePremium = incentivePremium;
		return this;
	}

	public List<MeetingParticipation> getParticipation() {
		return participation == null ? participation = new ArrayList<>() : participation;
	}

	public Meeting setParticipation(List<com.tools20022.repository.entity.MeetingParticipation> participation) {
		this.participation = Objects.requireNonNull(participation);
		return this;
	}

	public List<ResolutionProposal> getResolutionProposalConditions() {
		return resolutionProposalConditions == null ? resolutionProposalConditions = new ArrayList<>() : resolutionProposalConditions;
	}

	public Meeting setResolutionProposalConditions(List<com.tools20022.repository.entity.ResolutionProposal> resolutionProposalConditions) {
		this.resolutionProposalConditions = Objects.requireNonNull(resolutionProposalConditions);
		return this;
	}

	public List<Resolution> getAgendaItem() {
		return agendaItem == null ? agendaItem = new ArrayList<>() : agendaItem;
	}

	public Meeting setAgendaItem(List<com.tools20022.repository.entity.Resolution> agendaItem) {
		this.agendaItem = Objects.requireNonNull(agendaItem);
		return this;
	}

	public List<ProxyAppointmentCondition> getProxyAppointmentConditions() {
		return proxyAppointmentConditions == null ? proxyAppointmentConditions = new ArrayList<>() : proxyAppointmentConditions;
	}

	public Meeting setProxyAppointmentConditions(List<com.tools20022.repository.entity.ProxyAppointmentCondition> proxyAppointmentConditions) {
		this.proxyAppointmentConditions = Objects.requireNonNull(proxyAppointmentConditions);
		return this;
	}

	public List<AdditionalRight> getAdditionalRight() {
		return additionalRight == null ? additionalRight = new ArrayList<>() : additionalRight;
	}

	public Meeting setAdditionalRight(List<com.tools20022.repository.entity.AdditionalRight> additionalRight) {
		this.additionalRight = Objects.requireNonNull(additionalRight);
		return this;
	}

	public MeetingTypeCode getType() {
		return type;
	}

	public Meeting setType(MeetingTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PowerOfAttorneyRequirements getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements;
	}

	public Meeting setPowerOfAttorneyRequirements(com.tools20022.repository.entity.PowerOfAttorneyRequirements powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = Objects.requireNonNull(powerOfAttorneyRequirements);
		return this;
	}

	public MeetingTypeClassificationCode getMeetingEventClassification() {
		return meetingEventClassification;
	}

	public Meeting setMeetingEventClassification(MeetingTypeClassificationCode meetingEventClassification) {
		this.meetingEventClassification = Objects.requireNonNull(meetingEventClassification);
		return this;
	}
}