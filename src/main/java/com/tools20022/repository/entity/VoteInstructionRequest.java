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
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VoteInstructionRequest"
 * src="doc-files/VoteInstructionRequest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmMeetingInstruction
 * VoteInstructionRequest.mmMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
 * VoteInstructionRequest.mmVotePerResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmDiscretionary
 * VoteInstructionRequest.mmDiscretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmGlobalVoteInstruction
 * VoteInstructionRequest.mmGlobalVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteForMeetingResolution
 * VoteInstructionRequest.mmVoteForMeetingResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteExecutionConfirmation
 * VoteInstructionRequest.mmVoteExecutionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmRelatedProxyAppointment
 * VoteInstructionRequest.mmRelatedProxyAppointment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ProxyAppointment#mmVote
 * ProxyAppointment.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
 * InstructionForMeeting.mmVoteInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmVoteRequest
 * Vote.mmVoteRequest}</li>
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
 * "VoteInstructionRequest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification."
 * </li>
 * </ul>
 */
public class VoteInstructionRequest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InstructionForMeeting meetingInstruction;
	/**
	 * Meeting instruction which contains a vote instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which contains a vote instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Meeting instruction which contains a vote instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmVoteInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};
	protected Vote votePerResolution;
	/**
	 * Specifies the number of votes to be cast for a specific resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmVoteRequest
	 * Vote.mmVoteRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotePerResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of votes to be cast for a specific resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVotePerResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotePerResolution";
			definition = "Specifies the number of votes to be cast for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.mmVoteRequest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
		}
	};
	protected Number discretionary;
	/**
	 * Number of votes for which decision is left to the party that will
	 * exercise the voting right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes for which decision is left to the party that will exercise the voting right."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDiscretionary = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VoteInstructionRequest.class.getMethod("getDiscretionary", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected VoteInstructionCode globalVoteInstruction;
	/**
	 * Vote instruction per resolution is cast for the entire entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalVoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote instruction per resolution is cast for the entire entitlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGlobalVoteInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Vote instruction per resolution is cast for the entire entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VoteInstructionRequest.class.getMethod("getGlobalVoteInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected VoteInstructionCode voteForMeetingResolution;
	/**
	 * Specifies the vote recommendation for resolutions added during the
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteForMeetingResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the vote recommendation for resolutions added during the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVoteForMeetingResolution = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteForMeetingResolution";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VoteInstructionRequest.class.getMethod("getVoteForMeetingResolution", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator voteExecutionConfirmation;
	/**
	 * Indicates that a Vote execution confirmation is requested.
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
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteExecutionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a Vote execution confirmation is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVoteExecutionConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VoteInstructionRequest.class.getMethod("getVoteExecutionConfirmation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProxyAppointment relatedProxyAppointment;
	/**
	 * Proxy appointment to which instructions are attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmVote
	 * ProxyAppointment.mmVote}</li>
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
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProxyAppointment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proxy appointment to which instructions are attached."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment to which instructions are attached.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmVote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionRequest";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.mmVote, com.tools20022.repository.entity.InstructionForMeeting.mmVoteInstruction,
						com.tools20022.repository.entity.Vote.mmVoteRequest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.mmMeetingInstruction, com.tools20022.repository.entity.VoteInstructionRequest.mmVotePerResolution,
						com.tools20022.repository.entity.VoteInstructionRequest.mmDiscretionary, com.tools20022.repository.entity.VoteInstructionRequest.mmGlobalVoteInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.mmVoteForMeetingResolution, com.tools20022.repository.entity.VoteInstructionRequest.mmVoteExecutionConfirmation,
						com.tools20022.repository.entity.VoteInstructionRequest.mmRelatedProxyAppointment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return VoteInstructionRequest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionForMeeting getMeetingInstruction() {
		return meetingInstruction;
	}

	public void setMeetingInstruction(com.tools20022.repository.entity.InstructionForMeeting meetingInstruction) {
		this.meetingInstruction = meetingInstruction;
	}

	public Vote getVotePerResolution() {
		return votePerResolution;
	}

	public void setVotePerResolution(com.tools20022.repository.entity.Vote votePerResolution) {
		this.votePerResolution = votePerResolution;
	}

	public Number getDiscretionary() {
		return discretionary;
	}

	public void setDiscretionary(Number discretionary) {
		this.discretionary = discretionary;
	}

	public VoteInstructionCode getGlobalVoteInstruction() {
		return globalVoteInstruction;
	}

	public void setGlobalVoteInstruction(VoteInstructionCode globalVoteInstruction) {
		this.globalVoteInstruction = globalVoteInstruction;
	}

	public VoteInstructionCode getVoteForMeetingResolution() {
		return voteForMeetingResolution;
	}

	public void setVoteForMeetingResolution(VoteInstructionCode voteForMeetingResolution) {
		this.voteForMeetingResolution = voteForMeetingResolution;
	}

	public YesNoIndicator getVoteExecutionConfirmation() {
		return voteExecutionConfirmation;
	}

	public void setVoteExecutionConfirmation(YesNoIndicator voteExecutionConfirmation) {
		this.voteExecutionConfirmation = voteExecutionConfirmation;
	}

	public ProxyAppointment getRelatedProxyAppointment() {
		return relatedProxyAppointment;
	}

	public void setRelatedProxyAppointment(com.tools20022.repository.entity.ProxyAppointment relatedProxyAppointment) {
		this.relatedProxyAppointment = relatedProxyAppointment;
	}
}