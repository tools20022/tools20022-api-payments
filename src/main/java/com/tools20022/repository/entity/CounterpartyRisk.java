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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
 * CounterpartyRisk.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmExposedAmount
 * CounterpartyRisk.mmExposedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmExposureCalculation
 * CounterpartyRisk.mmExposureCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmCounterpartyRisk
 * Role.mmCounterpartyRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCounterpartyRisk
 * ExposureCalculation.mmCounterpartyRisk}</li>
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
 * "CounterpartyRisk"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk."
 * </li>
 * </ul>
 */
public class CounterpartyRisk {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Role party;
	/**
	 * Specifies which role played by a party was taken into consideration for
	 * the risk calculation, for instance clearing member role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmCounterpartyRisk
	 * Role.mmCounterpartyRisk}</li>
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
	public static final MMBusinessAssociationEnd mmParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Specifies which role played by a party was taken into consideration for the risk calculation, for instance clearing member role.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.mmCounterpartyRisk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount exposedAmount;
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
	public static final MMBusinessAttribute mmExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmount";
			definition = "The amount which needs to be covered for the counterparty risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CounterpartyRisk.class.getMethod("getExposedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExposureCalculation exposureCalculation;
	/**
	 * Specifies the exposure for which the risk is calculated on a counterparty
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCounterpartyRisk
	 * ExposureCalculation.mmCounterpartyRisk}</li>
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
	public static final MMBusinessAssociationEnd mmExposureCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureCalculation";
			definition = "Specifies the exposure for which the risk is calculated on a counterparty basis.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmCounterpartyRisk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartyRisk";
				definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmCounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.mmCounterpartyRisk);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CounterpartyRisk.mmParty, com.tools20022.repository.entity.CounterpartyRisk.mmExposedAmount,
						com.tools20022.repository.entity.CounterpartyRisk.mmExposureCalculation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CounterpartyRisk.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Role getParty() {
		return party;
	}

	public void setParty(com.tools20022.repository.entity.Role party) {
		this.party = party;
	}

	public ActiveCurrencyAndAmount getExposedAmount() {
		return exposedAmount;
	}

	public void setExposedAmount(ActiveCurrencyAndAmount exposedAmount) {
		this.exposedAmount = exposedAmount;
	}

	public ExposureCalculation getExposureCalculation() {
		return exposureCalculation;
	}

	public void setExposureCalculation(com.tools20022.repository.entity.ExposureCalculation exposureCalculation) {
		this.exposureCalculation = exposureCalculation;
	}
}