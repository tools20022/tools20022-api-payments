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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCommission
 * CorporateActionFeesAndCharges.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCorporateActionFeesAndCharges
 * Commission.mmCorporateActionFeesAndCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
 * CorporateActionEvent.mmCorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
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
 * "CorporateActionFeesAndCharges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of all the charges related to a corporate action event."</li>
 * </ul>
 */
public class CorporateActionFeesAndCharges extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent corporateAction;
	/**
	 * Corporate action for which fees and charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which fees and charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected RateAndAmount solicitationFee;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
	 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
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
	public static final MMBusinessAssociationEnd mmSolicitationFee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitationFee";
			definition = "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount earlySolicitationFeeRate;
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
	 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
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
	public static final MMBusinessAssociationEnd mmEarlySolicitationFeeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected Commission commission;
	/**
	 * Commission associated with a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCorporateActionFeesAndCharges
	 * Commission.mmCorporateActionFeesAndCharges}</li>
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
	public static final MMBusinessAssociationEnd mmCommission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmCorporateActionFeesAndCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFeesAndCharges";
				definition = "The definition of all the charges related to a corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.mmCorporateActionFeesAndCharges, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge,
						com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmSolicitationFee,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCommission);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionFeesAndCharges.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getCorporateAction() {
		return corporateAction;
	}

	public void setCorporateAction(com.tools20022.repository.entity.CorporateActionEvent corporateAction) {
		this.corporateAction = corporateAction;
	}

	public RateAndAmount getSolicitationFee() {
		return solicitationFee;
	}

	public void setSolicitationFee(com.tools20022.repository.entity.RateAndAmount solicitationFee) {
		this.solicitationFee = solicitationFee;
	}

	public RateAndAmount getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate;
	}

	public void setEarlySolicitationFeeRate(com.tools20022.repository.entity.RateAndAmount earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.entity.Commission commission) {
		this.commission = commission;
	}
}