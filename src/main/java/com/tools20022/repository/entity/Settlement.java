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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process which consists in transferring the proceeds related to a trade from
 * one party to the next one.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Settlement" src="doc-files/Settlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmCentralCounterpartyEligibilityIndicator
 * Settlement.mmCentralCounterpartyEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
 * Settlement.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmSettlementPartyRole
 * Settlement.mmSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#mmTrade
 * Settlement.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlement
 * Trade.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlement
 * SettlementPartyRole.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
 * StandingSettlementInstruction.mmSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
 * CommercialTradeSettlement}</li>
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
 * "Settlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process which consists in transferring the proceeds related to a trade from one party to the next one."
 * </li>
 * </ul>
 */
public class Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator centralCounterpartyEligibilityIndicator;
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCentralCounterpartyEligibilityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyEligibilityIndicator";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Settlement.class.getMethod("getCentralCounterpartyEligibilityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingSettlementInstruction standingSettlementInstruction;
	/**
	 * Settlement Standing Instruction database to be used for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
	 * StandingSettlementInstruction.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement Standing Instruction database to be used for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Settlement Standing Instruction database to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SettlementPartyRole> settlementPartyRole;
	/**
	 * Specifies roles played by a party in the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlement
	 * SettlementPartyRole.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party in the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies roles played by a party in the settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
		}
	};
	protected Trade trade;
	/**
	 * Trade for which settlement information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmSettlement
	 * Trade.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Settlement Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which settlement information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which settlement information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Settlement";
				definition = "Process which consists in transferring the proceeds related to a trade from one party to the next one.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmSettlement, com.tools20022.repository.entity.SettlementPartyRole.mmSettlement,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmSettlement);
				subType_lazy = () -> Arrays.asList(CashSettlement.mmObject(), SecuritiesSettlement.mmObject(), CommercialTradeSettlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Settlement.mmCentralCounterpartyEligibilityIndicator, com.tools20022.repository.entity.Settlement.mmStandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.mmSettlementPartyRole, com.tools20022.repository.entity.Settlement.mmTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Settlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCentralCounterpartyEligibilityIndicator() {
		return centralCounterpartyEligibilityIndicator;
	}

	public void setCentralCounterpartyEligibilityIndicator(YesNoIndicator centralCounterpartyEligibilityIndicator) {
		this.centralCounterpartyEligibilityIndicator = centralCounterpartyEligibilityIndicator;
	}

	public StandingSettlementInstruction getStandingSettlementInstruction() {
		return standingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(com.tools20022.repository.entity.StandingSettlementInstruction standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
	}

	public List<SettlementPartyRole> getSettlementPartyRole() {
		return settlementPartyRole;
	}

	public void setSettlementPartyRole(List<com.tools20022.repository.entity.SettlementPartyRole> settlementPartyRole) {
		this.settlementPartyRole = settlementPartyRole;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}
}