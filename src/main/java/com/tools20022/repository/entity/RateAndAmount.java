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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Dividend information for which a final dividend rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmFinalDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmFinalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected Dividend fullyFrankedRateAndAmountDividendParameters;
	/**
	 * Dividend information for which a fully franked rate and amount is
	 * specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmFullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmFullyFrankedRateAndAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected Dividend grossDividendParameters;
	/**
	 * Dividend information for which a gross dividend rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmGrossDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmGrossDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Value expressed as an amount.
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RateAndAmount.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Index index;
	/**
	 * Index for which a factor is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmIndexFactor;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected Dividend netDividendParameters;
	/**
	 * Dividend information for which a net dividend rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmNetDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmNetDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected BiddingConditions maximumAllowedBiddingConditions;
	/**
	 * Bidding conditions for which a maximum amount is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMaximumAllowedBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMaximumAllowedOverSubscription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected Dividend provisionalDividendParameters;
	/**
	 * Dividend information for which a provisional dividend rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmProvisionalDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmProvisionalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters;
	/**
	 * Corporate event for which a solicitation fee is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmSolicitationFee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Value expressed as a rate.
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RateAndAmount.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BiddingConditions rateBiddingConditions;
	/**
	 * Bidding conditions for which a rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRateBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmApplicableRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected SecuritiesTax securitiesTax;
	/**
	 * Tax for which a percentage of the gross dividend rate is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmRelatedTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	protected CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters;
	/**
	 * Corporate event for which an early solicitation fee is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmEarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};
	protected Issuance interestRelatedIssuance;
	/**
	 * Issuance for which an interest shortfall has been specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInterestRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmInterestShortfall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Issuance lossRelatedIssuance;
	/**
	 * Issuance for which a realised loss has been specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLossRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmRealisedLoss;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Number absoluteValue;
	/**
	 * Absolute value determined with a number.
	 * <p>
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
	public static final MMBusinessAttribute mmAbsoluteValue = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RateAndAmount.class.getMethod("getAbsoluteValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OperatorCode operator;
	/**
	 * Provides the relationship between a variable and a fixed value.
	 * <p>
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
	public static final MMBusinessAttribute mmOperator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RateAndAmount.class.getMethod("getOperator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YieldCalculation relatedYieldCalculation;
	/**
	 * Yield calculation which uses a yield range.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedYieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmYieldRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmFinalDividend, com.tools20022.repository.entity.Dividend.mmFullyFrankedRateAndAmount,
						com.tools20022.repository.entity.Dividend.mmGrossDividend, com.tools20022.repository.entity.Dividend.mmNetDividend, com.tools20022.repository.entity.Dividend.mmProvisionalDividend,
						com.tools20022.repository.entity.SecuritiesTax.mmRelatedTax, com.tools20022.repository.entity.Issuance.mmInterestShortfall, com.tools20022.repository.entity.Issuance.mmRealisedLoss,
						com.tools20022.repository.entity.Index.mmIndexFactor, com.tools20022.repository.entity.BiddingConditions.mmMaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.mmApplicableRate,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmSolicitationFee, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate,
						com.tools20022.repository.entity.YieldCalculation.mmYieldRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmAmount, com.tools20022.repository.entity.RateAndAmount.mmIndex,
						com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.mmRate, com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.mmInterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.mmLossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.mmAbsoluteValue, com.tools20022.repository.entity.RateAndAmount.mmOperator,
						com.tools20022.repository.entity.RateAndAmount.mmRelatedYieldCalculation);
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

	public void setFinalDividendParameters(com.tools20022.repository.entity.Dividend finalDividendParameters) {
		this.finalDividendParameters = finalDividendParameters;
	}

	public Dividend getFullyFrankedRateAndAmountDividendParameters() {
		return fullyFrankedRateAndAmountDividendParameters;
	}

	public void setFullyFrankedRateAndAmountDividendParameters(com.tools20022.repository.entity.Dividend fullyFrankedRateAndAmountDividendParameters) {
		this.fullyFrankedRateAndAmountDividendParameters = fullyFrankedRateAndAmountDividendParameters;
	}

	public Dividend getGrossDividendParameters() {
		return grossDividendParameters;
	}

	public void setGrossDividendParameters(com.tools20022.repository.entity.Dividend grossDividendParameters) {
		this.grossDividendParameters = grossDividendParameters;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public Index getIndex() {
		return index;
	}

	public void setIndex(com.tools20022.repository.entity.Index index) {
		this.index = index;
	}

	public Dividend getNetDividendParameters() {
		return netDividendParameters;
	}

	public void setNetDividendParameters(com.tools20022.repository.entity.Dividend netDividendParameters) {
		this.netDividendParameters = netDividendParameters;
	}

	public BiddingConditions getMaximumAllowedBiddingConditions() {
		return maximumAllowedBiddingConditions;
	}

	public void setMaximumAllowedBiddingConditions(com.tools20022.repository.entity.BiddingConditions maximumAllowedBiddingConditions) {
		this.maximumAllowedBiddingConditions = maximumAllowedBiddingConditions;
	}

	public Dividend getProvisionalDividendParameters() {
		return provisionalDividendParameters;
	}

	public void setProvisionalDividendParameters(com.tools20022.repository.entity.Dividend provisionalDividendParameters) {
		this.provisionalDividendParameters = provisionalDividendParameters;
	}

	public CorporateActionFeesAndCharges getSolicitationFeeCorporateActionParameters() {
		return solicitationFeeCorporateActionParameters;
	}

	public void setSolicitationFeeCorporateActionParameters(com.tools20022.repository.entity.CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters) {
		this.solicitationFeeCorporateActionParameters = solicitationFeeCorporateActionParameters;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public BiddingConditions getRateBiddingConditions() {
		return rateBiddingConditions;
	}

	public void setRateBiddingConditions(com.tools20022.repository.entity.BiddingConditions rateBiddingConditions) {
		this.rateBiddingConditions = rateBiddingConditions;
	}

	public SecuritiesTax getSecuritiesTax() {
		return securitiesTax;
	}

	public void setSecuritiesTax(com.tools20022.repository.entity.SecuritiesTax securitiesTax) {
		this.securitiesTax = securitiesTax;
	}

	public CorporateActionFeesAndCharges getEarlySolicitationFeeCorporateActionParameters() {
		return earlySolicitationFeeCorporateActionParameters;
	}

	public void setEarlySolicitationFeeCorporateActionParameters(com.tools20022.repository.entity.CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters) {
		this.earlySolicitationFeeCorporateActionParameters = earlySolicitationFeeCorporateActionParameters;
	}

	public Issuance getInterestRelatedIssuance() {
		return interestRelatedIssuance;
	}

	public void setInterestRelatedIssuance(com.tools20022.repository.entity.Issuance interestRelatedIssuance) {
		this.interestRelatedIssuance = interestRelatedIssuance;
	}

	public Issuance getLossRelatedIssuance() {
		return lossRelatedIssuance;
	}

	public void setLossRelatedIssuance(com.tools20022.repository.entity.Issuance lossRelatedIssuance) {
		this.lossRelatedIssuance = lossRelatedIssuance;
	}

	public Number getAbsoluteValue() {
		return absoluteValue;
	}

	public void setAbsoluteValue(Number absoluteValue) {
		this.absoluteValue = absoluteValue;
	}

	public OperatorCode getOperator() {
		return operator;
	}

	public void setOperator(OperatorCode operator) {
		this.operator = operator;
	}

	public YieldCalculation getRelatedYieldCalculation() {
		return relatedYieldCalculation;
	}

	public void setRelatedYieldCalculation(com.tools20022.repository.entity.YieldCalculation relatedYieldCalculation) {
		this.relatedYieldCalculation = relatedYieldCalculation;
	}
}