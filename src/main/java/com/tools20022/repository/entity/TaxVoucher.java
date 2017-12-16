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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Statement showing the amount or value of a distribution and either the tax
 * credit to which the recipient is entitled in respect of that distribution; or
 * the amount of tax deducted from the distribution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxVoucher" src="doc-files/TaxVoucher.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
 * TaxVoucher.mmRequestedTaxationRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
 * TaxVoucher.mmCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
 * TaxVoucher.mmSundryOrOtherAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
 * TaxVoucher.mmCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
 * TaxVoucher.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
 * TaxVoucher.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
 * TaxVoucher.mmNotionalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmDistribution
 * TaxVoucher.mmDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmIdentification
 * TaxVoucher.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainDate
 * TaxVoucher.mmBargainDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainSettlementDate
 * TaxVoucher.mmBargainSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmTaxVoucherRate
 * TaxVoucher.mmTaxVoucherRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
 * TaxVoucher.mmRecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmAllotedSharesCost
 * TaxVoucher.mmAllotedSharesCost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
 * TaxVoucher.mmForeignExchangeTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
 * SecuritiesQuantity.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
 * CorporateActionDistribution.mmTaxVoucher}</li>
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
 * "TaxVoucher"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution."
 * </li>
 * </ul>
 */
public class TaxVoucher {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate requestedTaxationRate;
	/**
	 * Requested tax rate in case of breakdown of tax rate, for example, used
	 * for adjustment of tax rate. This is the new requested applicable rate.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTaxationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedTaxationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getRequestedTaxationRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate creditRate;
	/**
	 * Applicable tax rate on the tax credit amount.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applicable tax rate on the tax credit amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getCreditRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTax> relatedSecurityTax;
	/**
	 * Specifies tax elements on the security which is involved in the corporate
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
	 * SecuritiesTax.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurityTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax elements on the security which is involved in the corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecurityTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityTax";
			definition = "Specifies tax elements on the security which is involved in the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	protected CurrencyAndAmount sundryOrOtherAmount;
	/**
	 * Amount of money related to taxable income that cannot be categorised.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSundryOrOtherAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getSundryOrOtherAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount creditAmount;
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money per equity allocated as the result of a tax credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAmount";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getCreditAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashAmountBroughtForward;
	/**
	 * Cash amount retained from previous dividend or interest payment.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount retained from previous dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashAmountBroughtForward = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getCashAmountBroughtForward", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashAmountCarriedForward;
	/**
	 * Cash amount carried forward to next dividend or interest payment.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount carried forward to next dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashAmountCarriedForward = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getCashAmountCarriedForward", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount notionalTaxAmount;
	/**
	 * Tax on the amount of cash that would have been paid when new securities
	 * are issued in lieu of a cash dividend.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotionalTaxAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getNotionalTaxAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionDistribution distribution;
	/**
	 * Corporate action distribution process for which tax voucher information
	 * is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action distribution process for which tax voucher information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Corporate action distribution process for which tax voucher information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identification for the tax voucher.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the tax voucher."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the tax voucher.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate bargainDate;
	/**
	 * Date on which DRIP purchase completed.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which DRIP purchase completed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBargainDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getBargainDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate bargainSettlementDate;
	/**
	 * Settlement date of the DRIP purchase transaction.
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date of the DRIP purchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBargainSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getBargainSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate taxVoucherRate;
	/**
	 * Distribution rate per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution rate per share."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxVoucherRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getTaxVoucherRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity recordDateHolding;
	/**
	 * Securities holding on record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
	 * SecuritiesQuantity.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities holding on record date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRecordDateHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesPricing scripDividendReinvestmentPricePerShare;
	/**
	 * Cost per share of new shares allotted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
	 * SecuritiesPricing.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendReinvestmentPricePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost per share of new shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmScripDividendReinvestmentPricePerShare = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount allotedSharesCost;
	/**
	 * Total cash amount required to purchase shares allotted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllotedSharesCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total cash amount required to purchase shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllotedSharesCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxVoucher.class.getMethod("getAllotedSharesCost", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> foreignExchangeTransaction;
	/**
	 * Provides information about the foreign exchange transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
	 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmForeignExchangeTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeTransaction";
			definition = "Provides information about the foreign exchange transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxVoucher";
				definition = "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmTaxVoucher, com.tools20022.repository.entity.SecuritiesTax.mmTaxVoucher,
						com.tools20022.repository.entity.SecuritiesQuantity.mmTaxVoucher, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.CorporateActionDistribution.mmTaxVoucher);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxVoucher.mmRequestedTaxationRate, com.tools20022.repository.entity.TaxVoucher.mmCreditRate,
						com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax, com.tools20022.repository.entity.TaxVoucher.mmSundryOrOtherAmount, com.tools20022.repository.entity.TaxVoucher.mmCreditAmount,
						com.tools20022.repository.entity.TaxVoucher.mmCashAmountBroughtForward, com.tools20022.repository.entity.TaxVoucher.mmCashAmountCarriedForward, com.tools20022.repository.entity.TaxVoucher.mmNotionalTaxAmount,
						com.tools20022.repository.entity.TaxVoucher.mmDistribution, com.tools20022.repository.entity.TaxVoucher.mmIdentification, com.tools20022.repository.entity.TaxVoucher.mmBargainDate,
						com.tools20022.repository.entity.TaxVoucher.mmBargainSettlementDate, com.tools20022.repository.entity.TaxVoucher.mmTaxVoucherRate, com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding,
						com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare, com.tools20022.repository.entity.TaxVoucher.mmAllotedSharesCost,
						com.tools20022.repository.entity.TaxVoucher.mmForeignExchangeTransaction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxVoucher.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRequestedTaxationRate() {
		return requestedTaxationRate;
	}

	public void setRequestedTaxationRate(PercentageRate requestedTaxationRate) {
		this.requestedTaxationRate = requestedTaxationRate;
	}

	public PercentageRate getCreditRate() {
		return creditRate;
	}

	public void setCreditRate(PercentageRate creditRate) {
		this.creditRate = creditRate;
	}

	public List<SecuritiesTax> getRelatedSecurityTax() {
		return relatedSecurityTax;
	}

	public void setRelatedSecurityTax(List<com.tools20022.repository.entity.SecuritiesTax> relatedSecurityTax) {
		this.relatedSecurityTax = relatedSecurityTax;
	}

	public CurrencyAndAmount getSundryOrOtherAmount() {
		return sundryOrOtherAmount;
	}

	public void setSundryOrOtherAmount(CurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = sundryOrOtherAmount;
	}

	public CurrencyAndAmount getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(CurrencyAndAmount creditAmount) {
		this.creditAmount = creditAmount;
	}

	public CurrencyAndAmount getCashAmountBroughtForward() {
		return cashAmountBroughtForward;
	}

	public void setCashAmountBroughtForward(CurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
	}

	public CurrencyAndAmount getCashAmountCarriedForward() {
		return cashAmountCarriedForward;
	}

	public void setCashAmountCarriedForward(CurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
	}

	public CurrencyAndAmount getNotionalTaxAmount() {
		return notionalTaxAmount;
	}

	public void setNotionalTaxAmount(CurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = notionalTaxAmount;
	}

	public CorporateActionDistribution getDistribution() {
		return distribution;
	}

	public void setDistribution(com.tools20022.repository.entity.CorporateActionDistribution distribution) {
		this.distribution = distribution;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public ISODate getBargainDate() {
		return bargainDate;
	}

	public void setBargainDate(ISODate bargainDate) {
		this.bargainDate = bargainDate;
	}

	public ISODate getBargainSettlementDate() {
		return bargainSettlementDate;
	}

	public void setBargainSettlementDate(ISODate bargainSettlementDate) {
		this.bargainSettlementDate = bargainSettlementDate;
	}

	public BaseOneRate getTaxVoucherRate() {
		return taxVoucherRate;
	}

	public void setTaxVoucherRate(BaseOneRate taxVoucherRate) {
		this.taxVoucherRate = taxVoucherRate;
	}

	public SecuritiesQuantity getRecordDateHolding() {
		return recordDateHolding;
	}

	public void setRecordDateHolding(com.tools20022.repository.entity.SecuritiesQuantity recordDateHolding) {
		this.recordDateHolding = recordDateHolding;
	}

	public SecuritiesPricing getScripDividendReinvestmentPricePerShare() {
		return scripDividendReinvestmentPricePerShare;
	}

	public void setScripDividendReinvestmentPricePerShare(com.tools20022.repository.entity.SecuritiesPricing scripDividendReinvestmentPricePerShare) {
		this.scripDividendReinvestmentPricePerShare = scripDividendReinvestmentPricePerShare;
	}

	public ActiveCurrencyAndAmount getAllotedSharesCost() {
		return allotedSharesCost;
	}

	public void setAllotedSharesCost(ActiveCurrencyAndAmount allotedSharesCost) {
		this.allotedSharesCost = allotedSharesCost;
	}

	public List<ForeignExchangeTrade> getForeignExchangeTransaction() {
		return foreignExchangeTransaction;
	}

	public void setForeignExchangeTransaction(List<com.tools20022.repository.entity.ForeignExchangeTrade> foreignExchangeTransaction) {
		this.foreignExchangeTransaction = foreignExchangeTransaction;
	}
}