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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmRelatedServicing
 * MeetingResultDissemination.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmVoteResult
 * MeetingResultDissemination.mmVoteResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteResult#mmVoteDissemination
 * VoteResult.mmVoteDissemination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingResultDissemination
 * MeetingServicing.mmMeetingResultDissemination}</li>
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
 * "MeetingResultDissemination"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information on the voting results of a shareholders meeting."</li>
 * </ul>
 */
public class MeetingResultDissemination {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MeetingServicing relatedServicing;
	/**
	 * Meeting servicing process which comprises the dissemination of the
	 * results.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingResultDissemination
	 * MeetingServicing.mmMeetingResultDissemination}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the dissemination of the results.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmMeetingResultDissemination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.VoteResult> voteResult;
	/**
	 * Specifies whether a resolution is accepted and the number of votes which
	 * were cast.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteResult#mmVoteDissemination
	 * VoteResult.mmVoteDissemination}</li>
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
	public static final MMBusinessAssociationEnd mmVoteResult = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteResult";
			definition = "Specifies whether a resolution is accepted and the number of votes which were cast.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteResult.mmVoteDissemination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDissemination";
				definition = "Provides information on the voting results of a shareholders meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteResult.mmVoteDissemination, com.tools20022.repository.entity.MeetingServicing.mmMeetingResultDissemination);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingResultDissemination.mmRelatedServicing, com.tools20022.repository.entity.MeetingResultDissemination.mmVoteResult);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingResultDissemination.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MeetingServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.MeetingServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}

	public List<VoteResult> getVoteResult() {
		return voteResult;
	}

	public void setVoteResult(List<com.tools20022.repository.entity.VoteResult> voteResult) {
		this.voteResult = voteResult;
	}
}