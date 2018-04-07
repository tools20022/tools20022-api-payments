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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
	public static final MMBusinessAttribute<Meeting, ISODateTime> mmDateAndTime = new MMBusinessAttribute<Meeting, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(Meeting obj) {
			return obj.getDateAndTime();
		}

		@Override
		public void setValue(Meeting obj, ISODateTime value) {
			obj.setDateAndTime(value);
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
	public static final MMBusinessAttribute<Meeting, MeetingDateStatusCode> mmDateStatus = new MMBusinessAttribute<Meeting, MeetingDateStatusCode>() {
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

		@Override
		public MeetingDateStatusCode getValue(Meeting obj) {
			return obj.getDateStatus();
		}

		@Override
		public void setValue(Meeting obj, MeetingDateStatusCode value) {
			obj.setDateStatus(value);
		}
	};
	protected List<ContactPoint> meetingLocation;
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
	public static final MMBusinessAssociationEnd<Meeting, List<ContactPoint>> mmMeetingLocation = new MMBusinessAssociationEnd<Meeting, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			opposite_lazy = () -> ContactPoint.mmContactPointForMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Meeting obj) {
			return obj.getMeetingLocation();
		}

		@Override
		public void setValue(Meeting obj, List<ContactPoint> value) {
			obj.setMeetingLocation(value);
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
	public static final MMBusinessAttribute<Meeting, Max35Text> mmIdentification = new MMBusinessAttribute<Meeting, Max35Text>() {
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

		@Override
		public Max35Text getValue(Meeting obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Meeting obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<Deadline> deadline;
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
	public static final MMBusinessAssociationEnd<Meeting, List<Deadline>> mmDeadline = new MMBusinessAssociationEnd<Meeting, List<Deadline>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			opposite_lazy = () -> Deadline.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Deadline.mmObject();
		}

		@Override
		public List<Deadline> getValue(Meeting obj) {
			return obj.getDeadline();
		}

		@Override
		public void setValue(Meeting obj, List<Deadline> value) {
			obj.setDeadline(value);
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
	public static final MMBusinessAssociationEnd<Meeting, Optional<MeetingServicing>> mmMeetingServicing = new MMBusinessAssociationEnd<Meeting, Optional<MeetingServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MeetingServicing.mmMeetingSpecification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}

		@Override
		public Optional<MeetingServicing> getValue(Meeting obj) {
			return obj.getMeetingServicing();
		}

		@Override
		public void setValue(Meeting obj, Optional<MeetingServicing> value) {
			obj.setMeetingServicing(value.orElse(null));
		}
	};
	protected List<ContactPersonRole> person;
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
	public static final MMBusinessAssociationEnd<Meeting, List<ContactPersonRole>> mmPerson = new MMBusinessAssociationEnd<Meeting, List<ContactPersonRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPersonRole.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPersonRole.mmObject();
		}

		@Override
		public List<ContactPersonRole> getValue(Meeting obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(Meeting obj, List<ContactPersonRole> value) {
			obj.setPerson(value);
		}
	};
	protected List<MeetingPartyRole> partyRole;
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
	public static final MMBusinessAssociationEnd<Meeting, List<MeetingPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Meeting, List<MeetingPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> MeetingPartyRole.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingPartyRole.mmObject();
		}

		@Override
		public List<MeetingPartyRole> getValue(Meeting obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Meeting obj, List<MeetingPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected List<MeetingStatus> status;
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
	public static final MMBusinessAssociationEnd<Meeting, List<MeetingStatus>> mmStatus = new MMBusinessAssociationEnd<Meeting, List<MeetingStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			opposite_lazy = () -> MeetingStatus.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingStatus.mmObject();
		}

		@Override
		public List<MeetingStatus> getValue(Meeting obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Meeting obj, List<MeetingStatus> value) {
			obj.setStatus(value);
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
	public static final MMBusinessAssociationEnd<Meeting, Optional<CorporateActionEvent>> mmCorporateEvent = new MMBusinessAssociationEnd<Meeting, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(Meeting obj) {
			return obj.getCorporateEvent();
		}

		@Override
		public void setValue(Meeting obj, Optional<CorporateActionEvent> value) {
			obj.setCorporateEvent(value.orElse(null));
		}
	};
	protected List<Quorum> quorum;
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
	public static final MMBusinessAssociationEnd<Meeting, List<Quorum>> mmQuorum = new MMBusinessAssociationEnd<Meeting, List<Quorum>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			opposite_lazy = () -> Quorum.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quorum.mmObject();
		}

		@Override
		public List<Quorum> getValue(Meeting obj) {
			return obj.getQuorum();
		}

		@Override
		public void setValue(Meeting obj, List<Quorum> value) {
			obj.setQuorum(value);
		}
	};
	protected List<VotingCondition> votingCondition;
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
	public static final MMBusinessAssociationEnd<Meeting, List<VotingCondition>> mmVotingCondition = new MMBusinessAssociationEnd<Meeting, List<VotingCondition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			opposite_lazy = () -> VotingCondition.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VotingCondition.mmObject();
		}

		@Override
		public List<VotingCondition> getValue(Meeting obj) {
			return obj.getVotingCondition();
		}

		@Override
		public void setValue(Meeting obj, List<VotingCondition> value) {
			obj.setVotingCondition(value);
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
	public static final MMBusinessAttribute<Meeting, YesNoIndicator> mmAttendanceRequired = new MMBusinessAttribute<Meeting, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Meeting obj) {
			return obj.getAttendanceRequired();
		}

		@Override
		public void setValue(Meeting obj, YesNoIndicator value) {
			obj.setAttendanceRequired(value);
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
	public static final MMBusinessAttribute<Meeting, Max350Text> mmAttendanceConfirmation = new MMBusinessAttribute<Meeting, Max350Text>() {
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

		@Override
		public Max350Text getValue(Meeting obj) {
			return obj.getAttendanceConfirmation();
		}

		@Override
		public void setValue(Meeting obj, Max350Text value) {
			obj.setAttendanceConfirmation(value);
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
	public static final MMBusinessAssociationEnd<Meeting, Optional<IncentivePremium>> mmIncentivePremium = new MMBusinessAssociationEnd<Meeting, Optional<IncentivePremium>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> IncentivePremium.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> IncentivePremium.mmObject();
		}

		@Override
		public Optional<IncentivePremium> getValue(Meeting obj) {
			return obj.getIncentivePremium();
		}

		@Override
		public void setValue(Meeting obj, Optional<IncentivePremium> value) {
			obj.setIncentivePremium(value.orElse(null));
		}
	};
	protected List<MeetingParticipation> participation;
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
	public static final MMBusinessAssociationEnd<Meeting, List<MeetingParticipation>> mmParticipation = new MMBusinessAssociationEnd<Meeting, List<MeetingParticipation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			opposite_lazy = () -> MeetingParticipation.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingParticipation.mmObject();
		}

		@Override
		public List<MeetingParticipation> getValue(Meeting obj) {
			return obj.getParticipation();
		}

		@Override
		public void setValue(Meeting obj, List<MeetingParticipation> value) {
			obj.setParticipation(value);
		}
	};
	protected List<ResolutionProposal> resolutionProposalConditions;
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
	public static final MMBusinessAssociationEnd<Meeting, List<ResolutionProposal>> mmResolutionProposalConditions = new MMBusinessAssociationEnd<Meeting, List<ResolutionProposal>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			opposite_lazy = () -> ResolutionProposal.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ResolutionProposal.mmObject();
		}

		@Override
		public List<ResolutionProposal> getValue(Meeting obj) {
			return obj.getResolutionProposalConditions();
		}

		@Override
		public void setValue(Meeting obj, List<ResolutionProposal> value) {
			obj.setResolutionProposalConditions(value);
		}
	};
	protected List<Resolution> agendaItem;
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
	public static final MMBusinessAssociationEnd<Meeting, List<Resolution>> mmAgendaItem = new MMBusinessAssociationEnd<Meeting, List<Resolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			opposite_lazy = () -> Resolution.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Resolution.mmObject();
		}

		@Override
		public List<Resolution> getValue(Meeting obj) {
			return obj.getAgendaItem();
		}

		@Override
		public void setValue(Meeting obj, List<Resolution> value) {
			obj.setAgendaItem(value);
		}
	};
	protected List<ProxyAppointmentCondition> proxyAppointmentConditions;
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
	public static final MMBusinessAssociationEnd<Meeting, List<ProxyAppointmentCondition>> mmProxyAppointmentConditions = new MMBusinessAssociationEnd<Meeting, List<ProxyAppointmentCondition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			opposite_lazy = () -> ProxyAppointmentCondition.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
		}

		@Override
		public List<ProxyAppointmentCondition> getValue(Meeting obj) {
			return obj.getProxyAppointmentConditions();
		}

		@Override
		public void setValue(Meeting obj, List<ProxyAppointmentCondition> value) {
			obj.setProxyAppointmentConditions(value);
		}
	};
	protected List<AdditionalRight> additionalRight;
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
	public static final MMBusinessAssociationEnd<Meeting, List<AdditionalRight>> mmAdditionalRight = new MMBusinessAssociationEnd<Meeting, List<AdditionalRight>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			opposite_lazy = () -> AdditionalRight.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AdditionalRight.mmObject();
		}

		@Override
		public List<AdditionalRight> getValue(Meeting obj) {
			return obj.getAdditionalRight();
		}

		@Override
		public void setValue(Meeting obj, List<AdditionalRight> value) {
			obj.setAdditionalRight(value);
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
	public static final MMBusinessAttribute<Meeting, MeetingTypeCode> mmType = new MMBusinessAttribute<Meeting, MeetingTypeCode>() {
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

		@Override
		public MeetingTypeCode getValue(Meeting obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Meeting obj, MeetingTypeCode value) {
			obj.setType(value);
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
	public static final MMBusinessAssociationEnd<Meeting, PowerOfAttorneyRequirements> mmPowerOfAttorneyRequirements = new MMBusinessAssociationEnd<Meeting, PowerOfAttorneyRequirements>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PowerOfAttorneyRequirements.mmMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PowerOfAttorneyRequirements.mmObject();
		}

		@Override
		public PowerOfAttorneyRequirements getValue(Meeting obj) {
			return obj.getPowerOfAttorneyRequirements();
		}

		@Override
		public void setValue(Meeting obj, PowerOfAttorneyRequirements value) {
			obj.setPowerOfAttorneyRequirements(value);
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
	public static final MMBusinessAttribute<Meeting, MeetingTypeClassificationCode> mmMeetingEventClassification = new MMBusinessAttribute<Meeting, MeetingTypeClassificationCode>() {
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

		@Override
		public MeetingTypeClassificationCode getValue(Meeting obj) {
			return obj.getMeetingEventClassification();
		}

		@Override
		public void setValue(Meeting obj, MeetingTypeClassificationCode value) {
			obj.setMeetingEventClassification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(ContactPoint.mmContactPointForMeeting, ContactPersonRole.mmMeeting, CorporateActionEvent.mmRelatedMeeting, Deadline.mmRelatedMeeting, MeetingPartyRole.mmMeeting,
						ResolutionProposal.mmMeeting, ProxyAppointmentCondition.mmMeeting, MeetingParticipation.mmMeeting, Quorum.mmMeeting, Resolution.mmMeeting, MeetingStatus.mmMeeting, VotingCondition.mmMeeting,
						IncentivePremium.mmMeeting, PowerOfAttorneyRequirements.mmMeeting, AdditionalRight.mmMeeting, MeetingServicing.mmMeetingSpecification);
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

	public Meeting setMeetingLocation(List<ContactPoint> meetingLocation) {
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

	public Meeting setDeadline(List<Deadline> deadline) {
		this.deadline = Objects.requireNonNull(deadline);
		return this;
	}

	public Optional<MeetingServicing> getMeetingServicing() {
		return meetingServicing == null ? Optional.empty() : Optional.of(meetingServicing);
	}

	public Meeting setMeetingServicing(MeetingServicing meetingServicing) {
		this.meetingServicing = meetingServicing;
		return this;
	}

	public List<ContactPersonRole> getPerson() {
		return person == null ? person = new ArrayList<>() : person;
	}

	public Meeting setPerson(List<ContactPersonRole> person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}

	public List<MeetingPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Meeting setPartyRole(List<MeetingPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<MeetingStatus> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public Meeting setStatus(List<MeetingStatus> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent == null ? Optional.empty() : Optional.of(corporateEvent);
	}

	public Meeting setCorporateEvent(CorporateActionEvent corporateEvent) {
		this.corporateEvent = corporateEvent;
		return this;
	}

	public List<Quorum> getQuorum() {
		return quorum == null ? quorum = new ArrayList<>() : quorum;
	}

	public Meeting setQuorum(List<Quorum> quorum) {
		this.quorum = Objects.requireNonNull(quorum);
		return this;
	}

	public List<VotingCondition> getVotingCondition() {
		return votingCondition == null ? votingCondition = new ArrayList<>() : votingCondition;
	}

	public Meeting setVotingCondition(List<VotingCondition> votingCondition) {
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

	public Meeting setIncentivePremium(IncentivePremium incentivePremium) {
		this.incentivePremium = incentivePremium;
		return this;
	}

	public List<MeetingParticipation> getParticipation() {
		return participation == null ? participation = new ArrayList<>() : participation;
	}

	public Meeting setParticipation(List<MeetingParticipation> participation) {
		this.participation = Objects.requireNonNull(participation);
		return this;
	}

	public List<ResolutionProposal> getResolutionProposalConditions() {
		return resolutionProposalConditions == null ? resolutionProposalConditions = new ArrayList<>() : resolutionProposalConditions;
	}

	public Meeting setResolutionProposalConditions(List<ResolutionProposal> resolutionProposalConditions) {
		this.resolutionProposalConditions = Objects.requireNonNull(resolutionProposalConditions);
		return this;
	}

	public List<Resolution> getAgendaItem() {
		return agendaItem == null ? agendaItem = new ArrayList<>() : agendaItem;
	}

	public Meeting setAgendaItem(List<Resolution> agendaItem) {
		this.agendaItem = Objects.requireNonNull(agendaItem);
		return this;
	}

	public List<ProxyAppointmentCondition> getProxyAppointmentConditions() {
		return proxyAppointmentConditions == null ? proxyAppointmentConditions = new ArrayList<>() : proxyAppointmentConditions;
	}

	public Meeting setProxyAppointmentConditions(List<ProxyAppointmentCondition> proxyAppointmentConditions) {
		this.proxyAppointmentConditions = Objects.requireNonNull(proxyAppointmentConditions);
		return this;
	}

	public List<AdditionalRight> getAdditionalRight() {
		return additionalRight == null ? additionalRight = new ArrayList<>() : additionalRight;
	}

	public Meeting setAdditionalRight(List<AdditionalRight> additionalRight) {
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

	public Meeting setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements powerOfAttorneyRequirements) {
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