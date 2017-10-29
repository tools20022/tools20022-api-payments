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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the calculation of the amounts representing the risk that
 * needs to be covered, together with the calculation of the existing coverage.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExposureCalculation" src="doc-files/ExposureCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalCollateralCurrentValue
 * ExposureCalculation.TotalCollateralCurrentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalExposedAmount
 * ExposureCalculation.TotalExposedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentIndependentAmount
 * ExposureCalculation.CurrentIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentVariationMargin
 * ExposureCalculation.CurrentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentSegregatedIndependentAmount
 * ExposureCalculation.CurrentSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#VariationMarginAmountRequirement
 * ExposureCalculation.VariationMarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#SegregatedAmountRequirement
 * ExposureCalculation.SegregatedAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CollateralManagement
 * ExposureCalculation.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CounterpartyRisk
 * ExposureCalculation.CounterpartyRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TransactionRisk
 * ExposureCalculation.TransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalCollateralAfterHaircut
 * ExposureCalculation.TotalCollateralAfterHaircut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#RiskToCover
 * CollateralManagement.RiskToCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#VariationMarginRelatedRiskCalculation
 * CollateralBalance.VariationMarginRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#SegregatedIndependentAmountRelatedRiskCalculation
 * CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#RelatedRiskCalculation
 * IndependentAmount.RelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#VariationMarginAmountRequirementCalculation
 * MarginAmountRequirement.VariationMarginAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#SegregatedAmountRequirementCalculation
 * MarginAmountRequirement.SegregatedAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#ExposureCalculation
 * CounterpartyRisk.ExposureCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#ExposureCalculation
 * TransactionRisk.ExposureCalculation}</li>
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
 * "ExposureCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the calculation of the amounts representing the risk that needs to be covered, together with the calculation of the existing coverage."
 * </li>
 * </ul>
 */
public class ExposureCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total value of the collateral derived from the sum of the current
	 * independent amounts and variation margins held, agreed and in transit.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateralCurrentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalCollateralCurrentValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralCurrentValue";
			definition = "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalExposedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalExposedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount applied as an add-on to the exposure usually intended to cover a
	 * possible increase in exposure before the next valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#RelatedRiskCalculation
	 * IndependentAmount.RelatedRiskCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrentIndependentAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentIndependentAmount";
			definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			type_lazy = () -> IndependentAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IndependentAmount.RelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides details about the collateral held, in transit or that still
	 * needs to be agreed by both parties, against the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#VariationMarginRelatedRiskCalculation
	 * CollateralBalance.VariationMarginRelatedRiskCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentVariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrentVariationMargin = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentVariationMargin";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the variation margin.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides details about the collateral held, in transit or that still
	 * needs to be agreed by both parties, against the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#SegregatedIndependentAmountRelatedRiskCalculation
	 * CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentSegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrentSegregatedIndependentAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSegregatedIndependentAmount";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of expected margin required by any of the parties of the margin
	 * calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#VariationMarginAmountRequirementCalculation
	 * MarginAmountRequirement.VariationMarginAmountRequirementCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAmountRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin required by any of the parties of the margin calculation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginAmountRequirement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirement";
			definition = "Amount of expected margin required by any of the parties of the margin calculation.";
			minOccurs = 0;
			type_lazy = () -> MarginAmountRequirement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Margin requirements for the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#SegregatedAmountRequirementCalculation
	 * MarginAmountRequirement.SegregatedAmountRequirementCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedAmountRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin requirements for the segregated independent amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SegregatedAmountRequirement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirement";
			definition = "Margin requirements for the segregated independent amount.";
			minOccurs = 0;
			type_lazy = () -> MarginAmountRequirement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral management actions resulting from the
	 * calculation of the risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#RiskToCover
	 * CollateralManagement.RiskToCover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral management actions resulting from the calculation of the risk."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Specifies the collateral management actions resulting from the calculation of the risk.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.RiskToCover;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the exposure amount that one party has vis-a-vis one
	 * counterparty or a central system, based on its credit risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#ExposureCalculation
	 * CounterpartyRisk.ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the exposure amount that one party has vis-a-vis one
	 * counterparty or a central system, based on the transactions that are not
	 * yet settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#ExposureCalculation
	 * TransactionRisk.ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.ExposureCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral currently received (+)/delivered (-) in the base currency.
	 * This amount is after the haircut has been applied.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateralAfterHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalCollateralAfterHaircut = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralAfterHaircut";
			definition = "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureCalculation";
				definition = "Description of the calculation of the amounts representing the risk that needs to be covered, together with the calculation of the existing coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.RiskToCover, com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation, com.tools20022.repository.entity.IndependentAmount.RelatedRiskCalculation,
						com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation,
						com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation, com.tools20022.repository.entity.TransactionRisk.ExposureCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.TotalCollateralCurrentValue, com.tools20022.repository.entity.ExposureCalculation.TotalExposedAmount,
						com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement,
						com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.CollateralManagement,
						com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.TransactionRisk,
						com.tools20022.repository.entity.ExposureCalculation.TotalCollateralAfterHaircut);
			}
		});
		return mmObject_lazy.get();
	}
}