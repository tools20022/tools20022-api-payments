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
 * Assets posted by participants in a clearing fund that can be used in the
 * event of a default by a participant to compensate non-defaulting participants
 * for losses they suffer due to this default.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DefaultFund" src="doc-files/DefaultFund.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DefaultFund#mmTotalAmount
 * DefaultFund.mmTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DefaultFund#mmContribution
 * DefaultFund.mmContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmClearingSystem
 * DefaultFund.mmClearingSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmDefaultFund
 * ClearingSystem.mmDefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmDefaultFund
 * DefaultFundContribution.mmDefaultFund}</li>
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
 * "DefaultFund"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default."
 * </li>
 * </ul>
 */
public class DefaultFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount totalAmount;
	/**
	 * Total amount required by the Clearing Member to participate to the
	 * Default Fund.
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
	 * {@linkplain com.tools20022.repository.entity.DefaultFund DefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount required by the Clearing Member to participate to the Default Fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount required by the Clearing Member to participate to the Default Fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFund.class.getMethod("getTotalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DefaultFundContribution contribution;
	/**
	 * Contribution information for a default fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmDefaultFund
	 * DefaultFundContribution.mmDefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund DefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contribution information for a default fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmContribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contribution";
			definition = "Contribution information for a default fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmDefaultFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	protected ClearingSystem clearingSystem;
	/**
	 * Clearing system for which assets are posted by participants in the
	 * default fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmDefaultFund
	 * ClearingSystem.mmDefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund DefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing system for which assets are posted by participants in the default fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Clearing system for which assets are posted by participants in the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmDefaultFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultFund";
				definition = "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.mmDefaultFund, com.tools20022.repository.entity.DefaultFundContribution.mmDefaultFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DefaultFund.mmTotalAmount, com.tools20022.repository.entity.DefaultFund.mmContribution, com.tools20022.repository.entity.DefaultFund.mmClearingSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DefaultFund.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(ActiveCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	public DefaultFundContribution getContribution() {
		return contribution;
	}

	public void setContribution(com.tools20022.repository.entity.DefaultFundContribution contribution) {
		this.contribution = contribution;
	}

	public ClearingSystem getClearingSystem() {
		return clearingSystem;
	}

	public void setClearingSystem(com.tools20022.repository.entity.ClearingSystem clearingSystem) {
		this.clearingSystem = clearingSystem;
	}
}