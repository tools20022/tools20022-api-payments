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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.VoteInstructionRequest> voteInstruction;
	/**
	 * Request to cast detailed voting instructions.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmVoteInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteInstruction";
			definition = "Request to cast detailed voting instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
		}
	};
	protected ISODateTime requestedExecutionDate;
	/**
	 * Date at which the instruction must be executed.
	 * <p>
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
	public static final MMBusinessAttribute mmRequestedExecutionDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InstructionForMeeting.class.getMethod("getRequestedExecutionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingServicing relatedServicing;
	/**
	 * Meeting servicing process which comprises the management of meeting
	 * instructions.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the management of meeting instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingAttendance> meetingAttendance;
	/**
	 * Instruction containing the information on the participation of the
	 * security holder or of its assigned representative.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMeetingAttendance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Instruction containing the information on the participation of the security holder or of its assigned representative.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmRelatedMeeting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProxyAppointment> proxyAppointment;
	/**
	 * Request to assign a proxy for participation to the meeting.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointment";
			definition = "Request to assign a proxy for participation to the meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmRelatedMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
		}
	};
	protected Max35Text meetingIdentification;
	/**
	 * Identification assigned to a general meeting by the party which has
	 * notified the meeting.
	 * <p>
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
	public static final MMBusinessAttribute mmMeetingIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InstructionForMeeting.class.getMethod("getMeetingIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator securitiesRegistration;
	/**
	 * Request to register the securities for the meeting.
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
	public static final MMBusinessAttribute mmSecuritiesRegistration = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InstructionForMeeting.class.getMethod("getSecuritiesRegistration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator blockingSecurities;
	/**
	 * Request to block the securities
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
	public static final MMBusinessAttribute mmBlockingSecurities = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InstructionForMeeting.class.getMethod("getBlockingSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator participationRegistration;
	/**
	 * Request to register for participation to the meeting.
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
	public static final MMBusinessAttribute mmParticipationRegistration = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InstructionForMeeting.class.getMethod("getParticipationRegistration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount safekeepingAccount;
	/**
	 * Account and balance for which the instruction is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSafekeepingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account and balance for which the instruction is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedMeetingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForMeeting";
				definition = "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmRelatedMeetingInstruction, com.tools20022.repository.entity.ProxyAppointment.mmRelatedMeetingInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.mmMeetingInstruction, com.tools20022.repository.entity.MeetingAttendance.mmRelatedMeeting,
						com.tools20022.repository.entity.MeetingServicing.mmMeetingInstruction);
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
		return voteInstruction;
	}

	public void setVoteInstruction(List<com.tools20022.repository.entity.VoteInstructionRequest> voteInstruction) {
		this.voteInstruction = voteInstruction;
	}

	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public MeetingServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.MeetingServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}

	public List<MeetingAttendance> getMeetingAttendance() {
		return meetingAttendance;
	}

	public void setMeetingAttendance(List<com.tools20022.repository.entity.MeetingAttendance> meetingAttendance) {
		this.meetingAttendance = meetingAttendance;
	}

	public List<ProxyAppointment> getProxyAppointment() {
		return proxyAppointment;
	}

	public void setProxyAppointment(List<com.tools20022.repository.entity.ProxyAppointment> proxyAppointment) {
		this.proxyAppointment = proxyAppointment;
	}

	public Max35Text getMeetingIdentification() {
		return meetingIdentification;
	}

	public void setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
	}

	public YesNoIndicator getSecuritiesRegistration() {
		return securitiesRegistration;
	}

	public void setSecuritiesRegistration(YesNoIndicator securitiesRegistration) {
		this.securitiesRegistration = securitiesRegistration;
	}

	public YesNoIndicator getBlockingSecurities() {
		return blockingSecurities;
	}

	public void setBlockingSecurities(YesNoIndicator blockingSecurities) {
		this.blockingSecurities = blockingSecurities;
	}

	public YesNoIndicator getParticipationRegistration() {
		return participationRegistration;
	}

	public void setParticipationRegistration(YesNoIndicator participationRegistration) {
		this.participationRegistration = participationRegistration;
	}

	public SecuritiesAccount getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.entity.SecuritiesAccount safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}
}