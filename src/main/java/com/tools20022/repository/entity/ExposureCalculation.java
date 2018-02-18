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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
 * ExposureCalculation.mmTotalExposedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentIndependentAmount
 * ExposureCalculation.mmCurrentIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
 * ExposureCalculation.mmCurrentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCollateralManagement
 * ExposureCalculation.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCounterpartyRisk
 * ExposureCalculation.mmCounterpartyRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTransactionRisk
 * ExposureCalculation.mmTransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralAfterHaircut
 * ExposureCalculation.mmTotalCollateralAfterHaircut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmRiskToCover
 * CollateralManagement.mmRiskToCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmVariationMarginRelatedRiskCalculation
 * CollateralBalance.mmVariationMarginRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmSegregatedIndependentAmountRelatedRiskCalculation
 * CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmRelatedRiskCalculation
 * IndependentAmount.mmRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmVariationMarginAmountRequirementCalculation
 * MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmSegregatedAmountRequirementCalculation
 * MarginAmountRequirement.mmSegregatedAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmExposureCalculation
 * CounterpartyRisk.mmExposureCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmExposureCalculation
 * TransactionRisk.mmExposureCalculation}</li>
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
	protected ActiveCurrencyAndAmount totalCollateralCurrentValue;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTotalCollateralCurrentValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralCurrentValue";
			definition = "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureCalculation.class.getMethod("getTotalCollateralCurrentValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount totalExposedAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTotalExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureCalculation.class.getMethod("getTotalExposedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.IndependentAmount> currentIndependentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmRelatedRiskCalculation
	 * IndependentAmount.mmRelatedRiskCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmCurrentIndependentAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentIndependentAmount";
			definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IndependentAmount.mmObject();
		}
	};
	protected CollateralBalance currentVariationMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmVariationMarginRelatedRiskCalculation
	 * CollateralBalance.mmVariationMarginRelatedRiskCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmCurrentVariationMargin = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentVariationMargin";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmVariationMarginRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};
	protected CollateralBalance currentSegregatedIndependentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmSegregatedIndependentAmountRelatedRiskCalculation
	 * CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmCurrentSegregatedIndependentAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSegregatedIndependentAmount";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarginAmountRequirement> variationMarginAmountRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmVariationMarginAmountRequirementCalculation
	 * MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmVariationMarginAmountRequirement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirement";
			definition = "Amount of expected margin required by any of the parties of the margin calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarginAmountRequirement> segregatedAmountRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmSegregatedAmountRequirementCalculation
	 * MarginAmountRequirement.mmSegregatedAmountRequirementCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmSegregatedAmountRequirement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirement";
			definition = "Margin requirements for the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmSegregatedAmountRequirementCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralManagement> collateralManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmRiskToCover
	 * CollateralManagement.mmRiskToCover}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Specifies the collateral management actions resulting from the calculation of the risk.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmRiskToCover;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CounterpartyRisk> counterpartyRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmExposureCalculation
	 * CounterpartyRisk.mmExposureCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmCounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmExposureCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TransactionRisk> transactionRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmExposureCalculation
	 * TransactionRisk.mmExposureCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmExposureCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalCollateralAfterHaircut;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTotalCollateralAfterHaircut = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralAfterHaircut";
			definition = "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureCalculation.class.getMethod("getTotalCollateralAfterHaircut", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureCalculation";
				definition = "Description of the calculation of the amounts representing the risk that needs to be covered, together with the calculation of the existing coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.mmRiskToCover, com.tools20022.repository.entity.CollateralBalance.mmVariationMarginRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation, com.tools20022.repository.entity.IndependentAmount.mmRelatedRiskCalculation,
						com.tools20022.repository.entity.MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.mmSegregatedAmountRequirementCalculation,
						com.tools20022.repository.entity.CounterpartyRisk.mmExposureCalculation, com.tools20022.repository.entity.TransactionRisk.mmExposureCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.mmTotalCollateralCurrentValue, com.tools20022.repository.entity.ExposureCalculation.mmTotalExposedAmount,
						com.tools20022.repository.entity.ExposureCalculation.mmCurrentIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.mmCurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.mmCurrentSegregatedIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.mmVariationMarginAmountRequirement,
						com.tools20022.repository.entity.ExposureCalculation.mmSegregatedAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.mmCollateralManagement,
						com.tools20022.repository.entity.ExposureCalculation.mmCounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.mmTransactionRisk,
						com.tools20022.repository.entity.ExposureCalculation.mmTotalCollateralAfterHaircut);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExposureCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTotalCollateralCurrentValue() {
		return totalCollateralCurrentValue;
	}

	public ExposureCalculation setTotalCollateralCurrentValue(ActiveCurrencyAndAmount totalCollateralCurrentValue) {
		this.totalCollateralCurrentValue = Objects.requireNonNull(totalCollateralCurrentValue);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalExposedAmount() {
		return totalExposedAmount;
	}

	public ExposureCalculation setTotalExposedAmount(ActiveCurrencyAndAmount totalExposedAmount) {
		this.totalExposedAmount = Objects.requireNonNull(totalExposedAmount);
		return this;
	}

	public List<IndependentAmount> getCurrentIndependentAmount() {
		return currentIndependentAmount == null ? currentIndependentAmount = new ArrayList<>() : currentIndependentAmount;
	}

	public ExposureCalculation setCurrentIndependentAmount(List<com.tools20022.repository.entity.IndependentAmount> currentIndependentAmount) {
		this.currentIndependentAmount = Objects.requireNonNull(currentIndependentAmount);
		return this;
	}

	public CollateralBalance getCurrentVariationMargin() {
		return currentVariationMargin;
	}

	public ExposureCalculation setCurrentVariationMargin(com.tools20022.repository.entity.CollateralBalance currentVariationMargin) {
		this.currentVariationMargin = Objects.requireNonNull(currentVariationMargin);
		return this;
	}

	public CollateralBalance getCurrentSegregatedIndependentAmount() {
		return currentSegregatedIndependentAmount;
	}

	public ExposureCalculation setCurrentSegregatedIndependentAmount(com.tools20022.repository.entity.CollateralBalance currentSegregatedIndependentAmount) {
		this.currentSegregatedIndependentAmount = Objects.requireNonNull(currentSegregatedIndependentAmount);
		return this;
	}

	public List<MarginAmountRequirement> getVariationMarginAmountRequirement() {
		return variationMarginAmountRequirement == null ? variationMarginAmountRequirement = new ArrayList<>() : variationMarginAmountRequirement;
	}

	public ExposureCalculation setVariationMarginAmountRequirement(List<com.tools20022.repository.entity.MarginAmountRequirement> variationMarginAmountRequirement) {
		this.variationMarginAmountRequirement = Objects.requireNonNull(variationMarginAmountRequirement);
		return this;
	}

	public List<MarginAmountRequirement> getSegregatedAmountRequirement() {
		return segregatedAmountRequirement == null ? segregatedAmountRequirement = new ArrayList<>() : segregatedAmountRequirement;
	}

	public ExposureCalculation setSegregatedAmountRequirement(List<com.tools20022.repository.entity.MarginAmountRequirement> segregatedAmountRequirement) {
		this.segregatedAmountRequirement = Objects.requireNonNull(segregatedAmountRequirement);
		return this;
	}

	public List<CollateralManagement> getCollateralManagement() {
		return collateralManagement == null ? collateralManagement = new ArrayList<>() : collateralManagement;
	}

	public ExposureCalculation setCollateralManagement(List<com.tools20022.repository.entity.CollateralManagement> collateralManagement) {
		this.collateralManagement = Objects.requireNonNull(collateralManagement);
		return this;
	}

	public List<CounterpartyRisk> getCounterpartyRisk() {
		return counterpartyRisk == null ? counterpartyRisk = new ArrayList<>() : counterpartyRisk;
	}

	public ExposureCalculation setCounterpartyRisk(List<com.tools20022.repository.entity.CounterpartyRisk> counterpartyRisk) {
		this.counterpartyRisk = Objects.requireNonNull(counterpartyRisk);
		return this;
	}

	public List<TransactionRisk> getTransactionRisk() {
		return transactionRisk == null ? transactionRisk = new ArrayList<>() : transactionRisk;
	}

	public ExposureCalculation setTransactionRisk(List<com.tools20022.repository.entity.TransactionRisk> transactionRisk) {
		this.transactionRisk = Objects.requireNonNull(transactionRisk);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalCollateralAfterHaircut() {
		return totalCollateralAfterHaircut;
	}

	public ExposureCalculation setTotalCollateralAfterHaircut(ActiveCurrencyAndAmount totalCollateralAfterHaircut) {
		this.totalCollateralAfterHaircut = Objects.requireNonNull(totalCollateralAfterHaircut);
		return this;
	}
}