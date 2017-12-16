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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTax" src="doc-files/SecuritiesTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
 * SecuritiesTax.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
 * SecuritiesTax.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
 * SecuritiesTax.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyType
 * SecuritiesTax.mmStampDutyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
 * SecuritiesTax.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
 * SecuritiesTax.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxLotNumber
 * SecuritiesTax.mmTaxLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxRuleExemptIndicator
 * SecuritiesTax.mmTaxRuleExemptIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEffectivePeriod
 * SecuritiesTax.mmEffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmFrankedRate
 * SecuritiesTax.mmFrankedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTEFRARule
 * SecuritiesTax.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmJurisdiction
 * SecuritiesTax.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
 * RateAndAmount.mmSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
 * Jurisdiction.mmRelatedSecuritiesTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
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
 * "SecuritiesTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class SecuritiesTax extends Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount taxableIncomePerShare;
	/**
	 * Amount included in the NAV that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerShare = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerShare", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated;
	/**
	 * Specifies whether the fund calculates a taxable interest per share (TIS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerShareCalculated = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerShareCalculated", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUCapitalGainCode eUCapitalGain;
	/**
	 * Specifies whether capital gain is in the scope of the European directive
	 * on taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUCapitalGain = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUCapitalGainCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEUCapitalGain", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUDividendStatusCode eUDividendStatus;
	/**
	 * Specifies whether dividend is in the scope of the European directive on
	 * taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUDividendStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUDividendStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEUDividendStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount taxableIncomePerDividend;
	/**
	 * Amount included in the dividend that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerDividend = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerDividend", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StampDutyTypeCode stampDutyType;
	/**
	 * Indicates how the stamp duty should be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how the stamp duty should be applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyType";
			definition = "Indicates how the stamp duty should be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StampDutyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getStampDutyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText stampDutyTaxBasis;
	/**
	 * Specifies the stamp duty type or exemption reason applicable to the
	 * settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyTaxBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getStampDutyTaxBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * Tax voucher which is related to a securities tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher which is related to a securities tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher which is related to a securities tax.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxableIncomePerDividendShare;
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerDividendShare = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerDividendShare", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount relatedTax;
	/**
	 * Percentage of the gross dividend rate on which tax must be paid .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
	 * RateAndAmount.mmSecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the gross dividend rate on which tax must be paid ."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected Max15NumericText taxLotNumber;
	/**
	 * Identification, for tax purposes, of a lot of identical securities that
	 * are bought at a certain date and at a certain price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxLotNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxLotNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security security;
	/**
	 * Security on which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
	 * Security.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security on which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security on which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmTaxDetails;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected YesNoIndicator taxRuleExemptIndicator;
	/**
	 * Indicates whether the tax rule applies within the jurisdiction as a
	 * condition of this security.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRuleExemptIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the tax rule applies within the jurisdiction as a condition of this security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRuleExemptIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRuleExemptIndicator";
			definition = "Indicates whether the tax rule applies within the jurisdiction as a condition of this security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxRuleExemptIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * Period during which the tax rule applies within the jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the tax rule applies within the jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the tax rule applies within the jurisdiction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEffectivePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate frankedRate;
	/**
	 * Percentage of dividend for which tax is already paid.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend for which tax is already paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFrankedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrankedRate";
			definition = "Percentage of dividend for which tax is already paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getFrankedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TEFRARulesCode tEFRARule;
	/**
	 * Indicates the TEFRA rule under which the security is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode
	 * TEFRARulesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the TEFRA rule under which the security is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTEFRARule = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TEFRARulesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTEFRARule", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * Jurisdiction in which the tax rule applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
	 * Jurisdiction.mmRelatedSecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction in which the tax rule applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction in which the tax rule applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax,
						com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax, com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax);
				subType_lazy = () -> Arrays.asList(InvestmentFundTax.mmObject());
				superType_lazy = () -> Tax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShare, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShareCalculated,
						com.tools20022.repository.entity.SecuritiesTax.mmEUCapitalGain, com.tools20022.repository.entity.SecuritiesTax.mmEUDividendStatus, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividend,
						com.tools20022.repository.entity.SecuritiesTax.mmStampDutyType, com.tools20022.repository.entity.SecuritiesTax.mmStampDutyTaxBasis, com.tools20022.repository.entity.SecuritiesTax.mmTaxVoucher,
						com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividendShare, com.tools20022.repository.entity.SecuritiesTax.mmRelatedTax, com.tools20022.repository.entity.SecuritiesTax.mmTaxLotNumber,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesTax.mmTaxRuleExemptIndicator, com.tools20022.repository.entity.SecuritiesTax.mmEffectivePeriod,
						com.tools20022.repository.entity.SecuritiesTax.mmFrankedRate, com.tools20022.repository.entity.SecuritiesTax.mmTEFRARule, com.tools20022.repository.entity.SecuritiesTax.mmJurisdiction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerShare() {
		return taxableIncomePerShare;
	}

	public void setTaxableIncomePerShare(ActiveCurrencyAndAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
	}

	public TaxableIncomePerShareCalculatedCode getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated;
	}

	public void setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
	}

	public EUCapitalGainCode getEUCapitalGain() {
		return eUCapitalGain;
	}

	public void setEUCapitalGain(EUCapitalGainCode eUCapitalGain) {
		this.eUCapitalGain = eUCapitalGain;
	}

	public EUDividendStatusCode getEUDividendStatus() {
		return eUDividendStatus;
	}

	public void setEUDividendStatus(EUDividendStatusCode eUDividendStatus) {
		this.eUDividendStatus = eUDividendStatus;
	}

	public CurrencyAndAmount getTaxableIncomePerDividend() {
		return taxableIncomePerDividend;
	}

	public void setTaxableIncomePerDividend(CurrencyAndAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = taxableIncomePerDividend;
	}

	public StampDutyTypeCode getStampDutyType() {
		return stampDutyType;
	}

	public void setStampDutyType(StampDutyTypeCode stampDutyType) {
		this.stampDutyType = stampDutyType;
	}

	public Max4AlphaNumericText getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public void setStampDutyTaxBasis(Max4AlphaNumericText stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public void setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = taxVoucher;
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare;
	}

	public void setTaxableIncomePerDividendShare(ActiveCurrencyAndAmount taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = taxableIncomePerDividendShare;
	}

	public RateAndAmount getRelatedTax() {
		return relatedTax;
	}

	public void setRelatedTax(com.tools20022.repository.entity.RateAndAmount relatedTax) {
		this.relatedTax = relatedTax;
	}

	public Max15NumericText getTaxLotNumber() {
		return taxLotNumber;
	}

	public void setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public YesNoIndicator getTaxRuleExemptIndicator() {
		return taxRuleExemptIndicator;
	}

	public void setTaxRuleExemptIndicator(YesNoIndicator taxRuleExemptIndicator) {
		this.taxRuleExemptIndicator = taxRuleExemptIndicator;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public PercentageRate getFrankedRate() {
		return frankedRate;
	}

	public void setFrankedRate(PercentageRate frankedRate) {
		this.frankedRate = frankedRate;
	}

	public TEFRARulesCode getTEFRARule() {
		return tEFRARule;
	}

	public void setTEFRARule(TEFRARulesCode tEFRARule) {
		this.tEFRARule = tEFRARule;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
}