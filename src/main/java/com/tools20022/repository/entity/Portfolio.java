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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Wrapper for a specific product or a specific sub-product owned by a set of
 * beneficial owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Portfolio" src="doc-files/Portfolio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Valuation
 * Portfolio.Valuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Transfer
 * Portfolio.Transfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#AssetDescription
 * Portfolio.AssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Name
 * Portfolio.Name}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Identification
 * Portfolio.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Strategy
 * Portfolio.Strategy}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Benchmark
 * Portfolio.Benchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#InvestmentPlan
 * Portfolio.InvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Account
 * Portfolio.Account}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Portfolio
 * Asset.Portfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount#Portfolio
 * InvestmentAccount.Portfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Portfolio
 * InvestmentPlan.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredPortfolio
 * PortfolioTransfer.TransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#Portfolio
 * PortfolioValuation.Portfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioStrategy#Portfolio
 * PortfolioStrategy.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Portfolio
 * PortfolioBenchmark.Portfolio}</li>
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
 * "Portfolio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners."
 * </li>
 * </ul>
 */
public class Portfolio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Valuation process for the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#Portfolio
	 * PortfolioValuation.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation process for the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Valuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process for the portfolio.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer information related to a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredPortfolio
	 * PortfolioTransfer.TransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer information related to a portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Transfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transfer";
			definition = "Transfer information related to a portfolio.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the assets included in the portfolio together with their value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#Portfolio
	 * Asset.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the assets included in the portfolio together with their value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetDescription = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetDescription";
			definition = "Specifies the assets included in the portfolio together with their value.";
			minOccurs = 0;
			type_lazy = () -> Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name of the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identification of the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Strategy set for the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#Portfolio
	 * PortfolioStrategy.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy set for the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy set for the portfolio.";
			minOccurs = 1;
			type_lazy = () -> PortfolioStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the benchmark set for the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Portfolio
	 * PortfolioBenchmark.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Benchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the benchmark set for the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Benchmark = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Information on the benchmark set for the portfolio.";
			minOccurs = 1;
			type_lazy = () -> PortfolioBenchmark.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment plan associated with a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Portfolio
	 * InvestmentPlan.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan associated with a portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan associated with a portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account on which the portfolio is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#Portfolio
	 * InvestmentAccount.Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Portfolio
	 * Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the portfolio is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Portfolio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account on which the portfolio is held.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Portfolio";
				definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Portfolio, com.tools20022.repository.entity.InvestmentAccount.Portfolio, com.tools20022.repository.entity.InvestmentPlan.Portfolio,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio, com.tools20022.repository.entity.PortfolioValuation.Portfolio, com.tools20022.repository.entity.PortfolioStrategy.Portfolio,
						com.tools20022.repository.entity.PortfolioBenchmark.Portfolio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Valuation, com.tools20022.repository.entity.Portfolio.Transfer, com.tools20022.repository.entity.Portfolio.AssetDescription,
						com.tools20022.repository.entity.Portfolio.Name, com.tools20022.repository.entity.Portfolio.Identification, com.tools20022.repository.entity.Portfolio.Strategy, com.tools20022.repository.entity.Portfolio.Benchmark,
						com.tools20022.repository.entity.Portfolio.InvestmentPlan, com.tools20022.repository.entity.Portfolio.Account);
			}
		});
		return mmObject_lazy.get();
	}
}