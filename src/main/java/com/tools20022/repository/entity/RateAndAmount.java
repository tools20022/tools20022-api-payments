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
import com.tools20022.repository.codeset.OperatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the value expressed as a rate or an amount. For example, the value
 * of a tax or a commission.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RateAndAmount" src="doc-files/RateAndAmount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
 * RateAndAmount.mmFinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
 * RateAndAmount.mmGrossDividendParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
 * RateAndAmount.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
 * RateAndAmount.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
 * RateAndAmount.mmNetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
 * RateAndAmount.mmProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmRate
 * RateAndAmount.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
 * RateAndAmount.mmRateBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
 * RateAndAmount.mmSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmInterestRelatedIssuance
 * RateAndAmount.mmInterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmLossRelatedIssuance
 * RateAndAmount.mmLossRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAbsoluteValue
 * RateAndAmount.mmAbsoluteValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmOperator
 * RateAndAmount.mmOperator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRelatedYieldCalculation
 * RateAndAmount.mmRelatedYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmConduitForeignIncomeAmountDividendParameters
 * RateAndAmount.mmConduitForeignIncomeAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmDeemedAmountDividendParameters
 * RateAndAmount.mmDeemedAmountDividendParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
 * Dividend.mmFinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
 * Dividend.mmFullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
 * Dividend.mmGrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
 * Dividend.mmNetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
 * Dividend.mmProvisionalDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
 * Dividend.mmDeemedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
 * Dividend.mmConduitForeignIncomeAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
 * SecuritiesTax.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
 * Issuance.mmInterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
 * Issuance.mmRealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
 * Index.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
 * BiddingConditions.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
 * YieldCalculation.mmYieldRange}</li>
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
 * "RateAndAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission."
 * </li>
 * </ul>
 */
public class RateAndAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Dividend finalDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a final dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmFinalDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmFinalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getFinalDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setFinalDividendParameters(value);
		}
	};
	protected Dividend fullyFrankedRateAndAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRateAndAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a fully franked rate and amount is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Optional<Dividend>> mmFullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Optional<Dividend>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Optional<Dividend> getValue(RateAndAmount obj) {
			return obj.getFullyFrankedRateAndAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Optional<Dividend> value) {
			obj.setFullyFrankedRateAndAmountDividendParameters(value.orElse(null));
		}
	};
	protected Dividend grossDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a gross dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmGrossDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmGrossDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getGrossDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setGrossDividendParameters(value);
		}
	};
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<RateAndAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(RateAndAmount obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(RateAndAmount obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Index index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Index for which a factor is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Index> mmIndex = new MMBusinessAssociationEnd<RateAndAmount, Index>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Index.mmIndexFactor;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Index.mmObject();
		}

		@Override
		public Index getValue(RateAndAmount obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(RateAndAmount obj, Index value) {
			obj.setIndex(value);
		}
	};
	protected Dividend netDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a net dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmNetDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmNetDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getNetDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setNetDividendParameters(value);
		}
	};
	protected BiddingConditions maximumAllowedBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, BiddingConditions> mmMaximumAllowedBiddingConditions = new MMBusinessAssociationEnd<RateAndAmount, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(RateAndAmount obj) {
			return obj.getMaximumAllowedBiddingConditions();
		}

		@Override
		public void setValue(RateAndAmount obj, BiddingConditions value) {
			obj.setMaximumAllowedBiddingConditions(value);
		}
	};
	protected Dividend provisionalDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a provisional dividend rate is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmProvisionalDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmProvisionalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getProvisionalDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setProvisionalDividendParameters(value);
		}
	};
	protected CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a solicitation fee is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges> mmSolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public CorporateActionFeesAndCharges getValue(RateAndAmount obj) {
			return obj.getSolicitationFeeCorporateActionParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, CorporateActionFeesAndCharges value) {
			obj.setSolicitationFeeCorporateActionParameters(value);
		}
	};
	protected PercentageRate rate;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, PercentageRate> mmRate = new MMBusinessAttribute<RateAndAmount, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(RateAndAmount obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(RateAndAmount obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected BiddingConditions rateBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bidding conditions for which a rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, BiddingConditions> mmRateBiddingConditions = new MMBusinessAssociationEnd<RateAndAmount, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmApplicableRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(RateAndAmount obj) {
			return obj.getRateBiddingConditions();
		}

		@Override
		public void setValue(RateAndAmount obj, BiddingConditions value) {
			obj.setRateBiddingConditions(value);
		}
	};
	protected SecuritiesTax securitiesTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
	 * SecuritiesTax.mmRelatedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax for which a percentage of the gross dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, SecuritiesTax> mmSecuritiesTax = new MMBusinessAssociationEnd<RateAndAmount, SecuritiesTax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTax.mmRelatedTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public SecuritiesTax getValue(RateAndAmount obj) {
			return obj.getSecuritiesTax();
		}

		@Override
		public void setValue(RateAndAmount obj, SecuritiesTax value) {
			obj.setSecuritiesTax(value);
		}
	};
	protected CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which an early solicitation fee is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges> mmEarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public CorporateActionFeesAndCharges getValue(RateAndAmount obj) {
			return obj.getEarlySolicitationFeeCorporateActionParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, CorporateActionFeesAndCharges value) {
			obj.setEarlySolicitationFeeCorporateActionParameters(value);
		}
	};
	protected Issuance interestRelatedIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
	 * Issuance.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance for which an interest shortfall has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Issuance> mmInterestRelatedIssuance = new MMBusinessAssociationEnd<RateAndAmount, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmInterestShortfall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(RateAndAmount obj) {
			return obj.getInterestRelatedIssuance();
		}

		@Override
		public void setValue(RateAndAmount obj, Issuance value) {
			obj.setInterestRelatedIssuance(value);
		}
	};
	protected Issuance lossRelatedIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
	 * Issuance.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LossRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a realised loss has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Issuance> mmLossRelatedIssuance = new MMBusinessAssociationEnd<RateAndAmount, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmRealisedLoss;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(RateAndAmount obj) {
			return obj.getLossRelatedIssuance();
		}

		@Override
		public void setValue(RateAndAmount obj, Issuance value) {
			obj.setLossRelatedIssuance(value);
		}
	};
	protected Number absoluteValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbsoluteValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Absolute value determined with a number."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, Number> mmAbsoluteValue = new MMBusinessAttribute<RateAndAmount, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AbsoluteValue";
			definition = "Absolute value determined with a number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(RateAndAmount obj) {
			return obj.getAbsoluteValue();
		}

		@Override
		public void setValue(RateAndAmount obj, Number value) {
			obj.setAbsoluteValue(value);
		}
	};
	protected OperatorCode operator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.OperatorCode
	 * OperatorCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the relationship between a variable and a fixed value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, OperatorCode> mmOperator = new MMBusinessAttribute<RateAndAmount, OperatorCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Operator";
			definition = "Provides the relationship between a variable and a fixed value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OperatorCode.mmObject();
		}

		@Override
		public OperatorCode getValue(RateAndAmount obj) {
			return obj.getOperator();
		}

		@Override
		public void setValue(RateAndAmount obj, OperatorCode value) {
			obj.setOperator(value);
		}
	};
	protected YieldCalculation relatedYieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
	 * YieldCalculation.mmYieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedYieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation which uses a yield range."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Optional<YieldCalculation>> mmRelatedYieldCalculation = new MMBusinessAssociationEnd<RateAndAmount, Optional<YieldCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> YieldCalculation.mmYieldRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> YieldCalculation.mmObject();
		}

		@Override
		public Optional<YieldCalculation> getValue(RateAndAmount obj) {
			return obj.getRelatedYieldCalculation();
		}

		@Override
		public void setValue(RateAndAmount obj, Optional<YieldCalculation> value) {
			obj.setRelatedYieldCalculation(value.orElse(null));
		}
	};
	protected Dividend conduitForeignIncomeAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
	 * Dividend.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a conduit foreign income amount is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmConduitForeignIncomeAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConduitForeignIncomeAmountDividendParameters";
			definition = "Dividend information for which a conduit foreign income amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmConduitForeignIncomeAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getConduitForeignIncomeAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setConduitForeignIncomeAmountDividendParameters(value);
		}
	};
	protected Dividend deemedAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
	 * Dividend.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a deemed amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmDeemedAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeemedAmountDividendParameters";
			definition = "Dividend information for which a deemed amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmDeemedAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getDeemedAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setDeemedAmountDividendParameters(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(Dividend.mmFinalDividend, Dividend.mmFullyFrankedRateAndAmount, Dividend.mmGrossDividend, Dividend.mmNetDividend, Dividend.mmProvisionalDividend, Dividend.mmDeemedAmount,
						Dividend.mmConduitForeignIncomeAmount, SecuritiesTax.mmRelatedTax, Issuance.mmInterestShortfall, Issuance.mmRealisedLoss, Index.mmIndexFactor, BiddingConditions.mmMaximumAllowedOverSubscription,
						BiddingConditions.mmApplicableRate, CorporateActionFeesAndCharges.mmSolicitationFee, CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate, YieldCalculation.mmYieldRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmAmount, com.tools20022.repository.entity.RateAndAmount.mmIndex,
						com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.mmRate, com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.mmInterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.mmLossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.mmAbsoluteValue, com.tools20022.repository.entity.RateAndAmount.mmOperator,
						com.tools20022.repository.entity.RateAndAmount.mmRelatedYieldCalculation, com.tools20022.repository.entity.RateAndAmount.mmConduitForeignIncomeAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmDeemedAmountDividendParameters);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RateAndAmount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Dividend getFinalDividendParameters() {
		return finalDividendParameters;
	}

	public RateAndAmount setFinalDividendParameters(Dividend finalDividendParameters) {
		this.finalDividendParameters = Objects.requireNonNull(finalDividendParameters);
		return this;
	}

	public Optional<Dividend> getFullyFrankedRateAndAmountDividendParameters() {
		return fullyFrankedRateAndAmountDividendParameters == null ? Optional.empty() : Optional.of(fullyFrankedRateAndAmountDividendParameters);
	}

	public RateAndAmount setFullyFrankedRateAndAmountDividendParameters(Dividend fullyFrankedRateAndAmountDividendParameters) {
		this.fullyFrankedRateAndAmountDividendParameters = fullyFrankedRateAndAmountDividendParameters;
		return this;
	}

	public Dividend getGrossDividendParameters() {
		return grossDividendParameters;
	}

	public RateAndAmount setGrossDividendParameters(Dividend grossDividendParameters) {
		this.grossDividendParameters = Objects.requireNonNull(grossDividendParameters);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public RateAndAmount setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Index getIndex() {
		return index;
	}

	public RateAndAmount setIndex(Index index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Dividend getNetDividendParameters() {
		return netDividendParameters;
	}

	public RateAndAmount setNetDividendParameters(Dividend netDividendParameters) {
		this.netDividendParameters = Objects.requireNonNull(netDividendParameters);
		return this;
	}

	public BiddingConditions getMaximumAllowedBiddingConditions() {
		return maximumAllowedBiddingConditions;
	}

	public RateAndAmount setMaximumAllowedBiddingConditions(BiddingConditions maximumAllowedBiddingConditions) {
		this.maximumAllowedBiddingConditions = Objects.requireNonNull(maximumAllowedBiddingConditions);
		return this;
	}

	public Dividend getProvisionalDividendParameters() {
		return provisionalDividendParameters;
	}

	public RateAndAmount setProvisionalDividendParameters(Dividend provisionalDividendParameters) {
		this.provisionalDividendParameters = Objects.requireNonNull(provisionalDividendParameters);
		return this;
	}

	public CorporateActionFeesAndCharges getSolicitationFeeCorporateActionParameters() {
		return solicitationFeeCorporateActionParameters;
	}

	public RateAndAmount setSolicitationFeeCorporateActionParameters(CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters) {
		this.solicitationFeeCorporateActionParameters = Objects.requireNonNull(solicitationFeeCorporateActionParameters);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public RateAndAmount setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public BiddingConditions getRateBiddingConditions() {
		return rateBiddingConditions;
	}

	public RateAndAmount setRateBiddingConditions(BiddingConditions rateBiddingConditions) {
		this.rateBiddingConditions = Objects.requireNonNull(rateBiddingConditions);
		return this;
	}

	public SecuritiesTax getSecuritiesTax() {
		return securitiesTax;
	}

	public RateAndAmount setSecuritiesTax(SecuritiesTax securitiesTax) {
		this.securitiesTax = Objects.requireNonNull(securitiesTax);
		return this;
	}

	public CorporateActionFeesAndCharges getEarlySolicitationFeeCorporateActionParameters() {
		return earlySolicitationFeeCorporateActionParameters;
	}

	public RateAndAmount setEarlySolicitationFeeCorporateActionParameters(CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters) {
		this.earlySolicitationFeeCorporateActionParameters = Objects.requireNonNull(earlySolicitationFeeCorporateActionParameters);
		return this;
	}

	public Issuance getInterestRelatedIssuance() {
		return interestRelatedIssuance;
	}

	public RateAndAmount setInterestRelatedIssuance(Issuance interestRelatedIssuance) {
		this.interestRelatedIssuance = Objects.requireNonNull(interestRelatedIssuance);
		return this;
	}

	public Issuance getLossRelatedIssuance() {
		return lossRelatedIssuance;
	}

	public RateAndAmount setLossRelatedIssuance(Issuance lossRelatedIssuance) {
		this.lossRelatedIssuance = Objects.requireNonNull(lossRelatedIssuance);
		return this;
	}

	public Number getAbsoluteValue() {
		return absoluteValue;
	}

	public RateAndAmount setAbsoluteValue(Number absoluteValue) {
		this.absoluteValue = Objects.requireNonNull(absoluteValue);
		return this;
	}

	public OperatorCode getOperator() {
		return operator;
	}

	public RateAndAmount setOperator(OperatorCode operator) {
		this.operator = Objects.requireNonNull(operator);
		return this;
	}

	public Optional<YieldCalculation> getRelatedYieldCalculation() {
		return relatedYieldCalculation == null ? Optional.empty() : Optional.of(relatedYieldCalculation);
	}

	public RateAndAmount setRelatedYieldCalculation(YieldCalculation relatedYieldCalculation) {
		this.relatedYieldCalculation = relatedYieldCalculation;
		return this;
	}

	public Dividend getConduitForeignIncomeAmountDividendParameters() {
		return conduitForeignIncomeAmountDividendParameters;
	}

	public RateAndAmount setConduitForeignIncomeAmountDividendParameters(Dividend conduitForeignIncomeAmountDividendParameters) {
		this.conduitForeignIncomeAmountDividendParameters = Objects.requireNonNull(conduitForeignIncomeAmountDividendParameters);
		return this;
	}

	public Dividend getDeemedAmountDividendParameters() {
		return deemedAmountDividendParameters;
	}

	public RateAndAmount setDeemedAmountDividendParameters(Dividend deemedAmountDividendParameters) {
		this.deemedAmountDividendParameters = Objects.requireNonNull(deemedAmountDividendParameters);
		return this;
	}
}