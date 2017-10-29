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
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.codeset.ValuationTimingCode;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the net asset value for an investment fund/fund class.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NetAssetValueCalculation"
 * src="doc-files/NetAssetValueCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationFrequency
 * NetAssetValueCalculation.ValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationDateTime
 * NetAssetValueCalculation.ValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#NetAssetValue
 * NetAssetValueCalculation.NetAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#RelatedFund
 * NetAssetValueCalculation.RelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationType
 * NetAssetValueCalculation.ValuationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SuspendedIndicator
 * NetAssetValueCalculation.SuspendedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ForExecutionIndicator
 * NetAssetValueCalculation.ForExecutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxLiability
 * NetAssetValueCalculation.TaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxRefund
 * NetAssetValueCalculation.TaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#OfficialValuationIndicator
 * NetAssetValueCalculation.OfficialValuationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#EstimatedPriceIndicator
 * NetAssetValueCalculation.EstimatedPriceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationStatistics
 * NetAssetValueCalculation.ValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#InvestmentFundPerformanceFactors
 * NetAssetValueCalculation.InvestmentFundPerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Price
 * NetAssetValueCalculation.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SecuritiesQuantity
 * NetAssetValueCalculation.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Interest
 * NetAssetValueCalculation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#FundsCashFlow
 * NetAssetValueCalculation.FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#DeclarationChannel
 * NetAssetValueCalculation.DeclarationChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#DeclarationDate
 * NetAssetValueCalculation.DeclarationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#FirstValuationDate
 * NetAssetValueCalculation.FirstValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#HistoricPricingIndicator
 * NetAssetValueCalculation.HistoricPricingIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#NetAssetValueCalculation
 * InvestmentFundClass.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#NetAssetValueCalculation
 * SecuritiesPricing.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxLiabilityValueCalculation
 * Tax.TaxLiabilityValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxRefundValueCalculation
 * Tax.TaxRefundValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NetAssetValueCalculation
 * SecuritiesQuantity.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#NetAssetValueCalculation
 * ValuationStatistics.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#NetAssetValueCalculation
 * PerformanceFactors.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedNetAssetValueCalculation
 * Interest.RelatedNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#NetAssetValueCalculation
 * FundsCashFlow.NetAssetValueCalculation}</li>
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
 * "NetAssetValueCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * </ul>
 */
public class NetAssetValueCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency of the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValuationFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Date and time of the price valuation for the investment fund/fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the price valuation for the investment fund/fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValuationDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Value of all the holdings, less the fund's liabilities, attributable to a
	 * specific investment fund class.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAssetValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the fund for which the NAV is calculated (per fund unit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#NetAssetValueCalculation
	 * InvestmentFundClass.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the fund for which the NAV is calculated (per fund unit)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFund";
			definition = "Specifies the fund for which the NAV is calculated (per fund unit).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how the valuation is done, based on the schedule stated in the
	 * prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
	 * ValuationTimingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the valuation is done, based on the schedule stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValuationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ValuationTimingCode.mmObject();
		}
	};
	/**
	 * Indicates whether the valuation of the investment fund class is
	 * suspended.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the valuation of the investment fund class is suspended."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuspendedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the price information can be used for the execution of
	 * a transaction.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForExecutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price information can be used for the execution of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForExecutionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForExecutionIndicator";
			definition = "Indicates whether the price information can be used for the execution of a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to taxes that are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#TaxLiabilityValueCalculation
	 * Tax.TaxLiabilityValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxLiability = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiability";
			definition = "Information related to taxes that are due.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to taxes that are paid back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#TaxRefundValueCalculation
	 * Tax.TaxRefundValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are paid back."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxRefund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefund";
			definition = "Information related to taxes that are paid back.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxRefundValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the valuation is an official valuation.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialValuationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the valuation is an official valuation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OfficialValuationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the price is an estimated price.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the price is an estimated price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstimatedPriceIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedPriceIndicator";
			definition = "Indicates whether the price is an estimated price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to the price variations of an investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#NetAssetValueCalculation
	 * ValuationStatistics.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price variations of an investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValuationStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Factors that give indications about the performance of a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#NetAssetValueCalculation
	 * PerformanceFactors.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundPerformanceFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factors that give indications about the performance of a fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundPerformanceFactors = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPerformanceFactors";
			definition = "Factors that give indications about the performance of a fund.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PerformanceFactors.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price derived from the net asset value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#NetAssetValueCalculation
	 * SecuritiesPricing.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price derived from the net asset value."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price derived from the net asset value.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity on which the NAV is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NetAssetValueCalculation
	 * SecuritiesQuantity.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity on which the NAV is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity on which the NAV is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest that has accumulated between the most recent payment of interest
	 * and the sale of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedNetAssetValueCalculation
	 * Interest.RelatedNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net cash flow for a valuation date, which is incorporated in the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#NetAssetValueCalculation
	 * FundsCashFlow.NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsCashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash flow for a valuation date, which is incorporated in the NAV."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundsCashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundsCashFlow";
			definition = "Net cash flow for a valuation date, which is incorporated in the NAV.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Means of the net asset value publication, for example, a newspaper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means of the net asset value publication, for example, a newspaper."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeclarationChannel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationChannel";
			definition = "Means of the net asset value publication, for example, a newspaper.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time of the net asset value publication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the net asset value publication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeclarationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationDate";
			definition = "Date/time of the net asset value publication.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the investment fund class was first priced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the investment fund class was first priced."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstValuationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstValuationDate";
			definition = "Date on which the investment fund class was first priced.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Indicates whether the price is historic or forward.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricPricingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the price is historic or forward."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HistoricPricingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HistoricPricingIndicator";
			definition = "Indicates whether the price is historic or forward.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NetAssetValueCalculation";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation, com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation,
						com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation, com.tools20022.repository.entity.Tax.TaxRefundValueCalculation, com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation,
						com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.ValuationFrequency, com.tools20022.repository.entity.NetAssetValueCalculation.ValuationDateTime,
						com.tools20022.repository.entity.NetAssetValueCalculation.NetAssetValue, com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund,
						com.tools20022.repository.entity.NetAssetValueCalculation.ValuationType, com.tools20022.repository.entity.NetAssetValueCalculation.SuspendedIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.ForExecutionIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund, com.tools20022.repository.entity.NetAssetValueCalculation.OfficialValuationIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.EstimatedPriceIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics,
						com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors, com.tools20022.repository.entity.NetAssetValueCalculation.Price,
						com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity, com.tools20022.repository.entity.NetAssetValueCalculation.Interest,
						com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow, com.tools20022.repository.entity.NetAssetValueCalculation.DeclarationChannel,
						com.tools20022.repository.entity.NetAssetValueCalculation.DeclarationDate, com.tools20022.repository.entity.NetAssetValueCalculation.FirstValuationDate,
						com.tools20022.repository.entity.NetAssetValueCalculation.HistoricPricingIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}