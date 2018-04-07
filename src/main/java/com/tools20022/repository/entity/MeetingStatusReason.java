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
import com.tools20022.repository.codeset.MeetingCancellationReasonCode;
import com.tools20022.repository.codeset.RejectionReasonCode;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the underlying reason for a status of a meeting or related
 * instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatusReason" src="doc-files/MeetingStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingCancellationReason
 * MeetingStatusReason.mmMeetingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingStatus
 * MeetingStatusReason.mmMeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmInstructionRejectionReason
 * MeetingStatusReason.mmInstructionRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmReason
 * MeetingStatus.mmReason}</li>
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
 * "MeetingStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a meeting or related instructions."
 * </li>
 * </ul>
 */
public class MeetingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MeetingCancellationReasonCode meetingCancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for cancelling a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MeetingStatusReason, MeetingCancellationReasonCode> mmMeetingCancellationReason = new MMBusinessAttribute<MeetingStatusReason, MeetingCancellationReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingCancellationReason";
			definition = "Specifies the reason for cancelling a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingCancellationReasonCode.mmObject();
		}

		@Override
		public MeetingCancellationReasonCode getValue(MeetingStatusReason obj) {
			return obj.getMeetingCancellationReason();
		}

		@Override
		public void setValue(MeetingStatusReason obj, MeetingCancellationReasonCode value) {
			obj.setMeetingCancellationReason(value);
		}
	};
	protected MeetingStatus meetingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmReason
	 * MeetingStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatus
	 * MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MeetingStatusReason, Optional<MeetingStatus>> mmMeetingStatus = new MMBusinessAssociationEnd<MeetingStatusReason, Optional<MeetingStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
		}

		@Override
		public Optional<MeetingStatus> getValue(MeetingStatusReason obj) {
			return obj.getMeetingStatus();
		}

		@Override
		public void setValue(MeetingStatusReason obj, Optional<MeetingStatus> value) {
			obj.setMeetingStatus(value.orElse(null));
		}
	};
	protected RejectionReasonCode instructionRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason of the rejection of the instruction or of the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MeetingStatusReason, RejectionReasonCode> mmInstructionRejectionReason = new MMBusinessAttribute<MeetingStatusReason, RejectionReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionRejectionReason";
			definition = "Reason of the rejection of the instruction or of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}

		@Override
		public RejectionReasonCode getValue(MeetingStatusReason obj) {
			return obj.getInstructionRejectionReason();
		}

		@Override
		public void setValue(MeetingStatusReason obj, RejectionReasonCode value) {
			obj.setInstructionRejectionReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingStatusReason";
				definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.mmReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatusReason.mmMeetingCancellationReason, com.tools20022.repository.entity.MeetingStatusReason.mmMeetingStatus,
						com.tools20022.repository.entity.MeetingStatusReason.mmInstructionRejectionReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MeetingCancellationReasonCode getMeetingCancellationReason() {
		return meetingCancellationReason;
	}

	public MeetingStatusReason setMeetingCancellationReason(MeetingCancellationReasonCode meetingCancellationReason) {
		this.meetingCancellationReason = Objects.requireNonNull(meetingCancellationReason);
		return this;
	}

	public Optional<MeetingStatus> getMeetingStatus() {
		return meetingStatus == null ? Optional.empty() : Optional.of(meetingStatus);
	}

	public MeetingStatusReason setMeetingStatus(com.tools20022.repository.entity.MeetingStatus meetingStatus) {
		this.meetingStatus = meetingStatus;
		return this;
	}

	public RejectionReasonCode getInstructionRejectionReason() {
		return instructionRejectionReason;
	}

	public MeetingStatusReason setInstructionRejectionReason(RejectionReasonCode instructionRejectionReason) {
		this.instructionRejectionReason = Objects.requireNonNull(instructionRejectionReason);
		return this;
	}
}