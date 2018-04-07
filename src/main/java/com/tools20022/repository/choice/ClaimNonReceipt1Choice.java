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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV08;
import com.tools20022.repository.choice.ClaimNonReceiptRejectReason1Choice;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.entity.InvestigationCaseStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClaimNonReceipt1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies whether the claim non receipt is accepted or rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice#mmAccepted
 * ClaimNonReceipt1Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice#mmRejected
 * ClaimNonReceipt1Choice.mmRejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08#mmClaimNonReceiptDetails
 * ResolutionOfInvestigationV08.mmClaimNonReceiptDetails}</li>
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
 * "ClaimNonReceipt1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the claim non receipt is accepted or rejected."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClaimNonReceipt1Choice", propOrder = {"accepted", "rejected"})
public class ClaimNonReceipt1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Accptd", required = true)
	protected ClaimNonReceipt1 accepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClaimNonReceipt1
	 * ClaimNonReceipt1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
	 * InvestigationCaseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice
	 * ClaimNonReceipt1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Claim non-receipt is accepted and processed by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClaimNonReceipt1Choice, ClaimNonReceipt1> mmAccepted = new MMMessageAssociationEnd<ClaimNonReceipt1Choice, ClaimNonReceipt1>() {
		{
			businessComponentTrace_lazy = () -> InvestigationCaseStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ClaimNonReceipt1Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Claim non-receipt is accepted and processed by the agent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClaimNonReceipt1.mmObject();
		}

		@Override
		public ClaimNonReceipt1 getValue(ClaimNonReceipt1Choice obj) {
			return obj.getAccepted();
		}

		@Override
		public void setValue(ClaimNonReceipt1Choice obj, ClaimNonReceipt1 value) {
			obj.setAccepted(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected ClaimNonReceiptRejectReason1Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceiptRejectReason1Choice
	 * ClaimNonReceiptRejectReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
	 * InvestigationCaseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceipt1Choice
	 * ClaimNonReceipt1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the claim non receipt has been rejected and provides the reason for the rejection."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClaimNonReceipt1Choice, ClaimNonReceiptRejectReason1Choice> mmRejected = new MMMessageAssociationEnd<ClaimNonReceipt1Choice, ClaimNonReceiptRejectReason1Choice>() {
		{
			businessComponentTrace_lazy = () -> InvestigationCaseStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ClaimNonReceipt1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Specifies that the claim non receipt has been rejected and provides the reason for the rejection.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClaimNonReceiptRejectReason1Choice.mmObject();
		}

		@Override
		public ClaimNonReceiptRejectReason1Choice getValue(ClaimNonReceipt1Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(ClaimNonReceipt1Choice obj, ClaimNonReceiptRejectReason1Choice value) {
			obj.setRejected(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClaimNonReceipt1Choice.mmAccepted, com.tools20022.repository.choice.ClaimNonReceipt1Choice.mmRejected);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV08.mmClaimNonReceiptDetails);
				trace_lazy = () -> InvestigationCase.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClaimNonReceipt1Choice";
				definition = "Specifies whether the claim non receipt is accepted or rejected.";
			}
		});
		return mmObject_lazy.get();
	}

	public ClaimNonReceipt1 getAccepted() {
		return accepted;
	}

	public ClaimNonReceipt1Choice setAccepted(ClaimNonReceipt1 accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public ClaimNonReceiptRejectReason1Choice getRejected() {
		return rejected;
	}

	public ClaimNonReceipt1Choice setRejected(ClaimNonReceiptRejectReason1Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}
}