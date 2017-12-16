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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Services which consists in notifying the investor or its agent of a meeting,
 * in validating and relaying its instructions and in calculating its
 * entitlement based on its holdings.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingServicing" src="doc-files/MeetingServicing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
 * CorporateActionServicing}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingSpecification
 * MeetingServicing.mmMeetingSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingNotice
 * MeetingServicing.mmMeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingEntitlement
 * MeetingServicing.mmMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingInstruction
 * MeetingServicing.mmMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingResultDissemination
 * MeetingServicing.mmMeetingResultDissemination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingServicing
 * Meeting.mmMeetingServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingNotice#mmRelatedServicing
 * MeetingNotice.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmRelatedServicing
 * MeetingEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRelatedServicing
 * InstructionForMeeting.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmRelatedServicing
 * MeetingResultDissemination.mmRelatedServicing}</li>
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
 * "MeetingServicing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services which consists in notifying the investor or its agent of a meeting, in validating and relaying its instructions and in calculating its entitlement based on its holdings."
 * </li>
 * </ul>
 */
public class MeetingServicing extends CorporateActionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Meeting> meetingSpecification;
	/**
	 * Meeting for which services are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingServicing
	 * Meeting.mmMeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which services are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingSpecification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingSpecification";
			definition = "Meeting for which services are provided.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmMeetingServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingNotice> meetingNotice;
	/**
	 * Service which consists in notifying the investor of a meeting. It may
	 * contain details of the meeting as defined by the agent in addition to the
	 * details defined by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingNotice#mmRelatedServicing
	 * MeetingNotice.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingNotice
	 * MeetingNotice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in notifying the investor of a meeting. It may contain details of the meeting as defined by the agent in addition to the details defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingNotice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingNotice";
			definition = "Service which consists in notifying the investor of a meeting. It may contain details of the meeting as defined by the agent in addition to the details defined by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingEntitlement> meetingEntitlement;
	/**
	 * Calculation of the entitlementbased on the balance in the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmRelatedServicing
	 * MeetingEntitlement.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the entitlementbased on the balance in the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingEntitlement";
			definition = "Calculation of the entitlementbased on the balance in the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InstructionForMeeting> meetingInstruction;
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRelatedServicing
	 * InstructionForMeeting.mmRelatedServicing}</li>
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
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in validating, calculating and transferring the investor's instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingResultDissemination> meetingResultDissemination;
	/**
	 * Service which consists in distributing the results of the meeting to the
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmRelatedServicing
	 * MeetingResultDissemination.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination
	 * MeetingResultDissemination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingResultDissemination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in distributing the results of the meeting to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingResultDissemination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingResultDissemination";
			definition = "Service which consists in distributing the results of the meeting to the investor.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingServicing";
				definition = "Services which consists in notifying the investor or its agent of a meeting, in validating and relaying its instructions and in calculating its entitlement based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmMeetingServicing, com.tools20022.repository.entity.MeetingNotice.mmRelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.mmRelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.mmRelatedServicing,
						com.tools20022.repository.entity.MeetingResultDissemination.mmRelatedServicing);
				superType_lazy = () -> CorporateActionServicing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingServicing.mmMeetingSpecification, com.tools20022.repository.entity.MeetingServicing.mmMeetingNotice,
						com.tools20022.repository.entity.MeetingServicing.mmMeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.mmMeetingInstruction,
						com.tools20022.repository.entity.MeetingServicing.mmMeetingResultDissemination);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingServicing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Meeting> getMeetingSpecification() {
		return meetingSpecification;
	}

	public void setMeetingSpecification(List<com.tools20022.repository.entity.Meeting> meetingSpecification) {
		this.meetingSpecification = meetingSpecification;
	}

	public List<MeetingNotice> getMeetingNotice() {
		return meetingNotice;
	}

	public void setMeetingNotice(List<com.tools20022.repository.entity.MeetingNotice> meetingNotice) {
		this.meetingNotice = meetingNotice;
	}

	public List<MeetingEntitlement> getMeetingEntitlement() {
		return meetingEntitlement;
	}

	public void setMeetingEntitlement(List<com.tools20022.repository.entity.MeetingEntitlement> meetingEntitlement) {
		this.meetingEntitlement = meetingEntitlement;
	}

	public List<InstructionForMeeting> getMeetingInstruction() {
		return meetingInstruction;
	}

	public void setMeetingInstruction(List<com.tools20022.repository.entity.InstructionForMeeting> meetingInstruction) {
		this.meetingInstruction = meetingInstruction;
	}

	public List<MeetingResultDissemination> getMeetingResultDissemination() {
		return meetingResultDissemination;
	}

	public void setMeetingResultDissemination(List<com.tools20022.repository.entity.MeetingResultDissemination> meetingResultDissemination) {
		this.meetingResultDissemination = meetingResultDissemination;
	}
}