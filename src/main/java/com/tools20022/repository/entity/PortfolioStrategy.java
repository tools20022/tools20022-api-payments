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
import com.tools20022.repository.codeset.DistributionPolicyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioStrategy#Portfolio
 * PortfolioStrategy.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#InclusionIndicator
 * PortfolioStrategy.InclusionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#MinimumInvestmentAmount
 * PortfolioStrategy.MinimumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#MinimumInvestmentRate
 * PortfolioStrategy.MinimumInvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#MaximumInvestmentAmount
 * PortfolioStrategy.MaximumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#MaximumInvestmentRate
 * PortfolioStrategy.MaximumInvestmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#EffectivePeriod
 * PortfolioStrategy.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#DistributionPolicy
 * PortfolioStrategy.DistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#Description
 * PortfolioStrategy.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategy#Definition
 * PortfolioStrategy.Definition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Strategy
 * Portfolio.Strategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioStrategyDefinition#Strategy
 * PortfolioStrategyDefinition.Strategy}</li>
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
	/**
	 * Portfolio for which a strategy is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Strategy
	 * Portfolio.Strategy}</li>
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
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which a strategy is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the referred strategy is included.
	 * <p>
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
	public static final MMBusinessAttribute InclusionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InclusionIndicator";
			definition = "Indicates whether the referred strategy is included.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum amount that has to be invested in the specified strategy.
	 * <p>
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
	public static final MMBusinessAttribute MinimumInvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentAmount";
			definition = "Minimum amount that has to be invested in the specified strategy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum percentage that has to be invested in the specified strategy.
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
	public static final MMBusinessAttribute MinimumInvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentRate";
			definition = "Minimum percentage that has to be invested in the specified strategy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum amount that may be invested in the specified strategy.
	 * <p>
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
	public static final MMBusinessAttribute MaximumInvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentAmount";
			definition = "Maximum amount that may be invested in the specified strategy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum percentage that may be invested in the specified strategy.
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
	public static final MMBusinessAttribute MaximumInvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentRate";
			definition = "Maximum percentage that may be invested in the specified strategy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Period during which the investment guideline is valid.
	 * <p>
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
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the investment guideline is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Income policy relating to the fund, ie, if income is paid out or retained
	 * in the fund.
	 * <p>
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
	public static final MMBusinessAttribute DistributionPolicy = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to the fund, ie, if income is paid out or retained in the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Free text description of the investment guideline, for example, rating
	 * requirements.
	 * <p>
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
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the investment guideline, for example, rating requirements.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	/**
	 * Definition of the portfolio strategy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioStrategyDefinition#Strategy
	 * PortfolioStrategyDefinition.Strategy}</li>
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
	public static final MMBusinessAssociationEnd Definition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Definition";
			definition = "Definition of the portfolio strategy.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PortfolioStrategyDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategyDefinition.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioStrategy";
				definition = "Rough allocation of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Strategy, com.tools20022.repository.entity.PortfolioStrategyDefinition.Strategy);
				subType_lazy = () -> Arrays.asList(JurisdictionStrategy.mmObject(), OrganisationStrategy.mmObject(), SectorStrategy.mmObject(), AssetClassStrategy.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioStrategy.Portfolio, com.tools20022.repository.entity.PortfolioStrategy.InclusionIndicator,
						com.tools20022.repository.entity.PortfolioStrategy.MinimumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.MinimumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.MaximumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.MaximumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.EffectivePeriod, com.tools20022.repository.entity.PortfolioStrategy.DistributionPolicy, com.tools20022.repository.entity.PortfolioStrategy.Description,
						com.tools20022.repository.entity.PortfolioStrategy.Definition);
			}
		});
		return mmObject_lazy.get();
	}
}