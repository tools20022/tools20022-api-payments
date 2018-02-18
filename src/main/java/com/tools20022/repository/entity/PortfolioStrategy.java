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
import com.tools20022.repository.codeset.DistributionPolicyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Rough allocation of the portfolio.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioStrategy" src="doc-files/PortfolioStrategy.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmPortfolio
 * PortfolioStrategy.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmInclusionIndicator
 * PortfolioStrategy.mmInclusionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmMinimumInvestmentAmount
 * PortfolioStrategy.mmMinimumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmMinimumInvestmentRate
 * PortfolioStrategy.mmMinimumInvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmMaximumInvestmentAmount
 * PortfolioStrategy.mmMaximumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmMaximumInvestmentRate
 * PortfolioStrategy.mmMaximumInvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmEffectivePeriod
 * PortfolioStrategy.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmDistributionPolicy
 * PortfolioStrategy.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmDescription
 * PortfolioStrategy.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#mmDefinition
 * PortfolioStrategy.mmDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmStrategy
 * Portfolio.mmStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategyDefinition#mmStrategy
 * PortfolioStrategyDefinition.mmStrategy}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.JurisdictionStrategy
 * JurisdictionStrategy}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationStrategy
 * OrganisationStrategy}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SectorStrategy
 * SectorStrategy}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassStrategy
 * AssetClassStrategy}</li>
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
 * "PortfolioStrategy"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rough allocation of the portfolio."</li>
 * </ul>
 */
public class PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Portfolio portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmStrategy
	 * Portfolio.mmStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio for which a strategy is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which a strategy is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmStrategy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected YesNoIndicator inclusionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InclusionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the referred strategy is included."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInclusionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InclusionIndicator";
			definition = "Indicates whether the referred strategy is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getInclusionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount minimumInvestmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount that has to be invested in the specified strategy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumInvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentAmount";
			definition = "Minimum amount that has to be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getMinimumInvestmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate minimumInvestmentRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum percentage that has to be invested in the specified strategy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumInvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentRate";
			definition = "Minimum percentage that has to be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getMinimumInvestmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount maximumInvestmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that may be invested in the specified strategy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumInvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentAmount";
			definition = "Maximum amount that may be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getMaximumInvestmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate maximumInvestmentRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumInvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum percentage that may be invested in the specified strategy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumInvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentRate";
			definition = "Maximum percentage that may be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getMaximumInvestmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the investment guideline is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the investment guideline is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getEffectivePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DistributionPolicyCode distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to the fund, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDistributionPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to the fund, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getDistributionPolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max2000Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free text description of the investment guideline, for example, rating requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the investment guideline, for example, rating requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioStrategy.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PortfolioStrategyDefinition definition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategyDefinition#mmStrategy
	 * PortfolioStrategyDefinition.mmStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategyDefinition
	 * PortfolioStrategyDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy
	 * PortfolioStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Definition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the portfolio strategy."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Definition";
			definition = "Definition of the portfolio strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategyDefinition.mmStrategy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioStrategyDefinition.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioStrategy";
				definition = "Rough allocation of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.mmStrategy, com.tools20022.repository.entity.PortfolioStrategyDefinition.mmStrategy);
				subType_lazy = () -> Arrays.asList(JurisdictionStrategy.mmObject(), OrganisationStrategy.mmObject(), SectorStrategy.mmObject(), AssetClassStrategy.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioStrategy.mmPortfolio, com.tools20022.repository.entity.PortfolioStrategy.mmInclusionIndicator,
						com.tools20022.repository.entity.PortfolioStrategy.mmMinimumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.mmMinimumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.mmMaximumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.mmMaximumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.mmEffectivePeriod, com.tools20022.repository.entity.PortfolioStrategy.mmDistributionPolicy, com.tools20022.repository.entity.PortfolioStrategy.mmDescription,
						com.tools20022.repository.entity.PortfolioStrategy.mmDefinition);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioStrategy.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Portfolio> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public PortfolioStrategy setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public YesNoIndicator getInclusionIndicator() {
		return inclusionIndicator;
	}

	public PortfolioStrategy setInclusionIndicator(YesNoIndicator inclusionIndicator) {
		this.inclusionIndicator = Objects.requireNonNull(inclusionIndicator);
		return this;
	}

	public CurrencyAndAmount getMinimumInvestmentAmount() {
		return minimumInvestmentAmount;
	}

	public PortfolioStrategy setMinimumInvestmentAmount(CurrencyAndAmount minimumInvestmentAmount) {
		this.minimumInvestmentAmount = Objects.requireNonNull(minimumInvestmentAmount);
		return this;
	}

	public PercentageRate getMinimumInvestmentRate() {
		return minimumInvestmentRate;
	}

	public PortfolioStrategy setMinimumInvestmentRate(PercentageRate minimumInvestmentRate) {
		this.minimumInvestmentRate = Objects.requireNonNull(minimumInvestmentRate);
		return this;
	}

	public CurrencyAndAmount getMaximumInvestmentAmount() {
		return maximumInvestmentAmount;
	}

	public PortfolioStrategy setMaximumInvestmentAmount(CurrencyAndAmount maximumInvestmentAmount) {
		this.maximumInvestmentAmount = Objects.requireNonNull(maximumInvestmentAmount);
		return this;
	}

	public PercentageRate getMaximumInvestmentRate() {
		return maximumInvestmentRate;
	}

	public PortfolioStrategy setMaximumInvestmentRate(PercentageRate maximumInvestmentRate) {
		this.maximumInvestmentRate = Objects.requireNonNull(maximumInvestmentRate);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public PortfolioStrategy setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return distributionPolicy;
	}

	public PortfolioStrategy setDistributionPolicy(DistributionPolicyCode distributionPolicy) {
		this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
		return this;
	}

	public Max2000Text getDescription() {
		return description;
	}

	public PortfolioStrategy setDescription(Max2000Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public PortfolioStrategyDefinition getDefinition() {
		return definition;
	}

	public PortfolioStrategy setDefinition(com.tools20022.repository.entity.PortfolioStrategyDefinition definition) {
		this.definition = Objects.requireNonNull(definition);
		return this;
	}
}