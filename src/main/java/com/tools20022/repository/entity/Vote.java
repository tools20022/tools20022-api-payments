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
import com.tools20022.repository.entity.Resolution;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.entity.VoteResult;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of votes assigned to each voting option.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Vote" src="doc-files/Vote.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmVoteRequest
 * Vote.mmVoteRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmFor Vote.mmFor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmAgainst
 * Vote.mmAgainst}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmAbstain
 * Vote.mmAbstain}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmWithhold
 * Vote.mmWithhold}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmWithManagement
 * Vote.mmWithManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmAgainstManagement
 * Vote.mmAgainstManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmResolution
 * Vote.mmResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmNoAction
 * Vote.mmNoAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmResult Vote.mmResult}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmTwoYears
 * Vote.mmTwoYears}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmOneYear
 * Vote.mmOneYear}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmWithdrawn
 * Vote.mmWithdrawn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmThreeYears
 * Vote.mmThreeYears}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmCastVotes
 * Resolution.mmCastVotes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
 * VoteInstructionRequest.mmVotePerResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteResult#mmVote
 * VoteResult.mmVote}</li>
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
 * "Vote"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Number of votes assigned to each voting option."</li>
 * </ul>
 */
public class Vote {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected VoteInstructionRequest voteRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
	 * VoteInstructionRequest.mmVotePerResolution}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request which contains the vote instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Vote, Optional<VoteInstructionRequest>> mmVoteRequest = new MMBusinessAssociationEnd<Vote, Optional<VoteInstructionRequest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteRequest";
			definition = "Request which contains the vote instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> VoteInstructionRequest.mmVotePerResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VoteInstructionRequest.mmObject();
		}

		@Override
		public Optional<VoteInstructionRequest> getValue(Vote obj) {
			return obj.getVoteRequest();
		}

		@Override
		public void setValue(Vote obj, Optional<VoteInstructionRequest> value) {
			obj.setVoteRequest(value.orElse(null));
		}
	};
	protected Number for_;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in favour of one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmFor = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getFor();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setFor(value);
		}
	};
	protected Number against;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes against one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmAgainst = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getAgainst();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setAgainst(value);
		}
	};
	protected Number abstain;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes declared abstained for one resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmAbstain = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Number of votes declared abstained for one resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getAbstain();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setAbstain(value);
		}
	};
	protected Number withhold;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes withheld for one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmWithhold = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withhold";
			definition = "Number of votes withheld for one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getWithhold();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setWithhold(value);
		}
	};
	protected Number withManagement;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in line with the votes of the management."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmWithManagement = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithManagement";
			definition = "Number of votes in line with the votes of the management.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getWithManagement();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setWithManagement(value);
		}
	};
	protected Number againstManagement;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes against the voting recommendation of the management."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmAgainstManagement = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgainstManagement";
			definition = "Number of votes against the voting recommendation of the management.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getAgainstManagement();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setAgainstManagement(value);
		}
	};
	protected List<Resolution> resolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmCastVotes
	 * Resolution.mmCastVotes}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Resolution
	 * Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the agenda item on which a vote is/was cast."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Vote, List<Resolution>> mmResolution = new MMBusinessAssociationEnd<Vote, List<Resolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Resolution";
			definition = "Specifies the agenda item on which a vote is/was cast.";
			minOccurs = 0;
			opposite_lazy = () -> Resolution.mmCastVotes;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Resolution.mmObject();
		}

		@Override
		public List<Resolution> getValue(Vote obj) {
			return obj.getResolution();
		}

		@Override
		public void setValue(Vote obj, List<Resolution> value) {
			obj.setResolution(value);
		}
	};
	protected Number noAction;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes for which no action has been taken."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmNoAction = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getNoAction();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setNoAction(value);
		}
	};
	protected VoteResult result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteResult#mmVote
	 * VoteResult.mmVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VoteResult
	 * VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the vote result for a specific resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Vote, Optional<VoteResult>> mmResult = new MMBusinessAssociationEnd<Vote, Optional<VoteResult>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Result";
			definition = "Information on the vote result for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> VoteResult.mmVote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VoteResult.mmObject();
		}

		@Override
		public Optional<VoteResult> getValue(Vote obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(Vote obj, Optional<VoteResult> value) {
			obj.setResult(value.orElse(null));
		}
	};
	protected Number twoYears;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of two years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmTwoYears = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getTwoYears();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setTwoYears(value);
		}
	};
	protected Number oneYear;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour for one year for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmOneYear = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getOneYear();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setOneYear(value);
		}
	};
	protected YesNoIndicator withdrawn;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resolution withdrawn at the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, YesNoIndicator> mmWithdrawn = new MMBusinessAttribute<Vote, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Resolution withdrawn at the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Vote obj) {
			return obj.getWithdrawn();
		}

		@Override
		public void setValue(Vote obj, YesNoIndicator value) {
			obj.setWithdrawn(value);
		}
	};
	protected Number threeYears;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of three years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Vote, Number> mmThreeYears = new MMBusinessAttribute<Vote, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Vote obj) {
			return obj.getThreeYears();
		}

		@Override
		public void setValue(Vote obj, Number value) {
			obj.setThreeYears(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vote";
				definition = "Number of votes assigned to each voting option.";
				associationDomain_lazy = () -> Arrays.asList(Resolution.mmCastVotes, VoteInstructionRequest.mmVotePerResolution, VoteResult.mmVote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Vote.mmVoteRequest, com.tools20022.repository.entity.Vote.mmFor, com.tools20022.repository.entity.Vote.mmAgainst,
						com.tools20022.repository.entity.Vote.mmAbstain, com.tools20022.repository.entity.Vote.mmWithhold, com.tools20022.repository.entity.Vote.mmWithManagement, com.tools20022.repository.entity.Vote.mmAgainstManagement,
						com.tools20022.repository.entity.Vote.mmResolution, com.tools20022.repository.entity.Vote.mmNoAction, com.tools20022.repository.entity.Vote.mmResult, com.tools20022.repository.entity.Vote.mmTwoYears,
						com.tools20022.repository.entity.Vote.mmOneYear, com.tools20022.repository.entity.Vote.mmWithdrawn, com.tools20022.repository.entity.Vote.mmThreeYears);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Vote.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<VoteInstructionRequest> getVoteRequest() {
		return voteRequest == null ? Optional.empty() : Optional.of(voteRequest);
	}

	public Vote setVoteRequest(VoteInstructionRequest voteRequest) {
		this.voteRequest = voteRequest;
		return this;
	}

	public Number getFor() {
		return for_;
	}

	public Vote setFor(Number for_) {
		this.for_ = Objects.requireNonNull(for_);
		return this;
	}

	public Number getAgainst() {
		return against;
	}

	public Vote setAgainst(Number against) {
		this.against = Objects.requireNonNull(against);
		return this;
	}

	public Number getAbstain() {
		return abstain;
	}

	public Vote setAbstain(Number abstain) {
		this.abstain = Objects.requireNonNull(abstain);
		return this;
	}

	public Number getWithhold() {
		return withhold;
	}

	public Vote setWithhold(Number withhold) {
		this.withhold = Objects.requireNonNull(withhold);
		return this;
	}

	public Number getWithManagement() {
		return withManagement;
	}

	public Vote setWithManagement(Number withManagement) {
		this.withManagement = Objects.requireNonNull(withManagement);
		return this;
	}

	public Number getAgainstManagement() {
		return againstManagement;
	}

	public Vote setAgainstManagement(Number againstManagement) {
		this.againstManagement = Objects.requireNonNull(againstManagement);
		return this;
	}

	public List<Resolution> getResolution() {
		return resolution == null ? resolution = new ArrayList<>() : resolution;
	}

	public Vote setResolution(List<Resolution> resolution) {
		this.resolution = Objects.requireNonNull(resolution);
		return this;
	}

	public Number getNoAction() {
		return noAction;
	}

	public Vote setNoAction(Number noAction) {
		this.noAction = Objects.requireNonNull(noAction);
		return this;
	}

	public Optional<VoteResult> getResult() {
		return result == null ? Optional.empty() : Optional.of(result);
	}

	public Vote setResult(VoteResult result) {
		this.result = result;
		return this;
	}

	public Number getTwoYears() {
		return twoYears;
	}

	public Vote setTwoYears(Number twoYears) {
		this.twoYears = Objects.requireNonNull(twoYears);
		return this;
	}

	public Number getOneYear() {
		return oneYear;
	}

	public Vote setOneYear(Number oneYear) {
		this.oneYear = Objects.requireNonNull(oneYear);
		return this;
	}

	public YesNoIndicator getWithdrawn() {
		return withdrawn;
	}

	public Vote setWithdrawn(YesNoIndicator withdrawn) {
		this.withdrawn = Objects.requireNonNull(withdrawn);
		return this;
	}

	public Number getThreeYears() {
		return threeYears;
	}

	public Vote setThreeYears(Number threeYears) {
		this.threeYears = Objects.requireNonNull(threeYears);
		return this;
	}
}