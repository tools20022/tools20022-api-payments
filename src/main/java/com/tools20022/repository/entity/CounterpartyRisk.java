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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on its credit risk.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CounterpartyRisk" src="doc-files/CounterpartyRisk.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#Party
 * CounterpartyRisk.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#ExposedAmount
 * CounterpartyRisk.ExposedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#ExposureCalculation
 * CounterpartyRisk.ExposureCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#CounterpartyRisk
 * Role.CounterpartyRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CounterpartyRisk
 * ExposureCalculation.CounterpartyRisk}</li>
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
 * "CounterpartyRisk"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk."
 * </li>
 * </ul>
 */
public class CounterpartyRisk {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies which role played by a party was taken into consideration for
	 * the risk calculation, for instance clearing member role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Role#CounterpartyRisk
	 * Role.CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which role played by a party was taken into consideration for the risk calculation, for instance clearing member role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Party = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Specifies which role played by a party was taken into consideration for the risk calculation, for instance clearing member role.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Role.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Role.CounterpartyRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The amount which needs to be covered for the counterparty risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The amount which needs to be covered for the counterparty risk."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExposedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmount";
			definition = "The amount which needs to be covered for the counterparty risk.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exposure for which the risk is calculated on a counterparty
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CounterpartyRisk
	 * ExposureCalculation.CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exposure for which the risk is calculated on a counterparty basis."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExposureCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureCalculation";
			definition = "Specifies the exposure for which the risk is calculated on a counterparty basis.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CounterpartyRisk";
				definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.CounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CounterpartyRisk.Party, com.tools20022.repository.entity.CounterpartyRisk.ExposedAmount,
						com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}