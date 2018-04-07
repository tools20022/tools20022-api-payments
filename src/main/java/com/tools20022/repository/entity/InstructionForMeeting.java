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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the position of the instructing party and the actions that it
 * wants to take in relation with the meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InstructionForMeeting"
 * src="doc-files/InstructionForMeeting.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
 * InstructionForMeeting.mmVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRequestedExecutionDate
 * InstructionForMeeting.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRelatedServicing
 * InstructionForMeeting.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmMeetingAttendance
 * InstructionForMeeting.mmMeetingAttendance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmProxyAppointment
 * InstructionForMeeting.mmProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmMeetingIdentification
 * InstructionForMeeting.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSecuritiesRegistration
 * InstructionForMeeting.mmSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmBlockingSecurities
 * InstructionForMeeting.mmBlockingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmParticipationRegistration
 * InstructionForMeeting.mmParticipationRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
 * InstructionForMeeting.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedMeetingInstruction
 * SecuritiesAccount.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmRelatedMeetingInstruction
 * ProxyAppointment.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmMeetingInstruction
 * VoteInstructionRequest.mmMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmRelatedMeeting
 * MeetingAttendance.mmRelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingInstruction
 * MeetingServicing.mmMeetingInstruction}</li>
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
 * "InstructionForMeeting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting."
 * </li>
 * </ul>
 */
public class InstructionForMeeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<VoteInstructionRequest> voteInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmMeetingInstruction
	 * VoteInstructionRequest.mmMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to cast detailed voting instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InstructionForMeeting, List<VoteInstructionRequest>> mmVoteInstruction = new MMBusinessAssociationEnd<InstructionForMeeting, List<VoteInstructionRequest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteInstruction";
			definition = "Request to cast detailed voting instructions.";
			minOccurs = 0;
			opposite_lazy = () -> VoteInstructionRequest.mmMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VoteInstructionRequest.mmObject();
		}

		@Override
		public List<VoteInstructionRequest> getValue(InstructionForMeeting obj) {
			return obj.getVoteInstruction();
		}

		@Override
		public void setValue(InstructionForMeeting obj, List<VoteInstructionRequest> value) {
			obj.setVoteInstruction(value);
		}
	};
	protected ISODateTime requestedExecutionDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the instruction must be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InstructionForMeeting, ISODateTime> mmRequestedExecutionDate = new MMBusinessAttribute<InstructionForMeeting, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InstructionForMeeting obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(InstructionForMeeting obj, ISODateTime value) {
			obj.setRequestedExecutionDate(value);
		}
	};
	protected MeetingServicing relatedServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingInstruction
	 * MeetingServicing.mmMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting servicing process which comprises the management of meeting instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InstructionForMeeting, Optional<MeetingServicing>> mmRelatedServicing = new MMBusinessAssociationEnd<InstructionForMeeting, Optional<MeetingServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the management of meeting instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MeetingServicing.mmMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}

		@Override
		public Optional<MeetingServicing> getValue(InstructionForMeeting obj) {
			return obj.getRelatedServicing();
		}

		@Override
		public void setValue(InstructionForMeeting obj, Optional<MeetingServicing> value) {
			obj.setRelatedServicing(value.orElse(null));
		}
	};
	protected List<MeetingAttendance> meetingAttendance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmRelatedMeeting
	 * MeetingAttendance.mmRelatedMeeting}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction containing the information on the participation of the security holder or of its assigned representative."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InstructionForMeeting, List<MeetingAttendance>> mmMeetingAttendance = new MMBusinessAssociationEnd<InstructionForMeeting, List<MeetingAttendance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Instruction containing the information on the participation of the security holder or of its assigned representative.";
			minOccurs = 0;
			opposite_lazy = () -> MeetingAttendance.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingAttendance.mmObject();
		}

		@Override
		public List<MeetingAttendance> getValue(InstructionForMeeting obj) {
			return obj.getMeetingAttendance();
		}

		@Override
		public void setValue(InstructionForMeeting obj, List<MeetingAttendance> value) {
			obj.setMeetingAttendance(value);
		}
	};
	protected List<ProxyAppointment> proxyAppointment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmRelatedMeetingInstruction
	 * ProxyAppointment.mmRelatedMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to assign a proxy for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InstructionForMeeting, List<ProxyAppointment>> mmProxyAppointment = new MMBusinessAssociationEnd<InstructionForMeeting, List<ProxyAppointment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointment";
			definition = "Request to assign a proxy for participation to the meeting.";
			minOccurs = 0;
			opposite_lazy = () -> ProxyAppointment.mmRelatedMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProxyAppointment.mmObject();
		}

		@Override
		public List<ProxyAppointment> getValue(InstructionForMeeting obj) {
			return obj.getProxyAppointment();
		}

		@Override
		public void setValue(InstructionForMeeting obj, List<ProxyAppointment> value) {
			obj.setProxyAppointment(value);
		}
	};
	protected Max35Text meetingIdentification;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party which has notified the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InstructionForMeeting, Max35Text> mmMeetingIdentification = new MMBusinessAttribute<InstructionForMeeting, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party which has notified the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InstructionForMeeting obj) {
			return obj.getMeetingIdentification();
		}

		@Override
		public void setValue(InstructionForMeeting obj, Max35Text value) {
			obj.setMeetingIdentification(value);
		}
	};
	protected YesNoIndicator securitiesRegistration;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register the securities for the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InstructionForMeeting, YesNoIndicator> mmSecuritiesRegistration = new MMBusinessAttribute<InstructionForMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRegistration";
			definition = "Request to register the securities for the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InstructionForMeeting obj) {
			return obj.getSecuritiesRegistration();
		}

		@Override
		public void setValue(InstructionForMeeting obj, YesNoIndicator value) {
			obj.setSecuritiesRegistration(value);
		}
	};
	protected YesNoIndicator blockingSecurities;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to block the securities"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InstructionForMeeting, YesNoIndicator> mmBlockingSecurities = new MMBusinessAttribute<InstructionForMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockingSecurities";
			definition = "Request to block the securities";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InstructionForMeeting obj) {
			return obj.getBlockingSecurities();
		}

		@Override
		public void setValue(InstructionForMeeting obj, YesNoIndicator value) {
			obj.setBlockingSecurities(value);
		}
	};
	protected YesNoIndicator participationRegistration;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InstructionForMeeting, YesNoIndicator> mmParticipationRegistration = new MMBusinessAttribute<InstructionForMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParticipationRegistration";
			definition = "Request to register for participation to the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InstructionForMeeting obj) {
			return obj.getParticipationRegistration();
		}

		@Override
		public void setValue(InstructionForMeeting obj, YesNoIndicator value) {
			obj.setParticipationRegistration(value);
		}
	};
	protected SecuritiesAccount safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedMeetingInstruction
	 * SecuritiesAccount.mmRelatedMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and balance for which the instruction is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InstructionForMeeting, SecuritiesAccount> mmSafekeepingAccount = new MMBusinessAssociationEnd<InstructionForMeeting, SecuritiesAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account and balance for which the instruction is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAccount.mmRelatedMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public SecuritiesAccount getValue(InstructionForMeeting obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(InstructionForMeeting obj, SecuritiesAccount value) {
			obj.setSafekeepingAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForMeeting";
				definition = "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesAccount.mmRelatedMeetingInstruction, ProxyAppointment.mmRelatedMeetingInstruction, VoteInstructionRequest.mmMeetingInstruction, MeetingAttendance.mmRelatedMeeting,
						MeetingServicing.mmMeetingInstruction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InstructionForMeeting.mmVoteInstruction, com.tools20022.repository.entity.InstructionForMeeting.mmRequestedExecutionDate,
						com.tools20022.repository.entity.InstructionForMeeting.mmRelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.mmMeetingAttendance,
						com.tools20022.repository.entity.InstructionForMeeting.mmProxyAppointment, com.tools20022.repository.entity.InstructionForMeeting.mmMeetingIdentification,
						com.tools20022.repository.entity.InstructionForMeeting.mmSecuritiesRegistration, com.tools20022.repository.entity.InstructionForMeeting.mmBlockingSecurities,
						com.tools20022.repository.entity.InstructionForMeeting.mmParticipationRegistration, com.tools20022.repository.entity.InstructionForMeeting.mmSafekeepingAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InstructionForMeeting.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<VoteInstructionRequest> getVoteInstruction() {
		return voteInstruction == null ? voteInstruction = new ArrayList<>() : voteInstruction;
	}

	public InstructionForMeeting setVoteInstruction(List<VoteInstructionRequest> voteInstruction) {
		this.voteInstruction = Objects.requireNonNull(voteInstruction);
		return this;
	}

	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public InstructionForMeeting setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public Optional<MeetingServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public InstructionForMeeting setRelatedServicing(MeetingServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public List<MeetingAttendance> getMeetingAttendance() {
		return meetingAttendance == null ? meetingAttendance = new ArrayList<>() : meetingAttendance;
	}

	public InstructionForMeeting setMeetingAttendance(List<MeetingAttendance> meetingAttendance) {
		this.meetingAttendance = Objects.requireNonNull(meetingAttendance);
		return this;
	}

	public List<ProxyAppointment> getProxyAppointment() {
		return proxyAppointment == null ? proxyAppointment = new ArrayList<>() : proxyAppointment;
	}

	public InstructionForMeeting setProxyAppointment(List<ProxyAppointment> proxyAppointment) {
		this.proxyAppointment = Objects.requireNonNull(proxyAppointment);
		return this;
	}

	public Max35Text getMeetingIdentification() {
		return meetingIdentification;
	}

	public InstructionForMeeting setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = Objects.requireNonNull(meetingIdentification);
		return this;
	}

	public YesNoIndicator getSecuritiesRegistration() {
		return securitiesRegistration;
	}

	public InstructionForMeeting setSecuritiesRegistration(YesNoIndicator securitiesRegistration) {
		this.securitiesRegistration = Objects.requireNonNull(securitiesRegistration);
		return this;
	}

	public YesNoIndicator getBlockingSecurities() {
		return blockingSecurities;
	}

	public InstructionForMeeting setBlockingSecurities(YesNoIndicator blockingSecurities) {
		this.blockingSecurities = Objects.requireNonNull(blockingSecurities);
		return this;
	}

	public YesNoIndicator getParticipationRegistration() {
		return participationRegistration;
	}

	public InstructionForMeeting setParticipationRegistration(YesNoIndicator participationRegistration) {
		this.participationRegistration = Objects.requireNonNull(participationRegistration);
		return this;
	}

	public SecuritiesAccount getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public InstructionForMeeting setSafekeepingAccount(SecuritiesAccount safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}
}