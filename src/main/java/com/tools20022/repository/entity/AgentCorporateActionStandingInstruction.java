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
import com.tools20022.repository.codeset.StandingInstructionGrossNetCode;
import com.tools20022.repository.codeset.StandingInstructionTypeCode;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
 * StandingSettlementInstruction}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmStandingInstructionType
 * AgentCorporateActionStandingInstruction.mmStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmGrossOrNetIndicator
 * AgentCorporateActionStandingInstruction.mmGrossOrNetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmRelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateActionStandingInstructions
 * Security.mmCorporateActionStandingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.
 * mmCorporateActionStandingInstruction}</li>
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
 * "AgentCorporateActionStandingInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set-up at the issuer (agent) of a standing instruction originating from the CSD Participants. These standing instructions allow the participant to indicate details for the distribution of the outturn resources of a CA event outside of the CSD. A standing instruction can be accepted or rejected by the issuer (agent) and a CSD participant can amend or cancel a standing instruction."
 * </li>
 * </ul>
 */
public class AgentCorporateActionStandingInstruction extends StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected StandingInstructionTypeCode standingInstructionType;
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
	public static final MMBusinessAttribute mmStandingInstructionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingInstructionType";
			definition = "Type of standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCorporateActionStandingInstruction.class.getMethod("getStandingInstructionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingInstructionGrossNetCode grossOrNetIndicator;
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
	public static final MMBusinessAttribute mmGrossOrNetIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossOrNetIndicator";
			definition = "Indicates whether the payments must always be gross or net.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionGrossNetCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCorporateActionStandingInstruction.class.getMethod("getGrossOrNetIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedDeliveryInstructions;
	/**
	 * Corporate action delivery instructions which contain settlement standing
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCorporateActionStandingInstruction
	 * CorporateActionProceedsDeliveryInstruction.
	 * mmCorporateActionStandingInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDeliveryInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDeliveryInstructions";
			definition = "Corporate action delivery instructions which contain settlement standing instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCorporateActionStandingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Financial instrument to which the standing instruction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateActionStandingInstructions
	 * Security.mmCorporateActionStandingInstructions}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Financial instrument to which the standing instruction applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCorporateActionStandingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCorporateActionStandingInstruction";
				definition = "Set-up at the issuer (agent) of a standing instruction originating from the CSD Participants. These standing instructions allow the participant to indicate details for the distribution of the outturn resources of a CA event outside of the CSD. A standing instruction can be accepted or rejected by the issuer (agent) and a CSD participant can amend or cancel a standing instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCorporateActionStandingInstructions,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCorporateActionStandingInstruction);
				superType_lazy = () -> StandingSettlementInstruction.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmStandingInstructionType,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmGrossOrNetIndicator, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCorporateActionStandingInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public StandingInstructionTypeCode getStandingInstructionType() {
		return standingInstructionType;
	}

	public void setStandingInstructionType(StandingInstructionTypeCode standingInstructionType) {
		this.standingInstructionType = standingInstructionType;
	}

	public StandingInstructionGrossNetCode getGrossOrNetIndicator() {
		return grossOrNetIndicator;
	}

	public void setGrossOrNetIndicator(StandingInstructionGrossNetCode grossOrNetIndicator) {
		this.grossOrNetIndicator = grossOrNetIndicator;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedDeliveryInstructions() {
		return relatedDeliveryInstructions;
	}

	public void setRelatedDeliveryInstructions(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedDeliveryInstructions) {
		this.relatedDeliveryInstructions = relatedDeliveryInstructions;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}
}