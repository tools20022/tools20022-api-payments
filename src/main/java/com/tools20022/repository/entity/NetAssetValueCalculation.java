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
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.codeset.ValuationTimingCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationFrequency
 * NetAssetValueCalculation.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
 * NetAssetValueCalculation.mmValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
 * NetAssetValueCalculation.mmNetAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
 * NetAssetValueCalculation.mmRelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationType
 * NetAssetValueCalculation.mmValuationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSuspendedIndicator
 * NetAssetValueCalculation.mmSuspendedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmForExecutionIndicator
 * NetAssetValueCalculation.mmForExecutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmOfficialValuationIndicator
 * NetAssetValueCalculation.mmOfficialValuationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmEstimatedPriceIndicator
 * NetAssetValueCalculation.mmEstimatedPriceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationStatistics
 * NetAssetValueCalculation.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInvestmentFundPerformanceFactors
 * NetAssetValueCalculation.mmInvestmentFundPerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
 * NetAssetValueCalculation.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
 * NetAssetValueCalculation.mmFundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmDeclarationChannel
 * NetAssetValueCalculation.mmDeclarationChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmDeclarationDate
 * NetAssetValueCalculation.mmDeclarationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFirstValuationDate
 * NetAssetValueCalculation.mmFirstValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmHistoricPricingIndicator
 * NetAssetValueCalculation.mmHistoricPricingIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueCalculation
 * ValuationStatistics.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNetAssetValueCalculation
 * PerformanceFactors.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
 * FundsCashFlow.mmNetAssetValueCalculation}</li>
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
 * "NetAssetValueCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * </ul>
 */
public class NetAssetValueCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequencyCode valuationFrequency;
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
	public static final MMBusinessAttribute mmValuationFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime valuationDateTime;
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
	public static final MMBusinessAttribute mmValuationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount netAssetValue;
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
	public static final MMBusinessAttribute mmNetAssetValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getNetAssetValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundClass relatedFund;
	/**
	 * Specifies the fund for which the NAV is calculated (per fund unit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
	 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFund";
			definition = "Specifies the fund for which the NAV is calculated (per fund unit).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected ValuationTimingCode valuationType;
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
	public static final MMBusinessAttribute mmValuationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTimingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator suspendedIndicator;
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
	public static final MMBusinessAttribute mmSuspendedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getSuspendedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator forExecutionIndicator;
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
	public static final MMBusinessAttribute mmForExecutionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForExecutionIndicator";
			definition = "Indicates whether the price information can be used for the execution of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getForExecutionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tax taxLiability;
	/**
	 * Information related to taxes that are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
	 * Tax.mmTaxLiabilityValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmTaxLiability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLiability";
			definition = "Information related to taxes that are due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Tax taxRefund;
	/**
	 * Information related to taxes that are paid back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
	 * Tax.mmTaxRefundValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmTaxRefund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefund";
			definition = "Information related to taxes that are paid back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected YesNoIndicator officialValuationIndicator;
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
	public static final MMBusinessAttribute mmOfficialValuationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getOfficialValuationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator estimatedPriceIndicator;
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
	public static final MMBusinessAttribute mmEstimatedPriceIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedPriceIndicator";
			definition = "Indicates whether the price is an estimated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getEstimatedPriceIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ValuationStatistics> valuationStatistics;
	/**
	 * Information related to the price variations of an investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueCalculation
	 * ValuationStatistics.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmValuationStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected PerformanceFactors investmentFundPerformanceFactors;
	/**
	 * Factors that give indications about the performance of a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNetAssetValueCalculation
	 * PerformanceFactors.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundPerformanceFactors = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPerformanceFactors";
			definition = "Factors that give indications about the performance of a fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
		}
	};
	protected SecuritiesPricing price;
	/**
	 * Price derived from the net asset value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
	 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price derived from the net asset value.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * Quantity on which the NAV is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
	 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity on which the NAV is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest that has accumulated between the most recent payment of interest
	 * and the sale of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
	 * Interest.mmRelatedNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected FundsCashFlow fundsCashFlow;
	/**
	 * Net cash flow for a valuation date, which is incorporated in the NAV.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
	 * FundsCashFlow.mmNetAssetValueCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmFundsCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundsCashFlow";
			definition = "Net cash flow for a valuation date, which is incorporated in the NAV.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected Max35Text declarationChannel;
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
	public static final MMBusinessAttribute mmDeclarationChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationChannel";
			definition = "Means of the net asset value publication, for example, a newspaper.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getDeclarationChannel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime declarationDate;
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
	public static final MMBusinessAttribute mmDeclarationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationDate";
			definition = "Date/time of the net asset value publication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getDeclarationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate firstValuationDate;
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
	public static final MMBusinessAttribute mmFirstValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstValuationDate";
			definition = "Date on which the investment fund class was first priced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getFirstValuationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator historicPricingIndicator;
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
	public static final MMBusinessAttribute mmHistoricPricingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HistoricPricingIndicator";
			definition = "Indicates whether the price is historic or forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getHistoricPricingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetAssetValueCalculation";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation, com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.SecuritiesQuantity.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.mmNetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationFrequency, com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationDateTime,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmNetAssetValue, com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationType, com.tools20022.repository.entity.NetAssetValueCalculation.mmSuspendedIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmForExecutionIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund, com.tools20022.repository.entity.NetAssetValueCalculation.mmOfficialValuationIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmEstimatedPriceIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationStatistics,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmInvestmentFundPerformanceFactors, com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity, com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow, com.tools20022.repository.entity.NetAssetValueCalculation.mmDeclarationChannel,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmDeclarationDate, com.tools20022.repository.entity.NetAssetValueCalculation.mmFirstValuationDate,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmHistoricPricingIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetAssetValueCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequencyCode getValuationFrequency() {
		return valuationFrequency;
	}

	public void setValuationFrequency(EventFrequencyCode valuationFrequency) {
		this.valuationFrequency = valuationFrequency;
	}

	public ISODateTime getValuationDateTime() {
		return valuationDateTime;
	}

	public void setValuationDateTime(ISODateTime valuationDateTime) {
		this.valuationDateTime = valuationDateTime;
	}

	public CurrencyAndAmount getNetAssetValue() {
		return netAssetValue;
	}

	public void setNetAssetValue(CurrencyAndAmount netAssetValue) {
		this.netAssetValue = netAssetValue;
	}

	public InvestmentFundClass getRelatedFund() {
		return relatedFund;
	}

	public void setRelatedFund(com.tools20022.repository.entity.InvestmentFundClass relatedFund) {
		this.relatedFund = relatedFund;
	}

	public ValuationTimingCode getValuationType() {
		return valuationType;
	}

	public void setValuationType(ValuationTimingCode valuationType) {
		this.valuationType = valuationType;
	}

	public YesNoIndicator getSuspendedIndicator() {
		return suspendedIndicator;
	}

	public void setSuspendedIndicator(YesNoIndicator suspendedIndicator) {
		this.suspendedIndicator = suspendedIndicator;
	}

	public YesNoIndicator getForExecutionIndicator() {
		return forExecutionIndicator;
	}

	public void setForExecutionIndicator(YesNoIndicator forExecutionIndicator) {
		this.forExecutionIndicator = forExecutionIndicator;
	}

	public Tax getTaxLiability() {
		return taxLiability;
	}

	public void setTaxLiability(com.tools20022.repository.entity.Tax taxLiability) {
		this.taxLiability = taxLiability;
	}

	public Tax getTaxRefund() {
		return taxRefund;
	}

	public void setTaxRefund(com.tools20022.repository.entity.Tax taxRefund) {
		this.taxRefund = taxRefund;
	}

	public YesNoIndicator getOfficialValuationIndicator() {
		return officialValuationIndicator;
	}

	public void setOfficialValuationIndicator(YesNoIndicator officialValuationIndicator) {
		this.officialValuationIndicator = officialValuationIndicator;
	}

	public YesNoIndicator getEstimatedPriceIndicator() {
		return estimatedPriceIndicator;
	}

	public void setEstimatedPriceIndicator(YesNoIndicator estimatedPriceIndicator) {
		this.estimatedPriceIndicator = estimatedPriceIndicator;
	}

	public List<ValuationStatistics> getValuationStatistics() {
		return valuationStatistics;
	}

	public void setValuationStatistics(List<com.tools20022.repository.entity.ValuationStatistics> valuationStatistics) {
		this.valuationStatistics = valuationStatistics;
	}

	public PerformanceFactors getInvestmentFundPerformanceFactors() {
		return investmentFundPerformanceFactors;
	}

	public void setInvestmentFundPerformanceFactors(com.tools20022.repository.entity.PerformanceFactors investmentFundPerformanceFactors) {
		this.investmentFundPerformanceFactors = investmentFundPerformanceFactors;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.SecuritiesPricing price) {
		this.price = price;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public FundsCashFlow getFundsCashFlow() {
		return fundsCashFlow;
	}

	public void setFundsCashFlow(com.tools20022.repository.entity.FundsCashFlow fundsCashFlow) {
		this.fundsCashFlow = fundsCashFlow;
	}

	public Max35Text getDeclarationChannel() {
		return declarationChannel;
	}

	public void setDeclarationChannel(Max35Text declarationChannel) {
		this.declarationChannel = declarationChannel;
	}

	public ISODateTime getDeclarationDate() {
		return declarationDate;
	}

	public void setDeclarationDate(ISODateTime declarationDate) {
		this.declarationDate = declarationDate;
	}

	public ISODate getFirstValuationDate() {
		return firstValuationDate;
	}

	public void setFirstValuationDate(ISODate firstValuationDate) {
		this.firstValuationDate = firstValuationDate;
	}

	public YesNoIndicator getHistoricPricingIndicator() {
		return historicPricingIndicator;
	}

	public void setHistoricPricingIndicator(YesNoIndicator historicPricingIndicator) {
		this.historicPricingIndicator = historicPricingIndicator;
	}
}