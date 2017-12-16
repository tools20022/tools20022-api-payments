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
import java.util.List;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on the transactions that are not yet
 * settled.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransactionRisk" src="doc-files/TransactionRisk.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
 * TransactionRisk.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmExposedAmount
 * TransactionRisk.mmExposedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmExposureCalculation
 * TransactionRisk.mmExposureCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmTransactionRisk
 * Obligation.mmTransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTransactionRisk
 * ExposureCalculation.mmTransactionRisk}</li>
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
 * "TransactionRisk"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled."
 * </li>
 * </ul>
 */
public class TransactionRisk {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Obligation> obligation;
	/**
	 * Specifies the obligations used to calculate the transaction risk.<br>
	 * Specifies the quantity of securities and/or the cash amounts that have to
	 * be taken into account to calculate the exposure of one trading party
	 * versus one of its counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmTransactionRisk
	 * Obligation.mmTransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligations used to calculate the transaction risk.\r\nSpecifies the quantity of securities and/or the cash amounts that have to be taken into account to calculate the exposure of one trading party versus one of its counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligations used to calculate the transaction risk.\r\nSpecifies the quantity of securities and/or the cash amounts that have to be taken into account to calculate the exposure of one trading party versus one of its counterparties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmTransactionRisk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount exposedAmount;
	/**
	 * The sum of the exposures of all transactions which are in favour of a
	 * Party. That is, all transactions which would have an amount payable by
	 * the counterparty if they were being terminated.
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
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransactionRisk.class.getMethod("getExposedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExposureCalculation exposureCalculation;
	/**
	 * Specifies the exposure for which the risk is calculated on a transaction
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTransactionRisk
	 * ExposureCalculation.mmTransactionRisk}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exposure for which the risk is calculated on a transaction basis."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExposureCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureCalculation";
			definition = "Specifies the exposure for which the risk is calculated on a transaction basis.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmTransactionRisk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionRisk";
				definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.mmTransactionRisk, com.tools20022.repository.entity.ExposureCalculation.mmTransactionRisk);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionRisk.mmObligation, com.tools20022.repository.entity.TransactionRisk.mmExposedAmount,
						com.tools20022.repository.entity.TransactionRisk.mmExposureCalculation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransactionRisk.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Obligation> getObligation() {
		return obligation;
	}

	public void setObligation(List<com.tools20022.repository.entity.Obligation> obligation) {
		this.obligation = obligation;
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