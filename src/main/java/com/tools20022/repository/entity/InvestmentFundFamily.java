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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Group of investment funds under the same fund management company.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundFamily" src="doc-files/InvestmentFundFamily.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmFundFamilyName
 * InvestmentFundFamily.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmInvestmentFund
 * InvestmentFundFamily.mmInvestmentFund}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmFamily
 * InvestmentFund.mmFamily}</li>
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
 * "InvestmentFundFamily"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Group of investment funds under the same fund management company."</li>
 * </ul>
 */
public class InvestmentFundFamily {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text fundFamilyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily
	 * InvestmentFundFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundFamilyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the investment fund family."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundFamily, Max350Text> mmFundFamilyName = new MMBusinessAttribute<InvestmentFundFamily, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(InvestmentFundFamily obj) {
			return obj.getFundFamilyName();
		}

		@Override
		public void setValue(InvestmentFundFamily obj, Max350Text value) {
			obj.setFundFamilyName(value);
		}
	};
	protected List<InvestmentFund> investmentFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmFamily
	 * InvestmentFund.mmFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily
	 * InvestmentFundFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pool of financial instruments managed by a professional asset manager and belonging to one or several investment fund families that are part of the same investment fund network."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundFamily, List<InvestmentFund>> mmInvestmentFund = new MMBusinessAssociationEnd<InvestmentFundFamily, List<InvestmentFund>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Pool of financial instruments managed by a professional asset manager and belonging to one or several investment fund families that are part of the same investment fund network.";
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFund.mmFamily;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFund.mmObject();
		}

		@Override
		public List<InvestmentFund> getValue(InvestmentFundFamily obj) {
			return obj.getInvestmentFund();
		}

		@Override
		public void setValue(InvestmentFundFamily obj, List<InvestmentFund> value) {
			obj.setInvestmentFund(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundFamily";
				definition = "Group of investment funds under the same fund management company.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentFund.mmFamily);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundFamily.mmFundFamilyName, com.tools20022.repository.entity.InvestmentFundFamily.mmInvestmentFund);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundFamily.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getFundFamilyName() {
		return fundFamilyName;
	}

	public InvestmentFundFamily setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = Objects.requireNonNull(fundFamilyName);
		return this;
	}

	public List<InvestmentFund> getInvestmentFund() {
		return investmentFund == null ? investmentFund = new ArrayList<>() : investmentFund;
	}

	public InvestmentFundFamily setInvestmentFund(List<InvestmentFund> investmentFund) {
		this.investmentFund = Objects.requireNonNull(investmentFund);
		return this;
	}
}