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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Principal entity appointed by the fund to which orders should be submitted.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FundOrderDesk" src="doc-files/FundOrderDesk.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskIndicator
 * FundOrderDesk.mmMainFundOrderDeskIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskAccount
 * FundOrderDesk.mmMainFundOrderDeskAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountForInvestmentFundProcessing
 * InvestmentAccount.mmAccountForInvestmentFundProcessing}</li>
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
 * "FundOrderDesk"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Principal entity appointed by the fund to which orders should be submitted."
 * </li>
 * </ul>
 */
public class FundOrderDesk extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator mainFundOrderDeskIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk FundOrderDesk}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainFundOrderDeskIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FundOrderDesk, YesNoIndicator> mmMainFundOrderDeskIndicator = new MMBusinessAttribute<FundOrderDesk, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainFundOrderDeskIndicator";
			definition = "Indicates whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FundOrderDesk obj) {
			return obj.getMainFundOrderDeskIndicator();
		}

		@Override
		public void setValue(FundOrderDesk obj, YesNoIndicator value) {
			obj.setMainFundOrderDeskIndicator(value);
		}
	};
	protected List<InvestmentAccount> mainFundOrderDeskAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountForInvestmentFundProcessing
	 * InvestmentAccount.mmAccountForInvestmentFundProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk FundOrderDesk}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainFundOrderDeskAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement details for the main fund order desk as defined in the prospectus of the investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundOrderDesk, List<InvestmentAccount>> mmMainFundOrderDeskAccount = new MMBusinessAssociationEnd<FundOrderDesk, List<InvestmentAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainFundOrderDeskAccount";
			definition = "Settlement details for the main fund order desk as defined in the prospectus of the investment fund class.";
			minOccurs = 0;
			opposite_lazy = () -> InvestmentAccount.mmAccountForInvestmentFundProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public List<InvestmentAccount> getValue(FundOrderDesk obj) {
			return obj.getMainFundOrderDeskAccount();
		}

		@Override
		public void setValue(FundOrderDesk obj, List<InvestmentAccount> value) {
			obj.setMainFundOrderDeskAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderDesk";
				definition = "Principal entity appointed by the fund to which orders should be submitted.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentAccount.mmAccountForInvestmentFundProcessing);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskIndicator, com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundOrderDesk.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getMainFundOrderDeskIndicator() {
		return mainFundOrderDeskIndicator;
	}

	public FundOrderDesk setMainFundOrderDeskIndicator(YesNoIndicator mainFundOrderDeskIndicator) {
		this.mainFundOrderDeskIndicator = Objects.requireNonNull(mainFundOrderDeskIndicator);
		return this;
	}

	public List<InvestmentAccount> getMainFundOrderDeskAccount() {
		return mainFundOrderDeskAccount == null ? mainFundOrderDeskAccount = new ArrayList<>() : mainFundOrderDeskAccount;
	}

	public FundOrderDesk setMainFundOrderDeskAccount(List<InvestmentAccount> mainFundOrderDeskAccount) {
		this.mainFundOrderDeskAccount = Objects.requireNonNull(mainFundOrderDeskAccount);
		return this;
	}
}