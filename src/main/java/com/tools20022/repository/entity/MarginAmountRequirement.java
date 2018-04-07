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
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Amount of expected margin required by any of the parties of the margin
 * calculation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarginAmountRequirement"
 * src="doc-files/MarginAmountRequirement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmVariationMarginAmountRequirementCalculation
 * MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmDeliverMarginAmount
 * MarginAmountRequirement.mmDeliverMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmReturnMarginAmount
 * MarginAmountRequirement.mmReturnMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmSegregatedAmountRequirementCalculation
 * MarginAmountRequirement.mmSegregatedAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmIntraDayMarginCall
 * MarginAmountRequirement.mmIntraDayMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmPeakInitialMarginLiability
 * MarginAmountRequirement.mmPeakInitialMarginLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmAggregatePeakLiability
 * MarginAmountRequirement.mmAggregatePeakLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmPeakVariationMarginLiability
 * MarginAmountRequirement.mmPeakVariationMarginLiability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
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
 * "MarginAmountRequirement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of expected margin required by any of the parties of the margin calculation."
 * </li>
 * </ul>
 */
public class MarginAmountRequirement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExposureCalculation variationMarginAmountRequirementCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
	 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAmountRequirementCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exposure valuation which takes into account amount requirements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginAmountRequirement, Optional<ExposureCalculation>> mmVariationMarginAmountRequirementCalculation = new MMBusinessAssociationEnd<MarginAmountRequirement, Optional<ExposureCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ExposureCalculation.mmVariationMarginAmountRequirement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}

		@Override
		public Optional<ExposureCalculation> getValue(MarginAmountRequirement obj) {
			return obj.getVariationMarginAmountRequirementCalculation();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, Optional<ExposureCalculation> value) {
			obj.setVariationMarginAmountRequirementCalculation(value.orElse(null));
		}
	};
	protected CurrencyAndAmount deliverMarginAmount;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmDeliverMarginAmount = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverMarginAmount";
			definition = "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getDeliverMarginAmount();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setDeliverMarginAmount(value);
		}
	};
	protected CurrencyAndAmount returnMarginAmount;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmReturnMarginAmount = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnMarginAmount";
			definition = "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getReturnMarginAmount();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setReturnMarginAmount(value);
		}
	};
	protected ExposureCalculation segregatedAmountRequirementCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
	 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedAmountRequirementCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exposure valuation which takes into account amount requirements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginAmountRequirement, Optional<ExposureCalculation>> mmSegregatedAmountRequirementCalculation = new MMBusinessAssociationEnd<MarginAmountRequirement, Optional<ExposureCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ExposureCalculation.mmSegregatedAmountRequirement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}

		@Override
		public Optional<ExposureCalculation> getValue(MarginAmountRequirement obj) {
			return obj.getSegregatedAmountRequirementCalculation();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, Optional<ExposureCalculation> value) {
			obj.setSegregatedAmountRequirementCalculation(value.orElse(null));
		}
	};
	protected CurrencyAndAmount intraDayMarginCall;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total aggregate value of collateral called intraday, excluding repayments.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmIntraDayMarginCall = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraDayMarginCall";
			definition = "Total aggregate value of collateral called intraday, excluding repayments.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getIntraDayMarginCall();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setIntraDayMarginCall(value);
		}
	};
	protected CurrencyAndAmount peakInitialMarginLiability;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakInitialMarginLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak increase in initial margin liability for the account during the day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmPeakInitialMarginLiability = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeakInitialMarginLiability";
			definition = "Peak increase in initial margin liability for the account during the day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getPeakInitialMarginLiability();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setPeakInitialMarginLiability(value);
		}
	};
	protected CurrencyAndAmount aggregatePeakLiability;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatePeakLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak intraday liability (sum of increase in initial margin relative to end of day plus sum of decrease in variation margin relative to end of day) for a margin account during the day. Liabilities are shown as positive integers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmAggregatePeakLiability = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregatePeakLiability";
			definition = "Peak intraday liability (sum of increase in initial margin relative to end of day plus sum of decrease in variation margin relative to end of day) for a margin account during the day. Liabilities are shown as positive integers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getAggregatePeakLiability();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setAggregatePeakLiability(value);
		}
	};
	protected CurrencyAndAmount peakVariationMarginLiability;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakVariationMarginLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak loss uncollateralised variation margin liability on the margin account during the day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount> mmPeakVariationMarginLiability = new MMBusinessAttribute<MarginAmountRequirement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeakVariationMarginLiability";
			definition = "Peak loss uncollateralised variation margin liability on the margin account during the day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginAmountRequirement obj) {
			return obj.getPeakVariationMarginLiability();
		}

		@Override
		public void setValue(MarginAmountRequirement obj, CurrencyAndAmount value) {
			obj.setPeakVariationMarginLiability(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginAmountRequirement";
				definition = "Amount of expected margin required by any of the parties of the margin calculation.";
				associationDomain_lazy = () -> Arrays.asList(ExposureCalculation.mmVariationMarginAmountRequirement, ExposureCalculation.mmSegregatedAmountRequirement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.mmDeliverMarginAmount,
						com.tools20022.repository.entity.MarginAmountRequirement.mmReturnMarginAmount, com.tools20022.repository.entity.MarginAmountRequirement.mmSegregatedAmountRequirementCalculation,
						com.tools20022.repository.entity.MarginAmountRequirement.mmIntraDayMarginCall, com.tools20022.repository.entity.MarginAmountRequirement.mmPeakInitialMarginLiability,
						com.tools20022.repository.entity.MarginAmountRequirement.mmAggregatePeakLiability, com.tools20022.repository.entity.MarginAmountRequirement.mmPeakVariationMarginLiability);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginAmountRequirement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExposureCalculation> getVariationMarginAmountRequirementCalculation() {
		return variationMarginAmountRequirementCalculation == null ? Optional.empty() : Optional.of(variationMarginAmountRequirementCalculation);
	}

	public MarginAmountRequirement setVariationMarginAmountRequirementCalculation(ExposureCalculation variationMarginAmountRequirementCalculation) {
		this.variationMarginAmountRequirementCalculation = variationMarginAmountRequirementCalculation;
		return this;
	}

	public CurrencyAndAmount getDeliverMarginAmount() {
		return deliverMarginAmount;
	}

	public MarginAmountRequirement setDeliverMarginAmount(CurrencyAndAmount deliverMarginAmount) {
		this.deliverMarginAmount = Objects.requireNonNull(deliverMarginAmount);
		return this;
	}

	public CurrencyAndAmount getReturnMarginAmount() {
		return returnMarginAmount;
	}

	public MarginAmountRequirement setReturnMarginAmount(CurrencyAndAmount returnMarginAmount) {
		this.returnMarginAmount = Objects.requireNonNull(returnMarginAmount);
		return this;
	}

	public Optional<ExposureCalculation> getSegregatedAmountRequirementCalculation() {
		return segregatedAmountRequirementCalculation == null ? Optional.empty() : Optional.of(segregatedAmountRequirementCalculation);
	}

	public MarginAmountRequirement setSegregatedAmountRequirementCalculation(ExposureCalculation segregatedAmountRequirementCalculation) {
		this.segregatedAmountRequirementCalculation = segregatedAmountRequirementCalculation;
		return this;
	}

	public CurrencyAndAmount getIntraDayMarginCall() {
		return intraDayMarginCall;
	}

	public MarginAmountRequirement setIntraDayMarginCall(CurrencyAndAmount intraDayMarginCall) {
		this.intraDayMarginCall = Objects.requireNonNull(intraDayMarginCall);
		return this;
	}

	public CurrencyAndAmount getPeakInitialMarginLiability() {
		return peakInitialMarginLiability;
	}

	public MarginAmountRequirement setPeakInitialMarginLiability(CurrencyAndAmount peakInitialMarginLiability) {
		this.peakInitialMarginLiability = Objects.requireNonNull(peakInitialMarginLiability);
		return this;
	}

	public CurrencyAndAmount getAggregatePeakLiability() {
		return aggregatePeakLiability;
	}

	public MarginAmountRequirement setAggregatePeakLiability(CurrencyAndAmount aggregatePeakLiability) {
		this.aggregatePeakLiability = Objects.requireNonNull(aggregatePeakLiability);
		return this;
	}

	public CurrencyAndAmount getPeakVariationMarginLiability() {
		return peakVariationMarginLiability;
	}

	public MarginAmountRequirement setPeakVariationMarginLiability(CurrencyAndAmount peakVariationMarginLiability) {
		this.peakVariationMarginLiability = Objects.requireNonNull(peakVariationMarginLiability);
		return this;
	}
}