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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CorporateActionServicing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingSpecification
 * MeetingServicing.MeetingSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingNotice
 * MeetingServicing.MeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingEntitlement
 * MeetingServicing.MeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingInstruction
 * MeetingServicing.MeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingResultDissemination
 * MeetingServicing.MeetingResultDissemination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingServicing
 * Meeting.MeetingServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingNotice#RelatedServicing
 * MeetingNotice.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#RelatedServicing
 * MeetingEntitlement.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#RelatedServicing
 * InstructionForMeeting.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#RelatedServicing
 * MeetingResultDissemination.RelatedServicing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
 * CorporateActionServicing}</li>
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
 * "MeetingServicing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services which consists in notifying the investor or its agent of a meeting, in validating and relaying its instructions and in calculating its entitlement based on its holdings."
 * </li>
 * </ul>
 */
public class MeetingServicing extends CorporateActionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting for which services are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#MeetingServicing
	 * Meeting.MeetingServicing}</li>
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
	public static final MMBusinessAssociationEnd MeetingSpecification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingSpecification";
			definition = "Meeting for which services are provided.";
			minOccurs = 1;
			type_lazy = () -> Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.MeetingServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.MeetingNotice#RelatedServicing
	 * MeetingNotice.RelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd MeetingNotice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingNotice";
			definition = "Service which consists in notifying the investor of a meeting. It may contain details of the meeting as defined by the agent in addition to the details defined by the issuer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingNotice.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the entitlementbased on the balance in the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#RelatedServicing
	 * MeetingEntitlement.RelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd MeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEntitlement";
			definition = "Calculation of the entitlementbased on the balance in the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#RelatedServicing
	 * InstructionForMeeting.RelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd MeetingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			type_lazy = () -> InstructionForMeeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which consists in distributing the results of the meeting to the
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#RelatedServicing
	 * MeetingResultDissemination.RelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd MeetingResultDissemination = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingResultDissemination";
			definition = "Service which consists in distributing the results of the meeting to the investor.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingServicing";
				definition = "Services which consists in notifying the investor or its agent of a meeting, in validating and relaying its instructions and in calculating its entitlement based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.MeetingServicing, com.tools20022.repository.entity.MeetingNotice.RelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing,
						com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing);
				superType_lazy = () -> CorporateActionServicing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingServicing.MeetingSpecification, com.tools20022.repository.entity.MeetingServicing.MeetingNotice,
						com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.MeetingInstruction,
						com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination);
			}
		});
		return mmObject_lazy.get();
	}
}