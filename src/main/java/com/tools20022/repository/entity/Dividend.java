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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#DividendFrequency
 * Dividend.DividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#AnnualTotalDividendRate
 * Dividend.AnnualTotalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
 * Dividend.FinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
 * Dividend.FullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
 * Dividend.GrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#RateType
 * Dividend.RateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#NetDividend
 * Dividend.NetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
 * Dividend.ProvisionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#DividendRankingDate
 * Dividend.DividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ManufacturedDividendAmount
 * Dividend.ManufacturedDividendAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#UnfrankedAmount
 * Dividend.UnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#NotionalDividendPayableAmount
 * Dividend.NotionalDividendPayableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Rate Dividend.Rate}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#ExDividendDate
 * Dividend.ExDividendDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Security
 * Dividend.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Type Dividend.Type}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
 * Dividend.CashProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Obligation
 * Dividend.Obligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Tax Dividend.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#RelatedDistribution
 * Dividend.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#DividendFrequenceType
 * Dividend.DividendFrequenceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#DividendRatio
 * Dividend.DividendRatio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#PaymentDate
 * Dividend.PaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#PaymentFrequency
 * Dividend.PaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#ReinvestmentDate
 * Dividend.ReinvestmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Value
 * Dividend.Value}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Dividend
 * Security.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Dividend Tax.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
 * PaymentObligation.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
 * RateAndAmount.FinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
 * RateAndAmount.GrossDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
 * RateAndAmount.NetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
 * RateAndAmount.ProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
 * CashProceedsDefinition.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#Dividend
 * Distribution.Dividend}</li>
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
 * "Dividend"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors."
 * </li>
 * </ul>
 */
public class Dividend {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute DividendFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute AnnualTotalDividendRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnualTotalDividendRate";
			definition = "Provides the annual total dividend rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
	 * RateAndAmount.FinalDividendParameters}</li>
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
	public static final MMBusinessAssociationEnd FinalDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
	 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
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
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmount";
			definition = "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
	 * RateAndAmount.GrossDividendParameters}</li>
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
	public static final MMBusinessAssociationEnd GrossDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of dividend rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DividendRateTypeCode.mmObject();
		}
	};
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
	 * RateAndAmount.NetDividendParameters}</li>
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
	public static final MMBusinessAssociationEnd NetDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.NetDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
	 * RateAndAmount.ProvisionalDividendParameters}</li>
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
	public static final MMBusinessAssociationEnd ProvisionalDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute DividendRankingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ManufacturedDividendAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute UnfrankedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NotionalDividendPayableAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Planned dividend rate, for example, for preferred shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ExDividendDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Security for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Dividend
	 * Security.Dividend}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a dividend is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DividendTypeCode.mmObject();
		}
	};
	/**
	 * Defines the proceeds which resulted in dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
	 * CashProceedsDefinition.Dividend}</li>
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
	public static final MMBusinessAssociationEnd CashProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceeds";
			definition = "Defines the proceeds which resulted in dividends.";
			minOccurs = 0;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the payment terms of the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
	 * PaymentObligation.Dividend}</li>
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
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the  payment terms of the dividend.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax on dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Dividend
	 * Tax.Dividend}</li>
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
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax on dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#Dividend
	 * Distribution.Dividend}</li>
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
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDistribution";
			definition = "Distribution for which a dividend is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute DividendFrequenceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequenceType";
			definition = "Specifies the cycle of dividends.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DividendRatio = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date upon which the dividend is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the cycle of dividend payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ReinvestmentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDate";
			definition = "Date upon which the dividend is reinvested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Value of the dividend expressed as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Dividend";
				definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.PaymentObligation.Dividend,
						com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.NetDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.CashProceedsDefinition.Dividend, com.tools20022.repository.entity.Distribution.Dividend);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.DividendFrequency, com.tools20022.repository.entity.Dividend.AnnualTotalDividendRate, com.tools20022.repository.entity.Dividend.FinalDividend,
						com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount, com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.RateType,
						com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend, com.tools20022.repository.entity.Dividend.DividendRankingDate,
						com.tools20022.repository.entity.Dividend.ManufacturedDividendAmount, com.tools20022.repository.entity.Dividend.UnfrankedAmount, com.tools20022.repository.entity.Dividend.NotionalDividendPayableAmount,
						com.tools20022.repository.entity.Dividend.Rate, com.tools20022.repository.entity.Dividend.ExDividendDate, com.tools20022.repository.entity.Dividend.Security, com.tools20022.repository.entity.Dividend.Type,
						com.tools20022.repository.entity.Dividend.CashProceeds, com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.Dividend.Tax,
						com.tools20022.repository.entity.Dividend.RelatedDistribution, com.tools20022.repository.entity.Dividend.DividendFrequenceType, com.tools20022.repository.entity.Dividend.DividendRatio,
						com.tools20022.repository.entity.Dividend.PaymentDate, com.tools20022.repository.entity.Dividend.PaymentFrequency, com.tools20022.repository.entity.Dividend.ReinvestmentDate,
						com.tools20022.repository.entity.Dividend.Value);
			}
		});
		return mmObject_lazy.get();
	}
}