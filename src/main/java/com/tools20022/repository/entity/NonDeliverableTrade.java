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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Foreign exchange contract where one of the exchanged amounts is specified in
 * a non-deliverable currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NonDeliverableTrade" src="doc-files/NonDeliverableTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#SettlementCurrency
 * NonDeliverableTrade.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#FixingConditions
 * NonDeliverableTrade.FixingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#OpeningLeg
 * NonDeliverableTrade.OpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#ClosingLeg
 * NonDeliverableTrade.ClosingLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#OpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#NonDeliverableTrade
 * FixingCondition.NonDeliverableTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
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
 * "NonDeliverableTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Foreign exchange contract where one of the exchanged amounts is specified in a non-deliverable currency."
 * </li>
 * </ul>
 */
public class NonDeliverableTrade extends ForeignExchangeTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency in which a non-deliverable contract is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a non-deliverable contract is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which a non-deliverable contract is settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Set of parameters used to calculate a rate for instance the fixing rate
	 * to be applied to a non-deliverable agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#NonDeliverableTrade
	 * FixingCondition.NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FixingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FixingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the opening leg of a non deliverable trade in which the forward
	 * rate and amount are specified together with the fixing conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#OpeningLegRelatedNonDeliverableTrade
	 * ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the opening leg of a non deliverable trade in which the forward rate and amount are specified together with the fixing conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OpeningLeg = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLeg";
			definition = "Specifies the opening leg of a non deliverable trade in which the forward rate and amount are specified together with the fixing conditions.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the closing leg of a non deliverable trade in which the amount
	 * to be settled is the difference in the deliverable currency betweem its
	 * original value and the countervalue calculated against the fixing rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ClosingLegRelatedNonDeliverableTrade
	 * ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the closing leg of a non deliverable trade in which the amount to be settled is the difference in the deliverable currency betweem its original value and the countervalue calculated against the fixing rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosingLeg = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLeg";
			definition = "Specifies the closing leg of a non deliverable trade in which the amount to be settled is the difference in the deliverable currency betweem its original value and the countervalue calculated against the fixing rate.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableTrade";
				definition = "Foreign exchange contract where one of the exchanged amounts is specified in a non-deliverable currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade);
				superType_lazy = () -> ForeignExchangeTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NonDeliverableTrade.SettlementCurrency, com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions,
						com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg);
			}
		});
		return mmObject_lazy.get();
	}
}