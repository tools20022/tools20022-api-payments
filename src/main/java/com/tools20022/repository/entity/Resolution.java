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
import com.tools20022.repository.codeset.ResolutionTypeCode;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.Vote;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Resolution" src="doc-files/Resolution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmIssuerLabel
 * Resolution.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmDescription
 * Resolution.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmTitle
 * Resolution.mmTitle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmType
 * Resolution.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#mmForInformationOnly
 * Resolution.mmForInformationOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#mmSubmittedBySecurityHolder
 * Resolution.mmSubmittedBySecurityHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#mmManagementRecommendation
 * Resolution.mmManagementRecommendation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#mmNotifyingPartyRecommendation
 * Resolution.mmNotifyingPartyRecommendation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmCastVotes
 * Resolution.mmCastVotes}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmMeeting
 * Resolution.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmVoteOptions
 * Resolution.mmVoteOptions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAgendaItem
 * Meeting.mmAgendaItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmResolution
 * Vote.mmResolution}</li>
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
 * "Resolution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only."
 * </li>
 * </ul>
 */
public class Resolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text issuerLabel;
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or  its agent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, Max35Text> mmIssuerLabel = new MMBusinessAttribute<Resolution, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or  its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Resolution obj) {
			return obj.getIssuerLabel();
		}

		@Override
		public void setValue(Resolution obj, Max35Text value) {
			obj.setIssuerLabel(value);
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text description of the resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, Max350Text> mmDescription = new MMBusinessAttribute<Resolution, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Resolution obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Resolution obj, Max350Text value) {
			obj.setDescription(value);
		}
	};
	protected Max350Text title;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Title"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Abbreviated description of the resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, Max350Text> mmTitle = new MMBusinessAttribute<Resolution, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Resolution obj) {
			return obj.getTitle();
		}

		@Override
		public void setValue(Resolution obj, Max350Text value) {
			obj.setTitle(value);
		}
	};
	protected ResolutionTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode
	 * ResolutionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a resolution is ordinary, extraordinary or special."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, ResolutionTypeCode> mmType = new MMBusinessAttribute<Resolution, ResolutionTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates whether a resolution is ordinary, extraordinary or special.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionTypeCode.mmObject();
		}

		@Override
		public ResolutionTypeCode getValue(Resolution obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Resolution obj, ResolutionTypeCode value) {
			obj.setType(value);
		}
	};
	protected YesNoIndicator forInformationOnly;
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution is listed for information or for voting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, YesNoIndicator> mmForInformationOnly = new MMBusinessAttribute<Resolution, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Resolution obj) {
			return obj.getForInformationOnly();
		}

		@Override
		public void setValue(Resolution obj, YesNoIndicator value) {
			obj.setForInformationOnly(value);
		}
	};
	protected YesNoIndicator submittedBySecurityHolder;
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittedBySecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution has been submitted by the security holder."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, YesNoIndicator> mmSubmittedBySecurityHolder = new MMBusinessAttribute<Resolution, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Resolution obj) {
			return obj.getSubmittedBySecurityHolder();
		}

		@Override
		public void setValue(Resolution obj, YesNoIndicator value) {
			obj.setSubmittedBySecurityHolder(value);
		}
	};
	protected VoteInstructionCode managementRecommendation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the management of the issuing company wishes the security holders to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, VoteInstructionCode> mmManagementRecommendation = new MMBusinessAttribute<Resolution, VoteInstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagementRecommendation";
			definition = "Indicates how the management of the issuing company wishes the security holders to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		@Override
		public VoteInstructionCode getValue(Resolution obj) {
			return obj.getManagementRecommendation();
		}

		@Override
		public void setValue(Resolution obj, VoteInstructionCode value) {
			obj.setManagementRecommendation(value);
		}
	};
	protected VoteInstructionCode notifyingPartyRecommendation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingPartyRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the notifying party recommends that the security holders vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, VoteInstructionCode> mmNotifyingPartyRecommendation = new MMBusinessAttribute<Resolution, VoteInstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		@Override
		public VoteInstructionCode getValue(Resolution obj) {
			return obj.getNotifyingPartyRecommendation();
		}

		@Override
		public void setValue(Resolution obj, VoteInstructionCode value) {
			obj.setNotifyingPartyRecommendation(value);
		}
	};
	protected Vote castVotes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmResolution
	 * Vote.mmResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CastVotes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a resolution is accepted or not and details the number of votes and their status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Resolution, Vote> mmCastVotes = new MMBusinessAssociationEnd<Resolution, Vote>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CastVotes";
			definition = "Specifies whether a resolution is accepted or not and details the number of votes and their status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Vote.mmResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Vote.mmObject();
		}

		@Override
		public Vote getValue(Resolution obj) {
			return obj.getCastVotes();
		}

		@Override
		public void setValue(Resolution obj, Vote value) {
			obj.setCastVotes(value);
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAgendaItem
	 * Meeting.mmAgendaItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which an agenda item is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Resolution, Optional<Meeting>> mmMeeting = new MMBusinessAssociationEnd<Resolution, Optional<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an agenda item is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmAgendaItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public Optional<Meeting> getValue(Resolution obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(Resolution obj, Optional<Meeting> value) {
			obj.setMeeting(value.orElse(null));
		}
	};
	protected VoteInstructionCode voteOptions;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Resolution, VoteInstructionCode> mmVoteOptions = new MMBusinessAttribute<Resolution, VoteInstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteOptions";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		@Override
		public VoteInstructionCode getValue(Resolution obj) {
			return obj.getVoteOptions();
		}

		@Override
		public void setValue(Resolution obj, VoteInstructionCode value) {
			obj.setVoteOptions(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Resolution";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
				associationDomain_lazy = () -> Arrays.asList(Meeting.mmAgendaItem, Vote.mmResolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Resolution.mmIssuerLabel, com.tools20022.repository.entity.Resolution.mmDescription, com.tools20022.repository.entity.Resolution.mmTitle,
						com.tools20022.repository.entity.Resolution.mmType, com.tools20022.repository.entity.Resolution.mmForInformationOnly, com.tools20022.repository.entity.Resolution.mmSubmittedBySecurityHolder,
						com.tools20022.repository.entity.Resolution.mmManagementRecommendation, com.tools20022.repository.entity.Resolution.mmNotifyingPartyRecommendation, com.tools20022.repository.entity.Resolution.mmCastVotes,
						com.tools20022.repository.entity.Resolution.mmMeeting, com.tools20022.repository.entity.Resolution.mmVoteOptions);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Resolution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public Resolution setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = Objects.requireNonNull(issuerLabel);
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public Resolution setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Max350Text getTitle() {
		return title;
	}

	public Resolution setTitle(Max350Text title) {
		this.title = Objects.requireNonNull(title);
		return this;
	}

	public ResolutionTypeCode getType() {
		return type;
	}

	public Resolution setType(ResolutionTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YesNoIndicator getForInformationOnly() {
		return forInformationOnly;
	}

	public Resolution setForInformationOnly(YesNoIndicator forInformationOnly) {
		this.forInformationOnly = Objects.requireNonNull(forInformationOnly);
		return this;
	}

	public YesNoIndicator getSubmittedBySecurityHolder() {
		return submittedBySecurityHolder;
	}

	public Resolution setSubmittedBySecurityHolder(YesNoIndicator submittedBySecurityHolder) {
		this.submittedBySecurityHolder = Objects.requireNonNull(submittedBySecurityHolder);
		return this;
	}

	public VoteInstructionCode getManagementRecommendation() {
		return managementRecommendation;
	}

	public Resolution setManagementRecommendation(VoteInstructionCode managementRecommendation) {
		this.managementRecommendation = Objects.requireNonNull(managementRecommendation);
		return this;
	}

	public VoteInstructionCode getNotifyingPartyRecommendation() {
		return notifyingPartyRecommendation;
	}

	public Resolution setNotifyingPartyRecommendation(VoteInstructionCode notifyingPartyRecommendation) {
		this.notifyingPartyRecommendation = Objects.requireNonNull(notifyingPartyRecommendation);
		return this;
	}

	public Vote getCastVotes() {
		return castVotes;
	}

	public Resolution setCastVotes(Vote castVotes) {
		this.castVotes = Objects.requireNonNull(castVotes);
		return this;
	}

	public Optional<Meeting> getMeeting() {
		return meeting == null ? Optional.empty() : Optional.of(meeting);
	}

	public Resolution setMeeting(Meeting meeting) {
		this.meeting = meeting;
		return this;
	}

	public VoteInstructionCode getVoteOptions() {
		return voteOptions;
	}

	public Resolution setVoteOptions(VoteInstructionCode voteOptions) {
		this.voteOptions = Objects.requireNonNull(voteOptions);
		return this;
	}
}