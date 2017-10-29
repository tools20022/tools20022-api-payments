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
 * Specifies the delivery instructions for the securities and cash proceeds at
 * any stage of the Corporate Action process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionProceedsDeliveryInstruction"
 * src="doc-files/CorporateActionProceedsDeliveryInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
 * Account.RelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
 * PaymentObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#RelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions}</li>
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
 * "CorporateActionProceedsDeliveryInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
 * </li>
 * </ul>
 */
public class CorporateActionProceedsDeliveryInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Parameters of the distribution of the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters of the distribution of the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDistribution";
			definition = "Parameters of the distribution of the proceeds of a CA event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instructions for the movement of securities related to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
	 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of securities related to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsMovement";
			definition = "Instructions for the movement of securities related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instructions for the movement of cash related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
	 * PaymentObligation.RelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of cash related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashProceedsMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceedsMovement";
			definition = "Instructions for the movement of cash related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information relative to the account(s) to be used for the delivery of the
	 * proceeds (cash or securities)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
	 * Account.RelatedProceedsDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedProceedsDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing instruction related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#RelatedDeliveryInstructions
	 * AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStandingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstruction";
			definition = "Standing instruction related to a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProceedsDeliveryInstruction";
				definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}