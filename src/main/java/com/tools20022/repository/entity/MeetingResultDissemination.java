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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the voting results of a shareholders meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingResultDissemination"
 * src="doc-files/MeetingResultDissemination.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#RelatedServicing
 * MeetingResultDissemination.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#VoteResult
 * MeetingResultDissemination.VoteResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteResult#VoteDissemination
 * VoteResult.VoteDissemination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingResultDissemination
 * MeetingServicing.MeetingResultDissemination}</li>
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
 * "MeetingResultDissemination"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information on the voting results of a shareholders meeting."</li>
 * </ul>
 */
public class MeetingResultDissemination {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting servicing process which comprises the dissemination of the
	 * results.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingResultDissemination
	 * MeetingServicing.MeetingResultDissemination}</li>
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
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination
	 * MeetingResultDissemination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting servicing process which comprises the dissemination of the results."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingResultDissemination.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the dissemination of the results.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MeetingServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether a resolution is accepted and the number of votes which
	 * were cast.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteResult#VoteDissemination
	 * VoteResult.VoteDissemination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VoteResult
	 * VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination
	 * MeetingResultDissemination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a resolution is accepted and the number of votes which were cast."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VoteResult = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingResultDissemination.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteResult";
			definition = "Specifies whether a resolution is accepted and the number of votes which were cast.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VoteResult.VoteDissemination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDissemination";
				definition = "Provides information on the voting results of a shareholders meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteResult.VoteDissemination, com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing, com.tools20022.repository.entity.MeetingResultDissemination.VoteResult);
			}
		});
		return mmObject_lazy.get();
	}
}