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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CurrencyExchange" src="doc-files/CurrencyExchange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
 * CurrencyExchange.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
 * CurrencyExchange.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
 * CurrencyExchange.mmQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
 * CurrencyExchange.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
 * CurrencyExchange.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
 * CurrencyExchange.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
 * CurrencyExchange.mmCalculatedAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
 * CurrencyExchange.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
 * CurrencyExchange.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRateType
 * CurrencyExchange.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedLimitManagement
 * CurrencyExchange.mmRelatedLimitManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmFixingConditions
 * CurrencyExchange.mmFixingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedInvoice
 * CurrencyExchange.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashDistribution
 * CurrencyExchange.mmCurrencyExchangeForCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
 * CashEntry.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
 * AssetHolding.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
 * TransactionAdministrator.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
 * ForeignExchangeTrade.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
 * SecuritiesConversion.mmConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
 * SecuritiesBalance.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
 * CorporateActionEvent.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
 * CorporateActionCashEntitlement.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
 * FixingCondition.mmFixingRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
 * Invoice.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
 * LiquidityManagementLimit.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
 * Quote.mmQuotedRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange5
 * CurrencyExchange5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1 ExchangeRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange6
 * CurrencyExchange6}</li>
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
 * "CurrencyExchange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * </ul>
 */
public class CurrencyExchange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount originalAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmTransactionAmount
	 * AmountAndCurrencyExchange3.mmTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOriginalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchange3.mmTransactionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getOriginalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ForeignExchangeTrade currencyExchangeForForeignExchangeTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForForeignExchangeTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which uses the specified exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected CurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmUnitCurrency
	 * CurrencyExchange5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmUnitCurrency
	 * ExchangeRate1.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmUnitCurrency
	 * CurrencyExchange6.mmUnitCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmUnitCurrency, ExchangeRate1.mmUnitCurrency, CurrencyExchange6.mmUnitCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getUnitCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotedCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getQuotedCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmExchangeRate
	 * CurrencyExchange5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmExchangeRate
	 * ExchangeRate1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmExchangeRate
	 * CurrencyExchange6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmExchangeRate
	 * DirectDebitTransactionInformation21.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmExchangeRate
	 * PaymentTransaction81.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmExchangeRate
	 * PaymentTransaction76.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmExchangeRate, ExchangeRate1.mmExchangeRate, CurrencyExchange6.mmExchangeRate, DirectDebitTransactionInformation21.mmExchangeRate, PaymentTransaction81.mmExchangeRate,
					PaymentTransaction76.mmExchangeRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getExchangeRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount resultingAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmCounterValueAmount
	 * AmountAndCurrencyExchange3.mmCounterValueAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from a foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResultingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchange3.mmCounterValueAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getResultingAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesBalance currencyExchangeForSecuritiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a securities balance which used a specific exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected ISODateTime quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmQuotationDate
	 * CurrencyExchange5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmQuotationDate
	 * CurrencyExchange6.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which an exchange rate is quoted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmQuotationDate, CurrencyExchange6.mmQuotationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getQuotationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset value calculated in a different currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected CurrencyCode sourceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmSourceCurrency
	 * CurrencyExchange5.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmSourceCurrency
	 * CurrencyExchange6.mmSourceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the amount to be converted in a currency conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSourceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmSourceCurrency, CurrencyExchange6.mmSourceCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getSourceCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode targetCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmTargetCurrency
	 * CurrencyExchange5.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmTargetCurrency
	 * CurrencyExchange6.mmTargetCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which an amount is to be converted in a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTargetCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmTargetCurrency, CurrencyExchange6.mmTargetCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getTargetCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
	 * CashEntry.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash entry to which the currency exchange parameters apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected Payment relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment for which currency exchange parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected ExchangeRateTypeCode rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#mmRateType
	 * ExchangeRate1.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type used to complete the currency exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ExchangeRate1.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LiquidityManagementLimit relatedLimitManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
	 * LiquidityManagementLimit.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLimitManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit for which an exchange rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FixingCondition> fixingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
	 * FixingCondition.mmFixingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFixingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmFixingRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
	 * Tax.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which exchange information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Invoice relatedInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invoice for which currency exchange information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected TransactionAdministrator currencyExchangeForTransactionAdministrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
	 * TransactionAdministrator.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of applications which use currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected Account reportedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
	 * Account.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account which uses an exchange rate to report entries and balances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
	 * CorporateActionCashEntitlement.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCorporateActionCashEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash entitlement for which an exchange rate is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
	 * PaymentExecution.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which currrency exchange information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected Quote currencyExchangeForSecuritiesQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
	 * Quote.mmQuotedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which uses currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesConversion currencyExchangeForSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
	 * SecuritiesConversion.mmConversionUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected CashDistribution currencyExchangeForCashDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
	 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
		}
	};
	protected Adjustment adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
	 * Adjustment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees or commission applied to the currency exchange.\r\n"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrencyExchange,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Payment.mmCurrencyExchange, com.tools20022.repository.entity.CashEntry.mmCurrencyExchange,
						com.tools20022.repository.entity.AssetHolding.mmExchangeRate, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate, com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate,
						com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate, com.tools20022.repository.entity.FixingCondition.mmFixingRate,
						com.tools20022.repository.entity.Invoice.mmCurrencyExchange, com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange,
						com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation, com.tools20022.repository.entity.Quote.mmQuotedRate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.mmOriginalAmount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.mmUnitCurrency, com.tools20022.repository.entity.CurrencyExchange.mmQuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.mmResultingAmount, com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.mmQuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.mmSourceCurrency, com.tools20022.repository.entity.CurrencyExchange.mmTargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, com.tools20022.repository.entity.CurrencyExchange.mmRateType,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.mmFixingConditions, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.mmAdjustment);
				derivationComponent_lazy = () -> Arrays.asList(CurrencyExchange5.mmObject(), ExchangeRate1.mmObject(), CurrencyExchange6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CurrencyExchange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public CurrencyExchange setOriginalAmount(CurrencyAndAmount originalAmount) {
		this.originalAmount = Objects.requireNonNull(originalAmount);
		return this;
	}

	public Optional<ForeignExchangeTrade> getCurrencyExchangeForForeignExchangeTrade() {
		return currencyExchangeForForeignExchangeTrade == null ? Optional.empty() : Optional.of(currencyExchangeForForeignExchangeTrade);
	}

	public CurrencyExchange setCurrencyExchangeForForeignExchangeTrade(com.tools20022.repository.entity.ForeignExchangeTrade currencyExchangeForForeignExchangeTrade) {
		this.currencyExchangeForForeignExchangeTrade = currencyExchangeForForeignExchangeTrade;
		return this;
	}

	public CurrencyCode getUnitCurrency() {
		return unitCurrency;
	}

	public CurrencyExchange setUnitCurrency(CurrencyCode unitCurrency) {
		this.unitCurrency = Objects.requireNonNull(unitCurrency);
		return this;
	}

	public CurrencyCode getQuotedCurrency() {
		return quotedCurrency;
	}

	public CurrencyExchange setQuotedCurrency(CurrencyCode quotedCurrency) {
		this.quotedCurrency = Objects.requireNonNull(quotedCurrency);
		return this;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public CurrencyExchange setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public CurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public CurrencyExchange setResultingAmount(CurrencyAndAmount resultingAmount) {
		this.resultingAmount = Objects.requireNonNull(resultingAmount);
		return this;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public CurrencyExchange setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = Objects.requireNonNull(relatedCorporateActionEvent);
		return this;
	}

	public SecuritiesBalance getCurrencyExchangeForSecuritiesBalance() {
		return currencyExchangeForSecuritiesBalance;
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance currencyExchangeForSecuritiesBalance) {
		this.currencyExchangeForSecuritiesBalance = Objects.requireNonNull(currencyExchangeForSecuritiesBalance);
		return this;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public CurrencyExchange setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = Objects.requireNonNull(quotationDate);
		return this;
	}

	public List<AssetHolding> getCalculatedAssetValue() {
		return calculatedAssetValue == null ? calculatedAssetValue = new ArrayList<>() : calculatedAssetValue;
	}

	public CurrencyExchange setCalculatedAssetValue(List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue) {
		this.calculatedAssetValue = Objects.requireNonNull(calculatedAssetValue);
		return this;
	}

	public CurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyExchange setSourceCurrency(CurrencyCode sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public CurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public CurrencyExchange setTargetCurrency(CurrencyCode targetCurrency) {
		this.targetCurrency = Objects.requireNonNull(targetCurrency);
		return this;
	}

	public List<CashEntry> getCurrencyExchangeForCashEntry() {
		return currencyExchangeForCashEntry == null ? currencyExchangeForCashEntry = new ArrayList<>() : currencyExchangeForCashEntry;
	}

	public CurrencyExchange setCurrencyExchangeForCashEntry(List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry) {
		this.currencyExchangeForCashEntry = Objects.requireNonNull(currencyExchangeForCashEntry);
		return this;
	}

	public Payment getRelatedPayment() {
		return relatedPayment;
	}

	public CurrencyExchange setRelatedPayment(com.tools20022.repository.entity.Payment relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public ExchangeRateTypeCode getRateType() {
		return rateType;
	}

	public CurrencyExchange setRateType(ExchangeRateTypeCode rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public LiquidityManagementLimit getRelatedLimitManagement() {
		return relatedLimitManagement;
	}

	public CurrencyExchange setRelatedLimitManagement(com.tools20022.repository.entity.LiquidityManagementLimit relatedLimitManagement) {
		this.relatedLimitManagement = Objects.requireNonNull(relatedLimitManagement);
		return this;
	}

	public List<FixingCondition> getFixingConditions() {
		return fixingConditions == null ? fixingConditions = new ArrayList<>() : fixingConditions;
	}

	public CurrencyExchange setFixingConditions(List<com.tools20022.repository.entity.FixingCondition> fixingConditions) {
		this.fixingConditions = Objects.requireNonNull(fixingConditions);
		return this;
	}

	public Tax getTax() {
		return tax;
	}

	public CurrencyExchange setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public Invoice getRelatedInvoice() {
		return relatedInvoice;
	}

	public CurrencyExchange setRelatedInvoice(com.tools20022.repository.entity.Invoice relatedInvoice) {
		this.relatedInvoice = Objects.requireNonNull(relatedInvoice);
		return this;
	}

	public TransactionAdministrator getCurrencyExchangeForTransactionAdministrator() {
		return currencyExchangeForTransactionAdministrator;
	}

	public CurrencyExchange setCurrencyExchangeForTransactionAdministrator(com.tools20022.repository.entity.TransactionAdministrator currencyExchangeForTransactionAdministrator) {
		this.currencyExchangeForTransactionAdministrator = Objects.requireNonNull(currencyExchangeForTransactionAdministrator);
		return this;
	}

	public Account getReportedAccount() {
		return reportedAccount;
	}

	public CurrencyExchange setReportedAccount(com.tools20022.repository.entity.Account reportedAccount) {
		this.reportedAccount = Objects.requireNonNull(reportedAccount);
		return this;
	}

	public CorporateActionCashEntitlement getCurrencyExchangeForCorporateActionCashEntitlement() {
		return currencyExchangeForCorporateActionCashEntitlement;
	}

	public CurrencyExchange setCurrencyExchangeForCorporateActionCashEntitlement(com.tools20022.repository.entity.CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement) {
		this.currencyExchangeForCorporateActionCashEntitlement = Objects.requireNonNull(currencyExchangeForCorporateActionCashEntitlement);
		return this;
	}

	public PaymentExecution getPaymentExecution() {
		return paymentExecution;
	}

	public CurrencyExchange setPaymentExecution(com.tools20022.repository.entity.PaymentExecution paymentExecution) {
		this.paymentExecution = Objects.requireNonNull(paymentExecution);
		return this;
	}

	public Optional<Quote> getCurrencyExchangeForSecuritiesQuote() {
		return currencyExchangeForSecuritiesQuote == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesQuote);
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesQuote(com.tools20022.repository.entity.Quote currencyExchangeForSecuritiesQuote) {
		this.currencyExchangeForSecuritiesQuote = currencyExchangeForSecuritiesQuote;
		return this;
	}

	public Optional<SecuritiesConversion> getCurrencyExchangeForSecuritiesConversion() {
		return currencyExchangeForSecuritiesConversion == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesConversion);
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion currencyExchangeForSecuritiesConversion) {
		this.currencyExchangeForSecuritiesConversion = currencyExchangeForSecuritiesConversion;
		return this;
	}

	public Optional<CashDistribution> getCurrencyExchangeForCashDistribution() {
		return currencyExchangeForCashDistribution == null ? Optional.empty() : Optional.of(currencyExchangeForCashDistribution);
	}

	public CurrencyExchange setCurrencyExchangeForCashDistribution(com.tools20022.repository.entity.CashDistribution currencyExchangeForCashDistribution) {
		this.currencyExchangeForCashDistribution = currencyExchangeForCashDistribution;
		return this;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public CurrencyExchange setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}
}