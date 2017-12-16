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
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies that a proxy has been appointed to represent a party authorised to
 * vote at a general meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProxyAppointment" src="doc-files/ProxyAppointment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmProxyType
 * ProxyAppointment.mmProxyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmRelatedMeetingInstruction
 * ProxyAppointment.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmIdentification
 * ProxyAppointment.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProxyAppointment#mmVote
 * ProxyAppointment.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmAdditionalParticipationCost
 * ProxyAppointment.mmAdditionalParticipationCost}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmRelatedProxyAppointment
 * VoteInstructionRequest.mmRelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmProxyAppointment
 * InstructionForMeeting.mmProxyAppointment}</li>
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
 * "ProxyAppointment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies that a proxy has been appointed  to represent a party authorised to vote at a general meeting."
 * </li>
 * </ul>
 */
public class ProxyAppointment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ProxyTypeCode proxyType;
	/**
	 * Specifies the type of proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProxyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyType";
			definition = "Specifies the type of proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProxyAppointment.class.getMethod("getProxyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionForMeeting relatedMeetingInstruction;
	/**
	 * Instruction in which the parameters for proxy appointment are included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmProxyAppointment
	 * InstructionForMeeting.mmProxyAppointment}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction in which the parameters for proxy appointment are included."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Instruction in which the parameters for proxy appointment are included.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmProxyAppointment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Uniquely identifies a proxy card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies a proxy card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a proxy card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProxyAppointment.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.VoteInstructionRequest> vote;
	/**
	 * Voting instructions for the proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmRelatedProxyAppointment
	 * VoteInstructionRequest.mmRelatedProxyAppointment}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Voting instructions for the proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vote";
			definition = "Voting instructions for the proxy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmRelatedProxyAppointment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
		}
	};
	protected CurrencyAndAmount additionalParticipationCost;
	/**
	 * Aditional fee associated to the participation of a proxy person such as
	 * hotel expenses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParticipationCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Aditional fee associated to the participation of a proxy person such as hotel expenses."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdditionalParticipationCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalParticipationCost";
			definition = "Aditional fee associated to the participation of a proxy person such as hotel expenses.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProxyAppointment.class.getMethod("getAdditionalParticipationCost", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointment";
				definition = "Specifies that a proxy has been appointed  to represent a party authorised to vote at a general meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.mmRelatedProxyAppointment, com.tools20022.repository.entity.InstructionForMeeting.mmProxyAppointment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.mmProxyType, com.tools20022.repository.entity.ProxyAppointment.mmRelatedMeetingInstruction,
						com.tools20022.repository.entity.ProxyAppointment.mmIdentification, com.tools20022.repository.entity.ProxyAppointment.mmVote, com.tools20022.repository.entity.ProxyAppointment.mmAdditionalParticipationCost);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProxyAppointment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ProxyTypeCode getProxyType() {
		return proxyType;
	}

	public void setProxyType(ProxyTypeCode proxyType) {
		this.proxyType = proxyType;
	}

	public InstructionForMeeting getRelatedMeetingInstruction() {
		return relatedMeetingInstruction;
	}

	public void setRelatedMeetingInstruction(com.tools20022.repository.entity.InstructionForMeeting relatedMeetingInstruction) {
		this.relatedMeetingInstruction = relatedMeetingInstruction;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public List<VoteInstructionRequest> getVote() {
		return vote;
	}

	public void setVote(List<com.tools20022.repository.entity.VoteInstructionRequest> vote) {
		this.vote = vote;
	}

	public CurrencyAndAmount getAdditionalParticipationCost() {
		return additionalParticipationCost;
	}

	public void setAdditionalParticipationCost(CurrencyAndAmount additionalParticipationCost) {
		this.additionalParticipationCost = additionalParticipationCost;
	}
}