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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
 * issue or, rarely, in kind, for example, in company products or property. The
 * dividend amount is decided by the board of directors.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Dividend" src="doc-files/Dividend.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequency
 * Dividend.mmDividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
 * Dividend.mmAnnualTotalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
 * Dividend.mmFinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
 * Dividend.mmFullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
 * Dividend.mmGrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmRateType
 * Dividend.mmRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
 * Dividend.mmNetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
 * Dividend.mmProvisionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
 * Dividend.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmManufacturedDividendAmount
 * Dividend.mmManufacturedDividendAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
 * Dividend.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmNotionalDividendPayableAmount
 * Dividend.mmNotionalDividendPayableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmRate
 * Dividend.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
 * Dividend.mmExDividendDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
 * Dividend.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmType
 * Dividend.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmCashProceeds
 * Dividend.mmCashProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmObligation
 * Dividend.mmObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmRelatedDistribution
 * Dividend.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequenceType
 * Dividend.mmDividendFrequenceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDividendRatio
 * Dividend.mmDividendRatio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmPaymentDate
 * Dividend.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmPaymentFrequency
 * Dividend.mmPaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmReinvestmentDate
 * Dividend.mmReinvestmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmValue
 * Dividend.mmValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmDividend
 * Security.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
 * PaymentObligation.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
 * RateAndAmount.mmFinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
 * RateAndAmount.mmGrossDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
 * RateAndAmount.mmNetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
 * RateAndAmount.mmProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmDividend
 * CashProceedsDefinition.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmDividend
 * Distribution.mmDividend}</li>
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
 * "Dividend"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors."
 * </li>
 * </ul>
 */
public class Dividend {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequencyCode dividendFrequency;
	/**
	 * Frequency with which the income is allocated to investors.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the income is allocated to investors."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate annualTotalDividendRate;
	/**
	 * Provides the annual total dividend rate.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualTotalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the annual total dividend rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAnnualTotalDividendRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnualTotalDividendRate";
			definition = "Provides the annual total dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getAnnualTotalDividendRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount finalDividend;
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
	 * RateAndAmount.mmFinalDividendParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is final."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinalDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount fullyFrankedRateAndAmount;
	/**
	 * Rate of a fully franked dividend paid by a company, or amount resulting
	 * from a fully franked dividend paid by a company; amount includes tax
	 * credit for companies that have made sufficient tax payments during the
	 * fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
	 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRateAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFullyFrankedRateAndAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmount";
			definition = "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount grossDividend;
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
	 * RateAndAmount.mmGrossDividendParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected DividendRateTypeCode rateType;
	/**
	 * Specifies the type of dividend rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of dividend rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount netDividend;
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
	 * RateAndAmount.mmNetDividendParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount provisionalDividend;
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
	 * RateAndAmount.mmProvisionalDividendParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is provisional."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProvisionalDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected ISODateTime dividendRankingDate;
	/**
	 * Date on which a security will be entitled to a dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendRankingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendRankingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount manufacturedDividendAmount;
	/**
	 * Amount of money that the borrower pays to the lender as a compensation.
	 * It does not entitle the lender to reclaim any tax credit and is sometimes
	 * treated differently by the local tax authorities of the lender.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedDividendAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmManufacturedDividendAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getManufacturedDividendAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount unfrankedAmount;
	/**
	 * Amount resulting from an unfranked dividend paid by a company; the amount
	 * does not include tax credit and is subject to withholding tax.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnfrankedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getUnfrankedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount notionalDividendPayableAmount;
	/**
	 * Amount of cash that would have been payable if the dividend had been
	 * taken in the form of cash rather than shares.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotionalDividendPayableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getNotionalDividendPayableAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * Planned dividend rate, for example, for preferred shares.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned dividend rate, for example, for preferred shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Planned dividend rate, for example, for preferred shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime exDividendDate;
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExDividendDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getExDividendDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a dividend is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a dividend is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected DividendTypeCode type;
	/**
	 * Nature of the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashProceedsDefinition> cashProceeds;
	/**
	 * Defines the proceeds which resulted in dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmDividend
	 * CashProceedsDefinition.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the proceeds which resulted in dividends."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashProceeds";
			definition = "Defines the proceeds which resulted in dividends.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> obligation;
	/**
	 * Specifies the payment terms of the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
	 * PaymentObligation.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the  payment terms of the dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the  payment terms of the dividend.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Tax on dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmDividend
	 * Tax.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax on dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax on dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Distribution relatedDistribution;
	/**
	 * Distribution for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDividend
	 * Distribution.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which a dividend is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDistribution";
			definition = "Distribution for which a dividend is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected CorporateActionFrequencyTypeCode dividendFrequenceType;
	/**
	 * Specifies the cycle of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cycle of dividends."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendFrequenceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendFrequenceType";
			definition = "Specifies the cycle of dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendFrequenceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate dividendRatio;
	/**
	 * Percentage of earnings paid to shareholders in dividends.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of earnings paid to shareholders in dividends."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendRatio", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate paymentDate;
	/**
	 * Date upon which the dividend is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the dividend is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date upon which the dividend is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode paymentFrequency;
	/**
	 * Specifies the cycle of dividend payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cycle of dividend payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the cycle of dividend payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getPaymentFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate reinvestmentDate;
	/**
	 * Date upon which the dividend is reinvested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the dividend is reinvested."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinvestmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDate";
			definition = "Date upon which the dividend is reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getReinvestmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount value;
	/**
	 * Value of the dividend expressed as an amount.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the dividend expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Value of the dividend expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getValue", new Class[]{});
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
				name = "Dividend";
				definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmDividend, com.tools20022.repository.entity.Tax.mmDividend, com.tools20022.repository.entity.PaymentObligation.mmDividend,
						com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters, com.tools20022.repository.entity.CashProceedsDefinition.mmDividend, com.tools20022.repository.entity.Distribution.mmDividend);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmDividendFrequency, com.tools20022.repository.entity.Dividend.mmAnnualTotalDividendRate,
						com.tools20022.repository.entity.Dividend.mmFinalDividend, com.tools20022.repository.entity.Dividend.mmFullyFrankedRateAndAmount, com.tools20022.repository.entity.Dividend.mmGrossDividend,
						com.tools20022.repository.entity.Dividend.mmRateType, com.tools20022.repository.entity.Dividend.mmNetDividend, com.tools20022.repository.entity.Dividend.mmProvisionalDividend,
						com.tools20022.repository.entity.Dividend.mmDividendRankingDate, com.tools20022.repository.entity.Dividend.mmManufacturedDividendAmount, com.tools20022.repository.entity.Dividend.mmUnfrankedAmount,
						com.tools20022.repository.entity.Dividend.mmNotionalDividendPayableAmount, com.tools20022.repository.entity.Dividend.mmRate, com.tools20022.repository.entity.Dividend.mmExDividendDate,
						com.tools20022.repository.entity.Dividend.mmSecurity, com.tools20022.repository.entity.Dividend.mmType, com.tools20022.repository.entity.Dividend.mmCashProceeds,
						com.tools20022.repository.entity.Dividend.mmObligation, com.tools20022.repository.entity.Dividend.mmTax, com.tools20022.repository.entity.Dividend.mmRelatedDistribution,
						com.tools20022.repository.entity.Dividend.mmDividendFrequenceType, com.tools20022.repository.entity.Dividend.mmDividendRatio, com.tools20022.repository.entity.Dividend.mmPaymentDate,
						com.tools20022.repository.entity.Dividend.mmPaymentFrequency, com.tools20022.repository.entity.Dividend.mmReinvestmentDate, com.tools20022.repository.entity.Dividend.mmValue);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Dividend.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequencyCode getDividendFrequency() {
		return dividendFrequency;
	}

	public void setDividendFrequency(EventFrequencyCode dividendFrequency) {
		this.dividendFrequency = dividendFrequency;
	}

	public PercentageRate getAnnualTotalDividendRate() {
		return annualTotalDividendRate;
	}

	public void setAnnualTotalDividendRate(PercentageRate annualTotalDividendRate) {
		this.annualTotalDividendRate = annualTotalDividendRate;
	}

	public RateAndAmount getFinalDividend() {
		return finalDividend;
	}

	public void setFinalDividend(com.tools20022.repository.entity.RateAndAmount finalDividend) {
		this.finalDividend = finalDividend;
	}

	public RateAndAmount getFullyFrankedRateAndAmount() {
		return fullyFrankedRateAndAmount;
	}

	public void setFullyFrankedRateAndAmount(com.tools20022.repository.entity.RateAndAmount fullyFrankedRateAndAmount) {
		this.fullyFrankedRateAndAmount = fullyFrankedRateAndAmount;
	}

	public RateAndAmount getGrossDividend() {
		return grossDividend;
	}

	public void setGrossDividend(com.tools20022.repository.entity.RateAndAmount grossDividend) {
		this.grossDividend = grossDividend;
	}

	public DividendRateTypeCode getRateType() {
		return rateType;
	}

	public void setRateType(DividendRateTypeCode rateType) {
		this.rateType = rateType;
	}

	public RateAndAmount getNetDividend() {
		return netDividend;
	}

	public void setNetDividend(com.tools20022.repository.entity.RateAndAmount netDividend) {
		this.netDividend = netDividend;
	}

	public RateAndAmount getProvisionalDividend() {
		return provisionalDividend;
	}

	public void setProvisionalDividend(com.tools20022.repository.entity.RateAndAmount provisionalDividend) {
		this.provisionalDividend = provisionalDividend;
	}

	public ISODateTime getDividendRankingDate() {
		return dividendRankingDate;
	}

	public void setDividendRankingDate(ISODateTime dividendRankingDate) {
		this.dividendRankingDate = dividendRankingDate;
	}

	public CurrencyAndAmount getManufacturedDividendAmount() {
		return manufacturedDividendAmount;
	}

	public void setManufacturedDividendAmount(CurrencyAndAmount manufacturedDividendAmount) {
		this.manufacturedDividendAmount = manufacturedDividendAmount;
	}

	public CurrencyAndAmount getUnfrankedAmount() {
		return unfrankedAmount;
	}

	public void setUnfrankedAmount(CurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = unfrankedAmount;
	}

	public CurrencyAndAmount getNotionalDividendPayableAmount() {
		return notionalDividendPayableAmount;
	}

	public void setNotionalDividendPayableAmount(CurrencyAndAmount notionalDividendPayableAmount) {
		this.notionalDividendPayableAmount = notionalDividendPayableAmount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public ISODateTime getExDividendDate() {
		return exDividendDate;
	}

	public void setExDividendDate(ISODateTime exDividendDate) {
		this.exDividendDate = exDividendDate;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public DividendTypeCode getType() {
		return type;
	}

	public void setType(DividendTypeCode type) {
		this.type = type;
	}

	public List<CashProceedsDefinition> getCashProceeds() {
		return cashProceeds;
	}

	public void setCashProceeds(List<com.tools20022.repository.entity.CashProceedsDefinition> cashProceeds) {
		this.cashProceeds = cashProceeds;
	}

	public List<PaymentObligation> getObligation() {
		return obligation;
	}

	public void setObligation(List<com.tools20022.repository.entity.PaymentObligation> obligation) {
		this.obligation = obligation;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}

	public Distribution getRelatedDistribution() {
		return relatedDistribution;
	}

	public void setRelatedDistribution(com.tools20022.repository.entity.Distribution relatedDistribution) {
		this.relatedDistribution = relatedDistribution;
	}

	public CorporateActionFrequencyTypeCode getDividendFrequenceType() {
		return dividendFrequenceType;
	}

	public void setDividendFrequenceType(CorporateActionFrequencyTypeCode dividendFrequenceType) {
		this.dividendFrequenceType = dividendFrequenceType;
	}

	public PercentageRate getDividendRatio() {
		return dividendRatio;
	}

	public void setDividendRatio(PercentageRate dividendRatio) {
		this.dividendRatio = dividendRatio;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public FrequencyCode getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(FrequencyCode paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public ISODate getReinvestmentDate() {
		return reinvestmentDate;
	}

	public void setReinvestmentDate(ISODate reinvestmentDate) {
		this.reinvestmentDate = reinvestmentDate;
	}

	public CurrencyAndAmount getValue() {
		return value;
	}

	public void setValue(CurrencyAndAmount value) {
		this.value = value;
	}
}