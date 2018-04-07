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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
	protected CurrencyAndAmount totalCollateralCurrentValue;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateralCurrentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount> mmTotalCollateralCurrentValue = new MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalCollateralCurrentValue";
			definition = "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExposureCalculation obj) {
			return obj.getTotalCollateralCurrentValue();
		}

		@Override
		public void setValue(ExposureCalculation obj, CurrencyAndAmount value) {
			obj.setTotalCollateralCurrentValue(value);
		}
	};
	protected CurrencyAndAmount totalExposedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalExposedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount> mmTotalExposedAmount = new MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExposureCalculation obj) {
			return obj.getTotalExposedAmount();
		}

		@Override
		public void setValue(ExposureCalculation obj, CurrencyAndAmount value) {
			obj.setTotalExposedAmount(value);
		}
	};
	protected List<IndependentAmount> currentIndependentAmount;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<IndependentAmount>> mmCurrentIndependentAmount = new MMBusinessAssociationEnd<ExposureCalculation, List<IndependentAmount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentIndependentAmount";
			definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			opposite_lazy = () -> IndependentAmount.mmRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> IndependentAmount.mmObject();
		}

		@Override
		public List<IndependentAmount> getValue(ExposureCalculation obj) {
			return obj.getCurrentIndependentAmount();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<IndependentAmount> value) {
			obj.setCurrentIndependentAmount(value);
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, CollateralBalance> mmCurrentVariationMargin = new MMBusinessAssociationEnd<ExposureCalculation, CollateralBalance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentVariationMargin";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralBalance.mmVariationMarginRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}

		@Override
		public CollateralBalance getValue(ExposureCalculation obj) {
			return obj.getCurrentVariationMargin();
		}

		@Override
		public void setValue(ExposureCalculation obj, CollateralBalance value) {
			obj.setCurrentVariationMargin(value);
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, CollateralBalance> mmCurrentSegregatedIndependentAmount = new MMBusinessAssociationEnd<ExposureCalculation, CollateralBalance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSegregatedIndependentAmount";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}

		@Override
		public CollateralBalance getValue(ExposureCalculation obj) {
			return obj.getCurrentSegregatedIndependentAmount();
		}

		@Override
		public void setValue(ExposureCalculation obj, CollateralBalance value) {
			obj.setCurrentSegregatedIndependentAmount(value);
		}
	};
	protected List<MarginAmountRequirement> variationMarginAmountRequirement;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<MarginAmountRequirement>> mmVariationMarginAmountRequirement = new MMBusinessAssociationEnd<ExposureCalculation, List<MarginAmountRequirement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirement";
			definition = "Amount of expected margin required by any of the parties of the margin calculation.";
			minOccurs = 0;
			opposite_lazy = () -> MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginAmountRequirement.mmObject();
		}

		@Override
		public List<MarginAmountRequirement> getValue(ExposureCalculation obj) {
			return obj.getVariationMarginAmountRequirement();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<MarginAmountRequirement> value) {
			obj.setVariationMarginAmountRequirement(value);
		}
	};
	protected List<MarginAmountRequirement> segregatedAmountRequirement;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<MarginAmountRequirement>> mmSegregatedAmountRequirement = new MMBusinessAssociationEnd<ExposureCalculation, List<MarginAmountRequirement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirement";
			definition = "Margin requirements for the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> MarginAmountRequirement.mmSegregatedAmountRequirementCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginAmountRequirement.mmObject();
		}

		@Override
		public List<MarginAmountRequirement> getValue(ExposureCalculation obj) {
			return obj.getSegregatedAmountRequirement();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<MarginAmountRequirement> value) {
			obj.setSegregatedAmountRequirement(value);
		}
	};
	protected List<CollateralManagement> collateralManagement;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<CollateralManagement>> mmCollateralManagement = new MMBusinessAssociationEnd<ExposureCalculation, List<CollateralManagement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Specifies the collateral management actions resulting from the calculation of the risk.";
			minOccurs = 0;
			opposite_lazy = () -> CollateralManagement.mmRiskToCover;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public List<CollateralManagement> getValue(ExposureCalculation obj) {
			return obj.getCollateralManagement();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<CollateralManagement> value) {
			obj.setCollateralManagement(value);
		}
	};
	protected List<CounterpartyRisk> counterpartyRisk;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<CounterpartyRisk>> mmCounterpartyRisk = new MMBusinessAssociationEnd<ExposureCalculation, List<CounterpartyRisk>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
			minOccurs = 0;
			opposite_lazy = () -> CounterpartyRisk.mmExposureCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CounterpartyRisk.mmObject();
		}

		@Override
		public List<CounterpartyRisk> getValue(ExposureCalculation obj) {
			return obj.getCounterpartyRisk();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<CounterpartyRisk> value) {
			obj.setCounterpartyRisk(value);
		}
	};
	protected List<TransactionRisk> transactionRisk;
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
	public static final MMBusinessAssociationEnd<ExposureCalculation, List<TransactionRisk>> mmTransactionRisk = new MMBusinessAssociationEnd<ExposureCalculation, List<TransactionRisk>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
			minOccurs = 0;
			opposite_lazy = () -> TransactionRisk.mmExposureCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransactionRisk.mmObject();
		}

		@Override
		public List<TransactionRisk> getValue(ExposureCalculation obj) {
			return obj.getTransactionRisk();
		}

		@Override
		public void setValue(ExposureCalculation obj, List<TransactionRisk> value) {
			obj.setTransactionRisk(value);
		}
	};
	protected CurrencyAndAmount totalCollateralAfterHaircut;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateralAfterHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount> mmTotalCollateralAfterHaircut = new MMBusinessAttribute<ExposureCalculation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalCollateralAfterHaircut";
			definition = "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExposureCalculation obj) {
			return obj.getTotalCollateralAfterHaircut();
		}

		@Override
		public void setValue(ExposureCalculation obj, CurrencyAndAmount value) {
			obj.setTotalCollateralAfterHaircut(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureCalculation";
				definition = "Description of the calculation of the amounts representing the risk that needs to be covered, together with the calculation of the existing coverage.";
				associationDomain_lazy = () -> Arrays.asList(CollateralManagement.mmRiskToCover, CollateralBalance.mmVariationMarginRelatedRiskCalculation, CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation,
						IndependentAmount.mmRelatedRiskCalculation, MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation, MarginAmountRequirement.mmSegregatedAmountRequirementCalculation,
						CounterpartyRisk.mmExposureCalculation, TransactionRisk.mmExposureCalculation);
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

	public CurrencyAndAmount getTotalCollateralCurrentValue() {
		return totalCollateralCurrentValue;
	}

	public ExposureCalculation setTotalCollateralCurrentValue(CurrencyAndAmount totalCollateralCurrentValue) {
		this.totalCollateralCurrentValue = Objects.requireNonNull(totalCollateralCurrentValue);
		return this;
	}

	public CurrencyAndAmount getTotalExposedAmount() {
		return totalExposedAmount;
	}

	public ExposureCalculation setTotalExposedAmount(CurrencyAndAmount totalExposedAmount) {
		this.totalExposedAmount = Objects.requireNonNull(totalExposedAmount);
		return this;
	}

	public List<IndependentAmount> getCurrentIndependentAmount() {
		return currentIndependentAmount == null ? currentIndependentAmount = new ArrayList<>() : currentIndependentAmount;
	}

	public ExposureCalculation setCurrentIndependentAmount(List<IndependentAmount> currentIndependentAmount) {
		this.currentIndependentAmount = Objects.requireNonNull(currentIndependentAmount);
		return this;
	}

	public CollateralBalance getCurrentVariationMargin() {
		return currentVariationMargin;
	}

	public ExposureCalculation setCurrentVariationMargin(CollateralBalance currentVariationMargin) {
		this.currentVariationMargin = Objects.requireNonNull(currentVariationMargin);
		return this;
	}

	public CollateralBalance getCurrentSegregatedIndependentAmount() {
		return currentSegregatedIndependentAmount;
	}

	public ExposureCalculation setCurrentSegregatedIndependentAmount(CollateralBalance currentSegregatedIndependentAmount) {
		this.currentSegregatedIndependentAmount = Objects.requireNonNull(currentSegregatedIndependentAmount);
		return this;
	}

	public List<MarginAmountRequirement> getVariationMarginAmountRequirement() {
		return variationMarginAmountRequirement == null ? variationMarginAmountRequirement = new ArrayList<>() : variationMarginAmountRequirement;
	}

	public ExposureCalculation setVariationMarginAmountRequirement(List<MarginAmountRequirement> variationMarginAmountRequirement) {
		this.variationMarginAmountRequirement = Objects.requireNonNull(variationMarginAmountRequirement);
		return this;
	}

	public List<MarginAmountRequirement> getSegregatedAmountRequirement() {
		return segregatedAmountRequirement == null ? segregatedAmountRequirement = new ArrayList<>() : segregatedAmountRequirement;
	}

	public ExposureCalculation setSegregatedAmountRequirement(List<MarginAmountRequirement> segregatedAmountRequirement) {
		this.segregatedAmountRequirement = Objects.requireNonNull(segregatedAmountRequirement);
		return this;
	}

	public List<CollateralManagement> getCollateralManagement() {
		return collateralManagement == null ? collateralManagement = new ArrayList<>() : collateralManagement;
	}

	public ExposureCalculation setCollateralManagement(List<CollateralManagement> collateralManagement) {
		this.collateralManagement = Objects.requireNonNull(collateralManagement);
		return this;
	}

	public List<CounterpartyRisk> getCounterpartyRisk() {
		return counterpartyRisk == null ? counterpartyRisk = new ArrayList<>() : counterpartyRisk;
	}

	public ExposureCalculation setCounterpartyRisk(List<CounterpartyRisk> counterpartyRisk) {
		this.counterpartyRisk = Objects.requireNonNull(counterpartyRisk);
		return this;
	}

	public List<TransactionRisk> getTransactionRisk() {
		return transactionRisk == null ? transactionRisk = new ArrayList<>() : transactionRisk;
	}

	public ExposureCalculation setTransactionRisk(List<TransactionRisk> transactionRisk) {
		this.transactionRisk = Objects.requireNonNull(transactionRisk);
		return this;
	}

	public CurrencyAndAmount getTotalCollateralAfterHaircut() {
		return totalCollateralAfterHaircut;
	}

	public ExposureCalculation setTotalCollateralAfterHaircut(CurrencyAndAmount totalCollateralAfterHaircut) {
		this.totalCollateralAfterHaircut = Objects.requireNonNull(totalCollateralAfterHaircut);
		return this;
	}
}