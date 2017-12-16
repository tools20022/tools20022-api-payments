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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of the reinvestment of the income on the fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reinvestment" src="doc-files/Reinvestment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmRelatedinvestmentAccountService
 * Reinvestment.mmRelatedinvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
 * Reinvestment.mmInvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reinvestment#mmPercentage
 * Reinvestment.mmPercentage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmReinvestment
 * InvestmentFundClass.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
 * InvestmentAccountService.mmReinvestment}</li>
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
 * "Reinvestment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the reinvestment of the income on the fund."</li>
 * </ul>
 */
public class Reinvestment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccountService relatedinvestmentAccountService;
	/**
	 * Investment account services which include reinvestment information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
	 * InvestmentAccountService.mmReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedinvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services which include reinvestment information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedinvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedinvestmentAccountService";
			definition = "Investment account services which include reinvestment information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmReinvestment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected InvestmentFundClass investmentFundClass;
	/**
	 * Investment fund class which is the fund in which the income must be
	 * reinvested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmReinvestment
	 * InvestmentFundClass.mmReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class which is the fund in which the income must be reinvested."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class which is the fund in which the income must be reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmReinvestment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected PercentageRate percentage;
	/**
	 * Percentage on the income on the fund to be reinvested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage on the income on the fund to be reinvested."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Percentage on the income on the fund to be reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Reinvestment.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reinvestment";
				definition = "Parameters of the reinvestment of the income on the fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmReinvestment, com.tools20022.repository.entity.InvestmentAccountService.mmReinvestment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService, com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass,
						com.tools20022.repository.entity.Reinvestment.mmPercentage);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Reinvestment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountService getRelatedinvestmentAccountService() {
		return relatedinvestmentAccountService;
	}

	public void setRelatedinvestmentAccountService(com.tools20022.repository.entity.InvestmentAccountService relatedinvestmentAccountService) {
		this.relatedinvestmentAccountService = relatedinvestmentAccountService;
	}

	public InvestmentFundClass getInvestmentFundClass() {
		return investmentFundClass;
	}

	public void setInvestmentFundClass(com.tools20022.repository.entity.InvestmentFundClass investmentFundClass) {
		this.investmentFundClass = investmentFundClass;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}
}