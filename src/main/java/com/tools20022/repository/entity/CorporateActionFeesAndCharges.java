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
import com.tools20022.repository.entity.Charges;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of all the charges related to a corporate action event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionFeesAndCharges"
 * src="doc-files/CorporateActionFeesAndCharges.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
 * CorporateActionFeesAndCharges.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
 * CorporateActionFeesAndCharges.SolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#Commission
 * CorporateActionFeesAndCharges.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CorporateActionFeesAndCharges
 * Commission.CorporateActionFeesAndCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
 * CorporateActionEvent.CorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
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
 * "CorporateActionFeesAndCharges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of all the charges related to a corporate action event."</li>
 * </ul>
 */
public class CorporateActionFeesAndCharges extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Corporate action for which fees and charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
	 * CorporateActionEvent.CorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which fees and charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which fees and charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount made available in a corporate event in order to encourage
	 * participation in the event or to vote with management's position. Payment
	 * is made to a third party who has solicited an entity to take part in the
	 * offer.<br>
	 * Also called consent fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
	 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SolicitationFee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFee";
			definition = "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
	 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EarlySolicitationFeeRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commission associated with a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#CorporateActionFeesAndCharges
	 * Commission.CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission associated with a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFeesAndCharges";
				definition = "The definition of all the charges related to a corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge,
						com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction, com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate, com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission);
			}
		});
		return mmObject_lazy.get();
	}
}