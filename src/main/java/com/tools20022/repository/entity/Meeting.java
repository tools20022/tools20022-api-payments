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
import com.tools20022.repository.codeset.MeetingDateStatusCode;
import com.tools20022.repository.codeset.MeetingTypeClassificationCode;
import com.tools20022.repository.codeset.MeetingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#DateAndTime
 * Meeting.DateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#DateStatus
 * Meeting.DateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingLocation
 * Meeting.MeetingLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Identification
 * Meeting.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Deadline
 * Meeting.Deadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingServicing
 * Meeting.MeetingServicing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Person
 * Meeting.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#PartyRole
 * Meeting.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Status
 * Meeting.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
 * Meeting.CorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Quorum
 * Meeting.Quorum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#VotingCondition
 * Meeting.VotingCondition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AttendanceRequired
 * Meeting.AttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#AttendanceConfirmation
 * Meeting.AttendanceConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#IncentivePremium
 * Meeting.IncentivePremium}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Participation
 * Meeting.Participation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#ResolutionProposalConditions
 * Meeting.ResolutionProposalConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AgendaItem
 * Meeting.AgendaItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#ProxyAppointmentConditions
 * Meeting.ProxyAppointmentConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AdditionalRight
 * Meeting.AdditionalRight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Type Meeting.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#PowerOfAttorneyRequirements
 * Meeting.PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#MeetingEventClassification
 * Meeting.MeetingEventClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForMeeting
 * ContactPoint.ContactPointForMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Meeting
 * ContactPersonRole.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
 * CorporateActionEvent.RelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#RelatedMeeting
 * Deadline.RelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingPartyRole#Meeting
 * MeetingPartyRole.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ResolutionProposal#Meeting
 * ResolutionProposal.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#Meeting
 * ProxyAppointmentCondition.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#Meeting
 * MeetingParticipation.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#Meeting
 * Quorum.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Meeting
 * Resolution.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
 * MeetingStatus.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#Meeting
 * VotingCondition.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#Meeting
 * IncentivePremium.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#Meeting
 * PowerOfAttorneyRequirements.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#Meeting
 * AdditionalRight.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingSpecification
 * MeetingServicing.MeetingSpecification}</li>
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
	/**
	 * Date and time at which the meeting will take place.
	 * <p>
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
	public static final MMBusinessAttribute DateAndTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the status of a meeting date.
	 * <p>
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
	public static final MMBusinessAttribute DateStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatusCode.mmObject();
		}
	};
	/**
	 * Place of the company meeting for the scheduled meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForMeeting
	 * ContactPoint.ContactPointForMeeting}</li>
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
	public static final MMBusinessAssociationEnd MeetingLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification assigned to a general meeting by the party notifying the
	 * meeting. It must be unique for the party notifying the meeting.
	 * <p>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines available for the different processes
	 * related to meeting attendance, proxy voting and entitlement assessment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedMeeting
	 * Deadline.RelatedMeeting}</li>
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
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Servicing processes related to the organisation of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingSpecification
	 * MeetingServicing.MeetingSpecification}</li>
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
	public static final MMBusinessAssociationEnd MeetingServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the person who is the contact for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Meeting
	 * ContactPersonRole.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			type_lazy = () -> ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role played by a party in the context of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingPartyRole#Meeting
	 * MeetingPartyRole.Meeting}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			type_lazy = () -> MeetingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the imeeting and of the related nstructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
	 * MeetingStatus.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			type_lazy = () -> MeetingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
	 * CorporateActionEvent.RelatedMeeting}</li>
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
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether a quorum is required or not together with the quorum
	 * parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quorum#Meeting
	 * Quorum.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Quorum = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quorum.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different voting types, channels and premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#Meeting
	 * VotingCondition.Meeting}</li>
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
	public static final MMBusinessAssociationEnd VotingCondition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether physical participation to a meeting is required in
	 * order to be allowed to vote.
	 * <p>
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
	public static final MMBusinessAttribute AttendanceRequired = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how to order the attendance card or to give notice of
	 * attendance.
	 * <p>
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
	public static final MMBusinessAttribute AttendanceConfirmation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceConfirmation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#Meeting
	 * IncentivePremium.Meeting}</li>
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
	public static final MMBusinessAssociationEnd IncentivePremium = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Potential participation to the voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#Meeting
	 * MeetingParticipation.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Participation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			type_lazy = () -> MeetingParticipation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conditions to fulfill in order to be able to propose a
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#Meeting
	 * ResolutionProposal.Meeting}</li>
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
	public static final MMBusinessAssociationEnd ResolutionProposalConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			type_lazy = () -> ResolutionProposal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Item proposed for the vote or presented for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#Meeting
	 * Resolution.Meeting}</li>
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
	public static final MMBusinessAssociationEnd AgendaItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			type_lazy = () -> Resolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on how to appoint proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#Meeting
	 * ProxyAppointmentCondition.Meeting}</li>
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
	public static final MMBusinessAssociationEnd ProxyAppointmentConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how the additional rights can be granted to the shareholder.
	 * These rights can be exercised at shareholders meetings (for example, the
	 * right to ask questions, the right to add items to the agenda or table
	 * draft resolutions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#Meeting
	 * AdditionalRight.Meeting}</li>
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
	public static final MMBusinessAssociationEnd AdditionalRight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AdditionalRight.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of meeting for which an invitation is sent.
	 * <p>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which an invitation is sent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the conditions to be filled in to obtain a valid power of
	 * attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#Meeting
	 * PowerOfAttorneyRequirements.Meeting}</li>
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
	public static final MMBusinessAssociationEnd PowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Classifies the meeting.
	 * <p>
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
	public static final MMBusinessAttribute MeetingEventClassification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEventClassification";
			definition = "Classifies the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingTypeClassificationCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting, com.tools20022.repository.entity.ContactPersonRole.Meeting,
						com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting, com.tools20022.repository.entity.Deadline.RelatedMeeting, com.tools20022.repository.entity.MeetingPartyRole.Meeting,
						com.tools20022.repository.entity.ResolutionProposal.Meeting, com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting, com.tools20022.repository.entity.MeetingParticipation.Meeting,
						com.tools20022.repository.entity.Quorum.Meeting, com.tools20022.repository.entity.Resolution.Meeting, com.tools20022.repository.entity.MeetingStatus.Meeting, com.tools20022.repository.entity.VotingCondition.Meeting,
						com.tools20022.repository.entity.IncentivePremium.Meeting, com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting, com.tools20022.repository.entity.AdditionalRight.Meeting,
						com.tools20022.repository.entity.MeetingServicing.MeetingSpecification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.DateAndTime, com.tools20022.repository.entity.Meeting.DateStatus, com.tools20022.repository.entity.Meeting.MeetingLocation,
						com.tools20022.repository.entity.Meeting.Identification, com.tools20022.repository.entity.Meeting.Deadline, com.tools20022.repository.entity.Meeting.MeetingServicing, com.tools20022.repository.entity.Meeting.Person,
						com.tools20022.repository.entity.Meeting.PartyRole, com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.Meeting.Quorum,
						com.tools20022.repository.entity.Meeting.VotingCondition, com.tools20022.repository.entity.Meeting.AttendanceRequired, com.tools20022.repository.entity.Meeting.AttendanceConfirmation,
						com.tools20022.repository.entity.Meeting.IncentivePremium, com.tools20022.repository.entity.Meeting.Participation, com.tools20022.repository.entity.Meeting.ResolutionProposalConditions,
						com.tools20022.repository.entity.Meeting.AgendaItem, com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions, com.tools20022.repository.entity.Meeting.AdditionalRight,
						com.tools20022.repository.entity.Meeting.Type, com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements, com.tools20022.repository.entity.Meeting.MeetingEventClassification);
			}
		});
		return mmObject_lazy.get();
	}
}