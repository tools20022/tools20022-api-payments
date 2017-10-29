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
import com.tools20022.repository.codeset.OperatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
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
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
 * RateAndAmount.FinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
 * RateAndAmount.GrossDividendParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Amount
 * RateAndAmount.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Index
 * RateAndAmount.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
 * RateAndAmount.NetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
 * RateAndAmount.ProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Rate
 * RateAndAmount.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
 * RateAndAmount.RateBiddingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#SecuritiesTax
 * RateAndAmount.SecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
 * RateAndAmount.InterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
 * RateAndAmount.LossRelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#AbsoluteValue
 * RateAndAmount.AbsoluteValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Operator
 * RateAndAmount.Operator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RelatedYieldCalculation
 * RateAndAmount.RelatedYieldCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
 * Dividend.FinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
 * Dividend.FullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
 * Dividend.GrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#NetDividend
 * Dividend.NetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
 * Dividend.ProvisionalDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#RelatedTax
 * SecuritiesTax.RelatedTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
 * Issuance.InterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
 * Issuance.RealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexFactor
 * Index.IndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
 * BiddingConditions.MaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
 * BiddingConditions.ApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
 * CorporateActionFeesAndCharges.SolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#YieldRange
 * YieldCalculation.YieldRange}</li>
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
	/**
	 * Dividend information for which a final dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
	 * Dividend.FinalDividend}</li>
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
	public static final MMBusinessAssociationEnd FinalDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FinalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a fully franked rate and amount is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
	 * Dividend.FullyFrankedRateAndAmount}</li>
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
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a gross dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
	 * Dividend.GrossDividend}</li>
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
	public static final MMBusinessAssociationEnd GrossDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.GrossDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Index for which a factor is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#IndexFactor
	 * Index.IndexFactor}</li>
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
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.IndexFactor;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a net dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#NetDividend
	 * Dividend.NetDividend}</li>
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
	public static final MMBusinessAssociationEnd NetDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.NetDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum amount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
	 * BiddingConditions.MaximumAllowedOverSubscription}</li>
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
	public static final MMBusinessAssociationEnd MaximumAllowedBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a provisional dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
	 * Dividend.ProvisionalDividend}</li>
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
	public static final MMBusinessAssociationEnd ProvisionalDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.ProvisionalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a solicitation fee is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
	 * CorporateActionFeesAndCharges.SolicitationFee}</li>
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
	public static final MMBusinessAssociationEnd SolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
	 * BiddingConditions.ApplicableRate}</li>
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
	public static final MMBusinessAssociationEnd RateBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.ApplicableRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax for which a percentage of the gross dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#RelatedTax
	 * SecuritiesTax.RelatedTax}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.RelatedTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which an early solicitation fee is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
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
	public static final MMBusinessAssociationEnd EarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which an interest shortfall has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
	 * Issuance.InterestShortfall}</li>
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
	public static final MMBusinessAssociationEnd InterestRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.InterestShortfall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a realised loss has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
	 * Issuance.RealisedLoss}</li>
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
	public static final MMBusinessAssociationEnd LossRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.RealisedLoss;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute AbsoluteValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AbsoluteValue";
			definition = "Absolute value determined with a number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Operator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Operator";
			definition = "Provides the relationship between a variable and a fixed value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OperatorCode.mmObject();
		}
	};
	/**
	 * Yield calculation which uses a yield range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#YieldRange
	 * YieldCalculation.YieldRange}</li>
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
	public static final MMBusinessAssociationEnd RelatedYieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.YieldRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.FinalDividend, com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount,
						com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend,
						com.tools20022.repository.entity.SecuritiesTax.RelatedTax, com.tools20022.repository.entity.Issuance.InterestShortfall, com.tools20022.repository.entity.Issuance.RealisedLoss,
						com.tools20022.repository.entity.Index.IndexFactor, com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee, com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate,
						com.tools20022.repository.entity.YieldCalculation.YieldRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.Amount, com.tools20022.repository.entity.RateAndAmount.Index,
						com.tools20022.repository.entity.RateAndAmount.NetDividendParameters, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.Rate, com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.SecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.AbsoluteValue, com.tools20022.repository.entity.RateAndAmount.Operator,
						com.tools20022.repository.entity.RateAndAmount.RelatedYieldCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}