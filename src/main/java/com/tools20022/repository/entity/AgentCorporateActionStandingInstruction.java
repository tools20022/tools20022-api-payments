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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.StandingInstructionGrossNetCode;
import com.tools20022.repository.codeset.StandingInstructionTypeCode;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set-up at the issuer (agent) of a standing instruction originating from the
 * CSD Participants. These standing instructions allow the participant to
 * indicate details for the distribution of the outturn resources of a CA event
 * outside of the CSD. A standing instruction can be accepted or rejected by the
 * issuer (agent) and a CSD participant can amend or cancel a standing
 * instruction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AgentCorporateActionStandingInstruction"
 * src="doc-files/AgentCorporateActionStandingInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#StandingInstructionType
 * AgentCorporateActionStandingInstruction.StandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#GrossOrNetIndicator
 * AgentCorporateActionStandingInstruction.GrossOrNetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#RelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#Security
 * AgentCorporateActionStandingInstruction.Security}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#CorporateActionStandingInstructions
 * Security.CorporateActionStandingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
 * StandingSettlementInstruction}</li>
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
 * "AgentCorporateActionStandingInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set-up at the issuer (agent) of a standing instruction originating from the CSD Participants. These standing instructions allow the participant to indicate details for the distribution of the outturn resources of a CA event outside of the CSD. A standing instruction can be accepted or rejected by the issuer (agent) and a CSD participant can amend or cancel a standing instruction."
 * </li>
 * </ul>
 */
public class AgentCorporateActionStandingInstruction extends StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode
	 * StandingInstructionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of standing instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandingInstructionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingInstructionType";
			definition = "Type of standing instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StandingInstructionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the payments must always be gross or net.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNetCode
	 * StandingInstructionGrossNetCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOrNetIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payments must always be gross or net."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossOrNetIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossOrNetIndicator";
			definition = "Indicates whether the payments must always be gross or net.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StandingInstructionGrossNetCode.mmObject();
		}
	};
	/**
	 * Corporate action delivery instructions which contain settlement standing
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CorporateActionStandingInstruction
	 * CorporateActionProceedsDeliveryInstruction.
	 * CorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDeliveryInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action delivery instructions which contain settlement standing instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDeliveryInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDeliveryInstructions";
			definition = "Corporate action delivery instructions which contain settlement standing instructions.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financial instrument to which the standing instruction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CorporateActionStandingInstructions
	 * Security.CorporateActionStandingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument to which the standing instruction applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Financial instrument to which the standing instruction applies.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CorporateActionStandingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgentCorporateActionStandingInstruction";
				definition = "Set-up at the issuer (agent) of a standing instruction originating from the CSD Participants. These standing instructions allow the participant to indicate details for the distribution of the outturn resources of a CA event outside of the CSD. A standing instruction can be accepted or rejected by the issuer (agent) and a CSD participant can amend or cancel a standing instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CorporateActionStandingInstructions,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction);
				superType_lazy = () -> StandingSettlementInstruction.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.StandingInstructionType,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.GrossOrNetIndicator, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security);
			}
		});
		return mmObject_lazy.get();
	}
}