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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmValuation
 * Portfolio.mmValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
 * Portfolio.mmTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAssetDescription
 * Portfolio.mmAssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmName
 * Portfolio.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmIdentification
 * Portfolio.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmStrategy
 * Portfolio.mmStrategy}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmBenchmark
 * Portfolio.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmInvestmentPlan
 * Portfolio.mmInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmAccount
 * Portfolio.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmPortfolio
 * Asset.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmPortfolio
 * InvestmentAccount.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmPortfolio
 * InvestmentPlan.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
 * PortfolioTransfer.mmTransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmPortfolio
 * PortfolioValuation.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmPortfolio
 * PortfolioStrategy.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmPortfolio
 * PortfolioBenchmark.mmPortfolio}</li>
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
	protected PortfolioValuation valuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmPortfolio
	 * PortfolioValuation.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, Optional<PortfolioValuation>> mmValuation = new MMBusinessAssociationEnd<Portfolio, Optional<PortfolioValuation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PortfolioValuation.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioValuation.mmObject();
		}

		@Override
		public Optional<PortfolioValuation> getValue(Portfolio obj) {
			return obj.getValuation();
		}

		@Override
		public void setValue(Portfolio obj, Optional<PortfolioValuation> value) {
			obj.setValuation(value.orElse(null));
		}
	};
	protected PortfolioTransfer transfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, Optional<PortfolioTransfer>> mmTransfer = new MMBusinessAssociationEnd<Portfolio, Optional<PortfolioTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transfer";
			definition = "Transfer information related to a portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}

		@Override
		public Optional<PortfolioTransfer> getValue(Portfolio obj) {
			return obj.getTransfer();
		}

		@Override
		public void setValue(Portfolio obj, Optional<PortfolioTransfer> value) {
			obj.setTransfer(value.orElse(null));
		}
	};
	protected List<Asset> assetDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmPortfolio
	 * Asset.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, List<Asset>> mmAssetDescription = new MMBusinessAssociationEnd<Portfolio, List<Asset>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetDescription";
			definition = "Specifies the assets included in the portfolio together with their value.";
			minOccurs = 0;
			opposite_lazy = () -> Asset.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public List<Asset> getValue(Portfolio obj) {
			return obj.getAssetDescription();
		}

		@Override
		public void setValue(Portfolio obj, List<Asset> value) {
			obj.setAssetDescription(value);
		}
	};
	protected Max350Text name;
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
	public static final MMBusinessAttribute<Portfolio, Max350Text> mmName = new MMBusinessAttribute<Portfolio, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Portfolio obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Portfolio obj, Max350Text value) {
			obj.setName(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Portfolio, Max35Text> mmIdentification = new MMBusinessAttribute<Portfolio, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Portfolio obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Portfolio obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<PortfolioStrategy> strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmPortfolio
	 * PortfolioStrategy.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, List<PortfolioStrategy>> mmStrategy = new MMBusinessAssociationEnd<Portfolio, List<PortfolioStrategy>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy set for the portfolio.";
			minOccurs = 1;
			opposite_lazy = () -> PortfolioStrategy.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioStrategy.mmObject();
		}

		@Override
		public List<PortfolioStrategy> getValue(Portfolio obj) {
			return obj.getStrategy();
		}

		@Override
		public void setValue(Portfolio obj, List<PortfolioStrategy> value) {
			obj.setStrategy(value);
		}
	};
	protected List<PortfolioBenchmark> benchmark;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmPortfolio
	 * PortfolioBenchmark.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, List<PortfolioBenchmark>> mmBenchmark = new MMBusinessAssociationEnd<Portfolio, List<PortfolioBenchmark>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Information on the benchmark set for the portfolio.";
			minOccurs = 1;
			opposite_lazy = () -> PortfolioBenchmark.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioBenchmark.mmObject();
		}

		@Override
		public List<PortfolioBenchmark> getValue(Portfolio obj) {
			return obj.getBenchmark();
		}

		@Override
		public void setValue(Portfolio obj, List<PortfolioBenchmark> value) {
			obj.setBenchmark(value);
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmPortfolio
	 * InvestmentPlan.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, InvestmentPlan> mmInvestmentPlan = new MMBusinessAssociationEnd<Portfolio, InvestmentPlan>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan associated with a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentPlan.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}

		@Override
		public InvestmentPlan getValue(Portfolio obj) {
			return obj.getInvestmentPlan();
		}

		@Override
		public void setValue(Portfolio obj, InvestmentPlan value) {
			obj.setInvestmentPlan(value);
		}
	};
	protected InvestmentAccount account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmPortfolio
	 * InvestmentAccount.mmPortfolio}</li>
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
	public static final MMBusinessAssociationEnd<Portfolio, InvestmentAccount> mmAccount = new MMBusinessAssociationEnd<Portfolio, InvestmentAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account on which the portfolio is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccount.mmPortfolio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public InvestmentAccount getValue(Portfolio obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Portfolio obj, InvestmentAccount value) {
			obj.setAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Portfolio";
				definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmPortfolio, InvestmentAccount.mmPortfolio, InvestmentPlan.mmPortfolio, PortfolioTransfer.mmTransferredPortfolio, PortfolioValuation.mmPortfolio,
						PortfolioStrategy.mmPortfolio, PortfolioBenchmark.mmPortfolio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.mmValuation, com.tools20022.repository.entity.Portfolio.mmTransfer, com.tools20022.repository.entity.Portfolio.mmAssetDescription,
						com.tools20022.repository.entity.Portfolio.mmName, com.tools20022.repository.entity.Portfolio.mmIdentification, com.tools20022.repository.entity.Portfolio.mmStrategy,
						com.tools20022.repository.entity.Portfolio.mmBenchmark, com.tools20022.repository.entity.Portfolio.mmInvestmentPlan, com.tools20022.repository.entity.Portfolio.mmAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Portfolio.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PortfolioValuation> getValuation() {
		return valuation == null ? Optional.empty() : Optional.of(valuation);
	}

	public Portfolio setValuation(PortfolioValuation valuation) {
		this.valuation = valuation;
		return this;
	}

	public Optional<PortfolioTransfer> getTransfer() {
		return transfer == null ? Optional.empty() : Optional.of(transfer);
	}

	public Portfolio setTransfer(PortfolioTransfer transfer) {
		this.transfer = transfer;
		return this;
	}

	public List<Asset> getAssetDescription() {
		return assetDescription == null ? assetDescription = new ArrayList<>() : assetDescription;
	}

	public Portfolio setAssetDescription(List<Asset> assetDescription) {
		this.assetDescription = Objects.requireNonNull(assetDescription);
		return this;
	}

	public Max350Text getName() {
		return name;
	}

	public Portfolio setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Portfolio setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<PortfolioStrategy> getStrategy() {
		return strategy == null ? strategy = new ArrayList<>() : strategy;
	}

	public Portfolio setStrategy(List<PortfolioStrategy> strategy) {
		this.strategy = Objects.requireNonNull(strategy);
		return this;
	}

	public List<PortfolioBenchmark> getBenchmark() {
		return benchmark == null ? benchmark = new ArrayList<>() : benchmark;
	}

	public Portfolio setBenchmark(List<PortfolioBenchmark> benchmark) {
		this.benchmark = Objects.requireNonNull(benchmark);
		return this;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public Portfolio setInvestmentPlan(InvestmentPlan investmentPlan) {
		this.investmentPlan = Objects.requireNonNull(investmentPlan);
		return this;
	}

	public InvestmentAccount getAccount() {
		return account;
	}

	public Portfolio setAccount(InvestmentAccount account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}
}