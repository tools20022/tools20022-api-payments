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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MeetingResultDissemination;
import com.tools20022.repository.entity.Vote;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether an agenda item of a general meeting has been accepted or
 * rejected, together with the number of votes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VoteResult" src="doc-files/VoteResult.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.VoteResult#mmVote
 * VoteResult.mmVote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteResult#mmAccepted
 * VoteResult.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteResult#mmVoteDissemination
 * VoteResult.mmVoteDissemination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteResult#mmTotalVotesCast
 * VoteResult.mmTotalVotesCast}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmResult Vote.mmResult}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmVoteResult
 * MeetingResultDissemination.mmVoteResult}</li>
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
 * "VoteResult"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether an agenda item of a general meeting has been accepted or rejected, together with the number of votes."
 * </li>
 * </ul>
 */
public class VoteResult {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Vote> vote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Vote#mmResult
	 * Vote.mmResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteResult VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes per type of vote and per resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<VoteResult, List<Vote>> mmVote = new MMBusinessAssociationEnd<VoteResult, List<Vote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vote";
			definition = "Number of votes per type of vote and per resolution.";
			minOccurs = 0;
			opposite_lazy = () -> Vote.mmResult;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Vote.mmObject();
		}

		@Override
		public List<Vote> getValue(VoteResult obj) {
			return obj.getVote();
		}

		@Override
		public void setValue(VoteResult obj, List<Vote> value) {
			obj.setVote(value);
		}
	};
	protected YesNoIndicator accepted;
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
	 * {@linkplain com.tools20022.repository.entity.VoteResult VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether a resolution is accepted or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<VoteResult, YesNoIndicator> mmAccepted = new MMBusinessAttribute<VoteResult, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Specifies whether a resolution is accepted or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(VoteResult obj) {
			return obj.getAccepted();
		}

		@Override
		public void setValue(VoteResult obj, YesNoIndicator value) {
			obj.setAccepted(value);
		}
	};
	protected MeetingResultDissemination voteDissemination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingResultDissemination#mmVoteResult
	 * MeetingResultDissemination.mmVoteResult}</li>
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
	 * {@linkplain com.tools20022.repository.entity.VoteResult VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteDissemination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disemination process through which the results are propagated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<VoteResult, Optional<MeetingResultDissemination>> mmVoteDissemination = new MMBusinessAssociationEnd<VoteResult, Optional<MeetingResultDissemination>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteDissemination";
			definition = "Disemination process through which the results are propagated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MeetingResultDissemination.mmVoteResult;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingResultDissemination.mmObject();
		}

		@Override
		public Optional<MeetingResultDissemination> getValue(VoteResult obj) {
			return obj.getVoteDissemination();
		}

		@Override
		public void setValue(VoteResult obj, Optional<MeetingResultDissemination> value) {
			obj.setVoteDissemination(value.orElse(null));
		}
	};
	protected Number totalVotesCast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteResult VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVotesCast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of votes cast per resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<VoteResult, Number> mmTotalVotesCast = new MMBusinessAttribute<VoteResult, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalVotesCast";
			definition = "Total number of votes cast per resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(VoteResult obj) {
			return obj.getTotalVotesCast();
		}

		@Override
		public void setValue(VoteResult obj, Number value) {
			obj.setTotalVotesCast(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteResult";
				definition = "Specifies whether an agenda item of a general meeting has been accepted or rejected, together with the number of votes.";
				associationDomain_lazy = () -> Arrays.asList(Vote.mmResult, MeetingResultDissemination.mmVoteResult);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteResult.mmVote, com.tools20022.repository.entity.VoteResult.mmAccepted, com.tools20022.repository.entity.VoteResult.mmVoteDissemination,
						com.tools20022.repository.entity.VoteResult.mmTotalVotesCast);
			}

			@Override
			public Class<?> getInstanceClass() {
				return VoteResult.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Vote> getVote() {
		return vote == null ? vote = new ArrayList<>() : vote;
	}

	public VoteResult setVote(List<Vote> vote) {
		this.vote = Objects.requireNonNull(vote);
		return this;
	}

	public YesNoIndicator getAccepted() {
		return accepted;
	}

	public VoteResult setAccepted(YesNoIndicator accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public Optional<MeetingResultDissemination> getVoteDissemination() {
		return voteDissemination == null ? Optional.empty() : Optional.of(voteDissemination);
	}

	public VoteResult setVoteDissemination(MeetingResultDissemination voteDissemination) {
		this.voteDissemination = voteDissemination;
		return this;
	}

	public Number getTotalVotesCast() {
		return totalVotesCast;
	}

	public VoteResult setTotalVotesCast(Number totalVotesCast) {
		this.totalVotesCast = Objects.requireNonNull(totalVotesCast);
		return this;
	}
}